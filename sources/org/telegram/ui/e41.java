package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e41 extends bg.b {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public e41(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || e41.class != obj.getClass()) {
            return false;
        }
        e41 e41Var = (e41) obj;
        if (this.a != e41Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, e41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = e41Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public e41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public e41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
