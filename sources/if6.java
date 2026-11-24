// default package

import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class if6 extends kla {
    public final /* synthetic */ mh6 E;
    public final EditTextBoldCursor a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final s09 e;
    public Bundle f;
    public boolean h;
    public TL_account.Password n;
    public String r;
    public String s;
    public String w;
    public String x;
    public final gt7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public if6(mh6 mh6Var, Context context) {
        super(context);
        int i;
        this.E = mh6Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        s09 s09Var = new s09(context);
        this.e = s09Var;
        s09Var.f(R.raw.tsv_setup_intro, nm7.E1, nm7.E1, null);
        s09Var.setAutoRepeat(false);
        frameLayout.addView(s09Var, qoe.e(nm7.E1, nm7.E1, 1));
        byte b = 8;
        if (!gm.M1()) {
            Point point = gm.q;
            if (point.x <= point.y || gm.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, qoe.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(gm.o());
                textView.setText(jb6.M0(2131742466, null));
                textView.setGravity(17);
                textView.setLineSpacing(gm.L(2.0f), 1.0f);
                addView(textView, qoe.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(gm.L(2.0f), 1.0f);
                textView2.setText(jb6.M0(2131748481, null));
                addView(textView2, qoe.t(-2, -2, 1, 12, 8, 12, 0));
                gt7 gt7Var = new gt7(context, null);
                this.y = gt7Var;
                gt7Var.setText(jb6.M0(2131751053, null));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.a = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(gm.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 18.0f);
                editTextBoldCursor.setMaxLines(1);
                int L = gm.L(16.0f);
                editTextBoldCursor.setPadding(L, L, L, L);
                editTextBoldCursor.setInputType(nm7.M1);
                editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editTextBoldCursor.setTypeface(Typeface.DEFAULT);
                editTextBoldCursor.setGravity(!jb6.a0 ? 5 : 3);
                editTextBoldCursor.setOnFocusChangeListener(new tt0(this, b));
                gt7Var.e(editTextBoldCursor);
                gt7Var.addView(editTextBoldCursor, qoe.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 14));
                addView(gt7Var, qoe.t(-1, -2, 1, 16, 32, 16, 0));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                hg9.p(textView3, 19, null, 2131750523);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(gm.L(2.0f), 1.0f);
                textView3.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView3, qoe.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, qoe.r(-1, -1, 80));
                wm9.c(textView3);
                textView3.setOnClickListener(new n06(this, context, (byte) 6));
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, qoe.e(-1, -2, 1));
        TextView textView4 = new TextView(context);
        this.d = textView4;
        textView4.setTextSize(1, 18.0f);
        textView4.setTypeface(gm.o());
        textView4.setText(jb6.M0(2131742466, null));
        textView4.setGravity(17);
        textView4.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView4, qoe.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.b = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(gm.L(2.0f), 1.0f);
        textView22.setText(jb6.M0(2131748481, null));
        addView(textView22, qoe.t(-2, -2, 1, 12, 8, 12, 0));
        gt7 gt7Var2 = new gt7(context, null);
        this.y = gt7Var2;
        gt7Var2.setText(jb6.M0(2131751053, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(gm.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 18.0f);
        editTextBoldCursor2.setMaxLines(1);
        int L2 = gm.L(16.0f);
        editTextBoldCursor2.setPadding(L2, L2, L2, L2);
        editTextBoldCursor2.setInputType(nm7.M1);
        editTextBoldCursor2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor2.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor2.setGravity(!jb6.a0 ? 5 : 3);
        editTextBoldCursor2.setOnFocusChangeListener(new tt0(this, b));
        gt7Var2.e(editTextBoldCursor2);
        gt7Var2.addView(editTextBoldCursor2, qoe.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new j(this, (byte) 14));
        addView(gt7Var2, qoe.t(-1, -2, 1, 16, 32, 16, 0));
        TextView textView32 = new TextView(context);
        this.c = textView32;
        hg9.p(textView32, 19, null, 2131750523);
        textView32.setTextSize(1, 15.0f);
        textView32.setLineSpacing(gm.L(2.0f), 1.0f);
        textView32.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView32, qoe.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, qoe.r(-1, -1, 80));
        wm9.c(textView32);
        textView32.setOnClickListener(new n06(this, context, (byte) 6));
    }

    @Override // kla
    public final boolean b() {
        return true;
    }

    @Override // kla
    public final boolean d(boolean z) {
        this.h = false;
        this.E.y1(true, true);
        this.f = null;
        return true;
    }

    @Override // kla
    public final void e() {
        this.h = false;
    }

    @Override // kla
    public String getHeaderName() {
        return jb6.M0(2131748483, "LoginPassword");
    }

    @Override // kla
    public final void h(String str) {
        if (this.h || this.n == null) {
            return;
        }
        String obj = this.a.getText().toString();
        if (obj.length() == 0) {
            if (this.E.getParentActivity() == null) {
                return;
            }
            mh6.E1(this.y, true);
        } else {
            this.h = true;
            this.E.B1(0, true);
            Utilities.e.c(new k16(this, obj, (byte) 18));
        }
    }

    @Override // kla
    public final void j() {
        gm.d3(new kg5(this, (byte) 27), mh6.A0);
    }

    @Override // kla
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override // kla
    public final void l(Bundle bundle) {
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            bundle.putBundle("passview_params", bundle2);
        }
    }

    @Override // kla
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.a;
        if (isEmpty) {
            gm.t1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f = bundle;
        String string = bundle.getString("password");
        this.r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.s = bundle.getString("phoneFormated");
        this.w = bundle.getString("phoneHash");
        this.x = bundle.getString("code");
        TL_account.Password password = this.n;
        if (password == null || TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint((CharSequence) null);
        } else {
            editTextBoldCursor.setHint(this.n.hint);
        }
    }

    @Override // kla
    public final void updateColors() {
        int i = cmb.F6;
        this.d.setTextColor(cmb.w0(null, i, false));
        this.b.setTextColor(cmb.w0(null, cmb.C6, false));
        int w0 = cmb.w0(null, i, false);
        EditTextBoldCursor editTextBoldCursor = this.a;
        editTextBoldCursor.setTextColor(w0);
        editTextBoldCursor.setCursorColor(cmb.w0(null, i, false));
        editTextBoldCursor.setHintTextColor(cmb.w0(null, cmb.G6, false));
        this.c.setTextColor(cmb.w0(null, cmb.p6, false));
        this.y.f();
    }
}
