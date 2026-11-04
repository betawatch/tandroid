package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h80 extends b8.lc {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public h80(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // b8.lc
    public final void a(gf.b bVar) {
        int i3 = this.a;
        if (i3 >= 64) {
            return;
        }
        this.a = i3 + 1;
        try {
            v(bVar);
        } finally {
            this.a--;
        }
    }

    @Override // b8.lc
    public final void b(gf.c cVar) {
        int i3 = this.a;
        if (i3 >= 64) {
            return;
        }
        this.a = i3 + 1;
        try {
            v(cVar);
        } finally {
            this.a--;
        }
    }

    @Override // b8.lc
    public final void c(gf.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = k80.n(dVar.h);
        w(textfixed);
    }

    @Override // b8.lc
    public final void d(gf.e eVar) {
        if (eVar instanceof ze.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof wc.d) {
            w(k80.c(((wc.d) eVar).g));
        } else {
            v(eVar);
        }
    }

    @Override // b8.lc
    public final void e(gf.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override // b8.lc
    public final void i(gf.k kVar) {
        w(y(kVar));
    }

    @Override // b8.lc
    public final void k(gf.n nVar) {
        if (!(nVar instanceof wc.a)) {
            v(nVar);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(k80.n("\n"));
        }
        w(k80.c(((wc.a) nVar).g));
        w(k80.n("\n"));
    }

    @Override // b8.lc
    public final void l(gf.o oVar) {
        int i3 = this.a;
        if (i3 >= 64) {
            return;
        }
        this.a = i3 + 1;
        try {
            v(oVar);
        } finally {
            this.a--;
        }
    }

    @Override // b8.lc
    public final void m(gf.q qVar) {
        int i3 = this.a;
        if (i3 >= 64) {
            return;
        }
        this.a = i3 + 1;
        try {
            v(qVar);
        } finally {
            this.a--;
        }
    }

    @Override // b8.lc
    public final void n(gf.r rVar) {
        if (!this.c.texts.isEmpty()) {
            w(k80.n("\n\n"));
        }
        v(rVar);
    }

    @Override // b8.lc
    public final void o(gf.s sVar) {
        w(k80.n(sVar.g));
    }

    @Override // b8.lc
    public final void q(gf.d dVar) {
        w(k80.n(dVar.h));
    }

    @Override // b8.lc
    public final void r(gf.g gVar) {
        w(k80.n("\n"));
    }

    @Override // b8.lc
    public final void s(gf.k kVar) {
        String str = kVar.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(kVar);
            textemail.email = trim.substring(7);
            w(textemail);
            return;
        }
        if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(kVar);
            textphone.phone = trim.substring(4);
            w(textphone);
            return;
        }
        TL_iv.RichText texturl = new TL_iv.textUrl();
        texturl.text = y(kVar);
        texturl.url = trim;
        w(texturl);
    }

    @Override // b8.lc
    public final void t(gf.g gVar) {
        w(k80.n(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // b8.lc
    public final void u(gf.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(gf.p pVar) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.c);
        this.c = textconcat;
        return x10;
    }
}
