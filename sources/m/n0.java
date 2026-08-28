package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n0 extends e2 implements p0 {
    public CharSequence O;
    public k0 P;
    public final Rect Q;
    public int R;
    public final /* synthetic */ q0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.S = q0Var;
        this.Q = new Rect();
        this.A = q0Var;
        this.J = true;
        this.K.setFocusable(true);
        this.B = new l0(this, 0);
    }

    @Override // m.p0
    public final CharSequence d() {
        return this.O;
    }

    @Override // m.p0
    public final void h(CharSequence charSequence) {
        this.O = charSequence;
    }

    @Override // m.p0
    public final void l(int i9) {
        this.R = i9;
    }

    @Override // m.p0
    public final void m(int i9, int i10) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.K;
        boolean isShowing = yVar.isShowing();
        r();
        yVar.setInputMethodMode(2);
        g();
        s1 s1Var = this.c;
        s1Var.setChoiceMode(1);
        h0.d(s1Var, i9);
        h0.c(s1Var, i10);
        q0 q0Var = this.S;
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
        androidx.mediarouter.app.k kVar = new androidx.mediarouter.app.k(this, 4);
        viewTreeObserver.addOnGlobalLayoutListener(kVar);
        yVar.setOnDismissListener(new m0(this, kVar));
    }

    @Override // m.e2, m.p0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.P = (k0) listAdapter;
    }

    public final void r() {
        int i9;
        q0 q0Var = this.S;
        Rect rect = q0Var.n;
        y yVar = this.K;
        Drawable background = yVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i9 = w3.a(q0Var) ? rect.right : -rect.left;
        } else {
            i9 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = q0Var.getPaddingLeft();
        int paddingRight = q0Var.getPaddingRight();
        int width = q0Var.getWidth();
        int i10 = q0Var.h;
        if (i10 == -2) {
            int a2 = q0Var.a(this.P, yVar.getBackground());
            int i11 = (q0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a2 > i11) {
                a2 = i11;
            }
            q(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i10);
        }
        this.f = w3.a(q0Var) ? (((width - paddingRight) - this.e) - this.R) + i9 : paddingLeft + this.R + i9;
    }
}
