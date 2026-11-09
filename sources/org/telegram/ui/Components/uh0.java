package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ji0 b;

    public /* synthetic */ uh0(ji0 ji0Var, int i7) {
        this.a = i7;
        this.b = ji0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        View view = (View) obj;
        switch (this.a) {
            case 0:
                ji0 ji0Var = this.b;
                ArrayList arrayList = ji0Var.d;
                ji0Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof hi0)) {
                    ((hi0) view).f(((ai0) arrayList.get(R)).c, true);
                    break;
                }
                break;
            default:
                if (view instanceof hi0) {
                    hi0 hi0Var = (hi0) view;
                    gi0 gi0Var = hi0Var.b;
                    hi0Var.N = false;
                    gi0Var.setAlpha(1.0f);
                    if (!this.b.N0) {
                        hi0Var.d();
                        break;
                    } else {
                        gi0Var.setScaleX(hi0Var.I * (hi0Var.x ? 0.76f : 1.0f));
                        gi0Var.setScaleY(hi0Var.I * (hi0Var.x ? 0.76f : 1.0f));
                        break;
                    }
                }
                break;
        }
    }
}
