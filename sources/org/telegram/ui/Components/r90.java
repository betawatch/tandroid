package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r90 extends k7.h0 {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public r90(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // k7.h0
    public final void a(ne.b bVar) {
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

    @Override // k7.h0
    public final void b(ne.c cVar) {
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

    @Override // k7.h0
    public final void c(ne.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = u90.j(dVar.h);
        w(textfixed);
    }

    @Override // k7.h0
    public final void d(ne.e eVar) {
        if (eVar instanceof ge.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof lc.d) {
            w(u90.c(((lc.d) eVar).g));
        } else {
            v(eVar);
        }
    }

    @Override // k7.h0
    public final void e(ne.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override // k7.h0
    public final void i(ne.k kVar) {
        w(y(kVar));
    }

    @Override // k7.h0
    public final void k(ne.n nVar) {
        if (!(nVar instanceof lc.a)) {
            v(nVar);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(u90.j("\n"));
        }
        w(u90.c(((lc.a) nVar).g));
        w(u90.j("\n"));
    }

    @Override // k7.h0
    public final void l(ne.o oVar) {
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

    @Override // k7.h0
    public final void m(ne.q qVar) {
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

    @Override // k7.h0
    public final void n(ne.r rVar) {
        if (!this.c.texts.isEmpty()) {
            w(u90.j("\n\n"));
        }
        v(rVar);
    }

    @Override // k7.h0
    public final void o(ne.s sVar) {
        w(u90.j(sVar.g));
    }

    @Override // k7.h0
    public final void q(ne.d dVar) {
        w(u90.j(dVar.h));
    }

    @Override // k7.h0
    public final void r(ne.g gVar) {
        w(u90.j("\n"));
    }

    @Override // k7.h0
    public final void s(ne.k kVar) {
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

    @Override // k7.h0
    public final void t(ne.g gVar) {
        w(u90.j(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // k7.h0
    public final void u(ne.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(ne.p pVar) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.c);
        this.c = textconcat;
        return x10;
    }
}
