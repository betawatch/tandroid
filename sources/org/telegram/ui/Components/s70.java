package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a80 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ s70(a80 a80Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = a80Var;
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
                a80 a80Var = this.b;
                if (a80Var.J) {
                    a80Var.u();
                    break;
                }
                break;
            case 2:
                a80 a80Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    a80Var2.getClass();
                    break;
                } else {
                    int i10 = -a80Var2.K;
                    a80Var2.K = i10;
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
                a80 a80Var3 = this.b;
                if (a80Var3.J) {
                    a80Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                a80 a80Var4 = this.b;
                if (a80Var4.J) {
                    a80Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                a80 a80Var5 = this.b;
                if (a80Var5.J) {
                    a80Var5.u();
                    break;
                }
                break;
        }
    }
}
