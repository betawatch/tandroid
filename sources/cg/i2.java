package cg;

import ag.z2;
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
import h7.z5;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i2 extends qa {
    public final lh.d T;
    public final g2 U;
    public final s3 V;
    public final gg.d W;
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
    public dg.h k0;
    public int l0;
    public final TLRPC.Chat m0;
    public int n0;
    public s o0;
    public int p0;
    public v q0;
    public final a8.b r0;

    public i2(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(n2Var, false);
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
        this.r0 = new a8.b(this, 9);
        this.backgroundPaddingLeft = 0;
        this.m0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        er erVar = er.h;
        this.i0 = new y5(viewGroup, 0L, 350L, erVar);
        gg.d dVar = new gg.d(getContext(), this.resourcesProvider);
        this.W = dVar;
        dVar.setOnCloseClickListener(new a2(this, 7));
        dVar.setText(z());
        dVar.setCloseImageVisible(true);
        dVar.e.c(0.0f, false);
        g2 g2Var = new g2(this, getContext(), this.resourcesProvider);
        this.U = g2Var;
        int i10 = g6.h5;
        g2Var.setBackgroundColor(getThemedColor(i10));
        g2Var.setOnSearchTextChange(new e2(this, 0));
        this.V = new s3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(dVar, z5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(g2Var, z5.f(-2.0f, 55, i12, 0, i12, 0));
        gg.a aVar = new gg.a(getContext(), this.resourcesProvider, (zk0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(g6.v0(i10, this.resourcesProvider));
        lh.d dVar2 = new lh.d(getContext(), this.resourcesProvider, true);
        this.T = dVar2;
        dVar2.setOnClickListener(new d2(this, 1));
        aVar.addView(dVar2, z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, z5.f(-2.0f, 87, i13, 0, i13, 0));
        dg.h hVar = this.k0;
        zk0 zk0Var = this.d;
        hVar.h = arrayList;
        hVar.f = zk0Var;
        int i14 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new z2(this, 1));
        this.d.setOnItemClickListener(new a1.c(this, 12));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(erVar);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new h2(this, 0));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static /* synthetic */ void P(i2 i2Var, boolean z10, Pair pair) {
        HashMap hashMap = i2Var.e0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            i2Var.f0.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new c2(i2Var, 0));
        }
        if (i2Var.n0 == 3) {
            i2Var.b0(true, true);
            i2Var.X(true);
        }
    }

    public static void Q(i2 i2Var, View view) {
        LinkedHashMap linkedHashMap = i2Var.h0;
        g2 g2Var = i2Var.U;
        HashSet hashSet = i2Var.a0;
        if (view instanceof l8) {
            linkedHashMap.clear();
            i2Var.W(true);
        } else if (view instanceof gg.o) {
            gg.o oVar = (gg.o) view;
            TLRPC.User user = oVar.getUser();
            TLRPC.Chat chat = oVar.getChat();
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
            if ((hashSet.size() == 11 && i2Var.n0 == 1) || (hashSet.size() == q0.f() + 1 && i2Var.n0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                i2Var.Y();
                return;
            }
            g2Var.b(true, hashSet, new a2(i2Var, 1), null);
            i2Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = i2Var.n.getContext();
                c6 c6Var = i2Var.resourcesProvider;
                b2 b2Var = new b2(i2Var, j10, 0);
                a2 a2Var = new a2(i2Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                alertDialog$Builder.a.N = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup);
                alertDialog$Builder.a.P = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new ag.h0(6, atomicBoolean, a2Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new a9.m(14));
                alertDialog$Builder.j(new g(0, atomicBoolean, b2Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                i2Var.R();
            }
        }
        if (view instanceof gg.c) {
            long hashCode = ((gg.c) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && i2Var.n0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                i2Var.Y();
                return;
            }
            g2Var.b(true, hashSet, new a2(i2Var, 3), i2Var.g0);
            if (TextUtils.isEmpty(i2Var.j0)) {
                i2Var.b0(true, false);
                return;
            }
            i2Var.j0 = null;
            g2Var.setText("");
            i2Var.b0(false, false);
            i2Var.b0(true, true);
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
        if (lowerCase.startsWith(str) || org.telegram.messenger.y1.x(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || org.telegram.messenger.y1.x(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.Components.qa
    public final void D(Canvas canvas, int i10) {
        this.p0 = i10;
        float f10 = AndroidUtilities.statusBarHeight;
        gg.d dVar = this.W;
        dVar.setTranslationY(Math.max(i10, (((dVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f10));
        float translationY = dVar.getTranslationY() + dVar.getMeasuredHeight();
        this.U.setTranslationY(translationY);
        this.d.setTranslationY((r2.getMeasuredHeight() + dVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int v02 = g6.v0(g6.h5, this.resourcesProvider);
        Paint paint = this.X;
        paint.setColor(v02);
        int max = Math.max(0, i10);
        boolean z10 = max < AndroidUtilities.statusBarHeight;
        y5 y5Var = this.i0;
        int lerp = AndroidUtilities.lerp(max, 0, y5Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - y5Var.c) * AndroidUtilities.dp(14.0f);
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
        a2 a2Var = new a2(this, 0);
        a2 a2Var2 = new a2(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        alertDialog$Builder.a.P = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries) : LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels) : LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new a1.c(a2Var, 11));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new a1.c(a2Var2, 8));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.Chat chat = this.m0;
        if (i10 == 1) {
            long j10 = chat.id;
            f2 f2Var = new f2(this, z10, 0);
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
            connectionsManager.sendRequest(tL_channels_getParticipants, new g0(0, messagesController, f2Var));
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            f2 f2Var2 = new f2(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new cf.a(f2Var2, 2));
            return;
        }
        long j11 = chat.id;
        e2 e2Var = new e2(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new c0(messagesController2, j11, e2Var, 0));
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
        g2 g2Var = this.U;
        g2Var.setText("");
        g2Var.d.b(false);
        g2Var.b(false, hashSet2, new a2(this, 4), this.g0);
        c0();
        b0(false, true);
        this.W.setText(z());
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
                v vVar = this.q0;
                if (vVar != null) {
                    vVar.c.b.D(0);
                    d1 d1Var = vVar.a;
                    ArrayList arrayList2 = d1Var.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i11 = eg.e.s;
                        d1Var.e0 = 0;
                    } else {
                        int i12 = eg.e.s;
                        d1Var.e0 = 1;
                    }
                    d1Var.j0 = 0;
                    d1Var.a0(false, true);
                    d1Var.Z(true);
                    d1Var.N();
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
                v vVar2 = this.q0;
                if (vVar2 != null) {
                    x xVar = vVar2.c;
                    xVar.b.D(0);
                    d1 d1Var2 = vVar2.a;
                    boolean z11 = !xVar.isKeyboardVisible();
                    ArrayList arrayList4 = d1Var2.Y;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    d1Var2.a0(z11, true);
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
            v vVar3 = this.q0;
            if (vVar3 != null) {
                vVar3.c.b.D(0);
                d1 d1Var3 = vVar3.a;
                ArrayList arrayList7 = d1Var3.a0;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                d1Var3.a0(false, true);
            }
        }
    }

    public final void X(boolean z10) {
        zk0 zk0Var = this.d;
        if (!z10) {
            zk0Var.u0(0);
            return;
        }
        sh.n nVar = new sh.n(getContext(), 2, 0.6f);
        nVar.a = 1;
        nVar.p = AndroidUtilities.dp(38.0f);
        zk0Var.getLayoutManager().w0(nVar);
    }

    public final void Y() {
        int i10 = this.n0;
        String formatPluralString = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]) : LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) q0.f(), new Object[0]) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        v vVar = this.q0;
        if (vVar != null) {
            new mc(vVar.c.container, vVar.b).Q(R.raw.chats_infotip, 36, formatPluralString).k(true);
        }
    }

    public final void Z(boolean z10) {
        lh.d dVar = this.T;
        dVar.setShowZero(false);
        int i10 = this.n0;
        dVar.g(i10 != 1 ? (i10 == 2 || i10 == 3) ? LocaleController.getString(R.string.Save) : "" : LocaleController.getString(R.string.BoostingSaveRecipients), z10, true);
        HashSet hashSet = this.a0;
        dVar.c(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        dg.h hVar;
        ArrayList arrayList = this.Y;
        arrayList.clear();
        ArrayList arrayList2 = this.Z;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.n0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            dg.g gVar = new dg.g(9, false);
            gVar.i = 1;
            gVar.j = i11;
            gVar.g = string;
            arrayList2.add(gVar);
        }
        dg.g gVar2 = new dg.g(10, false);
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
                        dg.g gVar3 = new dg.g(6, true);
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
                    dg.g gVar4 = new dg.g(7, false);
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
            dg.g gVar5 = new dg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.c = null;
            gVar5.e = null;
            gVar5.k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new dg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        dg.g gVar6 = new dg.g(-1, false);
        gVar6.l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.n0 != 3) {
            s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new d2(this, 0));
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
            zk0 zk0Var = this.d;
            if (i10 >= zk0Var.getChildCount()) {
                Z(z10);
                return;
            }
            View childAt = zk0Var.getChildAt(i10);
            if (childAt instanceof gg.o) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.Z;
                    if (R < arrayList.size()) {
                        dg.g gVar = (dg.g) arrayList.get(R);
                        gg.o oVar = (gg.o) childAt;
                        oVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            oVar.i(this.k0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            oVar.i(1.0f, z10);
                        }
                    }
                }
                i10++;
            }
            if (childAt instanceof gg.c) {
                ((gg.c) childAt).c(this.a0.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
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

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        s sVar = this.o0;
        if (sVar != null) {
            sVar.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.r0);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override // org.telegram.ui.Components.qa
    public final yk0 w(zk0 zk0Var) {
        dg.h hVar = new dg.h(getContext(), this.resourcesProvider, true);
        this.k0 = hVar;
        return hVar;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        int i10 = this.n0;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry) : LocaleController.getString(R.string.BoostingAddChannelOrGroup) : LocaleController.getString(R.string.GiftPremium);
    }
}
