package fi;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ v1(b4 b4Var, int i7) {
        this.a = i7;
        this.b = b4Var;
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
        boolean z10;
        r6 r6Var;
        int i7 = this.a;
        b4 b4Var = this.b;
        switch (i7) {
            case 0:
                i9 i9Var = b4Var.t0;
                i9Var.r();
                org.telegram.messenger.g0.i3(new g3(i9Var, 1), 30L);
                break;
            case 1:
                b4Var.v0.q(!r1.g0, true);
                break;
            case 2:
                e3 e3Var = b4Var.M0;
                TL_stories.StoryItem storyItem = b4Var.y1.a;
                if (storyItem != null) {
                    if (b4Var.m1) {
                        b4Var.D0(storyItem.privacy.isEmpty() ? new hi.o8(3, b4Var.m2, new ArrayList()) : new hi.o8(b4Var.m2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (b4Var.p0 == null) {
                            hi.l3 l3Var = new hi.l3(b4Var.getContext(), 1);
                            l3Var.r(true);
                            l3Var.L = Layout.Alignment.ALIGN_CENTER;
                            l3Var.r0 = new t1(b4Var, 9);
                            b4Var.p0 = l3Var;
                            l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            e3Var.addView(b4Var.p0, ja.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User a22 = np.s1(b4Var.m2).a2(Long.valueOf(b4Var.l1));
                        if (a22 != null) {
                            String str = a22.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                b4Var.p0.n(15.0f, 8.0f, 15.0f, 8.0f);
                                X2 = org.telegram.messenger.g0.X2(hd.a0("StoryCloseFriendsHint", null, 2131744706, str));
                            } else if (storyItem.contacts) {
                                b4Var.p0.n(11.0f, 6.0f, 11.0f, 7.0f);
                                X2 = org.telegram.messenger.g0.X2(hd.a0("StoryContactsHint", null, 2131744702, str));
                                z10 = false;
                                CharSequence m10 = org.telegram.messenger.j6.m(X2, b4Var.p0.getTextPaint().getFontMetricsInt(), false, null, 0);
                                hi.l3 l3Var2 = b4Var.p0;
                                l3Var2.h = !z10 ? hi.l3.a(m10, l3Var2.getTextPaint()) : e3Var.getMeasuredWidth();
                                b4Var.p0.u(m10);
                                b4Var.p0.o(1.0f, (-(e3Var.getWidth() - b4Var.m0.getCenterX())) / org.telegram.messenger.g0.p);
                                i9 i9Var2 = ((z8) b4Var.A1).d;
                                i9Var2.i1 = true;
                                i9Var2.V();
                                if (b4Var.p0.W) {
                                    org.telegram.messenger.p2.e.a();
                                }
                                b4Var.p0.w();
                                break;
                            } else if (storyItem.selected_contacts) {
                                b4Var.p0.n(15.0f, 8.0f, 15.0f, 8.0f);
                                X2 = org.telegram.messenger.g0.X2(hd.a0("StorySelectedContactsHint", null, 2131744479, str));
                            }
                            z10 = true;
                            CharSequence m102 = org.telegram.messenger.j6.m(X2, b4Var.p0.getTextPaint().getFontMetricsInt(), false, null, 0);
                            hi.l3 l3Var22 = b4Var.p0;
                            l3Var22.h = !z10 ? hi.l3.a(m102, l3Var22.getTextPaint()) : e3Var.getMeasuredWidth();
                            b4Var.p0.u(m102);
                            b4Var.p0.o(1.0f, (-(e3Var.getWidth() - b4Var.m0.getCenterX())) / org.telegram.messenger.g0.p);
                            i9 i9Var22 = ((z8) b4Var.A1).d;
                            i9Var22.i1 = true;
                            i9Var22.V();
                            if (b4Var.p0.W) {
                            }
                            b4Var.p0.w();
                        }
                    }
                }
                break;
            case 3:
                org.telegram.messenger.t0.u();
                boolean z11 = org.telegram.messenger.r2.a;
                org.telegram.messenger.t0.r();
                vf.c.t(b4Var.getContext(), org.telegram.messenger.r2.g);
                break;
            case 4:
                z3 z3Var = b4Var.y1;
                if (z3Var != null && (r6Var = z3Var.b) != null) {
                    r6Var.J = false;
                    r6Var.d = false;
                    r6Var.h = 0.0f;
                    r6Var.r = 0.0f;
                    r6Var.n = 0.0f;
                    if (r6Var.e != null) {
                        try {
                            new File(r6Var.e).delete();
                            r6Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    r6Var.d();
                    b4Var.d1(false);
                    break;
                }
                break;
            case 5:
                e1 e1Var = e1.X;
                if (e1Var != null) {
                    boolean o4 = e1Var.o();
                    e1 e1Var2 = e1.X;
                    boolean z12 = !o4;
                    if (e1Var2.n && e1Var2.r != z12) {
                        e1Var2.r = z12;
                        NativeInstance nativeInstance = e1Var2.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                    b4Var.K1.b(z12, true);
                    break;
                }
                break;
            case 6:
                c2 c2Var = b4Var.v0;
                if (!b4Var.B0(false)) {
                    di.u8 y10 = di.u8.y(b4Var.m2, false);
                    if (y10.e && y10.f.amount <= 0) {
                        c2Var.k(b4Var.B0(false));
                        break;
                    } else {
                        c2Var.p();
                        break;
                    }
                } else {
                    c2Var.k(b4Var.B0(false));
                    break;
                }
                break;
            case 7:
                Context context = b4Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = b4Var.l0;
                org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context, e6Var, false);
                u2Var.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, e6Var));
                LinearLayout linearLayout = new LinearLayout(b4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                org.telegram.ui.Components.i9 i9Var3 = new org.telegram.ui.Components.i9(b4Var.getContext());
                i9Var3.getImageReceiver().W(1);
                si.b0(b4Var.m2).c2(i9Var3, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(i9Var3, ja.t(ns.g2, ns.g2, 1, 0, 16, 0, 16));
                TextView textView = new TextView(b4Var.getContext());
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, e6Var);
                i5.c.w(textView, 1, 20.0f, null, 2131744506);
                linearLayout.addView(textView, ja.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(b4Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.r5, e6Var);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744505, null)));
                linearLayout.addView(textView2, ja.t(-1, -2, 1, 32, 9, 32, 19));
                hi.d dVar = new hi.d(b4Var.getContext(), e6Var, true);
                dVar.i(hd.M0(2131744509, null), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                eq eqVar = new eq(R.drawable.mini_switch_lock, 0);
                eqVar.n = 1;
                spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
                dVar.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) hd.M0(2131747771, null)), false);
                linearLayout.addView(dVar, ja.r(-1, 48, 1));
                dVar.setOnClickListener(new ai.v2(18, b4Var, u2Var));
                u2Var.O = linearLayout;
                ((z8) b4Var.A1).h(u2Var);
                t3 t3Var = b4Var.d1;
                if (t3Var != null) {
                    t3Var.a();
                    break;
                }
                break;
            case 8:
                if (b4Var.U2) {
                    o5.I0();
                } else {
                    ((z8) b4Var.A1).h(new o5(b4Var.getContext(), b4Var.M0.getY() + b4Var.getY(), 0, b4Var.l0));
                }
                t3 t3Var2 = b4Var.d1;
                if (t3Var2 != null) {
                    t3Var2.a();
                    break;
                }
                break;
            case 9:
                ((z8) b4Var.A1).h(new o5(b4Var.getContext(), b4Var.M0.getY() + b4Var.getY(), 0, b4Var.l0));
                t3 t3Var3 = b4Var.d1;
                if (t3Var3 != null) {
                    t3Var3.a();
                    break;
                }
                break;
            case 10:
                i3 i3Var = b4Var.u0;
                boolean z13 = i3Var.w0;
                org.telegram.ui.Cells.r9 r9Var = i3Var.a0;
                if (!z13) {
                    b4Var.R2 = true;
                    i3Var.E(false);
                    break;
                } else if (!r9Var.x()) {
                    i3Var.D();
                    break;
                } else if (r9Var.x() && Math.abs(i3Var.h0 - i3Var.j0) < org.telegram.messenger.g0.e && Math.abs(i3Var.i0 - i3Var.k0) < org.telegram.messenger.g0.e) {
                    u9 u9Var = r9Var.n(i3Var.getContext()).r;
                    u9Var.l();
                    if (!u9Var.i && u9Var.e) {
                        u9Var.f(false);
                        break;
                    }
                }
                break;
            case 11:
                b4Var.W0(true);
                break;
            case 12:
                b4Var.c1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = b4Var.y1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    b4Var.l0(new t1(b4Var, 10));
                    break;
                } else {
                    b4Var.J0(null);
                    break;
                }
                break;
        }
    }
}
