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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tj extends ki implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs, te.b {
    public boolean E;
    public final nj F;
    public final pj G;
    public final ty H;
    public final ri I;
    public final oi J;
    public kj K;
    public boolean L;
    public final te.a n;
    public final FrameLayout r;
    public final di.b1 s;
    public final kg.c0 w;
    public final HashMap x;
    public final ArrayList y;

    public tj(Context context, org.telegram.ui.ActionBar.i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        this.n = new te.a(0, this, lr.h, 380L, false);
        this.x = new HashMap();
        this.y = new ArrayList();
        this.E = false;
        this.G = new pj(this, context);
        ri riVar = new ri(org.telegram.ui.ActionBar.n6.d6, context, i6Var);
        this.I = riVar;
        riVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        oi oiVar = new oi(context, i6Var, this.b);
        this.J = oiVar;
        oiVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        String M0 = org.telegram.messenger.gd.M0(2131745572, null);
        ah.i iVar = oiVar.r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new ah.j(this, 19));
        frameLayout.addView(riVar, c8.ma.g());
        FrameLayout.LayoutParams d = c8.ma.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(oiVar, d);
        ty tyVar = new ty(context, i6Var);
        this.H = tyVar;
        tyVar.c();
        tyVar.setText(org.telegram.messenger.gd.M0(2131748031, null));
        addView(tyVar, c8.ma.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, i6Var, 15);
        this.s = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f = true;
        b1Var.r1();
        b1Var.setClipToPadding(false);
        getContext();
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(9.0f), b1Var, 1);
        this.w = c0Var;
        b1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        nj njVar = new nj(this, context);
        this.F = njVar;
        b1Var.setAdapter(njVar);
        org.telegram.ui.ActionBar.u6.l(b1Var, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        b1Var.setOnItemClickListener(new fi.g4(10, this, i6Var));
        b1Var.setOnScrollListener(new oa(this, 3));
        b1Var.setOnItemLongClickListener(new gj(this));
        FrameLayout.LayoutParams e10 = c8.ma.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.m;
        addView(frameLayout, e10);
        org.telegram.messenger.ks.f(this.b.H3).c(this, org.telegram.messenger.ks.O);
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        di.b1 b1Var = this.s;
        if (b1Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = b1Var.getChildAt(0);
        kj0 kj0Var = (kj0) b1Var.G(childAt);
        if (kj0Var == null) {
            return -1000;
        }
        int paddingTop = b1Var.getPaddingTop();
        if (kj0Var.b() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    @Override // org.telegram.ui.Components.ki
    public final void B(int i7, int i10) {
        int i11;
        si siVar = this.b;
        if (siVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            siVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    siVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            siVar.r0 = true;
        }
        this.s.q1(0, i11 + org.telegram.messenger.g0.m, 0, this.e);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            ri riVar = this.I;
            riVar.setAlpha(f10);
            riVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void I(ki kiVar) {
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ki
    public final void K() {
        this.s.y0(0);
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        HashMap hashMap = this.x;
        int i11 = 0;
        if ((hashMap.size() == 0 && this.K == null) || this.E) {
            return false;
        }
        this.E = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(R(hashMap.get((jj) obj)));
        }
        si siVar = this.b;
        return b5.Y(siVar.H3, siVar.c1(), siVar.Y0() + arrayList.size(), new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.hj
            @Override // org.telegram.messenger.x10
            public final void a(Object obj2) {
                tj tjVar = tj.this;
                kj kjVar = tjVar.K;
                si siVar2 = tjVar.b;
                String obj3 = siVar2.b1().getText().toString();
                ((Long) obj2).getClass();
                kjVar.b(arrayList, obj3, z10, i7, j3, z11);
                siVar2.dismiss();
            }
        }, 0L);
    }

    public final void Q(sj sjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.x;
        if (hashMap.isEmpty() && !this.L) {
            String a02 = org.telegram.messenger.gd.a0("AttachContactsSlowMode", null, 2131753976, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
            String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = a02;
            org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
            return;
        }
        jj a10 = jj.a(obj);
        boolean containsKey = hashMap.containsKey(a10);
        ArrayList arrayList = this.y;
        if (containsKey) {
            hashMap.remove(a10);
            arrayList.remove(a10);
            z10 = false;
        } else {
            hashMap.put(a10, obj);
            arrayList.add(a10);
            z10 = true;
        }
        mp mpVar = sjVar.d;
        if (mpVar.getVisibility() != 0) {
            mpVar.setVisibility(0);
        }
        mpVar.a(z10, true);
        this.b.L1(z10 ? 1 : 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_userContact_old2 R(Object obj) {
        String str;
        org.telegram.messenger.f5 f5Var;
        String str2;
        ArrayList arrayList;
        ArrayList<TLRPC.RestrictionReason> arrayList2;
        int lastIndexOf;
        if (obj instanceof org.telegram.messenger.f5) {
            f5Var = (org.telegram.messenger.f5) obj;
            TLRPC.User user = f5Var.m;
            if (user != null) {
                str = user.first_name;
                str2 = user.last_name;
            } else {
                str = f5Var.i;
                str2 = f5Var.j;
            }
        } else {
            TLRPC.User user2 = (TLRPC.User) obj;
            org.telegram.messenger.f5 f5Var2 = new org.telegram.messenger.f5();
            str = user2.first_name;
            f5Var2.i = str;
            String str3 = user2.last_name;
            f5Var2.j = str3;
            f5Var2.e.add(user2.phone);
            f5Var2.m = user2;
            f5Var = f5Var2;
            str2 = str3;
        }
        String m10 = org.telegram.messenger.i5.m(0, str, str2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String str4 = f5Var.b;
        if (str4 != null) {
            arrayList = org.telegram.messenger.g0.e2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.b.H3, true, arrayList3, m10);
        } else {
            org.telegram.messenger.f0 f0Var = new org.telegram.messenger.f0();
            f0Var.c = 0;
            String str5 = "TEL;MOBILE:+" + f5Var.m.phone;
            f0Var.b = str5;
            f0Var.a.add(str5);
            arrayList4.add(f0Var);
            arrayList = null;
        }
        TLRPC.User user3 = f5Var.m;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                org.telegram.messenger.f0 f0Var2 = (org.telegram.messenger.f0) arrayList3.get(i7);
                if (f0Var2.c == 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList4.size()) {
                            arrayList4.add(f0Var2);
                            break;
                        }
                        if (((org.telegram.messenger.f0) arrayList4.get(i10)).c(false).equals(f0Var2.c(false))) {
                            f0Var2.d = false;
                            break;
                        }
                        i10++;
                    }
                } else {
                    arrayList5.add(f0Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                TLRPC.User user4 = (TLRPC.User) arrayList.get(0);
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
                StringBuilder sb2 = tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", org.telegram.messenger.i5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                lastIndexOf = sb2.lastIndexOf("END:VCARD");
                if (lastIndexOf >= 0) {
                    tL_userContact_old2.phone = null;
                    for (int size = arrayList4.size() - 1; size >= 0; size--) {
                        org.telegram.messenger.f0 f0Var3 = (org.telegram.messenger.f0) arrayList4.get(size);
                        boolean z10 = f0Var3.d;
                        ArrayList arrayList6 = f0Var3.a;
                        if (z10) {
                            if (tL_userContact_old2.phone == null) {
                                tL_userContact_old2.phone = f0Var3.c(false);
                            }
                            for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                sb2.insert(lastIndexOf, ((String) arrayList6.get(i11)) + "\n");
                            }
                        }
                    }
                    for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                        org.telegram.messenger.f0 f0Var4 = (org.telegram.messenger.f0) arrayList5.get(size2);
                        boolean z11 = f0Var4.d;
                        ArrayList arrayList7 = f0Var4.a;
                        if (z11) {
                            for (int size3 = arrayList7.size() - 1; size3 >= 0; size3 += -1) {
                                sb2.insert(lastIndexOf, ((String) arrayList7.get(size3)) + "\n");
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

    public final void S() {
        this.H.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        T();
    }

    public final void T() {
        View childAt;
        ty tyVar = this.H;
        if (tyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            tyVar.setTranslationY((childAt.getTop() + (tyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        nj njVar;
        if (i7 != org.telegram.messenger.ks.O || (njVar = this.F) == null) {
            return;
        }
        njVar.f();
    }

    @Override // org.telegram.ui.Components.ki
    public int getCurrentItemTop() {
        di.b1 b1Var = this.s;
        if (b1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = b1Var.getChildAt(0);
        kj0 kj0Var = (kj0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        int i7 = (top <= 0 || kj0Var == null || kj0Var.b() != 0) ? 0 : top;
        te.a aVar = this.n;
        if (top < 0 || kj0Var == null || kj0Var.b() != 0) {
            aVar.a(true, true);
            top = i7;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ki
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ki
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(R(hashMap.get((jj) obj)));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ki
    public int getSelectedItemsCount() {
        return this.x.size();
    }

    @Override // org.telegram.ui.Components.ki
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h6));
        int i7 = org.telegram.ui.ActionBar.n6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.s, 0, new Class[]{sj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        T();
    }

    @Override // org.telegram.ui.Components.ki
    public final void p() {
        org.telegram.messenger.ks.f(this.b.H3).n(this, org.telegram.messenger.ks.O);
    }

    public void setDelegate(kj kjVar) {
        this.K = kjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.L = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        oi oiVar = this.J;
        if (oiVar != null) {
            oiVar.setupBlurredBackground(cVar.c(oiVar, c8.i0.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            oi oiVar = this.J;
            if (oiVar != null) {
                oiVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
