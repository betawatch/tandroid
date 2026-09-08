package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class me0 extends org.telegram.ui.Components.tv0 {
    public final /* synthetic */ wg0 E;
    public final org.telegram.ui.Components.zc0[] a;
    public final EditTextBoldCursor[] b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public String h;
    public String n;
    public String r;
    public TL_account.Password s;
    public Bundle v;
    public boolean w;
    public final int x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me0(wg0 wg0Var, Context context, int i10) {
        super(context);
        this.E = wg0Var;
        this.x = i10;
        setOrientation(1);
        int i11 = i10 == 1 ? 1 : 2;
        this.b = new EditTextBoldCursor[i11];
        this.a = new org.telegram.ui.Components.zc0[i11];
        TextView textView = new TextView(context);
        this.c = textView;
        float f7 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(LocaleController.getString(R.string.SetNewPassword));
        addView(textView, w7.x5.t(-2, -2, 1, 8, AndroidUtilities.isSmallScreen() ? 16 : 72, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.x5.t(-2, -2, 1, 8, 6, 8, 16));
        final int i12 = 0;
        while (i12 < this.b.length) {
            org.telegram.ui.Components.zc0 zc0Var = new org.telegram.ui.Components.zc0(context, null);
            this.a[i12] = zc0Var;
            zc0Var.setText(LocaleController.getString(i10 == 0 ? i12 == 0 ? R.string.PleaseEnterNewFirstPasswordHint : R.string.PleaseEnterNewSecondPasswordHint : R.string.PasswordHintPlaceholder));
            this.b[i12] = new EditTextBoldCursor(context);
            this.b[i12].setCursorSize(AndroidUtilities.dp(20.0f));
            this.b[i12].setCursorWidth(1.5f);
            this.b[i12].setImeOptions(268435461);
            this.b[i12].setTextSize(1, f7);
            this.b[i12].setMaxLines(1);
            this.b[i12].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.b[i12].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.b[i12].setInputType(129);
                this.b[i12].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.b[i12].setTypeface(Typeface.DEFAULT);
            this.b[i12].setGravity(LocaleController.isRTL ? 5 : 3);
            EditTextBoldCursor editTextBoldCursor = this.b[i12];
            boolean z10 = i12 == 0 && i10 == 0;
            editTextBoldCursor.addTextChangedListener(new le0(this, z10));
            this.b[i12].setOnFocusChangeListener(new pd(zc0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.b[i12], w7.x5.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ie0
                    public final /* synthetic */ me0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                me0 me0Var = this.b;
                                ImageView imageView2 = me0Var.f;
                                EditTextBoldCursor[] editTextBoldCursorArr = me0Var.b;
                                me0Var.y = !me0Var.y;
                                for (int i14 = 0; i14 < editTextBoldCursorArr.length; i14++) {
                                    int selectionStart = editTextBoldCursorArr[i14].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i14].getSelectionEnd();
                                    editTextBoldCursorArr[i14].setInputType((me0Var.y ? 144 : 128) | 1);
                                    editTextBoldCursorArr[i14].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(me0Var.y));
                                imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, me0Var.y ? org.telegram.ui.ActionBar.j6.l6 : org.telegram.ui.ActionBar.j6.H6, false));
                                break;
                            default:
                                me0 me0Var2 = this.b;
                                if (me0Var2.x == 0) {
                                    me0Var2.o(null, null);
                                    break;
                                } else {
                                    me0Var2.o(me0Var2.n, null);
                                    break;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, w7.x5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                zc0Var.addView(linearLayout, w7.x5.c(-2.0f, -1));
            } else {
                zc0Var.addView(this.b[i12], w7.x5.c(-2.0f, -1));
            }
            zc0Var.e(this.b[i12]);
            addView(zc0Var, w7.x5.t(-1, -2, 1, 16, 16, 16, 0));
            this.b[i12].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.je0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                    me0 me0Var = me0.this;
                    if (i12 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = me0Var.b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i14 == 5) {
                        me0Var.h(null);
                        return true;
                    }
                    me0Var.getClass();
                    return false;
                }
            });
            i12++;
            f7 = 18.0f;
        }
        if (i10 == 0) {
            this.d.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
        } else {
            this.d.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
        }
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, w7.x5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, w7.x5.q(-1, -1, 80));
        n7.z0.g(textView3);
        final int i14 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ie0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        me0 me0Var = this.b;
                        ImageView imageView2 = me0Var.f;
                        EditTextBoldCursor[] editTextBoldCursorArr = me0Var.b;
                        me0Var.y = !me0Var.y;
                        for (int i142 = 0; i142 < editTextBoldCursorArr.length; i142++) {
                            int selectionStart = editTextBoldCursorArr[i142].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i142].getSelectionEnd();
                            editTextBoldCursorArr[i142].setInputType((me0Var.y ? 144 : 128) | 1);
                            editTextBoldCursorArr[i142].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(me0Var.y));
                        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, me0Var.y ? org.telegram.ui.ActionBar.j6.l6 : org.telegram.ui.ActionBar.j6.H6, false));
                        break;
                    default:
                        me0 me0Var2 = this.b;
                        if (me0Var2.x == 0) {
                            me0Var2.o(null, null);
                            break;
                        } else {
                            me0Var2.o(me0Var2.n, null);
                            break;
                        }
                }
            }
        });
    }

    @Override // org.telegram.ui.Components.tv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.tv0
    public final boolean c(boolean z10) {
        this.E.k1(true, true);
        this.v = null;
        this.w = false;
        return true;
    }

    @Override // org.telegram.ui.Components.tv0
    public final void d() {
        this.w = false;
    }

    @Override // org.telegram.ui.Components.tv0
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void h(String str) {
        if (this.w) {
            return;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.b;
        String obj = editTextBoldCursorArr[0].getText().toString();
        int length = obj.length();
        wg0 wg0Var = this.E;
        if (length == 0) {
            if (wg0Var.getParentActivity() == null) {
                return;
            }
            try {
                editTextBoldCursorArr[0].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
            return;
        }
        if (this.x != 0) {
            this.w = true;
            wg0Var.n1(0, true);
            o(this.n, obj);
        } else {
            if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                if (wg0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                AndroidUtilities.shakeView(editTextBoldCursorArr[1]);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("emailCode", this.h);
            bundle.putString("new_password", obj);
            bundle.putString("password", this.r);
            wg0Var.u1(10, true, bundle, false);
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public final void j() {
        AndroidUtilities.runOnUIThread(new g10(this, 18), wg0.t0);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.x, this.v);
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public final void m(Bundle bundle, boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            editTextBoldCursorArr = this.b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.s = TLdeserialize;
            TwoStepVerificationActivity.m0(TLdeserialize);
        }
        this.n = this.v.getString("new_password");
        wg0.T0(this.E, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    @Override // org.telegram.ui.Components.tv0
    public final void n() {
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false));
        }
        for (org.telegram.ui.Components.zc0 zc0Var : this.a) {
            zc0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, this.y ? org.telegram.ui.ActionBar.j6.l6 : org.telegram.ui.ActionBar.j6.H6, false));
            imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(this.E.getThemedColor(org.telegram.ui.ActionBar.j6.i6), 1, -1));
        }
    }

    public final void o(String str, String str2) {
        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
        tL_auth_recoverPassword.code = this.h;
        if (!TextUtils.isEmpty(str)) {
            tL_auth_recoverPassword.flags |= 1;
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            passwordinputsettings.flags |= 1;
            passwordinputsettings.hint = str2 != null ? str2 : "";
            passwordinputsettings.new_algo = this.s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.in0(this, str, str2, tL_auth_recoverPassword, 18));
    }
}
