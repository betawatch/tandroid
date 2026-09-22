package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                rg.p0 p0Var = n8Var.F;
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
