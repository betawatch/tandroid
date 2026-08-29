package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j90 extends i7.t {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public j90(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // i7.t
    public final void a(le.b bVar) {
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

    @Override // i7.t
    public final void b(le.c cVar) {
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

    @Override // i7.t
    public final void c(le.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = m90.j(dVar.h);
        w(textfixed);
    }

    @Override // i7.t
    public final void d(le.e eVar) {
        if (eVar instanceof ee.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof jc.d) {
            w(m90.c(((jc.d) eVar).g));
        } else {
            v(eVar);
        }
    }

    @Override // i7.t
    public final void e(le.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override // i7.t
    public final void i(le.k kVar) {
        w(y(kVar));
    }

    @Override // i7.t
    public final void k(le.n nVar) {
        if (!(nVar instanceof jc.a)) {
            v(nVar);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(m90.j("\n"));
        }
        w(m90.c(((jc.a) nVar).g));
        w(m90.j("\n"));
    }

    @Override // i7.t
    public final void l(le.o oVar) {
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

    @Override // i7.t
    public final void m(le.q qVar) {
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

    @Override // i7.t
    public final void n(le.r rVar) {
        if (!this.c.texts.isEmpty()) {
            w(m90.j("\n\n"));
        }
        v(rVar);
    }

    @Override // i7.t
    public final void o(le.s sVar) {
        w(m90.j(sVar.g));
    }

    @Override // i7.t
    public final void q(le.d dVar) {
        w(m90.j(dVar.h));
    }

    @Override // i7.t
    public final void r(le.g gVar) {
        w(m90.j("\n"));
    }

    @Override // i7.t
    public final void s(le.k kVar) {
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

    @Override // i7.t
    public final void t(le.g gVar) {
        w(m90.j(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // i7.t
    public final void u(le.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(le.p pVar) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x4 = x(this.c);
        this.c = textconcat;
        return x4;
    }
}
