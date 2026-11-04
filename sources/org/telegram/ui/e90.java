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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e90 extends org.telegram.ui.ActionBar.d2 {
    public org.telegram.ui.Cells.y8 E;
    public org.telegram.ui.Cells.n4 F;
    public z80 G;
    public org.telegram.ui.Cells.y8 H;
    public FrameLayout I;
    public org.telegram.ui.Cells.v9 J;
    public org.telegram.ui.Components.km0 K;
    public z80 L;
    public org.telegram.ui.Cells.y8 M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public d90 T;
    public org.telegram.ui.ActionBar.s1 U;
    public boolean V;
    public int W;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.ut0 c;
    public org.telegram.ui.Components.ut0 d;
    public TLRPC.TL_chatInviteExported e;
    public b90 f;
    public org.telegram.ui.Cells.y8 h;
    public org.telegram.ui.Cells.q8 n;
    public c90 r;
    public TextView s;
    public org.telegram.ui.Cells.y8 w;
    public TextView x;
    public org.telegram.ui.Cells.n4 y;

    public e90(int i3, long j10) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.a = i3;
        this.b = j10;
    }

    public final void a0(int i3) {
        int[] iArr;
        long j10 = i3;
        this.x.setText(org.telegram.messenger.bd.s(j10, false));
        int currentTime = i3 - getConnectionsManager().getCurrentTime();
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
            i10 = com.google.android.recaptcha.internal.a.f(iArr[i10], i10, 1, arrayList);
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
                strArr[i13] = org.telegram.messenger.bd.M0(2131748210, null);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[0]) {
                strArr[i13] = org.telegram.messenger.bd.G(1, "Hours", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[1]) {
                strArr[i13] = org.telegram.messenger.bd.G(1, "Days", new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[2]) {
                strArr[i13] = org.telegram.messenger.bd.G(1, "Weeks", new Object[0]);
            } else {
                long j11 = currentTime;
                if (j11 < 86400) {
                    strArr[i13] = org.telegram.messenger.bd.M0(2131748539, null);
                } else if (j11 < 31449600) {
                    strArr[i13] = org.telegram.messenger.bd.E0().w0().format(1000 * j10);
                } else {
                    strArr[i13] = org.telegram.messenger.bd.E0().C0().format(1000 * j10);
                }
            }
        }
        this.d.b(i11, null, strArr);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    public final void b0(int i3) {
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
            if (!z10 && i3 <= (i10 = iArr[i11])) {
                if (i3 != i10) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i12 = i11;
                z10 = true;
            }
            i11 = com.google.android.recaptcha.internal.a.f(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i3));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = org.telegram.messenger.bd.M0(2131748210, null);
            } else {
                strArr[i14] = ((Integer) arrayList.get(i14)).toString();
            }
        }
        this.c.b(i12, null, strArr);
    }

    public final void c0() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            int[] iArr = this.S;
            if (i3 >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", org.telegram.messenger.bd.M0(2131748210, null));
                return;
            }
            i3 = com.google.android.recaptcha.internal.a.f(iArr[i3], i3, 1, arrayList);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i3 = this.a;
        if (i3 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748280, null));
        } else if (i3 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751278, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 12));
        this.simpleActionBar.n(org.telegram.messenger.bd.M0(i3 == 0 ? 2131751753 : 2131745956, null));
        y80 y80Var = new y80(this, context);
        org.telegram.ui.Components.km0 km0Var = new org.telegram.ui.Components.km0(context, y80Var, this.resourceProvider, true);
        this.K = km0Var;
        km0Var.setDrawBackground(true);
        this.K.setOverScrollMode(0);
        ai.h5 h5Var = new ai.h5(7, context, this);
        this.fragmentView = h5Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        layoutTransition.setInterpolator(2, xqVar);
        layoutTransition.setInterpolator(0, xqVar);
        layoutTransition.setInterpolator(4, xqVar);
        layoutTransition.setInterpolator(1, xqVar);
        int i10 = 3;
        layoutTransition.setInterpolator(3, xqVar);
        y80Var.setLayoutTransition(layoutTransition);
        y80Var.setOrientation(1);
        y80Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(91.0f));
        this.K.addView(y80Var);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        this.y = n4Var;
        n4Var.setText(org.telegram.messenger.bd.M0(2131748990, null));
        y80Var.addView(this.y);
        org.telegram.ui.Components.ut0 ut0Var = new org.telegram.ui.Components.ut0(context, null);
        this.d = ut0Var;
        y80Var.addView(ut0Var);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.x.setGravity(16);
        this.x.setTextSize(1, 16.0f);
        this.x.setHint(org.telegram.messenger.bd.M0(2131744149, null));
        this.x.setOnClickListener(new org.telegram.ui.Components.ux0(27, this, context));
        this.d.setCallback(new u80(this, 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i11 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i11 >= iArr.length) {
                break;
            }
            i11 = com.google.android.recaptcha.internal.a.f(iArr[i11], i11, 1, arrayList);
        }
        this.d.b(3, null, org.telegram.messenger.bd.G(1, "Hours", new Object[0]), org.telegram.messenger.bd.G(1, "Days", new Object[0]), org.telegram.messenger.bd.G(1, "Weeks", new Object[0]), org.telegram.messenger.bd.M0(2131748210, null));
        y80Var.addView(this.x, b8.mf.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.E = y8Var;
        y8Var.setText(org.telegram.messenger.bd.M0(2131744150, null));
        y80Var.addView(this.E);
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
        this.F = n4Var2;
        n4Var2.setText(org.telegram.messenger.bd.M0(2131748988, null));
        y80Var.addView(this.F);
        org.telegram.ui.Components.ut0 ut0Var2 = new org.telegram.ui.Components.ut0(context, null);
        this.c = ut0Var2;
        ut0Var2.setCallback(new u80(this, i10));
        c0();
        y80Var.addView(this.c);
        z80 z80Var = new z80(context, 0);
        this.G = z80Var;
        z80Var.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.G.setGravity(16);
        this.G.setTextSize(1, 16.0f);
        this.G.setHint(org.telegram.messenger.bd.M0(2131743630, null));
        this.G.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.G.setInputType(2);
        this.G.addTextChangedListener(new a90(this, 0));
        y80Var.addView(this.G, b8.mf.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.H = y8Var2;
        y8Var2.setText(org.telegram.messenger.bd.M0(2131743631, null));
        y80Var.addView(this.H);
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.b;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        boolean z10 = (!org.telegram.messenger.t3.t0(M0) || M0.join_request || M0.join_to_send) ? false : true;
        b90 b90Var = new b90(context);
        this.f = b90Var;
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i12, b90Var, null);
        this.f.setTag(Integer.valueOf(i12));
        this.f.f(org.telegram.messenger.bd.M0(2131754207, null), false, false);
        this.f.setOnClickListener(new ei.e2(7, this, z10));
        y80Var.addView(this.f, b8.mf.o(-1, 56));
        org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.h = y8Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(org.telegram.messenger.bd.M0(2131754181, null));
        } else {
            y8Var3.setText(org.telegram.messenger.bd.M0(2131754202, null));
        }
        y80Var.addView(this.h);
        if (M0 == null || M0.username == null) {
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.currentAccount).N0(j10);
            if ((this.e == null && org.telegram.messenger.t3.V(org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(j10))) && N0 != null && N0.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
                this.n = q8Var;
                org.telegram.ui.ActionBar.r6.i(i12, q8Var, null);
                this.n.setDrawCheckRipple(true);
                this.n.f(org.telegram.messenger.bd.M0(2131746169, null), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new org.telegram.ui.Components.ux0(28, this, new Runnable[1]));
                y80Var.addView(this.n, b8.mf.o(-1, 48));
                TextView textView2 = new TextView(context);
                this.s = textView2;
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(this.s, org.telegram.ui.ActionBar.k6.A6, null);
                c90 c90Var = new c90(this, context, org.telegram.messenger.bd.M0(getConnectionsManager().isTestBackend() ? 2131746163 : 2131746164, null), this.resourceProvider);
                this.r = c90Var;
                c90Var.d.setInputType(2);
                this.r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.r6.i(i12, this.r, getResourceProvider());
                c90 c90Var2 = this.r;
                c90Var2.getClass();
                org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(c90Var2, 4);
                org.telegram.ui.Cells.i3 i3Var = c90Var2.d;
                i3Var.setImeOptions(6);
                i3Var.setOnEditorActionListener(new m.r2(fVar, 2));
                this.r.addView(this.s, b8.mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                c90 c90Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                c90Var3.getClass();
                ImageView imageView = new ImageView(c90Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                c90Var3.addView(imageView, b8.mf.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.i3 i3Var2 = c90Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i3Var2.getLayoutParams();
                layoutParams.leftMargin = org.telegram.messenger.g0.L(24.0f);
                i3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
                imageView.setTranslationX(org.telegram.messenger.g0.L(1.0f));
                y80Var.addView(this.r, b8.mf.o(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
                this.w = y8Var4;
                if (this.e != null) {
                    y8Var4.setText(org.telegram.messenger.bd.M0(2131746167, null));
                } else {
                    y8Var4.setText(org.telegram.messenger.g0.d4(org.telegram.messenger.bd.M0(2131746168, null), new x80(this, 0)));
                }
                y80Var.addView(this.w, b8.mf.o(-1, -2));
            }
        }
        z80 z80Var2 = new z80(context, 1);
        this.L = z80Var2;
        z80Var2.addTextChangedListener(new a90(this, 1));
        this.L.setCursorVisible(false);
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.L.setGravity(16);
        this.L.setHint(org.telegram.messenger.bd.M0(2131748904, null));
        z80 z80Var3 = this.L;
        int i13 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.E(z80Var3, i13, null);
        this.L.setLines(1);
        this.L.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.L.setSingleLine();
        z80 z80Var4 = this.L;
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(z80Var4, i14, null);
        this.L.setTextSize(1, 16.0f);
        y80Var.addView(this.L, b8.mf.o(-1, 50));
        org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.M = y8Var5;
        y8Var5.setText(org.telegram.messenger.bd.M0(2131748905, null));
        y80Var.addView(this.M);
        if (i3 == 1) {
            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
            this.J = v9Var;
            org.telegram.ui.ActionBar.r6.i(i12, v9Var, null);
            this.J.b(org.telegram.messenger.bd.M0(2131746033, null), false);
            org.telegram.ui.ActionBar.r6.V(this.J.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
            this.J.setOnClickListener(new b40(this, 5));
            y80Var.addView(this.J);
        }
        h5Var.addView(this.K, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, getResourceProvider());
        new gi.p3(h5Var, false, new ei.e(17));
        h5Var.addView(this.I, b8.mf.e(-1, -2, 80));
        org.telegram.ui.ActionBar.r6.i(i12, this.y, null);
        org.telegram.ui.ActionBar.r6.i(i12, this.d, null);
        org.telegram.ui.ActionBar.r6.i(i12, this.x, null);
        org.telegram.ui.ActionBar.r6.i(i12, this.F, null);
        org.telegram.ui.ActionBar.r6.i(i12, this.c, null);
        org.telegram.ui.ActionBar.r6.i(i12, this.G, null);
        org.telegram.ui.ActionBar.r6.i(i12, this.L, null);
        org.telegram.ui.ActionBar.r6.V(this.G, i14, null);
        org.telegram.ui.ActionBar.r6.E(this.G, i13, null);
        org.telegram.ui.ActionBar.r6.V(this.x, i14, null);
        org.telegram.ui.ActionBar.r6.E(this.x, i13, null);
        this.G.setCursorVisible(false);
        d0(this.e);
        h5Var.setClipChildren(false);
        this.K.setClipChildren(false);
        y80Var.setClipChildren(false);
        return h5Var;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.e = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i3 = tL_chatInviteExported.expire_date;
        if (i3 > 0) {
            a0(i3);
            this.W = ((Integer) this.P.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.W = 0;
        }
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            b0(i10);
            this.G.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        b90 b90Var = this.f;
        if (b90Var != null) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, b90Var, null);
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        e0(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.i6.l(spannableStringBuilder, this.L.getPaint().getFontMetricsInt(), false);
            this.L.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.q8 q8Var = this.n;
        if (q8Var != null) {
            q8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            b90 b90Var2 = this.f;
            if (b90Var2 != null) {
                b90Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.y8 y8Var = this.h;
            if (y8Var != null) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131754201, null));
            }
        }
        c90 c90Var = this.r;
        if (c90Var != null) {
            c90Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
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

    @Override // org.telegram.ui.ActionBar.d2
    public final void finishFragment() {
        this.K.getLayoutParams().height = this.K.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.km0 getScrollViewForSimpleGlass() {
        return this.K;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
