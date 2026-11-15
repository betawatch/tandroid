package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ z7(f8 f8Var, int i7) {
        this.a = i7;
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
                ug.q0 q0Var = f8Var.G;
                if (q0Var.getVisibility() != 0 || !q0Var.w.isEnabled()) {
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
                    q0Var.performClick();
                    break;
                }
                break;
        }
    }
}
