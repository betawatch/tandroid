package fg;

import android.content.Context;
import android.view.KeyEvent;
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
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fj;
import org.telegram.ui.h90;
import org.telegram.ui.ts;
import org.telegram.ui.u60;
import org.telegram.ui.zq;
import xh.r6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e1(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.b = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
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
                AndroidUtilities.runOnUIThread(new f1((g1) obj4, this.b, (ArrayList) obj3, (a0.i) obj, tL_error, tLObject, (MessagesController) obj2, 0));
                break;
            case 1:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.b, (ChatObject.Call.OnParticipantsLoad) obj, (ArrayList) obj3, (HashSet) obj2, tLObject, tL_error);
                break;
            case 2:
                int i11 = this.b;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0(i11, 4, (org.telegram.ui.ActionBar.d2) obj4, (Context) obj3, (f6) obj, (u60) obj2, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new f1(tL_error, tLObject, (ArrayList) obj3, this.b, (AtomicInteger) obj4, (ArrayList) obj, (zq) obj2));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0((zg0) obj4, (Integer[]) obj, this.b, tLObject, (ArrayList) obj3, (TLRPC.PollAnswerVoters) obj2));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new f1((org.telegram.ui.ActionBar.d2) obj4, tLObject, this.b, (TLRPC.Document) obj3, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj2));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0((ts) obj4, (TLRPC.FileLocation) obj3, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj2, this.b));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new f1((org.telegram.ui.ActionBar.d2) obj4, (nf.e) obj3, tLObject, this.b, (Context) obj, (TLRPC.TL_inputGroupCallSlug) obj2, tL_error));
                break;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj3, (h90) obj, this.b, (String) obj2));
                break;
            case 9:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f1((LaunchActivity) obj4, tL_error, tLObject, this.b, (org.telegram.ui.ActionBar.d2) obj3, (h90) obj, (String) obj2));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new f1((org.telegram.ui.web.c1) obj4, (String) obj3, tLObject, tL_error, this.b, (org.telegram.ui.web.y0) obj, (org.telegram.ui.web.a1) obj2));
                break;
            case 11:
                int i12 = this.b;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0(i12, 12, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj3, (fj) obj, (f5) obj2, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new r6((bi.d) obj4, (h3[]) obj3, this.b, (TLObject) obj, (String) obj2, 0));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0((bi.d) obj4, tLObject, (h3[]) obj3, (f6) obj, this.b, (TLRPC.TL_messages_checkChatInvite) obj2, 13));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0((zh.r6) obj4, tLObject, this.e, (ArrayList) obj3, (boolean[]) obj2, this.b));
                break;
        }
    }

    public /* synthetic */ e1(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = callback;
        this.c = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
    }

    public /* synthetic */ e1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ e1(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ e1(ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, zq zqVar) {
        this.a = 3;
        this.c = arrayList;
        this.b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f = zqVar;
    }

    public /* synthetic */ e1(ChatObject.Call call, int i10, ChatObject.Call.OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
        this.a = 1;
        this.d = call;
        this.b = i10;
        this.e = onParticipantsLoad;
        this.c = arrayList;
        this.f = hashSet;
    }

    public /* synthetic */ e1(zg0 zg0Var, Integer[] numArr, int i10, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.a = 4;
        this.d = zg0Var;
        this.e = numArr;
        this.b = i10;
        this.c = arrayList;
        this.f = pollAnswerVoters;
    }

    public /* synthetic */ e1(ts tsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLRPC.FileLocation fileLocation2, int i10) {
        this.a = 6;
        this.d = tsVar;
        this.c = fileLocation;
        this.e = inputFile;
        this.f = fileLocation2;
        this.b = i10;
    }

    public /* synthetic */ e1(zh.r6 r6Var, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.a = 14;
        this.d = r6Var;
        this.e = obj;
        this.c = arrayList;
        this.f = zArr;
        this.b = i10;
    }
}
