// default package

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hm1 implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ d d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ hm1(mu1 mu1Var, TLRPC.User user, String str, boolean z, int i) {
        this.d = mu1Var;
        this.e = str;
        this.b = z;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Serializable serializable = this.e;
        int i = this.c;
        boolean z = this.b;
        d dVar = this.d;
        byte b2 = 0;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) dVar;
                String str = (String) serializable;
                Pattern pattern = ij.a;
                if (mu1Var.getParentActivity() != null) {
                    fx0 i2 = ug8.i(mu1Var.getParentActivity(), false, 1, null);
                    i2.P = k96.M0(z ? 2131752182 : 2131752181, null);
                    i2.Q = true;
                    LinearLayout linearLayout = new LinearLayout(mu1Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(mu1Var.getParentActivity());
                    linearLayout.addView(textView, nme.t(-1, -1, 0, 21, 0, 21, 8));
                    zkb.X(textView, bkb.F6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(gl.S2(k96.a0("ChatWithAdminMessage", null, 2131752180, str, k96.s(i, false))));
                    TextView textView2 = new TextView(mu1Var.getParentActivity());
                    textView2.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(gl.o());
                    textView2.setText(k96.M0(2131749082, null));
                    zkb.X(textView2, bkb.Ii, null);
                    int L = gl.L(8.0f);
                    int i3 = bkb.Ei;
                    int w0 = bkb.w0(null, i3, false);
                    int i4 = bkb.Gi;
                    int w02 = bkb.w0(null, i4, false);
                    ff0 i0 = bkb.i0(L, L, L, L, w0, w02, w02);
                    vkb M = zkb.M(i3);
                    vkb M2 = zkb.M(i4);
                    textView2.setBackground(i0);
                    zkb.j(textView2, i0, M, M2, null);
                    linearLayout.addView(textView2, nme.t(-1, 48, 0, 16, 12, 16, 8));
                    i2.O = linearLayout;
                    i2.show();
                    textView2.setOnClickListener(new dh(i2, b2));
                    break;
                }
                break;
            default:
                cj3 cj3Var = (cj3) dVar;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = k96.M0(2131743668, null);
                int i5 = bkb.wj;
                SpannableStringBuilder N2 = gl.N2(M0, i5, 0, new sg3(cj3Var, (byte) 18), null);
                SpannableString spannableString = new SpannableString(">");
                cm2 cm2Var = new cm2(R.drawable.attach_arrow_right, 0);
                cm2Var.y = bkb.w0(null, i5, false);
                cm2Var.I = 0.7f;
                cm2Var.J = 0.7f;
                cm2Var.F = gl.L(12.0f);
                spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
                gl.G2(N2, spannableString, ">");
                u21.b0(cj3Var).I(R.raw.contact_check, k96.M0(z ? 2131743669 : 2131743670, null), N2).j();
                na7.q1(i).P1().f(true, arrayList, new yvb((byte) 1));
                na7.q1(i).P1().a();
                break;
        }
    }

    public /* synthetic */ hm1(cj3 cj3Var, boolean z, int i, ArrayList arrayList) {
        this.d = cj3Var;
        this.b = z;
        this.c = i;
        this.e = arrayList;
    }
}
