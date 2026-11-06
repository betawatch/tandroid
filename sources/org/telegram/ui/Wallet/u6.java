package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class u6 extends vg.m {
    public final /* synthetic */ w6 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(w6 w6Var, Context context) {
        super(context, 1, 4);
        this.i0 = w6Var;
    }

    @Override // vg.m
    public final void i() {
        w6 w6Var = this.i0;
        if (w6Var.e == this) {
            w6.c(w6Var);
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
