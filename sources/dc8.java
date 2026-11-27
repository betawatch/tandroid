// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dc8 extends jx {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc8(byte b, Context context, Object obj) {
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
        switch (this.h) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.n;
                if (view == photoViewer.E3 && photoViewer.g4) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // jx, android.widget.FrameLayout, android.view.View
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
                if (textureView instanceof kec) {
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
            default:
                super.onMeasure(i, i2);
                hyc hycVar = (hyc) obj;
                if (hycVar.f != null) {
                    ViewGroup.LayoutParams layoutParams2 = hycVar.d.getLayoutParams();
                    layoutParams2.width = getMeasuredWidth();
                    layoutParams2.height = getMeasuredHeight();
                    ImageView imageView2 = hycVar.e;
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
