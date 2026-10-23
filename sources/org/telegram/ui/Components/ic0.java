package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ic0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ kc0 Ge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(kc0 kc0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, false, chatMessageSharedResources, g6Var);
        this.Ge = kc0Var;
    }

    @Override // org.telegram.ui.Cells.t1
    public final void W3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.W3(messageObject, groupedMessages, z10, z11, z12, z13);
        lc0.b(this.Ge.c, this);
    }

    @Override // org.telegram.ui.Cells.t1, org.telegram.ui.Cells.z, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.Ge.c.f.invalidate();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        lc0.b(this.Ge.c, this);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Ge.c.f.invalidate();
    }
}
