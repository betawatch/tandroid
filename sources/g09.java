// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g09 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t09 b;

    public /* synthetic */ g09(t09 t09Var, byte b) {
        this.a = b;
        this.b = t09Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        t09 t09Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                ArrayList arrayList = t09Var.d;
                t09Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof r09)) {
                    ((r09) view).f(((k09) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof r09) {
                    r09 r09Var = (r09) view;
                    q09 q09Var = r09Var.b;
                    r09Var.O = false;
                    q09Var.setAlpha(1.0f);
                    if (!t09Var.O0) {
                        r09Var.c();
                        break;
                    } else {
                        q09Var.setScaleX(r09Var.J * (r09Var.x ? 0.76f : 1.0f));
                        q09Var.setScaleY(r09Var.J * (r09Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
