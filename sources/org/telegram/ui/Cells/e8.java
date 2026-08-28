package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ e8(k8 k8Var, int i9) {
        this.a = i9;
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
                TextView textView = k8Var.A;
                TextView textView2 = k8Var.y;
                zf.p0 p0Var = k8Var.B;
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
