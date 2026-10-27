package fi;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements o1.f {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ q3(View view, float f7, Runnable runnable) {
        this.b = runnable;
        this.d = view;
        this.c = f7;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                s3 s3Var = (s3) this.d;
                r3 r3Var = s3Var.b;
                if (!z10) {
                    r3Var.setTranslationY(this.c);
                    r3Var.K = false;
                    s3Var.d = null;
                    s3Var.e = null;
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.lambda$shakeViewSpring$14(this.b, (View) this.d, this.c, hVar, z10, f7, f10);
                break;
        }
    }

    public /* synthetic */ q3(s3 s3Var, float f7, Runnable runnable) {
        this.d = s3Var;
        this.c = f7;
        this.b = runnable;
    }
}
