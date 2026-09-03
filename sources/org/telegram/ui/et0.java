package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class et0 extends o4 {
    public final /* synthetic */ PhotoViewer h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.h = photoViewer;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.h.P8) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.h;
        if (view == photoViewer.B3 && photoViewer.d4) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.o4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        PhotoViewer photoViewer = this.h;
        ImageView imageView = photoViewer.u3;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = getMeasuredWidth();
            layoutParams.height = getMeasuredHeight();
        }
        TextureView textureView = photoViewer.y2;
        if (textureView instanceof org.telegram.ui.Components.x61) {
            textureView.setPivotX(textureView.getMeasuredWidth() / 2);
            photoViewer.B2.setPivotX(photoViewer.y2.getMeasuredWidth() / 2);
        } else {
            if (textureView != null) {
                textureView.setPivotX(0.0f);
            }
            SurfaceView surfaceView = photoViewer.z2;
            if (surfaceView != null) {
                surfaceView.setPivotX(0.0f);
            }
            photoViewer.B2.setPivotX(0.0f);
        }
        photoViewer.z0();
    }
}
