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
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.v90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ((SendMessagesHelper) this.d).lambda$sendCallback$43((TLRPC.TL_error) this.e, (TLObject) this.f, (TwoStepVerificationActivity) this.h, this.c, (MessageObject) this.n, (TL_keyboard.KeyboardButtonProto) this.b, (rn) this.r);
                break;
            case 3:
                ((CameraController) this.d).lambda$recordVideo$14((Camera) this.e, (CameraSession) this.f, this.c, (File) this.h, (CameraInfo) this.n, (CameraController.VideoTakeCallback) this.b, (Runnable) this.r);
                break;
            default:
                pf.u0 u0Var = (pf.u0) this.d;
                String str = (String) this.e;
                TLObject tLObject = (TLObject) this.f;
                TLRPC.User user = (TLRPC.User) this.h;
                String str2 = (String) this.n;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                String str3 = (String) this.r;
                v90 v90Var = u0Var.R;
                if (str.equals(u0Var.n0)) {
                    u0Var.q0 = 0;
                    boolean z11 = this.c;
                    if (z11 && tLObject == null) {
                        u0Var.T(false, user, str, str2);
                    } else if (v90Var != null) {
                        v90Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        u0Var.o0 = tL_messages_botResults.next_offset;
                        if (u0Var.P == null) {
                            u0Var.P = tL_messages_botResults.switch_pm;
                        }
                        u0Var.Q = tL_messages_botResults.switch_webview;
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
                        if (u0Var.N == null || str2.length() == 0) {
                            u0Var.N = tL_messages_botResults.results;
                            u0Var.t0 = tL_messages_botResults.gallery;
                            z10 = false;
                        } else {
                            u0Var.N.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                u0Var.o0 = "";
                            }
                            z10 = true;
                        }
                        gs0 gs0Var = u0Var.l0;
                        if (gs0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(gs0Var);
                            u0Var.l0 = null;
                        }
                        u0Var.E = null;
                        u0Var.w0 = null;
                        u0Var.x = null;
                        u0Var.y = null;
                        u0Var.F = null;
                        u0Var.M = null;
                        u0Var.I = null;
                        u0Var.J = null;
                        u0Var.G = null;
                        u0Var.L = null;
                        u0Var.k0 = false;
                        v90Var.a((u0Var.N.isEmpty() && u0Var.P == null && u0Var.Q == null) ? false : true);
                        if (!z10) {
                            u0Var.l();
                            break;
                        } else {
                            int i11 = (u0Var.P == null && u0Var.Q == null) ? 0 : 1;
                            u0Var.m(((u0Var.N.size() - tL_messages_botResults.results.size()) + i11) - 1);
                            u0Var.s((u0Var.N.size() - tL_messages_botResults.results.size()) + i11, tL_messages_botResults.results.size());
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

    public /* synthetic */ s1(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, rn rnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.d = sendMessagesHelper;
        this.e = tL_error;
        this.f = tLObject;
        this.h = twoStepVerificationActivity;
        this.c = z10;
        this.n = messageObject;
        this.b = keyboardButtonProto;
        this.r = rnVar;
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

    public /* synthetic */ s1(pf.u0 u0Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.d = u0Var;
        this.e = str;
        this.c = z10;
        this.f = tLObject;
        this.h = user;
        this.n = str2;
        this.b = messagesStorage;
        this.r = str3;
    }
}
