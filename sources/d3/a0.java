package d3;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class a0 implements DisplayManager.DisplayListener {
    public final Choreographer a;
    public final DisplayManager b;
    public volatile long c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public a0(Choreographer choreographer, DisplayManager displayManager) {
        this.a = choreographer;
        this.b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }
}
