package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class n0 extends e2 implements p0 {
    public CharSequence S;
    public k0 T;
    public final Rect U;
    public int V;
    public final /* synthetic */ q0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.W = q0Var;
        this.U = new Rect();
        this.E = q0Var;
        this.N = true;
        this.O.setFocusable(true);
        this.F = new l0(this, 0);
    }

    @Override // m.p0
    public final CharSequence d() {
        return this.S;
    }

    @Override // m.p0
    public final void i(CharSequence charSequence) {
        this.S = charSequence;
    }

    @Override // m.p0
    public final void l(int i10) {
        this.V = i10;
    }

    @Override // m.p0
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.O;
        boolean isShowing = yVar.isShowing();
        s();
        yVar.setInputMethodMode(2);
        g();
        s1 s1Var = this.c;
        s1Var.setChoiceMode(1);
        h0.d(s1Var, i10);
        h0.c(s1Var, i11);
        q0 q0Var = this.W;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        s1 s1Var2 = this.c;
        if (yVar.isShowing() && s1Var2 != null) {
            s1Var2.setListSelectionHidden(false);
            s1Var2.setSelection(selectedItemPosition);
            if (s1Var2.getChoiceMode() != 0) {
                s1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = q0Var.getViewTreeObserver()) == null) {
            return;
        }
        androidx.mediarouter.app.i iVar = new androidx.mediarouter.app.i(this, 4);
        viewTreeObserver.addOnGlobalLayoutListener(iVar);
        yVar.setOnDismissListener(new m0(this, iVar));
    }

    @Override // m.e2, m.p0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.T = (k0) listAdapter;
    }

    public final void s() {
        int i10;
        q0 q0Var = this.W;
        Rect rect = q0Var.n;
        y yVar = this.O;
        Drawable background = yVar.getBackground();
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
            int a2 = q0Var.a(this.T, yVar.getBackground());
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
        this.f = v3.a(q0Var) ? (((width - paddingRight) - this.e) - this.V) + i10 : paddingLeft + this.V + i10;
    }
}
