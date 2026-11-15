package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dl extends mq0 {
    public final /* synthetic */ org.telegram.messenger.gj a;
    public final /* synthetic */ org.telegram.messenger.ff b;
    public final /* synthetic */ el c;

    public dl(el elVar, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar) {
        this.c = elVar;
        this.a = gjVar;
        this.b = ffVar;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return this.c.a.R.cb.E(this.a, fileLocation, i7, z10, false);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        jl jlVar = this.c.a;
        org.telegram.messenger.gj gjVar = this.a;
        gjVar.q = true;
        org.telegram.messenger.ff ffVar = this.b;
        if (ffVar.h != null || ffVar.b) {
            an anVar = jlVar.R;
            bh bhVar = new bh(gjVar, 5);
            org.telegram.ui.ActionBar.o4 parentLayout = anVar.getParentLayout();
            int currentAccount = anVar.getCurrentAccount();
            org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(0, true, true);
            m30Var.a = anVar;
            m30Var.s(ffVar);
            m30Var.b = new bg.f0(currentAccount, bhVar, parentLayout, m30Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = gjVar.k.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        jlVar.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new v7(7, this, gjVar));
    }
}
