package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xj extends li implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate, oe.d {
    public final rj E;
    public final tj F;
    public final uz G;
    public final si H;
    public final pi I;
    public oj J;
    public boolean K;
    public final oe.b n;
    public final FrameLayout r;
    public final bi.r1 s;
    public final jg.e0 v;
    public final HashMap w;
    public final ArrayList x;
    public boolean y;

    public xj(Context context, org.telegram.ui.ActionBar.u6 u6Var, ti tiVar) {
        super(context, u6Var, tiVar);
        this.n = new oe.b(0, this, ds.h, 380L, false);
        this.w = new HashMap();
        this.x = new ArrayList();
        this.y = false;
        this.F = new tj(this, context);
        si siVar = new si(context, org.telegram.ui.ActionBar.y6.d6, u6Var);
        this.H = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        pi piVar = new pi(context, u6Var, this.b);
        this.I = piVar;
        piVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        fi.c2 c2Var = piVar.r;
        c2Var.setHint(string);
        c2Var.addTextChangedListener(new lj(this));
        frameLayout.addView(siVar, gb1.k());
        FrameLayout.LayoutParams h = gb1.h(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) h).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(piVar, h);
        uz uzVar = new uz(context, u6Var);
        this.G = uzVar;
        uzVar.c();
        uzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(uzVar, gb1.h(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.r1 r1Var = new bi.r1(this, context, u6Var, 13);
        this.s = r1Var;
        setBlur3Capture(r1Var);
        this.d = r1Var;
        this.h = true;
        this.f = true;
        r1Var.u1();
        r1Var.setClipToPadding(false);
        getContext();
        jg.e0 e0Var = new jg.e0(this, AndroidUtilities.dp(9.0f), r1Var, 1);
        this.v = e0Var;
        r1Var.setLayoutManager(e0Var);
        e0Var.P = false;
        r1Var.setHorizontalScrollBarEnabled(false);
        r1Var.setVerticalScrollBarEnabled(false);
        r1Var.setClipToPadding(false);
        addView(r1Var, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        rj rjVar = new rj(this, context);
        this.E = rjVar;
        r1Var.setAdapter(rjVar);
        org.telegram.ui.ActionBar.f7.m(r1Var, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        r1Var.setOnItemClickListener(new di.x4(10, this, u6Var));
        r1Var.setOnScrollListener(new ai.b(this, 27));
        r1Var.setOnItemLongClickListener(new jj(this));
        FrameLayout.LayoutParams i10 = gb1.i(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) i10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, i10);
        NotificationCenter.getInstance(this.b.M1).addObserver(this, NotificationCenter.contactsDidLoad);
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        bi.r1 r1Var = this.s;
        if (r1Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = r1Var.getChildAt(0);
        vl0 vl0Var = (vl0) r1Var.G(childAt);
        if (vl0Var == null) {
            return -1000;
        }
        int paddingTop = r1Var.getPaddingTop();
        if (vl0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.li
    public final void B(int i10, int i11) {
        int i12;
        ti tiVar = this.b;
        if (tiVar.u1.Q() > AndroidUtilities.dp(20.0f)) {
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
        this.s.t1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            si siVar = this.H;
            siVar.setAlpha(f7);
            siVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void G(li liVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.s.y0(0);
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
        return g5.a0(tiVar.M1, tiVar.s1(), tiVar.o1() + arrayList.size(), new Utilities.Callback() { // from class: org.telegram.ui.Components.kj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj2) {
                xj xjVar = xj.this;
                oj ojVar = xjVar.J;
                ti tiVar2 = xjVar.b;
                String obj3 = tiVar2.r1().getText().toString();
                ((Long) obj2).getClass();
                ojVar.b(arrayList, obj3, z10, i10, j10, z11);
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
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = formatString;
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
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
        zp zpVar = wjVar.d;
        if (zpVar.getVisibility() != 0) {
            zpVar.setVisibility(0);
        }
        zpVar.a(z10, true);
        this.b.c2(z10 ? 1 : 2);
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
        uz uzVar = this.G;
        if (uzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            uzVar.setTranslationY((childAt.getTop() + (uzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
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
        bi.r1 r1Var = this.s;
        if (r1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = r1Var.getChildAt(0);
        vl0 vl0Var = (vl0) r1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || vl0Var == null || vl0Var.b() != 0) ? 0 : top;
        oe.b bVar = this.n;
        if (top < 0 || vl0Var == null || vl0Var.b() != 0) {
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
    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.G, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.G, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        int i10 = org.telegram.ui.ActionBar.y6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.s, 0, new Class[]{wj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
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

    public void setupBlurredSearchField(ch.b bVar) {
        pi piVar = this.I;
        if (piVar != null) {
            piVar.setupBlurredBackground(bVar.c(piVar, gh.c.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            pi piVar = this.I;
            if (piVar != null) {
                piVar.updateColors();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
