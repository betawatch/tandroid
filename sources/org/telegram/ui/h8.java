package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h8 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.c2 H;
    public int I;
    public int J;
    public int K;
    public x7 L;
    public l2.f M;
    public un N;
    public org.telegram.ui.Components.q30 O;
    public int P;
    public int Q;
    public ValueAnimator R;
    public final SparseArray S;
    public boolean T;
    public int U;
    public int V;
    public int W;
    public final int X;
    public boolean Y;
    public final int Z;
    public w7 a;
    public final int a0;
    public ag.b1 b;
    public jg.a3 b0;
    public s4.a0 c;
    public int c0;
    public final TextPaint d;
    public boolean d0;
    public final TextPaint e;
    public int e0;
    public final TextPaint f;
    public th.x4 f0;
    public v7 g0;
    public TextView h;
    public int h0;
    public y0 i0;
    public kg.f0 j0;
    public View k0;
    public final Path l0;
    public final nh.i m0;
    public TextView n;
    public int n0;
    public boolean o0;
    public int p0;
    public int q0;
    public final Paint r;
    public int r0;
    public final Paint s;
    public bi.t0 w;
    public final Paint x;
    public long y;

    public h8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.x = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.l0 = new Path();
        this.m0 = new nh.i();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    public static /* synthetic */ void Y(h8 h8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = h8Var.S;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            for (int i10 = 0; i10 < tL_messages_searchResultsCalendar.periods.size(); i10++) {
                calendar.setTimeInMillis(tL_messages_searchResultsCalendar.periods.get(i10).date * 1000);
                int i11 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i11, sparseArray2);
                }
                f8 f8Var = new f8();
                f8Var.a = new org.telegram.messenger.jj(h8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = h8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                h8Var.U = i12;
                f8Var.c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((f8) sparseArray2.get(i13, null)).g) {
                    sparseArray2.put(i13, f8Var);
                }
                int i14 = h8Var.W;
                if (i11 < i14 || i14 == 0) {
                    h8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            h8Var.c0 = i15;
            while (true) {
                calendar.setTimeInMillis(i15 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                if (calendar.getTimeInMillis() / 1000 > currentTimeMillis) {
                    break;
                }
                int i16 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray3 = (SparseArray) sparseArray.get(i16);
                if (sparseArray3 == null) {
                    sparseArray3 = new SparseArray();
                    sparseArray.put(i16, sparseArray3);
                }
                int i17 = calendar.get(5) - 1;
                if (sparseArray3.get(i17, null) == null) {
                    f8 f8Var2 = new f8();
                    f8Var2.g = false;
                    f8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, f8Var2);
                }
                i15 += 86400;
            }
            h8Var.E = false;
            if (tL_messages_searchResultsCalendar.messages.isEmpty()) {
                h8Var.T = true;
            } else {
                h8Var.V = ((TLRPC.Message) i0.a.g(1, tL_messages_searchResultsCalendar.messages)).id;
                h8Var.T = false;
                h8Var.u0();
            }
            if (h8Var.Y) {
                h8Var.F = true;
            }
            h8Var.b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            h8Var.L.k(0, h8Var.K);
            int i18 = h8Var.K;
            if (timeInMillis > i18) {
                h8Var.L.o(i18 + 1, timeInMillis);
                h8Var.K = timeInMillis;
            }
            if (h8Var.T) {
                h8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static void g0(h8 h8Var) {
        if (h8Var.w == null) {
            return;
        }
        int measuredWidth = (int) (h8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (h8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        h8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.zs.K2));
        h8Var.w.setBackground(new BitmapDrawable(createBitmap));
        h8Var.w.setAlpha(0.0f);
        h8Var.w.setVisibility(0);
    }

    public final void A0() {
        String L0;
        org.telegram.ui.Components.q30 q30Var;
        if (!this.d0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752642, null));
            this.H.c(true, 0.0f);
            return;
        }
        int i10 = this.P;
        int i11 = this.Q;
        int abs = (i10 == i11 && i10 == 0) ? 0 : (Math.abs(i10 - i11) / 86400) + 1;
        boolean z10 = this.o0;
        int i12 = this.n0;
        if (abs == i12 && z10 == this.G) {
            return;
        }
        boolean z11 = i12 > abs;
        this.n0 = abs;
        boolean z12 = this.G;
        this.o0 = z12;
        if (abs > 0) {
            L0 = org.telegram.messenger.cd.G(abs, "Days", new Object[0]);
            this.H.c(true, 1.0f);
        } else if (z12) {
            L0 = org.telegram.messenger.cd.L0(2131745677, null);
            this.H.c(true, 1.0f);
        } else {
            L0 = org.telegram.messenger.cd.L0(2131752642, null);
            this.H.c(true, 0.0f);
        }
        String str = L0;
        if (abs > 1) {
            this.n.setText(org.telegram.messenger.cd.a0("ClearHistoryForTheseDays", null, 2131752087, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.n.setText(org.telegram.messenger.cd.a0("ClearHistoryForThisDay", null, 2131752086, new Object[0]));
        }
        this.b0.a((abs > 0 || this.G) ? this.n : this.h, true);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        i5Var.getClass();
        i5Var.B(str, z11, 150L, org.telegram.ui.Components.gr.h);
        if ((!this.G || abs > 0) && (q30Var = this.O) != null) {
            q30Var.b(true);
        }
        if (abs > 0 || this.G) {
            if (this.n.getVisibility() == 8) {
                this.n.setAlpha(0.0f);
                this.n.setTranslationY(-org.telegram.messenger.i0.L(20.0f));
            }
            this.n.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.n.animate().setListener(null).cancel();
            this.h.animate().alpha(0.0f).translationY(org.telegram.messenger.i0.L(20.0f)).setDuration(150L).setListener(new eg.m(this.h)).start();
            this.n.animate().alpha(abs == 0 ? 0.5f : 1.0f).translationY(0.0f).start();
            this.h.setEnabled(false);
            this.n.setEnabled(true);
            return;
        }
        if (this.h.getVisibility() == 8) {
            this.h.setAlpha(0.0f);
            this.h.setTranslationY(org.telegram.messenger.i0.L(20.0f));
        }
        this.h.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.n.animate().setListener(null).cancel();
        this.h.animate().alpha(1.0f).translationY(0.0f).start();
        this.n.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(20.0f)).setDuration(150L).setListener(new eg.m(this.n)).start();
        this.h.setEnabled(true);
        this.n.setEnabled(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        float L = org.telegram.messenger.i0.L(16.0f);
        TextPaint textPaint = this.d;
        textPaint.setTextSize(L);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        float L2 = org.telegram.messenger.i0.L(11.0f);
        TextPaint textPaint2 = this.f;
        textPaint2.setTextSize(L2);
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        float L3 = org.telegram.messenger.i0.L(16.0f);
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(L3);
        textPaint3.setTypeface(org.telegram.messenger.i0.o());
        textPaint3.setTextAlign(align);
        w7 w7Var = new w7(this, context);
        this.a = w7Var;
        w7Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.a7));
        this.a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752642, null));
        ag.b1 b1Var = new ag.b1(this, context, 3);
        this.b = b1Var;
        s4.a0 a0Var = new s4.a0();
        this.c = a0Var;
        b1Var.setLayoutManager(a0Var);
        final int i10 = 1;
        this.c.k1(true);
        ag.b1 b1Var2 = this.b;
        final int i11 = 0;
        x7 x7Var = new x7(this, i11);
        this.L = x7Var;
        b1Var2.setAdapter(x7Var);
        this.b.j(new h3(this, 4));
        boolean z10 = this.e0 == 0 && this.d0;
        this.a.addView(this.b, w7.b6.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z10 ? 48.0f : 0.0f));
        kg.f0 f0Var = new kg.f0(this, context, new String[]{org.telegram.messenger.cd.L0(2131752640, null), org.telegram.messenger.cd.L0(2131752636, null), org.telegram.messenger.cd.L0(2131752635, null), org.telegram.messenger.cd.L0(2131752637, null), org.telegram.messenger.cd.L0(2131752641, null), org.telegram.messenger.cd.L0(2131752639, null), org.telegram.messenger.cd.L0(2131752638, null)}, i10);
        this.j0 = f0Var;
        f0Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        kg.f0 f0Var2 = this.j0;
        vg.f c10 = getBaseSimpleGlass().c.c(this.j0, null, false);
        c10.o(w7.b9.m(this.resourceProvider));
        c10.p(org.telegram.messenger.i0.L(9.66f));
        c10.q(org.telegram.messenger.i0.L(18.0f));
        f0Var2.setBackground(c10);
        this.j0.setTranslationY(ei.b.d(0) - org.telegram.messenger.i0.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 17));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i12 = calendar.get(2);
        this.J = i12;
        int i13 = this.Z;
        if (i13 != 0) {
            int e = i0.a.e(this.I, i13, 12, i12) - this.a0;
            this.K = e + 1;
            this.c.h1(e, org.telegram.messenger.i0.L(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.H = c2Var;
        this.simpleActionBar.setBackButtonDrawable(c2Var);
        this.H.c(false, 0.0f);
        w0();
        x0();
        textPaint3.setColor(-1);
        if (z10) {
            this.b0 = new jg.a3(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(org.telegram.messenger.i0.o());
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u7
                public final /* synthetic */ h8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            h8 h8Var = this.b;
                            h8Var.G = true;
                            h8Var.A0();
                            break;
                        default:
                            h8 h8Var2 = this.b;
                            int i14 = h8Var2.n0;
                            if (i14 != 0) {
                                org.telegram.ui.Components.s4.q(h8Var2, i14, h8Var2.getMessagesController().Z1(Long.valueOf(h8Var2.y)), null, false, new v7(h8Var2), null);
                                break;
                            } else {
                                if (h8Var2.O == null) {
                                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(h8Var2.a.getContext(), 8);
                                    h8Var2.O = q30Var;
                                    q30Var.setExtraTranslationY(org.telegram.messenger.i0.L(24.0f));
                                    h8Var2.a.addView(h8Var2.O, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    h8Var2.O.setText(org.telegram.messenger.cd.L0(2131745676, null));
                                }
                                h8Var2.O.f(h8Var2.b0, true);
                                break;
                            }
                    }
                }
            });
            this.h.setText(org.telegram.messenger.cd.L0(2131745677, null));
            this.b0.addView(this.h, w7.b6.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
            this.n.setSingleLine();
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(org.telegram.messenger.i0.o());
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u7
                public final /* synthetic */ h8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            h8 h8Var = this.b;
                            h8Var.G = true;
                            h8Var.A0();
                            break;
                        default:
                            h8 h8Var2 = this.b;
                            int i14 = h8Var2.n0;
                            if (i14 != 0) {
                                org.telegram.ui.Components.s4.q(h8Var2, i14, h8Var2.getMessagesController().Z1(Long.valueOf(h8Var2.y)), null, false, new v7(h8Var2), null);
                                break;
                            } else {
                                if (h8Var2.O == null) {
                                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(h8Var2.a.getContext(), 8);
                                    h8Var2.O = q30Var;
                                    q30Var.setExtraTranslationY(org.telegram.messenger.i0.L(24.0f));
                                    h8Var2.a.addView(h8Var2.O, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    h8Var2.O.setText(org.telegram.messenger.cd.L0(2131745676, null));
                                }
                                h8Var2.O.f(h8Var2.b0, true);
                                break;
                            }
                    }
                }
            });
            this.n.setVisibility(8);
            this.b0.addView(this.n, w7.b6.e(-2, 38, 17));
            this.a.addView(this.b0, w7.b6.e(-1, 50, 80));
            this.b0.a(this.h, false);
            int L4 = org.telegram.messenger.i0.L(19.0f);
            TextView textView3 = this.h;
            int i14 = org.telegram.ui.ActionBar.t6.pf;
            org.telegram.ui.ActionBar.a7.R(textView3, org.telegram.ui.ActionBar.t6.a0(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i14, false), 51), L4, L4), null, org.telegram.ui.ActionBar.a7.h(i14, 51), null);
            TextView textView4 = this.n;
            int i15 = org.telegram.ui.ActionBar.t6.q7;
            org.telegram.ui.ActionBar.a7.R(textView4, org.telegram.ui.ActionBar.t6.a0(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i15, false), 51), L4, L4), null, org.telegram.ui.ActionBar.a7.h(i15, 51), null);
            org.telegram.ui.ActionBar.a7.V(this.h, i14, null);
            org.telegram.ui.ActionBar.a7.V(this.n, i15, null);
        }
        View view = new View(context);
        this.k0 = view;
        this.a.addView(view, w7.b6.e(-1, 0, 48));
        this.k0.getLayoutParams().height = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.addView(this.j0, w7.b6.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.x5 && this.f0 == ((th.x4) objArr[0])) {
            y0();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.t6.a;
        int i11 = org.telegram.ui.ActionBar.t6.a;
        int i12 = org.telegram.ui.ActionBar.t6.a;
        return super.getThemeDescriptions();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!this.G) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.G = false;
            this.Q = 0;
            this.P = 0;
            A0();
            t0();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.y = getArguments().getLong("dialog_id");
        this.D = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.e0 = i10;
        if (i10 == 2) {
            this.f0 = org.telegram.messenger.vp.r1(this.currentAccount).O1().A(0, -1, this.y, true);
        } else if (i10 == 3) {
            this.f0 = org.telegram.messenger.vp.r1(this.currentAccount).O1().A(1, -1, this.y, true);
        }
        th.x4 x4Var = this.f0;
        if (x4Var != null) {
            this.g0 = new v7(this);
        }
        if (this.y >= 0) {
            this.d0 = true;
        } else {
            this.d0 = false;
        }
        if (x4Var != null) {
            org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.x5);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f0 != null) {
            org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.x5);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.k0.getLayoutParams().height = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11;
        this.j0.setTranslationY(ei.b.d(i11) - org.telegram.messenger.i0.L(9.66f));
        v0(i11, i13);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar == null || this.H == null || this.d == null || this.f == null || this.e == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false);
        if (x02 == this.p0 && x03 == this.q0 && x04 == this.r0) {
            return;
        }
        this.p0 = x02;
        this.q0 = x03;
        this.r0 = x04;
        x0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.t0 t0Var;
        if (z10 && (t0Var = this.w) != null && t0Var.getVisibility() == 0) {
            this.w.setVisibility(8);
            this.w.setBackground(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        bi.t0 t0Var = this.w;
        if (t0Var == null || t0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.w.setAlpha(1.0f - f7);
        } else {
            this.w.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.Y = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.k0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.c cVar = this.mSystemInsets;
        v0(cVar.b, cVar.d);
    }

    public final void t0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.gr.f);
        duration.addUpdateListener(new a3(this, 2));
        duration.addListener(new bg.e(this, 29));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            z0((e8) this.b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.b.getCachedChildCount(); i11++) {
            e8 e8Var = (e8) this.b.P(i11);
            z0(e8Var, false);
            e8.a(e8Var, this.P, this.Q);
            e8.b(e8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.b.getHiddenChildCount(); i12++) {
            e8 e8Var2 = (e8) this.b.V(i12);
            z0(e8Var2, false);
            e8.a(e8Var2, this.P, this.Q);
            e8.b(e8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.b.getAttachedScrapChildCount(); i13++) {
            e8 e8Var3 = (e8) this.b.O(i13);
            z0(e8Var3, false);
            e8.a(e8Var3, this.P, this.Q);
            e8.b(e8Var3, 1.0f);
        }
    }

    public final void u0() {
        if (this.E || this.T) {
            return;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            View childAt = this.b.getChildAt(i11);
            if (childAt instanceof e8) {
                e8 e8Var = (e8) childAt;
                int i12 = (e8Var.b * 100) + e8Var.c;
                if (i12 < i10) {
                    i10 = i12;
                }
            }
        }
        int i13 = this.W;
        if ((i13 % 100) + ((i13 / 100) * 12) + 3 >= (i10 % 100) + ((i10 / 100) * 12)) {
            w0();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(int i10, int i11) {
        ei.b.e(this.b, i10, i11, org.telegram.messenger.i0.L(42.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), this.b0 != null ? org.telegram.messenger.i0.L(50.0f) : 0);
        jg.a3 a3Var = this.b0;
        if (a3Var != null) {
            a3Var.setTranslationY((-i11) - org.telegram.messenger.i0.L(6.0f));
        }
    }

    public final void w0() {
        if (this.E || this.T) {
            return;
        }
        if (this.f0 != null) {
            y0();
            this.f0.p(100, false);
            this.E = this.f0.k();
            return;
        }
        this.E = true;
        TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
        int i10 = this.X;
        if (i10 == 1) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
        } else if (i10 == 2) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
        } else {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
        }
        tL_messages_getSearchResultsCalendar.peer = getMessagesController().i1(this.y);
        if (this.D != 0 && this.y == getUserConfig().e()) {
            tL_messages_getSearchResultsCalendar.flags |= 4;
            tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().i1(this.D);
        }
        tL_messages_getSearchResultsCalendar.offset_id = this.V;
        Calendar calendar = Calendar.getInstance();
        this.b.setItemAnimator(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new ag.k0(12, this, calendar));
    }

    public final void x0() {
        this.e.setColor(-1);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.H.a(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
    }

    public final void y0() {
        this.E = this.f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.c0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < this.f0.i.size(); i10++) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.f0.i.get(i10);
            this.c0 = Math.min(this.c0, jjVar.k.date);
            calendar.setTimeInMillis(jjVar.k.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            f8 f8Var = (f8) sparseArray2.get(i12);
            if (f8Var == null) {
                f8Var = new f8();
                f8Var.b = new ArrayList();
            }
            f8Var.b.add(Integer.valueOf(jjVar.f1()));
            f8Var.a = jjVar;
            f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, f8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.c0; i14 < currentTimeMillis; i14 += 86400) {
            calendar.setTimeInMillis(i14 * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i15 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray3 = (SparseArray) sparseArray.get(i15);
            if (sparseArray3 == null) {
                sparseArray3 = new SparseArray();
                sparseArray.put(i15, sparseArray3);
            }
            int i16 = calendar.get(5) - 1;
            if (sparseArray3.get(i16, null) == null) {
                f8 f8Var2 = new f8();
                f8Var2.g = false;
                f8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, f8Var2);
            }
        }
        this.T = this.f0.r;
        if (this.Y) {
            this.F = true;
        }
        this.b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.c0) / 2629800)) + 1;
        this.L.k(0, this.K);
        int i17 = this.K;
        if (timeInMillis > i17) {
            this.L.o(i17 + 1, timeInMillis);
            this.K = timeInMillis;
        }
        if (this.T) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void z0(e8 e8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P == 0 || this.Q == 0) {
            SparseArray sparseArray = e8Var.x;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                e8Var.c(sparseArray.keyAt(i12), 0, 0, false, z10);
            }
            return;
        }
        if (e8Var.n == null) {
            return;
        }
        if (!z10) {
            SparseArray sparseArray2 = e8Var.x;
            for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
                e8Var.c(sparseArray2.keyAt(i13), 0, 0, false, false);
            }
        }
        int i14 = e8Var.e;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        for (int i18 = 0; i18 < e8Var.d; i18++) {
            f8 f8Var = (f8) e8Var.n.get(i18, null);
            if (f8Var != null && (i11 = f8Var.h) >= this.P && i11 <= this.Q) {
                if (i15 == -1) {
                    i15 = i14;
                }
                i16 = i14;
            }
            i14++;
            if (i14 >= 7) {
                if (i15 == -1 || i16 == -1) {
                    i10 = i17;
                    e8Var.c(i10, 0, 0, false, z10);
                } else {
                    i10 = i17;
                    e8Var.c(i10, i15, i16, true, z10);
                }
                i17 = i10 + 1;
                i15 = -1;
                i16 = -1;
                i14 = 0;
            }
        }
        int i19 = i17;
        if (i15 == -1 || i16 == -1) {
            e8Var.c(i19, 0, 0, false, z10);
        } else {
            e8Var.c(i19, i15, i16, true, z10);
        }
    }
}
