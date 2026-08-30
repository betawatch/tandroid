package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n0 extends e2 implements p0 {
    public CharSequence P;
    public k0 Q;
    public final Rect R;
    public int S;
    public final /* synthetic */ q0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.T = q0Var;
        this.R = new Rect();
        this.B = q0Var;
        this.K = true;
        this.L.setFocusable(true);
        this.C = new l0(this, 0);
    }

    @Override // m.p0
    public final CharSequence d() {
        return this.P;
    }

    @Override // m.p0
    public final void i(CharSequence charSequence) {
        this.P = charSequence;
    }

    @Override // m.p0
    public final void l(int i10) {
        this.S = i10;
    }

    @Override // m.p0
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        x xVar = this.L;
        boolean isShowing = xVar.isShowing();
        s();
        xVar.setInputMethodMode(2);
        g();
        s1 s1Var = this.c;
        s1Var.setChoiceMode(1);
        g0.d(s1Var, i10);
        g0.c(s1Var, i11);
        q0 q0Var = this.T;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        s1 s1Var2 = this.c;
        if (xVar.isShowing() && s1Var2 != null) {
            s1Var2.setListSelectionHidden(false);
            s1Var2.setSelection(selectedItemPosition);
            if (s1Var2.getChoiceMode() != 0) {
                s1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = q0Var.getViewTreeObserver()) == null) {
            return;
        }
        androidx.mediarouter.app.k kVar = new androidx.mediarouter.app.k(this, 4);
        viewTreeObserver.addOnGlobalLayoutListener(kVar);
        xVar.setOnDismissListener(new m0(this, kVar));
    }

    @Override // m.e2, m.p0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.Q = (k0) listAdapter;
    }

    public final void s() {
        int i10;
        q0 q0Var = this.T;
        Rect rect = q0Var.n;
        x xVar = this.L;
        Drawable background = xVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i10 = v3.a(q0Var) ? rect.right : -rect.left;
        } else {
            i10 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = q0Var.getPaddingLeft();
        int paddingRight = q0Var.getPaddingRight();
        int width = q0Var.getWidth();
        int i11 = q0Var.h;
        if (i11 == -2) {
            int a2 = q0Var.a(this.Q, xVar.getBackground());
            int i12 = (q0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a2 > i12) {
                a2 = i12;
            }
            r(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i11);
        }
        this.f = v3.a(q0Var) ? (((width - paddingRight) - this.e) - this.S) + i10 : paddingLeft + this.S + i10;
    }
}
