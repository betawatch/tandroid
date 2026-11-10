package fi;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ a1(b1 b1Var, int i7) {
        this.a = i7;
        this.b = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b1 b1Var = this.b;
                if (b1Var.K > 0) {
                    b1Var.dualToggleShape();
                    try {
                        b1Var.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                b1 b1Var2 = this.b;
                b1Var2.focusToPoint((int) b1Var2.I, (int) b1Var2.J);
                break;
        }
    }
}
