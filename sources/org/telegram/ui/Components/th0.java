package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii0 b;

    public /* synthetic */ th0(ii0 ii0Var, int i7) {
        this.a = i7;
        this.b = ii0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                ii0 ii0Var = this.b;
                ArrayList arrayList = ii0Var.d;
                ii0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof gi0)) {
                    ((gi0) view).f(((zh0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof gi0) {
                    gi0 gi0Var = (gi0) view;
                    fi0 fi0Var = gi0Var.b;
                    gi0Var.N = false;
                    fi0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        gi0Var.d();
                        break;
                    } else {
                        fi0Var.setScaleX(gi0Var.I * (gi0Var.x ? 0.76f : 1.0f));
                        fi0Var.setScaleY(gi0Var.I * (gi0Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
