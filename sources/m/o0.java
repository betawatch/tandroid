package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class o0 extends f2 implements q0 {
    public CharSequence S;
    public l0 T;
    public final Rect U;
    public int V;
    public final /* synthetic */ r0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.W = r0Var;
        this.U = new Rect();
        this.E = r0Var;
        this.N = true;
        this.O.setFocusable(true);
        this.F = new m0(this, 0);
    }

    @Override // m.q0
    public final CharSequence d() {
        return this.S;
    }

    @Override // m.q0
    public final void h(CharSequence charSequence) {
        this.S = charSequence;
    }

    @Override // m.q0
    public final void k(int i10) {
        this.V = i10;
    }

    @Override // m.q0
    public final void l(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        z zVar = this.O;
        boolean isShowing = zVar.isShowing();
        q();
        zVar.setInputMethodMode(2);
        g();
        t1 t1Var = this.c;
        t1Var.setChoiceMode(1);
        i0.d(t1Var, i10);
        i0.c(t1Var, i11);
        r0 r0Var = this.W;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        t1 t1Var2 = this.c;
        if (zVar.isShowing() && t1Var2 != null) {
            t1Var2.setListSelectionHidden(false);
            t1Var2.setSelection(selectedItemPosition);
            if (t1Var2.getChoiceMode() != 0) {
                t1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = r0Var.getViewTreeObserver()) == null) {
            return;
        }
        androidx.mediarouter.app.i iVar = new androidx.mediarouter.app.i(this, 4);
        viewTreeObserver.addOnGlobalLayoutListener(iVar);
        zVar.setOnDismissListener(new n0(this, iVar));
    }

    @Override // m.f2, m.q0
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.T = (l0) listAdapter;
    }

    public final void q() {
        int i10;
        r0 r0Var = this.W;
        Rect rect = r0Var.n;
        z zVar = this.O;
        Drawable background = zVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i10 = w3.a(r0Var) ? rect.right : -rect.left;
        } else {
            i10 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = r0Var.getPaddingLeft();
        int paddingRight = r0Var.getPaddingRight();
        int width = r0Var.getWidth();
        int i11 = r0Var.h;
        if (i11 == -2) {
            int a2 = r0Var.a(this.T, zVar.getBackground());
            int i12 = (r0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a2 > i12) {
                a2 = i12;
            }
            p(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i11);
        }
        this.f = w3.a(r0Var) ? (((width - paddingRight) - this.e) - this.V) + i10 : paddingLeft + this.V + i10;
    }
}
