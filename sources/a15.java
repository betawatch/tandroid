// default package

import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
