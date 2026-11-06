package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class jg extends ch0 {
    public final w5 D;
    public final gg E;
    public hg r;
    public ig s;
    public final int w;
    public boolean x;
    public Drawable y;

    public jg(Context context, int i7) {
        super(context);
        this.D = new w5(this, 0L, 320L, xq.h);
        this.E = new gg(this, 0);
        this.w = i7;
    }

    public hg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(hg hgVar, boolean z9) {
        ig igVar;
        int ordinal;
        ig igVar2;
        ig igVar3;
        if (z9 && hgVar == this.r) {
            return;
        }
        hg hgVar2 = this.r;
        this.r = hgVar;
        gg ggVar = this.E;
        if (z9 && hgVar2 != null) {
            ig[] values = ig.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    igVar2 = null;
                    break;
                }
                igVar2 = values[i7];
                if (igVar2.a == hgVar2 && igVar2.b == hgVar) {
                    break;
                } else {
                    i7++;
                }
            }
            if (igVar2 != null) {
                hg hgVar3 = this.r;
                ig[] values2 = ig.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        igVar3 = null;
                        break;
                    }
                    igVar3 = values2[i10];
                    if (igVar3.a == hgVar2 && igVar3.b == hgVar3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (igVar3 == this.s) {
                    return;
                }
                this.s = igVar3;
                zg0 zg0Var = (zg0) ggVar.get(igVar3);
                zg0Var.stop();
                if (igVar3 == ig.e) {
                    zg0Var.P(30);
                    zg0Var.T(false, 0.0f);
                } else if (igVar3 == ig.d) {
                    zg0Var.P(60);
                    zg0Var.T(false, 0.5f);
                } else {
                    zg0Var.T(false, 0.0f);
                }
                zg0Var.K(0);
                zg0Var.t0 = new xf(this, 21);
                setAnimation(zg0Var);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.o0(zg0Var, 1));
                ordinal = hgVar.ordinal();
                if (ordinal != 0) {
                    setContentDescription(org.telegram.messenger.hd.M0(2131754734, null));
                    return;
                } else {
                    if (ordinal != 1) {
                        return;
                    }
                    setContentDescription(org.telegram.messenger.hd.M0(2131754736, null));
                    return;
                }
            }
        }
        hg hgVar4 = this.r;
        ig[] values3 = ig.values();
        int length3 = values3.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length3) {
                igVar = null;
                break;
            }
            igVar = values3[i11];
            if (igVar.a == hgVar4) {
                break;
            } else {
                i11++;
            }
        }
        zg0 zg0Var2 = (zg0) ggVar.get(igVar);
        zg0Var2.stop();
        zg0Var2.T(false, hgVar != hg.a ? 0.0f : 0.5f);
        setAnimation(zg0Var2);
        ordinal = hgVar.ordinal();
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
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, d, 0.6f, 0.4f);
            canvas2.scale(z9, z9, width, height);
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
            int i7 = (int) width;
            int i10 = (int) height;
            this.y.setBounds(i7 - intrinsicWidth, i10 - intrinsicHeight, i7 + intrinsicWidth, i10 + intrinsicHeight);
            this.y.setColorFilter(getColorFilter());
            this.y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f10 = (d * 0.6f) + 0.4f;
            canvas2.scale(f10, f10, width, height);
            this.y.draw(canvas2);
            canvas2.restore();
        }
    }

    public jg(Context context) {
        this(context, 32);
    }
}
