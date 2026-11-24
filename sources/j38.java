// default package

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class j38 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a58 b;

    public /* synthetic */ j38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0384  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder S2;
        boolean z;
        g4b g4bVar;
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                oab oabVar = a58Var.z0;
                oabVar.m();
                gm.d3(new j48(oabVar, (byte) 1), 30L);
                break;
            case 1:
                a58Var.B0.p(!r0.g0, true);
                break;
            case 2:
                g48 g48Var = a58Var.S0;
                TL_stories.StoryItem storyItem = a58Var.E1.a;
                if (storyItem != null) {
                    if (a58Var.s1) {
                        boolean isEmpty = storyItem.privacy.isEmpty();
                        int i = a58Var.s2;
                        a58Var.x0(isEmpty ? new y7b(3, i, new ArrayList()) : new y7b(i, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (a58Var.v0 == null) {
                            hg5 hg5Var = new hg5(a58Var.getContext(), 1);
                            hg5Var.p(true);
                            hg5Var.L = Layout.Alignment.ALIGN_CENTER;
                            hg5Var.r0 = new h38(a58Var, (byte) 9);
                            a58Var.v0 = hg5Var;
                            hg5Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            g48Var.addView(a58Var.v0, qoe.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User W1 = oc7.r1(a58Var.s2).W1(Long.valueOf(a58Var.r1));
                        if (W1 != null) {
                            String str = W1.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                a58Var.v0.m(15.0f, 8.0f, 15.0f, 8.0f);
                                S2 = gm.S2(jb6.a0("StoryCloseFriendsHint", null, 2131744392, str));
                            } else if (storyItem.contacts) {
                                a58Var.v0.m(11.0f, 6.0f, 11.0f, 7.0f);
                                S2 = gm.S2(jb6.a0("StoryContactsHint", null, 2131744388, str));
                                z = false;
                                CharSequence m = gw3.m(S2, a58Var.v0.getTextPaint().getFontMetricsInt(), false, null, 0);
                                hg5 hg5Var2 = a58Var.v0;
                                hg5Var2.h = !z ? hg5.a(m, hg5Var2.getTextPaint()) : g48Var.getMeasuredWidth();
                                a58Var.v0.t(m);
                                a58Var.v0.n(1.0f, (-(g48Var.getWidth() - a58Var.s0.getCenterX())) / gm.p);
                                oab oabVar2 = ((fab) a58Var.G1).d;
                                oabVar2.i1 = true;
                                oabVar2.U();
                                if (a58Var.v0.W) {
                                    xx0.e.a();
                                }
                                a58Var.v0.v();
                                break;
                            } else if (storyItem.selected_contacts) {
                                a58Var.v0.m(15.0f, 8.0f, 15.0f, 8.0f);
                                S2 = gm.S2(jb6.a0("StorySelectedContactsHint", null, 2131744165, str));
                            }
                            z = true;
                            CharSequence m2 = gw3.m(S2, a58Var.v0.getTextPaint().getFontMetricsInt(), false, null, 0);
                            hg5 hg5Var22 = a58Var.v0;
                            hg5Var22.h = !z ? hg5.a(m2, hg5Var22.getTextPaint()) : g48Var.getMeasuredWidth();
                            a58Var.v0.t(m2);
                            a58Var.v0.n(1.0f, (-(g48Var.getWidth() - a58Var.s0.getCenterX())) / gm.p);
                            oab oabVar22 = ((fab) a58Var.G1).d;
                            oabVar22.i1 = true;
                            oabVar22.U();
                            if (a58Var.v0.W) {
                            }
                            a58Var.v0.v();
                        }
                    }
                }
                break;
            case 3:
                a.t();
                boolean z2 = e21.a;
                a.q();
                l11.u(a58Var.getContext(), e21.g);
                break;
            case 4:
                z48 z48Var = a58Var.E1;
                if (z48Var != null && (g4bVar = z48Var.b) != null) {
                    g4bVar.J = false;
                    g4bVar.d = false;
                    g4bVar.h = 0.0f;
                    g4bVar.r = 0.0f;
                    g4bVar.n = 0.0f;
                    if (g4bVar.e != null) {
                        try {
                            new File(g4bVar.e).delete();
                            g4bVar.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    g4bVar.d();
                    a58Var.c1(false);
                    break;
                }
                break;
            case 5:
                s96 s96Var = s96.N;
                if (s96Var != null) {
                    boolean z3 = !s96Var.r();
                    s96.N.D(z3);
                    a58Var.Q1.b(z3, true);
                    break;
                }
                break;
            case 6:
                n38 n38Var = a58Var.B0;
                if (!a58Var.v0(false)) {
                    jva v = jva.v(a58Var.s2, false);
                    if (v.e && v.f.amount <= 0) {
                        n38Var.j(a58Var.v0(false));
                        break;
                    } else {
                        n38Var.o();
                        break;
                    }
                } else {
                    n38Var.j(a58Var.v0(false));
                    break;
                }
                break;
            case 7:
                Context context = a58Var.getContext();
                r63 r63Var = a58Var.r0;
                my0 my0Var = new my0(1, (ylb) r63Var, context, false);
                my0Var.K(cmb.v0(cmb.g5, r63Var));
                LinearLayout linearLayout = new LinearLayout(a58Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
                bf0 bf0Var = new bf0(a58Var.getContext());
                bf0Var.getImageReceiver().M(1);
                hs6.d0(a58Var.s2).e2(bf0Var, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(bf0Var, qoe.t(nm7.f2, nm7.f2, 1, 0, 16, 0, 16));
                TextView textView = new TextView(a58Var.getContext());
                textView.setTypeface(gm.o());
                textView.setGravity(17);
                anb.X(textView, cmb.i5, r63Var);
                ts2.q(20.0f, 1, 2131744192, textView, null);
                linearLayout.addView(textView, qoe.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(a58Var.getContext());
                textView2.setGravity(17);
                anb.X(textView2, cmb.q5, r63Var);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(gm.S2(jb6.M0(2131744191, null)));
                linearLayout.addView(textView2, qoe.t(-1, -2, 1, 32, 9, 32, 19));
                b61 b61Var = new b61(r63Var, a58Var.getContext(), true);
                b61Var.i(jb6.M0(2131744195, null), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                pn2 pn2Var = new pn2(R.drawable.mini_switch_lock, 0);
                pn2Var.n = 1;
                spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
                b61Var.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) jb6.M0(2131747504, null)), false);
                linearLayout.addView(b61Var, qoe.r(-1, 48, 1));
                b61Var.setOnClickListener(new n06(a58Var, my0Var, (byte) 15));
                my0Var.O = linearLayout;
                ((fab) a58Var.G1).h(my0Var);
                v48 v48Var = a58Var.j1;
                if (v48Var != null) {
                    v48Var.a();
                    break;
                }
                break;
            case 8:
                if (a58Var.a3) {
                    h0b.D0();
                } else {
                    ((fab) a58Var.G1).h(new h0b(a58Var.getContext(), a58Var.S0.getY() + a58Var.getY(), 0, a58Var.r0));
                }
                v48 v48Var2 = a58Var.j1;
                if (v48Var2 != null) {
                    v48Var2.a();
                    break;
                }
                break;
            case 9:
                a58Var.getClass();
                ((fab) a58Var.G1).h(new h0b(a58Var.getContext(), a58Var.S0.getY() + a58Var.getY(), 0, a58Var.r0));
                v48 v48Var3 = a58Var.j1;
                if (v48Var3 != null) {
                    v48Var3.a();
                    break;
                }
                break;
            case 10:
                l48 l48Var = a58Var.A0;
                boolean z4 = l48Var.v0;
                pkb pkbVar = l48Var.W;
                if (!z4) {
                    a58Var.X2 = true;
                    l48Var.E(false);
                    break;
                } else if (!pkbVar.w()) {
                    l48Var.D();
                    break;
                } else if (pkbVar.w() && Math.abs(l48Var.g0 - l48Var.i0) < gm.e && Math.abs(l48Var.h0 - l48Var.j0) < gm.e) {
                    skb skbVar = pkbVar.m(l48Var.getContext()).r;
                    skbVar.k();
                    if (!skbVar.i && skbVar.e) {
                        skbVar.e(false);
                        break;
                    }
                }
                break;
            case 11:
                a58Var.T0(true);
                break;
            case 12:
                a58Var.b1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = a58Var.E1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    a58Var.d0(new h38(a58Var, (byte) 10));
                    break;
                } else {
                    a58Var.E0(null);
                    break;
                }
                break;
        }
    }
}
