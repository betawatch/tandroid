package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ca extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ da c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca(da daVar, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = daVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.b) {
        }
        return this.c.d;
    }
}
