// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.DataAutoDownloadActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h73 extends ul6 {
    public final /* synthetic */ int e;
    public final /* synthetic */ njb f;
    public final /* synthetic */ bjb[] h;
    public final /* synthetic */ AnimatorSet[] n;
    public final /* synthetic */ DataAutoDownloadActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h73(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i, njb njbVar, bjb[] bjbVarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.r = dataAutoDownloadActivity;
        this.e = i;
        this.f = njbVar;
        this.h = bjbVarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        anb.X(textView, cmb.i5, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((jb6.a0 ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, qoe.d(-1, -1.0f, (jb6.a0 ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        anb.X(textView2, cmb.m5, null);
        wi8.w(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity((jb6.a0 ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        a01 a01Var = new a01(activity);
        this.c = a01Var;
        a01Var.setReportChanges(true);
        a01Var.setDelegate(new lj4(this));
        a01Var.setImportantForAccessibility(2);
        addView(a01Var, qoe.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(a01Var.getSeekBarAccessibilityDelegate());
    }
}
