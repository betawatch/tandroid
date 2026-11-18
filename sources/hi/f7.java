package hi;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
