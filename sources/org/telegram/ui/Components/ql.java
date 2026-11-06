package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ql extends CameraView {
    public final ch.v a;
    public boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z9, boolean z10) {
        super(context, z9, z10);
        this.c = chatAttachAlertPhotoLayout;
        this.a = new ch.v(this, 7);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        di diVar = chatAttachAlertPhotoLayout.b;
        if (org.telegram.messenger.g0.m0) {
            return;
        }
        if (this.b || (!chatAttachAlertPhotoLayout.d0 && chatAttachAlertPhotoLayout.b0)) {
            super.dispatchDraw(canvas);
            return;
        }
        float translationY = (diVar.b.getTranslationY() + (diVar.A2[1] + chatAttachAlertPhotoLayout.W0)) - chatAttachAlertPhotoLayout.P.getTranslationY();
        fi.i iVar = diVar.y4;
        int min = (int) Math.min(translationY - (iVar != null ? iVar.d() + org.telegram.messenger.g0.L(8.0f) : 0.0f), getMeasuredHeight());
        boolean z9 = chatAttachAlertPhotoLayout.d0;
        if (z9) {
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = chatAttachAlertPhotoLayout.n1;
            boolean z10 = ChatAttachAlertPhotoLayout.q1;
            float f11 = 1.0f - chatAttachAlertPhotoLayout.e0;
            rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.W) + chatAttachAlertPhotoLayout.k1, chatAttachAlertPhotoLayout.m1, org.telegram.messenger.g0.T1(Math.min(min, chatAttachAlertPhotoLayout.l1), getMeasuredHeight(), chatAttachAlertPhotoLayout.e0));
        } else {
            if (!z9 && !chatAttachAlertPhotoLayout.b0) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.W, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
                return;
            }
            org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
        }
        canvas.save();
        canvas.clipRect(org.telegram.messenger.g0.P);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        cc.a(chatAttachAlertPhotoLayout.P, this.a);
        chatAttachAlertPhotoLayout.E.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cc.h(this.c.P);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.c.E.invalidate();
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void showTexture(boolean z9, boolean z10) {
        super.showTexture(z9, z10);
        this.c.E.invalidate();
    }
}
