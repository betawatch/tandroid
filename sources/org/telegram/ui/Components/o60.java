package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x60 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ o60(x60 x60Var, Runnable runnable, int i9) {
        this.a = i9;
        this.b = x60Var;
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
                x60 x60Var = this.b;
                if (x60Var.J) {
                    x60Var.u();
                    break;
                }
                break;
            case 2:
                x60 x60Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    x60Var2.getClass();
                    break;
                } else {
                    int i9 = -x60Var2.K;
                    x60Var2.K = i9;
                    AndroidUtilities.shakeViewSpring(view, i9);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    runnable2.run();
                    break;
                }
            case 3:
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                x60 x60Var3 = this.b;
                if (x60Var3.J) {
                    x60Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                x60 x60Var4 = this.b;
                if (x60Var4.J) {
                    x60Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                x60 x60Var5 = this.b;
                if (x60Var5.J) {
                    x60Var5.u();
                    break;
                }
                break;
        }
    }
}
