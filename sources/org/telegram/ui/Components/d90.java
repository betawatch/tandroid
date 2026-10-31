package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d90 extends w7.j8 {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public d90(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // w7.j8
    public final void a(ve.b bVar) {
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

    @Override // w7.j8
    public final void b(ve.c cVar) {
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

    @Override // w7.j8
    public final void c(ve.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = g90.n(dVar.h);
        w(textfixed);
    }

    @Override // w7.j8
    public final void d(ve.e eVar) {
        if (eVar instanceof oe.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof tc.d) {
            w(g90.c(((tc.d) eVar).g));
        } else {
            v(eVar);
        }
    }

    @Override // w7.j8
    public final void e(ve.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override // w7.j8
    public final void i(ve.k kVar) {
        w(y(kVar));
    }

    @Override // w7.j8
    public final void k(ve.n nVar) {
        if (!(nVar instanceof tc.a)) {
            v(nVar);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(g90.n("\n"));
        }
        w(g90.c(((tc.a) nVar).g));
        w(g90.n("\n"));
    }

    @Override // w7.j8
    public final void l(ve.o oVar) {
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

    @Override // w7.j8
    public final void m(ve.p pVar) {
        int i10 = this.a;
        if (i10 >= 64) {
            return;
        }
        this.a = i10 + 1;
        try {
            v(pVar);
        } finally {
            this.a--;
        }
    }

    @Override // w7.j8
    public final void n(ve.q qVar) {
        if (!this.c.texts.isEmpty()) {
            w(g90.n("\n\n"));
        }
        v(qVar);
    }

    @Override // w7.j8
    public final void o(ve.r rVar) {
        w(g90.n(rVar.g));
    }

    @Override // w7.j8
    public final void q(ve.d dVar) {
        w(g90.n(dVar.h));
    }

    @Override // w7.j8
    public final void r(ve.g gVar) {
        w(g90.n("\n"));
    }

    @Override // w7.j8
    public final void s(ve.k kVar) {
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

    @Override // w7.j8
    public final void t(ve.g gVar) {
        w(g90.n(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // w7.j8
    public final void u(ve.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(df.c cVar) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(cVar);
        TL_iv.RichText x10 = x(this.c);
        this.c = textconcat;
        return x10;
    }
}
