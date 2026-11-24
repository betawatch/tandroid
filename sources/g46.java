// default package

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g46 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final mn0 c;
    public LinearLayout d;
    public final /* synthetic */ i46 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0d8a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0d74  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0ba3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0565 A[LOOP:0: B:229:0x0563->B:230:0x0565, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0442  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g46(i46 i46Var, Context context) {
        super(context);
        String str;
        String a0;
        String str2;
        boolean z;
        int f;
        int i;
        int f2;
        int i2;
        int f3;
        int i3;
        int f4;
        int i4;
        int f5;
        int i5;
        int i6;
        int i7;
        float f6;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int min;
        int i8;
        String str3;
        int size;
        int size2;
        int i9;
        float f7;
        int i10;
        int i11;
        final byte b;
        boolean z2;
        int i12;
        float f8;
        float f9;
        float f10;
        d dVar = i46Var.r1;
        this.e = i46Var;
        setOrientation(1);
        int i13 = i46.R2;
        setPadding(gm.L(6.0f) + i46Var.u0, 0, gm.L(6.0f) + i46Var.u0, 0);
        int i14 = i46Var.c2;
        h46 f1 = i46.f1(i14, i46Var.a);
        i46Var.H2 = f1;
        int i15 = f1.a;
        oc7 r1 = oc7.r1(i46Var.a);
        gs gsVar = r1.l4;
        boolean H3 = r1.H3();
        boolean i1 = i46Var.i1();
        if (i14 == 31) {
            str = jb6.M0(i1 ? 2131753567 : 2131753566, null);
        } else if (i14 == 32) {
            str = i46Var.c1(true);
        } else if (i14 == 19) {
            rc2 rc2Var = i46Var.b2;
            if (rc2Var != null) {
                int i16 = rc2Var.getMessageObject().k.from_boosts_applied;
                TLRPC.Chat e1 = i46Var.e1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) jb6.G(i16, "GroupBoostedByUserWithTimes", m9c.k(i46Var.b2.getCurrentUser(), true)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) jb6.a0(null, null, 2131749254, e1 == null ? "" : e1.title));
                str = spannableStringBuilder.toString();
            } else if (dVar instanceof ac5) {
                str = jb6.G(oo0.h(), "BoostingGroupBoostWhatAreBoostsDescription", new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(i46Var.c1(true));
                if (sd2.N(i46Var.e1()) && i1) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) jb6.M0(2131753294, null));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i14 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = i46Var.W1;
            if (tL_premium_boostsStatus.level == 0) {
                int i17 = i1 ? 2131749178 : 2131752297;
                int i18 = tL_premium_boostsStatus.next_level_boosts;
                str = jb6.a0(null, null, i17, jb6.G(i18, "MoreBoosts", Integer.valueOf(i18)));
            } else {
                int i19 = i1 ? 2131749176 : 2131752295;
                int i20 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts;
                str = jb6.a0(null, null, i19, jb6.G(i20, "MoreBoosts", Integer.valueOf(i20)), jb6.G(i46Var.W1.level + 1, "BoostStories", new Object[0]));
            }
        } else if (i14 == 20) {
            str = jb6.a0(null, null, i1 ? 2131749175 : 2131752293, Integer.valueOf(i46Var.a1()));
        } else if (i14 == 24) {
            str = jb6.a0(null, null, i1 ? 2131749171 : 2131752290, Integer.valueOf(i46Var.a1()));
        } else if (i14 == 29) {
            str = jb6.a0(null, null, 2131749174, Integer.valueOf(gsVar.d2.f()));
        } else if (i14 == 30) {
            str = jb6.a0(null, null, 2131752287, Integer.valueOf(gsVar.T1.f()));
        } else if (i14 == 35) {
            str = jb6.a0(null, null, 2131752294, Integer.valueOf(gsVar.U1.f()));
        } else if (i14 == 25) {
            if (i1) {
                f5 = gsVar.c2.f();
                i5 = 2131749172;
            } else {
                f5 = gsVar.X1.f();
                i5 = 2131752291;
            }
            str = jb6.a0(null, null, i5, Integer.valueOf(f5));
        } else if (i14 == 26) {
            if (i1) {
                f4 = gsVar.c2.f();
                i4 = 2131749167;
            } else {
                f4 = gsVar.X1.f();
                i4 = 2131752285;
            }
            str = jb6.a0(null, null, i4, Integer.valueOf(f4));
        } else if (i14 == 27) {
            str = jb6.a0(null, null, i1 ? 2131749169 : 2131752288, Integer.valueOf(gsVar.V1.f()));
        } else if (i14 == 28) {
            if (i1) {
                f3 = gsVar.e2.f();
                i3 = 2131749170;
            } else {
                f3 = gsVar.W1.f();
                i3 = 2131752289;
            }
            str = jb6.a0(null, null, i3, Integer.valueOf(f3));
        } else if (i14 == 22) {
            if (i1) {
                f2 = gsVar.b2.f();
                i2 = 2131749168;
            } else {
                f2 = gsVar.f2.f();
                i2 = 2131752286;
            }
            str = jb6.a0(null, null, i2, Integer.valueOf(f2));
        } else if (i14 == 23) {
            if (i1) {
                f = gsVar.Y1.f();
                i = 2131749173;
            } else {
                f = gsVar.g2.f();
                i = 2131752292;
            }
            str = jb6.a0(null, null, i, Integer.valueOf(f));
        } else if (i14 == 21) {
            int i21 = i46Var.M2;
            str = jb6.G(i21, "ReactionReachLvlForReaction", Integer.valueOf(i21));
        } else {
            if (i14 == 11) {
                boolean z3 = i46Var.T1;
                TLRPC.Chat chat = i46Var.J2;
                if (z3) {
                    boolean V = sd2.V(chat);
                    ArrayList arrayList4 = i46Var.w2;
                    if (V) {
                        int size3 = arrayList4.size();
                        ArrayList arrayList5 = i46Var.w2;
                        a0 = size3 == 1 ? jb6.a0(null, null, 2131748912, bw2.p((TLRPC.User) arrayList5.get(0))) : jb6.G(arrayList5.size(), "InviteChannelRestrictedUsers", Integer.valueOf(i46Var.w2.size()));
                    } else {
                        int size4 = arrayList4.size();
                        ArrayList arrayList6 = i46Var.w2;
                        a0 = size4 == 1 ? jb6.a0(null, null, 2131748877, bw2.p((TLRPC.User) arrayList6.get(0))) : jb6.G(arrayList6.size(), "InviteRestrictedUsers", Integer.valueOf(i46Var.w2.size()));
                    }
                } else {
                    boolean V2 = sd2.V(chat);
                    ArrayList arrayList7 = i46Var.w2;
                    if (V2) {
                        int size5 = arrayList7.size();
                        ArrayList arrayList8 = i46Var.w2;
                        a0 = size5 == 1 ? jb6.a0(null, null, 2131748915, bw2.p((TLRPC.User) arrayList8.get(0))) : jb6.G(arrayList8.size(), "InviteChannelRestrictedUsers2", Integer.valueOf(i46Var.w2.size()));
                    } else {
                        int size6 = arrayList7.size();
                        ArrayList arrayList9 = i46Var.w2;
                        a0 = size6 == 1 ? jb6.a0(null, null, 2131748880, bw2.p((TLRPC.User) arrayList9.get(0))) : jb6.G(arrayList9.size(), "InviteRestrictedUsers2", Integer.valueOf(i46Var.w2.size()));
                    }
                }
                str2 = a0;
                z = true;
                h46 h46Var = i46Var.H2;
                int i22 = h46Var.e;
                int i23 = h46Var.f;
                i6 = i46Var.r2;
                if (i14 != 3) {
                    i6 = oc7.r1(i46Var.a).G0.size() - 1;
                } else if (i14 == 7) {
                    i6 = z8c.c();
                } else if (i14 == 0) {
                    ArrayList V0 = oc7.r1(i46Var.a).V0(0);
                    i7 = 1;
                    int size7 = V0.size();
                    int i24 = 0;
                    for (int i25 = 0; i25 < size7; i25++) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) V0.get(i25);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                            i24++;
                        }
                    }
                    i6 = i24;
                    if (!z8c.h(i46Var.a).p() || i46Var.I2) {
                        i6 = i23;
                        f6 = 1.0f;
                    } else {
                        i6 = i6 < 0 ? i22 : i6;
                        if (i14 != 7) {
                            f8 = i6;
                            f9 = i23;
                        } else if (i6 > i22) {
                            f8 = i6 - i22;
                            f9 = i23 - i22;
                        } else {
                            f10 = 0.5f;
                            f6 = f10;
                        }
                        f10 = f8 / f9;
                        f6 = f10;
                    }
                    float f11 = i22 / i23;
                    int i26 = (i14 != 18 || i14 == 20 || i14 == 24 || i14 == 25 || i14 == 26 || i14 == 29 || i14 == 22 || i14 == 23 || i14 == 19 || i14 == 30 || i14 == 35 || i14 == 21 || i14 == 27 || i14 == 28 || i14 == 32) ? i7 : 0;
                    int i27 = i26 != 0 ? 0 : i6;
                    if ((i14 != 11 || i14 == 34) && !oc7.r1(i46Var.a).H3() && (!((arrayList = i46Var.y2) == null || arrayList.isEmpty()) || ((arrayList2 = i46Var.x2) != null && arrayList2.size() >= i46Var.w2.size()))) {
                        arrayList3 = i46Var.y2.isEmpty() ? i46Var.x2 : i46Var.y2;
                        hd0 hd0Var = new hd0(context, false);
                        hd0Var.a.q = gm.L(3.33f);
                        hd0Var.setSize(gm.L(72.0f));
                        hd0Var.setStepFactor(0.4f);
                        min = Math.min(arrayList3.size(), 3);
                        hd0Var.setCount(min);
                        for (i8 = 0; i8 < min; i8++) {
                            Long l = (Long) arrayList3.get(i8);
                            l.getClass();
                            hd0Var.b(i8, i46Var.a, oc7.r1(i46Var.a).W1(l));
                        }
                        hd0Var.a(false);
                        addView(hd0Var, qoe.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                        TextView textView = new TextView(context);
                        textView.setGravity(17);
                        wi8.v(textView, i7, 20.0f);
                        int i28 = cmb.i5;
                        wi8.x(textView, i28, i46Var.J0, null, 2131748885);
                        addView(textView, qoe.t(-1, -2, 1, 32, 0, 32, 9));
                        TextView textView2 = new TextView(context);
                        textView2.setGravity(17);
                        textView2.setTextSize(1, 14.0f);
                        anb.X(textView2, i28, i46Var.J0);
                        addView(textView2, qoe.t(-1, -2, 1, 32, 0, 32, 19));
                        boolean z4 = i14 == 34;
                        ArrayList arrayList10 = i46Var.x2;
                        boolean z5 = arrayList10 == null && arrayList10.size() >= i46Var.y2.size();
                        if (arrayList3.size() == 1) {
                            str3 = jb6.a0(null, null, z4 ? 2131748924 : z5 ? 2131748894 : 2131748889, m9c.l(oc7.r1(i46Var.a).W1((Long) arrayList3.get(0))));
                        } else if (arrayList3.size() == 2) {
                            str3 = jb6.a0(null, null, z4 ? 2131748922 : z5 ? 2131748892 : 2131748884, m9c.l(oc7.r1(i46Var.a).W1((Long) arrayList3.get(0))), m9c.l(oc7.r1(i46Var.a).W1((Long) arrayList3.get(1))));
                        } else if (arrayList3.size() == 3) {
                            str3 = jb6.a0(null, null, z4 ? 2131748923 : z5 ? 2131748893 : 2131748886, m9c.l(oc7.r1(i46Var.a).W1((Long) arrayList3.get(0))), m9c.l(oc7.r1(i46Var.a).W1((Long) arrayList3.get(1))), m9c.l(oc7.r1(i46Var.a).W1((Long) arrayList3.get(2))));
                        } else {
                            String G = jb6.G(arrayList3.size() - 2, z4 ? "InviteCallMessagePremiumBlockedMany" : z5 ? "InviteMessagePremiumBlockedMany" : "InvitePremiumBlockedMany", m9c.l(oc7.r1(i46Var.a).W1((Long) arrayList3.get(0))), m9c.l(oc7.r1(i46Var.a).W1((Long) arrayList3.get(1))));
                            int size8 = arrayList3.size() - 2;
                            int v0 = cmb.v0(cmb.g5, i46Var.J0);
                            hd0Var.b = new nj8(cmb.Bk, cmb.Ck, -1, -1, null);
                            hd0Var.c = new uib(hg9.j(size8, "+"), 12.0f, gm.n1("fonts/num.otf"));
                            Paint paint = new Paint(1);
                            hd0Var.d = paint;
                            paint.setColor(v0);
                            str3 = G;
                        }
                        textView2.setText(gm.S2(str3));
                        ArrayList arrayList11 = i46Var.y2;
                        size = arrayList11 == null ? 0 : arrayList11.size();
                        ArrayList arrayList12 = i46Var.x2;
                        size2 = arrayList12 == null ? 0 : arrayList12.size();
                        if (size - size2 > 0 || ((size == 1 && size2 == 1) || !i46Var.T1)) {
                            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = gm.L(8.0f);
                            i46Var.e2 = true;
                        } else {
                            final byte b2 = 0;
                            cj8 cj8Var = new cj8(i46Var.J0, context, false);
                            rve.b(cj8Var, 0.02f, 1.2f);
                            cj8Var.b(jb6.M0(2131748887, null), new View.OnClickListener(this) { // from class: e46
                                public final /* synthetic */ g46 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b3 = b2;
                                    g46 g46Var = this.b;
                                    switch (b3) {
                                        case 0:
                                            d dVar2 = g46Var.e.F2;
                                            if (dVar2 != null) {
                                                bh0 bh0Var = new bh0();
                                                bh0Var.a = true;
                                                dVar2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bh0Var);
                                                break;
                                            }
                                            break;
                                        default:
                                            i46 i46Var2 = g46Var.e;
                                            i46Var2.r1.presentFragment(yv1.ga(i46Var2.V1));
                                            i46Var2.dismiss();
                                            break;
                                    }
                                }
                            }, false);
                            float f12 = (i46Var.u0 / gm.p) + 4.0f;
                            addView(cj8Var, qoe.k(f12, 0.0f, f12, 18.0f, -1, 48));
                            t8 t8Var = new t8(this, context);
                            t8Var.setGravity(17);
                            anb.X(t8Var, cmb.y6, i46Var.J0);
                            t8Var.setText(" " + jb6.M0(2131748888, null) + " ");
                            t8Var.setTextSize(14.0f);
                            addView(t8Var, qoe.t(nm7.T2, -2, 1, 12, 0, 12, 20));
                            TextView textView3 = new TextView(context);
                            textView3.setGravity(17);
                            wi8.v(textView3, 1, 20.0f);
                            wi8.x(textView3, i28, i46Var.J0, null, 2131748928);
                            addView(textView3, qoe.t(-1, -2, 1, 32, 0, 32, 9));
                            TextView textView4 = new TextView(context);
                            textView4.setGravity(17);
                            textView4.setTextSize(1, 14.0f);
                            anb.X(textView4, i28, i46Var.J0);
                            if (i46Var.y2.size() <= 1) {
                                textView4.setText(jb6.M0(2131748929, null));
                            } else {
                                textView4.setText(jb6.L0(2131748930));
                            }
                            addView(textView4, qoe.t(-1, -2, 1, 32, 0, 32, 19));
                        }
                        i46Var.w1();
                    }
                    if (i14 == 31 || i14 == 34) {
                        i9 = 6;
                        f7 = 14.0f;
                    } else {
                        f7 = 14.0f;
                        f46 f46Var = new f46(this, context, i15, i27, i23, f11, i46Var.J0);
                        i46Var.s2 = f46Var;
                        if (i26 != 0) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = i46Var.W1;
                            if (tL_premium_boostsStatus2 != null) {
                                vh1 vh1Var = i46Var.X1;
                                f46Var.h(tL_premium_boostsStatus2, vh1Var != null && vh1Var.l);
                            }
                        } else {
                            f46Var.setBagePosition(f6);
                            i46Var.s2.setType(i14);
                            i46Var.s2.x.setVisibility(8);
                            if (z) {
                                f46 f46Var2 = i46Var.s2;
                                f46Var2.J.setVisibility(8);
                                o36 o36Var = f46Var2.e;
                                if (o36Var != null) {
                                    o36Var.setPadding(gm.L(24.0f), gm.L(3.0f), gm.L(24.0f), gm.L(3.0f));
                                }
                                f46Var2.K = true;
                            } else if (z8c.h(i46Var.a).p() || i46Var.I2) {
                                i46Var.s2.w.setVisibility(8);
                                f46 f46Var3 = i46Var.s2;
                                i9 = 6;
                                if (i14 == 6) {
                                    f46Var3.x.setText("2 GB");
                                } else {
                                    f46Var3.x.setText(Integer.toString(i22));
                                }
                                z2 = false;
                                i46Var.s2.x.setVisibility(0);
                                i12 = 2;
                                if (i14 != i12 || i14 == 5) {
                                    i46Var.s2.I = z2;
                                }
                                addView(i46Var.s2, qoe.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                            }
                        }
                        i12 = 2;
                        i9 = 6;
                        z2 = false;
                        if (i14 != i12) {
                        }
                        i46Var.s2.I = z2;
                        addView(i46Var.s2, qoe.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                    }
                    if (i14 == 31) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageDrawable(getContext().getDrawable(R.drawable.large_boosts));
                        i10 = 17;
                        frameLayout.addView(imageView, qoe.e(-2, -2, 17));
                        int L = gm.L(79.0f);
                        int i29 = cmb.Ei;
                        ShapeDrawable K = cmb.K(L, cmb.u0(i29));
                        wmb M = anb.M(i29);
                        frameLayout.setBackground(K);
                        anb.j(frameLayout, K, M, null, null);
                        addView(frameLayout, qoe.t(79, 79, 1, 0, 23, 0, 0));
                    } else {
                        i10 = 17;
                    }
                    TextView textView5 = new TextView(context);
                    this.a = textView5;
                    textView5.setTypeface(gm.o());
                    if (i14 == 31) {
                        this.a.setText(jb6.L0(2131753565));
                    } else if (i14 == 32) {
                        this.a.setText(i46Var.d1());
                    } else if (i14 == 19) {
                        boolean z6 = dVar instanceof ac5;
                        TextView textView6 = this.a;
                        if (z6) {
                            textView6.setText(jb6.L0(2131753318));
                        } else {
                            textView6.setText(i46Var.d1());
                        }
                    } else if (i14 == 30) {
                        this.a.setText(i46Var.d1());
                    } else if (i14 == 35) {
                        this.a.setText(jb6.L0(2131743562));
                    } else if (i14 == 18) {
                        int i30 = i46Var.W1.level;
                        TextView textView7 = this.a;
                        if (i30 == 0) {
                            textView7.setText(jb6.L0(2131753494));
                        } else {
                            textView7.setText(jb6.L0(2131753309));
                        }
                    } else if (i14 == 21) {
                        this.a.setText(jb6.L0(2131746138));
                    } else if (i14 == 20) {
                        this.a.setText(jb6.L0(2131753500));
                    } else if (i14 == 24) {
                        this.a.setText(jb6.L0(2131753496));
                    } else if (i14 == 27) {
                        this.a.setText(jb6.L0(2131753497));
                    } else if (i14 == 28) {
                        this.a.setText(jb6.L0(2131753495));
                    } else if (i14 == 25) {
                        this.a.setText(jb6.L0(2131753499));
                    } else if (i14 == 26) {
                        this.a.setText(jb6.L0(2131753490));
                    } else {
                        if (i14 != 29) {
                            i11 = 22;
                            if (i14 == 22 || i14 == 23) {
                                this.a.setText(jb6.L0(2131753491));
                            } else if (i14 == 11) {
                                boolean z7 = i46Var.T1;
                                TextView textView8 = this.a;
                                if (z7) {
                                    textView8.setText(jb6.L0(2131752346));
                                } else {
                                    textView8.setText(jb6.L0(2131752344));
                                }
                            } else if (i14 == 34) {
                                this.a.setText(jb6.L0(2131752574));
                            } else if (i14 == i9) {
                                this.a.setText(jb6.L0(2131750764));
                            } else if (i14 != 14 || i46Var.S1 <= 1) {
                                this.a.setText(jb6.L0(2131748735));
                            } else {
                                this.a.setText(jb6.L0(2131751655));
                            }
                            this.a.setTextSize(1, 20.0f);
                            TextView textView9 = this.a;
                            int i31 = cmb.F6;
                            anb.X(textView9, i31, i46Var.J0);
                            this.a.setGravity(i10);
                            if (i14 != 19 || i14 == 32 || i46Var.j1()) {
                                mn0 mn0Var = new mn0(context);
                                this.c = mn0Var;
                                mn0Var.a(i46Var.X1.i, false);
                                if (i14 == 32) {
                                    mn0Var.setVisibility(8);
                                }
                                if (i46Var.Z1) {
                                    addView(this.a, qoe.t(-2, -2, 1, 0, z ? 8 : i11, 0, 0));
                                    LinearLayout linearLayout = new LinearLayout(getContext());
                                    linearLayout.setOrientation(0);
                                    linearLayout.setClipChildren(false);
                                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                                    int L2 = gm.L(f7);
                                    int i32 = cmb.Z6;
                                    anb.B(frameLayout2, cmb.b0(L2, cmb.v0(i32, i46Var.J0)), anb.M(i32), i46Var.J0);
                                    bf0 bf0Var = new bf0(getContext());
                                    bf0Var.setRoundRadius(gm.L(f7));
                                    TLRPC.Chat L0 = oc7.r1(i46Var.a).L0(Long.valueOf(-i46Var.V1));
                                    pc0 pc0Var = new pc0();
                                    pc0Var.p(L0);
                                    bf0Var.f(L0, pc0Var);
                                    frameLayout2.addView(bf0Var, qoe.c(28.0f, 28));
                                    TextView textView10 = new TextView(getContext());
                                    if (L0 != null) {
                                        textView10.setText(L0.title);
                                    }
                                    textView10.setSingleLine(true);
                                    textView10.setMaxLines(1);
                                    textView10.setEllipsize(TextUtils.TruncateAt.END);
                                    textView10.setTextSize(1, 13.0f);
                                    anb.X(textView10, i31, i46Var.J0);
                                    frameLayout2.addView(textView10, qoe.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout.addView(frameLayout2, qoe.t(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition = new LayoutTransition();
                                    layoutTransition.setDuration(100L);
                                    layoutTransition.enableTransitionType(4);
                                    linearLayout.setLayoutTransition(layoutTransition);
                                    linearLayout.addView(mn0Var, qoe.t(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout, qoe.t(-2, 38, 17, 0, -4, 0, 12));
                                    rve.a(linearLayout);
                                    b = 1;
                                    linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: e46
                                        public final /* synthetic */ g46 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b3 = b;
                                            g46 g46Var = this.b;
                                            switch (b3) {
                                                case 0:
                                                    d dVar2 = g46Var.e.F2;
                                                    if (dVar2 != null) {
                                                        bh0 bh0Var = new bh0();
                                                        bh0Var.a = true;
                                                        dVar2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bh0Var);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    i46 i46Var2 = g46Var.e;
                                                    i46Var2.r1.presentFragment(yv1.ga(i46Var2.V1));
                                                    i46Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView11 = new TextView(context);
                                    this.b = textView11;
                                    textView11.setText(gm.S2(str2));
                                    this.b.setTextSize(b, f7);
                                    this.b.setGravity(b);
                                    TextView textView12 = this.b;
                                    textView12.setLineSpacing(textView12.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                    if (i14 != 18) {
                                        ylb ylbVar = i46Var.J0;
                                        boolean z8 = ylbVar instanceof r63;
                                        TextView textView13 = this.b;
                                        if (z8) {
                                            anb.X(textView13, cmb.x6, ylbVar);
                                        } else {
                                            anb.X(textView13, i31, ylbVar);
                                        }
                                    } else {
                                        anb.X(this.b, i31, i46Var.J0);
                                    }
                                    View view = this.b;
                                    if (i14 != 19) {
                                        addView(view, qoe.t(-2, -2, 1, 24, -2, 24, 17));
                                    } else {
                                        addView(view, qoe.t(-2, -2, 1, 24, 0, 24, 24));
                                    }
                                    if (i14 == 31) {
                                        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).bottomMargin = gm.L(15.0f);
                                        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).bottomMargin = gm.L(6.0f);
                                        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = gm.L(12.0f);
                                    }
                                    i46Var.w1();
                                    return;
                                }
                                LinearLayout linearLayout2 = new LinearLayout(context);
                                this.d = linearLayout2;
                                linearLayout2.setOrientation(0);
                                this.d.setWeightSum(1.0f);
                                this.d.addView(this.a, qoe.p(-2, -2, 1.0f, 0));
                                this.d.addView(mn0Var, qoe.t(-2, -2, 48, 0, 2, 0, 0));
                                addView(this.d, qoe.t(-2, -2, 1, 12, z ? 8 : i11, 12, 9));
                            } else {
                                addView(this.a, qoe.t(-2, -2, 1, 0, z ? 8 : i11, 0, 10));
                            }
                            b = 1;
                            TextView textView112 = new TextView(context);
                            this.b = textView112;
                            textView112.setText(gm.S2(str2));
                            this.b.setTextSize(b, f7);
                            this.b.setGravity(b);
                            TextView textView122 = this.b;
                            textView122.setLineSpacing(textView122.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                            if (i14 != 18) {
                            }
                            View view2 = this.b;
                            if (i14 != 19) {
                            }
                            if (i14 == 31) {
                            }
                            i46Var.w1();
                            return;
                        }
                        this.a.setText(jb6.L0(2131753498));
                    }
                    i11 = 22;
                    this.a.setTextSize(1, 20.0f);
                    TextView textView92 = this.a;
                    int i312 = cmb.F6;
                    anb.X(textView92, i312, i46Var.J0);
                    this.a.setGravity(i10);
                    if (i14 != 19) {
                    }
                    mn0 mn0Var2 = new mn0(context);
                    this.c = mn0Var2;
                    mn0Var2.a(i46Var.X1.i, false);
                    if (i14 == 32) {
                    }
                    if (i46Var.Z1) {
                    }
                }
                i7 = 1;
                if (z8c.h(i46Var.a).p()) {
                }
                i6 = i23;
                f6 = 1.0f;
                float f112 = i22 / i23;
                if (i14 != 18) {
                }
                if (i26 != 0) {
                }
                if (i14 != 11) {
                }
                if (i46Var.y2.isEmpty()) {
                }
                hd0 hd0Var2 = new hd0(context, false);
                hd0Var2.a.q = gm.L(3.33f);
                hd0Var2.setSize(gm.L(72.0f));
                hd0Var2.setStepFactor(0.4f);
                min = Math.min(arrayList3.size(), 3);
                hd0Var2.setCount(min);
                while (i8 < min) {
                }
                hd0Var2.a(false);
                addView(hd0Var2, qoe.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                TextView textView14 = new TextView(context);
                textView14.setGravity(17);
                wi8.v(textView14, i7, 20.0f);
                int i282 = cmb.i5;
                wi8.x(textView14, i282, i46Var.J0, null, 2131748885);
                addView(textView14, qoe.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView22 = new TextView(context);
                textView22.setGravity(17);
                textView22.setTextSize(1, 14.0f);
                anb.X(textView22, i282, i46Var.J0);
                addView(textView22, qoe.t(-1, -2, 1, 32, 0, 32, 19));
                if (i14 == 34) {
                }
                ArrayList arrayList102 = i46Var.x2;
                if (arrayList102 == null) {
                }
                if (arrayList3.size() == 1) {
                }
                textView22.setText(gm.S2(str3));
                ArrayList arrayList112 = i46Var.y2;
                if (arrayList112 == null) {
                }
                ArrayList arrayList122 = i46Var.x2;
                if (arrayList122 == null) {
                }
                if (size - size2 > 0) {
                }
                ((ViewGroup.MarginLayoutParams) textView22.getLayoutParams()).bottomMargin = gm.L(8.0f);
                i46Var.e2 = true;
                i46Var.w1();
            }
            if (i14 == 34) {
                int size9 = i46Var.w2.size();
                ArrayList arrayList13 = i46Var.w2;
                str = size9 == 1 ? jb6.a0(null, null, 2131748920, bw2.p((TLRPC.User) arrayList13.get(0))) : jb6.G(arrayList13.size(), "InviteCallRestrictedUsers", Integer.valueOf(i46Var.w2.size()));
            } else {
                str = H3 ? i46Var.H2.d : (z8c.h(i46Var.a).p() || i46Var.I2) ? i46Var.H2.c : i46Var.H2.b;
            }
        }
        z = H3;
        str2 = str;
        h46 h46Var2 = i46Var.H2;
        int i222 = h46Var2.e;
        int i232 = h46Var2.f;
        i6 = i46Var.r2;
        if (i14 != 3) {
        }
        i7 = 1;
        if (z8c.h(i46Var.a).p()) {
        }
        i6 = i232;
        f6 = 1.0f;
        float f1122 = i222 / i232;
        if (i14 != 18) {
        }
        if (i26 != 0) {
        }
        if (i14 != 11) {
        }
        if (i46Var.y2.isEmpty()) {
        }
        hd0 hd0Var22 = new hd0(context, false);
        hd0Var22.a.q = gm.L(3.33f);
        hd0Var22.setSize(gm.L(72.0f));
        hd0Var22.setStepFactor(0.4f);
        min = Math.min(arrayList3.size(), 3);
        hd0Var22.setCount(min);
        while (i8 < min) {
        }
        hd0Var22.a(false);
        addView(hd0Var22, qoe.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
        TextView textView142 = new TextView(context);
        textView142.setGravity(17);
        wi8.v(textView142, i7, 20.0f);
        int i2822 = cmb.i5;
        wi8.x(textView142, i2822, i46Var.J0, null, 2131748885);
        addView(textView142, qoe.t(-1, -2, 1, 32, 0, 32, 9));
        TextView textView222 = new TextView(context);
        textView222.setGravity(17);
        textView222.setTextSize(1, 14.0f);
        anb.X(textView222, i2822, i46Var.J0);
        addView(textView222, qoe.t(-1, -2, 1, 32, 0, 32, 19));
        if (i14 == 34) {
        }
        ArrayList arrayList1022 = i46Var.x2;
        if (arrayList1022 == null) {
        }
        if (arrayList3.size() == 1) {
        }
        textView222.setText(gm.S2(str3));
        ArrayList arrayList1122 = i46Var.y2;
        if (arrayList1122 == null) {
        }
        ArrayList arrayList1222 = i46Var.x2;
        if (arrayList1222 == null) {
        }
        if (size - size2 > 0) {
        }
        ((ViewGroup.MarginLayoutParams) textView222.getLayoutParams()).bottomMargin = gm.L(8.0f);
        i46Var.e2 = true;
        i46Var.w1();
    }
}
