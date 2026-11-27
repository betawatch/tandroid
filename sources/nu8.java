// default package

import android.view.Choreographer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class nu8 {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new jr4(runnable, (byte) 2));
    }
}
