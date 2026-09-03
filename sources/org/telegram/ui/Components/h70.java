package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p70 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ h70(p70 p70Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = p70Var;
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
                p70 p70Var = this.b;
                if (p70Var.J) {
                    p70Var.u();
                    break;
                }
                break;
            case 2:
                p70 p70Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    p70Var2.getClass();
                    break;
                } else {
                    int i10 = -p70Var2.K;
                    p70Var2.K = i10;
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
                p70 p70Var3 = this.b;
                if (p70Var3.J) {
                    p70Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                p70 p70Var4 = this.b;
                if (p70Var4.J) {
                    p70Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                p70 p70Var5 = this.b;
                if (p70Var5.J) {
                    p70Var5.u();
                    break;
                }
                break;
        }
    }
}
