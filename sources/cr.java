// default package

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cr extends o76 implements er {
    public CharSequence T;
    public zq U;
    public final Rect V;
    public int W;
    public final /* synthetic */ fr X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(fr frVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.X = frVar;
        this.V = new Rect();
        this.F = frVar;
        this.O = true;
        this.P.setFocusable(true);
        this.G = new ar(this, (byte) 0);
    }

    @Override // er
    public final CharSequence d() {
        return this.T;
    }

    @Override // er
    public final void h(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override // er
    public final void k(int i) {
        this.W = i;
    }

    @Override // er
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        nq nqVar = this.P;
        boolean isShowing = nqVar.isShowing();
        q();
        nqVar.setInputMethodMode(2);
        f();
        os3 os3Var = this.c;
        byte b = 1;
        os3Var.setChoiceMode(1);
        wq.d(os3Var, i);
        wq.c(os3Var, i2);
        fr frVar = this.X;
        int selectedItemPosition = frVar.getSelectedItemPosition();
        os3 os3Var2 = this.c;
        byte b2 = 0;
        if (nqVar.isShowing() && os3Var2 != null) {
            os3Var2.setListSelectionHidden(false);
            os3Var2.setSelection(selectedItemPosition);
            if (os3Var2.getChoiceMode() != 0) {
                os3Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = frVar.getViewTreeObserver()) == null) {
            return;
        }
        uq uqVar = new uq(this, b);
        viewTreeObserver.addOnGlobalLayoutListener(uqVar);
        nqVar.setOnDismissListener(new br(this, uqVar, b2));
    }

    @Override // o76, er
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.U = (zq) listAdapter;
    }

    public final void q() {
        int i;
        nq nqVar = this.P;
        Drawable background = nqVar.getBackground();
        fr frVar = this.X;
        Rect rect = frVar.n;
        if (background != null) {
            background.getPadding(rect);
            i = ghc.a(frVar) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = frVar.getPaddingLeft();
        int paddingRight = frVar.getPaddingRight();
        int width = frVar.getWidth();
        int i2 = frVar.h;
        if (i2 == -2) {
            int a = frVar.a(this.U, nqVar.getBackground());
            int i3 = (frVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            p(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i2);
        }
        this.f = ghc.a(frVar) ? (((width - paddingRight) - this.e) - this.W) + i : paddingLeft + this.W + i;
    }
}
