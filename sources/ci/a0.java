package ci;

import org.telegram.messenger.ir;
import org.telegram.messenger.mo;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a0(Object obj, Object obj2, long j10, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.z1((i0) this.c, (org.telegram.ui.ActionBar.s1) this.d, tLObject, this.b, (u10) this.e));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new z2((l6) this.c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.b));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ai.z1((e9) this.c, tLObject, (zi) this.d, this.b, (Runnable) this.e, 3));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ai.z1((org.telegram.ui.ActionBar.s1) this.d, tLObject, this.b, (org.telegram.messenger.c) this.c, (ir) this.e, 14));
                break;
            default:
                org.telegram.messenger.g0.h3(new z2((org.telegram.ui.ActionBar.d2) this.c, tLObject, (mo) this.d, tL_error, (Runnable) this.e, this.b));
                break;
        }
    }

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    public /* synthetic */ a0(org.telegram.ui.ActionBar.s1 s1Var, long j10, org.telegram.messenger.c cVar, ir irVar) {
        this.a = 3;
        this.d = s1Var;
        this.b = j10;
        this.c = cVar;
        this.e = irVar;
    }
}
