package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;
    public final /* synthetic */ y60 c;

    public /* synthetic */ e7(g8 g8Var, y60 y60Var, int i7) {
        this.a = i7;
        this.b = g8Var;
        this.c = y60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        y60 y60Var = this.c;
        g8 g8Var = this.b;
        switch (i7) {
            case 0:
                g8Var.getClass();
                y60Var.v();
                g8Var.Q0(1);
                break;
            case 1:
                g8Var.getClass();
                y60Var.v();
                g8Var.Q0(2);
                break;
            case 2:
                g8Var.getClass();
                y60Var.v();
                g8Var.Q0(4);
                break;
            case 3:
                g8Var.getClass();
                y60Var.v();
                g8Var.Q0(7);
                break;
            default:
                g8Var.V0(true);
                org.telegram.messenger.f3.n(null, 2131753910, new lc((FrameLayout) g8Var.b, g8Var.J0), R.raw.saved_messages, 36);
                y60Var.v();
                break;
        }
    }
}
