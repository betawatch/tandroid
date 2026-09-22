package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class q41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public q41(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || q41.class != obj.getClass()) {
            return false;
        }
        q41 q41Var = (q41) obj;
        if (this.a != q41Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, q41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = q41Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public q41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public q41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
