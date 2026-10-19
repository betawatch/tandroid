package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i80 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ z70(i80 i80Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = i80Var;
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
                i80 i80Var = this.b;
                if (i80Var.J) {
                    i80Var.u();
                    break;
                }
                break;
            case 2:
                i80 i80Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    i80Var2.getClass();
                    break;
                } else {
                    int i10 = -i80Var2.K;
                    i80Var2.K = i10;
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
                i80 i80Var3 = this.b;
                if (i80Var3.J) {
                    i80Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                i80 i80Var4 = this.b;
                if (i80Var4.J) {
                    i80Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                i80 i80Var5 = this.b;
                if (i80Var5.J) {
                    i80Var5.u();
                    break;
                }
                break;
        }
    }
}
