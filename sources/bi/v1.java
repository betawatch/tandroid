package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v1 extends View {
    public boolean a;
    public final int b;
    public org.telegram.ui.Components.p5 c;
    public final w1 d;
    public ImageReceiver e;
    public long f;
    public final ImageReceiver.BackgroundThreadDrawHolder[] h;
    public ImageReceiver n;
    public final org.telegram.ui.Components.xc r;
    public boolean s;

    public v1(Context context, w1 w1Var) {
        super(context);
        this.b = UserConfig.selectedAccount;
        this.h = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.r = new org.telegram.ui.Components.xc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.d = w1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        if (this.f == (document == null ? 0L : document.id)) {
            return;
        }
        org.telegram.ui.Components.p5 p5Var = this.c;
        if (p5Var != null) {
            p5Var.o(this);
        }
        if (document == null) {
            this.a = false;
            this.f = 0L;
            this.c = null;
            return;
        }
        this.a = true;
        this.f = document.id;
        int i10 = f3.G;
        org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(this.b, LiteMode.isEnabled(z10 ? 1 : LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? 3 : 13, document);
        this.c = m10;
        if (this.s) {
            m10.a(this);
        }
    }

    public float getScale() {
        return this.r.a(0.15f);
    }

    @Override // android.view.View
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
        org.telegram.ui.Components.p5 p5Var = this.c;
        if (p5Var != null) {
            p5Var.a(this);
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s = false;
        org.telegram.ui.Components.p5 p5Var = this.c;
        if (p5Var != null) {
            p5Var.o(this);
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.e.draw(canvas);
            return;
        }
        org.telegram.ui.Components.p5 p5Var = this.c;
        if (p5Var != null) {
            p5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.c.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.p5 p5Var = this.c;
        if (p5Var != null) {
            p5Var.o(this);
        }
        this.c = null;
        this.f = 0L;
        this.a = false;
        if (this.e == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.e = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.e.setAspectFit(true);
            if (this.s) {
                this.e.onAttachedToWindow();
            }
        }
        this.e.setImageBitmap(drawable);
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.r.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        this.a = false;
        if (document == null) {
            ImageReceiver imageReceiver = this.e;
            if (imageReceiver != null) {
                this.f = 0L;
                imageReceiver.clearImage();
                return;
            }
            return;
        }
        long j3 = this.f;
        long j10 = document.id;
        if (j3 == j10) {
            return;
        }
        this.f = j10;
        if (this.e == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.e = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            this.e.setAspectFit(true);
            if (this.s) {
                this.e.onAttachedToWindow();
            }
        }
        this.e.setParentView(!this.a ? this : this.d);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        String str = "video/webm".equals(document.mime_type) ? "80_80_g" : "80_80";
        if (!LiteMode.isEnabled(1)) {
            str = str.concat("_firstframe");
        }
        this.e.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
    }
}
