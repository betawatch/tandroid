package fh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a1 extends Drawable {
    public NinePatchDrawable a;
    public NinePatchDrawable b;
    public final TextPaint c;
    public final ImageReceiver d;
    public final z8 e;
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
    public org.telegram.ui.Components.p5 q;
    public View r;
    public int s;
    public int t;
    public int u;

    public a1() {
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.e = new z8((org.telegram.ui.ActionBar.b6) null);
        int dp = AndroidUtilities.dp(10.66f);
        this.f = dp * 2;
        this.g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.i = AndroidUtilities.dpf2(7.33f);
        this.j = AndroidUtilities.dp(8.0f);
        this.k = (int) AndroidUtilities.dpf2(22.66f);
        gr grVar = gr.f;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(dp);
    }

    public final void a() {
        if (this.a == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i9 = (intrinsicHeight * 4) / 144;
            this.a = g7.z5.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i9, (intrinsicWidth * 5) / 168, i9), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.b == null) {
            Drawable drawable2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_border_24);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            Bitmap createBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            drawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
            drawable2.draw(canvas2);
            Paint paint = new Paint(1);
            float f10 = intrinsicWidth2;
            float f11 = intrinsicHeight2;
            paint.setShader(new LinearGradient(f10, 0.0f, 0.0f, f11, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
            canvas2.drawRect(0.0f, 0.0f, f10, f11, paint);
            int i10 = (intrinsicHeight2 * 4) / 144;
            this.b = g7.z5.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i10, (intrinsicWidth2 * 5) / 168, i10), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i9) {
        int ceil;
        a();
        if (i9 != this.s || this.n == null) {
            this.s = i9;
            int i10 = !this.l ? 0 : this.g + this.f;
            int i11 = this.j;
            int i12 = i10 + i11;
            int i13 = (i9 - i12) - i11;
            int i14 = this.k;
            if (i13 <= 0 || TextUtils.isEmpty(this.m)) {
                this.n = null;
                this.t = i14;
                this.u = i14;
                return;
            }
            CharSequence charSequence = this.m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i15 = 0; i15 < lineCount; i15++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i15));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i13) {
                StaticLayout staticLayout2 = new StaticLayout(this.m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i16 = 0; i16 < staticLayout2.getLineCount(); i16++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i16));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.n = staticLayout;
            this.o = i12;
            this.t = ((int) Math.ceil(f11)) + i12 + i11;
            int lineCount2 = this.n.getLineCount() - 1;
            float lineBaseline = this.n.getLineBaseline(0);
            float lineBaseline2 = this.n.getLineBaseline(lineCount2) - lineBaseline;
            float f12 = this.h;
            this.u = Math.max(i14, (int) Math.ceil(lineBaseline2 + f12 + this.i));
            this.p = f12 - lineBaseline;
        }
    }

    public final void c(TLObject tLObject) {
        boolean z10 = tLObject != null;
        this.l = z10;
        if (z10) {
            z8 z8Var = this.e;
            z8Var.p(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", z8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", z8Var, null, null, 0);
            } else {
                imageReceiver.setImageBitmap(z8Var);
            }
        }
        this.s = -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.l;
        float f10 = z10 ? 1.0f : 0.0f;
        NinePatchDrawable ninePatchDrawable = this.a;
        int i9 = bounds.left;
        int i10 = this.g;
        int i11 = this.f;
        ff.s.g(ninePatchDrawable, i9 + (z10 ? i10 + i11 : 0), bounds.top, bounds.right, bounds.bottom);
        this.a.draw(canvas);
        ff.s.g(this.b, bounds.left + (this.l ? i10 + i11 : 0), bounds.top, bounds.right, bounds.bottom);
        this.b.draw(canvas);
        if (this.n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.o, bounds.top + this.p);
            this.n.draw(canvas);
            View view = this.r;
            if (view != null && (this.m instanceof Spanned)) {
                org.telegram.ui.Components.p5 update = org.telegram.ui.Components.t5.update(0, view, false, this.q, this.n);
                this.q = update;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f10 > 0.0f) {
            int i12 = bounds.left;
            float f11 = bounds.bottom - i11;
            float f12 = i11;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.setImageCoords(i12, f11, f12, f12);
            canvas.save();
            canvas.scale(f10, f10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            imageReceiver.draw(canvas);
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
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
