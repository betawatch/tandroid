package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class dl extends nq0 {
    public final /* synthetic */ org.telegram.messenger.ij a;
    public final /* synthetic */ org.telegram.messenger.gf b;
    public final /* synthetic */ el c;

    public dl(el elVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.c = elVar;
        this.a = ijVar;
        this.b = gfVar;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return this.c.a.Q.Za.E(this.a, fileLocation, i7, z9, false);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        jl jlVar = this.c.a;
        org.telegram.messenger.ij ijVar = this.a;
        ijVar.q = true;
        org.telegram.messenger.gf gfVar = this.b;
        if (gfVar.h != null || gfVar.b) {
            an anVar = jlVar.Q;
            bh bhVar = new bh(ijVar, 5);
            org.telegram.ui.ActionBar.q4 parentLayout = anVar.getParentLayout();
            int currentAccount = anVar.getCurrentAccount();
            org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
            j30Var.a = anVar;
            j30Var.s(gfVar);
            j30Var.b = new bg.f0(currentAccount, bhVar, parentLayout, j30Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = ijVar.k.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        jlVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ld(5, this, ijVar));
    }
}
