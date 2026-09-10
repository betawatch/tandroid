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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bk extends qi implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final vj E;
    public final xj F;
    public final tz G;
    public final xi H;
    public final ui I;
    public sj J;
    public boolean K;
    public final le.b n;
    public final FrameLayout r;
    public final bi.y1 s;
    public final gg.j0 v;
    public final HashMap w;
    public final ArrayList x;
    public boolean y;

    public bk(Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(context, f6Var, yiVar);
        this.n = new le.b(0, this, wr.h, 380L, false);
        this.w = new HashMap();
        this.x = new ArrayList();
        this.y = false;
        this.F = new xj(this, context);
        xi xiVar = new xi(context, org.telegram.ui.ActionBar.j6.d6, f6Var);
        this.H = xiVar;
        xiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ui uiVar = new ui(context, f6Var, this.b);
        this.I = uiVar;
        uiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        bi.t2 t2Var = uiVar.r;
        t2Var.setHint(string);
        t2Var.addTextChangedListener(new pj(this));
        frameLayout.addView(xiVar, w7.a6.g());
        FrameLayout.LayoutParams d = w7.a6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(uiVar, d);
        tz tzVar = new tz(context, f6Var);
        this.G = tzVar;
        tzVar.c();
        tzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(tzVar, w7.a6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.y1 y1Var = new bi.y1(this, context, f6Var, 11);
        this.s = y1Var;
        this.c = y1Var;
        this.d = y1Var;
        this.h = true;
        this.f = true;
        y1Var.o1();
        y1Var.setClipToPadding(false);
        getContext();
        gg.j0 j0Var = new gg.j0(this, AndroidUtilities.dp(9.0f), y1Var, 1);
        this.v = j0Var;
        y1Var.setLayoutManager(j0Var);
        j0Var.P = false;
        y1Var.setHorizontalScrollBarEnabled(false);
        y1Var.setVerticalScrollBarEnabled(false);
        y1Var.setClipToPadding(false);
        addView(y1Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        vj vjVar = new vj(this, context);
        this.E = vjVar;
        y1Var.setAdapter(vjVar);
        y1Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, this.a));
        y1Var.setOnItemClickListener(new ai.b0(9, this, f6Var));
        y1Var.setOnScrollListener(new bi.a2(this, 16));
        y1Var.setOnItemLongClickListener(new nj(this));
        FrameLayout.LayoutParams e = w7.a6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.b.J1).addObserver(this, NotificationCenter.contactsDidLoad);
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        bi.y1 y1Var = this.s;
        if (y1Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = y1Var.getChildAt(0);
        fl0 fl0Var = (fl0) y1Var.G(childAt);
        if (fl0Var == null) {
            return -1000;
        }
        int paddingTop = y1Var.getPaddingTop();
        if (fl0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.qi
    public final void D(qi qiVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.qi
    public final void F() {
        this.s.x0(0);
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            xi xiVar = this.H;
            xiVar.setAlpha(f7);
            xiVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
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
            arrayList.add(M(hashMap.get((rj) obj)));
        }
        yi yiVar = this.b;
        return d5.b0(yiVar.J1, yiVar.n1(), yiVar.j1() + arrayList.size(), new Utilities.Callback() { // from class: org.telegram.ui.Components.oj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj2) {
                bk bkVar = bk.this;
                sj sjVar = bkVar.J;
                yi yiVar2 = bkVar.b;
                String obj3 = yiVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                sjVar.b(arrayList, obj3, z10, i10, j3, z11);
                yiVar2.dismiss();
            }
        }, 0L);
    }

    public final void L(ak akVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.R = string;
            d2Var.T = formatString;
            hc.b.A(R.string.OK, alertDialog$Builder, null);
            return;
        }
        rj a2 = rj.a(obj);
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
        tp tpVar = akVar.d;
        if (tpVar.getVisibility() != 0) {
            tpVar.setVisibility(0);
        }
        tpVar.a(z10, true);
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
    public final TLRPC.TL_userContact_old2 M(Object obj) {
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
            arrayList = AndroidUtilities.loadVCardFromStream(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.b.J1, true, arrayList3, formatName);
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

    public final void N() {
        this.G.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        O();
    }

    public final void O() {
        View childAt;
        tz tzVar = this.G;
        if (tzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            tzVar.setTranslationY((childAt.getTop() + (tzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        vj vjVar;
        if (i10 != NotificationCenter.contactsDidLoad || (vjVar = this.E) == null) {
            return;
        }
        vjVar.l();
    }

    @Override // org.telegram.ui.Components.qi
    public int getCurrentItemTop() {
        bi.y1 y1Var = this.s;
        if (y1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = y1Var.getChildAt(0);
        fl0 fl0Var = (fl0) y1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || fl0Var == null || fl0Var.b() != 0) ? 0 : top;
        le.b bVar = this.n;
        if (top < 0 || fl0Var == null || fl0Var.b() != 0) {
            bVar.a(true, true);
            top = i10;
        } else {
            bVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.qi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.qi
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
            arrayList.add(M(hashMap.get((rj) obj)));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.qi
    public int getSelectedItemsCount() {
        return this.w.size();
    }

    @Override // org.telegram.ui.Components.qi
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        x6 x6Var = new x6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        bi.y1 y1Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        int i11 = org.telegram.ui.ActionBar.j6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{ak.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{ak.class}, new String[]{"statusTextView"}, null, null, -1, x6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{ak.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.qi
    public final void m() {
        NotificationCenter.getInstance(this.b.J1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        O();
    }

    public void setDelegate(sj sjVar) {
        this.J = sjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(zg.a aVar) {
        ui uiVar = this.I;
        if (uiVar != null) {
            uiVar.setupBlurredBackground(aVar.c(uiVar, dh.c.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.qi
    public final void y(int i10, int i11) {
        int i12;
        yi yiVar = this.b;
        if (yiVar.r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            yiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    yiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            yiVar.setAllowNestedScroll(true);
        }
        this.s.n1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
