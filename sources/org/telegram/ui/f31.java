package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class f31 extends pg.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public f31(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || f31.class != obj.getClass()) {
            return false;
        }
        f31 f31Var = (f31) obj;
        if (this.a != f31Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, f31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = f31Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public f31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public f31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
