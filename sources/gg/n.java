package gg;

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
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.bo;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                    Collections.sort(arrayList4, new a4.e(12));
                    AndroidUtilities.runOnUIThread(new t(g0Var, arrayList4, iVar, 0));
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                i2.e0 e0Var = (i2.e0) this.d;
                e2.p pVar = e0Var.m;
                int i15 = this.b;
                int i16 = this.c;
                pVar.e(24, new dh.c(i15, i16, 2));
                e0Var.p1(2, 14, new e2.w(i15, i16));
                break;
            case 2:
                ((i2.b0) this.d).a.m1(this.b, this.c);
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
                n2Var.presentFragment(new bo(bundle));
                break;
            case 8:
                oo ooVar = (oo) this.d;
                int i18 = this.b;
                if (i18 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                ooVar.t(i18);
                break;
            case 9:
                ko koVar = (ko) this.d;
                int i19 = this.b;
                if (i19 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                koVar.run(Integer.valueOf(i19));
                break;
            case 10:
                pb0 pb0Var = ((hb0) this.d).X2;
                View d = pb0Var.d();
                hb0 hb0Var = pb0Var.f;
                if (d != null) {
                    int top = d.getTop() + this.b;
                    int top2 = d.getTop() + this.c;
                    int i20 = top2 - top;
                    int paddingTop = hb0Var.getPaddingTop();
                    int height = hb0Var.getHeight() - hb0Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        hb0Var.scrollBy(0, i21);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Components.voip.j1 j1Var = ((org.telegram.ui.Components.voip.i1) this.d).a;
                pf.e eVar = j1Var.O;
                if (eVar != null) {
                    eVar.d(this.b, this.c);
                }
                j1Var.i(false);
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

    public /* synthetic */ n(i2.b0 b0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.a = 2;
        this.d = b0Var;
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
