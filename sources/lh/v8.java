package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class v8 implements kb {
    public final float[] a = new float[2];
    public final /* synthetic */ w8 b;

    public v8(w8 w8Var) {
        this.b = w8Var;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.kb
    public final int f(int i10) {
        i9 i9Var = this.b.E0;
        d4 t10 = i9Var.t();
        if (t10 == null) {
            return 0;
        }
        h3 h3Var = t10.Y0;
        w8 w8Var = i9Var.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(h3Var, w8Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + h3Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ void b(mc mcVar) {
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ void c(float f9) {
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ void d(mc mcVar) {
    }
}
