package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ e8(k8 k8Var, int i10) {
        this.a = i10;
        this.b = k8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                k8 k8Var = this.b;
                TextView textView = k8Var.B;
                TextView textView2 = k8Var.y;
                fg.b1 b1Var = k8Var.C;
                if (b1Var.getVisibility() != 0 || !b1Var.r.isEnabled()) {
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
                    b1Var.performClick();
                    break;
                }
                break;
        }
    }
}
