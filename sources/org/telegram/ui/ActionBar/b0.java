package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        s0 s0Var;
        o1 o1Var;
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                ArrayList arrayList = w0Var.g0;
                if (w0Var.e.length() != 0) {
                    w0Var.e.setText("");
                } else if (w0Var.r()) {
                    w0Var.e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (w0Var.H != null && ((ig.p0) arrayList.get(i10)).h) {
                            w0Var.H.j((ig.p0) arrayList.get(i10));
                        }
                    }
                    w0Var.m();
                } else {
                    TextView textView = w0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((s0Var = w0Var.H) == null || s0Var.a())) {
                        w0Var.h.setVisibility(8);
                        s0 s0Var2 = w0Var.H;
                        if (s0Var2 != null) {
                            s0Var2.f();
                        }
                    }
                }
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
                break;
            case 1:
                w0 w0Var2 = this.b;
                if (w0Var2.x()) {
                    if (!w0Var2.T) {
                        w0Var2.T = true;
                        w0Var2.q();
                    }
                }
                z zVar = w0Var2.c;
                if (zVar != null) {
                    zVar.n(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    r0 r0Var = w0Var2.P;
                    if (r0Var != null) {
                        r0Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 2:
                w0 w0Var3 = this.b;
                z zVar2 = w0Var3.c;
                if (zVar2 != null) {
                    zVar2.n(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    r0 r0Var2 = w0Var3.P;
                    if (r0Var2 != null) {
                        r0Var2.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            default:
                w0 w0Var4 = this.b;
                if (w0Var4.x()) {
                    if (!w0Var4.T) {
                        w0Var4.T = true;
                        if (!w0Var4.R && (o1Var = w0Var4.d) != null) {
                            o1Var.setAnimationStyle(R.style.PopupAnimation);
                        }
                        w0Var4.q();
                    }
                }
                z zVar3 = w0Var4.c;
                if (zVar3 != null) {
                    zVar3.n(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    r0 r0Var3 = w0Var4.P;
                    if (r0Var3 != null) {
                        r0Var3.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
        }
    }
}
