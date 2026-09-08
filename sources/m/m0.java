package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m0 extends d2 implements o0 {
    public CharSequence S;
    public j0 T;
    public final Rect U;
    public int V;
    public final /* synthetic */ p0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.W = p0Var;
        this.U = new Rect();
        this.E = p0Var;
        this.N = true;
        this.O.setFocusable(true);
        this.F = new k0(this, 0);
    }

    @Override // m.o0
    public final CharSequence e() {
        return this.S;
    }

    @Override // m.o0
    public final void i(CharSequence charSequence) {
        this.S = charSequence;
    }

    @Override // m.o0
    public final void l(int i10) {
        this.V = i10;
    }

    @Override // m.o0
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        x xVar = this.O;
        boolean isShowing = xVar.isShowing();
        s();
        xVar.setInputMethodMode(2);
        g();
        r1 r1Var = this.c;
        r1Var.setChoiceMode(1);
        g0.d(r1Var, i10);
        g0.c(r1Var, i11);
        p0 p0Var = this.W;
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
        androidx.mediarouter.app.j jVar = new androidx.mediarouter.app.j(this, 4);
        viewTreeObserver.addOnGlobalLayoutListener(jVar);
        xVar.setOnDismissListener(new l0(this, jVar));
    }

    @Override // m.d2, m.o0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.T = (j0) listAdapter;
    }

    public final void s() {
        int i10;
        p0 p0Var = this.W;
        Rect rect = p0Var.n;
        x xVar = this.O;
        Drawable background = xVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i10 = s3.a(p0Var) ? rect.right : -rect.left;
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
            int a2 = p0Var.a(this.T, xVar.getBackground());
            int i12 = (p0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a2 > i12) {
                a2 = i12;
            }
            r(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i11);
        }
        this.f = s3.a(p0Var) ? (((width - paddingRight) - this.e) - this.V) + i10 : paddingLeft + this.V + i10;
    }
}
