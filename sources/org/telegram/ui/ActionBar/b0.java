package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ b0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h5 h5Var;
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                ArrayList arrayList = w0Var.d0;
                if (w0Var.e.length() != 0) {
                    w0Var.e.setText("");
                } else if (w0Var.p()) {
                    w0Var.e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (w0Var.E != null && ((tf.e0) arrayList.get(i10)).h) {
                            w0Var.E.o((tf.e0) arrayList.get(i10));
                        }
                    }
                    w0Var.m();
                } else {
                    TextView textView = w0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((h5Var = w0Var.E) == null || h5Var.a())) {
                        w0Var.h.setVisibility(8);
                        h5 h5Var2 = w0Var.E;
                        if (h5Var2 != null) {
                            h5Var2.k();
                        }
                    }
                }
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
                break;
            case 1:
                w0 w0Var2 = this.b;
                p1 p1Var = w0Var2.d;
                if (p1Var != null && p1Var.isShowing()) {
                    if (!w0Var2.Q) {
                        w0Var2.Q = true;
                        w0Var2.d.d(w0Var2.O);
                    }
                }
                z zVar = w0Var2.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    s0 s0Var = w0Var2.M;
                    if (s0Var != null) {
                        s0Var.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 2:
                w0 w0Var3 = this.b;
                z zVar2 = w0Var3.c;
                if (zVar2 != null) {
                    zVar2.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    s0 s0Var2 = w0Var3.M;
                    if (s0Var2 != null) {
                        s0Var2.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            default:
                w0 w0Var4 = this.b;
                p1 p1Var2 = w0Var4.d;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    if (!w0Var4.Q) {
                        w0Var4.Q = true;
                        if (!w0Var4.O) {
                            w0Var4.d.setAnimationStyle(R.style.PopupAnimation);
                        }
                        w0Var4.d.d(w0Var4.O);
                    }
                }
                z zVar3 = w0Var4.c;
                if (zVar3 != null) {
                    zVar3.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    s0 s0Var3 = w0Var4.M;
                    if (s0Var3 != null) {
                        s0Var3.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
        }
    }
}
