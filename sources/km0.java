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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class km0 extends la {
    public final vnb d;
    public d79 f;
    public sn0 h;
    public sn0 n;
    public lf5 r;
    public sn0 s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public km0(vnb vnbVar) {
        this.d = vnbVar;
        te2 te2Var = new te2(this, (byte) 5);
        jf7 Y = jf7.Y(yac.t0);
        Y.a.c(new a30(Y, te2Var, (byte) 8));
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 2 || i == 11 || i == 8 || i == 10 || i == 15 || i == 12 || i == 17 || i == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull N0 = uc7.s1(yac.t0).N0(chat.id);
        if (N0 != null && (i = N0.participants_count) > 0) {
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

    @Override // j79
    public final int b() {
        return this.e.size();
    }

    @Override // j79
    public final int d(int i) {
        return ((jm0) this.e.get(i)).a;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        jm0 jm0Var = (jm0) this.e.get(i);
        if (i2 == 0) {
            lf5 lf5Var = (lf5) view;
            this.r = lf5Var;
            lf5Var.setBoostViaGifsText(this.w);
            this.r.setStars(jm0Var.g);
            return;
        }
        if (i2 == 2) {
            pn0 pn0Var = (pn0) view;
            byte b = jm0Var.l;
            int i3 = jm0Var.i;
            TLRPC.User user = (TLRPC.User) jm0Var.f;
            boolean z = jm0Var.b;
            de0 de0Var = pn0Var.c;
            vnb vnbVar = pn0Var.a;
            ff0 ff0Var = pn0Var.d;
            ema emaVar = pn0Var.e;
            rb0 rb0Var = pn0Var.b;
            boolean z2 = pn0Var.s == b;
            pn0Var.s = b;
            if (b == 0) {
                ff0Var.k(ob6.M0(2131753534, null));
                pn0Var.setSubtitle(ob6.M0(2131753160, null));
                yob.W(emaVar, aob.r5, vnbVar);
                rb0Var.f(16);
                rb0Var.h(-15292942, -15630089);
                pn0Var.setDivider(true);
                yob.Z(pn0Var, pn0Var.getContext(), R.drawable.greydivider_bottom, aob.b7);
            } else if (b == 1) {
                ff0Var.k(ob6.M0(2131753586, null));
                if (i3 == 1 && user != null) {
                    pn0Var.setSubtitle(pn0Var.e(c00.f(emaVar, lbc.r(user), false, null, 0)));
                } else if (i3 > 0) {
                    pn0Var.setSubtitle(pn0Var.e(ob6.G(i3, "Recipient", new Object[0])));
                } else {
                    pn0Var.setSubtitle(pn0Var.e(ob6.M0(2131753278, null)));
                }
                yob.W(emaVar, aob.n5, vnbVar);
                rb0Var.f(6);
                rb0Var.h(-3905294, -6923014);
                pn0Var.setDivider(false);
                yob.Z(pn0Var, pn0Var.getContext(), R.drawable.greydivider_top, aob.b7);
            } else if (b == 2) {
                ff0Var.k(ob6.M0(2131753325, null));
                if (i3 == 1 && user != null) {
                    pn0Var.setSubtitle(pn0Var.e(c00.f(emaVar, lbc.r(user), false, null, 0)));
                } else if (i3 > 0) {
                    pn0Var.setSubtitle(pn0Var.e(ob6.G(i3, "Recipient", new Object[0])));
                } else {
                    pn0Var.setSubtitle(pn0Var.e(ob6.M0(2131753160, null)));
                }
                yob.W(emaVar, aob.n5, vnbVar);
                rb0Var.f(25);
                rb0Var.h(-3905294, -6923014);
                pn0Var.setDivider(true);
                yob.Z(pn0Var, pn0Var.getContext(), R.drawable.greydivider_bottom, aob.b7);
            } else if (b == 3) {
                ff0Var.k(skb.b(ob6.M0(2131753250, null)));
                pn0Var.setSubtitle(ob6.M0(2131753160, null));
                yob.W(emaVar, aob.r5, vnbVar);
                rb0Var.f(26);
                rb0Var.h(-146917, -625593);
                pn0Var.setDivider(false);
                yob.Z(pn0Var, pn0Var.getContext(), R.drawable.greydivider_top, aob.b7);
            }
            pn0Var.f.a(z, z2);
            de0Var.setImageDrawable(rb0Var);
            de0Var.setRoundRadius(hl.L(20.0f));
            return;
        }
        if (i2 == 5) {
            dna dnaVar = (dna) view;
            List list = jm0Var.k;
            int i4 = jm0Var.i;
            dnaVar.getClass();
            String[] strArr = new String[list.size()];
            for (int i5 = 0; i5 < list.size(); i5++) {
                strArr[i5] = String.valueOf((Integer) list.get(i5));
            }
            dnaVar.a.b(i4, null, strArr);
            dnaVar.setCallBack(this.h);
            return;
        }
        if (i2 == 6) {
            ((mf5) view).setText(jm0Var.c);
            return;
        }
        if (i2 == 7) {
            hlb hlbVar = (hlb) view;
            hlbVar.setText(jm0Var.c);
            hlbVar.setBackground(jm0Var.g);
            return;
        }
        switch (i2) {
            case 9:
                j82 j82Var = (j82) view;
                TLRPC.InputPeer inputPeer = jm0Var.d;
                if (inputPeer == null) {
                    TLRPC.Chat chat = jm0Var.e;
                    j82Var.f(chat, jm0Var.i, jm0Var.g, F(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(inputPeer.chat_id));
                    j82Var.f(M0, jm0Var.i, jm0Var.g, F(M0));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat M02 = uc7.s1(yac.t0).M0(Long.valueOf(inputPeer.channel_id));
                    j82Var.f(M02, jm0Var.i, jm0Var.g, F(M02));
                }
                j82Var.setChatDeleteListener(this.n);
                break;
            case 10:
                ((e93) view).setDate(jm0Var.h);
                break;
            case 11:
                ky7 ky7Var = (ky7) view;
                byte b2 = jm0Var.l;
                boolean z3 = jm0Var.b;
                boolean z4 = jm0Var.g;
                List list2 = (List) jm0Var.f;
                TLRPC.Chat chat2 = this.w;
                ff0 ff0Var2 = ky7Var.d;
                ky7Var.s = b2;
                boolean V = xc2.V(chat2);
                if (b2 == 0) {
                    ff0Var2.k(ob6.a0(null, null, V ? 2131753591 : 2131753592, new Object[0]));
                } else if (b2 == 1) {
                    ff0Var2.k(ob6.a0(null, null, V ? 2131753329 : 2131753330, new Object[0]));
                }
                ky7Var.f.a(z3, false);
                ky7Var.setDivider(z4);
                yob.W(ky7Var.e, aob.n5, ky7Var.a);
                if (list2.size() == 0) {
                    ky7Var.setSubtitle(ky7Var.e(ob6.M0(2131753515, null)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        ky7Var.setSubtitle(ky7Var.e(ob6.a0("BoostingFromAllCountries1", null, 2131753514, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        ky7Var.setSubtitle(ky7Var.e(ob6.a0("BoostingFromAllCountries2", null, 2131753513, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        ky7Var.setSubtitle(ky7Var.e(ob6.a0("BoostingFromAllCountries3", null, 2131753512, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    ky7Var.setSubtitle(ky7Var.e(ob6.G(list2.size(), "BoostingFromCountriesCount", new Object[0])));
                    break;
                }
            case 12:
                cs3 cs3Var = (cs3) view;
                TLObject tLObject = jm0Var.m;
                int i6 = jm0Var.i;
                int i7 = jm0Var.j;
                long j = jm0Var.h;
                CharSequence charSequence = jm0Var.c;
                boolean z5 = jm0Var.g;
                boolean z6 = jm0Var.b;
                cs3Var.w = tLObject;
                ff0 ff0Var3 = cs3Var.d;
                if (i6 >= 12) {
                    ff0Var3.k(ob6.G(1, "Years", new Object[0]));
                } else {
                    ff0Var3.k(ob6.G(i6, "Months", new Object[0]));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(di0.h().e(i7 > 0 ? j / i7 : j, charSequence.toString()));
                sb.append(" x ");
                sb.append(i7);
                cs3Var.setSubtitle(sb.toString());
                ema emaVar2 = cs3Var.s;
                di0 h = di0.h();
                if (i7 <= 0) {
                    j = 0;
                }
                emaVar2.l(h.e(j, charSequence.toString()), false);
                cs3Var.setDivider(z5);
                cs3Var.f.a(z6, false);
                break;
            case 13:
                teb tebVar = (teb) view;
                tebVar.setText(jm0Var.c);
                int i8 = jm0Var.i;
                in inVar = tebVar.r;
                String G = i8 > 0 ? ob6.G(i8, "BoostingBoostsCountTitle", Integer.valueOf(i8)) : "";
                inVar.a();
                inVar.c(G, true, true);
                break;
            case 14:
                ((qn0) view).setGiveaway((TL_stories.PrepaidGiveaway) jm0Var.f);
                break;
            case 15:
                ogb ogbVar = (ogb) view;
                CharSequence charSequence2 = jm0Var.c;
                boolean z7 = jm0Var.b;
                boolean z8 = jm0Var.g;
                ogbVar.L = jm0Var.l;
                ogbVar.f(charSequence2, z7, z8);
                break;
            case 16:
                y34 y34Var = (y34) view;
                y34Var.setCount(jm0Var.i);
                y34Var.setAfterTextChangedListener(this.s);
                break;
            case 17:
                ava avaVar = (ava) view;
                TLObject tLObject2 = jm0Var.m;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = tLObject2 != null ? (TL_stars.TL_starsGiveawayOption) tLObject2 : null;
                int i9 = jm0Var.i;
                long j2 = jm0Var.h;
                boolean z9 = jm0Var.b;
                TextView textView = avaVar.f;
                in inVar2 = avaVar.e;
                boolean z10 = avaVar.r == tL_starsGiveawayOption;
                avaVar.a.a(z9, z10);
                avaVar.r = tL_starsGiveawayOption;
                if (z10) {
                    inVar2.a();
                }
                in inVar3 = avaVar.d;
                if (tL_starsGiveawayOption == null) {
                    inVar3.c(avaVar.h, false, true);
                    inVar2.c(avaVar.n, z10, true);
                    textView.setText("");
                } else {
                    inVar3.c(ob6.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                    inVar2.c(ob6.H(',', "BoostingStarOptionPerUser", (int) j2), z10, true);
                    textView.setText(di0.h().e(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i10 = i9 + 1;
                avaVar.s = i10;
                if (!z10) {
                    avaVar.w.e(true, i10);
                }
                avaVar.invalidate();
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        vnb vnbVar = this.d;
        switch (i) {
            case 2:
                view = new pn0(context, vnbVar);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                int i2 = aob.a7;
                View rcaVar = new rca(context, aob.v0(i2, vnbVar), 0);
                yob.h(i2, vnbVar, rcaVar);
                view = rcaVar;
                break;
            case 5:
                view = new dna(context, vnbVar);
                break;
            case 6:
                View mf5Var = new mf5(context, aob.L6, 21, 15, 3, false, false, this.d);
                yob.h(aob.h5, vnbVar, mf5Var);
                view = mf5Var;
                break;
            case 7:
                view = new hlb(context, vnbVar);
                break;
            case 8:
                view = new oa(context, vnbVar);
                break;
            case 9:
                view = new j82(context, vnbVar);
                break;
            case 10:
                view = new e93(context, vnbVar);
                break;
            case 11:
                ky7 ky7Var = new ky7(context, vnbVar);
                ky7Var.c.setVisibility(8);
                view = ky7Var;
                break;
            case 12:
                view = new cs3(context, vnbVar);
                break;
            case 13:
                View tebVar = new teb(context, vnbVar);
                yob.h(aob.h5, vnbVar, tebVar);
                view = tebVar;
                break;
            case 14:
                view = new qn0(context, vnbVar);
                break;
            case 15:
                ogb ogbVar = new ogb(context, vnbVar);
                ogbVar.setHeight(50);
                view = ogbVar;
                break;
            case 16:
                view = new y34(context, vnbVar);
                break;
            case 17:
                view = new ava(context, vnbVar);
                break;
            case 18:
                xya xyaVar = new xya(context);
                String M0 = ob6.M0(2131747563, null);
                boolean z = xyaVar.c == -1;
                xyaVar.c = -1;
                in inVar = xyaVar.a;
                inVar.c(M0, z, true);
                int i3 = aob.o6;
                aob.u0(i3);
                yob.U(inVar, i3, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = xyaVar.b;
                yob.s(imageView, i3, null, mode);
                if (z) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(k43.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                xyaVar.d = false;
                xyaVar.setWillNotDraw(true);
                view = xyaVar;
                break;
            default:
                view = new lf5(context, vnbVar);
                break;
        }
        return qu6.h(view, view, -1, -2);
    }
}
