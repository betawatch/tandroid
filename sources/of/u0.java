package of;

import android.hardware.Camera;
import ih.h3;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.r90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, boolean z10, Serializable serializable, Object obj4, Object obj5, Object obj6, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = serializable;
        this.h = obj4;
        this.n = obj5;
        this.r = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                f1 f1Var = (f1) this.c;
                String str = (String) this.d;
                TLObject tLObject = (TLObject) this.h;
                TLRPC.User user = (TLRPC.User) this.n;
                String str2 = (String) this.e;
                MessagesStorage messagesStorage = (MessagesStorage) this.r;
                String str3 = (String) this.f;
                r90 r90Var = f1Var.R;
                if (str.equals(f1Var.n0)) {
                    f1Var.q0 = 0;
                    boolean z11 = this.b;
                    if (z11 && tLObject == null) {
                        f1Var.T(false, user, str, str2);
                    } else if (r90Var != null) {
                        r90Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        f1Var.o0 = tL_messages_botResults.next_offset;
                        if (f1Var.P == null) {
                            f1Var.P = tL_messages_botResults.switch_pm;
                        }
                        f1Var.Q = tL_messages_botResults.switch_webview;
                        int i9 = 0;
                        while (i9 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i9);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i9);
                                i9--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i9++;
                        }
                        if (f1Var.N == null || str2.length() == 0) {
                            f1Var.N = tL_messages_botResults.results;
                            f1Var.t0 = tL_messages_botResults.gallery;
                            z10 = false;
                        } else {
                            f1Var.N.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                f1Var.o0 = "";
                            }
                            z10 = true;
                        }
                        h3 h3Var = f1Var.l0;
                        if (h3Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(h3Var);
                            f1Var.l0 = null;
                        }
                        f1Var.E = null;
                        f1Var.w0 = null;
                        f1Var.x = null;
                        f1Var.y = null;
                        f1Var.F = null;
                        f1Var.M = null;
                        f1Var.I = null;
                        f1Var.J = null;
                        f1Var.G = null;
                        f1Var.L = null;
                        f1Var.k0 = false;
                        r90Var.a((f1Var.N.isEmpty() && f1Var.P == null && f1Var.Q == null) ? false : true);
                        if (!z10) {
                            f1Var.l();
                            break;
                        } else {
                            int i10 = (f1Var.P == null && f1Var.Q == null) ? 0 : 1;
                            f1Var.m(((f1Var.N.size() - tL_messages_botResults.results.size()) + i10) - 1);
                            f1Var.s((f1Var.N.size() - tL_messages_botResults.results.size()) + i10, tL_messages_botResults.results.size());
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((ContactsController) this.c).lambda$performSyncPhoneBook$19((HashMap) this.d, (HashMap) this.e, this.b, (HashMap) this.f, (ArrayList) this.h, (HashMap) this.n, (boolean[]) this.r);
                break;
            case 2:
                ((MediaDataController) this.c).lambda$broadcastPinnedMessage$169((ArrayList) this.d, this.b, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h, (a0.h) this.n, (a0.h) this.r);
                break;
            case 3:
                ((SendMessagesHelper) this.c).lambda$sendCallback$43((TLRPC.TL_error) this.d, (TLObject) this.h, (TwoStepVerificationActivity) this.e, this.b, (MessageObject) this.f, (TL_keyboard.KeyboardButtonProto) this.n, (qn) this.r);
                break;
            default:
                ((CameraController) this.c).lambda$recordVideo$14((Camera) this.d, (CameraSession) this.e, this.b, (File) this.f, (CameraInfo) this.h, (CameraController.VideoTakeCallback) this.n, (Runnable) this.r);
                break;
        }
    }

    public /* synthetic */ u0(f1 f1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.a = 0;
        this.c = f1Var;
        this.d = str;
        this.b = z10;
        this.h = tLObject;
        this.n = user;
        this.e = str2;
        this.r = messagesStorage;
        this.f = str3;
    }

    public /* synthetic */ u0(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.a = 2;
        this.c = mediaDataController;
        this.d = arrayList;
        this.b = z10;
        this.e = arrayList2;
        this.f = arrayList3;
        this.h = arrayList4;
        this.n = hVar;
        this.r = hVar2;
    }

    public /* synthetic */ u0(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.a = 3;
        this.c = sendMessagesHelper;
        this.d = tL_error;
        this.h = tLObject;
        this.e = twoStepVerificationActivity;
        this.b = z10;
        this.f = messageObject;
        this.n = keyboardButtonProto;
        this.r = qnVar;
    }
}
