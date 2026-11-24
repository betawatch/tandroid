// default package

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cq extends o56 implements eq {
    public CharSequence T;
    public zp U;
    public final Rect V;
    public int W;
    public final /* synthetic */ fq X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(fq fqVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.X = fqVar;
        this.V = new Rect();
        this.F = fqVar;
        this.O = true;
        this.P.setFocusable(true);
        this.G = new aq(this, (byte) 0);
    }

    @Override // eq
    public final CharSequence d() {
        return this.T;
    }

    @Override // eq
    public final void h(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override // eq
    public final void l(int i) {
        this.W = i;
    }

    @Override // eq
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        np npVar = this.P;
        boolean isShowing = npVar.isShowing();
        s();
        npVar.setInputMethodMode(2);
        f();
        er3 er3Var = this.c;
        byte b = 1;
        er3Var.setChoiceMode(1);
        wp.d(er3Var, i);
        wp.c(er3Var, i2);
        fq fqVar = this.X;
        int selectedItemPosition = fqVar.getSelectedItemPosition();
        er3 er3Var2 = this.c;
        byte b2 = 0;
        if (npVar.isShowing() && er3Var2 != null) {
            er3Var2.setListSelectionHidden(false);
            er3Var2.setSelection(selectedItemPosition);
            if (er3Var2.getChoiceMode() != 0) {
                er3Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = fqVar.getViewTreeObserver()) == null) {
            return;
        }
        up upVar = new up(this, b);
        viewTreeObserver.addOnGlobalLayoutListener(upVar);
        npVar.setOnDismissListener(new bq(this, upVar, b2));
    }

    @Override // o56, eq
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.U = (zp) listAdapter;
    }

    public final void s() {
        int i;
        np npVar = this.P;
        Drawable background = npVar.getBackground();
        fq fqVar = this.X;
        Rect rect = fqVar.n;
        if (background != null) {
            background.getPadding(rect);
            i = gfc.a(fqVar) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = fqVar.getPaddingLeft();
        int paddingRight = fqVar.getPaddingRight();
        int width = fqVar.getWidth();
        int i2 = fqVar.h;
        if (i2 == -2) {
            int a = fqVar.a(this.U, npVar.getBackground());
            int i3 = (fqVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.f = gfc.a(fqVar) ? (((width - paddingRight) - this.e) - this.W) + i : paddingLeft + this.W + i;
    }
}
