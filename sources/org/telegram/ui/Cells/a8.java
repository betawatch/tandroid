package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ a8(g8 g8Var, int i7) {
        this.a = i7;
        this.b = g8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                g8 g8Var = this.b;
                TextView textView = g8Var.F;
                TextView textView2 = g8Var.E;
                ug.s0 s0Var = g8Var.G;
                if (s0Var.getVisibility() != 0 || !s0Var.w.isEnabled()) {
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
                    s0Var.performClick();
                    break;
                }
                break;
        }
    }
}
