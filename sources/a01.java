// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a01 extends dx9 {
    public final /* synthetic */ byte n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a01(Context context, tnb tnbVar) {
        super(tnbVar, context, false);
        this.n0 = (byte) 3;
    }

    @Override // dx9, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.n0) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 1:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 2:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
        }
        return d(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a01(Context context, boolean z, ylb ylbVar, byte b) {
        super(ylbVar, context, z);
        this.n0 = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a01(Context context) {
        super(context);
        this.n0 = (byte) 1;
    }
}
