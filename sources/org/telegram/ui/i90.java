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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i90 extends org.telegram.ui.ActionBar.e2 {
    public org.telegram.ui.Cells.y8 E;
    public org.telegram.ui.Cells.n4 F;
    public d90 G;
    public org.telegram.ui.Cells.y8 H;
    public FrameLayout I;
    public org.telegram.ui.Cells.v9 J;
    public org.telegram.ui.Components.lm0 K;
    public d90 L;
    public org.telegram.ui.Cells.y8 M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public h90 T;
    public org.telegram.ui.ActionBar.t1 U;
    public boolean V;
    public int W;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.wt0 c;
    public org.telegram.ui.Components.wt0 d;
    public TLRPC.TL_chatInviteExported e;
    public f90 f;
    public org.telegram.ui.Cells.y8 h;
    public org.telegram.ui.Cells.q8 n;
    public g90 r;
    public TextView s;
    public org.telegram.ui.Cells.y8 w;
    public TextView x;
    public org.telegram.ui.Cells.n4 y;

    public i90(int i7, long j3) {
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
        this.x.setText(org.telegram.messenger.hd.s(j3, false));
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
                strArr[i13] = org.telegram.messenger.hd.M0(2131748202, null);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[0]) {
                strArr[i13] = org.telegram.messenger.hd.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[1]) {
                strArr[i13] = org.telegram.messenger.hd.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[2]) {
                strArr[i13] = org.telegram.messenger.hd.G(1, "Weeks", new Object[0]);
            } else {
                long j10 = currentTime;
                if (j10 < 86400) {
                    strArr[i13] = org.telegram.messenger.hd.M0(2131748531, null);
                } else if (j10 < 31449600) {
                    strArr[i13] = org.telegram.messenger.hd.E0().w0().format(1000 * j3);
                } else {
                    strArr[i13] = org.telegram.messenger.hd.E0().C0().format(1000 * j3);
                }
            }
        }
        this.d.b(i11, null, strArr);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
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
                strArr[i14] = org.telegram.messenger.hd.M0(2131748202, null);
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
                this.c.b(3, null, "1", "10", "100", org.telegram.messenger.hd.M0(2131748202, null));
                return;
            }
            i7 = com.google.android.gms.internal.vision.e2.f(iArr[i7], i7, 1, arrayList);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        float f10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i7 = this.a;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748272, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751277, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 12));
        this.simpleActionBar.q(org.telegram.messenger.hd.M0(i7 == 0 ? 2131751753 : 2131745946, null));
        c90 c90Var = new c90(this, context);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, c90Var, this.resourceProvider, true);
        this.K = lm0Var;
        lm0Var.setDrawBackground(true);
        this.K.setOverScrollMode(0);
        v8 v8Var = new v8(6, context, this);
        this.fragmentView = v8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        layoutTransition.setInterpolator(2, erVar);
        layoutTransition.setInterpolator(0, erVar);
        layoutTransition.setInterpolator(4, erVar);
        layoutTransition.setInterpolator(1, erVar);
        int i10 = 3;
        layoutTransition.setInterpolator(3, erVar);
        c90Var.setLayoutTransition(layoutTransition);
        c90Var.setOrientation(1);
        c90Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(91.0f));
        this.K.addView(c90Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        this.y = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131748982, null));
        c90Var.addView(this.y);
        org.telegram.ui.Components.wt0 wt0Var = new org.telegram.ui.Components.wt0(context, null);
        this.d = wt0Var;
        c90Var.addView(wt0Var);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.x.setGravity(16);
        this.x.setTextSize(1, 16.0f);
        this.x.setHint(org.telegram.messenger.hd.M0(2131744139, null));
        this.x.setOnClickListener(new org.telegram.ui.Components.vv0(29, this, context));
        this.d.setCallback(new x80(this, 2));
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
        this.d.b(3, null, org.telegram.messenger.hd.G(1, "Hours", new Object[0]), org.telegram.messenger.hd.G(1, "Days", new Object[0]), org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.M0(2131748202, null));
        c90Var.addView(this.x, c8.ja.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.E = y8Var;
        y8Var.setText(org.telegram.messenger.hd.M0(2131744140, null));
        c90Var.addView(this.E);
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
        this.F = n4Var2;
        n4Var2.setText(org.telegram.messenger.hd.M0(2131748980, null));
        c90Var.addView(this.F);
        org.telegram.ui.Components.wt0 wt0Var2 = new org.telegram.ui.Components.wt0(context, null);
        this.c = wt0Var2;
        wt0Var2.setCallback(new x80(this, i10));
        c0();
        c90Var.addView(this.c);
        d90 d90Var = new d90(context, 0);
        this.G = d90Var;
        d90Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.G.setGravity(16);
        this.G.setTextSize(1, 16.0f);
        this.G.setHint(org.telegram.messenger.hd.M0(2131743620, null));
        this.G.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.G.setInputType(2);
        this.G.addTextChangedListener(new e90(this, 0));
        c90Var.addView(this.G, c8.ja.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.H = y8Var2;
        y8Var2.setText(org.telegram.messenger.hd.M0(2131743621, null));
        c90Var.addView(this.H);
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.b;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        boolean z10 = (!org.telegram.messenger.t3.t0(M0) || M0.join_request || M0.join_to_send) ? false : true;
        f90 f90Var = new f90(context);
        this.f = f90Var;
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.q6.h(i12, f90Var, null);
        this.f.setTag(Integer.valueOf(i12));
        this.f.f(org.telegram.messenger.hd.M0(2131754207, null), false, false);
        this.f.setOnClickListener(new fi.x1(6, this, z10));
        c90Var.addView(this.f, c8.ja.o(-1, 56));
        org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.h = y8Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(org.telegram.messenger.hd.M0(2131754181, null));
        } else {
            y8Var3.setText(org.telegram.messenger.hd.M0(2131754202, null));
        }
        c90Var.addView(this.h);
        int i13 = 5;
        if (M0 == null || M0.username == null) {
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.currentAccount).N0(j3);
            f10 = -1.0f;
            if ((this.e == null && org.telegram.messenger.t3.V(org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(j3))) && N0 != null && N0.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
                this.n = q8Var;
                org.telegram.ui.ActionBar.q6.h(i12, q8Var, null);
                this.n.setDrawCheckRipple(true);
                int i14 = 0;
                this.n.f(org.telegram.messenger.hd.M0(2131746159, null), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new a90(i14, this, new Runnable[1]));
                c90Var.addView(this.n, c8.ja.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(this.s, org.telegram.ui.ActionBar.j6.A6, null);
                g90 g90Var = new g90(this, context, org.telegram.messenger.hd.M0(getConnectionsManager().isTestBackend() ? 2131746153 : 2131746154, null), this.resourceProvider);
                this.r = g90Var;
                g90Var.d.setInputType(2);
                this.r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.q6.h(i12, this.r, getResourceProvider());
                g90 g90Var2 = this.r;
                g90Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(g90Var2, i13);
                org.telegram.ui.Cells.i3 i3Var = g90Var2.d;
                i3Var.setImeOptions(6);
                i3Var.setOnEditorActionListener(new m.r2(fVar, 2));
                this.r.addView(this.s, c8.ja.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                g90 g90Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                g90Var3.getClass();
                ImageView imageView = new ImageView(g90Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                g90Var3.addView(imageView, c8.ja.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.i3 i3Var2 = g90Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.g0.L(24.0f);
                i3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.g0.L(1.0f));
                c90Var.addView(this.r, c8.ja.o(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
                this.w = y8Var4;
                if (this.e != null) {
                    y8Var4.setText(org.telegram.messenger.hd.M0(2131746157, null));
                } else {
                    y8Var4.setText(org.telegram.messenger.g0.c4(org.telegram.messenger.hd.M0(2131746158, null), new b90(this, 0)));
                }
                c90Var.addView(this.w, c8.ja.o(-1, -2));
            }
        } else {
            f10 = -1.0f;
        }
        d90 d90Var2 = new d90(context, 1);
        this.L = d90Var2;
        d90Var2.addTextChangedListener(new e90(this, 1));
        this.L.setCursorVisible(false);
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.L.setGravity(16);
        this.L.setHint(org.telegram.messenger.hd.M0(2131748896, null));
        d90 d90Var3 = this.L;
        int i15 = org.telegram.ui.ActionBar.j6.y6;
        org.telegram.ui.ActionBar.q6.D(d90Var3, i15, null);
        this.L.setLines(1);
        this.L.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.L.setSingleLine();
        d90 d90Var4 = this.L;
        int i16 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(d90Var4, i16, null);
        this.L.setTextSize(1, 16.0f);
        c90Var.addView(this.L, c8.ja.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.M = y8Var5;
        y8Var5.setText(org.telegram.messenger.hd.M0(2131748897, null));
        c90Var.addView(this.M);
        if (i7 == 1) {
            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
            this.J = v9Var;
            org.telegram.ui.ActionBar.q6.h(i12, v9Var, null);
            this.J.b(org.telegram.messenger.hd.M0(2131746023, null), false);
            org.telegram.ui.ActionBar.q6.U(this.J.getTextView(), org.telegram.ui.ActionBar.j6.p7, null);
            this.J.setOnClickListener(new g40(this, i13));
            c90Var.addView(this.J);
        }
        v8Var.addView(this.K, c8.ja.c(f10, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, frameLayout, getResourceProvider());
        new hi.p3(v8Var, false, new fi.e(18));
        v8Var.addView(this.I, c8.ja.e(-1, -2, 80));
        org.telegram.ui.ActionBar.q6.h(i12, this.y, null);
        org.telegram.ui.ActionBar.q6.h(i12, this.d, null);
        org.telegram.ui.ActionBar.q6.h(i12, this.x, null);
        org.telegram.ui.ActionBar.q6.h(i12, this.F, null);
        org.telegram.ui.ActionBar.q6.h(i12, this.c, null);
        org.telegram.ui.ActionBar.q6.h(i12, this.G, null);
        org.telegram.ui.ActionBar.q6.h(i12, this.L, null);
        org.telegram.ui.ActionBar.q6.U(this.G, i16, null);
        org.telegram.ui.ActionBar.q6.D(this.G, i15, null);
        org.telegram.ui.ActionBar.q6.U(this.x, i16, null);
        org.telegram.ui.ActionBar.q6.D(this.x, i15, null);
        this.G.setCursorVisible(false);
        d0(this.e);
        v8Var.setClipChildren(false);
        this.K.setClipChildren(false);
        c90Var.setClipChildren(false);
        return v8Var;
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
        f90 f90Var = this.f;
        if (f90Var != null) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, f90Var, null);
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        e0(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.j6.l(spannableStringBuilder, this.L.getPaint().getFontMetricsInt(), false);
            this.L.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.q8 q8Var = this.n;
        if (q8Var != null) {
            q8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            f90 f90Var2 = this.f;
            if (f90Var2 != null) {
                f90Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.y8 y8Var = this.h;
            if (y8Var != null) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131754201, null));
            }
        }
        g90 g90Var = this.r;
        if (g90Var != null) {
            g90Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void finishFragment() {
        this.K.getLayoutParams().height = this.K.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.lm0 getScrollViewForSimpleGlass() {
        return this.K;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
