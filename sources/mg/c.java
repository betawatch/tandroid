package mg;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import n7.z0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.bi;
import org.telegram.messenger.q;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.j5;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                j5 j5Var = new j5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof mw0) {
                    j5Var.b = (mw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e7 = q.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (j5.c * 5.0f));
                int i10 = i6.n5;
                bi.s(textView, i6.w0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e7.addView(textView, z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                zo0 zo0Var = new zo0(parentActivity);
                zo0Var.setDelegate(new o0.a(j5Var, textView, false, 1));
                zo0Var.setReportChanges(true);
                e7.addView(zo0Var, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + j5.e);
                bi.s(textView2, i6.w0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e7.addView(textView2, z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                zo0 zo0Var2 = new zo0(parentActivity);
                zo0Var2.setDelegate(new z0(j5Var, textView2, false, 2));
                zo0Var2.setReportChanges(true);
                e7.addView(zo0Var2, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                bi.s(textView3, i6.w0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                e7.addView(textView3, z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                zo0 zo0Var3 = new zo0(parentActivity);
                zo0Var3.setDelegate(new org.telegram.ui.g(j5Var, 5));
                zo0Var3.setReportChanges(true);
                e7.addView(zo0Var3, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e7.addOnLayoutChangeListener(new j4(zo0Var, zo0Var3, zo0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e7);
                j5Var.setCustomView(scrollView);
                j5Var.show();
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
