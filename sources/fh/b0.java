package fh;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kh.x3 b;

    public /* synthetic */ b0(kh.x3 x3Var, int i9) {
        this.a = i9;
        this.b = x3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.removeFromParent(this.b);
                break;
            case 1:
                AndroidUtilities.removeFromParent(this.b);
                break;
            case 2:
                AndroidUtilities.removeFromParent(this.b);
                break;
            default:
                this.b.getClass();
                break;
        }
    }

    public /* synthetic */ b0(kh.x3 x3Var, m80 m80Var, ClickableSpan clickableSpan) {
        this.a = 3;
        this.b = x3Var;
    }
}
