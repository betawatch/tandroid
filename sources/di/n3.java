package di;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import bi.eb;
import java.net.URLDecoder;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.kp;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.rc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n3 extends i8 {
    public final /* synthetic */ q9 x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 y0;
    public final /* synthetic */ j4 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(j4 j4Var, Context context, b bVar, q9 q9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, bVar);
        this.z0 = j4Var;
        this.x0 = q9Var;
        this.y0 = g6Var;
    }

    @Override // di.i8
    public final void F(org.telegram.ui.Components.r5 r5Var) {
        if (r5Var != null) {
            j4 j4Var = this.z0;
            if (j4Var.z1 == null) {
                return;
            }
            TLRPC.Document document = r5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.i5.e(j4Var.l2, r5Var.documentId);
            }
            if (document == null) {
                return;
            }
            j3 j3Var = j4Var.L0;
            org.telegram.ui.ActionBar.g6 g6Var = this.y0;
            cc h = new hc(j3Var, g6Var).h(document, 2, new bi.v3(this, this.x0, g6Var, 1));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // di.i8
    public final void G(CharacterStyle characterStyle, View view) {
        q9 q9Var = this.x0;
        org.telegram.ui.ActionBar.f2 f2Var = q9Var.f;
        boolean z9 = characterStyle instanceof f41;
        j4 j4Var = this.z0;
        if (z9) {
            TLRPC.User a22 = qp.s1(j4Var.l2).a2(Utilities.A(((f41) characterStyle).getURL()));
            if (a22 != null) {
                qp.s1(j4Var.l2).z3(a22, null, f2Var, 0);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof c41)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof e41);
                return;
            }
            if (characterStyle instanceof b41) {
                b41 b41Var = (b41) characterStyle;
                org.telegram.messenger.g0.g(b41Var.a.subSequence(b41Var.b, b41Var.c).toString());
                org.telegram.messenger.camera.q.r(null, 2131744194, new hc(j4Var.L0, this.y0));
                return;
            } else {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            }
        }
        String url = ((c41) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                q9Var.N(new s20(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            q9Var.N(new v80(bundle, null));
            return;
        }
        String c10 = vf.c.c(url);
        if (c10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = c10.toLowerCase();
        if (url.startsWith("@")) {
            qp.s1(j4Var.l2).y3(lowerCase, f2Var, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // di.i8
    public final void H(final URLSpan uRLSpan, final View view, f8 f8Var) {
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
        org.telegram.ui.ActionBar.g6 g6Var = this.y0;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, g6Var, false);
        l10.O = str;
        l10.P = false;
        l10.Q = true;
        j4 j4Var = this.z0;
        h4 h4Var = j4Var.x1;
        CharSequence[] charSequenceArr = (h4Var == null || h4Var.d()) ? new CharSequence[]{id.M0(2131747817, null), id.M0(2131751767, null)} : new CharSequence[]{id.M0(2131747817, null)};
        final org.telegram.ui.ActionBar.g6 g6Var2 = this.y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: di.m3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                n3 n3Var = n3.this;
                if (i7 == 0) {
                    n3Var.G(uRLSpan, view);
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.g(url);
                    new hc(n3Var.z0.L0, g6Var2).k(false).j();
                }
            }
        };
        l10.L = charSequenceArr;
        l10.K = onClickListener;
        l10.H0 = new eb(f8Var, 3);
        l10.O(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, g6Var));
        ((h9) j4Var.z1).h(l10);
    }

    @Override // di.i8
    public final void I(c8 c8Var) {
        if (c8Var == null) {
            return;
        }
        final TLRPC.Document document = c8Var.g;
        final int i7 = 1;
        j4 j4Var = this.z0;
        q9 q9Var = this.x0;
        final org.telegram.ui.ActionBar.g6 g6Var = this.y0;
        if (document != null) {
            l60 F = l60.F(q9Var.w, g6Var, j4Var.t0);
            F.i = 3;
            F.a0(-org.telegram.messenger.g0.L(8.0f), 0.0f);
            final int i10 = 0;
            F.l(R.drawable.msg_saved, id.M0(2131744722, null), new Runnable(this) { // from class: di.k3
                public final /* synthetic */ n3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i10;
                    org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    TLRPC.Document document2 = document;
                    n3 n3Var = this.b;
                    switch (i11) {
                        case 0:
                            j4 j4Var2 = n3Var.z0;
                            gz C = gz.C(j4Var2.l2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = p10.i(j4Var2.l2).e();
                            h4 h4Var = j4Var2.x1;
                            C.r0(ez.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, h4Var != null ? h4Var.a : null, null, false));
                            new hc(j4Var2.L0, g6Var2).Q(R.raw.saved_messages, 36, org.telegram.messenger.g0.S2(id.M0(2131744721, null), -1, 2, new rc(21), null)).k(true);
                            break;
                        default:
                            j4 j4Var3 = n3Var.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().Q0 != null && MediaController.B().Q0.b == p10.i(j4Var3.l2).e()) {
                                kp kpVar = MediaController.B().Q0;
                                kpVar.c.add(0, kpVar.d(document2));
                                kpVar.e();
                            }
                            ConnectionsManager.getInstance(j4Var3.l2).sendRequest(tL_account_saveMusic, null);
                            new hc(j4Var3.L0, g6Var2).Q(R.raw.ic_save_to_music, 36, id.M0(2131744723, null)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, id.M0(2131744724, null), new Runnable(this) { // from class: di.k3
                public final /* synthetic */ n3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i7;
                    org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    TLRPC.Document document2 = document;
                    n3 n3Var = this.b;
                    switch (i11) {
                        case 0:
                            j4 j4Var2 = n3Var.z0;
                            gz C = gz.C(j4Var2.l2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = p10.i(j4Var2.l2).e();
                            h4 h4Var = j4Var2.x1;
                            C.r0(ez.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, h4Var != null ? h4Var.a : null, null, false));
                            new hc(j4Var2.L0, g6Var2).Q(R.raw.saved_messages, 36, org.telegram.messenger.g0.S2(id.M0(2131744721, null), -1, 2, new rc(21), null)).k(true);
                            break;
                        default:
                            j4 j4Var3 = n3Var.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().Q0 != null && MediaController.B().Q0.b == p10.i(j4Var3.l2).e()) {
                                kp kpVar = MediaController.B().Q0;
                                kpVar.c.add(0, kpVar.d(document2));
                                kpVar.e();
                            }
                            ConnectionsManager.getInstance(j4Var3.l2).sendRequest(tL_account_saveMusic, null);
                            new hc(j4Var3.L0, g6Var2).Q(R.raw.ic_save_to_music, 36, id.M0(2131744723, null)).k(true);
                            break;
                    }
                }
            }, false);
            F.Z();
            return;
        }
        if (c8Var.e && c8Var.b != null && c8Var.d != null) {
            Bundle bundle = new Bundle();
            if (c8Var.b.longValue() >= 0) {
                bundle.putLong("user_id", c8Var.b.longValue());
            } else {
                bundle.putLong("chat_id", -c8Var.b.longValue());
            }
            bundle.putInt("message_id", c8Var.d.intValue());
            q9Var.N(new cn(bundle));
            return;
        }
        if (c8Var.b == null || c8Var.c == null) {
            cc Q = new hc(j4Var.L0, g6Var).Q(R.raw.error, 36, id.M0(2131744664, null));
            Q.a = 3;
            Q.k(true);
        } else {
            qp.s1(j4Var.l2).P1().g0(c8Var.c.intValue(), c8Var.b.longValue(), new s2(this, c8Var, q9Var, g6Var, 1));
        }
    }

    public final void M(int i7, String str, CharacterStyle characterStyle, boolean z9) {
        vy0 vy0Var;
        if (z9 || org.telegram.messenger.g0.J3(str)) {
            q9 q9Var = this.x0;
            if (i7 == 0 || i7 == 2) {
                org.telegram.ui.Components.v4.o0(q9Var.f, str, true, true, true, (!(characterStyle instanceof e41) || (vy0Var = ((e41) characterStyle).a) == null || (vy0Var.a & 1024) == 0) ? false : true, null, null, this.y0);
                return;
            } else {
                if (i7 == 1) {
                    org.telegram.ui.Components.v4.o0(q9Var.f, str, true, true, false, false, null, null, this.y0);
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
