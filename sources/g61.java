// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class g61 extends FrameLayout implements tjb {
    public final yc a;
    public final gn b;
    public final gn c;

    public g61(Context context) {
        super(context);
        yc ycVar = new yc((byte) 6, context, this);
        this.a = ycVar;
        int i = bkb.Ei;
        ycVar.setBackground(sjb.f(i, 24.0f));
        ycVar.setImportantForAccessibility(1);
        ote.b(ycVar, 0.02f, 1.2f);
        if (k96.a0) {
            TextView textView = new TextView(context);
            textView.setText(k96.M0(2131752086, null));
            textView.setGravity(17);
            ir2.t(textView, 1, 14.0f);
            zkb.X(textView, bkb.Ii, null);
            ycVar.addView(textView, nme.e(-2, -1, 17));
        }
        gn gnVar = new gn(true, true, true);
        this.b = gnVar;
        s33 s33Var = s33.h;
        gnVar.n(0.25f, 300L, s33Var);
        gnVar.setCallback(ycVar);
        gnVar.w(gl.L(14.0f));
        gnVar.t(k96.M0(2131752086, null), true, true);
        gnVar.b = 5;
        gnVar.x(gl.o());
        int i2 = bkb.Ii;
        gnVar.u(bkb.w0(null, i2, false));
        gn gnVar2 = new gn(true, true, true);
        this.c = gnVar2;
        gnVar2.n(0.25f, 300L, s33Var);
        gnVar2.setCallback(ycVar);
        gnVar2.w(gl.L(14.0f));
        gnVar2.x(gl.o());
        gnVar2.u(bkb.v(bkb.w0(null, i, false), bkb.p1(0.7f, bkb.w0(null, i2, false))));
        gnVar2.t("", true, true);
        ycVar.setContentDescription(TextUtils.concat(gnVar.i, "\t", gnVar2.i));
        addView(ycVar, nme.d(-1, 48.0f, kk7.D1, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j, boolean z) {
        String M0 = z ? k96.M0(2131752086, null) : k96.M0(2131752038, null);
        gn gnVar = this.b;
        gnVar.t(M0, true, true);
        String i0 = j <= 0 ? "" : gl.i0(j, false, false);
        gn gnVar2 = this.c;
        gnVar2.t(i0, true, true);
        setDisabled(j <= 0);
        yc ycVar = this.a;
        ycVar.invalidate();
        ycVar.setContentDescription(TextUtils.concat(gnVar.i, "\t", gnVar2.i));
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ei));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    public void setDisabled(boolean z) {
        yc ycVar = this.a;
        ycVar.animate().cancel();
        ycVar.animate().alpha(z ? 0.65f : 1.0f).start();
        ycVar.setClickable(!z);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            gn gnVar = this.b;
            if (gnVar != null) {
                gnVar.u(bkb.w0(null, bkb.Ii, false));
            }
            gn gnVar2 = this.c;
            if (gnVar2 != null) {
                gnVar2.u(bkb.v(bkb.w0(null, bkb.Ei, false), bkb.p1(0.7f, bkb.w0(null, bkb.Ii, false))));
            }
            yc ycVar = this.a;
            if (ycVar != null) {
                ycVar.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
