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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lf6 extends cna {
    public final /* synthetic */ qh6 E;
    public final EditTextBoldCursor a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final e29 e;
    public Bundle f;
    public boolean h;
    public TL_account.Password n;
    public String r;
    public String s;
    public String w;
    public String x;
    public final lu7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lf6(qh6 qh6Var, Context context) {
        super(context);
        int i;
        this.E = qh6Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e29 e29Var = new e29(context);
        this.e = e29Var;
        e29Var.f(R.raw.tsv_setup_intro, jn7.E1, jn7.E1, null);
        e29Var.setAutoRepeat(false);
        frameLayout.addView(e29Var, tre.e(jn7.E1, jn7.E1, 1));
        byte b = 8;
        if (!hl.M1()) {
            Point point = hl.q;
            if (point.x <= point.y || hl.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, tre.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(hl.o());
                textView.setText(ob6.M0(2131742434, null));
                textView.setGravity(17);
                textView.setLineSpacing(hl.L(2.0f), 1.0f);
                addView(textView, tre.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(1);
                textView2.setLineSpacing(hl.L(2.0f), 1.0f);
                textView2.setText(ob6.M0(2131748478, null));
                addView(textView2, tre.t(-2, -2, 1, 12, 8, 12, 0));
                lu7 lu7Var = new lu7(context, null);
                this.y = lu7Var;
                lu7Var.setText(ob6.M0(2131751081, null));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.a = editTextBoldCursor;
                editTextBoldCursor.setCursorSize(hl.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setImeOptions(268435461);
                editTextBoldCursor.setTextSize(1, 18.0f);
                editTextBoldCursor.setMaxLines(1);
                int L = hl.L(16.0f);
                editTextBoldCursor.setPadding(L, L, L, L);
                editTextBoldCursor.setInputType(jn7.M1);
                editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editTextBoldCursor.setTypeface(Typeface.DEFAULT);
                editTextBoldCursor.setGravity(!ob6.a0 ? 5 : 3);
                editTextBoldCursor.setOnFocusChangeListener(new ts0(this, b));
                lu7Var.e(editTextBoldCursor);
                lu7Var.addView(editTextBoldCursor, tre.e(-1, -2, 48));
                editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 13));
                addView(lu7Var, tre.t(-1, -2, 1, 16, 32, 16, 0));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                uh9.q(textView3, 19, null, 2131750551);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(hl.L(2.0f), 1.0f);
                textView3.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(textView3, tre.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, tre.r(-1, -1, 80));
                ko9.e(textView3);
                textView3.setOnClickListener(new uv5(this, context, b));
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, tre.e(-1, -2, 1));
        TextView textView4 = new TextView(context);
        this.d = textView4;
        textView4.setTextSize(1, 18.0f);
        textView4.setTypeface(hl.o());
        textView4.setText(ob6.M0(2131742434, null));
        textView4.setGravity(17);
        textView4.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView4, tre.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.b = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(1);
        textView22.setLineSpacing(hl.L(2.0f), 1.0f);
        textView22.setText(ob6.M0(2131748478, null));
        addView(textView22, tre.t(-2, -2, 1, 12, 8, 12, 0));
        lu7 lu7Var2 = new lu7(context, null);
        this.y = lu7Var2;
        lu7Var2.setText(ob6.M0(2131751081, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.a = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(hl.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setImeOptions(268435461);
        editTextBoldCursor2.setTextSize(1, 18.0f);
        editTextBoldCursor2.setMaxLines(1);
        int L2 = hl.L(16.0f);
        editTextBoldCursor2.setPadding(L2, L2, L2, L2);
        editTextBoldCursor2.setInputType(jn7.M1);
        editTextBoldCursor2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor2.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor2.setGravity(!ob6.a0 ? 5 : 3);
        editTextBoldCursor2.setOnFocusChangeListener(new ts0(this, b));
        lu7Var2.e(editTextBoldCursor2);
        lu7Var2.addView(editTextBoldCursor2, tre.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new j(this, (byte) 13));
        addView(lu7Var2, tre.t(-1, -2, 1, 16, 32, 16, 0));
        TextView textView32 = new TextView(context);
        this.c = textView32;
        uh9.q(textView32, 19, null, 2131750551);
        textView32.setTextSize(1, 15.0f);
        textView32.setLineSpacing(hl.L(2.0f), 1.0f);
        textView32.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(textView32, tre.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, tre.r(-1, -1, 80));
        ko9.e(textView32);
        textView32.setOnClickListener(new uv5(this, context, b));
    }

    @Override // cna
    public final boolean b() {
        return true;
    }

    @Override // cna
    public final boolean c(boolean z) {
        this.h = false;
        this.E.y1(true, true);
        this.f = null;
        return true;
    }

    @Override // cna
    public final void d() {
        this.h = false;
    }

    @Override // cna
    public String getHeaderName() {
        return ob6.M0(2131748480, "LoginPassword");
    }

    @Override // cna
    public final void h(String str) {
        if (this.h || this.n == null) {
            return;
        }
        String obj = this.a.getText().toString();
        if (obj.length() == 0) {
            if (this.E.getParentActivity() == null) {
                return;
            }
            qh6.E1(this.y, true);
        } else {
            this.h = true;
            this.E.B1(0, true);
            Utilities.e.c(new z56(this, obj, (byte) 14));
        }
    }

    @Override // cna
    public final void j() {
        hl.d3(new z96(this, (byte) 5), qh6.A0);
    }

    @Override // cna
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

    @Override // cna
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

    @Override // cna
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.a;
        if (isEmpty) {
            hl.t1(editTextBoldCursor);
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

    @Override // cna
    public final void updateColors() {
        int i = aob.G6;
        this.d.setTextColor(aob.w0(null, i, false));
        this.b.setTextColor(aob.w0(null, aob.D6, false));
        int w0 = aob.w0(null, i, false);
        EditTextBoldCursor editTextBoldCursor = this.a;
        editTextBoldCursor.setTextColor(w0);
        editTextBoldCursor.setCursorColor(aob.w0(null, i, false));
        editTextBoldCursor.setHintTextColor(aob.w0(null, aob.H6, false));
        this.c.setTextColor(aob.w0(null, aob.q6, false));
        this.y.f();
    }
}
