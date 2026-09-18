package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class p41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public p41(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || p41.class != obj.getClass()) {
            return false;
        }
        p41 p41Var = (p41) obj;
        if (this.a != p41Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, p41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = p41Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public p41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public p41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
