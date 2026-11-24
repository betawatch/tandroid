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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cg6 extends kla {
    public GoogleSignInAccount E;
    public final /* synthetic */ mh6 F;
    public final gt7 a;
    public final EditTextBoldCursor b;
    public final TextView c;
    public final l66 d;
    public final TextView e;
    public final nh6 f;
    public final s09 h;
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
    public cg6(mh6 mh6Var, Context context) {
        super(context);
        int i;
        this.F = mh6Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        s09 s09Var = new s09(context);
        this.h = s09Var;
        s09Var.f(R.raw.tsv_setup_mail, nm7.E1, nm7.E1, null);
        s09Var.setAutoRepeat(false);
        frameLayout.addView(s09Var, qoe.e(nm7.E1, nm7.E1, 1));
        if (!gm.M1()) {
            Point point = gm.q;
            if (point.x <= point.y || gm.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, qoe.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                ts2.s(textView, 1, 18.0f);
                textView.setText(jb6.M0(mh6Var.G != 3 ? 2131751057 : 2131754438, null));
                textView.setGravity(17);
                textView.setLineSpacing(gm.L(2.0f), 1.0f);
                addView(textView, qoe.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                l66 l66Var = new l66(context, null);
                this.d = l66Var;
                l66Var.setTextSize(1, 14.0f);
                l66Var.setGravity(17);
                l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
                l66Var.setText(jb6.M0(2131754439, null));
                addView(l66Var, qoe.t(-2, -2, 1, 32, 8, 32, 0));
                gt7 gt7Var = new gt7(context, null);
                this.a = gt7Var;
                gt7Var.setText(jb6.M0(mh6Var.G != 3 ? 2131742470 : 2131742486, null));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.b = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(gm.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 17.0f);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(33);
                editTextBoldCursor.setOnFocusChangeListener(new tt0(this, (byte) 11));
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                gt7Var.e(editTextBoldCursor);
                gt7Var.addView(editTextBoldCursor, qoe.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 16));
                addView(gt7Var, qoe.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
                TextView textView2 = new TextView(context);
                this.e = textView2;
                textView2.setGravity(3);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(gm.L(2.0f), 1.0f);
                textView2.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, gm.L(9.0f), gm.L(18.0f), gm.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new vy2((byte) 3), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) jb6.M0(2131745055, null));
                textView2.setText(spannableStringBuilder);
                nh6 nh6Var = new nh6(context);
                this.f = nh6Var;
                addView(new Space(context), qoe.l(1.0f, 0, 0));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView2, qoe.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
                frameLayout2.addView(nh6Var, qoe.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
                nh6Var.setMeasureAfter(textView2);
                addView(frameLayout2, qoe.o(-1, -2));
                wm9.c(frameLayout2);
                frameLayout2.setOnClickListener(new ca5(this, (byte) 25));
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, qoe.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        ts2.s(textView3, 1, 18.0f);
        textView3.setText(jb6.M0(mh6Var.G != 3 ? 2131751057 : 2131754438, null));
        textView3.setGravity(17);
        textView3.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView3, qoe.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        l66 l66Var2 = new l66(context, null);
        this.d = l66Var2;
        l66Var2.setTextSize(1, 14.0f);
        l66Var2.setGravity(17);
        l66Var2.setLineSpacing(gm.L(2.0f), 1.0f);
        l66Var2.setText(jb6.M0(2131754439, null));
        addView(l66Var2, qoe.t(-2, -2, 1, 32, 8, 32, 0));
        gt7 gt7Var2 = new gt7(context, null);
        this.a = gt7Var2;
        gt7Var2.setText(jb6.M0(mh6Var.G != 3 ? 2131742470 : 2131742486, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(gm.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(33);
        editTextBoldCursor2.setOnFocusChangeListener(new tt0(this, (byte) 11));
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        gt7Var2.e(editTextBoldCursor2);
        gt7Var2.addView(editTextBoldCursor2, qoe.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new j(this, (byte) 16));
        addView(gt7Var2, qoe.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
        TextView textView22 = new TextView(context);
        this.e = textView22;
        textView22.setGravity(3);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(gm.L(2.0f), 1.0f);
        textView22.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, gm.L(9.0f), gm.L(18.0f), gm.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new vy2((byte) 3), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) jb6.M0(2131745055, null));
        textView22.setText(spannableStringBuilder2);
        nh6 nh6Var2 = new nh6(context);
        this.f = nh6Var2;
        addView(new Space(context), qoe.l(1.0f, 0, 0));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView22, qoe.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
        frameLayout22.addView(nh6Var2, qoe.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
        nh6Var2.setMeasureAfter(textView22);
        addView(frameLayout22, qoe.o(-1, -2));
        wm9.c(frameLayout22);
        frameLayout22.setOnClickListener(new ca5(this, (byte) 25));
    }

    @Override // kla
    public final boolean b() {
        return !this.F.i0;
    }

    @Override // kla
    public String getHeaderName() {
        return jb6.M0(2131754438, "AddEmailTitle");
    }

    @Override // kla
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
        mh6 mh6Var = this.F;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (mh6Var.G == 3) {
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
            i2 = ((d) mh6Var).currentAccount;
            ConnectionsManager.getInstance(i2).sendRequest(verifyemail, new i65(this, bundle, verifyemail, (byte) 8), 10);
            return;
        }
        if (TextUtils.isEmpty(obj)) {
            n();
            return;
        }
        this.r = true;
        mh6Var.B1(0, true);
        TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
        if (mh6Var.G == 3) {
            sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
        } else {
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup2.phone_number = this.x;
            tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.y;
            sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
        }
        sendverifyemailcode.email = obj;
        i = ((d) mh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(sendverifyemailcode, new i65(this, bundle, sendverifyemailcode, (byte) 9), 10);
    }

    @Override // kla
    public final void j() {
        gm.d3(new bg6(this, (byte) 0), mh6.A0);
    }

    @Override // kla
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

    @Override // kla
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

    @Override // kla
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
        this.F.M1(editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        gt7 gt7Var = this.a;
        if (this.F.getParentActivity() == null) {
            return;
        }
        try {
            gt7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.b.requestFocus();
        mh6.E1(gt7Var, true);
        postDelayed(new bg6(this, (byte) 1), 300L);
    }

    @Override // kla
    public final void updateColors() {
        int i = cmb.F6;
        this.c.setTextColor(cmb.w0(null, i, false));
        int w0 = cmb.w0(null, cmb.C6, false);
        l66 l66Var = this.d;
        l66Var.setTextColor(w0);
        l66Var.setLinkTextColor(cmb.w0(null, cmb.Wc, false));
        this.b.setTextColor(cmb.w0(null, i, false));
        this.e.setTextColor(cmb.w0(null, cmb.p6, false));
        this.f.updateColors();
        this.a.invalidate();
    }
}
