package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ c8(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                i8 i8Var = this.b;
                TextView textView = i8Var.A;
                TextView textView2 = i8Var.y;
                cg.d1 d1Var = i8Var.B;
                if (d1Var.getVisibility() != 0 || !d1Var.r.isEnabled()) {
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
                    d1Var.performClick();
                    break;
                }
                break;
        }
    }
}
