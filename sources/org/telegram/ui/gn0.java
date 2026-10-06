package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class gn0 extends org.telegram.ui.Components.rw0 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int R = 0;
    public int E;
    public double F;
    public double G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    public final int L;
    public int M;
    public String N;
    public int O;
    public int P;
    public final /* synthetic */ kn0 Q;
    public String a;
    public String b;
    public final LinearLayout c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final dn0 n;
    public final dn0 r;
    public final hn0 s;
    public Timer v;
    public Timer w;
    public final Object x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn0(kn0 kn0Var, Context context, int i10) {
        super(context);
        this.Q = kn0Var;
        this.x = new Object();
        this.y = 60000;
        this.E = 15000;
        this.K = "";
        this.N = "*";
        this.L = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i11 = org.telegram.ui.ActionBar.i6.D6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.messenger.q.q(textView2, org.telegram.ui.ActionBar.i6.w0(null, i12, false), 1, 18.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i10 == 3) {
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, w7.z5.q(-2, -2, LocaleController.isRTL ? 5 : 3));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.phone_activate);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                frameLayout.addView(imageView, w7.z5.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, z10 ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(imageView, w7.z5.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, w7.z5.q(-2, -2, 49));
            if (i10 == 1) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.sms_devices);
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, i12, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                frameLayout2.addView(imageView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView3 = new ImageView(context);
                this.h = imageView3;
                imageView3.setImageResource(R.drawable.sms_bubble);
                imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.P9, false), mode));
                frameLayout2.addView(imageView3, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentAppCodeTitle));
            } else {
                ImageView imageView4 = new ImageView(context);
                this.h = imageView4;
                imageView4.setImageResource(R.drawable.sms_code);
                imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.P9, false), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView4, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
            }
            addView(textView2, w7.z5.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, w7.z5.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.q(-2, 36, 1));
        if (i10 == 3) {
            linearLayout.setVisibility(8);
        }
        dn0 dn0Var = new dn0(context, 0);
        this.n = dn0Var;
        dn0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        dn0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        if (i10 == 3) {
            dn0Var.setTextSize(1, 14.0f);
            addView(dn0Var, w7.z5.q(-2, -2, LocaleController.isRTL ? 5 : 3));
            hn0 hn0Var = new hn0(context);
            Paint paint = new Paint();
            hn0Var.a = paint;
            Paint paint2 = new Paint();
            hn0Var.b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gi, false));
            paint2.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.hi, false));
            this.s = hn0Var;
            dn0Var.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(hn0Var, w7.z5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            dn0Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
            dn0Var.setTextSize(1, 15.0f);
            dn0Var.setGravity(49);
            addView(dn0Var, w7.z5.q(-2, -2, 49));
        }
        dn0 dn0Var2 = new dn0(context, 1);
        this.r = dn0Var2;
        dn0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        dn0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        dn0Var2.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
        dn0Var2.setTextSize(1, 15.0f);
        dn0Var2.setGravity(49);
        if (i10 == 1) {
            dn0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
        } else {
            dn0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCode));
        }
        addView(dn0Var2, w7.z5.q(-2, -2, 49));
        dn0Var2.setOnClickListener(new j60(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i10 >= editTextBoldCursorArr.length) {
                return sb2.toString();
            }
            sb2.append(gf.b.d(editTextBoldCursorArr[i10].getText().toString(), false));
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.rw0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.rw0
    public final boolean c(boolean z10) {
        int i10;
        kn0 kn0Var = this.Q;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.StopVerification);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new bn0(this, 1));
            kn0Var.showDialog(alertDialog$Builder.a);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.a;
        tL_auth_cancelCode.phone_code_hash = this.b;
        i10 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ai.u7(19), 2);
        s();
        r();
        int i11 = this.L;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.I = false;
        return true;
    }

    @Override // org.telegram.ui.Components.rw0
    public final void d() {
        this.J = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (!this.I || (editTextBoldCursorArr = this.d) == null) {
            return;
        }
        if (i10 == NotificationCenter.didReceiveSmsCode) {
            editTextBoldCursorArr[0].setText("" + objArr[0]);
            h(null);
            return;
        }
        if (i10 == NotificationCenter.didReceiveCall) {
            String str = "" + objArr[0];
            if (AndroidUtilities.checkPhonePattern(this.N, str)) {
                this.H = true;
                this.d[0].setText(str);
                this.H = false;
                h(null);
            }
        }
    }

    @Override // org.telegram.ui.Components.rw0
    public final void f() {
        int i10 = this.L;
        if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.I = false;
        s();
        r();
    }

    @Override // org.telegram.ui.Components.rw0
    public final void h(String str) {
        int i10;
        if (this.J) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            AndroidUtilities.shakeView(this.c);
            return;
        }
        this.J = true;
        int i11 = this.L;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.I = false;
        kn0 kn0Var = this.Q;
        kn0Var.N1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.b;
        s();
        kn0Var.y1();
        i10 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(verifyphone, new zb0(8, this, verifyphone), 2);
    }

    @Override // org.telegram.ui.Components.rw0
    public final void j() {
        LinearLayout linearLayout = this.c;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        for (int length = this.d.length - 1; length >= 0; length--) {
            if (length == 0 || this.d[length].length() != 0) {
                this.d[length].requestFocus();
                EditTextBoldCursor editTextBoldCursor = this.d[length];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                AndroidUtilities.showKeyboard(this.d[length]);
                return;
            }
        }
    }

    @Override // org.telegram.ui.Components.rw0
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        if (bundle == null) {
            return;
        }
        this.I = true;
        int i12 = this.L;
        if (i12 == 2) {
            AndroidUtilities.setWaitingForSms(true);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i12 == 3) {
            AndroidUtilities.setWaitingForCall(true);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
        }
        this.a = bundle.getString("phone");
        this.b = bundle.getString("phoneHash");
        int i13 = bundle.getInt("timeout");
        this.y = i13;
        this.P = i13;
        this.M = bundle.getInt("nextType");
        this.N = bundle.getString("pattern");
        int i14 = bundle.getInt("length");
        this.O = i14;
        if (i14 == 0) {
            this.O = 5;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.d;
        CharSequence charSequence = "";
        if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.O) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                if (i15 >= editTextBoldCursorArr2.length) {
                    break;
                }
                editTextBoldCursorArr2[i15].setText("");
                i15++;
            }
        } else {
            this.d = new EditTextBoldCursor[this.O];
            final int i16 = 0;
            while (i16 < this.O) {
                this.d[i16] = new EditTextBoldCursor(getContext());
                EditTextBoldCursor editTextBoldCursor = this.d[i16];
                int i17 = org.telegram.ui.ActionBar.i6.G6;
                editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                this.d[i16].setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                this.d[i16].setCursorSize(AndroidUtilities.dp(20.0f));
                this.d[i16].setCursorWidth(1.5f);
                Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.l6, false), PorterDuff.Mode.MULTIPLY));
                this.d[i16].setBackgroundDrawable(mutate);
                this.d[i16].setImeOptions(268435461);
                this.d[i16].setTextSize(1, 20.0f);
                this.d[i16].setMaxLines(1);
                this.d[i16].setTypeface(AndroidUtilities.bold());
                this.d[i16].setPadding(0, 0, 0, 0);
                this.d[i16].setGravity(49);
                if (i12 == 3) {
                    this.d[i16].setEnabled(false);
                    this.d[i16].setInputType(0);
                    this.d[i16].setVisibility(8);
                } else {
                    this.d[i16].setInputType(3);
                }
                this.c.addView(this.d[i16], w7.z5.t(34, 36, 1, 0, 0, i16 != this.O - 1 ? 7 : 0, 0));
                this.d[i16].addTextChangedListener(new en0(this, i16));
                this.d[i16].setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.cn0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i18, KeyEvent keyEvent) {
                        gn0 gn0Var = gn0.this;
                        if (i18 != 67) {
                            gn0Var.getClass();
                            return false;
                        }
                        EditTextBoldCursor[] editTextBoldCursorArr3 = gn0Var.d;
                        int i19 = i16;
                        if (editTextBoldCursorArr3[i19].length() != 0 || i19 <= 0) {
                            return false;
                        }
                        int i20 = i19 - 1;
                        EditTextBoldCursor editTextBoldCursor2 = gn0Var.d[i20];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        gn0Var.d[i20].requestFocus();
                        gn0Var.d[i20].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                });
                this.d[i16].setOnEditorActionListener(new ka(this, 9));
                i16++;
            }
        }
        hn0 hn0Var = this.s;
        if (hn0Var != null) {
            hn0Var.setVisibility(this.M != 0 ? 0 : 8);
        }
        if (this.a == null) {
            return;
        }
        String g10 = org.telegram.messenger.bi.g(new StringBuilder("+"), this.a, gf.b.c());
        if (i12 == 2) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(g10)));
        } else if (i12 == 3) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(g10)));
        } else if (i12 == 4) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(g10)));
        }
        this.e.setText(charSequence);
        if (i12 != 3) {
            AndroidUtilities.showKeyboard(this.d[0]);
            this.d[0].requestFocus();
        } else {
            AndroidUtilities.hideKeyboard(this.d[0]);
        }
        s();
        r();
        this.F = System.currentTimeMillis();
        dn0 dn0Var = this.r;
        dn0 dn0Var2 = this.n;
        if (i12 == 3) {
            int i18 = this.M;
            i10 = 2;
            if (i18 == 4 || i18 == 2) {
                dn0Var.setVisibility(8);
                dn0Var2.setVisibility(0);
                int i19 = this.M;
                if (i19 == 4) {
                    dn0Var2.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                } else if (i19 == 2) {
                    dn0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                }
                q();
                return;
            }
        } else {
            i10 = 2;
        }
        if (i12 == i10 && ((i11 = this.M) == 4 || i11 == 3)) {
            int i20 = R.string.CallText;
            Object[] objArr = new Object[i10];
            objArr[0] = 2;
            objArr[1] = 0;
            dn0Var2.setText(LocaleController.formatString("CallText", i20, objArr));
            dn0Var.setVisibility(this.y < 1000 ? 0 : 8);
            dn0Var2.setVisibility(this.y < 1000 ? 8 : 0);
            q();
            return;
        }
        if (i12 != 4 || this.M != 2) {
            dn0Var2.setVisibility(8);
            dn0Var.setVisibility(8);
            p();
        } else {
            dn0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
            dn0Var.setVisibility(this.y < 1000 ? 0 : 8);
            dn0Var2.setVisibility(this.y < 1000 ? 8 : 0);
            q();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.L == 3 || this.h == null) {
            return;
        }
        int bottom = this.e.getBottom();
        int measuredHeight = getMeasuredHeight() - bottom;
        dn0 dn0Var = this.r;
        if (dn0Var.getVisibility() == 0) {
            int measuredHeight2 = dn0Var.getMeasuredHeight();
            i14 = (measuredHeight + bottom) - measuredHeight2;
            dn0Var.layout(dn0Var.getLeft(), i14, dn0Var.getRight(), measuredHeight2 + i14);
        } else {
            dn0 dn0Var2 = this.n;
            if (dn0Var2.getVisibility() == 0) {
                int measuredHeight3 = dn0Var2.getMeasuredHeight();
                i14 = (measuredHeight + bottom) - measuredHeight3;
                dn0Var2.layout(dn0Var2.getLeft(), i14, dn0Var2.getRight(), measuredHeight3 + i14);
            } else {
                i14 = measuredHeight + bottom;
            }
        }
        LinearLayout linearLayout = this.c;
        int measuredHeight4 = linearLayout.getMeasuredHeight();
        int y3 = hg.c.y(i14 - bottom, measuredHeight4, 2, bottom);
        linearLayout.layout(linearLayout.getLeft(), y3, linearLayout.getRight(), measuredHeight4 + y3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        super.onMeasure(i10, i11);
        if (this.L == 3 || (imageView = this.h) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(35.0f) + this.e.getMeasuredHeight() + this.f.getMeasuredHeight() + imageView.getMeasuredHeight();
        int dp2 = AndroidUtilities.dp(80.0f);
        int dp3 = AndroidUtilities.dp(291.0f);
        kn0 kn0Var = this.Q;
        if (kn0Var.s0 - dp < dp2) {
            setMeasuredDimension(getMeasuredWidth(), dp + dp2);
        } else {
            setMeasuredDimension(getMeasuredWidth(), Math.min(kn0Var.s0, dp3));
        }
    }

    public final void p() {
        if (this.w != null) {
            return;
        }
        this.E = 15000;
        this.w = new Timer();
        this.G = System.currentTimeMillis();
        this.w.schedule(new ci.o2(this, 4), 0L, 1000L);
    }

    public final void q() {
        if (this.v != null) {
            return;
        }
        Timer timer = new Timer();
        this.v = timer;
        timer.schedule(new fn0(this), 0L, 1000L);
    }

    public final void r() {
        try {
            synchronized (this.x) {
                try {
                    Timer timer = this.w;
                    if (timer != null) {
                        timer.cancel();
                        this.w = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void s() {
        try {
            synchronized (this.x) {
                try {
                    Timer timer = this.v;
                    if (timer != null) {
                        timer.cancel();
                        this.v = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void u() {
        int i10;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.a);
        this.J = true;
        kn0 kn0Var = this.Q;
        kn0Var.y1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.a;
        tL_auth_resendCode.phone_code_hash = this.b;
        i10 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new ca(this, bundle, tL_auth_resendCode, 27), 2);
    }
}
