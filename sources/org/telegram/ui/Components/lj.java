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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lj extends yh implements NotificationCenter.NotificationCenterDelegate, ud.b {
    public final ej A;
    public final hj B;
    public final az C;
    public final fi D;
    public final ci E;
    public bj F;
    public boolean G;
    public final ud.a n;
    public final FrameLayout r;
    public final hh.f1 s;
    public final zi v;
    public final HashMap w;
    public final ArrayList x;
    public boolean y;

    public lj(Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) {
        super(context, c6Var, giVar);
        this.n = new ud.a(0, this, er.h, 380L, false);
        this.w = new HashMap();
        this.x = new ArrayList();
        this.y = false;
        this.B = new hj(this, context);
        fi fiVar = new fi(context, org.telegram.ui.ActionBar.g6.d6, c6Var);
        this.D = fiVar;
        fiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ci ciVar = new ci(context, c6Var, this.b);
        this.E = ciVar;
        ciVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        gg.g gVar = ciVar.r;
        gVar.setHint(string);
        gVar.addTextChangedListener(new xi(this));
        frameLayout.addView(fiVar, h7.z5.g());
        FrameLayout.LayoutParams d = h7.z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(ciVar, d);
        az azVar = new az(context, c6Var);
        this.C = azVar;
        azVar.c();
        azVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(azVar, h7.z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        hh.f1 f1Var = new hh.f1(this, context, c6Var, 12);
        this.s = f1Var;
        this.c = f1Var;
        this.d = f1Var;
        this.h = true;
        this.f = true;
        f1Var.p1();
        f1Var.setClipToPadding(false);
        getContext();
        zi ziVar = new zi(this, AndroidUtilities.dp(9.0f), f1Var, 0);
        this.v = ziVar;
        f1Var.setLayoutManager(ziVar);
        ziVar.P = false;
        f1Var.setHorizontalScrollBarEnabled(false);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.setClipToPadding(false);
        addView(f1Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ej ejVar = new ej(this, context);
        this.A = ejVar;
        f1Var.setAdapter(ejVar);
        f1Var.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, this.a));
        f1Var.setOnItemClickListener(new cg.x0(12, this, c6Var));
        f1Var.setOnScrollListener(new ag.z2(this, 26));
        f1Var.setOnItemLongClickListener(new vi(this));
        FrameLayout.LayoutParams e9 = h7.z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e9).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e9);
        NotificationCenter.getInstance(this.b.F1).addObserver(this, NotificationCenter.contactsDidLoad);
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        hh.f1 f1Var = this.s;
        if (f1Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = f1Var.getChildAt(0);
        lk0 lk0Var = (lk0) f1Var.G(childAt);
        if (lk0Var == null) {
            return -1000;
        }
        int paddingTop = f1Var.getPaddingTop();
        if (lk0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.yh
    public final void E(yh yhVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.yh
    public final void G() {
        this.s.x0(0);
    }

    @Override // org.telegram.ui.Components.yh
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        HashMap hashMap = this.w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.F == null) || this.y) {
            return false;
        }
        this.y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(M(hashMap.get((aj) obj)));
        }
        gi giVar = this.b;
        return y4.b0(giVar.F1, giVar.n1(), giVar.j1() + arrayList.size(), new Utilities.Callback() { // from class: org.telegram.ui.Components.wi
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj2) {
                lj ljVar = lj.this;
                bj bjVar = ljVar.F;
                gi giVar2 = ljVar.b;
                String obj3 = giVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                bjVar.c(arrayList, obj3, z10, i10, j10, z11);
                giVar2.dismiss();
            }
        }, 0L);
    }

    public final void L(kj kjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.w;
        if (hashMap.isEmpty() && !this.G) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.N = string;
            b2Var.P = formatString;
            i0.a.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        aj a2 = aj.a(obj);
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
        bp bpVar = kjVar.d;
        if (bpVar.getVisibility() != 0) {
            bpVar.setVisibility(0);
        }
        bpVar.a(z10, true);
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
        this.C.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        O();
    }

    public final void O() {
        View childAt;
        az azVar = this.C;
        if (azVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            azVar.setTranslationY((childAt.getTop() + (azVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ej ejVar;
        if (i10 != NotificationCenter.contactsDidLoad || (ejVar = this.A) == null) {
            return;
        }
        ejVar.l();
    }

    @Override // org.telegram.ui.Components.yh
    public int getCurrentItemTop() {
        hh.f1 f1Var = this.s;
        if (f1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = f1Var.getChildAt(0);
        lk0 lk0Var = (lk0) f1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || lk0Var == null || lk0Var.b() != 0) ? 0 : top;
        ud.a aVar = this.n;
        if (top < 0 || lk0Var == null || lk0Var.b() != 0) {
            aVar.a(true, true);
            top = i10;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.yh
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.yh
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
            arrayList.add(M(hashMap.get((aj) obj)));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.yh
    public int getSelectedItemsCount() {
        return this.w.size();
    }

    @Override // org.telegram.ui.Components.yh
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        s6 s6Var = new s6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.h6));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        hh.f1 f1Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        int i11 = org.telegram.ui.ActionBar.g6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{kj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{kj.class}, new String[]{"statusTextView"}, null, null, -1, s6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{kj.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.yh
    public final void m() {
        NotificationCenter.getInstance(this.b.F1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            fi fiVar = this.D;
            fiVar.setAlpha(f10);
            fiVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        O();
    }

    public void setDelegate(bj bjVar) {
        this.F = bjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.G = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(jg.a aVar) {
        ci ciVar = this.E;
        if (ciVar != null) {
            ciVar.setupBlurredBackground(aVar.c(ciVar, ng.c.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.yh
    public final void z(int i10, int i11) {
        int i12;
        gi giVar = this.b;
        if (giVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            giVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    giVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            giVar.setAllowNestedScroll(true);
        }
        this.s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }
}
