package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class d6 extends pg.a {
    public final CacheByChatsController.KeepMediaException c;

    public d6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || d6.class != obj.getClass()) {
            return false;
        }
        d6 d6Var = (d6) obj;
        if (this.a != d6Var.a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.c;
        return keepMediaException2 == null || (keepMediaException = d6Var.c) == null || keepMediaException2.dialogId == keepMediaException.dialogId;
    }
}
