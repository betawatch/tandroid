package gh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.n00;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q6(Object obj, boolean z10, int i9, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v7 v7Var = (v7) this.d;
                if (!this.b) {
                    v7Var.getClass();
                    break;
                } else {
                    Set set = v7Var.Q;
                    int i9 = this.c;
                    set.remove(Integer.valueOf(i9));
                    Runnable runnable = (Runnable) v7Var.R.remove(Integer.valueOf(i9));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                ((ye0) this.d).a.b.y3(this.c, this.b);
                break;
            case 2:
                im0 im0Var = (im0) this.d;
                im0Var.o = null;
                im0Var.c(this.c, this.b, true);
                break;
            default:
                oc a02 = oc.a0((n00) this.d);
                boolean z10 = this.b;
                int i10 = z10 ? R.raw.folder_in : R.raw.folder_out;
                int i11 = this.c;
                gc M = a02.M(z10 ? LocaleController.formatPluralString("FolderLinkAddedChats", i11, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i11, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i10);
                M.j = 5000;
                M.j();
                break;
        }
    }

    public /* synthetic */ q6(im0 im0Var, int i9, boolean z10) {
        this.a = 2;
        this.d = im0Var;
        this.c = i9;
        this.b = z10;
    }
}
