package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import dg.h0;
import f2.m1;
import hg.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jg.a0;
import jg.f0;
import jg.i;
import jg.j;
import jg.m;
import jg.s;
import jg.w;
import jg.x;
import jg.y;
import jg.z;
import mh.q9;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b extends cg.c {
    public final g6 d;
    public tl0 f;
    public r0 h;
    public r0 n;
    public s r;
    public r0 s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap w = new HashMap();

    public b(g6 g6Var) {
        this.d = g6Var;
        h0 h0Var = new h0(this, 10);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new gf.c(8, messagesStorage, h0Var));
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(m1 m1Var) {
        int i10 = m1Var.f;
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

    @Override // f2.p0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((a) this.e.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(m1 m1Var, int i10) {
        int i11 = m1Var.f;
        View view = m1Var.a;
        a aVar = (a) this.e.get(i10);
        if (i11 == 0) {
            s sVar = (s) view;
            this.r = sVar;
            sVar.setBoostViaGifsText(this.v);
            this.r.setStars(aVar.g);
            return;
        }
        if (i11 == 2) {
            jg.e eVar = (jg.e) view;
            int i12 = aVar.l;
            int i13 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z4 = aVar.b;
            p9 p9Var = eVar.c;
            g6 g6Var = eVar.a;
            jg.c cVar = eVar.d;
            l5 l5Var = eVar.e;
            z8 z8Var = eVar.b;
            boolean z10 = eVar.r == i12;
            eVar.r = i12;
            if (i12 == 0) {
                cVar.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                l5Var.setTextColor(k6.v0(k6.r5, g6Var));
                z8Var.g(16);
                z8Var.i(-15292942, -15630089);
                eVar.setDivider(true);
                eVar.setBackground(k6.V0(eVar.getContext(), R.drawable.greydivider_bottom, k6.b7));
            } else if (i12 == 1) {
                cVar.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i13 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                l5Var.setTextColor(k6.v0(k6.n5, g6Var));
                z8Var.g(6);
                z8Var.i(-3905294, -6923014);
                eVar.setDivider(false);
                eVar.setBackground(k6.V0(eVar.getContext(), R.drawable.greydivider_top, k6.b7));
            } else if (i12 == 2) {
                cVar.k(LocaleController.getString(R.string.BoostingPremium));
                if (i13 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                l5Var.setTextColor(k6.v0(k6.n5, g6Var));
                z8Var.g(25);
                z8Var.i(-3905294, -6923014);
                eVar.setDivider(true);
                eVar.setBackground(k6.V0(eVar.getContext(), R.drawable.greydivider_bottom, k6.b7));
            } else if (i12 == 3) {
                cVar.k(o8.a(LocaleController.getString(R.string.BoostingStars)));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                l5Var.setTextColor(k6.v0(k6.r5, g6Var));
                z8Var.g(26);
                z8Var.i(-146917, -625593);
                eVar.setDivider(false);
                eVar.setBackground(k6.V0(eVar.getContext(), R.drawable.greydivider_top, k6.b7));
            }
            eVar.f.a(z4, z10);
            p9Var.setImageDrawable(z8Var);
            p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
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
            ((m4) view).setText(aVar.c);
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
                jg.h hVar = (jg.h) view;
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
                w wVar = (w) view;
                int i16 = aVar.l;
                boolean z11 = aVar.b;
                boolean z12 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat4 = this.v;
                jg.c cVar2 = wVar.d;
                wVar.r = i16;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                if (i16 == 0) {
                    cVar2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
                } else if (i16 == 1) {
                    cVar2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
                }
                wVar.f.a(z11, false);
                wVar.setDivider(z12);
                wVar.e.setTextColor(k6.v0(k6.n5, wVar.a));
                if (list2.size() == 0) {
                    wVar.setSubtitle(wVar.e(LocaleController.getString(R.string.BoostingFromAllCountries)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        wVar.setSubtitle(wVar.e(LocaleController.formatString("BoostingFromAllCountries1", R.string.BoostingFromAllCountries1, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        wVar.setSubtitle(wVar.e(LocaleController.formatString("BoostingFromAllCountries2", R.string.BoostingFromAllCountries2, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        wVar.setSubtitle(wVar.e(LocaleController.formatString("BoostingFromAllCountries3", R.string.BoostingFromAllCountries3, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    wVar.setSubtitle(wVar.e(LocaleController.formatPluralString("BoostingFromCountriesCount", list2.size(), new Object[0])));
                    break;
                }
            case 12:
                j jVar = (j) view;
                TLObject tLObject = aVar.m;
                int i17 = aVar.i;
                int i18 = aVar.j;
                long j10 = aVar.h;
                CharSequence charSequence = aVar.c;
                boolean z13 = aVar.g;
                boolean z14 = aVar.b;
                jg.c cVar3 = jVar.d;
                jVar.s = tLObject;
                if (i17 >= 12) {
                    cVar3.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                } else {
                    cVar3.k(LocaleController.formatPluralString("Months", i17, new Object[0]));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(BillingController.getInstance().formatCurrency(i18 > 0 ? j10 / i18 : j10, charSequence.toString()));
                sb.append(" x ");
                sb.append(i18);
                jVar.setSubtitle(sb.toString());
                l5 l5Var2 = jVar.r;
                BillingController billingController = BillingController.getInstance();
                if (i18 <= 0) {
                    j10 = 0;
                }
                l5Var2.l(billingController.formatCurrency(j10, charSequence.toString()), false);
                jVar.setDivider(z13);
                jVar.f.a(z14, false);
                break;
            case 13:
                z zVar = (z) view;
                zVar.setText(aVar.c);
                int i19 = aVar.i;
                org.telegram.ui.Components.k6 k6Var = zVar.r;
                String formatPluralString = i19 > 0 ? LocaleController.formatPluralString("BoostingBoostsCountTitle", i19, Integer.valueOf(i19)) : "";
                k6Var.a();
                k6Var.c(formatPluralString, true, true);
                break;
            case 14:
                ((jg.f) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
                break;
            case 15:
                a0 a0Var = (a0) view;
                CharSequence charSequence2 = aVar.c;
                boolean z15 = aVar.b;
                boolean z16 = aVar.g;
                a0Var.H = aVar.l;
                a0Var.f(charSequence2, z15, z16);
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
                int i20 = aVar.i;
                long j11 = aVar.h;
                boolean z17 = aVar.b;
                TextView textView = yVar.f;
                org.telegram.ui.Components.k6 k6Var2 = yVar.d;
                org.telegram.ui.Components.k6 k6Var3 = yVar.e;
                boolean z18 = yVar.r == tL_starsGiveawayOption;
                yVar.a.a(z17, z18);
                yVar.r = tL_starsGiveawayOption;
                if (z18) {
                    k6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    k6Var2.c(yVar.h, false, true);
                    k6Var3.c(yVar.n, z18, true);
                    textView.setText("");
                } else {
                    k6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                    k6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z18, true);
                    textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i21 = i20 + 1;
                yVar.s = i21;
                if (!z18) {
                    yVar.v.d(i21, true);
                }
                yVar.invalidate();
                break;
        }
    }

    @Override // f2.p0
    public final m1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        g6 g6Var = this.d;
        switch (i10) {
            case 2:
                view = new jg.e(context, g6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                view = new z6(context, k6.v0(k6.a7, g6Var), 0);
                break;
            case 5:
                view = new x(context, g6Var);
                break;
            case 6:
                View m4Var = new m4(context, k6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(k6.v0(k6.h5, g6Var));
                view = m4Var;
                break;
            case 7:
                view = new f0(context, g6Var);
                break;
            case 8:
                view = new jg.b(context, g6Var);
                break;
            case 9:
                view = new jg.h(context, g6Var);
                break;
            case 10:
                view = new i(context, g6Var);
                break;
            case 11:
                w wVar = new w(context, g6Var);
                wVar.c.setVisibility(8);
                view = wVar;
                break;
            case 12:
                view = new j(context, g6Var);
                break;
            case 13:
                View zVar = new z(context, g6Var);
                zVar.setBackgroundColor(k6.v0(k6.h5, g6Var));
                view = zVar;
                break;
            case 14:
                view = new jg.f(context, g6Var);
                break;
            case 15:
                a0 a0Var = new a0(context, g6Var);
                a0Var.setHeight(50);
                view = a0Var;
                break;
            case 16:
                view = new m(context, g6Var);
                break;
            case 17:
                view = new y(context, g6Var);
                break;
            case 18:
                q9 q9Var = new q9(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                boolean z4 = q9Var.c == -1;
                q9Var.c = -1;
                org.telegram.ui.Components.k6 k6Var = q9Var.a;
                k6Var.c(string, z4, true);
                int w02 = k6.w0(null, k6.o6, false);
                k6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = q9Var.b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z4) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(pr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                q9Var.d = false;
                q9Var.setWillNotDraw(true);
                view = q9Var;
                break;
            default:
                view = new s(context, g6Var);
                break;
        }
        return yh.o(view, view, -1, -2);
    }
}
