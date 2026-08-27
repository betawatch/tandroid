package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ b0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e5 e5Var;
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                ArrayList arrayList = v0Var.c0;
                if (v0Var.e.length() != 0) {
                    v0Var.e.setText("");
                } else if (v0Var.p()) {
                    v0Var.e.hideActionMode();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (v0Var.D != null && ((pf.e0) arrayList.get(i10)).h) {
                            v0Var.D.o((pf.e0) arrayList.get(i10));
                        }
                    }
                    v0Var.m();
                } else {
                    TextView textView = v0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((e5Var = v0Var.D) == null || e5Var.a())) {
                        v0Var.h.setVisibility(8);
                        e5 e5Var2 = v0Var.D;
                        if (e5Var2 != null) {
                            e5Var2.k();
                        }
                    }
                }
                v0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(v0Var.e);
                break;
            case 1:
                v0 v0Var2 = this.b;
                n1 n1Var = v0Var2.d;
                if (n1Var != null && n1Var.isShowing()) {
                    if (!v0Var2.P) {
                        v0Var2.P = true;
                        v0Var2.d.d(v0Var2.N);
                    }
                }
                z zVar = v0Var2.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    r0 r0Var = v0Var2.L;
                    if (r0Var != null) {
                        r0Var.h(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 2:
                v0 v0Var3 = this.b;
                z zVar2 = v0Var3.c;
                if (zVar2 != null) {
                    zVar2.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    r0 r0Var2 = v0Var3.L;
                    if (r0Var2 != null) {
                        r0Var2.h(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            default:
                v0 v0Var4 = this.b;
                n1 n1Var2 = v0Var4.d;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    if (!v0Var4.P) {
                        v0Var4.P = true;
                        if (!v0Var4.N) {
                            v0Var4.d.setAnimationStyle(R.style.PopupAnimation);
                        }
                        v0Var4.d.d(v0Var4.N);
                    }
                }
                z zVar3 = v0Var4.c;
                if (zVar3 != null) {
                    zVar3.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    r0 r0Var3 = v0Var4.L;
                    if (r0Var3 != null) {
                        r0Var3.h(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
        }
    }
}
