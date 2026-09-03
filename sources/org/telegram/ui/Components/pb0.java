package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pb0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ rb0 Ce;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb0(rb0 rb0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, false, chatMessageSharedResources, g6Var);
        this.Ce = rb0Var;
    }

    @Override // org.telegram.ui.Cells.t1
    public final void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z4, boolean z10, boolean z11, boolean z12) {
        super.X3(messageObject, groupedMessages, z4, z10, z11, z12);
        sb0.b(this.Ce.c, this);
    }

    @Override // org.telegram.ui.Cells.t1, org.telegram.ui.Cells.a0, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.Ce.c.f.invalidate();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        sb0.b(this.Ce.c, this);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Ce.c.f.invalidate();
    }
}
