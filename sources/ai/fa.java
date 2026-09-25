package ai;

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
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class fa implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fa(ha haVar, long j3, View view, ca caVar, MessagesController messagesController) {
        this.c = haVar;
        this.b = j3;
        this.d = view;
        this.e = caVar;
        this.f = messagesController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ga((ha) this.c, tLObject, this.b, (View) this.d, (ca) this.e, (MessagesController) this.f, 0));
                break;
            case 1:
                ((ConferenceCall) this.c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.b, (AtomicBoolean) this.e, (AtomicInteger) this.f, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (wn) this.c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f, this.b));
                break;
        }
    }

    public /* synthetic */ fa(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j3;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }

    public /* synthetic */ fa(wn wnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.c = wnVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f = fileLocationArr2;
        this.b = j3;
    }
}
