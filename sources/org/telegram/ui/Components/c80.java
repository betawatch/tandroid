package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k80 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ c80(k80 k80Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = k80Var;
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
                k80 k80Var = this.b;
                if (k80Var.J) {
                    k80Var.u();
                    break;
                }
                break;
            case 2:
                k80 k80Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    k80Var2.getClass();
                    break;
                } else {
                    int i10 = -k80Var2.K;
                    k80Var2.K = i10;
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
                k80 k80Var3 = this.b;
                if (k80Var3.J) {
                    k80Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                k80 k80Var4 = this.b;
                if (k80Var4.J) {
                    k80Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                k80 k80Var5 = this.b;
                if (k80Var5.J) {
                    k80Var5.u();
                    break;
                }
                break;
        }
    }
}
