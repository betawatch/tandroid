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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class PopupNotificationActivity extends Activity implements org.telegram.messenger.cs {
    public static final /* synthetic */ int c0 = 0;
    public LinearLayout E;
    public tr0 F;
    public int L;
    public TLRPC.User N;
    public TLRPC.Chat O;
    public CharSequence Q;
    public org.telegram.ui.ActionBar.k a;
    public boolean a0;
    public ChatActivityEnterView b;
    public org.telegram.ui.Components.k9 c;
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
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public VelocityTracker J = null;
    public final org.telegram.ui.Components.nu0[] K = new org.telegram.ui.Components.nu0[5];
    public int M = -1;
    public boolean P = false;
    public org.telegram.messenger.zi R = null;
    public final org.telegram.messenger.zi[] S = new org.telegram.messenger.zi[3];
    public int T = 0;
    public PowerManager.WakeLock U = null;
    public boolean V = false;
    public long W = 0;
    public float X = -1.0f;
    public boolean Y = false;
    public Runnable Z = null;
    public final ArrayList b0 = new ArrayList();

    public final void a(int i3) {
        int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(24.0f);
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != L) {
                layoutParams.width = L;
                this.s.setLayoutParams(layoutParams);
            }
            this.s.setTranslationX((-L) + i3);
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-L) + i3);
        }
        ViewGroup viewGroup2 = this.r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != L) {
                layoutParams2.width = L;
                this.r.setLayoutParams(layoutParams2);
            }
            this.r.setTranslationX(i3);
        }
        LinearLayout linearLayout2 = this.x;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i3);
        }
        ViewGroup viewGroup3 = this.w;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != L) {
                layoutParams3.width = L;
                this.w.setLayoutParams(layoutParams3);
            }
            this.w.setTranslationX(L + i3);
        }
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(L + i3);
        }
        this.n.invalidate();
    }

    public final void b() {
        TLRPC.User a22;
        org.telegram.messenger.zi ziVar = this.R;
        if (ziVar == null) {
            return;
        }
        int i3 = ziVar.I1;
        if (this.O != null) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(this.O.id));
            if (M0 == null) {
                return;
            }
            this.O = M0;
            if (this.c != null) {
                this.c.e(M0, new org.telegram.ui.Components.u8(this.O));
                return;
            }
            return;
        }
        if (this.N == null || (a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(this.N.id))) == null) {
            return;
        }
        this.N = a22;
        if (this.c != null) {
            this.c.e(a22, new org.telegram.ui.Components.u8(0, this.N));
        }
    }

    public final boolean c() {
        if (this.V && this.W < System.currentTimeMillis() - 400) {
            this.V = false;
            Runnable runnable = this.Z;
            if (runnable != null) {
                runnable.run();
                this.Z = null;
            }
        }
        return this.V;
    }

    public final void d() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new vr0(this, 0));
        }
        l0 l0Var = this.n;
        if (l0Var != null) {
            l0Var.getViewTreeObserver().addOnPreDrawListener(new vr0(this, 1));
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.te0 te0Var;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.Components.te0 te0Var2;
        org.telegram.messenger.zi messageObject2;
        org.telegram.messenger.zi ziVar;
        Integer valueOf = Integer.valueOf(org.telegram.messenger.hs.X4);
        if (i3 == org.telegram.messenger.hs.I2) {
            if (i10 == this.M) {
                i();
                finish();
                return;
            }
            return;
        }
        int i11 = 0;
        if (i3 == org.telegram.messenger.hs.d4) {
            if (this.a0) {
                return;
            }
            ArrayList arrayList = this.b0;
            arrayList.clear();
            for (int i12 = 0; i12 < 4; i12++) {
                if (org.telegram.messenger.h10.i(i12).p()) {
                    arrayList.addAll(org.telegram.messenger.us.t(i12).w);
                }
            }
            f();
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = (this.T - 1) + i13;
                if (arrayList.size() != 1 || (i14 >= 0 && i14 < arrayList.size())) {
                    if (i14 == -1) {
                        i14 = arrayList.size() - 1;
                    } else if (i14 == arrayList.size()) {
                        i14 = 0;
                    }
                    ziVar = (org.telegram.messenger.zi) arrayList.get(i14);
                } else {
                    ziVar = null;
                }
                if (this.S[i13] != ziVar) {
                    q(0);
                }
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.r) {
            if (this.R == null || i10 != this.M) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int i15 = org.telegram.messenger.hp.C8;
            if ((intValue & 1) != 0 || (intValue & 4) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0) {
                r();
            }
            if ((intValue & 2) != 0 || (intValue & 8) != 0) {
                b();
            }
            if ((intValue & 64) != 0) {
                CharSequence D1 = org.telegram.messenger.hp.s1(this.R.I1).D1(org.telegram.messenger.zi.B0(this.R.k), 0L, false);
                CharSequence charSequence = this.Q;
                if ((charSequence == null || D1 != null) && ((charSequence != null || D1 == null) && (charSequence == null || charSequence.equals(D1)))) {
                    return;
                }
                r();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.f2) {
            Integer num = (Integer) objArr[0];
            l0 l0Var = this.n;
            if (l0Var != null) {
                int childCount = l0Var.getChildCount();
                while (i11 < childCount) {
                    View childAt = this.n.getChildAt(i11);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (te0Var2 = (org.telegram.ui.Components.te0) childAt.findViewWithTag(valueOf)).getMessageObject()) != null && messageObject2.I1 == i10 && messageObject2.f1() == num.intValue()) {
                        te0Var2.v();
                        return;
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.e2) {
            Integer num2 = (Integer) objArr[0];
            l0 l0Var2 = this.n;
            if (l0Var2 != null) {
                int childCount2 = l0Var2.getChildCount();
                while (i11 < childCount2) {
                    View childAt2 = this.n.getChildAt(i11);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (te0Var = (org.telegram.ui.Components.te0) childAt2.findViewWithTag(valueOf)).getMessageObject()) != null && messageObject.I1 == i10 && messageObject.f1() == num2.intValue()) {
                        te0Var.w();
                        return;
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.i4) {
            if (i3 == org.telegram.messenger.hs.O && i10 == this.M) {
                r();
                return;
            }
            return;
        }
        l0 l0Var3 = this.n;
        if (l0Var3 != null) {
            int childCount3 = l0Var3.getChildCount();
            while (i11 < childCount3) {
                View childAt3 = this.n.getChildAt(i11);
                if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(Integer.valueOf(org.telegram.messenger.hs.Y4))) != null) {
                    textView.invalidate();
                }
                i11++;
            }
        }
    }

    public final LinearLayout e(int i3, boolean z10) {
        int i10;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i11 = i3;
        ArrayList arrayList2 = this.b0;
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
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i11);
        TLRPC.Message message = ziVar.k;
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (org.telegram.messenger.zi.B0(message) == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i13);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    if (dg.c.c(keyboardInlineButtonRow.buttons.get(i14), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i10++;
                    }
                }
            }
        } else {
            i10 = 0;
        }
        int i15 = ziVar.I1;
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
                    if (dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(i12);
                            arrayList = arrayList4;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, linearLayout2, null);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new rr0(0));
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
                        linearLayout2.addView(textView, b8.mf.l(100.0f / i10, -1, -1));
                        textView.setOnClickListener(new bi.q(i15, ziVar));
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
            if (z10) {
                int i18 = this.T;
                if (i11 == i18) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i11 == i18 - 1) {
                    linearLayout.setTranslationX(-L);
                } else if (i11 == i18 + 1) {
                    linearLayout.setTranslationX(L);
                }
            }
            this.F.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.b0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.T != 0 || this.b.h0() || this.Y) && this.R != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
                if (ziVar.I1 == this.R.I1 && org.telegram.messenger.zi.B0(ziVar.k) == org.telegram.messenger.zi.B0(this.R.k) && ziVar.f1() == this.R.f1()) {
                    this.T = i3;
                    if (this.Y) {
                        if (i3 == arrayList.size() - 1) {
                            l(3);
                        } else if (this.T == 1) {
                            l(4);
                        }
                    }
                    this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
                }
            }
        }
        this.T = 0;
        this.R = (org.telegram.messenger.zi) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewGroup g(int i3, boolean z10) {
        int i10;
        ViewGroup viewGroup;
        float f10;
        org.telegram.messenger.zi ziVar;
        boolean z11;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        org.telegram.ui.Components.te0 te0Var;
        int i11 = i3;
        Integer valueOf = Integer.valueOf(org.telegram.messenger.hs.Y4);
        Integer valueOf2 = Integer.valueOf(org.telegram.messenger.hs.X4);
        Integer valueOf3 = Integer.valueOf(org.telegram.messenger.hs.j5);
        Integer valueOf4 = Integer.valueOf(org.telegram.messenger.hs.i5);
        ArrayList arrayList = this.b0;
        if (arrayList.size() == 1 && (i11 < 0 || i11 >= arrayList.size())) {
            return null;
        }
        final int i12 = 0;
        if (i11 == -1) {
            i11 = arrayList.size() - 1;
        } else if (i11 == arrayList.size()) {
            i11 = 0;
        }
        org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i11);
        int i13 = ziVar2.D;
        int i14 = ziVar2.I1;
        if ((i13 == 1 || i13 == 4) && !ziVar2.m4()) {
            ArrayList arrayList2 = this.H;
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
                frameLayout.addView(frameLayout2, b8.mf.c(-1.0f, -1));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(this);
                k9Var.setTag(valueOf4);
                frameLayout2.addView(k9Var, b8.mf.c(-1.0f, -1));
                TextView textView = new TextView(this);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(valueOf3);
                frameLayout2.addView(textView, b8.mf.e(-1, -2, 17));
                frameLayout.setTag(2);
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sr0
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
                                int i16 = PopupNotificationActivity.c0;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i17 = PopupNotificationActivity.c0;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i18 = PopupNotificationActivity.c0;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                viewGroup = frameLayout;
            }
            TextView textView2 = (TextView) viewGroup.findViewWithTag(valueOf3);
            org.telegram.ui.Components.k9 k9Var2 = (org.telegram.ui.Components.k9) viewGroup.findViewWithTag(valueOf4);
            k9Var2.setAspectFit(true);
            int i15 = ziVar2.D;
            if (i15 == 1) {
                int i16 = 0;
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ziVar2.n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ziVar2.n0, 100, false, null, false);
                if (w10 != null) {
                    if (ziVar2.D == 1) {
                        org.telegram.messenger.w7.G(org.telegram.messenger.h10.t0);
                        if (!org.telegram.messenger.w7.N(ziVar2.k, false, true).exists()) {
                            z11 = false;
                            if (ziVar2.n5()) {
                                if (z11 || org.telegram.messenger.z5.q(i14).d(ziVar2)) {
                                    f10 = 0.0f;
                                    k9Var2.l(org.telegram.messenger.ac.f(w10, ziVar2.l0), "100_100", org.telegram.messenger.ac.f(w11, ziVar2.l0), "100_100_b", w10.size, ziVar2);
                                } else if (w11 != null) {
                                    org.telegram.messenger.ac f11 = org.telegram.messenger.ac.f(w11, ziVar2.l0);
                                    f10 = 0.0f;
                                    k9Var2.k(f11, "100_100_b", null, null, ziVar2);
                                } else {
                                    f10 = 0.0f;
                                    ziVar = ziVar2;
                                }
                                k9Var2.setVisibility(0);
                                textView2.setVisibility(8);
                                viewGroup2 = viewGroup;
                            } else {
                                ziVar = ziVar2;
                                f10 = 0.0f;
                            }
                            i16 = 0;
                        }
                    }
                    z11 = true;
                    if (ziVar2.n5()) {
                    }
                    i16 = 0;
                } else {
                    ziVar = ziVar2;
                    f10 = 0.0f;
                }
                k9Var2.setVisibility(8);
                textView2.setVisibility(i16);
                textView2.setTextSize(i10, org.telegram.messenger.az.W0);
                textView2.setText(ziVar.v);
                viewGroup2 = viewGroup;
            } else {
                f10 = 0.0f;
                viewGroup2 = viewGroup;
                if (i15 == 4) {
                    textView2.setVisibility(8);
                    textView2.setText(ziVar2.v);
                    k9Var2.setVisibility(0);
                    TLRPC.GeoPoint geoPoint = ziVar2.k.media.geo;
                    double d = geoPoint.lat;
                    double d10 = geoPoint._long;
                    if (org.telegram.messenger.hp.s1(i14).n3 == 2) {
                        int min = Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p));
                        int i17 = org.telegram.messenger.e20.i;
                        k9Var2.k(org.telegram.messenger.ac.p(org.telegram.messenger.e20.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 100, 100, 15, min)), null, null, null, ziVar2);
                        viewGroup2 = viewGroup;
                    } else {
                        k9Var2.h(org.telegram.messenger.g0.e0(ziVar2.I1, d, d10, 100, 100, true, 15, -1), null, null);
                        viewGroup2 = viewGroup;
                    }
                }
            }
        } else {
            f10 = 0.0f;
            if (ziVar2.D == 2) {
                ArrayList arrayList3 = this.I;
                if (arrayList3.size() > 0) {
                    ViewGroup viewGroup6 = (ViewGroup) arrayList3.get(0);
                    arrayList3.remove(0);
                    te0Var = (org.telegram.ui.Components.te0) viewGroup6.findViewWithTag(valueOf2);
                    viewGroup4 = viewGroup6;
                } else {
                    FrameLayout frameLayout3 = new FrameLayout(this);
                    FrameLayout frameLayout4 = new FrameLayout(this);
                    frameLayout4.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                    frameLayout4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                    frameLayout3.addView(frameLayout4, b8.mf.c(-1.0f, -1));
                    FrameLayout frameLayout5 = new FrameLayout(this);
                    frameLayout4.addView(frameLayout5, b8.mf.d(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                    org.telegram.ui.Components.te0 te0Var2 = new org.telegram.ui.Components.te0(this);
                    te0Var2.f = false;
                    te0Var2.E = 0;
                    te0Var2.H = 0;
                    te0Var2.K = 0;
                    TextPaint textPaint = new TextPaint(1);
                    te0Var2.r = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                    te0Var2.L = org.telegram.messenger.z5.q(te0Var2.n).k();
                    org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(te0Var2);
                    te0Var2.s = mm0Var;
                    mm0Var.h = te0Var2;
                    org.telegram.ui.Components.eg0 eg0Var = new org.telegram.ui.Components.eg0();
                    eg0Var.c = 0.0f;
                    eg0Var.f = org.telegram.messenger.g0.L(2.0f);
                    eg0Var.a = new Paint();
                    eg0Var.b = new Paint();
                    te0Var2.w = eg0Var;
                    te0Var2.setTag(valueOf2);
                    frameLayout5.addView(te0Var2);
                    frameLayout3.setTag(3);
                    final int i18 = 1;
                    frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sr0
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
                                    int i162 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                                case 1:
                                    int i172 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                                default:
                                    int i182 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                            }
                        }
                    });
                    viewGroup4 = frameLayout3;
                    te0Var = te0Var2;
                }
                te0Var.setMessageObject(ziVar2);
                if (org.telegram.messenger.z5.q(i14).d(ziVar2) && te0Var.E == 2) {
                    org.telegram.messenger.w7.G(te0Var.n).X(te0Var.h.F0(), te0Var.h, 1, 0);
                    te0Var.E = 3;
                    te0Var.invalidate();
                    viewGroup2 = viewGroup4;
                } else {
                    viewGroup2 = viewGroup4;
                }
            } else {
                ArrayList arrayList4 = this.G;
                if (arrayList4.size() > 0) {
                    ViewGroup viewGroup7 = (ViewGroup) arrayList4.get(0);
                    arrayList4.remove(0);
                    viewGroup3 = viewGroup7;
                } else {
                    FrameLayout frameLayout6 = new FrameLayout(this);
                    ScrollView scrollView = new ScrollView(this);
                    scrollView.setFillViewport(true);
                    frameLayout6.addView(scrollView, b8.mf.c(-1.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(this);
                    linearLayout.setOrientation(0);
                    linearLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                    scrollView.addView(linearLayout, b8.mf.x(-1, -2, 1));
                    linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
                    final int i19 = 2;
                    linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sr0
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
                                    int i162 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                                case 1:
                                    int i172 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                                default:
                                    int i182 = PopupNotificationActivity.c0;
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
                    linearLayout.addView(textView3, b8.mf.r(-1, -2, 17));
                    frameLayout6.setTag(1);
                    viewGroup3 = frameLayout6;
                }
                TextView textView4 = (TextView) viewGroup3.findViewWithTag(valueOf);
                textView4.setTextSize(2, org.telegram.messenger.az.W0);
                textView4.setText(ziVar2.v);
                viewGroup2 = viewGroup3;
            }
        }
        if (viewGroup2.getParent() == null) {
            this.n.addView(viewGroup2);
        }
        viewGroup2.setVisibility(0);
        if (z10) {
            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = L;
            int i21 = this.T;
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
        this.a0 = intent != null && intent.getBooleanExtra("force", false);
        this.b0.clear();
        if (this.a0) {
            int intExtra = intent != null ? intent.getIntExtra("currentAccount", org.telegram.messenger.h10.t0) : org.telegram.messenger.h10.t0;
            if (!org.telegram.messenger.h10.r(intExtra)) {
                return;
            } else {
                this.b0.addAll(org.telegram.messenger.us.t(intExtra).x);
            }
        } else {
            for (int i3 = 0; i3 < 4; i3++) {
                if (org.telegram.messenger.h10.i(i3).p()) {
                    this.b0.addAll(org.telegram.messenger.us.t(i3).w);
                }
            }
        }
        if (((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() || !org.telegram.messenger.t0.w) {
            getWindow().addFlags(2623490);
        } else {
            getWindow().addFlags(2623488);
            getWindow().clearFlags(2);
        }
        if (this.R == null) {
            this.T = 0;
        }
        f();
    }

    public final void i() {
        if (this.P) {
            return;
        }
        this.P = true;
        if (this.a0) {
            this.b0.clear();
        }
        for (int i3 = 0; i3 < 4; i3++) {
            org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.I2);
            org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.r);
            org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.e2);
            org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f2);
            org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.O);
        }
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.d4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.A0();
        }
        if (this.U.isHeld()) {
            this.U.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(MotionEvent motionEvent) {
        char c2;
        float translationX;
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        if (c()) {
            return false;
        }
        if (motionEvent == null || motionEvent.getAction() != 0) {
            final int i3 = 2;
            final int i10 = 1;
            if (motionEvent != null && motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX();
                float f10 = this.X;
                int i11 = (int) (x10 - f10);
                if (f10 != -1.0f && !this.Y && Math.abs(i11) > org.telegram.messenger.g0.L(10.0f)) {
                    this.Y = true;
                    this.X = x10;
                    org.telegram.messenger.g0.f2(this);
                    VelocityTracker velocityTracker = this.J;
                    if (velocityTracker == null) {
                        this.J = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    i11 = 0;
                }
                if (this.Y) {
                    if (this.s == null && i11 > 0) {
                        i11 = 0;
                    }
                    r1 = (this.w != null || i11 >= 0) ? i11 : 0;
                    VelocityTracker velocityTracker2 = this.J;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    a(r1);
                }
            } else if (motionEvent == null || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent == null || !this.Y) {
                    a(0);
                } else {
                    int x11 = (int) (motionEvent.getX() - this.X);
                    int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(24.0f);
                    VelocityTracker velocityTracker3 = this.J;
                    if (velocityTracker3 != null) {
                        velocityTracker3.computeCurrentVelocity(1000);
                        if (this.J.getXVelocity() >= 3500.0f) {
                            c2 = 1;
                        } else if (this.J.getXVelocity() <= -3500.0f) {
                            c2 = 2;
                        }
                        if ((c2 != 1 || x11 > L / 3) && this.s != null) {
                            translationX = L - this.r.getTranslationX();
                            viewGroup = this.s;
                            linearLayout = this.y;
                            this.Z = new Runnable(this) { // from class: org.telegram.ui.qr0
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
                                            popupNotificationActivity.V = false;
                                            ArrayList arrayList = popupNotificationActivity.b0;
                                            if (arrayList.size() > 1) {
                                                int i13 = popupNotificationActivity.T;
                                                if (i13 > 0) {
                                                    popupNotificationActivity.T = i13 - 1;
                                                } else {
                                                    popupNotificationActivity.T = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.R = (org.telegram.messenger.zi) arrayList.get(popupNotificationActivity.T);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.T + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.V = false;
                                            popupNotificationActivity.p();
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.V = false;
                                            popupNotificationActivity.a(0);
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                        } else if ((c2 == 2 || x11 < (-L) / 3) && this.w != null) {
                            translationX = (-L) - this.r.getTranslationX();
                            viewGroup = this.w;
                            linearLayout = this.E;
                            this.Z = new Runnable(this) { // from class: org.telegram.ui.qr0
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
                                            popupNotificationActivity.V = false;
                                            ArrayList arrayList = popupNotificationActivity.b0;
                                            if (arrayList.size() > 1) {
                                                int i13 = popupNotificationActivity.T;
                                                if (i13 > 0) {
                                                    popupNotificationActivity.T = i13 - 1;
                                                } else {
                                                    popupNotificationActivity.T = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.R = (org.telegram.messenger.zi) arrayList.get(popupNotificationActivity.T);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.T + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.V = false;
                                            popupNotificationActivity.p();
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.V = false;
                                            popupNotificationActivity.a(0);
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                    }
                                }
                            };
                        } else if (this.r.getTranslationX() != 0.0f) {
                            float f11 = -this.r.getTranslationX();
                            ViewGroup viewGroup2 = x11 > 0 ? this.s : this.w;
                            LinearLayout linearLayout2 = x11 > 0 ? this.y : this.E;
                            this.Z = new Runnable(this) { // from class: org.telegram.ui.qr0
                                public final /* synthetic */ PopupNotificationActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = i3;
                                    PopupNotificationActivity popupNotificationActivity = this.b;
                                    switch (i12) {
                                        case 0:
                                            popupNotificationActivity.V = false;
                                            ArrayList arrayList = popupNotificationActivity.b0;
                                            if (arrayList.size() > 1) {
                                                int i13 = popupNotificationActivity.T;
                                                if (i13 > 0) {
                                                    popupNotificationActivity.T = i13 - 1;
                                                } else {
                                                    popupNotificationActivity.T = arrayList.size() - 1;
                                                }
                                                popupNotificationActivity.R = (org.telegram.messenger.zi) arrayList.get(popupNotificationActivity.T);
                                                popupNotificationActivity.q(1);
                                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.T + 1), Integer.valueOf(arrayList.size())));
                                            }
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        case 1:
                                            popupNotificationActivity.V = false;
                                            popupNotificationActivity.p();
                                            org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                            break;
                                        default:
                                            popupNotificationActivity.V = false;
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
                            animatorSet.addListener(new y20(this, 20));
                            animatorSet.start();
                            this.V = true;
                            this.W = System.currentTimeMillis();
                        }
                    }
                    c2 = 0;
                    if (c2 != 1) {
                    }
                    translationX = L - this.r.getTranslationX();
                    viewGroup = this.s;
                    linearLayout = this.y;
                    this.Z = new Runnable(this) { // from class: org.telegram.ui.qr0
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
                                    popupNotificationActivity.V = false;
                                    ArrayList arrayList2 = popupNotificationActivity.b0;
                                    if (arrayList2.size() > 1) {
                                        int i13 = popupNotificationActivity.T;
                                        if (i13 > 0) {
                                            popupNotificationActivity.T = i13 - 1;
                                        } else {
                                            popupNotificationActivity.T = arrayList2.size() - 1;
                                        }
                                        popupNotificationActivity.R = (org.telegram.messenger.zi) arrayList2.get(popupNotificationActivity.T);
                                        popupNotificationActivity.q(1);
                                        popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.T + 1), Integer.valueOf(arrayList2.size())));
                                    }
                                    org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                    break;
                                case 1:
                                    popupNotificationActivity.V = false;
                                    popupNotificationActivity.p();
                                    org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                    break;
                                default:
                                    popupNotificationActivity.V = false;
                                    popupNotificationActivity.a(0);
                                    org.telegram.messenger.g0.Q3(popupNotificationActivity);
                                    break;
                            }
                        }
                    };
                    if (translationX != 0.0f) {
                    }
                }
                VelocityTracker velocityTracker4 = this.J;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.J = null;
                }
                this.Y = false;
                this.X = -1.0f;
            }
        } else {
            this.X = motionEvent.getX();
        }
        return this.Y;
    }

    public final void k() {
        if (this.R == null) {
            return;
        }
        Intent intent = new Intent(org.telegram.messenger.t0.b, (Class<?>) LaunchActivity.class);
        long B0 = org.telegram.messenger.zi.B0(this.R.k);
        if (org.telegram.messenger.m5.C(B0)) {
            intent.putExtra("encId", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            intent.putExtra("userId", B0);
        } else if (org.telegram.messenger.m5.z(B0)) {
            intent.putExtra("chatId", -B0);
        }
        intent.putExtra("currentAccount", this.R.I1);
        intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i3) {
        org.telegram.messenger.zi ziVar;
        int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(24.0f);
        if (i3 == 0) {
            n(this.r);
            n(this.s);
            n(this.w);
            m(this.x);
            m(this.y);
            m(this.E);
            int i10 = this.T - 1;
            while (true) {
                int i11 = this.T;
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
                    this.E = e(i10, true);
                }
                i10++;
            }
        } else if (i3 == 1) {
            n(this.w);
            m(this.E);
            this.w = this.r;
            this.r = this.s;
            this.s = g(this.T - 1, true);
            this.E = this.x;
            this.x = this.y;
            this.y = e(this.T - 1, true);
        } else if (i3 == 2) {
            n(this.s);
            m(this.y);
            this.s = this.r;
            this.r = this.w;
            this.w = g(this.T + 1, true);
            this.y = this.x;
            this.x = this.E;
            this.E = e(this.T + 1, true);
        } else if (i3 == 3) {
            ViewGroup viewGroup = this.w;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.w);
                ViewGroup g7 = g(this.T + 1, false);
                this.w = g7;
                if (g7 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g7.getLayoutParams();
                    layoutParams.width = L;
                    this.w.setLayoutParams(layoutParams);
                    this.w.setTranslationX(translationX);
                    this.w.invalidate();
                }
            }
            LinearLayout linearLayout = this.E;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.E);
                LinearLayout e10 = e(this.T + 1, false);
                this.E = e10;
                if (e10 != null) {
                    e10.setTranslationX(translationX2);
                }
            }
        } else if (i3 == 4) {
            ViewGroup viewGroup2 = this.s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.s);
                ViewGroup g10 = g(0, false);
                this.s = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g10.getLayoutParams();
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
            int i13 = (this.T - 1) + i12;
            ArrayList arrayList = this.b0;
            if (arrayList.size() != 1 || (i13 >= 0 && i13 < arrayList.size())) {
                if (i13 == -1) {
                    i13 = arrayList.size() - 1;
                } else if (i13 == arrayList.size()) {
                    i13 = 0;
                }
                ziVar = (org.telegram.messenger.zi) arrayList.get(i13);
            } else {
                ziVar = null;
            }
            this.S[i12] = ziVar;
        }
    }

    public final void m(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.F.removeView(linearLayout);
    }

    public final void n(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int intValue = ((Integer) viewGroup.getTag()).intValue();
        viewGroup.setVisibility(8);
        if (intValue == 1) {
            this.G.add(viewGroup);
        } else if (intValue == 2) {
            this.H.add(viewGroup);
        } else if (intValue == 3) {
            this.I.add(viewGroup);
        }
    }

    public final void o(boolean z10) {
        if (this.a == null) {
            return;
        }
        int i3 = 0;
        org.telegram.ui.Components.nu0[] nu0VarArr = this.K;
        if (!z10) {
            this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(0);
            while (i3 < nu0VarArr.length) {
                nu0VarArr[i3].e();
                i3++;
            }
            return;
        }
        try {
            Integer E1 = org.telegram.messenger.hp.s1(this.R.I1).E1(org.telegram.messenger.zi.B0(this.R.k), 0L);
            this.e.setCompoundDrawablesWithIntrinsicBounds(nu0VarArr[E1.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            while (i3 < nu0VarArr.length) {
                if (i3 == E1.intValue()) {
                    nu0VarArr[i3].d();
                } else {
                    nu0VarArr[i3].e();
                }
                i3++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.b.r0()) {
            this.b.j0(true);
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
        for (int i3 = 0; i3 < 4; i3++) {
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.I2);
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.r);
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.e2);
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f2);
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.O);
        }
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.d4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        this.L = ConnectionsManager.generateClassGuid();
        this.K[0] = new org.telegram.ui.Components.p31(false);
        this.K[1] = new org.telegram.ui.Components.ap(false);
        this.K[2] = new org.telegram.ui.Components.gn0(false);
        this.K[3] = new org.telegram.ui.Components.ke0(null, false);
        this.K[4] = new org.telegram.ui.Components.hk0(false);
        ai.h5 h5Var = new ai.h5(9, this, this);
        setContentView(h5Var);
        h5Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        h5Var.addView(relativeLayout, b8.mf.c(-1.0f, -1));
        tr0 tr0Var = new tr0(this, this);
        this.F = tr0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, tr0Var, null);
        float f10 = -1;
        relativeLayout.addView(this.F, b8.mf.v(12, f10, 12, org.telegram.messenger.hs.P3, 13));
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.A0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, h5Var, null, false, null);
        this.b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.F.addView(this.b, b8.mf.v(0, f10, 0, -2, 12));
        this.b.setDelegate(new ur0(this));
        l0 l0Var = new l0(20, this, this);
        this.n = l0Var;
        this.F.addView(l0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setBackButtonImage(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.s8, this.a, null);
        org.telegram.ui.ActionBar.r6.m(this.a, 3, org.telegram.ui.ActionBar.k6.t8, null);
        org.telegram.ui.ActionBar.r6.m(this.a, 1, org.telegram.ui.ActionBar.k6.v8, null);
        this.F.addView(this.a);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = -1;
        this.a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.q0 g7 = this.a.q().g(2, 0, org.telegram.messenger.g0.L(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i10 = org.telegram.ui.ActionBar.k6.B8;
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g7.addView(this.h, b8.mf.c(-1.0f, 56));
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
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(this);
        this.c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
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
        this.a.setActionBarMenuOnItemClick(new hx(this, 27));
        PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.b.getSystemService("power")).newWakeLock(268435462, "screen");
        this.U = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController B = MediaController.B();
        if (B.L0 == this.b) {
            B.L0 = null;
        }
        if (this.U.isHeld()) {
            this.U.release();
        }
        org.telegram.ui.Components.k9 k9Var = this.c;
        if (k9Var != null) {
            k9Var.setImageDrawable(null);
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
            chatActivityEnterView.j0(false);
            this.b.setFieldFocused(false);
        }
        int i3 = this.M;
        if (i3 >= 0) {
            ConnectionsManager.getInstance(i3).setAppPaused(true, false);
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i3, strArr, iArr);
        if (i3 != 3 || iArr[0] == 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131747319, null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747308, null), new ci0(this, 7));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        alertDialog$Builder.p();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        MediaController B = MediaController.B();
        ChatActivityEnterView chatActivityEnterView = this.b;
        B.L0 = chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.U.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.b0;
        if (arrayList.size() > 1) {
            if (this.T < arrayList.size() - 1) {
                this.T++;
            } else {
                this.T = 0;
            }
            this.R = (org.telegram.messenger.zi) arrayList.get(this.T);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i3) {
        if (this.a == null) {
            return;
        }
        int i10 = this.M;
        if (i10 != this.R.I1) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(i10).setAppPaused(true, false);
            }
            int i11 = this.R.I1;
            this.M = i11;
            ConnectionsManager.getInstance(i11).setAppPaused(false, false);
        }
        this.O = null;
        this.N = null;
        long B0 = org.telegram.messenger.zi.B0(this.R.k);
        this.b.a1(this.R.I1, B0);
        if (org.telegram.messenger.m5.C(B0)) {
            this.N = org.telegram.messenger.hp.s1(this.R.I1).a2(Long.valueOf(org.telegram.messenger.hp.s1(this.R.I1).a1(Integer.valueOf((int) (4294967295L & B0))).user_id));
        } else if (org.telegram.messenger.m5.E(B0)) {
            this.N = org.telegram.messenger.hp.s1(this.R.I1).a2(Long.valueOf(B0));
        } else if (org.telegram.messenger.m5.z(B0)) {
            this.O = org.telegram.messenger.hp.s1(this.R.I1).M0(Long.valueOf(-B0));
            if (this.R.q3()) {
                this.N = org.telegram.messenger.hp.s1(this.R.I1).a2(Long.valueOf(this.R.k.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.O;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.N;
            if (user != null) {
                this.e.setText(org.telegram.messenger.l10.p(user));
            } else {
                this.e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.N;
            if (user2 != null) {
                this.d.setText(org.telegram.messenger.l10.p(user2));
                if (org.telegram.messenger.m5.C(B0)) {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_white, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                } else {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(0);
                }
            }
        }
        l(i3);
        r();
        b();
        a(0);
    }

    public final void r() {
        org.telegram.messenger.zi ziVar;
        TLRPC.User user;
        if (this.a == null || (ziVar = this.R) == null || this.O != null || (user = this.N) == null) {
            return;
        }
        long j10 = user.id / 1000;
        if (j10 == 777 || j10 == 333 || org.telegram.messenger.g5.r(ziVar.I1).g0.get(Long.valueOf(this.N.id)) != null || (org.telegram.messenger.g5.r(this.R.I1).g0.size() == 0 && org.telegram.messenger.g5.r(this.R.I1).y())) {
            this.d.setText(org.telegram.messenger.l10.p(this.N));
        } else {
            String str = this.N.phone;
            if (str == null || str.length() == 0) {
                this.d.setText(org.telegram.messenger.l10.p(this.N));
            } else {
                this.d.setText(mf.b.c().b("+" + this.N.phone));
            }
        }
        TLRPC.User user2 = this.N;
        if (user2 != null && user2.id == 489000) {
            this.e.setText(org.telegram.messenger.bd.M0(2131743626, null));
            return;
        }
        if (user2 != null && user2.id == 777000) {
            this.e.setText(org.telegram.messenger.bd.M0(2131745571, null));
            return;
        }
        CharSequence D1 = org.telegram.messenger.hp.s1(this.R.I1).D1(org.telegram.messenger.zi.B0(this.R.k), 0L, false);
        if (D1 != null && D1.length() != 0) {
            this.Q = D1;
            this.e.setText(D1);
            o(true);
        } else {
            this.Q = null;
            o(false);
            TLRPC.User a22 = org.telegram.messenger.hp.s1(this.R.I1).a2(Long.valueOf(this.N.id));
            if (a22 != null) {
                this.N = a22;
            }
            this.e.setText(org.telegram.messenger.bd.d0(this.R.I1, this.N, null, null));
        }
    }
}
