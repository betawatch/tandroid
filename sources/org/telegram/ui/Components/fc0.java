package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fc0 extends org.telegram.ui.Cells.s1 {
    public final /* synthetic */ hc0 He;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc0(hc0 hc0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, false, chatMessageSharedResources, u6Var);
        this.He = hc0Var;
    }

    @Override // org.telegram.ui.Cells.s1
    public final void Z3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.Z3(messageObject, groupedMessages, z10, z11, z12, z13);
        ic0.b(this.He.c, this);
    }

    @Override // org.telegram.ui.Cells.s1, org.telegram.ui.Cells.z, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.He.c.f.invalidate();
    }

    @Override // org.telegram.ui.Cells.s1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ic0.b(this.He.c, this);
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.He.c.f.invalidate();
    }
}
