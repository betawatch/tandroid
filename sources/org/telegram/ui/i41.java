package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class i41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public i41(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || i41.class != obj.getClass()) {
            return false;
        }
        i41 i41Var = (i41) obj;
        if (this.a != i41Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, i41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = i41Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public i41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public i41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
