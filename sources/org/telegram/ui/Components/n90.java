package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class n90 extends v7.i0 {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public n90(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // v7.i0
    public final void a(bf.b bVar) {
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

    @Override // v7.i0
    public final void b(bf.c cVar) {
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

    @Override // v7.i0
    public final void c(bf.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = q90.j(dVar.h);
        w(textfixed);
    }

    @Override // v7.i0
    public final void d(bf.e eVar) {
        if (eVar instanceof ue.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof zc.d) {
            w(q90.c(((zc.d) eVar).g));
        } else {
            v(eVar);
        }
    }

    @Override // v7.i0
    public final void e(bf.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override // v7.i0
    public final void i(bf.k kVar) {
        w(y(kVar));
    }

    @Override // v7.i0
    public final void k(bf.n nVar) {
        if (!(nVar instanceof zc.a)) {
            v(nVar);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(q90.j("\n"));
        }
        w(q90.c(((zc.a) nVar).g));
        w(q90.j("\n"));
    }

    @Override // v7.i0
    public final void l(bf.o oVar) {
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

    @Override // v7.i0
    public final void m(bf.q qVar) {
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

    @Override // v7.i0
    public final void n(bf.r rVar) {
        if (!this.c.texts.isEmpty()) {
            w(q90.j("\n\n"));
        }
        v(rVar);
    }

    @Override // v7.i0
    public final void o(bf.s sVar) {
        w(q90.j(sVar.g));
    }

    @Override // v7.i0
    public final void q(bf.d dVar) {
        w(q90.j(dVar.h));
    }

    @Override // v7.i0
    public final void r(bf.g gVar) {
        w(q90.j("\n"));
    }

    @Override // v7.i0
    public final void s(bf.k kVar) {
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

    @Override // v7.i0
    public final void t(bf.g gVar) {
        w(q90.j(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // v7.i0
    public final void u(bf.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(bf.p pVar) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.c);
        this.c = textconcat;
        return x10;
    }
}
