package ig;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class b1 extends EditTextBoldCursor {
    public final h5 b;
    public int c;
    public final p6 d;
    public final /* synthetic */ e1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e1 e1Var, Activity activity) {
        super(activity);
        this.e = e1Var;
        this.b = new h5(this);
        p6 p6Var = new p6(false, true, true, false);
        this.d = p6Var;
        p6Var.k(0.2f, 160L, pr.h);
        p6Var.t(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.b.a(j6.v0(this.c < 0 ? j6.p7 : j6.P5, this.e.getResourceProvider()), false);
        p6 p6Var = this.d;
        p6Var.r(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.d;
        if (p6Var != null) {
            this.c = 96 - charSequence.length();
            p6Var.b();
            String str = "";
            if (this.c <= 12) {
                str = "" + this.c;
            }
            p6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
