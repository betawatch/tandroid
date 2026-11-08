package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class t6 extends vg.m {
    public final /* synthetic */ v6 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(v6 v6Var, Context context) {
        super(context, 1, 4);
        this.i0 = v6Var;
    }

    @Override // vg.m
    public final void i() {
        v6 v6Var = this.i0;
        if (v6Var.e == this) {
            v6.c(v6Var);
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
