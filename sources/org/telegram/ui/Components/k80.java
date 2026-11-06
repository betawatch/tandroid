package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class k80 extends c8.b1 {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public k80(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override // c8.b1
    public final void a(kf.b bVar) {
        int i7 = this.a;
        if (i7 >= 64) {
            return;
        }
        this.a = i7 + 1;
        try {
            v(bVar);
        } finally {
            this.a--;
        }
    }

    @Override // c8.b1
    public final void b(kf.c cVar) {
        int i7 = this.a;
        if (i7 >= 64) {
            return;
        }
        this.a = i7 + 1;
        try {
            v(cVar);
        } finally {
            this.a--;
        }
    }

    @Override // c8.b1
    public final void c(kf.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = n80.n(dVar.h);
        w(textfixed);
    }

    @Override // c8.b1
    public final void d(kf.e eVar) {
        if (eVar instanceof cf.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof zc.d) {
            w(n80.c(((zc.d) eVar).g));
        } else {
            v(eVar);
        }
    }

    @Override // c8.b1
    public final void e(kf.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override // c8.b1
    public final void i(kf.k kVar) {
        w(y(kVar));
    }

    @Override // c8.b1
    public final void k(kf.n nVar) {
        if (!(nVar instanceof zc.a)) {
            v(nVar);
            return;
        }
        if (!this.c.texts.isEmpty()) {
            w(n80.n("\n"));
        }
        w(n80.c(((zc.a) nVar).g));
        w(n80.n("\n"));
    }

    @Override // c8.b1
    public final void l(kf.o oVar) {
        int i7 = this.a;
        if (i7 >= 64) {
            return;
        }
        this.a = i7 + 1;
        try {
            v(oVar);
        } finally {
            this.a--;
        }
    }

    @Override // c8.b1
    public final void m(kf.q qVar) {
        int i7 = this.a;
        if (i7 >= 64) {
            return;
        }
        this.a = i7 + 1;
        try {
            v(qVar);
        } finally {
            this.a--;
        }
    }

    @Override // c8.b1
    public final void n(kf.r rVar) {
        if (!this.c.texts.isEmpty()) {
            w(n80.n("\n\n"));
        }
        v(rVar);
    }

    @Override // c8.b1
    public final void o(kf.s sVar) {
        w(n80.n(sVar.g));
    }

    @Override // c8.b1
    public final void q(kf.d dVar) {
        w(n80.n(dVar.h));
    }

    @Override // c8.b1
    public final void r(kf.g gVar) {
        w(n80.n("\n"));
    }

    @Override // c8.b1
    public final void s(kf.k kVar) {
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

    @Override // c8.b1
    public final void t(kf.g gVar) {
        w(n80.n(this.b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override // c8.b1
    public final void u(kf.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(kf.p pVar) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.c);
        this.c = textconcat;
        return x10;
    }
}
