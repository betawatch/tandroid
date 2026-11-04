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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i8 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public org.telegram.ui.ActionBar.w1 I;
    public int J;
    public int K;
    public int L;
    public y7 M;
    public org.telegram.ui.Components.nh N;
    public wm O;
    public gi.l3 P;
    public int Q;
    public int R;
    public ValueAnimator S;
    public final SparseArray T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public final int Y;
    public boolean Z;
    public x7 a;
    public final int a0;
    public ci.j1 b;
    public final int b0;
    public u4.b0 c;
    public ci.l1 c0;
    public final TextPaint d;
    public int d0;
    public final TextPaint e;
    public boolean e0;
    public final TextPaint f;
    public int f0;
    public ei.r6 g0;
    public TextView h;
    public w7 h0;
    public int i0;
    public x0 j0;
    public gi.n5 k0;
    public View l0;
    public final Path m0;
    public TextView n;
    public final yh.f n0;
    public int o0;
    public boolean p0;
    public int q0;
    public final Paint r;
    public int r0;
    public final Paint s;
    public int s0;
    public ai.x2 w;
    public final Paint x;
    public long y;

    public i8(int i3, int i10, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.x = new Paint(1);
        this.T = new SparseArray();
        this.V = 0;
        this.m0 = new Path();
        this.n0 = new yh.f();
        this.Y = i3;
        if (i10 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i10 * 1000);
            this.a0 = calendar.get(1);
            this.b0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public static /* synthetic */ void Z(i8 i8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = i8Var.T;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            for (int i3 = 0; i3 < tL_messages_searchResultsCalendar.periods.size(); i3++) {
                calendar.setTimeInMillis(tL_messages_searchResultsCalendar.periods.get(i3).date * 1000);
                int i10 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i10);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i10, sparseArray2);
                }
                g8 g8Var = new g8();
                g8Var.a = new org.telegram.messenger.zi(i8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i3), false, false);
                g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i11 = i8Var.V + tL_messages_searchResultsCalendar.periods.get(i3).count;
                i8Var.V = i11;
                g8Var.c = i11;
                int i12 = calendar.get(5) - 1;
                if (sparseArray2.get(i12, null) == null || !((g8) sparseArray2.get(i12, null)).g) {
                    sparseArray2.put(i12, g8Var);
                }
                int i13 = i8Var.X;
                if (i10 < i13 || i13 == 0) {
                    i8Var.X = i10;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i14 = tL_messages_searchResultsCalendar.min_date;
            i8Var.d0 = i14;
            while (true) {
                calendar.setTimeInMillis(i14 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                if (calendar.getTimeInMillis() / 1000 > currentTimeMillis) {
                    break;
                }
                int i15 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray3 = (SparseArray) sparseArray.get(i15);
                if (sparseArray3 == null) {
                    sparseArray3 = new SparseArray();
                    sparseArray.put(i15, sparseArray3);
                }
                int i16 = calendar.get(5) - 1;
                if (sparseArray3.get(i16, null) == null) {
                    g8 g8Var2 = new g8();
                    g8Var2.g = false;
                    g8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i16, g8Var2);
                }
                i14 += 86400;
            }
            i8Var.F = false;
            if (tL_messages_searchResultsCalendar.messages.isEmpty()) {
                i8Var.U = true;
            } else {
                i8Var.W = ((TLRPC.Message) k2.p1.h(1, tL_messages_searchResultsCalendar.messages)).id;
                i8Var.U = false;
                i8Var.v0();
            }
            if (i8Var.Z) {
                i8Var.G = true;
            }
            i8Var.b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            i8Var.M.k(0, i8Var.L);
            int i17 = i8Var.L;
            if (timeInMillis > i17) {
                i8Var.M.o(i17 + 1, timeInMillis);
                i8Var.L = timeInMillis;
            }
            if (i8Var.U) {
                i8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static void h0(i8 i8Var) {
        if (i8Var.w == null) {
            return;
        }
        int measuredWidth = (int) (i8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (i8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        i8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.hs.K2));
        i8Var.w.setBackground(new BitmapDrawable(createBitmap));
        i8Var.w.setAlpha(0.0f);
        i8Var.w.setVisibility(0);
    }

    public final void A0(f8 f8Var, boolean z10) {
        int i3;
        int i10;
        if (this.Q == 0 || this.R == 0) {
            SparseArray sparseArray = f8Var.x;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                f8Var.c(sparseArray.keyAt(i11), 0, 0, false, z10);
            }
            return;
        }
        if (f8Var.n == null) {
            return;
        }
        if (!z10) {
            SparseArray sparseArray2 = f8Var.x;
            for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
                f8Var.c(sparseArray2.keyAt(i12), 0, 0, false, false);
            }
        }
        int i13 = f8Var.e;
        int i14 = -1;
        int i15 = -1;
        int i16 = 0;
        for (int i17 = 0; i17 < f8Var.d; i17++) {
            g8 g8Var = (g8) f8Var.n.get(i17, null);
            if (g8Var != null && (i10 = g8Var.h) >= this.Q && i10 <= this.R) {
                if (i14 == -1) {
                    i14 = i13;
                }
                i15 = i13;
            }
            i13++;
            if (i13 >= 7) {
                if (i14 == -1 || i15 == -1) {
                    i3 = i16;
                    f8Var.c(i3, 0, 0, false, z10);
                } else {
                    i3 = i16;
                    f8Var.c(i3, i14, i15, true, z10);
                }
                i16 = i3 + 1;
                i14 = -1;
                i15 = -1;
                i13 = 0;
            }
        }
        int i18 = i16;
        if (i14 == -1 || i15 == -1) {
            f8Var.c(i18, 0, 0, false, z10);
        } else {
            f8Var.c(i18, i14, i15, true, z10);
        }
    }

    public final void B0() {
        String M0;
        gi.l3 l3Var;
        if (!this.e0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752642, null));
            this.I.c(true, 0.0f);
            return;
        }
        int i3 = this.Q;
        int i10 = this.R;
        int abs = (i3 == i10 && i3 == 0) ? 0 : (Math.abs(i3 - i10) / 86400) + 1;
        boolean z10 = this.p0;
        int i11 = this.o0;
        if (abs == i11 && z10 == this.H) {
            return;
        }
        boolean z11 = i11 > abs;
        this.o0 = abs;
        boolean z12 = this.H;
        this.p0 = z12;
        if (abs > 0) {
            M0 = org.telegram.messenger.bd.G(abs, "Days", new Object[0]);
            this.I.c(true, 1.0f);
        } else if (z12) {
            M0 = org.telegram.messenger.bd.M0(2131745670, null);
            this.I.c(true, 1.0f);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131752642, null);
            this.I.c(true, 0.0f);
        }
        String str = M0;
        if (abs > 1) {
            this.n.setText(org.telegram.messenger.bd.a0("ClearHistoryForTheseDays", null, 2131752087, new Object[0]));
        } else if (abs > 0 || this.H) {
            this.n.setText(org.telegram.messenger.bd.a0("ClearHistoryForThisDay", null, 2131752086, new Object[0]));
        }
        this.c0.a((abs > 0 || this.H) ? this.n : this.h, true);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        y4Var.getClass();
        y4Var.A(str, z11, 150L, org.telegram.ui.Components.xq.h);
        if ((!this.H || abs > 0) && (l3Var = this.P) != null) {
            l3Var.f(true);
        }
        if (abs > 0 || this.H) {
            if (this.n.getVisibility() == 8) {
                this.n.setAlpha(0.0f);
                this.n.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
            }
            this.n.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.n.animate().setListener(null).cancel();
            this.h.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.s9(this.h)).start();
            this.n.animate().alpha(abs == 0 ? 0.5f : 1.0f).translationY(0.0f).start();
            this.h.setEnabled(false);
            this.n.setEnabled(true);
            return;
        }
        if (this.h.getVisibility() == 8) {
            this.h.setAlpha(0.0f);
            this.h.setTranslationY(org.telegram.messenger.g0.L(20.0f));
        }
        this.h.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.n.animate().setListener(null).cancel();
        this.h.animate().alpha(1.0f).translationY(0.0f).start();
        this.n.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.s9(this.n)).start();
        this.h.setEnabled(true);
        this.n.setEnabled(false);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        float L = org.telegram.messenger.g0.L(16.0f);
        TextPaint textPaint = this.d;
        textPaint.setTextSize(L);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        float L2 = org.telegram.messenger.g0.L(11.0f);
        TextPaint textPaint2 = this.f;
        textPaint2.setTextSize(L2);
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        float L3 = org.telegram.messenger.g0.L(16.0f);
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(L3);
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextAlign(align);
        x7 x7Var = new x7(this, context);
        this.a = x7Var;
        x7Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        this.a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752642, null));
        ci.j1 j1Var = new ci.j1(8, context, this);
        this.b = j1Var;
        u4.b0 b0Var = new u4.b0();
        this.c = b0Var;
        j1Var.setLayoutManager(b0Var);
        final int i3 = 1;
        this.c.k1(true);
        ci.j1 j1Var2 = this.b;
        final int i10 = 0;
        y7 y7Var = new y7(this, i10);
        this.M = y7Var;
        j1Var2.setAdapter(y7Var);
        this.b.j(new h3(this, 4));
        boolean z10 = this.f0 == 0 && this.e0;
        this.a.addView(this.b, b8.mf.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z10 ? 48.0f : 0.0f));
        gi.n5 n5Var = new gi.n5(this, context, new String[]{org.telegram.messenger.bd.M0(2131752640, null), org.telegram.messenger.bd.M0(2131752636, null), org.telegram.messenger.bd.M0(2131752635, null), org.telegram.messenger.bd.M0(2131752637, null), org.telegram.messenger.bd.M0(2131752641, null), org.telegram.messenger.bd.M0(2131752639, null), org.telegram.messenger.bd.M0(2131752638, null)}, 2);
        this.k0 = n5Var;
        n5Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        gi.n5 n5Var2 = this.k0;
        gh.g c2 = getBaseSimpleGlass().c.c(this.k0, null, false);
        c2.p(b8.cd.m(this.resourceProvider));
        c2.q(org.telegram.messenger.g0.L(9.66f));
        c2.r(org.telegram.messenger.g0.L(18.0f));
        n5Var2.setBackground(c2);
        this.k0.setTranslationY(pi.a.d(0) - org.telegram.messenger.g0.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 28));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.J = calendar.get(1);
        int i11 = calendar.get(2);
        this.K = i11;
        int i12 = this.a0;
        if (i12 != 0) {
            int e10 = com.google.android.recaptcha.internal.a.e(this.J, i12, 12, i11) - this.b0;
            this.L = e10 + 1;
            this.c.h1(e10, org.telegram.messenger.g0.L(120.0f));
        }
        if (this.L < 3) {
            this.L = 3;
        }
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        this.I = w1Var;
        this.simpleActionBar.setBackButtonDrawable(w1Var);
        this.I.c(false, 0.0f);
        x0();
        y0();
        textPaint3.setColor(-1);
        if (z10) {
            this.c0 = new ci.l1(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(org.telegram.messenger.g0.o());
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v7
                public final /* synthetic */ i8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            i8 i8Var = this.b;
                            i8Var.H = true;
                            i8Var.B0();
                            break;
                        default:
                            i8 i8Var2 = this.b;
                            int i13 = i8Var2.o0;
                            if (i13 != 0) {
                                org.telegram.ui.Components.t4.q(i8Var2, i13, i8Var2.getMessagesController().a2(Long.valueOf(i8Var2.y)), null, false, new w7(i8Var2), null);
                                break;
                            } else {
                                if (i8Var2.P == null) {
                                    gi.l3 l3Var = new gi.l3(i8Var2.a.getContext(), 3);
                                    l3Var.r(true);
                                    l3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    l3Var.d = 2300L;
                                    l3Var.U = true;
                                    l3Var.e = true;
                                    l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    l3Var.v0 = -org.telegram.messenger.g0.L(10.0f);
                                    i8Var2.P = l3Var;
                                    l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    i8Var2.P.l(i8Var2.getBaseSimpleGlass().c);
                                    i8Var2.a.addView(i8Var2.P, b8.mf.e(-1, org.telegram.messenger.hs.g2, 55));
                                    i8Var2.P.u(org.telegram.messenger.bd.M0(2131745669, null));
                                }
                                i8Var2.P.y(i8Var2.c0, true);
                                break;
                            }
                    }
                }
            });
            this.h.setText(org.telegram.messenger.bd.M0(2131745670, null));
            this.c0.addView(this.h, b8.mf.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.n.setSingleLine();
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(org.telegram.messenger.g0.o());
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v7
                public final /* synthetic */ i8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            i8 i8Var = this.b;
                            i8Var.H = true;
                            i8Var.B0();
                            break;
                        default:
                            i8 i8Var2 = this.b;
                            int i13 = i8Var2.o0;
                            if (i13 != 0) {
                                org.telegram.ui.Components.t4.q(i8Var2, i13, i8Var2.getMessagesController().a2(Long.valueOf(i8Var2.y)), null, false, new w7(i8Var2), null);
                                break;
                            } else {
                                if (i8Var2.P == null) {
                                    gi.l3 l3Var = new gi.l3(i8Var2.a.getContext(), 3);
                                    l3Var.r(true);
                                    l3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    l3Var.d = 2300L;
                                    l3Var.U = true;
                                    l3Var.e = true;
                                    l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    l3Var.v0 = -org.telegram.messenger.g0.L(10.0f);
                                    i8Var2.P = l3Var;
                                    l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    i8Var2.P.l(i8Var2.getBaseSimpleGlass().c);
                                    i8Var2.a.addView(i8Var2.P, b8.mf.e(-1, org.telegram.messenger.hs.g2, 55));
                                    i8Var2.P.u(org.telegram.messenger.bd.M0(2131745669, null));
                                }
                                i8Var2.P.y(i8Var2.c0, true);
                                break;
                            }
                    }
                }
            });
            this.n.setVisibility(8);
            this.c0.addView(this.n, b8.mf.e(-2, 38, 17));
            this.a.addView(this.c0, b8.mf.e(-1, 50, 80));
            this.c0.a(this.h, false);
            int L4 = org.telegram.messenger.g0.L(19.0f);
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.k6.pf;
            org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.a0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 51), L4, L4), null, org.telegram.ui.ActionBar.r6.h(i13, 51), null);
            TextView textView4 = this.n;
            int i14 = org.telegram.ui.ActionBar.k6.q7;
            org.telegram.ui.ActionBar.r6.R(textView4, org.telegram.ui.ActionBar.k6.a0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 51), L4, L4), null, org.telegram.ui.ActionBar.r6.h(i14, 51), null);
            org.telegram.ui.ActionBar.r6.V(this.h, i13, null);
            org.telegram.ui.ActionBar.r6.V(this.n, i14, null);
        }
        View view = new View(context);
        this.l0 = view;
        this.a.addView(view, b8.mf.e(-1, 0, 48));
        this.l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.addView(this.k0, b8.mf.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.x5 && this.g0 == ((ei.r6) objArr[0])) {
            z0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i3 = org.telegram.ui.ActionBar.k6.a;
        int i10 = org.telegram.ui.ActionBar.k6.a;
        int i11 = org.telegram.ui.ActionBar.k6.a;
        return super.getThemeDescriptions();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (!this.H) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.H = false;
            this.R = 0;
            this.Q = 0;
            B0();
            u0();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        this.y = getArguments().getLong("dialog_id");
        this.E = getArguments().getLong("topic_id");
        int i3 = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.f0 = i3;
        if (i3 == 2) {
            this.g0 = org.telegram.messenger.hp.s1(this.currentAccount).P1().A(0, -1, this.y, true);
        } else if (i3 == 3) {
            this.g0 = org.telegram.messenger.hp.s1(this.currentAccount).P1().A(1, -1, this.y, true);
        }
        ei.r6 r6Var = this.g0;
        if (r6Var != null) {
            this.h0 = new w7(this);
        }
        if (this.y >= 0) {
            this.e0 = true;
        } else {
            this.e0 = false;
        }
        if (r6Var != null) {
            org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.x5);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.g0 != null) {
            org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.x5);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
        this.k0.setTranslationY(pi.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        w0(i10, i12);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar == null || this.I == null || this.d == null || this.f == null || this.e == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
        if (x02 == this.q0 && x03 == this.r0 && x04 == this.s0) {
            return;
        }
        this.q0 = x02;
        this.r0 = x03;
        this.s0 = x04;
        y0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ai.x2 x2Var;
        if (z10 && (x2Var = this.w) != null && x2Var.getVisibility() == 0) {
            this.w.setVisibility(8);
            this.w.setBackground(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        ai.x2 x2Var = this.w;
        if (x2Var == null || x2Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.w.setAlpha(1.0f - f10);
        } else {
            this.w.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.Z = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.l0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.b bVar = this.mSystemInsets;
        w0(bVar.b, bVar.d);
    }

    public final void u0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.xq.f);
        duration.addUpdateListener(new b3(this, 2));
        duration.addListener(new ii.v3(this, 19));
        duration.start();
        this.S = duration;
        for (int i3 = 0; i3 < this.b.getChildCount(); i3++) {
            A0((f8) this.b.getChildAt(i3), true);
        }
        for (int i10 = 0; i10 < this.b.getCachedChildCount(); i10++) {
            f8 f8Var = (f8) this.b.P(i10);
            A0(f8Var, false);
            f8.a(f8Var, this.Q, this.R);
            f8.b(f8Var, 1.0f);
        }
        for (int i11 = 0; i11 < this.b.getHiddenChildCount(); i11++) {
            f8 f8Var2 = (f8) this.b.V(i11);
            A0(f8Var2, false);
            f8.a(f8Var2, this.Q, this.R);
            f8.b(f8Var2, 1.0f);
        }
        for (int i12 = 0; i12 < this.b.getAttachedScrapChildCount(); i12++) {
            f8 f8Var3 = (f8) this.b.O(i12);
            A0(f8Var3, false);
            f8.a(f8Var3, this.Q, this.R);
            f8.b(f8Var3, 1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (this.F || this.U) {
            return;
        }
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof f8) {
                f8 f8Var = (f8) childAt;
                int i11 = (f8Var.b * 100) + f8Var.c;
                if (i11 < i3) {
                    i3 = i11;
                }
            }
        }
        int i12 = this.X;
        if ((i12 % 100) + ((i12 / 100) * 12) + 3 >= (i3 % 100) + ((i3 / 100) * 12)) {
            x0();
        }
    }

    public final void w0(int i3, int i10) {
        pi.a.e(this.b, i3, i10, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.c0 != null ? org.telegram.messenger.g0.L(50.0f) : 0);
        ci.l1 l1Var = this.c0;
        if (l1Var != null) {
            l1Var.setTranslationY((-i10) - org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void x0() {
        if (this.F || this.U) {
            return;
        }
        if (this.g0 != null) {
            z0();
            this.g0.p(100, false);
            this.F = this.g0.k();
            return;
        }
        this.F = true;
        TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
        int i3 = this.Y;
        if (i3 == 1) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
        } else if (i3 == 2) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
        } else {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
        }
        tL_messages_getSearchResultsCalendar.peer = getMessagesController().j1(this.y);
        if (this.E != 0 && this.y == getUserConfig().e()) {
            tL_messages_getSearchResultsCalendar.flags |= 4;
            tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().j1(this.E);
        }
        tL_messages_getSearchResultsCalendar.offset_id = this.W;
        Calendar calendar = Calendar.getInstance();
        this.b.setItemAnimator(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new org.telegram.ui.ActionBar.h6(1, this, calendar));
    }

    public final void y0() {
        this.e.setColor(-1);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.I.a(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
    }

    public final void z0() {
        this.F = this.g0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.T;
        sparseArray.clear();
        this.d0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i3 = 0; i3 < this.g0.i.size(); i3++) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.g0.i.get(i3);
            this.d0 = Math.min(this.d0, ziVar.k.date);
            calendar.setTimeInMillis(ziVar.k.date * 1000);
            int i10 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i10);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i10, sparseArray2);
            }
            int i11 = calendar.get(5) - 1;
            g8 g8Var = (g8) sparseArray2.get(i11);
            if (g8Var == null) {
                g8Var = new g8();
                g8Var.b = new ArrayList();
            }
            g8Var.b.add(Integer.valueOf(ziVar.f1()));
            g8Var.a = ziVar;
            g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i11, g8Var);
            int i12 = this.X;
            if (i10 < i12 || i12 == 0) {
                this.X = i10;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i13 = this.d0; i13 < currentTimeMillis; i13 += 86400) {
            calendar.setTimeInMillis(i13 * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i14 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray3 = (SparseArray) sparseArray.get(i14);
            if (sparseArray3 == null) {
                sparseArray3 = new SparseArray();
                sparseArray.put(i14, sparseArray3);
            }
            int i15 = calendar.get(5) - 1;
            if (sparseArray3.get(i15, null) == null) {
                g8 g8Var2 = new g8();
                g8Var2.g = false;
                g8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i15, g8Var2);
            }
        }
        this.U = this.g0.r;
        if (this.Z) {
            this.G = true;
        }
        this.b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.d0) / 2629800)) + 1;
        this.M.k(0, this.L);
        int i16 = this.L;
        if (timeInMillis > i16) {
            this.M.o(i16 + 1, timeInMillis);
            this.L = timeInMillis;
        }
        if (this.U) {
            resumeDelayedFragmentAnimation();
        }
    }
}
