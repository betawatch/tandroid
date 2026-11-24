// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class msa extends FrameLayout {
    public final spa a;
    public final lsa b;
    public final lsa c;
    public final lsa d;
    public boolean e;
    public final in3 f;
    public final RectF h;

    public msa(Context context, ylb ylbVar, spa spaVar) {
        super(context);
        this.f = new in3((byte) 7);
        this.h = new RectF();
        this.a = spaVar;
        lsa lsaVar = new lsa(context, ylbVar);
        this.b = lsaVar;
        lsa lsaVar2 = new lsa(context, ylbVar);
        this.c = lsaVar2;
        lsa lsaVar3 = new lsa(context, ylbVar);
        this.d = lsaVar3;
        addView(lsaVar, qoe.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(lsaVar2, qoe.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(lsaVar3, qoe.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(csa csaVar, float f, boolean z, csa csaVar2, float f2, boolean z2, csa csaVar3, float f3, boolean z3) {
        spa spaVar = this.a;
        lsa lsaVar = this.b;
        if (csaVar != null) {
            if (z) {
                f = Math.max(0.5f, f);
            }
            lsaVar.setVisibility(0);
            lsaVar.e(csaVar.a, csaVar.b, spaVar);
            lsaVar.setTranslationY(gm.L(36.0f) * ((f - 0.5f) / 1.5f));
        } else {
            lsaVar.setVisibility(4);
        }
        lsa lsaVar2 = this.c;
        if (csaVar2 != null) {
            float max = ((z2 ? Math.max(0.5f, f2) : f2) - 0.5f) / 1.5f;
            lsaVar2.setVisibility(0);
            lsaVar2.e(csaVar2.a, csaVar2.b, spaVar);
            lsaVar2.setTranslationY(gm.L(36.0f) * max);
            if (z2 && max <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jl(lsaVar2, (byte) 1));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            lsaVar2.setVisibility(4);
        }
        lsa lsaVar3 = this.d;
        if (csaVar3 == null) {
            lsaVar3.setVisibility(4);
            return;
        }
        float f4 = f3;
        if (z3) {
            f4 = Math.max(0.5f, f4);
        }
        lsaVar3.setVisibility(0);
        lsaVar3.e(csaVar3.a, csaVar3.b, spaVar);
        lsaVar3.setTranslationY(gm.L(36.0f) * ((f4 - 0.5f) / 1.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), nm7.d4, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float width = getWidth();
        float L = gm.L(8.0f);
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, width, L);
        in3 in3Var = this.f;
        in3Var.r(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - gm.L(8.0f), getWidth(), getHeight());
        in3Var.r(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(37.66f), TLObject.FLAG_30));
    }
}
