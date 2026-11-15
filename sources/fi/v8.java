package fi;

import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v8 implements wa {
    public final float[] a = new float[2];
    public final /* synthetic */ w8 b;

    public v8(w8 w8Var) {
        this.b = w8Var;
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.wa
    public final int f(int i7) {
        i9 i9Var = this.b.s0;
        b4 z10 = i9Var.z();
        if (z10 == null) {
            return 0;
        }
        e3 e3Var = z10.M0;
        w8 w8Var = i9Var.s;
        float[] fArr = this.a;
        org.telegram.messenger.g0.r1(e3Var, w8Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + e3Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ boolean g(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ int h(int i7) {
        return 0;
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ void b(xb xbVar) {
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ void c(float f10) {
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ void d(xb xbVar) {
    }
}
