package gg;

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
import dg.d3;
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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f2 extends sa {
    public final ph.d U;
    public final d2 V;
    public final t3 W;
    public final kg.d X;
    public final Paint Y;
    public final ArrayList Z;
    public final ArrayList a0;
    public final HashSet b0;
    public final HashSet c0;
    public final ArrayList d0;
    public final ArrayList e0;
    public final HashMap f0;
    public final ArrayList g0;
    public final ArrayList h0;
    public final LinkedHashMap i0;
    public final z5 j0;
    public String k0;
    public hg.h l0;
    public int m0;
    public final TLRPC.Chat n0;
    public int o0;
    public s p0;
    public int q0;
    public v r0;
    public final androidx.activity.i s0;

    public f2(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(p2Var, false);
        this.Y = new Paint(1);
        this.Z = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.a0 = arrayList;
        this.b0 = new HashSet();
        this.c0 = new HashSet();
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.f0 = new HashMap();
        this.g0 = new ArrayList();
        this.h0 = new ArrayList();
        this.i0 = new LinkedHashMap();
        this.m0 = AndroidUtilities.dp(134.0f);
        this.s0 = new androidx.activity.i(this, 21);
        this.backgroundPaddingLeft = 0;
        this.n0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        mr mrVar = mr.h;
        this.j0 = new z5(viewGroup, 0L, 350L, mrVar);
        kg.d dVar = new kg.d(getContext(), this.resourcesProvider);
        this.X = dVar;
        dVar.setOnCloseClickListener(new x1(this, 7));
        dVar.setText(y());
        dVar.setCloseImageVisible(true);
        dVar.e.c(0.0f, false);
        d2 d2Var = new d2(this, getContext(), this.resourcesProvider);
        this.V = d2Var;
        int i10 = j6.h5;
        d2Var.setBackgroundColor(getThemedColor(i10));
        d2Var.setOnSearchTextChange(new b2(this, 0));
        this.W = new t3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(dVar, b6.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(d2Var, b6.f(-2.0f, 55, i12, 0, i12, 0));
        kg.a aVar = new kg.a(getContext(), this.resourcesProvider, (rl0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(j6.v0(i10, this.resourcesProvider));
        ph.d dVar2 = new ph.d(getContext(), this.resourcesProvider, true);
        this.U = dVar2;
        dVar2.setOnClickListener(new a2(this, 1));
        aVar.addView(dVar2, b6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, b6.f(-2.0f, 87, i13, 0, i13, 0));
        hg.h hVar = this.l0;
        rl0 rl0Var = this.d;
        hVar.h = arrayList;
        hVar.f = rl0Var;
        int i14 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new eg.f2(this, 1));
        this.d.setOnItemClickListener(new f(this, 2));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(mrVar);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new e2(this, 0));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static /* synthetic */ void P(f2 f2Var, boolean z4, Pair pair) {
        HashMap hashMap = f2Var.f0;
        if (z4) {
            hashMap.putAll((Map) pair.first);
            f2Var.g0.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new z1(f2Var, 0));
        }
        if (f2Var.o0 == 3) {
            f2Var.b0(true, true);
            f2Var.X(true);
        }
    }

    public static void Q(f2 f2Var, View view) {
        LinkedHashMap linkedHashMap = f2Var.i0;
        d2 d2Var = f2Var.V;
        HashSet hashSet = f2Var.b0;
        if (view instanceof n8) {
            linkedHashMap.clear();
            f2Var.W(true);
        } else if (view instanceof kg.n) {
            kg.n nVar = (kg.n) view;
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
            if ((hashSet.size() == 11 && f2Var.o0 == 1) || (hashSet.size() == p0.f() + 1 && f2Var.o0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                f2Var.Y();
                return;
            }
            d2Var.b(true, hashSet, new x1(f2Var, 1), null);
            f2Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = f2Var.n.getContext();
                f6 f6Var = f2Var.resourcesProvider;
                y1 y1Var = new y1(f2Var, j10, 0);
                x1 x1Var = new x1(f2Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                alertDialog$Builder.a.O = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup);
                alertDialog$Builder.a.Q = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new c1.b(12, atomicBoolean, x1Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new f0.d(9));
                alertDialog$Builder.j(new g(0, atomicBoolean, y1Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                f2Var.R();
            }
        }
        if (view instanceof kg.c) {
            long hashCode = ((kg.c) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && f2Var.o0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                f2Var.Y();
                return;
            }
            d2Var.b(true, hashSet, new x1(f2Var, 3), f2Var.h0);
            if (TextUtils.isEmpty(f2Var.k0)) {
                f2Var.b0(true, false);
                return;
            }
            f2Var.k0 = null;
            d2Var.setText("");
            f2Var.b0(false, false);
            f2Var.b0(true, true);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!e2.c.s(tL_help_country)) {
            return false;
        }
        String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || y3.w(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || y3.w(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.Components.sa
    public final void C(Canvas canvas, int i10) {
        this.q0 = i10;
        float f10 = AndroidUtilities.statusBarHeight;
        kg.d dVar = this.X;
        dVar.setTranslationY(Math.max(i10, (((dVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f10));
        float translationY = dVar.getTranslationY() + dVar.getMeasuredHeight();
        this.V.setTranslationY(translationY);
        this.d.setTranslationY((r2.getMeasuredHeight() + dVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int v02 = j6.v0(j6.h5, this.resourcesProvider);
        Paint paint = this.Y;
        paint.setColor(v02);
        int max = Math.max(0, i10);
        boolean z4 = max < AndroidUtilities.statusBarHeight;
        z5 z5Var = this.j0;
        int lerp = AndroidUtilities.lerp(max, 0, z5Var.e(z4));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - z5Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void R() {
        if (TextUtils.isEmpty(this.k0)) {
            return;
        }
        this.k0 = null;
        this.V.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.s0);
        ArrayList arrayList = this.d0;
        arrayList.clear();
        arrayList.addAll(p0.e(this.n0.id));
        b0(false, false);
        b0(true, true);
    }

    public final boolean S() {
        HashSet hashSet = this.b0;
        int size = hashSet.size();
        HashSet hashSet2 = this.c0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.o0;
        Context context = getContext();
        f6 f6Var = this.resourcesProvider;
        x1 x1Var = new x1(this, 0);
        x1 x1Var2 = new x1(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.O = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        alertDialog$Builder.a.Q = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries) : LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels) : LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new f(x1Var, 1));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new a1.c(x1Var2, 28));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z4) {
        TLRPC.Chat chat = this.n0;
        if (i10 == 1) {
            long j10 = chat.id;
            c2 c2Var = new c2(this, z4, 0);
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
            connectionsManager.sendRequest(tL_channels_getParticipants, new d3(1, messagesController, c2Var));
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            c2 c2Var2 = new c2(this, z4, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new ff.a(c2Var2, 2));
            return;
        }
        long j11 = chat.id;
        b2 b2Var = new b2(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new c0(messagesController2, j11, b2Var, 0));
    }

    public final void V(int i10, List list) {
        this.o0 = i10;
        this.k0 = null;
        HashSet hashSet = this.c0;
        hashSet.clear();
        HashSet hashSet2 = this.b0;
        hashSet2.clear();
        ArrayList arrayList = this.d0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.i0;
        linkedHashMap.clear();
        if (i10 == 1) {
            arrayList.addAll(this.e0);
        } else if (i10 == 2) {
            arrayList.addAll(p0.e(this.n0.id));
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
        d2 d2Var = this.V;
        d2Var.setText("");
        d2Var.d.b(false);
        d2Var.b(false, hashSet2, new x1(this, 4), this.h0);
        c0();
        b0(false, true);
        this.X.setText(y());
        Z(false);
        X(false);
    }

    public final void W(boolean z4) {
        HashSet hashSet = this.b0;
        if (hashSet.size() != 0 || z4) {
            int i10 = this.o0;
            LinkedHashMap linkedHashMap = this.i0;
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
                v vVar = this.r0;
                if (vVar != null) {
                    vVar.c.b.D(0);
                    b1 b1Var = vVar.a;
                    ArrayList arrayList2 = b1Var.a0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i11 = ig.e.s;
                        b1Var.f0 = 0;
                    } else {
                        int i12 = ig.e.s;
                        b1Var.f0 = 1;
                    }
                    b1Var.k0 = 0;
                    b1Var.a0(false, true);
                    b1Var.Z(true);
                    b1Var.N();
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
                v vVar2 = this.r0;
                if (vVar2 != null) {
                    x xVar = vVar2.c;
                    xVar.b.D(0);
                    b1 b1Var2 = vVar2.a;
                    boolean z10 = !xVar.isKeyboardVisible();
                    ArrayList arrayList4 = b1Var2.Z;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    b1Var2.a0(z10, true);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.h0;
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
            v vVar3 = this.r0;
            if (vVar3 != null) {
                vVar3.c.b.D(0);
                b1 b1Var3 = vVar3.a;
                ArrayList arrayList7 = b1Var3.b0;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                b1Var3.a0(false, true);
            }
        }
    }

    public final void X(boolean z4) {
        rl0 rl0Var = this.d;
        if (!z4) {
            rl0Var.u0(0);
            return;
        }
        wh.o oVar = new wh.o(getContext(), 2, 0.6f);
        oVar.a = 1;
        oVar.p = AndroidUtilities.dp(38.0f);
        rl0Var.getLayoutManager().w0(oVar);
    }

    public final void Y() {
        int i10 = this.o0;
        String formatPluralString = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]) : LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) p0.f(), new Object[0]) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        v vVar = this.r0;
        if (vVar != null) {
            new qc(vVar.c.container, vVar.b).Q(R.raw.chats_infotip, 36, formatPluralString).k(true);
        }
    }

    public final void Z(boolean z4) {
        ph.d dVar = this.U;
        dVar.setShowZero(false);
        int i10 = this.o0;
        dVar.g(i10 != 1 ? (i10 == 2 || i10 == 3) ? LocaleController.getString(R.string.Save) : "" : LocaleController.getString(R.string.BoostingSaveRecipients), z4, true);
        HashSet hashSet = this.b0;
        dVar.c(hashSet.size(), z4);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void a0(boolean z4, boolean z10) {
        int i10;
        hg.h hVar;
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.a0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.o0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            hg.g gVar = new hg.g(9, false);
            gVar.i = 1;
            gVar.j = i11;
            gVar.g = string;
            arrayList2.add(gVar);
        }
        hg.g gVar2 = new hg.g(10, false);
        t3 t3Var = this.W;
        gVar2.q = t3Var;
        arrayList2.add(gVar2);
        int i12 = this.o0;
        HashSet hashSet = this.b0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.g0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f0.get(str)) {
                    if (TextUtils.isEmpty(this.k0) || U(tL_help_country, AndroidUtilities.translitSafe(this.k0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        hg.g gVar3 = new hg.g(6, true);
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
                    hg.g gVar4 = new hg.g(7, false);
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
        ArrayList arrayList6 = this.d0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            hg.g gVar5 = new hg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.c = null;
            gVar5.e = null;
            gVar5.k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new hg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        hg.g gVar6 = new hg.g(-1, false);
        gVar6.l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.o0 != 3) {
            t3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new a2(this, 0));
        } else if (z4) {
            t3Var.setRightText(null);
        } else {
            s3 s3Var = t3Var.b;
            s3Var.c(null, false, true);
            s3Var.setOnClickListener(null);
            s3Var.setVisibility(0);
        }
        if (!z10 || (hVar = this.l0) == null) {
            return;
        }
        if (z4) {
            hVar.E(arrayList, arrayList2);
        } else {
            hVar.l();
        }
    }

    public final void b0(boolean z4, boolean z10) {
        a0(z4, z10);
        int i10 = 0;
        while (true) {
            rl0 rl0Var = this.d;
            if (i10 >= rl0Var.getChildCount()) {
                Z(z4);
                return;
            }
            View childAt = rl0Var.getChildAt(i10);
            if (childAt instanceof kg.n) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.a0;
                    if (R < arrayList.size()) {
                        hg.g gVar = (hg.g) arrayList.get(R);
                        kg.n nVar = (kg.n) childAt;
                        nVar.c(gVar.k, z4);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            nVar.i(this.l0.F(chat) > 200 ? 0.3f : 1.0f, z4);
                        } else {
                            nVar.i(1.0f, z4);
                        }
                    }
                }
                i10++;
            }
            if (childAt instanceof kg.c) {
                ((kg.c) childAt).c(this.b0.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i10++;
        }
    }

    public final void c0() {
        String formatPluralStringComma;
        int i10 = this.o0;
        t3 t3Var = this.W;
        if (i10 == 1) {
            TLRPC.Chat chat = this.n0;
            formatPluralStringComma = LocaleController.formatPluralStringComma(ChatObject.isChannelAndNotMegaGroup(chat) ? "Subscribers" : "Members", Math.max(0, this.l0.F(chat) - 1));
            t3Var.setLayerHeight(32);
        } else if (i10 == 2) {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) p0.f(), new Object[0]);
            t3Var.setLayerHeight(32);
        } else if (i10 != 3) {
            formatPluralStringComma = "";
        } else {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
            t3Var.setLayerHeight(1);
        }
        t3Var.setText(formatPluralStringComma);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        s sVar = this.p0;
        if (sVar != null) {
            sVar.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.s0);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        hg.h hVar = new hg.h(getContext(), this.resourcesProvider, true);
        this.l0 = hVar;
        return hVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        int i10 = this.o0;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry) : LocaleController.getString(R.string.BoostingAddChannelOrGroup) : LocaleController.getString(R.string.GiftPremium);
    }
}
