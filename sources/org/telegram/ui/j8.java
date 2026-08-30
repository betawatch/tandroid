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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j8 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public boolean C;
    public boolean D;
    public org.telegram.ui.ActionBar.i2 E;
    public int F;
    public int G;
    public int H;
    public y7 I;
    public org.telegram.ui.Cells.f1 J;
    public xn K;
    public org.telegram.ui.Components.k40 L;
    public int M;
    public int N;
    public ValueAnimator O;
    public final SparseArray P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public boolean V;
    public final int W;
    public final int X;
    public dh.d Y;
    public int Z;
    public w7 a;
    public boolean a0;
    public lh.e1 b;
    public int b0;
    public f2.i0 c;
    public nh.l6 c0;
    public final TextPaint d;
    public h d0;
    public final TextPaint e;
    public int e0;
    public final TextPaint f;
    public a1 f0;
    public final Path g0;
    public TextView h;
    public final ih.k h0;
    public int i0;
    public boolean j0;
    public TextView n;
    public final Paint r;
    public final Paint s;
    public eg.h0 v;
    public final Paint w;
    public long x;
    public long y;

    public j8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.P = new SparseArray();
        this.R = 0;
        this.g0 = new Path();
        this.h0 = new ih.k();
        this.U = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.W = calendar.get(1);
            this.X = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static /* synthetic */ void U(j8 j8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = j8Var.P;
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
                h8 h8Var = new h8();
                h8Var.a = new MessageObject(j8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                h8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = j8Var.R + tL_messages_searchResultsCalendar.periods.get(i10).count;
                j8Var.R = i12;
                h8Var.c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((h8) sparseArray2.get(i13, null)).g) {
                    sparseArray2.put(i13, h8Var);
                }
                int i14 = j8Var.T;
                if (i11 < i14 || i14 == 0) {
                    j8Var.T = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            j8Var.Z = i15;
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
                    h8 h8Var2 = new h8();
                    h8Var2.g = false;
                    h8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, h8Var2);
                }
                i15 += 86400;
            }
            j8Var.B = false;
            if (tL_messages_searchResultsCalendar.messages.isEmpty()) {
                j8Var.Q = true;
            } else {
                j8Var.S = ((TLRPC.Message) kh.a2.i(1, tL_messages_searchResultsCalendar.messages)).id;
                j8Var.Q = false;
                j8Var.p0();
            }
            if (j8Var.V) {
                j8Var.C = true;
            }
            j8Var.b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            j8Var.I.q(0, j8Var.H);
            int i18 = j8Var.H;
            if (timeInMillis > i18) {
                j8Var.I.s(i18 + 1, timeInMillis);
                j8Var.H = timeInMillis;
            }
            if (j8Var.Q) {
                j8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static void b0(j8 j8Var) {
        if (j8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (j8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (j8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        j8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        j8Var.v.setBackground(new BitmapDrawable(createBitmap));
        j8Var.v.setAlpha(0.0f);
        j8Var.v.setVisibility(0);
    }

    @Override // org.telegram.ui.ActionBar.p2
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
        this.a = new w7(this, context);
        createActionBar(context);
        this.a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        lh.e1 e1Var = new lh.e1(this, context, 4);
        this.b = e1Var;
        f2.i0 i0Var = new f2.i0();
        this.c = i0Var;
        e1Var.setLayoutManager(i0Var);
        this.c.k1(true);
        lh.e1 e1Var2 = this.b;
        y7 y7Var = new y7(this, 0);
        this.I = y7Var;
        e1Var2.setAdapter(y7Var);
        this.b.j(new l3(this, 3));
        boolean z4 = this.b0 == 0 && this.a0;
        this.a.addView(this.b, k7.b6.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z4 ? 48.0f : 0.0f));
        this.a.addView(new nh.a3(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), k7.b6.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 10));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.F = calendar.get(1);
        int i10 = calendar.get(2);
        this.G = i10;
        int i11 = this.W;
        if (i11 != 0) {
            int e = e2.c.e(this.F, i11, 12, i10) - this.X;
            this.H = e + 1;
            this.c.h1(e, AndroidUtilities.dp(120.0f));
        }
        if (this.H < 3) {
            this.H = 3;
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.E = i2Var;
        this.actionBar.setBackButtonDrawable(i2Var);
        this.E.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        this.e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.E.a(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), false);
        textPaint3.setColor(-1);
        if (z4) {
            dh.d dVar = new dh.d(context, 8);
            this.Y = dVar;
            dVar.setWillNotDraw(false);
            this.Y.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.Y.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            final int i13 = 0;
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v7
                public final /* synthetic */ j8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            j8 j8Var = this.b;
                            j8Var.D = true;
                            j8Var.t0();
                            break;
                        default:
                            j8 j8Var2 = this.b;
                            int i14 = j8Var2.i0;
                            if (i14 != 0) {
                                org.telegram.ui.Components.z4.r(j8Var2, i14, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.x)), null, false, new x7(j8Var2), null);
                                break;
                            } else {
                                if (j8Var2.L == null) {
                                    org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(j8Var2.a.getContext(), 8);
                                    j8Var2.L = k40Var;
                                    k40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    j8Var2.a.addView(j8Var2.L, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    j8Var2.L.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                j8Var2.L.f(j8Var2.Y, true);
                                break;
                            }
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.Y.addView(this.h, k7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(AndroidUtilities.bold());
            final int i14 = 1;
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v7
                public final /* synthetic */ j8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            j8 j8Var = this.b;
                            j8Var.D = true;
                            j8Var.t0();
                            break;
                        default:
                            j8 j8Var2 = this.b;
                            int i142 = j8Var2.i0;
                            if (i142 != 0) {
                                org.telegram.ui.Components.z4.r(j8Var2, i142, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.x)), null, false, new x7(j8Var2), null);
                                break;
                            } else {
                                if (j8Var2.L == null) {
                                    org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(j8Var2.a.getContext(), 8);
                                    j8Var2.L = k40Var;
                                    k40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    j8Var2.a.addView(j8Var2.L, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    j8Var2.L.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                j8Var2.L.f(j8Var2.Y, true);
                                break;
                            }
                    }
                }
            });
            this.n.setAllCaps(true);
            this.n.setVisibility(8);
            this.Y.addView(this.n, k7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.a.addView(this.Y, k7.b6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i15 = org.telegram.ui.ActionBar.j6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 51), 2, -1));
            TextView textView4 = this.n;
            int i16 = org.telegram.ui.ActionBar.j6.q7;
            textView4.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i16, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.c0 == ((nh.l6) objArr[0])) {
            r0();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.a;
        int i11 = org.telegram.ui.ActionBar.j6.a;
        int i12 = org.telegram.ui.ActionBar.j6.a;
        return super.getThemeDescriptions();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.nr.f);
        duration.addUpdateListener(new e3(this, 3));
        duration.addListener(new s5(this, 1));
        duration.start();
        this.O = duration;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            s0((g8) this.b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.b.getCachedChildCount(); i11++) {
            g8 g8Var = (g8) this.b.P(i11);
            s0(g8Var, false);
            g8.a(g8Var, this.M, this.N);
            g8.b(g8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.b.getHiddenChildCount(); i12++) {
            g8 g8Var2 = (g8) this.b.V(i12);
            s0(g8Var2, false);
            g8.a(g8Var2, this.M, this.N);
            g8.b(g8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.b.getAttachedScrapChildCount(); i13++) {
            g8 g8Var3 = (g8) this.b.O(i13);
            s0(g8Var3, false);
            g8.a(g8Var3, this.M, this.N);
            g8.b(g8Var3, 1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (!this.D) {
            return super.onBackPressed(z4);
        }
        if (z4) {
            this.D = false;
            this.N = 0;
            this.M = 0;
            t0();
            o0();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.x = getArguments().getLong("dialog_id");
        this.y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.b0 = i10;
        if (i10 == 2) {
            this.c0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.x, 0, -1, true);
        } else if (i10 == 3) {
            this.c0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.x, 1, -1, true);
        }
        nh.l6 l6Var = this.c0;
        if (l6Var != null) {
            this.d0 = new h(this, 8);
        }
        if (this.x >= 0) {
            this.a0 = true;
        } else {
            this.a0 = false;
        }
        if (l6Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.c0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        eg.h0 h0Var;
        if (z4 && (h0Var = this.v) != null && h0Var.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        eg.h0 h0Var = this.v;
        if (h0Var == null || h0Var.getVisibility() != 0) {
            return;
        }
        if (z4) {
            this.v.setAlpha(1.0f - f10);
        } else {
            this.v.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        this.V = true;
    }

    public final void p0() {
        if (this.B || this.Q) {
            return;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            View childAt = this.b.getChildAt(i11);
            if (childAt instanceof g8) {
                g8 g8Var = (g8) childAt;
                int i12 = (g8Var.b * 100) + g8Var.c;
                if (i12 < i10) {
                    i10 = i12;
                }
            }
        }
        int i13 = this.T;
        if ((i13 % 100) + ((i13 / 100) * 12) + 3 >= (i10 % 100) + ((i10 / 100) * 12)) {
            q0();
        }
    }

    public final void q0() {
        if (this.B || this.Q) {
            return;
        }
        if (this.c0 != null) {
            r0();
            this.c0.p(100, false);
            this.B = this.c0.k();
            return;
        }
        this.B = true;
        TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
        int i10 = this.U;
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
        tL_messages_getSearchResultsCalendar.offset_id = this.S;
        Calendar calendar = Calendar.getInstance();
        this.b.setItemAnimator(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new dg.d3(22, this, calendar));
    }

    public final void r0() {
        this.B = this.c0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.P;
        sparseArray.clear();
        this.Z = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < this.c0.i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.c0.i.get(i10);
            this.Z = Math.min(this.Z, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            h8 h8Var = (h8) sparseArray2.get(i12);
            if (h8Var == null) {
                h8Var = new h8();
                h8Var.b = new ArrayList();
            }
            h8Var.b.add(Integer.valueOf(messageObject.getId()));
            h8Var.a = messageObject;
            h8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, h8Var);
            int i13 = this.T;
            if (i11 < i13 || i13 == 0) {
                this.T = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.Z; i14 < currentTimeMillis; i14 += 86400) {
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
                h8 h8Var2 = new h8();
                h8Var2.g = false;
                h8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, h8Var2);
            }
        }
        this.Q = this.c0.r;
        if (this.V) {
            this.C = true;
        }
        this.b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.Z) / 2629800)) + 1;
        this.I.q(0, this.H);
        int i17 = this.H;
        if (timeInMillis > i17) {
            this.I.s(i17 + 1, timeInMillis);
            this.H = timeInMillis;
        }
        if (this.Q) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void s0(g8 g8Var, boolean z4) {
        int i10;
        int i11;
        if (this.M == 0 || this.N == 0) {
            SparseArray sparseArray = g8Var.w;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                g8Var.c(sparseArray.keyAt(i12), 0, 0, false, z4);
            }
            return;
        }
        if (g8Var.n == null) {
            return;
        }
        boolean z10 = false;
        if (!z4) {
            SparseArray sparseArray2 = g8Var.w;
            int i13 = 0;
            while (i13 < sparseArray2.size()) {
                g8Var.c(sparseArray2.keyAt(i13), 0, 0, false, z10);
                i13++;
                z10 = false;
            }
        }
        int i14 = g8Var.e;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        for (int i18 = 0; i18 < g8Var.d; i18++) {
            h8 h8Var = (h8) g8Var.n.get(i18, null);
            if (h8Var != null && (i11 = h8Var.h) >= this.M && i11 <= this.N) {
                if (i15 == -1) {
                    i15 = i14;
                }
                i16 = i14;
            }
            i14++;
            if (i14 >= 7) {
                if (i15 == -1 || i16 == -1) {
                    i10 = i17;
                    g8Var.c(i10, 0, 0, false, z4);
                } else {
                    i10 = i17;
                    g8Var.c(i10, i15, i16, true, z4);
                }
                i17 = i10 + 1;
                i14 = 0;
                i15 = -1;
                i16 = -1;
            }
        }
        int i19 = i17;
        if (i15 == -1 || i16 == -1) {
            g8Var.c(i19, 0, 0, false, z4);
        } else {
            g8Var.c(i19, i15, i16, true, z4);
        }
    }

    public final void t0() {
        String string;
        org.telegram.ui.Components.k40 k40Var;
        if (!this.a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
            this.E.c(0.0f, true);
            return;
        }
        int i10 = this.M;
        int i11 = this.N;
        int abs = (i10 == i11 && i10 == 0) ? 0 : (Math.abs(i10 - i11) / 86400) + 1;
        boolean z4 = this.j0;
        int i12 = this.i0;
        if (abs == i12 && z4 == this.D) {
            return;
        }
        boolean z10 = i12 > abs;
        this.i0 = abs;
        boolean z11 = this.D;
        this.j0 = z11;
        if (abs > 0) {
            string = LocaleController.formatPluralString("Days", abs, new Object[0]);
            this.E.c(1.0f, true);
        } else if (z11) {
            string = LocaleController.getString(R.string.SelectDays);
            this.E.c(1.0f, true);
        } else {
            string = LocaleController.getString(R.string.Calendar);
            this.E.c(0.0f, true);
        }
        String str = string;
        if (abs > 1) {
            this.n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.D) {
            this.n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.I(str, z10, 150L, null);
        if ((!this.D || abs > 0) && (k40Var = this.L) != null) {
            k40Var.b(true);
        }
        if (abs > 0 || this.D) {
            if (this.n.getVisibility() == 8) {
                this.n.setAlpha(0.0f);
                this.n.setTranslationY(-AndroidUtilities.dp(20.0f));
            }
            this.n.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.n.animate().setListener(null).cancel();
            this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.l00(this.h)).start();
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
        this.n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.l00(this.n)).start();
        this.h.setEnabled(true);
        this.n.setEnabled(false);
    }
}
