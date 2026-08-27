package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xa0 extends org.telegram.ui.Cells.s1 {
    public final /* synthetic */ za0 Be;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(za0 za0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, false, chatMessageSharedResources, c6Var);
        this.Be = za0Var;
    }

    @Override // org.telegram.ui.Cells.s1
    public final void W3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.W3(messageObject, groupedMessages, z10, z11, z12, z13);
        ab0.b(this.Be.c, this);
    }

    @Override // org.telegram.ui.Cells.s1, org.telegram.ui.Cells.a0, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.Be.c.f.invalidate();
    }

    @Override // org.telegram.ui.Cells.s1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ab0.b(this.Be.c, this);
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Be.c.f.invalidate();
    }
}
