// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gia implements pw2 {
    public final /* synthetic */ TLRPC.TL_messageMediaPoll a;
    public final /* synthetic */ TLRPC.PollAnswer b;
    public final /* synthetic */ wb2 c;
    public final /* synthetic */ lia d;

    public gia(lia liaVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, wb2 wb2Var) {
        this.d = liaVar;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = wb2Var;
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
    public final void N() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        r7a.B(this.d.a).v0(this.c.getMessageObject(), arrayList, null);
    }

    @Override // pw2
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        lia liaVar = this.d;
        nia niaVar = liaVar.c;
        if (inputStickerSet == null || niaVar.s.getContext() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.id = inputStickerSet.id;
        s4b s4bVar = new s4b(niaVar.s.getContext(), niaVar.s.y1, tL_inputStickerSetID, null, null, liaVar.b);
        s4bVar.i0 = true;
        s4bVar.n = true;
        s4bVar.c2 = z;
        s4bVar.show();
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
        return this.d.c.s.m1;
    }

    @Override // pw2
    public final boolean b() {
        return false;
    }

    @Override // pw2
    public final boolean c() {
        return false;
    }

    @Override // pw2
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
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
        return this.b;
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
        return false;
    }

    @Override // pw2
    public final boolean n() {
        return false;
    }

    @Override // pw2
    public final void p() {
        r7a.B(this.d.a).v0(this.c.getMessageObject(), null, null);
    }

    @Override // pw2
    public final boolean u() {
        return true;
    }

    @Override // pw2
    public final r47 x() {
        return this.c.getMessageObject();
    }

    @Override // pw2
    public final boolean y() {
        return false;
    }

    @Override // pw2
    public final void O() {
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

    @Override // pw2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
