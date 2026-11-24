// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class boc extends FrameLayout implements vlb {
    public final ylb a;
    public final w0 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final ln f;
    public final Paint h;

    public boc(Context context, CharSequence[] charSequenceArr, eg9 eg9Var, ylb ylbVar) {
        super(context);
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = ylbVar;
        w0 w0Var = new w0(this, context, ylbVar);
        this.b = w0Var;
        this.f = new ln(new aoc(this, (byte) 0), 420L, d53.h);
        w0Var.setOrientation(0);
        w0Var.setPadding(gm.L(3.0f), gm.L(3.0f), gm.L(3.0f), gm.L(3.0f));
        this.c = new TextView[charSequenceArr.length];
        int i = 0;
        while (i < charSequenceArr.length) {
            TextView textView = new TextView(context);
            textView.setPadding(gm.L(12.0f), gm.L(6.0f), gm.L(12.0f), gm.L(6.0f));
            textView.setTypeface(gm.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i]);
            textView.setOnClickListener(new wh((Object) this, (Object) eg9Var, i, (byte) 20));
            rve.a(textView);
            this.b.addView(textView, qoe.q(-2, -2, 0.0f, 19, i == 0 ? 0 : 3, 0, 0, 0));
            this.c[i] = textView;
            i++;
        }
        addView(this.b, qoe.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i = 0;
        float e = this.f.e(false, this.d);
        while (true) {
            TextView[] textViewArr = this.c;
            if (i >= textViewArr.length) {
                this.b.invalidate();
                return;
            }
            float l = Utilities.l(1.0f - Math.abs(e - i));
            TextView textView = textViewArr[i];
            int i2 = cmb.y6;
            ylb ylbVar = this.a;
            textView.setTextColor(on2.f(l, cmb.v0(i2, ylbVar), cmb.v0(cmb.Ei, ylbVar)));
            i++;
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.Ei));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        w0 w0Var;
        if (this.e && view == (w0Var = this.b)) {
            float N = gm.N(1.67f);
            float N2 = gm.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(cmb.v0(cmb.c6, this.a));
            RectF rectF = gm.P;
            rectF.set(w0Var.getX(), w0Var.getY(), w0Var.getX() + w0Var.getWidth(), w0Var.getY() + w0Var.getHeight());
            canvas.drawRoundRect(rectF, gm.L(18.0f), gm.L(18.0f), paint);
        }
        return super.drawChild(canvas, view, j);
    }

    public void setSelected(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        a();
    }

    @Override // vlb
    public final void updateColors() {
        a();
        this.b.setBackground(this.e ? null : cmb.b0(gm.L(18.0f), cmb.v0(cmb.c6, this.a)));
    }
}
