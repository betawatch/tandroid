// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class n71 extends FrameLayout implements vlb {
    public final yd a;
    public final ho b;
    public final ho c;

    public n71(Context context) {
        super(context);
        yd ydVar = new yd((byte) 6, context, this);
        this.a = ydVar;
        int i = cmb.Ei;
        ydVar.setBackground(ulb.f(i, 24.0f));
        ydVar.setImportantForAccessibility(1);
        rve.b(ydVar, 0.02f, 1.2f);
        if (jb6.a0) {
            TextView textView = new TextView(context);
            textView.setText(jb6.M0(2131752035, null));
            textView.setGravity(17);
            ts2.s(textView, 1, 14.0f);
            anb.X(textView, cmb.Ii, null);
            ydVar.addView(textView, qoe.e(-2, -1, 17));
        }
        ho hoVar = new ho(true, true, true);
        this.b = hoVar;
        d53 d53Var = d53.h;
        hoVar.n(0.25f, 300L, d53Var);
        hoVar.setCallback(ydVar);
        hoVar.w(gm.L(14.0f));
        hoVar.t(jb6.M0(2131752035, null), true, true);
        hoVar.b = 5;
        hoVar.x(gm.o());
        int i2 = cmb.Ii;
        hoVar.u(cmb.w0(null, i2, false));
        ho hoVar2 = new ho(true, true, true);
        this.c = hoVar2;
        hoVar2.n(0.25f, 300L, d53Var);
        hoVar2.setCallback(ydVar);
        hoVar2.w(gm.L(14.0f));
        hoVar2.x(gm.o());
        hoVar2.u(cmb.v(cmb.w0(null, i, false), cmb.p1(0.7f, cmb.w0(null, i2, false))));
        hoVar2.t("", true, true);
        ydVar.setContentDescription(TextUtils.concat(hoVar.i, "\t", hoVar2.i));
        addView(ydVar, qoe.d(-1, 48.0f, nm7.D1, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j, boolean z) {
        String M0 = z ? jb6.M0(2131752035, null) : jb6.M0(2131751987, null);
        ho hoVar = this.b;
        hoVar.t(M0, true, true);
        String i0 = j <= 0 ? "" : gm.i0(j, false, false);
        ho hoVar2 = this.c;
        hoVar2.t(i0, true, true);
        setDisabled(j <= 0);
        yd ydVar = this.a;
        ydVar.invalidate();
        ydVar.setContentDescription(TextUtils.concat(hoVar.i, "\t", hoVar2.i));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ei));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    public void setDisabled(boolean z) {
        yd ydVar = this.a;
        ydVar.animate().cancel();
        ydVar.animate().alpha(z ? 0.65f : 1.0f).start();
        ydVar.setClickable(!z);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            ho hoVar = this.b;
            if (hoVar != null) {
                hoVar.u(cmb.w0(null, cmb.Ii, false));
            }
            ho hoVar2 = this.c;
            if (hoVar2 != null) {
                hoVar2.u(cmb.v(cmb.w0(null, cmb.Ei, false), cmb.p1(0.7f, cmb.w0(null, cmb.Ii, false))));
            }
            yd ydVar = this.a;
            if (ydVar != null) {
                ydVar.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
