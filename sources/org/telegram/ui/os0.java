package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class os0 extends e5.c {
    public final /* synthetic */ PhotoViewer h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.h = photoViewer;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.h.O8) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.h;
        if (view == photoViewer.A3 && photoViewer.c4) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // e5.c, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        PhotoViewer photoViewer = this.h;
        ImageView imageView = photoViewer.t3;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = getMeasuredWidth();
            layoutParams.height = getMeasuredHeight();
        }
        TextureView textureView = photoViewer.x2;
        if (textureView instanceof org.telegram.ui.Components.l61) {
            textureView.setPivotX(textureView.getMeasuredWidth() / 2);
            photoViewer.A2.setPivotX(photoViewer.x2.getMeasuredWidth() / 2);
        } else {
            if (textureView != null) {
                textureView.setPivotX(0.0f);
            }
            SurfaceView surfaceView = photoViewer.y2;
            if (surfaceView != null) {
                surfaceView.setPivotX(0.0f);
            }
            photoViewer.A2.setPivotX(0.0f);
        }
        photoViewer.z0();
    }
}
