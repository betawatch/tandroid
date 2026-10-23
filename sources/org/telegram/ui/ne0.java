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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ne0 extends org.telegram.ui.Components.qw0 implements org.telegram.ui.Components.d50 {
    public String E;
    public String F;
    public Bundle G;
    public boolean H;
    public final org.telegram.ui.Components.vj0 I;
    public final org.telegram.ui.Components.vj0 J;
    public boolean K;
    public final org.telegram.ui.Components.e50 L;
    public TLRPC.FileLocation M;
    public TLRPC.FileLocation N;
    public final /* synthetic */ dg0 O;
    public final org.telegram.ui.Components.sd0 a;
    public final org.telegram.ui.Components.sd0 b;
    public final EditTextBoldCursor c;
    public final EditTextBoldCursor d;
    public final ci.k4 e;
    public final org.telegram.ui.Components.h9 f;
    public final ei.g6 h;
    public final jd n;
    public final kd r;
    public AnimatorSet s;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne0(dg0 dg0Var, Context context) {
        super(context);
        this.O = dg0Var;
        this.H = false;
        this.K = true;
        setOrientation(1);
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, false, false);
        this.L = e50Var;
        e50Var.H = true;
        e50Var.J = false;
        e50Var.G = false;
        e50Var.K = false;
        e50Var.a = dg0Var;
        e50Var.b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.z5.q(78, 78, 1));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f = h9Var;
        ci.k4 k4Var = new ci.k4(this, context, 10);
        this.e = k4Var;
        k4Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        h9Var.g(13);
        h9Var.n(5L, null, null);
        k4Var.setImageDrawable(h9Var);
        frameLayout.addView(k4Var, w7.z5.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ei.g6 g6Var = new ei.g6(this, context, paint, 12);
        this.h = g6Var;
        frameLayout.addView(g6Var, w7.z5.c(-1.0f, -1));
        final int i10 = 0;
        g6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ie0
            public final /* synthetic */ ne0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ne0 ne0Var = this.b;
                        jd jdVar = ne0Var.n;
                        org.telegram.ui.Components.vj0 vj0Var = ne0Var.I;
                        ne0Var.L.n(ne0Var.M != null, new zc0(ne0Var, 1), new w5(ne0Var, 8), 0);
                        ne0Var.K = false;
                        jdVar.setAnimation(vj0Var);
                        vj0Var.M(0);
                        vj0Var.P(43);
                        jdVar.d();
                        break;
                    default:
                        ne0 ne0Var2 = this.b;
                        if (ne0Var2.O.V.getTag() == null) {
                            ne0Var2.c(false);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(R.raw.camera, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.I = vj0Var;
        this.J = new org.telegram.ui.Components.vj0(R.raw.camera_wait, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        jd jdVar = new jd(this, context, 3);
        this.n = jdVar;
        jdVar.setScaleType(ImageView.ScaleType.CENTER);
        jdVar.setAnimation(vj0Var);
        jdVar.setEnabled(false);
        jdVar.setClickable(false);
        frameLayout.addView(jdVar, w7.z5.c(-1.0f, -1));
        jdVar.addOnAttachStateChangeListener(new me0(this));
        kd kdVar = new kd(this, context, 2);
        this.r = kdVar;
        kdVar.setSize(AndroidUtilities.dp(30.0f));
        kdVar.setProgressColor(-1);
        frameLayout.addView(kdVar, w7.z5.c(-1.0f, -1));
        p(false);
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, w7.z5.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.z5.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, w7.z5.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context, null);
        this.a = sd0Var;
        sd0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        final int i11 = 0;
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.je0
            public final /* synthetic */ ne0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Components.sd0 sd0Var2 = this.b.a;
                        float f7 = z10 ? 1.0f : 0.0f;
                        sd0Var2.b(f7, f7, true);
                        break;
                    default:
                        org.telegram.ui.Components.sd0 sd0Var3 = this.b.b;
                        float f10 = z10 ? 1.0f : 0.0f;
                        sd0Var3.b(f10, f10, true);
                        break;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        sd0Var.e(editTextBoldCursor);
        sd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        final int i12 = 0;
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ke0
            public final /* synthetic */ ne0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        ne0 ne0Var = this.b;
                        if (i13 == 5) {
                            ne0Var.d.requestFocus();
                            return true;
                        }
                        ne0Var.getClass();
                        return false;
                    default:
                        ne0 ne0Var2 = this.b;
                        ne0Var2.getClass();
                        if (i13 != 6 && i13 != 5) {
                            return false;
                        }
                        ne0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.sd0 sd0Var2 = new org.telegram.ui.Components.sd0(context, null);
        this.b = sd0Var2;
        sd0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        final int i13 = 1;
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: org.telegram.ui.je0
            public final /* synthetic */ ne0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                switch (i13) {
                    case 0:
                        org.telegram.ui.Components.sd0 sd0Var22 = this.b.a;
                        float f7 = z10 ? 1.0f : 0.0f;
                        sd0Var22.b(f7, f7, true);
                        break;
                    default:
                        org.telegram.ui.Components.sd0 sd0Var3 = this.b.b;
                        float f10 = z10 ? 1.0f : 0.0f;
                        sd0Var3.b(f10, f10, true);
                        break;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        sd0Var2.e(editTextBoldCursor2);
        sd0Var2.addView(editTextBoldCursor2, w7.z5.e(-1, -2, 48));
        final int i14 = 1;
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ke0
            public final /* synthetic */ ne0 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i132, KeyEvent keyEvent) {
                switch (i14) {
                    case 0:
                        ne0 ne0Var = this.b;
                        if (i132 == 5) {
                            ne0Var.d.requestFocus();
                            return true;
                        }
                        ne0Var.getClass();
                        return false;
                    default:
                        ne0 ne0Var2 = this.b;
                        ne0Var2.getClass();
                        if (i132 != 6 && i132 != 5) {
                            return false;
                        }
                        ne0Var2.h(null);
                        return true;
                }
            }
        });
        boolean isSmallScreen = AndroidUtilities.isSmallScreen();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (isSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(dg0Var.getParentActivity());
            linearLayout.setOrientation(0);
            sd0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            sd0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(sd0Var, w7.z5.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(sd0Var2, w7.z5.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            sd0Var.setText(LocaleController.getString(R.string.FirstName));
            sd0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(sd0Var, w7.z5.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(sd0Var2, w7.z5.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.w = textView3;
        textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, w7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        final int i15 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ie0
            public final /* synthetic */ ne0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        ne0 ne0Var = this.b;
                        jd jdVar2 = ne0Var.n;
                        org.telegram.ui.Components.vj0 vj0Var2 = ne0Var.I;
                        ne0Var.L.n(ne0Var.M != null, new zc0(ne0Var, 1), new w5(ne0Var, 8), 0);
                        ne0Var.K = false;
                        jdVar2.setAnimation(vj0Var2);
                        vj0Var2.M(0);
                        vj0Var2.P(43);
                        jdVar2.d();
                        break;
                    default:
                        ne0 ne0Var2 = this.b;
                        if (ne0Var2.O.V.getTag() == null) {
                            ne0Var2.c(false);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, w7.z5.q(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView4.setTextSize(1, AndroidUtilities.isSmallScreen() ? 13.0f : 14.0f);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, w7.z5.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        m.g3.p(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new ei.kb(this, 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new jq(this, photoSize2, photoSize, 29));
    }

    @Override // org.telegram.ui.Components.qw0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.qw0
    public final boolean c(boolean z10) {
        dg0 dg0Var = this.O;
        if (z10) {
            dg0Var.k1(true, true);
            this.H = false;
            this.G = null;
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg0Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.a.T = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
        alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new he0(this, 0));
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        dg0Var.showDialog(alertDialog$Builder.a);
        return false;
    }

    @Override // org.telegram.ui.Components.qw0
    public final void d() {
        this.H = false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d50
    public /* bridge */ /* synthetic */ ju0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.qw0
    public String getHeaderName() {
        return LocaleController.getString("YourName", R.string.YourName);
    }

    @Override // org.telegram.ui.Components.d50
    public /* bridge */ /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.qw0
    public final void h(String str) {
        int i10;
        if (this.H) {
            return;
        }
        dg0 dg0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = dg0Var.p0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            q(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor.length() == 0) {
            dg0.U0(dg0Var, this.a, true);
            return;
        }
        this.H = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.F;
        tL_auth_signUp.phone_number = this.E;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        dg0Var.n1(0, true);
        i10 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new m(this, 11), 10);
    }

    @Override // org.telegram.ui.Components.qw0
    public final void j() {
        TextView textView = this.x;
        if (textView != null) {
            if (this.O.f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new zc0(this, 3), dg0.t0);
    }

    @Override // org.telegram.ui.Components.qw0
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.G = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.O.p0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e) {
            FileLog.e(e);
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

    @Override // org.telegram.ui.Components.qw0
    public final void l(Bundle bundle) {
        String obj = this.c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        dg0 dg0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = dg0Var.p0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            dg0Var.p0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.G;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.qw0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.c.setText("");
        this.d.setText("");
        this.E = bundle.getString("phoneFormated");
        this.F = bundle.getString("phoneHash");
        this.G = bundle;
    }

    @Override // org.telegram.ui.Components.qw0
    public final void n() {
        this.f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.y.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.h6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.c;
        editTextBoldCursor.setTextColor(x02);
        int i12 = org.telegram.ui.ActionBar.h6.l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(x03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        int x04 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        TextView textView = this.x;
        textView.setTextColor(x04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
        this.a.f();
        this.b.f();
    }

    public final void o() {
        this.x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void p(boolean z10) {
        jd jdVar = this.n;
        if (jdVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
        kd kdVar = this.r;
        if (!z10) {
            jdVar.setAlpha(1.0f);
            jdVar.setVisibility(0);
            kdVar.setAlpha(0.0f);
            kdVar.setVisibility(4);
            return;
        }
        this.s = new AnimatorSet();
        jdVar.setVisibility(0);
        AnimatorSet animatorSet2 = this.s;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(jdVar, (Property<jd, Float>) property, 1.0f), ObjectAnimator.ofFloat(kdVar, (Property<kd, Float>) property, 0.0f));
        this.s.setDuration(180L);
        this.s.addListener(new zb0(this, 1));
        this.s.start();
    }

    public final void q(boolean z10) {
        dg0 dg0Var = this.O;
        if (dg0Var.p0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg0Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z10) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new he0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new he0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dg0Var.p0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, dg0Var.p0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.T = spannableStringBuilder;
        dg0Var.showDialog(b2Var);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void E(float f7) {
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void K(boolean z10, boolean z11) {
    }
}
