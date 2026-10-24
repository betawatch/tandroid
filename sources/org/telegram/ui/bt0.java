package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bt0 extends n4 {
    public final /* synthetic */ PhotoViewer h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.h = photoViewer;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.h.T8) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.h;
        if (view == photoViewer.E3 && photoViewer.g4) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.n4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        PhotoViewer photoViewer = this.h;
        ImageView imageView = photoViewer.x3;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = getMeasuredWidth();
            layoutParams.height = getMeasuredHeight();
        }
        TextureView textureView = photoViewer.B2;
        if (textureView instanceof org.telegram.ui.Components.z71) {
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
    }
}
