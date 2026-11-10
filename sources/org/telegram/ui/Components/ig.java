package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class ig extends ch0 {
    public final v5 D;
    public final fg E;
    public gg r;
    public hg s;
    public final int w;
    public boolean x;
    public Drawable y;

    public ig(Context context, int i7) {
        super(context);
        this.D = new v5(this, 0L, 320L, wq.h);
        this.E = new fg(this, 0);
        this.w = i7;
    }

    public gg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(gg ggVar, boolean z9) {
        hg hgVar;
        int ordinal;
        hg hgVar2;
        hg hgVar3;
        if (z9 && ggVar == this.r) {
            return;
        }
        gg ggVar2 = this.r;
        this.r = ggVar;
        fg fgVar = this.E;
        if (z9 && ggVar2 != null) {
            hg[] values = hg.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    hgVar2 = null;
                    break;
                }
                hgVar2 = values[i7];
                if (hgVar2.a == ggVar2 && hgVar2.b == ggVar) {
                    break;
                } else {
                    i7++;
                }
            }
            if (hgVar2 != null) {
                gg ggVar3 = this.r;
                hg[] values2 = hg.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        hgVar3 = null;
                        break;
                    }
                    hgVar3 = values2[i10];
                    if (hgVar3.a == ggVar2 && hgVar3.b == ggVar3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (hgVar3 == this.s) {
                    return;
                }
                this.s = hgVar3;
                zg0 zg0Var = (zg0) fgVar.get(hgVar3);
                zg0Var.stop();
                if (hgVar3 == hg.e) {
                    zg0Var.P(30);
                    zg0Var.T(false, 0.0f);
                } else if (hgVar3 == hg.d) {
                    zg0Var.P(60);
                    zg0Var.T(false, 0.5f);
                } else {
                    zg0Var.T(false, 0.0f);
                }
                zg0Var.K(0);
                zg0Var.t0 = new wf(this, 21);
                setAnimation(zg0Var);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.o0(zg0Var, 1));
                ordinal = ggVar.ordinal();
                if (ordinal != 0) {
                    setContentDescription(org.telegram.messenger.id.M0(2131754734, null));
                    return;
                } else {
                    if (ordinal != 1) {
                        return;
                    }
                    setContentDescription(org.telegram.messenger.id.M0(2131754736, null));
                    return;
                }
            }
        }
        gg ggVar4 = this.r;
        hg[] values3 = hg.values();
        int length3 = values3.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length3) {
                hgVar = null;
                break;
            }
            hgVar = values3[i11];
            if (hgVar.a == ggVar4) {
                break;
            } else {
                i11++;
            }
        }
        zg0 zg0Var2 = (zg0) fgVar.get(hgVar);
        zg0Var2.stop();
        zg0Var2.T(false, ggVar != gg.a ? 0.0f : 0.5f);
        setAnimation(zg0Var2);
        ordinal = ggVar.ordinal();
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

    public ig(Context context) {
        this(context, 32);
    }
}
