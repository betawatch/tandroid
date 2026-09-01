package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class m0 extends d2 implements o0 {
    public CharSequence P;
    public j0 Q;
    public final Rect R;
    public int S;
    public final /* synthetic */ p0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.T = p0Var;
        this.R = new Rect();
        this.B = p0Var;
        this.K = true;
        this.L.setFocusable(true);
        this.C = new k0(this, 0);
    }

    @Override // m.o0
    public final CharSequence d() {
        return this.P;
    }

    @Override // m.o0
    public final void i(CharSequence charSequence) {
        this.P = charSequence;
    }

    @Override // m.o0
    public final void l(int i10) {
        this.S = i10;
    }

    @Override // m.o0
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        x xVar = this.L;
        boolean isShowing = xVar.isShowing();
        r();
        xVar.setInputMethodMode(2);
        g();
        r1 r1Var = this.c;
        r1Var.setChoiceMode(1);
        g0.d(r1Var, i10);
        g0.c(r1Var, i11);
        p0 p0Var = this.T;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        r1 r1Var2 = this.c;
        if (xVar.isShowing() && r1Var2 != null) {
            r1Var2.setListSelectionHidden(false);
            r1Var2.setSelection(selectedItemPosition);
            if (r1Var2.getChoiceMode() != 0) {
                r1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = p0Var.getViewTreeObserver()) == null) {
            return;
        }
        androidx.mediarouter.app.k kVar = new androidx.mediarouter.app.k(this, 4);
        viewTreeObserver.addOnGlobalLayoutListener(kVar);
        xVar.setOnDismissListener(new l0(this, kVar));
    }

    @Override // m.d2, m.o0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.Q = (j0) listAdapter;
    }

    public final void r() {
        int i10;
        p0 p0Var = this.T;
        Rect rect = p0Var.n;
        x xVar = this.L;
        Drawable background = xVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i10 = u3.a(p0Var) ? rect.right : -rect.left;
        } else {
            i10 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = p0Var.getPaddingLeft();
        int paddingRight = p0Var.getPaddingRight();
        int width = p0Var.getWidth();
        int i11 = p0Var.h;
        if (i11 == -2) {
            int a2 = p0Var.a(this.Q, xVar.getBackground());
            int i12 = (p0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a2 > i12) {
                a2 = i12;
            }
            q(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i11);
        }
        this.f = u3.a(p0Var) ? (((width - paddingRight) - this.e) - this.S) + i10 : paddingLeft + this.S + i10;
    }
}
