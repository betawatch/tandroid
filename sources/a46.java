// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a46 extends q59 {
    public final /* synthetic */ i46 c;

    public a46(i46 i46Var) {
        this.c = i46Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        i46 i46Var = this.c;
        int i = i46Var.c2;
        if ((i == 11 || i == 34) && !i46Var.T1) {
            return false;
        }
        int i2 = u69Var.f;
        return i2 == 1 || i2 == 4;
    }

    @Override // y59
    public final int b() {
        return this.c.f2;
    }

    @Override // y59
    public final int d(int i) {
        int i2;
        i46 i46Var = this.c;
        if (i46Var.g2 == i) {
            return 0;
        }
        if (i46Var.h2 == i) {
            return 2;
        }
        if (i46Var.i2 == i) {
            return 3;
        }
        if (i46Var.l2 == i) {
            return 5;
        }
        if (i46Var.m2 == i) {
            return 6;
        }
        if (i46Var.U1 == i) {
            return 7;
        }
        if (i46Var.n2 == i) {
            return 8;
        }
        ArrayList arrayList = i46Var.p2;
        if (arrayList != null && i >= (i2 = i46Var.o2) && i <= arrayList.size() + i2) {
            return 9;
        }
        int i3 = i46Var.c2;
        return (i3 == 5 || i3 == 11 || i3 == 34) ? 4 : 1;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        i46 i46Var = this.c;
        int i2 = i46Var.c2;
        HashSet hashSet = i46Var.t2;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) i46Var.d2.get(i - i46Var.j2);
            jb jbVar = (jb) view;
            TLRPC.Chat currentChannel = jbVar.getCurrentChannel();
            jbVar.a(chat, false);
            jbVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i3 != 9) {
            if (i3 == 3) {
                jf5 jf5Var = (jf5) view;
                if (i2 != 11 && i2 != 34) {
                    if (i2 == 2) {
                        jf5Var.setText(jb6.M0(2131742454, null));
                        return;
                    } else {
                        jf5Var.setText(jb6.M0(2131748790, null));
                        return;
                    }
                }
                if (i46Var.T1) {
                    jf5Var.setText(jb6.M0(2131752346, null));
                    return;
                } else if (i46Var.w2.size() == 1) {
                    jf5Var.setText(jb6.M0(2131752343, null));
                    return;
                } else {
                    jf5Var.setText(jb6.M0(2131752342, null));
                    return;
                }
            }
            if (i3 == 4) {
                xc5 xc5Var = (xc5) view;
                if (i2 == 5) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) i46Var.u2.get(i - i46Var.j2);
                    xc5Var.e(chat2, chat2.title, (String) i46Var.v2.get(i - i46Var.j2), ((float) i) != ((float) i46Var.k2) - 1.0f);
                    xc5Var.c(hashSet.contains(chat2), false);
                    return;
                } else {
                    if (i2 == 11 || i2 == 34) {
                        TLRPC.User user = (TLRPC.User) i46Var.w2.get(i - i46Var.j2);
                        ArrayList arrayList = i46Var.x2;
                        boolean z = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                        TL_account.requirementToContactPremium requirementtocontactpremium = z ? new TL_account.requirementToContactPremium() : null;
                        xc5Var.S = true;
                        xc5Var.R = requirementtocontactpremium;
                        xc5Var.g();
                        xc5Var.e(user, bw2.m(0, user.first_name, user.last_name), z ? jb6.M0(2131748883, null) : jb6.d0(i46Var.a, user, null, null), ((float) i) != ((float) i46Var.k2) - 1.0f);
                        xc5Var.c(hashSet.contains(user), false);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i4 = i - i46Var.o2;
        ArrayList arrayList2 = i46Var.p2;
        if (arrayList2 == null || i4 < 0 || i4 >= arrayList2.size()) {
            return;
        }
        d46 d46Var = (d46) view;
        c46 c46Var = (c46) i46Var.p2.get(i4);
        jp0 jp0Var = d46Var.c;
        ImageView imageView = d46Var.a;
        lka lkaVar = d46Var.b;
        if (c46Var instanceof b46) {
            d46Var.f = (b46) c46Var;
            d46Var.e = null;
            imageView.setVisibility(8);
            lkaVar.setVisibility(8);
            jp0Var.setVisibility(0);
            lka lkaVar2 = d46Var.d;
            b46 b46Var = d46Var.f;
            lkaVar2.l(jb6.G(b46Var.g, b46Var.h ? "BoostLevelUnlocks" : "BoostLevel", new Object[0]), false);
            return;
        }
        if (c46Var != null) {
            d46Var.f = null;
            d46Var.e = c46Var;
            imageView.setVisibility(0);
            imageView.setImageResource(d46Var.e.a);
            lkaVar.setVisibility(0);
            c46 c46Var2 = d46Var.e;
            if (c46Var2.d != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(d46Var.e.d);
                sb.append("_");
                int i5 = d46Var.e.e;
                jb6.D0();
                sb.append(jb6.f1(jb6.D0().A.a(i5)));
                String N0 = jb6.N0(sb.toString());
                if (N0.startsWith("LOC_ERR")) {
                    N0 = jb6.N0(d46Var.e.d + "_other");
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                int indexOf = N0.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(N0);
                    SpannableString spannableString = new SpannableString(hg9.k(new StringBuilder(), d46Var.e.e, ""));
                    spannableString.setSpan(new z5c(gm.o()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                lkaVar.l(spannableStringBuilder, false);
            } else {
                String M0 = jb6.M0(c46Var2.b, null);
                if (d46Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M0);
                    int indexOf2 = M0.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(M0);
                        SpannableString spannableString2 = new SpannableString(d46Var.e.c);
                        spannableString2.setSpan(new z5c(gm.o()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    lkaVar.l(spannableStringBuilder2, false);
                } else {
                    lkaVar.l(M0, false);
                }
            }
            jp0Var.setVisibility(8);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ViewGroup jbVar;
        View view;
        Context context = viewGroup.getContext();
        final byte b = 0;
        i46 i46Var = this.c;
        switch (i) {
            case 1:
                jbVar = new jb(context, new z36(this), true, 9);
                view = jbVar;
                break;
            case 2:
                int i2 = cmb.Z6;
                View bbaVar = new bba(context, cmb.v0(i2, i46Var.J0), 0);
                anb.h(i2, i46Var.J0, bbaVar);
                view = bbaVar;
                break;
            case 3:
                View jf5Var = new jf5(context);
                jf5Var.setPadding(0, 0, 0, gm.L(8.0f));
                view = jf5Var;
                break;
            case 4:
                View xc5Var = new xc5(1, 0, i46Var.J0, context, false, false);
                int i3 = i46Var.u0;
                xc5Var.setPadding(i3, 0, i3, 0);
                view = xc5Var;
                break;
            case 5:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setViewType(i46Var.c2 == 2 ? 22 : 21);
                tk4Var.setIsSingleCell(true);
                tk4Var.setIgnoreHeightCheck(true);
                tk4Var.setItemsCount(10);
                view = tk4Var;
                break;
            case 6:
                view = new o72(i46Var.getContext(), (byte) 11);
                break;
            case 7:
                final byte b2 = 2;
                jbVar = new FrameLayout(i46Var.getContext());
                jbVar.setPadding(gm.L(6.0f) + i46Var.u0, 0, gm.L(6.0f) + i46Var.u0, 0);
                TextView textView = new TextView(context);
                if (i46Var.L2 == null && sd2.N(i46Var.e1())) {
                    i46Var.L2 = new kg5(this, (byte) 17);
                }
                textView.setPadding(gm.L(18.0f), gm.L(13.0f), gm.L(i46Var.L2 == null ? 18.0f : 50.0f), gm.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                jbVar.addView(textView, qoe.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L = gm.L(8.0f);
                int i4 = cmb.d7;
                int v0 = cmb.v0(i4, i46Var.J0);
                int i5 = cmb.h6;
                int p = on2.p(cmb.v0(i5, i46Var.J0), 76);
                fg0 i0 = cmb.i0(L, L, L, L, v0, p, p);
                wmb M = anb.M(i4);
                wmb g = anb.g(i5, 76);
                ylb ylbVar = i46Var.J0;
                textView.setBackground(i0);
                anb.j(textView, i0, M, g, ylbVar);
                anb.X(textView, cmb.F6, i46Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: y36
                    public final /* synthetic */ a46 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b3 = b2;
                        a46 a46Var = this.b;
                        switch (b3) {
                            case 0:
                                i46 i46Var2 = a46Var.c;
                                do0.D0(i46Var2.r1, i46Var2.J0, i46Var2.V1, null);
                                break;
                            case 1:
                                i46 i46Var3 = a46Var.c;
                                gm.g(i46Var3.b1());
                                i46Var3.dismiss();
                                break;
                            case 2:
                                gm.g(a46Var.c.b1());
                                break;
                            default:
                                i46 i46Var4 = a46Var.c;
                                i46Var4.L2.run();
                                i46Var4.dismiss();
                                break;
                        }
                    }
                });
                if (i46Var.L2 != null) {
                    ImageView imageView = new ImageView(i46Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    anb.s(imageView, cmb.i5, i46Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
                    int L2 = gm.L(20.0f);
                    int p2 = on2.p(cmb.v0(i5, i46Var.J0), 76);
                    fg0 i02 = cmb.i0(L2, L2, L2, L2, 0, p2, p2);
                    wmb g2 = anb.g(i5, 76);
                    ylb ylbVar2 = i46Var.J0;
                    imageView.setBackground(i02);
                    anb.j(imageView, i02, null, g2, ylbVar2);
                    jbVar.addView(imageView, qoe.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final byte b3 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: y36
                        public final /* synthetic */ a46 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b32 = b3;
                            a46 a46Var = this.b;
                            switch (b32) {
                                case 0:
                                    i46 i46Var2 = a46Var.c;
                                    do0.D0(i46Var2.r1, i46Var2.J0, i46Var2.V1, null);
                                    break;
                                case 1:
                                    i46 i46Var3 = a46Var.c;
                                    gm.g(i46Var3.b1());
                                    i46Var3.dismiss();
                                    break;
                                case 2:
                                    gm.g(a46Var.c.b1());
                                    break;
                                default:
                                    i46 i46Var4 = a46Var.c;
                                    i46Var4.L2.run();
                                    i46Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(i46Var.b1());
                textView.setGravity(17);
                view = jbVar;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(gm.L(6.0f) + i46Var.u0, 0, gm.L(6.0f) + i46Var.u0, 0);
                linearLayout.setOrientation(1);
                nh6 nh6Var = new nh6(context);
                l66 l66Var = new l66(context, null);
                SpannableStringBuilder S2 = gm.S2(jb6.M0(i46Var.i1() ? 2131753154 : 2131753155, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131753153, null));
                spannableStringBuilder.setSpan(new z31(this, (byte) 7), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = i46Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i6 = cmb.Wc;
                mutate.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN));
                pn2 pn2Var = new pn2(0, mutate);
                pn2Var.a(i6);
                pn2Var.c(gm.L(18.0f));
                pn2Var.F = gm.L(11.0f);
                pn2Var.r = -gm.L(5.0f);
                spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
                l66Var.setText(TextUtils.concat(S2, " ", gm.G2(spannableStringBuilder, spannableString, ">")));
                l66Var.setTextSize(1, 14.0f);
                l66Var.setLineSpacing(gm.L(3.0f), 1.0f);
                ylb ylbVar3 = i46Var.J0;
                if (ylbVar3 instanceof r63) {
                    anb.X(l66Var, cmb.x6, ylbVar3);
                } else {
                    anb.X(l66Var, cmb.F6, ylbVar3);
                }
                l66Var.setGravity(1);
                l66Var.setOnClickListener(new View.OnClickListener(this) { // from class: y36
                    public final /* synthetic */ a46 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b32 = b;
                        a46 a46Var = this.b;
                        switch (b32) {
                            case 0:
                                i46 i46Var2 = a46Var.c;
                                do0.D0(i46Var2.r1, i46Var2.J0, i46Var2.V1, null);
                                break;
                            case 1:
                                i46 i46Var3 = a46Var.c;
                                gm.g(i46Var3.b1());
                                i46Var3.dismiss();
                                break;
                            case 2:
                                gm.g(a46Var.c.b1());
                                break;
                            default:
                                i46 i46Var4 = a46Var.c;
                                i46Var4.L2.run();
                                i46Var4.dismiss();
                                break;
                        }
                    }
                });
                nh6Var.setOnClickListener(new ca5(l66Var, (byte) 19));
                if (i46Var.j1()) {
                    final byte b4 = 1;
                    b61 b61Var = new b61(i46Var.J0, context, true);
                    b61Var.i(jb6.M0(2131751704, null), false, true);
                    b61Var.setOnClickListener(new View.OnClickListener(this) { // from class: y36
                        public final /* synthetic */ a46 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b32 = b4;
                            a46 a46Var = this.b;
                            switch (b32) {
                                case 0:
                                    i46 i46Var2 = a46Var.c;
                                    do0.D0(i46Var2.r1, i46Var2.J0, i46Var2.V1, null);
                                    break;
                                case 1:
                                    i46 i46Var3 = a46Var.c;
                                    gm.g(i46Var3.b1());
                                    i46Var3.dismiss();
                                    break;
                                case 2:
                                    gm.g(a46Var.c.b1());
                                    break;
                                default:
                                    i46 i46Var4 = a46Var.c;
                                    i46Var4.L2.run();
                                    i46Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(i46Var.B2, qoe.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(b61Var, qoe.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, qoe.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(i46Var.A2, qoe.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(nh6Var, qoe.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(l66Var, qoe.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                view = new d46(i46Var, context, i46Var.J0);
                break;
            default:
                g46 g46Var = new g46(i46Var, context);
                i46Var.Y1 = g46Var;
                view = g46Var;
                break;
        }
        return kt6.h(view, view, -1, -2);
    }
}
