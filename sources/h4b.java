// default package

import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h4b implements pw2 {
    public final /* synthetic */ s4b a;

    public h4b(s4b s4bVar) {
        this.a = s4bVar;
    }

    @Override // pw2
    public final boolean A() {
        return true;
    }

    @Override // pw2
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // pw2
    public final void D(TLRPC.Document document) {
        s4b s4bVar = this.a;
        s4bVar.M1.documents.remove(document);
        boolean isEmpty = s4bVar.M1.documents.isEmpty();
        if (isEmpty) {
            s4bVar.dismiss();
        }
        s4bVar.n1.f();
        id idVar = new id(3, s4bVar.J0, s4bVar.getContext());
        idVar.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = ls6.c0(document, "").document;
        ConnectionsManager.getInstance(s4bVar.a).sendRequest(tL_stickers_removeStickerFromSet, new vi1((Object) this, isEmpty, (Object) idVar, (byte) 13));
    }

    @Override // pw2
    public final String E(boolean z) {
        return null;
    }

    @Override // pw2
    public final boolean H() {
        return true;
    }

    @Override // pw2
    public final fu5 J(ViewGroup viewGroup) {
        return null;
    }

    @Override // pw2
    public final void K(k7a k7aVar) {
        this.a.N0(k7aVar);
    }

    @Override // pw2
    public final boolean M() {
        return false;
    }

    @Override // pw2
    public final boolean Q(TLRPC.Document document) {
        return false;
    }

    @Override // pw2
    public final Boolean S(TLRPC.Document document) {
        return null;
    }

    @Override // pw2
    public final boolean T() {
        return false;
    }

    @Override // pw2
    public final long a() {
        e eVar = this.a.F1;
        if (eVar instanceof zu1) {
            return ((zu1) eVar).a();
        }
        return 0L;
    }

    @Override // pw2
    public final boolean b() {
        p4b p4bVar = this.a.V1;
        return p4bVar != null && p4bVar.b();
    }

    @Override // pw2
    public final boolean c() {
        p4b p4bVar = this.a.V1;
        return p4bVar != null && p4bVar.c();
    }

    @Override // pw2
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // pw2
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // pw2
    public final boolean f() {
        return this.a.R1 != null;
    }

    @Override // pw2
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override // pw2
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.M1;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override // pw2
    public final boolean i() {
        return false;
    }

    @Override // pw2
    public final boolean j(int i) {
        return this.a.V1 != null;
    }

    @Override // pw2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
        s4b s4bVar = this.a;
        p4b p4bVar = s4bVar.V1;
        if (p4bVar == null) {
            return;
        }
        p4bVar.e(document, str, obj, null, s4bVar.c2, z, i, 0);
        s4bVar.dismiss();
    }

    @Override // pw2
    public final void m(TLRPC.Document document) {
        s4b s4bVar = this.a;
        s4b.H0(s4bVar.F1, s4bVar.M1, document);
    }

    @Override // pw2
    public final boolean n() {
        return false;
    }

    @Override // pw2
    public final boolean u() {
        return true;
    }

    @Override // pw2
    public final r47 x() {
        return null;
    }

    @Override // pw2
    public final boolean y() {
        return false;
    }

    @Override // pw2
    public final void N() {
    }

    @Override // pw2
    public final void O() {
    }

    @Override // pw2
    public final void p() {
    }

    @Override // pw2
    public final void r() {
    }

    @Override // pw2
    public final void G(TLRPC.Document document) {
    }

    @Override // pw2
    public final void R(String str) {
    }

    @Override // pw2
    public final void l(String str) {
    }

    @Override // pw2
    public final void o(TLRPC.Document document) {
    }

    @Override // pw2
    public final void s(TLRPC.Document document) {
    }

    @Override // pw2
    public final void w(String str) {
    }

    @Override // pw2
    public final void z(TLRPC.Document document) {
    }

    @Override // pw2
    public final void L(Object obj, Object obj2) {
    }

    @Override // pw2
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // pw2
    public final void t(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // pw2
    public final void F(CharSequence charSequence, String str, rx1 rx1Var) {
    }

    @Override // pw2
    public final void v(Object obj, Object obj2, boolean z, int i, int i2) {
    }
}
