// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hca extends FrameLayout {
    public final View a;
    public final lka b;
    public final lka c;
    public final xd9 d;
    public boolean e;
    public AnimatorSet f;
    public final Paint h;
    public final RectF n;
    public final /* synthetic */ tca r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hca(tca tcaVar, Context context) {
        super(context);
        this.r = tcaVar;
        final byte b = 1;
        this.h = new Paint(1);
        this.n = new RectF();
        View view = new View(context);
        this.a = view;
        int L = gm.L(18.0f);
        int i = cmb.N5;
        int i2 = tca.T2;
        Drawable b0 = cmb.b0(L, cmb.v0(i, tcaVar.J0));
        wmb M = anb.M(i);
        ylb ylbVar = tcaVar.J0;
        view.setBackground(b0);
        anb.j(view, b0, M, null, ylbVar);
        addView(view, qoe.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        xd9 xd9Var = new xd9((byte) 6, context, this);
        this.d = xd9Var;
        addView(xd9Var, qoe.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        int i3 = cmb.dh;
        anb.W(lkaVar, i3, tcaVar.J0);
        lkaVar.setTextSize(13);
        lkaVar.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final byte b2 = 0;
        lkaVar.l(jb6.M0(2131743059, null), false);
        lkaVar.setGravity(17);
        addView(lkaVar, qoe.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        lkaVar.setOnClickListener(new View.OnClickListener(this) { // from class: sca
            public final /* synthetic */ hca b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                hca hcaVar = this.b;
                switch (b3) {
                    case 0:
                        hcaVar.a(0);
                        break;
                    default:
                        hcaVar.a(1);
                        break;
                }
            }
        });
        lka lkaVar2 = new lka(context);
        this.b = lkaVar2;
        anb.W(lkaVar2, i3, tcaVar.J0);
        lkaVar2.setTextSize(13);
        lkaVar2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        lkaVar2.l(jb6.M0(2131743058, null), false);
        lkaVar2.setGravity(17);
        addView(lkaVar2, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        lkaVar2.setOnClickListener(new View.OnClickListener(this) { // from class: sca
            public final /* synthetic */ hca b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b;
                hca hcaVar = this.b;
                switch (b3) {
                    case 0:
                        hcaVar.a(0);
                        break;
                    default:
                        hcaVar.a(1);
                        break;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        boolean z = this.e;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, (Property<xd9, Float>) View.TRANSLATION_X, !z ? 0.0f : r1.getMeasuredWidth()));
        this.f.setDuration(180L);
        this.f.setInterpolator(d53.g);
        this.f.addListener(new c39(this, (byte) 14));
        this.f.start();
        this.r.V0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - gm.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = gm.L(14.0f) + size;
        xd9 xd9Var = this.d;
        ((FrameLayout.LayoutParams) xd9Var.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        xd9Var.setTranslationX(!this.e ? 0.0f : r2.width);
        super.onMeasure(i, i2);
    }
}
