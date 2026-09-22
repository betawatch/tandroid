package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tl extends ll0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ ChatAttachAlertPhotoLayout Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.X2 = i10;
        this.Y2 = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.Y2.b.b2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.Y2.b.b2[0] - AndroidUtilities.dp(80.0f)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.X2) {
            case 0:
                if (!this.Y2.J0) {
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
