package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ n5(r5 r5Var, int i10) {
        this.a = i10;
        this.b = r5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r5 r5Var = this.b;
                if (!r5Var.G && r5Var.F) {
                    r5Var.f(true);
                    break;
                } else {
                    j jVar = r5Var.T;
                    if (jVar != null) {
                        jVar.b(-1);
                        break;
                    }
                }
                break;
            default:
                r5 r5Var2 = this.b;
                if (r5Var2.s.length() != 0) {
                    r5Var2.s.setText("");
                } else {
                    TextView textView = r5Var2.w;
                    if (textView != null && textView.getVisibility() == 0) {
                        r5Var2.e();
                    }
                }
                r5Var2.s.requestFocus();
                AndroidUtilities.showKeyboard(r5Var2.s);
                break;
        }
    }
}
