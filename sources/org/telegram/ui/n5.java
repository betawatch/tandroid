package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class n5 extends org.telegram.ui.Cells.y4 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Context context, int i10) {
        super(context);
        this.f = i10;
    }

    @Override // org.telegram.ui.Cells.y4
    public final int getFullHeight() {
        switch (this.f) {
        }
        return AndroidUtilities.dp(50.0f);
    }
}
