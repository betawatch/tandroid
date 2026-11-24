// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d62 extends r59 {
    public final /* synthetic */ byte f3;
    public final /* synthetic */ ChatAttachAlertPhotoLayout g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.f3 = b;
        this.g3 = chatAttachAlertPhotoLayout;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.g3.b.Y3[0] - gm.L(80.0f)) {
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.f3) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer.r0().r();
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.g3.b.Y3[0] - gm.L(80.0f)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
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
