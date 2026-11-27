// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bz0 extends uy9 {
    public final /* synthetic */ byte n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(Context context, rpb rpbVar) {
        super(rpbVar, context, false);
        this.n0 = (byte) 3;
    }

    @Override // uy9, android.view.View
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
    public /* synthetic */ bz0(Context context, boolean z, vnb vnbVar, byte b) {
        super(vnbVar, context, z);
        this.n0 = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz0(Context context) {
        super(context);
        this.n0 = (byte) 1;
    }
}
