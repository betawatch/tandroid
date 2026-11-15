package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh0 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi0 b;

    public /* synthetic */ xh0(mi0 mi0Var, int i7) {
        this.a = i7;
        this.b = mi0Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                mi0 mi0Var = this.b;
                ArrayList arrayList = mi0Var.d;
                mi0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ki0)) {
                    ((ki0) view).f(((di0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof ki0) {
                    ki0 ki0Var = (ki0) view;
                    ji0 ji0Var = ki0Var.b;
                    ki0Var.O = false;
                    ji0Var.setAlpha(1.0f);
                    if (!this.b.O0) {
                        ki0Var.d();
                        break;
                    } else {
                        ji0Var.setScaleX(ki0Var.J * (ki0Var.x ? 0.76f : 1.0f));
                        ji0Var.setScaleY(ki0Var.J * (ki0Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
