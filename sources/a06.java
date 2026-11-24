// default package

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class a06 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public boolean c;
    public final Object d;

    public a06(LaunchActivity launchActivity, boolean z) {
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
                        yc ycVar = launchActivity.v0;
                        if (ycVar != null) {
                            ycVar.setVisibility(i2 <= 0 ? 0 : 8);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
            default:
                if (this.b != z && !this.c) {
                    this.b = z;
                    c9c c9cVar = (c9c) obj;
                    if (z) {
                        i = c9cVar.b + 1;
                        c9cVar.b = i;
                    } else {
                        i = c9cVar.b - 1;
                        c9cVar.b = i;
                    }
                    boolean z2 = i > 0;
                    if (c9cVar.a != z2) {
                        c9cVar.a = z2;
                        Window window = (Window) ((WeakReference) ((dkc) c9cVar.c).b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z2 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public a06(c9c c9cVar) {
        this.d = c9cVar;
    }
}
