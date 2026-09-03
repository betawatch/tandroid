package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e6 extends bg.b {
    public final CacheByChatsController.KeepMediaException c;

    public e6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || e6.class != obj.getClass()) {
            return false;
        }
        e6 e6Var = (e6) obj;
        if (this.a != e6Var.a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.c;
        return keepMediaException2 == null || (keepMediaException = e6Var.c) == null || keepMediaException2.dialogId == keepMediaException.dialogId;
    }
}
