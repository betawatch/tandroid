package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q70 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ i70(q70 q70Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = q70Var;
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
                q70 q70Var = this.b;
                if (q70Var.J) {
                    q70Var.u();
                    break;
                }
                break;
            case 2:
                q70 q70Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    q70Var2.getClass();
                    break;
                } else {
                    int i10 = -q70Var2.K;
                    q70Var2.K = i10;
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
                q70 q70Var3 = this.b;
                if (q70Var3.J) {
                    q70Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                q70 q70Var4 = this.b;
                if (q70Var4.J) {
                    q70Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                q70 q70Var5 = this.b;
                if (q70Var5.J) {
                    q70Var5.u();
                    break;
                }
                break;
        }
    }
}
