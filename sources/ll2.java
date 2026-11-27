// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ll2 extends FrameLayout {
    public final in a;
    public final View b;
    public final vnb c;

    public ll2(Context context, vnb vnbVar) {
        super(context);
        this.c = vnbVar;
        in inVar = new in(context, false, false, false);
        this.a = inVar;
        int i = aob.G6;
        yob.U(inVar, i, vnbVar);
        inVar.setTextSize(hl.L(14.0f));
        inVar.setGravity(ob6.a0 ? 5 : 3);
        inVar.setImportantForAccessibility(2);
        inVar.setOnWidthUpdatedListener(new vd2(this, (byte) 7));
        addView(inVar, tre.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        yob.x(this, mutate, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, tre.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c = this.a.getDrawable().c() + hl.L(1.0f);
        boolean z = ob6.a0;
        View view = this.b;
        if (z) {
            view.setTranslationX(-c);
        } else {
            view.setTranslationX(c);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(46.0f), TLObject.FLAG_30));
        a();
    }

    public void setColor(int i) {
        vnb vnbVar = this.c;
        int v0 = aob.v0(i, vnbVar);
        yob.U(this.a, i, vnbVar);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
    }
}
