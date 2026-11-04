package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zd0 extends org.telegram.ui.l4 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd0(int i3, Context context, Object obj) {
        super(context);
        this.h = i3;
        this.n = obj;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.h) {
            case 2:
                if (!((PhotoViewer) this.n).U8) {
                    super.draw(canvas);
                    break;
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.messenger.zi ziVar;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.n;
                if (view == pipRoundVideoView.c && (ziVar = MediaController.B().v0) != null) {
                    pipRoundVideoView.F.set(org.telegram.messenger.g0.N(1.5f), org.telegram.messenger.g0.N(1.5f), getMeasuredWidth() - org.telegram.messenger.g0.N(1.5f), getMeasuredHeight() - org.telegram.messenger.g0.N(1.5f));
                    canvas.drawArc(pipRoundVideoView.F, -90.0f, ziVar.b0 * 360.0f, false, org.telegram.ui.ActionBar.k6.k2);
                }
                return drawChild;
            case 1:
            default:
                return super.drawChild(canvas, view, j10);
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.n;
                if (view == photoViewer.F3 && photoViewer.h4) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // org.telegram.ui.l4, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.h) {
            case 1:
                super.onMeasure(i3, i10);
                d71 d71Var = (d71) this.n;
                if (d71Var.f != null) {
                    ViewGroup.LayoutParams layoutParams = d71Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = d71Var.e;
                    if (imageView != null) {
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        layoutParams2.width = getMeasuredWidth();
                        layoutParams2.height = getMeasuredHeight();
                        break;
                    }
                }
                break;
            case 2:
                super.onMeasure(i3, i10);
                PhotoViewer photoViewer = (PhotoViewer) this.n;
                ImageView imageView2 = photoViewer.y3;
                if (imageView2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                    layoutParams3.width = getMeasuredWidth();
                    layoutParams3.height = getMeasuredHeight();
                }
                TextureView textureView = photoViewer.C2;
                if (textureView instanceof b51) {
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
                photoViewer.A0();
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }
}
