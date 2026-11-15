package fi;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import java.net.URLDecoder;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.y80;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i3 extends a8 {
    public final /* synthetic */ b4 A0;
    public final /* synthetic */ i9 y0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(b4 b4Var, Context context, b bVar, i9 i9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, bVar);
        this.A0 = b4Var;
        this.y0 = i9Var;
        this.z0 = e6Var;
    }

    @Override // fi.a8
    public final void F(org.telegram.ui.Components.p5 p5Var) {
        if (p5Var != null) {
            b4 b4Var = this.A0;
            if (b4Var.A1 == null) {
                return;
            }
            TLRPC.Document document = p5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.g5.e(b4Var.m2, p5Var.documentId);
            }
            if (document == null) {
                return;
            }
            e3 e3Var = b4Var.M0;
            org.telegram.ui.ActionBar.e6 e6Var = this.z0;
            xb h = new cc(e3Var, e6Var).h(document, 2, new bi.j(this, this.y0, e6Var, 3));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // fi.a8
    public final void G(CharacterStyle characterStyle, View view) {
        i9 i9Var = this.y0;
        org.telegram.ui.ActionBar.e2 e2Var = i9Var.f;
        boolean z10 = characterStyle instanceof i41;
        b4 b4Var = this.A0;
        if (z10) {
            TLRPC.User a22 = np.s1(b4Var.m2).a2(Utilities.A(((i41) characterStyle).getURL()));
            if (a22 != null) {
                np.s1(b4Var.m2).z3(a22, null, e2Var, 0);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof f41)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof h41);
                return;
            }
            if (characterStyle instanceof e41) {
                e41 e41Var = (e41) characterStyle;
                org.telegram.messenger.g0.g(e41Var.a.subSequence(e41Var.b, e41Var.c).toString());
                i20.s(null, 2131744194, new cc(b4Var.M0, this.z0));
                return;
            } else {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            }
        }
        String url = ((f41) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                i9Var.N(new u20(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            i9Var.N(new y80(bundle, null));
            return;
        }
        String c10 = vf.c.c(url);
        if (c10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = c10.toLowerCase();
        if (url.startsWith("@")) {
            np.s1(b4Var.m2).y3(lowerCase, e2Var, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // fi.a8
    public final void H(final URLSpan uRLSpan, final View view, c1 c1Var) {
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
        org.telegram.ui.ActionBar.e6 e6Var = this.z0;
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        k10.P = str;
        k10.Q = false;
        k10.R = true;
        b4 b4Var = this.A0;
        z3 z3Var = b4Var.y1;
        CharSequence[] charSequenceArr = (z3Var == null || z3Var.d()) ? new CharSequence[]{hd.M0(2131747817, null), hd.M0(2131751767, null)} : new CharSequence[]{hd.M0(2131747817, null)};
        final org.telegram.ui.ActionBar.e6 e6Var2 = this.z0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: fi.h3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                i3 i3Var = i3.this;
                if (i7 == 0) {
                    i3Var.G(uRLSpan, view);
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.g(url);
                    new cc(i3Var.A0.M0, e6Var2).k(false).j();
                }
            }
        };
        k10.M = charSequenceArr;
        k10.L = onClickListener;
        k10.I0 = new di.q9(c1Var, 3);
        k10.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, e6Var));
        ((z8) b4Var.A1).h(k10);
    }

    @Override // fi.a8
    public final void I(v7 v7Var) {
        if (v7Var == null) {
            return;
        }
        final TLRPC.Document document = v7Var.g;
        final int i7 = 1;
        b4 b4Var = this.A0;
        i9 i9Var = this.y0;
        final org.telegram.ui.ActionBar.e6 e6Var = this.z0;
        if (document != null) {
            m60 F = m60.F(i9Var.w, e6Var, b4Var.u0);
            F.i = 3;
            F.a0(-org.telegram.messenger.g0.L(8.0f), 0.0f);
            final int i10 = 0;
            F.l(R.drawable.msg_saved, hd.M0(2131744722, null), new Runnable(this) { // from class: fi.f3
                public final /* synthetic */ i3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i10;
                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    TLRPC.Document document2 = document;
                    i3 i3Var = this.b;
                    switch (i11) {
                        case 0:
                            b4 b4Var2 = i3Var.A0;
                            ez C = ez.C(b4Var2.m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = m10.i(b4Var2.m2).e();
                            z3 z3Var = b4Var2.y1;
                            C.r0(cz.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, z3Var != null ? z3Var.a : null, null, false));
                            new cc(b4Var2.M0, e6Var2).Q(R.raw.saved_messages, 36, org.telegram.messenger.g0.S2(hd.M0(2131744721, null), -1, 2, new org.telegram.messenger.c6(25), null)).k(true);
                            break;
                        default:
                            b4 b4Var3 = i3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.b == m10.i(b4Var3.m2).e()) {
                                hp hpVar = MediaController.B().R0;
                                hpVar.c.add(0, hpVar.d(document2));
                                hpVar.e();
                            }
                            ConnectionsManager.getInstance(b4Var3.m2).sendRequest(tL_account_saveMusic, null);
                            new cc(b4Var3.M0, e6Var2).Q(R.raw.ic_save_to_music, 36, hd.M0(2131744723, null)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, hd.M0(2131744724, null), new Runnable(this) { // from class: fi.f3
                public final /* synthetic */ i3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i7;
                    org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                    TLRPC.Document document2 = document;
                    i3 i3Var = this.b;
                    switch (i11) {
                        case 0:
                            b4 b4Var2 = i3Var.A0;
                            ez C = ez.C(b4Var2.m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = m10.i(b4Var2.m2).e();
                            z3 z3Var = b4Var2.y1;
                            C.r0(cz.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, z3Var != null ? z3Var.a : null, null, false));
                            new cc(b4Var2.M0, e6Var2).Q(R.raw.saved_messages, 36, org.telegram.messenger.g0.S2(hd.M0(2131744721, null), -1, 2, new org.telegram.messenger.c6(25), null)).k(true);
                            break;
                        default:
                            b4 b4Var3 = i3Var.A0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().R0 != null && MediaController.B().R0.b == m10.i(b4Var3.m2).e()) {
                                hp hpVar = MediaController.B().R0;
                                hpVar.c.add(0, hpVar.d(document2));
                                hpVar.e();
                            }
                            ConnectionsManager.getInstance(b4Var3.m2).sendRequest(tL_account_saveMusic, null);
                            new cc(b4Var3.M0, e6Var2).Q(R.raw.ic_save_to_music, 36, hd.M0(2131744723, null)).k(true);
                            break;
                    }
                }
            }, false);
            F.Z();
            return;
        }
        if (v7Var.e && v7Var.b != null && v7Var.d != null) {
            Bundle bundle = new Bundle();
            if (v7Var.b.longValue() >= 0) {
                bundle.putLong("user_id", v7Var.b.longValue());
            } else {
                bundle.putLong("chat_id", -v7Var.b.longValue());
            }
            bundle.putInt("message_id", v7Var.d.intValue());
            i9Var.N(new an(bundle));
            return;
        }
        if (v7Var.b == null || v7Var.c == null) {
            xb Q = new cc(b4Var.M0, e6Var).Q(R.raw.error, 36, hd.M0(2131744664, null));
            Q.a = 3;
            Q.k(true);
        } else {
            np.s1(b4Var.m2).P1().g0(v7Var.c.intValue(), v7Var.b.longValue(), new bi.o1(this, v7Var, i9Var, e6Var, 2));
        }
    }

    public final void M(int i7, String str, CharacterStyle characterStyle, boolean z10) {
        wy0 wy0Var;
        if (z10 || org.telegram.messenger.g0.I3(str)) {
            i9 i9Var = this.y0;
            if (i7 == 0 || i7 == 2) {
                org.telegram.ui.Components.t4.o0(i9Var.f, str, true, true, true, (!(characterStyle instanceof h41) || (wy0Var = ((h41) characterStyle).a) == null || (wy0Var.a & 1024) == 0) ? false : true, null, null, this.z0);
                return;
            } else {
                if (i7 == 1) {
                    org.telegram.ui.Components.t4.o0(i9Var.f, str, true, true, false, false, null, null, this.z0);
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
