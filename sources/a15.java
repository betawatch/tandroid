// default package

import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
