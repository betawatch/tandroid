package fi;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import di.u9;
import java.net.URLDecoder;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v41;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class g3 extends x7 {
    public final /* synthetic */ z3 A0;
    public final /* synthetic */ f9 y0;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(z3 z3Var, Context context, b bVar, f9 f9Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, bVar);
        this.A0 = z3Var;
        this.y0 = f9Var;
        this.z0 = h6Var;
    }

    @Override // fi.x7
    public final void F(org.telegram.ui.Components.y5 y5Var) {
        if (y5Var != null) {
            z3 z3Var = this.A0;
            if (z3Var.A1 == null) {
                return;
            }
            TLRPC.Document document = y5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.p5.e(z3Var.m2, y5Var.documentId);
            }
            if (document == null) {
                return;
            }
            c3 c3Var = z3Var.M0;
            org.telegram.ui.ActionBar.h6 h6Var = this.z0;
            gc h = new lc(c3Var, h6Var).h(document, 2, new bi.j(this, this.y0, h6Var, 6));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // fi.x7
    public final void G(CharacterStyle characterStyle, View view) {
        f9 f9Var = this.y0;
        org.telegram.ui.ActionBar.g2 g2Var = f9Var.f;
        boolean z10 = characterStyle instanceof v41;
        z3 z3Var = this.A0;
        if (z10) {
            TLRPC.User c22 = np.u1(z3Var.m2).c2(Utilities.A(((v41) characterStyle).getURL()));
            if (c22 != null) {
                np.u1(z3Var.m2).G3(c22, null, g2Var, 0);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof s41)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof u41);
                return;
            }
            if (characterStyle instanceof r41) {
                r41 r41Var = (r41) characterStyle;
                org.telegram.messenger.g0.g(r41Var.a.subSequence(r41Var.b, r41Var.c).toString());
                o10.t(null, 2131743951, new lc(z3Var.M0, this.z0));
                return;
            } else {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            }
        }
        String url = ((s41) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                f9Var.N(new f30(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            f9Var.N(new k90(bundle, null));
            return;
        }
        String c10 = vf.c.c(url);
        if (c10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = c10.toLowerCase();
        if (url.startsWith("@")) {
            np.u1(z3Var.m2).F3(lowerCase, g2Var, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // fi.x7
    public final void H(final URLSpan uRLSpan, final View view, f2.a aVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.z0;
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        j3.P = str;
        j3.Q = false;
        j3.R = true;
        z3 z3Var = this.A0;
        x3 x3Var = z3Var.y1;
        CharSequence[] charSequenceArr = (x3Var == null || x3Var.d()) ? new CharSequence[]{hd.N0(2131747623, null), hd.N0(2131751755, null)} : new CharSequence[]{hd.N0(2131747623, null)};
        final org.telegram.ui.ActionBar.h6 h6Var2 = this.z0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: fi.f3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                g3 g3Var = g3.this;
                if (i7 == 0) {
                    g3Var.G(uRLSpan, view);
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.g(url);
                    new lc(g3Var.A0.M0, h6Var2).k(false).j();
                }
            }
        };
        j3.M = charSequenceArr;
        j3.L = onClickListener;
        j3.I0 = new u9(aVar, 3);
        j3.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, h6Var));
        ((w8) z3Var.A1).h(j3);
    }

    @Override // fi.x7
    public final void I(s7 s7Var) {
        if (s7Var == null) {
            return;
        }
        final TLRPC.Document document = s7Var.g;
        final int i7 = 1;
        z3 z3Var = this.A0;
        f9 f9Var = this.y0;
        final org.telegram.ui.ActionBar.h6 h6Var = this.z0;
        if (document != null) {
            a70 G = a70.G(f9Var.w, h6Var, z3Var.u0);
            G.i = 3;
            G.b0(-org.telegram.messenger.g0.L(8.0f), 0.0f);
            final int i10 = 0;
            G.l(R.drawable.msg_saved, hd.N0(2131744479, null), new Runnable(this) { // from class: fi.d3
                public final /* synthetic */ g3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i10;
                    org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                    TLRPC.Document document2 = document;
                    g3 g3Var = this.b;
                    switch (i11) {
                        case 0:
                            z3 z3Var2 = g3Var.A0;
                            az C = az.C(z3Var2.m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = k10.i(z3Var2.m2).e();
                            x3 x3Var = z3Var2.y1;
                            C.r0(yy.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, x3Var != null ? x3Var.a : null, null, false));
                            new lc(z3Var2.M0, h6Var2).Q(R.raw.saved_messages, 36, org.telegram.messenger.g0.R2(hd.N0(2131744478, null), -1, 2, new org.telegram.messenger.j2(27), null)).k(true);
                            break;
                        default:
                            z3 z3Var3 = g3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.b == k10.i(z3Var3.m2).e()) {
                                hp hpVar = MediaController.B().R0;
                                hpVar.c.add(0, hpVar.d(document2));
                                hpVar.e();
                            }
                            ConnectionsManager.getInstance(z3Var3.m2).sendRequest(tL_account_saveMusic, null);
                            new lc(z3Var3.M0, h6Var2).Q(R.raw.ic_save_to_music, 36, hd.N0(2131744480, null)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            G.c(R.drawable.msg_tone_add, hd.N0(2131744481, null), new Runnable(this) { // from class: fi.d3
                public final /* synthetic */ g3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i7;
                    org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                    TLRPC.Document document2 = document;
                    g3 g3Var = this.b;
                    switch (i11) {
                        case 0:
                            z3 z3Var2 = g3Var.A0;
                            az C = az.C(z3Var2.m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = k10.i(z3Var2.m2).e();
                            x3 x3Var = z3Var2.y1;
                            C.r0(yy.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, x3Var != null ? x3Var.a : null, null, false));
                            new lc(z3Var2.M0, h6Var2).Q(R.raw.saved_messages, 36, org.telegram.messenger.g0.R2(hd.N0(2131744478, null), -1, 2, new org.telegram.messenger.j2(27), null)).k(true);
                            break;
                        default:
                            z3 z3Var3 = g3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.b == k10.i(z3Var3.m2).e()) {
                                hp hpVar = MediaController.B().R0;
                                hpVar.c.add(0, hpVar.d(document2));
                                hpVar.e();
                            }
                            ConnectionsManager.getInstance(z3Var3.m2).sendRequest(tL_account_saveMusic, null);
                            new lc(z3Var3.M0, h6Var2).Q(R.raw.ic_save_to_music, 36, hd.N0(2131744480, null)).k(true);
                            break;
                    }
                }
            }, false);
            G.a0();
            return;
        }
        if (s7Var.e && s7Var.b != null && s7Var.d != null) {
            Bundle bundle = new Bundle();
            if (s7Var.b.longValue() >= 0) {
                bundle.putLong("user_id", s7Var.b.longValue());
            } else {
                bundle.putLong("chat_id", -s7Var.b.longValue());
            }
            bundle.putInt("message_id", s7Var.d.intValue());
            f9Var.N(new bn(bundle));
            return;
        }
        if (s7Var.b == null || s7Var.c == null) {
            gc Q = new lc(z3Var.M0, h6Var).Q(R.raw.error, 36, hd.N0(2131744421, null));
            Q.a = 3;
            Q.k(true);
        } else {
            np.u1(z3Var.m2).R1().g0(s7Var.c.intValue(), s7Var.b.longValue(), new bi.m2(this, s7Var, f9Var, h6Var, 2));
        }
    }

    public final void M(int i7, String str, CharacterStyle characterStyle, boolean z10) {
        fz0 fz0Var;
        if (z10 || org.telegram.messenger.g0.H3(str)) {
            f9 f9Var = this.y0;
            if (i7 == 0 || i7 == 2) {
                org.telegram.ui.Components.c5.o0(f9Var.f, str, true, true, true, (!(characterStyle instanceof u41) || (fz0Var = ((u41) characterStyle).a) == null || (fz0Var.a & 1024) == 0) ? false : true, null, null, this.z0);
                return;
            } else {
                if (i7 == 1) {
                    org.telegram.ui.Components.c5.o0(f9Var.f, str, true, true, false, false, null, null, this.z0);
                    return;
                }
                return;
            }
        }
        if (i7 == 0) {
            vf.c.r(getContext(), Uri.parse(str), true, true, null);
        } else if (i7 == 1) {
            vf.c.r(getContext(), Uri.parse(str), false, false, null);
        } else if (i7 == 2) {
            vf.c.r(getContext(), Uri.parse(str), false, true, null);
        }
    }
}
