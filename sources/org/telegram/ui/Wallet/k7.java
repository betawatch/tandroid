package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class k7 extends vg.m {
    public final /* synthetic */ m7 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(m7 m7Var, Context context) {
        super(context, 1, 4);
        this.j0 = m7Var;
    }

    @Override // vg.m
    public final void i() {
        m7 m7Var = this.j0;
        if (m7Var.e == this) {
            m7.c(m7Var);
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
        this.E = round;
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
        return !this.j0.y && super.onTouchEvent(motionEvent);
    }
}
