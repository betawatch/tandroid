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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fg6 extends cna {
    public GoogleSignInAccount E;
    public final /* synthetic */ qh6 F;
    public final lu7 a;
    public final EditTextBoldCursor b;
    public final TextView c;
    public final p66 d;
    public final TextView e;
    public final rh6 f;
    public final e29 h;
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
    public fg6(qh6 qh6Var, Context context) {
        super(context);
        int i;
        this.F = qh6Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e29 e29Var = new e29(context);
        this.h = e29Var;
        e29Var.f(R.raw.tsv_setup_mail, jn7.E1, jn7.E1, null);
        e29Var.setAutoRepeat(false);
        frameLayout.addView(e29Var, tre.e(jn7.E1, jn7.E1, 1));
        if (!hl.M1()) {
            Point point = hl.q;
            if (point.x <= point.y || hl.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, tre.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                bs2.t(textView, 1, 18.0f);
                textView.setText(ob6.M0(qh6Var.G != 3 ? 2131751085 : 2131754434, null));
                textView.setGravity(17);
                textView.setLineSpacing(hl.L(2.0f), 1.0f);
                addView(textView, tre.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                p66 p66Var = new p66(context, null);
                this.d = p66Var;
                p66Var.setTextSize(1, 14.0f);
                p66Var.setGravity(17);
                p66Var.setLineSpacing(hl.L(2.0f), 1.0f);
                p66Var.setText(ob6.M0(2131754435, null));
                addView(p66Var, tre.t(-2, -2, 1, 32, 8, 32, 0));
                lu7 lu7Var = new lu7(context, null);
                this.a = lu7Var;
                lu7Var.setText(ob6.M0(qh6Var.G != 3 ? 2131742438 : 2131742454, null));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.b = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(hl.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 17.0f);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setInputType(33);
                editTextBoldCursor.setOnFocusChangeListener(new ts0(this, (byte) 11));
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                lu7Var.e(editTextBoldCursor);
                lu7Var.addView(editTextBoldCursor, tre.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 15));
                addView(lu7Var, tre.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
                TextView textView2 = new TextView(context);
                this.e = textView2;
                textView2.setGravity(3);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(hl.L(2.0f), 1.0f);
                textView2.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, hl.L(9.0f), hl.L(18.0f), hl.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new fy2((byte) 3), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) ob6.M0(2131745049, null));
                textView2.setText(spannableStringBuilder);
                rh6 rh6Var = new rh6(context);
                this.f = rh6Var;
                addView(new Space(context), tre.l(1.0f, 0, 0));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView2, tre.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
                frameLayout2.addView(rh6Var, tre.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
                rh6Var.setMeasureAfter(textView2);
                addView(frameLayout2, tre.o(-1, -2));
                ko9.e(frameLayout2);
                frameLayout2.setOnClickListener(new sa5(this, (byte) 23));
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, tre.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        bs2.t(textView3, 1, 18.0f);
        textView3.setText(ob6.M0(qh6Var.G != 3 ? 2131751085 : 2131754434, null));
        textView3.setGravity(17);
        textView3.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView3, tre.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        p66 p66Var2 = new p66(context, null);
        this.d = p66Var2;
        p66Var2.setTextSize(1, 14.0f);
        p66Var2.setGravity(17);
        p66Var2.setLineSpacing(hl.L(2.0f), 1.0f);
        p66Var2.setText(ob6.M0(2131754435, null));
        addView(p66Var2, tre.t(-2, -2, 1, 32, 8, 32, 0));
        lu7 lu7Var2 = new lu7(context, null);
        this.a = lu7Var2;
        lu7Var2.setText(ob6.M0(qh6Var.G != 3 ? 2131742438 : 2131742454, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(hl.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(33);
        editTextBoldCursor2.setOnFocusChangeListener(new ts0(this, (byte) 11));
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        lu7Var2.e(editTextBoldCursor2);
        lu7Var2.addView(editTextBoldCursor2, tre.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new j(this, (byte) 15));
        addView(lu7Var2, tre.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
        TextView textView22 = new TextView(context);
        this.e = textView22;
        textView22.setGravity(3);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(hl.L(2.0f), 1.0f);
        textView22.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, hl.L(9.0f), hl.L(18.0f), hl.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new fy2((byte) 3), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) ob6.M0(2131745049, null));
        textView22.setText(spannableStringBuilder2);
        rh6 rh6Var2 = new rh6(context);
        this.f = rh6Var2;
        addView(new Space(context), tre.l(1.0f, 0, 0));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView22, tre.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
        frameLayout22.addView(rh6Var2, tre.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
        rh6Var2.setMeasureAfter(textView22);
        addView(frameLayout22, tre.o(-1, -2));
        ko9.e(frameLayout22);
        frameLayout22.setOnClickListener(new sa5(this, (byte) 23));
    }

    @Override // cna
    public final boolean b() {
        return !this.F.i0;
    }

    @Override // cna
    public String getHeaderName() {
        return ob6.M0(2131754434, "AddEmailTitle");
    }

    @Override // cna
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
        qh6 qh6Var = this.F;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (qh6Var.G == 3) {
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
            i2 = ((e) qh6Var).currentAccount;
            ConnectionsManager.getInstance(i2).sendRequest(verifyemail, new m65(this, bundle, verifyemail, (byte) 8), 10);
            return;
        }
        if (TextUtils.isEmpty(obj)) {
            n();
            return;
        }
        this.r = true;
        qh6Var.B1(0, true);
        TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
        if (qh6Var.G == 3) {
            sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
        } else {
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup2.phone_number = this.x;
            tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.y;
            sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
        }
        sendverifyemailcode.email = obj;
        i = ((e) qh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(sendverifyemailcode, new m65(this, bundle, sendverifyemailcode, (byte) 9), 10);
    }

    @Override // cna
    public final void j() {
        hl.d3(new eg6(this, (byte) 0), qh6.A0);
    }

    @Override // cna
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

    @Override // cna
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

    @Override // cna
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
        lu7 lu7Var = this.a;
        if (this.F.getParentActivity() == null) {
            return;
        }
        try {
            lu7Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.b.requestFocus();
        qh6.E1(lu7Var, true);
        postDelayed(new eg6(this, (byte) 1), 300L);
    }

    @Override // cna
    public final void updateColors() {
        int i = aob.G6;
        this.c.setTextColor(aob.w0(null, i, false));
        int w0 = aob.w0(null, aob.D6, false);
        p66 p66Var = this.d;
        p66Var.setTextColor(w0);
        p66Var.setLinkTextColor(aob.w0(null, aob.Xc, false));
        this.b.setTextColor(aob.w0(null, i, false));
        this.e.setTextColor(aob.w0(null, aob.q6, false));
        this.f.updateColors();
        this.a.invalidate();
    }
}
