package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bd0 extends org.telegram.ui.Components.zu0 {
    public boolean D;
    public int E;
    public int F;
    public final /* synthetic */ hf0 G;
    public final org.telegram.ui.Components.ec0[] a;
    public final EditTextBoldCursor[] b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public String h;
    public String n;
    public String r;
    public TL_account.Password s;
    public Bundle w;
    public boolean x;
    public final int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(hf0 hf0Var, Context context, int i10) {
        super(context);
        this.G = hf0Var;
        this.y = i10;
        final int i11 = 1;
        setOrientation(1);
        int i12 = i10 == 1 ? 1 : 2;
        this.b = new EditTextBoldCursor[i12];
        this.a = new org.telegram.ui.Components.ec0[i12];
        TextView textView = new TextView(context);
        this.c = textView;
        float f7 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        float f10 = 2.0f;
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(org.telegram.messenger.cd.L0(2131745539, null));
        addView(textView, w7.b6.t(-2, -2, 1, 8, org.telegram.messenger.i0.O1() ? 16 : 72, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView2, w7.b6.t(-2, -2, 1, 8, 6, 8, 16));
        final int i13 = 0;
        final int i14 = 0;
        while (i14 < this.b.length) {
            org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, null);
            this.a[i14] = ec0Var;
            ec0Var.setText(org.telegram.messenger.cd.L0(i10 == 0 ? i14 == 0 ? 2131747225 : 2131747223 : 2131747458, null));
            this.b[i14] = new EditTextBoldCursor(context);
            this.b[i14].setCursorSize(org.telegram.messenger.i0.L(20.0f));
            this.b[i14].setCursorWidth(1.5f);
            this.b[i14].setImeOptions(268435461);
            this.b[i14].setTextSize(1, f7);
            this.b[i14].setMaxLines(1);
            this.b[i14].setBackground(null);
            int L = org.telegram.messenger.i0.L(16.0f);
            this.b[i14].setPadding(L, L, L, L);
            if (i10 == 0) {
                this.b[i14].setInputType(org.telegram.messenger.zs.N1);
                this.b[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.b[i14].setTypeface(Typeface.DEFAULT);
            int i15 = 3;
            this.b[i14].setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            EditTextBoldCursor editTextBoldCursor = this.b[i14];
            boolean z10 = i14 == 0 && i10 == 0;
            float f11 = f10;
            editTextBoldCursor.addTextChangedListener(new jg.f3(this, z10));
            this.b[i14].setOnFocusChangeListener(new od(ec0Var, i15));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.b[i14], w7.b6.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                org.telegram.messenger.i0.Y3(imageView, true, 0.1f, true, false);
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yc0
                    public final /* synthetic */ bd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                bd0 bd0Var = this.b;
                                ImageView imageView2 = bd0Var.f;
                                EditTextBoldCursor[] editTextBoldCursorArr = bd0Var.b;
                                bd0Var.D = !bd0Var.D;
                                for (int i16 = 0; i16 < editTextBoldCursorArr.length; i16++) {
                                    int selectionStart = editTextBoldCursorArr[i16].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i16].getSelectionEnd();
                                    editTextBoldCursorArr[i16].setInputType((bd0Var.D ? org.telegram.messenger.zs.a2 : 128) | 1);
                                    editTextBoldCursorArr[i16].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(bd0Var.D));
                                org.telegram.ui.ActionBar.a7.t(imageView2, bd0Var.D ? org.telegram.ui.ActionBar.t6.l6 : org.telegram.ui.ActionBar.t6.H6, null, PorterDuff.Mode.SRC_ATOP);
                                break;
                            default:
                                bd0 bd0Var2 = this.b;
                                if (bd0Var2.y == 0) {
                                    bd0Var2.n(null, null);
                                    break;
                                } else {
                                    bd0Var2.n(bd0Var2.n, null);
                                    break;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, w7.b6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                ec0Var.addView(linearLayout, w7.b6.c(-2.0f, -1));
            } else {
                ec0Var.addView(this.b[i14], w7.b6.c(-2.0f, -1));
            }
            ec0Var.e(this.b[i14]);
            addView(ec0Var, w7.b6.t(-1, -2, 1, 16, 16, 16, 0));
            this.b[i14].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.zc0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    bd0 bd0Var = bd0.this;
                    if (i14 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = bd0Var.b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i16 == 5) {
                        bd0Var.h(null);
                        return true;
                    }
                    bd0Var.getClass();
                    return false;
                }
            });
            i14++;
            f10 = f11;
            f7 = 18.0f;
        }
        float f12 = f10;
        if (i10 == 0) {
            this.d.setText(org.telegram.messenger.cd.L0(2131747224, "PleaseEnterNewFirstPasswordLogin"));
        } else {
            this.d.setText(org.telegram.messenger.cd.L0(2131747456, "PasswordHintTextLogin"));
        }
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(org.telegram.messenger.i0.L(f12), 1.0f);
        textView3.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        textView3.setText(org.telegram.messenger.cd.L0(2131742842, null));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, w7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, w7.b6.r(-1, -1, 80));
        li.k.i(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yc0
            public final /* synthetic */ bd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bd0 bd0Var = this.b;
                        ImageView imageView2 = bd0Var.f;
                        EditTextBoldCursor[] editTextBoldCursorArr = bd0Var.b;
                        bd0Var.D = !bd0Var.D;
                        for (int i16 = 0; i16 < editTextBoldCursorArr.length; i16++) {
                            int selectionStart = editTextBoldCursorArr[i16].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i16].getSelectionEnd();
                            editTextBoldCursorArr[i16].setInputType((bd0Var.D ? org.telegram.messenger.zs.a2 : 128) | 1);
                            editTextBoldCursorArr[i16].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(bd0Var.D));
                        org.telegram.ui.ActionBar.a7.t(imageView2, bd0Var.D ? org.telegram.ui.ActionBar.t6.l6 : org.telegram.ui.ActionBar.t6.H6, null, PorterDuff.Mode.SRC_ATOP);
                        break;
                    default:
                        bd0 bd0Var2 = this.b;
                        if (bd0Var2.y == 0) {
                            bd0Var2.n(null, null);
                            break;
                        } else {
                            bd0Var2.n(bd0Var2.n, null);
                            break;
                        }
                }
            }
        });
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean c(boolean z10) {
        this.G.s1(true, true);
        this.w = null;
        this.x = false;
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void d() {
        this.x = false;
    }

    @Override // org.telegram.ui.Components.zu0
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131748283, "NewPassword");
    }

    @Override // org.telegram.ui.Components.zu0
    public final void h(String str) {
        if (this.x) {
            return;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.b;
        String obj = editTextBoldCursorArr[0].getText().toString();
        int length = obj.length();
        hf0 hf0Var = this.G;
        if (length == 0) {
            if (hf0Var.getParentActivity() == null) {
                return;
            }
            try {
                editTextBoldCursorArr[0].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.i0.E3(editTextBoldCursorArr[0]);
            return;
        }
        if (this.y != 0) {
            this.x = true;
            hf0Var.v1(0, true);
            n(this.n, obj);
        } else {
            if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                if (hf0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                org.telegram.messenger.i0.E3(editTextBoldCursorArr[1]);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("emailCode", this.h);
            bundle.putString("new_password", obj);
            bundle.putString("password", this.r);
            hf0Var.C1(10, true, bundle, false);
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void j() {
        org.telegram.messenger.i0.h3(new zy(this, 21), hf0.y0);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.y);
        this.w = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void l(Bundle bundle) {
        if (this.w != null) {
            bundle.putBundle("recoveryview_params" + this.y, this.w);
        }
    }

    @Override // org.telegram.ui.Components.zu0
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
        this.w = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.w.getString("password");
        this.r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.s = TLdeserialize;
            TwoStepVerificationActivity.q0(TLdeserialize);
        }
        this.n = this.w.getString("new_password");
        hf0.Z0(this.G, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    public final void n(String str, String str2) {
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
        Utilities.e.c(new w50(this, str, str2, tL_auth_recoverPassword, 7));
    }

    @Override // org.telegram.ui.Components.zu0
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.l6, false));
        }
        for (org.telegram.ui.Components.ec0 ec0Var : this.a) {
            ec0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        ImageView imageView = this.f;
        if (imageView != null) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, this.D ? org.telegram.ui.ActionBar.t6.l6 : org.telegram.ui.ActionBar.t6.H6, false);
            hf0.k1(imageView, x02, this.E, PorterDuff.Mode.SRC_ATOP);
            this.E = x02;
            int themedColor = this.G.getThemedColor(org.telegram.ui.ActionBar.t6.i6);
            hf0.l1(imageView, themedColor, this.F);
            this.F = themedColor;
        }
    }
}
