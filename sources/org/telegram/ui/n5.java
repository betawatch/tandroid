package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
