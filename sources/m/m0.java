package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class m0 extends d2 implements o0 {
    public CharSequence T;
    public j0 U;
    public final Rect V;
    public int W;
    public final /* synthetic */ p0 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.X = p0Var;
        this.V = new Rect();
        this.F = p0Var;
        this.O = true;
        this.P.setFocusable(true);
        this.G = new k0(this, 0);
    }

    @Override // m.o0
    public final CharSequence d() {
        return this.T;
    }

    @Override // m.o0
    public final void h(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override // m.o0
    public final void l(int i7) {
        this.W = i7;
    }

    @Override // m.o0
    public final void m(int i7, int i10) {
        ViewTreeObserver viewTreeObserver;
        x xVar = this.P;
        boolean isShowing = xVar.isShowing();
        s();
        xVar.setInputMethodMode(2);
        g();
        r1 r1Var = this.c;
        r1Var.setChoiceMode(1);
        g0.d(r1Var, i7);
        g0.c(r1Var, i10);
        p0 p0Var = this.X;
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
        androidx.mediarouter.app.i iVar = new androidx.mediarouter.app.i(this, 4);
        viewTreeObserver.addOnGlobalLayoutListener(iVar);
        xVar.setOnDismissListener(new l0(this, iVar));
    }

    @Override // m.d2, m.o0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.U = (j0) listAdapter;
    }

    public final void s() {
        int i7;
        p0 p0Var = this.X;
        Rect rect = p0Var.n;
        x xVar = this.P;
        Drawable background = xVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i7 = r3.a(p0Var) ? rect.right : -rect.left;
        } else {
            i7 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = p0Var.getPaddingLeft();
        int paddingRight = p0Var.getPaddingRight();
        int width = p0Var.getWidth();
        int i10 = p0Var.h;
        if (i10 == -2) {
            int a10 = p0Var.a(this.U, xVar.getBackground());
            int i11 = (p0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a10 > i11) {
                a10 = i11;
            }
            r(Math.max(a10, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i10);
        }
        this.f = r3.a(p0Var) ? (((width - paddingRight) - this.e) - this.W) + i7 : paddingLeft + this.W + i7;
    }
}
