package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public final org.telegram.ui.ActionBar.u6 getResourcesProvider() {
        switch (this.b) {
        }
        return this.c.d;
    }
}
