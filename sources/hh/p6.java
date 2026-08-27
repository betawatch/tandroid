package hh;

import java.util.Set;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.q00;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p6(Object obj, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = z10;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u7 u7Var = (u7) this.d;
                if (!this.b) {
                    u7Var.getClass();
                    break;
                } else {
                    Set set = u7Var.Q;
                    int i10 = this.c;
                    set.remove(Integer.valueOf(i10));
                    Runnable runnable = (Runnable) u7Var.R.remove(Integer.valueOf(i10));
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 1:
                ((cf0) this.d).a.b.y3(this.c, this.b);
                break;
            case 2:
                lm0 lm0Var = (lm0) this.d;
                lm0Var.o = null;
                lm0Var.c(this.c, this.b, true);
                break;
            default:
                mc a02 = mc.a0((q00) this.d);
                boolean z10 = this.b;
                int i11 = z10 ? R.raw.folder_in : R.raw.folder_out;
                int i12 = this.c;
                ec M = a02.M(z10 ? LocaleController.formatPluralString("FolderLinkAddedChats", i12, new Object[0]) : LocaleController.formatPluralString("FolderLinkRemovedChats", i12, new Object[0]), LocaleController.getString(R.string.FolderLinkChatlistUpdate), i11);
                M.j = 5000;
                M.j();
                break;
        }
    }

    public /* synthetic */ p6(lm0 lm0Var, int i10, boolean z10) {
        this.a = 2;
        this.d = lm0Var;
        this.c = i10;
        this.b = z10;
    }
}
