package jh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.p00;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n6(Object obj, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = z10;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) this.d;
                if (!this.b) {
                    s7Var.getClass();
                    break;
                } else {
                    Set set = s7Var.Q;
                    int i10 = this.c;
                    set.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) s7Var.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                ((lf0) this.d).a.b.y3(this.c, this.b);
                break;
            case 2:
                vm0 vm0Var = (vm0) this.d;
                vm0Var.o = null;
                vm0Var.c(this.c, this.b, true);
                break;
            default:
                tc a02 = tc.a0((p00) this.d);
                boolean z10 = this.b;
                int i11 = z10 ? R.raw.folder_in : R.raw.folder_out;
                int i12 = this.c;
                mc M = a02.M(z10 ? LocaleController.formatPluralString("FolderLinkAddedChats", i12, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i12, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i11);
                M.j = 5000;
                M.j();
                break;
        }
    }

    public /* synthetic */ n6(vm0 vm0Var, int i10, boolean z10) {
        this.a = 2;
        this.d = vm0Var;
        this.c = i10;
        this.b = z10;
    }
}
