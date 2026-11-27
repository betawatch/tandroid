// default package

import android.view.Choreographer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class nu8 {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new jr4(runnable, (byte) 2));
    }
}
