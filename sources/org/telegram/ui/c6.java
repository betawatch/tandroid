package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class c6 extends pg.a {
    public final CacheByChatsController.KeepMediaException c;

    public c6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || c6.class != obj.getClass()) {
            return false;
        }
        c6 c6Var = (c6) obj;
        if (this.a != c6Var.a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.c;
        return keepMediaException2 == null || (keepMediaException = c6Var.c) == null || keepMediaException2.dialogId == keepMediaException.dialogId;
    }
}
