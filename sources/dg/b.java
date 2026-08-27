package dg;

import ag.n0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cg.s0;
import eg.a0;
import eg.b0;
import eg.g0;
import eg.i;
import eg.j;
import eg.m;
import eg.t;
import eg.x;
import eg.y;
import eg.z;
import f2.o1;
import hh.t9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.w6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b extends xf.b {
    public final c6 d;
    public zk0 f;
    public s0 h;
    public s0 n;
    public t r;
    public s0 s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap w = new HashMap();

    public b(c6 c6Var) {
        this.d = c6Var;
        n0 n0Var = new n0(this, 5);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new a1.e(23, messagesStorage, n0Var));
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 2 || i10 == 11 || i10 == 8 || i10 == 10 || i10 == 15 || i10 == 12 || i10 == 17 || i10 == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.w;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            if (((a) this.e.get(i10)).a == 7) {
                m(i10);
            }
        }
    }

    @Override // f2.q0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((a) this.e.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(o1 o1Var, int i10) {
        int i11 = o1Var.f;
        View view = o1Var.a;
        a aVar = (a) this.e.get(i10);
        if (i11 == 0) {
            t tVar = (t) view;
            this.r = tVar;
            tVar.setBoostViaGifsText(this.v);
            this.r.setStars(aVar.g);
            return;
        }
        if (i11 == 2) {
            eg.e eVar = (eg.e) view;
            int i12 = aVar.l;
            int i13 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z10 = aVar.b;
            n9 n9Var = eVar.c;
            c6 c6Var = eVar.a;
            eg.c cVar = eVar.d;
            h5 h5Var = eVar.e;
            y8 y8Var = eVar.b;
            boolean z11 = eVar.r == i12;
            eVar.r = i12;
            if (i12 == 0) {
                cVar.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var.setTextColor(g6.v0(g6.r5, c6Var));
                y8Var.g(16);
                y8Var.i(-15292942, -15630089);
                eVar.setDivider(true);
                eVar.setBackground(g6.V0(eVar.getContext(), R.drawable.greydivider_bottom, g6.b7));
            } else if (i12 == 1) {
                cVar.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i13 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                h5Var.setTextColor(g6.v0(g6.n5, c6Var));
                y8Var.g(6);
                y8Var.i(-3905294, -6923014);
                eVar.setDivider(false);
                eVar.setBackground(g6.V0(eVar.getContext(), R.drawable.greydivider_top, g6.b7));
            } else if (i12 == 2) {
                cVar.k(LocaleController.getString(R.string.BoostingPremium));
                if (i13 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                h5Var.setTextColor(g6.v0(g6.n5, c6Var));
                y8Var.g(25);
                y8Var.i(-3905294, -6923014);
                eVar.setDivider(true);
                eVar.setBackground(g6.V0(eVar.getContext(), R.drawable.greydivider_bottom, g6.b7));
            } else if (i12 == 3) {
                cVar.k(l8.a(LocaleController.getString(R.string.BoostingStars)));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var.setTextColor(g6.v0(g6.r5, c6Var));
                y8Var.g(26);
                y8Var.i(-146917, -625593);
                eVar.setDivider(false);
                eVar.setBackground(g6.V0(eVar.getContext(), R.drawable.greydivider_top, g6.b7));
            }
            eVar.f.a(z10, z11);
            n9Var.setImageDrawable(y8Var);
            n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        if (i11 == 5) {
            y yVar = (y) view;
            List list = aVar.k;
            int i14 = aVar.i;
            yVar.getClass();
            String[] strArr = new String[list.size()];
            for (int i15 = 0; i15 < list.size(); i15++) {
                strArr[i15] = String.valueOf((Integer) list.get(i15));
            }
            yVar.a.b(i14, null, strArr);
            yVar.setCallBack(this.h);
            return;
        }
        if (i11 == 6) {
            ((j4) view).setText(aVar.c);
            return;
        }
        if (i11 == 7) {
            g0 g0Var = (g0) view;
            g0Var.setText(aVar.c);
            g0Var.setBackground(aVar.g);
            return;
        }
        switch (i11) {
            case 9:
                eg.h hVar = (eg.h) view;
                TLRPC.InputPeer inputPeer = aVar.d;
                if (inputPeer == null) {
                    TLRPC.Chat chat = aVar.e;
                    hVar.f(chat, aVar.i, aVar.g, F(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                    hVar.f(chat2, aVar.i, aVar.g, F(chat2));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                    hVar.f(chat3, aVar.i, aVar.g, F(chat3));
                }
                hVar.setChatDeleteListener(this.n);
                break;
            case 10:
                ((i) view).setDate(aVar.h);
                break;
            case 11:
                x xVar = (x) view;
                int i16 = aVar.l;
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat4 = this.v;
                eg.c cVar2 = xVar.d;
                xVar.r = i16;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                if (i16 == 0) {
                    cVar2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
                } else if (i16 == 1) {
                    cVar2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
                }
                xVar.f.a(z12, false);
                xVar.setDivider(z13);
                xVar.e.setTextColor(g6.v0(g6.n5, xVar.a));
                if (list2.size() == 0) {
                    xVar.setSubtitle(xVar.e(LocaleController.getString(R.string.BoostingFromAllCountries)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        xVar.setSubtitle(xVar.e(LocaleController.formatString("BoostingFromAllCountries1", R.string.BoostingFromAllCountries1, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        xVar.setSubtitle(xVar.e(LocaleController.formatString("BoostingFromAllCountries2", R.string.BoostingFromAllCountries2, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        xVar.setSubtitle(xVar.e(LocaleController.formatString("BoostingFromAllCountries3", R.string.BoostingFromAllCountries3, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    xVar.setSubtitle(xVar.e(LocaleController.formatPluralString("BoostingFromCountriesCount", list2.size(), new Object[0])));
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
                eg.c cVar3 = jVar.d;
                jVar.s = tLObject;
                if (i17 >= 12) {
                    cVar3.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                } else {
                    cVar3.k(LocaleController.formatPluralString("Months", i17, new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(BillingController.getInstance().formatCurrency(i18 > 0 ? j10 / i18 : j10, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i18);
                jVar.setSubtitle(sb2.toString());
                h5 h5Var2 = jVar.r;
                BillingController billingController = BillingController.getInstance();
                if (i18 <= 0) {
                    j10 = 0;
                }
                h5Var2.l(billingController.formatCurrency(j10, charSequence.toString()), false);
                jVar.setDivider(z14);
                jVar.f.a(z15, false);
                break;
            case 13:
                a0 a0Var = (a0) view;
                a0Var.setText(aVar.c);
                int i19 = aVar.i;
                j6 j6Var = a0Var.r;
                String formatPluralString = i19 > 0 ? LocaleController.formatPluralString("BoostingBoostsCountTitle", i19, Integer.valueOf(i19)) : "";
                j6Var.a();
                j6Var.c(formatPluralString, true, true);
                break;
            case 14:
                ((eg.f) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
                break;
            case 15:
                b0 b0Var = (b0) view;
                CharSequence charSequence2 = aVar.c;
                boolean z16 = aVar.b;
                boolean z17 = aVar.g;
                b0Var.G = aVar.l;
                b0Var.f(charSequence2, z16, z17);
                break;
            case 16:
                m mVar = (m) view;
                mVar.setCount(aVar.i);
                mVar.setAfterTextChangedListener(this.s);
                break;
            case 17:
                z zVar = (z) view;
                TLObject tLObject2 = aVar.m;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = tLObject2 != null ? (TL_stars.TL_starsGiveawayOption) tLObject2 : null;
                int i20 = aVar.i;
                long j11 = aVar.h;
                boolean z18 = aVar.b;
                TextView textView = zVar.f;
                j6 j6Var2 = zVar.d;
                j6 j6Var3 = zVar.e;
                boolean z19 = zVar.r == tL_starsGiveawayOption;
                zVar.a.a(z18, z19);
                zVar.r = tL_starsGiveawayOption;
                if (z19) {
                    j6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    j6Var2.c(zVar.h, false, true);
                    j6Var3.c(zVar.n, z19, true);
                    textView.setText("");
                } else {
                    j6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                    j6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z19, true);
                    textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i21 = i20 + 1;
                zVar.s = i21;
                if (!z19) {
                    zVar.v.d(i21, true);
                }
                zVar.invalidate();
                break;
        }
    }

    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        c6 c6Var = this.d;
        switch (i10) {
            case 2:
                view = new eg.e(context, c6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                view = new w6(context, g6.v0(g6.a7, c6Var), 0);
                break;
            case 5:
                view = new y(context, c6Var);
                break;
            case 6:
                View j4Var = new j4(context, g6.L6, 21, 15, 3, false, false, this.d);
                j4Var.setBackgroundColor(g6.v0(g6.h5, c6Var));
                view = j4Var;
                break;
            case 7:
                view = new g0(context, c6Var);
                break;
            case 8:
                view = new eg.b(context, c6Var);
                break;
            case 9:
                view = new eg.h(context, c6Var);
                break;
            case 10:
                view = new i(context, c6Var);
                break;
            case 11:
                x xVar = new x(context, c6Var);
                xVar.c.setVisibility(8);
                view = xVar;
                break;
            case 12:
                view = new j(context, c6Var);
                break;
            case 13:
                View a0Var = new a0(context, c6Var);
                a0Var.setBackgroundColor(g6.v0(g6.h5, c6Var));
                view = a0Var;
                break;
            case 14:
                view = new eg.f(context, c6Var);
                break;
            case 15:
                b0 b0Var = new b0(context, c6Var);
                b0Var.setHeight(50);
                view = b0Var;
                break;
            case 16:
                view = new m(context, c6Var);
                break;
            case 17:
                view = new z(context, c6Var);
                break;
            case 18:
                t9 t9Var = new t9(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                boolean z10 = t9Var.c == -1;
                t9Var.c = -1;
                j6 j6Var = t9Var.a;
                j6Var.c(string, z10, true);
                int w02 = g6.w0(null, g6.o6, false);
                j6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = t9Var.b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(er.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                t9Var.d = false;
                t9Var.setWillNotDraw(true);
                view = t9Var;
                break;
            default:
                view = new t(context, c6Var);
                break;
        }
        return pa.l(view, view, -1, -2);
    }
}
