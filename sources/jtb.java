// default package

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jtb extends TextView {
    public View a;
    public ViewPropertyAnimator b;
    public boolean c;
    public cib d;

    public final void a() {
        if (this.a == null) {
            return;
        }
        View view = (View) getParent();
        int i = 0;
        int i2 = 0;
        for (View view2 = this.a; view2 != view; view2 = (View) view2.getParent()) {
            i2 += view2.getTop();
            i += view2.getLeft();
        }
        int width = ((this.a.getWidth() / 2) + i) - (getMeasuredWidth() / 2);
        setTranslationX(width >= 0 ? getMeasuredWidth() + width > view.getMeasuredWidth() ? (view.getMeasuredWidth() - getMeasuredWidth()) - gl.L(16.0f) : width : 0);
        setTranslationY(i2 - getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }
}
