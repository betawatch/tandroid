// default package

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cj4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hj4 b;

    public /* synthetic */ cj4(hj4 hj4Var, byte b) {
        this.a = b;
        this.b = hj4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hj4 hj4Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                d Q = LaunchActivity.Q();
                xk0 xk0Var = new xk0(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof cja) {
                    xk0Var.l1 = (cja) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout m = ir2.m(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (xk0.m1 * 5.0f));
                int i = bkb.m5;
                zkb.X(textView, i, null);
                ug8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((k96.a0 ? 3 : 5) | 48);
                m.addView(textView, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                av9 av9Var = new av9(parentActivity);
                av9Var.setDelegate(new lv6((Object) xk0Var, (Object) textView, (byte) 8));
                av9Var.setReportChanges(true);
                m.addView(av9Var, nme.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + xk0.o1);
                zkb.X(textView2, i, null);
                ug8.w(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setGravity((k96.a0 ? 3 : 5) | 48);
                m.addView(textView2, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                av9 av9Var2 = new av9(parentActivity);
                av9Var2.setDelegate(new tg2(xk0Var, textView2, z, (byte) 10));
                av9Var2.setReportChanges(true);
                m.addView(av9Var2, nme.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                zkb.X(textView3, i, null);
                ug8.w(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setGravity((k96.a0 ? 3 : 5) | 48);
                m.addView(textView3, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                av9 av9Var3 = new av9(parentActivity);
                av9Var3.setDelegate(new l69(xk0Var, (byte) 11));
                av9Var3.setReportChanges(true);
                m.addView(av9Var3, nme.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                m.addOnLayoutChangeListener(new wk0(av9Var, av9Var3, av9Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(m);
                xk0Var.O = scrollView;
                xk0Var.show();
                hj4Var.c(false);
                break;
            case 1:
                gba.J();
                Toast.makeText(hj4Var.getContext(), k96.M0(gba.F0 ? 2131751606 : 2131751607, null), 0).show();
                break;
            case 2:
                ProfileActivity.l3((Activity) hj4Var.getContext(), false);
                break;
            default:
                hj4Var.n = true;
                try {
                    hj4Var.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
