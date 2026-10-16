package hg;

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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.xo;
import org.telegram.ui.fo;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                f0 f0Var = (f0) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i10).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i11 = this.c;
                        if (isEncryptedDialog) {
                            if (i11 == 0 || i11 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    g0 g0Var = new g0();
                                    g0Var.c = longValue;
                                    g0Var.b = queryFinalized.intValue(1);
                                    arrayList4.add(g0Var);
                                    hVar.k(g0Var, g0Var.c);
                                }
                            }
                        } else if (!DialogObject.isUserDialog(longValue)) {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                g0 g0Var2 = new g0();
                                g0Var2.c = longValue;
                                g0Var2.b = queryFinalized.intValue(1);
                                arrayList4.add(g0Var2);
                                hVar.k(g0Var2, g0Var2.c);
                            }
                        } else if (i11 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                            g0 g0Var22 = new g0();
                            g0Var22.c = longValue;
                            g0Var22.b = queryFinalized.intValue(1);
                            arrayList4.add(g0Var22);
                            hVar.k(g0Var22, g0Var22.c);
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            g0 g0Var3 = (g0) hVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i12).id));
                            if (g0Var3 != null) {
                                g0Var3.a = arrayList6.get(i12);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            TLRPC.Chat chat = arrayList7.get(i13);
                            long j11 = -chat.id;
                            if (chat.migrated_to != null) {
                                g0 g0Var4 = (g0) hVar.f(j11);
                                hVar.l(j11);
                                if (g0Var4 != null) {
                                    arrayList4.remove(g0Var4);
                                }
                            } else {
                                g0 g0Var5 = (g0) hVar.f(j11);
                                if (g0Var5 != null) {
                                    g0Var5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i10).getUsersInternal(arrayList, arrayList5);
                        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                            TLRPC.User user = arrayList5.get(i14);
                            g0 g0Var6 = (g0) hVar.f(user.id);
                            if (g0Var6 != null) {
                                g0Var6.a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new a4.d(15));
                    AndroidUtilities.runOnUIThread(new a3.l0(f0Var, arrayList4, hVar, 29));
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                i2.h0 h0Var = (i2.h0) this.d;
                e2.r rVar = h0Var.m;
                int i15 = this.b;
                int i16 = this.c;
                rVar.e(24, new eh.c(i15, i16, 2));
                h0Var.t1(2, 14, new e2.y(i15, i16));
                break;
            case 2:
                ((i2.b0) this.d).a.q1(this.b, this.c);
                break;
            case 3:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.b, this.c);
                break;
            case 4:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.b, this.c);
                break;
            case 5:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                for (int i17 = 0; i17 < this.b - this.c; i17++) {
                    z0Var.goBack();
                }
                break;
            case 6:
                m2 m2Var = (m2) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.b).getClientUserId());
                bundle.putInt("message_id", this.c);
                m2Var.presentFragment(new fo(bundle));
                break;
            case 7:
                bp bpVar = (bp) this.d;
                int i18 = this.b;
                if (i18 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                bpVar.y(i18);
                break;
            case 8:
                xo xoVar = (xo) this.d;
                int i19 = this.b;
                if (i19 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                xoVar.run(Integer.valueOf(i19));
                break;
            case 9:
                pc0 pc0Var = ((hc0) this.d).V2;
                View d = pc0Var.d();
                hc0 hc0Var = pc0Var.f;
                if (d != null) {
                    int top = d.getTop() + this.b;
                    int top2 = d.getTop() + this.c;
                    int i20 = top2 - top;
                    int paddingTop = hc0Var.getPaddingTop();
                    int height = hc0Var.getHeight() - hc0Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        hc0Var.scrollBy(0, i21);
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.Components.voip.h1 h1Var = ((org.telegram.ui.Components.voip.g1) this.d).a;
                rf.d dVar = h1Var.O;
                if (dVar != null) {
                    dVar.d(this.b, this.c);
                }
                h1Var.i(false);
                break;
            case 11:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.b, this.c);
                break;
            case 12:
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
