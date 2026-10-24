package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
    public final org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        switch (this.b) {
        }
        return this.c.d;
    }
}
