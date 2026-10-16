package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class da extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ ea c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da(ea eaVar, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = eaVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        switch (this.b) {
        }
        return this.c.d;
    }
}
