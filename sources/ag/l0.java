package ag;

import android.view.View;
import bi.m3;
import di.w7;
import di.z7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l0(z7 z7Var, long j10, View view, w7 w7Var, MessagesController messagesController) {
        this.c = z7Var;
        this.b = j10;
        this.d = view;
        this.e = w7Var;
        this.f = messagesController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m0(tL_error, (un) this.c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f, (TLRPC.FileLocation[]) this.e, this.b));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new m3((z7) this.c, tLObject, this.b, (View) this.d, (w7) this.e, (MessagesController) this.f, 3));
                break;
            default:
                ((ConferenceCall) this.c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.b, (AtomicBoolean) this.e, (AtomicInteger) this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ l0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j10;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }

    public /* synthetic */ l0(un unVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.c = unVar;
        this.d = fileLocationArr;
        this.f = str;
        this.e = fileLocationArr2;
        this.b = j10;
    }
}
