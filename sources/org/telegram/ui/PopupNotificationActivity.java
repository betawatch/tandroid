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
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class PopupNotificationActivity extends Activity implements gk7 {
    public static final /* synthetic */ int c0 = 0;
    public LinearLayout E;
    public lf8 F;
    public int L;
    public TLRPC.User N;
    public TLRPC.Chat O;
    public CharSequence Q;
    public org.telegram.ui.ActionBar.a a;
    public boolean a0;
    public ChatActivityEnterView b;
    public be0 c;
    public TextView d;
    public TextView e;
    public FrameLayout f;
    public TextView h;
    public oc6 n;
    public ViewGroup r;
    public ViewGroup s;
    public ViewGroup w;
    public LinearLayout x;
    public LinearLayout y;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public VelocityTracker J = null;
    public final bya[] K = new bya[5];
    public int M = -1;
    public boolean P = false;
    public k27 R = null;
    public final k27[] S = new k27[3];
    public int T = 0;
    public PowerManager.WakeLock U = null;
    public boolean V = false;
    public long W = 0;
    public float X = -1.0f;
    public boolean Y = false;
    public Runnable Z = null;
    public final ArrayList b0 = new ArrayList();

    public final void a(int i) {
        int L = gl.q.x - gl.L(24.0f);
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != L) {
                layoutParams.width = L;
                this.s.setLayoutParams(layoutParams);
            }
            this.s.setTranslationX((-L) + i);
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-L) + i);
        }
        ViewGroup viewGroup2 = this.r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != L) {
                layoutParams2.width = L;
                this.r.setLayoutParams(layoutParams2);
            }
            this.r.setTranslationX(i);
        }
        LinearLayout linearLayout2 = this.x;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i);
        }
        ViewGroup viewGroup3 = this.w;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != L) {
                layoutParams3.width = L;
                this.w.setLayoutParams(layoutParams3);
            }
            this.w.setTranslationX(L + i);
        }
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(L + i);
        }
        this.n.invalidate();
    }

    public final void b() {
        TLRPC.User V1;
        k27 k27Var = this.R;
        if (k27Var != null) {
            int i = k27Var.K1;
            if (this.O != null) {
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(this.O.id));
                if (K0 != null) {
                    this.O = K0;
                    if (this.c != null) {
                        this.c.f(K0, new pb0(this.O));
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.N == null || (V1 = na7.q1(i).V1(Long.valueOf(this.N.id))) == null) {
                return;
            }
            this.N = V1;
            if (this.c != null) {
                this.c.f(V1, new pb0(0, this.N));
            }
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
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new nf8(this, (byte) 0));
        }
        oc6 oc6Var = this.n;
        if (oc6Var != null) {
            oc6Var.getViewTreeObserver().addOnPreDrawListener(new nf8(this, (byte) 1));
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if8 if8Var;
        k27 messageObject;
        if8 if8Var2;
        k27 messageObject2;
        k27 k27Var;
        Integer valueOf = Integer.valueOf(kk7.W4);
        if (i == kk7.H2) {
            if (i2 == this.M) {
                i();
                finish();
                return;
            }
            return;
        }
        int i3 = 0;
        if (i == kk7.f4) {
            if (this.a0) {
                return;
            }
            ArrayList arrayList = this.b0;
            arrayList.clear();
            for (int i4 = 0; i4 < 4; i4++) {
                if (y6c.h(i4).o()) {
                    arrayList.addAll(im7.n(i4).w);
                }
            }
            f();
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = (this.T - 1) + i5;
                if (arrayList.size() != 1 || (i6 >= 0 && i6 < arrayList.size())) {
                    if (i6 == -1) {
                        i6 = arrayList.size() - 1;
                    } else if (i6 == arrayList.size()) {
                        i6 = 0;
                    }
                    k27Var = (k27) arrayList.get(i6);
                } else {
                    k27Var = null;
                }
                if (this.S[i5] != k27Var) {
                    q(0);
                }
            }
            return;
        }
        if (i == 2) {
            if (this.R == null || i2 != this.M) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int i7 = na7.q5;
            if ((intValue & 1) != 0 || (intValue & 4) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0) {
                r();
            }
            if ((intValue & 2) != 0 || (intValue & 8) != 0) {
                b();
            }
            if ((intValue & 64) != 0) {
                CharSequence A1 = na7.q1(this.R.K1).A1(k27.B0(this.R.k), 0L, false);
                CharSequence charSequence = this.Q;
                if (charSequence != null) {
                    if (A1 != null && charSequence.equals(A1)) {
                        return;
                    }
                } else if (A1 == null) {
                    return;
                }
                r();
                return;
            }
            return;
        }
        if (i == kk7.e2) {
            Integer num = (Integer) objArr[0];
            oc6 oc6Var = this.n;
            if (oc6Var != null) {
                int childCount = oc6Var.getChildCount();
                while (i3 < childCount) {
                    View childAt = this.n.getChildAt(i3);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (if8Var2 = (if8) childAt.findViewWithTag(valueOf)).getMessageObject()) != null && messageObject2.K1 == i2 && messageObject2.e1() == num.intValue()) {
                        if8Var2.x();
                        return;
                    }
                    i3++;
                }
                return;
            }
            return;
        }
        if (i == kk7.d2) {
            Integer num2 = (Integer) objArr[0];
            oc6 oc6Var2 = this.n;
            if (oc6Var2 != null) {
                int childCount2 = oc6Var2.getChildCount();
                while (i3 < childCount2) {
                    View childAt2 = this.n.getChildAt(i3);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (if8Var = (if8) childAt2.findViewWithTag(valueOf)).getMessageObject()) != null && messageObject.K1 == i2 && messageObject.e1() == num2.intValue()) {
                        if8Var.y();
                        return;
                    }
                    i3++;
                }
                return;
            }
            return;
        }
        if (i != kk7.k4) {
            if (i == kk7.N && i2 == this.M) {
                r();
                return;
            }
            return;
        }
        oc6 oc6Var3 = this.n;
        if (oc6Var3 != null) {
            int childCount3 = oc6Var3.getChildCount();
            while (i3 < childCount3) {
                View childAt3 = this.n.getChildAt(i3);
                if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(Integer.valueOf(kk7.X4))) != null) {
                    textView.invalidate();
                }
                i3++;
            }
        }
    }

    public final LinearLayout e(int i, boolean z) {
        int i2;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i3 = i;
        ArrayList arrayList2 = this.b0;
        LinearLayout linearLayout = null;
        if (arrayList2.size() == 1 && (i3 < 0 || i3 >= arrayList2.size())) {
            return null;
        }
        int i4 = 0;
        if (i3 == -1) {
            i3 = arrayList2.size() - 1;
        } else if (i3 == arrayList2.size()) {
            i3 = 0;
        }
        k27 k27Var = (k27) arrayList2.get(i3);
        TLRPC.Message message = k27Var.k;
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (k27.B0(message) == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i2 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i5);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (jdb.c(keyboardInlineButtonRow.buttons.get(i6), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i2++;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        int i7 = k27Var.K1;
        if (i2 > 0 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size3 = arrayList4.size();
            LinearLayout linearLayout2 = null;
            int i8 = 0;
            while (i8 < size3) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList4.get(i8);
                int size4 = keyboardInlineButtonRow2.buttons.size();
                int i9 = i4;
                while (i9 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i9);
                    if (jdb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(i4);
                            arrayList = arrayList4;
                            zkb.h(bkb.c6, null, linearLayout2);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new jz1((byte) 21));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        zkb.X(textView, bkb.m6, null);
                        textView.setTypeface(gl.o());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(bkb.L0(true));
                        linearLayout2.addView(textView, nme.l(100.0f / i2, -1, -1));
                        textView.setOnClickListener(new v0(i7, k27Var));
                    } else {
                        arrayList = arrayList4;
                    }
                    i9++;
                    arrayList4 = arrayList;
                    i4 = 0;
                }
                i8++;
                i4 = 0;
            }
            linearLayout = linearLayout2;
        }
        if (linearLayout != null) {
            int L = gl.q.x - gl.L(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z) {
                int i10 = this.T;
                if (i3 == i10) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i3 == i10 - 1) {
                    linearLayout.setTranslationX(-L);
                } else if (i3 == i10 + 1) {
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
        if ((this.T != 0 || this.b.H0() || this.Y) && this.R != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                k27 k27Var = (k27) arrayList.get(i);
                if (k27Var.K1 == this.R.K1 && k27.B0(k27Var.k) == k27.B0(this.R.k) && k27Var.e1() == this.R.e1()) {
                    this.T = i;
                    if (this.Y) {
                        if (i == arrayList.size() - 1) {
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
        this.R = (k27) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewGroup g(int i, boolean z) {
        int i2;
        ViewGroup viewGroup;
        float f;
        k27 k27Var;
        boolean z2;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        if8 if8Var;
        int i3 = i;
        Integer valueOf = Integer.valueOf(kk7.X4);
        Integer valueOf2 = Integer.valueOf(kk7.W4);
        Integer valueOf3 = Integer.valueOf(kk7.i5);
        Integer valueOf4 = Integer.valueOf(kk7.h5);
        ArrayList arrayList = this.b0;
        if (arrayList.size() == 1 && (i3 < 0 || i3 >= arrayList.size())) {
            return null;
        }
        final byte b = 0;
        if (i3 == -1) {
            i3 = arrayList.size() - 1;
        } else if (i3 == arrayList.size()) {
            i3 = 0;
        }
        k27 k27Var2 = (k27) arrayList.get(i3);
        int i4 = k27Var2.D;
        int i5 = k27Var2.K1;
        if ((i4 == 1 || i4 == 4) && !k27Var2.k4()) {
            ArrayList arrayList2 = this.H;
            if (arrayList2.size() > 0) {
                ViewGroup viewGroup5 = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
                i2 = 2;
                viewGroup = viewGroup5;
            } else {
                FrameLayout frameLayout = new FrameLayout(this);
                FrameLayout frameLayout2 = new FrameLayout(this);
                i2 = 2;
                frameLayout2.setPadding(gl.L(10.0f), gl.L(10.0f), gl.L(10.0f), gl.L(10.0f));
                frameLayout2.setBackgroundDrawable(bkb.L0(false));
                frameLayout.addView(frameLayout2, nme.c(-1.0f, -1));
                be0 be0Var = new be0(this);
                be0Var.setTag(valueOf4);
                frameLayout2.addView(be0Var, nme.c(-1.0f, -1));
                TextView textView = new TextView(this);
                zkb.X(textView, bkb.F6, null);
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(valueOf3);
                frameLayout2.addView(textView, nme.e(-1, -2, 17));
                frameLayout.setTag(2);
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: kf8
                    public final /* synthetic */ PopupNotificationActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b2 = b;
                        PopupNotificationActivity popupNotificationActivity = this.b;
                        switch (b2) {
                            case 0:
                                int i6 = PopupNotificationActivity.c0;
                                popupNotificationActivity.k();
                                break;
                            case 1:
                                int i7 = PopupNotificationActivity.c0;
                                popupNotificationActivity.k();
                                break;
                            default:
                                int i8 = PopupNotificationActivity.c0;
                                popupNotificationActivity.k();
                                break;
                        }
                    }
                });
                viewGroup = frameLayout;
            }
            TextView textView2 = (TextView) viewGroup.findViewWithTag(valueOf3);
            be0 be0Var2 = (be0) viewGroup.findViewWithTag(valueOf4);
            be0Var2.setAspectFit(true);
            int i6 = k27Var2.D;
            if (i6 == 1) {
                int i7 = 0;
                TLRPC.PhotoSize w = ba4.w(k27Var2.p0, gl.Y0(false), false, null, false);
                TLRPC.PhotoSize w2 = ba4.w(k27Var2.p0, 100, false, null, false);
                if (w != null) {
                    if (k27Var2.D == 1) {
                        ba4.G(y6c.t0);
                        if (!ba4.M(k27Var2.k, false, true).exists()) {
                            z2 = false;
                            if (k27Var2.l5()) {
                                if (z2 || up3.q(i5).d(k27Var2)) {
                                    f = 0.0f;
                                    be0Var2.h(gl5.f(w, k27Var2.n0), "100_100", gl5.f(w2, k27Var2.n0), "100_100_b", w.size, k27Var2);
                                } else if (w2 != null) {
                                    gl5 f2 = gl5.f(w2, k27Var2.n0);
                                    f = 0.0f;
                                    be0Var2.n(f2, "100_100_b", null, null, k27Var2);
                                } else {
                                    f = 0.0f;
                                    k27Var = k27Var2;
                                }
                                be0Var2.setVisibility(0);
                                textView2.setVisibility(8);
                                viewGroup2 = viewGroup;
                            } else {
                                k27Var = k27Var2;
                                f = 0.0f;
                            }
                            i7 = 0;
                        }
                    }
                    z2 = true;
                    if (k27Var2.l5()) {
                    }
                    i7 = 0;
                } else {
                    k27Var = k27Var2;
                    f = 0.0f;
                }
                be0Var2.setVisibility(8);
                textView2.setVisibility(i7);
                textView2.setTextSize(i2, gba.S0);
                textView2.setText(k27Var.v);
                viewGroup2 = viewGroup;
            } else {
                f = 0.0f;
                viewGroup2 = viewGroup;
                if (i6 == 4) {
                    textView2.setVisibility(8);
                    textView2.setText(k27Var2.v);
                    be0Var2.setVisibility(0);
                    TLRPC.GeoPoint geoPoint = k27Var2.k.media.geo;
                    double d = geoPoint.lat;
                    double d2 = geoPoint._long;
                    if (na7.q1(i5).f3 == 2) {
                        int min = Math.min(2, (int) Math.ceil(gl.p));
                        int i8 = usc.i;
                        be0Var2.n(gl5.p(usc.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 100, 100, 15, min)), null, null, null, k27Var2);
                        viewGroup2 = viewGroup;
                    } else {
                        be0Var2.o(gl.e0(k27Var2.K1, d, d2, 100, 100, true, 15, -1), null, null);
                        viewGroup2 = viewGroup;
                    }
                }
            }
        } else {
            f = 0.0f;
            if (k27Var2.D == 2) {
                ArrayList arrayList3 = this.I;
                if (arrayList3.size() > 0) {
                    ViewGroup viewGroup6 = (ViewGroup) arrayList3.get(0);
                    arrayList3.remove(0);
                    if8Var = (if8) viewGroup6.findViewWithTag(valueOf2);
                    viewGroup4 = viewGroup6;
                } else {
                    FrameLayout frameLayout3 = new FrameLayout(this);
                    FrameLayout frameLayout4 = new FrameLayout(this);
                    frameLayout4.setPadding(gl.L(10.0f), gl.L(10.0f), gl.L(10.0f), gl.L(10.0f));
                    frameLayout4.setBackgroundDrawable(bkb.L0(false));
                    frameLayout3.addView(frameLayout4, nme.c(-1.0f, -1));
                    FrameLayout frameLayout5 = new FrameLayout(this);
                    frameLayout4.addView(frameLayout5, nme.d(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                    if8 if8Var2 = new if8(this);
                    if8Var2.f = false;
                    if8Var2.E = (byte) 0;
                    if8Var2.H = false;
                    if8Var2.K = 0;
                    TextPaint textPaint = new TextPaint(1);
                    if8Var2.r = textPaint;
                    textPaint.setTextSize(gl.L(16.0f));
                    if8Var2.L = up3.q(if8Var2.n).k();
                    xu9 xu9Var = new xu9(if8Var2);
                    if8Var2.s = xu9Var;
                    xu9Var.h = if8Var2;
                    ms8 ms8Var = new ms8();
                    ms8Var.c = 0.0f;
                    ms8Var.f = gl.L(2.0f);
                    ms8Var.a = new Paint();
                    ms8Var.b = new Paint();
                    if8Var2.w = ms8Var;
                    if8Var2.setTag(valueOf2);
                    frameLayout5.addView(if8Var2);
                    frameLayout3.setTag(3);
                    final byte b2 = 1;
                    frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: kf8
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b22 = b2;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (b22) {
                                case 0:
                                    int i62 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                                case 1:
                                    int i72 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                                default:
                                    int i82 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                            }
                        }
                    });
                    viewGroup4 = frameLayout3;
                    if8Var = if8Var2;
                }
                if8Var.setMessageObject(k27Var2);
                viewGroup2 = viewGroup4;
                if (up3.q(i5).d(k27Var2)) {
                    viewGroup2 = viewGroup4;
                    if (if8Var.E == 2) {
                        ba4.G(if8Var.n).X(if8Var.h.F0(), if8Var.h, 1, 0);
                        if8Var.E = (byte) 3;
                        if8Var.invalidate();
                        viewGroup2 = viewGroup4;
                    }
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
                    frameLayout6.addView(scrollView, nme.c(-1.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(this);
                    linearLayout.setOrientation(0);
                    linearLayout.setBackgroundDrawable(bkb.L0(false));
                    scrollView.addView(linearLayout, nme.x(-1, -2, 1));
                    linearLayout.setPadding(gl.L(10.0f), gl.L(10.0f), gl.L(10.0f), gl.L(10.0f));
                    final byte b3 = 2;
                    linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: kf8
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b22 = b3;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (b22) {
                                case 0:
                                    int i62 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                                case 1:
                                    int i72 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                                default:
                                    int i82 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.k();
                                    break;
                            }
                        }
                    });
                    TextView textView3 = new TextView(this);
                    textView3.setTextSize(1, 16.0f);
                    textView3.setTag(valueOf);
                    int i9 = bkb.F6;
                    zkb.X(textView3, i9, null);
                    zkb.G(textView3, i9, null);
                    textView3.setGravity(17);
                    linearLayout.addView(textView3, nme.r(-1, -2, 17));
                    frameLayout6.setTag(1);
                    viewGroup3 = frameLayout6;
                }
                TextView textView4 = (TextView) viewGroup3.findViewWithTag(valueOf);
                textView4.setTextSize(2, gba.S0);
                textView4.setText(k27Var2.v);
                viewGroup2 = viewGroup3;
            }
        }
        if (viewGroup2.getParent() == null) {
            this.n.addView(viewGroup2);
        }
        viewGroup2.setVisibility(0);
        if (z) {
            int L = gl.q.x - gl.L(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = L;
            int i10 = this.T;
            if (i3 == i10) {
                viewGroup2.setTranslationX(f);
            } else if (i3 == i10 - 1) {
                viewGroup2.setTranslationX(-L);
            } else if (i3 == i10 + 1) {
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
            int i = y6c.t0;
            if (intent != null) {
                i = intent.getIntExtra("currentAccount", i);
            }
            if (!y6c.q(i)) {
                return;
            } else {
                this.b0.addAll(im7.n(i).x);
            }
        } else {
            for (int i2 = 0; i2 < 4; i2++) {
                if (y6c.h(i2).o()) {
                    this.b0.addAll(im7.n(i2).w);
                }
            }
        }
        if (((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() || !org.telegram.messenger.a.w) {
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
        for (int i = 0; i < 4; i++) {
            kk7.f(i).n(this, kk7.H2);
            kk7.f(i).n(this, 2);
            kk7.f(i).n(this, kk7.d2);
            kk7.f(i).n(this, kk7.e2);
            kk7.f(i).n(this, kk7.N);
        }
        kk7.e().n(this, kk7.f4);
        kk7.e().n(this, kk7.k4);
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.b1();
        }
        if (this.U.isHeld()) {
            this.U.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        if (r13.getAction() != 3) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(MotionEvent motionEvent) {
        char c;
        float translationX;
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        ViewGroup viewGroup2;
        LinearLayout linearLayout2;
        if (c()) {
            return false;
        }
        final byte b = 2;
        final byte b2 = 1;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.X = motionEvent.getX();
            } else if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX();
                float f = this.X;
                int i = (int) (x - f);
                byte b3 = i;
                if (f != -1.0f) {
                    b3 = i;
                    if (!this.Y) {
                        int abs = Math.abs(i);
                        b3 = i;
                        if (abs > gl.L(10.0f)) {
                            this.Y = true;
                            this.X = x;
                            gl.d2(this);
                            VelocityTracker velocityTracker = this.J;
                            if (velocityTracker == null) {
                                this.J = VelocityTracker.obtain();
                            } else {
                                velocityTracker.clear();
                            }
                            b3 = 0;
                        }
                    }
                }
                if (this.Y) {
                    byte b4 = b3;
                    b4 = b3;
                    if (this.s == null && b3 > 0) {
                        b4 = 0;
                    }
                    r1 = (this.w != null || b4 >= 0) ? b4 : (byte) 0;
                    VelocityTracker velocityTracker2 = this.J;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    a(r1);
                }
            } else if (motionEvent.getAction() != 1) {
            }
            return this.Y;
        }
        if (motionEvent == null || !this.Y) {
            a(0);
        } else {
            int x2 = (int) (motionEvent.getX() - this.X);
            int L = gl.q.x - gl.L(24.0f);
            VelocityTracker velocityTracker3 = this.J;
            if (velocityTracker3 != null) {
                velocityTracker3.computeCurrentVelocity(1000);
                if (this.J.getXVelocity() >= 3500.0f) {
                    c = 1;
                } else if (this.J.getXVelocity() <= -3500.0f) {
                    c = 2;
                }
                if ((c != 1 || x2 > L / 3) && this.s != null) {
                    translationX = L - this.r.getTranslationX();
                    viewGroup = this.s;
                    linearLayout = this.y;
                    this.Z = new Runnable(this) { // from class: jf8
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int size;
                            byte b5 = r2;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (b5) {
                                case 0:
                                    int i2 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.V = false;
                                    ArrayList arrayList = popupNotificationActivity.b0;
                                    if (arrayList.size() > 1) {
                                        int i3 = popupNotificationActivity.T;
                                        if (i3 > 0) {
                                            size = i3 - 1;
                                            popupNotificationActivity.T = size;
                                        } else {
                                            size = arrayList.size() - 1;
                                            popupNotificationActivity.T = size;
                                        }
                                        popupNotificationActivity.R = (k27) arrayList.get(size);
                                        popupNotificationActivity.q(1);
                                        popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.T + 1), Integer.valueOf(arrayList.size())));
                                    }
                                    gl.K3(popupNotificationActivity);
                                    break;
                                case 1:
                                    int i4 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.V = false;
                                    popupNotificationActivity.p();
                                    gl.K3(popupNotificationActivity);
                                    break;
                                default:
                                    int i5 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.V = false;
                                    popupNotificationActivity.a(0);
                                    gl.K3(popupNotificationActivity);
                                    break;
                            }
                        }
                    };
                } else if ((c == 2 || x2 < (-L) / 3) && this.w != null) {
                    translationX = (-L) - this.r.getTranslationX();
                    viewGroup = this.w;
                    linearLayout = this.E;
                    this.Z = new Runnable(this) { // from class: jf8
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int size;
                            byte b5 = b2;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (b5) {
                                case 0:
                                    int i2 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.V = false;
                                    ArrayList arrayList = popupNotificationActivity.b0;
                                    if (arrayList.size() > 1) {
                                        int i3 = popupNotificationActivity.T;
                                        if (i3 > 0) {
                                            size = i3 - 1;
                                            popupNotificationActivity.T = size;
                                        } else {
                                            size = arrayList.size() - 1;
                                            popupNotificationActivity.T = size;
                                        }
                                        popupNotificationActivity.R = (k27) arrayList.get(size);
                                        popupNotificationActivity.q(1);
                                        popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.T + 1), Integer.valueOf(arrayList.size())));
                                    }
                                    gl.K3(popupNotificationActivity);
                                    break;
                                case 1:
                                    int i4 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.V = false;
                                    popupNotificationActivity.p();
                                    gl.K3(popupNotificationActivity);
                                    break;
                                default:
                                    int i5 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.V = false;
                                    popupNotificationActivity.a(0);
                                    gl.K3(popupNotificationActivity);
                                    break;
                            }
                        }
                    };
                } else if (this.r.getTranslationX() != 0.0f) {
                    float f2 = -this.r.getTranslationX();
                    if (x2 > 0) {
                        viewGroup2 = this.s;
                        linearLayout2 = this.y;
                    } else {
                        viewGroup2 = this.w;
                        linearLayout2 = this.E;
                    }
                    this.Z = new Runnable(this) { // from class: jf8
                        public final /* synthetic */ PopupNotificationActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int size;
                            byte b5 = b;
                            PopupNotificationActivity popupNotificationActivity = this.b;
                            switch (b5) {
                                case 0:
                                    int i2 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.V = false;
                                    ArrayList arrayList = popupNotificationActivity.b0;
                                    if (arrayList.size() > 1) {
                                        int i3 = popupNotificationActivity.T;
                                        if (i3 > 0) {
                                            size = i3 - 1;
                                            popupNotificationActivity.T = size;
                                        } else {
                                            size = arrayList.size() - 1;
                                            popupNotificationActivity.T = size;
                                        }
                                        popupNotificationActivity.R = (k27) arrayList.get(size);
                                        popupNotificationActivity.q(1);
                                        popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.T + 1), Integer.valueOf(arrayList.size())));
                                    }
                                    gl.K3(popupNotificationActivity);
                                    break;
                                case 1:
                                    int i4 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.V = false;
                                    popupNotificationActivity.p();
                                    gl.K3(popupNotificationActivity);
                                    break;
                                default:
                                    int i5 = PopupNotificationActivity.c0;
                                    popupNotificationActivity.V = false;
                                    popupNotificationActivity.a(0);
                                    gl.K3(popupNotificationActivity);
                                    break;
                            }
                        }
                    };
                    viewGroup = viewGroup2;
                    translationX = f2;
                    linearLayout = linearLayout2;
                } else {
                    viewGroup = null;
                    linearLayout = null;
                    translationX = 0.0f;
                }
                if (translationX != 0.0f) {
                    int abs2 = (int) (Math.abs(translationX / L) * 200.0f);
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
                    animatorSet.setDuration(abs2);
                    animatorSet.addListener(new l48(this, (byte) 15));
                    animatorSet.start();
                    this.V = true;
                    this.W = System.currentTimeMillis();
                }
            }
            c = 0;
            if (c != 1) {
            }
            translationX = L - this.r.getTranslationX();
            viewGroup = this.s;
            linearLayout = this.y;
            this.Z = new Runnable(this) { // from class: jf8
                public final /* synthetic */ PopupNotificationActivity b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int size;
                    byte b5 = r2;
                    PopupNotificationActivity popupNotificationActivity = this.b;
                    switch (b5) {
                        case 0:
                            int i2 = PopupNotificationActivity.c0;
                            popupNotificationActivity.V = false;
                            ArrayList arrayList2 = popupNotificationActivity.b0;
                            if (arrayList2.size() > 1) {
                                int i3 = popupNotificationActivity.T;
                                if (i3 > 0) {
                                    size = i3 - 1;
                                    popupNotificationActivity.T = size;
                                } else {
                                    size = arrayList2.size() - 1;
                                    popupNotificationActivity.T = size;
                                }
                                popupNotificationActivity.R = (k27) arrayList2.get(size);
                                popupNotificationActivity.q(1);
                                popupNotificationActivity.h.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.T + 1), Integer.valueOf(arrayList2.size())));
                            }
                            gl.K3(popupNotificationActivity);
                            break;
                        case 1:
                            int i4 = PopupNotificationActivity.c0;
                            popupNotificationActivity.V = false;
                            popupNotificationActivity.p();
                            gl.K3(popupNotificationActivity);
                            break;
                        default:
                            int i5 = PopupNotificationActivity.c0;
                            popupNotificationActivity.V = false;
                            popupNotificationActivity.a(0);
                            gl.K3(popupNotificationActivity);
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
        return this.Y;
    }

    public final void k() {
        if (this.R == null) {
            return;
        }
        Intent intent = new Intent(org.telegram.messenger.a.b, (Class<?>) LaunchActivity.class);
        long B0 = k27.B0(this.R.k);
        if (cf3.B(B0)) {
            intent.putExtra("encId", (int) (B0 & 4294967295L));
        } else if (cf3.D(B0)) {
            intent.putExtra("userId", B0);
        } else if (cf3.y(B0)) {
            intent.putExtra("chatId", -B0);
        }
        intent.putExtra("currentAccount", this.R.K1);
        intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i) {
        k27 k27Var;
        int L = gl.q.x - gl.L(24.0f);
        if (i == 0) {
            n(this.r);
            n(this.s);
            n(this.w);
            m(this.x);
            m(this.y);
            m(this.E);
            int i2 = this.T - 1;
            while (true) {
                int i3 = this.T;
                if (i2 >= i3 + 2) {
                    break;
                }
                if (i2 == i3 - 1) {
                    this.s = g(i2, true);
                    this.y = e(i2, true);
                } else if (i2 == i3) {
                    this.r = g(i2, true);
                    this.x = e(i2, true);
                } else if (i2 == i3 + 1) {
                    this.w = g(i2, true);
                    this.E = e(i2, true);
                }
                i2++;
            }
        } else if (i == 1) {
            n(this.w);
            m(this.E);
            this.w = this.r;
            this.r = this.s;
            this.s = g(this.T - 1, true);
            this.E = this.x;
            this.x = this.y;
            this.y = e(this.T - 1, true);
        } else if (i == 2) {
            n(this.s);
            m(this.y);
            this.s = this.r;
            this.r = this.w;
            this.w = g(this.T + 1, true);
            this.y = this.x;
            this.x = this.E;
            this.E = e(this.T + 1, true);
        } else if (i == 3) {
            ViewGroup viewGroup = this.w;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.w);
                ViewGroup g = g(this.T + 1, false);
                this.w = g;
                if (g != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g.getLayoutParams();
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
                LinearLayout e = e(this.T + 1, false);
                this.E = e;
                if (e != null) {
                    e.setTranslationX(translationX2);
                }
            }
        } else if (i == 4) {
            ViewGroup viewGroup2 = this.s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.s);
                ViewGroup g2 = g(0, false);
                this.s = g2;
                if (g2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g2.getLayoutParams();
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
                LinearLayout e2 = e(0, false);
                this.y = e2;
                if (e2 != null) {
                    e2.setTranslationX(translationX4);
                }
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = (this.T - 1) + i4;
            ArrayList arrayList = this.b0;
            if (arrayList.size() != 1 || (i5 >= 0 && i5 < arrayList.size())) {
                if (i5 == -1) {
                    i5 = arrayList.size() - 1;
                } else if (i5 == arrayList.size()) {
                    i5 = 0;
                }
                k27Var = (k27) arrayList.get(i5);
            } else {
                k27Var = null;
            }
            this.S[i4] = k27Var;
        }
    }

    public final void m(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.F.removeView(linearLayout);
    }

    public final void n(ViewGroup viewGroup) {
        if (viewGroup != null) {
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
    }

    public final void o(boolean z) {
        if (this.a != null) {
            int i = 0;
            bya[] byaVarArr = this.K;
            if (!z) {
                this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                this.e.setCompoundDrawablePadding(0);
                while (i < byaVarArr.length) {
                    byaVarArr[i].e();
                    i++;
                }
                return;
            }
            try {
                Integer B1 = na7.q1(this.R.K1).B1(k27.B0(this.R.k), 0L);
                this.e.setCompoundDrawablesWithIntrinsicBounds(byaVarArr[B1.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                this.e.setCompoundDrawablePadding(gl.L(4.0f));
                while (i < byaVarArr.length) {
                    if (i == B1.intValue()) {
                        byaVarArr[i].d();
                    } else {
                        byaVarArr[i].e();
                    }
                    i++;
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.b.Q0()) {
            this.b.J0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gl.v(this, configuration);
        gl.r3(getWindow());
        d();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bkb.S(this);
        bkb.J(this, false);
        Typeface typeface = gl.a;
        for (int i = 0; i < 4; i++) {
            kk7.f(i).b(this, kk7.H2);
            kk7.f(i).b(this, 2);
            kk7.f(i).b(this, kk7.d2);
            kk7.f(i).b(this, kk7.e2);
            kk7.f(i).b(this, kk7.N);
        }
        kk7.e().b(this, kk7.f4);
        kk7.e().b(this, kk7.k4);
        this.L = ConnectionsManager.generateClassGuid();
        this.K[0] = new a4c(false);
        this.K[1] = new pg2(false);
        this.K[2] = new m4a(false);
        this.K[3] = new bd8(null, false);
        this.K[4] = new oj9(false);
        n81 n81Var = new n81((byte) 7, this, this);
        setContentView(n81Var);
        n81Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        n81Var.addView(relativeLayout, nme.c(-1.0f, -1));
        lf8 lf8Var = new lf8(this, this);
        this.F = lf8Var;
        zkb.h(bkb.c6, null, lf8Var);
        relativeLayout.addView(this.F, nme.v(12, -1.0f, 12, 240.0f, 13));
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.b1();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, n81Var, null, false, null);
        this.b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.F.addView(this.b, nme.v(0, -1.0f, 0, -2.0f, 12));
        this.b.setDelegate(new mf8(this));
        oc6 oc6Var = new oc6((byte) 10, this, this);
        this.n = oc6Var;
        this.F.addView(oc6Var, 0);
        org.telegram.ui.ActionBar.a aVar = new org.telegram.ui.ActionBar.a(this, null);
        this.a = aVar;
        aVar.setOccupyStatusBar(false);
        this.a.setBackButtonImage(R.drawable.ic_close_white);
        zkb.h(bkb.r8, null, this.a);
        zkb.l(this.a, 3, bkb.s8, null);
        zkb.l(this.a, 1, bkb.u8, null);
        this.F.addView(this.a);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = -1;
        this.a.setLayoutParams(layoutParams);
        r7 g = this.a.t().g(2, 0, gl.L(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i2 = bkb.A8;
        zkb.X(textView, i2, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g.addView(this.h, nme.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f = frameLayout;
        frameLayout.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        this.a.addView(this.f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = gl.L(48.0f);
        layoutParams2.leftMargin = gl.L(60.0f);
        layoutParams2.gravity = 51;
        this.f.setLayoutParams(layoutParams2);
        be0 be0Var = new be0(this);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(21.0f));
        this.f.addView(this.c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.width = gl.L(42.0f);
        layoutParams3.height = gl.L(42.0f);
        layoutParams3.topMargin = gl.L(3.0f);
        this.c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        zkb.X(textView2, bkb.z8, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(gl.o());
        this.f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = gl.L(54.0f);
        layoutParams4.bottomMargin = gl.L(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.e = textView4;
        zkb.X(textView4, i2, null);
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
        layoutParams5.leftMargin = gl.L(54.0f);
        layoutParams5.bottomMargin = gl.L(4.0f);
        layoutParams5.gravity = 80;
        this.e.setLayoutParams(layoutParams5);
        this.a.setActionBarMenuOnItemClick(new bq5(this, (byte) 23));
        PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.a.b.getSystemService("power")).newWakeLock(268435462, "screen");
        this.U = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController w = MediaController.w();
        if (w.L0 == this.b) {
            w.L0 = null;
        }
        if (this.U.isHeld()) {
            this.U.release();
        }
        be0 be0Var = this.c;
        if (be0Var != null) {
            be0Var.setImageDrawable(null);
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
            chatActivityEnterView.J0(false);
            this.b.setFieldFocused(false);
        }
        int i = this.M;
        if (i >= 0) {
            ConnectionsManager.getInstance(i).setAppPaused(true, false);
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 3 || iArr[0] == 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        String M0 = k96.M0(R.string.AppName, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131747118, null);
        alertDialog$Builder.g(k96.M0(2131747107, null), new k88(this, (byte) 5));
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        alertDialog$Builder.o();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        MediaController w = MediaController.w();
        ChatActivityEnterView chatActivityEnterView = this.b;
        w.L0 = chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.U.acquire(7000L);
    }

    public final void p() {
        int i;
        ArrayList arrayList = this.b0;
        if (arrayList.size() > 1) {
            if (this.T < arrayList.size() - 1) {
                i = this.T + 1;
                this.T = i;
            } else {
                this.T = 0;
                i = 0;
            }
            this.R = (k27) arrayList.get(i);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i) {
        if (this.a == null) {
            return;
        }
        int i2 = this.M;
        if (i2 != this.R.K1) {
            if (i2 >= 0) {
                ConnectionsManager.getInstance(i2).setAppPaused(true, false);
            }
            int i3 = this.R.K1;
            this.M = i3;
            ConnectionsManager.getInstance(i3).setAppPaused(false, false);
        }
        this.O = null;
        this.N = null;
        long B0 = k27.B0(this.R.k);
        this.b.C1(this.R.K1, B0);
        if (cf3.B(B0)) {
            this.N = na7.q1(this.R.K1).V1(Long.valueOf(na7.q1(this.R.K1).Y0(Integer.valueOf((int) (4294967295L & B0))).user_id));
        } else if (cf3.D(B0)) {
            this.N = na7.q1(this.R.K1).V1(Long.valueOf(B0));
        } else if (cf3.y(B0)) {
            this.O = na7.q1(this.R.K1).K0(Long.valueOf(-B0));
            if (this.R.p3()) {
                this.N = na7.q1(this.R.K1).V1(Long.valueOf(this.R.k.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.O;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.N;
            TextView textView = this.e;
            if (user != null) {
                textView.setText(l7c.r(user));
            } else {
                textView.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.N;
            if (user2 != null) {
                this.d.setText(l7c.r(user2));
                boolean B = cf3.B(B0);
                TextView textView2 = this.d;
                if (B) {
                    textView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_white, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(gl.L(4.0f));
                } else {
                    textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(0);
                }
            }
        }
        l(i);
        r();
        b();
        a(0);
    }

    public final void r() {
        k27 k27Var;
        TLRPC.User user;
        if (this.a == null || (k27Var = this.R) == null || this.O != null || (user = this.N) == null) {
            return;
        }
        long j = user.id / 1000;
        if (j == 777 || j == 333 || qu2.r(k27Var.K1).g0.get(Long.valueOf(this.N.id)) != null || (qu2.r(this.R.K1).g0.size() == 0 && qu2.r(this.R.K1).y())) {
            this.d.setText(l7c.r(this.N));
        } else {
            String str = this.N.phone;
            if (str == null || str.length() == 0) {
                this.d.setText(l7c.r(this.N));
            } else {
                this.d.setText(p38.f().e("+" + this.N.phone));
            }
        }
        TLRPC.User user2 = this.N;
        if (user2 != null) {
            long j2 = user2.id;
            if (j2 == 489000) {
                this.e.setText(k96.M0(2131743377, null));
                return;
            } else if (j2 == 777000) {
                this.e.setText(k96.M0(2131745369, null));
                return;
            }
        }
        CharSequence A1 = na7.q1(this.R.K1).A1(k27.B0(this.R.k), 0L, false);
        if (A1 != null && A1.length() != 0) {
            this.Q = A1;
            this.e.setText(A1);
            o(true);
        } else {
            this.Q = null;
            o(false);
            TLRPC.User V1 = na7.q1(this.R.K1).V1(Long.valueOf(this.N.id));
            if (V1 != null) {
                this.N = V1;
            }
            this.e.setText(k96.d0(this.R.K1, this.N, null, null));
        }
    }
}
