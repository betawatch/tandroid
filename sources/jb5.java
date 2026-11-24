// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jb5 extends LinearLayout implements tjb {
    public final gt3 a;
    public boolean b;
    public int c;
    public vc4 d;
    public String e;
    public final ib5 f;
    public final /* synthetic */ mb5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb5(mb5 mb5Var, Context context) {
        super(context);
        this.h = mb5Var;
        this.f = new ib5(this);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.i5, null);
        textView.setText("t.me/addemoji/");
        gt3 gt3Var = new gt3(context, null);
        this.a = gt3Var;
        gt3Var.setLines(1);
        gt3Var.setSingleLine(true);
        gt3Var.setInputType(TLObject.FLAG_14);
        gt3Var.setTextSize(1, 16.0f);
        zkb.X(gt3Var, bkb.Ke, null);
        zkb.G(gt3Var, bkb.Xc, null);
        zkb.C(gt3Var, bkb.kg, null);
        int i = bkb.Le;
        zkb.l(gt3Var, 34, i, null);
        zkb.D(gt3Var, i, null);
        zkb.l(gt3Var, 30, bkb.Me, null);
        zkb.l(gt3Var, 36, bkb.lg, null);
        gt3Var.setBackground(null);
        gt3Var.setHint(k96.M0(2131754430, null));
        addView(textView, nme.t(-2, -2, 16, 20, 0, 0, 0));
        addView(gt3Var, nme.t(-1, -2, 16, -4, 0, 0, 0));
        zkb.h(bkb.c6, null, this);
        setPadding(0, gl.L(5.0f), 0, gl.L(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(gl.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, bkb.j0);
        }
    }

    @Override // tjb
    public final void updateColors() {
        gt3 gt3Var = this.a;
        try {
            gt3Var.setHintColor(bkb.w0(null, bkb.Le, false));
            gt3Var.setCursorColor(bkb.w0(null, bkb.Me, false));
            gt3Var.setHandlesColor(bkb.w0(null, bkb.lg, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
