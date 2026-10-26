package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ak implements dt {
    public final /* synthetic */ un a;

    public ak(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean D(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ String F(boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean I() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            un unVar = this.a;
            if (unVar.getParentActivity() == null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(unVar.getParentActivity(), unVar, tL_inputStickerSetID, null, unVar.Y, unVar.qa);
            cz0Var.setCalcMandatoryInsets(unVar.F9());
            cz0Var.i0 = z10;
            unVar.showDialog(cz0Var);
        }
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean M(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean Q() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final long a() {
        return this.a.f6;
    }

    @Override // org.telegram.ui.dt
    public final boolean b() {
        return this.a.I6();
    }

    @Override // org.telegram.ui.dt
    public final boolean c() {
        return this.a.d4 == 1;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ TLRPC.PollAnswer g() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ org.telegram.ui.Components.k80 i(bh.p pVar) {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final boolean l(int i10) {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.a.Y.a(document, str, obj, null, true, z10, i10, i11);
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ boolean x() {
        return true;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ MessageObject z() {
        return null;
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void B(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void E(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void G(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void N(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void n(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void o(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void q(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void u(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void y(String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void w(TLObject tLObject, Object obj) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void O(CharSequence charSequence, String str, org.telegram.ui.Components.oy oyVar) {
    }

    @Override // org.telegram.ui.dt
    public final /* synthetic */ void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
