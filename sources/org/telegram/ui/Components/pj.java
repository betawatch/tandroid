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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pj extends ci implements NotificationCenter.NotificationCenterDelegate, td.b {
    public final ij A;
    public final lj B;
    public final yy C;
    public final ji D;
    public final gi E;
    public fj F;
    public boolean G;
    public final td.a n;
    public final FrameLayout r;
    public final gh.f1 s;
    public final dj v;
    public final HashMap w;
    public final ArrayList x;
    public boolean y;

    public pj(Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        this.n = new td.a(0, this, gr.h, 380L, false);
        this.w = new HashMap();
        this.x = new ArrayList();
        this.y = false;
        this.B = new lj(this, context);
        ji jiVar = new ji(context, org.telegram.ui.ActionBar.f6.d6, b6Var);
        this.D = jiVar;
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        gi giVar = new gi(context, b6Var, this.b);
        this.E = giVar;
        giVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        fg.g gVar = giVar.r;
        gVar.setHint(string);
        gVar.addTextChangedListener(new bj(this));
        frameLayout.addView(jiVar, g7.e6.g());
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(giVar, d);
        yy yyVar = new yy(context, b6Var);
        this.C = yyVar;
        yyVar.c();
        yyVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(yyVar, g7.e6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        gh.f1 f1Var = new gh.f1(this, context, b6Var, 12);
        this.s = f1Var;
        this.c = f1Var;
        this.d = f1Var;
        this.h = true;
        this.f = true;
        f1Var.p1();
        f1Var.setClipToPadding(false);
        getContext();
        dj djVar = new dj(this, AndroidUtilities.dp(9.0f), f1Var, 0);
        this.v = djVar;
        f1Var.setLayoutManager(djVar);
        djVar.P = false;
        f1Var.setHorizontalScrollBarEnabled(false);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.setClipToPadding(false);
        addView(f1Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ij ijVar = new ij(this, context);
        this.A = ijVar;
        f1Var.setAdapter(ijVar);
        f1Var.setGlowColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A5, this.a));
        f1Var.setOnItemClickListener(new bg.b1(12, this, b6Var));
        f1Var.setOnScrollListener(new bg.o2(this, 25));
        f1Var.setOnItemLongClickListener(new zi(this));
        FrameLayout.LayoutParams e10 = g7.e6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e10);
        NotificationCenter.getInstance(this.b.F1).addObserver(this, NotificationCenter.contactsDidLoad);
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        gh.f1 f1Var = this.s;
        if (f1Var.getChildCount() == 0) {
            return -1000;
        }
        int i9 = 0;
        View childAt = f1Var.getChildAt(0);
        ik0 ik0Var = (ik0) f1Var.G(childAt);
        if (ik0Var == null) {
            return -1000;
        }
        int paddingTop = f1Var.getPaddingTop();
        if (ik0Var.b() == 0 && childAt.getTop() >= 0) {
            i9 = childAt.getTop();
        }
        return paddingTop - i9;
    }

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        this.s.x0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean H(final int i9, final boolean z10, int i10, final boolean z11, final long j10) {
        HashMap hashMap = this.w;
        int i11 = 0;
        if ((hashMap.size() == 0 && this.F == null) || this.y) {
            return false;
        }
        this.y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.x;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(L(hashMap.get((ej) obj)));
        }
        ki kiVar = this.b;
        return y4.b0(kiVar.F1, kiVar.n1(), kiVar.j1() + arrayList.size(), new Utilities.Callback() { // from class: org.telegram.ui.Components.aj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj2) {
                pj pjVar = pj.this;
                fj fjVar = pjVar.F;
                ki kiVar2 = pjVar.b;
                String obj3 = kiVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                fjVar.c(arrayList, obj3, z10, i9, j10, z11);
                kiVar2.dismiss();
            }
        }, 0L);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            ji jiVar = this.D;
            jiVar.setAlpha(f10);
            jiVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final void K(oj ojVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.w;
        if (hashMap.isEmpty() && !this.G) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = formatString;
            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
            return;
        }
        ej a2 = ej.a(obj);
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
        dp dpVar = ojVar.d;
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, true);
        this.b.V1(z10 ? 1 : 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_userContact_old2 L(Object obj) {
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
            arrayList = AndroidUtilities.loadVCardFromStream(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.b.F1, true, arrayList3, formatName);
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
            for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList3.get(i9);
                if (vcardItem2.type == 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList4.size()) {
                            arrayList4.add(vcardItem2);
                            break;
                        }
                        if (((AndroidUtilities.VcardItem) arrayList4.get(i10)).getValue(false).equals(vcardItem2.getValue(false))) {
                            vcardItem2.checked = false;
                            break;
                        }
                        i10++;
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
                            for (int i11 = 0; i11 < vcardItem3.vcardData.size(); i11++) {
                                sb2.insert(lastIndexOf, vcardItem3.vcardData.get(i11) + "\n");
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

    public final void M() {
        this.C.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        N();
    }

    public final void N() {
        View childAt;
        yy yyVar = this.C;
        if (yyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            yyVar.setTranslationY((childAt.getTop() + (yyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ij ijVar;
        if (i9 != NotificationCenter.contactsDidLoad || (ijVar = this.A) == null) {
            return;
        }
        ijVar.l();
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        gh.f1 f1Var = this.s;
        if (f1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = f1Var.getChildAt(0);
        ik0 ik0Var = (ik0) f1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i9 = (top <= 0 || ik0Var == null || ik0Var.b() != 0) ? 0 : top;
        td.a aVar = this.n;
        if (top < 0 || ik0Var == null || ik0Var.b() != 0) {
            aVar.a(true, true);
            top = i9;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.x;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            arrayList.add(L(hashMap.get((ej) obj)));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ci
    public int getSelectedItemsCount() {
        return this.w.size();
    }

    @Override // org.telegram.ui.Components.ci
    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        s6 s6Var = new s6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.C, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.C, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.h6));
        int i9 = org.telegram.ui.ActionBar.f6.A5;
        gh.f1 f1Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        int i10 = org.telegram.ui.ActionBar.f6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{oj.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{oj.class}, new String[]{"statusTextView"}, null, null, -1, s6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{oj.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ci
    public final void m() {
        NotificationCenter.getInstance(this.b.F1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        N();
    }

    public void setDelegate(fj fjVar) {
        this.F = fjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.G = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ig.a aVar) {
        gi giVar = this.E;
        if (giVar != null) {
            giVar.setupBlurredBackground(aVar.c(giVar, mg.c.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void y(int i9, int i10) {
        int i11;
        ki kiVar = this.b;
        if (kiVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            i11 = AndroidUtilities.dp(8.0f);
            kiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    kiVar.setAllowNestedScroll(true);
                }
            }
            i11 = (i10 / 5) * 2;
            kiVar.setAllowNestedScroll(true);
        }
        this.s.o1(0, i11 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
