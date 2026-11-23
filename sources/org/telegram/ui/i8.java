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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i8 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public org.telegram.ui.ActionBar.x1 I;
    public int J;
    public int K;
    public int L;
    public y7 M;
    public org.telegram.ui.Components.jn N;
    public bn O;
    public hi.l3 P;
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
    public w7 a;
    public final int a0;
    public di.b1 b;
    public final int b0;
    public v4.c0 c;
    public di.d1 c0;
    public final TextPaint d;
    public int d0;
    public final TextPaint e;
    public boolean e0;
    public final TextPaint f;
    public int f0;
    public fi.h6 g0;
    public TextView h;
    public v7 h0;
    public int i0;
    public w0 j0;
    public hi.l5 k0;
    public View l0;
    public final Path m0;
    public TextView n;
    public final xh.f n0;
    public int o0;
    public boolean p0;
    public int q0;
    public final Paint r;
    public int r0;
    public final Paint s;
    public int s0;
    public bi.m3 w;
    public final Paint x;
    public long y;

    public i8(int i7, int i10, Bundle bundle) {
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
        this.n0 = new xh.f();
        this.Y = i7;
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
            for (int i7 = 0; i7 < tL_messages_searchResultsCalendar.periods.size(); i7++) {
                calendar.setTimeInMillis(tL_messages_searchResultsCalendar.periods.get(i7).date * 1000);
                int i10 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i10);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i10, sparseArray2);
                }
                g8 g8Var = new g8();
                g8Var.a = new org.telegram.messenger.gj(i8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i7), false, false);
                g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i11 = i8Var.V + tL_messages_searchResultsCalendar.periods.get(i7).count;
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
                i8Var.W = ((TLRPC.Message) i5.c.h(1, tL_messages_searchResultsCalendar.messages)).id;
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
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.ls.K2));
        i8Var.w.setBackground(new BitmapDrawable(createBitmap));
        i8Var.w.setAlpha(0.0f);
        i8Var.w.setVisibility(0);
    }

    public final void A0(f8 f8Var, boolean z10) {
        int i7;
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
                    i7 = i16;
                    f8Var.c(i7, 0, 0, false, z10);
                } else {
                    i7 = i16;
                    f8Var.c(i7, i14, i15, true, z10);
                }
                i16 = i7 + 1;
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
        String N0;
        hi.l3 l3Var;
        if (!this.e0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131752630, null));
            this.I.c(true, 0.0f);
            return;
        }
        int i7 = this.Q;
        int i10 = this.R;
        int abs = (i7 == i10 && i7 == 0) ? 0 : (Math.abs(i7 - i10) / 86400) + 1;
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
            N0 = org.telegram.messenger.hd.G(abs, "Days", new Object[0]);
            this.I.c(true, 1.0f);
        } else if (z12) {
            N0 = org.telegram.messenger.hd.N0(2131745464, null);
            this.I.c(true, 1.0f);
        } else {
            N0 = org.telegram.messenger.hd.N0(2131752630, null);
            this.I.c(true, 0.0f);
        }
        String str = N0;
        if (abs > 1) {
            this.n.setText(org.telegram.messenger.hd.a0("ClearHistoryForTheseDays", null, 2131752075, new Object[0]));
        } else if (abs > 0 || this.H) {
            this.n.setText(org.telegram.messenger.hd.a0("ClearHistoryForThisDay", null, 2131752074, new Object[0]));
        }
        this.c0.a((abs > 0 || this.H) ? this.n : this.h, true);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        z4Var.getClass();
        z4Var.I(str, z11, 150L, org.telegram.ui.Components.nr.h);
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
            this.h.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new on(this.h)).start();
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
        this.n.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new on(this.n)).start();
        this.h.setEnabled(true);
        this.n.setEnabled(false);
    }

    @Override // org.telegram.ui.ActionBar.g2
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
        w7 w7Var = new w7(this, context);
        this.a = w7Var;
        w7Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.a7));
        this.a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131752630, null));
        di.b1 b1Var = new di.b1(8, context, this);
        this.b = b1Var;
        v4.c0 c0Var = new v4.c0();
        this.c = c0Var;
        b1Var.setLayoutManager(c0Var);
        final int i7 = 1;
        this.c.k1(true);
        di.b1 b1Var2 = this.b;
        final int i10 = 0;
        y7 y7Var = new y7(this, i10);
        this.M = y7Var;
        b1Var2.setAdapter(y7Var);
        this.b.j(new g3(this, 4));
        boolean z10 = this.f0 == 0 && this.e0;
        this.a.addView(this.b, c8.ma.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z10 ? 48.0f : 0.0f));
        hi.l5 l5Var = new hi.l5(this, context, new String[]{org.telegram.messenger.hd.N0(2131752628, null), org.telegram.messenger.hd.N0(2131752624, null), org.telegram.messenger.hd.N0(2131752623, null), org.telegram.messenger.hd.N0(2131752625, null), org.telegram.messenger.hd.N0(2131752629, null), org.telegram.messenger.hd.N0(2131752627, null), org.telegram.messenger.hd.N0(2131752626, null)}, 2);
        this.k0 = l5Var;
        l5Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        hi.l5 l5Var2 = this.k0;
        fh.g c10 = getBaseSimpleGlass().c.c(this.k0, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        l5Var2.setBackground(c10);
        this.k0.setTranslationY(ri.a.d(0) - org.telegram.messenger.g0.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, i10));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.J = calendar.get(1);
        int i11 = calendar.get(2);
        this.K = i11;
        int i12 = this.a0;
        if (i12 != 0) {
            int v = com.google.android.gms.internal.vision.e2.v(this.J, i12, 12, i11) - this.b0;
            this.L = v + 1;
            this.c.h1(v, org.telegram.messenger.g0.L(120.0f));
        }
        if (this.L < 3) {
            this.L = 3;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.I = x1Var;
        this.simpleActionBar.setBackButtonDrawable(x1Var);
        this.I.c(false, 0.0f);
        x0();
        y0();
        textPaint3.setColor(-1);
        if (z10) {
            this.c0 = new di.d1(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(org.telegram.messenger.g0.o());
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t7
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
                                org.telegram.ui.Components.c5.q(i8Var2, i13, i8Var2.getMessagesController().c2(Long.valueOf(i8Var2.y)), null, false, new v7(i8Var2), null);
                                break;
                            } else {
                                if (i8Var2.P == null) {
                                    hi.l3 l3Var = new hi.l3(i8Var2.a.getContext(), 3);
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
                                    i8Var2.a.addView(i8Var2.P, c8.ma.e(-1, org.telegram.messenger.ls.g2, 55));
                                    i8Var2.P.v(org.telegram.messenger.hd.N0(2131745463, null));
                                }
                                i8Var2.P.z(i8Var2.c0, true);
                                break;
                            }
                    }
                }
            });
            this.h.setText(org.telegram.messenger.hd.N0(2131745464, null));
            this.c0.addView(this.h, c8.ma.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.n.setSingleLine();
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(org.telegram.messenger.g0.o());
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t7
                public final /* synthetic */ i8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            i8 i8Var = this.b;
                            i8Var.H = true;
                            i8Var.B0();
                            break;
                        default:
                            i8 i8Var2 = this.b;
                            int i13 = i8Var2.o0;
                            if (i13 != 0) {
                                org.telegram.ui.Components.c5.q(i8Var2, i13, i8Var2.getMessagesController().c2(Long.valueOf(i8Var2.y)), null, false, new v7(i8Var2), null);
                                break;
                            } else {
                                if (i8Var2.P == null) {
                                    hi.l3 l3Var = new hi.l3(i8Var2.a.getContext(), 3);
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
                                    i8Var2.a.addView(i8Var2.P, c8.ma.e(-1, org.telegram.messenger.ls.g2, 55));
                                    i8Var2.P.v(org.telegram.messenger.hd.N0(2131745463, null));
                                }
                                i8Var2.P.z(i8Var2.c0, true);
                                break;
                            }
                    }
                }
            });
            this.n.setVisibility(8);
            this.c0.addView(this.n, c8.ma.e(-2, 38, 17));
            this.a.addView(this.c0, c8.ma.e(-1, 50, 80));
            this.c0.a(this.h, false);
            int L4 = org.telegram.messenger.g0.L(19.0f);
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.m6.sf;
            org.telegram.ui.ActionBar.t6.Q(textView3, org.telegram.ui.ActionBar.m6.a0(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i13, false), 51), L4, L4), null, org.telegram.ui.ActionBar.t6.g(i13, 51), null);
            TextView textView4 = this.n;
            int i14 = org.telegram.ui.ActionBar.m6.q7;
            org.telegram.ui.ActionBar.t6.Q(textView4, org.telegram.ui.ActionBar.m6.a0(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i14, false), 51), L4, L4), null, org.telegram.ui.ActionBar.t6.g(i14, 51), null);
            org.telegram.ui.ActionBar.t6.U(this.h, i13, null);
            org.telegram.ui.ActionBar.t6.U(this.n, i14, null);
        }
        View view = new View(context);
        this.l0 = view;
        this.a.addView(view, c8.ma.e(-1, 0, 48));
        this.l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.addView(this.k0, c8.ma.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.A5 && this.g0 == ((fi.h6) objArr[0])) {
            z0();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i7 = org.telegram.ui.ActionBar.m6.a;
        int i10 = org.telegram.ui.ActionBar.m6.a;
        int i11 = org.telegram.ui.ActionBar.m6.a;
        return super.getThemeDescriptions();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        this.y = getArguments().getLong("dialog_id");
        this.E = getArguments().getLong("topic_id");
        int i7 = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.f0 = i7;
        if (i7 == 2) {
            this.g0 = org.telegram.messenger.np.u1(this.currentAccount).R1().A(0, -1, this.y, true);
        } else if (i7 == 3) {
            this.g0 = org.telegram.messenger.np.u1(this.currentAccount).R1().A(1, -1, this.y, true);
        }
        fi.h6 h6Var = this.g0;
        if (h6Var != null) {
            this.h0 = new v7(this);
        }
        if (this.y >= 0) {
            this.e0 = true;
        } else {
            this.e0 = false;
        }
        if (h6Var != null) {
            org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.A5);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.g0 != null) {
            org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.A5);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
        this.k0.setTranslationY(ri.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        w0(i10, i12);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar == null || this.I == null || this.d == null || this.f == null || this.e == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false);
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false);
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i6, false);
        if (x02 == this.q0 && x03 == this.r0 && x04 == this.s0) {
            return;
        }
        this.q0 = x02;
        this.r0 = x03;
        this.s0 = x04;
        y0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.m3 m3Var;
        if (z10 && (m3Var = this.w) != null && m3Var.getVisibility() == 0) {
            this.w.setVisibility(8);
            this.w.setBackground(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        bi.m3 m3Var = this.w;
        if (m3Var == null || m3Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.w.setAlpha(1.0f - f10);
        } else {
            this.w.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.Z = true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.l0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.b bVar = this.mSystemInsets;
        w0(bVar.b, bVar.d);
    }

    public final void u0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.nr.f);
        duration.addUpdateListener(new a3(this, 2));
        duration.addListener(new ki.m3(this, 19));
        duration.start();
        this.S = duration;
        for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
            A0((f8) this.b.getChildAt(i7), true);
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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (this.F || this.U) {
            return;
        }
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof f8) {
                f8 f8Var = (f8) childAt;
                int i11 = (f8Var.b * 100) + f8Var.c;
                if (i11 < i7) {
                    i7 = i11;
                }
            }
        }
        int i12 = this.X;
        if ((i12 % 100) + ((i12 / 100) * 12) + 3 >= (i7 % 100) + ((i7 / 100) * 12)) {
            x0();
        }
    }

    public final void w0(int i7, int i10) {
        ri.a.e(this.b, i7, i10, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.c0 != null ? org.telegram.messenger.g0.L(50.0f) : 0);
        di.d1 d1Var = this.c0;
        if (d1Var != null) {
            d1Var.setTranslationY((-i10) - org.telegram.messenger.g0.L(6.0f));
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
        int i7 = this.Y;
        if (i7 == 1) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
        } else if (i7 == 2) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
        } else {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
        }
        tL_messages_getSearchResultsCalendar.peer = getMessagesController().l1(this.y);
        if (this.E != 0 && this.y == getUserConfig().e()) {
            tL_messages_getSearchResultsCalendar.flags |= 4;
            tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().l1(this.E);
        }
        tL_messages_getSearchResultsCalendar.offset_id = this.W;
        Calendar calendar = Calendar.getInstance();
        this.b.setItemAnimator(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new u7(0, this, calendar));
    }

    public final void y0() {
        this.e.setColor(-1);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.I.a(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
    }

    public final void z0() {
        this.F = this.g0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.T;
        sparseArray.clear();
        this.d0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i7 = 0; i7 < this.g0.i.size(); i7++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.g0.i.get(i7);
            this.d0 = Math.min(this.d0, gjVar.k.date);
            calendar.setTimeInMillis(gjVar.k.date * 1000);
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
            g8Var.b.add(Integer.valueOf(gjVar.e1()));
            g8Var.a = gjVar;
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
