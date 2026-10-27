package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l80 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ d80(l80 l80Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = l80Var;
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
                l80 l80Var = this.b;
                if (l80Var.J) {
                    l80Var.u();
                    break;
                }
                break;
            case 2:
                l80 l80Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    l80Var2.getClass();
                    break;
                } else {
                    int i10 = -l80Var2.K;
                    l80Var2.K = i10;
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
                l80 l80Var3 = this.b;
                if (l80Var3.J) {
                    l80Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                l80 l80Var4 = this.b;
                if (l80Var4.J) {
                    l80Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                l80 l80Var5 = this.b;
                if (l80Var5.J) {
                    l80Var5.u();
                    break;
                }
                break;
        }
    }
}
