package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xl extends CameraView {
    public final bi.e1 a;
    public boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10, boolean z11) {
        super(context, z10, z11);
        this.c = chatAttachAlertPhotoLayout;
        this.a = new bi.e1(this, 8);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (org.telegram.messenger.g0.m0) {
            return;
        }
        if (this.b || (!chatAttachAlertPhotoLayout.e0 && chatAttachAlertPhotoLayout.c0)) {
            super.dispatchDraw(canvas);
            return;
        }
        float translationY = (kiVar.b.getTranslationY() + (kiVar.E2[1] + chatAttachAlertPhotoLayout.X0)) - chatAttachAlertPhotoLayout.Q.getTranslationY();
        hi.i iVar = kiVar.C4;
        int min = (int) Math.min(translationY - (iVar != null ? iVar.d() + org.telegram.messenger.g0.L(8.0f) : 0.0f), getMeasuredHeight());
        boolean z10 = chatAttachAlertPhotoLayout.e0;
        if (z10) {
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = chatAttachAlertPhotoLayout.o1;
            boolean z11 = ChatAttachAlertPhotoLayout.r1;
            float f11 = 1.0f - chatAttachAlertPhotoLayout.f0;
            rectF.set((0.0f * f11) + f10, (f11 * chatAttachAlertPhotoLayout.a0) + chatAttachAlertPhotoLayout.l1, chatAttachAlertPhotoLayout.n1, org.telegram.messenger.g0.T1(Math.min(min, chatAttachAlertPhotoLayout.m1), getMeasuredHeight(), chatAttachAlertPhotoLayout.f0));
        } else {
            if (!z10 && !chatAttachAlertPhotoLayout.c0) {
                RectF rectF2 = org.telegram.messenger.g0.P;
                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                rectF2.set(0.0f, chatAttachAlertPhotoLayout.a0, getMeasuredWidth(), Math.min(min, getMeasuredHeight()));
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
        xb.a(chatAttachAlertPhotoLayout.Q, this.a);
        chatAttachAlertPhotoLayout.F.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xb.h(this.c.Q);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.c.F.invalidate();
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void showTexture(boolean z10, boolean z11) {
        super.showTexture(z10, z11);
        this.c.F.invalidate();
    }
}
