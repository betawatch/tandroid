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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class haa extends FrameLayout {
    public final View a;
    public final jia b;
    public final jia c;
    public final si9 d;
    public boolean e;
    public AnimatorSet f;
    public final Paint h;
    public final RectF n;
    public final /* synthetic */ taa r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haa(taa taaVar, Context context) {
        super(context);
        this.r = taaVar;
        final byte b = 1;
        this.h = new Paint(1);
        this.n = new RectF();
        View view = new View(context);
        this.a = view;
        int L = gl.L(18.0f);
        int i = bkb.N5;
        int i2 = taa.T2;
        Drawable b0 = bkb.b0(L, bkb.v0(i, taaVar.J0));
        vkb M = zkb.M(i);
        wjb wjbVar = taaVar.J0;
        view.setBackground(b0);
        zkb.j(view, b0, M, null, wjbVar);
        addView(view, nme.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        si9 si9Var = new si9((byte) 5, context, this);
        this.d = si9Var;
        addView(si9Var, nme.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        int i3 = bkb.dh;
        zkb.W(jiaVar, i3, taaVar.J0);
        jiaVar.setTextSize(13);
        jiaVar.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final byte b2 = 0;
        jiaVar.l(k96.M0(2131743133, null), false);
        jiaVar.setGravity(17);
        addView(jiaVar, nme.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        jiaVar.setOnClickListener(new View.OnClickListener(this) { // from class: saa
            public final /* synthetic */ haa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                haa haaVar = this.b;
                switch (b3) {
                    case 0:
                        haaVar.a(0);
                        break;
                    default:
                        haaVar.a(1);
                        break;
                }
            }
        });
        jia jiaVar2 = new jia(context);
        this.b = jiaVar2;
        zkb.W(jiaVar2, i3, taaVar.J0);
        jiaVar2.setTextSize(13);
        jiaVar2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        jiaVar2.l(k96.M0(2131743132, null), false);
        jiaVar2.setGravity(17);
        addView(jiaVar2, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        jiaVar2.setOnClickListener(new View.OnClickListener(this) { // from class: saa
            public final /* synthetic */ haa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b;
                haa haaVar = this.b;
                switch (b3) {
                    case 0:
                        haaVar.a(0);
                        break;
                    default:
                        haaVar.a(1);
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, (Property<si9, Float>) View.TRANSLATION_X, !z ? 0.0f : r1.getMeasuredWidth()));
        this.f.setDuration(180L);
        this.f.setInterpolator(s33.g);
        this.f.addListener(new ng9(this, (byte) 12));
        this.f.start();
        this.r.V0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - gl.L(28.0f)) / 2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).width = size;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = size;
        layoutParams.leftMargin = gl.L(14.0f) + size;
        si9 si9Var = this.d;
        ((FrameLayout.LayoutParams) si9Var.getLayoutParams()).width = size;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        si9Var.setTranslationX(!this.e ? 0.0f : r2.width);
        super.onMeasure(i, i2);
    }
}
