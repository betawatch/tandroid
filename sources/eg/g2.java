package eg;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bg.h3;
import i7.f6;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g2 extends xa {
    public final nh.d T;
    public final e2 U;
    public final s3 V;
    public final ig.d W;
    public final Paint X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final HashSet a0;
    public final HashSet b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final HashMap e0;
    public final ArrayList f0;
    public final ArrayList g0;
    public final LinkedHashMap h0;
    public final d6 i0;
    public String j0;
    public fg.h k0;
    public int l0;
    public final TLRPC.Chat m0;
    public int n0;
    public t o0;
    public int p0;
    public w q0;
    public final ag.q1 r0;

    public g2(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(o2Var, false);
        this.X = new Paint(1);
        this.Y = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z = arrayList;
        this.a0 = new HashSet();
        this.b0 = new HashSet();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new HashMap();
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.h0 = new LinkedHashMap();
        this.l0 = AndroidUtilities.dp(134.0f);
        this.r0 = new ag.q1(this, 20);
        this.backgroundPaddingLeft = 0;
        this.m0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        jr jrVar = jr.h;
        this.i0 = new d6(viewGroup, 0L, 350L, jrVar);
        ig.d dVar = new ig.d(getContext(), this.resourcesProvider);
        this.W = dVar;
        dVar.setOnCloseClickListener(new y1(this, 7));
        dVar.setText(y());
        dVar.setCloseImageVisible(true);
        dVar.e.c(0.0f, false);
        e2 e2Var = new e2(this, getContext(), this.resourcesProvider);
        this.U = e2Var;
        int i10 = g6.h5;
        e2Var.setBackgroundColor(getThemedColor(i10));
        e2Var.setOnSearchTextChange(new c2(this, 0));
        this.V = new s3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(dVar, f6.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(e2Var, f6.f(-2.0f, 55, i12, 0, i12, 0));
        ig.a aVar = new ig.a(getContext(), this.resourcesProvider, (jl0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(g6.v0(i10, this.resourcesProvider));
        nh.d dVar2 = new nh.d(getContext(), this.resourcesProvider, true);
        this.T = dVar2;
        dVar2.setOnClickListener(new b2(this, 1));
        aVar.addView(dVar2, f6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, f6.f(-2.0f, 87, i13, 0, i13, 0));
        fg.h hVar = this.k0;
        jl0 jl0Var = this.d;
        hVar.h = arrayList;
        hVar.f = jl0Var;
        int i14 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        int i15 = 1;
        this.d.j(new cg.g2(this, i15));
        this.d.setOnItemClickListener(new n(this, i15));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(jrVar);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new f2(this, 0));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static /* synthetic */ void P(g2 g2Var, boolean z10, Pair pair) {
        HashMap hashMap = g2Var.e0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            g2Var.f0.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new a2(g2Var, 0));
        }
        if (g2Var.n0 == 3) {
            g2Var.b0(true, true);
            g2Var.X(true);
        }
    }

    public static void Q(g2 g2Var, View view) {
        LinkedHashMap linkedHashMap = g2Var.h0;
        e2 e2Var = g2Var.U;
        HashSet hashSet = g2Var.a0;
        if (view instanceof m8) {
            linkedHashMap.clear();
            g2Var.W(true);
        } else if (view instanceof ig.n) {
            ig.n nVar = (ig.n) view;
            TLRPC.User user = nVar.getUser();
            TLRPC.Chat chat = nVar.getChat();
            long j10 = user != null ? user.id : -chat.id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                Long valueOf = Long.valueOf(j10);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && g2Var.n0 == 1) || (hashSet.size() == q0.f() + 1 && g2Var.n0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                g2Var.Y();
                return;
            }
            e2Var.b(true, hashSet, new y1(g2Var, 1), null);
            g2Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = g2Var.n.getContext();
                c6 c6Var = g2Var.resourcesProvider;
                z1 z1Var = new z1(g2Var, j10, 0);
                y1 y1Var = new y1(g2Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                alertDialog$Builder.a.N = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup);
                alertDialog$Builder.a.P = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new a9.s(11, atomicBoolean, y1Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new c(0));
                alertDialog$Builder.j(new g(0, atomicBoolean, z1Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                g2Var.R();
            }
        }
        if (view instanceof ig.c) {
            long hashCode = ((ig.c) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && g2Var.n0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                g2Var.Y();
                return;
            }
            e2Var.b(true, hashSet, new y1(g2Var, 3), g2Var.g0);
            if (TextUtils.isEmpty(g2Var.j0)) {
                g2Var.b0(true, false);
                return;
            }
            g2Var.j0 = null;
            e2Var.setText("");
            g2Var.b0(false, false);
            g2Var.b0(true, true);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!com.google.android.recaptcha.internal.a.u(tL_help_country)) {
            return false;
        }
        String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || x3.w(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || x3.w(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.Components.xa
    public final void C(Canvas canvas, int i10) {
        this.p0 = i10;
        float f9 = AndroidUtilities.statusBarHeight;
        ig.d dVar = this.W;
        dVar.setTranslationY(Math.max(i10, (((dVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f9));
        float translationY = dVar.getTranslationY() + dVar.getMeasuredHeight();
        this.U.setTranslationY(translationY);
        this.d.setTranslationY((r2.getMeasuredHeight() + dVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int v02 = g6.v0(g6.h5, this.resourcesProvider);
        Paint paint = this.X;
        paint.setColor(v02);
        int max = Math.max(0, i10);
        boolean z10 = max < AndroidUtilities.statusBarHeight;
        d6 d6Var = this.i0;
        int lerp = AndroidUtilities.lerp(max, 0, d6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - d6Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void R() {
        if (TextUtils.isEmpty(this.j0)) {
            return;
        }
        this.j0 = null;
        this.U.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.r0);
        ArrayList arrayList = this.c0;
        arrayList.clear();
        arrayList.addAll(q0.e(this.m0.id));
        b0(false, false);
        b0(true, true);
    }

    public final boolean S() {
        HashSet hashSet = this.a0;
        int size = hashSet.size();
        HashSet hashSet2 = this.b0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.n0;
        Context context = getContext();
        c6 c6Var = this.resourcesProvider;
        y1 y1Var = new y1(this, 0);
        y1 y1Var2 = new y1(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        alertDialog$Builder.a.P = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries) : LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels) : LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new n(y1Var, 0));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new a1.c(y1Var2, 27));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.Chat chat = this.m0;
        if (i10 == 1) {
            long j10 = chat.id;
            d2 d2Var = new d2(this, z10, 0);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = messagesController.getInputChannel(j10);
            TLRPC.ChannelParticipantsFilter tL_channelParticipantsRecent = str == null ? new TLRPC.TL_channelParticipantsRecent() : new TLRPC.TL_channelParticipantsSearch();
            tL_channels_getParticipants.filter = tL_channelParticipantsRecent;
            if (str == null) {
                str = "";
            }
            tL_channelParticipantsRecent.q = str;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 50;
            connectionsManager.sendRequest(tL_channels_getParticipants, new h3(1, messagesController, d2Var));
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            d2 d2Var2 = new d2(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new ef.a(d2Var2, 2));
            return;
        }
        long j11 = chat.id;
        c2 c2Var = new c2(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new d0(messagesController2, j11, c2Var, 0));
    }

    public final void V(int i10, List list) {
        this.n0 = i10;
        this.j0 = null;
        HashSet hashSet = this.b0;
        hashSet.clear();
        HashSet hashSet2 = this.a0;
        hashSet2.clear();
        ArrayList arrayList = this.c0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.h0;
        linkedHashMap.clear();
        if (i10 == 1) {
            arrayList.addAll(this.d0);
        } else if (i10 == 2) {
            arrayList.addAll(q0.e(this.m0.id));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                long j10 = tLObject instanceof TLRPC.TL_inputPeerChat ? -((TLRPC.TL_inputPeerChat) tLObject).chat_id : 0L;
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j10 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        e2 e2Var = this.U;
        e2Var.setText("");
        e2Var.d.b(false);
        e2Var.b(false, hashSet2, new y1(this, 4), this.g0);
        c0();
        b0(false, true);
        this.W.setText(y());
        Z(false);
        X(false);
    }

    public final void W(boolean z10) {
        HashSet hashSet = this.a0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.n0;
            LinkedHashMap linkedHashMap = this.h0;
            if (i10 == 1) {
                ArrayList arrayList = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(user);
                        }
                    }
                }
                w wVar = this.q0;
                if (wVar != null) {
                    wVar.c.b.D(0);
                    c1 c1Var = wVar.a;
                    ArrayList arrayList2 = c1Var.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i11 = gg.e.s;
                        c1Var.e0 = 0;
                    } else {
                        int i12 = gg.e.s;
                        c1Var.e0 = 1;
                    }
                    c1Var.j0 = 0;
                    c1Var.a0(false, true);
                    c1Var.Z(true);
                    c1Var.M();
                    return;
                }
                return;
            }
            if (i10 == 2) {
                ArrayList arrayList3 = new ArrayList();
                for (TLObject tLObject2 : linkedHashMap.values()) {
                    if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (hashSet.contains(Long.valueOf(-chat.id))) {
                            arrayList3.add(chat);
                        }
                    }
                }
                w wVar2 = this.q0;
                if (wVar2 != null) {
                    y yVar = wVar2.c;
                    yVar.b.D(0);
                    c1 c1Var2 = wVar2.a;
                    boolean z11 = !yVar.isKeyboardVisible();
                    ArrayList arrayList4 = c1Var2.Y;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    c1Var2.a0(z11, true);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.g0;
            int size = arrayList6.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList6.get(i13);
                i13++;
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                    arrayList5.add(tL_help_country);
                }
            }
            w wVar3 = this.q0;
            if (wVar3 != null) {
                wVar3.c.b.D(0);
                c1 c1Var3 = wVar3.a;
                ArrayList arrayList7 = c1Var3.a0;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                c1Var3.a0(false, true);
            }
        }
    }

    public final void X(boolean z10) {
        jl0 jl0Var = this.d;
        if (!z10) {
            jl0Var.u0(0);
            return;
        }
        uh.n nVar = new uh.n(getContext(), 2, 0.6f);
        nVar.a = 1;
        nVar.p = AndroidUtilities.dp(38.0f);
        jl0Var.getLayoutManager().w0(nVar);
    }

    public final void Y() {
        int i10 = this.n0;
        String formatPluralString = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]) : LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) q0.f(), new Object[0]) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        w wVar = this.q0;
        if (wVar != null) {
            new tc(wVar.c.container, wVar.b).Q(R.raw.chats_infotip, 36, formatPluralString).k(true);
        }
    }

    public final void Z(boolean z10) {
        nh.d dVar = this.T;
        dVar.setShowZero(false);
        int i10 = this.n0;
        dVar.g(i10 != 1 ? (i10 == 2 || i10 == 3) ? LocaleController.getString(R.string.Save) : "" : LocaleController.getString(R.string.BoostingSaveRecipients), z10, true);
        HashSet hashSet = this.a0;
        dVar.c(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        fg.h hVar;
        ArrayList arrayList = this.Y;
        arrayList.clear();
        ArrayList arrayList2 = this.Z;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.n0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            fg.g gVar = new fg.g(9, false);
            gVar.i = 1;
            gVar.j = i11;
            gVar.g = string;
            arrayList2.add(gVar);
        }
        fg.g gVar2 = new fg.g(10, false);
        s3 s3Var = this.V;
        gVar2.q = s3Var;
        arrayList2.add(gVar2);
        int i12 = this.n0;
        HashSet hashSet = this.a0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.e0.get(str)) {
                    if (TextUtils.isEmpty(this.j0) || U(tL_help_country, AndroidUtilities.translitSafe(this.j0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        fg.g gVar3 = new fg.g(6, true);
                        gVar3.f = tL_help_country;
                        gVar3.k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    int dp = AndroidUtilities.dp(32.0f) + i10;
                    String upperCase = str.toUpperCase();
                    fg.g gVar4 = new fg.g(7, false);
                    gVar4.g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = dp;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.c0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            fg.g gVar5 = new fg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.c = null;
            gVar5.e = null;
            gVar5.k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new fg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        fg.g gVar6 = new fg.g(-1, false);
        gVar6.l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.n0 != 3) {
            s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new b2(this, 0));
        } else if (z10) {
            s3Var.setRightText(null);
        } else {
            r3 r3Var = s3Var.b;
            r3Var.c(null, false, true);
            r3Var.setOnClickListener(null);
            r3Var.setVisibility(0);
        }
        if (!z11 || (hVar = this.k0) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList, arrayList2);
        } else {
            hVar.l();
        }
    }

    public final void b0(boolean z10, boolean z11) {
        a0(z10, z11);
        int i10 = 0;
        while (true) {
            jl0 jl0Var = this.d;
            if (i10 >= jl0Var.getChildCount()) {
                Z(z10);
                return;
            }
            View childAt = jl0Var.getChildAt(i10);
            if (childAt instanceof ig.n) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.Z;
                    if (R < arrayList.size()) {
                        fg.g gVar = (fg.g) arrayList.get(R);
                        ig.n nVar = (ig.n) childAt;
                        nVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            nVar.i(this.k0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            nVar.i(1.0f, z10);
                        }
                    }
                }
                i10++;
            }
            if (childAt instanceof ig.c) {
                ((ig.c) childAt).c(this.a0.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i10++;
        }
    }

    public final void c0() {
        String formatPluralStringComma;
        int i10 = this.n0;
        s3 s3Var = this.V;
        if (i10 == 1) {
            TLRPC.Chat chat = this.m0;
            formatPluralStringComma = LocaleController.formatPluralStringComma(ChatObject.isChannelAndNotMegaGroup(chat) ? "Subscribers" : "Members", Math.max(0, this.k0.F(chat) - 1));
            s3Var.setLayerHeight(32);
        } else if (i10 == 2) {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) q0.f(), new Object[0]);
            s3Var.setLayerHeight(32);
        } else if (i10 != 3) {
            formatPluralStringComma = "";
        } else {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
            s3Var.setLayerHeight(1);
        }
        s3Var.setText(formatPluralStringComma);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        t tVar = this.o0;
        if (tVar != null) {
            tVar.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.r0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        fg.h hVar = new fg.h(getContext(), this.resourcesProvider, true);
        this.k0 = hVar;
        return hVar;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        int i10 = this.n0;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry) : LocaleController.getString(R.string.BoostingAddChannelOrGroup) : LocaleController.getString(R.string.GiftPremium);
    }
}
