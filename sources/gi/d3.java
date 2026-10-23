package gi;

import ai.r7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cast.z5;
import ei.bc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ga1;
import org.telegram.ui.qn;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class d3 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.t3 {
    public static final HashSet W0 = new HashSet();
    public static final ew0 X0;
    public static int Y0;
    public boolean A0;
    public y0 B0;
    public boolean C0;
    public org.telegram.ui.ActionBar.m3 D0;
    public final d6 E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public int G;
    public float G0;
    public long H;
    public ga1 H0;
    public long I;
    public Drawable I0;
    public long J;
    public final HashMap J0;
    public int K;
    public i80 K0;
    public long L;
    public i0 L0;
    public String M;
    public boolean M0;
    public final Paint N;
    public float N0;
    public final Paint O;
    public ValueAnimator O0;
    public final Paint P;
    public ValueAnimator P0;
    public int Q;
    public boolean Q0;
    public int R;
    public ValueAnimator R0;
    public boolean S;
    public boolean S0;
    public final Paint T;
    public String T0;
    public boolean U;
    public org.telegram.ui.f3 U0;
    public boolean V;
    public boolean V0;
    public final a3 W;
    public final FrameLayout.LayoutParams X;
    public final Drawable Y;
    public org.telegram.ui.ActionBar.u0 Z;
    public int a;
    public BotFullscreenButtons.OptionsIcon a0;
    public float b;
    public boolean b0;
    public o1.k c;
    public boolean c0;
    public Boolean d;
    public boolean d0;
    public final c3 e;
    public boolean e0;
    public final Rect f;
    public float f0;
    public float g0;
    public final Rect h;
    public boolean h0;
    public int i0;
    public int j0;
    public Activity k0;
    public final z2 l0;
    public final BotFullscreenButtons m0;
    public int n;
    public qc n0;
    public h0 o0;
    public final FrameLayout p0;
    public final FrameLayout.LayoutParams q0;
    public final org.telegram.ui.ActionBar.n3 r;
    public boolean r0;
    public final z5 s;
    public final me0 s0;
    public final y1 t0;
    public int u0;
    public final u2 v;
    public t4 v0;
    public final FrameLayout.LayoutParams w;
    public boolean w0;
    public final v2 x;
    public boolean x0;
    public final b3 y;
    public boolean y0;
    public Boolean z0;

    static {
        ew0 ew0Var = new ew0(new fh.b(7), new fh.b(8));
        ew0Var.c = 100.0f;
        X0 = ew0Var;
        Y0 = 0;
    }

    public d3(Context context, d6 d6Var) {
        super(context, R.style.TransparentDialog);
        this.b = 0.0f;
        this.f = new Rect();
        this.h = new Rect();
        this.n = 0;
        Paint paint = new Paint(1);
        this.N = paint;
        Paint paint2 = new Paint();
        this.O = paint2;
        this.P = new Paint(1);
        this.T = new Paint(1);
        this.t0 = new y1(this, 1);
        this.u0 = -1;
        this.y0 = false;
        this.z0 = null;
        this.J0 = new HashMap();
        this.M0 = false;
        this.Q0 = true;
        this.V0 = false;
        this.E = d6Var;
        this.a = h6.x0(null, h6.Ii, false);
        u2 u2Var = new u2(this, context, 0);
        this.v = u2Var;
        u2Var.setAllowFullSizeSwipe(true);
        u2Var.setShouldWaitWebViewScroll(true);
        int i10 = h6.d6;
        v2 v2Var = new v2(h6.w0(i10, d6Var), 0, context, this, d6Var);
        this.x = v2Var;
        v2Var.setOnVerifiedAge(this.H0);
        v2Var.setDelegate(new y2(this, context, d6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(TLObject.FLAG_30);
        this.Q = h6.w0(i10, d6Var);
        int w02 = h6.w0(h6.a7, d6Var);
        this.R = w02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, w02, false);
        c3 c3Var = new c3(this, context);
        this.e = c3Var;
        c3Var.setDelegate(new a2(this, 0));
        FrameLayout.LayoutParams e = w7.z5.e(-1, -1, 49);
        this.w = e;
        c3Var.addView(u2Var, e);
        z2 z2Var = new z2(this, getContext(), d6Var);
        this.l0 = z2Var;
        z2Var.setOnButtonClickListener(new b2(this, 0));
        z2Var.setOnResizeListener(new y1(this, 3));
        c3Var.addView(z2Var, w7.z5.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.m0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        boolean z10 = !MessagesController.getInstance(this.G).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2;
        this.e0 = z10;
        botFullscreenButtons.setParentRenderNode(z10 ? u2Var.getRenderNode() : null);
        c3Var.addView(botFullscreenButtons, w7.z5.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new y1(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new y1(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new y1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.p0 = frameLayout;
        FrameLayout.LayoutParams e7 = w7.z5.e(-1, 200, 55);
        this.q0 = e7;
        c3Var.addView(frameLayout, e7);
        this.Y = getContext().getDrawable(R.drawable.header_shadow).mutate();
        a3 a3Var = new a3(context, d6Var);
        this.W = a3Var;
        a3Var.setBackgroundColor(0);
        a3Var.setBackButtonImage(R.drawable.ic_close_white);
        B();
        a3Var.setActionBarMenuOnItemClick(new ah.s(this, 3));
        a3Var.setAlpha(0.0f);
        FrameLayout.LayoutParams e10 = w7.z5.e(-1, -2, 49);
        this.X = e10;
        c3Var.addView(a3Var, e10);
        b3 b3Var = new b3(context, d6Var);
        this.y = b3Var;
        c3Var.addView(b3Var, w7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        v2Var.setWebViewProgressListener(new r7(this, 2));
        u2Var.addView(v2Var, w7.z5.c(-1.0f, -1));
        u2Var.setScrollListener(new y1(this, 7));
        u2Var.setScrollEndListener(new y1(this, 8));
        u2Var.setDelegate(new z1(this));
        u2Var.setIsKeyboardVisible(new z1(this));
        me0 me0Var = new me0(context);
        this.s0 = me0Var;
        c3Var.addView(me0Var, w7.z5.c(-1.0f, -1));
        setContentView(c3Var, new ViewGroup.LayoutParams(-1, -1));
        E();
        LaunchActivity launchActivity = LaunchActivity.H1;
        org.telegram.ui.ActionBar.n3 P = launchActivity != null ? launchActivity.P() : null;
        this.r = P;
        if (P != null) {
            bc bcVar = new bc(c3Var, 9);
            y1 y1Var = new y1(this, 2);
            P.I.add(bcVar);
            P.J.add(y1Var);
            this.s = new z5(P);
        }
    }

    public static /* synthetic */ void d(d3 d3Var) {
        if (d3Var.M0) {
            return;
        }
        super.dismiss();
        d3Var.M0 = true;
    }

    public static WindowInsets e(d3 d3Var, View view, WindowInsets windowInsets) {
        r0.h1 h1Var = r0.k1.h(view, windowInsets).a;
        i0.b f7 = h1Var.f(2);
        d3Var.f.set(f7.a, f7.b, f7.c, f7.d);
        i0.b f10 = h1Var.f(647);
        Rect rect = d3Var.h;
        rect.set(Math.max(f10.a, windowInsets.getStableInsetLeft()), Math.max(f10.b, windowInsets.getStableInsetTop()), Math.max(f10.c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(d3Var.getContext()));
        }
        int i11 = h1Var.f(8).d;
        if (i11 <= rect.bottom || i11 <= AndroidUtilities.dp(20.0f)) {
            d3Var.n = 0;
        } else {
            d3Var.n = i11;
        }
        d3Var.E();
        return i10 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void j(int i10, long j10, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
            if (tL_attachMenuBot3.bot_id == j10) {
                tL_attachMenuBot = tL_attachMenuBot3;
                break;
            }
        }
        if (tL_attachMenuBot == null) {
            return;
        }
        String formatString = LocaleController.formatString(R.string.BotRemoveFromMenu, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.R().getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new q1(i10, j10, tL_attachMenuBot, runnable));
        i2.e.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject q(d6 d6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = h6.v(-16777216, h6.w0(h6.h5, d6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() { // from class: gi.d2
                @Override // org.telegram.messenger.Utilities.CallbackReturn
                public final Object run(Object obj) {
                    int v10 = h6.v(v, ((Integer) obj).intValue());
                    return z10 ? String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v10)), Integer.valueOf(Color.green(v10)), Integer.valueOf(Color.blue(v10))) : Integer.valueOf(v10);
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.d6, d6Var))));
            int i10 = h6.a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(h6.w0(i10, d6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.G6, d6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.H6, d6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.J6, d6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.Oh, d6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.Sh, d6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.s8, d6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.q6, d6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.L6, d6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.z6, d6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.p7, d6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(h6.w0(h6.d7, d6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(h6.w0(i10, d6Var))));
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void A(boolean z10) {
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.N0 - (z10 ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N0, z10 ? 1.0f : 0.0f);
        this.O0 = ofFloat;
        ofFloat.addListener(new ah.p0(15, this, z10));
        this.O0.addUpdateListener(new x1(this, 0));
        this.O0.setInterpolator(bs.h);
        this.O0.setDuration(220L);
        this.O0.start();
    }

    public final void B() {
        if (!this.U) {
            int i10 = h6.G6;
            d6 d6Var = this.E;
            int w02 = h6.w0(i10, d6Var);
            a3 a3Var = this.W;
            a3Var.setTitleColor(w02);
            a3Var.C(h6.w0(i10, d6Var), false);
            a3Var.B(h6.w0(h6.u8, d6Var), false);
            a3Var.D(h6.w0(h6.G8, d6Var), false);
            a3Var.E(h6.w0(h6.E8, d6Var), false, false);
            a3Var.E(h6.w0(h6.F8, d6Var), true, false);
            a3Var.F(h6.w0(h6.I5, d6Var), false);
        }
        this.x.setFlickerViewColor(this.P.getColor());
    }

    public final void C() {
        qc qcVar;
        boolean z10;
        j0 c10 = j0.c(getContext(), this.G, this.H);
        ArrayList arrayList = c10.e;
        i0 i0Var = c10.f;
        boolean z11 = true;
        if (i0Var == null) {
            qc qcVar2 = this.n0;
            if (qcVar2 != null) {
                qcVar2.b();
                this.n0 = null;
            }
        } else if ((!i0Var.c() || i0Var.l) && !i0Var.k) {
            h0 h0Var = this.o0;
            if (h0Var != null) {
                this.L0 = i0Var;
                if (h0Var.c(i0Var)) {
                    this.n0 = null;
                }
            }
        } else {
            if (this.L0 != i0Var && (qcVar = this.n0) != null) {
                qcVar.b();
                this.n0 = null;
            }
            qc qcVar3 = this.n0;
            if (qcVar3 == null || !qcVar3.l) {
                this.L0 = i0Var;
                h0 h0Var2 = new h0(getContext(), this.E);
                this.o0 = h0Var2;
                qc f7 = qc.f(this.p0, h0Var2, 5000);
                this.n0 = f7;
                f7.k(true);
            }
            if (this.o0.c(i0Var)) {
                this.n0 = null;
            }
            i0Var.k = false;
            i0Var.l = true;
        }
        D();
        for (Map.Entry entry : this.J0.entrySet()) {
            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) entry.getValue();
            i0 i0Var2 = (i0) entry.getKey();
            e1Var.setText(i0Var2.c);
            if (i0Var2.c()) {
                Pair b10 = i0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    e1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
                } else {
                    e1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
                }
            } else {
                e1Var.setSubtext(AndroidUtilities.formatFileSize(i0Var2.g));
            }
            if (i0Var2.c()) {
                e1Var.setRightIcon(R.drawable.msg_close);
                e1Var.b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (i0Var2.i) {
                e1Var.setVisibility(8);
            } else {
                e1Var.setRightIcon(0);
                e1Var.b.setPadding(0, 0, 0, 0);
            }
            e1Var.setOnClickListener(new ai.p(18, this, i0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.a0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (((i0) obj).c()) {
                z10 = true;
                break;
            }
        }
        optionsIcon.setDownloading(z10);
        int size2 = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                z11 = false;
                break;
            }
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((i0) obj2).c()) {
                break;
            }
        }
        this.m0.setDownloading(z11);
    }

    public final void D() {
        h0 h0Var = this.o0;
        if (h0Var == null) {
            return;
        }
        if (this.d0) {
            h0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f0));
        } else if (this.b > 0.5f) {
            h0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            h0Var.setArrow(-1);
        }
    }

    public final void E() {
        BotFullscreenButtons botFullscreenButtons = this.m0;
        Rect rect = this.h;
        botFullscreenButtons.setInsets(rect);
        boolean z10 = this.d0;
        v2 v2Var = this.x;
        c3 c3Var = this.e;
        z2 z2Var = this.l0;
        if (z10) {
            int i10 = (z2Var == null || z2Var.getTotalHeight() <= 0) ? 0 : rect.bottom;
            Rect rect2 = new Rect(rect.left, rect.top, rect.right, (this.n <= i10 && (z2Var == null || z2Var.getTotalHeight() <= 0)) ? rect.bottom : 0);
            int dp = AndroidUtilities.dp(46.0f);
            v2Var.P(rect2, false);
            v2Var.O(dp, false);
            c3Var.setPadding(0, 0, 0, Math.max(this.n, i10));
        } else {
            v2Var.P(new Rect(0, 0, 0, 0), false);
            v2Var.O(0, false);
            int i11 = rect.left;
            int i12 = rect.right;
            int i13 = this.n;
            org.telegram.ui.ActionBar.n3 n3Var = this.r;
            c3Var.setPadding(i11, 0, i12, Math.max(i13, (n3Var != null ? n3Var.H : 0) + rect.bottom));
        }
        this.w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.d0;
        int i14 = !z11 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams = this.X;
        layoutParams.leftMargin = i14;
        layoutParams.rightMargin = 0;
        int i15 = !z11 ? 0 : rect.left;
        FrameLayout.LayoutParams layoutParams2 = this.q0;
        layoutParams2.leftMargin = i15;
        layoutParams2.rightMargin = !z11 ? 0 : rect.right;
        boolean z12 = this.h0;
        u2 u2Var = this.v;
        if (!z12) {
            u2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.d0) {
                u2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                u2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            u2Var.setSwipeOffsetAnimationDisallowed(false);
            u2Var.c();
            u2Var.invalidate();
            u2Var.requestLayout();
        }
        if (u2Var != null) {
            u2Var.setFullSize(n());
        }
        z2Var.requestLayout();
        c3Var.requestLayout();
        botFullscreenButtons.setVisibility(this.d0 ? 0 : 8);
    }

    public final void F() {
        boolean z10;
        if (this.U) {
            z10 = !this.S;
        } else {
            z10 = !AndroidUtilities.isTablet() && i0.a.h(h6.x0(null, h6.d6, true)) >= 0.7210000157356262d && this.b >= 0.85f;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            this.d = Boolean.valueOf(z10);
            c3 c3Var = this.e;
            int systemUiVisibility = c3Var.getSystemUiVisibility();
            c3Var.setSystemUiVisibility(z10 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    public final void G() {
        org.telegram.ui.web.x0 webView;
        v2 v2Var = this.x;
        if (v2Var == null || (webView = v2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.P.getColor());
    }

    public final void H() {
        z2 z2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i10 = Build.VERSION.SDK_INT <= 28 ? 1024 : 512;
            boolean z10 = this.d0;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            c3 c3Var = this.e;
            if (!z10 || (((z2Var = this.l0) != null && z2Var.getTotalHeight() > 0) || c3Var.x0)) {
                c3Var.setSystemUiVisibility(c3Var.getSystemUiVisibility() & (-3));
            } else {
                c3Var.setSystemUiVisibility(c3Var.getSystemUiVisibility() | 2);
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final org.telegram.ui.ActionBar.m3 a() {
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        m3Var.q = this.Q;
        m3Var.p = this.u0;
        m3Var.n = this.U;
        m3Var.o = this.V;
        m3Var.r = this.P.getColor();
        m3Var.a = this.v0;
        v2 v2Var = this.x;
        m3Var.t = v2Var != null && v2Var.N;
        m3Var.D = h6.I.q();
        m3Var.x = v2Var != null ? v2Var.getUrlLoaded() : null;
        m3Var.e = v2Var != null && v2Var.t0;
        m3Var.f = v2Var != null ? v2Var.getTrustedOrigin() : null;
        u2 u2Var = this.v;
        m3Var.j = (u2Var != null && u2Var.getSwipeOffsetY() < 0.0f) || this.x0 || n() || this.d0;
        m3Var.z = this.d0;
        m3Var.A = this.e0;
        Boolean bool = this.z0;
        m3Var.B = bool == null ? this.y0 : bool.booleanValue();
        m3Var.k = u2Var != null ? u2Var.getOffsetY() : Float.MAX_VALUE;
        m3Var.C = this.A0;
        m3Var.u = this.w0;
        m3Var.y = this.r0;
        m3Var.v = this.b0;
        m3Var.l = u2Var == null || u2Var.M;
        m3Var.w = this.l0.e;
        m3Var.s = this.R;
        y0 y0Var = this.B0;
        if (y0Var != null) {
            y0Var.b();
        }
        m3Var.K = this.B0;
        org.telegram.ui.web.x0 webView = v2Var != null ? v2Var.getWebView() : null;
        if (webView != null) {
            v2Var.L();
            m3Var.b = webView;
            m3Var.d = v2Var.getBotProxy();
            m3Var.g = webView.getWidth();
            m3Var.h = webView.getHeight();
            webView.onPause();
        }
        boolean z10 = this.S0;
        m3Var.G = z10;
        if (z10) {
            m3Var.H = this.T0;
        }
        m3Var.L = this.C0;
        this.D0 = m3Var;
        return m3Var;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.J == ((Long) objArr[0]).longValue()) {
                k(false);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.didSetNewTheme) {
            if (i10 == NotificationCenter.botDownloadsUpdate) {
                C();
            }
        } else {
            this.e.invalidate();
            this.x.n.b(h6.w0(h6.d6, this.E), 153);
            B();
            F();
        }
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final void dismiss(boolean z10) {
        k(false);
    }

    public final void g(TL_bots.botAppSettings botappsettings, boolean z10) {
        if (botappsettings == null) {
            return;
        }
        boolean q6 = h6.I.q();
        int i10 = botappsettings.flags;
        boolean z11 = ((q6 ? 4 : 2) & i10) != 0;
        if ((i10 & (q6 ? 16 : 8)) != 0) {
            u((q6 ? botappsettings.header_dark_color : botappsettings.header_color) | (-16777216), true, z10);
        }
        if (z11) {
            w((q6 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z10);
            z((q6 ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final int getNavigationBarColor(int i10) {
        return i0.a.f(this.N0, i10, this.R);
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final org.telegram.ui.ActionBar.u3 getWindowView() {
        return this.e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.M0 && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.H(true, true, true);
        }
        c3 c3Var = this.e;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public final void i() {
        if (this.U0 == null) {
            org.telegram.ui.f3 f3Var = new org.telegram.ui.f3(getContext());
            this.U0 = f3Var;
            this.v.addView(f3Var, w7.z5.c(-1.0f, -1));
            this.U0.setTranslationY(-1.0f);
            this.U0.h.setOnClickListener(new h2(this, 0));
            this.U0.setBackgroundColor(this.P.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.U0, this.S0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        LaunchActivity launchActivity;
        if (this.c0) {
            return;
        }
        if (this.H0 != null) {
            z10 = false;
        }
        this.c0 = true;
        A(false);
        AndroidUtilities.cancelRunOnUIThread(this.t0);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.G).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.H1) == null || launchActivity.y0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.k kVar = this.c;
            if (kVar != null) {
                kVar.u.i = 0.0f;
                kVar.h();
            }
            LaunchActivity.H1.y0.b(this);
        } else {
            z2 z2Var = this.l0;
            if (z2Var != null) {
                z2Var.animate().translationY(z2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(bs.h).start();
            }
            this.x.h();
            u2 u2Var = this.v;
            int height = u2Var.getHeight() + (z2Var != null ? z2Var.getTotalHeight() : 0);
            Rect rect = this.h;
            u2Var.f(this.e.R() + height + rect.top + rect.bottom + (n() ? AndroidUtilities.dp(200.0f) : 0), true, new y1(this, 0));
        }
        W0.remove(this);
    }

    public final Activity l() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.H1;
        }
        return ownerActivity == null ? AndroidUtilities.findActivity(getContext()) : ownerActivity;
    }

    public final boolean m() {
        t4 t4Var = this.v0;
        return t4Var != null && t4Var.g == 6;
    }

    public final boolean n() {
        if (this.d0) {
            return true;
        }
        Boolean bool = this.z0;
        return bool == null ? this.y0 : bool.booleanValue();
    }

    public final void o() {
        boolean z10;
        if (this.v0 == null) {
            return;
        }
        long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.v0.r));
        String str = null;
        this.z0 = null;
        TLObject tLObject = this.v0.q;
        if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
            TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
            this.J = tL_webViewResultUrl.query_id;
            str = tL_webViewResultUrl.url;
            z10 = tL_webViewResultUrl.same_origin;
            this.z0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
            boolean z11 = this.E0;
            if (!z11) {
                y(tL_webViewResultUrl.fullscreen, !z11, this.e0);
            }
        } else {
            if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                this.J = 0L;
                str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
            } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                this.J = 0L;
                str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
            }
            z10 = false;
        }
        if (str != null && !this.E0) {
            MediaDataController.getInstance(this.G).increaseWebappRating(this.v0.c);
            this.x.t(this.G, str, z10);
        }
        AndroidUtilities.runOnUIThread(this.t0, max);
        u2 u2Var = this.v;
        if (u2Var != null) {
            u2Var.setFullSize(n());
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(true);
        if (this.c == null) {
            o1.k kVar = new o1.k(this, X0);
            o1.l lVar = new o1.l();
            lVar.b(1200.0f);
            lVar.a(1.0f);
            kVar.u = lVar;
            this.c = kVar;
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.s0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            if (this.x.C()) {
                return;
            }
            k(true);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        z2 z2Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i11 = attributes.flags;
        int i12 = i11 & (-3);
        attributes.flags = i12;
        attributes.softInputMode = 16;
        attributes.height = -1;
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.d0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        c3 c3Var = this.e;
        c3Var.setFitsSystemWindows(true);
        c3Var.setSystemUiVisibility(1792);
        c3Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: gi.e2
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return d3.e(d3.this, view, windowInsets);
            }
        });
        if (!this.d0 || ((z2Var = this.l0) != null && z2Var.getTotalHeight() > 0)) {
            c3Var.setSystemUiVisibility(c3Var.getSystemUiVisibility() & (-3));
        } else {
            c3Var.setSystemUiVisibility(c3Var.getSystemUiVisibility() | 2);
        }
        if (i10 >= 26) {
            AndroidUtilities.setLightNavigationBar(this, i0.a.h(this.R) >= 0.7210000157356262d);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.botDownloadsUpdate);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        o1.k kVar = this.c;
        if (kVar != null) {
            kVar.c();
            this.c = null;
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.add(this.s0);
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.remove(this.s0);
        }
    }

    public final void p(boolean z10) {
        if (this.C0 == z10) {
            return;
        }
        this.C0 = z10;
        if (this.V0) {
            if (z10) {
                Y0++;
            } else {
                Y0--;
            }
        }
        if (Y0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final boolean r() {
        if (!this.r0) {
            k(false);
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.R = formatName;
        alertDialog$Builder.a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new z1(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.show();
        ((TextView) b2Var.d(-1)).setTextColor(h6.w0(h6.q7, this.E));
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final void release() {
        if (this.M0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        A(false);
    }

    public final void s() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        int i10;
        ArrayList arrayList;
        int i11;
        boolean m10 = m();
        TLRPC.User user = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(this.G).getAttachMenuBots().bots;
        int size = arrayList2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i12);
            i12++;
            tL_attachMenuBot = tL_attachMenuBot2;
            if (tL_attachMenuBot.bot_id == this.H) {
                break;
            }
        }
        i80 i80Var = this.K0;
        if (i80Var != null) {
            i80Var.u();
        }
        i80 G = i80.G(this.e, this.E, this.d0 ? this.m0 : this.Z, true);
        this.K0 = G;
        ArrayList arrayList3 = j0.c(getContext(), this.G, this.H).e;
        HashMap hashMap = this.J0;
        hashMap.clear();
        if (arrayList3.isEmpty()) {
            i10 = -1;
        } else {
            i80 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new st0(G, 26), false);
            J.k();
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList3.get(i13);
                i13++;
                i0 i0Var = (i0) obj;
                String str = i0Var.c;
                ah.j jVar = new ah.j(15);
                d6 d6Var = J.d;
                if (J.e == null) {
                    arrayList = arrayList3;
                    i11 = size2;
                } else {
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, J.e, J.d, false, false);
                    arrayList = arrayList3;
                    i11 = size2;
                    e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    e1Var.setText(str);
                    e1Var.setSubtext("");
                    Integer num = J.j0;
                    int intValue = num != null ? num.intValue() : h6.w0(h6.E8, d6Var);
                    Integer num2 = J.k0;
                    e1Var.c(intValue, num2 != null ? num2.intValue() : h6.w0(h6.F8, d6Var));
                    Integer num3 = J.l0;
                    e1Var.setSelectorColor(num3 != null ? num3.intValue() : h6.m1(0.12f, h6.w0(h6.E8, d6Var)));
                    e1Var.setOnClickListener(new org.telegram.ui.Components.f0(J, jVar));
                    int i14 = J.S;
                    if (i14 > 0) {
                        e1Var.setMinimumWidth(AndroidUtilities.dp(i14));
                        J.r(e1Var, w7.z5.n(J.S, -2));
                    } else {
                        J.r(e1Var, w7.z5.n(-1, -2));
                        hashMap.put(i0Var, J.y());
                        size2 = i11;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(i0Var, J.y());
                size2 = i11;
                arrayList3 = arrayList;
            }
            i10 = -1;
            C();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new g2(G, J, 0), false);
            G.k();
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new y1(this, 9), this.H0 == null && !m10);
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new y1(this, 10), this.H0 == null && this.b0);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new ah.t(10, this, m10), false);
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new y1(this, 11), this.H0 == null && user != null && user.bot_has_main_app);
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new y1(this, 12), this.H0 == null && !m10);
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new y1(this, 13), this.H0 == null && !m10);
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new y1(this, 14), this.H0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu));
        if (this.Q != h6.x0(null, h6.d6, false)) {
            int i15 = AndroidUtilities.computePerceivedBrightness(this.Q) >= 0.721f ? i10 : -15198183;
            int i16 = AndroidUtilities.computePerceivedBrightness(i15) >= 0.721f ? -16777216 : i10;
            int m12 = h6.m1(0.85f, i16);
            int m13 = h6.m1(0.1f, i16);
            G.P(i15);
            for (int i17 = 0; i17 < G.x(); i17++) {
                View w9 = G.w(i17);
                if (w9 instanceof org.telegram.ui.ActionBar.e1) {
                    org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) w9;
                    e1Var2.c(i16, m12);
                    e1Var2.setSelectorColor(m13);
                }
            }
        }
        G.V(5);
        G.a0(-this.h.right, 0.0f);
        G.U = true;
        G.t = false;
        G.s = 0;
        G.Z();
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            A(true);
            c3 c3Var = this.e;
            c3Var.setAlpha(0.0f);
            c3Var.addOnLayoutChangeListener(new o2(this, 0));
            super.show();
            this.M0 = false;
            W0.add(this);
        }
    }

    public final void t(org.telegram.ui.ActionBar.n2 n2Var, t4 t4Var) {
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        boolean z10;
        boolean z11;
        TL_bots.botAppSettings botappsettings;
        this.v0 = t4Var;
        int i10 = t4Var.a;
        this.G = i10;
        this.I = t4Var.b;
        this.H = t4Var.c;
        this.K = t4Var.h;
        this.L = t4Var.i;
        this.M = t4Var.e;
        boolean z12 = t4Var.g == 6;
        TLRPC.User user2 = z12 ? null : MessagesController.getInstance(i10).getUser(Long.valueOf(this.H));
        CharSequence userName = z12 ? t4Var.e : UserObject.getUserName(user2);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        a3 a3Var = this.W;
        a3Var.setTitle(userName);
        TLRPC.UserFull userFull2 = z12 ? null : MessagesController.getInstance(this.G).getUserFull(this.H);
        d6 d6Var = this.E;
        if ((user2 != null && user2.verified) || (userFull2 != null && (user = userFull2.user) != null && user.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.I0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.Oh, d6Var), PorterDuff.Mode.SRC_IN));
            this.I0.setAlpha(255);
            a3Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            a3Var.getTitleTextView().i(new ei.w3(this, 1));
        }
        BotFullscreenButtons botFullscreenButtons = this.m0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setName(z12 ? t4Var.e : UserObject.getUserName(user2), user2 != null && user2.verified);
        }
        org.telegram.ui.ActionBar.y n10 = a3Var.n();
        n10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.G).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                userFull = userFull2;
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
            i11++;
            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
            userFull = userFull2;
            if (tL_attachMenuBot3.bot_id == this.H) {
                tL_attachMenuBot = tL_attachMenuBot3;
                break;
            }
            userFull2 = userFull;
        }
        if (!this.E0 && !z12) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo == null || (botappsettings = botInfo.app_settings) == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    g(botappsettings, false);
                }
                z11 = true;
            } else {
                z10 = false;
                z11 = true;
                MessagesController.getInstance(this.G).loadFullUser(user2, 0, true, new b2(this, 1));
            }
            if (t4Var.p) {
                y(z11, z10, this.e0);
            }
        }
        if (this.H0 == null) {
            n10.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.a0 = optionsIcon;
        org.telegram.ui.ActionBar.u0 d = n10.d(0, optionsIcon);
        this.Z = d;
        d.setOnClickListener(new h2(this, 1));
        a3Var.setActionBarMenuOnItemClick(new m2(this));
        JSONObject q6 = q(d6Var, false);
        v2 v2Var = this.x;
        v2Var.setBotUser(user2);
        if (!z12) {
            v2Var.s(this.G, this.H);
            TLRPC.User user3 = t4Var.m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.G).isShortcutAdded(this.H, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                if (user3 == null) {
                    user3 = MessagesController.getInstance(this.G).getUser(Long.valueOf(this.H));
                }
                if (user3 != null && user3.photo != null && !FileLoader.getInstance(this.G).getPathToAttach(user3.photo.photo_small, true).exists()) {
                    MediaDataController.getInstance(this.G).preloadImage(ImageLocation.getForUser(this.G, user3, 1), 0);
                }
            }
        }
        if (t4Var.q != null) {
            o();
            return;
        }
        switch (t4Var.g) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = MessagesController.getInstance(this.G).getInputPeer(this.I);
                tL_messages_requestWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = t4Var.o;
                tL_messages_requestWebView.fullscreen = t4Var.p;
                String str = t4Var.f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.K != 0) {
                    TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(this.G).createReplyInput(this.K);
                    tL_messages_requestWebView.reply_to = createReplyInput;
                    if (this.L != 0) {
                        createReplyInput.monoforum_peer_id = MessagesController.getInstance(this.G).getInputPeer(this.L);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.L != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.G).getInputPeer(this.L);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q6.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView, new j2(this, 3));
                NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
                break;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                tL_messages_requestSimpleWebView.from_switch_webview = (t4Var.n & 1) != 0;
                tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestSimpleWebView.platform = "android";
                tL_messages_requestSimpleWebView.from_side_menu = (t4Var.n & 2) != 0;
                tL_messages_requestSimpleWebView.compact = t4Var.o;
                tL_messages_requestSimpleWebView.fullscreen = t4Var.p;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = q6.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(t4Var.f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = t4Var.f;
                }
                if (!TextUtils.isEmpty(t4Var.l)) {
                    tL_messages_requestSimpleWebView.start_param = t4Var.l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestSimpleWebView, new j2(this, 2));
                break;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = MessagesController.getInstance(this.G).getInputUser(this.H);
                tL_messages_requestWebView2.peer = MessagesController.getInstance(this.G).getInputPeer(this.H);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = t4Var.o;
                tL_messages_requestWebView2.fullscreen = t4Var.p;
                tL_messages_requestWebView2.url = t4Var.f;
                tL_messages_requestWebView2.flags |= 2;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = q6.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestWebView2, new j2(this, 1));
                NotificationCenter.getInstance(this.G).addObserver(this, NotificationCenter.webViewResultSent);
                break;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = t4Var.j;
                tL_inputBotAppID.id = botApp.id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = t4Var.k;
                tL_messages_requestAppWebView.platform = "android";
                if (n2Var instanceof qn) {
                    qn qnVar = (qn) n2Var;
                    inputPeer = qnVar.i() != null ? MessagesController.getInputPeer(qnVar.i()) : MessagesController.getInputPeer(qnVar.e);
                } else {
                    inputPeer = MessagesController.getInputPeer(t4Var.m);
                }
                tL_messages_requestAppWebView.peer = inputPeer;
                tL_messages_requestAppWebView.compact = t4Var.o;
                tL_messages_requestAppWebView.fullscreen = t4Var.p;
                if (!TextUtils.isEmpty(t4Var.l)) {
                    tL_messages_requestAppWebView.start_param = t4Var.l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = q6.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestAppWebView, new j2(this, 4), 66);
                break;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.G).getInputUser(t4Var.c);
                tL_messages_requestMainWebView.platform = "android";
                if (n2Var instanceof qn) {
                    qn qnVar2 = (qn) n2Var;
                    inputPeer2 = qnVar2.i() != null ? MessagesController.getInputPeer(qnVar2.i()) : MessagesController.getInputPeer(qnVar2.e);
                } else {
                    inputPeer2 = MessagesController.getInstance(this.G).getInputPeer(t4Var.b);
                }
                tL_messages_requestMainWebView.peer = inputPeer2;
                tL_messages_requestMainWebView.compact = t4Var.o;
                tL_messages_requestMainWebView.fullscreen = t4Var.p;
                if (!TextUtils.isEmpty(t4Var.l)) {
                    tL_messages_requestMainWebView.start_param = t4Var.l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = q6.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.G).sendRequest(tL_messages_requestMainWebView, new j2(this, 5), 66);
                break;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = t4Var.d;
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = q6.toString();
                }
                ConnectionsManager.getInstance(this.G).sendRequestTyped(tL_messages_requestChatJoinWebView, new org.telegram.messenger.a(), new ai.q(this, 27), 66);
                break;
            case 6:
                if (!this.E0) {
                    v2Var.t(this.G, t4Var.f, false);
                    break;
                }
                break;
        }
    }

    public final void u(final int i10, boolean z10, boolean z11) {
        final int i11 = this.Q;
        h6.b(0.35f, -0.1f, i10);
        final w1 w1Var = new w1();
        int i12 = this.U ? this.Q : 0;
        SparseIntArray sparseIntArray = w1Var.a;
        d6 d6Var = this.E;
        w1Var.c(sparseIntArray, i12, d6Var);
        this.U = z10;
        this.S = i0.a.h(i10) < 0.7210000157356262d;
        w1Var.c(w1Var.b, this.U ? i10 : 0, d6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(bs.f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gi.i2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f7 = i0.a.f(floatValue, i11, i10);
                    d3 d3Var = d3.this;
                    d3Var.Q = f7;
                    d3Var.h();
                    c3 c3Var = d3Var.e;
                    c3Var.invalidate();
                    a3 a3Var = d3Var.W;
                    a3Var.setBackgroundColor(d3Var.Q);
                    w1 w1Var2 = w1Var;
                    w1Var2.b(a3Var, floatValue);
                    d3Var.a = w1Var2.a(h6.Ii);
                    c3Var.invalidate();
                }
            });
            duration.addListener(new t2(this, i11, i10, w1Var));
            duration.start();
        } else {
            this.Q = i10;
            h();
            c3 c3Var = this.e;
            c3Var.invalidate();
            int i13 = this.Q;
            a3 a3Var = this.W;
            a3Var.setBackgroundColor(i13);
            w1Var.b(a3Var, 1.0f);
            this.a = w1Var.a(h6.Ii);
            c3Var.invalidate();
        }
        F();
    }

    public final void v(boolean z10) {
        if (this.V0 == z10) {
            return;
        }
        this.V0 = z10;
        if (z10) {
            if (this.C0) {
                Y0++;
            }
        } else if (this.C0) {
            Y0--;
        }
        if (Y0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final void w(int i10, boolean z10) {
        Paint paint = this.P;
        int color = paint.getColor();
        this.V = true;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = 0;
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.P0 = duration;
            duration.setInterpolator(bs.f);
            this.P0.addUpdateListener(new f2(this, color, i10, i11));
            this.P0.addListener(new p2(this, i10, i11));
            this.P0.start();
            return;
        }
        paint.setColor(i10);
        B();
        this.e.invalidate();
        org.telegram.ui.f3 f3Var = this.U0;
        if (f3Var != null) {
            f3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
            this.U0.setBackgroundColor(paint.getColor());
        }
        G();
    }

    public final void x(boolean z10) {
        if (this.y0 != z10) {
            this.y0 = z10;
            u2 u2Var = this.v;
            if (u2Var != null) {
                u2Var.setFullSize(n());
            }
        }
    }

    public final void y(boolean z10, boolean z11, boolean z12) {
        float f7;
        if (this.d0 == z10) {
            return;
        }
        this.d0 = z10;
        this.e0 = z12 && !MessagesController.getInstance(this.G).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2;
        ValueAnimator valueAnimator = this.R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.m0;
        u2 u2Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            botFullscreenButtons.setParentRenderNode(this.e0 ? u2Var.getRenderNode() : null);
        }
        this.i0 = u2Var.getWidth();
        this.j0 = u2Var.getHeight();
        this.Q0 = false;
        z2 z2Var = this.l0;
        v2 v2Var = this.x;
        a3 a3Var = this.W;
        if (!z11) {
            this.h0 = false;
            this.f0 = z10 ? 1.0f : 0.0f;
            this.g0 = 0.0f;
            E();
            H();
            a3Var.setVisibility(z10 ? 8 : 0);
            a3Var.setAlpha(1.0f - this.f0);
            a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f0);
            z2Var.setTranslationX(0.0f);
            botFullscreenButtons.setAlpha(this.f0);
            v2Var.setViewPortHeightOffset(0.0f);
            v2Var.n(true, true);
            D();
            return;
        }
        E();
        H();
        D();
        if (!AndroidUtilities.isTablet() || AndroidUtilities.isInMultiwindow || AndroidUtilities.isSmallTablet()) {
            f7 = 0.0f;
        } else {
            int i10 = AndroidUtilities.displaySize.x;
            f7 = (i10 - ((int) (Math.min(i10, r0.y) * 0.8f))) / 2.0f;
        }
        float f10 = z10 ? this.h.left + f7 : (-r13) - f7;
        if (!z10) {
            f7 = -f7;
        }
        float translationY = z10 ? u2Var.getTranslationY() : -AndroidUtilities.dp(24.0f);
        float currentActionBarHeight = z10 ? -AndroidUtilities.dp(24.0f) : (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f);
        float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        o1.k kVar = u2Var.v;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = u2Var.G;
        if (kVar2 != null) {
            kVar2.c();
        }
        u2Var.setSwipeOffsetAnimationDisallowed(true);
        a3Var.setVisibility(0);
        if (z10) {
            u2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
        } else {
            u2Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
        }
        u2Var.c();
        u2Var.invalidate();
        this.g0 = 0.0f;
        float f11 = z10 ? 0.0f : 1.0f;
        this.f0 = f11;
        a3Var.setAlpha(1.0f - f11);
        a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f0);
        u2Var.setTranslationY(AndroidUtilities.lerp(translationY, currentActionBarHeight, this.g0));
        u2Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.g0));
        z2Var.setTranslationX(AndroidUtilities.lerp(f7, 0.0f, this.g0));
        botFullscreenButtons.setAlpha(this.f0);
        this.e.invalidate();
        v2Var.setViewPortHeightOffset(u2Var.getTranslationY() - currentActionBarHeight);
        v2Var.n(false, false);
        this.h0 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R0 = ofFloat;
        float f12 = f10;
        ofFloat.addUpdateListener(new q2(this, z10, translationY, currentActionBarHeight, f12, f7));
        this.R0.addListener(new r2(this, z10, currentActionBarHeight2, f12));
        this.R0.setDuration(280L);
        this.R0.setInterpolator(bs.h);
        this.R0.start();
    }

    public final void z(int i10, boolean z10) {
        int i11 = this.R;
        z2 z2Var = this.l0;
        Paint paint = z2Var.a;
        z2Var.e.b = i10;
        paint.setColor(i10);
        int i12 = 1;
        if (!z10) {
            z2Var.d.a(i10, true);
        }
        int i13 = 0;
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(bs.f);
            duration.addUpdateListener(new f2(this, i11, i10, i12));
            duration.addListener(new s2(this, i11, i10, i13));
            duration.start();
        } else {
            this.R = i10;
            h();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.R, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        k(false);
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final /* synthetic */ void setLastVisible(boolean z10) {
    }
}
