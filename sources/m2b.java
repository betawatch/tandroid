// default package

import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m2b implements fx2 {
    public final /* synthetic */ x2b a;

    public m2b(x2b x2bVar) {
        this.a = x2bVar;
    }

    @Override // fx2
    public final boolean B() {
        return true;
    }

    @Override // fx2
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // fx2
    public final void D(TLRPC.Document document) {
        x2b x2bVar = this.a;
        x2bVar.M1.documents.remove(document);
        boolean isEmpty = x2bVar.M1.documents.isEmpty();
        if (isEmpty) {
            x2bVar.dismiss();
        }
        x2bVar.n1.f();
        he heVar = new he(3, x2bVar.J0, x2bVar.getContext());
        heVar.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = hs6.c0(document, "").document;
        ConnectionsManager.getInstance(x2bVar.a).sendRequest(tL_stickers_removeStickerFromSet, new vj1((Object) this, isEmpty, (Object) heVar, (byte) 13));
    }

    @Override // fx2
    public final String E(boolean z) {
        return null;
    }

    @Override // fx2
    public final boolean H() {
        return true;
    }

    @Override // fx2
    public final bu5 I(ViewGroup viewGroup) {
        return null;
    }

    @Override // fx2
    public final void J(t5a t5aVar) {
        this.a.M0(t5aVar);
    }

    @Override // fx2
    public final boolean L() {
        return false;
    }

    @Override // fx2
    public final boolean Q(TLRPC.Document document) {
        return false;
    }

    @Override // fx2
    public final Boolean S(TLRPC.Document document) {
        return null;
    }

    @Override // fx2
    public final boolean T() {
        return false;
    }

    @Override // fx2
    public final long a() {
        d dVar = this.a.F1;
        if (dVar instanceof yv1) {
            return ((yv1) dVar).a();
        }
        return 0L;
    }

    @Override // fx2
    public final boolean b() {
        u2b u2bVar = this.a.V1;
        return u2bVar != null && u2bVar.b();
    }

    @Override // fx2
    public final boolean c() {
        u2b u2bVar = this.a.V1;
        return u2bVar != null && u2bVar.c();
    }

    @Override // fx2
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // fx2
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // fx2
    public final boolean f() {
        return this.a.R1 != null;
    }

    @Override // fx2
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override // fx2
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.M1;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // fx2
    public final boolean i() {
        return false;
    }

    @Override // fx2
    public final boolean j(int i) {
        return this.a.V1 != null;
    }

    @Override // fx2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
        x2b x2bVar = this.a;
        u2b u2bVar = x2bVar.V1;
        if (u2bVar == null) {
            return;
        }
        u2bVar.e(document, str, obj, null, x2bVar.c2, z, i, 0);
        x2bVar.dismiss();
    }

    @Override // fx2
    public final void m(TLRPC.Document document) {
        x2b x2bVar = this.a;
        x2b.G0(x2bVar.F1, x2bVar.M1, document);
    }

    @Override // fx2
    public final boolean n() {
        return false;
    }

    @Override // fx2
    public final boolean t() {
        return true;
    }

    @Override // fx2
    public final k47 x() {
        return null;
    }

    @Override // fx2
    public final boolean y() {
        return false;
    }

    @Override // fx2
    public final void A(TLRPC.Document document) {
    }

    @Override // fx2
    public final void G(TLRPC.Document document) {
    }

    @Override // fx2
    public final void M() {
    }

    @Override // fx2
    public final void O() {
    }

    @Override // fx2
    public final void R(String str) {
    }

    @Override // fx2
    public final void l(String str) {
    }

    @Override // fx2
    public final void o(TLRPC.Document document) {
    }

    @Override // fx2
    public final void p() {
    }

    @Override // fx2
    public final void q() {
    }

    @Override // fx2
    public final void r(TLRPC.Document document) {
    }

    @Override // fx2
    public final void w(String str) {
    }

    @Override // fx2
    public final void K(Object obj, Object obj2) {
    }

    @Override // fx2
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // fx2
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // fx2
    public final void z(CharSequence charSequence, String str, qy1 qy1Var) {
    }

    @Override // fx2
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }
}
