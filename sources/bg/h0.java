package bg;

import android.view.View;
import di.a3;
import fi.e7;
import fi.h7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h0(h7 h7Var, long j3, View view, e7 e7Var, mp mpVar) {
        this.c = h7Var;
        this.b = j3;
        this.d = view;
        this.e = e7Var;
        this.f = mpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new i0(tL_error, (bn) this.c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f, (TLRPC.FileLocation[]) this.e, this.b));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new a3((h7) this.c, tLObject, this.b, (View) this.d, (e7) this.e, (mp) this.f, 2));
                break;
            default:
                ((ConferenceCall) this.c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.b, (AtomicBoolean) this.e, (AtomicInteger) this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ h0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j3;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }

    public /* synthetic */ h0(bn bnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.c = bnVar;
        this.d = fileLocationArr;
        this.f = str;
        this.e = fileLocationArr2;
        this.b = j3;
    }
}
