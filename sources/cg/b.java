package cg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bg.i;
import bg.w0;
import dg.a0;
import dg.b0;
import dg.c0;
import dg.h0;
import dg.j;
import dg.m;
import dg.u;
import dg.y;
import dg.z;
import f2.q1;
import gh.u9;
import j3.r0;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends wf.b {
    public final b6 d;
    public wk0 f;
    public w0 h;
    public w0 n;
    public u r;
    public w0 s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap w = new HashMap();

    public b(b6 b6Var) {
        this.d = b6Var;
        i iVar = new i(this, 3);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new a1.e(13, messagesStorage, iVar));
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 2 || i9 == 11 || i9 == 8 || i9 == 10 || i9 == 15 || i9 == 12 || i9 == 17 || i9 == 18;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i9;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        if (chatFull != null && (i9 = chatFull.participants_count) > 0) {
            return i9;
        }
        HashMap hashMap = this.w;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        for (int i9 = 0; i9 < this.e.size(); i9++) {
            if (((a) this.e.get(i9)).a == 7) {
                m(i9);
            }
        }
    }

    @Override // f2.r0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((a) this.e.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        a aVar = (a) this.e.get(i9);
        if (i10 == 0) {
            u uVar = (u) view;
            this.r = uVar;
            uVar.setBoostViaGifsText(this.v);
            this.r.setStars(aVar.g);
            return;
        }
        if (i10 == 2) {
            dg.e eVar = (dg.e) view;
            int i11 = aVar.l;
            int i12 = aVar.i;
            TLRPC.User user = (TLRPC.User) aVar.f;
            boolean z10 = aVar.b;
            o9 o9Var = eVar.c;
            b6 b6Var = eVar.a;
            dg.c cVar = eVar.d;
            h5 h5Var = eVar.e;
            z8 z8Var = eVar.b;
            boolean z11 = eVar.r == i11;
            eVar.r = i11;
            if (i11 == 0) {
                cVar.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var.setTextColor(f6.v0(f6.r5, b6Var));
                z8Var.g(16);
                z8Var.i(-15292942, -15630089);
                eVar.setDivider(true);
                eVar.setBackground(f6.V0(eVar.getContext(), R.drawable.greydivider_bottom, f6.b7));
            } else if (i11 == 1) {
                cVar.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i12 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i12 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i12, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                h5Var.setTextColor(f6.v0(f6.n5, b6Var));
                z8Var.g(6);
                z8Var.i(-3905294, -6923014);
                eVar.setDivider(false);
                eVar.setBackground(f6.V0(eVar.getContext(), R.drawable.greydivider_top, f6.b7));
            } else if (i11 == 2) {
                cVar.k(LocaleController.getString(R.string.BoostingPremium));
                if (i12 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var.getPaint().getFontMetricsInt(), false)));
                } else if (i12 > 0) {
                    eVar.setSubtitle(eVar.e(LocaleController.formatPluralString("Recipient", i12, new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                h5Var.setTextColor(f6.v0(f6.n5, b6Var));
                z8Var.g(25);
                z8Var.i(-3905294, -6923014);
                eVar.setDivider(true);
                eVar.setBackground(f6.V0(eVar.getContext(), R.drawable.greydivider_bottom, f6.b7));
            } else if (i11 == 3) {
                cVar.k(p8.a(LocaleController.getString(R.string.BoostingStars)));
                eVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var.setTextColor(f6.v0(f6.r5, b6Var));
                z8Var.g(26);
                z8Var.i(-146917, -625593);
                eVar.setDivider(false);
                eVar.setBackground(f6.V0(eVar.getContext(), R.drawable.greydivider_top, f6.b7));
            }
            eVar.f.a(z10, z11);
            o9Var.setImageDrawable(z8Var);
            o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        if (i10 == 5) {
            z zVar = (z) view;
            List list = aVar.k;
            int i13 = aVar.i;
            zVar.getClass();
            String[] strArr = new String[list.size()];
            for (int i14 = 0; i14 < list.size(); i14++) {
                strArr[i14] = String.valueOf((Integer) list.get(i14));
            }
            zVar.a.b(i13, null, strArr);
            zVar.setCallBack(this.h);
            return;
        }
        if (i10 == 6) {
            ((m4) view).setText(aVar.c);
            return;
        }
        if (i10 == 7) {
            h0 h0Var = (h0) view;
            h0Var.setText(aVar.c);
            h0Var.setBackground(aVar.g);
            return;
        }
        switch (i10) {
            case 9:
                dg.h hVar = (dg.h) view;
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
                ((dg.i) view).setDate(aVar.h);
                break;
            case 11:
                y yVar = (y) view;
                int i15 = aVar.l;
                boolean z12 = aVar.b;
                boolean z13 = aVar.g;
                List list2 = (List) aVar.f;
                TLRPC.Chat chat4 = this.v;
                dg.c cVar2 = yVar.d;
                yVar.r = i15;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                if (i15 == 0) {
                    cVar2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
                } else if (i15 == 1) {
                    cVar2.k(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
                }
                yVar.f.a(z12, false);
                yVar.setDivider(z13);
                yVar.e.setTextColor(f6.v0(f6.n5, yVar.a));
                if (list2.size() == 0) {
                    yVar.setSubtitle(yVar.e(LocaleController.getString(R.string.BoostingFromAllCountries)));
                    break;
                } else if (list2.size() <= 3) {
                    if (list2.size() == 1) {
                        yVar.setSubtitle(yVar.e(LocaleController.formatString("BoostingFromAllCountries1", R.string.BoostingFromAllCountries1, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                        break;
                    } else if (list2.size() == 2) {
                        yVar.setSubtitle(yVar.e(LocaleController.formatString("BoostingFromAllCountries2", R.string.BoostingFromAllCountries2, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                        break;
                    } else {
                        yVar.setSubtitle(yVar.e(LocaleController.formatString("BoostingFromAllCountries3", R.string.BoostingFromAllCountries3, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                        break;
                    }
                } else {
                    yVar.setSubtitle(yVar.e(LocaleController.formatPluralString("BoostingFromCountriesCount", list2.size(), new Object[0])));
                    break;
                }
            case 12:
                j jVar = (j) view;
                TLObject tLObject = aVar.m;
                int i16 = aVar.i;
                int i17 = aVar.j;
                long j10 = aVar.h;
                CharSequence charSequence = aVar.c;
                boolean z14 = aVar.g;
                boolean z15 = aVar.b;
                dg.c cVar3 = jVar.d;
                jVar.s = tLObject;
                if (i16 >= 12) {
                    cVar3.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                } else {
                    cVar3.k(LocaleController.formatPluralString("Months", i16, new Object[0]));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(BillingController.getInstance().formatCurrency(i17 > 0 ? j10 / i17 : j10, charSequence.toString()));
                sb2.append(" x ");
                sb2.append(i17);
                jVar.setSubtitle(sb2.toString());
                h5 h5Var2 = jVar.r;
                BillingController billingController = BillingController.getInstance();
                if (i17 <= 0) {
                    j10 = 0;
                }
                h5Var2.l(billingController.formatCurrency(j10, charSequence.toString()), false);
                jVar.setDivider(z14);
                jVar.f.a(z15, false);
                break;
            case 13:
                b0 b0Var = (b0) view;
                b0Var.setText(aVar.c);
                int i18 = aVar.i;
                j6 j6Var = b0Var.r;
                String formatPluralString = i18 > 0 ? LocaleController.formatPluralString("BoostingBoostsCountTitle", i18, Integer.valueOf(i18)) : "";
                j6Var.a();
                j6Var.c(formatPluralString, true, true);
                break;
            case 14:
                ((dg.f) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f);
                break;
            case 15:
                c0 c0Var = (c0) view;
                CharSequence charSequence2 = aVar.c;
                boolean z16 = aVar.b;
                boolean z17 = aVar.g;
                c0Var.G = aVar.l;
                c0Var.f(charSequence2, z16, z17);
                break;
            case 16:
                m mVar = (m) view;
                mVar.setCount(aVar.i);
                mVar.setAfterTextChangedListener(this.s);
                break;
            case 17:
                a0 a0Var = (a0) view;
                TLObject tLObject2 = aVar.m;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = tLObject2 != null ? (TL_stars.TL_starsGiveawayOption) tLObject2 : null;
                int i19 = aVar.i;
                long j11 = aVar.h;
                boolean z18 = aVar.b;
                TextView textView = a0Var.f;
                j6 j6Var2 = a0Var.d;
                j6 j6Var3 = a0Var.e;
                boolean z19 = a0Var.r == tL_starsGiveawayOption;
                a0Var.a.a(z18, z19);
                a0Var.r = tL_starsGiveawayOption;
                if (z19) {
                    j6Var3.a();
                }
                if (tL_starsGiveawayOption == null) {
                    j6Var2.c(a0Var.h, false, true);
                    j6Var3.c(a0Var.n, z19, true);
                    textView.setText("");
                } else {
                    j6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                    j6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z19, true);
                    textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i20 = i19 + 1;
                a0Var.s = i20;
                if (!z19) {
                    a0Var.v.d(i20, true);
                }
                a0Var.invalidate();
                break;
        }
    }

    @Override // f2.r0
    public final q1 x(ViewGroup viewGroup, int i9) {
        View view;
        Context context = viewGroup.getContext();
        b6 b6Var = this.d;
        switch (i9) {
            case 2:
                view = new dg.e(context, b6Var);
                break;
            case 3:
                view = new View(context);
                break;
            case 4:
                view = new z6(context, f6.v0(f6.a7, b6Var), 0);
                break;
            case 5:
                view = new z(context, b6Var);
                break;
            case 6:
                View m4Var = new m4(context, f6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(f6.v0(f6.h5, b6Var));
                view = m4Var;
                break;
            case 7:
                view = new h0(context, b6Var);
                break;
            case 8:
                view = new dg.b(context, b6Var);
                break;
            case 9:
                view = new dg.h(context, b6Var);
                break;
            case 10:
                view = new dg.i(context, b6Var);
                break;
            case 11:
                y yVar = new y(context, b6Var);
                yVar.c.setVisibility(8);
                view = yVar;
                break;
            case 12:
                view = new j(context, b6Var);
                break;
            case 13:
                View b0Var = new b0(context, b6Var);
                b0Var.setBackgroundColor(f6.v0(f6.h5, b6Var));
                view = b0Var;
                break;
            case 14:
                view = new dg.f(context, b6Var);
                break;
            case 15:
                c0 c0Var = new c0(context, b6Var);
                c0Var.setHeight(50);
                view = c0Var;
                break;
            case 16:
                view = new m(context, b6Var);
                break;
            case 17:
                view = new a0(context, b6Var);
                break;
            case 18:
                u9 u9Var = new u9(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                boolean z10 = u9Var.c == -1;
                u9Var.c = -1;
                j6 j6Var = u9Var.a;
                j6Var.c(string, z10, true);
                int w02 = f6.w0(null, f6.o6, false);
                j6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = u9Var.b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(gr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                u9Var.d = false;
                u9Var.setWillNotDraw(true);
                view = u9Var;
                break;
            default:
                view = new u(context, b6Var);
                break;
        }
        return r0.s(view, view, -1, -2);
    }
}
