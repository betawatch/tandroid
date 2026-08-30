package hg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cg.h0;
import f2.l1;
import gg.r0;
import ig.a0;
import ig.f0;
import ig.i;
import ig.j;
import ig.m;
import ig.s;
import ig.w;
import ig.x;
import ig.y;
import ig.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lh.q9;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b extends bg.c {
    public final f6 d;
    public sl0 f;
    public r0 h;
    public r0 n;
    public s r;
    public r0 s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap w = new HashMap();

    public b(f6 f6Var) {
        this.d = f6Var;
        h0 h0Var = new h0(this, 10);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new gf.c(6, messagesStorage, h0Var));
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(l1 l1Var) {
        int i10 = l1Var.f;
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

    @Override // f2.o0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((a) this.e.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        a aVar = (a) this.e.get(i10);
        if (i11 == 0) {
            s sVar = (s) view;
            this.r = sVar;
            sVar.setBoostViaGifsText(this.v);
            this.r.setStars(aVar.g);
            return;
        }
        if (i11 == 2) {
            ig.e eVar = (ig.e) view;
            int i12 = aVar.l;
            int i13 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z4 = aVar.b;
            p9 p9Var = eVar.c;
            f6 f6Var = eVar.a;
            ig.c cVar = eVar.d;
            k5 k5Var = eVar.e;
            z8 z8Var = eVar.b;
            boolean z10 = eVar.r == i12;
            eVar.r = i12;
            if (i12 == 0) {
                cVar.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                k5Var.setTextColor(j6.v0(j6.r5, f6Var));
                z8Var.g(16);
                z8Var.i(-15292942, -15630089);
                eVar.setDivider(true);
                eVar.setBackground(j6.V0(eVar.getContext(), R.drawable.greydivider_bottom, j6.b7));
            } else if (i12 == 1) {
                cVar.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i13 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), k5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                k5Var.setTextColor(j6.v0(j6.n5, f6Var));
                z8Var.g(6);
                z8Var.i(-3905294, -6923014);
                eVar.setDivider(false);
                eVar.setBackground(j6.V0(eVar.getContext(), R.drawable.greydivider_top, j6.b7));
            } else if (i12 == 2) {
                cVar.k(LocaleController.getString(R.string.BoostingPremium));
                if (i13 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), k5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i13 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i13, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                k5Var.setTextColor(j6.v0(j6.n5, f6Var));
                z8Var.g(25);
                z8Var.i(-3905294, -6923014);
                eVar.setDivider(true);
                eVar.setBackground(j6.V0(eVar.getContext(), R.drawable.greydivider_bottom, j6.b7));
            } else if (i12 == 3) {
                cVar.k(o8.a(LocaleController.getString(R.string.BoostingStars)));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                k5Var.setTextColor(j6.v0(j6.r5, f6Var));
                z8Var.g(26);
                z8Var.i(-146917, -625593);
                eVar.setDivider(false);
                eVar.setBackground(j6.V0(eVar.getContext(), R.drawable.greydivider_top, j6.b7));
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
                ig.h hVar = (ig.h) view;
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
                ig.c cVar2 = wVar.d;
                wVar.r = i16;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                if (i16 == 0) {
                    cVar2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
                } else if (i16 == 1) {
                    cVar2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
                }
                wVar.f.a(z11, false);
                wVar.setDivider(z12);
                wVar.e.setTextColor(j6.v0(j6.n5, wVar.a));
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
                ig.c cVar3 = jVar.d;
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
                k5 k5Var2 = jVar.r;
                BillingController billingController = BillingController.getInstance();
                if (i18 <= 0) {
                    j10 = 0;
                }
                k5Var2.l(billingController.formatCurrency(j10, charSequence.toString()), false);
                jVar.setDivider(z13);
                jVar.f.a(z14, false);
                break;
            case 13:
                z zVar = (z) view;
                zVar.setText(aVar.c);
                int i19 = aVar.i;
                k6 k6Var = zVar.r;
                String formatPluralString = i19 > 0 ? LocaleController.formatPluralString("BoostingBoostsCountTitle", i19, Integer.valueOf(i19)) : "";
                k6Var.a();
                k6Var.c(formatPluralString, true, true);
                break;
            case 14:
                ((ig.f) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
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
                k6 k6Var2 = yVar.d;
                k6 k6Var3 = yVar.e;
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

    @Override // f2.o0
    public final l1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        f6 f6Var = this.d;
        switch (i10) {
            case 2:
                view = new ig.e(context, f6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                view = new z6(context, j6.v0(j6.a7, f6Var), 0);
                break;
            case 5:
                view = new x(context, f6Var);
                break;
            case 6:
                View m4Var = new m4(context, j6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(j6.v0(j6.h5, f6Var));
                view = m4Var;
                break;
            case 7:
                view = new f0(context, f6Var);
                break;
            case 8:
                view = new ig.b(context, f6Var);
                break;
            case 9:
                view = new ig.h(context, f6Var);
                break;
            case 10:
                view = new i(context, f6Var);
                break;
            case 11:
                w wVar = new w(context, f6Var);
                wVar.c.setVisibility(8);
                view = wVar;
                break;
            case 12:
                view = new j(context, f6Var);
                break;
            case 13:
                View zVar = new z(context, f6Var);
                zVar.setBackgroundColor(j6.v0(j6.h5, f6Var));
                view = zVar;
                break;
            case 14:
                view = new ig.f(context, f6Var);
                break;
            case 15:
                a0 a0Var = new a0(context, f6Var);
                a0Var.setHeight(50);
                view = a0Var;
                break;
            case 16:
                view = new m(context, f6Var);
                break;
            case 17:
                view = new y(context, f6Var);
                break;
            case 18:
                q9 q9Var = new q9(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                boolean z4 = q9Var.c == -1;
                q9Var.c = -1;
                k6 k6Var = q9Var.a;
                k6Var.c(string, z4, true);
                int w02 = j6.w0(null, j6.o6, false);
                k6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = q9Var.b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z4) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(nr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                q9Var.d = false;
                q9Var.setWillNotDraw(true);
                view = q9Var;
                break;
            default:
                view = new s(context, f6Var);
                break;
        }
        return yh.o(view, view, -1, -2);
    }
}
