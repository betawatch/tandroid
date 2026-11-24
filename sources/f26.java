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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f26 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final mm0 c;
    public LinearLayout d;
    public final /* synthetic */ h26 e;

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
    public f26(h26 h26Var, Context context) {
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
        d dVar = h26Var.r1;
        this.e = h26Var;
        setOrientation(1);
        int i13 = h26.R2;
        setPadding(gl.L(6.0f) + h26Var.u0, 0, gl.L(6.0f) + h26Var.u0, 0);
        int i14 = h26Var.c2;
        g26 f1 = h26.f1(i14, h26Var.a);
        h26Var.H2 = f1;
        int i15 = f1.a;
        na7 q1 = na7.q1(h26Var.a);
        gr grVar = q1.k4;
        boolean F3 = q1.F3();
        boolean i1 = h26Var.i1();
        if (i14 == 31) {
            str = k96.M0(i1 ? 2131753599 : 2131753598, null);
        } else if (i14 == 32) {
            str = h26Var.c1(true);
        } else if (i14 == 19) {
            gb2 gb2Var = h26Var.b2;
            if (gb2Var != null) {
                int i16 = gb2Var.getMessageObject().k.from_boosts_applied;
                TLRPC.Chat e1 = h26Var.e1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) k96.G(i16, "GroupBoostedByUserWithTimes", l7c.k(h26Var.b2.getCurrentUser(), true)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) k96.a0(null, null, 2131749305, e1 == null ? "" : e1.title));
                str = spannableStringBuilder.toString();
            } else if (dVar instanceof ca5) {
                str = k96.G(on0.h(), "BoostingGroupBoostWhatAreBoostsDescription", new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(h26Var.c1(true));
                if (hc2.N(h26Var.e1()) && i1) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) k96.M0(2131753326, null));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i14 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = h26Var.W1;
            if (tL_premium_boostsStatus.level == 0) {
                int i17 = i1 ? 2131749229 : 2131752341;
                int i18 = tL_premium_boostsStatus.next_level_boosts;
                str = k96.a0(null, null, i17, k96.G(i18, "MoreBoosts", Integer.valueOf(i18)));
            } else {
                int i19 = i1 ? 2131749227 : 2131752339;
                int i20 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts;
                str = k96.a0(null, null, i19, k96.G(i20, "MoreBoosts", Integer.valueOf(i20)), k96.G(h26Var.W1.level + 1, "BoostStories", new Object[0]));
            }
        } else if (i14 == 20) {
            str = k96.a0(null, null, i1 ? 2131749226 : 2131752337, Integer.valueOf(h26Var.a1()));
        } else if (i14 == 24) {
            str = k96.a0(null, null, i1 ? 2131749222 : 2131752334, Integer.valueOf(h26Var.a1()));
        } else if (i14 == 29) {
            str = k96.a0(null, null, 2131749225, Integer.valueOf(grVar.d2.f()));
        } else if (i14 == 30) {
            str = k96.a0(null, null, 2131752331, Integer.valueOf(grVar.T1.f()));
        } else if (i14 == 35) {
            str = k96.a0(null, null, 2131752338, Integer.valueOf(grVar.U1.f()));
        } else if (i14 == 25) {
            if (i1) {
                f5 = grVar.c2.f();
                i5 = 2131749223;
            } else {
                f5 = grVar.X1.f();
                i5 = 2131752335;
            }
            str = k96.a0(null, null, i5, Integer.valueOf(f5));
        } else if (i14 == 26) {
            if (i1) {
                f4 = grVar.c2.f();
                i4 = 2131749218;
            } else {
                f4 = grVar.X1.f();
                i4 = 2131752329;
            }
            str = k96.a0(null, null, i4, Integer.valueOf(f4));
        } else if (i14 == 27) {
            str = k96.a0(null, null, i1 ? 2131749220 : 2131752332, Integer.valueOf(grVar.V1.f()));
        } else if (i14 == 28) {
            if (i1) {
                f3 = grVar.e2.f();
                i3 = 2131749221;
            } else {
                f3 = grVar.W1.f();
                i3 = 2131752333;
            }
            str = k96.a0(null, null, i3, Integer.valueOf(f3));
        } else if (i14 == 22) {
            if (i1) {
                f2 = grVar.b2.f();
                i2 = 2131749219;
            } else {
                f2 = grVar.f2.f();
                i2 = 2131752330;
            }
            str = k96.a0(null, null, i2, Integer.valueOf(f2));
        } else if (i14 == 23) {
            if (i1) {
                f = grVar.Y1.f();
                i = 2131749224;
            } else {
                f = grVar.g2.f();
                i = 2131752336;
            }
            str = k96.a0(null, null, i, Integer.valueOf(f));
        } else if (i14 == 21) {
            int i21 = h26Var.M2;
            str = k96.G(i21, "ReactionReachLvlForReaction", Integer.valueOf(i21));
        } else {
            if (i14 == 11) {
                boolean z3 = h26Var.T1;
                TLRPC.Chat chat = h26Var.J2;
                if (z3) {
                    boolean V = hc2.V(chat);
                    ArrayList arrayList4 = h26Var.w2;
                    if (V) {
                        int size3 = arrayList4.size();
                        ArrayList arrayList5 = h26Var.w2;
                        a0 = size3 == 1 ? k96.a0(null, null, 2131748963, qu2.p((TLRPC.User) arrayList5.get(0))) : k96.G(arrayList5.size(), "InviteChannelRestrictedUsers", Integer.valueOf(h26Var.w2.size()));
                    } else {
                        int size4 = arrayList4.size();
                        ArrayList arrayList6 = h26Var.w2;
                        a0 = size4 == 1 ? k96.a0(null, null, 2131748928, qu2.p((TLRPC.User) arrayList6.get(0))) : k96.G(arrayList6.size(), "InviteRestrictedUsers", Integer.valueOf(h26Var.w2.size()));
                    }
                } else {
                    boolean V2 = hc2.V(chat);
                    ArrayList arrayList7 = h26Var.w2;
                    if (V2) {
                        int size5 = arrayList7.size();
                        ArrayList arrayList8 = h26Var.w2;
                        a0 = size5 == 1 ? k96.a0(null, null, 2131748966, qu2.p((TLRPC.User) arrayList8.get(0))) : k96.G(arrayList8.size(), "InviteChannelRestrictedUsers2", Integer.valueOf(h26Var.w2.size()));
                    } else {
                        int size6 = arrayList7.size();
                        ArrayList arrayList9 = h26Var.w2;
                        a0 = size6 == 1 ? k96.a0(null, null, 2131748931, qu2.p((TLRPC.User) arrayList9.get(0))) : k96.G(arrayList9.size(), "InviteRestrictedUsers2", Integer.valueOf(h26Var.w2.size()));
                    }
                }
                str2 = a0;
                z = true;
                g26 g26Var = h26Var.H2;
                int i22 = g26Var.e;
                int i23 = g26Var.f;
                i6 = h26Var.r2;
                if (i14 != 3) {
                    i6 = na7.q1(h26Var.a).G0.size() - 1;
                } else if (i14 == 7) {
                    i6 = y6c.c();
                } else if (i14 == 0) {
                    ArrayList U0 = na7.q1(h26Var.a).U0(0);
                    i7 = 1;
                    int size7 = U0.size();
                    int i24 = 0;
                    for (int i25 = 0; i25 < size7; i25++) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) U0.get(i25);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                            i24++;
                        }
                    }
                    i6 = i24;
                    if (!y6c.h(h26Var.a).p() || h26Var.I2) {
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
                    if ((i14 != 11 || i14 == 34) && !na7.q1(h26Var.a).F3() && (!((arrayList = h26Var.y2) == null || arrayList.isEmpty()) || ((arrayList2 = h26Var.x2) != null && arrayList2.size() >= h26Var.w2.size()))) {
                        arrayList3 = h26Var.y2.isEmpty() ? h26Var.x2 : h26Var.y2;
                        hc0 hc0Var = new hc0(context, false);
                        hc0Var.a.q = gl.L(3.33f);
                        hc0Var.setSize(gl.L(72.0f));
                        hc0Var.setStepFactor(0.4f);
                        min = Math.min(arrayList3.size(), 3);
                        hc0Var.setCount(min);
                        for (i8 = 0; i8 < min; i8++) {
                            Long l = (Long) arrayList3.get(i8);
                            l.getClass();
                            hc0Var.b(i8, h26Var.a, na7.q1(h26Var.a).V1(l));
                        }
                        hc0Var.a(false);
                        addView(hc0Var, nme.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                        TextView textView = new TextView(context);
                        textView.setGravity(17);
                        ug8.v(textView, i7, 20.0f);
                        int i28 = bkb.i5;
                        ug8.x(textView, i28, h26Var.J0, null, 2131748936);
                        addView(textView, nme.t(-1, -2, 1, 32, 0, 32, 9));
                        TextView textView2 = new TextView(context);
                        textView2.setGravity(17);
                        textView2.setTextSize(1, 14.0f);
                        zkb.X(textView2, i28, h26Var.J0);
                        addView(textView2, nme.t(-1, -2, 1, 32, 0, 32, 19));
                        boolean z4 = i14 == 34;
                        ArrayList arrayList10 = h26Var.x2;
                        boolean z5 = arrayList10 == null && arrayList10.size() >= h26Var.y2.size();
                        if (arrayList3.size() == 1) {
                            str3 = k96.a0(null, null, z4 ? 2131748975 : z5 ? 2131748945 : 2131748940, l7c.l(na7.q1(h26Var.a).V1((Long) arrayList3.get(0))));
                        } else if (arrayList3.size() == 2) {
                            str3 = k96.a0(null, null, z4 ? 2131748973 : z5 ? 2131748943 : 2131748935, l7c.l(na7.q1(h26Var.a).V1((Long) arrayList3.get(0))), l7c.l(na7.q1(h26Var.a).V1((Long) arrayList3.get(1))));
                        } else if (arrayList3.size() == 3) {
                            str3 = k96.a0(null, null, z4 ? 2131748974 : z5 ? 2131748944 : 2131748937, l7c.l(na7.q1(h26Var.a).V1((Long) arrayList3.get(0))), l7c.l(na7.q1(h26Var.a).V1((Long) arrayList3.get(1))), l7c.l(na7.q1(h26Var.a).V1((Long) arrayList3.get(2))));
                        } else {
                            String G = k96.G(arrayList3.size() - 2, z4 ? "InviteCallMessagePremiumBlockedMany" : z5 ? "InviteMessagePremiumBlockedMany" : "InvitePremiumBlockedMany", l7c.l(na7.q1(h26Var.a).V1((Long) arrayList3.get(0))), l7c.l(na7.q1(h26Var.a).V1((Long) arrayList3.get(1))));
                            int size8 = arrayList3.size() - 2;
                            int v0 = bkb.v0(bkb.g5, h26Var.J0);
                            hc0Var.b = new mh8(bkb.Bk, bkb.Ck, -1, -1, null);
                            hc0Var.c = new tgb(de9.k(size8, "+"), 12.0f, gl.n1("fonts/num.otf"));
                            Paint paint = new Paint(1);
                            hc0Var.d = paint;
                            paint.setColor(v0);
                            str3 = G;
                        }
                        textView2.setText(gl.S2(str3));
                        ArrayList arrayList11 = h26Var.y2;
                        size = arrayList11 == null ? 0 : arrayList11.size();
                        ArrayList arrayList12 = h26Var.x2;
                        size2 = arrayList12 == null ? 0 : arrayList12.size();
                        if (size - size2 > 0 || ((size == 1 && size2 == 1) || !h26Var.T1)) {
                            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = gl.L(8.0f);
                            h26Var.e2 = true;
                        } else {
                            final byte b2 = 0;
                            ah8 ah8Var = new ah8(h26Var.J0, context, false);
                            ote.b(ah8Var, 0.02f, 1.2f);
                            ah8Var.b(k96.M0(2131748938, null), new View.OnClickListener(this) { // from class: d26
                                public final /* synthetic */ f26 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b3 = b2;
                                    f26 f26Var = this.b;
                                    switch (b3) {
                                        case 0:
                                            d dVar2 = f26Var.e.F2;
                                            if (dVar2 != null) {
                                                ag0 ag0Var = new ag0();
                                                ag0Var.a = true;
                                                dVar2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), ag0Var);
                                                break;
                                            }
                                            break;
                                        default:
                                            h26 h26Var2 = f26Var.e;
                                            h26Var2.r1.presentFragment(mu1.W9(h26Var2.V1));
                                            h26Var2.dismiss();
                                            break;
                                    }
                                }
                            }, false);
                            float f12 = (h26Var.u0 / gl.p) + 4.0f;
                            addView(ah8Var, nme.k(f12, 0.0f, f12, 18.0f, -1, 48));
                            t8 t8Var = new t8(this, context);
                            t8Var.setGravity(17);
                            zkb.X(t8Var, bkb.y6, h26Var.J0);
                            t8Var.setText(" " + k96.M0(2131748939, null) + " ");
                            t8Var.setTextSize(14.0f);
                            addView(t8Var, nme.t(kk7.T2, -2, 1, 12, 0, 12, 20));
                            TextView textView3 = new TextView(context);
                            textView3.setGravity(17);
                            ug8.v(textView3, 1, 20.0f);
                            ug8.x(textView3, i28, h26Var.J0, null, 2131748979);
                            addView(textView3, nme.t(-1, -2, 1, 32, 0, 32, 9));
                            TextView textView4 = new TextView(context);
                            textView4.setGravity(17);
                            textView4.setTextSize(1, 14.0f);
                            zkb.X(textView4, i28, h26Var.J0);
                            if (h26Var.y2.size() <= 1) {
                                textView4.setText(k96.M0(2131748980, null));
                            } else {
                                textView4.setText(k96.L0(2131748981));
                            }
                            addView(textView4, nme.t(-1, -2, 1, 32, 0, 32, 19));
                        }
                        h26Var.w1();
                    }
                    if (i14 == 31 || i14 == 34) {
                        i9 = 6;
                        f7 = 14.0f;
                    } else {
                        f7 = 14.0f;
                        e26 e26Var = new e26(this, context, i15, i27, i23, f11, h26Var.J0);
                        h26Var.s2 = e26Var;
                        if (i26 != 0) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = h26Var.W1;
                            if (tL_premium_boostsStatus2 != null) {
                                ng1 ng1Var = h26Var.X1;
                                e26Var.h(tL_premium_boostsStatus2, ng1Var != null && ng1Var.l);
                            }
                        } else {
                            e26Var.setBagePosition(f6);
                            h26Var.s2.setType(i14);
                            h26Var.s2.x.setVisibility(8);
                            if (z) {
                                e26 e26Var2 = h26Var.s2;
                                e26Var2.J.setVisibility(8);
                                o16 o16Var = e26Var2.e;
                                if (o16Var != null) {
                                    o16Var.setPadding(gl.L(24.0f), gl.L(3.0f), gl.L(24.0f), gl.L(3.0f));
                                }
                                e26Var2.K = true;
                            } else if (y6c.h(h26Var.a).p() || h26Var.I2) {
                                h26Var.s2.w.setVisibility(8);
                                e26 e26Var3 = h26Var.s2;
                                i9 = 6;
                                if (i14 == 6) {
                                    e26Var3.x.setText("2 GB");
                                } else {
                                    e26Var3.x.setText(Integer.toString(i22));
                                }
                                z2 = false;
                                h26Var.s2.x.setVisibility(0);
                                i12 = 2;
                                if (i14 != i12 || i14 == 5) {
                                    h26Var.s2.I = z2;
                                }
                                addView(h26Var.s2, nme.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                            }
                        }
                        i12 = 2;
                        i9 = 6;
                        z2 = false;
                        if (i14 != i12) {
                        }
                        h26Var.s2.I = z2;
                        addView(h26Var.s2, nme.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                    }
                    if (i14 == 31) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageDrawable(getContext().getDrawable(R.drawable.large_boosts));
                        i10 = 17;
                        frameLayout.addView(imageView, nme.e(-2, -2, 17));
                        int L = gl.L(79.0f);
                        int i29 = bkb.Ei;
                        ShapeDrawable K = bkb.K(L, bkb.u0(i29));
                        vkb M = zkb.M(i29);
                        frameLayout.setBackground(K);
                        zkb.j(frameLayout, K, M, null, null);
                        addView(frameLayout, nme.t(79, 79, 1, 0, 23, 0, 0));
                    } else {
                        i10 = 17;
                    }
                    TextView textView5 = new TextView(context);
                    this.a = textView5;
                    textView5.setTypeface(gl.o());
                    if (i14 == 31) {
                        this.a.setText(k96.L0(2131753597));
                    } else if (i14 == 32) {
                        this.a.setText(h26Var.d1());
                    } else if (i14 == 19) {
                        boolean z6 = dVar instanceof ca5;
                        TextView textView6 = this.a;
                        if (z6) {
                            textView6.setText(k96.L0(2131753350));
                        } else {
                            textView6.setText(h26Var.d1());
                        }
                    } else if (i14 == 30) {
                        this.a.setText(h26Var.d1());
                    } else if (i14 == 35) {
                        this.a.setText(k96.L0(2131743636));
                    } else if (i14 == 18) {
                        int i30 = h26Var.W1.level;
                        TextView textView7 = this.a;
                        if (i30 == 0) {
                            textView7.setText(k96.L0(2131753526));
                        } else {
                            textView7.setText(k96.L0(2131753341));
                        }
                    } else if (i14 == 21) {
                        this.a.setText(k96.L0(2131746212));
                    } else if (i14 == 20) {
                        this.a.setText(k96.L0(2131753532));
                    } else if (i14 == 24) {
                        this.a.setText(k96.L0(2131753528));
                    } else if (i14 == 27) {
                        this.a.setText(k96.L0(2131753529));
                    } else if (i14 == 28) {
                        this.a.setText(k96.L0(2131753527));
                    } else if (i14 == 25) {
                        this.a.setText(k96.L0(2131753531));
                    } else if (i14 == 26) {
                        this.a.setText(k96.L0(2131753522));
                    } else {
                        if (i14 != 29) {
                            i11 = 22;
                            if (i14 == 22 || i14 == 23) {
                                this.a.setText(k96.L0(2131753523));
                            } else if (i14 == 11) {
                                boolean z7 = h26Var.T1;
                                TextView textView8 = this.a;
                                if (z7) {
                                    textView8.setText(k96.L0(2131752390));
                                } else {
                                    textView8.setText(k96.L0(2131752388));
                                }
                            } else if (i14 == 34) {
                                this.a.setText(k96.L0(2131752609));
                            } else if (i14 == i9) {
                                this.a.setText(k96.L0(2131750815));
                            } else if (i14 != 14 || h26Var.S1 <= 1) {
                                this.a.setText(k96.L0(2131748786));
                            } else {
                                this.a.setText(k96.L0(2131751706));
                            }
                            this.a.setTextSize(1, 20.0f);
                            TextView textView9 = this.a;
                            int i31 = bkb.F6;
                            zkb.X(textView9, i31, h26Var.J0);
                            this.a.setGravity(i10);
                            if (i14 != 19 || i14 == 32 || h26Var.j1()) {
                                mm0 mm0Var = new mm0(context);
                                this.c = mm0Var;
                                mm0Var.a(h26Var.X1.i, false);
                                if (i14 == 32) {
                                    mm0Var.setVisibility(8);
                                }
                                if (h26Var.Z1) {
                                    addView(this.a, nme.t(-2, -2, 1, 0, z ? 8 : i11, 0, 0));
                                    LinearLayout linearLayout = new LinearLayout(getContext());
                                    linearLayout.setOrientation(0);
                                    linearLayout.setClipChildren(false);
                                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                                    int L2 = gl.L(f7);
                                    int i32 = bkb.Z6;
                                    zkb.B(frameLayout2, bkb.b0(L2, bkb.v0(i32, h26Var.J0)), zkb.M(i32), h26Var.J0);
                                    be0 be0Var = new be0(getContext());
                                    be0Var.setRoundRadius(gl.L(f7));
                                    TLRPC.Chat K0 = na7.q1(h26Var.a).K0(Long.valueOf(-h26Var.V1));
                                    pb0 pb0Var = new pb0();
                                    pb0Var.p(K0);
                                    be0Var.f(K0, pb0Var);
                                    frameLayout2.addView(be0Var, nme.c(28.0f, 28));
                                    TextView textView10 = new TextView(getContext());
                                    if (K0 != null) {
                                        textView10.setText(K0.title);
                                    }
                                    textView10.setSingleLine(true);
                                    textView10.setMaxLines(1);
                                    textView10.setEllipsize(TextUtils.TruncateAt.END);
                                    textView10.setTextSize(1, 13.0f);
                                    zkb.X(textView10, i31, h26Var.J0);
                                    frameLayout2.addView(textView10, nme.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout.addView(frameLayout2, nme.t(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition = new LayoutTransition();
                                    layoutTransition.setDuration(100L);
                                    layoutTransition.enableTransitionType(4);
                                    linearLayout.setLayoutTransition(layoutTransition);
                                    linearLayout.addView(mm0Var, nme.t(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout, nme.t(-2, 38, 17, 0, -4, 0, 12));
                                    ote.a(linearLayout);
                                    b = 1;
                                    linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: d26
                                        public final /* synthetic */ f26 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b3 = b;
                                            f26 f26Var = this.b;
                                            switch (b3) {
                                                case 0:
                                                    d dVar2 = f26Var.e.F2;
                                                    if (dVar2 != null) {
                                                        ag0 ag0Var = new ag0();
                                                        ag0Var.a = true;
                                                        dVar2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), ag0Var);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    h26 h26Var2 = f26Var.e;
                                                    h26Var2.r1.presentFragment(mu1.W9(h26Var2.V1));
                                                    h26Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView11 = new TextView(context);
                                    this.b = textView11;
                                    textView11.setText(gl.S2(str2));
                                    this.b.setTextSize(b, f7);
                                    this.b.setGravity(b);
                                    TextView textView12 = this.b;
                                    textView12.setLineSpacing(textView12.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                    if (i14 != 18) {
                                        wjb wjbVar = h26Var.J0;
                                        boolean z8 = wjbVar instanceof f53;
                                        TextView textView13 = this.b;
                                        if (z8) {
                                            zkb.X(textView13, bkb.x6, wjbVar);
                                        } else {
                                            zkb.X(textView13, i31, wjbVar);
                                        }
                                    } else {
                                        zkb.X(this.b, i31, h26Var.J0);
                                    }
                                    View view = this.b;
                                    if (i14 != 19) {
                                        addView(view, nme.t(-2, -2, 1, 24, -2, 24, 17));
                                    } else {
                                        addView(view, nme.t(-2, -2, 1, 24, 0, 24, 24));
                                    }
                                    if (i14 == 31) {
                                        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).bottomMargin = gl.L(15.0f);
                                        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).bottomMargin = gl.L(6.0f);
                                        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = gl.L(12.0f);
                                    }
                                    h26Var.w1();
                                    return;
                                }
                                LinearLayout linearLayout2 = new LinearLayout(context);
                                this.d = linearLayout2;
                                linearLayout2.setOrientation(0);
                                this.d.setWeightSum(1.0f);
                                this.d.addView(this.a, nme.p(-2, -2, 1.0f, 0));
                                this.d.addView(mm0Var, nme.t(-2, -2, 48, 0, 2, 0, 0));
                                addView(this.d, nme.t(-2, -2, 1, 12, z ? 8 : i11, 12, 9));
                            } else {
                                addView(this.a, nme.t(-2, -2, 1, 0, z ? 8 : i11, 0, 10));
                            }
                            b = 1;
                            TextView textView112 = new TextView(context);
                            this.b = textView112;
                            textView112.setText(gl.S2(str2));
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
                            h26Var.w1();
                            return;
                        }
                        this.a.setText(k96.L0(2131753530));
                    }
                    i11 = 22;
                    this.a.setTextSize(1, 20.0f);
                    TextView textView92 = this.a;
                    int i312 = bkb.F6;
                    zkb.X(textView92, i312, h26Var.J0);
                    this.a.setGravity(i10);
                    if (i14 != 19) {
                    }
                    mm0 mm0Var2 = new mm0(context);
                    this.c = mm0Var2;
                    mm0Var2.a(h26Var.X1.i, false);
                    if (i14 == 32) {
                    }
                    if (h26Var.Z1) {
                    }
                }
                i7 = 1;
                if (y6c.h(h26Var.a).p()) {
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
                if (h26Var.y2.isEmpty()) {
                }
                hc0 hc0Var2 = new hc0(context, false);
                hc0Var2.a.q = gl.L(3.33f);
                hc0Var2.setSize(gl.L(72.0f));
                hc0Var2.setStepFactor(0.4f);
                min = Math.min(arrayList3.size(), 3);
                hc0Var2.setCount(min);
                while (i8 < min) {
                }
                hc0Var2.a(false);
                addView(hc0Var2, nme.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                TextView textView14 = new TextView(context);
                textView14.setGravity(17);
                ug8.v(textView14, i7, 20.0f);
                int i282 = bkb.i5;
                ug8.x(textView14, i282, h26Var.J0, null, 2131748936);
                addView(textView14, nme.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView22 = new TextView(context);
                textView22.setGravity(17);
                textView22.setTextSize(1, 14.0f);
                zkb.X(textView22, i282, h26Var.J0);
                addView(textView22, nme.t(-1, -2, 1, 32, 0, 32, 19));
                if (i14 == 34) {
                }
                ArrayList arrayList102 = h26Var.x2;
                if (arrayList102 == null) {
                }
                if (arrayList3.size() == 1) {
                }
                textView22.setText(gl.S2(str3));
                ArrayList arrayList112 = h26Var.y2;
                if (arrayList112 == null) {
                }
                ArrayList arrayList122 = h26Var.x2;
                if (arrayList122 == null) {
                }
                if (size - size2 > 0) {
                }
                ((ViewGroup.MarginLayoutParams) textView22.getLayoutParams()).bottomMargin = gl.L(8.0f);
                h26Var.e2 = true;
                h26Var.w1();
            }
            if (i14 == 34) {
                int size9 = h26Var.w2.size();
                ArrayList arrayList13 = h26Var.w2;
                str = size9 == 1 ? k96.a0(null, null, 2131748971, qu2.p((TLRPC.User) arrayList13.get(0))) : k96.G(arrayList13.size(), "InviteCallRestrictedUsers", Integer.valueOf(h26Var.w2.size()));
            } else {
                str = F3 ? h26Var.H2.d : (y6c.h(h26Var.a).p() || h26Var.I2) ? h26Var.H2.c : h26Var.H2.b;
            }
        }
        z = F3;
        str2 = str;
        g26 g26Var2 = h26Var.H2;
        int i222 = g26Var2.e;
        int i232 = g26Var2.f;
        i6 = h26Var.r2;
        if (i14 != 3) {
        }
        i7 = 1;
        if (y6c.h(h26Var.a).p()) {
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
        if (h26Var.y2.isEmpty()) {
        }
        hc0 hc0Var22 = new hc0(context, false);
        hc0Var22.a.q = gl.L(3.33f);
        hc0Var22.setSize(gl.L(72.0f));
        hc0Var22.setStepFactor(0.4f);
        min = Math.min(arrayList3.size(), 3);
        hc0Var22.setCount(min);
        while (i8 < min) {
        }
        hc0Var22.a(false);
        addView(hc0Var22, nme.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
        TextView textView142 = new TextView(context);
        textView142.setGravity(17);
        ug8.v(textView142, i7, 20.0f);
        int i2822 = bkb.i5;
        ug8.x(textView142, i2822, h26Var.J0, null, 2131748936);
        addView(textView142, nme.t(-1, -2, 1, 32, 0, 32, 9));
        TextView textView222 = new TextView(context);
        textView222.setGravity(17);
        textView222.setTextSize(1, 14.0f);
        zkb.X(textView222, i2822, h26Var.J0);
        addView(textView222, nme.t(-1, -2, 1, 32, 0, 32, 19));
        if (i14 == 34) {
        }
        ArrayList arrayList1022 = h26Var.x2;
        if (arrayList1022 == null) {
        }
        if (arrayList3.size() == 1) {
        }
        textView222.setText(gl.S2(str3));
        ArrayList arrayList1122 = h26Var.y2;
        if (arrayList1122 == null) {
        }
        ArrayList arrayList1222 = h26Var.x2;
        if (arrayList1222 == null) {
        }
        if (size - size2 > 0) {
        }
        ((ViewGroup.MarginLayoutParams) textView222.getLayoutParams()).bottomMargin = gl.L(8.0f);
        h26Var.e2 = true;
        h26Var.w1();
    }
}
