package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class z9 {
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
    public f01 n;
    public f01 o;
    public boolean p;
    public boolean q;
    public View r;
    public Runnable s;
    public int x;
    public boolean f = true;
    public final org.telegram.ui.Components.e6 h = new org.telegram.ui.Components.e6(0, 350, pr.h);
    public final zc i = new zc((View) null);
    public final org.telegram.ui.Cells.z j = org.telegram.ui.ActionBar.j6.Y(553648127, 0, 0);
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
            nqVar.setSize(AndroidUtilities.dp(16.0f));
            nqVar.spaceScaleX = 1.0f;
            nqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) y[0]).setSpan(nqVar, 0, 1, 33);
        }
        return y[0];
    }

    public final void a(Canvas canvas, float f7) {
        if (this.n == null) {
            CharSequence charSequence = this.k;
            if (charSequence == null) {
                charSequence = "";
            }
            TLRPC.Document document = this.g;
            this.n = new f01(charSequence, document != null ? 12.0f : 14.0f, document != null ? null : AndroidUtilities.bold());
        }
        if (this.o == null || this.m) {
            String str = this.l;
            this.o = new f01(str != null ? str : "", 14.0f, null);
        }
        float e7 = this.h.e(this.f);
        Paint paint = this.t;
        paint.setColor(TLObject.FLAG_30);
        int min = (int) Math.min(f7, Math.max(this.n.c, this.o.c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e7));
        this.x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e7);
        float f10 = min;
        RectF rectF = this.w;
        rectF.set(0.0f, 0.0f, f10, lerp);
        canvas.save();
        float a2 = this.i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e7);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.u;
        paint2.setColor(-1);
        float f11 = 1.0f - e7;
        paint2.setAlpha((int) (255.0f * f11));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f10 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        f01 f01Var = this.n;
        float f12 = dp;
        f01Var.p = f12;
        f01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e7), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e7), 1.0f, -1, canvas);
        f01 f01Var2 = this.o;
        f01Var2.p = f12;
        f01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f11, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        return AndroidUtilities.dp(this.f ? 22.0f : 42.0f);
    }

    public final void c() {
        if (this.p || this.q || this.b == null || this.c == null || this.r == null) {
            return;
        }
        this.q = true;
        MessagesController.getInstance(this.a).getStoriesController().d0(this.b.longValue(), this.c.intValue(), new ah.m(this, 3));
    }

    public final void e(float f7, float f10, boolean z10) {
        this.i.c(z10);
        int[] iArr = z10 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0];
        org.telegram.ui.Cells.z zVar = this.j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}
