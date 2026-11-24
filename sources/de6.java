// default package

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.b;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class de6 extends jja {
    public GoogleSignInAccount E;
    public final /* synthetic */ mf6 F;
    public final er7 a;
    public final EditTextBoldCursor b;
    public final TextView c;
    public final l46 d;
    public final TextView e;
    public final nf6 f;
    public final ry8 h;
    public Bundle n;
    public boolean r;
    public String s;
    public String w;
    public String x;
    public String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public de6(mf6 mf6Var, Context context) {
        super(context);
        int i;
        this.F = mf6Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ry8 ry8Var = new ry8(context);
        this.h = ry8Var;
        ry8Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        ry8Var.setAutoRepeat(false);
        frameLayout.addView(ry8Var, nme.e(120, 120, 1));
        if (!gl.M1()) {
            Point point = gl.q;
            if (point.x <= point.y || gl.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, nme.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                ir2.t(textView, 1, 18.0f);
                textView.setText(k96.M0(mf6Var.G != 3 ? 2131751108 : 2131754438, null));
                textView.setGravity(17);
                textView.setLineSpacing(gl.L(2.0f), 1.0f);
                addView(textView, nme.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                l46 l46Var = new l46(context, null);
                this.d = l46Var;
                l46Var.setTextSize(1, 14.0f);
                l46Var.setGravity(17);
                l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
                l46Var.setText(k96.M0(2131754439, null));
                addView(l46Var, nme.t(-2, -2, 1, 32, 8, 32, 0));
                er7 er7Var = new er7(context, null);
                this.a = er7Var;
                er7Var.setText(k96.M0(mf6Var.G != 3 ? 2131742544 : 2131742560, null));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.b = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(gl.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 17.0f);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(33);
                editTextBoldCursor.setOnFocusChangeListener(new ls0(this, (byte) 11));
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                er7Var.e(editTextBoldCursor);
                er7Var.addView(editTextBoldCursor, nme.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 15));
                addView(er7Var, nme.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
                TextView textView2 = new TextView(context);
                this.e = textView2;
                textView2.setGravity(3);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(gl.L(2.0f), 1.0f);
                textView2.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, gl.L(9.0f), gl.L(18.0f), gl.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new lx2((byte) 3), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) k96.M0(2131745129, null));
                textView2.setText(spannableStringBuilder);
                nf6 nf6Var = new nf6(context);
                this.f = nf6Var;
                addView(new Space(context), nme.l(1.0f, 0, 0));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView2, nme.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
                frameLayout2.addView(nf6Var, nme.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
                nf6Var.setMeasureAfter(textView2);
                addView(frameLayout2, nme.o(-1, -2));
                vk9.c(frameLayout2);
                frameLayout2.setOnClickListener(new b95(this, (byte) 22));
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, nme.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        ir2.t(textView3, 1, 18.0f);
        textView3.setText(k96.M0(mf6Var.G != 3 ? 2131751108 : 2131754438, null));
        textView3.setGravity(17);
        textView3.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView3, nme.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        l46 l46Var2 = new l46(context, null);
        this.d = l46Var2;
        l46Var2.setTextSize(1, 14.0f);
        l46Var2.setGravity(17);
        l46Var2.setLineSpacing(gl.L(2.0f), 1.0f);
        l46Var2.setText(k96.M0(2131754439, null));
        addView(l46Var2, nme.t(-2, -2, 1, 32, 8, 32, 0));
        er7 er7Var2 = new er7(context, null);
        this.a = er7Var2;
        er7Var2.setText(k96.M0(mf6Var.G != 3 ? 2131742544 : 2131742560, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(gl.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(33);
        editTextBoldCursor2.setOnFocusChangeListener(new ls0(this, (byte) 11));
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        er7Var2.e(editTextBoldCursor2);
        er7Var2.addView(editTextBoldCursor2, nme.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new j(this, (byte) 15));
        addView(er7Var2, nme.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
        TextView textView22 = new TextView(context);
        this.e = textView22;
        textView22.setGravity(3);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(gl.L(2.0f), 1.0f);
        textView22.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, gl.L(9.0f), gl.L(18.0f), gl.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new lx2((byte) 3), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) k96.M0(2131745129, null));
        textView22.setText(spannableStringBuilder2);
        nf6 nf6Var2 = new nf6(context);
        this.f = nf6Var2;
        addView(new Space(context), nme.l(1.0f, 0, 0));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView22, nme.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
        frameLayout22.addView(nf6Var2, nme.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
        nf6Var2.setMeasureAfter(textView22);
        addView(frameLayout22, nme.o(-1, -2));
        vk9.c(frameLayout22);
        frameLayout22.setOnClickListener(new b95(this, (byte) 22));
    }

    @Override // jja
    public final boolean b() {
        return !this.F.i0;
    }

    @Override // jja
    public String getHeaderName() {
        return k96.M0(2131754438, "AddEmailTitle");
    }

    @Override // jja
    public final void h(String str) {
        int i;
        int i2;
        if (this.r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.E;
        String obj = googleSignInAccount != null ? googleSignInAccount.c : this.b.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.s);
        bundle.putString("ephone", this.w);
        bundle.putString("phoneFormated", this.x);
        bundle.putString("phoneHash", this.y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.E;
        mf6 mf6Var = this.F;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (mf6Var.G == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.E.b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.E = null;
            i2 = ((d) mf6Var).currentAccount;
            ConnectionsManager.getInstance(i2).sendRequest(verifyemail, new k45(this, bundle, verifyemail, (byte) 8), 10);
            return;
        }
        if (TextUtils.isEmpty(obj)) {
            n();
            return;
        }
        this.r = true;
        mf6Var.A1(0, true);
        TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
        if (mf6Var.G == 3) {
            sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
        } else {
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup2.phone_number = this.x;
            tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.y;
            sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
        }
        sendverifyemailcode.email = obj;
        i = ((d) mf6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(sendverifyemailcode, new k45(this, bundle, sendverifyemailcode, (byte) 9), 10);
    }

    @Override // jja
    public final void j() {
        gl.d3(new ce6(this, (byte) 0), mf6.A0);
    }

    @Override // jja
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.b.setText(string);
        }
    }

    @Override // jja
    public final void l(Bundle bundle) {
        String obj = this.b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override // jja
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setText("");
        this.n = bundle;
        this.s = bundle.getString("phone");
        this.w = this.n.getString("ephone");
        this.x = this.n.getString("phoneFormated");
        this.y = this.n.getString("phoneHash");
        int i = (bundle.getBoolean("googleSignInAllowed") && b.b.hasServices()) ? 0 : 8;
        this.f.setVisibility(i);
        this.e.setVisibility(i);
        this.F.L1(editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        er7 er7Var = this.a;
        if (this.F.getParentActivity() == null) {
            return;
        }
        try {
            er7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.b.requestFocus();
        mf6.D1(er7Var, true);
        postDelayed(new ce6(this, (byte) 1), 300L);
    }

    @Override // jja
    public final void updateColors() {
        int i = bkb.F6;
        this.c.setTextColor(bkb.w0(null, i, false));
        int w0 = bkb.w0(null, bkb.C6, false);
        l46 l46Var = this.d;
        l46Var.setTextColor(w0);
        l46Var.setLinkTextColor(bkb.w0(null, bkb.Wc, false));
        this.b.setTextColor(bkb.w0(null, i, false));
        this.e.setTextColor(bkb.w0(null, bkb.p6, false));
        this.f.updateColors();
        this.a.invalidate();
    }
}
