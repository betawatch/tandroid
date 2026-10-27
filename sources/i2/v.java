package i2;

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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.wn;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v(int i10, int i11, Object obj, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) this.d;
                e2.r rVar = j0Var.m;
                int i10 = this.b;
                int i11 = this.c;
                rVar.e(24, new fh.c(i10, i11, 2));
                j0Var.t1(2, 14, new e2.y(i10, i11));
                break;
            case 1:
                ((d0) this.d).a.q1(this.b, this.c);
                break;
            case 2:
                int i12 = this.b;
                ig.g0 g0Var = (ig.g0) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i12).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i13 = this.c;
                        if (isEncryptedDialog) {
                            if (i13 == 0 || i13 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    ig.h0 h0Var = new ig.h0();
                                    h0Var.c = longValue;
                                    h0Var.b = queryFinalized.intValue(1);
                                    arrayList4.add(h0Var);
                                    hVar.k(h0Var, h0Var.c);
                                }
                            }
                        } else if (!DialogObject.isUserDialog(longValue)) {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                ig.h0 h0Var2 = new ig.h0();
                                h0Var2.c = longValue;
                                h0Var2.b = queryFinalized.intValue(1);
                                arrayList4.add(h0Var2);
                                hVar.k(h0Var2, h0Var2.c);
                            }
                        } else if (i13 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                            ig.h0 h0Var22 = new ig.h0();
                            h0Var22.c = longValue;
                            h0Var22.b = queryFinalized.intValue(1);
                            arrayList4.add(h0Var22);
                            hVar.k(h0Var22, h0Var22.c);
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i12).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                            ig.h0 h0Var3 = (ig.h0) hVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i14).id));
                            if (h0Var3 != null) {
                                h0Var3.a = arrayList6.get(i14);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i12).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                            TLRPC.Chat chat = arrayList7.get(i15);
                            long j11 = -chat.id;
                            if (chat.migrated_to != null) {
                                ig.h0 h0Var4 = (ig.h0) hVar.f(j11);
                                hVar.l(j11);
                                if (h0Var4 != null) {
                                    arrayList4.remove(h0Var4);
                                }
                            } else {
                                ig.h0 h0Var5 = (ig.h0) hVar.f(j11);
                                if (h0Var5 != null) {
                                    h0Var5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i12).getUsersInternal(arrayList, arrayList5);
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            TLRPC.User user = arrayList5.get(i16);
                            ig.h0 h0Var6 = (ig.h0) hVar.f(user.id);
                            if (h0Var6 != null) {
                                h0Var6.a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new a4.d(20));
                    AndroidUtilities.runOnUIThread(new e2.m0(g0Var, arrayList4, hVar, 18));
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
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
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                for (int i17 = 0; i17 < this.b - this.c; i17++) {
                    x0Var.goBack();
                }
                break;
            case 7:
                r2 r2Var = (r2) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.b).getClientUserId());
                bundle.putInt("message_id", this.c);
                r2Var.presentFragment(new wn(bundle));
                break;
            case 8:
                ap apVar = (ap) this.d;
                int i18 = this.b;
                if (i18 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                apVar.w(i18);
                break;
            case 9:
                wo woVar = (wo) this.d;
                int i19 = this.b;
                if (i19 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                woVar.run(Integer.valueOf(i19));
                break;
            case 10:
                ic0 ic0Var = ((bc0) this.d).f3;
                View d = ic0Var.d();
                bc0 bc0Var = ic0Var.f;
                if (d != null) {
                    int top = d.getTop() + this.b;
                    int top2 = d.getTop() + this.c;
                    int i20 = top2 - top;
                    int paddingTop = bc0Var.getPaddingTop();
                    int height = bc0Var.getHeight() - bc0Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        bc0Var.scrollBy(0, i21);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Components.voip.i1 i1Var = ((org.telegram.ui.Components.voip.h1) this.d).a;
                sf.d dVar = i1Var.O;
                if (dVar != null) {
                    dVar.d(this.b, this.c);
                }
                i1Var.i(false);
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

    public /* synthetic */ v(d0 d0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.a = 1;
        this.d = d0Var;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ v(Object obj, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.b = i10;
        this.c = i11;
    }
}
