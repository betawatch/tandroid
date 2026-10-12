package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m80 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ e80(m80 m80Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = m80Var;
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
                m80 m80Var = this.b;
                if (m80Var.J) {
                    m80Var.u();
                    break;
                }
                break;
            case 2:
                m80 m80Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    m80Var2.getClass();
                    break;
                } else {
                    int i10 = -m80Var2.K;
                    m80Var2.K = i10;
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
                m80 m80Var3 = this.b;
                if (m80Var3.J) {
                    m80Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                m80 m80Var4 = this.b;
                if (m80Var4.J) {
                    m80Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                m80 m80Var5 = this.b;
                if (m80Var5.J) {
                    m80Var5.u();
                    break;
                }
                break;
        }
    }
}
