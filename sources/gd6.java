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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gd6 extends jja {
    public boolean E;
    public int F;
    public int G;
    public final /* synthetic */ mf6 H;
    public final er7[] a;
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
    public gd6(mf6 mf6Var, Context context, int i) {
        super(context);
        this.H = mf6Var;
        this.y = i;
        final byte b = 1;
        setOrientation(1);
        int i2 = i == 1 ? 1 : 2;
        this.b = new EditTextBoldCursor[i2];
        this.a = new er7[i2];
        TextView textView = new TextView(context);
        this.c = textView;
        float f = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(gl.o());
        float f2 = 2.0f;
        textView.setLineSpacing(gl.L(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(k96.M0(2131745330, null));
        addView(textView, nme.t(-2, -2, 1, 8, gl.M1() ? 16 : 72, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView2, nme.t(-2, -2, 1, 8, 6, 8, 16));
        final byte b2 = 0;
        final int i3 = 0;
        while (i3 < this.b.length) {
            er7 er7Var = new er7(context, null);
            this.a[i3] = er7Var;
            er7Var.setText(k96.M0(i == 0 ? i3 == 0 ? 2131747017 : 2131747015 : 2131747249, null));
            this.b[i3] = new EditTextBoldCursor(context);
            this.b[i3].setCursorSize(gl.L(20.0f));
            this.b[i3].setCursorWidth(1.5f);
            this.b[i3].setImeOptions(268435461);
            this.b[i3].setTextSize(1, f);
            this.b[i3].setMaxLines(1);
            this.b[i3].setBackground(null);
            int L = gl.L(16.0f);
            this.b[i3].setPadding(L, L, L, L);
            if (i == 0) {
                this.b[i3].setInputType(kk7.M1);
                this.b[i3].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.b[i3].setTypeface(Typeface.DEFAULT);
            this.b[i3].setGravity(k96.a0 ? 5 : 3);
            EditTextBoldCursor editTextBoldCursor = this.b[i3];
            boolean z = i3 == 0 && i == 0;
            editTextBoldCursor.addTextChangedListener(new fd6(this, z));
            float f3 = f2;
            this.b[i3].setOnFocusChangeListener(new ls0(er7Var, (byte) 7));
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.b[i3], nme.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                gl.U3(imageView, true, 0.1f, true, false);
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: cd6
                    public final /* synthetic */ gd6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        gd6 gd6Var = this.b;
                        switch (b3) {
                            case 0:
                                ImageView imageView2 = gd6Var.f;
                                EditTextBoldCursor[] editTextBoldCursorArr = gd6Var.b;
                                gd6Var.E = !gd6Var.E;
                                for (int i4 = 0; i4 < editTextBoldCursorArr.length; i4++) {
                                    int selectionStart = editTextBoldCursorArr[i4].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i4].getSelectionEnd();
                                    editTextBoldCursorArr[i4].setInputType((gd6Var.E ? kk7.Z1 : 128) | 1);
                                    editTextBoldCursorArr[i4].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(gd6Var.E));
                                zkb.s(imageView2, gd6Var.E ? bkb.k6 : bkb.G6, null, PorterDuff.Mode.SRC_ATOP);
                                break;
                            default:
                                if (gd6Var.y) {
                                    gd6Var.n(gd6Var.n, null);
                                    break;
                                } else {
                                    gd6Var.n(null, null);
                                    break;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, nme.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                er7Var.addView(linearLayout, nme.c(-2.0f, -1));
            } else {
                er7Var.addView(this.b[i3], nme.c(-2.0f, -1));
            }
            er7Var.e(this.b[i3]);
            addView(er7Var, nme.t(-1, -2, 1, 16, 16, 16, 0));
            this.b[i3].setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: dd6
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i4, KeyEvent keyEvent) {
                    gd6 gd6Var = gd6.this;
                    if (i3 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = gd6Var.b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i4 != 5) {
                        return false;
                    }
                    gd6Var.h(null);
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
            textView3.setText(k96.M0(2131747016, "PleaseEnterNewFirstPasswordLogin"));
        } else {
            textView3.setText(k96.M0(2131747247, "PasswordHintTextLogin"));
        }
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(19);
        textView4.setTextSize(1, 15.0f);
        textView4.setLineSpacing(gl.L(f4), 1.0f);
        textView4.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        textView4.setText(k96.M0(2131742554, null));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView4, nme.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, nme.r(-1, -1, 80));
        vk9.c(textView4);
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: cd6
            public final /* synthetic */ gd6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                gd6 gd6Var = this.b;
                switch (b3) {
                    case 0:
                        ImageView imageView2 = gd6Var.f;
                        EditTextBoldCursor[] editTextBoldCursorArr = gd6Var.b;
                        gd6Var.E = !gd6Var.E;
                        for (int i4 = 0; i4 < editTextBoldCursorArr.length; i4++) {
                            int selectionStart = editTextBoldCursorArr[i4].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i4].getSelectionEnd();
                            editTextBoldCursorArr[i4].setInputType((gd6Var.E ? kk7.Z1 : 128) | 1);
                            editTextBoldCursorArr[i4].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(gd6Var.E));
                        zkb.s(imageView2, gd6Var.E ? bkb.k6 : bkb.G6, null, PorterDuff.Mode.SRC_ATOP);
                        break;
                    default:
                        if (gd6Var.y) {
                            gd6Var.n(gd6Var.n, null);
                            break;
                        } else {
                            gd6Var.n(null, null);
                            break;
                        }
                }
            }
        });
    }

    @Override // jja
    public final boolean b() {
        return true;
    }

    @Override // jja
    public final boolean d(boolean z) {
        this.H.x1(true, true);
        this.w = null;
        this.x = false;
        return true;
    }

    @Override // jja
    public final void e() {
        this.x = false;
    }

    @Override // jja
    public String getHeaderName() {
        return k96.M0(2131748074, "NewPassword");
    }

    @Override // jja
    public final void h(String str) {
        if (this.x) {
            return;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.b;
        String obj = editTextBoldCursorArr[0].getText().toString();
        int length = obj.length();
        mf6 mf6Var = this.H;
        if (length == 0) {
            if (mf6Var.getParentActivity() != null) {
                try {
                    editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                gl.A3(editTextBoldCursorArr[0]);
                return;
            }
            return;
        }
        if (this.y) {
            this.x = true;
            mf6Var.A1(0, true);
            n(this.n, obj);
        } else {
            if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                if (mf6Var.getParentActivity() == null) {
                    return;
                }
                try {
                    editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                gl.A3(editTextBoldCursorArr[1]);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("emailCode", this.h);
            bundle.putString("new_password", obj);
            bundle.putString("password", this.r);
            mf6Var.I1(10, true, bundle, false);
        }
    }

    @Override // jja
    public final void j() {
        gl.e3(new tp5(this, (byte) 19), mf6.A0);
    }

    @Override // jja
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + (this.y ? 1 : 0));
        this.w = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // jja
    public final void l(Bundle bundle) {
        if (this.w != null) {
            bundle.putBundle("recoveryview_params" + (this.y ? 1 : 0), this.w);
        }
    }

    @Override // jja
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
        this.H.L1(editTextBoldCursorArr[0]);
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
        Utilities.e.c(new e45(this, str, str2, tL_auth_recoverPassword, (byte) 16));
    }

    @Override // jja
    public final void updateColors() {
        this.c.setTextColor(bkb.w0(null, bkb.F6, false));
        this.d.setTextColor(bkb.w0(null, bkb.C6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.b) {
            editTextBoldCursor.setTextColor(bkb.w0(null, bkb.F6, false));
            editTextBoldCursor.setCursorColor(bkb.w0(null, bkb.k6, false));
        }
        for (er7 er7Var : this.a) {
            er7Var.f();
        }
        this.e.setTextColor(bkb.w0(null, bkb.p6, false));
        ImageView imageView = this.f;
        if (imageView != null) {
            int w0 = bkb.w0(null, this.E ? bkb.k6 : bkb.G6, false);
            mf6.l1(imageView, w0, this.F, PorterDuff.Mode.SRC_ATOP);
            this.F = w0;
            int themedColor = this.H.getThemedColor(bkb.h6);
            mf6.m1(imageView, themedColor, this.G);
            this.G = themedColor;
        }
    }
}
