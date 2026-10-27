package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8 b;

    public /* synthetic */ j8(p8 p8Var, int i10) {
        this.a = i10;
        this.b = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                p8 p8Var = this.b;
                TextView textView = p8Var.E;
                TextView textView2 = p8Var.y;
                tg.p0 p0Var = p8Var.F;
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
