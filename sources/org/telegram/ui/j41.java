package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class j41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public j41(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || j41.class != obj.getClass()) {
            return false;
        }
        j41 j41Var = (j41) obj;
        if (this.a != j41Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, j41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = j41Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public j41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public j41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
