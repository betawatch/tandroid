package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bm extends CameraView {
    public final lh.t0 a;
    public boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z4, boolean z10) {
        super(context, z4, z10);
        this.c = chatAttachAlertPhotoLayout;
        this.a = new lh.t0(this, 8);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        mi miVar = chatAttachAlertPhotoLayout.b;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        if (this.b || (!chatAttachAlertPhotoLayout.a0 && chatAttachAlertPhotoLayout.V)) {
            super.dispatchDraw(canvas);
            return;
        }
        float translationY = (miVar.getContainerView().getTranslationY() + (miVar.D0[1] + chatAttachAlertPhotoLayout.T0)) - chatAttachAlertPhotoLayout.M.getTranslationY();
        zh zhVar = miVar.y2;
        int min = (int) Math.min(translationY - (zhVar != null ? zhVar.d() + AndroidUtilities.dp(8.0f) : 0.0f), getMeasuredHeight());
        boolean z4 = chatAttachAlertPhotoLayout.a0;
        if (z4) {
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = chatAttachAlertPhotoLayout.k1;
            boolean z10 = ChatAttachAlertPhotoLayout.n1;
            float f11 = 1.0f - chatAttachAlertPhotoLayout.b0;
            rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.T) + chatAttachAlertPhotoLayout.h1, chatAttachAlertPhotoLayout.j1, AndroidUtilities.lerp(Math.min(min, chatAttachAlertPhotoLayout.i1), getMeasuredHeight(), chatAttachAlertPhotoLayout.b0));
        } else {
            if (!z4 && !chatAttachAlertPhotoLayout.V) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                boolean z11 = ChatAttachAlertPhotoLayout.n1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.T, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
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
        ic.a(chatAttachAlertPhotoLayout.M, this.a);
        chatAttachAlertPhotoLayout.B.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this.c.M);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.c.B.invalidate();
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void showTexture(boolean z4, boolean z10) {
        super.showTexture(z4, z10);
        this.c.B.invalidate();
    }
}
