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
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.eu;
import org.telegram.ui.zn;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                f0 f0Var = (f0) this.d;
                h5.m mVar = f0Var.l;
                int i10 = this.b;
                int i11 = this.c;
                mVar.e(24, new w(i10, i11, 1));
                f0Var.V(2, 14, new h5.x(i10, i11));
                break;
            case 1:
                ((c0) this.d).a.T(this.b, this.c);
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
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
                for (int i12 = 0; i12 < this.b - this.c; i12++) {
                    y0Var.goBack();
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.b).getClientUserId());
                bundle.putInt("message_id", this.c);
                p2Var.presentFragment(new zn(bundle));
                break;
            case 7:
                jo joVar = (jo) this.d;
                int i13 = this.b;
                if (i13 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i13).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                joVar.s(i13);
                break;
            case 8:
                fo foVar = (fo) this.d;
                int i14 = this.b;
                if (i14 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i14).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                foVar.run(Integer.valueOf(i14));
                break;
            case 9:
                rb0 rb0Var = ((jb0) this.d).U2;
                View d = rb0Var.d();
                jb0 jb0Var = rb0Var.f;
                if (d != null) {
                    int top = d.getTop() + this.b;
                    int top2 = d.getTop() + this.c;
                    int i15 = top2 - top;
                    int paddingTop = jb0Var.getPaddingTop();
                    int height = jb0Var.getHeight() - jb0Var.getPaddingBottom();
                    if (i15 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i16 = top - paddingTop;
                    if (i16 < 0) {
                        jb0Var.scrollBy(0, i16);
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.Components.voip.g1 g1Var = ((org.telegram.ui.Components.voip.f1) this.d).a;
                bf.f fVar = g1Var.L;
                if (fVar != null) {
                    fVar.d(this.b, this.c);
                }
                g1Var.i(false);
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
                int i17 = this.b;
                tf.x xVar = (tf.x) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i17).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i18 = this.c;
                        if (isEncryptedDialog) {
                            if (i18 == 0 || i18 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    tf.y yVar = new tf.y();
                                    yVar.c = longValue;
                                    yVar.b = queryFinalized.intValue(1);
                                    arrayList4.add(yVar);
                                    hVar.k(yVar, yVar.c);
                                }
                            }
                        } else if (!DialogObject.isUserDialog(longValue)) {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                tf.y yVar2 = new tf.y();
                                yVar2.c = longValue;
                                yVar2.b = queryFinalized.intValue(1);
                                arrayList4.add(yVar2);
                                hVar.k(yVar2, yVar2.c);
                            }
                        } else if (i18 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                            tf.y yVar22 = new tf.y();
                            yVar22.c = longValue;
                            yVar22.b = queryFinalized.intValue(1);
                            arrayList4.add(yVar22);
                            hVar.k(yVar22, yVar22.c);
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i17).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                            tf.y yVar3 = (tf.y) hVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i19).id));
                            if (yVar3 != null) {
                                yVar3.a = arrayList6.get(i19);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i17).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i20 = 0; i20 < arrayList7.size(); i20++) {
                            TLRPC.Chat chat = arrayList7.get(i20);
                            long j11 = -chat.id;
                            if (chat.migrated_to != null) {
                                tf.y yVar4 = (tf.y) hVar.f(j11);
                                hVar.l(j11);
                                if (yVar4 != null) {
                                    arrayList4.remove(yVar4);
                                }
                            } else {
                                tf.y yVar5 = (tf.y) hVar.f(j11);
                                if (yVar5 != null) {
                                    yVar5.a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i17).getUsersInternal(arrayList, arrayList5);
                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                            TLRPC.User user = arrayList5.get(i21);
                            tf.y yVar6 = (tf.y) hVar.f(user.id);
                            if (yVar6 != null) {
                                yVar6.a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new eu(19));
                    AndroidUtilities.runOnUIThread(new m71(xVar, arrayList4, hVar, 26));
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                break;
        }
    }

    public /* synthetic */ v(c0 c0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.a = 1;
        this.d = c0Var;
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
