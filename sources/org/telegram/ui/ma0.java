package org.telegram.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ma0 extends org.telegram.ui.ActionBar.k2 {
    public org.telegram.ui.Cells.b9 D;
    public org.telegram.ui.Cells.p4 E;
    public ha0 F;
    public org.telegram.ui.Cells.b9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.x9 I;
    public org.telegram.ui.Components.in0 J;
    public ha0 K;
    public org.telegram.ui.Cells.b9 L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final int[] P;
    public final ArrayList Q;
    public final int[] R;
    public la0 S;
    public org.telegram.ui.ActionBar.x1 T;
    public boolean U;
    public int V;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.yu0 c;
    public org.telegram.ui.Components.yu0 d;
    public TLRPC.TL_chatInviteExported e;
    public ja0 f;
    public org.telegram.ui.Cells.b9 h;
    public org.telegram.ui.Cells.t8 n;
    public ka0 r;
    public TextView s;
    public org.telegram.ui.Cells.b9 w;
    public TextView x;
    public org.telegram.ui.Cells.p4 y;

    public ma0(int i10, long j10) {
        super(null);
        this.M = -3;
        this.O = new ArrayList();
        this.P = new int[]{3600, 86400, 604800};
        this.Q = new ArrayList();
        this.R = new int[]{1, 10, 100};
        this.a = i10;
        this.b = j10;
    }

    public final void Z(int i10) {
        int[] iArr;
        long j10 = i10;
        this.x.setText(org.telegram.messenger.cd.s(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.P;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z10 = true;
            }
            i11 = c3.i0.j(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = org.telegram.messenger.cd.L0(2131748219, null);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[0]) {
                strArr[i14] = org.telegram.messenger.cd.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[1]) {
                strArr[i14] = org.telegram.messenger.cd.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[2]) {
                strArr[i14] = org.telegram.messenger.cd.G(1, "Weeks", new Object[0]);
            } else {
                long j11 = currentTime;
                if (j11 < 86400) {
                    strArr[i14] = org.telegram.messenger.cd.L0(2131748546, null);
                } else if (j11 < 31449600) {
                    strArr[i14] = org.telegram.messenger.cd.D0().v0().format(1000 * j10);
                } else {
                    strArr[i14] = org.telegram.messenger.cd.D0().B0().format(1000 * j10);
                }
            }
        }
        this.d.b(i12, null, strArr);
    }

    public final void a0(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            iArr = this.R;
            if (i12 >= iArr.length) {
                break;
            }
            if (!z10 && i10 <= (i11 = iArr[i12])) {
                if (i10 != i11) {
                    arrayList.add(Integer.valueOf(i10));
                }
                i13 = i12;
                z10 = true;
            }
            i12 = c3.i0.j(iArr[i12], i12, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i10));
            i13 = iArr.length;
        }
        int size = arrayList.size();
        int i14 = size + 1;
        String[] strArr = new String[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == size) {
                strArr[i15] = org.telegram.messenger.cd.L0(2131748219, null);
            } else {
                strArr[i15] = ((Integer) arrayList.get(i15)).toString();
            }
        }
        this.c.b(i13, null, strArr);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
    }

    public final void b0() {
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.R;
            if (i10 >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", org.telegram.messenger.cd.L0(2131748219, null));
                return;
            }
            i10 = c3.i0.j(iArr[i10], i10, 1, arrayList);
        }
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.e = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i10 = tL_chatInviteExported.expire_date;
        if (i10 > 0) {
            Z(i10);
            this.V = ((Integer) this.O.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.V = 0;
        }
        int i11 = tL_chatInviteExported.usage_limit;
        if (i11 > 0) {
            a0(i11);
            this.F.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        ja0 ja0Var = this.f;
        if (ja0Var != null) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, ja0Var, null);
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        d0(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.k6.l(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
            this.K.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.t8 t8Var = this.n;
        if (t8Var != null) {
            t8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            ja0 ja0Var2 = this.f;
            if (ja0Var2 != null) {
                ja0Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.b9 b9Var = this.h;
            if (b9Var != null) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131754201, null));
            }
        }
        ka0 ka0Var = this.r;
        if (ka0Var != null) {
            ka0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.d.setClickable(false);
            this.r.d.setFocusable(false);
            this.r.d.setFocusableInTouchMode(false);
            this.r.d.setLongClickable(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.a;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131748289, null));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751278, null));
        }
        int i11 = 2;
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, i11));
        this.simpleActionBar.n(org.telegram.messenger.cd.L0(i10 == 0 ? 2131751753 : 2131745963, null));
        ga0 ga0Var = new ga0(this, context);
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(context, ga0Var, this.resourceProvider, true);
        this.J = in0Var;
        in0Var.setDrawBackground(true);
        this.J.setOverScrollMode(0);
        w8 w8Var = new w8(this, context, 6);
        this.fragmentView = w8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        layoutTransition.setInterpolator(2, grVar);
        layoutTransition.setInterpolator(0, grVar);
        layoutTransition.setInterpolator(4, grVar);
        layoutTransition.setInterpolator(1, grVar);
        int i12 = 3;
        layoutTransition.setInterpolator(3, grVar);
        ga0Var.setLayoutTransition(layoutTransition);
        ga0Var.setOrientation(1);
        ga0Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(91.0f));
        this.J.addView(ga0Var);
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
        this.y = p4Var;
        p4Var.setText(org.telegram.messenger.cd.L0(2131748992, null));
        ga0Var.addView(this.y);
        org.telegram.ui.Components.yu0 yu0Var = new org.telegram.ui.Components.yu0(context, null);
        this.d = yu0Var;
        ga0Var.addView(yu0Var);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
        this.x.setGravity(16);
        this.x.setTextSize(1, 16.0f);
        this.x.setHint(org.telegram.messenger.cd.L0(2131744164, null));
        this.x.setOnClickListener(new wu(14, this, context));
        this.d.setCallback(new ca0(this, i11));
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            int[] iArr = this.P;
            if (i13 >= iArr.length) {
                break;
            }
            i13 = c3.i0.j(iArr[i13], i13, 1, arrayList);
        }
        this.d.b(3, null, org.telegram.messenger.cd.G(1, "Hours", new Object[0]), org.telegram.messenger.cd.G(1, "Days", new Object[0]), org.telegram.messenger.cd.G(1, "Weeks", new Object[0]), org.telegram.messenger.cd.L0(2131748219, null));
        ga0Var.addView(this.x, w7.b6.o(-1, 50));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.D = b9Var;
        b9Var.setText(org.telegram.messenger.cd.L0(2131744165, null));
        ga0Var.addView(this.D);
        org.telegram.ui.Cells.p4 p4Var2 = new org.telegram.ui.Cells.p4(context);
        this.E = p4Var2;
        p4Var2.setText(org.telegram.messenger.cd.L0(2131748990, null));
        ga0Var.addView(this.E);
        org.telegram.ui.Components.yu0 yu0Var2 = new org.telegram.ui.Components.yu0(context, null);
        this.c = yu0Var2;
        yu0Var2.setCallback(new ca0(this, i12));
        b0();
        ga0Var.addView(this.c);
        ha0 ha0Var = new ha0(context, 0);
        this.F = ha0Var;
        ha0Var.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(org.telegram.messenger.cd.L0(2131743646, null));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new ia0(this, 0));
        ga0Var.addView(this.F, w7.b6.o(-1, 50));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.G = b9Var2;
        b9Var2.setText(org.telegram.messenger.cd.L0(2131743647, null));
        ga0Var.addView(this.G);
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = this.b;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        boolean z10 = (!org.telegram.messenger.w3.t0(L0) || L0.join_request || L0.join_to_send) ? false : true;
        ja0 ja0Var = new ja0(context);
        this.f = ja0Var;
        int i14 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i14, ja0Var, null);
        this.f.setTag(Integer.valueOf(i14));
        this.f.f(org.telegram.messenger.cd.L0(2131754207, null), false, false);
        this.f.setOnClickListener(new org.telegram.ui.ActionBar.c0(5, this, z10));
        ga0Var.addView(this.f, w7.b6.o(-1, 56));
        org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.h = b9Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(org.telegram.messenger.cd.L0(2131754181, null));
        } else {
            b9Var3.setText(org.telegram.messenger.cd.L0(2131754202, null));
        }
        ga0Var.addView(this.h);
        if (L0 == null || L0.username == null) {
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(this.currentAccount).M0(j10);
            if ((this.e == null && org.telegram.messenger.w3.V(org.telegram.messenger.vp.r1(this.currentAccount).L0(Long.valueOf(j10))) && M0 != null && M0.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
                this.n = t8Var;
                org.telegram.ui.ActionBar.a7.i(i14, t8Var, null);
                this.n.setDrawCheckRipple(true);
                this.n.f(org.telegram.messenger.cd.L0(2131746176, null), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new wu(15, this, new Runnable[1]));
                ga0Var.addView(this.n, w7.b6.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(this.s, org.telegram.ui.ActionBar.t6.A6, null);
                ka0 ka0Var = new ka0(this, context, org.telegram.messenger.cd.L0(getConnectionsManager().isTestBackend() ? 2131746170 : 2131746171, null), this.resourceProvider);
                this.r = ka0Var;
                ka0Var.d.setInputType(2);
                this.r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.a7.i(i14, this.r, getResourceProvider());
                ka0 ka0Var2 = this.r;
                ka0Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(ka0Var2, 4);
                org.telegram.ui.Cells.k3 k3Var = ka0Var2.d;
                k3Var.setImeOptions(6);
                k3Var.setOnEditorActionListener(new m.s2(fVar, 2));
                this.r.addView(this.s, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                ka0 ka0Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                ka0Var3.getClass();
                ImageView imageView = new ImageView(ka0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                ka0Var3.addView(imageView, w7.b6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.k3 k3Var2 = ka0Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.i0.L(24.0f);
                k3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.i0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.i0.L(1.0f));
                ga0Var.addView(this.r, w7.b6.o(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
                this.w = b9Var4;
                if (this.e != null) {
                    b9Var4.setText(org.telegram.messenger.cd.L0(2131746174, null));
                } else {
                    b9Var4.setText(org.telegram.messenger.i0.c4(org.telegram.messenger.cd.L0(2131746175, null), new fa0(this, 0)));
                }
                ga0Var.addView(this.w, w7.b6.o(-1, -2));
            }
        }
        ha0 ha0Var2 = new ha0(context, 1);
        this.K = ha0Var2;
        ha0Var2.addTextChangedListener(new ia0(this, 1));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(org.telegram.messenger.cd.L0(2131748906, null));
        ha0 ha0Var3 = this.K;
        int i15 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.E(ha0Var3, i15, null);
        this.K.setLines(1);
        this.K.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
        this.K.setSingleLine();
        ha0 ha0Var4 = this.K;
        int i16 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(ha0Var4, i16, null);
        this.K.setTextSize(1, 16.0f);
        ga0Var.addView(this.K, w7.b6.o(-1, 50));
        org.telegram.ui.Cells.b9 b9Var5 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.L = b9Var5;
        b9Var5.setText(org.telegram.messenger.cd.L0(2131748907, null));
        ga0Var.addView(this.L);
        if (i10 == 1) {
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.I = x9Var;
            org.telegram.ui.ActionBar.a7.i(i14, x9Var, null);
            this.I.b(org.telegram.messenger.cd.L0(2131746040, null), false);
            org.telegram.ui.ActionBar.a7.V(this.I.getTextView(), org.telegram.ui.ActionBar.t6.p7, null);
            this.I.setOnClickListener(new f50(this, 5));
            ga0Var.addView(this.I);
        }
        w8Var.addView(this.J, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, frameLayout, getResourceProvider());
        new vh.r2(w8Var, false, new ag.z0(16));
        w8Var.addView(this.H, w7.b6.e(-1, -2, 80));
        org.telegram.ui.ActionBar.a7.i(i14, this.y, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.d, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.x, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.E, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.c, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.F, null);
        org.telegram.ui.ActionBar.a7.i(i14, this.K, null);
        org.telegram.ui.ActionBar.a7.V(this.F, i16, null);
        org.telegram.ui.ActionBar.a7.E(this.F, i15, null);
        org.telegram.ui.ActionBar.a7.V(this.x, i16, null);
        org.telegram.ui.ActionBar.a7.E(this.x, i15, null);
        this.F.setCursorVisible(false);
        c0(this.e);
        w8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        ga0Var.setClipChildren(false);
        return w8Var;
    }

    public final void d0(boolean z10) {
        this.E.setVisibility(z10 ? 0 : 8);
        this.c.setVisibility(z10 ? 0 : 8);
        this.F.setVisibility(z10 ? 0 : 8);
        this.G.setVisibility(z10 ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.in0 getScrollViewForSimpleGlass() {
        return this.J;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
