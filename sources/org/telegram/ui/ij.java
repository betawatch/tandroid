package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.Components.po {
    public final /* synthetic */ un z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(un unVar, Context context, un unVar2, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, unVar2, z10, u6Var);
        this.z0 = unVar;
    }

    @Override // org.telegram.ui.Components.po
    public final boolean a() {
        boolean z10;
        un unVar = this.z0;
        if (unVar.bb || unVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).inBubbleMode;
        if (z10 || unVar.j0 == null || unVar.E3) {
            return false;
        }
        return !unVar.O9() || unVar.t4;
    }

    @Override // org.telegram.ui.Components.po
    public final boolean d() {
        un unVar = this.z0;
        TLRPC.User user = unVar.f;
        if (user != null && user.linked_community_id != 0) {
            unVar.showDialog(new ii.j0(unVar, unVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        unVar.showDialog(new ii.j0(unVar, unVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.po
    public final void f() {
        un unVar = this.z0;
        unVar.va(unVar.N9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.po
    public final boolean o() {
        return this.z0.d4 == 3;
    }
}
