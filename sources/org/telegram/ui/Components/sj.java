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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sj extends fi implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public final lj A;
    public final oj B;
    public final hz C;
    public final mi D;
    public final ji E;
    public ij F;
    public boolean G;
    public final vd.a n;
    public final FrameLayout r;
    public final jh.e1 s;
    public final gj v;
    public final HashMap w;
    public final ArrayList x;
    public boolean y;

    public sj(Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        this.n = new vd.a(0, this, jr.h, 380L, false);
        this.w = new HashMap();
        this.x = new ArrayList();
        this.y = false;
        this.B = new oj(this, context);
        mi miVar = new mi(context, org.telegram.ui.ActionBar.g6.d6, c6Var);
        this.D = miVar;
        miVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ji jiVar = new ji(context, c6Var, this.b);
        this.E = jiVar;
        jiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ig.f fVar = jiVar.r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new ej(this));
        frameLayout.addView(miVar, i7.f6.g());
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(jiVar, d);
        hz hzVar = new hz(context, c6Var);
        this.C = hzVar;
        hzVar.c();
        hzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(hzVar, i7.f6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        jh.e1 e1Var = new jh.e1(this, context, c6Var, 11);
        this.s = e1Var;
        this.c = e1Var;
        this.d = e1Var;
        this.h = true;
        this.f = true;
        e1Var.p1();
        e1Var.setClipToPadding(false);
        getContext();
        gj gjVar = new gj(this, AndroidUtilities.dp(9.0f), e1Var, 0);
        this.v = gjVar;
        e1Var.setLayoutManager(gjVar);
        gjVar.P = false;
        e1Var.setHorizontalScrollBarEnabled(false);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.setClipToPadding(false);
        addView(e1Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        lj ljVar = new lj(this, context);
        this.A = ljVar;
        e1Var.setAdapter(ljVar);
        e1Var.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, this.a));
        e1Var.setOnItemClickListener(new eg.w0(11, this, c6Var));
        e1Var.setOnScrollListener(new cg.g2(this, 21));
        e1Var.setOnItemLongClickListener(new cj(this));
        FrameLayout.LayoutParams e10 = i7.f6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e10);
        NotificationCenter.getInstance(this.b.F1).addObserver(this, NotificationCenter.contactsDidLoad);
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        jh.e1 e1Var = this.s;
        if (e1Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = e1Var.getChildAt(0);
        vk0 vk0Var = (vk0) e1Var.G(childAt);
        if (vk0Var == null) {
            return -1000;
        }
        int paddingTop = e1Var.getPaddingTop();
        if (vk0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.fi
    public final void D(fi fiVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.fi
    public final void F() {
        this.s.x0(0);
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean H(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
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
            arrayList.add(L(hashMap.get((hj) obj)));
        }
        ni niVar = this.b;
        return c5.b0(niVar.F1, niVar.n1(), niVar.j1() + arrayList.size(), new Utilities.Callback() { // from class: org.telegram.ui.Components.dj
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj2) {
                sj sjVar = sj.this;
                ij ijVar = sjVar.F;
                ni niVar2 = sjVar.b;
                String obj3 = niVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                ijVar.b(arrayList, obj3, z10, i10, j10, z11);
                niVar2.dismiss();
            }
        }, 0L);
    }

    public final void K(rj rjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.w;
        if (hashMap.isEmpty() && !this.G) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = formatString;
            j7.l1.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        hj a2 = hj.a(obj);
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
        hp hpVar = rjVar.d;
        if (hpVar.getVisibility() != 0) {
            hpVar.setVisibility(0);
        }
        hpVar.a(z10, true);
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

    public final void M() {
        this.C.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        O();
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            mi miVar = this.D;
            miVar.setAlpha(f9);
            miVar.setVisibility(f9 > 0.0f ? 0 : 4);
        }
    }

    public final void O() {
        View childAt;
        hz hzVar = this.C;
        if (hzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            hzVar.setTranslationY((childAt.getTop() + (hzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        lj ljVar;
        if (i10 != NotificationCenter.contactsDidLoad || (ljVar = this.A) == null) {
            return;
        }
        ljVar.l();
    }

    @Override // org.telegram.ui.Components.fi
    public int getCurrentItemTop() {
        jh.e1 e1Var = this.s;
        if (e1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = e1Var.getChildAt(0);
        vk0 vk0Var = (vk0) e1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || vk0Var == null || vk0Var.b() != 0) ? 0 : top;
        vd.a aVar = this.n;
        if (top < 0 || vk0Var == null || vk0Var.b() != 0) {
            aVar.a(true, true);
            top = i10;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.fi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.fi
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
            arrayList.add(L(hashMap.get((hj) obj)));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.fi
    public int getSelectedItemsCount() {
        return this.w.size();
    }

    @Override // org.telegram.ui.Components.fi
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        x6 x6Var = new x6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.h6));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        jh.e1 e1Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        int i11 = org.telegram.ui.ActionBar.g6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{rj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{rj.class}, new String[]{"statusTextView"}, null, null, -1, x6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{rj.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.fi
    public final void m() {
        NotificationCenter.getInstance(this.b.F1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        O();
    }

    public void setDelegate(ij ijVar) {
        this.F = ijVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.G = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(lg.a aVar) {
        ji jiVar = this.E;
        if (jiVar != null) {
            jiVar.setupBlurredBackground(aVar.c(jiVar, pg.a.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final void y(int i10, int i11) {
        int i12;
        ni niVar = this.b;
        if (niVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            niVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    niVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            niVar.setAllowNestedScroll(true);
        }
        this.s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
