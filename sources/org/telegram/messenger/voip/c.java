package org.telegram.messenger.voip;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.q00;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.un;
import th.t5;
import th.v5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j10;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((ConferenceCall) this.c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.b, (AtomicBoolean) this.e, (AtomicInteger) this.f, tLObject, tL_error);
                break;
            case 1:
                org.telegram.messenger.i0.g3(new f(tL_error, (un) this.c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f, this.b));
                break;
            default:
                org.telegram.messenger.i0.g3(new q00((v5) this.c, tLObject, this.b, (View) this.d, (t5) this.e, (vp) this.f, 7));
                break;
        }
    }

    public /* synthetic */ c(un unVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.c = unVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f = fileLocationArr2;
        this.b = j10;
    }

    public /* synthetic */ c(v5 v5Var, long j10, View view, t5 t5Var, vp vpVar) {
        this.c = v5Var;
        this.b = j10;
        this.d = view;
        this.e = t5Var;
        this.f = vpVar;
    }
}
