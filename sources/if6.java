// default package

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
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class if6 extends cna {
    public boolean E;
    public int F;
    public int G;
    public final /* synthetic */ qh6 H;
    public final lu7[] a;
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
    public final boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public if6(qh6 qh6Var, Context context, int i) {
        super(context);
        this.H = qh6Var;
        this.y = i;
        final byte b = 1;
        setOrientation(1);
        int i2 = i == 1 ? 1 : 2;
        this.b = new EditTextBoldCursor[i2];
        this.a = new lu7[i2];
        TextView textView = new TextView(context);
        this.c = textView;
        float f = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(hl.o());
        float f2 = 2.0f;
        textView.setLineSpacing(hl.L(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(ob6.M0(2131745250, null));
        addView(textView, tre.t(-2, -2, 1, 8, hl.M1() ? 16 : 72, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView2, tre.t(-2, -2, 1, 8, 6, 8, 16));
        final byte b2 = 0;
        final int i3 = 0;
        while (i3 < this.b.length) {
            lu7 lu7Var = new lu7(context, null);
            this.a[i3] = lu7Var;
            lu7Var.setText(ob6.M0(i == 0 ? i3 == 0 ? 2131746937 : 2131746935 : 2131747169, null));
            this.b[i3] = new EditTextBoldCursor(context);
            this.b[i3].setCursorSize(hl.L(20.0f));
            this.b[i3].setCursorWidth(1.5f);
            this.b[i3].setImeOptions(268435461);
            this.b[i3].setTextSize(1, f);
            this.b[i3].setMaxLines(1);
            this.b[i3].setBackground(null);
            int L = hl.L(16.0f);
            this.b[i3].setPadding(L, L, L, L);
            if (i == 0) {
                this.b[i3].setInputType(jn7.M1);
                this.b[i3].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.b[i3].setTypeface(Typeface.DEFAULT);
            this.b[i3].setGravity(ob6.a0 ? 5 : 3);
            EditTextBoldCursor editTextBoldCursor = this.b[i3];
            boolean z = i3 == 0 && i == 0;
            editTextBoldCursor.addTextChangedListener(new wx1(this, z));
            float f3 = f2;
            this.b[i3].setOnFocusChangeListener(new ts0(lu7Var, (byte) 7));
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.b[i3], tre.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                hl.T3(imageView, true, 0.1f, true, false);
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ff6
                    public final /* synthetic */ if6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        if6 if6Var = this.b;
                        switch (b3) {
                            case 0:
                                ImageView imageView2 = if6Var.f;
                                EditTextBoldCursor[] editTextBoldCursorArr = if6Var.b;
                                if6Var.E = !if6Var.E;
                                for (int i4 = 0; i4 < editTextBoldCursorArr.length; i4++) {
                                    int selectionStart = editTextBoldCursorArr[i4].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i4].getSelectionEnd();
                                    editTextBoldCursorArr[i4].setInputType((if6Var.E ? jn7.Z1 : 128) | 1);
                                    editTextBoldCursorArr[i4].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(if6Var.E));
                                yob.s(imageView2, if6Var.E ? aob.l6 : aob.H6, null, PorterDuff.Mode.SRC_ATOP);
                                break;
                            default:
                                if (if6Var.y) {
                                    if6Var.n(if6Var.n, null);
                                    break;
                                } else {
                                    if6Var.n(null, null);
                                    break;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, tre.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                lu7Var.addView(linearLayout, tre.c(-2.0f, -1));
            } else {
                lu7Var.addView(this.b[i3], tre.c(-2.0f, -1));
            }
            lu7Var.e(this.b[i3]);
            addView(lu7Var, tre.t(-1, -2, 1, 16, 16, 16, 0));
            this.b[i3].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gf6
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i4, KeyEvent keyEvent) {
                    if6 if6Var = if6.this;
                    if (i3 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = if6Var.b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i4 != 5) {
                        return false;
                    }
                    if6Var.h(null);
                    return true;
                }
            });
            i3++;
            f2 = f3;
            f = 18.0f;
        }
        float f4 = f2;
        TextView textView3 = this.d;
        if (i == 0) {
            textView3.setText(ob6.M0(2131746936, "PleaseEnterNewFirstPasswordLogin"));
        } else {
            textView3.setText(ob6.M0(2131747167, "PasswordHintTextLogin"));
        }
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(19);
        textView4.setTextSize(1, 15.0f);
        textView4.setLineSpacing(hl.L(f4), 1.0f);
        textView4.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        textView4.setText(ob6.M0(2131742448, null));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView4, tre.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, tre.r(-1, -1, 80));
        ko9.e(textView4);
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: ff6
            public final /* synthetic */ if6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                if6 if6Var = this.b;
                switch (b3) {
                    case 0:
                        ImageView imageView2 = if6Var.f;
                        EditTextBoldCursor[] editTextBoldCursorArr = if6Var.b;
                        if6Var.E = !if6Var.E;
                        for (int i4 = 0; i4 < editTextBoldCursorArr.length; i4++) {
                            int selectionStart = editTextBoldCursorArr[i4].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i4].getSelectionEnd();
                            editTextBoldCursorArr[i4].setInputType((if6Var.E ? jn7.Z1 : 128) | 1);
                            editTextBoldCursorArr[i4].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(if6Var.E));
                        yob.s(imageView2, if6Var.E ? aob.l6 : aob.H6, null, PorterDuff.Mode.SRC_ATOP);
                        break;
                    default:
                        if (if6Var.y) {
                            if6Var.n(if6Var.n, null);
                            break;
                        } else {
                            if6Var.n(null, null);
                            break;
                        }
                }
            }
        });
    }

    @Override // cna
    public final boolean b() {
        return true;
    }

    @Override // cna
    public final boolean c(boolean z) {
        this.H.y1(true, true);
        this.w = null;
        this.x = false;
        return true;
    }

    @Override // cna
    public final void d() {
        this.x = false;
    }

    @Override // cna
    public String getHeaderName() {
        return ob6.M0(2131748020, "NewPassword");
    }

    @Override // cna
    public final void h(String str) {
        if (this.x) {
            return;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.b;
        String obj = editTextBoldCursorArr[0].getText().toString();
        int length = obj.length();
        qh6 qh6Var = this.H;
        if (length == 0) {
            if (qh6Var.getParentActivity() != null) {
                try {
                    editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                hl.z3(editTextBoldCursorArr[0]);
                return;
            }
            return;
        }
        if (this.y) {
            this.x = true;
            qh6Var.B1(0, true);
            n(this.n, obj);
        } else {
            if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                if (qh6Var.getParentActivity() == null) {
                    return;
                }
                try {
                    editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                hl.z3(editTextBoldCursorArr[1]);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("emailCode", this.h);
            bundle.putString("new_password", obj);
            bundle.putString("password", this.r);
            qh6Var.J1(10, true, bundle, false);
        }
    }

    @Override // cna
    public final void j() {
        hl.d3(new z96(this, (byte) 4), qh6.A0);
    }

    @Override // cna
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + (this.y ? 1 : 0));
        this.w = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // cna
    public final void l(Bundle bundle) {
        if (this.w != null) {
            bundle.putBundle("recoveryview_params" + (this.y ? 1 : 0), this.w);
        }
    }

    @Override // cna
    public final void m(Bundle bundle, boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i = 0;
        while (true) {
            editTextBoldCursorArr = this.b;
            if (i >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i].setText("");
            i++;
        }
        this.w = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.w.getString("password");
        this.r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.s = TLdeserialize;
            TwoStepVerificationActivity.e0(TLdeserialize);
        }
        this.n = this.w.getString("new_password");
        this.H.M1(editTextBoldCursorArr[0]);
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
        Utilities.e.c(new g65(this, str, str2, tL_auth_recoverPassword, (byte) 16));
    }

    @Override // cna
    public final void updateColors() {
        this.c.setTextColor(aob.w0(null, aob.G6, false));
        this.d.setTextColor(aob.w0(null, aob.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.b) {
            editTextBoldCursor.setTextColor(aob.w0(null, aob.G6, false));
            editTextBoldCursor.setCursorColor(aob.w0(null, aob.l6, false));
        }
        for (lu7 lu7Var : this.a) {
            lu7Var.f();
        }
        this.e.setTextColor(aob.w0(null, aob.q6, false));
        ImageView imageView = this.f;
        if (imageView != null) {
            int w0 = aob.w0(null, this.E ? aob.l6 : aob.H6, false);
            qh6.m1(imageView, w0, this.F, PorterDuff.Mode.SRC_ATOP);
            this.F = w0;
            int themedColor = this.H.getThemedColor(aob.i6);
            qh6.n1(imageView, themedColor, this.G);
            this.G = themedColor;
        }
    }
}
