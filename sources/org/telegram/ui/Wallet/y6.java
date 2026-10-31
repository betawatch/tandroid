package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y6 extends lg.q {
    public final /* synthetic */ a7 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(a7 a7Var, Context context) {
        super(context, 1, 4);
        this.i0 = a7Var;
    }

    @Override // lg.q
    public final void i() {
        a7 a7Var = this.i0;
        if (a7Var.e == this) {
            a7.c(a7Var);
        }
    }

    @Override // lg.q, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int round = Math.round(Math.min(i10, i11) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override // lg.q, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int round = Math.round(Math.min(i10, i11) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.D = round;
        this.y = round;
    }

    @Override // lg.q, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int round = Math.round(Math.min(getWidth(), getHeight()) * 3.5f);
        if (round > 0) {
            surfaceTexture.setDefaultBufferSize(round, round);
        }
    }

    @Override // lg.q, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.i0.y && super.onTouchEvent(motionEvent);
    }
}
