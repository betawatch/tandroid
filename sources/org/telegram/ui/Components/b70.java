package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j70 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ b70(j70 j70Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = j70Var;
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
                j70 j70Var = this.b;
                if (j70Var.J) {
                    j70Var.u();
                    break;
                }
                break;
            case 2:
                j70 j70Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    j70Var2.getClass();
                    break;
                } else {
                    int i10 = -j70Var2.K;
                    j70Var2.K = i10;
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
                j70 j70Var3 = this.b;
                if (j70Var3.J) {
                    j70Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                j70 j70Var4 = this.b;
                if (j70Var4.J) {
                    j70Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                j70 j70Var5 = this.b;
                if (j70Var5.J) {
                    j70Var5.u();
                    break;
                }
                break;
        }
    }
}
