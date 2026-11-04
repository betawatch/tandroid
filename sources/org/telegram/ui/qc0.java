package org.telegram.ui;

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qc0 extends org.telegram.ui.Components.vt0 {
    public GoogleSignInAccount E;
    public final /* synthetic */ xd0 F;
    public final org.telegram.ui.Components.gb0 a;
    public final EditTextBoldCursor b;
    public final TextView c;
    public final org.telegram.ui.Components.s70 d;
    public final TextView e;
    public final org.telegram.ui.Components.z70 f;
    public final org.telegram.ui.Components.fh0 h;
    public Bundle n;
    public boolean r;
    public String s;
    public String w;
    public String x;
    public String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qc0(xd0 xd0Var, Context context) {
        super(context);
        int i3;
        this.F = xd0Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.h = fh0Var;
        fh0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        fh0Var.setAutoRepeat(false);
        frameLayout.addView(fh0Var, b8.mf.e(120, 120, 1));
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i3 = 0;
                frameLayout.setVisibility(i3);
                addView(frameLayout, b8.mf.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                k2.p1.t(textView, 1, 18.0f);
                int i10 = 3;
                textView.setText(org.telegram.messenger.bd.M0(xd0Var.G != 3 ? 2131751121 : 2131754441, null));
                textView.setGravity(17);
                textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(textView, b8.mf.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, null);
                this.d = s70Var;
                s70Var.setTextSize(1, 14.0f);
                s70Var.setGravity(17);
                s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                s70Var.setText(org.telegram.messenger.bd.M0(2131754442, null));
                addView(s70Var, b8.mf.t(-2, -2, 1, 32, 8, 32, 0));
                org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, null);
                this.a = gb0Var;
                gb0Var.setText(org.telegram.messenger.bd.M0(xd0Var.G != 3 ? 2131742817 : 2131742833, null));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.b = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 17.0f);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(33);
                int i11 = 7;
                editTextBoldCursor.setOnFocusChangeListener(new ed(this, i11));
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                gb0Var.e(editTextBoldCursor);
                gb0Var.addView(editTextBoldCursor, b8.mf.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new ea(this, i11));
                addView(gb0Var, b8.mf.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
                TextView textView2 = new TextView(context);
                this.e = textView2;
                textView2.setGravity(3);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.fy(i10), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131745331, null));
                textView2.setText(spannableStringBuilder);
                org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context);
                this.f = z70Var;
                addView(new Space(context), b8.mf.l(1.0f, 0, 0));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView2, b8.mf.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
                frameLayout2.addView(z70Var, b8.mf.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
                z70Var.setMeasureAfter(textView2);
                addView(frameLayout2, b8.mf.o(-1, -2));
                k4.j.k(frameLayout2);
                frameLayout2.setOnClickListener(new b40(this, 8));
            }
        }
        i3 = 8;
        frameLayout.setVisibility(i3);
        addView(frameLayout, b8.mf.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        k2.p1.t(textView3, 1, 18.0f);
        int i102 = 3;
        textView3.setText(org.telegram.messenger.bd.M0(xd0Var.G != 3 ? 2131751121 : 2131754441, null));
        textView3.setGravity(17);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView3, b8.mf.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        org.telegram.ui.Components.s70 s70Var2 = new org.telegram.ui.Components.s70(context, null);
        this.d = s70Var2;
        s70Var2.setTextSize(1, 14.0f);
        s70Var2.setGravity(17);
        s70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        s70Var2.setText(org.telegram.messenger.bd.M0(2131754442, null));
        addView(s70Var2, b8.mf.t(-2, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.gb0 gb0Var2 = new org.telegram.ui.Components.gb0(context, null);
        this.a = gb0Var2;
        gb0Var2.setText(org.telegram.messenger.bd.M0(xd0Var.G != 3 ? 2131742817 : 2131742833, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(33);
        int i112 = 7;
        editTextBoldCursor2.setOnFocusChangeListener(new ed(this, i112));
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        gb0Var2.e(editTextBoldCursor2);
        gb0Var2.addView(editTextBoldCursor2, b8.mf.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new ea(this, i112));
        addView(gb0Var2, b8.mf.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
        TextView textView22 = new TextView(context);
        this.e = textView22;
        textView22.setGravity(3);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView22.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.fy(i102), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131745331, null));
        textView22.setText(spannableStringBuilder2);
        org.telegram.ui.Components.z70 z70Var2 = new org.telegram.ui.Components.z70(context);
        this.f = z70Var2;
        addView(new Space(context), b8.mf.l(1.0f, 0, 0));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView22, b8.mf.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
        frameLayout22.addView(z70Var2, b8.mf.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
        z70Var2.setMeasureAfter(textView22);
        addView(frameLayout22, b8.mf.o(-1, -2));
        k4.j.k(frameLayout22);
        frameLayout22.setOnClickListener(new b40(this, 8));
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean b() {
        return !this.F.i0;
    }

    @Override // org.telegram.ui.Components.vt0
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131754441, "AddEmailTitle");
    }

    @Override // org.telegram.ui.Components.vt0
    public final void h(String str) {
        int i3;
        int i10;
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
        xd0 xd0Var = this.F;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (xd0Var.G == 3) {
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
            i10 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new y9(this, bundle, verifyemail, 21), 10);
            return;
        }
        if (TextUtils.isEmpty(obj)) {
            n();
            return;
        }
        this.r = true;
        xd0Var.w1(0, true);
        TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
        if (xd0Var.G == 3) {
            sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
        } else {
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup2.phone_number = this.x;
            tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.y;
            sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
        }
        sendverifyemailcode.email = obj;
        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(sendverifyemailcode, new y9(this, bundle, sendverifyemailcode, 22), 10);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void j() {
        org.telegram.messenger.g0.i3(new pc0(this, 0), xd0.z0);
    }

    @Override // org.telegram.ui.Components.vt0
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

    @Override // org.telegram.ui.Components.vt0
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

    @Override // org.telegram.ui.Components.vt0
    public final void m(Bundle bundle, boolean z10) {
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
        int i3 = (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.lt.b.hasServices()) ? 0 : 8;
        this.f.setVisibility(i3);
        this.e.setVisibility(i3);
        xd0.a1(this.F, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.gb0 gb0Var = this.a;
        xd0 xd0Var = this.F;
        if (xd0Var.getParentActivity() == null) {
            return;
        }
        try {
            gb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.b.requestFocus();
        xd0.b1(xd0Var, gb0Var, true);
        postDelayed(new pc0(this, 1), 300L);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.s70 s70Var = this.d;
        s70Var.setTextColor(x02);
        s70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.f.updateColors();
        this.a.invalidate();
    }
}
