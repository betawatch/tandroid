package lh;

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
import k7.c8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class v0 extends Drawable {
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
    public org.telegram.ui.Components.q5 q;
    public View r;
    public int s;
    public int t;
    public int u;

    public v0() {
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.e = new z8((g6) null);
        int dp = AndroidUtilities.dp(10.66f);
        this.f = dp * 2;
        this.g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.i = AndroidUtilities.dpf2(7.33f);
        this.j = AndroidUtilities.dp(8.0f);
        this.k = (int) AndroidUtilities.dpf2(22.66f);
        pr prVar = pr.f;
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
            int i10 = (intrinsicHeight * 4) / 144;
            this.a = c8.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i10, (intrinsicWidth * 5) / 168, i10), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
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
            int i11 = (intrinsicHeight2 * 4) / 144;
            this.b = c8.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i11, (intrinsicWidth2 * 5) / 168, i11), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i10) {
        int ceil;
        a();
        if (i10 != this.s || this.n == null) {
            this.s = i10;
            int i11 = !this.l ? 0 : this.g + this.f;
            int i12 = this.j;
            int i13 = i11 + i12;
            int i14 = (i10 - i13) - i12;
            int i15 = this.k;
            if (i14 <= 0 || TextUtils.isEmpty(this.m)) {
                this.n = null;
                this.t = i15;
                this.u = i15;
                return;
            }
            CharSequence charSequence = this.m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i16 = 0; i16 < lineCount; i16++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i16));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i14) {
                StaticLayout staticLayout2 = new StaticLayout(this.m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i17));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.n = staticLayout;
            this.o = i13;
            this.t = ((int) Math.ceil(f11)) + i13 + i12;
            int lineCount2 = this.n.getLineCount() - 1;
            float lineBaseline = this.n.getLineBaseline(0);
            float lineBaseline2 = this.n.getLineBaseline(lineCount2) - lineBaseline;
            float f12 = this.h;
            this.u = Math.max(i15, (int) Math.ceil(lineBaseline2 + f12 + this.i));
            this.p = f12 - lineBaseline;
        }
    }

    public final void c(TLObject tLObject) {
        boolean z4 = tLObject != null;
        this.l = z4;
        if (z4) {
            z8 z8Var = this.e;
            z8Var.p(tLObject);
            boolean z10 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z10) {
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
        boolean z4 = this.l;
        float f10 = z4 ? 1.0f : 0.0f;
        NinePatchDrawable ninePatchDrawable = this.a;
        int i10 = bounds.left;
        int i11 = this.g;
        int i12 = this.f;
        lf.r.g(ninePatchDrawable, i10 + (z4 ? i11 + i12 : 0), bounds.top, bounds.right, bounds.bottom);
        this.a.draw(canvas);
        lf.r.g(this.b, bounds.left + (this.l ? i11 + i12 : 0), bounds.top, bounds.right, bounds.bottom);
        this.b.draw(canvas);
        if (this.n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.o, bounds.top + this.p);
            this.n.draw(canvas);
            View view = this.r;
            if (view != null && (this.m instanceof Spanned)) {
                org.telegram.ui.Components.q5 update = org.telegram.ui.Components.u5.update(0, view, false, this.q, this.n);
                this.q = update;
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f10 > 0.0f) {
            int i13 = bounds.left;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.setImageCoords(i13, bounds.bottom - i12, i12, i12);
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
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
