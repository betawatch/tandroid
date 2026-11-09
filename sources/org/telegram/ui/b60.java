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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b60 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, View.OnClickListener, te.b, rh.c {
    public final HashMap D;
    public final ArrayList E;
    public org.telegram.ui.Components.d20 F;
    public int G;
    public int H;
    public int I;
    public final te.c a;
    public org.telegram.ui.Components.q00 b;
    public org.telegram.ui.ActionBar.f5 c;
    public z50 d;
    public ScrollView e;
    public a60 f;
    public org.telegram.ui.Components.qj0 h;
    public v4.b0 n;
    public org.telegram.ui.Components.cv0 r;
    public y50 s;
    public ArrayList w;
    public int x;
    public boolean y;

    public b60() {
        super(null);
        this.a = new te.c(3, this, org.telegram.ui.Components.xq.h, 350L, 0.0f);
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public static void Z(b60 b60Var, View view, int i7) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        if (i7 == 0 && !b60Var.y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s5 = org.telegram.messenger.g5.r(b60Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s5);
                b60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s5), 500);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) view).getContact()) != null) {
            org.telegram.ui.Components.d20 d20Var = (org.telegram.ui.Components.d20) b60Var.D.get(contact.b);
            if (d20Var != null) {
                b60Var.f.a(d20Var);
            } else {
                org.telegram.ui.Components.d20 d20Var2 = new org.telegram.ui.Components.d20(b60Var.getParentActivity(), null, contact, true, b60Var.resourceProvider);
                a60 a60Var = b60Var.f;
                ArrayList arrayList = a60Var.c;
                b60 b60Var2 = a60Var.f;
                b60Var2.E.add(d20Var2);
                b60Var2.D.put(d20Var2.getKey(), d20Var2);
                AnimatorSet animatorSet = a60Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    a60Var.a.cancel();
                }
                a60Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                a60Var.a = animatorSet2;
                animatorSet2.addListener(new f30(a60Var, 2));
                a60Var.a.setInterpolator(org.telegram.ui.Components.xq.h);
                a60Var.a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(d20Var2, (Property<org.telegram.ui.Components.d20, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(d20Var2, (Property<org.telegram.ui.Components.d20, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(d20Var2, (Property<org.telegram.ui.Components.d20, Float>) View.ALPHA, 0.0f, 1.0f));
                a60Var.addView(d20Var2);
                b60Var2.e.post(new jz(a60Var, 15));
                d20Var2.setOnClickListener(b60Var);
            }
            b60Var.b.e(!b60Var.E.isEmpty(), true);
            boolean z9 = d20Var == null;
            org.telegram.ui.Components.wo woVar = q4Var.e;
            if (woVar != null) {
                woVar.a(z9, true);
            }
        }
    }

    public static void a0(b60 b60Var) {
        ArrayList arrayList = b60Var.E;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.d5 contact = ((org.telegram.ui.Components.d20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i7 = contact.l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(b60Var.currentAccount).s(i7));
            b60Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        b60Var.finishFragment();
    }

    public static void d0(b60 b60Var) {
        b60Var.y = false;
        y50 y50Var = b60Var.s;
        if (y50Var.h) {
            y50Var.h = false;
            y50Var.f();
        }
        b60Var.s.E(null);
        b60Var.h.setFastScrollVisible(true);
        b60Var.h.setVerticalScrollBarEnabled(false);
        b60Var.r.e(false, true);
        b60Var.r.setStickerType(0);
        b60Var.r.d.setText(org.telegram.messenger.id.M0(2131748223, null));
        b60Var.r.e.setText("");
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.i6));
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 9));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.p().b(1, R.drawable.outline_header_search);
        this.c = b10;
        b10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.f5 f5Var = this.c;
        f5Var.N();
        f5Var.B0 = new kg.v1(this, 13);
        this.c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        k0 k0Var = new k0(11, context, this);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        a60 a60Var = new a60(this, context);
        this.f = a60Var;
        this.e.addView(a60Var, c8.ha.c(-2.0f, -1));
        this.d = new z50(this, context);
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        mzVar.setViewType(6);
        mzVar.x = false;
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, mzVar, 0, null);
        this.r = cv0Var;
        cv0Var.addView(mzVar, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(org.telegram.messenger.id.M0(2131748223, null));
        this.r.e.setText("");
        this.r.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.n = new v4.b0(1, false);
        this.s = new y50(this, context);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.h = qj0Var;
        qj0Var.r1();
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
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
        this.b = q00Var;
        q00Var.c.setImageDrawable(y1Var);
        this.b.e(false, false);
        this.b.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        this.b.setOnClickListener(new i40(this, 3));
        y50 y50Var = this.s;
        if (y50Var != null && !this.y) {
            this.r.setVisibility(y50Var.b() != 2 ? 4 : 0);
        }
        k0Var.addView(this.d, c8.ha.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.b, org.telegram.ui.Components.q00.b());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.cv0 cv0Var;
        if (i7 == org.telegram.messenger.qs.P) {
            f0();
        } else {
            if (i7 != org.telegram.messenger.qs.O || (cv0Var = this.r) == null) {
                return;
            }
            cv0Var.e(false, true);
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
        oi.a.e(this.h, this.G, this.H, currentActionBarHeight + i7, 0);
        this.r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.G, 0, this.H);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.g5.r(this.currentAccount).a0);
        this.w = arrayList;
        Collections.sort(arrayList, new oe(26));
        org.telegram.ui.Components.cv0 cv0Var = this.r;
        if (cv0Var != null) {
            cv0Var.e(false, true);
        }
        y50 y50Var = this.s;
        if (y50Var != null) {
            y50Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 262148, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f, 0, new Class[]{org.telegram.ui.Components.d20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f, 0, new Class[]{org.telegram.ui.Components.d20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Ri));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // rh.c
    public final void m(r0.k1 k1Var) {
        this.I = k1Var.a.f(8).d;
        org.telegram.ui.Components.q00 q00Var = this.b;
        if (q00Var != null) {
            q00Var.setTranslationY(-Math.max(this.H, r3));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        org.telegram.ui.Components.d20 d20Var = (org.telegram.ui.Components.d20) view;
        if (!d20Var.D) {
            org.telegram.ui.Components.d20 d20Var2 = this.F;
            if (d20Var2 != null) {
                d20Var2.a();
            }
            this.F = d20Var;
            d20Var.b();
            return;
        }
        this.F = null;
        this.f.a(d20Var);
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
        z50 z50Var = this.d;
        if (z50Var != null) {
            z50Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.G);
        }
        org.telegram.ui.Components.q00 q00Var = this.b;
        if (q00Var != null) {
            q00Var.setTranslationY(-Math.max(this.H, this.I));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.qj0 qj0Var = this.h;
            if (qj0Var != null) {
                qj0Var.x1();
            }
            if (this.f != null) {
                for (int i7 = 0; i7 < this.f.getChildCount(); i7++) {
                    View childAt = this.f.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.d20) {
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
