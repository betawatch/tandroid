// default package

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class d20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i30 b;
    public final /* synthetic */ bu5 c;

    public /* synthetic */ d20(i30 i30Var, bu5 bu5Var, byte b) {
        this.a = b;
        this.b = i30Var;
        this.c = bu5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bu5 bu5Var = this.c;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                bu5Var.u();
                i30Var.J0(1);
                break;
            case 1:
                bu5Var.u();
                i30Var.J0(2);
                break;
            case 2:
                bu5Var.u();
                i30Var.J0(4);
                break;
            case 3:
                bu5Var.u();
                i30Var.J0(7);
                break;
            default:
                i30Var.O0(true);
                ts2.u(null, 2131753877, new c41((FrameLayout) i30Var.b, i30Var.J0), R.raw.saved_messages, 36);
                bu5Var.u();
                break;
        }
    }
}
