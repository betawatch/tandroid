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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g18 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y28 b;

    public /* synthetic */ g18(y28 y28Var, byte b) {
        this.a = b;
        this.b = y28Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0384  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder T2;
        boolean z;
        f2b f2bVar;
        byte b = this.a;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                m8b m8bVar = y28Var.z0;
                m8bVar.m();
                gl.e3(new g28(m8bVar, (byte) 1), 30L);
                break;
            case 1:
                y28Var.B0.p(!r0.g0, true);
                break;
            case 2:
                d28 d28Var = y28Var.S0;
                TL_stories.StoryItem storyItem = y28Var.E1.a;
                if (storyItem != null) {
                    if (y28Var.s1) {
                        boolean isEmpty = storyItem.privacy.isEmpty();
                        int i = y28Var.s2;
                        y28Var.x0(isEmpty ? new w5b(3, i, new ArrayList()) : new w5b(i, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (y28Var.v0 == null) {
                            je5 je5Var = new je5(y28Var.getContext(), 1);
                            je5Var.p(true);
                            je5Var.L = Layout.Alignment.ALIGN_CENTER;
                            je5Var.r0 = new e18(y28Var, (byte) 9);
                            y28Var.v0 = je5Var;
                            je5Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            d28Var.addView(y28Var.v0, nme.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User V1 = na7.q1(y28Var.s2).V1(Long.valueOf(y28Var.r1));
                        if (V1 != null) {
                            String str = V1.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                y28Var.v0.m(15.0f, 8.0f, 15.0f, 8.0f);
                                T2 = gl.T2(k96.a0("StoryCloseFriendsHint", null, 2131744466, str));
                            } else if (storyItem.contacts) {
                                y28Var.v0.m(11.0f, 6.0f, 11.0f, 7.0f);
                                T2 = gl.T2(k96.a0("StoryContactsHint", null, 2131744462, str));
                                z = false;
                                CharSequence m = vu3.m(T2, y28Var.v0.getTextPaint().getFontMetricsInt(), false, null, 0);
                                je5 je5Var2 = y28Var.v0;
                                je5Var2.h = !z ? je5.a(m, je5Var2.getTextPaint()) : d28Var.getMeasuredWidth();
                                y28Var.v0.t(m);
                                y28Var.v0.n(1.0f, (-(d28Var.getWidth() - y28Var.s0.getCenterX())) / gl.p);
                                m8b m8bVar2 = ((d8b) y28Var.G1).d;
                                m8bVar2.i1 = true;
                                m8bVar2.U();
                                if (y28Var.v0.W) {
                                    pw0.e.a();
                                }
                                y28Var.v0.v();
                                break;
                            } else if (storyItem.selected_contacts) {
                                y28Var.v0.m(15.0f, 8.0f, 15.0f, 8.0f);
                                T2 = gl.T2(k96.a0("StorySelectedContactsHint", null, 2131744239, str));
                            }
                            z = true;
                            CharSequence m2 = vu3.m(T2, y28Var.v0.getTextPaint().getFontMetricsInt(), false, null, 0);
                            je5 je5Var22 = y28Var.v0;
                            je5Var22.h = !z ? je5.a(m2, je5Var22.getTextPaint()) : d28Var.getMeasuredWidth();
                            y28Var.v0.t(m2);
                            y28Var.v0.n(1.0f, (-(d28Var.getWidth() - y28Var.s0.getCenterX())) / gl.p);
                            m8b m8bVar22 = ((d8b) y28Var.G1).d;
                            m8bVar22.i1 = true;
                            m8bVar22.U();
                            if (y28Var.v0.W) {
                            }
                            y28Var.v0.v();
                        }
                    }
                }
                break;
            case 3:
                a.t();
                boolean z2 = w01.a;
                a.q();
                d01.t(y28Var.getContext(), w01.g);
                break;
            case 4:
                x28 x28Var = y28Var.E1;
                if (x28Var != null && (f2bVar = x28Var.b) != null) {
                    f2bVar.J = false;
                    f2bVar.d = false;
                    f2bVar.h = 0.0f;
                    f2bVar.r = 0.0f;
                    f2bVar.n = 0.0f;
                    if (f2bVar.e != null) {
                        try {
                            new File(f2bVar.e).delete();
                            f2bVar.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    f2bVar.d();
                    y28Var.c1(false);
                    break;
                }
                break;
            case 5:
                t76 t76Var = t76.N;
                if (t76Var != null) {
                    boolean z3 = !t76Var.r();
                    t76.N.D(z3);
                    y28Var.Q1.b(z3, true);
                    break;
                }
                break;
            case 6:
                l18 l18Var = y28Var.B0;
                if (!y28Var.v0(false)) {
                    gta v = gta.v(y28Var.s2, false);
                    if (v.e && v.f.amount <= 0) {
                        l18Var.j(y28Var.v0(false));
                        break;
                    } else {
                        l18Var.o();
                        break;
                    }
                } else {
                    l18Var.j(y28Var.v0(false));
                    break;
                }
                break;
            case 7:
                Context context = y28Var.getContext();
                f53 f53Var = y28Var.r0;
                fx0 fx0Var = new fx0(1, (wjb) f53Var, context, false);
                fx0Var.L(bkb.v0(bkb.g5, f53Var));
                LinearLayout linearLayout = new LinearLayout(y28Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
                be0 be0Var = new be0(y28Var.getContext());
                be0Var.getImageReceiver().M(1);
                hq6.d0(y28Var.s2).e2(be0Var, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(be0Var, nme.t(kk7.f2, kk7.f2, 1, 0, 16, 0, 16));
                TextView textView = new TextView(y28Var.getContext());
                textView.setTypeface(gl.o());
                textView.setGravity(17);
                zkb.X(textView, bkb.i5, f53Var);
                ir2.r(20.0f, 1, 2131744266, textView, null);
                linearLayout.addView(textView, nme.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(y28Var.getContext());
                textView2.setGravity(17);
                zkb.X(textView2, bkb.q5, f53Var);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(gl.T2(k96.M0(2131744265, null)));
                linearLayout.addView(textView2, nme.t(-1, -2, 1, 32, 9, 32, 19));
                u41 u41Var = new u41(f53Var, y28Var.getContext(), true);
                u41Var.i(k96.M0(2131744269, null), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                cm2 cm2Var = new cm2(R.drawable.mini_switch_lock, 0);
                cm2Var.n = 1;
                spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
                u41Var.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) k96.M0(2131747578, null)), false);
                linearLayout.addView(u41Var, nme.r(-1, 48, 1));
                u41Var.setOnClickListener(new v16(y28Var, fx0Var, (byte) 14));
                fx0Var.O = linearLayout;
                ((d8b) y28Var.G1).h(fx0Var);
                s28 s28Var = y28Var.j1;
                if (s28Var != null) {
                    s28Var.a();
                    break;
                }
                break;
            case 8:
                if (y28Var.a3) {
                    eya.D0();
                } else {
                    ((d8b) y28Var.G1).h(new eya(y28Var.getContext(), y28Var.S0.getY() + y28Var.getY(), 0, y28Var.r0));
                }
                s28 s28Var2 = y28Var.j1;
                if (s28Var2 != null) {
                    s28Var2.a();
                    break;
                }
                break;
            case 9:
                y28Var.getClass();
                ((d8b) y28Var.G1).h(new eya(y28Var.getContext(), y28Var.S0.getY() + y28Var.getY(), 0, y28Var.r0));
                s28 s28Var3 = y28Var.j1;
                if (s28Var3 != null) {
                    s28Var3.a();
                    break;
                }
                break;
            case 10:
                i28 i28Var = y28Var.A0;
                boolean z4 = i28Var.v0;
                oib oibVar = i28Var.W;
                if (!z4) {
                    y28Var.X2 = true;
                    i28Var.E(false);
                    break;
                } else if (!oibVar.w()) {
                    i28Var.D();
                    break;
                } else if (oibVar.w() && Math.abs(i28Var.g0 - i28Var.i0) < gl.e && Math.abs(i28Var.h0 - i28Var.j0) < gl.e) {
                    rib ribVar = oibVar.m(i28Var.getContext()).r;
                    ribVar.k();
                    if (!ribVar.i && ribVar.e) {
                        ribVar.e(false);
                        break;
                    }
                }
                break;
            case 11:
                y28Var.T0(true);
                break;
            case 12:
                y28Var.b1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = y28Var.E1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    y28Var.d0(new e18(y28Var, (byte) 10));
                    break;
                } else {
                    y28Var.E0(null);
                    break;
                }
                break;
        }
    }
}
