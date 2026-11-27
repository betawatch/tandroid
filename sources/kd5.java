// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kd5 extends LinearLayout implements snb {
    public final xt3 a;
    public boolean b;
    public int c;
    public se4 d;
    public String e;
    public final jd5 f;
    public final /* synthetic */ nd5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd5(nd5 nd5Var, Context context) {
        super(context);
        this.h = nd5Var;
        this.f = new jd5(this);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.j5, null);
        textView.setText("t.me/addemoji/");
        xt3 xt3Var = new xt3(context, null);
        this.a = xt3Var;
        xt3Var.setLines(1);
        xt3Var.setSingleLine(true);
        xt3Var.setInputType(TLObject.FLAG_14);
        xt3Var.setTextSize(1, 16.0f);
        yob.X(xt3Var, aob.Le, null);
        yob.G(xt3Var, aob.Yc, null);
        yob.C(xt3Var, aob.lg, null);
        int i = aob.Me;
        yob.l(xt3Var, 34, i, null);
        yob.D(xt3Var, i, null);
        yob.l(xt3Var, 30, aob.Ne, null);
        yob.l(xt3Var, 36, aob.mg, null);
        xt3Var.setBackground(null);
        xt3Var.setHint(ob6.M0(2131754426, null));
        addView(textView, tre.t(-2, -2, 16, 20, 0, 0, 0));
        addView(xt3Var, tre.t(-1, -2, 16, -4, 0, 0, 0));
        yob.h(aob.d6, null, this);
        setPadding(0, hl.L(5.0f), 0, hl.L(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(hl.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, aob.j0);
        }
    }

    @Override // snb
    public final void updateColors() {
        xt3 xt3Var = this.a;
        try {
            xt3Var.setHintColor(aob.w0(null, aob.Me, false));
            xt3Var.setCursorColor(aob.w0(null, aob.Ne, false));
            xt3Var.setHandlesColor(aob.w0(null, aob.mg, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
