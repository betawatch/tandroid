package j3;

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
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.tn;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(int i10, int i11, Object obj, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
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
                VoIPGroupNotification.decline((Context) this.d, this.b, this.c);
                break;
            case 3:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.b, this.c);
                break;
            case 4:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.b, this.c);
                break;
            case 5:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.d;
                for (int i10 = 0; i10 < this.b - this.c; i10++) {
                    w0Var.goBack();
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.b).getClientUserId());
                bundle.putInt("message_id", this.c);
                o2Var.presentFragment(new tn(bundle));
                break;
            case 7:
                io ioVar = (io) this.d;
                int i11 = this.b;
                if (i11 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i11).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                ioVar.w(i11);
                break;
            case 8:
                eo eoVar = (eo) this.d;
                int i12 = this.b;
                if (i12 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i12).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                eoVar.run(Integer.valueOf(i12));
                break;
            case 9:
                lb0 lb0Var = ((eb0) this.d).T2;
                View d = lb0Var.d();
                eb0 eb0Var = lb0Var.f;
                if (d != null) {
                    int top = d.getTop() + this.b;
                    int top2 = d.getTop() + this.c;
                    int i13 = top2 - top;
                    int paddingTop = eb0Var.getPaddingTop();
                    int height = eb0Var.getHeight() - eb0Var.getPaddingBottom();
                    if (i13 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i14 = top - paddingTop;
                    if (i14 < 0) {
                        eb0Var.scrollBy(0, i14);
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.Components.voip.h1 h1Var = ((org.telegram.ui.Components.voip.g1) this.d).a;
                af.g gVar = h1Var.K;
                if (gVar != null) {
                    gVar.d(this.b, this.c);
                }
                h1Var.i(false);
                break;
            case 11:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.b, this.c);
                break;
            case 12:
                ((SurfaceViewRenderer) this.d).lambda$onFrameResolutionChanged$0(this.b, this.c);
                break;
            case 13:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.b, this.c);
                break;
            default:
                int i15 = this.b;
                rf.y yVar = (rf.y) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i15).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i16 = this.c;
                        if (isEncryptedDialog) {
                            if (i16 == 0 || i16 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    rf.z zVar = new rf.z();
                                    zVar.c = longValue;
                                    zVar.b = queryFinalized.intValue(1);
                                    arrayList4.add(zVar);
                                    hVar.k(zVar, zVar.c);
                                }
                            }
                        } else if (!DialogObject.isUserDialog(longValue)) {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                rf.z zVar2 = new rf.z();
                                zVar2.c = longValue;
                                zVar2.b = queryFinalized.intValue(1);
                                arrayList4.add(zVar2);
                                hVar.k(zVar2, zVar2.c);
                            }
                        } else if (i16 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                            rf.z zVar22 = new rf.z();
                            zVar22.c = longValue;
                            zVar22.b = queryFinalized.intValue(1);
                            arrayList4.add(zVar22);
                            hVar.k(zVar22, zVar22.c);
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i15).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                            rf.z zVar3 = (rf.z) hVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i17).id));
                            if (zVar3 != null) {
                                zVar3.a = arrayList6.get(i17);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i15).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                            TLRPC.Chat chat = arrayList7.get(i18);
                            long j11 = -chat.id;
                            if (chat.migrated_to != null) {
                                rf.z zVar4 = (rf.z) hVar.f(j11);
                                hVar.l(j11);
                                if (zVar4 != null) {
                                    arrayList4.remove(zVar4);
                                }
                            } else {
                                rf.z zVar5 = (rf.z) hVar.f(j11);
                                if (zVar5 != null) {
                                    zVar5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i15).getUsersInternal(arrayList, arrayList5);
                        for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                            TLRPC.User user = arrayList5.get(i19);
                            rf.z zVar6 = (rf.z) hVar.f(user.id);
                            if (zVar6 != null) {
                                zVar6.a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new wp0(19));
                    AndroidUtilities.runOnUIThread(new yw0(yVar, arrayList4, hVar, 25));
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                break;
        }
    }

    public /* synthetic */ y(h0 h0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.a = 1;
        this.d = h0Var;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ y(Object obj, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.b = i10;
        this.c = i11;
    }
}
