package bi;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class m9 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m9(o9 o9Var, long j3, View view, j9 j9Var, MessagesController messagesController) {
        this.c = o9Var;
        this.b = j3;
        this.d = view;
        this.e = j9Var;
        this.f = messagesController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n9((o9) this.c, tLObject, this.b, (View) this.d, (j9) this.e, (MessagesController) this.f, 0));
                break;
            case 1:
                ((ConferenceCall) this.c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.b, (AtomicBoolean) this.e, (AtomicInteger) this.f, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (co) this.c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f, this.b));
                break;
        }
    }

    public /* synthetic */ m9(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j3;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }

    public /* synthetic */ m9(co coVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.c = coVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f = fileLocationArr2;
        this.b = j3;
    }
}
