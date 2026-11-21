package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii0 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi0 b;

    public /* synthetic */ ii0(xi0 xi0Var, int i7) {
        this.a = i7;
        this.b = xi0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                xi0 xi0Var = this.b;
                ArrayList arrayList = xi0Var.d;
                xi0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof vi0)) {
                    ((vi0) view).f(((oi0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof vi0) {
                    vi0 vi0Var = (vi0) view;
                    ui0 ui0Var = vi0Var.b;
                    vi0Var.O = false;
                    ui0Var.setAlpha(1.0f);
                    if (!this.b.O0) {
                        vi0Var.d();
                        break;
                    } else {
                        ui0Var.setScaleX(vi0Var.J * (vi0Var.x ? 0.76f : 1.0f));
                        ui0Var.setScaleY(vi0Var.J * (vi0Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
