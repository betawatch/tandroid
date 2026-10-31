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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class af0 extends org.telegram.ui.k4 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.h) {
            case 2:
                if (!((PhotoViewer) this.n).T8) {
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
        org.telegram.messenger.jj jjVar;
        switch (this.h) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.n;
                if (view == pipRoundVideoView.c && (jjVar = MediaController.B().u0) != null) {
                    pipRoundVideoView.E.set(org.telegram.messenger.i0.N(1.5f), org.telegram.messenger.i0.N(1.5f), getMeasuredWidth() - org.telegram.messenger.i0.N(1.5f), getMeasuredHeight() - org.telegram.messenger.i0.N(1.5f));
                    canvas.drawArc(pipRoundVideoView.E, -90.0f, jjVar.b0 * 360.0f, false, org.telegram.ui.ActionBar.t6.k2);
                }
                return drawChild;
            case 1:
            default:
                return super.drawChild(canvas, view, j10);
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.n;
                if (view == photoViewer.E3 && photoViewer.g4) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // org.telegram.ui.k4, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.h) {
            case 1:
                super.onMeasure(i10, i11);
                m81 m81Var = (m81) this.n;
                if (m81Var.f != null) {
                    ViewGroup.LayoutParams layoutParams = m81Var.d.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    ImageView imageView = m81Var.e;
                    if (imageView != null) {
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        layoutParams2.width = getMeasuredWidth();
                        layoutParams2.height = getMeasuredHeight();
                        break;
                    }
                }
                break;
            case 2:
                super.onMeasure(i10, i11);
                PhotoViewer photoViewer = (PhotoViewer) this.n;
                ImageView imageView2 = photoViewer.x3;
                if (imageView2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                    layoutParams3.width = getMeasuredWidth();
                    layoutParams3.height = getMeasuredHeight();
                }
                TextureView textureView = photoViewer.B2;
                if (textureView instanceof k61) {
                    textureView.setPivotX(textureView.getMeasuredWidth() / 2);
                    photoViewer.E2.setPivotX(photoViewer.B2.getMeasuredWidth() / 2);
                } else {
                    if (textureView != null) {
                        textureView.setPivotX(0.0f);
                    }
                    SurfaceView surfaceView = photoViewer.C2;
                    if (surfaceView != null) {
                        surfaceView.setPivotX(0.0f);
                    }
                    photoViewer.E2.setPivotX(0.0f);
                }
                photoViewer.A0();
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
