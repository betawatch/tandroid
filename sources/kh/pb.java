package kh;

import org.telegram.ui.iz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class pb extends rb {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ pb(Object obj, int i9) {
        this.g = i9;
        this.h = obj;
    }

    @Override // kh.rb
    public final void e() {
        switch (this.g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = false;
                iz0Var.invalidate();
                break;
            case 1:
                ih.i4 t10 = ((ih.m9) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.o9 o9Var = (org.telegram.ui.Components.o9) this.h;
                o9Var.post(new f1(o9Var, 17));
                break;
        }
    }

    @Override // kh.rb
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                iz0 iz0Var = (iz0) this.h;
                iz0Var.M = true;
                iz0Var.invalidate();
                break;
            case 1:
                ih.i4 t10 = ((ih.m9) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                ih.l3 l3Var = this.f;
                if (l3Var != null) {
                    l3Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.o9) this.h).setVisibility(0);
                break;
        }
    }
}
