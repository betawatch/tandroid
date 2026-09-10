package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class o70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w70 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ o70(w70 w70Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = w70Var;
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
                w70 w70Var = this.b;
                if (w70Var.J) {
                    w70Var.u();
                    break;
                }
                break;
            case 2:
                w70 w70Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    w70Var2.getClass();
                    break;
                } else {
                    int i10 = -w70Var2.K;
                    w70Var2.K = i10;
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
                w70 w70Var3 = this.b;
                if (w70Var3.J) {
                    w70Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                w70 w70Var4 = this.b;
                if (w70Var4.J) {
                    w70Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                w70 w70Var5 = this.b;
                if (w70Var5.J) {
                    w70Var5.u();
                    break;
                }
                break;
        }
    }
}
