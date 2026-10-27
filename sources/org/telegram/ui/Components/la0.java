package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class la0 extends a8.bc {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public la0(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // a8.bc
    public final void a(ef.b bVar) {
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

    @Override // a8.bc
    public final void b(ef.c cVar) {
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

    @Override // a8.bc
    public final void c(ef.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = oa0.j(dVar.h);
        w(textfixed);
    }

    @Override // a8.bc
    public final void d(ef.e eVar) {
        if (eVar instanceof xe.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof cd.d) {
            w(oa0.c(((cd.d) eVar).g));
        } else {
            v(eVar);
        }
    }

    @Override // a8.bc
    public final void e(ef.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override // a8.bc
    public final void i(ef.k kVar) {
        w(y(kVar));
    }

    @Override // a8.bc
    public final void k(ef.n nVar) {
        if (!(nVar instanceof cd.a)) {
            v(nVar);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(oa0.j("\n"));
        }
        w(oa0.c(((cd.a) nVar).g));
        w(oa0.j("\n"));
    }

    @Override // a8.bc
    public final void l(ef.o oVar) {
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

    @Override // a8.bc
    public final void m(ef.q qVar) {
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

    @Override // a8.bc
    public final void n(ef.r rVar) {
        if (!this.c.texts.isEmpty()) {
            w(oa0.j("\n\n"));
        }
        v(rVar);
    }

    @Override // a8.bc
    public final void o(ef.s sVar) {
        w(oa0.j(sVar.g));
    }

    @Override // a8.bc
    public final void q(ef.d dVar) {
        w(oa0.j(dVar.h));
    }

    @Override // a8.bc
    public final void r(ef.g gVar) {
        w(oa0.j("\n"));
    }

    @Override // a8.bc
    public final void s(ef.k kVar) {
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

    @Override // a8.bc
    public final void t(ef.g gVar) {
        w(oa0.j(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // a8.bc
    public final void u(ef.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(ef.p pVar) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x9 = x(this.c);
        this.c = textconcat;
        return x9;
    }
}
