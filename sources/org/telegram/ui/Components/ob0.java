package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ob0 extends org.telegram.ui.Cells.s1 {
    public final /* synthetic */ qb0 Ce;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob0(qb0 qb0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, false, chatMessageSharedResources, f6Var);
        this.Ce = qb0Var;
    }

    @Override // org.telegram.ui.Cells.s1
    public final void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z4, boolean z10, boolean z11, boolean z12) {
        super.X3(messageObject, groupedMessages, z4, z10, z11, z12);
        rb0.b(this.Ce.c, this);
    }

    @Override // org.telegram.ui.Cells.s1, org.telegram.ui.Cells.a0, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.Ce.c.f.invalidate();
    }

    @Override // org.telegram.ui.Cells.s1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        rb0.b(this.Ce.c, this);
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Ce.c.f.invalidate();
    }
}
