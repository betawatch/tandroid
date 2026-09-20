package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class n70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v70 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ n70(v70 v70Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = v70Var;
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
                v70 v70Var = this.b;
                if (v70Var.J) {
                    v70Var.u();
                    break;
                }
                break;
            case 2:
                v70 v70Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    v70Var2.getClass();
                    break;
                } else {
                    int i10 = -v70Var2.K;
                    v70Var2.K = i10;
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
                v70 v70Var3 = this.b;
                if (v70Var3.J) {
                    v70Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                v70 v70Var4 = this.b;
                if (v70Var4.J) {
                    v70Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                v70 v70Var5 = this.b;
                if (v70Var5.J) {
                    v70Var5.u();
                    break;
                }
                break;
        }
    }
}
