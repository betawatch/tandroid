// default package

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class e26 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public boolean c;
    public final Object d;

    public e26(LaunchActivity launchActivity, boolean z) {
        this.d = new WeakReference(launchActivity);
    }

    public final void a() {
        switch (this.a) {
            case 0:
                b(false);
                this.c = true;
                break;
            default:
                b(false);
                this.c = true;
                break;
        }
    }

    public final void b(boolean z) {
        int i;
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (this.b != z && !this.c) {
                    this.b = z;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) obj).get();
                    if (launchActivity != null) {
                        String str = LaunchActivity.C1;
                        int i2 = launchActivity.B1 + (z ? 1 : -1);
                        launchActivity.B1 = i2;
                        d26 d26Var = launchActivity.v0;
                        if (d26Var != null) {
                            d26Var.setVisibility(i2 <= 0 ? 0 : 8);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
            default:
                if (this.b != z && !this.c) {
                    this.b = z;
                    cdc cdcVar = (cdc) obj;
                    if (z) {
                        i = cdcVar.b + 1;
                        cdcVar.b = i;
                    } else {
                        i = cdcVar.b - 1;
                        cdcVar.b = i;
                    }
                    boolean z2 = i > 0;
                    if (cdcVar.a != z2) {
                        cdcVar.a = z2;
                        Window window = (Window) ((WeakReference) ((ftb) cdcVar.c).b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z2 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public e26(cdc cdcVar) {
        this.d = cdcVar;
    }
}
