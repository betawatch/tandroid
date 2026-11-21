package bi;

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ x0(b1 b1Var, int i7) {
        this.a = i7;
        this.b = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.c(null);
                break;
            default:
                b1 b1Var = this.b;
                LinearLayout linearLayout = b1Var.e;
                if (linearLayout != null && !b1Var.O) {
                    b1Var.e = null;
                    b1Var.h(linearLayout, false);
                    break;
                }
                break;
        }
    }
}
