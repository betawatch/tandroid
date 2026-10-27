package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m31 extends qg.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public m31(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || m31.class != obj.getClass()) {
            return false;
        }
        m31 m31Var = (m31) obj;
        if (this.a != m31Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, m31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = m31Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public m31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public m31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
