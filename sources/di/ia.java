package di;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.e51;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class ia extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int d0 = 0;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final ArrayList J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public HashMap P;
    public int Q;
    public final Paint R;
    public ArrayList S;
    public j9 T;
    public Utilities.Callback U;
    public p9 V;
    public Utilities.Callback W;
    public la X;
    public final boolean Y;
    public boolean Z;
    public boolean a0;
    public i1 b;
    public BitmapDrawable b0;
    public TLRPC.InputPeer c;
    public ka c0;
    public final ArrayList d;
    public final HashMap e;
    public int f;
    public final ArrayList h;
    public final ArrayList n;
    public final HashMap r;
    public int s;
    public final HashSet v;
    public boolean w;
    public boolean x;
    public boolean y;

    public ia(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        char c10 = 0;
        this.f = 0;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.r = hashMap2;
        this.s = 0;
        this.v = new HashSet();
        this.w = true;
        this.x = true;
        this.y = false;
        this.E = true;
        this.F = true;
        this.G = false;
        this.H = 0;
        this.I = 1;
        this.J = new ArrayList();
        this.M = 1;
        this.N = 4;
        this.P = new HashMap();
        this.Q = 86400;
        this.R = new Paint(1);
        this.Y = true;
        this.Z = false;
        this.Q = i10;
        String string = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_contacts", null);
        if (string != null) {
            String[] split = string.split(",");
            arrayList3.clear();
            for (String str : split) {
                try {
                    arrayList3.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        String string2 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i11 = 0;
            while (i11 < split2.length) {
                String[] split3 = split2[i11].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c10]);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i12 = 1; i12 < split3.length; i12++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i12])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i11++;
                    c10 = 0;
                }
                i11++;
                c10 = 0;
            }
        }
        String string3 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] split4 = string3.split(",");
            arrayList.clear();
            for (String str2 : split4) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (String str3 : split5) {
                String[] split6 = str3.split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (int i13 = 1; i13 < split6.length; i13++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[i13])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] split7 = string5.split(",");
            arrayList2.clear();
            for (String str4 : split7) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(str4)));
                } catch (Exception unused5) {
                }
            }
        }
        this.s = l1(arrayList3, hashMap2).size();
        this.f = l1(arrayList, hashMap).size();
        this.x = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", false);
        this.y = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", true);
        j1(context);
        this.b.setAdapter(new b9(this, context, 0));
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new b7(9, this, messagesStorage));
        MessagesController.getInstance(this.currentAccount).getStoriesController().P();
        MessagesController.getInstance(this.currentAccount).getStoriesController().R();
    }

    public static ArrayList J0(ia iaVar) {
        ArrayList h12 = iaVar.h1();
        int i10 = 0;
        while (i10 < h12.size()) {
            TLObject tLObject = (TLObject) h12.get(i10);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                h12.remove(i10);
                i10--;
            }
            i10++;
        }
        return h12;
    }

    public static ArrayList Y0(ia iaVar) {
        TLRPC.Chat chat;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(iaVar.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (messagesController.canAddToForward(dialog)) {
                if (DialogObject.isUserDialog(dialog.id)) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(dialog.id));
                    if (user != null && !user.bot && user.id != 777000 && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else if (DialogObject.isChatDialog(dialog.id) && (chat = messagesController.getChat(Long.valueOf(-dialog.id))) != null && !ChatObject.isForum(chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList Z0(ia iaVar, boolean z10, boolean z11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(iaVar.currentAccount);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(iaVar.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!iaVar.a0) {
                ContactsController.getInstance(iaVar.currentAccount).loadContacts(false, 0L);
            }
            iaVar.a0 = true;
        }
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (DialogObject.isUserDialog(dialog.id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.id));
                if (user2 != null && !user2.bot && user2.id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z10 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.id)) != null))) {
                    hashMap.put(Long.valueOf(user2.id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z11 && DialogObject.isChatDialog(dialog.id) && (chat = messagesController.getChat(Long.valueOf(-dialog.id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                hashMap.put(Long.valueOf(-chat.id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<Long, TLRPC.TL_contact>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Long key = it.next().getKey();
                key.getClass();
                if (!hashMap.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    hashMap.put(Long.valueOf(user.id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public static int d1(ia iaVar, TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(iaVar.currentAccount).getChatFull(chat.id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = iaVar.P;
        return (hashMap == null || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public static HashSet l1(ArrayList arrayList, HashMap hashMap) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                hashSet.addAll((ArrayList) it.next());
            }
        }
        return hashSet;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ba) {
            return ((ba) currentView).S;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i1 i1Var = this.b;
        if (i1Var == null) {
            return;
        }
        int i12 = 0;
        if (i10 == NotificationCenter.contactsDidLoad) {
            View[] viewPages = i1Var.getViewPages();
            View view = viewPages[0];
            if (view instanceof ba) {
                ((ba) view).g(true);
            }
            View view2 = viewPages[1];
            if (view2 instanceof ba) {
                ((ba) view2).g(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.storiesBlocklistUpdate) {
            if (i10 == NotificationCenter.storiesSendAsUpdate) {
                View[] viewPages2 = i1Var.getViewPages();
                while (i12 < viewPages2.length) {
                    View view3 = viewPages2[i12];
                    if (view3 instanceof ba) {
                        ba baVar = (ba) view3;
                        if (baVar.a == 0) {
                            baVar.g(true);
                        }
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        View[] viewPages3 = i1Var.getViewPages();
        while (i12 < viewPages3.length) {
            View view4 = viewPages3[i12];
            if (view4 instanceof ba) {
                ba baVar2 = (ba) view4;
                int i13 = baVar2.a;
                if (i13 == 6) {
                    baVar2.a(true);
                } else if (i13 == 0) {
                    baVar2.g(true);
                }
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        ga gaVar;
        Utilities.Callback callback = this.U;
        ArrayList arrayList = this.h;
        HashMap hashMap = this.e;
        ArrayList arrayList2 = this.d;
        HashMap hashMap2 = this.r;
        ArrayList arrayList3 = this.n;
        if (callback != null) {
            int i10 = this.N;
            if (i10 == 3) {
                gaVar = new ga(this.N, this.currentAccount, new ArrayList(l1(arrayList3, hashMap2)));
                ArrayList arrayList4 = gaVar.c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = gaVar.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i10 == 4) {
                gaVar = new ga(this.N, this.currentAccount, new ArrayList(l1(arrayList2, hashMap)));
                ArrayList arrayList5 = gaVar.c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = gaVar.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else {
                gaVar = i10 == 2 ? new ga(i10, this.currentAccount, arrayList) : new ga(i10, this.currentAccount, (ArrayList) null);
            }
            this.U.run(gaVar);
            this.U = null;
        }
        org.telegram.ui.Components.qc.h(this.container);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (sb3.length() > 0) {
                sb3.append(";");
            }
            sb3.append(entry2.getKey());
            sb3.append(",");
            sb3.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.x).putBoolean("story_keep", this.y).apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
        super.dismissInternal();
    }

    public final void e1(boolean z10) {
        this.E = z10;
        i1 i1Var = this.b;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof ba) {
                    ((ba) view).e(false);
                }
            }
        }
    }

    public final void f1() {
        t9 t9Var;
        for (View view : this.b.getViewPages()) {
            if ((view instanceof ba) && (t9Var = ((ba) view).x) != null) {
                AndroidUtilities.hideKeyboard(t9Var.a);
            }
        }
    }

    public final void g1(ga gaVar, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.S != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i10 = 0; i10 < this.S.size(); i10++) {
                String str = (String) this.S.get(i10);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !gaVar.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.isEmpty() || z10) {
            View view = this.b.getViewPages()[0];
            d dVar = view instanceof ba ? ((ba) view).v : null;
            if (dVar != null) {
                dVar.setLoading(true);
            }
            j9 j9Var = this.T;
            if (j9Var != null) {
                j9Var.e(gaVar, this.w, this.x, this.y, this.G, this.c, this.H, new b7(11, dVar, runnable), new bi.oa(dVar, 27));
                return;
            } else {
                runnable.run();
                return;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i11 = 0; i11 < Math.min(2, arrayList.size()); i11++) {
            if (i11 > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i11)));
            spannableString.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StoryRestrictions);
        alertDialog$Builder.a.T = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder);
        alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new androidx.car.app.utils.a(this, gaVar, runnable, 6));
        i2.g.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public final ArrayList h1() {
        TLRPC.User user;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(this.currentAccount).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(this.currentAccount).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i10);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final bi.u8 i1() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public final void j1(Context context) {
        org.telegram.ui.Components.qc.a(this.container, new c9(0));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        this.R.setColor(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        this.containerView = new i9(this, context);
        i1 i1Var = new i1(this, context, 1);
        this.b = i1Var;
        int i11 = this.backgroundPaddingLeft;
        i1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.b, w7.x5.e(-1, -1, 119));
    }

    public final void k1(boolean z10) {
        this.Z = z10;
        i1 i1Var = this.b;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof ba) {
                    ba baVar = (ba) view;
                    baVar.g(false);
                    baVar.e(false);
                }
            }
        }
    }

    public final void m1(int i10) {
        this.I = i10;
        i1 i1Var = this.b;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof ba) {
                    ((ba) view).e(false);
                }
            }
        }
    }

    public final void n1(Bitmap bitmap) {
        this.b0 = bitmap == null ? null : new BitmapDrawable(bitmap);
        i1 i1Var = this.b;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof ba) {
                    ba baVar = (ba) view;
                    baVar.g(false);
                    baVar.e(false);
                }
            }
        }
    }

    public final void o1() {
        this.K = true;
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof ba) {
            ba baVar = (ba) view;
            baVar.b(baVar.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof ba) {
            ba baVar2 = (ba) view2;
            baVar2.b(baVar2.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (this.b.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        f1();
        this.b.D(r0.getCurrentPosition() - 1);
    }

    public final void p1(TLRPC.InputPeer inputPeer) {
        this.c = inputPeer;
        this.v.clear();
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof ba) {
            ba baVar = (ba) view;
            baVar.b(baVar.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof ba) {
            ba baVar2 = (ba) view2;
            baVar2.b(baVar2.a);
        }
    }

    public final void q1(ga gaVar) {
        if (gaVar == null) {
            return;
        }
        HashMap hashMap = gaVar.d;
        int i10 = gaVar.a;
        ArrayList arrayList = gaVar.c;
        this.N = i10;
        if (i10 == 2) {
            ArrayList arrayList2 = this.h;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        } else if (i10 == 3) {
            ArrayList arrayList3 = this.n;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            HashMap hashMap2 = this.r;
            hashMap2.clear();
            hashMap2.putAll(hashMap);
            this.s = l1(arrayList3, hashMap2).size();
        } else if (i10 == 4) {
            ArrayList arrayList4 = this.d;
            arrayList4.clear();
            arrayList4.addAll(arrayList);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            hashMap3.putAll(hashMap);
            this.f = l1(arrayList4, hashMap3).size();
        }
        if (i10 == 5) {
            this.O = true;
            this.M = 5;
            ArrayList arrayList5 = this.J;
            arrayList5.clear();
            arrayList5.addAll(gaVar.f);
            this.b.setPosition(1);
        }
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof ba) {
            ba baVar = (ba) view;
            baVar.b(baVar.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof ba) {
            ba baVar2 = (ba) view2;
            baVar2.b(baVar2.a);
        }
    }

    public ia(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = 0;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 0;
        this.v = new HashSet();
        this.w = true;
        this.x = true;
        this.y = false;
        this.E = true;
        this.F = true;
        this.G = false;
        this.H = 0;
        this.I = 1;
        this.J = new ArrayList();
        this.M = 1;
        this.N = 4;
        this.P = new HashMap();
        this.Q = 86400;
        this.R = new Paint(1);
        this.Y = true;
        this.Z = false;
        j1(context);
        this.b.setAdapter(new b9(this, context, 1));
    }
}
