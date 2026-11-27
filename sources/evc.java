// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class evc extends FrameLayout implements snb {
    public int a;
    public boolean b;
    public final dvc[] c;
    public byte d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable w;

    public evc(Context context, int i) {
        super(context);
        this.b = true;
        this.d = (byte) 3;
        this.c = new dvc[i];
        final int i2 = 0;
        while (true) {
            dvc[] dvcVarArr = this.c;
            if (i2 >= dvcVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.w = c00.e(context, R.drawable.background_selected);
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(aob.w0(null, aob.Ci, false));
                return;
            }
            final dvc dvcVar = new dvc(this, context);
            dvcVarArr[i2] = dvcVar;
            dvcVar.setClipToOutline(true);
            addView(dvcVar);
            dvcVar.setOnClickListener(new ae((Object) this, (Object) dvcVar, i2, (byte) 21));
            dvcVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: cvc
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i3 = i2;
                    return evc.this.b(dvcVar.h, i3);
                }
            });
            i2++;
        }
    }

    public abstract void a(int i, Object obj);

    public boolean b(Object obj, int i) {
        return false;
    }

    public final void c(int i, boolean z, boolean z2) {
        dvc dvcVar = this.c[i];
        mb0 mb0Var = dvcVar.a;
        CheckBox checkBox = dvcVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z, z2);
        AnimatorSet animatorSet = dvcVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            dvcVar.f = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            dvcVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(mb0Var, "scaleX", z ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(mb0Var, "scaleY", z ? 0.8875f : 1.0f));
            dvcVar.f.setDuration(200L);
            dvcVar.f.addListener(new i1a((byte) 16, dvcVar, z));
            dvcVar.f.start();
        } else {
            mb0Var.setScaleX(z ? 0.8875f : 1.0f);
            mb0Var.setScaleY(z ? 0.8875f : 1.0f);
        }
        dvcVar.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        this.d = i;
        this.e = z;
        this.f = z2;
        int i2 = 0;
        while (true) {
            dvc[] dvcVarArr = this.c;
            if (i2 >= dvcVarArr.length) {
                return;
            }
            xhc xhcVar = null;
            if ((z || z2) && (i2 == 0 || i2 == i - 1)) {
                dvc dvcVar = dvcVarArr[i2];
                int L = hl.L(16.0f);
                boolean z5 = i2 == 0;
                boolean z6 = i2 == i + (-1);
                yi yiVar = yhc.a;
                if ((z5 || z6) && (z || z2)) {
                    z3 = z;
                    z4 = z2;
                    xhcVar = new xhc(L, z5, z3, z6, z4);
                } else {
                    z3 = z;
                    z4 = z2;
                }
                dvcVar.setOutlineProvider(xhcVar);
            } else {
                dvcVarArr[i2].setOutlineProvider(null);
                z3 = z;
                z4 = z2;
            }
            dvcVarArr[i2].setVisibility(i2 < i ? 0 : 8);
            dvcVarArr[i2].clearAnimation();
            i2++;
            z = z3;
            z2 = z4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Object obj, int i, int i2, Object obj2) {
        this.h = i;
        dvc[] dvcVarArr = this.c;
        if (obj == null) {
            dvcVarArr[i2].setVisibility(8);
            dvcVarArr[i2].clearAnimation();
        } else {
            dvcVarArr[i2].setVisibility(0);
            dvcVarArr[i2].a(obj, obj2);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        for (int i = 0; i < this.d; i++) {
            this.c[i].invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d == 1) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int L = hl.L(12.0f);
        int L2 = this.e ? hl.L(12.0f) : 0;
        for (int i5 = 0; i5 < this.d; i5++) {
            dvc[] dvcVarArr = this.c;
            int measuredWidth = dvcVarArr[i5].getMeasuredWidth();
            dvc dvcVar = dvcVarArr[i5];
            dvcVar.layout(L, L2, L + measuredWidth, dvcVar.getMeasuredHeight() + L2);
            L = uh9.w(3.0f, measuredWidth, L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), ik8.E(3.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, hl.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int L = size - hl.L(bp1.h(this.d, 1, 3, 24));
        int i4 = L / this.d;
        boolean z = this.h;
        int L2 = (z == 0 || z == 2 || z == 3) ? hl.L(180.0f) : i4;
        setMeasuredDimension(size, hl.L(this.f ? 12.0f : 3.0f) + (this.e ? hl.L(12.0f) : 0) + L2);
        while (true) {
            byte b = this.d;
            if (i3 >= b) {
                return;
            }
            this.c[i3].measure(View.MeasureSpec.makeMeasureSpec(i3 == b + (-1) ? L : i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30));
            L -= i4;
            i3++;
        }
    }

    public void setSize(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.s.setColor(aob.w0(null, aob.Ci, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
