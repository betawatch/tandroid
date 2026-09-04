package hg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.co;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n(int i10, int i11, Object obj, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                g0 g0Var = (g0) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i10).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.i iVar = new a0.i();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i11 = this.c;
                        if (isEncryptedDialog) {
                            if (i11 == 0 || i11 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    h0 h0Var = new h0();
                                    h0Var.c = longValue;
                                    h0Var.b = queryFinalized.intValue(1);
                                    arrayList4.add(h0Var);
                                    iVar.k(h0Var, h0Var.c);
                                }
                            }
                        } else if (!DialogObject.isUserDialog(longValue)) {
                            long j3 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j3))) {
                                arrayList2.add(Long.valueOf(j3));
                                h0 h0Var2 = new h0();
                                h0Var2.c = longValue;
                                h0Var2.b = queryFinalized.intValue(1);
                                arrayList4.add(h0Var2);
                                iVar.k(h0Var2, h0Var2.c);
                            }
                        } else if (i11 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                            h0 h0Var22 = new h0();
                            h0Var22.c = longValue;
                            h0Var22.b = queryFinalized.intValue(1);
                            arrayList4.add(h0Var22);
                            iVar.k(h0Var22, h0Var22.c);
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            h0 h0Var3 = (h0) iVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i12).id));
                            if (h0Var3 != null) {
                                h0Var3.a = arrayList6.get(i12);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            TLRPC.Chat chat = arrayList7.get(i13);
                            long j10 = -chat.id;
                            if (chat.migrated_to != null) {
                                h0 h0Var4 = (h0) iVar.f(j10);
                                iVar.l(j10);
                                if (h0Var4 != null) {
                                    arrayList4.remove(h0Var4);
                                }
                            } else {
                                h0 h0Var5 = (h0) iVar.f(j10);
                                if (h0Var5 != null) {
                                    h0Var5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i10).getUsersInternal(arrayList, arrayList5);
                        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                            TLRPC.User user = arrayList5.get(i14);
                            h0 h0Var6 = (h0) iVar.f(user.id);
                            if (h0Var6 != null) {
                                h0Var6.a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new a4.e(14));
                    AndroidUtilities.runOnUIThread(new t(g0Var, arrayList4, iVar, 0));
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 1:
                i2.f0 f0Var = (i2.f0) this.d;
                e2.p pVar = f0Var.m;
                int i15 = this.b;
                int i16 = this.c;
                pVar.e(24, new eh.c(i15, i16, 2));
                f0Var.p1(2, 14, new e2.w(i15, i16));
                break;
            case 2:
                ((i2.c0) this.d).a.m1(this.b, this.c);
                break;
            case 3:
                VoIPGroupNotification.decline((Context) this.d, this.b, this.c);
                break;
            case 4:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.b, this.c);
                break;
            case 5:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.b, this.c);
                break;
            case 6:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                for (int i17 = 0; i17 < this.b - this.c; i17++) {
                    z0Var.goBack();
                }
                break;
            case 7:
                n2 n2Var = (n2) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.b).getClientUserId());
                bundle.putInt("message_id", this.c);
                n2Var.presentFragment(new co(bundle));
                break;
            case 8:
                no noVar = (no) this.d;
                int i18 = this.b;
                if (i18 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                noVar.x(i18);
                break;
            case 9:
                jo joVar = (jo) this.d;
                int i19 = this.b;
                if (i19 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                joVar.run(Integer.valueOf(i19));
                break;
            case 10:
                qb0 qb0Var = ((ib0) this.d).X2;
                View d = qb0Var.d();
                ib0 ib0Var = qb0Var.f;
                if (d != null) {
                    int top = d.getTop() + this.b;
                    int top2 = d.getTop() + this.c;
                    int i20 = top2 - top;
                    int paddingTop = ib0Var.getPaddingTop();
                    int height = ib0Var.getHeight() - ib0Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        ib0Var.scrollBy(0, i21);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Components.voip.h1 h1Var = ((org.telegram.ui.Components.voip.g1) this.d).a;
                qf.e eVar = h1Var.O;
                if (eVar != null) {
                    eVar.d(this.b, this.c);
                }
                h1Var.i(false);
                break;
            case 12:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.b, this.c);
                break;
            case 13:
                ((SurfaceViewRenderer) this.d).lambda$onFrameResolutionChanged$0(this.b, this.c);
                break;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ n(i2.c0 c0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.a = 2;
        this.d = c0Var;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ n(Object obj, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.b = i10;
        this.c = i11;
    }
}
