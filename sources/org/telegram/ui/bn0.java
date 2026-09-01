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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bn0 extends org.telegram.ui.Components.wv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int O = 0;
    public int B;
    public double C;
    public double D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public final int I;
    public int J;
    public String K;
    public int L;
    public int M;
    public final /* synthetic */ fn0 N;
    public String a;
    public String b;
    public final LinearLayout c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final hg.q n;
    public final ym0 r;
    public final cn0 s;
    public Timer v;
    public Timer w;
    public final Object x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn0(fn0 fn0Var, Context context, int i10) {
        super(context);
        this.N = fn0Var;
        this.x = new Object();
        this.y = 60000;
        this.B = 15000;
        this.H = "";
        this.K = "*";
        this.I = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i11 = org.telegram.ui.ActionBar.k6.D6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.k6.w0(null, i12, false), 1, 18.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i10 == 3) {
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, k7.c6.q(-2, -2, LocaleController.isRTL ? 5 : 3));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.phone_activate);
            boolean z4 = LocaleController.isRTL;
            if (z4) {
                frameLayout.addView(imageView, k7.c6.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, k7.c6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                frameLayout.addView(textView, k7.c6.d(-1, -2.0f, z4 ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(imageView, k7.c6.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, k7.c6.q(-2, -2, 49));
            if (i10 == 1) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.sms_devices);
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                frameLayout2.addView(imageView2, k7.c6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView3 = new ImageView(context);
                this.h = imageView3;
                imageView3.setImageResource(R.drawable.sms_bubble);
                imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.P9, false), mode));
                frameLayout2.addView(imageView3, k7.c6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentAppCodeTitle));
            } else {
                ImageView imageView4 = new ImageView(context);
                this.h = imageView4;
                imageView4.setImageResource(R.drawable.sms_code);
                imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.P9, false), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView4, k7.c6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
            }
            addView(textView2, k7.c6.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, k7.c6.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.c6.q(-2, 36, 1));
        if (i10 == 3) {
            linearLayout.setVisibility(8);
        }
        hg.q qVar = new hg.q(context, 29);
        this.n = qVar;
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        qVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        if (i10 == 3) {
            qVar.setTextSize(1, 14.0f);
            addView(qVar, k7.c6.q(-2, -2, LocaleController.isRTL ? 5 : 3));
            cn0 cn0Var = new cn0(context);
            Paint paint = new Paint();
            cn0Var.a = paint;
            Paint paint2 = new Paint();
            cn0Var.b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.gi, false));
            paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hi, false));
            this.s = cn0Var;
            qVar.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(cn0Var, k7.c6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            qVar.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
            qVar.setTextSize(1, 15.0f);
            qVar.setGravity(49);
            addView(qVar, k7.c6.q(-2, -2, 49));
        }
        ym0 ym0Var = new ym0(context, 0);
        this.r = ym0Var;
        ym0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q6, false));
        ym0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ym0Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
        ym0Var.setTextSize(1, 15.0f);
        ym0Var.setGravity(49);
        if (i10 == 1) {
            ym0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
        } else {
            ym0Var.setText(LocaleController.getString(R.string.DidNotGetTheCode));
        }
        addView(ym0Var, k7.c6.q(-2, -2, 49));
        ym0Var.setOnClickListener(new f60(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i10 >= editTextBoldCursorArr.length) {
                return sb.toString();
            }
            sb.append(se.b.d(editTextBoldCursorArr[i10].getText().toString(), false));
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.wv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.wv0
    public final boolean c(boolean z4) {
        int i10;
        fn0 fn0Var = this.N;
        if (!z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.StopVerification);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new wm0(this, 1));
            fn0Var.showDialog(alertDialog$Builder.a);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.a;
        tL_auth_cancelCode.phone_code_hash = this.b;
        i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new oh.p5(15), 2);
        s();
        r();
        int i11 = this.I;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.F = false;
        return true;
    }

    @Override // org.telegram.ui.Components.wv0
    public final void d() {
        this.G = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (!this.F || (editTextBoldCursorArr = this.d) == null) {
            return;
        }
        if (i10 == NotificationCenter.didReceiveSmsCode) {
            editTextBoldCursorArr[0].setText("" + objArr[0]);
            h(null);
            return;
        }
        if (i10 == NotificationCenter.didReceiveCall) {
            String str = "" + objArr[0];
            if (AndroidUtilities.checkPhonePattern(this.K, str)) {
                this.E = true;
                this.d[0].setText(str);
                this.E = false;
                h(null);
            }
        }
    }

    @Override // org.telegram.ui.Components.wv0
    public final void f() {
        int i10 = this.I;
        if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.F = false;
        s();
        r();
    }

    @Override // org.telegram.ui.Components.wv0
    public final void h(String str) {
        int i10;
        if (this.G) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            AndroidUtilities.shakeView(this.c);
            return;
        }
        this.G = true;
        int i11 = this.I;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.F = false;
        fn0 fn0Var = this.N;
        fn0Var.N1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.b;
        s();
        fn0Var.y1();
        i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(verifyphone, new tb0(8, this, verifyphone), 2);
    }

    @Override // org.telegram.ui.Components.wv0
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

    @Override // org.telegram.ui.Components.wv0
    public final void m(Bundle bundle, boolean z4) {
        int i10;
        int i11;
        if (bundle == null) {
            return;
        }
        this.F = true;
        int i12 = this.I;
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
        this.M = i13;
        this.J = bundle.getInt("nextType");
        this.K = bundle.getString("pattern");
        int i14 = bundle.getInt("length");
        this.L = i14;
        if (i14 == 0) {
            this.L = 5;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.d;
        CharSequence charSequence = "";
        if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.L) {
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
            this.d = new EditTextBoldCursor[this.L];
            final int i16 = 0;
            while (i16 < this.L) {
                this.d[i16] = new EditTextBoldCursor(getContext());
                EditTextBoldCursor editTextBoldCursor = this.d[i16];
                int i17 = org.telegram.ui.ActionBar.k6.G6;
                editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                this.d[i16].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                this.d[i16].setCursorSize(AndroidUtilities.dp(20.0f));
                this.d[i16].setCursorWidth(1.5f);
                Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.l6, false), PorterDuff.Mode.MULTIPLY));
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
                this.c.addView(this.d[i16], k7.c6.t(34, 36, 1, 0, 0, i16 != this.L - 1 ? 7 : 0, 0));
                this.d[i16].addTextChangedListener(new zm0(this, i16));
                this.d[i16].setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.xm0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i18, KeyEvent keyEvent) {
                        bn0 bn0Var = bn0.this;
                        if (i18 != 67) {
                            bn0Var.getClass();
                            return false;
                        }
                        EditTextBoldCursor[] editTextBoldCursorArr3 = bn0Var.d;
                        int i19 = i16;
                        if (editTextBoldCursorArr3[i19].length() != 0 || i19 <= 0) {
                            return false;
                        }
                        int i20 = i19 - 1;
                        EditTextBoldCursor editTextBoldCursor2 = bn0Var.d[i20];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        bn0Var.d[i20].requestFocus();
                        bn0Var.d[i20].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                });
                this.d[i16].setOnEditorActionListener(new ha(this, 9));
                i16++;
            }
        }
        cn0 cn0Var = this.s;
        if (cn0Var != null) {
            cn0Var.setVisibility(this.J != 0 ? 0 : 8);
        }
        if (this.a == null) {
            return;
        }
        String j10 = org.telegram.messenger.y3.j(new StringBuilder("+"), this.a, se.b.c());
        if (i12 == 2) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(j10)));
        } else if (i12 == 3) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(j10)));
        } else if (i12 == 4) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(j10)));
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
        this.C = System.currentTimeMillis();
        ym0 ym0Var = this.r;
        hg.q qVar = this.n;
        if (i12 == 3) {
            int i18 = this.J;
            i10 = 2;
            if (i18 == 4 || i18 == 2) {
                ym0Var.setVisibility(8);
                qVar.setVisibility(0);
                int i19 = this.J;
                if (i19 == 4) {
                    qVar.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                } else if (i19 == 2) {
                    qVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                }
                q();
                return;
            }
        } else {
            i10 = 2;
        }
        if (i12 == i10 && ((i11 = this.J) == 4 || i11 == 3)) {
            int i20 = R.string.CallText;
            Object[] objArr = new Object[i10];
            objArr[0] = 2;
            objArr[1] = 0;
            qVar.setText(LocaleController.formatString("CallText", i20, objArr));
            ym0Var.setVisibility(this.y < 1000 ? 0 : 8);
            qVar.setVisibility(this.y < 1000 ? 8 : 0);
            q();
            return;
        }
        if (i12 != 4 || this.J != 2) {
            qVar.setVisibility(8);
            ym0Var.setVisibility(8);
            p();
        } else {
            qVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
            ym0Var.setVisibility(this.y < 1000 ? 0 : 8);
            qVar.setVisibility(this.y < 1000 ? 8 : 0);
            q();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.I == 3 || this.h == null) {
            return;
        }
        int bottom = this.e.getBottom();
        int measuredHeight = getMeasuredHeight() - bottom;
        ym0 ym0Var = this.r;
        if (ym0Var.getVisibility() == 0) {
            int measuredHeight2 = ym0Var.getMeasuredHeight();
            i14 = (measuredHeight + bottom) - measuredHeight2;
            ym0Var.layout(ym0Var.getLeft(), i14, ym0Var.getRight(), measuredHeight2 + i14);
        } else {
            hg.q qVar = this.n;
            if (qVar.getVisibility() == 0) {
                int measuredHeight3 = qVar.getMeasuredHeight();
                i14 = (measuredHeight + bottom) - measuredHeight3;
                qVar.layout(qVar.getLeft(), i14, qVar.getRight(), measuredHeight3 + i14);
            } else {
                i14 = measuredHeight + bottom;
            }
        }
        LinearLayout linearLayout = this.c;
        int measuredHeight4 = linearLayout.getMeasuredHeight();
        int d = l.d.d(i14 - bottom, measuredHeight4, 2, bottom);
        linearLayout.layout(linearLayout.getLeft(), d, linearLayout.getRight(), measuredHeight4 + d);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        super.onMeasure(i10, i11);
        if (this.I == 3 || (imageView = this.h) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(35.0f) + this.e.getMeasuredHeight() + this.f.getMeasuredHeight() + imageView.getMeasuredHeight();
        int dp2 = AndroidUtilities.dp(80.0f);
        int dp3 = AndroidUtilities.dp(291.0f);
        fn0 fn0Var = this.N;
        if (fn0Var.p0 - dp < dp2) {
            setMeasuredDimension(getMeasuredWidth(), dp + dp2);
        } else {
            setMeasuredDimension(getMeasuredWidth(), Math.min(fn0Var.p0, dp3));
        }
    }

    public final void p() {
        if (this.w != null) {
            return;
        }
        this.B = 15000;
        this.w = new Timer();
        this.D = System.currentTimeMillis();
        this.w.schedule(new org.telegram.ui.Components.i50(this, 2), 0L, 1000L);
    }

    public final void q() {
        if (this.v != null) {
            return;
        }
        Timer timer = new Timer();
        this.v = timer;
        timer.schedule(new an0(this), 0L, 1000L);
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
        } catch (Exception e6) {
            FileLog.e(e6);
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void t() {
        int i10;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.a);
        this.G = true;
        fn0 fn0Var = this.N;
        fn0Var.y1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.a;
        tL_auth_resendCode.phone_code_hash = this.b;
        i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new ba(this, bundle, tL_auth_resendCode, 27), 2);
    }
}
