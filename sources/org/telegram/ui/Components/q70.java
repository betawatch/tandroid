package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class q70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y70 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ q70(y70 y70Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = y70Var;
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
                y70 y70Var = this.b;
                if (y70Var.J) {
                    y70Var.u();
                    break;
                }
                break;
            case 2:
                y70 y70Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    y70Var2.getClass();
                    break;
                } else {
                    int i10 = -y70Var2.K;
                    y70Var2.K = i10;
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
                y70 y70Var3 = this.b;
                if (y70Var3.J) {
                    y70Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                y70 y70Var4 = this.b;
                if (y70Var4.J) {
                    y70Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                y70 y70Var5 = this.b;
                if (y70Var5.J) {
                    y70Var5.u();
                    break;
                }
                break;
        }
    }
}
