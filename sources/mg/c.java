package mg;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import n7.a1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.w1;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i5;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                o2 R = LaunchActivity.R();
                i5 i5Var = new i5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof qv0) {
                    i5Var.b = (qv0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f7 = w1.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (i5.c * 5.0f));
                int i10 = j6.n5;
                wl.r(textView, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f7.addView(textView, x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                go0 go0Var = new go0(parentActivity);
                go0Var.setDelegate(new o0.a(i5Var, textView, false, 1));
                go0Var.setReportChanges(true);
                f7.addView(go0Var, x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + i5.e);
                wl.r(textView2, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f7.addView(textView2, x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                go0 go0Var2 = new go0(parentActivity);
                go0Var2.setDelegate(new a1(i5Var, textView2, false, 2));
                go0Var2.setReportChanges(true);
                f7.addView(go0Var2, x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                wl.r(textView3, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f7.addView(textView3, x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                go0 go0Var3 = new go0(parentActivity);
                go0Var3.setDelegate(new org.telegram.ui.g(i5Var, 5));
                go0Var3.setReportChanges(true);
                f7.addView(go0Var3, x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f7.addOnLayoutChangeListener(new l4(go0Var, go0Var3, go0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f7);
                i5Var.setCustomView(scrollView);
                i5Var.show();
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
