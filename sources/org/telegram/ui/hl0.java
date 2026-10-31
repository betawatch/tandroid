package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Timer;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hl0 extends org.telegram.ui.Components.zu0 implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int R = 0;
    public int D;
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
    public final /* synthetic */ ll0 Q;
    public String a;
    public String b;
    public final LinearLayout c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final ag.j3 n;
    public final el0 r;
    public final il0 s;
    public Timer w;
    public Timer x;
    public final Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl0(ll0 ll0Var, Context context, int i10) {
        super(context);
        float f7;
        this.Q = ll0Var;
        this.y = new Object();
        this.D = 60000;
        this.E = 15000;
        this.K = "";
        this.N = "*";
        this.L = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i11 = org.telegram.ui.ActionBar.t6.D6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.messenger.m5.m(textView2, i12, null, 1, 18.0f);
        textView2.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i10 == 3) {
            textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, w7.b6.r(-2, -2, org.telegram.messenger.cd.X ? 5 : 3));
            ImageView e = org.telegram.messenger.z20.e(context, R.drawable.phone_activate);
            boolean z10 = org.telegram.messenger.cd.X;
            if (z10) {
                f7 = 2.0f;
                frameLayout.addView(e, w7.b6.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, w7.b6.d(-1, -2.0f, org.telegram.messenger.cd.X ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f7 = 2.0f;
                frameLayout.addView(textView, w7.b6.d(-1, -2.0f, z10 ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(e, w7.b6.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f7 = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, w7.b6.r(-2, -2, 49));
            if (i10 == 1) {
                ImageView e7 = org.telegram.messenger.z20.e(context, R.drawable.sms_devices);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.a7.t(e7, i12, null, mode);
                frameLayout2.addView(e7, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(R.drawable.sms_bubble);
                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.P9, null, mode);
                frameLayout2.addView(imageView, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.cd.L0(2131745589, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(R.drawable.sms_code);
                org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.P9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.cd.L0(2131745583, null));
            }
            addView(textView2, w7.b6.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, w7.b6.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.r(-2, 36, 1));
        if (i10 == 3) {
            linearLayout.setVisibility(8);
        }
        ag.j3 j3Var = new ag.j3(context, 29);
        this.n = j3Var;
        org.telegram.ui.ActionBar.a7.V(j3Var, i11, null);
        j3Var.setLineSpacing(org.telegram.messenger.i0.L(f7), 1.0f);
        if (i10 == 3) {
            j3Var.setTextSize(1, 14.0f);
            addView(j3Var, w7.b6.r(-2, -2, org.telegram.messenger.cd.X ? 5 : 3));
            il0 il0Var = new il0(context);
            Paint paint = new Paint();
            il0Var.a = paint;
            Paint paint2 = new Paint();
            il0Var.b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ui, false));
            paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vi, false));
            this.s = il0Var;
            j3Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            addView(il0Var, w7.b6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            j3Var.setPadding(0, org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(10.0f));
            j3Var.setTextSize(1, 15.0f);
            j3Var.setGravity(49);
            addView(j3Var, w7.b6.r(-2, -2, 49));
        }
        el0 el0Var = new el0(context, 0);
        this.r = el0Var;
        org.telegram.ui.ActionBar.a7.V(el0Var, org.telegram.ui.ActionBar.t6.q6, null);
        el0Var.setLineSpacing(org.telegram.messenger.i0.L(f7), 1.0f);
        el0Var.setPadding(0, org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(10.0f));
        el0Var.setTextSize(1, 15.0f);
        el0Var.setGravity(49);
        if (i10 == 1) {
            el0Var.setText(org.telegram.messenger.cd.L0(2131751444, null));
        } else {
            el0Var.setText(org.telegram.messenger.cd.L0(2131751450, null));
        }
        addView(el0Var, w7.b6.r(-2, -2, 49));
        el0Var.setOnClickListener(new f50(this, 17));
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
            sb2.append(af.b.d(editTextBoldCursorArr[i10].getText().toString(), false));
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean c(boolean z10) {
        int i10;
        int i11 = 1;
        ll0 ll0Var = this.Q;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ll0Var.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131744841, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), null);
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131744859, null), new cl0(this, i11));
            ll0Var.showDialog(x1Var);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.a;
        tL_auth_cancelCode.phone_code_hash = this.b;
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ag.c3(20), 2);
        r();
        q();
        int i12 = this.L;
        if (i12 == 2) {
            org.telegram.messenger.i0.D3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.g4);
        } else if (i12 == 3) {
            org.telegram.messenger.i0.C3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.h4);
        }
        this.I = false;
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void d() {
        this.J = false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (!this.I || (editTextBoldCursorArr = this.d) == null) {
            return;
        }
        if (i10 == org.telegram.messenger.zs.g4) {
            editTextBoldCursorArr[0].setText("" + objArr[0]);
            h(null);
            return;
        }
        if (i10 == org.telegram.messenger.zs.h4) {
            String str = "" + objArr[0];
            if (org.telegram.messenger.i0.x(this.N, str)) {
                this.H = true;
                this.d[0].setText(str);
                this.H = false;
                h(null);
            }
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void f() {
        int i10 = this.L;
        if (i10 == 2) {
            org.telegram.messenger.i0.D3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.g4);
        } else if (i10 == 3) {
            org.telegram.messenger.i0.C3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.h4);
        }
        this.I = false;
        r();
        q();
    }

    @Override // org.telegram.ui.Components.zu0
    public final void h(String str) {
        int i10;
        if (this.J) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            org.telegram.messenger.i0.E3(this.c);
            return;
        }
        this.J = true;
        int i11 = this.L;
        if (i11 == 2) {
            org.telegram.messenger.i0.D3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.g4);
        } else if (i11 == 3) {
            org.telegram.messenger.i0.C3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.h4);
        }
        this.I = false;
        ll0 ll0Var = this.Q;
        ll0Var.Q1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.b;
        r();
        ll0Var.B1();
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(verifyphone, new org.telegram.ui.Components.t20(28, this, verifyphone), 2);
    }

    @Override // org.telegram.ui.Components.zu0
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
                org.telegram.messenger.i0.J3(this.d[length]);
                return;
            }
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        if (bundle == null) {
            return;
        }
        this.I = true;
        int i12 = this.L;
        if (i12 == 2) {
            org.telegram.messenger.i0.D3(true);
            org.telegram.messenger.zs.e().b(this, org.telegram.messenger.zs.g4);
        } else if (i12 == 3) {
            org.telegram.messenger.i0.C3(true);
            org.telegram.messenger.zs.e().b(this, org.telegram.messenger.zs.h4);
        }
        this.a = bundle.getString("phone");
        this.b = bundle.getString("phoneHash");
        int i13 = bundle.getInt("timeout");
        this.D = i13;
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
                int i17 = org.telegram.ui.ActionBar.t6.G6;
                org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i17, null);
                org.telegram.ui.ActionBar.a7.w(this.d[i16], i17, null);
                this.d[i16].setCursorSize(org.telegram.messenger.i0.L(20.0f));
                this.d[i16].setCursorWidth(1.5f);
                Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.l6, null, PorterDuff.Mode.MULTIPLY);
                this.d[i16].setBackgroundDrawable(mutate);
                this.d[i16].setImeOptions(268435461);
                this.d[i16].setTextSize(1, 20.0f);
                this.d[i16].setMaxLines(1);
                this.d[i16].setTypeface(org.telegram.messenger.i0.o());
                this.d[i16].setPadding(0, 0, 0, 0);
                this.d[i16].setGravity(49);
                if (i12 == 3) {
                    this.d[i16].setEnabled(false);
                    this.d[i16].setInputType(0);
                    this.d[i16].setVisibility(8);
                } else {
                    this.d[i16].setInputType(3);
                }
                this.c.addView(this.d[i16], w7.b6.t(34, 36, 1, 0, 0, i16 != this.O - 1 ? 7 : 0, 0));
                this.d[i16].addTextChangedListener(new fl0(this, i16));
                this.d[i16].setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.dl0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i18, KeyEvent keyEvent) {
                        hl0 hl0Var = hl0.this;
                        if (i18 != 67) {
                            hl0Var.getClass();
                            return false;
                        }
                        EditTextBoldCursor[] editTextBoldCursorArr3 = hl0Var.d;
                        int i19 = i16;
                        if (editTextBoldCursorArr3[i19].length() != 0 || i19 <= 0) {
                            return false;
                        }
                        int i20 = i19 - 1;
                        EditTextBoldCursor editTextBoldCursor2 = hl0Var.d[i20];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        hl0Var.d[i20].requestFocus();
                        hl0Var.d[i20].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                });
                this.d[i16].setOnEditorActionListener(new ha(this, 9));
                i16++;
            }
        }
        il0 il0Var = this.s;
        if (il0Var != null) {
            il0Var.setVisibility(this.M != 0 ? 0 : 8);
        }
        if (this.a == null) {
            return;
        }
        String h = org.telegram.messenger.m5.h(new StringBuilder("+"), this.a, af.b.c());
        if (i12 == 2) {
            charSequence = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentSmsCode", null, 2131745584, org.telegram.messenger.cd.a(h)));
        } else if (i12 == 3) {
            charSequence = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentCallCode", null, 2131745587, org.telegram.messenger.cd.a(h)));
        } else if (i12 == 4) {
            charSequence = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentCallOnly", null, 2131745586, org.telegram.messenger.cd.a(h)));
        }
        this.e.setText(charSequence);
        if (i12 != 3) {
            org.telegram.messenger.i0.J3(this.d[0]);
            this.d[0].requestFocus();
        } else {
            org.telegram.messenger.i0.v1(this.d[0]);
        }
        r();
        q();
        this.F = System.currentTimeMillis();
        el0 el0Var = this.r;
        ag.j3 j3Var = this.n;
        if (i12 == 3) {
            int i18 = this.M;
            i10 = 2;
            if (i18 == 4 || i18 == 2) {
                el0Var.setVisibility(8);
                j3Var.setVisibility(0);
                int i19 = this.M;
                if (i19 == 4) {
                    j3Var.setText(org.telegram.messenger.cd.a0("CallText", null, 2131752601, 1, 0));
                } else if (i19 == 2) {
                    j3Var.setText(org.telegram.messenger.cd.a0("SmsText", null, 2131745313, 1, 0));
                }
                p();
                return;
            }
        } else {
            i10 = 2;
        }
        if (i12 == i10) {
            int i20 = this.M;
            i11 = 0;
            if (i20 == 4 || i20 == 3) {
                Object[] objArr = new Object[i10];
                objArr[0] = 2;
                objArr[1] = 0;
                j3Var.setText(org.telegram.messenger.cd.a0("CallText", null, 2131752601, objArr));
                el0Var.setVisibility(this.D < 1000 ? 0 : 8);
                j3Var.setVisibility(this.D < 1000 ? 8 : 0);
                p();
                return;
            }
        } else {
            i11 = 0;
        }
        if (i12 != 4 || this.M != 2) {
            j3Var.setVisibility(8);
            el0Var.setVisibility(8);
            o();
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[i11] = 2;
        objArr2[1] = 0;
        j3Var.setText(org.telegram.messenger.cd.a0("SmsText", null, 2131745313, objArr2));
        el0Var.setVisibility(this.D < 1000 ? i11 : 8);
        j3Var.setVisibility(this.D < 1000 ? 8 : i11);
        p();
    }

    public final void o() {
        if (this.x != null) {
            return;
        }
        this.E = 15000;
        this.x = new Timer();
        this.G = System.currentTimeMillis();
        this.x.schedule(new e6.r(this, 4), 0L, 1000L);
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
        el0 el0Var = this.r;
        if (el0Var.getVisibility() == 0) {
            int measuredHeight2 = el0Var.getMeasuredHeight();
            i14 = (measuredHeight + bottom) - measuredHeight2;
            el0Var.layout(el0Var.getLeft(), i14, el0Var.getRight(), measuredHeight2 + i14);
        } else {
            ag.j3 j3Var = this.n;
            if (j3Var.getVisibility() == 0) {
                int measuredHeight3 = j3Var.getMeasuredHeight();
                i14 = (measuredHeight + bottom) - measuredHeight3;
                j3Var.layout(j3Var.getLeft(), i14, j3Var.getRight(), measuredHeight3 + i14);
            } else {
                i14 = measuredHeight + bottom;
            }
        }
        LinearLayout linearLayout = this.c;
        int measuredHeight4 = linearLayout.getMeasuredHeight();
        int u10 = i0.a.u(i14 - bottom, measuredHeight4, 2, bottom);
        linearLayout.layout(linearLayout.getLeft(), u10, linearLayout.getRight(), measuredHeight4 + u10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        super.onMeasure(i10, i11);
        if (this.L == 3 || (imageView = this.h) == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(35.0f) + this.e.getMeasuredHeight() + this.f.getMeasuredHeight() + imageView.getMeasuredHeight();
        int L2 = org.telegram.messenger.i0.L(80.0f);
        int L3 = org.telegram.messenger.i0.L(291.0f);
        ll0 ll0Var = this.Q;
        if (ll0Var.s0 - L < L2) {
            setMeasuredDimension(getMeasuredWidth(), L + L2);
        } else {
            setMeasuredDimension(getMeasuredWidth(), Math.min(ll0Var.s0, L3));
        }
    }

    public final void p() {
        if (this.w != null) {
            return;
        }
        Timer timer = new Timer();
        this.w = timer;
        timer.schedule(new gl0(this), 0L, 1000L);
    }

    public final void q() {
        try {
            synchronized (this.y) {
                try {
                    Timer timer = this.x;
                    if (timer != null) {
                        timer.cancel();
                        this.x = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void r() {
        try {
            synchronized (this.y) {
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void s() {
        int i10;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.a);
        this.J = true;
        ll0 ll0Var = this.Q;
        ll0Var.B1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.a;
        tL_auth_resendCode.phone_code_hash = this.b;
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new aa(this, bundle, tL_auth_resendCode, 27), 2);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void updateColors() {
        try {
            if (this.d == null) {
                return;
            }
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.d;
                if (i10 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                }
                i10++;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
