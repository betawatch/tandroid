// default package

import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gr1 implements pw2 {
    public final /* synthetic */ zu1 a;

    public gr1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override // pw2
    public final boolean A() {
        return false;
    }

    @Override // pw2
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override // pw2
    public final String E(boolean z) {
        return null;
    }

    @Override // pw2
    public final boolean H() {
        return false;
    }

    @Override // pw2
    public final fu5 J(ViewGroup viewGroup) {
        return null;
    }

    @Override // pw2
    public final boolean M() {
        return false;
    }

    @Override // pw2
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        if (inputStickerSet != null) {
            zu1 zu1Var = this.a;
            if (zu1Var.getParentActivity() != null) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                tL_inputStickerSetID.id = inputStickerSet.id;
                s4b s4bVar = new s4b(zu1Var.getParentActivity(), zu1Var, tL_inputStickerSetID, null, zu1Var.a0, zu1Var.Ba);
                boolean Y7 = zu1Var.Y7();
                s4bVar.i0 = Y7;
                s4bVar.n = Y7;
                s4bVar.c2 = z;
                zu1Var.showDialog(s4bVar);
            }
        }
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
        return true;
    }

    @Override // pw2
    public final long a() {
        return this.a.l6;
    }

    @Override // pw2
    public final boolean b() {
        return this.a.M4();
    }

    @Override // pw2
    public final boolean c() {
        return this.a.g4 == 1;
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
        return false;
    }

    @Override // pw2
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override // pw2
    public final boolean h() {
        return true;
    }

    @Override // pw2
    public final boolean i() {
        return false;
    }

    @Override // pw2
    public final boolean j(int i) {
        return true;
    }

    @Override // pw2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
        this.a.a0.e(document, str, obj, null, true, z, i, i2);
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
    public final void D(TLRPC.Document document) {
    }

    @Override // pw2
    public final void G(TLRPC.Document document) {
    }

    @Override // pw2
    public final void K(k7a k7aVar) {
    }

    @Override // pw2
    public final void R(String str) {
    }

    @Override // pw2
    public final void l(String str) {
    }

    @Override // pw2
    public final void m(TLRPC.Document document) {
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
    public final void t(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // pw2
    public final void F(CharSequence charSequence, String str, rx1 rx1Var) {
    }

    @Override // pw2
    public final void v(Object obj, Object obj2, boolean z, int i, int i2) {
    }
}
