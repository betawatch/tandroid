// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h29 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v29 b;

    public /* synthetic */ h29(v29 v29Var, byte b) {
        this.a = b;
        this.b = v29Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        v29 v29Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                ArrayList arrayList = v29Var.d;
                v29Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof t29)) {
                    ((t29) view).f(((l29) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof t29) {
                    t29 t29Var = (t29) view;
                    s29 s29Var = t29Var.b;
                    t29Var.O = false;
                    s29Var.setAlpha(1.0f);
                    if (!v29Var.O0) {
                        t29Var.c();
                        break;
                    } else {
                        s29Var.setScaleX(t29Var.J * (t29Var.x ? 0.76f : 1.0f));
                        s29Var.setScaleY(t29Var.J * (t29Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
