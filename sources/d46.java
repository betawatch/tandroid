// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d46 extends FrameLayout {
    public final ImageView a;
    public final lka b;
    public final jp0 c;
    public final lka d;
    public c46 e;
    public b46 f;

    public d46(i46 i46Var, Context context, ylb ylbVar) {
        super(context);
        int i = i46.R2;
        int i2 = i46Var.u0;
        setPadding(i2, 0, i2, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        anb.s(imageView, cmb.Bk, ylbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        lkaVar.setWidthWrapContent(true);
        anb.W(lkaVar, cmb.i5, ylbVar);
        lkaVar.setTextSize(14);
        boolean z = jb6.a0;
        addView(lkaVar, qoe.d(-2, -2.0f, (z ? 5 : 3) | 16, z ? 30.0f : 60.0f, 0.0f, z ? 60.0f : 30.0f, 0.0f));
        lka lkaVar2 = new lka(context);
        this.d = lkaVar2;
        lkaVar2.setTextColor(-1);
        lkaVar2.setWidthWrapContent(true);
        lkaVar2.setTypeface(gm.o());
        lkaVar2.setTextSize(14);
        jp0 jp0Var = new jp0(this, context, ylbVar);
        this.c = jp0Var;
        jp0Var.setWillNotDraw(false);
        jp0Var.addView(lkaVar2, qoe.e(-2, -2, 17));
        addView(jp0Var, qoe.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
