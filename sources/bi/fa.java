package bi;

import android.content.Context;
import android.view.KeyEvent;
import java.io.Serializable;
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
import org.telegram.ui.Components.pg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dj;
import org.telegram.ui.r80;
import org.telegram.ui.ss;
import org.telegram.ui.v60;
import org.telegram.ui.yq;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class fa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fa(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.b = i10;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        Object obj = this.e;
        Object obj2 = this.f;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ia((ja) obj4, tLObject, this.e, (ArrayList) obj3, (boolean[]) obj2, this.b));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.e1((hg.f1) obj4, this.b, (ArrayList) obj3, (a0.i) obj, tL_error, tLObject, (MessagesController) obj2, 0));
                break;
            case 2:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.b, (ChatObject.Call.OnParticipantsLoad) obj, (ArrayList) obj3, (HashSet) obj2, tLObject, tL_error);
                break;
            case 3:
                int i11 = this.b;
                AndroidUtilities.runOnUIThread(new ia(i11, 5, (org.telegram.ui.ActionBar.b2) obj4, (Context) obj, (org.telegram.ui.ActionBar.f6) obj3, (v60) obj2, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new hg.e1(tL_error, tLObject, (ArrayList) obj3, this.b, (AtomicInteger) obj4, (ArrayList) obj, (yq) obj2));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ia((pg0) obj4, (Integer[]) obj, this.b, tLObject, (ArrayList) obj3, (TLRPC.PollAnswerVoters) obj2));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new hg.e1((org.telegram.ui.ActionBar.b2) obj4, tLObject, this.b, (TLRPC.Document) obj3, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj2));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ia((ss) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, tLObject, (TLRPC.FileLocation) obj2, this.b));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new hg.e1((org.telegram.ui.ActionBar.b2) obj4, (of.e) obj, tLObject, this.b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, tL_error));
                break;
            case 9:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new hg.e1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (r80) obj3, this.b, (String) obj2));
                break;
            case 10:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new hg.e1((LaunchActivity) obj4, tL_error, tLObject, this.b, (org.telegram.ui.ActionBar.b2) obj, (r80) obj3, (String) obj2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new hg.e1((org.telegram.ui.web.d1) obj4, (String) obj, tLObject, tL_error, this.b, (org.telegram.ui.web.z0) obj3, (k9) obj2));
                break;
            case 12:
                int i12 = this.b;
                AndroidUtilities.runOnUIThread(new ia(i12, 13, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj, (dj) obj3, (org.telegram.ui.ActionBar.d5) obj2, tLObject));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new zh.o6((di.d) obj4, (org.telegram.ui.ActionBar.f3[]) obj, this.b, (TLObject) obj3, (String) obj2, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ia((di.d) obj4, tLObject, (org.telegram.ui.ActionBar.f3[]) obj, (org.telegram.ui.ActionBar.f6) obj3, this.b, (TLRPC.TL_messages_checkChatInvite) obj2, 14));
                break;
        }
    }

    public /* synthetic */ fa(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = callback;
        this.e = obj;
        this.b = i10;
        this.c = obj2;
        this.f = obj3;
    }

    public /* synthetic */ fa(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = callback;
        this.e = obj;
        this.c = obj2;
        this.b = i10;
        this.f = obj3;
    }

    public /* synthetic */ fa(Object obj, int i10, Object obj2, Object obj3, Serializable serializable, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = obj3;
        this.f = serializable;
    }

    public /* synthetic */ fa(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ fa(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = i10;
    }

    public /* synthetic */ fa(ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, yq yqVar) {
        this.a = 4;
        this.c = arrayList;
        this.b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f = yqVar;
    }
}
