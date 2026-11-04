package ei;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ c2(j4 j4Var, int i3) {
        this.a = i3;
        this.b = j4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0396  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder X2;
        boolean z10;
        y6 y6Var;
        int i3 = this.a;
        j4 j4Var = this.b;
        switch (i3) {
            case 0:
                r9 r9Var = j4Var.t0;
                r9Var.C();
                org.telegram.messenger.g0.i3(new o3(r9Var, 1), 30L);
                break;
            case 1:
                j4Var.v0.q(!r1.g0, true);
                break;
            case 2:
                m3 m3Var = j4Var.M0;
                TL_stories.StoryItem storyItem = j4Var.y1.a;
                if (storyItem != null) {
                    if (j4Var.m1) {
                        j4Var.D0(storyItem.privacy.isEmpty() ? new gi.r8(3, j4Var.m2, new ArrayList()) : new gi.r8(j4Var.m2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (j4Var.p0 == null) {
                            gi.l3 l3Var = new gi.l3(j4Var.getContext(), 1);
                            l3Var.r(true);
                            l3Var.L = Layout.Alignment.ALIGN_CENTER;
                            l3Var.r0 = new a2(j4Var, 9);
                            j4Var.p0 = l3Var;
                            l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            m3Var.addView(j4Var.p0, mf.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User a22 = hp.s1(j4Var.m2).a2(Long.valueOf(j4Var.l1));
                        if (a22 != null) {
                            String str = a22.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                j4Var.p0.n(15.0f, 8.0f, 15.0f, 8.0f);
                                X2 = org.telegram.messenger.g0.X2(bd.a0("StoryCloseFriendsHint", null, 2131744716, str));
                            } else if (storyItem.contacts) {
                                j4Var.p0.n(11.0f, 6.0f, 11.0f, 7.0f);
                                X2 = org.telegram.messenger.g0.X2(bd.a0("StoryContactsHint", null, 2131744712, str));
                                z10 = false;
                                CharSequence m10 = org.telegram.messenger.i6.m(X2, j4Var.p0.getTextPaint().getFontMetricsInt(), false, null, 0);
                                gi.l3 l3Var2 = j4Var.p0;
                                l3Var2.h = !z10 ? gi.l3.a(m10, l3Var2.getTextPaint()) : m3Var.getMeasuredWidth();
                                j4Var.p0.u(m10);
                                j4Var.p0.o(1.0f, (-(m3Var.getWidth() - j4Var.m0.getCenterX())) / org.telegram.messenger.g0.p);
                                r9 r9Var2 = ((i9) j4Var.A1).d;
                                r9Var2.j1 = true;
                                r9Var2.d0();
                                if (j4Var.p0.W) {
                                    org.telegram.messenger.p2.e.a();
                                }
                                j4Var.p0.w();
                                break;
                            } else if (storyItem.selected_contacts) {
                                j4Var.p0.n(15.0f, 8.0f, 15.0f, 8.0f);
                                X2 = org.telegram.messenger.g0.X2(bd.a0("StorySelectedContactsHint", null, 2131744489, str));
                            }
                            z10 = true;
                            CharSequence m102 = org.telegram.messenger.i6.m(X2, j4Var.p0.getTextPaint().getFontMetricsInt(), false, null, 0);
                            gi.l3 l3Var22 = j4Var.p0;
                            l3Var22.h = !z10 ? gi.l3.a(m102, l3Var22.getTextPaint()) : m3Var.getMeasuredWidth();
                            j4Var.p0.u(m102);
                            j4Var.p0.o(1.0f, (-(m3Var.getWidth() - j4Var.m0.getCenterX())) / org.telegram.messenger.g0.p);
                            r9 r9Var22 = ((i9) j4Var.A1).d;
                            r9Var22.j1 = true;
                            r9Var22.d0();
                            if (j4Var.p0.W) {
                            }
                            j4Var.p0.w();
                        }
                    }
                }
                break;
            case 3:
                org.telegram.messenger.t0.u();
                boolean z11 = org.telegram.messenger.r2.a;
                org.telegram.messenger.t0.r();
                sf.c.t(j4Var.getContext(), org.telegram.messenger.r2.g);
                break;
            case 4:
                h4 h4Var = j4Var.y1;
                if (h4Var != null && (y6Var = h4Var.b) != null) {
                    y6Var.J = false;
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
                g1 g1Var = g1.X;
                if (g1Var != null) {
                    boolean o10 = g1Var.o();
                    g1 g1Var2 = g1.X;
                    boolean z12 = !o10;
                    if (g1Var2.n && g1Var2.r != z12) {
                        g1Var2.r = z12;
                        NativeInstance nativeInstance = g1Var2.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                    j4Var.K1.b(z12, true);
                    break;
                }
                break;
            case 6:
                k2 k2Var = j4Var.v0;
                if (!j4Var.B0(false)) {
                    ci.e9 y9 = ci.e9.y(j4Var.m2, false);
                    if (y9.e && y9.f.amount <= 0) {
                        k2Var.k(j4Var.B0(false));
                        break;
                    } else {
                        k2Var.p();
                        break;
                    }
                } else {
                    k2Var.k(j4Var.B0(false));
                    break;
                }
                break;
            case 7:
                Context context = j4Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = j4Var.l0;
                org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, context, e6Var, false);
                t2Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e6Var));
                LinearLayout linearLayout = new LinearLayout(j4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(j4Var.getContext());
                k9Var.getImageReceiver().W(1);
                li.b0(j4Var.m2).c2(k9Var, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(k9Var, mf.t(hs.g2, hs.g2, 1, 0, 16, 0, 16));
                TextView textView = new TextView(j4Var.getContext());
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
                k2.p1.u(textView, 1, 20.0f, null, 2131744516);
                linearLayout.addView(textView, mf.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(j4Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r5, e6Var);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744515, null)));
                linearLayout.addView(textView2, mf.t(-1, -2, 1, 32, 9, 32, 19));
                gi.d dVar = new gi.d(j4Var.getContext(), e6Var, true);
                dVar.i(bd.M0(2131744519, null), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                wp wpVar = new wp(R.drawable.mini_switch_lock, 0);
                wpVar.n = 1;
                spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                dVar.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) bd.M0(2131747779, null)), false);
                linearLayout.addView(dVar, mf.r(-1, 48, 1));
                dVar.setOnClickListener(new ai.d(17, j4Var, t2Var));
                t2Var.O = linearLayout;
                ((i9) j4Var.A1).h(t2Var);
                b4 b4Var = j4Var.d1;
                if (b4Var != null) {
                    b4Var.a();
                    break;
                }
                break;
            case 8:
                if (j4Var.U2) {
                    w5.I0();
                } else {
                    ((i9) j4Var.A1).h(new w5(j4Var.getContext(), j4Var.M0.getY() + j4Var.getY(), 0, j4Var.l0));
                }
                b4 b4Var2 = j4Var.d1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    break;
                }
                break;
            case 9:
                ((i9) j4Var.A1).h(new w5(j4Var.getContext(), j4Var.M0.getY() + j4Var.getY(), 0, j4Var.l0));
                b4 b4Var3 = j4Var.d1;
                if (b4Var3 != null) {
                    b4Var3.a();
                    break;
                }
                break;
            case 10:
                q3 q3Var = j4Var.u0;
                boolean z13 = q3Var.w0;
                org.telegram.ui.Cells.r9 r9Var3 = q3Var.a0;
                if (!z13) {
                    j4Var.R2 = true;
                    q3Var.E(false);
                    break;
                } else if (!r9Var3.x()) {
                    q3Var.D();
                    break;
                } else if (r9Var3.x() && Math.abs(q3Var.h0 - q3Var.j0) < org.telegram.messenger.g0.e && Math.abs(q3Var.i0 - q3Var.k0) < org.telegram.messenger.g0.e) {
                    org.telegram.ui.Cells.u9 u9Var = r9Var3.n(q3Var.getContext()).r;
                    u9Var.l();
                    if (!u9Var.i && u9Var.e) {
                        u9Var.f(false);
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
                TL_stories.StoryItem storyItem2 = j4Var.y1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    j4Var.l0(new a2(j4Var, 10));
                    break;
                } else {
                    j4Var.J0(null);
                    break;
                }
                break;
        }
    }
}
