package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class s7 {
    public static CharSequence[] y;
    public int a;
    public Long b;
    public Integer c;
    public Integer d;
    public boolean e;
    public TLRPC.Document g;
    public SpannableStringBuilder k;
    public String l;
    public boolean m;
    public xy0 n;
    public xy0 o;
    public boolean p;
    public boolean q;
    public View r;
    public Runnable s;
    public int x;
    public boolean f = true;
    public final org.telegram.ui.Components.d6 h = new org.telegram.ui.Components.d6(0, 350, nr.h);
    public final mc i = new mc((View) null);
    public final org.telegram.ui.Cells.y j = org.telegram.ui.ActionBar.m6.a0(553648127, 0, 0);
    public final Paint t = new Paint(1);
    public final Paint u = new Paint(1);
    public final Path v = new Path();
    public final RectF w = new RectF();

    public static CharSequence d() {
        if (y == null) {
            y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            nq nqVar = new nq(R.drawable.filled_widget_music, 0);
            nqVar.c(org.telegram.messenger.g0.L(16.0f));
            nqVar.H = 1.0f;
            float f10 = -org.telegram.messenger.g0.L(1.0f);
            float L = org.telegram.messenger.g0.L(1.0f);
            nqVar.r = f10;
            nqVar.s = L;
            ((SpannableStringBuilder) y[0]).setSpan(nqVar, 0, 1, 33);
        }
        return y[0];
    }

    public final void a(Canvas canvas, float f10) {
        if (this.n == null) {
            CharSequence charSequence = this.k;
            if (charSequence == null) {
                charSequence = "";
            }
            TLRPC.Document document = this.g;
            this.n = new xy0(charSequence, document != null ? 12.0f : 14.0f, document != null ? null : org.telegram.messenger.g0.o());
        }
        if (this.o == null || this.m) {
            String str = this.l;
            this.o = new xy0(str != null ? str : "", 14.0f, null);
        }
        float d = this.h.d(this.f);
        Paint paint = this.t;
        paint.setColor(TLObject.FLAG_30);
        int min = (int) Math.min(f10, Math.max(this.n.c, this.o.c) + org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(18.0f)));
        this.x = min;
        int W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(22.0f));
        float f11 = min;
        RectF rectF = this.w;
        rectF.set(0.0f, 0.0f, f11, W1);
        canvas.save();
        float a10 = this.i.a(0.02f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(42.0f));
        Paint paint2 = this.u;
        paint2.setColor(-1);
        float f12 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.g0.L(20.0f);
        if (f11 < f10) {
            L = (int) Math.min(org.telegram.messenger.g0.L(12.0f) + L, f10 - org.telegram.messenger.g0.L(20.0f));
        }
        xy0 xy0Var = this.n;
        float f13 = L;
        xy0Var.p = f13;
        xy0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        xy0 xy0Var2 = this.o;
        xy0Var2.p = f13;
        xy0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        return org.telegram.messenger.g0.L(this.f ? 22.0f : 42.0f);
    }

    public final void c() {
        if (this.p || this.q || this.b == null || this.c == null || this.r == null) {
            return;
        }
        this.q = true;
        np.u1(this.a).R1().g0(this.c.intValue(), this.b.longValue(), new ai.h0(this, 19));
    }

    public final void e(float f10, float f11, boolean z10) {
        this.i.c(z10);
        int[] iArr = z10 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0];
        org.telegram.ui.Cells.y yVar = this.j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f10, f11);
        }
    }
}
