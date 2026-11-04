package ai;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.t70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi.l3 b;

    public /* synthetic */ i0(gi.l3 l3Var, int i3) {
        this.a = i3;
        this.b = l3Var;
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
                org.telegram.messenger.g0.E2(this.b);
                break;
            case 3:
                this.b.z();
                break;
            default:
                this.b.getClass();
                break;
        }
    }

    public /* synthetic */ i0(gi.l3 l3Var, t70 t70Var, ClickableSpan clickableSpan) {
        this.a = 4;
        this.b = l3Var;
    }
}
