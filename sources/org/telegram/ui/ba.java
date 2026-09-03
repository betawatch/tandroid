package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ba extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ ca c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba(ca caVar, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = caVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.b) {
        }
        return this.c.d;
    }
}
