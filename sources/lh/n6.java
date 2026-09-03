package lh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.c10;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ((vf0) this.d).a.b.y3(this.c, this.b);
                break;
            case 2:
                en0 en0Var = (en0) this.d;
                en0Var.o = null;
                en0Var.c(this.c, this.b, true);
                break;
            default:
                qc a02 = qc.a0((c10) this.d);
                boolean z4 = this.b;
                int i11 = z4 ? R.raw.folder_in : R.raw.folder_out;
                int i12 = this.c;
                ic M = a02.M(z4 ? LocaleController.formatPluralString("FolderLinkAddedChats", i12, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i12, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i11);
                M.j = 5000;
                M.j();
                break;
        }
    }

    public /* synthetic */ n6(en0 en0Var, int i10, boolean z4) {
        this.a = 2;
        this.d = en0Var;
        this.c = i10;
        this.b = z4;
    }
}
