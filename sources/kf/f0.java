package kf;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lh.o2;
import nh.i7;
import nh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f0(l7 l7Var, long j10, View view, i7 i7Var, MessagesController messagesController) {
        this.c = l7Var;
        this.b = j10;
        this.d = view;
        this.e = i7Var;
        this.f = messagesController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g0(tL_error, (zn) this.c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f, (TLRPC.FileLocation[]) this.e, this.b));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new o2((l7) this.c, tLObject, this.b, (View) this.d, (i7) this.e, (MessagesController) this.f, 3));
                break;
            default:
                ((ConferenceCall) this.c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.b, (AtomicBoolean) this.e, (AtomicInteger) this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ f0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j10;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }

    public /* synthetic */ f0(zn znVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.c = znVar;
        this.d = fileLocationArr;
        this.f = str;
        this.e = fileLocationArr2;
        this.b = j10;
    }
}
