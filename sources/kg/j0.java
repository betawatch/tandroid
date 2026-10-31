package kg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i5;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.zz;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j0 extends sk0 {
    public final /* synthetic */ q0 c;

    public j0(q0 q0Var) {
        this.c = q0Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        q0 q0Var = this.c;
        int i10 = q0Var.Z1;
        if ((i10 == 11 || i10 == 34) && !q0Var.Q1) {
            return false;
        }
        int i11 = c1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.c2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        int i11;
        q0 q0Var = this.c;
        if (q0Var.d2 == i10) {
            return 0;
        }
        if (q0Var.e2 == i10) {
            return 2;
        }
        if (q0Var.f2 == i10) {
            return 3;
        }
        if (q0Var.i2 == i10) {
            return 5;
        }
        if (q0Var.j2 == i10) {
            return 6;
        }
        if (q0Var.R1 == i10) {
            return 7;
        }
        if (q0Var.k2 == i10) {
            return 8;
        }
        ArrayList arrayList = q0Var.m2;
        if (arrayList != null && i10 >= (i11 = q0Var.l2) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = q0Var.Z1;
        return (i12 == 5 || i12 == 11 || i12 == 34) ? 4 : 1;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        q0 q0Var = this.c;
        int i11 = q0Var.Z1;
        HashSet hashSet = q0Var.q2;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) q0Var.a2.get(i10 - q0Var.g2);
            org.telegram.ui.Cells.m mVar = (org.telegram.ui.Cells.m) view;
            TLRPC.Chat currentChannel = mVar.getCurrentChannel();
            mVar.a(chat, false);
            mVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i12 != 9) {
            if (i12 == 3) {
                p4 p4Var = (p4) view;
                if (i11 != 11 && i11 != 34) {
                    if (i11 == 2) {
                        p4Var.setText(cd.L0(2131742816, null));
                        return;
                    } else {
                        p4Var.setText(cd.L0(2131749043, null));
                        return;
                    }
                }
                if (q0Var.Q1) {
                    p4Var.setText(cd.L0(2131752402, null));
                    return;
                } else if (q0Var.t2.size() == 1) {
                    p4Var.setText(cd.L0(2131752399, null));
                    return;
                } else {
                    p4Var.setText(cd.L0(2131752398, null));
                    return;
                }
            }
            if (i12 != 4) {
                return;
            }
            j4 j4Var = (j4) view;
            if (i11 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) q0Var.r2.get(i10 - q0Var.g2);
                j4Var.e(chat2, chat2.title, (String) q0Var.s2.get(i10 - q0Var.g2), ((float) i10) != ((float) q0Var.h2) - 1.0f);
                j4Var.c(hashSet.contains(chat2), false);
                return;
            } else {
                if (i11 == 11 || i11 == 34) {
                    TLRPC.User user = (TLRPC.User) q0Var.t2.get(i10 - q0Var.g2);
                    ArrayList arrayList = q0Var.u2;
                    boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                    TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                    j4Var.R = true;
                    j4Var.Q = requirementtocontactpremium;
                    j4Var.g();
                    j4Var.e(user, i5.m(0, user.first_name, user.last_name), z10 ? cd.L0(2131749136, null) : cd.d0(q0Var.a, user, null, null), ((float) i10) != ((float) q0Var.h2) - 1.0f);
                    j4Var.c(hashSet.contains(user), false);
                    return;
                }
                return;
            }
        }
        int i13 = i10 - q0Var.l2;
        ArrayList arrayList2 = q0Var.m2;
        if (arrayList2 == null || i13 < 0 || i13 >= arrayList2.size()) {
            return;
        }
        m0 m0Var = (m0) view;
        l0 l0Var = (l0) q0Var.m2.get(i13);
        jg.b1 b1Var = m0Var.c;
        ImageView imageView = m0Var.a;
        u5 u5Var = m0Var.b;
        if (l0Var instanceof k0) {
            m0Var.f = (k0) l0Var;
            m0Var.e = null;
            imageView.setVisibility(8);
            u5Var.setVisibility(8);
            b1Var.setVisibility(0);
            u5 u5Var2 = m0Var.d;
            k0 k0Var = m0Var.f;
            u5Var2.l(cd.G(k0Var.g, k0Var.h ? "BoostLevelUnlocks" : "BoostLevel", new Object[0]), false);
            return;
        }
        if (l0Var != null) {
            m0Var.f = null;
            m0Var.e = l0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(m0Var.e.a);
            u5Var.setVisibility(0);
            l0 l0Var2 = m0Var.e;
            if (l0Var2.d != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m0Var.e.d);
                sb2.append("_");
                int i14 = m0Var.e.e;
                cd.D0();
                sb2.append(cd.b1(cd.D0().A.a(i14)));
                String M0 = cd.M0(sb2.toString());
                if (M0 == null || M0.startsWith("LOC_ERR")) {
                    M0 = cd.M0(m0Var.e.d + "_other");
                }
                if (M0 == null) {
                    M0 = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                int indexOf = M0.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(M0);
                    SpannableString spannableString = new SpannableString(a1.g.p(new StringBuilder(), m0Var.e.e, ""));
                    spannableString.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                u5Var.l(spannableStringBuilder, false);
            } else {
                String L0 = cd.L0(l0Var2.b, null);
                String str = L0 != null ? L0 : "";
                if (m0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(m0Var.e.c);
                        spannableString2.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    u5Var.l(spannableStringBuilder2, false);
                } else {
                    u5Var.l(str, false);
                }
            }
            b1Var.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        zz zzVar;
        View view;
        Context context = viewGroup.getContext();
        int i11 = 1;
        final int i12 = 0;
        q0 q0Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.m(context, new i0(this), true, 9);
                break;
            case 2:
                int i13 = t6.a7;
                View c7Var = new c7(context, t6.w0(i13, q0Var.I0), 0);
                a7.i(i13, c7Var, q0Var.I0);
                view = c7Var;
                break;
            case 3:
                View p4Var = new p4(context);
                p4Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
                view = p4Var;
                break;
            case 4:
                View j4Var = new j4(1, 0, context, q0Var.I0, false, false);
                int i14 = q0Var.t0;
                j4Var.setPadding(i14, 0, i14, 0);
                view = j4Var;
                break;
            case 5:
                zz zzVar2 = new zz(context, null);
                zzVar2.setViewType(q0Var.Z1 != 2 ? 21 : 22);
                zzVar2.setIsSingleCell(true);
                zzVar2.setIgnoreHeightCheck(true);
                zzVar2.setItemsCount(10);
                zzVar = zzVar2;
                view = zzVar;
                break;
            case 6:
                view = new bn(q0Var.getContext(), 1);
                break;
            case 7:
                final int i15 = 2;
                ?? frameLayout = new FrameLayout(q0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.i0.L(6.0f) + q0Var.t0, 0, org.telegram.messenger.i0.L(6.0f) + q0Var.t0, 0);
                TextView textView = new TextView(context);
                if (q0Var.I2 == null && w3.N(q0Var.n1())) {
                    q0Var.I2 = new gg.c(this, 22);
                }
                textView.setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(q0Var.I2 == null ? 18.0f : 50.0f), org.telegram.messenger.i0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, b6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L = org.telegram.messenger.i0.L(8.0f);
                int i16 = t6.e7;
                int w02 = t6.w0(i16, q0Var.I0);
                int i17 = t6.i6;
                int o10 = i0.b.o(t6.w0(i17, q0Var.I0), 76);
                org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, w02, o10, o10);
                w6 N = a7.N(i16);
                w6 h = a7.h(i17, 76);
                p6 p6Var = q0Var.I0;
                textView.setBackground(k02);
                a7.k(textView, k02, N, h, p6Var);
                a7.V(textView, t6.G6, q0Var.I0);
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: kg.h0
                    public final /* synthetic */ j0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i15) {
                            case 0:
                                q0 q0Var2 = this.b.c;
                                mg.v.I0(q0Var2.o1, q0Var2.I0, q0Var2.S1, null);
                                break;
                            case 1:
                                q0 q0Var3 = this.b.c;
                                org.telegram.messenger.i0.g(q0Var3.k1());
                                q0Var3.dismiss();
                                break;
                            case 2:
                                org.telegram.messenger.i0.g(this.b.c.k1());
                                break;
                            default:
                                q0 q0Var4 = this.b.c;
                                q0Var4.I2.run();
                                q0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (q0Var.I2 != null) {
                    ImageView imageView = new ImageView(q0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    a7.t(imageView, t6.j5, q0Var.I0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                    int L2 = org.telegram.messenger.i0.L(20.0f);
                    int o11 = i0.b.o(t6.w0(i17, q0Var.I0), 76);
                    org.telegram.ui.Cells.y k03 = t6.k0(L2, L2, L2, L2, 0, o11, o11);
                    w6 h10 = a7.h(i17, 76);
                    p6 p6Var2 = q0Var.I0;
                    imageView.setBackground(k03);
                    a7.k(imageView, k03, null, h10, p6Var2);
                    frameLayout.addView(imageView, b6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i18 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: kg.h0
                        public final /* synthetic */ j0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i18) {
                                case 0:
                                    q0 q0Var2 = this.b.c;
                                    mg.v.I0(q0Var2.o1, q0Var2.I0, q0Var2.S1, null);
                                    break;
                                case 1:
                                    q0 q0Var3 = this.b.c;
                                    org.telegram.messenger.i0.g(q0Var3.k1());
                                    q0Var3.dismiss();
                                    break;
                                case 2:
                                    org.telegram.messenger.i0.g(this.b.c.k1());
                                    break;
                                default:
                                    q0 q0Var4 = this.b.c;
                                    q0Var4.I2.run();
                                    q0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(q0Var.k1());
                textView.setGravity(17);
                zzVar = frameLayout;
                view = zzVar;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(org.telegram.messenger.i0.L(6.0f) + q0Var.t0, 0, org.telegram.messenger.i0.L(6.0f) + q0Var.t0, 0);
                linearLayout.setOrientation(1);
                w80 w80Var = new w80(context);
                p80 p80Var = new p80(context, null);
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.L0(q0Var.r1() ? 2131753189 : 2131753190, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131753188, null));
                spannableStringBuilder.setSpan(new dh.a(this, i11), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = q0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i19 = t6.Uc;
                mutate.setColorFilter(new PorterDuffColorFilter(i19, PorterDuff.Mode.SRC_IN));
                dq dqVar = new dq(0, mutate);
                dqVar.a(i19);
                dqVar.c(org.telegram.messenger.i0.L(18.0f));
                dqVar.E = org.telegram.messenger.i0.L(11.0f);
                dqVar.r = -org.telegram.messenger.i0.L(5.0f);
                spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
                p80Var.setText(TextUtils.concat(W2, " ", org.telegram.messenger.i0.J2(spannableStringBuilder, spannableString, ">")));
                p80Var.setTextSize(1, 14.0f);
                p80Var.setLineSpacing(org.telegram.messenger.i0.L(3.0f), 1.0f);
                p6 p6Var3 = q0Var.I0;
                if (p6Var3 instanceof th.b) {
                    a7.V(p80Var, t6.y6, p6Var3);
                } else {
                    a7.V(p80Var, t6.G6, p6Var3);
                }
                p80Var.setGravity(1);
                p80Var.setOnClickListener(new View.OnClickListener(this) { // from class: kg.h0
                    public final /* synthetic */ j0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                q0 q0Var2 = this.b.c;
                                mg.v.I0(q0Var2.o1, q0Var2.I0, q0Var2.S1, null);
                                break;
                            case 1:
                                q0 q0Var3 = this.b.c;
                                org.telegram.messenger.i0.g(q0Var3.k1());
                                q0Var3.dismiss();
                                break;
                            case 2:
                                org.telegram.messenger.i0.g(this.b.c.k1());
                                break;
                            default:
                                q0 q0Var4 = this.b.c;
                                q0Var4.I2.run();
                                q0Var4.dismiss();
                                break;
                        }
                    }
                });
                w80Var.setOnClickListener(new ag.g(p80Var, 11));
                if (q0Var.s1()) {
                    final int i20 = 1;
                    vh.d dVar = new vh.d(context, q0Var.I0, true);
                    dVar.i(cd.L0(2131751767, null), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: kg.h0
                        public final /* synthetic */ j0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i20) {
                                case 0:
                                    q0 q0Var2 = this.b.c;
                                    mg.v.I0(q0Var2.o1, q0Var2.I0, q0Var2.S1, null);
                                    break;
                                case 1:
                                    q0 q0Var3 = this.b.c;
                                    org.telegram.messenger.i0.g(q0Var3.k1());
                                    q0Var3.dismiss();
                                    break;
                                case 2:
                                    org.telegram.messenger.i0.g(this.b.c.k1());
                                    break;
                                default:
                                    q0 q0Var4 = this.b.c;
                                    q0Var4.I2.run();
                                    q0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(q0Var.y2, b6.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, b6.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, b6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(q0Var.x2, b6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(w80Var, b6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(p80Var, b6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                view = new m0(q0Var, context, q0Var.I0);
                break;
            default:
                p0 p0Var = new p0(q0Var, context);
                q0Var.V1 = p0Var;
                view = p0Var;
                break;
        }
        return sc.e.o(view, view, -1, -2);
    }
}
