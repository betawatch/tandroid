package bi;

import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qr;
import org.telegram.messenger.vo;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(Object obj, Object obj2, long j3, Object obj3, int i7) {
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
                org.telegram.messenger.g0.h3(new i0((n0) this.c, (org.telegram.ui.ActionBar.u1) this.d, tLObject, this.b, (c20) this.e, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new m3((k7) this.c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.b));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new i0((ea) this.c, tLObject, (ij) this.d, this.b, (Runnable) this.e));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new i0((org.telegram.ui.ActionBar.u1) this.d, tLObject, this.b, (org.telegram.messenger.c) this.c, (qr) this.e));
                break;
            default:
                org.telegram.messenger.g0.h3(new m3((org.telegram.ui.ActionBar.f2) this.c, tLObject, (vo) this.d, tL_error, (Runnable) this.e, this.b));
                break;
        }
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    public /* synthetic */ f0(org.telegram.ui.ActionBar.u1 u1Var, long j3, org.telegram.messenger.c cVar, qr qrVar) {
        this.a = 3;
        this.d = u1Var;
        this.b = j3;
        this.c = cVar;
        this.e = qrVar;
    }
}
