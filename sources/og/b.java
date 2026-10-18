package og;

import org.telegram.ui.sn;
import org.telegram.ui.te1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ b(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                if (snVar.getParentLayout() != null) {
                    te1.I0(snVar);
                    break;
                }
                break;
            default:
                this.b.cc();
                break;
        }
    }
}
