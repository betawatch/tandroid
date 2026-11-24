// default package

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a26 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public boolean c;
    public final Object d;

    public a26(LaunchActivity launchActivity, boolean z) {
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
                        yd ydVar = launchActivity.v0;
                        if (ydVar != null) {
                            ydVar.setVisibility(i2 <= 0 ? 0 : 8);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
            default:
                if (this.b != z && !this.c) {
                    this.b = z;
                    dbc dbcVar = (dbc) obj;
                    if (z) {
                        i = dbcVar.b + 1;
                        dbcVar.b = i;
                    } else {
                        i = dbcVar.b - 1;
                        dbcVar.b = i;
                    }
                    boolean z2 = i > 0;
                    if (dbcVar.a != z2) {
                        dbcVar.a = z2;
                        Window window = (Window) ((WeakReference) ((lcc) dbcVar.c).b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z2 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public a26(dbc dbcVar) {
        this.d = dbcVar;
    }
}
