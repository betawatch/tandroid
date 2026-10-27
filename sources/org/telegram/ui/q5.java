package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q5 extends org.telegram.ui.Cells.c5 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5(Context context, int i10) {
        super(context);
        this.f = i10;
    }

    @Override // org.telegram.ui.Cells.c5
    public final int getFullHeight() {
        switch (this.f) {
        }
        return AndroidUtilities.dp(50.0f);
    }
}
