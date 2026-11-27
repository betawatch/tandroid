// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class iha implements bfa {
    public final /* synthetic */ eja a;

    public iha(eja ejaVar) {
        this.a = ejaVar;
    }

    @Override // bfa
    public final void a(TLRPC.WebPage webPage, r47 r47Var) {
        eja ejaVar = this.a;
        iv3.J0(ejaVar.y1, r47Var, ejaVar.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override // bfa
    public final boolean b() {
        return !this.a.F1;
    }

    @Override // bfa
    public final void c(String str, boolean z) {
        eja ejaVar = this.a;
        e eVar = ejaVar.y1;
        if (!z) {
            ejaVar.Y0(str);
            return;
        }
        nx0 i = ik8.i(eVar.getParentActivity(), false, 1, null);
        i.P = str;
        i.Q = false;
        CharSequence[] charSequenceArr = {ob6.M0(2131747544, "Open"), ob6.M0(2131751732, "Copy")};
        oh ohVar = new oh((Object) this, (Object) str, (byte) 13);
        i.M = charSequenceArr;
        i.L = ohVar;
        eVar.showDialog(i);
    }
}
