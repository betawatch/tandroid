// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.DataAutoDownloadActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class n63 extends wl6 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ilb f;
    public final /* synthetic */ wkb[] h;
    public final /* synthetic */ AnimatorSet[] n;
    public final /* synthetic */ DataAutoDownloadActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n63(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i, ilb ilbVar, wkb[] wkbVarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.r = dataAutoDownloadActivity;
        this.e = i;
        this.f = ilbVar;
        this.h = wkbVarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        yob.X(textView, aob.j5, null);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((ob6.a0 ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, tre.d(-1, -1.0f, (ob6.a0 ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        yob.X(textView2, aob.n5, null);
        ik8.w(textView2, 1, 16.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity((ob6.a0 ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, tre.d(-2, -1.0f, (ob6.a0 ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        bz0 bz0Var = new bz0(activity);
        this.c = bz0Var;
        bz0Var.setReportChanges(true);
        bz0Var.setDelegate(new kj4(this, (byte) 15));
        bz0Var.setImportantForAccessibility(2);
        addView(bz0Var, tre.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(bz0Var.getSeekBarAccessibilityDelegate());
    }
}
