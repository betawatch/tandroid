package org.telegram.messenger;

import android.hardware.Camera;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = contactsController;
        this.e = hashMap;
        this.f = hashMap2;
        this.c = z10;
        this.h = hashMap3;
        this.b = arrayList;
        this.n = hashMap4;
        this.r = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                ((ContactsController) this.d).lambda$performSyncPhoneBook$19((HashMap) this.e, (HashMap) this.f, this.c, (HashMap) this.h, (ArrayList) this.b, (HashMap) this.n, (boolean[]) this.r);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$broadcastPinnedMessage$169((ArrayList) this.b, this.c, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h, (a0.h) this.n, (a0.h) this.r);
                break;
            case 2:
                ((SendMessagesHelper) this.d).lambda$sendCallback$43((TLRPC.TL_error) this.e, (TLObject) this.f, (TwoStepVerificationActivity) this.h, this.c, (MessageObject) this.n, (TL_keyboard.KeyboardButtonProto) this.b, (tn) this.r);
                break;
            case 3:
                ((CameraController) this.d).lambda$recordVideo$14((Camera) this.e, (CameraSession) this.f, this.c, (File) this.h, (CameraInfo) this.n, (CameraController.VideoTakeCallback) this.b, (Runnable) this.r);
                break;
            default:
                rf.v0 v0Var = (rf.v0) this.d;
                String str = (String) this.e;
                TLObject tLObject = (TLObject) this.f;
                TLRPC.User user = (TLRPC.User) this.h;
                String str2 = (String) this.n;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                String str3 = (String) this.r;
                fa0 fa0Var = v0Var.R;
                if (str.equals(v0Var.n0)) {
                    v0Var.q0 = 0;
                    boolean z11 = this.c;
                    if (z11 && tLObject == null) {
                        v0Var.T(false, user, str, str2);
                    } else if (fa0Var != null) {
                        fa0Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        v0Var.o0 = tL_messages_botResults.next_offset;
                        if (v0Var.P == null) {
                            v0Var.P = tL_messages_botResults.switch_pm;
                        }
                        v0Var.Q = tL_messages_botResults.switch_webview;
                        int i10 = 0;
                        while (i10 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i10);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i10);
                                i10--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i10++;
                        }
                        if (v0Var.N == null || str2.length() == 0) {
                            v0Var.N = tL_messages_botResults.results;
                            v0Var.t0 = tL_messages_botResults.gallery;
                            z10 = false;
                        } else {
                            v0Var.N.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                v0Var.o0 = "";
                            }
                            z10 = true;
                        }
                        yw0 yw0Var = v0Var.l0;
                        if (yw0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(yw0Var);
                            v0Var.l0 = null;
                        }
                        v0Var.E = null;
                        v0Var.w0 = null;
                        v0Var.x = null;
                        v0Var.y = null;
                        v0Var.F = null;
                        v0Var.M = null;
                        v0Var.I = null;
                        v0Var.J = null;
                        v0Var.G = null;
                        v0Var.L = null;
                        v0Var.k0 = false;
                        fa0Var.a((v0Var.N.isEmpty() && v0Var.P == null && v0Var.Q == null) ? false : true);
                        if (!z10) {
                            v0Var.l();
                            break;
                        } else {
                            int i11 = (v0Var.P == null && v0Var.Q == null) ? 0 : 1;
                            v0Var.m(((v0Var.N.size() - tL_messages_botResults.results.size()) + i11) - 1);
                            v0Var.s((v0Var.N.size() - tL_messages_botResults.results.size()) + i11, tL_messages_botResults.results.size());
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ s1(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = mediaDataController;
        this.b = arrayList;
        this.c = z10;
        this.e = arrayList2;
        this.f = arrayList3;
        this.h = arrayList4;
        this.n = hVar;
        this.r = hVar2;
    }

    public /* synthetic */ s1(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, tn tnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.d = sendMessagesHelper;
        this.e = tL_error;
        this.f = tLObject;
        this.h = twoStepVerificationActivity;
        this.c = z10;
        this.n = messageObject;
        this.b = keyboardButtonProto;
        this.r = tnVar;
    }

    public /* synthetic */ s1(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.d = cameraController;
        this.e = camera;
        this.f = cameraSession;
        this.c = z10;
        this.h = file;
        this.n = cameraInfo;
        this.b = videoTakeCallback;
        this.r = runnable;
    }

    public /* synthetic */ s1(rf.v0 v0Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.d = v0Var;
        this.e = str;
        this.c = z10;
        this.f = tLObject;
        this.h = user;
        this.n = str2;
        this.b = messagesStorage;
        this.r = str3;
    }
}
