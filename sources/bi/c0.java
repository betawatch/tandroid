package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.n80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.l3 b;

    public /* synthetic */ c0(hi.l3 l3Var, int i7) {
        this.a = i7;
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
                this.b.A();
                break;
            default:
                this.b.getClass();
                break;
        }
    }

    public /* synthetic */ c0(hi.l3 l3Var, n80 n80Var, ClickableSpan clickableSpan) {
        this.a = 4;
        this.b = l3Var;
    }
}
