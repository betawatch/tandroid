package hi;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ f7(l7 l7Var, int i7) {
        this.a = i7;
        this.b = l7Var;
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
