package kh;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f90;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph.f3 b;

    public /* synthetic */ w(ph.f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
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

    public /* synthetic */ w(ph.f3 f3Var, f90 f90Var, ClickableSpan clickableSpan) {
        this.a = 3;
        this.b = f3Var;
    }
}
