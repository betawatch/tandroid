package fi;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ t1(z3 z3Var, int i7) {
        this.a = i7;
        this.b = z3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0398  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder W2;
        boolean z10;
        o6 o6Var;
        int i7 = this.a;
        z3 z3Var = this.b;
        switch (i7) {
            case 0:
                f9 f9Var = z3Var.t0;
                f9Var.r();
                org.telegram.messenger.g0.h3(new e3(f9Var, 1), 30L);
                break;
            case 1:
                z3Var.v0.q(!r1.g0, true);
                break;
            case 2:
                c3 c3Var = z3Var.M0;
                TL_stories.StoryItem storyItem = z3Var.y1.a;
                if (storyItem != null) {
                    if (z3Var.m1) {
                        z3Var.D0(storyItem.privacy.isEmpty() ? new hi.n8(3, z3Var.m2, new ArrayList()) : new hi.n8(z3Var.m2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (z3Var.p0 == null) {
                            hi.l3 l3Var = new hi.l3(z3Var.getContext(), 1);
                            l3Var.r(true);
                            l3Var.L = Layout.Alignment.ALIGN_CENTER;
                            l3Var.r0 = new r1(z3Var, 9);
                            z3Var.p0 = l3Var;
                            l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            c3Var.addView(z3Var.p0, ma.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User c22 = mp.u1(z3Var.m2).c2(Long.valueOf(z3Var.l1));
                        if (c22 != null) {
                            String str = c22.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                z3Var.p0.n(15.0f, 8.0f, 15.0f, 8.0f);
                                W2 = org.telegram.messenger.g0.W2(gd.a0("StoryCloseFriendsHint", null, 2131744465, str));
                            } else if (storyItem.contacts) {
                                z3Var.p0.n(11.0f, 6.0f, 11.0f, 7.0f);
                                W2 = org.telegram.messenger.g0.W2(gd.a0("StoryContactsHint", null, 2131744461, str));
                                z10 = false;
                                CharSequence m10 = org.telegram.messenger.j6.m(W2, z3Var.p0.getTextPaint().getFontMetricsInt(), false, null, 0);
                                hi.l3 l3Var2 = z3Var.p0;
                                l3Var2.h = !z10 ? hi.l3.a(m10, l3Var2.getTextPaint()) : c3Var.getMeasuredWidth();
                                z3Var.p0.v(m10);
                                z3Var.p0.o(1.0f, (-(c3Var.getWidth() - z3Var.m0.getCenterX())) / org.telegram.messenger.g0.p);
                                f9 f9Var2 = ((w8) z3Var.A1).d;
                                f9Var2.i1 = true;
                                f9Var2.V();
                                if (z3Var.p0.W) {
                                    org.telegram.messenger.q2.e.a();
                                }
                                z3Var.p0.x();
                                break;
                            } else if (storyItem.selected_contacts) {
                                z3Var.p0.n(15.0f, 8.0f, 15.0f, 8.0f);
                                W2 = org.telegram.messenger.g0.W2(gd.a0("StorySelectedContactsHint", null, 2131744238, str));
                            }
                            z10 = true;
                            CharSequence m102 = org.telegram.messenger.j6.m(W2, z3Var.p0.getTextPaint().getFontMetricsInt(), false, null, 0);
                            hi.l3 l3Var22 = z3Var.p0;
                            l3Var22.h = !z10 ? hi.l3.a(m102, l3Var22.getTextPaint()) : c3Var.getMeasuredWidth();
                            z3Var.p0.v(m102);
                            z3Var.p0.o(1.0f, (-(c3Var.getWidth() - z3Var.m0.getCenterX())) / org.telegram.messenger.g0.p);
                            f9 f9Var22 = ((w8) z3Var.A1).d;
                            f9Var22.i1 = true;
                            f9Var22.V();
                            if (z3Var.p0.W) {
                            }
                            z3Var.p0.x();
                        }
                    }
                }
                break;
            case 3:
                org.telegram.messenger.t0.u();
                boolean z11 = org.telegram.messenger.s2.a;
                org.telegram.messenger.t0.r();
                vf.c.t(z3Var.getContext(), org.telegram.messenger.s2.g);
                break;
            case 4:
                x3 x3Var = z3Var.y1;
                if (x3Var != null && (o6Var = x3Var.b) != null) {
                    o6Var.J = false;
                    o6Var.d = false;
                    o6Var.h = 0.0f;
                    o6Var.r = 0.0f;
                    o6Var.n = 0.0f;
                    if (o6Var.e != null) {
                        try {
                            new File(o6Var.e).delete();
                            o6Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    o6Var.d();
                    z3Var.d1(false);
                    break;
                }
                break;
            case 5:
                c1 c1Var = c1.X;
                if (c1Var != null) {
                    boolean o4 = c1Var.o();
                    c1 c1Var2 = c1.X;
                    boolean z12 = !o4;
                    if (c1Var2.n && c1Var2.r != z12) {
                        c1Var2.r = z12;
                        NativeInstance nativeInstance = c1Var2.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                    z3Var.K1.b(z12, true);
                    break;
                }
                break;
            case 6:
                a2 a2Var = z3Var.v0;
                if (!z3Var.B0(false)) {
                    di.y8 y10 = di.y8.y(z3Var.m2, false);
                    if (y10.e && y10.f.amount <= 0) {
                        a2Var.k(z3Var.B0(false));
                        break;
                    } else {
                        a2Var.p();
                        break;
                    }
                } else {
                    a2Var.k(z3Var.B0(false));
                    break;
                }
                break;
            case 7:
                Context context = z3Var.getContext();
                org.telegram.ui.ActionBar.h6 h6Var = z3Var.l0;
                org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, h6Var, false);
                w2Var.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, h6Var));
                LinearLayout linearLayout = new LinearLayout(z3Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                q9 q9Var = new q9(z3Var.getContext());
                q9Var.getImageReceiver().W(1);
                ri.d0(z3Var.m2).h2(q9Var, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(q9Var, ma.t(ks.g2, ks.g2, 1, 0, 16, 0, 16));
                TextView textView = new TextView(z3Var.getContext());
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var);
                i5.c.r(20.0f, 1, 2131744265, textView, null);
                linearLayout.addView(textView, ma.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(z3Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.r5, h6Var);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(org.telegram.messenger.g0.W2(gd.N0(2131744264, null)));
                linearLayout.addView(textView2, ma.t(-1, -2, 1, 32, 9, 32, 19));
                hi.e eVar = new hi.e(z3Var.getContext(), h6Var, true);
                eVar.i(gd.N0(2131744268, null), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                nq nqVar = new nq(R.drawable.mini_switch_lock, 0);
                nqVar.n = 1;
                spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
                eVar.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) gd.N0(2131747577, null)), false);
                linearLayout.addView(eVar, ma.r(-1, 48, 1));
                eVar.setOnClickListener(new ai.x2(19, z3Var, w2Var));
                w2Var.O = linearLayout;
                ((w8) z3Var.A1).h(w2Var);
                r3 r3Var = z3Var.d1;
                if (r3Var != null) {
                    r3Var.a();
                    break;
                }
                break;
            case 8:
                if (z3Var.U2) {
                    n5.J0();
                } else {
                    ((w8) z3Var.A1).h(new n5(z3Var.getContext(), z3Var.M0.getY() + z3Var.getY(), 0, z3Var.l0));
                }
                r3 r3Var2 = z3Var.d1;
                if (r3Var2 != null) {
                    r3Var2.a();
                    break;
                }
                break;
            case 9:
                ((w8) z3Var.A1).h(new n5(z3Var.getContext(), z3Var.M0.getY() + z3Var.getY(), 0, z3Var.l0));
                r3 r3Var3 = z3Var.d1;
                if (r3Var3 != null) {
                    r3Var3.a();
                    break;
                }
                break;
            case 10:
                g3 g3Var = z3Var.u0;
                boolean z13 = g3Var.w0;
                t9 t9Var = g3Var.a0;
                if (!z13) {
                    z3Var.R2 = true;
                    g3Var.E(false);
                    break;
                } else if (!t9Var.x()) {
                    g3Var.D();
                    break;
                } else if (t9Var.x() && Math.abs(g3Var.h0 - g3Var.j0) < org.telegram.messenger.g0.e && Math.abs(g3Var.i0 - g3Var.k0) < org.telegram.messenger.g0.e) {
                    w9 w9Var = t9Var.n(g3Var.getContext()).r;
                    w9Var.l();
                    if (!w9Var.i && w9Var.e) {
                        w9Var.f(false);
                        break;
                    }
                }
                break;
            case 11:
                z3Var.W0(true);
                break;
            case 12:
                z3Var.c1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = z3Var.y1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    z3Var.l0(new r1(z3Var, 10));
                    break;
                } else {
                    z3Var.J0(null);
                    break;
                }
                break;
        }
    }
}
