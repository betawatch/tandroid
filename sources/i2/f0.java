package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.h10;
import yh.v5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                fVar.q(p5, 1033, new ga.a(p5, i10, i11, this.b));
                break;
            case 1:
                ((pf0) this.d).a.b.x3(this.c, this.b);
                break;
            case 2:
                ym0 ym0Var = (ym0) this.d;
                ym0Var.o = null;
                ym0Var.c(this.c, this.b, true);
                break;
            case 3:
                vc a02 = vc.a0((h10) this.d);
                boolean z10 = this.b;
                int i12 = z10 ? R.raw.folder_in : R.raw.folder_out;
                int i13 = this.c;
                oc M = a02.M(z10 ? LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i12);
                M.j = 5000;
                M.j();
                break;
            default:
                v5 v5Var = (v5) this.d;
                if (!this.b) {
                    v5Var.getClass();
                    break;
                } else {
                    Set set = v5Var.Q;
                    int i14 = this.c;
                    set.remove(Integer.valueOf(i14));
                    Runnable runnable = (Runnable) v5Var.R.remove(Integer.valueOf(i14));
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
