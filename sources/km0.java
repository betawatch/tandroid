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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class km0 extends ka {
    public final wjb d;
    public o39 f;
    public sn0 h;
    public sn0 n;
    public kd5 r;
    public sn0 s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public km0(wjb wjbVar) {
        this.d = wjbVar;
        be2 be2Var = new be2(this, (byte) 5);
        ad7 Y = ad7.Y(y6c.t0);
        Y.a.c(new z20(Y, be2Var, (byte) 11));
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 2 || i == 11 || i == 8 || i == 10 || i == 15 || i == 12 || i == 17 || i == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull L0 = na7.q1(y6c.t0).L0(chat.id);
        if (L0 != null && (i = L0.participants_count) > 0) {
            return i;
        }
        HashMap hashMap = this.x;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        for (int i = 0; i < this.e.size(); i++) {
            if (((jm0) this.e.get(i)).a == 7) {
                g(i);
            }
        }
    }

    @Override // w39
    public final int b() {
        return this.e.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((jm0) this.e.get(i)).a;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        jm0 jm0Var = (jm0) this.e.get(i);
        if (i2 == 0) {
            kd5 kd5Var = (kd5) view;
            this.r = kd5Var;
            kd5Var.setBoostViaGifsText(this.w);
            this.r.setStars(jm0Var.g);
            return;
        }
        if (i2 == 2) {
            pn0 pn0Var = (pn0) view;
            byte b = jm0Var.l;
            int i3 = jm0Var.i;
            TLRPC.User user = (TLRPC.User) jm0Var.f;
            boolean z = jm0Var.b;
            be0 be0Var = pn0Var.c;
            wjb wjbVar = pn0Var.a;
            df0 df0Var = pn0Var.d;
            jia jiaVar = pn0Var.e;
            pb0 pb0Var = pn0Var.b;
            boolean z2 = pn0Var.s == b;
            pn0Var.s = b;
            if (b == 0) {
                df0Var.k(k96.M0(2131753538, null));
                pn0Var.setSubtitle(k96.M0(2131753164, null));
                zkb.W(jiaVar, bkb.q5, wjbVar);
                pb0Var.f(16);
                pb0Var.h(-15292942, -15630089);
                pn0Var.setDivider(true);
                zkb.Z(pn0Var, pn0Var.getContext(), R.drawable.greydivider_bottom, bkb.a7);
            } else if (b == 1) {
                df0Var.k(k96.M0(2131753590, null));
                if (i3 == 1 && user != null) {
                    pn0Var.setSubtitle(pn0Var.e(b00.e(jiaVar, l7c.r(user), false, null, 0)));
                } else if (i3 > 0) {
                    pn0Var.setSubtitle(pn0Var.e(k96.G(i3, "Recipient", new Object[0])));
                } else {
                    pn0Var.setSubtitle(pn0Var.e(k96.M0(2131753282, null)));
                }
                zkb.W(jiaVar, bkb.m5, wjbVar);
                pb0Var.f(6);
                pb0Var.h(-3905294, -6923014);
                pn0Var.setDivider(false);
                zkb.Z(pn0Var, pn0Var.getContext(), R.drawable.greydivider_top, bkb.a7);
            } else if (b == 2) {
                df0Var.k(k96.M0(2131753329, null));
                if (i3 == 1 && user != null) {
                    pn0Var.setSubtitle(pn0Var.e(b00.e(jiaVar, l7c.r(user), false, null, 0)));
                } else if (i3 > 0) {
                    pn0Var.setSubtitle(pn0Var.e(k96.G(i3, "Recipient", new Object[0])));
                } else {
                    pn0Var.setSubtitle(pn0Var.e(k96.M0(2131753164, null)));
                }
                zkb.W(jiaVar, bkb.m5, wjbVar);
                pb0Var.f(25);
                pb0Var.h(-3905294, -6923014);
                pn0Var.setDivider(true);
                zkb.Z(pn0Var, pn0Var.getContext(), R.drawable.greydivider_bottom, bkb.a7);
            } else if (b == 3) {
                df0Var.k(wgb.b(k96.M0(2131753254, null)));
                pn0Var.setSubtitle(k96.M0(2131753164, null));
                zkb.W(jiaVar, bkb.q5, wjbVar);
                pb0Var.f(26);
                pb0Var.h(-146917, -625593);
                pn0Var.setDivider(false);
                zkb.Z(pn0Var, pn0Var.getContext(), R.drawable.greydivider_top, bkb.a7);
            }
            pn0Var.f.a(z, z2);
            be0Var.setImageDrawable(pb0Var);
            be0Var.setRoundRadius(gl.L(20.0f));
            return;
        }
        if (i2 == 5) {
            kja kjaVar = (kja) view;
            List list = jm0Var.k;
            int i4 = jm0Var.i;
            kjaVar.getClass();
            String[] strArr = new String[list.size()];
            for (int i5 = 0; i5 < list.size(); i5++) {
                strArr[i5] = String.valueOf((Integer) list.get(i5));
            }
            kjaVar.a.b(i4, null, strArr);
            kjaVar.setCallBack(this.h);
            return;
        }
        if (i2 == 6) {
            ((ld5) view).setText(jm0Var.c);
            return;
        }
        if (i2 == 7) {
            lhb lhbVar = (lhb) view;
            lhbVar.setText(jm0Var.c);
            lhbVar.setBackground(jm0Var.g);
            return;
        }
        switch (i2) {
            case 9:
                s72 s72Var = (s72) view;
                TLRPC.InputPeer inputPeer = jm0Var.d;
                if (inputPeer == null) {
                    TLRPC.Chat chat = jm0Var.e;
                    s72Var.f(chat, jm0Var.i, jm0Var.g, F(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(inputPeer.chat_id));
                    s72Var.f(K0, jm0Var.i, jm0Var.g, F(K0));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat K02 = na7.q1(y6c.t0).K0(Long.valueOf(inputPeer.channel_id));
                    s72Var.f(K02, jm0Var.i, jm0Var.g, F(K02));
                }
                s72Var.setChatDeleteListener(this.n);
                break;
            case 10:
                ((l83) view).setDate(jm0Var.h);
                break;
            case 11:
                dv7 dv7Var = (dv7) view;
                byte b2 = jm0Var.l;
                boolean z3 = jm0Var.b;
                boolean z4 = jm0Var.g;
                List list2 = (List) jm0Var.f;
                TLRPC.Chat chat2 = this.w;
                df0 df0Var2 = dv7Var.d;
                dv7Var.s = b2;
                boolean V = hc2.V(chat2);
                if (b2 == 0) {
                    df0Var2.k(k96.a0(null, null, V ? 2131753595 : 2131753596, new Object[0]));
                } else if (b2 == 1) {
                    df0Var2.k(k96.a0(null, null, V ? 2131753333 : 2131753334, new Object[0]));
                }
                dv7Var.f.a(z3, false);
                dv7Var.setDivider(z4);
                zkb.W(dv7Var.e, bkb.m5, dv7Var.a);
                if (list2.size() == 0) {
                    dv7Var.setSubtitle(dv7Var.e(k96.M0(2131753519, null)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        dv7Var.setSubtitle(dv7Var.e(k96.a0("BoostingFromAllCountries1", null, 2131753518, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        dv7Var.setSubtitle(dv7Var.e(k96.a0("BoostingFromAllCountries2", null, 2131753517, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        dv7Var.setSubtitle(dv7Var.e(k96.a0("BoostingFromAllCountries3", null, 2131753516, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    dv7Var.setSubtitle(dv7Var.e(k96.G(list2.size(), "BoostingFromCountriesCount", new Object[0])));
                    break;
                }
            case 12:
                kr3 kr3Var = (kr3) view;
                TLObject tLObject = jm0Var.m;
                int i6 = jm0Var.i;
                int i7 = jm0Var.j;
                long j = jm0Var.h;
                CharSequence charSequence = jm0Var.c;
                boolean z5 = jm0Var.g;
                boolean z6 = jm0Var.b;
                kr3Var.w = tLObject;
                df0 df0Var3 = kr3Var.d;
                if (i6 >= 12) {
                    df0Var3.k(k96.G(1, "Years", new Object[0]));
                } else {
                    df0Var3.k(k96.G(i6, "Months", new Object[0]));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(ci0.h().e(i7 > 0 ? j / i7 : j, charSequence.toString()));
                sb.append(" x ");
                sb.append(i7);
                kr3Var.setSubtitle(sb.toString());
                jia jiaVar2 = kr3Var.s;
                ci0 h = ci0.h();
                if (i7 <= 0) {
                    j = 0;
                }
                jiaVar2.l(h.e(j, charSequence.toString()), false);
                kr3Var.setDivider(z5);
                kr3Var.f.a(z6, false);
                break;
            case 13:
                wab wabVar = (wab) view;
                wabVar.setText(jm0Var.c);
                int i8 = jm0Var.i;
                hn hnVar = wabVar.r;
                String G = i8 > 0 ? k96.G(i8, "BoostingBoostsCountTitle", Integer.valueOf(i8)) : "";
                hnVar.a();
                hnVar.c(G, true, true);
                break;
            case 14:
                ((qn0) view).setGiveaway((TL_stories.PrepaidGiveaway) jm0Var.f);
                break;
            case 15:
                scb scbVar = (scb) view;
                CharSequence charSequence2 = jm0Var.c;
                boolean z7 = jm0Var.b;
                boolean z8 = jm0Var.g;
                scbVar.L = jm0Var.l;
                scbVar.f(charSequence2, z7, z8);
                break;
            case 16:
                c34 c34Var = (c34) view;
                c34Var.setCount(jm0Var.i);
                c34Var.setAfterTextChangedListener(this.s);
                break;
            case 17:
                zqa zqaVar = (zqa) view;
                TLObject tLObject2 = jm0Var.m;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = tLObject2 != null ? (TL_stars.TL_starsGiveawayOption) tLObject2 : null;
                int i9 = jm0Var.i;
                long j2 = jm0Var.h;
                boolean z9 = jm0Var.b;
                TextView textView = zqaVar.f;
                hn hnVar2 = zqaVar.e;
                boolean z10 = zqaVar.r == tL_starsGiveawayOption;
                zqaVar.a.a(z9, z10);
                zqaVar.r = tL_starsGiveawayOption;
                if (z10) {
                    hnVar2.a();
                }
                hn hnVar3 = zqaVar.d;
                if (tL_starsGiveawayOption == null) {
                    hnVar3.c(zqaVar.h, false, true);
                    hnVar2.c(zqaVar.n, z10, true);
                    textView.setText("");
                } else {
                    hnVar3.c(k96.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                    hnVar2.c(k96.H(',', "BoostingStarOptionPerUser", (int) j2), z10, true);
                    textView.setText(ci0.h().e(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i10 = i9 + 1;
                zqaVar.s = i10;
                if (!z10) {
                    zqaVar.w.e(true, i10);
                }
                zqaVar.invalidate();
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        wjb wjbVar = this.d;
        switch (i) {
            case 2:
                view = new pn0(context, wjbVar);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                int i2 = bkb.Z6;
                View b9aVar = new b9a(context, bkb.v0(i2, wjbVar), 0);
                zkb.h(i2, wjbVar, b9aVar);
                view = b9aVar;
                break;
            case 5:
                view = new kja(context, wjbVar);
                break;
            case 6:
                View ld5Var = new ld5(context, bkb.K6, 21, 15, 3, false, false, this.d);
                zkb.h(bkb.g5, wjbVar, ld5Var);
                view = ld5Var;
                break;
            case 7:
                view = new lhb(context, wjbVar);
                break;
            case 8:
                view = new na(context, wjbVar);
                break;
            case 9:
                view = new s72(context, wjbVar);
                break;
            case 10:
                view = new l83(context, wjbVar);
                break;
            case 11:
                dv7 dv7Var = new dv7(context, wjbVar);
                dv7Var.c.setVisibility(8);
                view = dv7Var;
                break;
            case 12:
                view = new kr3(context, wjbVar);
                break;
            case 13:
                View wabVar = new wab(context, wjbVar);
                zkb.h(bkb.g5, wjbVar, wabVar);
                view = wabVar;
                break;
            case 14:
                view = new qn0(context, wjbVar);
                break;
            case 15:
                scb scbVar = new scb(context, wjbVar);
                scbVar.setHeight(50);
                view = scbVar;
                break;
            case 16:
                view = new c34(context, wjbVar);
                break;
            case 17:
                view = new zqa(context, wjbVar);
                break;
            case 18:
                tua tuaVar = new tua(context);
                String M0 = k96.M0(2131747643, null);
                boolean z = tuaVar.c == -1;
                tuaVar.c = -1;
                hn hnVar = tuaVar.a;
                hnVar.c(M0, z, true);
                int i3 = bkb.n6;
                bkb.u0(i3);
                zkb.U(hnVar, i3, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = tuaVar.b;
                zkb.s(imageView, i3, null, mode);
                if (z) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(s33.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                tuaVar.d = false;
                tuaVar.setWillNotDraw(true);
                view = tuaVar;
                break;
            default:
                view = new kd5(context, wjbVar);
                break;
        }
        return ls6.h(view, view, -1, -2);
    }
}
