package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;
    public final /* synthetic */ ai.y1 c;

    public /* synthetic */ u2(y2 y2Var, ai.y1 y1Var, int i10) {
        this.a = i10;
        this.b = y2Var;
        this.c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                y2Var.getClass();
                AndroidUtilities.runOnUIThread(new u2(y2Var, this.c, 1), 320L);
                break;
            default:
                y2 y2Var2 = this.b;
                y2Var2.getClass();
                this.c.run(new ai.y1(y2Var2, 8));
                break;
        }
    }
}
