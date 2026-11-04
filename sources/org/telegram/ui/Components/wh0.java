package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ li0 b;

    public /* synthetic */ wh0(li0 li0Var, int i3) {
        this.a = i3;
        this.b = li0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                li0 li0Var = this.b;
                ArrayList arrayList = li0Var.d;
                li0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ji0)) {
                    ((ji0) view).f(((ci0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof ji0) {
                    ji0 ji0Var = (ji0) view;
                    ii0 ii0Var = ji0Var.b;
                    ji0Var.O = false;
                    ii0Var.setAlpha(1.0f);
                    if (!this.b.O0) {
                        ji0Var.d();
                        break;
                    } else {
                        ii0Var.setScaleX(ji0Var.J * (ji0Var.x ? 0.76f : 1.0f));
                        ii0Var.setScaleY(ji0Var.J * (ji0Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
