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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class PopupNotificationActivity extends Activity implements org.telegram.messenger.us {
    public static final /* synthetic */ int b0 = 0;
    public LinearLayout D;
    public nt0 E;
    public int K;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public CharSequence P;
    public boolean Z;
    public org.telegram.ui.ActionBar.l a;
    public ChatActivityEnterView b;
    public org.telegram.ui.Components.g9 c;
    public TextView d;
    public TextView e;
    public FrameLayout f;
    public TextView h;
    public l0 n;
    public ViewGroup r;
    public ViewGroup s;
    public ViewGroup w;
    public LinearLayout x;
    public LinearLayout y;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public VelocityTracker I = null;
    public final org.telegram.ui.Components.qv0[] J = new org.telegram.ui.Components.qv0[5];
    public int L = -1;
    public boolean O = false;
    public org.telegram.messenger.jj Q = null;
    public final org.telegram.messenger.jj[] R = new org.telegram.messenger.jj[3];
    public int S = 0;
    public PowerManager.WakeLock T = null;
    public boolean U = false;
    public long V = 0;
    public float W = -1.0f;
    public boolean X = false;
    public Runnable Y = null;
    public final ArrayList a0 = new ArrayList();

    public final void a(int i10) {
        int L = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(24.0f);
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != L) {
                layoutParams.width = L;
                this.s.setLayoutParams(layoutParams);
            }
            this.s.setTranslationX((-L) + i10);
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-L) + i10);
        }
        ViewGroup viewGroup2 = this.r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != L) {
                layoutParams2.width = L;
                this.r.setLayoutParams(layoutParams2);
            }
            this.r.setTranslationX(i10);
        }
        LinearLayout linearLayout2 = this.x;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i10);
        }
        ViewGroup viewGroup3 = this.w;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != L) {
                layoutParams3.width = L;
                this.w.setLayoutParams(layoutParams3);
            }
            this.w.setTranslationX(L + i10);
        }
        LinearLayout linearLayout3 = this.D;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(L + i10);
        }
        this.n.invalidate();
    }

    public final void b() {
        TLRPC.User Z1;
        org.telegram.messenger.jj jjVar = this.Q;
        if (jjVar == null) {
            return;
        }
        int i10 = jjVar.I1;
        if (this.N != null) {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(this.N.id));
            if (L0 == null) {
                return;
            }
            this.N = L0;
            if (this.c != null) {
                this.c.e(L0, new org.telegram.ui.Components.r8(this.N));
                return;
            }
            return;
        }
        if (this.M == null || (Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(this.M.id))) == null) {
            return;
        }
        this.M = Z1;
        if (this.c != null) {
            this.c.e(Z1, new org.telegram.ui.Components.r8(0, this.M));
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
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new pt0(this, 0));
        }
        l0 l0Var = this.n;
        if (l0Var != null) {
            l0Var.getViewTreeObserver().addOnPreDrawListener(new pt0(this, 1));
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.uf0 uf0Var;
        org.telegram.messenger.jj messageObject;
        org.telegram.ui.Components.uf0 uf0Var2;
        org.telegram.messenger.jj messageObject2;
        org.telegram.messenger.jj jjVar;
        Integer valueOf = Integer.valueOf(org.telegram.messenger.zs.X4);
        if (i10 == org.telegram.messenger.zs.I2) {
            if (i11 == this.L) {
                i();
                finish();
                return;
            }
            return;
        }
        int i12 = 0;
        if (i10 == org.telegram.messenger.zs.d4) {
            if (this.Z) {
                return;
            }
            ArrayList arrayList = this.a0;
            arrayList.clear();
            for (int i13 = 0; i13 < 4; i13++) {
                if (org.telegram.messenger.d20.i(i13).p()) {
                    arrayList.addAll(org.telegram.messenger.ot.t(i13).w);
                }
            }
            f();
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = (this.S - 1) + i14;
                if (arrayList.size() != 1 || (i15 >= 0 && i15 < arrayList.size())) {
                    if (i15 == -1) {
                        i15 = arrayList.size() - 1;
                    } else if (i15 == arrayList.size()) {
                        i15 = 0;
                    }
                    jjVar = (org.telegram.messenger.jj) arrayList.get(i15);
                } else {
                    jjVar = null;
                }
                if (this.R[i14] != jjVar) {
                    q(0);
                }
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.r) {
            if (this.Q == null || i11 != this.L) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int i16 = org.telegram.messenger.vp.D8;
            if ((intValue & 1) != 0 || (intValue & 4) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0) {
                r();
            }
            if ((intValue & 2) != 0 || (intValue & 8) != 0) {
                b();
            }
            if ((intValue & 64) != 0) {
                CharSequence C1 = org.telegram.messenger.vp.r1(this.Q.I1).C1(org.telegram.messenger.jj.B0(this.Q.k), 0L, false);
                CharSequence charSequence = this.P;
                if ((charSequence == null || C1 != null) && ((charSequence != null || C1 == null) && (charSequence == null || charSequence.equals(C1)))) {
                    return;
                }
                r();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.f2) {
            Integer num = (Integer) objArr[0];
            l0 l0Var = this.n;
            if (l0Var != null) {
                int childCount = l0Var.getChildCount();
                while (i12 < childCount) {
                    View childAt = this.n.getChildAt(i12);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (uf0Var2 = (org.telegram.ui.Components.uf0) childAt.findViewWithTag(valueOf)).getMessageObject()) != null && messageObject2.I1 == i11 && messageObject2.f1() == num.intValue()) {
                        uf0Var2.x();
                        return;
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.e2) {
            Integer num2 = (Integer) objArr[0];
            l0 l0Var2 = this.n;
            if (l0Var2 != null) {
                int childCount2 = l0Var2.getChildCount();
                while (i12 < childCount2) {
                    View childAt2 = this.n.getChildAt(i12);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (uf0Var = (org.telegram.ui.Components.uf0) childAt2.findViewWithTag(valueOf)).getMessageObject()) != null && messageObject.I1 == i11 && messageObject.f1() == num2.intValue()) {
                        uf0Var.y();
                        return;
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.zs.i4) {
            if (i10 == org.telegram.messenger.zs.O && i11 == this.L) {
                r();
                return;
            }
            return;
        }
        l0 l0Var3 = this.n;
        if (l0Var3 != null) {
            int childCount3 = l0Var3.getChildCount();
            while (i12 < childCount3) {
                View childAt3 = this.n.getChildAt(i12);
                if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(Integer.valueOf(org.telegram.messenger.zs.Y4))) != null) {
                    textView.invalidate();
                }
                i12++;
            }
        }
    }

    public final LinearLayout e(int i10, boolean z10) {
        int i11;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i12 = i10;
        ArrayList arrayList2 = this.a0;
        LinearLayout linearLayout = null;
        if (arrayList2.size() == 1 && (i12 < 0 || i12 >= arrayList2.size())) {
            return null;
        }
        int i13 = 0;
        if (i12 == -1) {
            i12 = arrayList2.size() - 1;
        } else if (i12 == arrayList2.size()) {
            i12 = 0;
        }
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(i12);
        TLRPC.Message message = jjVar.k;
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (org.telegram.messenger.jj.B0(message) == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i11 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i14);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (sf.c.c(keyboardInlineButtonRow.buttons.get(i15), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i11++;
                    }
                }
            }
        } else {
            i11 = 0;
        }
        int i16 = jjVar.I1;
        if (i11 > 0 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size3 = arrayList4.size();
            LinearLayout linearLayout2 = null;
            int i17 = 0;
            while (i17 < size3) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList4.get(i17);
                int size4 = keyboardInlineButtonRow2.buttons.size();
                int i18 = i13;
                while (i18 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i18);
                    if (sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(i13);
                            arrayList = arrayList4;
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, linearLayout2, null);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(29));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.n6, null);
                        textView.setTypeface(org.telegram.messenger.i0.o());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(true));
                        linearLayout2.addView(textView, w7.b6.l(100.0f / i11, -1, -1));
                        textView.setOnClickListener(new bh.f(i16, jjVar));
                    } else {
                        arrayList = arrayList4;
                    }
                    i18++;
                    arrayList4 = arrayList;
                    i13 = 0;
                }
                i17++;
                i13 = 0;
            }
            linearLayout = linearLayout2;
        }
        if (linearLayout != null) {
            int L = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z10) {
                int i19 = this.S;
                if (i12 == i19) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i12 == i19 - 1) {
                    linearLayout.setTranslationX(-L);
                } else if (i12 == i19 + 1) {
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
        if ((this.S != 0 || this.b.g0() || this.X) && this.Q != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i10);
                if (jjVar.I1 == this.Q.I1 && org.telegram.messenger.jj.B0(jjVar.k) == org.telegram.messenger.jj.B0(this.Q.k) && jjVar.f1() == this.Q.f1()) {
                    this.S = i10;
                    if (this.X) {
                        if (i10 == arrayList.size() - 1) {
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
        this.Q = (org.telegram.messenger.jj) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewGroup g(int i10, boolean z10) {
        int i11;
        ViewGroup viewGroup;
        float f7;
        org.telegram.messenger.jj jjVar;
        boolean z11;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        org.telegram.ui.Components.uf0 uf0Var;
        int i12 = i10;
        Integer valueOf = Integer.valueOf(org.telegram.messenger.zs.Y4);
        Integer valueOf2 = Integer.valueOf(org.telegram.messenger.zs.X4);
        Integer valueOf3 = Integer.valueOf(org.telegram.messenger.zs.j5);
        Integer valueOf4 = Integer.valueOf(org.telegram.messenger.zs.i5);
        ArrayList arrayList = this.a0;
        if (arrayList.size() == 1 && (i12 < 0 || i12 >= arrayList.size())) {
            return null;
        }
        final int i13 = 0;
        if (i12 == -1) {
            i12 = arrayList.size() - 1;
        } else if (i12 == arrayList.size()) {
            i12 = 0;
        }
        org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(i12);
        int i14 = jjVar2.D;
        int i15 = jjVar2.I1;
        if ((i14 == 1 || i14 == 4) && !jjVar2.l4()) {
            ArrayList arrayList2 = this.G;
            if (arrayList2.size() > 0) {
                ViewGroup viewGroup5 = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
                i11 = 2;
                viewGroup = viewGroup5;
            } else {
                FrameLayout frameLayout = new FrameLayout(this);
                FrameLayout frameLayout2 = new FrameLayout(this);
                i11 = 2;
                frameLayout2.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
                frameLayout2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                frameLayout.addView(frameLayout2, w7.b6.c(-1.0f, -1));
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(this);
                g9Var.setTag(valueOf4);
                frameLayout2.addView(g9Var, w7.b6.c(-1.0f, -1));
                TextView textView = new TextView(this);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(valueOf3);
                frameLayout2.addView(textView, w7.b6.e(-1, -2, 17));
                frameLayout.setTag(2);
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mt0
                    public final /* synthetic */ PopupNotificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i16 = i13;
                        PopupNotificationActivity popupNotificationActivity = this.b;
                        switch (i16) {
                            case 0:
                                int i17 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i18 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i19 = PopupNotificationActivity.b0;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                viewGroup = frameLayout;
            }
            TextView textView2 = (TextView) viewGroup.findViewWithTag(valueOf3);
            org.telegram.ui.Components.g9 g9Var2 = (org.telegram.ui.Components.g9) viewGroup.findViewWithTag(valueOf4);
            g9Var2.setAspectFit(true);
            int i16 = jjVar2.D;
            if (i16 == 1) {
                int i17 = 0;
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(jjVar2.n0, org.telegram.messenger.i0.Z0(false), false, null, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(jjVar2.n0, 100, false, null, false);
                if (w9 != null) {
                    if (jjVar2.D == 1) {
                        org.telegram.messenger.b8.G(org.telegram.messenger.d20.s0);
                        if (!org.telegram.messenger.b8.N(jjVar2.k, false, true).exists()) {
                            z11 = false;
                            if (jjVar2.m5()) {
                                if (z11 || org.telegram.messenger.b6.q(i15).d(jjVar2)) {
                                    f7 = 0.0f;
                                    g9Var2.l(org.telegram.messenger.ic.f(w9, jjVar2.l0), "100_100", org.telegram.messenger.ic.f(w10, jjVar2.l0), "100_100_b", w9.size, jjVar2);
                                } else if (w10 != null) {
                                    org.telegram.messenger.ic f10 = org.telegram.messenger.ic.f(w10, jjVar2.l0);
                                    f7 = 0.0f;
                                    g9Var2.k(f10, "100_100_b", null, null, jjVar2);
                                } else {
                                    f7 = 0.0f;
                                    jjVar = jjVar2;
                                }
                                g9Var2.setVisibility(0);
                                textView2.setVisibility(8);
                                viewGroup2 = viewGroup;
                            } else {
                                jjVar = jjVar2;
                                f7 = 0.0f;
                            }
                            i17 = 0;
                        }
                    }
                    z11 = true;
                    if (jjVar2.m5()) {
                    }
                    i17 = 0;
                } else {
                    jjVar = jjVar2;
                    f7 = 0.0f;
                }
                g9Var2.setVisibility(8);
                textView2.setVisibility(i17);
                textView2.setTextSize(i11, org.telegram.messenger.tz.W0);
                textView2.setText(jjVar.v);
                viewGroup2 = viewGroup;
            } else {
                f7 = 0.0f;
                viewGroup2 = viewGroup;
                if (i16 == 4) {
                    textView2.setVisibility(8);
                    textView2.setText(jjVar2.v);
                    g9Var2.setVisibility(0);
                    TLRPC.GeoPoint geoPoint = jjVar2.k.media.geo;
                    double d = geoPoint.lat;
                    double d10 = geoPoint._long;
                    if (org.telegram.messenger.vp.r1(i15).m3 == 2) {
                        int min = Math.min(2, (int) Math.ceil(org.telegram.messenger.i0.p));
                        int i18 = org.telegram.messenger.b30.i;
                        g9Var2.k(org.telegram.messenger.ic.p(org.telegram.messenger.b30.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 100, 100, 15, min)), null, null, null, jjVar2);
                        viewGroup2 = viewGroup;
                    } else {
                        g9Var2.h(org.telegram.messenger.i0.e0(jjVar2.I1, d, d10, 100, 100, true, 15, -1), null, null);
                        viewGroup2 = viewGroup;
                    }
                }
            }
        } else {
            f7 = 0.0f;
            if (jjVar2.D == 2) {
                ArrayList arrayList3 = this.H;
                if (arrayList3.size() > 0) {
                    ViewGroup viewGroup6 = (ViewGroup) arrayList3.get(0);
                    arrayList3.remove(0);
                    uf0Var = (org.telegram.ui.Components.uf0) viewGroup6.findViewWithTag(valueOf2);
                    viewGroup4 = viewGroup6;
                } else {
                    FrameLayout frameLayout3 = new FrameLayout(this);
                    FrameLayout frameLayout4 = new FrameLayout(this);
                    frameLayout4.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
                    frameLayout4.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                    frameLayout3.addView(frameLayout4, w7.b6.c(-1.0f, -1));
                    FrameLayout frameLayout5 = new FrameLayout(this);
                    frameLayout4.addView(frameLayout5, w7.b6.d(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                    org.telegram.ui.Components.uf0 uf0Var2 = new org.telegram.ui.Components.uf0(this);
                    uf0Var2.f = false;
                    uf0Var2.D = 0;
                    uf0Var2.G = 0;
                    uf0Var2.J = 0;
                    TextPaint textPaint = new TextPaint(1);
                    uf0Var2.r = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
                    uf0Var2.K = org.telegram.messenger.b6.q(uf0Var2.n).k();
                    org.telegram.ui.Components.kn0 kn0Var = new org.telegram.ui.Components.kn0(uf0Var2);
                    uf0Var2.s = kn0Var;
                    kn0Var.h = uf0Var2;
                    org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0();
                    dh0Var.c = 0.0f;
                    dh0Var.f = org.telegram.messenger.i0.L(2.0f);
                    dh0Var.a = new Paint();
                    dh0Var.b = new Paint();
                    uf0Var2.w = dh0Var;
                    uf0Var2.setTag(valueOf2);
                    frameLayout5.addView(uf0Var2);
                    frameLayout3.setTag(3);
                    final int i19 = 1;
                    frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mt0
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i19;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (i162) {
                                case 0:
                                    int i172 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                                case 1:
                                    int i182 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                                default:
                                    int i192 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                            }
                        }
                    });
                    viewGroup4 = frameLayout3;
                    uf0Var = uf0Var2;
                }
                uf0Var.setMessageObject(jjVar2);
                if (org.telegram.messenger.b6.q(i15).d(jjVar2) && uf0Var.D == 2) {
                    org.telegram.messenger.b8.G(uf0Var.n).X(uf0Var.h.F0(), uf0Var.h, 1, 0);
                    uf0Var.D = 3;
                    uf0Var.invalidate();
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
                    frameLayout6.addView(scrollView, w7.b6.c(-1.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(this);
                    linearLayout.setOrientation(0);
                    linearLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                    scrollView.addView(linearLayout, w7.b6.x(-1, -2, 1));
                    linearLayout.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
                    final int i20 = 2;
                    linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.mt0
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i20;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (i162) {
                                case 0:
                                    int i172 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                                case 1:
                                    int i182 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                                default:
                                    int i192 = PopupNotificationActivity.b0;
                                    popupNotificationActivity.k();
                                    break;
                            }
                        }
                    });
                    TextView textView3 = new TextView(this);
                    textView3.setTextSize(1, 16.0f);
                    textView3.setTag(valueOf);
                    int i21 = org.telegram.ui.ActionBar.t6.G6;
                    org.telegram.ui.ActionBar.a7.V(textView3, i21, null);
                    org.telegram.ui.ActionBar.a7.H(textView3, i21, null);
                    textView3.setGravity(17);
                    linearLayout.addView(textView3, w7.b6.r(-1, -2, 17));
                    frameLayout6.setTag(1);
                    viewGroup3 = frameLayout6;
                }
                TextView textView4 = (TextView) viewGroup3.findViewWithTag(valueOf);
                textView4.setTextSize(2, org.telegram.messenger.tz.W0);
                textView4.setText(jjVar2.v);
                viewGroup2 = viewGroup3;
            }
        }
        if (viewGroup2.getParent() == null) {
            this.n.addView(viewGroup2);
        }
        viewGroup2.setVisibility(0);
        if (z10) {
            int L = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = L;
            int i22 = this.S;
            if (i12 == i22) {
                viewGroup2.setTranslationX(f7);
            } else if (i12 == i22 - 1) {
                viewGroup2.setTranslationX(-L);
            } else if (i12 == i22 + 1) {
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
            int intExtra = intent != null ? intent.getIntExtra("currentAccount", org.telegram.messenger.d20.s0) : org.telegram.messenger.d20.s0;
            if (!org.telegram.messenger.d20.r(intExtra)) {
                return;
            } else {
                this.a0.addAll(org.telegram.messenger.ot.t(intExtra).x);
            }
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                if (org.telegram.messenger.d20.i(i10).p()) {
                    this.a0.addAll(org.telegram.messenger.ot.t(i10).w);
                }
            }
        }
        if (((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() || !org.telegram.messenger.w0.w) {
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
        for (int i10 = 0; i10 < 4; i10++) {
            org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.I2);
            org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.r);
            org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.e2);
            org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f2);
            org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.O);
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.d4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.z0();
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
            final int i10 = 2;
            final int i11 = 1;
            if (motionEvent != null && motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX();
                float f7 = this.W;
                int i12 = (int) (x10 - f7);
                if (f7 != -1.0f && !this.X && Math.abs(i12) > org.telegram.messenger.i0.L(10.0f)) {
                    this.X = true;
                    this.W = x10;
                    org.telegram.messenger.i0.f2(this);
                    VelocityTracker velocityTracker = this.I;
                    if (velocityTracker == null) {
                        this.I = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    i12 = 0;
                }
                if (this.X) {
                    if (this.s == null && i12 > 0) {
                        i12 = 0;
                    }
                    r1 = (this.w != null || i12 >= 0) ? i12 : 0;
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
                    int L = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(24.0f);
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
                            this.Y = new Runnable(this) { // from class: org.telegram.ui.lt0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i13 = r2;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i13) {
                                        case 0:
                                            popupNotificationActivity.U = false;
                                            ArrayList arrayList = popupNotificationActivity.a0;
                                            if (arrayList.size() > 1) {
                                                int i14 = popupNotificationActivity.S;
                                                if (i14 > 0) {
                                                    popupNotificationActivity.S = i14 - 1;
                                                } else {
                                                    popupNotificationActivity.S = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.Q = (org.telegram.messenger.jj) arrayList.get(popupNotificationActivity.S);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            org.telegram.messenger.i0.P3(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.p();
                                            org.telegram.messenger.i0.P3(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.a(0);
                                            org.telegram.messenger.i0.P3(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                        } else if ((c10 == 2 || x11 < (-L) / 3) && this.w != null) {
                            translationX = (-L) - this.r.getTranslationX();
                            viewGroup = this.w;
                            linearLayout = this.D;
                            this.Y = new Runnable(this) { // from class: org.telegram.ui.lt0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i13 = i11;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i13) {
                                        case 0:
                                            popupNotificationActivity.U = false;
                                            ArrayList arrayList = popupNotificationActivity.a0;
                                            if (arrayList.size() > 1) {
                                                int i14 = popupNotificationActivity.S;
                                                if (i14 > 0) {
                                                    popupNotificationActivity.S = i14 - 1;
                                                } else {
                                                    popupNotificationActivity.S = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.Q = (org.telegram.messenger.jj) arrayList.get(popupNotificationActivity.S);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            org.telegram.messenger.i0.P3(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.p();
                                            org.telegram.messenger.i0.P3(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.a(0);
                                            org.telegram.messenger.i0.P3(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                        } else if (this.r.getTranslationX() != 0.0f) {
                            float f10 = -this.r.getTranslationX();
                            ViewGroup viewGroup2 = x11 > 0 ? this.s : this.w;
                            LinearLayout linearLayout2 = x11 > 0 ? this.y : this.D;
                            this.Y = new Runnable(this) { // from class: org.telegram.ui.lt0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i13 = i10;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i13) {
                                        case 0:
                                            popupNotificationActivity.U = false;
                                            ArrayList arrayList = popupNotificationActivity.a0;
                                            if (arrayList.size() > 1) {
                                                int i14 = popupNotificationActivity.S;
                                                if (i14 > 0) {
                                                    popupNotificationActivity.S = i14 - 1;
                                                } else {
                                                    popupNotificationActivity.S = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.Q = (org.telegram.messenger.jj) arrayList.get(popupNotificationActivity.S);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            org.telegram.messenger.i0.P3(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.p();
                                            org.telegram.messenger.i0.P3(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.U = false;
                                            popupNotificationActivity.a(0);
                                            org.telegram.messenger.i0.P3(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                            linearLayout = linearLayout2;
                            translationX = f10;
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
                            animatorSet.addListener(new ns0(this, 1));
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
                    this.Y = new Runnable(this) { // from class: org.telegram.ui.lt0
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = r2;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (i13) {
                                case 0:
                                    popupNotificationActivity.U = false;
                                    ArrayList arrayList2 = popupNotificationActivity.a0;
                                    if (arrayList2.size() > 1) {
                                        int i14 = popupNotificationActivity.S;
                                        if (i14 > 0) {
                                            popupNotificationActivity.S = i14 - 1;
                                        } else {
                                            popupNotificationActivity.S = arrayList2.size() - 1;
                                        }
                                        popupNotificationActivity.Q = (org.telegram.messenger.jj) arrayList2.get(popupNotificationActivity.S);
                                        popupNotificationActivity.q(1);
                                        popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.S + 1), Integer.valueOf(arrayList2.size())));
                                    }
                                    org.telegram.messenger.i0.P3(popupNotificationActivity);
                                    break;
                                case 1:
                                    popupNotificationActivity.U = false;
                                    popupNotificationActivity.p();
                                    org.telegram.messenger.i0.P3(popupNotificationActivity);
                                    break;
                                default:
                                    popupNotificationActivity.U = false;
                                    popupNotificationActivity.a(0);
                                    org.telegram.messenger.i0.P3(popupNotificationActivity);
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
        Intent intent = new Intent(org.telegram.messenger.w0.b, (Class<?>) LaunchActivity.class);
        long B0 = org.telegram.messenger.jj.B0(this.Q.k);
        if (org.telegram.messenger.o5.C(B0)) {
            intent.putExtra("encId", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.o5.E(B0)) {
            intent.putExtra("userId", B0);
        } else if (org.telegram.messenger.o5.z(B0)) {
            intent.putExtra("chatId", -B0);
        }
        intent.putExtra("currentAccount", this.Q.I1);
        intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i10) {
        org.telegram.messenger.jj jjVar;
        int L = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(24.0f);
        if (i10 == 0) {
            n(this.r);
            n(this.s);
            n(this.w);
            m(this.x);
            m(this.y);
            m(this.D);
            int i11 = this.S - 1;
            while (true) {
                int i12 = this.S;
                if (i11 >= i12 + 2) {
                    break;
                }
                if (i11 == i12 - 1) {
                    this.s = g(i11, true);
                    this.y = e(i11, true);
                } else if (i11 == i12) {
                    this.r = g(i11, true);
                    this.x = e(i11, true);
                } else if (i11 == i12 + 1) {
                    this.w = g(i11, true);
                    this.D = e(i11, true);
                }
                i11++;
            }
        } else if (i10 == 1) {
            n(this.w);
            m(this.D);
            this.w = this.r;
            this.r = this.s;
            this.s = g(this.S - 1, true);
            this.D = this.x;
            this.x = this.y;
            this.y = e(this.S - 1, true);
        } else if (i10 == 2) {
            n(this.s);
            m(this.y);
            this.s = this.r;
            this.r = this.w;
            this.w = g(this.S + 1, true);
            this.y = this.x;
            this.x = this.D;
            this.D = e(this.S + 1, true);
        } else if (i10 == 3) {
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
                LinearLayout e = e(this.S + 1, false);
                this.D = e;
                if (e != null) {
                    e.setTranslationX(translationX2);
                }
            }
        } else if (i10 == 4) {
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
                LinearLayout e7 = e(0, false);
                this.y = e7;
                if (e7 != null) {
                    e7.setTranslationX(translationX4);
                }
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = (this.S - 1) + i13;
            ArrayList arrayList = this.a0;
            if (arrayList.size() != 1 || (i14 >= 0 && i14 < arrayList.size())) {
                if (i14 == -1) {
                    i14 = arrayList.size() - 1;
                } else if (i14 == arrayList.size()) {
                    i14 = 0;
                }
                jjVar = (org.telegram.messenger.jj) arrayList.get(i14);
            } else {
                jjVar = null;
            }
            this.R[i13] = jjVar;
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

    public final void o(boolean z10) {
        if (this.a == null) {
            return;
        }
        int i10 = 0;
        org.telegram.ui.Components.qv0[] qv0VarArr = this.J;
        if (!z10) {
            this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(0);
            while (i10 < qv0VarArr.length) {
                qv0VarArr[i10].e();
                i10++;
            }
            return;
        }
        try {
            Integer D1 = org.telegram.messenger.vp.r1(this.Q.I1).D1(org.telegram.messenger.jj.B0(this.Q.k), 0L);
            this.e.setCompoundDrawablesWithIntrinsicBounds(qv0VarArr[D1.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
            while (i10 < qv0VarArr.length) {
                if (i10 == D1.intValue()) {
                    qv0VarArr[i10].d();
                } else {
                    qv0VarArr[i10].e();
                }
                i10++;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.b.q0()) {
            this.b.i0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.i0.v(this, configuration);
        org.telegram.messenger.i0.w3(getWindow());
        d();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.t6.T(this);
        org.telegram.ui.ActionBar.t6.K(this, false);
        Typeface typeface = org.telegram.messenger.i0.a;
        for (int i10 = 0; i10 < 4; i10++) {
            org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.I2);
            org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.r);
            org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.e2);
            org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f2);
            org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.O);
        }
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.d4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        this.K = ConnectionsManager.generateClassGuid();
        this.J[0] = new org.telegram.ui.Components.y41(false);
        this.J[1] = new org.telegram.ui.Components.ip(false);
        this.J[2] = new org.telegram.ui.Components.eo0(false);
        this.J[3] = new org.telegram.ui.Components.lf0(null, false);
        this.J[4] = new org.telegram.ui.Components.hl0(false);
        w8 w8Var = new w8(this, this, 8);
        setContentView(w8Var);
        w8Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        w8Var.addView(relativeLayout, w7.b6.c(-1.0f, -1));
        nt0 nt0Var = new nt0(this, this);
        this.E = nt0Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, nt0Var, null);
        float f7 = -1;
        relativeLayout.addView(this.E, w7.b6.v(12, f7, 12, org.telegram.messenger.zs.P3, 13));
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.z0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, w8Var, null, false, null);
        this.b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.E.addView(this.b, w7.b6.v(0, f7, 0, -2, 12));
        this.b.setDelegate(new ot0(this));
        l0 l0Var = new l0(this, this, 21);
        this.n = l0Var;
        this.E.addView(l0Var, 0);
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(this, null);
        this.a = lVar;
        lVar.setOccupyStatusBar(false);
        this.a.setBackButtonImage(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.s8, this.a, null);
        org.telegram.ui.ActionBar.a7.m(this.a, 3, org.telegram.ui.ActionBar.t6.t8, null);
        org.telegram.ui.ActionBar.a7.m(this.a, 1, org.telegram.ui.ActionBar.t6.v8, null);
        this.E.addView(this.a);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = -1;
        this.a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.t0 g10 = this.a.p().g(2, 0, org.telegram.messenger.i0.L(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i11 = org.telegram.ui.ActionBar.t6.B8;
        org.telegram.ui.ActionBar.a7.V(textView, i11, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g10.addView(this.h, w7.b6.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        this.a.addView(this.f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = org.telegram.messenger.i0.L(48.0f);
        layoutParams2.leftMargin = org.telegram.messenger.i0.L(60.0f);
        layoutParams2.gravity = 51;
        this.f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(this);
        this.c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
        this.f.addView(this.c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.width = org.telegram.messenger.i0.L(42.0f);
        layoutParams3.height = org.telegram.messenger.i0.L(42.0f);
        layoutParams3.topMargin = org.telegram.messenger.i0.L(3.0f);
        this.c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.A8, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(org.telegram.messenger.i0.o());
        this.f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = org.telegram.messenger.i0.L(54.0f);
        layoutParams4.bottomMargin = org.telegram.messenger.i0.L(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.e = textView4;
        org.telegram.ui.ActionBar.a7.V(textView4, i11, null);
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
        layoutParams5.leftMargin = org.telegram.messenger.i0.L(54.0f);
        layoutParams5.bottomMargin = org.telegram.messenger.i0.L(4.0f);
        layoutParams5.gravity = 80;
        this.e.setLayoutParams(layoutParams5);
        this.a.setActionBarMenuOnItemClick(new t60(this, 17));
        PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.w0.b.getSystemService("power")).newWakeLock(268435462, "screen");
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
        org.telegram.ui.Components.g9 g9Var = this.c;
        if (g9Var != null) {
            g9Var.setImageDrawable(null);
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
            chatActivityEnterView.i0(false);
            this.b.setFieldFocused(false);
        }
        int i10 = this.L;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i10).setAppPaused(true, false);
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != 3 || iArr[0] == 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131747327, null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747316, null), new tj0(this, 7));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
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
            this.Q = (org.telegram.messenger.jj) arrayList.get(this.S);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i10) {
        if (this.a == null) {
            return;
        }
        int i11 = this.L;
        if (i11 != this.Q.I1) {
            if (i11 >= 0) {
                ConnectionsManager.getInstance(i11).setAppPaused(true, false);
            }
            int i12 = this.Q.I1;
            this.L = i12;
            ConnectionsManager.getInstance(i12).setAppPaused(false, false);
        }
        this.N = null;
        this.M = null;
        long B0 = org.telegram.messenger.jj.B0(this.Q.k);
        this.b.Z0(this.Q.I1, B0);
        if (org.telegram.messenger.o5.C(B0)) {
            this.M = org.telegram.messenger.vp.r1(this.Q.I1).Z1(Long.valueOf(org.telegram.messenger.vp.r1(this.Q.I1).Z0(Integer.valueOf((int) (4294967295L & B0))).user_id));
        } else if (org.telegram.messenger.o5.E(B0)) {
            this.M = org.telegram.messenger.vp.r1(this.Q.I1).Z1(Long.valueOf(B0));
        } else if (org.telegram.messenger.o5.z(B0)) {
            this.N = org.telegram.messenger.vp.r1(this.Q.I1).L0(Long.valueOf(-B0));
            if (this.Q.p3()) {
                this.M = org.telegram.messenger.vp.r1(this.Q.I1).Z1(Long.valueOf(this.Q.k.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.N;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.M;
            if (user != null) {
                this.e.setText(org.telegram.messenger.h20.p(user));
            } else {
                this.e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.M;
            if (user2 != null) {
                this.d.setText(org.telegram.messenger.h20.p(user2));
                if (org.telegram.messenger.o5.C(B0)) {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_white, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
                } else {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(0);
                }
            }
        }
        l(i10);
        r();
        b();
        a(0);
    }

    public final void r() {
        org.telegram.messenger.jj jjVar;
        TLRPC.User user;
        if (this.a == null || (jjVar = this.Q) == null || this.N != null || (user = this.M) == null) {
            return;
        }
        long j10 = user.id / 1000;
        if (j10 == 777 || j10 == 333 || org.telegram.messenger.i5.r(jjVar.I1).f0.get(Long.valueOf(this.M.id)) != null || (org.telegram.messenger.i5.r(this.Q.I1).f0.size() == 0 && org.telegram.messenger.i5.r(this.Q.I1).y())) {
            this.d.setText(org.telegram.messenger.h20.p(this.M));
        } else {
            String str = this.M.phone;
            if (str == null || str.length() == 0) {
                this.d.setText(org.telegram.messenger.h20.p(this.M));
            } else {
                this.d.setText(af.b.c().b("+" + this.M.phone));
            }
        }
        TLRPC.User user2 = this.M;
        if (user2 != null && user2.id == 489000) {
            this.e.setText(org.telegram.messenger.cd.L0(2131743642, null));
            return;
        }
        if (user2 != null && user2.id == 777000) {
            this.e.setText(org.telegram.messenger.cd.L0(2131745578, null));
            return;
        }
        CharSequence C1 = org.telegram.messenger.vp.r1(this.Q.I1).C1(org.telegram.messenger.jj.B0(this.Q.k), 0L, false);
        if (C1 != null && C1.length() != 0) {
            this.P = C1;
            this.e.setText(C1);
            o(true);
        } else {
            this.P = null;
            o(false);
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.Q.I1).Z1(Long.valueOf(this.M.id));
            if (Z1 != null) {
                this.M = Z1;
            }
            this.e.setText(org.telegram.messenger.cd.d0(this.Q.I1, this.M, null, null));
        }
    }
}
