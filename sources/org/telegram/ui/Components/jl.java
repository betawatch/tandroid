package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class jl extends pj0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ ChatAttachAlertPhotoLayout f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.e3 = i7;
        this.f3 = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.f3.b.V3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.e3) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.f3.b.V3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.e3) {
            case 0:
                if (!this.f3.J0) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }
}
