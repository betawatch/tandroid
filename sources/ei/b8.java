package ei;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ b8(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.V();
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
