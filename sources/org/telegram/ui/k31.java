package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k31 extends qg.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public k31(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || k31.class != obj.getClass()) {
            return false;
        }
        k31 k31Var = (k31) obj;
        if (this.a != k31Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, k31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = k31Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public k31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public k31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
