package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class n5 extends org.telegram.ui.Cells.x4 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Context context, int i10) {
        super(context);
        this.f = i10;
    }

    @Override // org.telegram.ui.Cells.x4
    public final int getFullHeight() {
        switch (this.f) {
        }
        return AndroidUtilities.dp(50.0f);
    }
}
