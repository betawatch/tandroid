package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.f10;
import yh.u5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g0(Object obj, int i10, boolean z10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = i10;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.d;
                j2.f fVar = p0Var.M;
                o1[] o1VarArr = p0Var.a;
                int i10 = this.c;
                int i11 = o1VarArr[i10].a.b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new ga.a(p5, i10, i11, this.b));
                break;
            case 1:
                ((cg0) this.d).a.b.y3(this.c, this.b);
                break;
            case 2:
                qn0 qn0Var = (qn0) this.d;
                qn0Var.o = null;
                qn0Var.c(this.c, this.b, true);
                break;
            case 3:
                yc a02 = yc.a0((f10) this.d);
                boolean z10 = this.b;
                int i12 = z10 ? R.raw.folder_in : R.raw.folder_out;
                int i13 = this.c;
                rc M = a02.M(z10 ? LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i12);
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

    public /* synthetic */ g0(Object obj, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = z10;
        this.c = i10;
    }
}
