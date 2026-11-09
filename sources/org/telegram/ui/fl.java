package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fl extends pq0 {
    public final /* synthetic */ org.telegram.messenger.ij a;
    public final /* synthetic */ org.telegram.messenger.gf b;
    public final /* synthetic */ gl c;

    public fl(gl glVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.c = glVar;
        this.a = ijVar;
        this.b = gfVar;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return this.c.a.Q.bb.E(this.a, fileLocation, i7, z9, false);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ll llVar = this.c.a;
        org.telegram.messenger.ij ijVar = this.a;
        ijVar.q = true;
        org.telegram.messenger.gf gfVar = this.b;
        if (gfVar.h != null || gfVar.b) {
            cn cnVar = llVar.Q;
            dh dhVar = new dh(ijVar, 5);
            org.telegram.ui.ActionBar.q4 parentLayout = cnVar.getParentLayout();
            int currentAccount = cnVar.getCurrentAccount();
            org.telegram.ui.Components.k30 k30Var = new org.telegram.ui.Components.k30(0, true, true);
            k30Var.a = cnVar;
            k30Var.s(gfVar);
            k30Var.b = new bg.f0(currentAccount, dhVar, parentLayout, k30Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = ijVar.k.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        llVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ld(5, this, ijVar));
    }
}
