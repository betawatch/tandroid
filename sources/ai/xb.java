package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class xb implements org.telegram.ui.Components.rb {
    public final float[] a = new float[2];
    public final /* synthetic */ yb b;

    public xb(yb ybVar) {
        this.b = ybVar;
    }

    @Override // org.telegram.ui.Components.rb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.rb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.rb
    public final int f(int i10) {
        kc kcVar = this.b.I0;
        f6 t10 = kcVar.t();
        if (t10 == null) {
            return 0;
        }
        b5 b5Var = t10.c1;
        yb ybVar = kcVar.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(b5Var, ybVar, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + b5Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.rb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.rb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.rb
    public final /* synthetic */ void b(org.telegram.ui.Components.tc tcVar) {
    }

    @Override // org.telegram.ui.Components.rb
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.rb
    public final /* synthetic */ void d(org.telegram.ui.Components.tc tcVar) {
    }
}
