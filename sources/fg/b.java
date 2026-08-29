package fg;

import ag.i0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import eg.s0;
import f2.n1;
import gg.a0;
import gg.f0;
import gg.i;
import gg.j;
import gg.m;
import gg.s;
import gg.w;
import gg.x;
import gg.y;
import gg.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jh.p9;
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
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b extends zf.b {
    public final c6 d;
    public jl0 f;
    public s0 h;
    public s0 n;
    public s r;
    public s0 s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap w = new HashMap();

    public b(c6 c6Var) {
        this.d = c6Var;
        i0 i0Var = new i0(this, 10);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new ef.c(6, messagesStorage, i0Var));
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f;
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
    public final void v(n1 n1Var, int i10) {
        int i11 = n1Var.f;
        View view = n1Var.a;
        a aVar = (a) this.e.get(i10);
        if (i11 == 0) {
            s sVar = (s) view;
            this.r = sVar;
            sVar.setBoostViaGifsText(this.v);
            this.r.setStars(aVar.g);
            return;
        }
        if (i11 == 2) {
            gg.e eVar = (gg.e) view;
            int i12 = aVar.l;
            int i13 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z10 = aVar.b;
            t9 t9Var = eVar.c;
            c6 c6Var = eVar.a;
            gg.c cVar = eVar.d;
            h5 h5Var = eVar.e;
            e9 e9Var = eVar.b;
            boolean z11 = eVar.r == i12;
            eVar.r = i12;
            if (i12 == 0) {
                cVar.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var.setTextColor(g6.v0(g6.r5, c6Var));
                e9Var.g(16);
                e9Var.i(-15292942, -15630089);
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
                e9Var.g(6);
                e9Var.i(-3905294, -6923014);
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
                e9Var.g(25);
                e9Var.i(-3905294, -6923014);
                eVar.setDivider(true);
                eVar.setBackground(g6.V0(eVar.getContext(), R.drawable.greydivider_bottom, g6.b7));
            } else if (i12 == 3) {
                cVar.k(m8.a(LocaleController.getString(R.string.BoostingStars)));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var.setTextColor(g6.v0(g6.r5, c6Var));
                e9Var.g(26);
                e9Var.i(-146917, -625593);
                eVar.setDivider(false);
                eVar.setBackground(g6.V0(eVar.getContext(), R.drawable.greydivider_top, g6.b7));
            }
            eVar.f.a(z10, z11);
            t9Var.setImageDrawable(e9Var);
            t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
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
            ((k4) view).setText(aVar.c);
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
                gg.h hVar = (gg.h) view;
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
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat4 = this.v;
                gg.c cVar2 = wVar.d;
                wVar.r = i16;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                if (i16 == 0) {
                    cVar2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
                } else if (i16 == 1) {
                    cVar2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
                }
                wVar.f.a(z12, false);
                wVar.setDivider(z13);
                wVar.e.setTextColor(g6.v0(g6.n5, wVar.a));
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
                boolean z14 = aVar.g;
                boolean z15 = aVar.b;
                gg.c cVar3 = jVar.d;
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
                z zVar = (z) view;
                zVar.setText(aVar.c);
                int i19 = aVar.i;
                o6 o6Var = zVar.r;
                String formatPluralString = i19 > 0 ? LocaleController.formatPluralString("BoostingBoostsCountTitle", i19, Integer.valueOf(i19)) : "";
                o6Var.a();
                o6Var.c(formatPluralString, true, true);
                break;
            case 14:
                ((gg.f) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
                break;
            case 15:
                a0 a0Var = (a0) view;
                CharSequence charSequence2 = aVar.c;
                boolean z16 = aVar.b;
                boolean z17 = aVar.g;
                a0Var.G = aVar.l;
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
                int i20 = aVar.i;
                long j11 = aVar.h;
                boolean z18 = aVar.b;
                TextView textView = yVar.f;
                o6 o6Var2 = yVar.d;
                o6 o6Var3 = yVar.e;
                boolean z19 = yVar.r == tL_starsGiveawayOption;
                yVar.a.a(z18, z19);
                yVar.r = tL_starsGiveawayOption;
                if (z19) {
                    o6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    o6Var2.c(yVar.h, false, true);
                    o6Var3.c(yVar.n, z19, true);
                    textView.setText("");
                } else {
                    o6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                    o6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z19, true);
                    textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i21 = i20 + 1;
                yVar.s = i21;
                if (!z19) {
                    yVar.v.d(i21, true);
                }
                yVar.invalidate();
                break;
        }
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        c6 c6Var = this.d;
        switch (i10) {
            case 2:
                view = new gg.e(context, c6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                view = new x6(context, g6.v0(g6.a7, c6Var), 0);
                break;
            case 5:
                view = new x(context, c6Var);
                break;
            case 6:
                View k4Var = new k4(context, g6.L6, 21, 15, 3, false, false, this.d);
                k4Var.setBackgroundColor(g6.v0(g6.h5, c6Var));
                view = k4Var;
                break;
            case 7:
                view = new f0(context, c6Var);
                break;
            case 8:
                view = new gg.b(context, c6Var);
                break;
            case 9:
                view = new gg.h(context, c6Var);
                break;
            case 10:
                view = new i(context, c6Var);
                break;
            case 11:
                w wVar = new w(context, c6Var);
                wVar.c.setVisibility(8);
                view = wVar;
                break;
            case 12:
                view = new j(context, c6Var);
                break;
            case 13:
                View zVar = new z(context, c6Var);
                zVar.setBackgroundColor(g6.v0(g6.h5, c6Var));
                view = zVar;
                break;
            case 14:
                view = new gg.f(context, c6Var);
                break;
            case 15:
                a0 a0Var = new a0(context, c6Var);
                a0Var.setHeight(50);
                view = a0Var;
                break;
            case 16:
                view = new m(context, c6Var);
                break;
            case 17:
                view = new y(context, c6Var);
                break;
            case 18:
                p9 p9Var = new p9(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                boolean z10 = p9Var.c == -1;
                p9Var.c = -1;
                o6 o6Var = p9Var.a;
                o6Var.c(string, z10, true);
                int w02 = g6.w0(null, g6.o6, false);
                o6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = p9Var.b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(jr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                p9Var.d = false;
                p9Var.setWillNotDraw(true);
                view = p9Var;
                break;
            default:
                view = new s(context, c6Var);
                break;
        }
        return th.m(view, view, -1, -2);
    }
}
