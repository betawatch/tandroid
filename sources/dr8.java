// default package

import android.view.Choreographer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class dr8 {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new fp4(runnable, (byte) 2));
    }
}
