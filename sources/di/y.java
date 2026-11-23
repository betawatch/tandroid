package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.lr;
import org.telegram.messenger.ro;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.q2((e0) this.c, (org.telegram.ui.ActionBar.t1) this.d, tLObject, this.b, (w10) this.e));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new a3((f6) this.c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.b));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new bi.q2((y8) this.c, tLObject, (fj) this.d, this.b, (Runnable) this.e, 3));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new bi.q2((org.telegram.ui.ActionBar.t1) this.d, tLObject, this.b, (org.telegram.messenger.c) this.c, (lr) this.e, 13));
                break;
            default:
                org.telegram.messenger.g0.g3(new a3((org.telegram.ui.ActionBar.g2) this.c, tLObject, (ro) this.d, tL_error, (Runnable) this.e, this.b));
                break;
        }
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    public /* synthetic */ y(org.telegram.ui.ActionBar.t1 t1Var, long j3, org.telegram.messenger.c cVar, lr lrVar) {
        this.a = 3;
        this.d = t1Var;
        this.b = j3;
        this.c = cVar;
        this.e = lrVar;
    }
}
