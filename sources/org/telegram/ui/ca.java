package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
