package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nz0 implements gq {
    public final /* synthetic */ oy a;
    public final /* synthetic */ oz0 b;

    public nz0(oz0 oz0Var, oy oyVar) {
        this.b = oz0Var;
        this.a = oyVar;
    }

    @Override // org.telegram.ui.gq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        oz0 oz0Var = this.b;
        oz0Var.b.K1 = true;
        this.a.removeSelfFromStack();
        NotificationCenter notificationCenter = oz0Var.b.getNotificationCenter();
        ProfileActivity profileActivity = oz0Var.b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        oz0Var.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override // org.telegram.ui.gq
    public final void a(TLRPC.User user) {
    }
}
