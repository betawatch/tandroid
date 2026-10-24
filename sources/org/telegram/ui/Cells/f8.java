package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ f8(l8 l8Var, int i10) {
        this.a = i10;
        this.b = l8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                l8 l8Var = this.b;
                TextView textView = l8Var.E;
                TextView textView2 = l8Var.y;
                sg.p0 p0Var = l8Var.F;
                if (p0Var.getVisibility() != 0 || !p0Var.v.isEnabled()) {
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
                    p0Var.performClick();
                    break;
                }
                break;
        }
    }
}
