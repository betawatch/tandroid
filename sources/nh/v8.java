package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class v8 implements fb {
    public final float[] a = new float[2];
    public final /* synthetic */ w8 b;

    public v8(w8 w8Var) {
        this.b = w8Var;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final int f(int i10) {
        i9 i9Var = this.b.F0;
        d4 t6 = i9Var.t();
        if (t6 == null) {
            return 0;
        }
        i3 i3Var = t6.Z0;
        w8 w8Var = i9Var.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(i3Var, w8Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + i3Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void b(ic icVar) {
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void c(float f10) {
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void d(ic icVar) {
    }
}
