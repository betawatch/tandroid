package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c70(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((org.telegram.ui.ActionBar.x1) this.c, tLObject, this.b, (org.telegram.messenger.c) this.d, (org.telegram.messenger.zr) this.e, 5));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.q00((org.telegram.ui.ActionBar.k2) this.c, tLObject, (org.telegram.messenger.ap) this.d, tL_error, (Runnable) this.e, this.b, 3));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((rh.r) this.d, (org.telegram.ui.ActionBar.x1) this.c, tLObject, this.b, (org.telegram.messenger.q20) this.e));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.q00((rh.e4) this.c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.b, 4));
                break;
            default:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((rh.e6) this.c, tLObject, (org.telegram.messenger.jj) this.d, this.b, (Runnable) this.e, 12));
                break;
        }
    }

    public /* synthetic */ c70(org.telegram.ui.ActionBar.x1 x1Var, long j10, org.telegram.messenger.c cVar, org.telegram.messenger.zr zrVar) {
        this.a = 0;
        this.c = x1Var;
        this.b = j10;
        this.d = cVar;
        this.e = zrVar;
    }

    public /* synthetic */ c70(rh.r rVar, org.telegram.ui.ActionBar.x1 x1Var, long j10, org.telegram.messenger.q20 q20Var) {
        this.a = 2;
        this.d = rVar;
        this.c = x1Var;
        this.b = j10;
        this.e = q20Var;
    }

    public /* synthetic */ c70(rh.e6 e6Var, org.telegram.messenger.jj jjVar, long j10, Runnable runnable) {
        this.a = 4;
        this.c = e6Var;
        this.d = jjVar;
        this.b = j10;
        this.e = runnable;
    }
}
