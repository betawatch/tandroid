package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class PopupNotificationActivity extends Activity implements org.telegram.messenger.ls {
    public static final /* synthetic */ int b0 = 0;
    public LinearLayout D;
    public ds0 E;
    public int K;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public CharSequence P;
    public boolean Z;
    public org.telegram.ui.ActionBar.k a;
    public ChatActivityEnterView b;
    public org.telegram.ui.Components.l9 c;
    public TextView d;
    public TextView e;
    public FrameLayout f;
    public TextView h;
    public k0 n;
    public ViewGroup r;
    public ViewGroup s;
    public ViewGroup w;
    public LinearLayout x;
    public LinearLayout y;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public VelocityTracker I = null;
    public final org.telegram.ui.Components.ou0[] J = new org.telegram.ui.Components.ou0[5];
    public int L = -1;
    public boolean O = false;
    public org.telegram.messenger.ij Q = null;
    public final org.telegram.messenger.ij[] R = new org.telegram.messenger.ij[3];
    public int S = 0;
    public PowerManager.WakeLock T = null;
    public boolean U = false;
    public long V = 0;
    public float W = -1.0f;
    public boolean X = false;
    public Runnable Y = null;
    public final ArrayList a0 = new ArrayList();

    public final void a(int i7) {
        int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(24.0f);
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != L) {
                layoutParams.width = L;
                this.s.setLayoutParams(layoutParams);
            }
            this.s.setTranslationX((-L) + i7);
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-L) + i7);
        }
        ViewGroup viewGroup2 = this.r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != L) {
                layoutParams2.width = L;
                this.r.setLayoutParams(layoutParams2);
            }
            this.r.setTranslationX(i7);
        }
        LinearLayout linearLayout2 = this.x;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i7);
        }
        ViewGroup viewGroup3 = this.w;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != L) {
                layoutParams3.width = L;
                this.w.setLayoutParams(layoutParams3);
            }
            this.w.setTranslationX(L + i7);
        }
        LinearLayout linearLayout3 = this.D;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(L + i7);
        }
        this.n.invalidate();
    }

    public final void b() {
        TLRPC.User a22;
        org.telegram.messenger.ij ijVar = this.Q;
        if (ijVar == null) {
            return;
        }
        int i7 = ijVar.I1;
        if (this.N != null) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(this.N.id));
            if (M0 == null) {
                return;
            }
            this.N = M0;
            if (this.c != null) {
                this.c.e(M0, new org.telegram.ui.Components.w8(this.N));
                return;
            }
            return;
        }
        if (this.M == null || (a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(this.M.id))) == null) {
            return;
        }
        this.M = a22;
        if (this.c != null) {
            this.c.e(a22, new org.telegram.ui.Components.w8(0, this.M));
        }
    }

    public final boolean c() {
        if (this.U && this.V < System.currentTimeMillis() - 400) {
            this.U = false;
            Runnable runnable = this.Y;
            if (runnable != null) {
                runnable.run();
                this.Y = null;
            }
        }
        return this.U;
    }

    public final void d() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new fs0(this, 0));
        }
        k0 k0Var = this.n;
        if (k0Var != null) {
            k0Var.getViewTreeObserver().addOnPreDrawListener(new fs0(this, 1));
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.re0 re0Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Components.re0 re0Var2;
        org.telegram.messenger.ij messageObject2;
        org.telegram.messenger.ij ijVar;
        Integer valueOf = Integer.valueOf(org.telegram.messenger.qs.X4);
        if (i7 == org.telegram.messenger.qs.I2) {
            if (i10 == this.L) {
                i();
                finish();
                return;
            }
            return;
        }
        int i11 = 0;
        if (i7 == org.telegram.messenger.qs.d4) {
            if (this.Z) {
                return;
            }
            ArrayList arrayList = this.a0;
            arrayList.clear();
            for (int i12 = 0; i12 < 4; i12++) {
                if (org.telegram.messenger.p10.i(i12).p()) {
                    arrayList.addAll(org.telegram.messenger.dt.t(i12).w);
                }
            }
            f();
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = (this.S - 1) + i13;
                if (arrayList.size() != 1 || (i14 >= 0 && i14 < arrayList.size())) {
                    if (i14 == -1) {
                        i14 = arrayList.size() - 1;
                    } else if (i14 == arrayList.size()) {
                        i14 = 0;
                    }
                    ijVar = (org.telegram.messenger.ij) arrayList.get(i14);
                } else {
                    ijVar = null;
                }
                if (this.R[i13] != ijVar) {
                    q(0);
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.r) {
            if (this.Q == null || i10 != this.L) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int i15 = org.telegram.messenger.qp.C8;
            if ((intValue & 1) != 0 || (intValue & 4) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0) {
                r();
            }
            if ((intValue & 2) != 0 || (intValue & 8) != 0) {
                b();
            }
            if ((intValue & 64) != 0) {
                CharSequence D1 = org.telegram.messenger.qp.s1(this.Q.I1).D1(org.telegram.messenger.ij.B0(this.Q.k), 0L, false);
                CharSequence charSequence = this.P;
                if ((charSequence == null || D1 != null) && ((charSequence != null || D1 == null) && (charSequence == null || charSequence.equals(D1)))) {
                    return;
                }
                r();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.f2) {
            Integer num = (Integer) objArr[0];
            k0 k0Var = this.n;
            if (k0Var != null) {
                int childCount = k0Var.getChildCount();
                while (i11 < childCount) {
                    View childAt = this.n.getChildAt(i11);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (re0Var2 = (org.telegram.ui.Components.re0) childAt.findViewWithTag(valueOf)).getMessageObject()) != null && messageObject2.I1 == i10 && messageObject2.f1() == num.intValue()) {
                        re0Var2.v();
                        return;
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.e2) {
            Integer num2 = (Integer) objArr[0];
            k0 k0Var2 = this.n;
            if (k0Var2 != null) {
                int childCount2 = k0Var2.getChildCount();
                while (i11 < childCount2) {
                    View childAt2 = this.n.getChildAt(i11);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (re0Var = (org.telegram.ui.Components.re0) childAt2.findViewWithTag(valueOf)).getMessageObject()) != null && messageObject.I1 == i10 && messageObject.f1() == num2.intValue()) {
                        re0Var.w();
                        return;
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.i4) {
            if (i7 == org.telegram.messenger.qs.O && i10 == this.L) {
                r();
                return;
            }
            return;
        }
        k0 k0Var3 = this.n;
        if (k0Var3 != null) {
            int childCount3 = k0Var3.getChildCount();
            while (i11 < childCount3) {
                View childAt3 = this.n.getChildAt(i11);
                if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(Integer.valueOf(org.telegram.messenger.qs.Y4))) != null) {
                    textView.invalidate();
                }
                i11++;
            }
        }
    }

    public final LinearLayout e(int i7, boolean z9) {
        int i10;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i11 = i7;
        ArrayList arrayList2 = this.a0;
        LinearLayout linearLayout = null;
        if (arrayList2.size() == 1 && (i11 < 0 || i11 >= arrayList2.size())) {
            return null;
        }
        int i12 = 0;
        if (i11 == -1) {
            i11 = arrayList2.size() - 1;
        } else if (i11 == arrayList2.size()) {
            i11 = 0;
        }
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i11);
        TLRPC.Message message = ijVar.k;
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (org.telegram.messenger.ij.B0(message) == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i13);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    if (cg.c.c(keyboardInlineButtonRow.buttons.get(i14), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i10++;
                    }
                }
            }
        } else {
            i10 = 0;
        }
        int i15 = ijVar.I1;
        if (i10 > 0 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size3 = arrayList4.size();
            LinearLayout linearLayout2 = null;
            int i16 = 0;
            while (i16 < size3) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList4.get(i16);
                int size4 = keyboardInlineButtonRow2.buttons.size();
                int i17 = i12;
                while (i17 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i17);
                    if (cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(i12);
                            arrayList = arrayList4;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, linearLayout2, null);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new bs0(0));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.n6, null);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(true));
                        linearLayout2.addView(textView, c8.ha.l(100.0f / i10, -1, -1));
                        textView.setOnClickListener(new ai.v(i15, ijVar));
                    } else {
                        arrayList = arrayList4;
                    }
                    i17++;
                    arrayList4 = arrayList;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            linearLayout = linearLayout2;
        }
        if (linearLayout != null) {
            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z9) {
                int i18 = this.S;
                if (i11 == i18) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i11 == i18 - 1) {
                    linearLayout.setTranslationX(-L);
                } else if (i11 == i18 + 1) {
                    linearLayout.setTranslationX(L);
                }
            }
            this.E.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.a0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.S != 0 || this.b.h0() || this.X) && this.Q != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                if (ijVar.I1 == this.Q.I1 && org.telegram.messenger.ij.B0(ijVar.k) == org.telegram.messenger.ij.B0(this.Q.k) && ijVar.f1() == this.Q.f1()) {
                    this.S = i7;
                    if (this.X) {
                        if (i7 == arrayList.size() - 1) {
                            l(3);
                        } else if (this.S == 1) {
                            l(4);
                        }
                    }
                    this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
                }
            }
        }
        this.S = 0;
        this.Q = (org.telegram.messenger.ij) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewGroup g(int i7, boolean z9) {
        int i10;
        ViewGroup viewGroup;
        float f10;
        org.telegram.messenger.ij ijVar;
        boolean z10;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        org.telegram.ui.Components.re0 re0Var;
        int i11 = i7;
        Integer valueOf = Integer.valueOf(org.telegram.messenger.qs.Y4);
        Integer valueOf2 = Integer.valueOf(org.telegram.messenger.qs.X4);
        Integer valueOf3 = Integer.valueOf(org.telegram.messenger.qs.j5);
        Integer valueOf4 = Integer.valueOf(org.telegram.messenger.qs.i5);
        ArrayList arrayList = this.a0;
        if (arrayList.size() == 1 && (i11 < 0 || i11 >= arrayList.size())) {
            return null;
        }
        final int i12 = 0;
        if (i11 == -1) {
            i11 = arrayList.size() - 1;
        } else if (i11 == arrayList.size()) {
            i11 = 0;
        }
        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i11);
        int i13 = ijVar2.D;
        int i14 = ijVar2.I1;
        if ((i13 == 1 || i13 == 4) && !ijVar2.m4()) {
            ArrayList arrayList2 = this.G;
            if (arrayList2.size() > 0) {
                ViewGroup viewGroup5 = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
                i10 = 2;
                viewGroup = viewGroup5;
            } else {
                FrameLayout frameLayout = new FrameLayout(this);
                FrameLayout frameLayout2 = new FrameLayout(this);
                i10 = 2;
                frameLayout2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                frameLayout2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                frameLayout.addView(frameLayout2, c8.ha.c(-1.0f, -1));
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(this);
                l9Var.setTag(valueOf4);
                frameLayout2.addView(l9Var, c8.ha.c(-1.0f, -1));
                TextView textView = new TextView(this);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(valueOf3);
                frameLayout2.addView(textView, c8.ha.e(-1, -2, 17));
                frameLayout.setTag(2);
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cs0
                    public final /* synthetic */ PopupNotificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i12;
                        PopupNotificationActivity popupNotificationActivity = this.b;
                        switch (i15) {
                            case 0:
                                int i16 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i17 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i18 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                viewGroup = frameLayout;
            }
            TextView textView2 = (TextView) viewGroup.findViewWithTag(valueOf3);
            org.telegram.ui.Components.l9 l9Var2 = (org.telegram.ui.Components.l9) viewGroup.findViewWithTag(valueOf4);
            l9Var2.setAspectFit(true);
            int i15 = ijVar2.D;
            if (i15 == 1) {
                int i16 = 0;
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar2.n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ijVar2.n0, 100, false, null, false);
                if (w10 != null) {
                    if (ijVar2.D == 1) {
                        org.telegram.messenger.w7.G(org.telegram.messenger.p10.s0);
                        if (!org.telegram.messenger.w7.M(ijVar2.k, false, true).exists()) {
                            z10 = false;
                            if (ijVar2.n5()) {
                                if (z10 || org.telegram.messenger.z5.q(i14).d(ijVar2)) {
                                    f10 = 0.0f;
                                    l9Var2.l(org.telegram.messenger.hc.f(w10, ijVar2.l0), "100_100", org.telegram.messenger.hc.f(w11, ijVar2.l0), "100_100_b", w10.size, ijVar2);
                                } else if (w11 != null) {
                                    org.telegram.messenger.hc f11 = org.telegram.messenger.hc.f(w11, ijVar2.l0);
                                    f10 = 0.0f;
                                    l9Var2.k(f11, "100_100_b", null, null, ijVar2);
                                } else {
                                    f10 = 0.0f;
                                    ijVar = ijVar2;
                                }
                                l9Var2.setVisibility(0);
                                textView2.setVisibility(8);
                                viewGroup2 = viewGroup;
                            } else {
                                ijVar = ijVar2;
                                f10 = 0.0f;
                            }
                            i16 = 0;
                        }
                    }
                    z10 = true;
                    if (ijVar2.n5()) {
                    }
                    i16 = 0;
                } else {
                    ijVar = ijVar2;
                    f10 = 0.0f;
                }
                l9Var2.setVisibility(8);
                textView2.setVisibility(i16);
                textView2.setTextSize(i10, org.telegram.messenger.iz.W0);
                textView2.setText(ijVar.v);
                viewGroup2 = viewGroup;
            } else {
                f10 = 0.0f;
                viewGroup2 = viewGroup;
                if (i15 == 4) {
                    textView2.setVisibility(8);
                    textView2.setText(ijVar2.v);
                    l9Var2.setVisibility(0);
                    TLRPC.GeoPoint geoPoint = ijVar2.k.media.geo;
                    double d = geoPoint.lat;
                    double d2 = geoPoint._long;
                    if (org.telegram.messenger.qp.s1(i14).m3 == 2) {
                        int min = Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p));
                        int i17 = org.telegram.messenger.m20.i;
                        l9Var2.k(org.telegram.messenger.hc.p(org.telegram.messenger.m20.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 100, 100, 15, min)), null, null, null, ijVar2);
                        viewGroup2 = viewGroup;
                    } else {
                        l9Var2.h(org.telegram.messenger.g0.e0(ijVar2.I1, d, d2, 100, 100, true, 15, -1), null, null);
                        viewGroup2 = viewGroup;
                    }
                }
            }
        } else {
            f10 = 0.0f;
            if (ijVar2.D == 2) {
                ArrayList arrayList3 = this.H;
                if (arrayList3.size() > 0) {
                    ViewGroup viewGroup6 = (ViewGroup) arrayList3.get(0);
                    arrayList3.remove(0);
                    re0Var = (org.telegram.ui.Components.re0) viewGroup6.findViewWithTag(valueOf2);
                    viewGroup4 = viewGroup6;
                } else {
                    FrameLayout frameLayout3 = new FrameLayout(this);
                    FrameLayout frameLayout4 = new FrameLayout(this);
                    frameLayout4.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                    frameLayout4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                    frameLayout3.addView(frameLayout4, c8.ha.c(-1.0f, -1));
                    FrameLayout frameLayout5 = new FrameLayout(this);
                    frameLayout4.addView(frameLayout5, c8.ha.d(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                    org.telegram.ui.Components.re0 re0Var2 = new org.telegram.ui.Components.re0(this);
                    re0Var2.f = false;
                    re0Var2.D = 0;
                    re0Var2.G = 0;
                    re0Var2.J = 0;
                    TextPaint textPaint = new TextPaint(1);
                    re0Var2.r = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                    re0Var2.K = org.telegram.messenger.z5.q(re0Var2.n).k();
                    org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(re0Var2);
                    re0Var2.s = jm0Var;
                    jm0Var.h = re0Var2;
                    org.telegram.ui.Components.bg0 bg0Var = new org.telegram.ui.Components.bg0();
                    bg0Var.c = 0.0f;
                    bg0Var.f = org.telegram.messenger.g0.L(2.0f);
                    bg0Var.a = new Paint();
                    bg0Var.b = new Paint();
                    re0Var2.w = bg0Var;
                    re0Var2.setTag(valueOf2);
                    frameLayout5.addView(re0Var2);
                    frameLayout3.setTag(3);
                    final int i18 = 1;
                    frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cs0
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152 = i18;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (i152) {
                                case 0:
                                    int i162 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                                case 1:
                                    int i172 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                                default:
                                    int i182 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                            }
                        }
                    });
                    viewGroup4 = frameLayout3;
                    re0Var = re0Var2;
                }
                re0Var.setMessageObject(ijVar2);
                if (org.telegram.messenger.z5.q(i14).d(ijVar2) && re0Var.D == 2) {
                    org.telegram.messenger.w7.G(re0Var.n).W(re0Var.h.F0(), re0Var.h, 1, 0);
                    re0Var.D = 3;
                    re0Var.invalidate();
                    viewGroup2 = viewGroup4;
                } else {
                    viewGroup2 = viewGroup4;
                }
            } else {
                ArrayList arrayList4 = this.F;
                if (arrayList4.size() > 0) {
                    ViewGroup viewGroup7 = (ViewGroup) arrayList4.get(0);
                    arrayList4.remove(0);
                    viewGroup3 = viewGroup7;
                } else {
                    FrameLayout frameLayout6 = new FrameLayout(this);
                    ScrollView scrollView = new ScrollView(this);
                    scrollView.setFillViewport(true);
                    frameLayout6.addView(scrollView, c8.ha.c(-1.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(this);
                    linearLayout.setOrientation(0);
                    linearLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                    scrollView.addView(linearLayout, c8.ha.x(-1, -2, 1));
                    linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                    final int i19 = 2;
                    linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cs0
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152 = i19;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (i152) {
                                case 0:
                                    int i162 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                                case 1:
                                    int i172 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                                default:
                                    int i182 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                            }
                        }
                    });
                    TextView textView3 = new TextView(this);
                    textView3.setTextSize(1, 16.0f);
                    textView3.setTag(valueOf);
                    int i20 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(textView3, i20, null);
                    org.telegram.ui.ActionBar.r6.H(textView3, i20, null);
                    textView3.setGravity(17);
                    linearLayout.addView(textView3, c8.ha.r(-1, -2, 17));
                    frameLayout6.setTag(1);
                    viewGroup3 = frameLayout6;
                }
                TextView textView4 = (TextView) viewGroup3.findViewWithTag(valueOf);
                textView4.setTextSize(2, org.telegram.messenger.iz.W0);
                textView4.setText(ijVar2.v);
                viewGroup2 = viewGroup3;
            }
        }
        if (viewGroup2.getParent() == null) {
            this.n.addView(viewGroup2);
        }
        viewGroup2.setVisibility(0);
        if (z9) {
            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = L;
            int i21 = this.S;
            if (i11 == i21) {
                viewGroup2.setTranslationX(f10);
            } else if (i11 == i21 - 1) {
                viewGroup2.setTranslationX(-L);
            } else if (i11 == i21 + 1) {
                viewGroup2.setTranslationX(L);
            }
            viewGroup2.setLayoutParams(layoutParams);
            viewGroup2.invalidate();
        }
        return viewGroup2;
    }

    public final void h(Intent intent) {
        this.Z = intent != null && intent.getBooleanExtra("force", false);
        this.a0.clear();
        if (this.Z) {
            int intExtra = intent != null ? intent.getIntExtra("currentAccount", org.telegram.messenger.p10.s0) : org.telegram.messenger.p10.s0;
            if (!org.telegram.messenger.p10.r(intExtra)) {
                return;
            } else {
                this.a0.addAll(org.telegram.messenger.dt.t(intExtra).x);
            }
        } else {
            for (int i7 = 0; i7 < 4; i7++) {
                if (org.telegram.messenger.p10.i(i7).p()) {
                    this.a0.addAll(org.telegram.messenger.dt.t(i7).w);
                }
            }
        }
        if (((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() || !org.telegram.messenger.t0.w) {
            getWindow().addFlags(2623490);
        } else {
            getWindow().addFlags(2623488);
            getWindow().clearFlags(2);
        }
        if (this.Q == null) {
            this.S = 0;
        }
        f();
    }

    public final void i() {
        if (this.O) {
            return;
        }
        this.O = true;
        if (this.Z) {
            this.a0.clear();
        }
        for (int i7 = 0; i7 < 4; i7++) {
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.I2);
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.r);
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.e2);
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f2);
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.O);
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.d4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.B0();
        }
        if (this.T.isHeld()) {
            this.T.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(MotionEvent motionEvent) {
        char c10;
        float translationX;
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        if (c()) {
            return false;
        }
        if (motionEvent == null || motionEvent.getAction() != 0) {
            final int i7 = 2;
            final int i10 = 1;
            if (motionEvent != null && motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX();
                float f10 = this.W;
                int i11 = (int) (x10 - f10);
                if (f10 != -1.0f && !this.X && Math.abs(i11) > org.telegram.messenger.g0.L(10.0f)) {
                    this.X = true;
                    this.W = x10;
                    org.telegram.messenger.g0.f2(this);
                    VelocityTracker velocityTracker = this.I;
                    if (velocityTracker == null) {
                        this.I = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    i11 = 0;
                }
                if (this.X) {
                    if (this.s == null && i11 > 0) {
                        i11 = 0;
                    }
                    r1 = (this.w != null || i11 >= 0) ? i11 : 0;
                    VelocityTracker velocityTracker2 = this.I;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    a(r1);
                }
            } else if (motionEvent == null || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent == null || !this.X) {
                    a(0);
                } else {
                    int x11 = (int) (motionEvent.getX() - this.W);
                    int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(24.0f);
                    VelocityTracker velocityTracker3 = this.I;
                    if (velocityTracker3 != null) {
                        velocityTracker3.computeCurrentVelocity(1000);
                        if (this.I.getXVelocity() >= 3500.0f) {
                            c10 = 1;
                        } else if (this.I.getXVelocity() <= -3500.0f) {
                            c10 = 2;
                        }
                        if ((c10 != 1 || x11 > L / 3) && this.s != null) {
                            translationX = L - this.r.getTranslationX();
                            viewGroup = this.s;
                            linearLayout = this.y;
                            this.Y = new Runnable(this) { // from class: org.telegram.ui.as0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = r2;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i12) {
                                        case 0:
                                            popupNotificationActivity.U = false;
                                            ArrayList arrayList = popupNotificationActivity.a0;
                                            if (arrayList.size() > 1) {
                                                int i13 = popupNotificationActivity.S;
                                                if (i13 > 0) {
                                                    popupNotificationActivity.S = i13 - 1;
                                                } else {
                                                    popupNotificationActivity.S = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.Q = (org.telegram.messenger.ij) arrayList.get(popupNotificationActivity.S);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.p();
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.a(0);
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                        } else if ((c10 == 2 || x11 < (-L) / 3) && this.w != null) {
                            translationX = (-L) - this.r.getTranslationX();
                            viewGroup = this.w;
                            linearLayout = this.D;
                            this.Y = new Runnable(this) { // from class: org.telegram.ui.as0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = i10;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i12) {
                                        case 0:
                                            popupNotificationActivity.U = false;
                                            ArrayList arrayList = popupNotificationActivity.a0;
                                            if (arrayList.size() > 1) {
                                                int i13 = popupNotificationActivity.S;
                                                if (i13 > 0) {
                                                    popupNotificationActivity.S = i13 - 1;
                                                } else {
                                                    popupNotificationActivity.S = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.Q = (org.telegram.messenger.ij) arrayList.get(popupNotificationActivity.S);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.p();
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.a(0);
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                        } else if (this.r.getTranslationX() != 0.0f) {
                            float f11 = -this.r.getTranslationX();
                            ViewGroup viewGroup2 = x11 > 0 ? this.s : this.w;
                            LinearLayout linearLayout2 = x11 > 0 ? this.y : this.D;
                            this.Y = new Runnable(this) { // from class: org.telegram.ui.as0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = i7;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i12) {
                                        case 0:
                                            popupNotificationActivity.U = false;
                                            ArrayList arrayList = popupNotificationActivity.a0;
                                            if (arrayList.size() > 1) {
                                                int i13 = popupNotificationActivity.S;
                                                if (i13 > 0) {
                                                    popupNotificationActivity.S = i13 - 1;
                                                } else {
                                                    popupNotificationActivity.S = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.Q = (org.telegram.messenger.ij) arrayList.get(popupNotificationActivity.S);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.p();
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.a(0);
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                            linearLayout = linearLayout2;
                            translationX = f11;
                            viewGroup = viewGroup2;
                        } else {
                            viewGroup = null;
                            linearLayout = null;
                            translationX = 0.0f;
                        }
                        if (translationX != 0.0f) {
                            int abs = (int) (Math.abs(translationX / L) * 200.0f);
                            ArrayList arrayList = new ArrayList();
                            ViewGroup viewGroup3 = this.r;
                            arrayList.add(ObjectAnimator.ofFloat(viewGroup3, "translationX", viewGroup3.getTranslationX() + translationX));
                            LinearLayout linearLayout3 = this.x;
                            if (linearLayout3 != null) {
                                arrayList.add(ObjectAnimator.ofFloat(linearLayout3, "translationX", linearLayout3.getTranslationX() + translationX));
                            }
                            if (viewGroup != null) {
                                arrayList.add(ObjectAnimator.ofFloat(viewGroup, "translationX", viewGroup.getTranslationX() + translationX));
                            }
                            if (linearLayout != null) {
                                arrayList.add(ObjectAnimator.ofFloat(linearLayout, "translationX", linearLayout.getTranslationX() + translationX));
                            }
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(arrayList);
                            animatorSet.setDuration(abs);
                            animatorSet.addListener(new d30(this, 20));
                            animatorSet.start();
                            this.U = true;
                            this.V = System.currentTimeMillis();
                        }
                    }
                    c10 = 0;
                    if (c10 != 1) {
                    }
                    translationX = L - this.r.getTranslationX();
                    viewGroup = this.s;
                    linearLayout = this.y;
                    this.Y = new Runnable(this) { // from class: org.telegram.ui.as0
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = r2;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (i12) {
                                case 0:
                                    popupNotificationActivity.U = false;
                                    ArrayList arrayList2 = popupNotificationActivity.a0;
                                    if (arrayList2.size() > 1) {
                                        int i13 = popupNotificationActivity.S;
                                        if (i13 > 0) {
                                            popupNotificationActivity.S = i13 - 1;
                                        } else {
                                            popupNotificationActivity.S = arrayList2.size() - 1;
                                        }
                                        popupNotificationActivity.Q = (org.telegram.messenger.ij) arrayList2.get(popupNotificationActivity.S);
                                        popupNotificationActivity.q(1);
                                        popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList2.size())));
                                    }
                                    org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                    break;
                                case 1:
                                    popupNotificationActivity.U = false;
                                    popupNotificationActivity.p();
                                    org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                    break;
                                default:
                                    popupNotificationActivity.U = false;
                                    popupNotificationActivity.a(0);
                                    org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                    break;
                            }
                        }
                    };
                    if (translationX != 0.0f) {
                    }
                }
                VelocityTracker velocityTracker4 = this.I;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.I = null;
                }
                this.X = false;
                this.W = -1.0f;
            }
        } else {
            this.W = motionEvent.getX();
        }
        return this.X;
    }

    public final void k() {
        if (this.Q == null) {
            return;
        }
        Intent intent = new Intent(org.telegram.messenger.t0.b, (Class<?>) LaunchActivity.class);
        long B0 = org.telegram.messenger.ij.B0(this.Q.k);
        if (org.telegram.messenger.m5.C(B0)) {
            intent.putExtra("encId", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            intent.putExtra("userId", B0);
        } else if (org.telegram.messenger.m5.z(B0)) {
            intent.putExtra("chatId", -B0);
        }
        intent.putExtra("currentAccount", this.Q.I1);
        intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i7) {
        org.telegram.messenger.ij ijVar;
        int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(24.0f);
        if (i7 == 0) {
            n(this.r);
            n(this.s);
            n(this.w);
            m(this.x);
            m(this.y);
            m(this.D);
            int i10 = this.S - 1;
            while (true) {
                int i11 = this.S;
                if (i10 >= i11 + 2) {
                    break;
                }
                if (i10 == i11 - 1) {
                    this.s = g(i10, true);
                    this.y = e(i10, true);
                } else if (i10 == i11) {
                    this.r = g(i10, true);
                    this.x = e(i10, true);
                } else if (i10 == i11 + 1) {
                    this.w = g(i10, true);
                    this.D = e(i10, true);
                }
                i10++;
            }
        } else if (i7 == 1) {
            n(this.w);
            m(this.D);
            this.w = this.r;
            this.r = this.s;
            this.s = g(this.S - 1, true);
            this.D = this.x;
            this.x = this.y;
            this.y = e(this.S - 1, true);
        } else if (i7 == 2) {
            n(this.s);
            m(this.y);
            this.s = this.r;
            this.r = this.w;
            this.w = g(this.S + 1, true);
            this.y = this.x;
            this.x = this.D;
            this.D = e(this.S + 1, true);
        } else if (i7 == 3) {
            ViewGroup viewGroup = this.w;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.w);
                ViewGroup g10 = g(this.S + 1, false);
                this.w = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g10.getLayoutParams();
                    layoutParams.width = L;
                    this.w.setLayoutParams(layoutParams);
                    this.w.setTranslationX(translationX);
                    this.w.invalidate();
                }
            }
            LinearLayout linearLayout = this.D;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.D);
                LinearLayout e10 = e(this.S + 1, false);
                this.D = e10;
                if (e10 != null) {
                    e10.setTranslationX(translationX2);
                }
            }
        } else if (i7 == 4) {
            ViewGroup viewGroup2 = this.s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.s);
                ViewGroup g11 = g(0, false);
                this.s = g11;
                if (g11 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g11.getLayoutParams();
                    layoutParams2.width = L;
                    this.s.setLayoutParams(layoutParams2);
                    this.s.setTranslationX(translationX3);
                    this.s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.y;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.y);
                LinearLayout e11 = e(0, false);
                this.y = e11;
                if (e11 != null) {
                    e11.setTranslationX(translationX4);
                }
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = (this.S - 1) + i12;
            ArrayList arrayList = this.a0;
            if (arrayList.size() != 1 || (i13 >= 0 && i13 < arrayList.size())) {
                if (i13 == -1) {
                    i13 = arrayList.size() - 1;
                } else if (i13 == arrayList.size()) {
                    i13 = 0;
                }
                ijVar = (org.telegram.messenger.ij) arrayList.get(i13);
            } else {
                ijVar = null;
            }
            this.R[i12] = ijVar;
        }
    }

    public final void m(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.E.removeView(linearLayout);
    }

    public final void n(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int intValue = ((Integer) viewGroup.getTag()).intValue();
        viewGroup.setVisibility(8);
        if (intValue == 1) {
            this.F.add(viewGroup);
        } else if (intValue == 2) {
            this.G.add(viewGroup);
        } else if (intValue == 3) {
            this.H.add(viewGroup);
        }
    }

    public final void o(boolean z9) {
        if (this.a == null) {
            return;
        }
        int i7 = 0;
        org.telegram.ui.Components.ou0[] ou0VarArr = this.J;
        if (!z9) {
            this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(0);
            while (i7 < ou0VarArr.length) {
                ou0VarArr[i7].e();
                i7++;
            }
            return;
        }
        try {
            Integer E1 = org.telegram.messenger.qp.s1(this.Q.I1).E1(org.telegram.messenger.ij.B0(this.Q.k), 0L);
            this.e.setCompoundDrawablesWithIntrinsicBounds(ou0VarArr[E1.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            while (i7 < ou0VarArr.length) {
                if (i7 == E1.intValue()) {
                    ou0VarArr[i7].d();
                } else {
                    ou0VarArr[i7].e();
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.b.s0()) {
            this.b.k0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.x3(getWindow());
        d();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.k6.T(this);
        org.telegram.ui.ActionBar.k6.K(this, false);
        Typeface typeface = org.telegram.messenger.g0.a;
        for (int i7 = 0; i7 < 4; i7++) {
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.I2);
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.r);
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.e2);
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f2);
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.O);
        }
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.d4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        this.K = ConnectionsManager.generateClassGuid();
        this.J[0] = new org.telegram.ui.Components.v31(false);
        this.J[1] = new org.telegram.ui.Components.ap(false);
        this.J[2] = new org.telegram.ui.Components.dn0(false);
        this.J[3] = new org.telegram.ui.Components.ie0(null, false);
        this.J[4] = new org.telegram.ui.Components.dk0(false);
        v8 v8Var = new v8(8, this, this);
        setContentView(v8Var);
        v8Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        v8Var.addView(relativeLayout, c8.ha.c(-1.0f, -1));
        ds0 ds0Var = new ds0(this, this);
        this.E = ds0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ds0Var, null);
        float f10 = -1;
        relativeLayout.addView(this.E, c8.ha.v(12, f10, 12, org.telegram.messenger.qs.P3, 13));
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.B0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, v8Var, null, false, null);
        this.b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.E.addView(this.b, c8.ha.v(0, f10, 0, -2, 12));
        this.b.setDelegate(new es0(this));
        k0 k0Var = new k0(20, this, this);
        this.n = k0Var;
        this.E.addView(k0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setBackButtonImage(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.s8, this.a, null);
        org.telegram.ui.ActionBar.r6.m(this.a, 3, org.telegram.ui.ActionBar.k6.t8, null);
        org.telegram.ui.ActionBar.r6.m(this.a, 1, org.telegram.ui.ActionBar.k6.v8, null);
        this.E.addView(this.a);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = -1;
        this.a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.r0 g10 = this.a.q().g(2, 0, org.telegram.messenger.g0.L(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i10 = org.telegram.ui.ActionBar.k6.B8;
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g10.addView(this.h, c8.ha.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.a.addView(this.f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(48.0f);
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(60.0f);
        layoutParams2.gravity = 51;
        this.f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(this);
        this.c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.f.addView(this.c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.width = org.telegram.messenger.g0.L(42.0f);
        layoutParams3.height = org.telegram.messenger.g0.L(42.0f);
        layoutParams3.topMargin = org.telegram.messenger.g0.L(3.0f);
        this.c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.A8, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(org.telegram.messenger.g0.o());
        this.f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = org.telegram.messenger.g0.L(54.0f);
        layoutParams4.bottomMargin = org.telegram.messenger.g0.L(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.e = textView4;
        org.telegram.ui.ActionBar.r6.V(textView4, i10, null);
        this.e.setTextSize(1, 14.0f);
        this.e.setLines(1);
        this.e.setMaxLines(1);
        this.e.setSingleLine(true);
        this.e.setEllipsize(truncateAt);
        this.e.setGravity(3);
        this.f.addView(this.e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = org.telegram.messenger.g0.L(54.0f);
        layoutParams5.bottomMargin = org.telegram.messenger.g0.L(4.0f);
        layoutParams5.gravity = 80;
        this.e.setLayoutParams(layoutParams5);
        this.a.setActionBarMenuOnItemClick(new ux(this, 26));
        PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.b.getSystemService("power")).newWakeLock(268435462, "screen");
        this.T = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController B = MediaController.B();
        if (B.K0 == this.b) {
            B.K0 = null;
        }
        if (this.T.isHeld()) {
            this.T.release();
        }
        org.telegram.ui.Components.l9 l9Var = this.c;
        if (l9Var != null) {
            l9Var.setImageDrawable(null);
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        h(intent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.k0(false);
            this.b.setFieldFocused(false);
        }
        int i7 = this.L;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i7).setAppPaused(true, false);
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (i7 != 3 || iArr[0] == 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131747310, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747299, null), new li0(this, 6));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        alertDialog$Builder.p();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        MediaController B = MediaController.B();
        ChatActivityEnterView chatActivityEnterView = this.b;
        B.K0 = chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.T.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.a0;
        if (arrayList.size() > 1) {
            if (this.S < arrayList.size() - 1) {
                this.S++;
            } else {
                this.S = 0;
            }
            this.Q = (org.telegram.messenger.ij) arrayList.get(this.S);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i7) {
        if (this.a == null) {
            return;
        }
        int i10 = this.L;
        if (i10 != this.Q.I1) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(i10).setAppPaused(true, false);
            }
            int i11 = this.Q.I1;
            this.L = i11;
            ConnectionsManager.getInstance(i11).setAppPaused(false, false);
        }
        this.N = null;
        this.M = null;
        long B0 = org.telegram.messenger.ij.B0(this.Q.k);
        this.b.a1(this.Q.I1, B0);
        if (org.telegram.messenger.m5.C(B0)) {
            this.M = org.telegram.messenger.qp.s1(this.Q.I1).a2(Long.valueOf(org.telegram.messenger.qp.s1(this.Q.I1).a1(Integer.valueOf((int) (4294967295L & B0))).user_id));
        } else if (org.telegram.messenger.m5.E(B0)) {
            this.M = org.telegram.messenger.qp.s1(this.Q.I1).a2(Long.valueOf(B0));
        } else if (org.telegram.messenger.m5.z(B0)) {
            this.N = org.telegram.messenger.qp.s1(this.Q.I1).M0(Long.valueOf(-B0));
            if (this.Q.q3()) {
                this.M = org.telegram.messenger.qp.s1(this.Q.I1).a2(Long.valueOf(this.Q.k.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.N;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.M;
            if (user != null) {
                this.e.setText(org.telegram.messenger.t10.p(user));
            } else {
                this.e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.M;
            if (user2 != null) {
                this.d.setText(org.telegram.messenger.t10.p(user2));
                if (org.telegram.messenger.m5.C(B0)) {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_white, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                } else {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(0);
                }
            }
        }
        l(i7);
        r();
        b();
        a(0);
    }

    public final void r() {
        org.telegram.messenger.ij ijVar;
        TLRPC.User user;
        if (this.a == null || (ijVar = this.Q) == null || this.N != null || (user = this.M) == null) {
            return;
        }
        long j3 = user.id / 1000;
        if (j3 == 777 || j3 == 333 || org.telegram.messenger.g5.r(ijVar.I1).f0.get(Long.valueOf(this.M.id)) != null || (org.telegram.messenger.g5.r(this.Q.I1).f0.size() == 0 && org.telegram.messenger.g5.r(this.Q.I1).y())) {
            this.d.setText(org.telegram.messenger.t10.p(this.M));
        } else {
            String str = this.M.phone;
            if (str == null || str.length() == 0) {
                this.d.setText(org.telegram.messenger.t10.p(this.M));
            } else {
                this.d.setText(pf.b.c().b("+" + this.M.phone));
            }
        }
        TLRPC.User user2 = this.M;
        if (user2 != null && user2.id == 489000) {
            this.e.setText(org.telegram.messenger.hd.M0(2131743617, null));
            return;
        }
        if (user2 != null && user2.id == 777000) {
            this.e.setText(org.telegram.messenger.hd.M0(2131745562, null));
            return;
        }
        CharSequence D1 = org.telegram.messenger.qp.s1(this.Q.I1).D1(org.telegram.messenger.ij.B0(this.Q.k), 0L, false);
        if (D1 != null && D1.length() != 0) {
            this.P = D1;
            this.e.setText(D1);
            o(true);
        } else {
            this.P = null;
            o(false);
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.Q.I1).a2(Long.valueOf(this.M.id));
            if (a22 != null) {
                this.M = a22;
            }
            this.e.setText(org.telegram.messenger.hd.d0(this.Q.I1, this.M, null, null));
        }
    }
}
