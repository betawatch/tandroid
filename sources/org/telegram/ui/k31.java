package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k31 extends xf.a {
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
