package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.a80;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                this.b.z();
                break;
            default:
                this.b.getClass();
                break;
        }
    }

    public /* synthetic */ c0(hi.l3 l3Var, a80 a80Var, ClickableSpan clickableSpan) {
        this.a = 4;
        this.b = l3Var;
    }
}
