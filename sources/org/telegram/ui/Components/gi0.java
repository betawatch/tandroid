package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gi0 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi0 b;

    public /* synthetic */ gi0(vi0 vi0Var, int i7) {
        this.a = i7;
        this.b = vi0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                vi0 vi0Var = this.b;
                ArrayList arrayList = vi0Var.d;
                vi0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ti0)) {
                    ((ti0) view).f(((mi0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof ti0) {
                    ti0 ti0Var = (ti0) view;
                    si0 si0Var = ti0Var.b;
                    ti0Var.O = false;
                    si0Var.setAlpha(1.0f);
                    if (!this.b.O0) {
                        ti0Var.d();
                        break;
                    } else {
                        si0Var.setScaleX(ti0Var.J * (ti0Var.x ? 0.76f : 1.0f));
                        si0Var.setScaleY(ti0Var.J * (ti0Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
