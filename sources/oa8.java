// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oa8 extends jy {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa8(byte b, Context context, Object obj) {
        super(context);
        this.h = b;
        this.n = obj;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.h) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                super.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        k47 k47Var;
        byte b = this.h;
        Object obj = this.n;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (view == photoViewer.E3 && photoViewer.g4) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            case 1:
                boolean drawChild = super.drawChild(canvas, view, j);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                RectF rectF = pipRoundVideoView.F;
                if (view == pipRoundVideoView.c && (k47Var = MediaController.w().v0) != null) {
                    rectF.set(gm.N(1.5f), gm.N(1.5f), getMeasuredWidth() - gm.N(1.5f), getMeasuredHeight() - gm.N(1.5f));
                    canvas.drawArc(rectF, -90.0f, k47Var.b0 * 360.0f, false, cmb.j2);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // jy, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.h;
        Object obj = this.n;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                PhotoViewer photoViewer = (PhotoViewer) obj;
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                }
                TextureView textureView = photoViewer.C2;
                if (textureView instanceof ncc) {
                    textureView.setPivotX(textureView.getMeasuredWidth() / 2);
                    photoViewer.F2.setPivotX(photoViewer.C2.getMeasuredWidth() / 2);
                } else {
                    if (textureView != null) {
                        textureView.setPivotX(0.0f);
                    }
                    SurfaceView surfaceView = photoViewer.D2;
                    if (surfaceView != null) {
                        surfaceView.setPivotX(0.0f);
                    }
                    photoViewer.F2.setPivotX(0.0f);
                }
                photoViewer.s();
                break;
            case 1:
            default:
                super.onMeasure(i, i2);
                break;
            case 2:
                super.onMeasure(i, i2);
                tvc tvcVar = (tvc) obj;
                if (tvcVar.f != null) {
                    ViewGroup.LayoutParams layoutParams2 = tvcVar.d.getLayoutParams();
                    layoutParams2.width = getMeasuredWidth();
                    layoutParams2.height = getMeasuredHeight();
                    ImageView imageView2 = tvcVar.e;
                    if (imageView2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                        layoutParams3.width = getMeasuredWidth();
                        layoutParams3.height = getMeasuredHeight();
                        break;
                    }
                }
                break;
        }
    }
}
