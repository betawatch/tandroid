package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ql extends uj0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ ChatAttachAlertPhotoLayout g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f3 = i7;
        this.g3 = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.g3.b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f3) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer.p1().r0();
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.g3.b.Z3[0] - org.telegram.messenger.g0.L(80.0f)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.f3) {
            case 0:
                if (!this.g3.K0) {
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
