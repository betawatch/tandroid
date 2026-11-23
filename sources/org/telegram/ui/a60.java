package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a60 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs, View.OnClickListener, te.b, rh.c {
    public final HashMap E;
    public final ArrayList F;
    public org.telegram.ui.Components.p20 G;
    public int H;
    public int I;
    public int J;
    public final te.c a;
    public org.telegram.ui.Components.c10 b;
    public org.telegram.ui.ActionBar.g5 c;
    public y50 d;
    public ScrollView e;
    public z50 f;
    public org.telegram.ui.Components.ek0 h;
    public v4.c0 n;
    public org.telegram.ui.Components.nv0 r;
    public x50 s;
    public ArrayList w;
    public int x;
    public boolean y;

    public a60() {
        super(null);
        this.a = new te.c(3, this, org.telegram.ui.Components.nr.h, 350L, 0.0f);
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static void Z(a60 a60Var, View view, int i7) {
        org.telegram.ui.Cells.r4 r4Var;
        org.telegram.messenger.f5 contact;
        if (i7 == 0 && !a60Var.y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s5 = org.telegram.messenger.i5.r(a60Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s5);
                a60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s5), 500);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r4) && (contact = (r4Var = (org.telegram.ui.Cells.r4) view).getContact()) != null) {
            org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) a60Var.E.get(contact.b);
            if (p20Var != null) {
                a60Var.f.a(p20Var);
            } else {
                org.telegram.ui.Components.p20 p20Var2 = new org.telegram.ui.Components.p20(a60Var.getParentActivity(), null, contact, true, a60Var.resourceProvider);
                z50 z50Var = a60Var.f;
                ArrayList arrayList = z50Var.c;
                a60 a60Var2 = z50Var.f;
                a60Var2.F.add(p20Var2);
                a60Var2.E.put(p20Var2.getKey(), p20Var2);
                AnimatorSet animatorSet = z50Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    z50Var.a.cancel();
                }
                z50Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                z50Var.a = animatorSet2;
                animatorSet2.addListener(new ay(z50Var, 3));
                z50Var.a.setInterpolator(org.telegram.ui.Components.nr.h);
                z50Var.a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(p20Var2, (Property<org.telegram.ui.Components.p20, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(p20Var2, (Property<org.telegram.ui.Components.p20, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(p20Var2, (Property<org.telegram.ui.Components.p20, Float>) View.ALPHA, 0.0f, 1.0f));
                z50Var.addView(p20Var2);
                a60Var2.e.post(new lz(z50Var, 15));
                p20Var2.setOnClickListener(a60Var);
            }
            a60Var.b.e(!a60Var.F.isEmpty(), true);
            boolean z10 = p20Var == null;
            org.telegram.ui.Components.op opVar = r4Var.e;
            if (opVar != null) {
                opVar.a(z10, true);
            }
        }
    }

    public static void a0(a60 a60Var) {
        ArrayList arrayList = a60Var.F;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.f5 contact = ((org.telegram.ui.Components.p20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i7 = contact.l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.i5.r(a60Var.currentAccount).s(i7));
            a60Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        a60Var.finishFragment();
    }

    public static void d0(a60 a60Var) {
        a60Var.y = false;
        x50 x50Var = a60Var.s;
        if (x50Var.h) {
            x50Var.h = false;
            x50Var.f();
        }
        a60Var.s.E(null);
        a60Var.h.setFastScrollVisible(true);
        a60Var.h.setVerticalScrollBarEnabled(false);
        a60Var.r.e(false, true);
        a60Var.r.setStickerType(0);
        a60Var.r.d.setText(org.telegram.messenger.hd.N0(2131748030, null));
        a60Var.r.e.setText("");
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            e0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override // rh.c
    public final View S() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.y = false;
        this.F.clear();
        this.E.clear();
        this.G = null;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748958, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 12));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(1, R.drawable.outline_header_search);
        this.c = b10;
        b10.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
        org.telegram.ui.ActionBar.g5 g5Var = this.c;
        g5Var.O();
        g5Var.C0 = new bi.w1(this, 14);
        this.c.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        k0 k0Var = new k0(11, context, this);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        z50 z50Var = new z50(this, context);
        this.f = z50Var;
        this.e.addView(z50Var, c8.ma.c(-2.0f, -1));
        this.d = new y50(this, context);
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        yzVar.setViewType(6);
        yzVar.x = false;
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(context, yzVar, 0, null);
        this.r = nv0Var;
        nv0Var.addView(yzVar, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(org.telegram.messenger.hd.N0(2131748030, null));
        this.r.e.setText("");
        this.r.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.n = new v4.c0(1, false);
        this.s = new x50(this, context);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.h = ek0Var;
        ek0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        k0Var.addView(this.h, c8.ma.c(-1.0f, -1));
        k0Var.addView(this.r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new g3(this, 17));
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.l = org.telegram.messenger.ls.K2;
        x1Var.invalidateSelf();
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
        this.b = c10Var;
        c10Var.c.setImageDrawable(x1Var);
        this.b.e(false, false);
        this.b.setContentDescription(org.telegram.messenger.hd.N0(2131748057, null));
        this.b.setOnClickListener(new j40(this, 3));
        x50 x50Var = this.s;
        if (x50Var != null && !this.y) {
            this.r.setVisibility(x50Var.b() != 2 ? 4 : 0);
        }
        k0Var.addView(this.d, c8.ma.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.b, org.telegram.ui.Components.c10.b());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.nv0 nv0Var;
        if (i7 == org.telegram.messenger.ls.P) {
            f0();
        } else {
            if (i7 != org.telegram.messenger.ls.O || (nv0Var = this.r) == null) {
                return;
            }
            nv0Var.e(false, true);
        }
    }

    public final void e0() {
        int i7;
        if (this.h == null) {
            return;
        }
        float f10 = this.a.f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (f10 > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.0f) + ((int) f10);
        } else {
            i7 = 0;
        }
        ri.a.e(this.h, this.H, this.I, currentActionBarHeight + i7, 0);
        this.r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H, 0, this.I);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.i5.r(this.currentAccount).b0);
        this.w = arrayList;
        Collections.sort(arrayList, new pe(24));
        org.telegram.ui.Components.nv0 nv0Var = this.r;
        if (nv0Var != null) {
            nv0Var.e(false, true);
        }
        x50 x50Var = this.s;
        if (x50Var != null) {
            x50Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 262148, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f, 0, new Class[]{org.telegram.ui.Components.p20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f, 0, new Class[]{org.telegram.ui.Components.p20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ui));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // rh.c
    public final void m(r0.l1 l1Var) {
        this.J = l1Var.a.f(8).d;
        org.telegram.ui.Components.c10 c10Var = this.b;
        if (c10Var != null) {
            c10Var.setTranslationY(-Math.max(this.I, r3));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Cells.r4 r4Var;
        org.telegram.messenger.f5 contact;
        org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) view;
        if (!p20Var.E) {
            org.telegram.ui.Components.p20 p20Var2 = this.G;
            if (p20Var2 != null) {
                p20Var2.a();
            }
            this.G = p20Var;
            p20Var.b();
            return;
        }
        this.G = null;
        this.f.a(p20Var);
        this.b.e(!this.F.isEmpty(), true);
        int childCount = this.h.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.h.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.r4) && (contact = (r4Var = (org.telegram.ui.Cells.r4) childAt).getContact()) != null) {
                boolean containsKey = this.E.containsKey(contact.b);
                org.telegram.ui.Components.op opVar = r4Var.e;
                if (opVar != null) {
                    opVar.a(containsKey, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.P);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.O);
        f0();
        if (!org.telegram.messenger.k10.i(this.currentAccount).I) {
            org.telegram.messenger.i5.r(this.currentAccount).l();
            org.telegram.messenger.k10.i(this.currentAccount).I = true;
            org.telegram.messenger.k10.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.P);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.O);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.H = i10;
        this.I = i12;
        e0();
        y50 y50Var = this.d;
        if (y50Var != null) {
            y50Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H);
        }
        org.telegram.ui.Components.c10 c10Var = this.b;
        if (c10Var != null) {
            c10Var.setTranslationY(-Math.max(this.I, this.J));
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.ek0 ek0Var = this.h;
            if (ek0Var != null) {
                ek0Var.x1();
            }
            if (this.f != null) {
                for (int i7 = 0; i7 < this.f.getChildCount(); i7++) {
                    View childAt = this.f.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.p20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // rh.c
    public final /* synthetic */ void O() {
    }

    @Override // rh.c
    public final /* synthetic */ void w() {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
