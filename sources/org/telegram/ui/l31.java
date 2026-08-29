package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l31 extends zf.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public l31(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || l31.class != obj.getClass()) {
            return false;
        }
        l31 l31Var = (l31) obj;
        if (this.a != l31Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, l31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = l31Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public l31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public l31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
