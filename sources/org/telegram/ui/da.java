package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
