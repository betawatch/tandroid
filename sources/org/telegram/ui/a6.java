package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements z70 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;
    public final /* synthetic */ CacheByChatsController.KeepMediaException c;

    public /* synthetic */ a6(d6 d6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.a = i10;
        this.b = d6Var;
        this.c = keepMediaException;
    }

    @Override // org.telegram.ui.z70
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                d6 d6Var = this.b;
                CacheByChatsController.KeepMediaException keepMediaException = this.c;
                if (i10 == i11) {
                    d6Var.d.remove(keepMediaException);
                    d6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(d6Var.b);
                }
                d6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var.e, d6Var.d);
                break;
            default:
                this.c.keepMedia = i10;
                d6 d6Var2 = this.b;
                d6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var2.e, d6Var2.d);
                AndroidUtilities.updateVisibleRows(d6Var2.b);
                break;
        }
    }
}
