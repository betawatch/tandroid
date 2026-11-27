// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class by4 extends nx0 {
    public static final /* synthetic */ int l1 = 0;

    public by4(Activity activity, e eVar) {
        super(activity, true);
        int i = 0;
        this.w0 = false;
        this.v0 = false;
        LinearLayout m = bs2.m(activity, 1);
        this.O = m;
        e29 e29Var = new e29(activity);
        e29Var.setAutoRepeat(true);
        e29Var.f(R.raw.utyan_gigagroup, jn7.E1, jn7.E1, null);
        e29Var.d();
        m.addView(e29Var, tre.t(jn7.p2, jn7.p2, 49, 17, 30, 17, 0));
        TextView textView = new TextView(activity);
        ik8.v(textView, 1, 24.0f);
        ik8.x(textView, aob.j5, null, null, 2131749325);
        m.addView(textView, tre.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        m.addView(linearLayout, tre.t(-2, -2, 1, 0, 12, 0, 0));
        int i2 = 0;
        while (true) {
            byte b = 2;
            if (i2 >= 3) {
                int i3 = i;
                ay4 ay4Var = new ay4(activity);
                View view = new View(activity);
                ay4Var.a = view;
                int i4 = aob.Fi;
                float[] fArr = new float[1];
                fArr[i3] = 4.0f;
                view.setBackground(rnb.f(i4, fArr));
                ay4Var.addView(view, tre.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView2 = new TextView(activity);
                ay4Var.b = textView2;
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                qd4.w(textView2, aob.Ji, null, 1, 14.0f);
                ay4Var.addView(textView2, tre.e(-2, -2, 17));
                ay4Var.setBackground(null);
                ay4Var.setText(ob6.M0(2131749326, null));
                view.setOnClickListener(new lw4(this, activity, eVar, b));
                m.addView(ay4Var, tre.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView3 = new TextView(activity);
                textView3.setTextSize(1, 14.0f);
                ik8.x(textView3, aob.n5, null, null, 2131749331);
                textView3.setGravity(17);
                m.addView(textView3, tre.t(-2, 48, 49, 17, 0, 17, 16));
                textView3.setOnClickListener(new mh3(this, (byte) 26));
                return;
            }
            LinearLayout m2 = bs2.m(activity, i);
            linearLayout.addView(m2, tre.t(-2, -2, ob6.a0 ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(activity);
            int i5 = aob.r5;
            yob.s(imageView, i5, null, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView4 = new TextView(activity);
            int i6 = i;
            textView4.setTextSize(1, 15.0f);
            yob.X(textView4, i5, null);
            textView4.setGravity((ob6.a0 ? 5 : 3) | 16);
            textView4.setMaxWidth(hl.L(260.0f));
            if (i2 == 0) {
                textView4.setText(ob6.M0(2131749329, null));
            } else if (i2 == 1) {
                textView4.setText(ob6.M0(2131749328, null));
            } else if (i2 == 2) {
                textView4.setText(ob6.M0(2131749327, null));
            }
            if (ob6.a0) {
                m2.addView(textView4, tre.o(-2, -2));
                m2.addView(imageView, tre.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                m2.addView(imageView, tre.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                m2.addView(textView4, tre.o(-2, -2));
            }
            i2++;
            i = i6;
        }
    }

    public abstract void F0();

    public void E0() {
    }
}
