// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class lpc extends ft4 {
    public final /* synthetic */ npc j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpc(npc npcVar, Context context) {
        super(context, 1, 4);
        this.j0 = npcVar;
    }

    @Override // ft4
    public final void h() {
        npc npcVar = this.j0;
        if (npcVar.e == this) {
            npcVar.h();
        }
    }

    @Override // ft4, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int round = Math.round(Math.min(i, i2) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override // ft4, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        int round = Math.round(Math.min(i, i2) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.E = round;
        this.y = round;
    }

    @Override // ft4, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int round = Math.round(Math.min(getWidth(), getHeight()) * 3.5f);
        if (round > 0) {
            surfaceTexture.setDefaultBufferSize(round, round);
        }
    }

    @Override // ft4, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.j0.y && super.onTouchEvent(motionEvent);
    }
}
