package ei;

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
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class n1 extends View {
    public yq a;
    public boolean b;
    public final int c;
    public org.telegram.ui.Components.r5 d;
    public final o1 e;
    public ImageReceiver f;
    public long h;
    public final ImageReceiver.BackgroundThreadDrawHolder[] n;
    public ImageReceiver r;
    public final yc s;
    public boolean v;

    public n1(Context context, o1 o1Var) {
        super(context);
        this.c = UserConfig.selectedAccount;
        this.n = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.s = new yc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.e = o1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        if (this.h == (document == null ? 0L : document.id)) {
            return;
        }
        org.telegram.ui.Components.r5 r5Var = this.d;
        if (r5Var != null) {
            r5Var.o(this);
        }
        if (document == null) {
            this.b = false;
            this.h = 0L;
            this.d = null;
            return;
        }
        this.b = true;
        this.h = document.id;
        int i10 = n2.H;
        org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(this.c, LiteMode.isEnabled(z10 ? 1 : LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? 3 : 13, document);
        this.d = m10;
        if (this.v) {
            m10.a(this);
        }
    }

    public float getScale() {
        return this.s.a(0.15f);
    }

    @Override // android.view.View
    public final void invalidate() {
        this.e.invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = true;
        org.telegram.ui.Components.r5 r5Var = this.d;
        if (r5Var != null) {
            r5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v = false;
        org.telegram.ui.Components.r5 r5Var = this.d;
        if (r5Var != null) {
            r5Var.o(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f.draw(canvas);
            return;
        }
        org.telegram.ui.Components.r5 r5Var = this.d;
        if (r5Var != null) {
            r5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.r5 r5Var = this.d;
        if (r5Var != null) {
            r5Var.o(this);
        }
        this.d = null;
        this.h = 0L;
        this.b = false;
        if (this.f == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.f = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.f.setAspectFit(true);
            if (this.v) {
                this.f.onAttachedToWindow();
            }
        }
        this.f.setImageBitmap(drawable);
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        this.b = false;
        if (document == null) {
            ImageReceiver imageReceiver = this.f;
            if (imageReceiver != null) {
                this.h = 0L;
                imageReceiver.clearImage();
                return;
            }
            return;
        }
        long j10 = this.h;
        long j11 = document.id;
        if (j10 == j11) {
            return;
        }
        this.h = j11;
        if (this.f == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.f = imageReceiver2;
            imageReceiver2.setLayerNum(7);
            this.f.setAspectFit(true);
            if (this.v) {
                this.f.onAttachedToWindow();
            }
        }
        this.f.setParentView(!this.b ? this : this.e);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        String str = "video/webm".equals(document.mime_type) ? "80_80_g" : "80_80";
        if (!LiteMode.isEnabled(1)) {
            str = str.concat("_firstframe");
        }
        this.f.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
    }
}
