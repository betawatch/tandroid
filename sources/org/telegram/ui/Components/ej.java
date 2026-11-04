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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ej extends th implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs, qe.b {
    public boolean E;
    public final yi F;
    public final aj G;
    public final gy H;
    public final ai I;
    public final xh J;
    public vi K;
    public boolean L;
    public final qe.a n;
    public final FrameLayout r;
    public final ci.j1 s;
    public final lg.d0 w;
    public final HashMap x;
    public final ArrayList y;

    public ej(Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var, biVar);
        this.n = new qe.a(0, this, xq.h, 380L, false);
        this.x = new HashMap();
        this.y = new ArrayList();
        this.E = false;
        this.G = new aj(this, context);
        ai aiVar = new ai(org.telegram.ui.ActionBar.k6.d6, context, e6Var);
        this.I = aiVar;
        aiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        xh xhVar = new xh(context, e6Var, this.b);
        this.J = xhVar;
        xhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        String M0 = org.telegram.messenger.bd.M0(2131745777, null);
        bh.g gVar = xhVar.r;
        gVar.setHint(M0);
        gVar.addTextChangedListener(new bh.h(this, 16));
        frameLayout.addView(aiVar, b8.mf.g());
        FrameLayout.LayoutParams d = b8.mf.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(xhVar, d);
        gy gyVar = new gy(context, e6Var);
        this.H = gyVar;
        gyVar.c();
        gyVar.setText(org.telegram.messenger.bd.M0(2131748231, null));
        addView(gyVar, b8.mf.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 15);
        this.s = j1Var;
        setBlur3Capture(j1Var);
        this.d = j1Var;
        this.h = true;
        this.f = true;
        j1Var.r1();
        j1Var.setClipToPadding(false);
        getContext();
        lg.d0 d0Var = new lg.d0(this, org.telegram.messenger.g0.L(9.0f), j1Var, 1);
        this.w = d0Var;
        j1Var.setLayoutManager(d0Var);
        d0Var.P = false;
        j1Var.setHorizontalScrollBarEnabled(false);
        j1Var.setVerticalScrollBarEnabled(false);
        j1Var.setClipToPadding(false);
        addView(j1Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        yi yiVar = new yi(this, context);
        this.F = yiVar;
        j1Var.setAdapter(yiVar);
        org.telegram.ui.ActionBar.r6.m(j1Var, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
        j1Var.setOnItemClickListener(new ei.q4(10, this, e6Var));
        j1Var.setOnScrollListener(new ji(this, 2));
        j1Var.setOnItemLongClickListener(new ri(this));
        FrameLayout.LayoutParams e10 = b8.mf.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.m;
        addView(frameLayout, e10);
        org.telegram.messenger.hs.f(this.b.E3).c(this, org.telegram.messenger.hs.O);
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        ci.j1 j1Var = this.s;
        if (j1Var.getChildCount() == 0) {
            return -1000;
        }
        int i3 = 0;
        View childAt = j1Var.getChildAt(0);
        bj0 bj0Var = (bj0) j1Var.G(childAt);
        if (bj0Var == null) {
            return -1000;
        }
        int paddingTop = j1Var.getPaddingTop();
        if (bj0Var.b() == 0 && childAt.getTop() >= 0) {
            i3 = childAt.getTop();
        }
        return paddingTop - i3;
    }

    @Override // org.telegram.ui.Components.th
    public final void B(int i3, int i10) {
        int i11;
        bi biVar = this.b;
        if (biVar.m3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            biVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    biVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            biVar.r0 = true;
        }
        this.s.q1(0, i11 + org.telegram.messenger.g0.m, 0, this.e);
    }

    @Override // org.telegram.ui.Components.th
    public final void H(th thVar) {
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.th
    public final void J() {
        this.s.y0(0);
    }

    @Override // org.telegram.ui.Components.th
    public final boolean L(final boolean z10, final int i3, int i10, final long j10, final boolean z11) {
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
            arrayList.add(Q(hashMap.get((ui) obj)));
        }
        bi biVar = this.b;
        return t4.a0(biVar.E3, biVar.b1(), biVar.X0() + arrayList.size(), new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.si
            @Override // org.telegram.messenger.u10
            public final void a(Object obj2) {
                ej ejVar = ej.this;
                vi viVar = ejVar.K;
                bi biVar2 = ejVar.b;
                String obj3 = biVar2.a1().getText().toString();
                ((Long) obj2).getClass();
                viVar.b(arrayList, obj3, z10, i3, j10, z11);
                biVar2.dismiss();
            }
        }, 0L);
    }

    public final void P(dj djVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.x;
        if (hashMap.isEmpty() && !this.L) {
            String a02 = org.telegram.messenger.bd.a0("AttachContactsSlowMode", null, 2131753978, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
            String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = a02;
            k2.p1.B(null, 2131747839, alertDialog$Builder, null);
            return;
        }
        ui a10 = ui.a(obj);
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
        wo woVar = djVar.d;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, true);
        this.b.K1(z10 ? 1 : 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_userContact_old2 Q(Object obj) {
        String str;
        org.telegram.messenger.d5 d5Var;
        String str2;
        ArrayList arrayList;
        ArrayList<TLRPC.RestrictionReason> arrayList2;
        int lastIndexOf;
        if (obj instanceof org.telegram.messenger.d5) {
            d5Var = (org.telegram.messenger.d5) obj;
            TLRPC.User user = d5Var.m;
            if (user != null) {
                str = user.first_name;
                str2 = user.last_name;
            } else {
                str = d5Var.i;
                str2 = d5Var.j;
            }
        } else {
            TLRPC.User user2 = (TLRPC.User) obj;
            org.telegram.messenger.d5 d5Var2 = new org.telegram.messenger.d5();
            str = user2.first_name;
            d5Var2.i = str;
            String str3 = user2.last_name;
            d5Var2.j = str3;
            d5Var2.e.add(user2.phone);
            d5Var2.m = user2;
            d5Var = d5Var2;
            str2 = str3;
        }
        String m10 = org.telegram.messenger.g5.m(0, str, str2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String str4 = d5Var.b;
        if (str4 != null) {
            arrayList = org.telegram.messenger.g0.e2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.b.E3, true, arrayList3, m10);
        } else {
            org.telegram.messenger.f0 f0Var = new org.telegram.messenger.f0();
            f0Var.c = 0;
            String str5 = "TEL;MOBILE:+" + d5Var.m.phone;
            f0Var.b = str5;
            f0Var.a.add(str5);
            arrayList4.add(f0Var);
            arrayList = null;
        }
        TLRPC.User user3 = d5Var.m;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                org.telegram.messenger.f0 f0Var2 = (org.telegram.messenger.f0) arrayList3.get(i3);
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
                StringBuilder sb2 = tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", org.telegram.messenger.g5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
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

    public final void R() {
        this.H.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        S();
    }

    public final void S() {
        View childAt;
        gy gyVar = this.H;
        if (gyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            gyVar.setTranslationY((childAt.getTop() + (gyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            ai aiVar = this.I;
            aiVar.setAlpha(f10);
            aiVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        yi yiVar;
        if (i3 != org.telegram.messenger.hs.O || (yiVar = this.F) == null) {
            return;
        }
        yiVar.f();
    }

    @Override // org.telegram.ui.Components.th
    public int getCurrentItemTop() {
        ci.j1 j1Var = this.s;
        if (j1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = j1Var.getChildAt(0);
        bj0 bj0Var = (bj0) j1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        int i3 = (top <= 0 || bj0Var == null || bj0Var.b() != 0) ? 0 : top;
        qe.a aVar = this.n;
        if (top < 0 || bj0Var == null || bj0Var.b() != 0) {
            aVar.a(true, true);
            top = i3;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.th
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.th
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList.add(Q(hashMap.get((ui) obj)));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.th
    public int getSelectedItemsCount() {
        return this.x.size();
    }

    @Override // org.telegram.ui.Components.th
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        int i3 = org.telegram.ui.ActionBar.k6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 0, new Class[]{dj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        S();
    }

    @Override // org.telegram.ui.Components.th
    public final void p() {
        org.telegram.messenger.hs.f(this.b.E3).n(this, org.telegram.messenger.hs.O);
    }

    public void setDelegate(vi viVar) {
        this.K = viVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.L = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(eh.c cVar) {
        xh xhVar = this.J;
        if (xhVar != null) {
            xhVar.setupBlurredBackground(cVar.c(xhVar, b8.cd.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            xh xhVar = this.J;
            if (xhVar != null) {
                xhVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
