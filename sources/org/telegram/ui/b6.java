package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b6 extends qg.a {
    public final CacheByChatsController.KeepMediaException c;

    public b6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || b6.class != obj.getClass()) {
            return false;
        }
        b6 b6Var = (b6) obj;
        if (this.a != b6Var.a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.c;
        return keepMediaException2 == null || (keepMediaException = b6Var.c) == null || keepMediaException2.dialogId == keepMediaException.dialogId;
    }
}
