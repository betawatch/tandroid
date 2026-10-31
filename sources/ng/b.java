package ng;

import ag.l;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k2.u;
import mg.m0;
import og.a0;
import og.f0;
import og.j;
import og.m;
import og.s;
import og.w;
import og.x;
import og.y;
import og.z;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.u1;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.tk0;
import rh.r7;
import s4.c1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b extends hg.c {
    public final p6 d;
    public tk0 f;
    public m0 h;
    public m0 n;
    public s r;
    public m0 s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public b(p6 p6Var) {
        this.d = p6Var;
        l lVar = new l(this, 21);
        hs a02 = hs.a0(d20.s0);
        a02.a.c(new u(25, a02, lVar));
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 2 || i10 == 11 || i10 == 8 || i10 == 10 || i10 == 15 || i10 == 12 || i10 == 17 || i10 == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull M0 = vp.r1(d20.s0).M0(chat.id);
        if (M0 != null && (i10 = M0.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.x;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            if (((a) this.e.get(i10)).a == 7) {
                g(i10);
            }
        }
    }

    @Override // s4.g0
    public final int b() {
        return this.e.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((a) this.e.get(i10)).a;
    }

    @Override // s4.g0
    public final void t(c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        a aVar = (a) this.e.get(i10);
        if (i11 == 0) {
            s sVar = (s) view;
            this.r = sVar;
            sVar.setBoostViaGifsText(this.w);
            this.r.setStars(aVar.g);
            return;
        }
        if (i11 == 2) {
            og.e eVar = (og.e) view;
            int i12 = aVar.l;
            int i13 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z10 = aVar.b;
            g9 g9Var = eVar.c;
            p6 p6Var = eVar.a;
            og.c cVar = eVar.d;
            u5 u5Var = eVar.e;
            r8 r8Var = eVar.b;
            boolean z11 = eVar.s == i12;
            eVar.s = i12;
            if (i12 == 0) {
                cVar.k(cd.L0(2131753541, null));
                eVar.setSubtitle(cd.L0(2131753167, null));
                a7.Y(u5Var, t6.r5, p6Var);
                r8Var.g(16);
                r8Var.i(-15292942, -15630089);
                eVar.setDivider(true);
                a7.a0(eVar, eVar.getContext(), R.drawable.greydivider_bottom, t6.b7);
            } else if (i12 == 1) {
                cVar.k(cd.L0(2131753593, null));
                if (i13 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(k6.m(h20.p(user), u5Var.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i13 > 0) {
                    eVar.setSubtitle(eVar.e(cd.G(i13, "Recipient", new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(cd.L0(2131753285, null)));
                }
                a7.Y(u5Var, t6.n5, p6Var);
                r8Var.g(6);
                r8Var.i(-3905294, -6923014);
                eVar.setDivider(false);
                a7.a0(eVar, eVar.getContext(), R.drawable.greydivider_top, t6.b7);
            } else if (i12 == 2) {
                cVar.k(cd.L0(2131753332, null));
                if (i13 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(k6.m(h20.p(user), u5Var.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i13 > 0) {
                    eVar.setSubtitle(eVar.e(cd.G(i13, "Recipient", new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(cd.L0(2131753167, null)));
                }
                a7.Y(u5Var, t6.n5, p6Var);
                r8Var.g(25);
                r8Var.i(-3905294, -6923014);
                eVar.setDivider(true);
                a7.a0(eVar, eVar.getContext(), R.drawable.greydivider_bottom, t6.b7);
            } else if (i12 == 3) {
                cVar.k(p8.b(cd.L0(2131753257, null)));
                eVar.setSubtitle(cd.L0(2131753167, null));
                a7.Y(u5Var, t6.r5, p6Var);
                r8Var.g(26);
                r8Var.i(-146917, -625593);
                eVar.setDivider(false);
                a7.a0(eVar, eVar.getContext(), R.drawable.greydivider_top, t6.b7);
            }
            eVar.f.a(z10, z11);
            g9Var.setImageDrawable(r8Var);
            g9Var.setRoundRadius(i0.L(20.0f));
            return;
        }
        if (i11 == 5) {
            x xVar = (x) view;
            List list = aVar.k;
            int i14 = aVar.i;
            xVar.getClass();
            String[] strArr = new String[list.size()];
            for (int i15 = 0; i15 < list.size(); i15++) {
                strArr[i15] = String.valueOf((Integer) list.get(i15));
            }
            xVar.a.b(i14, null, strArr);
            xVar.setCallBack(this.h);
            return;
        }
        if (i11 == 6) {
            ((p4) view).setText(aVar.c);
            return;
        }
        if (i11 == 7) {
            f0 f0Var = (f0) view;
            f0Var.setText(aVar.c);
            f0Var.setBackground(aVar.g);
            return;
        }
        switch (i11) {
            case 9:
                og.h hVar = (og.h) view;
                TLRPC.InputPeer inputPeer = aVar.d;
                if (inputPeer == null) {
                    TLRPC.Chat chat = aVar.e;
                    hVar.f(chat, aVar.i, aVar.g, F(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat L0 = vp.r1(d20.s0).L0(Long.valueOf(inputPeer.chat_id));
                    hVar.f(L0, aVar.i, aVar.g, F(L0));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat L02 = vp.r1(d20.s0).L0(Long.valueOf(inputPeer.channel_id));
                    hVar.f(L02, aVar.i, aVar.g, F(L02));
                }
                hVar.setChatDeleteListener(this.n);
                break;
            case 10:
                ((og.i) view).setDate(aVar.h);
                break;
            case 11:
                w wVar = (w) view;
                int i16 = aVar.l;
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat2 = this.w;
                og.c cVar2 = wVar.d;
                wVar.s = i16;
                boolean V = w3.V(chat2);
                if (i16 == 0) {
                    cVar2.k(cd.a0(null, null, V ? 2131753598 : 2131753599, new Object[0]));
                } else if (i16 == 1) {
                    cVar2.k(cd.a0(null, null, V ? 2131753336 : 2131753337, new Object[0]));
                }
                wVar.f.a(z12, false);
                wVar.setDivider(z13);
                a7.Y(wVar.e, t6.n5, wVar.a);
                if (list2.size() == 0) {
                    wVar.setSubtitle(wVar.e(cd.L0(2131753522, null)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        wVar.setSubtitle(wVar.e(cd.a0("BoostingFromAllCountries1", null, 2131753521, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        wVar.setSubtitle(wVar.e(cd.a0("BoostingFromAllCountries2", null, 2131753520, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        wVar.setSubtitle(wVar.e(cd.a0("BoostingFromAllCountries3", null, 2131753519, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    wVar.setSubtitle(wVar.e(cd.G(list2.size(), "BoostingFromCountriesCount", new Object[0])));
                    break;
                }
            case 12:
                j jVar = (j) view;
                TLObject tLObject = aVar.m;
                int i17 = aVar.i;
                int i18 = aVar.j;
                long j10 = aVar.h;
                CharSequence charSequence = aVar.c;
                boolean z14 = aVar.g;
                boolean z15 = aVar.b;
                og.c cVar3 = jVar.d;
                jVar.w = tLObject;
                if (i17 >= 12) {
                    cVar3.k(cd.G(1, "Years", new Object[0]));
                } else {
                    cVar3.k(cd.G(i17, "Months", new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(u1.i().f(i18 > 0 ? j10 / i18 : j10, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i18);
                jVar.setSubtitle(sb2.toString());
                u5 u5Var2 = jVar.s;
                u1 i19 = u1.i();
                if (i18 <= 0) {
                    j10 = 0;
                }
                u5Var2.l(i19.f(j10, charSequence.toString()), false);
                jVar.setDivider(z14);
                jVar.f.a(z15, false);
                break;
            case 13:
                z zVar = (z) view;
                zVar.setText(aVar.c);
                int i20 = aVar.i;
                f6 f6Var = zVar.r;
                String G = i20 > 0 ? cd.G(i20, "BoostingBoostsCountTitle", Integer.valueOf(i20)) : "";
                f6Var.a();
                f6Var.c(G, true, true);
                break;
            case 14:
                ((og.f) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
                break;
            case 15:
                a0 a0Var = (a0) view;
                CharSequence charSequence2 = aVar.c;
                boolean z16 = aVar.b;
                boolean z17 = aVar.g;
                a0Var.K = aVar.l;
                a0Var.f(charSequence2, z16, z17);
                break;
            case 16:
                m mVar = (m) view;
                mVar.setCount(aVar.i);
                mVar.setAfterTextChangedListener(this.s);
                break;
            case 17:
                y yVar = (y) view;
                TLObject tLObject2 = aVar.m;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = tLObject2 != null ? (TL_stars.TL_starsGiveawayOption) tLObject2 : null;
                int i21 = aVar.i;
                long j11 = aVar.h;
                boolean z18 = aVar.b;
                TextView textView = yVar.f;
                f6 f6Var2 = yVar.d;
                f6 f6Var3 = yVar.e;
                boolean z19 = yVar.r == tL_starsGiveawayOption;
                yVar.a.a(z18, z19);
                yVar.r = tL_starsGiveawayOption;
                if (z19) {
                    f6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    f6Var2.c(yVar.h, false, true);
                    f6Var3.c(yVar.n, z19, true);
                    textView.setText("");
                } else {
                    f6Var2.c(cd.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                    f6Var3.c(cd.H(',', "BoostingStarOptionPerUser", (int) j11), z19, true);
                    textView.setText(u1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i22 = i21 + 1;
                yVar.s = i22;
                if (!z19) {
                    yVar.w.e(true, i22);
                }
                yVar.invalidate();
                break;
        }
    }

    @Override // s4.g0
    public final c1 w(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        p6 p6Var = this.d;
        switch (i10) {
            case 2:
                view = new og.e(context, p6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                int i11 = t6.a7;
                View c7Var = new c7(context, t6.w0(i11, p6Var), 0);
                a7.i(i11, c7Var, p6Var);
                view = c7Var;
                break;
            case 5:
                view = new x(context, p6Var);
                break;
            case 6:
                View p4Var = new p4(context, t6.L6, 21, 15, 3, false, false, this.d);
                a7.i(t6.h5, p4Var, p6Var);
                view = p4Var;
                break;
            case 7:
                view = new f0(context, p6Var);
                break;
            case 8:
                view = new og.b(context, p6Var);
                break;
            case 9:
                view = new og.h(context, p6Var);
                break;
            case 10:
                view = new og.i(context, p6Var);
                break;
            case 11:
                w wVar = new w(context, p6Var);
                wVar.c.setVisibility(8);
                view = wVar;
                break;
            case 12:
                view = new j(context, p6Var);
                break;
            case 13:
                View zVar = new z(context, p6Var);
                a7.i(t6.h5, zVar, p6Var);
                view = zVar;
                break;
            case 14:
                view = new og.f(context, p6Var);
                break;
            case 15:
                a0 a0Var = new a0(context, p6Var);
                a0Var.setHeight(50);
                view = a0Var;
                break;
            case 16:
                view = new m(context, p6Var);
                break;
            case 17:
                view = new y(context, p6Var);
                break;
            case 18:
                r7 r7Var = new r7(context);
                String L0 = cd.L0(2131747852, null);
                boolean z10 = r7Var.c == -1;
                r7Var.c = -1;
                f6 f6Var = r7Var.a;
                f6Var.c(L0, z10, true);
                int i12 = t6.o6;
                t6.v0(i12);
                a7.Z(f6Var, i12, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = r7Var.b;
                a7.t(imageView, i12, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(gr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                r7Var.d = false;
                r7Var.setWillNotDraw(true);
                view = r7Var;
                break;
            default:
                view = new s(context, p6Var);
                break;
        }
        return sc.e.o(view, view, -1, -2);
    }
}
