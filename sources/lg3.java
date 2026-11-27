// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lg3 extends la {
    public final boolean d;
    public final /* synthetic */ ii3 e;

    public lg3(ii3 ii3Var, boolean z) {
        this.e = ii3Var;
        this.d = z;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // j79
    public final int b() {
        boolean z = this.d;
        ii3 ii3Var = this.e;
        return (z ? ii3Var.E : ii3Var.y).size();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        og3 og3Var = (og3) f89Var.a;
        og3Var.b = i;
        boolean z = this.d;
        ii3 ii3Var = this.e;
        if (z) {
            og3Var.setDialogId(((mg3) ii3Var.E.get(i)).c);
        } else {
            og3Var.setDialogId(((mg3) ii3Var.y.get(i)).c);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        og3 og3Var = new og3(this.e, viewGroup.getContext());
        boolean z = this.d;
        og3Var.O = z;
        if (z) {
            og3Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new n69(og3Var);
    }
}
