package ng;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import m2.t;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.g0;
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m5;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                m2 R = LaunchActivity.R();
                m5 m5Var = new m5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof ow0) {
                    m5Var.b = (ow0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e = g0.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (m5.c * 5.0f));
                int i10 = g6.n5;
                sk.u(textView, g6.x0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e.addView(textView, z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
                gp0 gp0Var = new gp0(parentActivity);
                gp0Var.setDelegate(new n3.b(m5Var, textView, false, 4));
                gp0Var.setReportChanges(true);
                e.addView(gp0Var, z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + m5.e);
                sk.u(textView2, g6.x0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e.addView(textView2, z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
                gp0 gp0Var2 = new gp0(parentActivity);
                gp0Var2.setDelegate(new t(m5Var, textView2, false, 10));
                gp0Var2.setReportChanges(true);
                e.addView(gp0Var2, z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                sk.u(textView3, g6.x0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e.addView(textView3, z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
                gp0 gp0Var3 = new gp0(parentActivity);
                gp0Var3.setDelegate(new org.telegram.ui.g(m5Var, 5));
                gp0Var3.setReportChanges(true);
                e.addView(gp0Var3, z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                e.addOnLayoutChangeListener(new i4(gp0Var, gp0Var3, gp0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e);
                m5Var.setCustomView(scrollView);
                m5Var.show();
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
