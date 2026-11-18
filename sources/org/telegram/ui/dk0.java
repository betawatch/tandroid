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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dk0 extends org.telegram.ui.Components.fu0 implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public static final /* synthetic */ int S = 0;
    public int E;
    public int F;
    public double G;
    public double H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public final int M;
    public int N;
    public String O;
    public int P;
    public int Q;
    public final /* synthetic */ hk0 R;
    public String a;
    public String b;
    public final LinearLayout c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final nb0 n;
    public final nb0 r;
    public final ek0 s;
    public Timer w;
    public Timer x;
    public final Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(hk0 hk0Var, Context context, int i7) {
        super(context);
        float f10;
        this.R = hk0Var;
        this.y = new Object();
        this.E = 60000;
        this.F = 15000;
        this.L = "";
        this.O = "*";
        this.M = i7;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i10 = org.telegram.ui.ActionBar.n6.D6;
        org.telegram.ui.ActionBar.u6.U(textView, i10, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.messenger.f3.l(textView2, i11, null, 1, 18.0f);
        int i12 = 3;
        textView2.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i7 == 3) {
            textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, c8.ma.r(-2, -2, org.telegram.messenger.gd.a0 ? 5 : 3));
            ImageView e10 = org.telegram.messenger.n10.e(context, R.drawable.phone_activate);
            boolean z10 = org.telegram.messenger.gd.a0;
            if (z10) {
                f10 = 2.0f;
                frameLayout.addView(e10, c8.ma.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, org.telegram.messenger.gd.a0 ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f10 = 2.0f;
                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, z10 ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(e10, c8.ma.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f10 = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, c8.ma.r(-2, -2, 49));
            if (i7 == 1) {
                ImageView e11 = org.telegram.messenger.n10.e(context, R.drawable.sms_devices);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.u6.s(e11, i11, null, mode);
                frameLayout2.addView(e11, c8.ma.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(R.drawable.sms_bubble);
                org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.P9, null, mode);
                frameLayout2.addView(imageView, c8.ma.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.gd.M0(2131745377, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(R.drawable.sms_code);
                org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.P9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, c8.ma.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.gd.M0(2131745371, null));
            }
            addView(textView2, c8.ma.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, c8.ma.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ma.r(-2, 36, 1));
        if (i7 == 3) {
            linearLayout.setVisibility(8);
        }
        nb0 nb0Var = new nb0(context, 2);
        this.n = nb0Var;
        org.telegram.ui.ActionBar.u6.U(nb0Var, i10, null);
        nb0Var.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        if (i7 == 3) {
            nb0Var.setTextSize(1, 14.0f);
            addView(nb0Var, c8.ma.r(-2, -2, org.telegram.messenger.gd.a0 ? 5 : 3));
            ek0 ek0Var = new ek0(context);
            Paint paint = new Paint();
            ek0Var.a = paint;
            Paint paint2 = new Paint();
            ek0Var.b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xi, false));
            paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yi, false));
            this.s = ek0Var;
            nb0Var.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
            addView(ek0Var, c8.ma.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            nb0Var.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
            nb0Var.setTextSize(1, 15.0f);
            nb0Var.setGravity(49);
            addView(nb0Var, c8.ma.r(-2, -2, 49));
        }
        nb0 nb0Var2 = new nb0(context, i12);
        this.r = nb0Var2;
        org.telegram.ui.ActionBar.u6.U(nb0Var2, org.telegram.ui.ActionBar.n6.q6, null);
        nb0Var2.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        nb0Var2.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
        nb0Var2.setTextSize(1, 15.0f);
        nb0Var2.setGravity(49);
        if (i7 == 1) {
            nb0Var2.setText(org.telegram.messenger.gd.M0(2131751432, null));
        } else {
            nb0Var2.setText(org.telegram.messenger.gd.M0(2131751438, null));
        }
        addView(nb0Var2, c8.ma.r(-2, -2, 49));
        nb0Var2.setOnClickListener(new j40(this, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i7 >= editTextBoldCursorArr.length) {
                return sb2.toString();
            }
            sb2.append(pf.b.d(editTextBoldCursorArr[i7].getText().toString(), false));
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.fu0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.fu0
    public final boolean c(boolean z10) {
        int i7;
        int i10 = 1;
        hk0 hk0Var = this.R;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
            String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(2131744588, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), null);
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131744606, null), new zj0(this, i10));
            hk0Var.showDialog(u1Var);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.a;
        tL_auth_cancelCode.phone_code_hash = this.b;
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new fi.k5(25), 2);
        r();
        q();
        int i11 = this.M;
        if (i11 == 2) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.j4);
        } else if (i11 == 3) {
            org.telegram.messenger.g0.B3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.k4);
        }
        this.J = false;
        return true;
    }

    @Override // org.telegram.ui.Components.fu0
    public final void d() {
        this.K = false;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (!this.J || (editTextBoldCursorArr = this.d) == null) {
            return;
        }
        if (i7 == org.telegram.messenger.ks.j4) {
            editTextBoldCursorArr[0].setText("" + objArr[0]);
            h(null);
            return;
        }
        if (i7 == org.telegram.messenger.ks.k4) {
            String str = "" + objArr[0];
            if (org.telegram.messenger.g0.x(this.O, str)) {
                this.I = true;
                this.d[0].setText(str);
                this.I = false;
                h(null);
            }
        }
    }

    @Override // org.telegram.ui.Components.fu0
    public final void f() {
        int i7 = this.M;
        if (i7 == 2) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.j4);
        } else if (i7 == 3) {
            org.telegram.messenger.g0.B3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.k4);
        }
        this.J = false;
        r();
        q();
    }

    @Override // org.telegram.ui.Components.fu0
    public final void h(String str) {
        int i7;
        if (this.K) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            org.telegram.messenger.g0.D3(this.c);
            return;
        }
        this.K = true;
        int i10 = this.M;
        if (i10 == 2) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.j4);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.B3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.k4);
        }
        this.J = false;
        hk0 hk0Var = this.R;
        hk0Var.R1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.b;
        r();
        hk0Var.C1();
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(verifyphone, new e00(16, this, verifyphone), 2);
    }

    @Override // org.telegram.ui.Components.fu0
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
                org.telegram.messenger.g0.I3(this.d[length]);
                return;
            }
        }
    }

    @Override // org.telegram.ui.Components.fu0
    public final void m(Bundle bundle, boolean z10) {
        int i7;
        int i10;
        if (bundle == null) {
            return;
        }
        this.J = true;
        int i11 = this.M;
        if (i11 == 2) {
            org.telegram.messenger.g0.C3(true);
            org.telegram.messenger.ks.e().b(this, org.telegram.messenger.ks.j4);
        } else if (i11 == 3) {
            org.telegram.messenger.g0.B3(true);
            org.telegram.messenger.ks.e().b(this, org.telegram.messenger.ks.k4);
        }
        this.a = bundle.getString("phone");
        this.b = bundle.getString("phoneHash");
        int i12 = bundle.getInt("timeout");
        this.E = i12;
        this.Q = i12;
        this.N = bundle.getInt("nextType");
        this.O = bundle.getString("pattern");
        int i13 = bundle.getInt("length");
        this.P = i13;
        if (i13 == 0) {
            this.P = 5;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.d;
        CharSequence charSequence = "";
        if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.P) {
            int i14 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                if (i14 >= editTextBoldCursorArr2.length) {
                    break;
                }
                editTextBoldCursorArr2[i14].setText("");
                i14++;
            }
        } else {
            this.d = new EditTextBoldCursor[this.P];
            final int i15 = 0;
            while (i15 < this.P) {
                this.d[i15] = new EditTextBoldCursor(getContext());
                EditTextBoldCursor editTextBoldCursor = this.d[i15];
                int i16 = org.telegram.ui.ActionBar.n6.G6;
                org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i16, null);
                org.telegram.ui.ActionBar.u6.v(this.d[i15], i16, null);
                this.d[i15].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.d[i15].setCursorWidth(1.5f);
                Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.l6, null, PorterDuff.Mode.MULTIPLY);
                this.d[i15].setBackgroundDrawable(mutate);
                this.d[i15].setImeOptions(268435461);
                this.d[i15].setTextSize(1, 20.0f);
                this.d[i15].setMaxLines(1);
                this.d[i15].setTypeface(org.telegram.messenger.g0.o());
                this.d[i15].setPadding(0, 0, 0, 0);
                this.d[i15].setGravity(49);
                if (i11 == 3) {
                    this.d[i15].setEnabled(false);
                    this.d[i15].setInputType(0);
                    this.d[i15].setVisibility(8);
                } else {
                    this.d[i15].setInputType(3);
                }
                this.c.addView(this.d[i15], c8.ma.t(34, 36, 1, 0, 0, i15 != this.P - 1 ? 7 : 0, 0));
                this.d[i15].addTextChangedListener(new bk0(this, i15));
                this.d[i15].setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.ak0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i17, KeyEvent keyEvent) {
                        dk0 dk0Var = dk0.this;
                        if (i17 != 67) {
                            dk0Var.getClass();
                            return false;
                        }
                        EditTextBoldCursor[] editTextBoldCursorArr3 = dk0Var.d;
                        int i18 = i15;
                        if (editTextBoldCursorArr3[i18].length() != 0 || i18 <= 0) {
                            return false;
                        }
                        int i19 = i18 - 1;
                        EditTextBoldCursor editTextBoldCursor2 = dk0Var.d[i19];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        dk0Var.d[i19].requestFocus();
                        dk0Var.d[i19].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                });
                this.d[i15].setOnEditorActionListener(new fa(this, 9));
                i15++;
            }
        }
        ek0 ek0Var = this.s;
        if (ek0Var != null) {
            ek0Var.setVisibility(this.N != 0 ? 0 : 8);
        }
        if (this.a == null) {
            return;
        }
        String h = org.telegram.messenger.n10.h(new StringBuilder("+"), this.a, pf.b.c());
        if (i11 == 2) {
            charSequence = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("SentSmsCode", null, 2131745372, org.telegram.messenger.gd.a(h)));
        } else if (i11 == 3) {
            charSequence = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("SentCallCode", null, 2131745375, org.telegram.messenger.gd.a(h)));
        } else if (i11 == 4) {
            charSequence = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("SentCallOnly", null, 2131745374, org.telegram.messenger.gd.a(h)));
        }
        this.e.setText(charSequence);
        if (i11 != 3) {
            org.telegram.messenger.g0.I3(this.d[0]);
            this.d[0].requestFocus();
        } else {
            org.telegram.messenger.g0.v1(this.d[0]);
        }
        r();
        q();
        this.G = System.currentTimeMillis();
        nb0 nb0Var = this.r;
        nb0 nb0Var2 = this.n;
        if (i11 == 3) {
            int i17 = this.N;
            i7 = 2;
            if (i17 == 4 || i17 == 2) {
                nb0Var.setVisibility(8);
                nb0Var2.setVisibility(0);
                int i18 = this.N;
                if (i18 == 4) {
                    nb0Var2.setText(org.telegram.messenger.gd.a0("CallText", null, 2131752590, 1, 0));
                } else if (i18 == 2) {
                    nb0Var2.setText(org.telegram.messenger.gd.a0("SmsText", null, 2131745100, 1, 0));
                }
                p();
                return;
            }
        } else {
            i7 = 2;
        }
        if (i11 == i7) {
            int i19 = this.N;
            i10 = 0;
            if (i19 == 4 || i19 == 3) {
                Object[] objArr = new Object[i7];
                objArr[0] = 2;
                objArr[1] = 0;
                nb0Var2.setText(org.telegram.messenger.gd.a0("CallText", null, 2131752590, objArr));
                nb0Var.setVisibility(this.E < 1000 ? 0 : 8);
                nb0Var2.setVisibility(this.E < 1000 ? 8 : 0);
                p();
                return;
            }
        } else {
            i10 = 0;
        }
        if (i11 != 4 || this.N != 2) {
            nb0Var2.setVisibility(8);
            nb0Var.setVisibility(8);
            o();
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[i10] = 2;
        objArr2[1] = 0;
        nb0Var2.setText(org.telegram.messenger.gd.a0("SmsText", null, 2131745100, objArr2));
        nb0Var.setVisibility(this.E < 1000 ? i10 : 8);
        nb0Var2.setVisibility(this.E < 1000 ? 8 : i10);
        p();
    }

    public final void o() {
        if (this.x != null) {
            return;
        }
        this.F = 15000;
        this.x = new Timer();
        this.H = System.currentTimeMillis();
        this.x.schedule(new h6.r(this, 4), 0L, 1000L);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.M == 3 || this.h == null) {
            return;
        }
        int bottom = this.e.getBottom();
        int measuredHeight = getMeasuredHeight() - bottom;
        nb0 nb0Var = this.r;
        if (nb0Var.getVisibility() == 0) {
            int measuredHeight2 = nb0Var.getMeasuredHeight();
            i13 = (measuredHeight + bottom) - measuredHeight2;
            nb0Var.layout(nb0Var.getLeft(), i13, nb0Var.getRight(), measuredHeight2 + i13);
        } else {
            nb0 nb0Var2 = this.n;
            if (nb0Var2.getVisibility() == 0) {
                int measuredHeight3 = nb0Var2.getMeasuredHeight();
                i13 = (measuredHeight + bottom) - measuredHeight3;
                nb0Var2.layout(nb0Var2.getLeft(), i13, nb0Var2.getRight(), measuredHeight3 + i13);
            } else {
                i13 = measuredHeight + bottom;
            }
        }
        LinearLayout linearLayout = this.c;
        int measuredHeight4 = linearLayout.getMeasuredHeight();
        int e10 = i5.c.e(i13 - bottom, measuredHeight4, 2, bottom);
        linearLayout.layout(linearLayout.getLeft(), e10, linearLayout.getRight(), measuredHeight4 + e10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ImageView imageView;
        super.onMeasure(i7, i10);
        if (this.M == 3 || (imageView = this.h) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(35.0f) + this.e.getMeasuredHeight() + this.f.getMeasuredHeight() + imageView.getMeasuredHeight();
        int L2 = org.telegram.messenger.g0.L(80.0f);
        int L3 = org.telegram.messenger.g0.L(291.0f);
        hk0 hk0Var = this.R;
        if (hk0Var.t0 - L < L2) {
            setMeasuredDimension(getMeasuredWidth(), L + L2);
        } else {
            setMeasuredDimension(getMeasuredWidth(), Math.min(hk0Var.t0, L3));
        }
    }

    public final void p() {
        if (this.w != null) {
            return;
        }
        Timer timer = new Timer();
        this.w = timer;
        timer.schedule(new ck0(this), 0L, 1000L);
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s() {
        int i7;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.a);
        this.K = true;
        hk0 hk0Var = this.R;
        hk0Var.C1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.a;
        tL_auth_resendCode.phone_code_hash = this.b;
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new z9(this, bundle, tL_auth_resendCode, 27), 2);
    }

    @Override // org.telegram.ui.Components.fu0
    public final void updateColors() {
        try {
            if (this.d == null) {
                return;
            }
            int i7 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.d;
                if (i7 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
