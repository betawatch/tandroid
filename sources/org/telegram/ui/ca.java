package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
