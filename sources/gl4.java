// default package

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
                d Q = LaunchActivity.Q();
                xl0 xl0Var = new xl0(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof ela) {
                    xl0Var.l1 = (ela) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout l = td4.l(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (xl0.m1 * 5.0f));
                int i = cmb.m5;
                anb.X(textView, i, null);
                wi8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((jb6.a0 ? 3 : 5) | 48);
                l.addView(textView, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                dx9 dx9Var = new dx9(parentActivity);
                byte b2 = 10;
                dx9Var.setDelegate(new hi2(xl0Var, textView, z, b2));
                dx9Var.setReportChanges(true);
                l.addView(dx9Var, qoe.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + xl0.o1);
                anb.X(textView2, i, null);
                wi8.w(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setGravity((jb6.a0 ? 3 : 5) | 48);
                l.addView(textView2, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                dx9 dx9Var2 = new dx9(parentActivity);
                dx9Var2.setDelegate(new lx6(xl0Var, textView2, z, (byte) 9));
                dx9Var2.setReportChanges(true);
                l.addView(dx9Var2, qoe.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                anb.X(textView3, i, null);
                wi8.w(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setGravity((jb6.a0 ? 3 : 5) | 48);
                l.addView(textView3, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                dx9 dx9Var3 = new dx9(parentActivity);
                dx9Var3.setDelegate(new ni6(xl0Var, b2));
                dx9Var3.setReportChanges(true);
                l.addView(dx9Var3, qoe.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                l.addOnLayoutChangeListener(new wl0(dx9Var, dx9Var3, dx9Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(l);
                xl0Var.O = scrollView;
                xl0Var.show();
                ll4Var.c(false);
                break;
            case 1:
                gda.J();
                Toast.makeText(ll4Var.getContext(), jb6.M0(gda.F0 ? 2131751555 : 2131751556, null), 0).show();
                break;
            case 2:
                ProfileActivity.p3((Activity) ll4Var.getContext(), false);
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
