package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class aa extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ ba c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa(ba baVar, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = baVar;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.b) {
        }
        return this.c.d;
    }
}
