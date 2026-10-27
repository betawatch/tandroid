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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n8 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.j2 H;
    public int I;
    public int J;
    public int K;
    public c8 L;
    public li.h5 M;
    public wn N;
    public org.telegram.ui.Components.t40 O;
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
    public a8 a;
    public final int a0;
    public bi.r1 b;
    public bi.t1 b0;
    public s4.c0 c;
    public int c0;
    public final TextPaint d;
    public boolean d0;
    public final TextPaint e;
    public int e0;
    public final TextPaint f;
    public di.z6 f0;
    public f g0;
    public TextView h;
    public int h0;
    public y0 i0;
    public fi.f6 j0;
    public View k0;
    public final Path l0;
    public final xh.g m0;
    public TextView n;
    public int n0;
    public boolean o0;
    public int p0;
    public int q0;
    public final Paint r;
    public int r0;
    public final Paint s;
    public bi.cc v;
    public final Paint w;
    public long x;
    public long y;

    public n8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.l0 = new Path();
        this.m0 = new xh.g();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static /* synthetic */ void V(n8 n8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = n8Var.S;
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
                l8 l8Var = new l8();
                l8Var.a = new MessageObject(n8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                l8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = n8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                n8Var.U = i12;
                l8Var.c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((l8) sparseArray2.get(i13, null)).g) {
                    sparseArray2.put(i13, l8Var);
                }
                int i14 = n8Var.W;
                if (i11 < i14 || i14 == 0) {
                    n8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            n8Var.c0 = i15;
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
                    l8 l8Var2 = new l8();
                    l8Var2.g = false;
                    l8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, l8Var2);
                }
                i15 += 86400;
            }
            n8Var.E = false;
            if (tL_messages_searchResultsCalendar.messages.isEmpty()) {
                n8Var.T = true;
            } else {
                n8Var.V = ((TLRPC.Message) ic.a.g(1, tL_messages_searchResultsCalendar.messages)).id;
                n8Var.T = false;
                n8Var.r0();
            }
            if (n8Var.Y) {
                n8Var.F = true;
            }
            n8Var.b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            n8Var.L.q(0, n8Var.K);
            int i18 = n8Var.K;
            if (timeInMillis > i18) {
                n8Var.L.s(i18 + 1, timeInMillis);
                n8Var.K = timeInMillis;
            }
            if (n8Var.T) {
                n8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static void d0(n8 n8Var) {
        if (n8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (n8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (n8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        n8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        n8Var.v.setBackground(new BitmapDrawable(createBitmap));
        n8Var.v.setAlpha(0.0f);
        n8Var.v.setVisibility(0);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        float dp = AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.d;
        textPaint.setTextSize(dp);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        float dp2 = AndroidUtilities.dp(11.0f);
        TextPaint textPaint2 = this.f;
        textPaint2.setTextSize(dp2);
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        float dp3 = AndroidUtilities.dp(16.0f);
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(dp3);
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        a8 a8Var = new a8(this, context);
        this.a = a8Var;
        a8Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.a7));
        this.a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Calendar));
        bi.r1 r1Var = new bi.r1(this, context, 7);
        this.b = r1Var;
        s4.c0 c0Var = new s4.c0();
        this.c = c0Var;
        r1Var.setLayoutManager(c0Var);
        this.c.l1(true);
        bi.r1 r1Var2 = this.b;
        c8 c8Var = new c8(this, 0);
        this.L = c8Var;
        r1Var2.setAdapter(c8Var);
        this.b.j(new i3(this, 4));
        boolean z10 = this.e0 == 0 && this.d0;
        this.a.addView(this.b, org.telegram.ui.Components.kb1.h(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z10 ? 48.0f : 0.0f));
        fi.f6 f6Var = new fi.f6(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, 2);
        this.j0 = f6Var;
        f6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        fi.f6 f6Var2 = this.j0;
        eh.d c10 = getBaseSimpleGlass().c.c(this.j0, null, false);
        c10.v(gh.c.m(this.resourceProvider));
        c10.w(AndroidUtilities.dp(9.66f));
        c10.x(AndroidUtilities.dp(18.0f));
        f6Var2.setBackground(c10);
        this.j0.setTranslationY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(9.0f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 26));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int w10 = c3.h0.w(this.I, i11, 12, i10) - this.a0;
            this.K = w10 + 1;
            this.c.h1(w10, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.H = j2Var;
        this.simpleActionBar.setBackButtonDrawable(j2Var);
        this.H.c(0.0f, false);
        t0();
        u0();
        textPaint3.setColor(-1);
        if (z10) {
            this.b0 = new bi.t1(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            final int i12 = 0;
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y7
                public final /* synthetic */ n8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            n8 n8Var = this.b;
                            n8Var.G = true;
                            n8Var.x0();
                            break;
                        default:
                            n8 n8Var2 = this.b;
                            int i13 = n8Var2.n0;
                            if (i13 != 0) {
                                org.telegram.ui.Components.g5.q(n8Var2, i13, n8Var2.getMessagesController().getUser(Long.valueOf(n8Var2.x)), null, false, new b8(n8Var2), null);
                                break;
                            } else {
                                if (n8Var2.O == null) {
                                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(n8Var2.a.getContext(), 8);
                                    n8Var2.O = t40Var;
                                    t40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    n8Var2.a.addView(n8Var2.O, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    n8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                n8Var2.O.f(n8Var2.b0, true);
                                break;
                            }
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.b0.addView(this.h, org.telegram.ui.Components.kb1.i(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.n.setSingleLine();
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(AndroidUtilities.bold());
            final int i13 = 1;
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y7
                public final /* synthetic */ n8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            n8 n8Var = this.b;
                            n8Var.G = true;
                            n8Var.x0();
                            break;
                        default:
                            n8 n8Var2 = this.b;
                            int i132 = n8Var2.n0;
                            if (i132 != 0) {
                                org.telegram.ui.Components.g5.q(n8Var2, i132, n8Var2.getMessagesController().getUser(Long.valueOf(n8Var2.x)), null, false, new b8(n8Var2), null);
                                break;
                            } else {
                                if (n8Var2.O == null) {
                                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(n8Var2.a.getContext(), 8);
                                    n8Var2.O = t40Var;
                                    t40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    n8Var2.a.addView(n8Var2.O, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    n8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                n8Var2.O.f(n8Var2.b0, true);
                                break;
                            }
                    }
                }
            });
            this.n.setVisibility(8);
            this.b0.addView(this.n, org.telegram.ui.Components.kb1.i(-2, 38, 17));
            this.a.addView(this.b0, org.telegram.ui.Components.kb1.i(-1, 50, 80));
            this.b0.a(this.h, false);
            int dp4 = AndroidUtilities.dp(19.0f);
            TextView textView3 = this.h;
            int i14 = org.telegram.ui.ActionBar.y6.Ae;
            org.telegram.ui.ActionBar.f7.R(textView3, org.telegram.ui.ActionBar.y6.Z(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 51), dp4, dp4), null, org.telegram.ui.ActionBar.f7.h(i14, 51), null);
            TextView textView4 = this.n;
            int i15 = org.telegram.ui.ActionBar.y6.q7;
            org.telegram.ui.ActionBar.f7.R(textView4, org.telegram.ui.ActionBar.y6.Z(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i15, false), 51), dp4, dp4), null, org.telegram.ui.ActionBar.f7.h(i15, 51), null);
            org.telegram.ui.ActionBar.f7.V(this.h, i14, null);
            org.telegram.ui.ActionBar.f7.V(this.n, i15, null);
        }
        View view = new View(context);
        this.k0 = view;
        this.a.addView(view, org.telegram.ui.Components.kb1.i(-1, 0, 48));
        this.k0.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.addView(this.j0, org.telegram.ui.Components.kb1.h(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f0 == ((di.z6) objArr[0])) {
            v0();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.y6.a;
        int i11 = org.telegram.ui.ActionBar.y6.a;
        int i12 = org.telegram.ui.ActionBar.y6.a;
        return super.getThemeDescriptions();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (!this.G) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.G = false;
            this.Q = 0;
            this.P = 0;
            x0();
            q0();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        this.x = getArguments().getLong("dialog_id");
        this.y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.e0 = i10;
        if (i10 == 2) {
            this.f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.x, 0, -1, true);
        } else if (i10 == 3) {
            this.f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.x, 1, -1, true);
        }
        di.z6 z6Var = this.f0;
        if (z6Var != null) {
            this.g0 = new f(this, 7);
        }
        if (this.x >= 0) {
            this.d0 = true;
        } else {
            this.d0 = false;
        }
        if (z6Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.k0.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
        this.j0.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - AndroidUtilities.dp(9.0f));
        s0(i11, i13);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar == null || this.H == null || this.d == null || this.f == null || this.e == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false);
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false);
        if (x02 == this.p0 && x03 == this.q0 && x04 == this.r0) {
            return;
        }
        this.p0 = x02;
        this.q0 = x03;
        this.r0 = x04;
        u0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.cc ccVar;
        if (z10 && (ccVar = this.v) != null && ccVar.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        bi.cc ccVar = this.v;
        if (ccVar == null || ccVar.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.v.setAlpha(1.0f - f7);
        } else {
            this.v.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.Y = true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.k0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.b bVar = this.mSystemInsets;
        s0(bVar.b, bVar.d);
    }

    public final void q0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.ds.f);
        duration.addUpdateListener(new b3(this, 2));
        duration.addListener(new kg.e(this, 9));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            w0((k8) this.b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.b.getCachedChildCount(); i11++) {
            k8 k8Var = (k8) this.b.P(i11);
            w0(k8Var, false);
            k8.a(k8Var, this.P, this.Q);
            k8.b(k8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.b.getHiddenChildCount(); i12++) {
            k8 k8Var2 = (k8) this.b.V(i12);
            w0(k8Var2, false);
            k8.a(k8Var2, this.P, this.Q);
            k8.b(k8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.b.getAttachedScrapChildCount(); i13++) {
            k8 k8Var3 = (k8) this.b.O(i13);
            w0(k8Var3, false);
            k8.a(k8Var3, this.P, this.Q);
            k8.b(k8Var3, 1.0f);
        }
    }

    public final void r0() {
        if (this.E || this.T) {
            return;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            View childAt = this.b.getChildAt(i11);
            if (childAt instanceof k8) {
                k8 k8Var = (k8) childAt;
                int i12 = (k8Var.b * 100) + k8Var.c;
                if (i12 < i10) {
                    i10 = i12;
                }
            }
        }
        int i13 = this.W;
        if ((i13 % 100) + ((i13 / 100) * 12) + 3 >= (i10 % 100) + ((i10 / 100) * 12)) {
            t0();
        }
    }

    public final void s0(int i10, int i11) {
        oi.a.d(this.b, i10, i11, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.b0 != null ? AndroidUtilities.dp(50.0f) : 0);
        bi.t1 t1Var = this.b0;
        if (t1Var != null) {
            t1Var.setTranslationY((-i11) - AndroidUtilities.dp(6.0f));
        }
    }

    public final void t0() {
        if (this.E || this.T) {
            return;
        }
        if (this.f0 != null) {
            v0();
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
        tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.x);
        if (this.y != 0 && this.x == getUserConfig().getClientUserId()) {
            tL_messages_getSearchResultsCalendar.flags |= 4;
            tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.y);
        }
        tL_messages_getSearchResultsCalendar.offset_id = this.V;
        Calendar calendar = Calendar.getInstance();
        this.b.setItemAnimator(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new z7(0, this, calendar));
    }

    public final void u0() {
        this.e.setColor(-1);
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.H.a(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        this.E = this.f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.c0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < this.f0.i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f0.i.get(i10);
            this.c0 = Math.min(this.c0, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            l8 l8Var = (l8) sparseArray2.get(i12);
            if (l8Var == null) {
                l8Var = new l8();
                l8Var.b = new ArrayList();
            }
            l8Var.b.add(Integer.valueOf(messageObject.getId()));
            l8Var.a = messageObject;
            l8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, l8Var);
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
                l8 l8Var2 = new l8();
                l8Var2.g = false;
                l8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, l8Var2);
            }
        }
        this.T = this.f0.r;
        if (this.Y) {
            this.F = true;
        }
        this.b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.c0) / 2629800)) + 1;
        this.L.q(0, this.K);
        int i17 = this.K;
        if (timeInMillis > i17) {
            this.L.s(i17 + 1, timeInMillis);
            this.K = timeInMillis;
        }
        if (this.T) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void w0(k8 k8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P == 0 || this.Q == 0) {
            SparseArray sparseArray = k8Var.w;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                k8Var.c(sparseArray.keyAt(i12), 0, 0, false, z10);
            }
            return;
        }
        if (k8Var.n == null) {
            return;
        }
        if (!z10) {
            SparseArray sparseArray2 = k8Var.w;
            for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
                k8Var.c(sparseArray2.keyAt(i13), 0, 0, false, false);
            }
        }
        int i14 = k8Var.e;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        for (int i18 = 0; i18 < k8Var.d; i18++) {
            l8 l8Var = (l8) k8Var.n.get(i18, null);
            if (l8Var != null && (i11 = l8Var.h) >= this.P && i11 <= this.Q) {
                if (i15 == -1) {
                    i15 = i14;
                }
                i16 = i14;
            }
            i14++;
            if (i14 >= 7) {
                if (i15 == -1 || i16 == -1) {
                    i10 = i17;
                    k8Var.c(i10, 0, 0, false, z10);
                } else {
                    i10 = i17;
                    k8Var.c(i10, i15, i16, true, z10);
                }
                i17 = i10 + 1;
                i15 = -1;
                i16 = -1;
                i14 = 0;
            }
        }
        int i19 = i17;
        if (i15 == -1 || i16 == -1) {
            k8Var.c(i19, 0, 0, false, z10);
        } else {
            k8Var.c(i19, i15, i16, true, z10);
        }
    }

    public final void x0() {
        String string;
        org.telegram.ui.Components.t40 t40Var;
        if (!this.d0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Calendar));
            this.H.c(0.0f, true);
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
            string = LocaleController.formatPluralString("Days", abs, new Object[0]);
            this.H.c(1.0f, true);
        } else if (z12) {
            string = LocaleController.getString(R.string.SelectDays);
            this.H.c(1.0f, true);
        } else {
            string = LocaleController.getString(R.string.Calendar);
            this.H.c(0.0f, true);
        }
        String str = string;
        if (abs > 1) {
            this.n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.b0.a((abs > 0 || this.G) ? this.n : this.h, true);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        r5Var.getClass();
        r5Var.w(str, z11, 150L, org.telegram.ui.Components.ds.h);
        if ((!this.G || abs > 0) && (t40Var = this.O) != null) {
            t40Var.b(true);
        }
        if (abs > 0 || this.G) {
            if (this.n.getVisibility() == 8) {
                this.n.setAlpha(0.0f);
                this.n.setTranslationY(-AndroidUtilities.dp(20.0f));
            }
            this.n.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.n.animate().setListener(null).cancel();
            this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new lo(this.h)).start();
            this.n.animate().alpha(abs == 0 ? 0.5f : 1.0f).translationY(0.0f).start();
            this.h.setEnabled(false);
            this.n.setEnabled(true);
            return;
        }
        if (this.h.getVisibility() == 8) {
            this.h.setAlpha(0.0f);
            this.h.setTranslationY(AndroidUtilities.dp(20.0f));
        }
        this.h.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.n.animate().setListener(null).cancel();
        this.h.animate().alpha(1.0f).translationY(0.0f).start();
        this.n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new lo(this.n)).start();
        this.h.setEnabled(true);
        this.n.setEnabled(false);
    }
}
