package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class xj extends li implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public final rj E;
    public final tj F;
    public final vz G;
    public final si H;
    public final pi I;
    public oj J;
    public boolean K;
    public final ne.b n;
    public final FrameLayout r;
    public final ai.u1 s;
    public final ig.e0 v;
    public final HashMap w;
    public final ArrayList x;
    public boolean y;

    public xj(Context context, org.telegram.ui.ActionBar.d6 d6Var, ti tiVar) {
        super(context, d6Var, tiVar);
        this.n = new ne.b(0, this, bs.h, 380L, false);
        this.w = new HashMap();
        this.x = new ArrayList();
        this.y = false;
        this.F = new tj(this, context);
        si siVar = new si(context, org.telegram.ui.ActionBar.h6.d6, d6Var);
        this.H = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        pi piVar = new pi(context, d6Var, this.b);
        this.I = piVar;
        piVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ei.e2 e2Var = piVar.r;
        e2Var.setHint(string);
        e2Var.addTextChangedListener(new lj(this));
        frameLayout.addView(siVar, w7.z5.g());
        FrameLayout.LayoutParams a2 = w7.z5.a(48.0f, 7.0f, 8.0f, 7.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a2).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(piVar, a2);
        vz vzVar = new vz(context, d6Var);
        this.G = vzVar;
        vzVar.c();
        vzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(vzVar, w7.z5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        ai.u1 u1Var = new ai.u1(this, context, d6Var, 13);
        this.s = u1Var;
        this.c = u1Var;
        this.d = u1Var;
        this.h = true;
        this.f = true;
        u1Var.p1();
        u1Var.setClipToPadding(false);
        getContext();
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(9.0f), u1Var, 1);
        this.v = e0Var;
        u1Var.setLayoutManager(e0Var);
        e0Var.P = false;
        u1Var.setHorizontalScrollBarEnabled(false);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setClipToPadding(false);
        addView(u1Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        rj rjVar = new rj(this, context);
        this.E = rjVar;
        u1Var.setAdapter(rjVar);
        u1Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, this.a));
        u1Var.setOnItemClickListener(new ci.y4(10, this, d6Var));
        u1Var.setOnScrollListener(new ah.d0(this, 23));
        u1Var.setOnItemLongClickListener(new jj(this));
        FrameLayout.LayoutParams e = w7.z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.b.M1).addObserver(this, NotificationCenter.contactsDidLoad);
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        ai.u1 u1Var = this.s;
        if (u1Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = u1Var.getChildAt(0);
        sl0 sl0Var = (sl0) u1Var.G(childAt);
        if (sl0Var == null) {
            return -1000;
        }
        int paddingTop = u1Var.getPaddingTop();
        if (sl0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.li
    public final void B(int i10, int i11) {
        int i12;
        ti tiVar = this.b;
        if (tiVar.u1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            tiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    tiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            tiVar.setAllowNestedScroll(true);
        }
        this.s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.li
    public final void G(li liVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.s.x0(0);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        HashMap hashMap = this.w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.y) {
            return false;
        }
        this.y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(P(hashMap.get((nj) obj)));
        }
        ti tiVar = this.b;
        return f5.a0(tiVar.M1, tiVar.p1(), tiVar.l1() + arrayList.size(), new Utilities.Callback() { // from class: org.telegram.ui.Components.kj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj2) {
                xj xjVar = xj.this;
                oj ojVar = xjVar.J;
                ti tiVar2 = xjVar.b;
                String obj3 = tiVar2.o1().getText().toString();
                ((Long) obj2).getClass();
                ojVar.c(arrayList, obj3, z10, i10, j10, z11);
                tiVar2.dismiss();
            }
        }, 0L);
    }

    public final void O(wj wjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = formatString;
            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        nj a2 = nj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.x;
        if (containsKey) {
            hashMap.remove(a2);
            arrayList.remove(a2);
            z10 = false;
        } else {
            hashMap.put(a2, obj);
            arrayList.add(a2);
            z10 = true;
        }
        xp xpVar = wjVar.d;
        if (xpVar.getVisibility() != 0) {
            xpVar.setVisibility(0);
        }
        xpVar.a(z10, true);
        this.b.Z1(z10 ? 1 : 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_userContact_old2 P(Object obj) {
        String str;
        ContactsController.Contact contact;
        String str2;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.RestrictionReason> arrayList2;
        int lastIndexOf;
        if (obj instanceof ContactsController.Contact) {
            contact = (ContactsController.Contact) obj;
            TLRPC.User user = contact.user;
            if (user != null) {
                str = user.first_name;
                str2 = user.last_name;
            } else {
                str = contact.first_name;
                str2 = contact.last_name;
            }
        } else {
            TLRPC.User user2 = (TLRPC.User) obj;
            ContactsController.Contact contact2 = new ContactsController.Contact();
            str = user2.first_name;
            contact2.first_name = str;
            String str3 = user2.last_name;
            contact2.last_name = str3;
            contact2.phones.add(user2.phone);
            contact2.user = user2;
            contact = contact2;
            str2 = str3;
        }
        String formatName = ContactsController.formatName(str, str2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String str4 = contact.key;
        if (str4 != null) {
            arrayList = AndroidUtilities.loadVCardFromStream(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.b.M1, true, arrayList3, formatName);
        } else {
            AndroidUtilities.VcardItem vcardItem = new AndroidUtilities.VcardItem();
            vcardItem.type = 0;
            ArrayList<String> arrayList6 = vcardItem.vcardData;
            String str5 = "TEL;MOBILE:+" + contact.user.phone;
            vcardItem.fullData = str5;
            arrayList6.add(str5);
            arrayList4.add(vcardItem);
            arrayList = null;
        }
        TLRPC.User user3 = contact.user;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList3.get(i10);
                if (vcardItem2.type == 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList4.size()) {
                            arrayList4.add(vcardItem2);
                            break;
                        }
                        if (((AndroidUtilities.VcardItem) arrayList4.get(i11)).getValue(false).equals(vcardItem2.getValue(false))) {
                            vcardItem2.checked = false;
                            break;
                        }
                        i11++;
                    }
                } else {
                    arrayList5.add(vcardItem2);
                }
            }
            if (!arrayList.isEmpty()) {
                TLRPC.User user4 = arrayList.get(0);
                arrayList2 = user4.restriction_reason;
                if (TextUtils.isEmpty(str)) {
                    str = user4.first_name;
                    str2 = user4.last_name;
                }
                TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                if (user3 == null) {
                    tL_userContact_old2.id = user3.id;
                    tL_userContact_old2.access_hash = user3.access_hash;
                    tL_userContact_old2.photo = user3.photo;
                    tL_userContact_old2.status = user3.status;
                    tL_userContact_old2.first_name = user3.first_name;
                    tL_userContact_old2.last_name = user3.last_name;
                    tL_userContact_old2.phone = user3.phone;
                    if (arrayList2 != null) {
                        tL_userContact_old2.restriction_reason = arrayList2;
                    }
                } else {
                    tL_userContact_old2.first_name = str;
                    tL_userContact_old2.last_name = str2;
                }
                StringBuilder sb2 = tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                lastIndexOf = sb2.lastIndexOf("END:VCARD");
                if (lastIndexOf >= 0) {
                    tL_userContact_old2.phone = null;
                    for (int size = arrayList4.size() - 1; size >= 0; size--) {
                        AndroidUtilities.VcardItem vcardItem3 = (AndroidUtilities.VcardItem) arrayList4.get(size);
                        if (vcardItem3.checked) {
                            if (tL_userContact_old2.phone == null) {
                                tL_userContact_old2.phone = vcardItem3.getValue(false);
                            }
                            for (int i12 = 0; i12 < vcardItem3.vcardData.size(); i12++) {
                                sb2.insert(lastIndexOf, vcardItem3.vcardData.get(i12) + "\n");
                            }
                        }
                    }
                    for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                        AndroidUtilities.VcardItem vcardItem4 = (AndroidUtilities.VcardItem) arrayList5.get(size2);
                        if (vcardItem4.checked) {
                            for (int size3 = vcardItem4.vcardData.size() - 1; size3 >= 0; size3 += -1) {
                                sb2.insert(lastIndexOf, vcardItem4.vcardData.get(size3) + "\n");
                            }
                        }
                    }
                    tL_userContact_old2.restriction_reason.clear();
                    TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                    restrictionReason.text = sb2.toString();
                    restrictionReason.reason = "";
                    restrictionReason.platform = "";
                    tL_userContact_old2.restriction_reason.add(restrictionReason);
                }
                return tL_userContact_old2;
            }
        }
        arrayList2 = null;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        if (user3 == null) {
        }
        if (tL_userContact_old22.restriction_reason.isEmpty()) {
        }
        lastIndexOf = sb2.lastIndexOf("END:VCARD");
        if (lastIndexOf >= 0) {
        }
        return tL_userContact_old22;
    }

    public final void Q() {
        this.G.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        R();
    }

    public final void R() {
        View childAt;
        vz vzVar = this.G;
        if (vzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            vzVar.setTranslationY((childAt.getTop() + (vzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        rj rjVar;
        if (i10 != NotificationCenter.contactsDidLoad || (rjVar = this.E) == null) {
            return;
        }
        rjVar.l();
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        ai.u1 u1Var = this.s;
        if (u1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = u1Var.getChildAt(0);
        sl0 sl0Var = (sl0) u1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || sl0Var == null || sl0Var.b() != 0) ? 0 : top;
        ne.b bVar = this.n;
        if (top < 0 || sl0Var == null || sl0Var.b() != 0) {
            bVar.a(true, true);
            top = i10;
        } else {
            bVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(P(hashMap.get((nj) obj)));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.li
    public int getSelectedItemsCount() {
        return this.w.size();
    }

    @Override // org.telegram.ui.Components.li
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        z6 z6Var = new z6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.h6));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ai.u1 u1Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        int i11 = org.telegram.ui.ActionBar.h6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{wj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{wj.class}, new String[]{"statusTextView"}, null, null, -1, z6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{wj.class}, null, org.telegram.ui.ActionBar.h6.r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.li
    public final void o() {
        NotificationCenter.getInstance(this.b.M1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setDelegate(oj ojVar) {
        this.J = ojVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(bh.b bVar) {
        pi piVar = this.I;
        if (piVar != null) {
            piVar.setupBlurredBackground(bVar.c(piVar, fh.c.a(this.a), false));
        }
    }

    @Override // ne.d
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            si siVar = this.H;
            siVar.setAlpha(f7);
            siVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // ne.d
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
