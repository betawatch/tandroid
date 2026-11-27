// default package

import android.view.View;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ev implements View.OnScrollChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ev(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                amb ambVar = ((o) ((xi5) obj)).Q0;
                if (ambVar != null && ambVar.w()) {
                    ambVar.v();
                    break;
                }
                break;
            default:
                v94 v94Var = (v94) obj;
                float f = v94Var.R;
                if (f <= 0.0f || f >= 1.0f) {
                    if (f >= 1.0f) {
                        for (int i5 = 0; i5 < v94Var.O; i5++) {
                            if (v94Var.i(i5)) {
                            }
                        }
                        break;
                    }
                }
                v94Var.requestLayout();
                break;
        }
    }
}
