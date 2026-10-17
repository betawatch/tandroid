package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class g31 extends pg.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public g31(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || g31.class != obj.getClass()) {
            return false;
        }
        g31 g31Var = (g31) obj;
        if (this.a != g31Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, g31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = g31Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public g31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public g31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
