package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class el extends oq0 {
    public final /* synthetic */ org.telegram.messenger.gj a;
    public final /* synthetic */ org.telegram.messenger.ff b;
    public final /* synthetic */ fl c;

    public el(fl flVar, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar) {
        this.c = flVar;
        this.a = gjVar;
        this.b = ffVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return this.c.a.R.db.E(this.a, fileLocation, i7, z10, false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        kl klVar = this.c.a;
        org.telegram.messenger.gj gjVar = this.a;
        gjVar.q = true;
        org.telegram.messenger.ff ffVar = this.b;
        if (ffVar.h != null || ffVar.b) {
            bn bnVar = klVar.R;
            bh bhVar = new bh(gjVar, 5);
            org.telegram.ui.ActionBar.r4 parentLayout = bnVar.getParentLayout();
            int currentAccount = bnVar.getCurrentAccount();
            org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(0, true, true);
            x30Var.a = bnVar;
            x30Var.s(ffVar);
            x30Var.b = new bg.g0(currentAccount, bhVar, parentLayout, x30Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = gjVar.k.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        klVar.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new u7(7, this, gjVar));
    }
}
