package mg;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import n4.y;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.l0;
import org.telegram.messenger.rk;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i5;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                i5 i5Var = new i5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof aw0) {
                    i5Var.b = (aw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e = l0.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (i5.c * 5.0f));
                int i10 = j6.n5;
                rk.t(textView, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e.addView(textView, y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                so0 so0Var = new so0(parentActivity);
                so0Var.setDelegate(new m5.e(i5Var, textView, false, 5));
                so0Var.setReportChanges(true);
                e.addView(so0Var, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + i5.e);
                rk.t(textView2, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e.addView(textView2, y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                so0 so0Var2 = new so0(parentActivity);
                so0Var2.setDelegate(new y(i5Var, textView2, false));
                so0Var2.setReportChanges(true);
                e.addView(so0Var2, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                rk.t(textView3, j6.w0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e.addView(textView3, y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                so0 so0Var3 = new so0(parentActivity);
                so0Var3.setDelegate(new org.telegram.ui.g(i5Var, 5));
                so0Var3.setReportChanges(true);
                e.addView(so0Var3, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e.addOnLayoutChangeListener(new k4(so0Var, so0Var3, so0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e);
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
