package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ qa b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ pa(qa qaVar, Runnable runnable, boolean z10) {
        this.b = qaVar;
        this.c = runnable;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(this.c, this.d);
                break;
            default:
                this.c.run();
                vb vbVar = this.b.a;
                v3 v3Var = vbVar.T0;
                v3Var.a.t(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                v3Var.invalidate();
                vbVar.g(true, true);
                vbVar.c0(true);
                vbVar.I0.a(false, true);
                vbVar.J0.b(true, true);
                vbVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ pa(qa qaVar, boolean z10, Runnable runnable) {
        this.b = qaVar;
        this.d = z10;
        this.c = runnable;
    }
}
