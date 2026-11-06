package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.x70;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
