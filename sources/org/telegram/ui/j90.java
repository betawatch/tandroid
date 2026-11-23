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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j90 extends org.telegram.ui.ActionBar.g2 {
    public org.telegram.ui.Cells.z8 E;
    public org.telegram.ui.Cells.o4 F;
    public e90 G;
    public org.telegram.ui.Cells.z8 H;
    public FrameLayout I;
    public org.telegram.ui.Cells.w9 J;
    public org.telegram.ui.Components.vm0 K;
    public e90 L;
    public org.telegram.ui.Cells.z8 M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public i90 T;
    public org.telegram.ui.ActionBar.t1 U;
    public boolean V;
    public int W;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.gu0 c;
    public org.telegram.ui.Components.gu0 d;
    public TLRPC.TL_chatInviteExported e;
    public g90 f;
    public org.telegram.ui.Cells.z8 h;
    public org.telegram.ui.Cells.r8 n;
    public h90 r;
    public TextView s;
    public org.telegram.ui.Cells.z8 w;
    public TextView x;
    public org.telegram.ui.Cells.o4 y;

    public j90(int i7, long j3) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.a = i7;
        this.b = j3;
    }

    public final void a0(int i7) {
        int[] iArr;
        long j3 = i7;
        this.x.setText(org.telegram.messenger.gd.s(j3, false));
        int currentTime = i7 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            iArr = this.Q;
            if (i10 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i10]) {
                arrayList.add(Integer.valueOf(currentTime));
                i11 = i10;
                z10 = true;
            }
            i10 = com.google.android.gms.internal.vision.e2.f(iArr[i10], i10, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i11 = iArr.length;
        }
        int size = arrayList.size();
        int i12 = size + 1;
        String[] strArr = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == size) {
                strArr[i13] = org.telegram.messenger.gd.N0(2131748009, null);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[0]) {
                strArr[i13] = org.telegram.messenger.gd.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[1]) {
                strArr[i13] = org.telegram.messenger.gd.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[2]) {
                strArr[i13] = org.telegram.messenger.gd.G(1, "Weeks", new Object[0]);
            } else {
                long j10 = currentTime;
                if (j10 < 86400) {
                    strArr[i13] = org.telegram.messenger.gd.N0(2131748338, null);
                } else if (j10 < 31449600) {
                    strArr[i13] = org.telegram.messenger.gd.E0().w0().format(1000 * j3);
                } else {
                    strArr[i13] = org.telegram.messenger.gd.E0().C0().format(1000 * j3);
                }
            }
        }
        this.d.b(i11, null, strArr);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
    }

    public final void b0(int i7) {
        int[] iArr;
        int i10;
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.S;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && i7 <= (i10 = iArr[i11])) {
                if (i7 != i10) {
                    arrayList.add(Integer.valueOf(i7));
                }
                i12 = i11;
                z10 = true;
            }
            i11 = com.google.android.gms.internal.vision.e2.f(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i7));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = org.telegram.messenger.gd.N0(2131748009, null);
            } else {
                strArr[i14] = ((Integer) arrayList.get(i14)).toString();
            }
        }
        this.c.b(i12, null, strArr);
    }

    public final void c0() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            int[] iArr = this.S;
            if (i7 >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", org.telegram.messenger.gd.N0(2131748009, null));
                return;
            }
            i7 = com.google.android.gms.internal.vision.e2.f(iArr[i7], i7, 1, arrayList);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        float f10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i7 = this.a;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748079, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131751265, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 14));
        this.simpleActionBar.s(org.telegram.messenger.gd.N0(i7 == 0 ? 2131751741 : 2131745750, null));
        d90 d90Var = new d90(this, context);
        org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0(context, d90Var, this.resourceProvider, true);
        this.K = vm0Var;
        vm0Var.setDrawBackground(true);
        this.K.setOverScrollMode(0);
        w8 w8Var = new w8(6, context, this);
        this.fragmentView = w8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        layoutTransition.setInterpolator(2, krVar);
        layoutTransition.setInterpolator(0, krVar);
        layoutTransition.setInterpolator(4, krVar);
        layoutTransition.setInterpolator(1, krVar);
        int i10 = 3;
        layoutTransition.setInterpolator(3, krVar);
        d90Var.setLayoutTransition(layoutTransition);
        d90Var.setOrientation(1);
        d90Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(91.0f));
        this.K.addView(d90Var);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
        this.y = o4Var;
        o4Var.setText(org.telegram.messenger.gd.N0(2131748789, null));
        d90Var.addView(this.y);
        org.telegram.ui.Components.gu0 gu0Var = new org.telegram.ui.Components.gu0(context, null);
        this.d = gu0Var;
        d90Var.addView(gu0Var);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.x.setGravity(16);
        this.x.setTextSize(1, 16.0f);
        this.x.setHint(org.telegram.messenger.gd.N0(2131743894, null));
        this.x.setOnClickListener(new org.telegram.ui.Components.p31(23, this, context));
        this.d.setCallback(new z80(this, 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i11 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i11 >= iArr.length) {
                break;
            }
            i11 = com.google.android.gms.internal.vision.e2.f(iArr[i11], i11, 1, arrayList);
        }
        this.d.b(3, null, org.telegram.messenger.gd.G(1, "Hours", new Object[0]), org.telegram.messenger.gd.G(1, "Days", new Object[0]), org.telegram.messenger.gd.G(1, "Weeks", new Object[0]), org.telegram.messenger.gd.N0(2131748009, null));
        d90Var.addView(this.x, c8.na.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.E = z8Var;
        z8Var.setText(org.telegram.messenger.gd.N0(2131743895, null));
        d90Var.addView(this.E);
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context);
        this.F = o4Var2;
        o4Var2.setText(org.telegram.messenger.gd.N0(2131748787, null));
        d90Var.addView(this.F);
        org.telegram.ui.Components.gu0 gu0Var2 = new org.telegram.ui.Components.gu0(context, null);
        this.c = gu0Var2;
        gu0Var2.setCallback(new z80(this, i10));
        c0();
        d90Var.addView(this.c);
        e90 e90Var = new e90(context, 0);
        this.G = e90Var;
        e90Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.G.setGravity(16);
        this.G.setTextSize(1, 16.0f);
        this.G.setHint(org.telegram.messenger.gd.N0(2131743373, null));
        this.G.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.G.setInputType(2);
        this.G.addTextChangedListener(new f90(this, 0));
        d90Var.addView(this.G, c8.na.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.H = z8Var2;
        z8Var2.setText(org.telegram.messenger.gd.N0(2131743374, null));
        d90Var.addView(this.H);
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.b;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        boolean z10 = (!org.telegram.messenger.v3.t0(O0) || O0.join_request || O0.join_to_send) ? false : true;
        g90 g90Var = new g90(context);
        this.f = g90Var;
        int i12 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.u6.h(i12, g90Var, null);
        this.f.setTag(Integer.valueOf(i12));
        this.f.f(org.telegram.messenger.gd.N0(2131754204, null), false, false);
        this.f.setOnClickListener(new fi.v1(6, this, z10));
        d90Var.addView(this.f, c8.na.o(-1, 56));
        org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.h = z8Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(org.telegram.messenger.gd.N0(2131754178, null));
        } else {
            z8Var3.setText(org.telegram.messenger.gd.N0(2131754199, null));
        }
        d90Var.addView(this.h);
        int i13 = 5;
        if (O0 == null || O0.username == null) {
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.currentAccount).P0(j3);
            f10 = -1.0f;
            if ((this.e == null && org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(this.currentAccount).O0(Long.valueOf(j3))) && P0 != null && P0.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
                this.n = r8Var;
                org.telegram.ui.ActionBar.u6.h(i12, r8Var, null);
                this.n.setDrawCheckRipple(true);
                this.n.f(org.telegram.messenger.gd.N0(2131745963, null), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new org.telegram.ui.Components.p31(24, this, new Runnable[1]));
                d90Var.addView(this.n, c8.na.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(this.s, org.telegram.ui.ActionBar.n6.A6, null);
                h90 h90Var = new h90(this, context, org.telegram.messenger.gd.N0(getConnectionsManager().isTestBackend() ? 2131745957 : 2131745958, null), this.resourceProvider);
                this.r = h90Var;
                h90Var.d.setInputType(2);
                this.r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.u6.h(i12, this.r, getResourceProvider());
                h90 h90Var2 = this.r;
                h90Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(h90Var2, i13);
                org.telegram.ui.Cells.j3 j3Var = h90Var2.d;
                j3Var.setImeOptions(6);
                j3Var.setOnEditorActionListener(new m.r2(fVar, 2));
                this.r.addView(this.s, c8.na.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                h90 h90Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                h90Var3.getClass();
                ImageView imageView = new ImageView(h90Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                h90Var3.addView(imageView, c8.na.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.j3 j3Var2 = h90Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.g0.L(24.0f);
                j3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.g0.L(1.0f));
                d90Var.addView(this.r, c8.na.o(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
                this.w = z8Var4;
                if (this.e != null) {
                    z8Var4.setText(org.telegram.messenger.gd.N0(2131745961, null));
                } else {
                    z8Var4.setText(org.telegram.messenger.g0.b4(org.telegram.messenger.gd.N0(2131745962, null), new c90(this, 0)));
                }
                d90Var.addView(this.w, c8.na.o(-1, -2));
            }
        } else {
            f10 = -1.0f;
        }
        e90 e90Var2 = new e90(context, 1);
        this.L = e90Var2;
        e90Var2.addTextChangedListener(new f90(this, 1));
        this.L.setCursorVisible(false);
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.L.setGravity(16);
        this.L.setHint(org.telegram.messenger.gd.N0(2131748703, null));
        e90 e90Var3 = this.L;
        int i14 = org.telegram.ui.ActionBar.n6.y6;
        org.telegram.ui.ActionBar.u6.D(e90Var3, i14, null);
        this.L.setLines(1);
        this.L.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.L.setSingleLine();
        e90 e90Var4 = this.L;
        int i15 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(e90Var4, i15, null);
        this.L.setTextSize(1, 16.0f);
        d90Var.addView(this.L, c8.na.o(-1, 50));
        org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.M = z8Var5;
        z8Var5.setText(org.telegram.messenger.gd.N0(2131748704, null));
        d90Var.addView(this.M);
        if (i7 == 1) {
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.J = w9Var;
            org.telegram.ui.ActionBar.u6.h(i12, w9Var, null);
            this.J.b(org.telegram.messenger.gd.N0(2131745827, null), false);
            org.telegram.ui.ActionBar.u6.U(this.J.getTextView(), org.telegram.ui.ActionBar.n6.p7, null);
            this.J.setOnClickListener(new i40(this, i13));
            d90Var.addView(this.J);
        }
        w8Var.addView(this.K, c8.na.c(f10, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, frameLayout, getResourceProvider());
        new hi.x3(w8Var, false, new fi.e(19));
        w8Var.addView(this.I, c8.na.e(-1, -2, 80));
        org.telegram.ui.ActionBar.u6.h(i12, this.y, null);
        org.telegram.ui.ActionBar.u6.h(i12, this.d, null);
        org.telegram.ui.ActionBar.u6.h(i12, this.x, null);
        org.telegram.ui.ActionBar.u6.h(i12, this.F, null);
        org.telegram.ui.ActionBar.u6.h(i12, this.c, null);
        org.telegram.ui.ActionBar.u6.h(i12, this.G, null);
        org.telegram.ui.ActionBar.u6.h(i12, this.L, null);
        org.telegram.ui.ActionBar.u6.U(this.G, i15, null);
        org.telegram.ui.ActionBar.u6.D(this.G, i14, null);
        org.telegram.ui.ActionBar.u6.U(this.x, i15, null);
        org.telegram.ui.ActionBar.u6.D(this.x, i14, null);
        this.G.setCursorVisible(false);
        d0(this.e);
        w8Var.setClipChildren(false);
        this.K.setClipChildren(false);
        d90Var.setClipChildren(false);
        return w8Var;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.e = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i7 = tL_chatInviteExported.expire_date;
        if (i7 > 0) {
            a0(i7);
            this.W = ((Integer) this.P.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.W = 0;
        }
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            b0(i10);
            this.G.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        g90 g90Var = this.f;
        if (g90Var != null) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, g90Var, null);
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        e0(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.j6.l(spannableStringBuilder, this.L.getPaint().getFontMetricsInt(), false);
            this.L.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.r8 r8Var = this.n;
        if (r8Var != null) {
            r8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            g90 g90Var2 = this.f;
            if (g90Var2 != null) {
                g90Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.z8 z8Var = this.h;
            if (z8Var != null) {
                z8Var.setText(org.telegram.messenger.gd.N0(2131754198, null));
            }
        }
        h90 h90Var = this.r;
        if (h90Var != null) {
            h90Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.d.setClickable(false);
            this.r.d.setFocusable(false);
            this.r.d.setFocusableInTouchMode(false);
            this.r.d.setLongClickable(false);
        }
    }

    public final void e0(boolean z10) {
        this.F.setVisibility(z10 ? 0 : 8);
        this.c.setVisibility(z10 ? 0 : 8);
        this.G.setVisibility(z10 ? 0 : 8);
        this.H.setVisibility(z10 ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void finishFragment() {
        this.K.getLayoutParams().height = this.K.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.vm0 getScrollViewForSimpleGlass() {
        return this.K;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
