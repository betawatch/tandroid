package ag;

import android.content.Context;
import android.view.KeyEvent;
import bi.sb;
import di.t8;
import di.x7;
import ig.d1;
import ig.e1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h60;
import org.telegram.ui.js;
import org.telegram.ui.nq;
import org.telegram.ui.sz;
import org.telegram.ui.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p0(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0(tLObject, this.b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (ui) obj, (j5) obj3, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new q0((fi.d) obj4, tLObject, (k3[]) obj2, (u6) obj, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new sb((fi.d) obj4, (k3[]) obj2, this.b, (TLObject) obj, (String) obj3, 0));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new q0((t8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.b));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new d1((e1) obj4, this.b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (MessagesController) obj3, 0));
                break;
            case 5:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.b, (ChatObject.Call.OnParticipantsLoad) obj2, (ArrayList) obj, (HashSet) obj3, tLObject, tL_error);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new q0(tLObject, this.b, (e2) obj4, (Context) obj2, (u6) obj, (h60) obj3, 8));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new d1(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj2, (ArrayList) obj, (nq) obj3));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new q0((nh0) obj4, (Integer[]) obj2, this.b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new d1((e2) obj4, tLObject, this.b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new q0((js) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.b));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new d1((e2) obj4, (qf.c) obj2, tLObject, this.b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error));
                break;
            case 12:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new d1((LaunchActivity) obj4, tLObject, (qf.c) obj2, tL_error, (MessagesController) obj, this.b, (String) obj3));
                break;
            case 13:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new d1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (sz) obj, this.b, (String) obj3));
                break;
            case 14:
                Pattern pattern3 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new d1((LaunchActivity) obj4, tL_error, tLObject, this.b, (e2) obj2, (sz) obj, (String) obj3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new d1((org.telegram.ui.web.a1) obj4, (String) obj2, tLObject, tL_error, this.b, (org.telegram.ui.web.x0) obj, (x7) obj3));
                break;
        }
    }

    public /* synthetic */ p0(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ p0(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
    }

    public /* synthetic */ p0(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ p0(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }
}
