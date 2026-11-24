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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class cmc extends FrameLayout implements tjb {
    public final wjb a;
    public final w0 b;
    public final TextView[] c;
    public int d;
    public boolean e;
    public final lm f;
    public final Paint h;

    public cmc(Context context, CharSequence[] charSequenceArr, ae9 ae9Var, wjb wjbVar) {
        super(context);
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.a = wjbVar;
        w0 w0Var = new w0(this, context, wjbVar);
        this.b = w0Var;
        this.f = new lm(new bmc(this, (byte) 0), 420L, s33.h);
        w0Var.setOrientation(0);
        w0Var.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
        this.c = new TextView[charSequenceArr.length];
        int i = 0;
        while (i < charSequenceArr.length) {
            TextView textView = new TextView(context);
            textView.setPadding(gl.L(12.0f), gl.L(6.0f), gl.L(12.0f), gl.L(6.0f));
            textView.setTypeface(gl.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i]);
            textView.setOnClickListener(new wg((Object) this, (Object) ae9Var, i, (byte) 20));
            ote.a(textView);
            this.b.addView(textView, nme.q(-2, -2, 0.0f, 19, i == 0 ? 0 : 3, 0, 0, 0));
            this.c[i] = textView;
            i++;
        }
        addView(this.b, nme.e(-2, -2, 17));
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
            int i2 = bkb.y6;
            wjb wjbVar = this.a;
            textView.setTextColor(bm2.f(l, bkb.v0(i2, wjbVar), bkb.v0(bkb.Ei, wjbVar)));
            i++;
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        w0 w0Var;
        if (this.e && view == (w0Var = this.b)) {
            float N = gl.N(1.67f);
            float N2 = gl.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(bkb.v0(bkb.c6, this.a));
            RectF rectF = gl.P;
            rectF.set(w0Var.getX(), w0Var.getY(), w0Var.getX() + w0Var.getWidth(), w0Var.getY() + w0Var.getHeight());
            canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), paint);
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

    @Override // tjb
    public final void updateColors() {
        a();
        this.b.setBackground(this.e ? null : bkb.b0(gl.L(18.0f), bkb.v0(bkb.c6, this.a)));
    }
}
