package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ d8(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                j8 j8Var = this.b;
                TextView textView = j8Var.B;
                TextView textView2 = j8Var.y;
                eg.c1 c1Var = j8Var.C;
                if (c1Var.getVisibility() != 0 || !c1Var.r.isEnabled()) {
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
                    c1Var.performClick();
                    break;
                }
                break;
        }
    }
}
