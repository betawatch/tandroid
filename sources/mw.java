// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mw extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;
    public final boolean d;

    public mw(o oVar, Activity activity, boolean z) {
        super(activity);
        this.d = z;
        setTag(90);
        TextView textView = new TextView(activity);
        this.a = textView;
        tb4.u(12.0f, z ? 2131746725 : 2131746726, 1, textView, null);
        textView.setGravity(17);
        textView.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        addView(textView, nme.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        addView(textView2, nme.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30));
    }
}
