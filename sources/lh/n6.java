package lh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.b10;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n6(Object obj, boolean z4, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = z4;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t7 t7Var = (t7) this.d;
                if (!this.b) {
                    t7Var.getClass();
                    break;
                } else {
                    Set set = t7Var.Q;
                    int i10 = this.c;
                    set.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) t7Var.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                ((uf0) this.d).a.b.y3(this.c, this.b);
                break;
            case 2:
                fn0 fn0Var = (fn0) this.d;
                fn0Var.o = null;
                fn0Var.c(this.c, this.b, true);
                break;
            default:
                qc a02 = qc.a0((b10) this.d);
                boolean z4 = this.b;
                int i11 = z4 ? R.raw.folder_in : R.raw.folder_out;
                int i12 = this.c;
                ic M = a02.M(z4 ? LocaleController.formatPluralString("FolderLinkAddedChats", i12, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i12, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i11);
                M.j = 5000;
                M.j();
                break;
        }
    }

    public /* synthetic */ n6(fn0 fn0Var, int i10, boolean z4) {
        this.a = 2;
        this.d = fn0Var;
        this.c = i10;
        this.b = z4;
    }
}
