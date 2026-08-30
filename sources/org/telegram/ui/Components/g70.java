package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o70 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ g70(o70 o70Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = o70Var;
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
                o70 o70Var = this.b;
                if (o70Var.J) {
                    o70Var.u();
                    break;
                }
                break;
            case 2:
                o70 o70Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    o70Var2.getClass();
                    break;
                } else {
                    int i10 = -o70Var2.K;
                    o70Var2.K = i10;
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
                o70 o70Var3 = this.b;
                if (o70Var3.J) {
                    o70Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                o70 o70Var4 = this.b;
                if (o70Var4.J) {
                    o70Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                o70 o70Var5 = this.b;
                if (o70Var5.J) {
                    o70Var5.u();
                    break;
                }
                break;
        }
    }
}
