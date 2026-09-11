package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n70 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ f70(n70 n70Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = n70Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.u();
                Runnable runnable = this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                this.c.run();
                n70 n70Var = this.b;
                if (n70Var.J) {
                    n70Var.u();
                    break;
                }
                break;
            case 2:
                n70 n70Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    n70Var2.getClass();
                    break;
                } else {
                    int i10 = -n70Var2.K;
                    n70Var2.K = i10;
                    AndroidUtilities.shakeViewSpring(view, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    break;
                }
            case 3:
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                n70 n70Var3 = this.b;
                if (n70Var3.J) {
                    n70Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                n70 n70Var4 = this.b;
                if (n70Var4.J) {
                    n70Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                n70 n70Var5 = this.b;
                if (n70Var5.J) {
                    n70Var5.u();
                    break;
                }
                break;
        }
    }
}
