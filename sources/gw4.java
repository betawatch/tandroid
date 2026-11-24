// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gw4 extends Drawable {
    public NinePatchDrawable a;
    public NinePatchDrawable b;
    public final TextPaint c;
    public final ImageReceiver d;
    public final pc0 e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public boolean l;
    public CharSequence m;
    public StaticLayout n;
    public float o;
    public float p;
    public cn q;
    public View r;
    public int s;
    public int t;
    public int u;

    public gw4() {
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        this.e = new pc0((ylb) null);
        int L = gm.L(10.66f);
        this.f = L << 1;
        this.g = gm.L(4.0f);
        this.h = gm.N(15.33f);
        this.i = gm.N(7.33f);
        this.j = gm.L(8.0f);
        this.k = (int) gm.N(22.66f);
        new fn0(0, new yu3(this, (byte) 28), d53.h, 320L, true);
        textPaint.setTextSize(gm.L(12.0f));
        textPaint.setColor(-1);
        imageReceiver.q0(L);
    }

    public final void a() {
        if (this.a == null) {
            Drawable drawable = a.b.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i = (intrinsicWidth * 27) / nm7.x2;
            int i2 = (intrinsicHeight << 2) / nm7.Z1;
            this.a = ure.a(createBitmap, new Rect(i, i2, (intrinsicWidth * 5) / nm7.x2, i2), (intrinsicWidth * 94) / nm7.x2, (intrinsicHeight * 71) / nm7.Z1);
        }
        if (this.b == null) {
            Drawable drawable2 = a.b.getResources().getDrawable(R.drawable.gift_message_bubble_border_24);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            Bitmap createBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            drawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
            drawable2.draw(canvas2);
            Paint paint = new Paint(1);
            float f = intrinsicWidth2;
            float f2 = intrinsicHeight2;
            paint.setShader(new LinearGradient(f, 0.0f, 0.0f, f2, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
            canvas2.drawRect(0.0f, 0.0f, f, f2, paint);
            int i3 = (intrinsicWidth2 * 27) / nm7.x2;
            int i4 = (intrinsicHeight2 << 2) / nm7.Z1;
            this.b = ure.a(createBitmap2, new Rect(i3, i4, (intrinsicWidth2 * 5) / nm7.x2, i4), (intrinsicWidth2 * 94) / nm7.x2, (intrinsicHeight2 * 71) / nm7.Z1);
        }
    }

    public final void b(int i) {
        int ceil;
        a();
        if (i != this.s || this.n == null) {
            this.s = i;
            int i2 = !this.l ? 0 : this.g + this.f;
            int i3 = this.j;
            int i4 = i2 + i3;
            int i5 = (i - i4) - i3;
            int i6 = this.k;
            if (i5 <= 0 || TextUtils.isEmpty(this.m)) {
                this.n = null;
                this.t = i6;
                this.u = i6;
                return;
            }
            CharSequence charSequence = this.m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i5, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i7 = 0; i7 < lineCount; i7++) {
                f2 = Math.max(f2, staticLayout.getLineWidth(i7));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f2)) < i5) {
                StaticLayout staticLayout2 = new StaticLayout(this.m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i8 = 0; i8 < staticLayout2.getLineCount(); i8++) {
                        f = Math.max(f, staticLayout2.getLineWidth(i8));
                    }
                    f2 = f;
                    staticLayout = staticLayout2;
                }
            }
            this.n = staticLayout;
            this.o = i4;
            this.t = ((int) Math.ceil(f2)) + i4 + i3;
            int lineCount2 = this.n.getLineCount() - 1;
            float lineBaseline = this.n.getLineBaseline(0);
            float lineBaseline2 = this.n.getLineBaseline(lineCount2) - lineBaseline;
            float f3 = this.h;
            this.u = Math.max(i6, (int) Math.ceil(lineBaseline2 + f3 + this.i));
            this.p = f3 - lineBaseline;
        }
    }

    public final void c(TLObject tLObject) {
        boolean z = tLObject != null;
        this.l = z;
        if (z) {
            pc0 pc0Var = this.e;
            pc0Var.k(tLObject);
            boolean z2 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z2) {
                imageReceiver.d0(gn5.l(z8c.t0, 1, (TLRPC.User) tLObject), "48_48", pc0Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.d0(gn5.a(1, (TLRPC.Chat) tLObject), "48_48", pc0Var, null, null, 0);
            } else {
                imageReceiver.g0(pc0Var);
            }
        }
        this.s = -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z = this.l;
        float f = z ? 1.0f : 0.0f;
        NinePatchDrawable ninePatchDrawable = this.a;
        int i = bounds.left;
        int i2 = this.g;
        int i3 = this.f;
        ur3.g(ninePatchDrawable, i + (z ? i2 + i3 : 0), bounds.top, bounds.right, bounds.bottom);
        this.a.draw(canvas);
        ur3.g(this.b, bounds.left + (this.l ? i2 + i3 : 0), bounds.top, bounds.right, bounds.bottom);
        this.b.draw(canvas);
        if (this.n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.o, bounds.top + this.p);
            this.n.draw(canvas);
            View view = this.r;
            if (view != null && (this.m instanceof Spanned)) {
                cn update = gn.update(0, view, false, this.q, this.n);
                this.q = update;
                gn.drawAnimatedEmojis(canvas, this.n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f > 0.0f) {
            int i4 = bounds.left;
            float f2 = bounds.bottom - i3;
            float f3 = i3;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.i0(i4, f2, f3, f3);
            canvas.save();
            canvas.scale(f, f, imageReceiver.r(), imageReceiver.s());
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
