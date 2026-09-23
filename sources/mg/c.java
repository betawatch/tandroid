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
import org.telegram.messenger.ul;
import org.telegram.messenger.z0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.j5;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                if (R.getFragmentView() instanceof pv0) {
                    j5Var.b = (pv0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f7 = z0.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (j5.c * 5.0f));
                int i10 = h6.n5;
                ul.s(textView, h6.w0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f7.addView(textView, x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                fo0 fo0Var = new fo0(parentActivity);
                fo0Var.setDelegate(new o0.a(j5Var, textView, false, 1));
                fo0Var.setReportChanges(true);
                f7.addView(fo0Var, x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + j5.e);
                ul.s(textView2, h6.w0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f7.addView(textView2, x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                fo0 fo0Var2 = new fo0(parentActivity);
                fo0Var2.setDelegate(new a1(j5Var, textView2, false, 2));
                fo0Var2.setReportChanges(true);
                f7.addView(fo0Var2, x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                ul.s(textView3, h6.w0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f7.addView(textView3, x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                fo0 fo0Var3 = new fo0(parentActivity);
                fo0Var3.setDelegate(new org.telegram.ui.g(j5Var, 5));
                fo0Var3.setReportChanges(true);
                f7.addView(fo0Var3, x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f7.addOnLayoutChangeListener(new j4(fo0Var, fo0Var3, fo0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f7);
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
