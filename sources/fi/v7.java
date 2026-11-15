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
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v7 {
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
    public oy0 n;
    public oy0 o;
    public boolean p;
    public boolean q;
    public View r;
    public Runnable s;
    public int x;
    public boolean f = true;
    public final org.telegram.ui.Components.u5 h = new org.telegram.ui.Components.u5(0, 350, er.h);
    public final dc i = new dc((View) null);
    public final org.telegram.ui.Cells.y j = org.telegram.ui.ActionBar.j6.a0(553648127, 0, 0);
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
            eq eqVar = new eq(R.drawable.filled_widget_music, 0);
            eqVar.c(org.telegram.messenger.g0.L(16.0f));
            eqVar.H = 1.0f;
            float f10 = -org.telegram.messenger.g0.L(1.0f);
            float L = org.telegram.messenger.g0.L(1.0f);
            eqVar.r = f10;
            eqVar.s = L;
            ((SpannableStringBuilder) y[0]).setSpan(eqVar, 0, 1, 33);
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
            this.n = new oy0(charSequence, document != null ? 12.0f : 14.0f, document != null ? null : org.telegram.messenger.g0.o());
        }
        if (this.o == null || this.m) {
            String str = this.l;
            this.o = new oy0(str != null ? str : "", 14.0f, null);
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
        oy0 oy0Var = this.n;
        float f13 = L;
        oy0Var.p = f13;
        oy0Var.c(org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(11.0f)), 1.0f, -1, canvas);
        oy0 oy0Var2 = this.o;
        oy0Var2.p = f13;
        oy0Var2.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(30.0f), f12, -1, canvas);
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
        np.s1(this.a).P1().g0(this.c.intValue(), this.b.longValue(), new ai.g0(this, 18));
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
