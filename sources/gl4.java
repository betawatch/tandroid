// default package

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gl4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ll4 b;

    public /* synthetic */ gl4(ll4 ll4Var, byte b) {
        this.a = b;
        this.b = ll4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ll4 ll4Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                e Q = LaunchActivity.Q();
                yk0 yk0Var = new yk0(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof wma) {
                    yk0Var.l1 = (wma) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout m = bs2.m(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (yk0.m1 * 5.0f));
                int i = aob.n5;
                yob.X(textView, i, null);
                ik8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((ob6.a0 ? 3 : 5) | 48);
                m.addView(textView, tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                uy9 uy9Var = new uy9(parentActivity);
                uy9Var.setDelegate(new qx6((Object) yk0Var, (Object) textView, (byte) 8));
                uy9Var.setReportChanges(true);
                m.addView(uy9Var, tre.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + yk0.o1);
                yob.X(textView2, i, null);
                ik8.w(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setGravity((ob6.a0 ? 3 : 5) | 48);
                m.addView(textView2, tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                uy9 uy9Var2 = new uy9(parentActivity);
                byte b2 = 10;
                uy9Var2.setDelegate(new lh2(yk0Var, textView2, z, b2));
                uy9Var2.setReportChanges(true);
                m.addView(uy9Var2, tre.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                yob.X(textView3, i, null);
                ik8.w(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setGravity((ob6.a0 ? 3 : 5) | 48);
                m.addView(textView3, tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                uy9 uy9Var3 = new uy9(parentActivity);
                uy9Var3.setDelegate(new ri6(yk0Var, b2));
                uy9Var3.setReportChanges(true);
                m.addView(uy9Var3, tre.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                m.addOnLayoutChangeListener(new xk0(uy9Var, uy9Var3, uy9Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(m);
                yk0Var.O = scrollView;
                yk0Var.show();
                ll4Var.c(false);
                break;
            case 1:
                xea.J();
                Toast.makeText(ll4Var.getContext(), ob6.M0(xea.F0 ? 2131751583 : 2131751584, null), 0).show();
                break;
            case 2:
                ProfileActivity.m3((Activity) ll4Var.getContext(), false);
                break;
            default:
                ll4Var.n = true;
                try {
                    ll4Var.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
