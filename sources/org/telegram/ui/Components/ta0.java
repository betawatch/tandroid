package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ta0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ va0 Be;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(va0 va0Var, Context context, int i9, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, false, chatMessageSharedResources, b6Var);
        this.Be = va0Var;
    }

    @Override // org.telegram.ui.Cells.t1
    public final void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.X3(messageObject, groupedMessages, z10, z11, z12, z13);
        wa0.b(this.Be.c, this);
    }

    @Override // org.telegram.ui.Cells.t1, org.telegram.ui.Cells.a0, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.Be.c.f.invalidate();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        wa0.b(this.Be.c, this);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void invalidate(int i9, int i10, int i11, int i12) {
        super.invalidate(i9, i10, i11, i12);
        this.Be.c.f.invalidate();
    }
}
