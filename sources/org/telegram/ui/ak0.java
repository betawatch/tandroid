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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ak0 extends org.telegram.ui.Components.xt0 implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.c6 {
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
    public final /* synthetic */ ek0 Q;
    public String a;
    public String b;
    public final LinearLayout c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final pb0 n;
    public final pb0 r;
    public final bk0 s;
    public Timer w;
    public Timer x;
    public final Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(ek0 ek0Var, Context context, int i7) {
        super(context);
        float f10;
        this.Q = ek0Var;
        this.y = new Object();
        this.D = 60000;
        this.E = 15000;
        this.K = "";
        this.N = "*";
        this.L = i7;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i10 = org.telegram.ui.ActionBar.m6.D6;
        org.telegram.ui.ActionBar.t6.U(textView, i10, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.messenger.k5.n(textView2, i11, null, 1, 18.0f);
        int i12 = 3;
        textView2.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i7 == 3) {
            textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, c8.ha.r(-2, -2, org.telegram.messenger.id.a0 ? 5 : 3));
            ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.phone_activate);
            boolean z9 = org.telegram.messenger.id.a0;
            if (z9) {
                f10 = 2.0f;
                frameLayout.addView(e10, c8.ha.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, org.telegram.messenger.id.a0 ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f10 = 2.0f;
                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, z9 ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(e10, c8.ha.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f10 = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, c8.ha.r(-2, -2, 49));
            if (i7 == 1) {
                ImageView e11 = org.telegram.messenger.camera.q.e(context, R.drawable.sms_devices);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.t6.s(e11, i11, null, mode);
                frameLayout2.addView(e11, c8.ha.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(R.drawable.sms_bubble);
                org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.P9, null, mode);
                frameLayout2.addView(imageView, c8.ha.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.id.M0(2131745572, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(R.drawable.sms_code);
                org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.P9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.id.M0(2131745566, null));
            }
            addView(textView2, c8.ha.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, c8.ha.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.r(-2, 36, 1));
        if (i7 == 3) {
            linearLayout.setVisibility(8);
        }
        pb0 pb0Var = new pb0(context, 2);
        this.n = pb0Var;
        org.telegram.ui.ActionBar.t6.U(pb0Var, i10, null);
        pb0Var.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        if (i7 == 3) {
            pb0Var.setTextSize(1, 14.0f);
            addView(pb0Var, c8.ha.r(-2, -2, org.telegram.messenger.id.a0 ? 5 : 3));
            bk0 bk0Var = new bk0(context);
            Paint paint = new Paint();
            bk0Var.a = paint;
            Paint paint2 = new Paint();
            bk0Var.b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ui, false));
            paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vi, false));
            this.s = bk0Var;
            pb0Var.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
            addView(bk0Var, c8.ha.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            pb0Var.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
            pb0Var.setTextSize(1, 15.0f);
            pb0Var.setGravity(49);
            addView(pb0Var, c8.ha.r(-2, -2, 49));
        }
        pb0 pb0Var2 = new pb0(context, i12);
        this.r = pb0Var2;
        org.telegram.ui.ActionBar.t6.U(pb0Var2, org.telegram.ui.ActionBar.m6.q6, null);
        pb0Var2.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        pb0Var2.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
        pb0Var2.setTextSize(1, 15.0f);
        pb0Var2.setGravity(49);
        if (i7 == 1) {
            pb0Var2.setText(org.telegram.messenger.id.M0(2131751443, null));
        } else {
            pb0Var2.setText(org.telegram.messenger.id.M0(2131751449, null));
        }
        addView(pb0Var2, c8.ha.r(-2, -2, 49));
        pb0Var2.setOnClickListener(new j40(this, 17));
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

    @Override // org.telegram.ui.Components.xt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean c(boolean z9) {
        int i7;
        int i10 = 1;
        ek0 ek0Var = this.Q;
        if (!z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ek0Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131744823, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), null);
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131744841, null), new wj0(this, i10));
            ek0Var.showDialog(u1Var);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.a;
        tL_auth_cancelCode.phone_code_hash = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new di.v5(25), 2);
        r();
        q();
        int i11 = this.L;
        if (i11 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.g4);
        } else if (i11 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.h4);
        }
        this.I = false;
        return true;
    }

    @Override // org.telegram.ui.Components.xt0
    public final void d() {
        this.J = false;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (!this.I || (editTextBoldCursorArr = this.d) == null) {
            return;
        }
        if (i7 == org.telegram.messenger.qs.g4) {
            editTextBoldCursorArr[0].setText("" + objArr[0]);
            h(null);
            return;
        }
        if (i7 == org.telegram.messenger.qs.h4) {
            String str = "" + objArr[0];
            if (org.telegram.messenger.g0.x(this.N, str)) {
                this.H = true;
                this.d[0].setText(str);
                this.H = false;
                h(null);
            }
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void f() {
        int i7 = this.L;
        if (i7 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.g4);
        } else if (i7 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.h4);
        }
        this.I = false;
        r();
        q();
    }

    @Override // org.telegram.ui.Components.xt0
    public final void h(String str) {
        int i7;
        if (this.J) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            org.telegram.messenger.g0.F3(this.c);
            return;
        }
        this.J = true;
        int i10 = this.L;
        if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.g4);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.h4);
        }
        this.I = false;
        ek0 ek0Var = this.Q;
        ek0Var.R1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.b;
        r();
        ek0Var.C1();
        i7 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(verifyphone, new k50(14, this, verifyphone), 2);
    }

    @Override // org.telegram.ui.Components.xt0
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
                org.telegram.messenger.g0.K3(this.d[length]);
                return;
            }
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void m(Bundle bundle, boolean z9) {
        int i7;
        int i10;
        if (bundle == null) {
            return;
        }
        this.I = true;
        int i11 = this.L;
        if (i11 == 2) {
            org.telegram.messenger.g0.E3(true);
            org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.g4);
        } else if (i11 == 3) {
            org.telegram.messenger.g0.D3(true);
            org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.h4);
        }
        this.a = bundle.getString("phone");
        this.b = bundle.getString("phoneHash");
        int i12 = bundle.getInt("timeout");
        this.D = i12;
        this.P = i12;
        this.M = bundle.getInt("nextType");
        this.N = bundle.getString("pattern");
        int i13 = bundle.getInt("length");
        this.O = i13;
        if (i13 == 0) {
            this.O = 5;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.d;
        CharSequence charSequence = "";
        if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.O) {
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
            this.d = new EditTextBoldCursor[this.O];
            final int i15 = 0;
            while (i15 < this.O) {
                this.d[i15] = new EditTextBoldCursor(getContext());
                EditTextBoldCursor editTextBoldCursor = this.d[i15];
                int i16 = org.telegram.ui.ActionBar.m6.G6;
                org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i16, null);
                org.telegram.ui.ActionBar.t6.v(this.d[i15], i16, null);
                this.d[i15].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.d[i15].setCursorWidth(1.5f);
                Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.l6, null, PorterDuff.Mode.MULTIPLY);
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
                this.c.addView(this.d[i15], c8.ha.t(34, 36, 1, 0, 0, i15 != this.O - 1 ? 7 : 0, 0));
                this.d[i15].addTextChangedListener(new yj0(this, i15));
                this.d[i15].setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.xj0
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i17, KeyEvent keyEvent) {
                        ak0 ak0Var = ak0.this;
                        if (i17 != 67) {
                            ak0Var.getClass();
                            return false;
                        }
                        EditTextBoldCursor[] editTextBoldCursorArr3 = ak0Var.d;
                        int i18 = i15;
                        if (editTextBoldCursorArr3[i18].length() != 0 || i18 <= 0) {
                            return false;
                        }
                        int i19 = i18 - 1;
                        EditTextBoldCursor editTextBoldCursor2 = ak0Var.d[i19];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        ak0Var.d[i19].requestFocus();
                        ak0Var.d[i19].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                });
                this.d[i15].setOnEditorActionListener(new fa(this, 9));
                i15++;
            }
        }
        bk0 bk0Var = this.s;
        if (bk0Var != null) {
            bk0Var.setVisibility(this.M != 0 ? 0 : 8);
        }
        if (this.a == null) {
            return;
        }
        String i17 = org.telegram.messenger.k5.i(new StringBuilder("+"), this.a, pf.b.c());
        if (i11 == 2) {
            charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentSmsCode", null, 2131745567, org.telegram.messenger.id.a(i17)));
        } else if (i11 == 3) {
            charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentCallCode", null, 2131745570, org.telegram.messenger.id.a(i17)));
        } else if (i11 == 4) {
            charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentCallOnly", null, 2131745569, org.telegram.messenger.id.a(i17)));
        }
        this.e.setText(charSequence);
        if (i11 != 3) {
            org.telegram.messenger.g0.K3(this.d[0]);
            this.d[0].requestFocus();
        } else {
            org.telegram.messenger.g0.v1(this.d[0]);
        }
        r();
        q();
        this.F = System.currentTimeMillis();
        pb0 pb0Var = this.r;
        pb0 pb0Var2 = this.n;
        if (i11 == 3) {
            int i18 = this.M;
            i7 = 2;
            if (i18 == 4 || i18 == 2) {
                pb0Var.setVisibility(8);
                pb0Var2.setVisibility(0);
                int i19 = this.M;
                if (i19 == 4) {
                    pb0Var2.setText(org.telegram.messenger.id.a0("CallText", null, 2131752601, 1, 0));
                } else if (i19 == 2) {
                    pb0Var2.setText(org.telegram.messenger.id.a0("SmsText", null, 2131745295, 1, 0));
                }
                p();
                return;
            }
        } else {
            i7 = 2;
        }
        if (i11 == i7) {
            int i20 = this.M;
            i10 = 0;
            if (i20 == 4 || i20 == 3) {
                Object[] objArr = new Object[i7];
                objArr[0] = 2;
                objArr[1] = 0;
                pb0Var2.setText(org.telegram.messenger.id.a0("CallText", null, 2131752601, objArr));
                pb0Var.setVisibility(this.D < 1000 ? 0 : 8);
                pb0Var2.setVisibility(this.D < 1000 ? 8 : 0);
                p();
                return;
            }
        } else {
            i10 = 0;
        }
        if (i11 != 4 || this.M != 2) {
            pb0Var2.setVisibility(8);
            pb0Var.setVisibility(8);
            o();
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[i10] = 2;
        objArr2[1] = 0;
        pb0Var2.setText(org.telegram.messenger.id.a0("SmsText", null, 2131745295, objArr2));
        pb0Var.setVisibility(this.D < 1000 ? i10 : 8);
        pb0Var2.setVisibility(this.D < 1000 ? 8 : i10);
        p();
    }

    public final void o() {
        if (this.x != null) {
            return;
        }
        this.E = 15000;
        this.x = new Timer();
        this.G = System.currentTimeMillis();
        this.x.schedule(new fi.h2(this, 4), 0L, 1000L);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.L == 3 || this.h == null) {
            return;
        }
        int bottom = this.e.getBottom();
        int measuredHeight = getMeasuredHeight() - bottom;
        pb0 pb0Var = this.r;
        if (pb0Var.getVisibility() == 0) {
            int measuredHeight2 = pb0Var.getMeasuredHeight();
            i13 = (measuredHeight + bottom) - measuredHeight2;
            pb0Var.layout(pb0Var.getLeft(), i13, pb0Var.getRight(), measuredHeight2 + i13);
        } else {
            pb0 pb0Var2 = this.n;
            if (pb0Var2.getVisibility() == 0) {
                int measuredHeight3 = pb0Var2.getMeasuredHeight();
                i13 = (measuredHeight + bottom) - measuredHeight3;
                pb0Var2.layout(pb0Var2.getLeft(), i13, pb0Var2.getRight(), measuredHeight3 + i13);
            } else {
                i13 = measuredHeight + bottom;
            }
        }
        LinearLayout linearLayout = this.c;
        int measuredHeight4 = linearLayout.getMeasuredHeight();
        int D = jg.g.D(i13 - bottom, measuredHeight4, 2, bottom);
        linearLayout.layout(linearLayout.getLeft(), D, linearLayout.getRight(), measuredHeight4 + D);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ImageView imageView;
        super.onMeasure(i7, i10);
        if (this.L == 3 || (imageView = this.h) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(35.0f) + this.e.getMeasuredHeight() + this.f.getMeasuredHeight() + imageView.getMeasuredHeight();
        int L2 = org.telegram.messenger.g0.L(80.0f);
        int L3 = org.telegram.messenger.g0.L(291.0f);
        ek0 ek0Var = this.Q;
        if (ek0Var.s0 - L < L2) {
            setMeasuredDimension(getMeasuredWidth(), L + L2);
        } else {
            setMeasuredDimension(getMeasuredWidth(), Math.min(ek0Var.s0, L3));
        }
    }

    public final void p() {
        if (this.w != null) {
            return;
        }
        Timer timer = new Timer();
        this.w = timer;
        timer.schedule(new zj0(this), 0L, 1000L);
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
        this.J = true;
        ek0 ek0Var = this.Q;
        ek0Var.C1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.a;
        tL_auth_resendCode.phone_code_hash = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new z9(this, bundle, tL_auth_resendCode, 27), 2);
    }

    @Override // org.telegram.ui.Components.xt0
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
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
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
