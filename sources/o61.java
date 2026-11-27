// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class o61 extends FrameLayout implements snb {
    public final zc a;
    public final hn b;
    public final hn c;

    public o61(Context context) {
        super(context);
        zc zcVar = new zc((byte) 6, context, this);
        this.a = zcVar;
        int i = aob.Fi;
        zcVar.setBackground(rnb.f(i, 24.0f));
        zcVar.setImportantForAccessibility(1);
        iye.b(zcVar, 0.02f, 1.2f);
        if (ob6.a0) {
            TextView textView = new TextView(context);
            textView.setText(ob6.M0(2131752063, null));
            textView.setGravity(17);
            bs2.t(textView, 1, 14.0f);
            yob.X(textView, aob.Ji, null);
            zcVar.addView(textView, tre.e(-2, -1, 17));
        }
        hn hnVar = new hn(true, true, true);
        this.b = hnVar;
        k43 k43Var = k43.h;
        hnVar.n(0.25f, 300L, k43Var);
        hnVar.setCallback(zcVar);
        hnVar.w(hl.L(14.0f));
        hnVar.t(ob6.M0(2131752063, null), true, true);
        hnVar.b = 5;
        hnVar.x(hl.o());
        int i2 = aob.Ji;
        hnVar.u(aob.w0(null, i2, false));
        hn hnVar2 = new hn(true, true, true);
        this.c = hnVar2;
        hnVar2.n(0.25f, 300L, k43Var);
        hnVar2.setCallback(zcVar);
        hnVar2.w(hl.L(14.0f));
        hnVar2.x(hl.o());
        hnVar2.u(aob.v(aob.w0(null, i, false), aob.p1(0.7f, aob.w0(null, i2, false))));
        hnVar2.t("", true, true);
        zcVar.setContentDescription(TextUtils.concat(hnVar.i, "\t", hnVar2.i));
        addView(zcVar, tre.d(-1, 48.0f, jn7.D1, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j, boolean z) {
        String M0 = z ? ob6.M0(2131752063, null) : ob6.M0(2131752015, null);
        hn hnVar = this.b;
        hnVar.t(M0, true, true);
        String i0 = j <= 0 ? "" : hl.i0(j, false, false);
        hn hnVar2 = this.c;
        hnVar2.t(i0, true, true);
        setDisabled(j <= 0);
        zc zcVar = this.a;
        zcVar.invalidate();
        zcVar.setContentDescription(TextUtils.concat(hnVar.i, "\t", hnVar2.i));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Fi));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    public void setDisabled(boolean z) {
        zc zcVar = this.a;
        zcVar.animate().cancel();
        zcVar.animate().alpha(z ? 0.65f : 1.0f).start();
        zcVar.setClickable(!z);
    }

    @Override // snb
    public final void updateColors() {
        try {
            hn hnVar = this.b;
            if (hnVar != null) {
                hnVar.u(aob.w0(null, aob.Ji, false));
            }
            hn hnVar2 = this.c;
            if (hnVar2 != null) {
                hnVar2.u(aob.v(aob.w0(null, aob.Fi, false), aob.p1(0.7f, aob.w0(null, aob.Ji, false))));
            }
            zc zcVar = this.a;
            if (zcVar != null) {
                zcVar.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
