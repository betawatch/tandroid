package bg;

import android.view.View;
import bi.m3;
import di.o7;
import di.r7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g0(r7 r7Var, long j3, View view, o7 o7Var, qp qpVar) {
        this.c = r7Var;
        this.b = j3;
        this.d = view;
        this.e = o7Var;
        this.f = qpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new h0(tL_error, (cn) this.c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f, (TLRPC.FileLocation[]) this.e, this.b));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new m3((r7) this.c, tLObject, this.b, (View) this.d, (o7) this.e, (qp) this.f, 3));
                break;
            default:
                ((ConferenceCall) this.c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.b, (AtomicBoolean) this.e, (AtomicInteger) this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ g0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j3;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }

    public /* synthetic */ g0(cn cnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.c = cnVar;
        this.d = fileLocationArr;
        this.f = str;
        this.e = fileLocationArr2;
        this.b = j3;
    }
}
