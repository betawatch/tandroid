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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f8 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public boolean B;
    public boolean C;
    public org.telegram.ui.ActionBar.h2 D;
    public int E;
    public int F;
    public int G;
    public u7 H;
    public o1.a I;
    public tn J;
    public org.telegram.ui.Components.g40 K;
    public int L;
    public int M;
    public ValueAnimator N;
    public final SparseArray O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public final int T;
    public boolean U;
    public final int V;
    public final int W;
    public bh.d X;
    public int Y;
    public boolean Z;
    public s7 a;
    public int a0;
    public jh.e1 b;
    public lh.k6 b0;
    public f2.j0 c;
    public h c0;
    public final TextPaint d;
    public int d0;
    public final TextPaint e;
    public c1 e0;
    public final TextPaint f;
    public final Path f0;
    public final gh.k g0;
    public TextView h;
    public int h0;
    public boolean i0;
    public TextView n;
    public final Paint r;
    public final Paint s;
    public cg.h0 v;
    public final Paint w;
    public long x;
    public long y;

    public f8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.O = new SparseArray();
        this.Q = 0;
        this.f0 = new Path();
        this.g0 = new gh.k();
        this.T = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.V = calendar.get(1);
            this.W = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static /* synthetic */ void U(f8 f8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = f8Var.O;
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
                d8 d8Var = new d8();
                d8Var.a = new MessageObject(f8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                d8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = f8Var.Q + tL_messages_searchResultsCalendar.periods.get(i10).count;
                f8Var.Q = i12;
                d8Var.c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((d8) sparseArray2.get(i13, null)).g) {
                    sparseArray2.put(i13, d8Var);
                }
                int i14 = f8Var.S;
                if (i11 < i14 || i14 == 0) {
                    f8Var.S = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            f8Var.Y = i15;
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
                    d8 d8Var2 = new d8();
                    d8Var2.g = false;
                    d8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, d8Var2);
                }
                i15 += 86400;
            }
            f8Var.A = false;
            if (tL_messages_searchResultsCalendar.messages.isEmpty()) {
                f8Var.P = true;
            } else {
                f8Var.R = ((TLRPC.Message) j7.l1.i(1, tL_messages_searchResultsCalendar.messages)).id;
                f8Var.P = false;
                f8Var.p0();
            }
            if (f8Var.U) {
                f8Var.B = true;
            }
            f8Var.b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            f8Var.H.q(0, f8Var.G);
            int i18 = f8Var.G;
            if (timeInMillis > i18) {
                f8Var.H.s(i18 + 1, timeInMillis);
                f8Var.G = timeInMillis;
            }
            if (f8Var.P) {
                f8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static void b0(f8 f8Var) {
        if (f8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (f8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (f8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        f8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        f8Var.v.setBackground(new BitmapDrawable(createBitmap));
        f8Var.v.setAlpha(0.0f);
        f8Var.v.setVisibility(0);
    }

    @Override // org.telegram.ui.ActionBar.o2
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
        this.a = new s7(this, context);
        createActionBar(context);
        this.a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        jh.e1 e1Var = new jh.e1(this, context, 5);
        this.b = e1Var;
        f2.j0 j0Var = new f2.j0();
        this.c = j0Var;
        e1Var.setLayoutManager(j0Var);
        this.c.k1(true);
        jh.e1 e1Var2 = this.b;
        u7 u7Var = new u7(this, 0);
        this.H = u7Var;
        e1Var2.setAdapter(u7Var);
        this.b.j(new m3(this, 3));
        boolean z10 = this.a0 == 0 && this.Z;
        this.a.addView(this.b, i7.f6.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z10 ? 48.0f : 0.0f));
        this.a.addView(new lh.z2(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), i7.f6.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 10));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.E = calendar.get(1);
        int i10 = calendar.get(2);
        this.F = i10;
        int i11 = this.V;
        if (i11 != 0) {
            int f9 = com.google.android.recaptcha.internal.a.f(this.E, i11, 12, i10) - this.W;
            this.G = f9 + 1;
            this.c.h1(f9, AndroidUtilities.dp(120.0f));
        }
        if (this.G < 3) {
            this.G = 3;
        }
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.D = h2Var;
        this.actionBar.setBackButtonDrawable(h2Var);
        this.D.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        this.e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.D.a(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            bh.d dVar = new bh.d(context, 9);
            this.X = dVar;
            dVar.setWillNotDraw(false);
            this.X.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.X.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            final int i13 = 0;
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r7
                public final /* synthetic */ f8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            f8 f8Var = this.b;
                            f8Var.C = true;
                            f8Var.t0();
                            break;
                        default:
                            f8 f8Var2 = this.b;
                            int i14 = f8Var2.h0;
                            if (i14 != 0) {
                                org.telegram.ui.Components.c5.r(f8Var2, i14, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.x)), null, false, new t7(f8Var2), null);
                                break;
                            } else {
                                if (f8Var2.K == null) {
                                    org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(f8Var2.a.getContext(), 8);
                                    f8Var2.K = g40Var;
                                    g40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    f8Var2.a.addView(f8Var2.K, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    f8Var2.K.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                f8Var2.K.f(f8Var2.X, true);
                                break;
                            }
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.X.addView(this.h, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(AndroidUtilities.bold());
            final int i14 = 1;
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.r7
                public final /* synthetic */ f8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            f8 f8Var = this.b;
                            f8Var.C = true;
                            f8Var.t0();
                            break;
                        default:
                            f8 f8Var2 = this.b;
                            int i142 = f8Var2.h0;
                            if (i142 != 0) {
                                org.telegram.ui.Components.c5.r(f8Var2, i142, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.x)), null, false, new t7(f8Var2), null);
                                break;
                            } else {
                                if (f8Var2.K == null) {
                                    org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(f8Var2.a.getContext(), 8);
                                    f8Var2.K = g40Var;
                                    g40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    f8Var2.a.addView(f8Var2.K, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    f8Var2.K.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                f8Var2.K.f(f8Var2.X, true);
                                break;
                            }
                    }
                }
            });
            this.n.setAllCaps(true);
            this.n.setVisibility(8);
            this.X.addView(this.n, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.a.addView(this.X, i7.f6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i15 = org.telegram.ui.ActionBar.g6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 51), 2, -1));
            TextView textView4 = this.n;
            int i16 = org.telegram.ui.ActionBar.g6.q7;
            textView4.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i16, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.b0 == ((lh.k6) objArr[0])) {
            r0();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.a;
        int i11 = org.telegram.ui.ActionBar.g6.a;
        int i12 = org.telegram.ui.ActionBar.g6.a;
        return super.getThemeDescriptions();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.jr.f);
        duration.addUpdateListener(new g3(this, 3));
        duration.addListener(new nh.q5(this, 10));
        duration.start();
        this.N = duration;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            s0((c8) this.b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.b.getCachedChildCount(); i11++) {
            c8 c8Var = (c8) this.b.P(i11);
            s0(c8Var, false);
            c8.a(c8Var, this.L, this.M);
            c8.b(c8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.b.getHiddenChildCount(); i12++) {
            c8 c8Var2 = (c8) this.b.V(i12);
            s0(c8Var2, false);
            c8.a(c8Var2, this.L, this.M);
            c8.b(c8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.b.getAttachedScrapChildCount(); i13++) {
            c8 c8Var3 = (c8) this.b.O(i13);
            s0(c8Var3, false);
            c8.a(c8Var3, this.L, this.M);
            c8.b(c8Var3, 1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!this.C) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.C = false;
            this.M = 0;
            this.L = 0;
            t0();
            o0();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.x = getArguments().getLong("dialog_id");
        this.y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.a0 = i10;
        if (i10 == 2) {
            this.b0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.x, 0, -1, true);
        } else if (i10 == 3) {
            this.b0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.x, 1, -1, true);
        }
        lh.k6 k6Var = this.b0;
        if (k6Var != null) {
            this.c0 = new h(this, 8);
        }
        if (this.x >= 0) {
            this.Z = true;
        } else {
            this.Z = false;
        }
        if (k6Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.b0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        cg.h0 h0Var;
        if (z10 && (h0Var = this.v) != null && h0Var.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        super.onTransitionAnimationProgress(z10, f9);
        cg.h0 h0Var = this.v;
        if (h0Var == null || h0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.v.setAlpha(1.0f - f9);
        } else {
            this.v.setAlpha(f9);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.U = true;
    }

    public final void p0() {
        if (this.A || this.P) {
            return;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            View childAt = this.b.getChildAt(i11);
            if (childAt instanceof c8) {
                c8 c8Var = (c8) childAt;
                int i12 = (c8Var.b * 100) + c8Var.c;
                if (i12 < i10) {
                    i10 = i12;
                }
            }
        }
        int i13 = this.S;
        if ((i13 % 100) + ((i13 / 100) * 12) + 3 >= (i10 % 100) + ((i10 / 100) * 12)) {
            q0();
        }
    }

    public final void q0() {
        if (this.A || this.P) {
            return;
        }
        if (this.b0 != null) {
            r0();
            this.b0.p(100, false);
            this.A = this.b0.k();
            return;
        }
        this.A = true;
        TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
        int i10 = this.T;
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
        tL_messages_getSearchResultsCalendar.offset_id = this.R;
        Calendar calendar = Calendar.getInstance();
        this.b.setItemAnimator(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new bg.h3(25, this, calendar));
    }

    public final void r0() {
        this.A = this.b0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        this.Y = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 = 0; i10 < this.b0.i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.b0.i.get(i10);
            this.Y = Math.min(this.Y, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            d8 d8Var = (d8) sparseArray2.get(i12);
            if (d8Var == null) {
                d8Var = new d8();
                d8Var.b = new ArrayList();
            }
            d8Var.b.add(Integer.valueOf(messageObject.getId()));
            d8Var.a = messageObject;
            d8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, d8Var);
            int i13 = this.S;
            if (i11 < i13 || i13 == 0) {
                this.S = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.Y; i14 < currentTimeMillis; i14 += 86400) {
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
                d8 d8Var2 = new d8();
                d8Var2.g = false;
                d8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, d8Var2);
            }
        }
        this.P = this.b0.r;
        if (this.U) {
            this.B = true;
        }
        this.b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.Y) / 2629800)) + 1;
        this.H.q(0, this.G);
        int i17 = this.G;
        if (timeInMillis > i17) {
            this.H.s(i17 + 1, timeInMillis);
            this.G = timeInMillis;
        }
        if (this.P) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void s0(c8 c8Var, boolean z10) {
        int i10;
        int i11;
        if (this.L == 0 || this.M == 0) {
            SparseArray sparseArray = c8Var.w;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                c8Var.c(sparseArray.keyAt(i12), 0, 0, false, z10);
            }
            return;
        }
        if (c8Var.n == null) {
            return;
        }
        boolean z11 = false;
        if (!z10) {
            SparseArray sparseArray2 = c8Var.w;
            int i13 = 0;
            while (i13 < sparseArray2.size()) {
                c8Var.c(sparseArray2.keyAt(i13), 0, 0, false, z11);
                i13++;
                z11 = false;
            }
        }
        int i14 = c8Var.e;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        for (int i18 = 0; i18 < c8Var.d; i18++) {
            d8 d8Var = (d8) c8Var.n.get(i18, null);
            if (d8Var != null && (i11 = d8Var.h) >= this.L && i11 <= this.M) {
                if (i15 == -1) {
                    i15 = i14;
                }
                i16 = i14;
            }
            i14++;
            if (i14 >= 7) {
                if (i15 == -1 || i16 == -1) {
                    i10 = i17;
                    c8Var.c(i10, 0, 0, false, z10);
                } else {
                    i10 = i17;
                    c8Var.c(i10, i15, i16, true, z10);
                }
                i17 = i10 + 1;
                i14 = 0;
                i15 = -1;
                i16 = -1;
            }
        }
        int i19 = i17;
        if (i15 == -1 || i16 == -1) {
            c8Var.c(i19, 0, 0, false, z10);
        } else {
            c8Var.c(i19, i15, i16, true, z10);
        }
    }

    public final void t0() {
        String string;
        org.telegram.ui.Components.g40 g40Var;
        if (!this.Z) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
            this.D.c(0.0f, true);
            return;
        }
        int i10 = this.L;
        int i11 = this.M;
        int abs = (i10 == i11 && i10 == 0) ? 0 : (Math.abs(i10 - i11) / 86400) + 1;
        boolean z10 = this.i0;
        int i12 = this.h0;
        if (abs == i12 && z10 == this.C) {
            return;
        }
        boolean z11 = i12 > abs;
        this.h0 = abs;
        boolean z12 = this.C;
        this.i0 = z12;
        if (abs > 0) {
            string = LocaleController.formatPluralString("Days", abs, new Object[0]);
            this.D.c(1.0f, true);
        } else if (z12) {
            string = LocaleController.getString(R.string.SelectDays);
            this.D.c(1.0f, true);
        } else {
            string = LocaleController.getString(R.string.Calendar);
            this.D.c(0.0f, true);
        }
        String str = string;
        if (abs > 1) {
            this.n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.C) {
            this.n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.I(str, z11, 150L, null);
        if ((!this.C || abs > 0) && (g40Var = this.K) != null) {
            g40Var.b(true);
        }
        if (abs > 0 || this.C) {
            if (this.n.getVisibility() == 8) {
                this.n.setAlpha(0.0f);
                this.n.setTranslationY(-AndroidUtilities.dp(20.0f));
            }
            this.n.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.n.animate().setListener(null).cancel();
            this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.z9(this.h)).start();
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
        this.n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.z9(this.n)).start();
        this.h.setEnabled(true);
        this.n.setEnabled(false);
    }
}
