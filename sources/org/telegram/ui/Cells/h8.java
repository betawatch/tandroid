package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ h8(n8 n8Var, int i10) {
        this.a = i10;
        this.b = n8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                n8 n8Var = this.b;
                TextView textView = n8Var.E;
                TextView textView2 = n8Var.y;
                qg.s0 s0Var = n8Var.F;
                if (s0Var.getVisibility() != 0 || !s0Var.r.isEnabled()) {
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
