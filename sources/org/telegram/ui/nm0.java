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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nm0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public final boolean E;
    public final boolean F;
    public final an G;
    public int H;
    public boolean I;
    public org.telegram.ui.ActionBar.g1 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public org.telegram.ui.ActionBar.z0[] L;
    public FrameLayout M;
    public org.telegram.ui.Components.rt N;
    public k0 O;
    public ImageView P;
    public lm0 Q;
    public rv R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public mm0 W;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.uj0 h;
    public l4 n;
    public FrameLayout r;
    public TextView s;
    public boolean w;
    public final int x;
    public boolean y;

    public nm0(int i7, boolean z10, boolean z11, an anVar) {
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
        this.G = anVar;
        this.x = i7;
        this.E = z10;
        this.F = z11;
    }

    public static void Z(nm0 nm0Var, org.telegram.messenger.ve veVar) {
        if (veVar != null) {
            ym0 ym0Var = new ym0(0, veVar, nm0Var.b, nm0Var.c, nm0Var.x, nm0Var.F, nm0Var.G, false);
            Editable text = nm0Var.N.getText();
            nm0Var.a = text;
            ym0Var.d = text;
            org.telegram.ui.Components.rt rtVar = ym0Var.e0;
            if (rtVar != null) {
                rtVar.setText(text);
            }
            ym0Var.t0 = new f(nm0Var, 29);
            ym0Var.k0(nm0Var.H, nm0Var.I);
            nm0Var.presentFragment(ym0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!nm0Var.E) {
            ym0 ym0Var2 = new ym0(0, veVar, hashMap, arrayList, nm0Var.x, nm0Var.F, nm0Var.G, false);
            Editable text2 = nm0Var.N.getText();
            nm0Var.a = text2;
            ym0Var2.d = text2;
            org.telegram.ui.Components.rt rtVar2 = ym0Var2.e0;
            if (rtVar2 != null) {
                rtVar2.setText(text2);
            }
            ym0Var2.t0 = new km0(nm0Var, hashMap, arrayList, 0);
            ym0Var2.k0(nm0Var.H, nm0Var.I);
            nm0Var.presentFragment(ym0Var2);
            return;
        }
        bn0 bn0Var = new bn0(hashMap, arrayList, nm0Var.x, nm0Var.F, nm0Var.G);
        Editable text3 = nm0Var.N.getText();
        nm0Var.a = text3;
        ym0 ym0Var3 = bn0Var.a;
        if (ym0Var3 != null) {
            ym0Var3.d = text3;
            org.telegram.ui.Components.rt rtVar3 = ym0Var3.e0;
            if (rtVar3 != null) {
                rtVar3.setText(text3);
            }
        }
        km0 km0Var = new km0(nm0Var, hashMap, arrayList, 1);
        ym0 ym0Var4 = bn0Var.a;
        ym0Var4.t0 = km0Var;
        ym0 ym0Var5 = bn0Var.b;
        ym0Var5.t0 = km0Var;
        ym0Var4.u0 = new zm0(bn0Var, 1);
        ym0Var5.u0 = new zm0(bn0Var, 2);
        int i7 = nm0Var.H;
        boolean z10 = nm0Var.I;
        ym0Var4.k0(i7, z10);
        bn0Var.b.k0(i7, z10);
        nm0Var.presentFragment(bn0Var);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z10, int i7) {
        if (hashMap.isEmpty() || this.W == null || this.w) {
            return;
        }
        this.w = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = hashMap.get(arrayList.get(i10));
            org.telegram.messenger.dz dzVar = new org.telegram.messenger.dz();
            arrayList2.add(dzVar);
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                String str = ffVar.h;
                if (str != null) {
                    dzVar.c = str;
                } else {
                    dzVar.c = ffVar.I;
                }
                dzVar.e = ffVar.c;
                dzVar.f = ffVar.g;
                dzVar.k = ffVar.s;
                dzVar.o = ffVar.b;
                CharSequence charSequence = ffVar.a;
                dzVar.d = charSequence != null ? charSequence.toString() : null;
                dzVar.i = ffVar.n;
                dzVar.j = ffVar.r;
                dzVar.h = ffVar.x;
            } else if (obj instanceof org.telegram.messenger.jf) {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                String str2 = jfVar.h;
                if (str2 != null) {
                    dzVar.c = str2;
                } else {
                    dzVar.l = jfVar;
                }
                dzVar.e = jfVar.c;
                dzVar.f = jfVar.g;
                dzVar.k = jfVar.s;
                CharSequence charSequence2 = jfVar.I;
                dzVar.d = charSequence2 != null ? charSequence2.toString() : null;
                dzVar.i = jfVar.n;
                dzVar.j = jfVar.r;
                dzVar.h = jfVar.x;
                TLRPC.BotInlineResult botInlineResult = jfVar.N;
                if (botInlineResult != null && jfVar.H == 1) {
                    dzVar.m = botInlineResult;
                    dzVar.n = jfVar.O;
                }
                System.currentTimeMillis();
            }
        }
        this.W.f(arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.da));
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

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.j6.h5;
        org.telegram.ui.ActionBar.q6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.l(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, i10, null);
        int i11 = 3;
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 23));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (this.y) {
            s5.a(2, R.drawable.outline_header_search).setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        }
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, R.drawable.ic_ab_other);
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        a10.e(1, R.drawable.msg_openin, org.telegram.messenger.hd.M0(2131747796, null));
        lm0 lm0Var = new lm0(this, context);
        this.Q = lm0Var;
        org.telegram.ui.ActionBar.q6.h(i7, lm0Var, null);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131750484, null));
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.h = uj0Var;
        uj0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new v4.b0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, c8.ja.e(-1, -1, 51));
        org.telegram.ui.Components.uj0 uj0Var2 = this.h;
        l4 l4Var = new l4(13, this, context);
        this.n = l4Var;
        uj0Var2.setAdapter(l4Var);
        org.telegram.ui.ActionBar.q6.H(this.h, i7, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        int i12 = 17;
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(org.telegram.messenger.hd.M0(2131748180, null));
        this.Q.addView(this.s, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new gi.a(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.r, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, c8.ja.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.S.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.S, c8.ja.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        org.telegram.ui.ActionBar.q6.h(i7, frameLayout2, null);
        int i13 = 4;
        this.M.setVisibility(4);
        this.M.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.M, c8.ja.e(-1, 48, 83));
        this.M.setOnTouchListener(new gi.a(2));
        org.telegram.ui.Components.rt rtVar = this.N;
        if (rtVar != null) {
            rtVar.o();
        }
        this.N = new org.telegram.ui.Components.rt(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).H0())});
        this.N.setHint(org.telegram.messenger.hd.M0(2131754454, null));
        org.telegram.ui.Components.ft editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.N.setText(charSequence);
        }
        k0 k0Var = new k0(i12, context, this);
        this.O = k0Var;
        k0Var.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.O.setVisibility(4);
        this.O.setScaleX(0.2f);
        this.O.setScaleY(0.2f);
        this.O.setAlpha(0.0f);
        this.Q.addView(this.O, c8.ja.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.T5, false)));
        this.P.setImageResource(R.drawable.attach_send);
        this.P.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.q6.s(this.P, org.telegram.ui.ActionBar.j6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new bg.p0(19));
        this.O.addView(this.P, c8.ja.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new g40(this, 18));
        this.P.setOnLongClickListener(new t(this, i11));
        float L = org.telegram.messenger.g0.L(12.0f);
        TextPaint textPaint = this.T;
        textPaint.setTextSize(L);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        rv rvVar = new rv(i13, context, this);
        this.R = rvVar;
        rvVar.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, c8.ja.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
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

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ns.r2) {
            if (i7 == org.telegram.messenger.ns.t) {
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
            org.telegram.ui.Components.uj0 uj0Var = this.h;
            if (uj0Var != null && uj0Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            l4 l4Var = this.n;
            if (l4Var != null) {
                l4Var.f();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.rt rtVar = this.N;
        if (rtVar == null || !rtVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        rtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.uj0 uj0Var = this.h;
        if (uj0Var != null) {
            uj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        int i7 = this.x;
        if (i7 == 1 || i7 == 2 || i7 == 10 || !this.y) {
            this.d = MediaController.d2;
        } else {
            this.d = MediaController.c2;
        }
        this.e = this.d == null;
        MediaController.O(this.classGuid);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.r2);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.t);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.rt rtVar = this.N;
        if (rtVar != null) {
            rtVar.o();
        }
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.r2);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.t);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.n;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.rt rtVar = this.N;
        if (rtVar != null) {
            rtVar.s();
        }
        org.telegram.ui.Components.uj0 uj0Var = this.h;
        if (uj0Var != null) {
            uj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }
}
