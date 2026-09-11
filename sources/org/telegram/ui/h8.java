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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class h8 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.g2 H;
    public int I;
    public int J;
    public int K;
    public w7 L;
    public l.d M;
    public co N;
    public org.telegram.ui.Components.i40 O;
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
    public u7 a;
    public final int a0;
    public bi.o0 b;
    public bi.g5 b0;
    public s4.c0 c;
    public int c0;
    public final TextPaint d;
    public boolean d0;
    public final TextPaint e;
    public int e0;
    public final TextPaint f;
    public bi.l8 f0;
    public g g0;
    public TextView h;
    public int h0;
    public z0 i0;
    public final Path j0;
    public final wh.h k0;
    public int l0;
    public boolean m0;
    public TextView n;
    public final Paint r;
    public final Paint s;
    public di.eb v;
    public final Paint w;
    public long x;
    public long y;

    public h8(int i10, int i11, Bundle bundle) {
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
        this.j0 = new Path();
        this.k0 = new wh.h();
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

    public static /* synthetic */ void U(h8 h8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
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
                f8Var.a = new MessageObject(h8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
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
                h8Var.V = ((TLRPC.Message) i2.g.h(1, tL_messages_searchResultsCalendar.messages)).id;
                h8Var.T = false;
                h8Var.p0();
            }
            if (h8Var.Y) {
                h8Var.F = true;
            }
            h8Var.b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            h8Var.L.q(0, h8Var.K);
            int i18 = h8Var.K;
            if (timeInMillis > i18) {
                h8Var.L.s(i18 + 1, timeInMillis);
                h8Var.K = timeInMillis;
            }
            if (h8Var.T) {
                h8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static void b0(h8 h8Var) {
        if (h8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (h8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (h8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        h8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        h8Var.v.setBackground(new BitmapDrawable(createBitmap));
        h8Var.v.setAlpha(0.0f);
        h8Var.v.setVisibility(0);
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        this.a = new u7(this, context);
        createActionBar(context);
        this.a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        bi.o0 o0Var = new bi.o0(this, context, 6);
        this.b = o0Var;
        s4.c0 c0Var = new s4.c0();
        this.c = c0Var;
        o0Var.setLayoutManager(c0Var);
        this.c.k1(true);
        bi.o0 o0Var2 = this.b;
        w7 w7Var = new w7(this, 0);
        this.L = w7Var;
        o0Var2.setAdapter(w7Var);
        this.b.j(new i3(this, 3));
        boolean z10 = this.e0 == 0 && this.d0;
        this.a.addView(this.b, w7.x5.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z10 ? 48.0f : 0.0f));
        this.a.addView(new bi.a4(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), w7.x5.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 24));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int w10 = com.google.android.gms.internal.vision.e2.w(this.I, i11, 12, i10) - this.a0;
            this.K = w10 + 1;
            this.c.h1(w10, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.H = g2Var;
        this.actionBar.setBackButtonDrawable(g2Var);
        this.H.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        this.e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.H.a(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            bi.g5 g5Var = new bi.g5(context, 8);
            this.b0 = g5Var;
            g5Var.setWillNotDraw(false);
            this.b0.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.b0.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            final int i13 = 0;
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t7
                public final /* synthetic */ h8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            h8 h8Var = this.b;
                            h8Var.G = true;
                            h8Var.t0();
                            break;
                        default:
                            h8 h8Var2 = this.b;
                            int i14 = h8Var2.l0;
                            if (i14 != 0) {
                                org.telegram.ui.Components.e5.r(h8Var2, i14, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.x)), null, false, new v7(h8Var2), null);
                                break;
                            } else {
                                if (h8Var2.O == null) {
                                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(h8Var2.a.getContext(), 8);
                                    h8Var2.O = i40Var;
                                    i40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    h8Var2.a.addView(h8Var2.O, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    h8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                h8Var2.O.f(h8Var2.b0, true);
                                break;
                            }
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.b0.addView(this.h, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(AndroidUtilities.bold());
            final int i14 = 1;
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t7
                public final /* synthetic */ h8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            h8 h8Var = this.b;
                            h8Var.G = true;
                            h8Var.t0();
                            break;
                        default:
                            h8 h8Var2 = this.b;
                            int i142 = h8Var2.l0;
                            if (i142 != 0) {
                                org.telegram.ui.Components.e5.r(h8Var2, i142, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.x)), null, false, new v7(h8Var2), null);
                                break;
                            } else {
                                if (h8Var2.O == null) {
                                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(h8Var2.a.getContext(), 8);
                                    h8Var2.O = i40Var;
                                    i40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    h8Var2.a.addView(h8Var2.O, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    h8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                h8Var2.O.f(h8Var2.b0, true);
                                break;
                            }
                    }
                }
            });
            this.n.setAllCaps(true);
            this.n.setVisibility(8);
            this.b0.addView(this.n, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.a.addView(this.b0, w7.x5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
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
        if (i10 == NotificationCenter.storiesListUpdated && this.f0 == ((bi.l8) objArr[0])) {
            r0();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.a;
        int i11 = org.telegram.ui.ActionBar.j6.a;
        int i12 = org.telegram.ui.ActionBar.j6.a;
        return super.getThemeDescriptions();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.pr.f);
        duration.addUpdateListener(new c3(this, 3));
        duration.addListener(new s0(this, 5));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            s0((e8) this.b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.b.getCachedChildCount(); i11++) {
            e8 e8Var = (e8) this.b.P(i11);
            s0(e8Var, false);
            e8.a(e8Var, this.P, this.Q);
            e8.b(e8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.b.getHiddenChildCount(); i12++) {
            e8 e8Var2 = (e8) this.b.V(i12);
            s0(e8Var2, false);
            e8.a(e8Var2, this.P, this.Q);
            e8.b(e8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.b.getAttachedScrapChildCount(); i13++) {
            e8 e8Var3 = (e8) this.b.O(i13);
            s0(e8Var3, false);
            e8.a(e8Var3, this.P, this.Q);
            e8.b(e8Var3, 1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!this.G) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.G = false;
            this.Q = 0;
            this.P = 0;
            t0();
            o0();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        bi.l8 l8Var = this.f0;
        if (l8Var != null) {
            this.g0 = new g(this, 8);
        }
        if (this.x >= 0) {
            this.d0 = true;
        } else {
            this.d0 = false;
        }
        if (l8Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        di.eb ebVar;
        if (z10 && (ebVar = this.v) != null && ebVar.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        di.eb ebVar = this.v;
        if (ebVar == null || ebVar.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.v.setAlpha(1.0f - f7);
        } else {
            this.v.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.Y = true;
    }

    public final void p0() {
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
            q0();
        }
    }

    public final void q0() {
        if (this.E || this.T) {
            return;
        }
        if (this.f0 != null) {
            r0();
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
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new bi.m1(22, this, calendar));
    }

    public final void r0() {
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
            f8 f8Var = (f8) sparseArray2.get(i12);
            if (f8Var == null) {
                f8Var = new f8();
                f8Var.b = new ArrayList();
            }
            f8Var.b.add(Integer.valueOf(messageObject.getId()));
            f8Var.a = messageObject;
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

    public final void s0(e8 e8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P == 0 || this.Q == 0) {
            SparseArray sparseArray = e8Var.w;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                e8Var.c(sparseArray.keyAt(i12), 0, 0, false, z10);
            }
            return;
        }
        if (e8Var.n == null) {
            return;
        }
        boolean z11 = false;
        if (!z10) {
            SparseArray sparseArray2 = e8Var.w;
            int i13 = 0;
            while (i13 < sparseArray2.size()) {
                e8Var.c(sparseArray2.keyAt(i13), 0, 0, false, z11);
                i13++;
                z11 = false;
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
                i14 = 0;
                i15 = -1;
                i16 = -1;
            }
        }
        int i19 = i17;
        if (i15 == -1 || i16 == -1) {
            e8Var.c(i19, 0, 0, false, z10);
        } else {
            e8Var.c(i19, i15, i16, true, z10);
        }
    }

    public final void t0() {
        String string;
        org.telegram.ui.Components.i40 i40Var;
        if (!this.d0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
            this.H.c(0.0f, true);
            return;
        }
        int i10 = this.P;
        int i11 = this.Q;
        int abs = (i10 == i11 && i10 == 0) ? 0 : (Math.abs(i10 - i11) / 86400) + 1;
        boolean z10 = this.m0;
        int i12 = this.l0;
        if (abs == i12 && z10 == this.G) {
            return;
        }
        boolean z11 = i12 > abs;
        this.l0 = abs;
        boolean z12 = this.G;
        this.m0 = z12;
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
        this.actionBar.J(str, z11, 150L, null);
        if ((!this.G || abs > 0) && (i40Var = this.O) != null) {
            i40Var.b(true);
        }
        if (abs > 0 || this.G) {
            if (this.n.getVisibility() == 8) {
                this.n.setAlpha(0.0f);
                this.n.setTranslationY(-AndroidUtilities.dp(20.0f));
            }
            this.n.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.n.animate().setListener(null).cancel();
            this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new to(this.h)).start();
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
        this.n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new to(this.n)).start();
        this.h.setEnabled(true);
        this.n.setEnabled(false);
    }
}
