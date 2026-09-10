package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        i5 i5Var;
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                ArrayList arrayList = w0Var.g0;
                if (w0Var.e.length() != 0) {
                    w0Var.e.setText("");
                } else if (w0Var.p()) {
                    w0Var.e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (w0Var.H != null && ((fg.q0) arrayList.get(i10)).h) {
                            w0Var.H.o((fg.q0) arrayList.get(i10));
                        }
                    }
                    w0Var.m();
                } else {
                    TextView textView = w0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((i5Var = w0Var.H) == null || i5Var.a())) {
                        w0Var.h.setVisibility(8);
                        i5 i5Var2 = w0Var.H;
                        if (i5Var2 != null) {
                            i5Var2.k();
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
                    if (!w0Var2.T) {
                        w0Var2.T = true;
                        w0Var2.d.d(w0Var2.R);
                    }
                }
                z zVar = w0Var2.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    s0 s0Var = w0Var2.P;
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
                    s0 s0Var2 = w0Var3.P;
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
                    if (!w0Var4.T) {
                        w0Var4.T = true;
                        if (!w0Var4.R) {
                            w0Var4.d.setAnimationStyle(R.style.PopupAnimation);
                        }
                        w0Var4.d.d(w0Var4.R);
                    }
                }
                z zVar3 = w0Var4.c;
                if (zVar3 != null) {
                    zVar3.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    s0 s0Var3 = w0Var4.P;
                    if (s0Var3 != null) {
                        s0Var3.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
        }
    }
}
