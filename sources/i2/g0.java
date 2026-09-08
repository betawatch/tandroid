package i2;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.f10;
import zh.s5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                o0 o0Var = (o0) this.d;
                j2.f fVar = o0Var.M;
                n1[] n1VarArr = o0Var.a;
                int i10 = this.c;
                int i11 = n1VarArr[i10].a.b;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1033, new i0.b(p5, i10, i11, this.b));
                break;
            case 1:
                ((pf0) this.d).a.b.y3(this.c, this.b);
                break;
            case 2:
                xm0 xm0Var = (xm0) this.d;
                xm0Var.o = null;
                xm0Var.c(this.c, this.b, true);
                break;
            case 3:
                yc a02 = yc.a0((f10) this.d);
                boolean z10 = this.b;
                int i12 = z10 ? R.raw.folder_in : R.raw.folder_out;
                int i13 = this.c;
                qc M = a02.M(z10 ? LocaleController.formatPluralString("FolderLinkAddedChats", i13, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i13, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i12);
                M.j = 5000;
                M.j();
                break;
            default:
                s5 s5Var = (s5) this.d;
                if (!this.b) {
                    s5Var.getClass();
                    break;
                } else {
                    Set set = s5Var.Q;
                    int i14 = this.c;
                    set.remove(Integer.valueOf(i14));
                    Runnable runnable = (Runnable) s5Var.R.remove(Integer.valueOf(i14));
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
