// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class ky8 extends nx0 {
    public final Bitmap l1;
    public final TextView m1;
    public final TextView n1;
    public final TextView o1;
    public final int p1;
    public final e29 q1;
    public boolean r1;
    public int s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky8(Context context, String str, String str2, String str3, boolean z) {
        super(1, (vnb) null, context, false);
        Bitmap bitmap;
        byte b = 1;
        byte b2 = 0;
        J();
        this.P = str;
        this.Q = true;
        d41 d41Var = new d41(context, (byte) 4);
        d41Var.setScaleType(ImageView.ScaleType.FIT_XY);
        d41Var.setOutlineProvider(new yi((byte) 12));
        d41Var.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, hl.L(16.0f), 0, 0);
        Bitmap bitmap2 = this.l1;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(i34.a, r44.c);
            hashMap.put(i34.c, 0);
            ekb ekbVar = new ekb((byte) 0);
            bitmap = ekbVar.a(str2, 768, 768, hashMap, bitmap2, 1.0f, -1, -16777216);
            this.p1 = ekbVar.e;
        } catch (Exception e) {
            cc4.g(e, true);
            bitmap = null;
        }
        this.l1 = bitmap;
        d41Var.setImageBitmap(bitmap);
        e29 e29Var = new e29(context);
        this.q1 = e29Var;
        e29Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        e29Var.setBackgroundColor(-1);
        b08 b08Var = new b08(this, context, d41Var);
        b08Var.addView(d41Var, tre.c(-1.0f, -1));
        b08Var.addView(e29Var, tre.e(60, 60, 17));
        linearLayout.addView(b08Var, tre.t(jn7.w3, jn7.w3, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.m1 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, tre.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.n1 = textView2;
        textView2.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setText(ob6.M0(2131745176, null));
        textView2.setOnClickListener(new jy8(this, context, b2));
        linearLayout.addView(textView2, tre.t(-1, 48, 80, 16, 15, 16, 3));
        if (z) {
            TextView textView3 = new TextView(context);
            this.o1 = textView3;
            textView3.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(ob6.M0(2131745186, null));
            textView3.setOnClickListener(new jy8(str2, context, b));
            linearLayout.addView(textView3, tre.t(-1, 48, 80, 16, 3, 16, 16));
        }
        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        this.O = scrollView;
    }

    public final void E0() {
        e29 e29Var = this.q1;
        e29Var.setAutoRepeat(true);
        e29Var.f(R.raw.qr_code_logo, 60, 60, null);
        e29Var.d();
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        try {
            int i = aob.Ji;
            int v0 = aob.v0(i, this.J0) * 31;
            int i2 = aob.Fi;
            int v02 = (aob.v0(i2, this.J0) * 17) + v0;
            int i3 = aob.Hi;
            int v03 = (aob.v0(i3, this.J0) * 13) + v02;
            int i4 = aob.i6;
            int v04 = (aob.v0(i4, this.J0) * 7) + v03;
            int i5 = aob.y6;
            int v05 = (aob.v0(i5, this.J0) * 5) + v04;
            int i6 = aob.G6;
            int v06 = (aob.v0(i6, this.J0) * 3) + v05;
            int i7 = aob.h5;
            int v07 = v06 + aob.v0(i7, this.J0);
            if (this.r1 && v07 == this.s1) {
                return;
            }
            this.r1 = true;
            this.s1 = v07;
            TextView textView = this.n1;
            if (textView != null) {
                textView.setTextColor(aob.v0(i, this.J0));
                aob.F1(textView.getBackground(), aob.v0(i2, this.J0), false);
                aob.F1(textView.getBackground(), aob.v0(i3, this.J0), true);
            }
            TextView textView2 = this.o1;
            if (textView2 != null) {
                textView2.setTextColor(aob.v0(i2, this.J0));
                aob.F1(textView2.getBackground(), vm2.o(aob.v0(i2, this.J0), Math.min(jn7.d4, Color.alpha(aob.v0(i4, this.J0)) << 1)), true);
            }
            TextView textView3 = this.m1;
            if (textView3 != null) {
                textView3.setTextColor(aob.v0(i5, this.J0));
            }
            fx0 fx0Var = this.m0;
            if (fx0Var != null) {
                fx0Var.setTextColor(aob.v0(i6, this.J0));
            }
            s0(aob.v0(i7, this.J0));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void updateColors() {
        int v0 = aob.v0(aob.Ji, this.J0);
        TextView textView = this.n1;
        textView.setTextColor(v0);
        int L = hl.L(24.0f);
        int i = aob.Fi;
        int v02 = aob.v0(i, this.J0);
        int v03 = aob.v0(aob.Hi, this.J0);
        textView.setBackground(aob.i0(L, L, L, L, v02, v03, v03));
        TextView textView2 = this.o1;
        if (textView2 != null) {
            textView2.setTextColor(aob.v0(i, this.J0));
            textView2.setBackground(aob.f0(vm2.o(aob.v0(i, this.J0), Math.min(jn7.d4, Color.alpha(aob.v0(aob.i6, this.J0)) << 1)), 7, -1));
        }
        int i2 = aob.y6;
        int v04 = aob.v0(i2, this.J0);
        TextView textView3 = this.m1;
        textView3.setTextColor(v04);
        textView3.setTextColor(aob.v0(i2, this.J0));
        fx0 fx0Var = this.m0;
        if (fx0Var != null) {
            fx0Var.setTextColor(aob.v0(aob.G6, this.J0));
        }
        s0(aob.v0(aob.h5, this.J0));
    }
}
