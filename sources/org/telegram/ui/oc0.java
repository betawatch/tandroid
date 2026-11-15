package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class oc0 extends org.telegram.ui.Components.xt0 implements org.telegram.ui.Components.l30 {
    public final TextView E;
    public String F;
    public String G;
    public boolean H;
    public Bundle I;
    public boolean J;
    public final org.telegram.ui.Components.ch0 K;
    public final org.telegram.ui.Components.ch0 L;
    public boolean M;
    public final org.telegram.ui.Components.m30 N;
    public TLRPC.FileLocation O;
    public TLRPC.FileLocation P;
    public final /* synthetic */ ce0 Q;
    public final org.telegram.ui.Components.mb0 a;
    public final org.telegram.ui.Components.mb0 b;
    public final EditTextBoldCursor c;
    public final EditTextBoldCursor d;
    public final fi.v3 e;
    public final org.telegram.ui.Components.t8 f;
    public final hi.n5 h;
    public final xc n;
    public final yc r;
    public AnimatorSet s;
    public final TextView w;
    public final TextView x;
    public final TextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc0(ce0 ce0Var, Context context) {
        super(context);
        this.Q = ce0Var;
        final int i7 = 0;
        this.J = false;
        final int i10 = 1;
        this.M = true;
        setOrientation(1);
        org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(0, false, false);
        this.N = m30Var;
        m30Var.I = true;
        m30Var.K = false;
        m30Var.H = false;
        m30Var.L = false;
        m30Var.a = ce0Var;
        m30Var.b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ja.r(78, 78, 1));
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f = t8Var;
        fi.v3 v3Var = new fi.v3(10, context, this);
        this.e = v3Var;
        v3Var.setRoundRadius(org.telegram.messenger.g0.L(64.0f));
        t8Var.g(13);
        t8Var.k(5L, null, null, null);
        v3Var.setImageDrawable(t8Var);
        frameLayout.addView(v3Var, c8.ja.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        hi.n5 n5Var = new hi.n5(this, context, paint, 14);
        this.h = n5Var;
        frameLayout.addView(n5Var, c8.ja.c(-1.0f, -1));
        n5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
            public final /* synthetic */ oc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        oc0 oc0Var = this.b;
                        xc xcVar = oc0Var.n;
                        org.telegram.ui.Components.ch0 ch0Var = oc0Var.K;
                        oc0Var.N.n(oc0Var.O != null, new bb0(oc0Var, 1), new q5(oc0Var, 8), 0);
                        oc0Var.M = false;
                        xcVar.setAnimation(ch0Var);
                        ch0Var.M(0);
                        ch0Var.P(43);
                        xcVar.d();
                        break;
                    default:
                        oc0 oc0Var2 = this.b;
                        if (oc0Var2.Q.W.getTag() == null) {
                            oc0Var2.c(false);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.camera, org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f), false, null);
        this.K = ch0Var;
        this.L = new org.telegram.ui.Components.ch0(R.raw.camera_wait, org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f), false, null);
        xc xcVar = new xc(4, context, this);
        this.n = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        xcVar.setAnimation(ch0Var);
        xcVar.setEnabled(false);
        xcVar.setClickable(false);
        frameLayout.addView(xcVar, c8.ja.c(-1.0f, -1));
        xcVar.addOnAttachStateChangeListener(new nc0(this));
        yc ycVar = new yc(this, context, 2);
        this.r = ycVar;
        ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
        ycVar.setProgressColor(-1);
        frameLayout.addView(ycVar, c8.ja.c(-1.0f, -1));
        o(false);
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131746338, null));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, c8.ja.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setText(org.telegram.messenger.hd.M0(2131746339, "RegisterText2"));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ja.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, c8.ja.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(context, null);
        this.a = mb0Var;
        mb0Var.setText(org.telegram.messenger.hd.M0(2131750694, null));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(TLObject.FLAG_13);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.jc0
            public final /* synthetic */ oc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                switch (i7) {
                    case 0:
                        org.telegram.ui.Components.mb0 mb0Var2 = this.b.a;
                        float f10 = z10 ? 1.0f : 0.0f;
                        mb0Var2.b(f10, f10, true);
                        break;
                    default:
                        org.telegram.ui.Components.mb0 mb0Var3 = this.b.b;
                        float f11 = z10 ? 1.0f : 0.0f;
                        mb0Var3.b(f11, f11, true);
                        break;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        mb0Var.e(editTextBoldCursor);
        mb0Var.addView(editTextBoldCursor, c8.ja.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kc0
            public final /* synthetic */ oc0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (i7) {
                    case 0:
                        oc0 oc0Var = this.b;
                        if (i11 == 5) {
                            oc0Var.d.requestFocus();
                            return true;
                        }
                        oc0Var.getClass();
                        return false;
                    default:
                        oc0 oc0Var2 = this.b;
                        oc0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        oc0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.mb0 mb0Var2 = new org.telegram.ui.Components.mb0(context, null);
        this.b = mb0Var2;
        mb0Var2.setText(org.telegram.messenger.hd.M0(2131749032, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(TLObject.FLAG_13);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.jc0
            public final /* synthetic */ oc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                switch (i10) {
                    case 0:
                        org.telegram.ui.Components.mb0 mb0Var22 = this.b.a;
                        float f10 = z10 ? 1.0f : 0.0f;
                        mb0Var22.b(f10, f10, true);
                        break;
                    default:
                        org.telegram.ui.Components.mb0 mb0Var3 = this.b.b;
                        float f11 = z10 ? 1.0f : 0.0f;
                        mb0Var3.b(f11, f11, true);
                        break;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        mb0Var2.e(editTextBoldCursor2);
        mb0Var2.addView(editTextBoldCursor2, c8.ja.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kc0
            public final /* synthetic */ oc0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        oc0 oc0Var = this.b;
                        if (i11 == 5) {
                            oc0Var.d.requestFocus();
                            return true;
                        }
                        oc0Var.getClass();
                        return false;
                    default:
                        oc0 oc0Var2 = this.b;
                        oc0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        oc0Var2.h(null);
                        return true;
                }
            }
        });
        boolean O1 = org.telegram.messenger.g0.O1();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (O1) {
            LinearLayout linearLayout = new LinearLayout(ce0Var.getParentActivity());
            linearLayout.setOrientation(0);
            mb0Var.setText(org.telegram.messenger.hd.M0(2131750693, null));
            mb0Var2.setText(org.telegram.messenger.hd.M0(2131749031, null));
            linearLayout.addView(mb0Var, c8.ja.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(mb0Var2, c8.ja.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor2);
            }
        } else {
            mb0Var.setText(org.telegram.messenger.hd.M0(2131750694, null));
            mb0Var2.setText(org.telegram.messenger.hd.M0(2131749032, null));
            frameLayout2.addView(mb0Var, c8.ja.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(mb0Var2, c8.ja.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.x = textView3;
        textView3.setText(org.telegram.messenger.hd.M0(2131752572, "CancelRegistration"));
        textView3.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView3.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, 0);
        int i11 = 8;
        textView3.setVisibility(8);
        addView(textView3, c8.ja.t(-2, -2, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
            public final /* synthetic */ oc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        oc0 oc0Var = this.b;
                        xc xcVar2 = oc0Var.n;
                        org.telegram.ui.Components.ch0 ch0Var2 = oc0Var.K;
                        oc0Var.N.n(oc0Var.O != null, new bb0(oc0Var, 1), new q5(oc0Var, 8), 0);
                        oc0Var.M = false;
                        xcVar2.setAnimation(ch0Var2);
                        ch0Var2.M(0);
                        ch0Var2.P(43);
                        xcVar2.d();
                        break;
                    default:
                        oc0 oc0Var2 = this.b;
                        if (oc0Var2.Q.W.getTag() == null) {
                            oc0Var2.c(false);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, c8.ja.r(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setMovementMethod(new org.telegram.messenger.c0(false));
        textView4.setTextSize(1, org.telegram.messenger.g0.O1() ? 13.0f : 14.0f);
        textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, c8.ja.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        h6.m.g(textView4);
        String M0 = org.telegram.messenger.hd.M0(2131744197, "TermsOfServiceLogin");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int lastIndexOf = M0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new hi.ha(this, i11), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override // org.telegram.ui.Components.l30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new lc0(this, photoSize2, photoSize, 0));
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean c(boolean z10) {
        int i7 = 0;
        ce0 ce0Var = this.Q;
        if (z10) {
            ce0Var.C1(true, true);
            this.J = false;
            this.I = null;
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131742948, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131754080, "AreYouSureRegistration");
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131744841, "Stop"), new hc0(this, i7));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, "Continue"), null);
        ce0Var.showDialog(t1Var);
        return false;
    }

    @Override // org.telegram.ui.Components.xt0
    public final void d() {
        this.J = false;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.l30
    public /* bridge */ /* synthetic */ uq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.xt0
    public String getHeaderName() {
        return org.telegram.messenger.hd.M0(2131742810, "YourName");
    }

    @Override // org.telegram.ui.Components.l30
    public /* bridge */ /* synthetic */ String getInitialSearchString() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.xt0
    public final void h(String str) {
        TLRPC.TL_auth_signUp tL_auth_signUp;
        int i7;
        if (this.J) {
            return;
        }
        ce0 ce0Var = this.Q;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = ce0Var.s0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            p(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor.length() == 0) {
            ce0.c1(ce0Var, this.a, true);
            return;
        }
        this.J = true;
        boolean z10 = this.H;
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        if (z10) {
            TLRPC.TL_auth_firebasePnvSignUp tL_auth_firebasePnvSignUp = new TLRPC.TL_auth_firebasePnvSignUp();
            tL_auth_firebasePnvSignUp.first_name = editTextBoldCursor.getText().toString();
            tL_auth_firebasePnvSignUp.last_name = editTextBoldCursor2.getText().toString();
            tL_auth_signUp = tL_auth_firebasePnvSignUp;
        } else {
            TLRPC.TL_auth_signUp tL_auth_signUp2 = new TLRPC.TL_auth_signUp();
            tL_auth_signUp2.phone_code_hash = this.G;
            tL_auth_signUp2.phone_number = this.F;
            tL_auth_signUp2.first_name = editTextBoldCursor.getText().toString();
            tL_auth_signUp2.last_name = editTextBoldCursor2.getText().toString();
            tL_auth_signUp = tL_auth_signUp2;
        }
        ce0Var.F1(0, true);
        i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_auth_signUp, new d3.b(1), new a5(this, 15), 10);
    }

    @Override // org.telegram.ui.Components.xt0
    public final void j() {
        TextView textView = this.y;
        if (textView != null) {
            if (this.Q.f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(org.telegram.messenger.g0.F).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            org.telegram.messenger.g0.J3(editTextBoldCursor);
        }
        org.telegram.messenger.g0.i3(new bb0(this, 3), ce0.A0);
    }

    @Override // org.telegram.ui.Components.xt0
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.Q.s0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void l(Bundle bundle) {
        String obj = this.c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        ce0 ce0Var = this.Q;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = ce0Var.s0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            ce0Var.s0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.c.setText("");
        this.d.setText("");
        this.F = bundle.getString("phoneFormated");
        this.G = bundle.getString("phoneHash");
        this.H = bundle.getBoolean("fromFirebasePhoneNumberVerification");
        this.I = bundle;
    }

    public final void n() {
        this.y.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(org.telegram.messenger.g0.G).start();
    }

    public final void o(boolean z10) {
        xc xcVar = this.n;
        if (xcVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
        yc ycVar = this.r;
        if (!z10) {
            xcVar.setAlpha(1.0f);
            xcVar.setVisibility(0);
            ycVar.setAlpha(0.0f);
            ycVar.setVisibility(4);
            return;
        }
        this.s = new AnimatorSet();
        xcVar.setVisibility(0);
        AnimatorSet animatorSet2 = this.s;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, (Property<xc, Float>) property, 1.0f), ObjectAnimator.ofFloat(ycVar, (Property<yc, Float>) property, 0.0f));
        this.s.setDuration(180L);
        this.s.addListener(new xx(this, 5));
        this.s.start();
    }

    public final void p(boolean z10) {
        ce0 ce0Var = this.Q;
        if (ce0Var.s0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131744198, "TermsOfService");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        if (z10) {
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754717, "Accept"), new hc0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751604, "Decline"), new hc0(this, 2));
        } else {
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, "OK"), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ce0Var.s0.text);
        org.telegram.messenger.gj.b(spannableStringBuilder, ce0Var.s0.entities, false, false, false, false, 0);
        t1Var.U = spannableStringBuilder;
        ce0Var.showDialog(t1Var);
    }

    @Override // org.telegram.ui.Components.xt0, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        this.f.invalidateSelf();
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        this.E.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.j6.D6;
        this.w.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.c;
        editTextBoldCursor.setTextColor(x02);
        int i11 = org.telegram.ui.ActionBar.j6.l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.x0(null, i11, false));
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(x03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.j6.x0(null, i11, false));
        this.x.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.q6, false));
        int x04 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        TextView textView = this.y;
        textView.setTextColor(x04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J6, false));
        this.a.f();
        this.b.f();
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ void I(float f10) {
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ void O(boolean z10, boolean z11) {
    }
}
