package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ t60(b70 b70Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = b70Var;
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
                b70 b70Var = this.b;
                if (b70Var.J) {
                    b70Var.u();
                    break;
                }
                break;
            case 2:
                b70 b70Var2 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    b70Var2.getClass();
                    break;
                } else {
                    int i10 = -b70Var2.K;
                    b70Var2.K = i10;
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
                b70 b70Var3 = this.b;
                if (b70Var3.J) {
                    b70Var3.u();
                    break;
                }
                break;
            case 4:
                this.c.run();
                b70 b70Var4 = this.b;
                if (b70Var4.J) {
                    b70Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                b70 b70Var5 = this.b;
                if (b70Var5.J) {
                    b70Var5.u();
                    break;
                }
                break;
        }
    }
}
