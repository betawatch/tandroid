package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p80 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ h80(p80 p80Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = p80Var;
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
                p80 p80Var = this.b;
                if (p80Var.J) {
                    p80Var.u();
                    break;
                }
                break;
            case 2:
                p80 p80Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    p80Var2.getClass();
                    break;
                } else {
                    int i10 = -p80Var2.K;
                    p80Var2.K = i10;
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
                p80 p80Var3 = this.b;
                if (p80Var3.J) {
                    p80Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                p80 p80Var4 = this.b;
                if (p80Var4.J) {
                    p80Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                p80 p80Var5 = this.b;
                if (p80Var5.J) {
                    p80Var5.u();
                    break;
                }
                break;
        }
    }
}
