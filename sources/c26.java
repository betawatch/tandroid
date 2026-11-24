// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c26 extends FrameLayout {
    public final ImageView a;
    public final jia b;
    public final jo0 c;
    public final jia d;
    public b26 e;
    public a26 f;

    public c26(h26 h26Var, Context context, wjb wjbVar) {
        super(context);
        int i = h26.R2;
        int i2 = h26Var.u0;
        setPadding(i2, 0, i2, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        zkb.s(imageView, bkb.Bk, wjbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView, nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        jiaVar.setWidthWrapContent(true);
        zkb.W(jiaVar, bkb.i5, wjbVar);
        jiaVar.setTextSize(14);
        boolean z = k96.a0;
        addView(jiaVar, nme.d(-2, -2.0f, (z ? 5 : 3) | 16, z ? 30.0f : 60.0f, 0.0f, z ? 60.0f : 30.0f, 0.0f));
        jia jiaVar2 = new jia(context);
        this.d = jiaVar2;
        jiaVar2.setTextColor(-1);
        jiaVar2.setWidthWrapContent(true);
        jiaVar2.setTypeface(gl.o());
        jiaVar2.setTextSize(14);
        jo0 jo0Var = new jo0(this, context, wjbVar);
        this.c = jo0Var;
        jo0Var.setWillNotDraw(false);
        jo0Var.addView(jiaVar2, nme.e(-2, -2, 17));
        addView(jo0Var, nme.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
