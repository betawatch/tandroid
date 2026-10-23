package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j80 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ b80(j80 j80Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = j80Var;
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
                j80 j80Var = this.b;
                if (j80Var.J) {
                    j80Var.u();
                    break;
                }
                break;
            case 2:
                j80 j80Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    j80Var2.getClass();
                    break;
                } else {
                    int i10 = -j80Var2.K;
                    j80Var2.K = i10;
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
                j80 j80Var3 = this.b;
                if (j80Var3.J) {
                    j80Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                j80 j80Var4 = this.b;
                if (j80Var4.J) {
                    j80Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                j80 j80Var5 = this.b;
                if (j80Var5.J) {
                    j80Var5.u();
                    break;
                }
                break;
        }
    }
}
