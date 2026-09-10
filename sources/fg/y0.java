package fg;

import android.hardware.Camera;
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
import org.telegram.ui.Components.sa0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ y0(l1 l1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.a = 0;
        this.c = l1Var;
        this.d = str;
        this.b = z10;
        this.h = tLObject;
        this.n = user;
        this.e = str2;
        this.r = messagesStorage;
        this.f = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                l1 l1Var = (l1) this.c;
                String str = (String) this.d;
                TLObject tLObject = (TLObject) this.h;
                TLRPC.User user = (TLRPC.User) this.n;
                String str2 = (String) this.e;
                MessagesStorage messagesStorage = (MessagesStorage) this.r;
                String str3 = (String) this.f;
                sa0 sa0Var = l1Var.V;
                if (str.equals(l1Var.r0)) {
                    l1Var.u0 = 0;
                    boolean z11 = this.b;
                    if (z11 && tLObject == null) {
                        l1Var.T(false, user, str, str2);
                    } else if (sa0Var != null) {
                        sa0Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        l1Var.s0 = tL_messages_botResults.next_offset;
                        if (l1Var.T == null) {
                            l1Var.T = tL_messages_botResults.switch_pm;
                        }
                        l1Var.U = tL_messages_botResults.switch_webview;
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
                        if (l1Var.R == null || str2.length() == 0) {
                            l1Var.R = tL_messages_botResults.results;
                            l1Var.x0 = tL_messages_botResults.gallery;
                            z10 = false;
                        } else {
                            l1Var.R.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                l1Var.s0 = "";
                            }
                            z10 = true;
                        }
                        a3.k0 k0Var = l1Var.p0;
                        if (k0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(k0Var);
                            l1Var.p0 = null;
                        }
                        l1Var.I = null;
                        l1Var.A0 = null;
                        l1Var.x = null;
                        l1Var.y = null;
                        l1Var.J = null;
                        l1Var.Q = null;
                        l1Var.M = null;
                        l1Var.N = null;
                        l1Var.K = null;
                        l1Var.P = null;
                        l1Var.o0 = false;
                        sa0Var.a((l1Var.R.isEmpty() && l1Var.T == null && l1Var.U == null) ? false : true);
                        if (!z10) {
                            l1Var.l();
                            break;
                        } else {
                            int i11 = (l1Var.T == null && l1Var.U == null) ? 0 : 1;
                            l1Var.m(((l1Var.R.size() - tL_messages_botResults.results.size()) + i11) - 1);
                            l1Var.s((l1Var.R.size() - tL_messages_botResults.results.size()) + i11, tL_messages_botResults.results.size());
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((ContactsController) this.c).lambda$performSyncPhoneBook$19((HashMap) this.d, (HashMap) this.e, this.b, (HashMap) this.f, (ArrayList) this.h, (HashMap) this.n, (boolean[]) this.r);
                break;
            case 2:
                ((MediaDataController) this.c).lambda$broadcastPinnedMessage$169((ArrayList) this.d, this.b, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h, (a0.i) this.n, (a0.i) this.r);
                break;
            case 3:
                ((SendMessagesHelper) this.c).lambda$sendCallback$43((TLRPC.TL_error) this.d, (TLObject) this.h, (TwoStepVerificationActivity) this.e, this.b, (MessageObject) this.f, (TL_keyboard.KeyboardButtonProto) this.n, (eo) this.r);
                break;
            default:
                ((CameraController) this.c).lambda$recordVideo$14((Camera) this.d, (CameraSession) this.e, this.b, (File) this.f, (CameraInfo) this.h, (CameraController.VideoTakeCallback) this.n, (Runnable) this.r);
                break;
        }
    }

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, boolean z10, Serializable serializable, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = serializable;
        this.h = obj4;
        this.n = obj5;
        this.r = obj6;
    }

    public /* synthetic */ y0(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.i iVar, a0.i iVar2) {
        this.a = 2;
        this.c = mediaDataController;
        this.d = arrayList;
        this.b = z10;
        this.e = arrayList2;
        this.f = arrayList3;
        this.h = arrayList4;
        this.n = iVar;
        this.r = iVar2;
    }

    public /* synthetic */ y0(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.a = 3;
        this.c = sendMessagesHelper;
        this.d = tL_error;
        this.h = tLObject;
        this.e = twoStepVerificationActivity;
        this.b = z10;
        this.f = messageObject;
        this.n = keyboardButtonProto;
        this.r = eoVar;
    }
}
