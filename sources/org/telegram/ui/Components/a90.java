package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a90 extends g7.r8 {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public a90(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // g7.r8
    public final void a(je.b bVar) {
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

    @Override // g7.r8
    public final void b(je.c cVar) {
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

    @Override // g7.r8
    public final void c(je.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = d90.j(dVar.h);
        w(textfixed);
    }

    @Override // g7.r8
    public final void d(je.e eVar) {
        if (eVar instanceof ce.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof ic.d) {
            w(d90.c(((ic.d) eVar).g));
        } else {
            v(eVar);
        }
    }

    @Override // g7.r8
    public final void e(je.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override // g7.r8
    public final void i(je.k kVar) {
        w(y(kVar));
    }

    @Override // g7.r8
    public final void k(je.n nVar) {
        if (!(nVar instanceof ic.a)) {
            v(nVar);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(d90.j("\n"));
        }
        w(d90.c(((ic.a) nVar).g));
        w(d90.j("\n"));
    }

    @Override // g7.r8
    public final void l(je.o oVar) {
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

    @Override // g7.r8
    public final void m(je.q qVar) {
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

    @Override // g7.r8
    public final void n(je.r rVar) {
        if (!this.c.texts.isEmpty()) {
            w(d90.j("\n\n"));
        }
        v(rVar);
    }

    @Override // g7.r8
    public final void o(je.s sVar) {
        w(d90.j(sVar.g));
    }

    @Override // g7.r8
    public final void q(je.d dVar) {
        w(d90.j(dVar.h));
    }

    @Override // g7.r8
    public final void r(je.g gVar) {
        w(d90.j("\n"));
    }

    @Override // g7.r8
    public final void s(je.k kVar) {
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

    @Override // g7.r8
    public final void t(je.g gVar) {
        w(d90.j(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // g7.r8
    public final void u(je.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(je.p pVar) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x8 = x(this.c);
        this.c = textconcat;
        return x8;
    }
}
