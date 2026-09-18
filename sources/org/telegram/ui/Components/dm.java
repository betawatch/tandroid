package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dm extends CameraView {
    public final ai.w4 a;
    public boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.c = chatAttachAlertPhotoLayout;
        this.a = new ai.w4(this, 7);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (this.b || (!chatAttachAlertPhotoLayout.d0 && chatAttachAlertPhotoLayout.b0)) {
            super.dispatchDraw(canvas);
            return;
        }
        float translationY = (viVar.getContainerView().getTranslationY() + (viVar.G0[1] + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY();
        ci.i iVar = viVar.B2;
        int min = (int) Math.min(translationY - (iVar != null ? iVar.d() + AndroidUtilities.dp(8.0f) : 0.0f), getMeasuredHeight());
        boolean z10 = chatAttachAlertPhotoLayout.d0;
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = chatAttachAlertPhotoLayout.n1;
            boolean z11 = ChatAttachAlertPhotoLayout.q1;
            float f10 = 1.0f - chatAttachAlertPhotoLayout.e0;
            rectF.set((0.0f * f10) + f7, (f10 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.k1, chatAttachAlertPhotoLayout.m1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.l1), getMeasuredHeight(), chatAttachAlertPhotoLayout.e0));
        } else {
            if (!z10 && !chatAttachAlertPhotoLayout.b0) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.W, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
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
        oc.a(chatAttachAlertPhotoLayout.P, this.a);
        chatAttachAlertPhotoLayout.E.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oc.h(this.c.P);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.c.E.invalidate();
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.c.E.invalidate();
    }
}
