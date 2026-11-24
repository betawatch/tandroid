// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class au1 extends TextView implements tjb {
    public final ff0 a;
    public int b;
    public boolean c;
    public final /* synthetic */ mu1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au1(mu1 mu1Var, Activity activity) {
        super(activity);
        this.d = mu1Var;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(this, bkb.Ii, mu1Var.getResourceProvider());
        int themedColor = mu1Var.getThemedColor(bkb.Ei);
        this.b = themedColor;
        ff0 e = sjb.e(themedColor, 16.0f);
        this.a = e;
        setBackground(e);
        setTextSize(1, 14.0f);
        setTypeface(gl.o());
        setGravity(17);
        setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), (int) (gl.q.x * 0.45f)), TLObject.FLAG_31), i2);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(bkb.Ei);
            if (themedColor == this.b && this.c == bkb.I.o()) {
                return;
            }
            Drawable background = getBackground();
            ff0 ff0Var = this.a;
            if (background == ff0Var) {
                this.c = bkb.I.o();
                bkb.F1(ff0Var, themedColor, false);
                bkb.F1(ff0Var, sjb.b(themedColor), true);
                this.b = themedColor;
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
