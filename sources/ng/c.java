package ng;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.q;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n5;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ c(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n2 R = LaunchActivity.R();
                n5 n5Var = new n5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof jw0) {
                    n5Var.b = (jw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e = q.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (n5.c * 5.0f));
                int i10 = h6.n5;
                wh.u(textView, h6.x0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e.addView(textView, z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
                cp0 cp0Var = new cp0(parentActivity);
                cp0Var.setDelegate(new n2.e(n5Var, textView, false, 5));
                cp0Var.setReportChanges(true);
                e.addView(cp0Var, z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + n5.e);
                wh.u(textView2, h6.x0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e.addView(textView2, z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
                cp0 cp0Var2 = new cp0(parentActivity);
                cp0Var2.setDelegate(new mi.q(n5Var, textView2, false, 8));
                cp0Var2.setReportChanges(true);
                e.addView(cp0Var2, z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                wh.u(textView3, h6.x0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e.addView(textView3, z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
                cp0 cp0Var3 = new cp0(parentActivity);
                cp0Var3.setDelegate(new org.telegram.ui.g(n5Var, 5));
                cp0Var3.setReportChanges(true);
                e.addView(cp0Var3, z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                e.addOnLayoutChangeListener(new k4(cp0Var, cp0Var3, cp0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e);
                n5Var.setCustomView(scrollView);
                n5Var.show();
                this.b.c(false);
                break;
            case 1:
                i iVar = this.b;
                iVar.getClass();
                SharedConfig.toggleDebugWebView();
                Toast.makeText(iVar.getContext(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                break;
            case 2:
                ProfileActivity.H4((Activity) this.b.getContext(), false);
                break;
            default:
                i iVar2 = this.b;
                iVar2.n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
