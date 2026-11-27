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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j46 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final mm0 c;
    public LinearLayout d;
    public final /* synthetic */ l46 e;

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
    public j46(l46 l46Var, Context context) {
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
        e eVar = l46Var.r1;
        this.e = l46Var;
        setOrientation(1);
        int i13 = l46.R2;
        setPadding(hl.L(6.0f) + l46Var.u0, 0, hl.L(6.0f) + l46Var.u0, 0);
        int i14 = l46Var.c2;
        k46 g1 = l46.g1(i14, l46Var.a);
        l46Var.H2 = g1;
        int i15 = g1.a;
        uc7 s1 = uc7.s1(l46Var.a);
        hr hrVar = s1.l4;
        boolean M3 = s1.M3();
        boolean j1 = l46Var.j1();
        if (i14 == 31) {
            str = ob6.M0(j1 ? 2131753595 : 2131753594, null);
        } else if (i14 == 32) {
            str = l46Var.d1(true);
        } else if (i14 == 19) {
            wb2 wb2Var = l46Var.b2;
            if (wb2Var != null) {
                int i16 = wb2Var.getMessageObject().k.from_boosts_applied;
                TLRPC.Chat f1 = l46Var.f1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) ob6.G(i16, "GroupBoostedByUserWithTimes", lbc.k(l46Var.b2.getCurrentUser(), true)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) ob6.a0(null, null, 2131749251, f1 == null ? "" : f1.title));
                str = spannableStringBuilder.toString();
            } else if (eVar instanceof dc5) {
                str = ob6.G(on0.h(), "BoostingGroupBoostWhatAreBoostsDescription", new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(l46Var.d1(true));
                if (xc2.N(l46Var.f1()) && j1) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) ob6.M0(2131753322, null));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i14 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = l46Var.W1;
            if (tL_premium_boostsStatus.level == 0) {
                int i17 = j1 ? 2131749175 : 2131752325;
                int i18 = tL_premium_boostsStatus.next_level_boosts;
                str = ob6.a0(null, null, i17, ob6.G(i18, "MoreBoosts", Integer.valueOf(i18)));
            } else {
                int i19 = j1 ? 2131749173 : 2131752323;
                int i20 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts;
                str = ob6.a0(null, null, i19, ob6.G(i20, "MoreBoosts", Integer.valueOf(i20)), ob6.G(l46Var.W1.level + 1, "BoostStories", new Object[0]));
            }
        } else if (i14 == 20) {
            str = ob6.a0(null, null, j1 ? 2131749172 : 2131752321, Integer.valueOf(l46Var.b1()));
        } else if (i14 == 24) {
            str = ob6.a0(null, null, j1 ? 2131749168 : 2131752318, Integer.valueOf(l46Var.b1()));
        } else if (i14 == 29) {
            str = ob6.a0(null, null, 2131749171, Integer.valueOf(hrVar.l2.f()));
        } else if (i14 == 30) {
            str = ob6.a0(null, null, 2131752315, Integer.valueOf(hrVar.b2.f()));
        } else if (i14 == 35) {
            str = ob6.a0(null, null, 2131752322, Integer.valueOf(hrVar.c2.f()));
        } else if (i14 == 25) {
            if (j1) {
                f5 = hrVar.k2.f();
                i5 = 2131749169;
            } else {
                f5 = hrVar.f2.f();
                i5 = 2131752319;
            }
            str = ob6.a0(null, null, i5, Integer.valueOf(f5));
        } else if (i14 == 26) {
            if (j1) {
                f4 = hrVar.k2.f();
                i4 = 2131749164;
            } else {
                f4 = hrVar.f2.f();
                i4 = 2131752313;
            }
            str = ob6.a0(null, null, i4, Integer.valueOf(f4));
        } else if (i14 == 27) {
            str = ob6.a0(null, null, j1 ? 2131749166 : 2131752316, Integer.valueOf(hrVar.d2.f()));
        } else if (i14 == 28) {
            if (j1) {
                f3 = hrVar.m2.f();
                i3 = 2131749167;
            } else {
                f3 = hrVar.e2.f();
                i3 = 2131752317;
            }
            str = ob6.a0(null, null, i3, Integer.valueOf(f3));
        } else if (i14 == 22) {
            if (j1) {
                f2 = hrVar.j2.f();
                i2 = 2131749165;
            } else {
                f2 = hrVar.n2.f();
                i2 = 2131752314;
            }
            str = ob6.a0(null, null, i2, Integer.valueOf(f2));
        } else if (i14 == 23) {
            if (j1) {
                f = hrVar.g2.f();
                i = 2131749170;
            } else {
                f = hrVar.o2.f();
                i = 2131752320;
            }
            str = ob6.a0(null, null, i, Integer.valueOf(f));
        } else if (i14 == 21) {
            int i21 = l46Var.M2;
            str = ob6.G(i21, "ReactionReachLvlForReaction", Integer.valueOf(i21));
        } else {
            if (i14 == 11) {
                boolean z3 = l46Var.T1;
                TLRPC.Chat chat = l46Var.J2;
                if (z3) {
                    boolean V = xc2.V(chat);
                    ArrayList arrayList4 = l46Var.w2;
                    if (V) {
                        int size3 = arrayList4.size();
                        ArrayList arrayList5 = l46Var.w2;
                        a0 = size3 == 1 ? ob6.a0(null, null, 2131748909, lv2.p((TLRPC.User) arrayList5.get(0))) : ob6.G(arrayList5.size(), "InviteChannelRestrictedUsers", Integer.valueOf(l46Var.w2.size()));
                    } else {
                        int size4 = arrayList4.size();
                        ArrayList arrayList6 = l46Var.w2;
                        a0 = size4 == 1 ? ob6.a0(null, null, 2131748874, lv2.p((TLRPC.User) arrayList6.get(0))) : ob6.G(arrayList6.size(), "InviteRestrictedUsers", Integer.valueOf(l46Var.w2.size()));
                    }
                } else {
                    boolean V2 = xc2.V(chat);
                    ArrayList arrayList7 = l46Var.w2;
                    if (V2) {
                        int size5 = arrayList7.size();
                        ArrayList arrayList8 = l46Var.w2;
                        a0 = size5 == 1 ? ob6.a0(null, null, 2131748912, lv2.p((TLRPC.User) arrayList8.get(0))) : ob6.G(arrayList8.size(), "InviteChannelRestrictedUsers2", Integer.valueOf(l46Var.w2.size()));
                    } else {
                        int size6 = arrayList7.size();
                        ArrayList arrayList9 = l46Var.w2;
                        a0 = size6 == 1 ? ob6.a0(null, null, 2131748877, lv2.p((TLRPC.User) arrayList9.get(0))) : ob6.G(arrayList9.size(), "InviteRestrictedUsers2", Integer.valueOf(l46Var.w2.size()));
                    }
                }
                str2 = a0;
                z = true;
                k46 k46Var = l46Var.H2;
                int i22 = k46Var.e;
                int i23 = k46Var.f;
                i6 = l46Var.r2;
                if (i14 != 3) {
                    i6 = uc7.s1(l46Var.a).G0.size() - 1;
                } else if (i14 == 7) {
                    i6 = yac.c();
                } else if (i14 == 0) {
                    ArrayList W0 = uc7.s1(l46Var.a).W0(0);
                    i7 = 1;
                    int size7 = W0.size();
                    int i24 = 0;
                    for (int i25 = 0; i25 < size7; i25++) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i25);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                            i24++;
                        }
                    }
                    i6 = i24;
                    if (!yac.h(l46Var.a).p() || l46Var.I2) {
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
                    if ((i14 != 11 || i14 == 34) && !uc7.s1(l46Var.a).M3() && (!((arrayList = l46Var.y2) == null || arrayList.isEmpty()) || ((arrayList2 = l46Var.x2) != null && arrayList2.size() >= l46Var.w2.size()))) {
                        arrayList3 = l46Var.y2.isEmpty() ? l46Var.x2 : l46Var.y2;
                        jc0 jc0Var = new jc0(context, false);
                        jc0Var.a.q = hl.L(3.33f);
                        jc0Var.setSize(hl.L(72.0f));
                        jc0Var.setStepFactor(0.4f);
                        min = Math.min(arrayList3.size(), 3);
                        jc0Var.setCount(min);
                        for (i8 = 0; i8 < min; i8++) {
                            Long l = (Long) arrayList3.get(i8);
                            l.getClass();
                            jc0Var.b(i8, l46Var.a, uc7.s1(l46Var.a).X1(l));
                        }
                        jc0Var.a(false);
                        addView(jc0Var, tre.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                        TextView textView = new TextView(context);
                        textView.setGravity(17);
                        ik8.v(textView, i7, 20.0f);
                        int i28 = aob.j5;
                        ik8.x(textView, i28, l46Var.J0, null, 2131748882);
                        addView(textView, tre.t(-1, -2, 1, 32, 0, 32, 9));
                        TextView textView2 = new TextView(context);
                        textView2.setGravity(17);
                        textView2.setTextSize(1, 14.0f);
                        yob.X(textView2, i28, l46Var.J0);
                        addView(textView2, tre.t(-1, -2, 1, 32, 0, 32, 19));
                        boolean z4 = i14 == 34;
                        ArrayList arrayList10 = l46Var.x2;
                        boolean z5 = arrayList10 == null && arrayList10.size() >= l46Var.y2.size();
                        if (arrayList3.size() == 1) {
                            str3 = ob6.a0(null, null, z4 ? 2131748921 : z5 ? 2131748891 : 2131748886, lbc.l(uc7.s1(l46Var.a).X1((Long) arrayList3.get(0))));
                        } else if (arrayList3.size() == 2) {
                            str3 = ob6.a0(null, null, z4 ? 2131748919 : z5 ? 2131748889 : 2131748881, lbc.l(uc7.s1(l46Var.a).X1((Long) arrayList3.get(0))), lbc.l(uc7.s1(l46Var.a).X1((Long) arrayList3.get(1))));
                        } else if (arrayList3.size() == 3) {
                            str3 = ob6.a0(null, null, z4 ? 2131748920 : z5 ? 2131748890 : 2131748883, lbc.l(uc7.s1(l46Var.a).X1((Long) arrayList3.get(0))), lbc.l(uc7.s1(l46Var.a).X1((Long) arrayList3.get(1))), lbc.l(uc7.s1(l46Var.a).X1((Long) arrayList3.get(2))));
                        } else {
                            String G = ob6.G(arrayList3.size() - 2, z4 ? "InviteCallMessagePremiumBlockedMany" : z5 ? "InviteMessagePremiumBlockedMany" : "InvitePremiumBlockedMany", lbc.l(uc7.s1(l46Var.a).X1((Long) arrayList3.get(0))), lbc.l(uc7.s1(l46Var.a).X1((Long) arrayList3.get(1))));
                            int size8 = arrayList3.size() - 2;
                            int v0 = aob.v0(aob.h5, l46Var.J0);
                            jc0Var.b = new al8(aob.Ck, aob.Dk, -1, -1, null);
                            jc0Var.c = new pkb(uh9.k(size8, "+"), 12.0f, hl.n1("fonts/num.otf"));
                            Paint paint = new Paint(1);
                            jc0Var.d = paint;
                            paint.setColor(v0);
                            str3 = G;
                        }
                        textView2.setText(hl.S2(str3));
                        ArrayList arrayList11 = l46Var.y2;
                        size = arrayList11 == null ? 0 : arrayList11.size();
                        ArrayList arrayList12 = l46Var.x2;
                        size2 = arrayList12 == null ? 0 : arrayList12.size();
                        if (size - size2 > 0 || ((size == 1 && size2 == 1) || !l46Var.T1)) {
                            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = hl.L(8.0f);
                            l46Var.e2 = true;
                        } else {
                            final byte b2 = 0;
                            ok8 ok8Var = new ok8(l46Var.J0, context, false);
                            iye.b(ok8Var, 0.02f, 1.2f);
                            ok8Var.b(ob6.M0(2131748884, null), new View.OnClickListener(this) { // from class: h46
                                public final /* synthetic */ j46 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b3 = b2;
                                    j46 j46Var = this.b;
                                    switch (b3) {
                                        case 0:
                                            e eVar2 = j46Var.e.F2;
                                            if (eVar2 != null) {
                                                bg0 bg0Var = new bg0();
                                                bg0Var.a = true;
                                                eVar2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bg0Var);
                                                break;
                                            }
                                            break;
                                        default:
                                            l46 l46Var2 = j46Var.e;
                                            l46Var2.r1.presentFragment(zu1.ha(l46Var2.V1));
                                            l46Var2.dismiss();
                                            break;
                                    }
                                }
                            }, false);
                            float f12 = (l46Var.u0 / hl.p) + 4.0f;
                            addView(ok8Var, tre.k(f12, 0.0f, f12, 18.0f, -1, 48));
                            u8 u8Var = new u8(this, context);
                            u8Var.setGravity(17);
                            yob.X(u8Var, aob.z6, l46Var.J0);
                            u8Var.setText(" " + ob6.M0(2131748885, null) + " ");
                            u8Var.setTextSize(14.0f);
                            addView(u8Var, tre.t(jn7.T2, -2, 1, 12, 0, 12, 20));
                            TextView textView3 = new TextView(context);
                            textView3.setGravity(17);
                            ik8.v(textView3, 1, 20.0f);
                            ik8.x(textView3, i28, l46Var.J0, null, 2131748925);
                            addView(textView3, tre.t(-1, -2, 1, 32, 0, 32, 9));
                            TextView textView4 = new TextView(context);
                            textView4.setGravity(17);
                            textView4.setTextSize(1, 14.0f);
                            yob.X(textView4, i28, l46Var.J0);
                            if (l46Var.y2.size() <= 1) {
                                textView4.setText(ob6.M0(2131748926, null));
                            } else {
                                textView4.setText(ob6.L0(2131748927));
                            }
                            addView(textView4, tre.t(-1, -2, 1, 32, 0, 32, 19));
                        }
                        l46Var.x1();
                    }
                    if (i14 == 31 || i14 == 34) {
                        i9 = 6;
                        f7 = 14.0f;
                    } else {
                        f7 = 14.0f;
                        i46 i46Var = new i46(this, context, i15, i27, i23, f11, l46Var.J0);
                        l46Var.s2 = i46Var;
                        if (i26 != 0) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = l46Var.W1;
                            if (tL_premium_boostsStatus2 != null) {
                                wg1 wg1Var = l46Var.X1;
                                i46Var.h(tL_premium_boostsStatus2, wg1Var != null && wg1Var.l);
                            }
                        } else {
                            i46Var.setBagePosition(f6);
                            l46Var.s2.setType(i14);
                            l46Var.s2.x.setVisibility(8);
                            if (z) {
                                i46 i46Var2 = l46Var.s2;
                                i46Var2.J.setVisibility(8);
                                s36 s36Var = i46Var2.e;
                                if (s36Var != null) {
                                    s36Var.setPadding(hl.L(24.0f), hl.L(3.0f), hl.L(24.0f), hl.L(3.0f));
                                }
                                i46Var2.K = true;
                            } else if (yac.h(l46Var.a).p() || l46Var.I2) {
                                l46Var.s2.w.setVisibility(8);
                                i46 i46Var3 = l46Var.s2;
                                i9 = 6;
                                if (i14 == 6) {
                                    i46Var3.x.setText("2 GB");
                                } else {
                                    i46Var3.x.setText(Integer.toString(i22));
                                }
                                z2 = false;
                                l46Var.s2.x.setVisibility(0);
                                i12 = 2;
                                if (i14 != i12 || i14 == 5) {
                                    l46Var.s2.I = z2;
                                }
                                addView(l46Var.s2, tre.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                            }
                        }
                        i12 = 2;
                        i9 = 6;
                        z2 = false;
                        if (i14 != i12) {
                        }
                        l46Var.s2.I = z2;
                        addView(l46Var.s2, tre.q(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                    }
                    if (i14 == 31) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageDrawable(getContext().getDrawable(R.drawable.large_boosts));
                        i10 = 17;
                        frameLayout.addView(imageView, tre.e(-2, -2, 17));
                        int L = hl.L(79.0f);
                        int i29 = aob.Fi;
                        ShapeDrawable K = aob.K(L, aob.u0(i29));
                        uob M = yob.M(i29);
                        frameLayout.setBackground(K);
                        yob.j(frameLayout, K, M, null, null);
                        addView(frameLayout, tre.t(79, 79, 1, 0, 23, 0, 0));
                    } else {
                        i10 = 17;
                    }
                    TextView textView5 = new TextView(context);
                    this.a = textView5;
                    textView5.setTypeface(hl.o());
                    if (i14 == 31) {
                        this.a.setText(ob6.L0(2131753593));
                    } else if (i14 == 32) {
                        this.a.setText(l46Var.e1());
                    } else if (i14 == 19) {
                        boolean z6 = eVar instanceof dc5;
                        TextView textView6 = this.a;
                        if (z6) {
                            textView6.setText(ob6.L0(2131753346));
                        } else {
                            textView6.setText(l46Var.e1());
                        }
                    } else if (i14 == 30) {
                        this.a.setText(l46Var.e1());
                    } else if (i14 == 35) {
                        this.a.setText(ob6.L0(2131743530));
                    } else if (i14 == 18) {
                        int i30 = l46Var.W1.level;
                        TextView textView7 = this.a;
                        if (i30 == 0) {
                            textView7.setText(ob6.L0(2131753522));
                        } else {
                            textView7.setText(ob6.L0(2131753337));
                        }
                    } else if (i14 == 21) {
                        this.a.setText(ob6.L0(2131746132));
                    } else if (i14 == 20) {
                        this.a.setText(ob6.L0(2131753528));
                    } else if (i14 == 24) {
                        this.a.setText(ob6.L0(2131753524));
                    } else if (i14 == 27) {
                        this.a.setText(ob6.L0(2131753525));
                    } else if (i14 == 28) {
                        this.a.setText(ob6.L0(2131753523));
                    } else if (i14 == 25) {
                        this.a.setText(ob6.L0(2131753527));
                    } else if (i14 == 26) {
                        this.a.setText(ob6.L0(2131753518));
                    } else {
                        if (i14 != 29) {
                            i11 = 22;
                            if (i14 == 22 || i14 == 23) {
                                this.a.setText(ob6.L0(2131753519));
                            } else if (i14 == 11) {
                                boolean z7 = l46Var.T1;
                                TextView textView8 = this.a;
                                if (z7) {
                                    textView8.setText(ob6.L0(2131752374));
                                } else {
                                    textView8.setText(ob6.L0(2131752372));
                                }
                            } else if (i14 == 34) {
                                this.a.setText(ob6.L0(2131752602));
                            } else if (i14 == i9) {
                                this.a.setText(ob6.L0(2131750792));
                            } else if (i14 != 14 || l46Var.S1 <= 1) {
                                this.a.setText(ob6.L0(2131748732));
                            } else {
                                this.a.setText(ob6.L0(2131751683));
                            }
                            this.a.setTextSize(1, 20.0f);
                            TextView textView9 = this.a;
                            int i31 = aob.G6;
                            yob.X(textView9, i31, l46Var.J0);
                            this.a.setGravity(i10);
                            if (i14 != 19 || i14 == 32 || l46Var.k1()) {
                                mm0 mm0Var = new mm0(context);
                                this.c = mm0Var;
                                mm0Var.a(l46Var.X1.i, false);
                                if (i14 == 32) {
                                    mm0Var.setVisibility(8);
                                }
                                if (l46Var.Z1) {
                                    addView(this.a, tre.t(-2, -2, 1, 0, z ? 8 : i11, 0, 0));
                                    LinearLayout linearLayout = new LinearLayout(getContext());
                                    linearLayout.setOrientation(0);
                                    linearLayout.setClipChildren(false);
                                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                                    int L2 = hl.L(f7);
                                    int i32 = aob.a7;
                                    yob.B(frameLayout2, aob.b0(L2, aob.v0(i32, l46Var.J0)), yob.M(i32), l46Var.J0);
                                    de0 de0Var = new de0(getContext());
                                    de0Var.setRoundRadius(hl.L(f7));
                                    TLRPC.Chat M0 = uc7.s1(l46Var.a).M0(Long.valueOf(-l46Var.V1));
                                    rb0 rb0Var = new rb0();
                                    rb0Var.p(M0);
                                    de0Var.f(M0, rb0Var);
                                    frameLayout2.addView(de0Var, tre.c(28.0f, 28));
                                    TextView textView10 = new TextView(getContext());
                                    if (M0 != null) {
                                        textView10.setText(M0.title);
                                    }
                                    textView10.setSingleLine(true);
                                    textView10.setMaxLines(1);
                                    textView10.setEllipsize(TextUtils.TruncateAt.END);
                                    textView10.setTextSize(1, 13.0f);
                                    yob.X(textView10, i31, l46Var.J0);
                                    frameLayout2.addView(textView10, tre.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout.addView(frameLayout2, tre.t(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition = new LayoutTransition();
                                    layoutTransition.setDuration(100L);
                                    layoutTransition.enableTransitionType(4);
                                    linearLayout.setLayoutTransition(layoutTransition);
                                    linearLayout.addView(mm0Var, tre.t(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout, tre.t(-2, 38, 17, 0, -4, 0, 12));
                                    iye.a(linearLayout);
                                    b = 1;
                                    linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: h46
                                        public final /* synthetic */ j46 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b3 = b;
                                            j46 j46Var = this.b;
                                            switch (b3) {
                                                case 0:
                                                    e eVar2 = j46Var.e.F2;
                                                    if (eVar2 != null) {
                                                        bg0 bg0Var = new bg0();
                                                        bg0Var.a = true;
                                                        eVar2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bg0Var);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    l46 l46Var2 = j46Var.e;
                                                    l46Var2.r1.presentFragment(zu1.ha(l46Var2.V1));
                                                    l46Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView11 = new TextView(context);
                                    this.b = textView11;
                                    textView11.setText(hl.S2(str2));
                                    this.b.setTextSize(b, f7);
                                    this.b.setGravity(b);
                                    TextView textView12 = this.b;
                                    textView12.setLineSpacing(textView12.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                    if (i14 != 18) {
                                        vnb vnbVar = l46Var.J0;
                                        boolean z8 = vnbVar instanceof x53;
                                        TextView textView13 = this.b;
                                        if (z8) {
                                            yob.X(textView13, aob.y6, vnbVar);
                                        } else {
                                            yob.X(textView13, i31, vnbVar);
                                        }
                                    } else {
                                        yob.X(this.b, i31, l46Var.J0);
                                    }
                                    View view = this.b;
                                    if (i14 != 19) {
                                        addView(view, tre.t(-2, -2, 1, 24, -2, 24, 17));
                                    } else {
                                        addView(view, tre.t(-2, -2, 1, 24, 0, 24, 24));
                                    }
                                    if (i14 == 31) {
                                        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).bottomMargin = hl.L(15.0f);
                                        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).bottomMargin = hl.L(6.0f);
                                        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = hl.L(12.0f);
                                    }
                                    l46Var.x1();
                                    return;
                                }
                                LinearLayout linearLayout2 = new LinearLayout(context);
                                this.d = linearLayout2;
                                linearLayout2.setOrientation(0);
                                this.d.setWeightSum(1.0f);
                                this.d.addView(this.a, tre.p(-2, -2, 1.0f, 0));
                                this.d.addView(mm0Var, tre.t(-2, -2, 48, 0, 2, 0, 0));
                                addView(this.d, tre.t(-2, -2, 1, 12, z ? 8 : i11, 12, 9));
                            } else {
                                addView(this.a, tre.t(-2, -2, 1, 0, z ? 8 : i11, 0, 10));
                            }
                            b = 1;
                            TextView textView112 = new TextView(context);
                            this.b = textView112;
                            textView112.setText(hl.S2(str2));
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
                            l46Var.x1();
                            return;
                        }
                        this.a.setText(ob6.L0(2131753526));
                    }
                    i11 = 22;
                    this.a.setTextSize(1, 20.0f);
                    TextView textView92 = this.a;
                    int i312 = aob.G6;
                    yob.X(textView92, i312, l46Var.J0);
                    this.a.setGravity(i10);
                    if (i14 != 19) {
                    }
                    mm0 mm0Var2 = new mm0(context);
                    this.c = mm0Var2;
                    mm0Var2.a(l46Var.X1.i, false);
                    if (i14 == 32) {
                    }
                    if (l46Var.Z1) {
                    }
                }
                i7 = 1;
                if (yac.h(l46Var.a).p()) {
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
                if (l46Var.y2.isEmpty()) {
                }
                jc0 jc0Var2 = new jc0(context, false);
                jc0Var2.a.q = hl.L(3.33f);
                jc0Var2.setSize(hl.L(72.0f));
                jc0Var2.setStepFactor(0.4f);
                min = Math.min(arrayList3.size(), 3);
                jc0Var2.setCount(min);
                while (i8 < min) {
                }
                jc0Var2.a(false);
                addView(jc0Var2, tre.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                TextView textView14 = new TextView(context);
                textView14.setGravity(17);
                ik8.v(textView14, i7, 20.0f);
                int i282 = aob.j5;
                ik8.x(textView14, i282, l46Var.J0, null, 2131748882);
                addView(textView14, tre.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView22 = new TextView(context);
                textView22.setGravity(17);
                textView22.setTextSize(1, 14.0f);
                yob.X(textView22, i282, l46Var.J0);
                addView(textView22, tre.t(-1, -2, 1, 32, 0, 32, 19));
                if (i14 == 34) {
                }
                ArrayList arrayList102 = l46Var.x2;
                if (arrayList102 == null) {
                }
                if (arrayList3.size() == 1) {
                }
                textView22.setText(hl.S2(str3));
                ArrayList arrayList112 = l46Var.y2;
                if (arrayList112 == null) {
                }
                ArrayList arrayList122 = l46Var.x2;
                if (arrayList122 == null) {
                }
                if (size - size2 > 0) {
                }
                ((ViewGroup.MarginLayoutParams) textView22.getLayoutParams()).bottomMargin = hl.L(8.0f);
                l46Var.e2 = true;
                l46Var.x1();
            }
            if (i14 == 34) {
                int size9 = l46Var.w2.size();
                ArrayList arrayList13 = l46Var.w2;
                str = size9 == 1 ? ob6.a0(null, null, 2131748917, lv2.p((TLRPC.User) arrayList13.get(0))) : ob6.G(arrayList13.size(), "InviteCallRestrictedUsers", Integer.valueOf(l46Var.w2.size()));
            } else {
                str = M3 ? l46Var.H2.d : (yac.h(l46Var.a).p() || l46Var.I2) ? l46Var.H2.c : l46Var.H2.b;
            }
        }
        z = M3;
        str2 = str;
        k46 k46Var2 = l46Var.H2;
        int i222 = k46Var2.e;
        int i232 = k46Var2.f;
        i6 = l46Var.r2;
        if (i14 != 3) {
        }
        i7 = 1;
        if (yac.h(l46Var.a).p()) {
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
        if (l46Var.y2.isEmpty()) {
        }
        jc0 jc0Var22 = new jc0(context, false);
        jc0Var22.a.q = hl.L(3.33f);
        jc0Var22.setSize(hl.L(72.0f));
        jc0Var22.setStepFactor(0.4f);
        min = Math.min(arrayList3.size(), 3);
        jc0Var22.setCount(min);
        while (i8 < min) {
        }
        jc0Var22.a(false);
        addView(jc0Var22, tre.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
        TextView textView142 = new TextView(context);
        textView142.setGravity(17);
        ik8.v(textView142, i7, 20.0f);
        int i2822 = aob.j5;
        ik8.x(textView142, i2822, l46Var.J0, null, 2131748882);
        addView(textView142, tre.t(-1, -2, 1, 32, 0, 32, 9));
        TextView textView222 = new TextView(context);
        textView222.setGravity(17);
        textView222.setTextSize(1, 14.0f);
        yob.X(textView222, i2822, l46Var.J0);
        addView(textView222, tre.t(-1, -2, 1, 32, 0, 32, 19));
        if (i14 == 34) {
        }
        ArrayList arrayList1022 = l46Var.x2;
        if (arrayList1022 == null) {
        }
        if (arrayList3.size() == 1) {
        }
        textView222.setText(hl.S2(str3));
        ArrayList arrayList1122 = l46Var.y2;
        if (arrayList1122 == null) {
        }
        ArrayList arrayList1222 = l46Var.x2;
        if (arrayList1222 == null) {
        }
        if (size - size2 > 0) {
        }
        ((ViewGroup.MarginLayoutParams) textView222.getLayoutParams()).bottomMargin = hl.L(8.0f);
        l46Var.e2 = true;
        l46Var.x1();
    }
}
