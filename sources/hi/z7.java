package hi;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ z7(f8 f8Var, int i7) {
        this.a = i7;
        this.b = f8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.f1();
                break;
            default:
                this.b.i1();
                break;
        }
    }
}
