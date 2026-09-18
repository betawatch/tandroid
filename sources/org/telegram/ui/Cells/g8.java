package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ g8(m8 m8Var, int i10) {
        this.a = i10;
        this.b = m8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                m8 m8Var = this.b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.y;
                rg.p0 p0Var = m8Var.F;
                if (p0Var.getVisibility() != 0 || !p0Var.r.isEnabled()) {
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
