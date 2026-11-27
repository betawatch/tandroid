// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nua extends FrameLayout {
    public final ora a;
    public final mua b;
    public final mua c;
    public final mua d;
    public boolean e;
    public final pm3 f;
    public final RectF h;

    public nua(Context context, vnb vnbVar, ora oraVar) {
        super(context);
        this.f = new pm3((byte) 7);
        this.h = new RectF();
        this.a = oraVar;
        mua muaVar = new mua(context, vnbVar);
        this.b = muaVar;
        mua muaVar2 = new mua(context, vnbVar);
        this.c = muaVar2;
        mua muaVar3 = new mua(context, vnbVar);
        this.d = muaVar3;
        addView(muaVar, tre.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(muaVar2, tre.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(muaVar3, tre.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(dua duaVar, float f, boolean z, dua duaVar2, float f2, boolean z2, dua duaVar3, float f3, boolean z3) {
        ora oraVar = this.a;
        mua muaVar = this.b;
        if (duaVar != null) {
            if (z) {
                f = Math.max(0.5f, f);
            }
            muaVar.setVisibility(0);
            muaVar.e(duaVar.a, duaVar.b, oraVar);
            muaVar.setTranslationY(hl.L(36.0f) * ((f - 0.5f) / 1.5f));
        } else {
            muaVar.setVisibility(4);
        }
        mua muaVar2 = this.c;
        if (duaVar2 != null) {
            float max = ((z2 ? Math.max(0.5f, f2) : f2) - 0.5f) / 1.5f;
            muaVar2.setVisibility(0);
            muaVar2.e(duaVar2.a, duaVar2.b, oraVar);
            muaVar2.setTranslationY(hl.L(36.0f) * max);
            if (z2 && max <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ok(muaVar2, (byte) 1));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            muaVar2.setVisibility(4);
        }
        mua muaVar3 = this.d;
        if (duaVar3 == null) {
            muaVar3.setVisibility(4);
            return;
        }
        float f4 = f3;
        if (z3) {
            f4 = Math.max(0.5f, f4);
        }
        muaVar3.setVisibility(0);
        muaVar3.e(duaVar3.a, duaVar3.b, oraVar);
        muaVar3.setTranslationY(hl.L(36.0f) * ((f4 - 0.5f) / 1.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float width = getWidth();
        float L = hl.L(8.0f);
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, width, L);
        pm3 pm3Var = this.f;
        pm3Var.r(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - hl.L(8.0f), getWidth(), getHeight());
        pm3Var.r(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(37.66f), TLObject.FLAG_30));
    }
}
