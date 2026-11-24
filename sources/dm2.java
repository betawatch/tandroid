// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dm2 extends FrameLayout {
    public final io a;
    public final View b;
    public final ylb c;

    public dm2(Context context, ylb ylbVar) {
        super(context);
        this.c = ylbVar;
        io ioVar = new io(context, false, false, false);
        this.a = ioVar;
        int i = cmb.F6;
        anb.U(ioVar, i, ylbVar);
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setGravity(jb6.a0 ? 5 : 3);
        ioVar.setImportantForAccessibility(2);
        ioVar.setOnWidthUpdatedListener(new xf2(this, (byte) 6));
        addView(ioVar, qoe.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        anb.x(this, mutate, i, ylbVar, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, qoe.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c = this.a.getDrawable().c() + gm.L(1.0f);
        boolean z = jb6.a0;
        View view = this.b;
        if (z) {
            view.setTranslationX(-c);
        } else {
            view.setTranslationX(c);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(46.0f), TLObject.FLAG_30));
        a();
    }

    public void setColor(int i) {
        ylb ylbVar = this.c;
        int v0 = cmb.v0(i, ylbVar);
        anb.U(this.a, i, ylbVar);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
    }
}
