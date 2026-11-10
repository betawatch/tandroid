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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ej extends uh implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.ls, te.b {
    public boolean D;
    public final yi E;
    public final aj F;
    public final iy G;
    public final bi H;
    public final yh I;
    public vi J;
    public boolean K;
    public final te.a n;
    public final FrameLayout r;
    public final bi.q1 s;
    public final kg.c0 w;
    public final HashMap x;
    public final ArrayList y;

    public ej(Context context, org.telegram.ui.ActionBar.h6 h6Var, ci ciVar) {
        super(context, h6Var, ciVar);
        this.n = new te.a(0, this, wq.h, 380L, false);
        this.x = new HashMap();
        this.y = new ArrayList();
        this.D = false;
        this.F = new aj(this, context);
        bi biVar = new bi(org.telegram.ui.ActionBar.m6.d6, context, h6Var);
        this.H = biVar;
        biVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        yh yhVar = new yh(context, h6Var, this.b);
        this.I = yhVar;
        yhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        String M0 = org.telegram.messenger.id.M0(2131745767, null);
        ah.i iVar = yhVar.r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new ah.j(this, 16));
        frameLayout.addView(biVar, c8.ha.g());
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(yhVar, d);
        iy iyVar = new iy(context, h6Var);
        this.G = iyVar;
        iyVar.c();
        iyVar.setText(org.telegram.messenger.id.M0(2131748223, null));
        addView(iyVar, c8.ha.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, h6Var, 15);
        this.s = q1Var;
        setBlur3Capture(q1Var);
        this.d = q1Var;
        this.h = true;
        this.f = true;
        q1Var.r1();
        q1Var.setClipToPadding(false);
        getContext();
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(9.0f), q1Var, 1);
        this.w = c0Var;
        q1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setClipToPadding(false);
        addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        yi yiVar = new yi(this, context);
        this.E = yiVar;
        q1Var.setAdapter(yiVar);
        org.telegram.ui.ActionBar.t6.l(q1Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        q1Var.setOnItemClickListener(new di.q4(10, this, h6Var));
        q1Var.setOnScrollListener(new ti(this, 0));
        q1Var.setOnItemLongClickListener(new qi(this));
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.m;
        addView(frameLayout, e10);
        org.telegram.messenger.qs.f(this.b.G3).c(this, org.telegram.messenger.qs.O);
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        bi.q1 q1Var = this.s;
        if (q1Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        if (xi0Var == null) {
            return -1000;
        }
        int paddingTop = q1Var.getPaddingTop();
        if (xi0Var.b() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    @Override // org.telegram.ui.Components.uh
    public final void B(int i7, int i10) {
        int i11;
        ci ciVar = this.b;
        if (ciVar.o3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            ciVar.q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    ciVar.q0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            ciVar.q0 = true;
        }
        this.s.q1(0, i11 + org.telegram.messenger.g0.m, 0, this.e);
    }

    @Override // org.telegram.ui.Components.uh
    public final void H(uh uhVar) {
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.uh
    public final void J() {
        this.s.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean L(final boolean z9, final int i7, int i10, final long j3, final boolean z10) {
        HashMap hashMap = this.x;
        int i11 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.D) {
            return false;
        }
        this.D = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(Q(hashMap.get((ui) obj)));
        }
        ci ciVar = this.b;
        return u4.Y(ciVar.G3, ciVar.b1(), ciVar.X0() + arrayList.size(), new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ri
            @Override // org.telegram.messenger.c20
            public final void a(Object obj2) {
                ej ejVar = ej.this;
                vi viVar = ejVar.J;
                ci ciVar2 = ejVar.b;
                String obj3 = ciVar2.a1().getText().toString();
                ((Long) obj2).getClass();
                viVar.b(arrayList, obj3, z9, i7, j3, z10);
                ciVar2.dismiss();
            }
        }, 0L);
    }

    public final void P(dj djVar, Object obj) {
        boolean z9;
        HashMap hashMap = this.x;
        if (hashMap.isEmpty() && !this.K) {
            String a02 = org.telegram.messenger.id.a0("AttachContactsSlowMode", null, 2131753978, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
            String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = a02;
            jg.g.C(null, 2131747831, alertDialog$Builder, null);
            return;
        }
        ui a10 = ui.a(obj);
        boolean containsKey = hashMap.containsKey(a10);
        ArrayList arrayList = this.y;
        if (containsKey) {
            hashMap.remove(a10);
            arrayList.remove(a10);
            z9 = false;
        } else {
            hashMap.put(a10, obj);
            arrayList.add(a10);
            z9 = true;
        }
        wo woVar = djVar.d;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, true);
        this.b.K1(z9 ? 1 : 2);
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
            arrayList = org.telegram.messenger.g0.e2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.b.G3, true, arrayList3, m10);
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
                StringBuilder sb2 = tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", org.telegram.messenger.g5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                lastIndexOf = sb2.lastIndexOf("END:VCARD");
                if (lastIndexOf >= 0) {
                    tL_userContact_old2.phone = null;
                    for (int size = arrayList4.size() - 1; size >= 0; size--) {
                        org.telegram.messenger.f0 f0Var3 = (org.telegram.messenger.f0) arrayList4.get(size);
                        boolean z9 = f0Var3.d;
                        ArrayList arrayList6 = f0Var3.a;
                        if (z9) {
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
                        boolean z10 = f0Var4.d;
                        ArrayList arrayList7 = f0Var4.a;
                        if (z10) {
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
        this.G.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        S();
    }

    public final void S() {
        View childAt;
        iy iyVar = this.G;
        if (iyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            iyVar.setTranslationY((childAt.getTop() + (iyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            bi biVar = this.H;
            biVar.setAlpha(f10);
            biVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        yi yiVar;
        if (i7 != org.telegram.messenger.qs.O || (yiVar = this.E) == null) {
            return;
        }
        yiVar.f();
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        bi.q1 q1Var = this.s;
        if (q1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        int i7 = (top <= 0 || xi0Var == null || xi0Var.b() != 0) ? 0 : top;
        te.a aVar = this.n;
        if (top < 0 || xi0Var == null || xi0Var.b() != 0) {
            aVar.a(true, true);
            top = i7;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(Q(hashMap.get((ui) obj)));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.uh
    public int getSelectedItemsCount() {
        return this.x.size();
    }

    @Override // org.telegram.ui.Components.uh
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.G, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.G, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h6));
        int i7 = org.telegram.ui.ActionBar.m6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.s, 0, new Class[]{dj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        S();
    }

    @Override // org.telegram.ui.Components.uh
    public final void p() {
        org.telegram.messenger.qs.f(this.b.G3).n(this, org.telegram.messenger.qs.O);
    }

    public void setDelegate(vi viVar) {
        this.J = viVar;
    }

    public void setMultipleSelectionAllowed(boolean z9) {
        this.K = z9;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        yh yhVar = this.I;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(cVar.c(yhVar, c8.g0.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            yh yhVar = this.I;
            if (yhVar != null) {
                yhVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
