package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mb0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ ob0 Ge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb0(ob0 ob0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, false, chatMessageSharedResources, f6Var);
        this.Ge = ob0Var;
    }

    @Override // org.telegram.ui.Cells.t1
    public final void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.X3(messageObject, groupedMessages, z10, z11, z12, z13);
        pb0.b(this.Ge.c, this);
    }

    @Override // org.telegram.ui.Cells.t1, org.telegram.ui.Cells.a0, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.Ge.c.f.invalidate();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        pb0.b(this.Ge.c, this);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Ge.c.f.invalidate();
    }
}
