package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ b8(h8 h8Var, int i7) {
        this.a = i7;
        this.b = h8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                h8 h8Var = this.b;
                TextView textView = h8Var.F;
                TextView textView2 = h8Var.E;
                ug.s0 s0Var = h8Var.G;
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
