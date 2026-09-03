package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements g80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ CacheByChatsController.KeepMediaException c;

    public /* synthetic */ c6(f6 f6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.a = i10;
        this.b = f6Var;
        this.c = keepMediaException;
    }

    @Override // org.telegram.ui.g80
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                f6 f6Var = this.b;
                CacheByChatsController.KeepMediaException keepMediaException = this.c;
                if (i10 == i11) {
                    f6Var.d.remove(keepMediaException);
                    f6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(f6Var.b);
                }
                f6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(f6Var.e, f6Var.d);
                break;
            default:
                this.c.keepMedia = i10;
                f6 f6Var2 = this.b;
                f6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(f6Var2.e, f6Var2.d);
                AndroidUtilities.updateVisibleRows(f6Var2.b);
                break;
        }
    }
}
