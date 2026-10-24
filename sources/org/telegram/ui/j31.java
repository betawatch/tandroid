package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class j31 extends pg.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public j31(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || j31.class != obj.getClass()) {
            return false;
        }
        j31 j31Var = (j31) obj;
        if (this.a != j31Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, j31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = j31Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public j31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public j31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
