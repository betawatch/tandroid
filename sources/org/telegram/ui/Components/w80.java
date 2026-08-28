package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w80 extends f7.p8 {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public w80(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // f7.p8
    public final void a(ie.b bVar) {
        int i9 = this.a;
        if (i9 >= 64) {
            return;
        }
        this.a = i9 + 1;
        try {
            v(bVar);
        } finally {
            this.a--;
        }
    }

    @Override // f7.p8
    public final void b(ie.c cVar) {
        int i9 = this.a;
        if (i9 >= 64) {
            return;
        }
        this.a = i9 + 1;
        try {
            v(cVar);
        } finally {
            this.a--;
        }
    }

    @Override // f7.p8
    public final void c(ie.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = z80.j(dVar.h);
        w(textfixed);
    }

    @Override // f7.p8
    public final void d(ie.e eVar) {
        if (eVar instanceof be.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof hc.d) {
            w(z80.c(((hc.d) eVar).g));
        } else {
            v(eVar);
        }
    }

    @Override // f7.p8
    public final void e(ie.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override // f7.p8
    public final void i(ie.k kVar) {
        w(y(kVar));
    }

    @Override // f7.p8
    public final void k(ie.n nVar) {
        if (!(nVar instanceof hc.a)) {
            v(nVar);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(z80.j("\n"));
        }
        w(z80.c(((hc.a) nVar).g));
        w(z80.j("\n"));
    }

    @Override // f7.p8
    public final void l(ie.o oVar) {
        int i9 = this.a;
        if (i9 >= 64) {
            return;
        }
        this.a = i9 + 1;
        try {
            v(oVar);
        } finally {
            this.a--;
        }
    }

    @Override // f7.p8
    public final void m(ie.q qVar) {
        int i9 = this.a;
        if (i9 >= 64) {
            return;
        }
        this.a = i9 + 1;
        try {
            v(qVar);
        } finally {
            this.a--;
        }
    }

    @Override // f7.p8
    public final void n(ie.r rVar) {
        if (!this.c.texts.isEmpty()) {
            w(z80.j("\n\n"));
        }
        v(rVar);
    }

    @Override // f7.p8
    public final void o(ie.s sVar) {
        w(z80.j(sVar.g));
    }

    @Override // f7.p8
    public final void q(ie.d dVar) {
        w(z80.j(dVar.h));
    }

    @Override // f7.p8
    public final void r(ie.g gVar) {
        w(z80.j("\n"));
    }

    @Override // f7.p8
    public final void s(ie.k kVar) {
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

    @Override // f7.p8
    public final void t(ie.g gVar) {
        w(z80.j(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // f7.p8
    public final void u(ie.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(ie.p pVar) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.c);
        this.c = textconcat;
        return x10;
    }
}
