// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eh3 extends ka {
    public final boolean d;
    public final /* synthetic */ aj3 e;

    public eh3(aj3 aj3Var, boolean z) {
        this.e = aj3Var;
        this.d = z;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // y59
    public final int b() {
        boolean z = this.d;
        aj3 aj3Var = this.e;
        return (z ? aj3Var.E : aj3Var.y).size();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        hh3 hh3Var = (hh3) u69Var.a;
        hh3Var.b = i;
        boolean z = this.d;
        aj3 aj3Var = this.e;
        if (z) {
            hh3Var.setDialogId(((fh3) aj3Var.E.get(i)).c);
        } else {
            hh3Var.setDialogId(((fh3) aj3Var.y.get(i)).c);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        hh3 hh3Var = new hh3(this.e, viewGroup.getContext());
        boolean z = this.d;
        hh3Var.O = z;
        if (z) {
            hh3Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new b59(hh3Var);
    }
}
