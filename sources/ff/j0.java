package ff;

import android.content.Context;
import android.view.KeyEvent;
import fh.g1;
import fh.u2;
import ih.h8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import of.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a60;
import org.telegram.ui.is;
import org.telegram.ui.jq;
import org.telegram.ui.ri;
import org.telegram.ui.x20;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j0(int i9, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = i9;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(tLObject, this.b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (ri) obj, (b5) obj3, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new g1((kh.d) obj4, (f3[]) obj2, this.b, (TLObject) obj, (String) obj3, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new k0((kh.d) obj4, tLObject, (f3[]) obj2, (b6) obj, this.b, (TLRPC.TL_messages_checkChatInvite) obj3));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new k0((h8) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.b));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new u2((a1) obj4, this.b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (MessagesController) obj3, 1));
                break;
            case 5:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.b, (ChatObject.Call.OnParticipantsLoad) obj2, (ArrayList) obj, (HashSet) obj3, tLObject, tL_error);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new k0(tLObject, this.b, (c2) obj4, (Context) obj2, (b6) obj, (a60) obj3, 7));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new u2(tL_error, tLObject, (ArrayList) obj4, this.b, (AtomicInteger) obj2, (ArrayList) obj, (jq) obj3, 7));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new k0((ag0) obj4, (Integer[]) obj2, this.b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new u2((c2) obj4, tLObject, this.b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new k0((is) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.b));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new u2((c2) obj4, (ve.d) obj2, tLObject, this.b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 9));
                break;
            case 12:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new u2((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (x20) obj, this.b, (String) obj3, 11));
                break;
            default:
                Pattern pattern2 = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new u2((LaunchActivity) obj4, tL_error, tLObject, this.b, (c2) obj2, (x20) obj, (String) obj3));
                break;
        }
    }

    public /* synthetic */ j0(KeyEvent.Callback callback, Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.b = i9;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ j0(KeyEvent.Callback callback, Object obj, Object obj2, int i9, Object obj3, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.e = obj2;
        this.b = i9;
        this.f = obj3;
    }

    public /* synthetic */ j0(Object obj, int i9, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, Object obj4, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i9;
    }
}
