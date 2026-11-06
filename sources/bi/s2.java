package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.x70;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.m3 b;

    public /* synthetic */ s2(fi.m3 m3Var, int i7) {
        this.a = i7;
        this.b = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.E2(this.b);
                break;
            case 1:
                org.telegram.messenger.g0.E2(this.b);
                break;
            case 2:
                this.b.z();
                break;
            case 3:
                this.b.getClass();
                break;
            default:
                org.telegram.messenger.g0.E2(this.b);
                break;
        }
    }

    public /* synthetic */ s2(fi.m3 m3Var, x70 x70Var, ClickableSpan clickableSpan) {
        this.a = 3;
        this.b = m3Var;
    }
}
