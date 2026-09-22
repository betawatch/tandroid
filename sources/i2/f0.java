package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.f10;
import yh.u5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(Object obj, int i10, boolean z10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = i10;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.d;
                j2.f fVar = o0Var.M;
                n1[] n1VarArr = o0Var.a;
                int i10 = this.c;
                int i11 = n1VarArr[i10].a.b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new hg.r(p5, i10, i11, this.b));
                break;
            case 1:
                ((pf0) this.d).a.b.x3(this.c, this.b);
                break;
            case 2:
                xm0 xm0Var = (xm0) this.d;
                xm0Var.o = null;
                xm0Var.c(this.c, this.b, true);
                break;
            case 3:
                vc a02 = vc.a0((f10) this.d);
                boolean z10 = this.b;
                int i12 = z10 ? R.raw.folder_in : R.raw.folder_out;
                int i13 = this.c;
                oc M = a02.M(z10 ? LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i12);
                M.j = 5000;
                M.j();
                break;
            default:
                u5 u5Var = (u5) this.d;
                if (!this.b) {
                    u5Var.getClass();
                    break;
                } else {
                    Set set = u5Var.Q;
                    int i14 = this.c;
                    set.remove(Integer.valueOf(i14));
                    Runnable runnable = (Runnable) u5Var.R.remove(Integer.valueOf(i14));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f0(Object obj, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = z10;
        this.c = i10;
    }
}
