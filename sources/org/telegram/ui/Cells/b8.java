package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ b8(h8 h8Var, int i10) {
        this.a = i10;
        this.b = h8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                h8 h8Var = this.b;
                TextView textView = h8Var.A;
                TextView textView2 = h8Var.y;
                ag.s1 s1Var = h8Var.B;
                if (s1Var.getVisibility() != 0 || !s1Var.r.isEnabled()) {
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
                    s1Var.performClick();
                    break;
                }
                break;
        }
    }
}
