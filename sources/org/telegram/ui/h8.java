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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h8 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.y1 H;
    public int I;
    public int J;
    public int K;
    public x7 L;
    public org.telegram.ui.Components.uy M;
    public an N;
    public fi.m3 O;
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
    public bi.q1 b;
    public bi.s1 b0;
    public v4.b0 c;
    public int c0;
    public final TextPaint d;
    public boolean d0;
    public final TextPaint e;
    public int e0;
    public final TextPaint f;
    public di.q6 f0;
    public v7 g0;
    public TextView h;
    public int h0;
    public w0 i0;
    public fi.p5 j0;
    public View k0;
    public final Path l0;
    public final xh.f m0;
    public TextView n;
    public int n0;
    public boolean o0;
    public int p0;
    public int q0;
    public final Paint r;
    public int r0;
    public final Paint s;
    public bi.ec w;
    public final Paint x;
    public long y;

    public h8(int i7, int i10, Bundle bundle) {
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
        this.m0 = new xh.f();
        this.X = i7;
        if (i10 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i10 * 1000);
            this.Z = calendar.get(1);
            this.a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public static /* synthetic */ void Z(h8 h8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = h8Var.S;
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
                f8 f8Var = new f8();
                f8Var.a = new org.telegram.messenger.ij(h8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i7), false, false);
                f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i11 = h8Var.U + tL_messages_searchResultsCalendar.periods.get(i7).count;
                h8Var.U = i11;
                f8Var.c = i11;
                int i12 = calendar.get(5) - 1;
                if (sparseArray2.get(i12, null) == null || !((f8) sparseArray2.get(i12, null)).g) {
                    sparseArray2.put(i12, f8Var);
                }
                int i13 = h8Var.W;
                if (i10 < i13 || i13 == 0) {
                    h8Var.W = i10;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i14 = tL_messages_searchResultsCalendar.min_date;
            h8Var.c0 = i14;
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
                    f8 f8Var2 = new f8();
                    f8Var2.g = false;
                    f8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i16, f8Var2);
                }
                i14 += 86400;
            }
            h8Var.E = false;
            if (tL_messages_searchResultsCalendar.messages.isEmpty()) {
                h8Var.T = true;
            } else {
                h8Var.V = ((TLRPC.Message) jg.g.i(1, tL_messages_searchResultsCalendar.messages)).id;
                h8Var.T = false;
                h8Var.v0();
            }
            if (h8Var.Y) {
                h8Var.F = true;
            }
            h8Var.b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            h8Var.L.k(0, h8Var.K);
            int i17 = h8Var.K;
            if (timeInMillis > i17) {
                h8Var.L.o(i17 + 1, timeInMillis);
                h8Var.K = timeInMillis;
            }
            if (h8Var.T) {
                h8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static void h0(h8 h8Var) {
        if (h8Var.w == null) {
            return;
        }
        int measuredWidth = (int) (h8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (h8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        h8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.qs.K2));
        h8Var.w.setBackground(new BitmapDrawable(createBitmap));
        h8Var.w.setAlpha(0.0f);
        h8Var.w.setVisibility(0);
    }

    public final void A0(e8 e8Var, boolean z9) {
        int i7;
        int i10;
        if (this.P == 0 || this.Q == 0) {
            SparseArray sparseArray = e8Var.x;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                e8Var.c(sparseArray.keyAt(i11), 0, 0, false, z9);
            }
            return;
        }
        if (e8Var.n == null) {
            return;
        }
        if (!z9) {
            SparseArray sparseArray2 = e8Var.x;
            for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
                e8Var.c(sparseArray2.keyAt(i12), 0, 0, false, false);
            }
        }
        int i13 = e8Var.e;
        int i14 = -1;
        int i15 = -1;
        int i16 = 0;
        for (int i17 = 0; i17 < e8Var.d; i17++) {
            f8 f8Var = (f8) e8Var.n.get(i17, null);
            if (f8Var != null && (i10 = f8Var.h) >= this.P && i10 <= this.Q) {
                if (i14 == -1) {
                    i14 = i13;
                }
                i15 = i13;
            }
            i13++;
            if (i13 >= 7) {
                if (i14 == -1 || i15 == -1) {
                    i7 = i16;
                    e8Var.c(i7, 0, 0, false, z9);
                } else {
                    i7 = i16;
                    e8Var.c(i7, i14, i15, true, z9);
                }
                i16 = i7 + 1;
                i14 = -1;
                i15 = -1;
                i13 = 0;
            }
        }
        int i18 = i16;
        if (i14 == -1 || i15 == -1) {
            e8Var.c(i18, 0, 0, false, z9);
        } else {
            e8Var.c(i18, i14, i15, true, z9);
        }
    }

    public final void B0() {
        String M0;
        fi.m3 m3Var;
        if (!this.d0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752642, null));
            this.H.c(true, 0.0f);
            return;
        }
        int i7 = this.P;
        int i10 = this.Q;
        int abs = (i7 == i10 && i7 == 0) ? 0 : (Math.abs(i7 - i10) / 86400) + 1;
        boolean z9 = this.o0;
        int i11 = this.n0;
        if (abs == i11 && z9 == this.G) {
            return;
        }
        boolean z10 = i11 > abs;
        this.n0 = abs;
        boolean z11 = this.G;
        this.o0 = z11;
        if (abs > 0) {
            M0 = org.telegram.messenger.hd.G(abs, "Days", new Object[0]);
            this.H.c(true, 1.0f);
        } else if (z11) {
            M0 = org.telegram.messenger.hd.M0(2131745661, null);
            this.H.c(true, 1.0f);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131752642, null);
            this.H.c(true, 0.0f);
        }
        String str = M0;
        if (abs > 1) {
            this.n.setText(org.telegram.messenger.hd.a0("ClearHistoryForTheseDays", null, 2131752087, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.n.setText(org.telegram.messenger.hd.a0("ClearHistoryForThisDay", null, 2131752086, new Object[0]));
        }
        this.b0.a((abs > 0 || this.G) ? this.n : this.h, true);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        y4Var.getClass();
        y4Var.A(str, z10, 150L, org.telegram.ui.Components.xq.h);
        if ((!this.G || abs > 0) && (m3Var = this.O) != null) {
            m3Var.f(true);
        }
        if (abs > 0 || this.G) {
            if (this.n.getVisibility() == 8) {
                this.n.setAlpha(0.0f);
                this.n.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
            }
            this.n.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.n.animate().setListener(null).cancel();
            this.h.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.t9(this.h)).start();
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
        this.n.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.t9(this.n)).start();
        this.h.setEnabled(true);
        this.n.setEnabled(false);
    }

    @Override // org.telegram.ui.ActionBar.f2
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
        w7Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        this.a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752642, null));
        bi.q1 q1Var = new bi.q1(8, context, this);
        this.b = q1Var;
        v4.b0 b0Var = new v4.b0();
        this.c = b0Var;
        q1Var.setLayoutManager(b0Var);
        final int i7 = 1;
        this.c.k1(true);
        bi.q1 q1Var2 = this.b;
        final int i10 = 0;
        x7 x7Var = new x7(this, i10);
        this.L = x7Var;
        q1Var2.setAdapter(x7Var);
        this.b.j(new g3(this, 4));
        boolean z9 = this.e0 == 0 && this.d0;
        this.a.addView(this.b, c8.ha.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z9 ? 48.0f : 0.0f));
        fi.p5 p5Var = new fi.p5(this, context, new String[]{org.telegram.messenger.hd.M0(2131752640, null), org.telegram.messenger.hd.M0(2131752636, null), org.telegram.messenger.hd.M0(2131752635, null), org.telegram.messenger.hd.M0(2131752637, null), org.telegram.messenger.hd.M0(2131752641, null), org.telegram.messenger.hd.M0(2131752639, null), org.telegram.messenger.hd.M0(2131752638, null)}, 2);
        this.j0 = p5Var;
        p5Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        fi.p5 p5Var2 = this.j0;
        fh.g c10 = getBaseSimpleGlass().c.c(this.j0, null, false);
        c10.p(c8.g0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        p5Var2.setBackground(c10);
        this.j0.setTranslationY(oi.a.d(0) - org.telegram.messenger.g0.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 27));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i11 = calendar.get(2);
        this.J = i11;
        int i12 = this.Z;
        if (i12 != 0) {
            int e10 = com.google.android.recaptcha.internal.a.e(this.I, i12, 12, i11) - this.a0;
            this.K = e10 + 1;
            this.c.h1(e10, org.telegram.messenger.g0.L(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.H = y1Var;
        this.simpleActionBar.setBackButtonDrawable(y1Var);
        this.H.c(false, 0.0f);
        x0();
        y0();
        textPaint3.setColor(-1);
        if (z9) {
            this.b0 = new bi.s1(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(org.telegram.messenger.g0.o());
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u7
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
                            h8Var.B0();
                            break;
                        default:
                            h8 h8Var2 = this.b;
                            int i13 = h8Var2.n0;
                            if (i13 != 0) {
                                org.telegram.ui.Components.v4.q(h8Var2, i13, h8Var2.getMessagesController().a2(Long.valueOf(h8Var2.y)), null, false, new v7(h8Var2), null);
                                break;
                            } else {
                                if (h8Var2.O == null) {
                                    fi.m3 m3Var = new fi.m3(h8Var2.a.getContext(), 3);
                                    m3Var.r(true);
                                    m3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    m3Var.d = 2300L;
                                    m3Var.T = true;
                                    m3Var.e = true;
                                    m3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    m3Var.u0 = -org.telegram.messenger.g0.L(10.0f);
                                    h8Var2.O = m3Var;
                                    m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    h8Var2.O.l(h8Var2.getBaseSimpleGlass().c);
                                    h8Var2.a.addView(h8Var2.O, c8.ha.e(-1, org.telegram.messenger.qs.g2, 55));
                                    h8Var2.O.u(org.telegram.messenger.hd.M0(2131745660, null));
                                }
                                h8Var2.O.y(h8Var2.b0, true);
                                break;
                            }
                    }
                }
            });
            this.h.setText(org.telegram.messenger.hd.M0(2131745661, null));
            this.b0.addView(this.h, c8.ha.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.n.setSingleLine();
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(org.telegram.messenger.g0.o());
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u7
                public final /* synthetic */ h8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            h8 h8Var = this.b;
                            h8Var.G = true;
                            h8Var.B0();
                            break;
                        default:
                            h8 h8Var2 = this.b;
                            int i13 = h8Var2.n0;
                            if (i13 != 0) {
                                org.telegram.ui.Components.v4.q(h8Var2, i13, h8Var2.getMessagesController().a2(Long.valueOf(h8Var2.y)), null, false, new v7(h8Var2), null);
                                break;
                            } else {
                                if (h8Var2.O == null) {
                                    fi.m3 m3Var = new fi.m3(h8Var2.a.getContext(), 3);
                                    m3Var.r(true);
                                    m3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    m3Var.d = 2300L;
                                    m3Var.T = true;
                                    m3Var.e = true;
                                    m3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    m3Var.u0 = -org.telegram.messenger.g0.L(10.0f);
                                    h8Var2.O = m3Var;
                                    m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    h8Var2.O.l(h8Var2.getBaseSimpleGlass().c);
                                    h8Var2.a.addView(h8Var2.O, c8.ha.e(-1, org.telegram.messenger.qs.g2, 55));
                                    h8Var2.O.u(org.telegram.messenger.hd.M0(2131745660, null));
                                }
                                h8Var2.O.y(h8Var2.b0, true);
                                break;
                            }
                    }
                }
            });
            this.n.setVisibility(8);
            this.b0.addView(this.n, c8.ha.e(-2, 38, 17));
            this.a.addView(this.b0, c8.ha.e(-1, 50, 80));
            this.b0.a(this.h, false);
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
        this.k0 = view;
        this.a.addView(view, c8.ha.e(-1, 0, 48));
        this.k0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.addView(this.j0, c8.ha.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.x5 && this.f0 == ((di.q6) objArr[0])) {
            z0();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i7 = org.telegram.ui.ActionBar.k6.a;
        int i10 = org.telegram.ui.ActionBar.k6.a;
        int i11 = org.telegram.ui.ActionBar.k6.a;
        return super.getThemeDescriptions();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (!this.G) {
            return super.onBackPressed(z9);
        }
        if (z9) {
            this.G = false;
            this.Q = 0;
            this.P = 0;
            B0();
            u0();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        this.y = getArguments().getLong("dialog_id");
        this.D = getArguments().getLong("topic_id");
        int i7 = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.e0 = i7;
        if (i7 == 2) {
            this.f0 = org.telegram.messenger.qp.s1(this.currentAccount).P1().A(0, -1, this.y, true);
        } else if (i7 == 3) {
            this.f0 = org.telegram.messenger.qp.s1(this.currentAccount).P1().A(1, -1, this.y, true);
        }
        di.q6 q6Var = this.f0;
        if (q6Var != null) {
            this.g0 = new v7(this);
        }
        if (this.y >= 0) {
            this.d0 = true;
        } else {
            this.d0 = false;
        }
        if (q6Var != null) {
            org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.x5);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f0 != null) {
            org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.x5);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.k0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
        this.j0.setTranslationY(oi.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        w0(i10, i12);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar == null || this.H == null || this.d == null || this.f == null || this.e == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
        if (x02 == this.p0 && x03 == this.q0 && x04 == this.r0) {
            return;
        }
        this.p0 = x02;
        this.q0 = x03;
        this.r0 = x04;
        y0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        bi.ec ecVar;
        if (z9 && (ecVar = this.w) != null && ecVar.getVisibility() == 0) {
            this.w.setVisibility(8);
            this.w.setBackground(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        super.onTransitionAnimationProgress(z9, f10);
        bi.ec ecVar = this.w;
        if (ecVar == null || ecVar.getVisibility() != 0) {
            return;
        }
        if (z9) {
            this.w.setAlpha(1.0f - f10);
        } else {
            this.w.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        super.onTransitionAnimationStart(z9, z10);
        this.Y = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.k0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.b bVar = this.mSystemInsets;
        w0(bVar.b, bVar.d);
    }

    public final void u0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.xq.f);
        duration.addUpdateListener(new a3(this, 2));
        duration.addListener(new m.a(this, 18));
        duration.start();
        this.R = duration;
        for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
            A0((e8) this.b.getChildAt(i7), true);
        }
        for (int i10 = 0; i10 < this.b.getCachedChildCount(); i10++) {
            e8 e8Var = (e8) this.b.P(i10);
            A0(e8Var, false);
            e8.a(e8Var, this.P, this.Q);
            e8.b(e8Var, 1.0f);
        }
        for (int i11 = 0; i11 < this.b.getHiddenChildCount(); i11++) {
            e8 e8Var2 = (e8) this.b.V(i11);
            A0(e8Var2, false);
            e8.a(e8Var2, this.P, this.Q);
            e8.b(e8Var2, 1.0f);
        }
        for (int i12 = 0; i12 < this.b.getAttachedScrapChildCount(); i12++) {
            e8 e8Var3 = (e8) this.b.O(i12);
            A0(e8Var3, false);
            e8.a(e8Var3, this.P, this.Q);
            e8.b(e8Var3, 1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (this.E || this.T) {
            return;
        }
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof e8) {
                e8 e8Var = (e8) childAt;
                int i11 = (e8Var.b * 100) + e8Var.c;
                if (i11 < i7) {
                    i7 = i11;
                }
            }
        }
        int i12 = this.W;
        if ((i12 % 100) + ((i12 / 100) * 12) + 3 >= (i7 % 100) + ((i7 / 100) * 12)) {
            x0();
        }
    }

    public final void w0(int i7, int i10) {
        oi.a.e(this.b, i7, i10, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.b0 != null ? org.telegram.messenger.g0.L(50.0f) : 0);
        bi.s1 s1Var = this.b0;
        if (s1Var != null) {
            s1Var.setTranslationY((-i10) - org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void x0() {
        if (this.E || this.T) {
            return;
        }
        if (this.f0 != null) {
            z0();
            this.f0.p(100, false);
            this.E = this.f0.k();
            return;
        }
        this.E = true;
        TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
        int i7 = this.X;
        if (i7 == 1) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
        } else if (i7 == 2) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
        } else {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
        }
        tL_messages_getSearchResultsCalendar.peer = getMessagesController().j1(this.y);
        if (this.D != 0 && this.y == getUserConfig().e()) {
            tL_messages_getSearchResultsCalendar.flags |= 4;
            tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().j1(this.D);
        }
        tL_messages_getSearchResultsCalendar.offset_id = this.V;
        Calendar calendar = Calendar.getInstance();
        this.b.setItemAnimator(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new bi.j(28, this, calendar));
    }

    public final void y0() {
        this.e.setColor(-1);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f.setColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.H.a(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
    }

    public final void z0() {
        this.E = this.f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.c0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i7 = 0; i7 < this.f0.i.size(); i7++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f0.i.get(i7);
            this.c0 = Math.min(this.c0, ijVar.k.date);
            calendar.setTimeInMillis(ijVar.k.date * 1000);
            int i10 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i10);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i10, sparseArray2);
            }
            int i11 = calendar.get(5) - 1;
            f8 f8Var = (f8) sparseArray2.get(i11);
            if (f8Var == null) {
                f8Var = new f8();
                f8Var.b = new ArrayList();
            }
            f8Var.b.add(Integer.valueOf(ijVar.f1()));
            f8Var.a = ijVar;
            f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i11, f8Var);
            int i12 = this.W;
            if (i10 < i12 || i12 == 0) {
                this.W = i10;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i13 = this.c0; i13 < currentTimeMillis; i13 += 86400) {
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
                f8 f8Var2 = new f8();
                f8Var2.g = false;
                f8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i15, f8Var2);
            }
        }
        this.T = this.f0.r;
        if (this.Y) {
            this.F = true;
        }
        this.b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.c0) / 2629800)) + 1;
        this.L.k(0, this.K);
        int i16 = this.K;
        if (timeInMillis > i16) {
            this.L.o(i16 + 1, timeInMillis);
            this.K = timeInMillis;
        }
        if (this.T) {
            resumeDelayedFragmentAnimation();
        }
    }
}
