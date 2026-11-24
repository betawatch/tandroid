// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kn0 extends ka {
    public final ylb d;
    public r59 f;
    public so0 h;
    public so0 n;
    public if5 r;
    public so0 s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public kn0(ylb ylbVar) {
        this.d = ylbVar;
        mf2 mf2Var = new mf2(this, (byte) 5);
        cf7 Y = cf7.Y(z8c.t0);
        Y.a.c(new x30(Y, mf2Var, (byte) 12));
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 2 || i == 11 || i == 8 || i == 10 || i == 15 || i == 12 || i == 17 || i == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull M0 = oc7.r1(z8c.t0).M0(chat.id);
        if (M0 != null && (i = M0.participants_count) > 0) {
            return i;
        }
        HashMap hashMap = this.x;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        for (int i = 0; i < this.e.size(); i++) {
            if (((jn0) this.e.get(i)).a == 7) {
                g(i);
            }
        }
    }

    @Override // y59
    public final int b() {
        return this.e.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((jn0) this.e.get(i)).a;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        jn0 jn0Var = (jn0) this.e.get(i);
        if (i2 == 0) {
            if5 if5Var = (if5) view;
            this.r = if5Var;
            if5Var.setBoostViaGifsText(this.w);
            this.r.setStars(jn0Var.g);
            return;
        }
        if (i2 == 2) {
            po0 po0Var = (po0) view;
            byte b = jn0Var.l;
            int i3 = jn0Var.i;
            TLRPC.User user = (TLRPC.User) jn0Var.f;
            boolean z = jn0Var.b;
            bf0 bf0Var = po0Var.c;
            ylb ylbVar = po0Var.a;
            dg0 dg0Var = po0Var.d;
            lka lkaVar = po0Var.e;
            pc0 pc0Var = po0Var.b;
            boolean z2 = po0Var.s == b;
            po0Var.s = b;
            if (b == 0) {
                dg0Var.k(jb6.M0(2131753506, null));
                po0Var.setSubtitle(jb6.M0(2131753132, null));
                anb.W(lkaVar, cmb.q5, ylbVar);
                pc0Var.f(16);
                pc0Var.h(-15292942, -15630089);
                po0Var.setDivider(true);
                anb.Z(po0Var, po0Var.getContext(), R.drawable.greydivider_bottom, cmb.a7);
            } else if (b == 1) {
                dg0Var.k(jb6.M0(2131753558, null));
                if (i3 == 1 && user != null) {
                    po0Var.setSubtitle(po0Var.e(b10.e(lkaVar, m9c.r(user), false, null, 0)));
                } else if (i3 > 0) {
                    po0Var.setSubtitle(po0Var.e(jb6.G(i3, "Recipient", new Object[0])));
                } else {
                    po0Var.setSubtitle(po0Var.e(jb6.M0(2131753250, null)));
                }
                anb.W(lkaVar, cmb.m5, ylbVar);
                pc0Var.f(6);
                pc0Var.h(-3905294, -6923014);
                po0Var.setDivider(false);
                anb.Z(po0Var, po0Var.getContext(), R.drawable.greydivider_top, cmb.a7);
            } else if (b == 2) {
                dg0Var.k(jb6.M0(2131753297, null));
                if (i3 == 1 && user != null) {
                    po0Var.setSubtitle(po0Var.e(b10.e(lkaVar, m9c.r(user), false, null, 0)));
                } else if (i3 > 0) {
                    po0Var.setSubtitle(po0Var.e(jb6.G(i3, "Recipient", new Object[0])));
                } else {
                    po0Var.setSubtitle(po0Var.e(jb6.M0(2131753132, null)));
                }
                anb.W(lkaVar, cmb.m5, ylbVar);
                pc0Var.f(25);
                pc0Var.h(-3905294, -6923014);
                po0Var.setDivider(true);
                anb.Z(po0Var, po0Var.getContext(), R.drawable.greydivider_bottom, cmb.a7);
            } else if (b == 3) {
                dg0Var.k(xib.b(jb6.M0(2131753222, null)));
                po0Var.setSubtitle(jb6.M0(2131753132, null));
                anb.W(lkaVar, cmb.q5, ylbVar);
                pc0Var.f(26);
                pc0Var.h(-146917, -625593);
                po0Var.setDivider(false);
                anb.Z(po0Var, po0Var.getContext(), R.drawable.greydivider_top, cmb.a7);
            }
            po0Var.f.a(z, z2);
            bf0Var.setImageDrawable(pc0Var);
            bf0Var.setRoundRadius(gm.L(20.0f));
            return;
        }
        if (i2 == 5) {
            lla llaVar = (lla) view;
            List list = jn0Var.k;
            int i4 = jn0Var.i;
            llaVar.getClass();
            String[] strArr = new String[list.size()];
            for (int i5 = 0; i5 < list.size(); i5++) {
                strArr[i5] = String.valueOf((Integer) list.get(i5));
            }
            llaVar.a.b(i4, null, strArr);
            llaVar.setCallBack(this.h);
            return;
        }
        if (i2 == 6) {
            ((jf5) view).setText(jn0Var.c);
            return;
        }
        if (i2 == 7) {
            mjb mjbVar = (mjb) view;
            mjbVar.setText(jn0Var.c);
            mjbVar.setBackground(jn0Var.g);
            return;
        }
        switch (i2) {
            case 9:
                d92 d92Var = (d92) view;
                TLRPC.InputPeer inputPeer = jn0Var.d;
                if (inputPeer == null) {
                    TLRPC.Chat chat = jn0Var.e;
                    d92Var.f(chat, jn0Var.i, jn0Var.g, F(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(inputPeer.chat_id));
                    d92Var.f(L0, jn0Var.i, jn0Var.g, F(L0));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat L02 = oc7.r1(z8c.t0).L0(Long.valueOf(inputPeer.channel_id));
                    d92Var.f(L02, jn0Var.i, jn0Var.g, F(L02));
                }
                d92Var.setChatDeleteListener(this.n);
                break;
            case 10:
                ((x93) view).setDate(jn0Var.h);
                break;
            case 11:
                ex7 ex7Var = (ex7) view;
                byte b2 = jn0Var.l;
                boolean z3 = jn0Var.b;
                boolean z4 = jn0Var.g;
                List list2 = (List) jn0Var.f;
                TLRPC.Chat chat2 = this.w;
                dg0 dg0Var2 = ex7Var.d;
                ex7Var.s = b2;
                boolean V = sd2.V(chat2);
                if (b2 == 0) {
                    dg0Var2.k(jb6.a0(null, null, V ? 2131753563 : 2131753564, new Object[0]));
                } else if (b2 == 1) {
                    dg0Var2.k(jb6.a0(null, null, V ? 2131753301 : 2131753302, new Object[0]));
                }
                ex7Var.f.a(z3, false);
                ex7Var.setDivider(z4);
                anb.W(ex7Var.e, cmb.m5, ex7Var.a);
                if (list2.size() == 0) {
                    ex7Var.setSubtitle(ex7Var.e(jb6.M0(2131753487, null)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        ex7Var.setSubtitle(ex7Var.e(jb6.a0("BoostingFromAllCountries1", null, 2131753486, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        ex7Var.setSubtitle(ex7Var.e(jb6.a0("BoostingFromAllCountries2", null, 2131753485, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        ex7Var.setSubtitle(ex7Var.e(jb6.a0("BoostingFromAllCountries3", null, 2131753484, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    ex7Var.setSubtitle(ex7Var.e(jb6.G(list2.size(), "BoostingFromCountriesCount", new Object[0])));
                    break;
                }
            case 12:
                us3 us3Var = (us3) view;
                TLObject tLObject = jn0Var.m;
                int i6 = jn0Var.i;
                int i7 = jn0Var.j;
                long j = jn0Var.h;
                CharSequence charSequence = jn0Var.c;
                boolean z5 = jn0Var.g;
                boolean z6 = jn0Var.b;
                us3Var.w = tLObject;
                dg0 dg0Var3 = us3Var.d;
                if (i6 >= 12) {
                    dg0Var3.k(jb6.G(1, "Years", new Object[0]));
                } else {
                    dg0Var3.k(jb6.G(i6, "Months", new Object[0]));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(cj0.h().e(i7 > 0 ? j / i7 : j, charSequence.toString()));
                sb.append(" x ");
                sb.append(i7);
                us3Var.setSubtitle(sb.toString());
                lka lkaVar2 = us3Var.s;
                cj0 h = cj0.h();
                if (i7 <= 0) {
                    j = 0;
                }
                lkaVar2.l(h.e(j, charSequence.toString()), false);
                us3Var.setDivider(z5);
                us3Var.f.a(z6, false);
                break;
            case 13:
                xcb xcbVar = (xcb) view;
                xcbVar.setText(jn0Var.c);
                int i8 = jn0Var.i;
                io ioVar = xcbVar.r;
                String G = i8 > 0 ? jb6.G(i8, "BoostingBoostsCountTitle", Integer.valueOf(i8)) : "";
                ioVar.a();
                ioVar.c(G, true, true);
                break;
            case 14:
                ((qo0) view).setGiveaway((TL_stories.PrepaidGiveaway) jn0Var.f);
                break;
            case 15:
                ueb uebVar = (ueb) view;
                CharSequence charSequence2 = jn0Var.c;
                boolean z7 = jn0Var.b;
                boolean z8 = jn0Var.g;
                uebVar.L = jn0Var.l;
                uebVar.f(charSequence2, z7, z8);
                break;
            case 16:
                n44 n44Var = (n44) view;
                n44Var.setCount(jn0Var.i);
                n44Var.setAfterTextChangedListener(this.s);
                break;
            case 17:
                ata ataVar = (ata) view;
                TLObject tLObject2 = jn0Var.m;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = tLObject2 != null ? (TL_stars.TL_starsGiveawayOption) tLObject2 : null;
                int i9 = jn0Var.i;
                long j2 = jn0Var.h;
                boolean z9 = jn0Var.b;
                TextView textView = ataVar.f;
                io ioVar2 = ataVar.e;
                boolean z10 = ataVar.r == tL_starsGiveawayOption;
                ataVar.a.a(z9, z10);
                ataVar.r = tL_starsGiveawayOption;
                if (z10) {
                    ioVar2.a();
                }
                io ioVar3 = ataVar.d;
                if (tL_starsGiveawayOption == null) {
                    ioVar3.c(ataVar.h, false, true);
                    ioVar2.c(ataVar.n, z10, true);
                    textView.setText("");
                } else {
                    ioVar3.c(jb6.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                    ioVar2.c(jb6.H(',', "BoostingStarOptionPerUser", (int) j2), z10, true);
                    textView.setText(cj0.h().e(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i10 = i9 + 1;
                ataVar.s = i10;
                if (!z10) {
                    ataVar.w.e(true, i10);
                }
                ataVar.invalidate();
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        ylb ylbVar = this.d;
        switch (i) {
            case 2:
                view = new po0(context, ylbVar);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                int i2 = cmb.Z6;
                View bbaVar = new bba(context, cmb.v0(i2, ylbVar), 0);
                anb.h(i2, ylbVar, bbaVar);
                view = bbaVar;
                break;
            case 5:
                view = new lla(context, ylbVar);
                break;
            case 6:
                View jf5Var = new jf5(context, cmb.K6, 21, 15, 3, false, false, this.d);
                anb.h(cmb.g5, ylbVar, jf5Var);
                view = jf5Var;
                break;
            case 7:
                view = new mjb(context, ylbVar);
                break;
            case 8:
                view = new na(context, ylbVar);
                break;
            case 9:
                view = new d92(context, ylbVar);
                break;
            case 10:
                view = new x93(context, ylbVar);
                break;
            case 11:
                ex7 ex7Var = new ex7(context, ylbVar);
                ex7Var.c.setVisibility(8);
                view = ex7Var;
                break;
            case 12:
                view = new us3(context, ylbVar);
                break;
            case 13:
                View xcbVar = new xcb(context, ylbVar);
                anb.h(cmb.g5, ylbVar, xcbVar);
                view = xcbVar;
                break;
            case 14:
                view = new qo0(context, ylbVar);
                break;
            case 15:
                ueb uebVar = new ueb(context, ylbVar);
                uebVar.setHeight(50);
                view = uebVar;
                break;
            case 16:
                view = new n44(context, ylbVar);
                break;
            case 17:
                view = new ata(context, ylbVar);
                break;
            case 18:
                xwa xwaVar = new xwa(context);
                String M0 = jb6.M0(2131747569, null);
                boolean z = xwaVar.c == -1;
                xwaVar.c = -1;
                io ioVar = xwaVar.a;
                ioVar.c(M0, z, true);
                int i3 = cmb.n6;
                cmb.u0(i3);
                anb.U(ioVar, i3, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = xwaVar.b;
                anb.s(imageView, i3, null, mode);
                if (z) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(d53.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                xwaVar.d = false;
                xwaVar.setWillNotDraw(true);
                view = xwaVar;
                break;
            default:
                view = new if5(context, ylbVar);
                break;
        }
        return kt6.h(view, view, -1, -2);
    }
}
