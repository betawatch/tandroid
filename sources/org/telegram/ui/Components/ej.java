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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ej extends uh implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.us, fe.e {
    public boolean D;
    public final yi E;
    public final aj F;
    public final xy G;
    public final ih.e H;
    public final yh I;
    public vi J;
    public boolean K;
    public final fe.b n;
    public final FrameLayout r;
    public final ag.b1 s;
    public final ag.d1 w;
    public final HashMap x;
    public final ArrayList y;

    public ej(Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        this.n = new fe.b(0, this, gr.h, 380L, false);
        this.x = new HashMap();
        this.y = new ArrayList();
        this.D = false;
        this.F = new aj(this, context);
        ih.e eVar = new ih.e(org.telegram.ui.ActionBar.t6.d6, context, p6Var);
        this.H = eVar;
        eVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        yh yhVar = new yh(context, p6Var, this.b);
        this.I = yhVar;
        yhVar.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        String L0 = org.telegram.messenger.cd.L0(2131745784, null);
        org.telegram.ui.ActionBar.n0 n0Var = yhVar.r;
        n0Var.setHint(L0);
        n0Var.addTextChangedListener(new ag.a1(this, 11));
        frameLayout.addView(eVar, w7.b6.g());
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.i0.m;
        frameLayout.addView(yhVar, d);
        xy xyVar = new xy(context, p6Var);
        this.G = xyVar;
        xyVar.c();
        xyVar.setText(org.telegram.messenger.cd.L0(2131748240, null));
        addView(xyVar, w7.b6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ag.b1 b1Var = new ag.b1(this, context, p6Var, 10);
        this.s = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f = true;
        b1Var.r1();
        b1Var.setClipToPadding(false);
        getContext();
        ag.d1 d1Var = new ag.d1(this, org.telegram.messenger.i0.L(9.0f), b1Var, 1);
        this.w = d1Var;
        b1Var.setLayoutManager(d1Var);
        d1Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        yi yiVar = new yi(this, context);
        this.E = yiVar;
        b1Var.setAdapter(yiVar);
        org.telegram.ui.ActionBar.a7.m(b1Var, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        b1Var.setOnItemClickListener(new mg.q0(9, this, p6Var));
        b1Var.setOnScrollListener(new ag.u(this, 15));
        b1Var.setOnItemLongClickListener(new ri(this));
        FrameLayout.LayoutParams e = w7.b6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += org.telegram.messenger.i0.m;
        addView(frameLayout, e);
        org.telegram.messenger.zs.f(this.b.D3).c(this, org.telegram.messenger.zs.O);
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        ag.b1 b1Var = this.s;
        if (b1Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = b1Var.getChildAt(0);
        ck0 ck0Var = (ck0) b1Var.G(childAt);
        if (ck0Var == null) {
            return -1000;
        }
        int paddingTop = b1Var.getPaddingTop();
        if (ck0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.uh
    public final void B(int i10, int i11) {
        int i12;
        bi biVar = this.b;
        if (biVar.l3.Q() > org.telegram.messenger.i0.L(20.0f)) {
            i12 = org.telegram.messenger.i0.L(8.0f);
            biVar.q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.q;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    biVar.q0 = true;
                }
            }
            i12 = (i11 / 5) * 2;
            biVar.q0 = true;
        }
        this.s.q1(0, i12 + org.telegram.messenger.i0.m, 0, this.e);
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        this.s.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean J(final boolean z10, final int i10, int i11, final long j10, final boolean z11) {
        HashMap hashMap = this.x;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.D) {
            return false;
        }
        this.D = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(P(hashMap.get((ui) obj)));
        }
        bi biVar = this.b;
        return s4.a0(biVar.D3, biVar.a1(), biVar.W0() + arrayList.size(), new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.si
            @Override // org.telegram.messenger.q20
            public final void a(Object obj2) {
                ej ejVar = ej.this;
                vi viVar = ejVar.J;
                bi biVar2 = ejVar.b;
                String obj3 = biVar2.Z0().getText().toString();
                ((Long) obj2).getClass();
                viVar.b(arrayList, obj3, z10, i10, j10, z11);
                biVar2.dismiss();
            }
        }, 0L);
    }

    public final void O(dj djVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.x;
        if (hashMap.isEmpty() && !this.K) {
            String a02 = org.telegram.messenger.cd.a0("AttachContactsSlowMode", null, 2131753978, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
            String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = a02;
            i0.a.w(null, 2131747847, alertDialog$Builder, null);
            return;
        }
        ui a2 = ui.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.y;
        if (containsKey) {
            hashMap.remove(a2);
            arrayList.remove(a2);
            z10 = false;
        } else {
            hashMap.put(a2, obj);
            arrayList.add(a2);
            z10 = true;
        }
        ep epVar = djVar.d;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, true);
        this.b.J1(z10 ? 1 : 2);
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
            arrayList = org.telegram.messenger.i0.e2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.b.D3, true, arrayList3, m10);
        } else {
            org.telegram.messenger.h0 h0Var = new org.telegram.messenger.h0();
            h0Var.c = 0;
            String str5 = "TEL;MOBILE:+" + f5Var.m.phone;
            h0Var.b = str5;
            h0Var.a.add(str5);
            arrayList4.add(h0Var);
            arrayList = null;
        }
        TLRPC.User user3 = f5Var.m;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                org.telegram.messenger.h0 h0Var2 = (org.telegram.messenger.h0) arrayList3.get(i10);
                if (h0Var2.c == 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList4.size()) {
                            arrayList4.add(h0Var2);
                            break;
                        }
                        if (((org.telegram.messenger.h0) arrayList4.get(i11)).c(false).equals(h0Var2.c(false))) {
                            h0Var2.d = false;
                            break;
                        }
                        i11++;
                    }
                } else {
                    arrayList5.add(h0Var2);
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
                        org.telegram.messenger.h0 h0Var3 = (org.telegram.messenger.h0) arrayList4.get(size);
                        boolean z10 = h0Var3.d;
                        ArrayList arrayList6 = h0Var3.a;
                        if (z10) {
                            if (tL_userContact_old2.phone == null) {
                                tL_userContact_old2.phone = h0Var3.c(false);
                            }
                            for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                sb2.insert(lastIndexOf, ((String) arrayList6.get(i12)) + "\n");
                            }
                        }
                    }
                    for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                        org.telegram.messenger.h0 h0Var4 = (org.telegram.messenger.h0) arrayList5.get(size2);
                        boolean z11 = h0Var4.d;
                        ArrayList arrayList7 = h0Var4.a;
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

    public final void Q() {
        this.G.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        R();
    }

    public final void R() {
        View childAt;
        xy xyVar = this.G;
        if (xyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            xyVar.setTranslationY((childAt.getTop() + (xyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        yi yiVar;
        if (i10 != org.telegram.messenger.zs.O || (yiVar = this.E) == null) {
            return;
        }
        yiVar.f();
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        ag.b1 b1Var = this.s;
        if (b1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = b1Var.getChildAt(0);
        ck0 ck0Var = (ck0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(8.0f);
        int i10 = (top <= 0 || ck0Var == null || ck0Var.b() != 0) ? 0 : top;
        fe.b bVar = this.n;
        if (top < 0 || ck0Var == null || ck0Var.b() != 0) {
            bVar.a(true, true);
            top = i10;
        } else {
            bVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return org.telegram.messenger.i0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(P(hashMap.get((ui) obj)));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.uh
    public int getSelectedItemsCount() {
        return this.x.size();
    }

    @Override // org.telegram.ui.Components.uh
    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.G, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.G, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        int i10 = org.telegram.ui.ActionBar.t6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s, 0, new Class[]{dj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.uh
    public final void o() {
        org.telegram.messenger.zs.f(this.b.D3).n(this, org.telegram.messenger.zs.O);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setDelegate(vi viVar) {
        this.J = viVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(tg.b bVar) {
        yh yhVar = this.I;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(bVar.c(yhVar, w7.b9.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            yh yhVar = this.I;
            if (yhVar != null) {
                yhVar.updateColors();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            ih.e eVar = this.H;
            eVar.setAlpha(f7);
            eVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
