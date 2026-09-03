package lh;

import android.text.style.ClickableSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h90;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh.e3 b;

    public /* synthetic */ w(qh.e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
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

    public /* synthetic */ w(qh.e3 e3Var, h90 h90Var, ClickableSpan clickableSpan) {
        this.a = 3;
        this.b = e3Var;
    }
}
