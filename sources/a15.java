// default package

import android.view.MotionEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a15 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tt b;

    public /* synthetic */ a15(tt ttVar, byte b) {
        this.a = b;
        this.b = ttVar;
    }

    public final Boolean a(MotionEvent motionEvent) {
        byte b = this.a;
        tt ttVar = this.b;
        switch (b) {
            case 0:
                return ttVar.c(motionEvent);
            default:
                return ttVar.d(motionEvent);
        }
    }
}
