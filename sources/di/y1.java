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
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ y1(j4 j4Var, int i7) {
        this.a = i7;
        this.b = j4Var;
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
        y6 y6Var;
        int i7 = this.a;
        j4 j4Var = this.b;
        switch (i7) {
            case 0:
                q9 q9Var = j4Var.s0;
                q9Var.r();
                org.telegram.messenger.g0.i3(new l3(q9Var, 1), 30L);
                break;
            case 1:
                j4Var.u0.q(!r1.f0, true);
                break;
            case 2:
                j3 j3Var = j4Var.L0;
                TL_stories.StoryItem storyItem = j4Var.x1.a;
                if (storyItem != null) {
                    if (j4Var.l1) {
                        j4Var.D0(storyItem.privacy.isEmpty() ? new fi.q8(3, j4Var.l2, new ArrayList()) : new fi.q8(j4Var.l2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (j4Var.o0 == null) {
                            fi.m3 m3Var = new fi.m3(j4Var.getContext(), 1);
                            m3Var.r(true);
                            m3Var.K = Layout.Alignment.ALIGN_CENTER;
                            m3Var.q0 = new w1(j4Var, 9);
                            j4Var.o0 = m3Var;
                            m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            j3Var.addView(j4Var.o0, ha.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User a22 = qp.s1(j4Var.l2).a2(Long.valueOf(j4Var.k1));
                        if (a22 != null) {
                            String str = a22.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                j4Var.o0.n(15.0f, 8.0f, 15.0f, 8.0f);
                                X2 = org.telegram.messenger.g0.X2(id.a0("StoryCloseFriendsHint", null, 2131744706, str));
                            } else if (storyItem.contacts) {
                                j4Var.o0.n(11.0f, 6.0f, 11.0f, 7.0f);
                                X2 = org.telegram.messenger.g0.X2(id.a0("StoryContactsHint", null, 2131744702, str));
                                z9 = false;
                                CharSequence m10 = org.telegram.messenger.i6.m(X2, j4Var.o0.getTextPaint().getFontMetricsInt(), false, null, 0);
                                fi.m3 m3Var2 = j4Var.o0;
                                m3Var2.h = !z9 ? fi.m3.a(m10, m3Var2.getTextPaint()) : j3Var.getMeasuredWidth();
                                j4Var.o0.u(m10);
                                j4Var.o0.o(1.0f, (-(j3Var.getWidth() - j4Var.l0.getCenterX())) / org.telegram.messenger.g0.p);
                                q9 q9Var2 = ((h9) j4Var.z1).d;
                                q9Var2.h1 = true;
                                q9Var2.V();
                                if (j4Var.o0.V) {
                                    org.telegram.messenger.p2.e.a();
                                }
                                j4Var.o0.w();
                                break;
                            } else if (storyItem.selected_contacts) {
                                j4Var.o0.n(15.0f, 8.0f, 15.0f, 8.0f);
                                X2 = org.telegram.messenger.g0.X2(id.a0("StorySelectedContactsHint", null, 2131744479, str));
                            }
                            z9 = true;
                            CharSequence m102 = org.telegram.messenger.i6.m(X2, j4Var.o0.getTextPaint().getFontMetricsInt(), false, null, 0);
                            fi.m3 m3Var22 = j4Var.o0;
                            m3Var22.h = !z9 ? fi.m3.a(m102, m3Var22.getTextPaint()) : j3Var.getMeasuredWidth();
                            j4Var.o0.u(m102);
                            j4Var.o0.o(1.0f, (-(j3Var.getWidth() - j4Var.l0.getCenterX())) / org.telegram.messenger.g0.p);
                            q9 q9Var22 = ((h9) j4Var.z1).d;
                            q9Var22.h1 = true;
                            q9Var22.V();
                            if (j4Var.o0.V) {
                            }
                            j4Var.o0.w();
                        }
                    }
                }
                break;
            case 3:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.r2.a;
                org.telegram.messenger.t0.r();
                vf.c.t(j4Var.getContext(), org.telegram.messenger.r2.g);
                break;
            case 4:
                h4 h4Var = j4Var.x1;
                if (h4Var != null && (y6Var = h4Var.b) != null) {
                    y6Var.I = false;
                    y6Var.d = false;
                    y6Var.h = 0.0f;
                    y6Var.r = 0.0f;
                    y6Var.n = 0.0f;
                    if (y6Var.e != null) {
                        try {
                            new File(y6Var.e).delete();
                            y6Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    y6Var.d();
                    j4Var.d1(false);
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
                    j4Var.J1.b(z11, true);
                    break;
                }
                break;
            case 6:
                g2 g2Var = j4Var.u0;
                if (!j4Var.B0(false)) {
                    ea y10 = ea.y(j4Var.l2, false);
                    if (y10.e && y10.f.amount <= 0) {
                        g2Var.k(j4Var.B0(false));
                        break;
                    } else {
                        g2Var.p();
                        break;
                    }
                } else {
                    g2Var.k(j4Var.B0(false));
                    break;
                }
                break;
            case 7:
                Context context = j4Var.getContext();
                org.telegram.ui.ActionBar.h6 h6Var = j4Var.k0;
                org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, h6Var, false);
                w2Var.O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, h6Var));
                LinearLayout linearLayout = new LinearLayout(j4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(j4Var.getContext());
                k9Var.getImageReceiver().W(1);
                ui.b0(j4Var.l2).c2(k9Var, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(k9Var, ha.t(qs.g2, qs.g2, 1, 0, 16, 0, 16));
                TextView textView = new TextView(j4Var.getContext());
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var);
                jg.g.v(textView, 1, 20.0f, null, 2131744506);
                linearLayout.addView(textView, ha.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(j4Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.r5, h6Var);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(org.telegram.messenger.g0.X2(id.M0(2131744505, null)));
                linearLayout.addView(textView2, ha.t(-1, -2, 1, 32, 9, 32, 19));
                fi.d dVar = new fi.d(j4Var.getContext(), h6Var, true);
                dVar.i(id.M0(2131744509, null), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                wp wpVar = new wp(R.drawable.mini_switch_lock, 0);
                wpVar.n = 1;
                spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                dVar.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) id.M0(2131747771, null)), false);
                linearLayout.addView(dVar, ha.r(-1, 48, 1));
                dVar.setOnClickListener(new bi.r(11, j4Var, w2Var));
                w2Var.N = linearLayout;
                ((h9) j4Var.z1).h(w2Var);
                a4 a4Var = j4Var.c1;
                if (a4Var != null) {
                    a4Var.a();
                    break;
                }
                break;
            case 8:
                if (j4Var.T2) {
                    x5.I0();
                } else {
                    ((h9) j4Var.z1).h(new x5(j4Var.getContext(), j4Var.L0.getY() + j4Var.getY(), 0, j4Var.k0));
                }
                a4 a4Var2 = j4Var.c1;
                if (a4Var2 != null) {
                    a4Var2.a();
                    break;
                }
                break;
            case 9:
                ((h9) j4Var.z1).h(new x5(j4Var.getContext(), j4Var.L0.getY() + j4Var.getY(), 0, j4Var.k0));
                a4 a4Var3 = j4Var.c1;
                if (a4Var3 != null) {
                    a4Var3.a();
                    break;
                }
                break;
            case 10:
                n3 n3Var = j4Var.t0;
                boolean z12 = n3Var.v0;
                org.telegram.ui.Cells.s9 s9Var = n3Var.W;
                if (!z12) {
                    j4Var.Q2 = true;
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
                j4Var.W0(true);
                break;
            case 12:
                j4Var.c1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = j4Var.x1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    j4Var.l0(new w1(j4Var, 10));
                    break;
                } else {
                    j4Var.J0(null);
                    break;
                }
                break;
        }
    }
}
