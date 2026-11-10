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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c60 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, View.OnClickListener, te.b, rh.c {
    public final HashMap D;
    public final ArrayList E;
    public org.telegram.ui.Components.c20 F;
    public int G;
    public int H;
    public int I;
    public final te.c a;
    public org.telegram.ui.Components.p00 b;
    public org.telegram.ui.ActionBar.g5 c;
    public a60 d;
    public ScrollView e;
    public b60 f;
    public org.telegram.ui.Components.pj0 h;
    public v4.b0 n;
    public org.telegram.ui.Components.bv0 r;
    public z50 s;
    public ArrayList w;
    public int x;
    public boolean y;

    public c60() {
        super(null);
        this.a = new te.c(3, this, org.telegram.ui.Components.wq.h, 350L, 0.0f);
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public static void Z(c60 c60Var, View view, int i7) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        if (i7 == 0 && !c60Var.y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s5 = org.telegram.messenger.g5.r(c60Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s5);
                c60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s5), 500);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) view).getContact()) != null) {
            org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) c60Var.D.get(contact.b);
            if (c20Var != null) {
                c60Var.f.a(c20Var);
            } else {
                org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(c60Var.getParentActivity(), null, contact, true, c60Var.resourceProvider);
                b60 b60Var = c60Var.f;
                ArrayList arrayList = b60Var.c;
                c60 c60Var2 = b60Var.f;
                c60Var2.E.add(c20Var2);
                c60Var2.D.put(c20Var2.getKey(), c20Var2);
                AnimatorSet animatorSet = b60Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    b60Var.a.cancel();
                }
                b60Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                b60Var.a = animatorSet2;
                animatorSet2.addListener(new g30(b60Var, 2));
                b60Var.a.setInterpolator(org.telegram.ui.Components.wq.h);
                b60Var.a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(c20Var2, (Property<org.telegram.ui.Components.c20, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(c20Var2, (Property<org.telegram.ui.Components.c20, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(c20Var2, (Property<org.telegram.ui.Components.c20, Float>) View.ALPHA, 0.0f, 1.0f));
                b60Var.addView(c20Var2);
                c60Var2.e.post(new kz(b60Var, 15));
                c20Var2.setOnClickListener(c60Var);
            }
            c60Var.b.e(!c60Var.E.isEmpty(), true);
            boolean z9 = c20Var == null;
            org.telegram.ui.Components.wo woVar = q4Var.e;
            if (woVar != null) {
                woVar.a(z9, true);
            }
        }
    }

    public static void a0(c60 c60Var) {
        ArrayList arrayList = c60Var.E;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.d5 contact = ((org.telegram.ui.Components.c20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i7 = contact.l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(c60Var.currentAccount).s(i7));
            c60Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        c60Var.finishFragment();
    }

    public static void d0(c60 c60Var) {
        c60Var.y = false;
        z50 z50Var = c60Var.s;
        if (z50Var.h) {
            z50Var.h = false;
            z50Var.f();
        }
        c60Var.s.E(null);
        c60Var.h.setFastScrollVisible(true);
        c60Var.h.setVerticalScrollBarEnabled(false);
        c60Var.r.e(false, true);
        c60Var.r.setStickerType(0);
        c60Var.r.d.setText(org.telegram.messenger.id.M0(2131748223, null));
        c60Var.r.e.setText("");
    }

    @Override // rh.c
    public final View R() {
        return this.fragmentView;
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
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

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.y = false;
        this.E.clear();
        this.D.clear();
        this.F = null;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131749151, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new xx(this, 9));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.q().b(1, R.drawable.outline_header_search);
        this.c = b10;
        b10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.g5 g5Var = this.c;
        g5Var.N();
        g5Var.B0 = new kg.v1(this, 13);
        this.c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        k0 k0Var = new k0(11, context, this);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        b60 b60Var = new b60(this, context);
        this.f = b60Var;
        this.e.addView(b60Var, c8.ha.c(-2.0f, -1));
        this.d = new a60(this, context);
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(6);
        lzVar.x = false;
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, lzVar, 0, null);
        this.r = bv0Var;
        bv0Var.addView(lzVar, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(org.telegram.messenger.id.M0(2131748223, null));
        this.r.e.setText("");
        this.r.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.n = new v4.b0(1, false);
        this.s = new z50(this, context);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.h = pj0Var;
        pj0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? 1 : 2);
        k0Var.addView(this.h, c8.ha.c(-1.0f, -1));
        k0Var.addView(this.r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new g3(this, 17));
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        y1Var.l = org.telegram.messenger.qs.K2;
        y1Var.invalidateSelf();
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.b = p00Var;
        p00Var.c.setImageDrawable(y1Var);
        this.b.e(false, false);
        this.b.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        this.b.setOnClickListener(new j40(this, 3));
        z50 z50Var = this.s;
        if (z50Var != null && !this.y) {
            this.r.setVisibility(z50Var.b() != 2 ? 4 : 0);
        }
        k0Var.addView(this.d, c8.ha.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.b, org.telegram.ui.Components.p00.b());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.bv0 bv0Var;
        if (i7 == org.telegram.messenger.qs.P) {
            f0();
        } else {
            if (i7 != org.telegram.messenger.qs.O || (bv0Var = this.r) == null) {
                return;
            }
            bv0Var.e(false, true);
        }
    }

    public final void e0() {
        int i7;
        if (this.h == null) {
            return;
        }
        float f10 = this.a.f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (f10 > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.0f) + ((int) f10);
        } else {
            i7 = 0;
        }
        oi.a.e(this.h, this.G, this.H, currentActionBarHeight + i7, 0);
        this.r.setPadding(0, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.G, 0, this.H);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.g5.r(this.currentAccount).a0);
        this.w = arrayList;
        Collections.sort(arrayList, new pe(26));
        org.telegram.ui.Components.bv0 bv0Var = this.r;
        if (bv0Var != null) {
            bv0Var.e(false, true);
        }
        z50 z50Var = this.s;
        if (z50Var != null) {
            z50Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 262148, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // rh.c
    public final void m(r0.k1 k1Var) {
        this.I = k1Var.a.f(8).d;
        org.telegram.ui.Components.p00 p00Var = this.b;
        if (p00Var != null) {
            p00Var.setTranslationY(-Math.max(this.H, r3));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) view;
        if (!c20Var.D) {
            org.telegram.ui.Components.c20 c20Var2 = this.F;
            if (c20Var2 != null) {
                c20Var2.a();
            }
            this.F = c20Var;
            c20Var.b();
            return;
        }
        this.F = null;
        this.f.a(c20Var);
        this.b.e(!this.E.isEmpty(), true);
        int childCount = this.h.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.h.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) childAt).getContact()) != null) {
                boolean containsKey = this.D.containsKey(contact.b);
                org.telegram.ui.Components.wo woVar = q4Var.e;
                if (woVar != null) {
                    woVar.a(containsKey, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.P);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.O);
        f0();
        if (!org.telegram.messenger.p10.i(this.currentAccount).H) {
            org.telegram.messenger.g5.r(this.currentAccount).l();
            org.telegram.messenger.p10.i(this.currentAccount).H = true;
            org.telegram.messenger.p10.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.P);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.O);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.G = i10;
        this.H = i12;
        e0();
        a60 a60Var = this.d;
        if (a60Var != null) {
            a60Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.G);
        }
        org.telegram.ui.Components.p00 p00Var = this.b;
        if (p00Var != null) {
            p00Var.setTranslationY(-Math.max(this.H, this.I));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.pj0 pj0Var = this.h;
            if (pj0Var != null) {
                pj0Var.x1();
            }
            if (this.f != null) {
                for (int i7 = 0; i7 < this.f.getChildCount(); i7++) {
                    View childAt = this.f.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.c20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // rh.c
    public final /* synthetic */ void P() {
    }

    @Override // rh.c
    public final /* synthetic */ void w() {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
