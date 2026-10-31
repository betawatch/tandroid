package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yl extends CameraView {
    public final k7 a;
    public boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.c = chatAttachAlertPhotoLayout;
        this.a = new k7(this, 2);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (org.telegram.messenger.i0.m0) {
            return;
        }
        if (this.b || (!chatAttachAlertPhotoLayout.d0 && chatAttachAlertPhotoLayout.b0)) {
            super.dispatchDraw(canvas);
            return;
        }
        float translationY = (biVar.b.getTranslationY() + (biVar.A2[1] + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY();
        oh ohVar = biVar.y4;
        int min = (int) Math.min(translationY - (ohVar != null ? ohVar.d() + org.telegram.messenger.i0.L(8.0f) : 0.0f), getMeasuredHeight());
        boolean z10 = chatAttachAlertPhotoLayout.d0;
        if (z10) {
            RectF rectF = org.telegram.messenger.i0.P;
            float f7 = chatAttachAlertPhotoLayout.n1;
            boolean z11 = ChatAttachAlertPhotoLayout.q1;
            float f10 = 1.0f - chatAttachAlertPhotoLayout.e0;
            rectF.set((0.0f * f10) + f7, (f10 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.k1, chatAttachAlertPhotoLayout.m1, org.telegram.messenger.i0.T1(Math.min(min, chatAttachAlertPhotoLayout.l1), getMeasuredHeight(), chatAttachAlertPhotoLayout.e0));
        } else {
            if (!z10 && !chatAttachAlertPhotoLayout.b0) {
                RectF rectF2 = org.telegram.messenger.i0.P;
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.W, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
                return;
            }
            org.telegram.messenger.i0.P.set(0.0f, 0.0f, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
        }
        canvas.save();
        canvas.clipRect(org.telegram.messenger.i0.P);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        wb.a(chatAttachAlertPhotoLayout.P, this.a);
        chatAttachAlertPhotoLayout.E.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wb.h(this.c.P);
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
