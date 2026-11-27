// default package

import android.view.Choreographer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class nu8 {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new jr4(runnable, (byte) 2));
    }
}
