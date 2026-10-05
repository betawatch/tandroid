package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b80 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ t70(b80 b80Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = b80Var;
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
                b80 b80Var = this.b;
                if (b80Var.J) {
                    b80Var.u();
                    break;
                }
                break;
            case 2:
                b80 b80Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    b80Var2.getClass();
                    break;
                } else {
                    int i10 = -b80Var2.K;
                    b80Var2.K = i10;
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
                b80 b80Var3 = this.b;
                if (b80Var3.J) {
                    b80Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                b80 b80Var4 = this.b;
                if (b80Var4.J) {
                    b80Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                b80 b80Var5 = this.b;
                if (b80Var5.J) {
                    b80Var5.u();
                    break;
                }
                break;
        }
    }
}
