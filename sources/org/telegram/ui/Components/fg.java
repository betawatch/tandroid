package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class fg extends ei0 {
    public final t5 D;
    public final cg E;
    public dg r;
    public eg s;
    public final int w;
    public boolean x;
    public Drawable y;

    public fg(Context context, int i10) {
        super(context);
        this.D = new t5(this, 0L, 320L, gr.h);
        this.E = new cg(this, 0);
        this.w = i10;
    }

    public dg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(dg dgVar, boolean z10) {
        eg egVar;
        int ordinal;
        eg egVar2;
        eg egVar3;
        if (z10 && dgVar == this.r) {
            return;
        }
        dg dgVar2 = this.r;
        this.r = dgVar;
        cg cgVar = this.E;
        if (z10 && dgVar2 != null) {
            eg[] values = eg.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    egVar2 = null;
                    break;
                }
                egVar2 = values[i10];
                if (egVar2.a == dgVar2 && egVar2.b == dgVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (egVar2 != null) {
                dg dgVar3 = this.r;
                eg[] values2 = eg.values();
                int length2 = values2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        egVar3 = null;
                        break;
                    }
                    egVar3 = values2[i11];
                    if (egVar3.a == dgVar2 && egVar3.b == dgVar3) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (egVar3 == this.s) {
                    return;
                }
                this.s = egVar3;
                bi0 bi0Var = (bi0) cgVar.get(egVar3);
                bi0Var.stop();
                if (egVar3 == eg.e) {
                    bi0Var.P(30);
                    bi0Var.T(false, 0.0f);
                } else if (egVar3 == eg.d) {
                    bi0Var.P(60);
                    bi0Var.T(false, 0.5f);
                } else {
                    bi0Var.T(false, 0.0f);
                }
                bi0Var.K(0);
                bi0Var.t0 = new tf(this, 22);
                setAnimation(bi0Var);
                org.telegram.messenger.i0.g3(new org.telegram.ui.Cells.o0(bi0Var, 1));
                ordinal = dgVar.ordinal();
                if (ordinal != 0) {
                    setContentDescription(org.telegram.messenger.cd.L0(2131754734, null));
                    return;
                } else {
                    if (ordinal != 1) {
                        return;
                    }
                    setContentDescription(org.telegram.messenger.cd.L0(2131754736, null));
                    return;
                }
            }
        }
        dg dgVar4 = this.r;
        eg[] values3 = eg.values();
        int length3 = values3.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length3) {
                egVar = null;
                break;
            }
            egVar = values3[i12];
            if (egVar.a == dgVar4) {
                break;
            } else {
                i12++;
            }
        }
        bi0 bi0Var2 = (bi0) cgVar.get(egVar);
        bi0Var2.stop();
        bi0Var2.T(false, dgVar != dg.a ? 0.0f : 0.5f);
        setAnimation(bi0Var2);
        ordinal = dgVar.ordinal();
        if (ordinal != 0) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.D.d(this.x);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (d < 1.0f) {
            if (d > 0.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            float z10 = c3.i0.z(1.0f, d, 0.6f, 0.4f);
            canvas2.scale(z10, z10, width, height);
            super.onDraw(canvas);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            if (this.y == null) {
                this.y = getContext().getResources().getDrawable(R.drawable.msg_edit).mutate();
            }
            int intrinsicWidth = this.y.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.y.getIntrinsicHeight() / 2;
            int i10 = (int) width;
            int i11 = (int) height;
            this.y.setBounds(i10 - intrinsicWidth, i11 - intrinsicHeight, i10 + intrinsicWidth, i11 + intrinsicHeight);
            this.y.setColorFilter(getColorFilter());
            this.y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f7 = (d * 0.6f) + 0.4f;
            canvas2.scale(f7, f7, width, height);
            this.y.draw(canvas2);
            canvas2.restore();
        }
    }

    public fg(Context context) {
        this(context, 32);
    }
}
