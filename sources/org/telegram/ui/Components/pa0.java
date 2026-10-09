package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pa0 extends v7.e5 {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public pa0(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // v7.e5
    public final void a(cf.b bVar) {
        int i10 = this.a;
        if (i10 >= 64) {
            return;
        }
        this.a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.a--;
        }
    }

    @Override // v7.e5
    public final void b(cf.c cVar) {
        int i10 = this.a;
        if (i10 >= 64) {
            return;
        }
        this.a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.a--;
        }
    }

    @Override // v7.e5
    public final void c(cf.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = sa0.j(dVar.h);
        w(textfixed);
    }

    @Override // v7.e5
    public final void d(cf.e eVar) {
        if (eVar instanceof ve.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof ad.e) {
            w(sa0.c(((ad.e) eVar).g));
        } else {
            v(eVar);
        }
    }

    @Override // v7.e5
    public final void e(cf.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override // v7.e5
    public final void i(cf.k kVar) {
        w(y(kVar));
    }

    @Override // v7.e5
    public final void k(cf.n nVar) {
        if (!(nVar instanceof ad.a)) {
            v(nVar);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(sa0.j("\n"));
        }
        w(sa0.c(((ad.a) nVar).g));
        w(sa0.j("\n"));
    }

    @Override // v7.e5
    public final void l(cf.o oVar) {
        int i10 = this.a;
        if (i10 >= 64) {
            return;
        }
        this.a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.a--;
        }
    }

    @Override // v7.e5
    public final void m(cf.q qVar) {
        int i10 = this.a;
        if (i10 >= 64) {
            return;
        }
        this.a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.a--;
        }
    }

    @Override // v7.e5
    public final void n(cf.r rVar) {
        if (!this.c.texts.isEmpty()) {
            w(sa0.j("\n\n"));
        }
        v(rVar);
    }

    @Override // v7.e5
    public final void o(cf.s sVar) {
        w(sa0.j(sVar.g));
    }

    @Override // v7.e5
    public final void q(cf.d dVar) {
        w(sa0.j(dVar.h));
    }

    @Override // v7.e5
    public final void r(cf.g gVar) {
        w(sa0.j("\n"));
    }

    @Override // v7.e5
    public final void s(cf.k kVar) {
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

    @Override // v7.e5
    public final void t(cf.g gVar) {
        w(sa0.j(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // v7.e5
    public final void u(cf.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(cf.p pVar) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.c);
        this.c = textconcat;
        return x10;
    }
}
