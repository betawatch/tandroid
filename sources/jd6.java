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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jd6 extends jja {
    public final /* synthetic */ mf6 E;
    public final EditTextBoldCursor a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ry8 e;
    public Bundle f;
    public boolean h;
    public TL_account.Password n;
    public String r;
    public String s;
    public String w;
    public String x;
    public final er7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jd6(mf6 mf6Var, Context context) {
        super(context);
        int i;
        this.E = mf6Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ry8 ry8Var = new ry8(context);
        this.e = ry8Var;
        ry8Var.f(R.raw.tsv_setup_intro, 120, 120, null);
        ry8Var.setAutoRepeat(false);
        frameLayout.addView(ry8Var, nme.e(120, 120, 1));
        byte b = 8;
        if (!gl.M1()) {
            Point point = gl.q;
            if (point.x <= point.y || gl.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, nme.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(gl.o());
                textView.setText(k96.M0(2131742540, null));
                textView.setGravity(17);
                textView.setLineSpacing(gl.L(2.0f), 1.0f);
                addView(textView, nme.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(gl.L(2.0f), 1.0f);
                textView2.setText(k96.M0(2131748532, null));
                addView(textView2, nme.t(-2, -2, 1, 12, 8, 12, 0));
                er7 er7Var = new er7(context, null);
                this.y = er7Var;
                er7Var.setText(k96.M0(2131751104, null));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.a = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(gl.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 18.0f);
                editTextBoldCursor.setMaxLines(1);
                int L = gl.L(16.0f);
                editTextBoldCursor.setPadding(L, L, L, L);
                editTextBoldCursor.setInputType(kk7.M1);
                editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editTextBoldCursor.setTypeface(Typeface.DEFAULT);
                byte b2 = 5;
                editTextBoldCursor.setGravity(!k96.a0 ? 5 : 3);
                editTextBoldCursor.setOnFocusChangeListener(new ls0(this, b));
                er7Var.e(editTextBoldCursor);
                er7Var.addView(editTextBoldCursor, nme.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 13));
                addView(er7Var, nme.t(-1, -2, 1, 16, 32, 16, 0));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                de9.q(textView3, 19, null, 2131750574);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(gl.L(2.0f), 1.0f);
                textView3.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView3, nme.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, nme.r(-1, -1, 80));
                vk9.c(textView3);
                textView3.setOnClickListener(new v16(this, context, b2));
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, nme.e(-1, -2, 1));
        TextView textView4 = new TextView(context);
        this.d = textView4;
        textView4.setTextSize(1, 18.0f);
        textView4.setTypeface(gl.o());
        textView4.setText(k96.M0(2131742540, null));
        textView4.setGravity(17);
        textView4.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView4, nme.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.b = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(gl.L(2.0f), 1.0f);
        textView22.setText(k96.M0(2131748532, null));
        addView(textView22, nme.t(-2, -2, 1, 12, 8, 12, 0));
        er7 er7Var2 = new er7(context, null);
        this.y = er7Var2;
        er7Var2.setText(k96.M0(2131751104, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(gl.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 18.0f);
        editTextBoldCursor2.setMaxLines(1);
        int L2 = gl.L(16.0f);
        editTextBoldCursor2.setPadding(L2, L2, L2, L2);
        editTextBoldCursor2.setInputType(kk7.M1);
        editTextBoldCursor2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor2.setTypeface(Typeface.DEFAULT);
        byte b22 = 5;
        editTextBoldCursor2.setGravity(!k96.a0 ? 5 : 3);
        editTextBoldCursor2.setOnFocusChangeListener(new ls0(this, b));
        er7Var2.e(editTextBoldCursor2);
        er7Var2.addView(editTextBoldCursor2, nme.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new j(this, (byte) 13));
        addView(er7Var2, nme.t(-1, -2, 1, 16, 32, 16, 0));
        TextView textView32 = new TextView(context);
        this.c = textView32;
        de9.q(textView32, 19, null, 2131750574);
        textView32.setTextSize(1, 15.0f);
        textView32.setLineSpacing(gl.L(2.0f), 1.0f);
        textView32.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView32, nme.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, nme.r(-1, -1, 80));
        vk9.c(textView32);
        textView32.setOnClickListener(new v16(this, context, b22));
    }

    @Override // jja
    public final boolean b() {
        return true;
    }

    @Override // jja
    public final boolean d(boolean z) {
        this.h = false;
        this.E.x1(true, true);
        this.f = null;
        return true;
    }

    @Override // jja
    public final void e() {
        this.h = false;
    }

    @Override // jja
    public String getHeaderName() {
        return k96.M0(2131748534, "LoginPassword");
    }

    @Override // jja
    public final void h(String str) {
        if (this.h || this.n == null) {
            return;
        }
        String obj = this.a.getText().toString();
        if (obj.length() == 0) {
            if (this.E.getParentActivity() == null) {
                return;
            }
            mf6.D1(this.y, true);
        } else {
            this.h = true;
            this.E.A1(0, true);
            Utilities.e.c(new kz5(this, obj, (byte) 17));
        }
    }

    @Override // jja
    public final void j() {
        gl.d3(new tp5(this, (byte) 20), mf6.A0);
    }

    @Override // jja
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

    @Override // jja
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

    @Override // jja
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.a;
        if (isEmpty) {
            gl.t1(editTextBoldCursor);
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

    @Override // jja
    public final void updateColors() {
        int i = bkb.F6;
        this.d.setTextColor(bkb.w0(null, i, false));
        this.b.setTextColor(bkb.w0(null, bkb.C6, false));
        int w0 = bkb.w0(null, i, false);
        EditTextBoldCursor editTextBoldCursor = this.a;
        editTextBoldCursor.setTextColor(w0);
        editTextBoldCursor.setCursorColor(bkb.w0(null, i, false));
        editTextBoldCursor.setHintTextColor(bkb.w0(null, bkb.G6, false));
        this.c.setTextColor(bkb.w0(null, bkb.p6, false));
        this.y.f();
    }
}
