package di;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ea;
import c8.ha;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ y1(i4 i4Var, int i7) {
        this.a = i7;
        this.b = i4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0398  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder X2;
        boolean z9;
        x6 x6Var;
        int i7 = this.a;
        i4 i4Var = this.b;
        switch (i7) {
            case 0:
                p9 p9Var = i4Var.s0;
                p9Var.r();
                org.telegram.messenger.g0.i3(new l3(p9Var, 1), 30L);
                break;
            case 1:
                i4Var.u0.q(!r1.f0, true);
                break;
            case 2:
                j3 j3Var = i4Var.L0;
                TL_stories.StoryItem storyItem = i4Var.x1.a;
                if (storyItem != null) {
                    if (i4Var.l1) {
                        i4Var.D0(storyItem.privacy.isEmpty() ? new fi.q8(3, i4Var.l2, new ArrayList()) : new fi.q8(i4Var.l2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (i4Var.o0 == null) {
                            fi.m3 m3Var = new fi.m3(i4Var.getContext(), 1);
                            m3Var.r(true);
                            m3Var.K = Layout.Alignment.ALIGN_CENTER;
                            m3Var.q0 = new w1(i4Var, 9);
                            i4Var.o0 = m3Var;
                            m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            j3Var.addView(i4Var.o0, ha.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User a22 = qp.s1(i4Var.l2).a2(Long.valueOf(i4Var.k1));
                        if (a22 != null) {
                            String str = a22.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                i4Var.o0.n(15.0f, 8.0f, 15.0f, 8.0f);
                                X2 = org.telegram.messenger.g0.X2(hd.a0("StoryCloseFriendsHint", null, 2131744707, str));
                            } else if (storyItem.contacts) {
                                i4Var.o0.n(11.0f, 6.0f, 11.0f, 7.0f);
                                X2 = org.telegram.messenger.g0.X2(hd.a0("StoryContactsHint", null, 2131744703, str));
                                z9 = false;
                                CharSequence m10 = org.telegram.messenger.i6.m(X2, i4Var.o0.getTextPaint().getFontMetricsInt(), false, null, 0);
                                fi.m3 m3Var2 = i4Var.o0;
                                m3Var2.h = !z9 ? fi.m3.a(m10, m3Var2.getTextPaint()) : j3Var.getMeasuredWidth();
                                i4Var.o0.u(m10);
                                i4Var.o0.o(1.0f, (-(j3Var.getWidth() - i4Var.l0.getCenterX())) / org.telegram.messenger.g0.p);
                                p9 p9Var2 = ((g9) i4Var.z1).d;
                                p9Var2.h1 = true;
                                p9Var2.V();
                                if (i4Var.o0.V) {
                                    org.telegram.messenger.p2.e.a();
                                }
                                i4Var.o0.w();
                                break;
                            } else if (storyItem.selected_contacts) {
                                i4Var.o0.n(15.0f, 8.0f, 15.0f, 8.0f);
                                X2 = org.telegram.messenger.g0.X2(hd.a0("StorySelectedContactsHint", null, 2131744480, str));
                            }
                            z9 = true;
                            CharSequence m102 = org.telegram.messenger.i6.m(X2, i4Var.o0.getTextPaint().getFontMetricsInt(), false, null, 0);
                            fi.m3 m3Var22 = i4Var.o0;
                            m3Var22.h = !z9 ? fi.m3.a(m102, m3Var22.getTextPaint()) : j3Var.getMeasuredWidth();
                            i4Var.o0.u(m102);
                            i4Var.o0.o(1.0f, (-(j3Var.getWidth() - i4Var.l0.getCenterX())) / org.telegram.messenger.g0.p);
                            p9 p9Var22 = ((g9) i4Var.z1).d;
                            p9Var22.h1 = true;
                            p9Var22.V();
                            if (i4Var.o0.V) {
                            }
                            i4Var.o0.w();
                        }
                    }
                }
                break;
            case 3:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.r2.a;
                org.telegram.messenger.t0.r();
                vf.c.t(i4Var.getContext(), org.telegram.messenger.r2.g);
                break;
            case 4:
                g4 g4Var = i4Var.x1;
                if (g4Var != null && (x6Var = g4Var.b) != null) {
                    x6Var.I = false;
                    x6Var.d = false;
                    x6Var.h = 0.0f;
                    x6Var.r = 0.0f;
                    x6Var.n = 0.0f;
                    if (x6Var.e != null) {
                        try {
                            new File(x6Var.e).delete();
                            x6Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    x6Var.d();
                    i4Var.d1(false);
                    break;
                }
                break;
            case 5:
                g1 g1Var = g1.W;
                if (g1Var != null) {
                    boolean o4 = g1Var.o();
                    g1 g1Var2 = g1.W;
                    boolean z11 = !o4;
                    if (g1Var2.n && g1Var2.r != z11) {
                        g1Var2.r = z11;
                        NativeInstance nativeInstance = g1Var2.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                    i4Var.J1.b(z11, true);
                    break;
                }
                break;
            case 6:
                g2 g2Var = i4Var.u0;
                if (!i4Var.B0(false)) {
                    ea y10 = ea.y(i4Var.l2, false);
                    if (y10.e && y10.f.amount <= 0) {
                        g2Var.k(i4Var.B0(false));
                        break;
                    } else {
                        g2Var.p();
                        break;
                    }
                } else {
                    g2Var.k(i4Var.B0(false));
                    break;
                }
                break;
            case 7:
                Context context = i4Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = i4Var.k0;
                org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, context, f6Var, false);
                v2Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, f6Var));
                LinearLayout linearLayout = new LinearLayout(i4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(i4Var.getContext());
                l9Var.getImageReceiver().W(1);
                ui.b0(i4Var.l2).c2(l9Var, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(l9Var, ha.t(qs.g2, qs.g2, 1, 0, 16, 0, 16));
                TextView textView = new TextView(i4Var.getContext());
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var);
                jg.g.v(textView, 1, 20.0f, null, 2131744507);
                linearLayout.addView(textView, ha.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(i4Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r5, f6Var);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744506, null)));
                linearLayout.addView(textView2, ha.t(-1, -2, 1, 32, 9, 32, 19));
                fi.d dVar = new fi.d(i4Var.getContext(), f6Var, true);
                dVar.i(hd.M0(2131744510, null), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                wp wpVar = new wp(R.drawable.mini_switch_lock, 0);
                wpVar.n = 1;
                spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                dVar.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) hd.M0(2131747770, null)), false);
                linearLayout.addView(dVar, ha.r(-1, 48, 1));
                dVar.setOnClickListener(new bi.r(11, i4Var, v2Var));
                v2Var.N = linearLayout;
                ((g9) i4Var.z1).h(v2Var);
                z3 z3Var = i4Var.c1;
                if (z3Var != null) {
                    z3Var.a();
                    break;
                }
                break;
            case 8:
                if (i4Var.T2) {
                    w5.I0();
                } else {
                    ((g9) i4Var.z1).h(new w5(i4Var.getContext(), i4Var.L0.getY() + i4Var.getY(), 0, i4Var.k0));
                }
                z3 z3Var2 = i4Var.c1;
                if (z3Var2 != null) {
                    z3Var2.a();
                    break;
                }
                break;
            case 9:
                ((g9) i4Var.z1).h(new w5(i4Var.getContext(), i4Var.L0.getY() + i4Var.getY(), 0, i4Var.k0));
                z3 z3Var3 = i4Var.c1;
                if (z3Var3 != null) {
                    z3Var3.a();
                    break;
                }
                break;
            case 10:
                n3 n3Var = i4Var.t0;
                boolean z12 = n3Var.v0;
                org.telegram.ui.Cells.s9 s9Var = n3Var.W;
                if (!z12) {
                    i4Var.Q2 = true;
                    n3Var.E(false);
                    break;
                } else if (!s9Var.x()) {
                    n3Var.D();
                    break;
                } else if (s9Var.x() && Math.abs(n3Var.g0 - n3Var.i0) < org.telegram.messenger.g0.e && Math.abs(n3Var.h0 - n3Var.j0) < org.telegram.messenger.g0.e) {
                    org.telegram.ui.Cells.v9 v9Var = s9Var.n(n3Var.getContext()).r;
                    v9Var.l();
                    if (!v9Var.i && v9Var.e) {
                        v9Var.f(false);
                        break;
                    }
                }
                break;
            case 11:
                i4Var.W0(true);
                break;
            case 12:
                i4Var.c1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = i4Var.x1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    i4Var.l0(new w1(i4Var, 10));
                    break;
                } else {
                    i4Var.J0(null);
                    break;
                }
                break;
        }
    }
}
