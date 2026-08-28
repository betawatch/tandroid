package bg;

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
import g7.e6;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q2 extends sa {
    public final kh.d T;
    public final n2 U;
    public final v3 V;
    public final fg.d W;
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
    public final y5 i0;
    public String j0;
    public cg.h k0;
    public int l0;
    public final TLRPC.Chat m0;
    public int n0;
    public v o0;
    public int p0;
    public y q0;
    public final androidx.activity.i r0;

    public q2(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
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
        this.r0 = new androidx.activity.i(this, 8);
        this.backgroundPaddingLeft = 0;
        this.m0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        gr grVar = gr.h;
        this.i0 = new y5(viewGroup, 0L, 350L, grVar);
        fg.d dVar = new fg.d(getContext(), this.resourcesProvider);
        this.W = dVar;
        dVar.setOnCloseClickListener(new h2(this, 7));
        dVar.setText(y());
        dVar.setCloseImageVisible(true);
        dVar.e.c(0.0f, false);
        n2 n2Var = new n2(this, getContext(), this.resourcesProvider);
        this.U = n2Var;
        int i9 = f6.h5;
        n2Var.setBackgroundColor(getThemedColor(i9));
        n2Var.setOnSearchTextChange(new l2(this, 0));
        this.V = new v3(getContext(), this.resourcesProvider);
        b0();
        ViewGroup viewGroup2 = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup2.addView(dVar, e6.f(-2.0f, 55, i10, 0, i10, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup3.addView(n2Var, e6.f(-2.0f, 55, i11, 0, i11, 0));
        fg.a aVar = new fg.a(getContext(), this.resourcesProvider, (wk0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(f6.v0(i9, this.resourcesProvider));
        kh.d dVar2 = new kh.d(getContext(), this.resourcesProvider, true);
        this.T = dVar2;
        dVar2.setOnClickListener(new k2(this, 1));
        aVar.addView(dVar2, e6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, e6.f(-2.0f, 87, i12, 0, i12, 0));
        cg.h hVar = this.k0;
        wk0 wk0Var = this.d;
        hVar.h = arrayList;
        hVar.f = wk0Var;
        int i13 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(60.0f));
        this.d.j(new o2(this, 0));
        this.d.setOnItemClickListener(new a1.c(this, 6));
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(grVar);
        nVar.C = false;
        nVar.m = false;
        this.d.setItemAnimator(nVar);
        this.d.i(new p2(this, 0));
        a0(false, true);
        S(1, null, true);
        S(3, null, true);
    }

    public static /* synthetic */ void O(q2 q2Var, boolean z10, Pair pair) {
        HashMap hashMap = q2Var.e0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            q2Var.f0.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new j2(q2Var, 0));
        }
        if (q2Var.n0 == 3) {
            q2Var.a0(true, true);
            q2Var.W(true);
        }
    }

    public static void P(q2 q2Var, View view) {
        LinkedHashMap linkedHashMap = q2Var.h0;
        n2 n2Var = q2Var.U;
        HashSet hashSet = q2Var.a0;
        if (view instanceof p8) {
            linkedHashMap.clear();
            q2Var.V(true);
        } else if (view instanceof fg.p) {
            fg.p pVar = (fg.p) view;
            TLRPC.User user = pVar.getUser();
            TLRPC.Chat chat = pVar.getChat();
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
            if ((hashSet.size() == 11 && q2Var.n0 == 1) || (hashSet.size() == u0.f() + 1 && q2Var.n0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                q2Var.X();
                return;
            }
            n2Var.b(true, hashSet, new h2(q2Var, 1), null);
            q2Var.a0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = q2Var.n.getContext();
                b6 b6Var = q2Var.resourcesProvider;
                i2 i2Var = new i2(q2Var, j10, 0);
                h2 h2Var = new h2(q2Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                alertDialog$Builder.a.N = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup);
                alertDialog$Builder.a.P = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new b5.d(2, atomicBoolean, h2Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new a9.b(7));
                alertDialog$Builder.j(new j(0, atomicBoolean, i2Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                q2Var.Q();
            }
        }
        if (view instanceof fg.c) {
            long hashCode = ((fg.c) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && q2Var.n0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                q2Var.X();
                return;
            }
            n2Var.b(true, hashSet, new h2(q2Var, 3), q2Var.g0);
            if (TextUtils.isEmpty(q2Var.j0)) {
                q2Var.a0(true, false);
                return;
            }
            q2Var.j0 = null;
            n2Var.setText("");
            q2Var.a0(false, false);
            q2Var.a0(true, true);
        }
    }

    public static boolean T(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!e2.c.v(tL_help_country)) {
            return false;
        }
        String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || org.telegram.messenger.l0.w(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || org.telegram.messenger.l0.w(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.Components.sa
    public final void C(Canvas canvas, int i9) {
        this.p0 = i9;
        float f10 = AndroidUtilities.statusBarHeight;
        fg.d dVar = this.W;
        dVar.setTranslationY(Math.max(i9, (((dVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f10));
        float translationY = dVar.getTranslationY() + dVar.getMeasuredHeight();
        this.U.setTranslationY(translationY);
        this.d.setTranslationY((r2.getMeasuredHeight() + dVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int v02 = f6.v0(f6.h5, this.resourcesProvider);
        Paint paint = this.X;
        paint.setColor(v02);
        int max = Math.max(0, i9);
        boolean z10 = max < AndroidUtilities.statusBarHeight;
        y5 y5Var = this.i0;
        int lerp = AndroidUtilities.lerp(max, 0, y5Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - y5Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void Q() {
        if (TextUtils.isEmpty(this.j0)) {
            return;
        }
        this.j0 = null;
        this.U.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.r0);
        ArrayList arrayList = this.c0;
        arrayList.clear();
        arrayList.addAll(u0.e(this.m0.id));
        a0(false, false);
        a0(true, true);
    }

    public final boolean R() {
        HashSet hashSet = this.a0;
        int size = hashSet.size();
        HashSet hashSet2 = this.b0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i9 = this.n0;
        Context context = getContext();
        b6 b6Var = this.resourcesProvider;
        h2 h2Var = new h2(this, 0);
        h2 h2Var2 = new h2(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.a.N = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        alertDialog$Builder.a.P = i9 != 1 ? i9 != 2 ? i9 != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries) : LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels) : LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new a1.c(h2Var, 5));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new a1.c(h2Var2, 2));
        alertDialog$Builder.o();
        return true;
    }

    public final void S(int i9, String str, boolean z10) {
        TLRPC.Chat chat = this.m0;
        if (i9 == 1) {
            long j10 = chat.id;
            m2 m2Var = new m2(this, z10, 0);
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
            connectionsManager.sendRequest(tL_channels_getParticipants, new j0(0, messagesController, m2Var));
            return;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                return;
            }
            m2 m2Var2 = new m2(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new bf.a(m2Var2, 2));
            return;
        }
        long j11 = chat.id;
        l2 l2Var = new l2(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new f0(messagesController2, j11, l2Var, 0));
    }

    public final void U(int i9, List list) {
        this.n0 = i9;
        this.j0 = null;
        HashSet hashSet = this.b0;
        hashSet.clear();
        HashSet hashSet2 = this.a0;
        hashSet2.clear();
        ArrayList arrayList = this.c0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.h0;
        linkedHashMap.clear();
        if (i9 == 1) {
            arrayList.addAll(this.d0);
        } else if (i9 == 2) {
            arrayList.addAll(u0.e(this.m0.id));
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
        n2 n2Var = this.U;
        n2Var.setText("");
        n2Var.d.b(false);
        n2Var.b(false, hashSet2, new h2(this, 4), this.g0);
        b0();
        a0(false, true);
        this.W.setText(y());
        Y(false);
        W(false);
    }

    public final void V(boolean z10) {
        HashSet hashSet = this.a0;
        if (hashSet.size() != 0 || z10) {
            int i9 = this.n0;
            LinkedHashMap linkedHashMap = this.h0;
            if (i9 == 1) {
                ArrayList arrayList = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(user);
                        }
                    }
                }
                y yVar = this.q0;
                if (yVar != null) {
                    yVar.c.b.D(0);
                    h1 h1Var = yVar.a;
                    ArrayList arrayList2 = h1Var.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i10 = dg.e.s;
                        h1Var.e0 = 0;
                    } else {
                        int i11 = dg.e.s;
                        h1Var.e0 = 1;
                    }
                    h1Var.j0 = 0;
                    h1Var.Z(false, true);
                    h1Var.Y(true);
                    h1Var.M();
                    return;
                }
                return;
            }
            if (i9 == 2) {
                ArrayList arrayList3 = new ArrayList();
                for (TLObject tLObject2 : linkedHashMap.values()) {
                    if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (hashSet.contains(Long.valueOf(-chat.id))) {
                            arrayList3.add(chat);
                        }
                    }
                }
                y yVar2 = this.q0;
                if (yVar2 != null) {
                    a0 a0Var = yVar2.c;
                    a0Var.b.D(0);
                    h1 h1Var2 = yVar2.a;
                    boolean z11 = !a0Var.isKeyboardVisible();
                    ArrayList arrayList4 = h1Var2.Y;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    h1Var2.Z(z11, true);
                    return;
                }
                return;
            }
            if (i9 != 3) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.g0;
            int size = arrayList6.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList6.get(i12);
                i12++;
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                    arrayList5.add(tL_help_country);
                }
            }
            y yVar3 = this.q0;
            if (yVar3 != null) {
                yVar3.c.b.D(0);
                h1 h1Var3 = yVar3.a;
                ArrayList arrayList7 = h1Var3.a0;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                h1Var3.Z(false, true);
            }
        }
    }

    public final void W(boolean z10) {
        wk0 wk0Var = this.d;
        if (!z10) {
            wk0Var.u0(0);
            return;
        }
        rh.n nVar = new rh.n(getContext(), 2, 0.6f);
        nVar.a = 1;
        nVar.p = AndroidUtilities.dp(38.0f);
        wk0Var.getLayoutManager().w0(nVar);
    }

    public final void X() {
        int i9 = this.n0;
        String formatPluralString = i9 != 1 ? i9 != 2 ? i9 != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]) : LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) u0.f(), new Object[0]) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        y yVar = this.q0;
        if (yVar != null) {
            new oc(yVar.c.container, yVar.b).Q(R.raw.chats_infotip, 36, formatPluralString).k(true);
        }
    }

    public final void Y(boolean z10) {
        kh.d dVar = this.T;
        dVar.setShowZero(false);
        int i9 = this.n0;
        dVar.g(i9 != 1 ? (i9 == 2 || i9 == 3) ? LocaleController.getString(R.string.Save) : "" : LocaleController.getString(R.string.BoostingSaveRecipients), z10, true);
        HashSet hashSet = this.a0;
        dVar.c(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void Z(boolean z10, boolean z11) {
        int i9;
        cg.h hVar;
        ArrayList arrayList = this.Y;
        arrayList.clear();
        ArrayList arrayList2 = this.Z;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.n0 == 1) {
            int i10 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            cg.g gVar = new cg.g(9, false);
            gVar.i = 1;
            gVar.j = i10;
            gVar.g = string;
            arrayList2.add(gVar);
        }
        cg.g gVar2 = new cg.g(10, false);
        v3 v3Var = this.V;
        gVar2.q = v3Var;
        arrayList2.add(gVar2);
        int i11 = this.n0;
        HashSet hashSet = this.a0;
        if (i11 == 3) {
            ArrayList arrayList3 = this.f0;
            int size = arrayList3.size();
            i9 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.e0.get(str)) {
                    if (TextUtils.isEmpty(this.j0) || T(tL_help_country, AndroidUtilities.translitSafe(this.j0).toLowerCase())) {
                        i9 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        cg.g gVar3 = new cg.g(6, true);
                        gVar3.f = tL_help_country;
                        gVar3.k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    int dp = AndroidUtilities.dp(32.0f) + i9;
                    String upperCase = str.toUpperCase();
                    cg.g gVar4 = new cg.g(7, false);
                    gVar4.g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i9 = dp;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i9 = 0;
        }
        ArrayList arrayList6 = this.c0;
        int size2 = arrayList6.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList6.get(i13);
            i13++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i9 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            cg.g gVar5 = new cg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.c = null;
            gVar5.e = null;
            gVar5.k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new cg.g(5, false));
            i9 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i9);
        cg.g gVar6 = new cg.g(-1, false);
        gVar6.l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.n0 != 3) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new k2(this, 0));
        } else if (z10) {
            v3Var.setRightText(null);
        } else {
            u3 u3Var = v3Var.b;
            u3Var.c(null, false, true);
            u3Var.setOnClickListener(null);
            u3Var.setVisibility(0);
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

    public final void a0(boolean z10, boolean z11) {
        Z(z10, z11);
        int i9 = 0;
        while (true) {
            wk0 wk0Var = this.d;
            if (i9 >= wk0Var.getChildCount()) {
                Y(z10);
                return;
            }
            View childAt = wk0Var.getChildAt(i9);
            if (childAt instanceof fg.p) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.Z;
                    if (R < arrayList.size()) {
                        cg.g gVar = (cg.g) arrayList.get(R);
                        fg.p pVar = (fg.p) childAt;
                        pVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            pVar.i(this.k0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            pVar.i(1.0f, z10);
                        }
                    }
                }
                i9++;
            }
            if (childAt instanceof fg.c) {
                ((fg.c) childAt).c(this.a0.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i9++;
        }
    }

    public final void b0() {
        String formatPluralStringComma;
        int i9 = this.n0;
        v3 v3Var = this.V;
        if (i9 == 1) {
            TLRPC.Chat chat = this.m0;
            formatPluralStringComma = LocaleController.formatPluralStringComma(ChatObject.isChannelAndNotMegaGroup(chat) ? "Subscribers" : "Members", Math.max(0, this.k0.F(chat) - 1));
            v3Var.setLayerHeight(32);
        } else if (i9 == 2) {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) u0.f(), new Object[0]);
            v3Var.setLayerHeight(32);
        } else if (i9 != 3) {
            formatPluralStringComma = "";
        } else {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
            v3Var.setLayerHeight(1);
        }
        v3Var.setText(formatPluralStringComma);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        v vVar = this.o0;
        if (vVar != null) {
            vVar.run();
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
        Z(false, true);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        cg.h hVar = new cg.h(getContext(), this.resourcesProvider, true);
        this.k0 = hVar;
        return hVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        int i9 = this.n0;
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry) : LocaleController.getString(R.string.BoostingAddChannelOrGroup) : LocaleController.getString(R.string.GiftPremium);
    }
}
