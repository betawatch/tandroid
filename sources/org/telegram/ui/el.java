package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class el extends oq0 {
    public final /* synthetic */ org.telegram.messenger.fj a;
    public final /* synthetic */ org.telegram.messenger.ef b;
    public final /* synthetic */ fl c;

    public el(fl flVar, org.telegram.messenger.fj fjVar, org.telegram.messenger.ef efVar) {
        this.c = flVar;
        this.a = fjVar;
        this.b = efVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return this.c.a.R.db.E(this.a, fileLocation, i7, z10, false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        kl klVar = this.c.a;
        org.telegram.messenger.fj fjVar = this.a;
        fjVar.q = true;
        org.telegram.messenger.ef efVar = this.b;
        if (efVar.h != null || efVar.b) {
            bn bnVar = klVar.R;
            bh bhVar = new bh(fjVar, 5);
            org.telegram.ui.ActionBar.r4 parentLayout = bnVar.getParentLayout();
            int currentAccount = bnVar.getCurrentAccount();
            org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(0, true, true);
            x30Var.a = bnVar;
            x30Var.s(efVar);
            x30Var.b = new bg.g0(currentAccount, bhVar, parentLayout, x30Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = fjVar.k.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        klVar.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new u7(7, this, fjVar));
    }
}
