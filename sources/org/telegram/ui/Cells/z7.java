package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ z7(f8 f8Var, int i3) {
        this.a = i3;
        this.b = f8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                f8 f8Var = this.b;
                TextView textView = f8Var.F;
                TextView textView2 = f8Var.E;
                vg.o0 o0Var = f8Var.G;
                if (o0Var.getVisibility() != 0 || !o0Var.w.isEnabled()) {
                    if (textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                        if (textView.getVisibility() == 0 && textView.isEnabled()) {
                            textView.performClick();
                            break;
                        }
                    } else {
                        textView2.performClick();
                        break;
                    }
                } else {
                    o0Var.performClick();
                    break;
                }
                break;
        }
    }
}
