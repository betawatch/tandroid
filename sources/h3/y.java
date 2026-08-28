package h3;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ih.h3;
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
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.qn;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(int i9, int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i9;
        this.c = i10;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((k0) this.d).l.e(24, new z(this.b, this.c, 1));
                break;
            case 1:
                ((h0) this.d).a.a0(this.b, this.c);
                break;
            case 2:
                int i9 = this.b;
                of.d0 d0Var = (of.d0) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i9).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i10 = this.c;
                        if (isEncryptedDialog) {
                            if (i10 == 0 || i10 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    of.e0 e0Var = new of.e0();
                                    e0Var.c = longValue;
                                    e0Var.b = queryFinalized.intValue(1);
                                    arrayList4.add(e0Var);
                                    hVar.k(e0Var, e0Var.c);
                                }
                            }
                        } else if (!DialogObject.isUserDialog(longValue)) {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                of.e0 e0Var2 = new of.e0();
                                e0Var2.c = longValue;
                                e0Var2.b = queryFinalized.intValue(1);
                                arrayList4.add(e0Var2);
                                hVar.k(e0Var2, e0Var2.c);
                            }
                        } else if (i10 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                            of.e0 e0Var22 = new of.e0();
                            e0Var22.c = longValue;
                            e0Var22.b = queryFinalized.intValue(1);
                            arrayList4.add(e0Var22);
                            hVar.k(e0Var22, e0Var22.c);
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i9).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                            of.e0 e0Var3 = (of.e0) hVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i11).id));
                            if (e0Var3 != null) {
                                e0Var3.a = arrayList6.get(i11);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i9).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i12 = 0; i12 < arrayList7.size(); i12++) {
                            TLRPC.Chat chat = arrayList7.get(i12);
                            long j11 = -chat.id;
                            if (chat.migrated_to != null) {
                                of.e0 e0Var4 = (of.e0) hVar.f(j11);
                                hVar.l(j11);
                                if (e0Var4 != null) {
                                    arrayList4.remove(e0Var4);
                                }
                            } else {
                                of.e0 e0Var5 = (of.e0) hVar.f(j11);
                                if (e0Var5 != null) {
                                    e0Var5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i9).getUsersInternal(arrayList, arrayList5);
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            TLRPC.User user = arrayList5.get(i13);
                            of.e0 e0Var6 = (of.e0) hVar.f(user.id);
                            if (e0Var6 != null) {
                                e0Var6.a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new j9.a(5));
                    AndroidUtilities.runOnUIThread(new h3(d0Var, arrayList4, hVar, 25));
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
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
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
                for (int i14 = 0; i14 < this.b - this.c; i14++) {
                    v0Var.goBack();
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.b).getClientUserId());
                bundle.putInt("message_id", this.c);
                o2Var.presentFragment(new qn(bundle));
                break;
            case 8:
                eo eoVar = (eo) this.d;
                int i15 = this.b;
                if (i15 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i15).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                eoVar.A(i15);
                break;
            case 9:
                zn znVar = (zn) this.d;
                int i16 = this.b;
                if (i16 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i16).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                znVar.run(Integer.valueOf(i16));
                break;
            case 10:
                wa0 wa0Var = ((pa0) this.d).T2;
                View d = wa0Var.d();
                pa0 pa0Var = wa0Var.f;
                if (d != null) {
                    int top = d.getTop() + this.b;
                    int top2 = d.getTop() + this.c;
                    int i17 = top2 - top;
                    int paddingTop = pa0Var.getPaddingTop();
                    int height = pa0Var.getHeight() - pa0Var.getPaddingBottom();
                    if (i17 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i18 = top - paddingTop;
                    if (i18 < 0) {
                        pa0Var.scrollBy(0, i18);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Components.voip.g1 g1Var = ((org.telegram.ui.Components.voip.f1) this.d).a;
                xe.d dVar = g1Var.K;
                if (dVar != null) {
                    dVar.d(this.b, this.c);
                }
                g1Var.i(false);
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

    public /* synthetic */ y(h0 h0Var, SurfaceTexture surfaceTexture, int i9, int i10) {
        this.a = 1;
        this.d = h0Var;
        this.b = i9;
        this.c = i10;
    }

    public /* synthetic */ y(Object obj, int i9, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i9;
        this.c = i10;
    }
}
