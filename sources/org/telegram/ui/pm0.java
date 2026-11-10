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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pm0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final boolean D;
    public final boolean E;
    public final cn F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.g1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.z0[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.kt M;
    public k0 N;
    public ImageView O;
    public nm0 P;
    public o00 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public om0 V;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.pj0 h;
    public l4 n;
    public FrameLayout r;
    public TextView s;
    public boolean w;
    public final int x;
    public boolean y;

    public pm0(int i7, boolean z9, boolean z10, cn cnVar) {
        super(null);
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f = 2;
        this.y = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = cnVar;
        this.x = i7;
        this.D = z9;
        this.E = z10;
    }

    public static void Z(pm0 pm0Var, org.telegram.messenger.we weVar) {
        if (weVar != null) {
            an0 an0Var = new an0(0, weVar, pm0Var.b, pm0Var.c, pm0Var.x, pm0Var.E, pm0Var.F, false);
            Editable text = pm0Var.M.getText();
            pm0Var.a = text;
            an0Var.d = text;
            org.telegram.ui.Components.kt ktVar = an0Var.d0;
            if (ktVar != null) {
                ktVar.setText(text);
            }
            an0Var.s0 = new f(pm0Var, 29);
            an0Var.k0(pm0Var.G, pm0Var.H);
            pm0Var.presentFragment(an0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!pm0Var.D) {
            an0 an0Var2 = new an0(0, weVar, hashMap, arrayList, pm0Var.x, pm0Var.E, pm0Var.F, false);
            Editable text2 = pm0Var.M.getText();
            pm0Var.a = text2;
            an0Var2.d = text2;
            org.telegram.ui.Components.kt ktVar2 = an0Var2.d0;
            if (ktVar2 != null) {
                ktVar2.setText(text2);
            }
            an0Var2.s0 = new mm0(pm0Var, hashMap, arrayList, 0);
            an0Var2.k0(pm0Var.G, pm0Var.H);
            pm0Var.presentFragment(an0Var2);
            return;
        }
        dn0 dn0Var = new dn0(hashMap, arrayList, pm0Var.x, pm0Var.E, pm0Var.F);
        Editable text3 = pm0Var.M.getText();
        pm0Var.a = text3;
        an0 an0Var3 = dn0Var.a;
        if (an0Var3 != null) {
            an0Var3.d = text3;
            org.telegram.ui.Components.kt ktVar3 = an0Var3.d0;
            if (ktVar3 != null) {
                ktVar3.setText(text3);
            }
        }
        mm0 mm0Var = new mm0(pm0Var, hashMap, arrayList, 1);
        an0 an0Var4 = dn0Var.a;
        an0Var4.s0 = mm0Var;
        an0 an0Var5 = dn0Var.b;
        an0Var5.s0 = mm0Var;
        an0Var4.t0 = new bn0(dn0Var, 1);
        an0Var5.t0 = new bn0(dn0Var, 2);
        int i7 = pm0Var.G;
        boolean z9 = pm0Var.H;
        an0Var4.k0(i7, z9);
        dn0Var.b.k0(i7, z9);
        pm0Var.presentFragment(dn0Var);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z9, int i7) {
        if (hashMap.isEmpty() || this.V == null || this.w) {
            return;
        }
        this.w = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
            org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
            arrayList2.add(fzVar);
            if (obj instanceof org.telegram.messenger.gf) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                String str = gfVar.h;
                if (str != null) {
                    fzVar.c = str;
                } else {
                    fzVar.c = gfVar.I;
                }
                fzVar.e = gfVar.c;
                fzVar.f = gfVar.g;
                fzVar.k = gfVar.s;
                fzVar.o = gfVar.b;
                CharSequence charSequence = gfVar.a;
                fzVar.d = charSequence != null ? charSequence.toString() : null;
                fzVar.i = gfVar.n;
                fzVar.j = gfVar.r;
                fzVar.h = gfVar.x;
            } else if (obj instanceof org.telegram.messenger.kf) {
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                String str2 = kfVar.h;
                if (str2 != null) {
                    fzVar.c = str2;
                } else {
                    fzVar.l = kfVar;
                }
                fzVar.e = kfVar.c;
                fzVar.f = kfVar.g;
                fzVar.k = kfVar.s;
                CharSequence charSequence2 = kfVar.I;
                fzVar.d = charSequence2 != null ? charSequence2.toString() : null;
                fzVar.i = kfVar.n;
                fzVar.j = kfVar.r;
                fzVar.h = kfVar.x;
                TLRPC.BotInlineResult botInlineResult = kfVar.N;
                if (botInlineResult != null && kfVar.H == 1) {
                    fzVar.m = botInlineResult;
                    fzVar.n = kfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        this.V.c(arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.da));
    }

    public final void b0(boolean z9) {
        if (z9 == (this.L.getTag() != null)) {
            return;
        }
        this.L.setTag(z9 ? 1 : null);
        if (this.M.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(this.M.getEditText());
        }
        this.M.k(true);
        if (z9) {
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(4);
            this.N.setVisibility(4);
        }
        this.N.setScaleX(z9 ? 1.0f : 0.2f);
        this.N.setScaleY(z9 ? 1.0f : 0.2f);
        this.N.setAlpha(z9 ? 1.0f : 0.0f);
        this.Q.setScaleX(z9 ? 1.0f : 0.2f);
        this.Q.setScaleY(z9 ? 1.0f : 0.2f);
        this.Q.setAlpha(z9 ? 1.0f : 0.0f);
        this.L.setTranslationY(z9 ? 0.0f : org.telegram.messenger.g0.L(48.0f));
        this.R.setTranslationY(z9 ? 0.0f : org.telegram.messenger.g0.L(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        org.telegram.ui.ActionBar.t6.h(i7, lVar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.l(lVar2, 5, i10, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, i10, null);
        int i11 = 3;
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new xx(this, 22));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (this.y) {
            s5.a(2, R.drawable.outline_header_search).setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        }
        org.telegram.ui.ActionBar.r0 a10 = s5.a(0, R.drawable.ic_ab_other);
        a10.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        a10.e(1, R.drawable.msg_openin, org.telegram.messenger.id.M0(2131747796, null));
        nm0 nm0Var = new nm0(this, context);
        this.P = nm0Var;
        org.telegram.ui.ActionBar.t6.h(i7, nm0Var, null);
        this.fragmentView = this.P;
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131750484, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.h = pj0Var;
        pj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new v4.b0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, c8.ha.e(-1, -1, 51));
        org.telegram.ui.Components.pj0 pj0Var2 = this.h;
        l4 l4Var = new l4(13, this, context);
        this.n = l4Var;
        pj0Var2.setAdapter(l4Var);
        org.telegram.ui.ActionBar.t6.H(this.h, i7, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        int i12 = 17;
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(org.telegram.messenger.id.M0(2131748180, null));
        this.P.addView(this.s, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new ei.b(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.r, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, c8.ha.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.R.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.P.addView(this.R, c8.ha.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        org.telegram.ui.ActionBar.t6.h(i7, frameLayout2, null);
        this.L.setVisibility(4);
        this.L.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.P.addView(this.L, c8.ha.e(-1, 48, 83));
        this.L.setOnTouchListener(new ei.b(2));
        org.telegram.ui.Components.kt ktVar = this.M;
        if (ktVar != null) {
            ktVar.o();
        }
        this.M = new org.telegram.ui.Components.kt(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).H0())});
        this.M.setHint(org.telegram.messenger.id.M0(2131754454, null));
        org.telegram.ui.Components.ys editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        k0 k0Var = new k0(i12, context, this);
        this.N = k0Var;
        k0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, c8.ha.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.S5, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T5, false)));
        this.O.setImageResource(R.drawable.attach_send);
        this.O.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.t6.s(this.O, org.telegram.ui.ActionBar.m6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new bg.q0(19));
        this.N.addView(this.O, c8.ha.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new j40(this, 18));
        this.O.setOnLongClickListener(new t(this, i11));
        float L = org.telegram.messenger.g0.L(12.0f);
        TextPaint textPaint = this.S;
        textPaint.setTextSize(L);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        o00 o00Var = new o00(i11, context, this);
        this.Q = o00Var;
        o00Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, c8.ha.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.x != 0) {
            this.M.setVisibility(8);
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

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.r2) {
            if (i7 == org.telegram.messenger.qs.t) {
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
            org.telegram.ui.Components.pj0 pj0Var = this.h;
            if (pj0Var != null && pj0Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            l4 l4Var = this.n;
            if (l4Var != null) {
                l4Var.f();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.X9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.kt ktVar = this.M;
        if (ktVar == null || !ktVar.e) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        ktVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.pj0 pj0Var = this.h;
        if (pj0Var != null) {
            pj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        int i7 = this.x;
        if (i7 == 1 || i7 == 2 || i7 == 10 || !this.y) {
            this.d = MediaController.c2;
        } else {
            this.d = MediaController.b2;
        }
        this.e = this.d == null;
        MediaController.O(this.classGuid);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.r2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.t);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.kt ktVar = this.M;
        if (ktVar != null) {
            ktVar.o();
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.r2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.t);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.n;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.kt ktVar = this.M;
        if (ktVar != null) {
            ktVar.s();
        }
        org.telegram.ui.Components.pj0 pj0Var = this.h;
        if (pj0Var != null) {
            pj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }
}
