package fg;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import org.telegram.messenger.cd;
import org.telegram.messenger.m5;
import org.telegram.messenger.tz;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ e(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        l lVar = this.b;
        switch (i10) {
            case 0:
                k2 Q = LaunchActivity.Q();
                g5 g5Var = new g5(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof uu0) {
                    g5Var.i1 = (uu0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout e = m5.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (g5.j1 * 5.0f));
                int i11 = t6.n5;
                a7.V(textView, i11, null);
                z20.o(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                int i12 = 5;
                textView.setGravity((cd.X ? 3 : 5) | 48);
                e.addView(textView, b6.d(-2, -1.0f, (cd.X ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                nn0 nn0Var = new nn0(parentActivity);
                nn0Var.setDelegate(new m4.c(12, g5Var, textView));
                nn0Var.setReportChanges(true);
                e.addView(nn0Var, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + g5.l1);
                a7.V(textView2, i11, null);
                z20.o(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setGravity((cd.X ? 3 : 5) | 48);
                e.addView(textView2, b6.d(-2, -1.0f, (cd.X ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                nn0 nn0Var2 = new nn0(parentActivity);
                nn0Var2.setDelegate(new m5.e(g5Var, textView2, false, 9));
                nn0Var2.setReportChanges(true);
                e.addView(nn0Var2, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                a7.V(textView3, i11, null);
                z20.o(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setGravity((cd.X ? 3 : 5) | 48);
                e.addView(textView3, b6.d(-2, -1.0f, (cd.X ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                nn0 nn0Var3 = new nn0(parentActivity);
                nn0Var3.setDelegate(new org.telegram.ui.e(g5Var, i12));
                nn0Var3.setReportChanges(true);
                e.addView(nn0Var3, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e.addOnLayoutChangeListener(new f4(nn0Var, nn0Var3, nn0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e);
                g5Var.N = scrollView;
                g5Var.show();
                lVar.c(false);
                break;
            case 1:
                lVar.getClass();
                tz.K();
                Toast.makeText(lVar.getContext(), cd.L0(tz.J0 ? 2131751619 : 2131751620, null), 0).show();
                break;
            case 2:
                ProfileActivity.U4((Activity) lVar.getContext(), false);
                break;
            default:
                lVar.n = true;
                try {
                    lVar.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
