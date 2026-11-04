package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class hg extends fh0 {
    public final u5 E;
    public final eg F;
    public fg r;
    public gg s;
    public final int w;
    public boolean x;
    public Drawable y;

    public hg(Context context, int i3) {
        super(context);
        this.E = new u5(this, 0L, 320L, xq.h);
        this.F = new eg(this, 0);
        this.w = i3;
    }

    public fg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(fg fgVar, boolean z10) {
        gg ggVar;
        int ordinal;
        gg ggVar2;
        gg ggVar3;
        if (z10 && fgVar == this.r) {
            return;
        }
        fg fgVar2 = this.r;
        this.r = fgVar;
        eg egVar = this.F;
        if (z10 && fgVar2 != null) {
            gg[] values = gg.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    ggVar2 = null;
                    break;
                }
                ggVar2 = values[i3];
                if (ggVar2.a == fgVar2 && ggVar2.b == fgVar) {
                    break;
                } else {
                    i3++;
                }
            }
            if (ggVar2 != null) {
                fg fgVar3 = this.r;
                gg[] values2 = gg.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        ggVar3 = null;
                        break;
                    }
                    ggVar3 = values2[i10];
                    if (ggVar3.a == fgVar2 && ggVar3.b == fgVar3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (ggVar3 == this.s) {
                    return;
                }
                this.s = ggVar3;
                ch0 ch0Var = (ch0) egVar.get(ggVar3);
                ch0Var.stop();
                if (ggVar3 == gg.e) {
                    ch0Var.P(30);
                    ch0Var.T(false, 0.0f);
                } else if (ggVar3 == gg.d) {
                    ch0Var.P(60);
                    ch0Var.T(false, 0.5f);
                } else {
                    ch0Var.T(false, 0.0f);
                }
                ch0Var.K(0);
                ch0Var.u0 = new vf(this, 21);
                setAnimation(ch0Var);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.o0(ch0Var, 1));
                ordinal = fgVar.ordinal();
                if (ordinal != 0) {
                    setContentDescription(org.telegram.messenger.bd.M0(2131754734, null));
                    return;
                } else {
                    if (ordinal != 1) {
                        return;
                    }
                    setContentDescription(org.telegram.messenger.bd.M0(2131754736, null));
                    return;
                }
            }
        }
        fg fgVar4 = this.r;
        gg[] values3 = gg.values();
        int length3 = values3.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length3) {
                ggVar = null;
                break;
            }
            ggVar = values3[i11];
            if (ggVar.a == fgVar4) {
                break;
            } else {
                i11++;
            }
        }
        ch0 ch0Var2 = (ch0) egVar.get(ggVar);
        ch0Var2.stop();
        ch0Var2.T(false, fgVar != fg.a ? 0.0f : 0.5f);
        setAnimation(ch0Var2);
        ordinal = fgVar.ordinal();
        if (ordinal != 0) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.E.d(this.x);
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
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, d, 0.6f, 0.4f);
            canvas2.scale(y9, y9, width, height);
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
            int i3 = (int) width;
            int i10 = (int) height;
            this.y.setBounds(i3 - intrinsicWidth, i10 - intrinsicHeight, i3 + intrinsicWidth, i10 + intrinsicHeight);
            this.y.setColorFilter(getColorFilter());
            this.y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f10 = (d * 0.6f) + 0.4f;
            canvas2.scale(f10, f10, width, height);
            this.y.draw(canvas2);
            canvas2.restore();
        }
    }

    public hg(Context context) {
        this(context, 32);
    }
}
