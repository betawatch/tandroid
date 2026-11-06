package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                TextView textView = g8Var.E;
                TextView textView2 = g8Var.D;
                ug.p0 p0Var = g8Var.F;
                if (p0Var.getVisibility() != 0 || !p0Var.w.isEnabled()) {
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
