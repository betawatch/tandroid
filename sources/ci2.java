// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ci2 extends FrameLayout {
    public final View a;
    public final TextView b;

    public ci2(Activity activity) {
        super(activity);
        View view = new View(activity);
        this.a = view;
        int L = gl.L(4.0f);
        int i = bkb.Ei;
        int w0 = bkb.w0(null, i, false);
        int i2 = bkb.Gi;
        int w02 = bkb.w0(null, i2, false);
        Drawable i0 = bkb.i0(L, L, L, L, w0, w02, w02);
        vkb M = zkb.M(i);
        vkb M2 = zkb.M(i2);
        view.setBackground(i0);
        zkb.j(view, i0, M, M2, null);
        addView(view, nme.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView = new TextView(activity);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        tb4.w(textView, bkb.Ii, null, 1, 14.0f);
        addView(textView, nme.e(-2, -2, 17));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), TLObject.FLAG_30));
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
