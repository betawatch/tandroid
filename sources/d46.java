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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d46 extends c79 {
    public final /* synthetic */ l46 c;

    public d46(l46 l46Var) {
        this.c = l46Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        l46 l46Var = this.c;
        int i = l46Var.c2;
        if ((i == 11 || i == 34) && !l46Var.T1) {
            return false;
        }
        int i2 = f89Var.f;
        return i2 == 1 || i2 == 4;
    }

    @Override // j79
    public final int b() {
        return this.c.f2;
    }

    @Override // j79
    public final int d(int i) {
        int i2;
        l46 l46Var = this.c;
        if (l46Var.g2 == i) {
            return 0;
        }
        if (l46Var.h2 == i) {
            return 2;
        }
        if (l46Var.i2 == i) {
            return 3;
        }
        if (l46Var.l2 == i) {
            return 5;
        }
        if (l46Var.m2 == i) {
            return 6;
        }
        if (l46Var.U1 == i) {
            return 7;
        }
        if (l46Var.n2 == i) {
            return 8;
        }
        ArrayList arrayList = l46Var.p2;
        if (arrayList != null && i >= (i2 = l46Var.o2) && i <= arrayList.size() + i2) {
            return 9;
        }
        int i3 = l46Var.c2;
        return (i3 == 5 || i3 == 11 || i3 == 34) ? 4 : 1;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        l46 l46Var = this.c;
        int i2 = l46Var.c2;
        HashSet hashSet = l46Var.t2;
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) l46Var.d2.get(i - l46Var.j2);
            kb kbVar = (kb) view;
            TLRPC.Chat currentChannel = kbVar.getCurrentChannel();
            kbVar.a(chat, false);
            kbVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i3 != 9) {
            if (i3 == 3) {
                mf5 mf5Var = (mf5) view;
                if (i2 != 11 && i2 != 34) {
                    if (i2 == 2) {
                        mf5Var.setText(ob6.M0(2131742422, null));
                        return;
                    } else {
                        mf5Var.setText(ob6.M0(2131748787, null));
                        return;
                    }
                }
                if (l46Var.T1) {
                    mf5Var.setText(ob6.M0(2131752374, null));
                    return;
                } else if (l46Var.w2.size() == 1) {
                    mf5Var.setText(ob6.M0(2131752371, null));
                    return;
                } else {
                    mf5Var.setText(ob6.M0(2131752370, null));
                    return;
                }
            }
            if (i3 == 4) {
                bd5 bd5Var = (bd5) view;
                if (i2 == 5) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) l46Var.u2.get(i - l46Var.j2);
                    bd5Var.e(chat2, chat2.title, (String) l46Var.v2.get(i - l46Var.j2), ((float) i) != ((float) l46Var.k2) - 1.0f);
                    bd5Var.c(hashSet.contains(chat2), false);
                    return;
                } else {
                    if (i2 == 11 || i2 == 34) {
                        TLRPC.User user = (TLRPC.User) l46Var.w2.get(i - l46Var.j2);
                        ArrayList arrayList = l46Var.x2;
                        boolean z = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                        TL_account.requirementToContactPremium requirementtocontactpremium = z ? new TL_account.requirementToContactPremium() : null;
                        bd5Var.S = true;
                        bd5Var.R = requirementtocontactpremium;
                        bd5Var.g();
                        bd5Var.e(user, lv2.m(0, user.first_name, user.last_name), z ? ob6.M0(2131748880, null) : ob6.d0(l46Var.a, user, null, null), ((float) i) != ((float) l46Var.k2) - 1.0f);
                        bd5Var.c(hashSet.contains(user), false);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i4 = i - l46Var.o2;
        ArrayList arrayList2 = l46Var.p2;
        if (arrayList2 == null || i4 < 0 || i4 >= arrayList2.size()) {
            return;
        }
        g46 g46Var = (g46) view;
        f46 f46Var = (f46) l46Var.p2.get(i4);
        jo0 jo0Var = g46Var.c;
        ImageView imageView = g46Var.a;
        ema emaVar = g46Var.b;
        if (f46Var instanceof e46) {
            g46Var.f = (e46) f46Var;
            g46Var.e = null;
            imageView.setVisibility(8);
            emaVar.setVisibility(8);
            jo0Var.setVisibility(0);
            ema emaVar2 = g46Var.d;
            e46 e46Var = g46Var.f;
            emaVar2.l(ob6.G(e46Var.g, e46Var.h ? "BoostLevelUnlocks" : "BoostLevel", new Object[0]), false);
            return;
        }
        if (f46Var != null) {
            g46Var.f = null;
            g46Var.e = f46Var;
            imageView.setVisibility(0);
            imageView.setImageResource(g46Var.e.a);
            emaVar.setVisibility(0);
            f46 f46Var2 = g46Var.e;
            if (f46Var2.d != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(g46Var.e.d);
                sb.append("_");
                int i5 = g46Var.e.e;
                ob6.D0();
                sb.append(ob6.f1(ob6.D0().A.a(i5)));
                String N0 = ob6.N0(sb.toString());
                if (N0.startsWith("LOC_ERR")) {
                    N0 = ob6.N0(g46Var.e.d + "_other");
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                int indexOf = N0.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(N0);
                    SpannableString spannableString = new SpannableString(uh9.l(new StringBuilder(), g46Var.e.e, ""));
                    spannableString.setSpan(new y7c(hl.o()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                emaVar.l(spannableStringBuilder, false);
            } else {
                String M0 = ob6.M0(f46Var2.b, null);
                if (g46Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M0);
                    int indexOf2 = M0.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(M0);
                        SpannableString spannableString2 = new SpannableString(g46Var.e.c);
                        spannableString2.setSpan(new y7c(hl.o()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    emaVar.l(spannableStringBuilder2, false);
                } else {
                    emaVar.l(M0, false);
                }
            }
            jo0Var.setVisibility(8);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        ViewGroup kbVar;
        View view;
        Context context = viewGroup.getContext();
        final byte b = 0;
        l46 l46Var = this.c;
        switch (i) {
            case 1:
                kbVar = new kb(context, new c46(this), true, 9);
                view = kbVar;
                break;
            case 2:
                int i2 = aob.a7;
                View rcaVar = new rca(context, aob.v0(i2, l46Var.J0), 0);
                yob.h(i2, l46Var.J0, rcaVar);
                view = rcaVar;
                break;
            case 3:
                View mf5Var = new mf5(context);
                mf5Var.setPadding(0, 0, 0, hl.L(8.0f));
                view = mf5Var;
                break;
            case 4:
                View bd5Var = new bd5(1, 0, l46Var.J0, context, false, false);
                int i3 = l46Var.u0;
                bd5Var.setPadding(i3, 0, i3, 0);
                view = bd5Var;
                break;
            case 5:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setViewType(l46Var.c2 == 2 ? 22 : 21);
                tk4Var.setIsSingleCell(true);
                tk4Var.setIgnoreHeightCheck(true);
                tk4Var.setItemsCount(10);
                view = tk4Var;
                break;
            case 6:
                view = new t62(l46Var.getContext(), (byte) 11);
                break;
            case 7:
                final byte b2 = 2;
                kbVar = new FrameLayout(l46Var.getContext());
                kbVar.setPadding(hl.L(6.0f) + l46Var.u0, 0, hl.L(6.0f) + l46Var.u0, 0);
                TextView textView = new TextView(context);
                if (l46Var.L2 == null && xc2.N(l46Var.f1())) {
                    l46Var.L2 = new ea5(this, (byte) 25);
                }
                textView.setPadding(hl.L(18.0f), hl.L(13.0f), hl.L(l46Var.L2 == null ? 18.0f : 50.0f), hl.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                kbVar.addView(textView, tre.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L = hl.L(8.0f);
                int i4 = aob.e7;
                int v0 = aob.v0(i4, l46Var.J0);
                int i5 = aob.i6;
                int o = vm2.o(aob.v0(i5, l46Var.J0), 76);
                hf0 i0 = aob.i0(L, L, L, L, v0, o, o);
                uob M = yob.M(i4);
                uob g = yob.g(i5, 76);
                vnb vnbVar = l46Var.J0;
                textView.setBackground(i0);
                yob.j(textView, i0, M, g, vnbVar);
                yob.X(textView, aob.G6, l46Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: b46
                    public final /* synthetic */ d46 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b3 = b2;
                        d46 d46Var = this.b;
                        switch (b3) {
                            case 0:
                                l46 l46Var2 = d46Var.c;
                                dn0.E0(l46Var2.r1, l46Var2.J0, l46Var2.V1, null);
                                break;
                            case 1:
                                l46 l46Var3 = d46Var.c;
                                hl.g(l46Var3.c1());
                                l46Var3.dismiss();
                                break;
                            case 2:
                                hl.g(d46Var.c.c1());
                                break;
                            default:
                                l46 l46Var4 = d46Var.c;
                                l46Var4.L2.run();
                                l46Var4.dismiss();
                                break;
                        }
                    }
                });
                if (l46Var.L2 != null) {
                    ImageView imageView = new ImageView(l46Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    yob.s(imageView, aob.j5, l46Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
                    int L2 = hl.L(20.0f);
                    int o2 = vm2.o(aob.v0(i5, l46Var.J0), 76);
                    hf0 i02 = aob.i0(L2, L2, L2, L2, 0, o2, o2);
                    uob g2 = yob.g(i5, 76);
                    vnb vnbVar2 = l46Var.J0;
                    imageView.setBackground(i02);
                    yob.j(imageView, i02, null, g2, vnbVar2);
                    kbVar.addView(imageView, tre.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final byte b3 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: b46
                        public final /* synthetic */ d46 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b32 = b3;
                            d46 d46Var = this.b;
                            switch (b32) {
                                case 0:
                                    l46 l46Var2 = d46Var.c;
                                    dn0.E0(l46Var2.r1, l46Var2.J0, l46Var2.V1, null);
                                    break;
                                case 1:
                                    l46 l46Var3 = d46Var.c;
                                    hl.g(l46Var3.c1());
                                    l46Var3.dismiss();
                                    break;
                                case 2:
                                    hl.g(d46Var.c.c1());
                                    break;
                                default:
                                    l46 l46Var4 = d46Var.c;
                                    l46Var4.L2.run();
                                    l46Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(l46Var.c1());
                textView.setGravity(17);
                view = kbVar;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(hl.L(6.0f) + l46Var.u0, 0, hl.L(6.0f) + l46Var.u0, 0);
                linearLayout.setOrientation(1);
                rh6 rh6Var = new rh6(context);
                p66 p66Var = new p66(context, null);
                SpannableStringBuilder S2 = hl.S2(ob6.M0(l46Var.j1() ? 2131753182 : 2131753183, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131753181, null));
                spannableStringBuilder.setSpan(new a31(this, (byte) 7), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = l46Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i6 = aob.Xc;
                mutate.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN));
                wm2 wm2Var = new wm2(0, mutate);
                wm2Var.a(i6);
                wm2Var.c(hl.L(18.0f));
                wm2Var.F = hl.L(11.0f);
                wm2Var.r = -hl.L(5.0f);
                spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
                p66Var.setText(TextUtils.concat(S2, " ", hl.G2(spannableStringBuilder, spannableString, ">")));
                p66Var.setTextSize(1, 14.0f);
                p66Var.setLineSpacing(hl.L(3.0f), 1.0f);
                vnb vnbVar3 = l46Var.J0;
                if (vnbVar3 instanceof x53) {
                    yob.X(p66Var, aob.y6, vnbVar3);
                } else {
                    yob.X(p66Var, aob.G6, vnbVar3);
                }
                final byte b4 = 1;
                p66Var.setGravity(1);
                p66Var.setOnClickListener(new View.OnClickListener(this) { // from class: b46
                    public final /* synthetic */ d46 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b32 = b;
                        d46 d46Var = this.b;
                        switch (b32) {
                            case 0:
                                l46 l46Var2 = d46Var.c;
                                dn0.E0(l46Var2.r1, l46Var2.J0, l46Var2.V1, null);
                                break;
                            case 1:
                                l46 l46Var3 = d46Var.c;
                                hl.g(l46Var3.c1());
                                l46Var3.dismiss();
                                break;
                            case 2:
                                hl.g(d46Var.c.c1());
                                break;
                            default:
                                l46 l46Var4 = d46Var.c;
                                l46Var4.L2.run();
                                l46Var4.dismiss();
                                break;
                        }
                    }
                });
                rh6Var.setOnClickListener(new sa5(p66Var, (byte) 17));
                if (l46Var.k1()) {
                    c51 c51Var = new c51(l46Var.J0, context, true);
                    c51Var.i(ob6.M0(2131751732, null), false, true);
                    c51Var.setOnClickListener(new View.OnClickListener(this) { // from class: b46
                        public final /* synthetic */ d46 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b32 = b4;
                            d46 d46Var = this.b;
                            switch (b32) {
                                case 0:
                                    l46 l46Var2 = d46Var.c;
                                    dn0.E0(l46Var2.r1, l46Var2.J0, l46Var2.V1, null);
                                    break;
                                case 1:
                                    l46 l46Var3 = d46Var.c;
                                    hl.g(l46Var3.c1());
                                    l46Var3.dismiss();
                                    break;
                                case 2:
                                    hl.g(d46Var.c.c1());
                                    break;
                                default:
                                    l46 l46Var4 = d46Var.c;
                                    l46Var4.L2.run();
                                    l46Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(l46Var.B2, tre.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(c51Var, tre.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, tre.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(l46Var.A2, tre.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(rh6Var, tre.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(p66Var, tre.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                view = new g46(l46Var, context, l46Var.J0);
                break;
            default:
                j46 j46Var = new j46(l46Var, context);
                l46Var.Y1 = j46Var;
                view = j46Var;
                break;
        }
        return qu6.h(view, view, -1, -2);
    }
}
