package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fl extends qq0 {
    public final /* synthetic */ org.telegram.messenger.ij a;
    public final /* synthetic */ org.telegram.messenger.gf b;
    public final /* synthetic */ gl c;

    public fl(gl glVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.c = glVar;
        this.a = ijVar;
        this.b = gfVar;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return this.c.a.Q.bb.E(this.a, fileLocation, i7, z9, false);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ll llVar = this.c.a;
        org.telegram.messenger.ij ijVar = this.a;
        ijVar.q = true;
        org.telegram.messenger.gf gfVar = this.b;
        if (gfVar.h != null || gfVar.b) {
            cn cnVar = llVar.Q;
            dh dhVar = new dh(ijVar, 5);
            org.telegram.ui.ActionBar.r4 parentLayout = cnVar.getParentLayout();
            int currentAccount = cnVar.getCurrentAccount();
            org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
            j30Var.a = cnVar;
            j30Var.s(gfVar);
            j30Var.b = new bg.f0(currentAccount, dhVar, parentLayout, j30Var);
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
