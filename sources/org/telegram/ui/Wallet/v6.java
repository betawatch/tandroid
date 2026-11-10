package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class v6 extends vg.m {
    public final /* synthetic */ x6 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(x6 x6Var, Context context) {
        super(context, 1, 4);
        this.i0 = x6Var;
    }

    @Override // vg.m
    public final void i() {
        x6 x6Var = this.i0;
        if (x6Var.e == this) {
            x6.c(x6Var);
        }
    }

    @Override // vg.m, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int round = Math.round(Math.min(i7, i10) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override // vg.m, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        int round = Math.round(Math.min(i7, i10) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.D = round;
        this.y = round;
    }

    @Override // vg.m, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int round = Math.round(Math.min(getWidth(), getHeight()) * 3.5f);
        if (round > 0) {
            surfaceTexture.setDefaultBufferSize(round, round);
        }
    }

    @Override // vg.m, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.i0.y && super.onTouchEvent(motionEvent);
    }
}
