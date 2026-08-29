package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yl extends CameraView {
    public final ih.u0 a;
    public boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.c = chatAttachAlertPhotoLayout;
        this.a = new ih.u0(this, 9);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        ni niVar = chatAttachAlertPhotoLayout.b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (this.b || (!chatAttachAlertPhotoLayout.W && chatAttachAlertPhotoLayout.U)) {
            super.dispatchDraw(canvas);
            return;
        }
        float translationY = (niVar.getContainerView().getTranslationY() + (niVar.C0[1] + chatAttachAlertPhotoLayout.S0)) - chatAttachAlertPhotoLayout.L.getTranslationY();
        nh.i iVar = niVar.x2;
        int min = (int) Math.min(translationY - (iVar != null ? iVar.d() + AndroidUtilities.dp(8.0f) : 0.0f), getMeasuredHeight());
        boolean z10 = chatAttachAlertPhotoLayout.W;
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            float f9 = chatAttachAlertPhotoLayout.j1;
            boolean z11 = ChatAttachAlertPhotoLayout.m1;
            float f10 = 1.0f - chatAttachAlertPhotoLayout.a0;
            rectF.set((0.0f * f10) + f9, (f10 * chatAttachAlertPhotoLayout.S) + chatAttachAlertPhotoLayout.g1, chatAttachAlertPhotoLayout.i1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.h1), getMeasuredHeight(), chatAttachAlertPhotoLayout.a0));
        } else {
            if (!z10 && !chatAttachAlertPhotoLayout.U) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z12 = ChatAttachAlertPhotoLayout.m1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.S, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
                return;
            }
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
        }
        canvas.save();
        canvas.clipRect(AndroidUtilities.rectTmp);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        mc.a(chatAttachAlertPhotoLayout.L, this.a);
        chatAttachAlertPhotoLayout.A.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mc.h(this.c.L);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.c.A.invalidate();
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.c.A.invalidate();
    }
}
