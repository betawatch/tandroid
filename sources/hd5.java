// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hd5 extends LinearLayout implements vlb {
    public final qu3 a;
    public boolean b;
    public int c;
    public fd5 d;
    public String e;
    public final gd5 f;
    public final /* synthetic */ kd5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd5(kd5 kd5Var, Context context) {
        super(context);
        this.h = kd5Var;
        this.f = new gd5(this);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.i5, null);
        textView.setText("t.me/addemoji/");
        qu3 qu3Var = new qu3(context, null);
        this.a = qu3Var;
        qu3Var.setLines(1);
        qu3Var.setSingleLine(true);
        qu3Var.setInputType(TLObject.FLAG_14);
        qu3Var.setTextSize(1, 16.0f);
        anb.X(qu3Var, cmb.Ke, null);
        anb.G(qu3Var, cmb.Xc, null);
        anb.C(qu3Var, cmb.kg, null);
        int i = cmb.Le;
        anb.l(qu3Var, 34, i, null);
        anb.D(qu3Var, i, null);
        anb.l(qu3Var, 30, cmb.Me, null);
        anb.l(qu3Var, 36, cmb.lg, null);
        qu3Var.setBackground(null);
        qu3Var.setHint(jb6.M0(2131754430, null));
        addView(textView, qoe.t(-2, -2, 16, 20, 0, 0, 0));
        addView(qu3Var, qoe.t(-1, -2, 16, -4, 0, 0, 0));
        anb.h(cmb.c6, null, this);
        setPadding(0, gm.L(5.0f), 0, gm.L(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(gm.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, cmb.j0);
        }
    }

    @Override // vlb
    public final void updateColors() {
        qu3 qu3Var = this.a;
        try {
            qu3Var.setHintColor(cmb.w0(null, cmb.Le, false));
            qu3Var.setCursorColor(cmb.w0(null, cmb.Me, false));
            qu3Var.setHandlesColor(cmb.w0(null, cmb.lg, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
