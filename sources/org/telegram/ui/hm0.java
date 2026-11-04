package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hm0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public final boolean E;
    public final boolean F;
    public final wm G;
    public int H;
    public boolean I;
    public org.telegram.ui.ActionBar.f1 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public org.telegram.ui.ActionBar.y0[] L;
    public FrameLayout M;
    public org.telegram.ui.Components.jt N;
    public l0 O;
    public ImageView P;
    public fm0 Q;
    public org.telegram.ui.Components.voip.r0 R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public gm0 W;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.tj0 h;
    public n4 n;
    public FrameLayout r;
    public TextView s;
    public boolean w;
    public final int x;
    public boolean y;

    public hm0(int i3, boolean z10, boolean z11, wm wmVar) {
        super(null);
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f = 2;
        this.y = true;
        this.I = true;
        this.T = new TextPaint(1);
        this.U = new RectF();
        this.V = new Paint(1);
        this.G = wmVar;
        this.x = i3;
        this.E = z10;
        this.F = z11;
    }

    public static void Z(hm0 hm0Var, org.telegram.messenger.pe peVar) {
        if (peVar != null) {
            sm0 sm0Var = new sm0(0, peVar, hm0Var.b, hm0Var.c, hm0Var.x, hm0Var.F, hm0Var.G, false);
            Editable text = hm0Var.N.getText();
            hm0Var.a = text;
            sm0Var.d = text;
            org.telegram.ui.Components.jt jtVar = sm0Var.e0;
            if (jtVar != null) {
                jtVar.setText(text);
            }
            sm0Var.t0 = new f(hm0Var, 29);
            sm0Var.k0(hm0Var.H, hm0Var.I);
            hm0Var.presentFragment(sm0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!hm0Var.E) {
            sm0 sm0Var2 = new sm0(0, peVar, hashMap, arrayList, hm0Var.x, hm0Var.F, hm0Var.G, false);
            Editable text2 = hm0Var.N.getText();
            hm0Var.a = text2;
            sm0Var2.d = text2;
            org.telegram.ui.Components.jt jtVar2 = sm0Var2.e0;
            if (jtVar2 != null) {
                jtVar2.setText(text2);
            }
            sm0Var2.t0 = new em0(hm0Var, hashMap, arrayList, 0);
            sm0Var2.k0(hm0Var.H, hm0Var.I);
            hm0Var.presentFragment(sm0Var2);
            return;
        }
        vm0 vm0Var = new vm0(hashMap, arrayList, hm0Var.x, hm0Var.F, hm0Var.G);
        Editable text3 = hm0Var.N.getText();
        hm0Var.a = text3;
        sm0 sm0Var3 = vm0Var.a;
        if (sm0Var3 != null) {
            sm0Var3.d = text3;
            org.telegram.ui.Components.jt jtVar3 = sm0Var3.e0;
            if (jtVar3 != null) {
                jtVar3.setText(text3);
            }
        }
        em0 em0Var = new em0(hm0Var, hashMap, arrayList, 1);
        sm0 sm0Var4 = vm0Var.a;
        sm0Var4.t0 = em0Var;
        sm0 sm0Var5 = vm0Var.b;
        sm0Var5.t0 = em0Var;
        sm0Var4.u0 = new tm0(vm0Var, 1);
        sm0Var5.u0 = new tm0(vm0Var, 2);
        int i3 = hm0Var.H;
        boolean z10 = hm0Var.I;
        sm0Var4.k0(i3, z10);
        vm0Var.b.k0(i3, z10);
        hm0Var.presentFragment(vm0Var);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z10, int i3) {
        if (hashMap.isEmpty() || this.W == null || this.w) {
            return;
        }
        this.w = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
            org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
            arrayList2.add(xyVar);
            if (obj instanceof org.telegram.messenger.ye) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                String str = yeVar.h;
                if (str != null) {
                    xyVar.c = str;
                } else {
                    xyVar.c = yeVar.I;
                }
                xyVar.e = yeVar.c;
                xyVar.f = yeVar.g;
                xyVar.k = yeVar.s;
                xyVar.o = yeVar.b;
                CharSequence charSequence = yeVar.a;
                xyVar.d = charSequence != null ? charSequence.toString() : null;
                xyVar.i = yeVar.n;
                xyVar.j = yeVar.r;
                xyVar.h = yeVar.x;
            } else if (obj instanceof org.telegram.messenger.bf) {
                org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                String str2 = bfVar.h;
                if (str2 != null) {
                    xyVar.c = str2;
                } else {
                    xyVar.l = bfVar;
                }
                xyVar.e = bfVar.c;
                xyVar.f = bfVar.g;
                xyVar.k = bfVar.s;
                CharSequence charSequence2 = bfVar.I;
                xyVar.d = charSequence2 != null ? charSequence2.toString() : null;
                xyVar.i = bfVar.n;
                xyVar.j = bfVar.r;
                xyVar.h = bfVar.x;
                TLRPC.BotInlineResult botInlineResult = bfVar.N;
                if (botInlineResult != null && bfVar.H == 1) {
                    xyVar.m = botInlineResult;
                    xyVar.n = bfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        this.W.a(arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.da));
    }

    public final void b0(boolean z10) {
        if (z10 == (this.M.getTag() != null)) {
            return;
        }
        this.M.setTag(z10 ? 1 : null);
        if (this.N.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(this.N.getEditText());
        }
        this.N.k(true);
        if (z10) {
            this.M.setVisibility(0);
            this.O.setVisibility(0);
        } else {
            this.M.setVisibility(4);
            this.O.setVisibility(4);
        }
        this.O.setScaleX(z10 ? 1.0f : 0.2f);
        this.O.setScaleY(z10 ? 1.0f : 0.2f);
        this.O.setAlpha(z10 ? 1.0f : 0.0f);
        this.R.setScaleX(z10 ? 1.0f : 0.2f);
        this.R.setScaleY(z10 ? 1.0f : 0.2f);
        this.R.setAlpha(z10 ? 1.0f : 0.0f);
        this.M.setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f));
        this.S.setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.h5;
        org.telegram.ui.ActionBar.r6.i(i3, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        int i11 = 5;
        org.telegram.ui.ActionBar.r6.m(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i10, null);
        int i12 = 3;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 23));
        org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
        if (this.y) {
            q10.a(2, R.drawable.outline_header_search).setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        }
        org.telegram.ui.ActionBar.q0 a10 = q10.a(0, R.drawable.ic_ab_other);
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        a10.e(1, R.drawable.msg_openin, org.telegram.messenger.bd.M0(2131747804, null));
        fm0 fm0Var = new fm0(this, context);
        this.Q = fm0Var;
        org.telegram.ui.ActionBar.r6.i(i3, fm0Var, null);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131750492, null));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.h = tj0Var;
        tj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new u4.b0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, b8.mf.e(-1, -1, 51));
        org.telegram.ui.Components.tj0 tj0Var2 = this.h;
        n4 n4Var = new n4(13, this, context);
        this.n = n4Var;
        tj0Var2.setAdapter(n4Var);
        org.telegram.ui.ActionBar.r6.I(this.h, i3, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        int i13 = 17;
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(org.telegram.messenger.bd.M0(2131748188, null));
        this.Q.addView(this.s, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new fi.a(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.r, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, b8.mf.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.S.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.S, b8.mf.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i3, frameLayout2, null);
        this.M.setVisibility(4);
        this.M.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.M, b8.mf.e(-1, 48, 83));
        this.M.setOnTouchListener(new fi.a(2));
        org.telegram.ui.Components.jt jtVar = this.N;
        if (jtVar != null) {
            jtVar.o();
        }
        this.N = new org.telegram.ui.Components.jt(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).H0())});
        this.N.setHint(org.telegram.messenger.bd.M0(2131754454, null));
        org.telegram.ui.Components.xs editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.N.setText(charSequence);
        }
        l0 l0Var = new l0(i13, context, this);
        this.O = l0Var;
        l0Var.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.O.setVisibility(4);
        this.O.setScaleX(0.2f);
        this.O.setScaleY(0.2f);
        this.O.setAlpha(0.0f);
        this.Q.addView(this.O, b8.mf.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S5, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T5, false)));
        this.P.setImageResource(R.drawable.attach_send);
        this.P.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.t(this.P, org.telegram.ui.ActionBar.k6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new cg.p0(22));
        this.O.addView(this.P, b8.mf.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new b40(this, 18));
        this.P.setOnLongClickListener(new t(this, i12));
        float L = org.telegram.messenger.g0.L(12.0f);
        TextPaint textPaint = this.T;
        textPaint.setTextSize(L);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(i11, context, this);
        this.R = r0Var;
        r0Var.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, b8.mf.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.x != 0) {
            this.N.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.r.setVisibility(8);
            this.h.setEmptyView(this.s);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.r2) {
            if (i3 == org.telegram.messenger.hs.t) {
                removeSelfFromStack(true);
                return;
            }
            return;
        }
        if (this.classGuid == ((Integer) objArr[0]).intValue()) {
            int i11 = this.x;
            if (i11 == 1 || i11 == 2 || i11 == 10 || !this.y) {
                this.d = (ArrayList) objArr[2];
            } else {
                this.d = (ArrayList) objArr[1];
            }
            FrameLayout frameLayout = this.r;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            org.telegram.ui.Components.tj0 tj0Var = this.h;
            if (tj0Var != null && tj0Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            n4 n4Var = this.n;
            if (n4Var != null) {
                n4Var.f();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.X9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jt jtVar = this.N;
        if (jtVar == null || !jtVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        jtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.tj0 tj0Var = this.h;
        if (tj0Var != null) {
            tj0Var.getViewTreeObserver().addOnPreDrawListener(new f7(this, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        int i3 = this.x;
        if (i3 == 1 || i3 == 2 || i3 == 10 || !this.y) {
            this.d = MediaController.d2;
        } else {
            this.d = MediaController.c2;
        }
        this.e = this.d == null;
        MediaController.O(this.classGuid);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.r2);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.t);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.jt jtVar = this.N;
        if (jtVar != null) {
            jtVar.o();
        }
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.r2);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.t);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.n;
        if (n4Var != null) {
            n4Var.f();
        }
        org.telegram.ui.Components.jt jtVar = this.N;
        if (jtVar != null) {
            jtVar.s();
        }
        org.telegram.ui.Components.tj0 tj0Var = this.h;
        if (tj0Var != null) {
            tj0Var.getViewTreeObserver().addOnPreDrawListener(new f7(this, 3));
        }
    }
}
