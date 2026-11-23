package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class zg extends qh0 {
    public final c6 E;
    public final wg F;
    public xg r;
    public yg s;
    public final int w;
    public boolean x;
    public Drawable y;

    public zg(Context context, int i7) {
        super(context);
        this.E = new c6(this, 0L, 320L, kr.h);
        this.F = new wg(this, 0);
        this.w = i7;
    }

    public xg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(xg xgVar, boolean z10) {
        yg ygVar;
        int ordinal;
        yg ygVar2;
        yg ygVar3;
        if (z10 && xgVar == this.r) {
            return;
        }
        xg xgVar2 = this.r;
        this.r = xgVar;
        wg wgVar = this.F;
        if (z10 && xgVar2 != null) {
            yg[] values = yg.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    ygVar2 = null;
                    break;
                }
                ygVar2 = values[i7];
                if (ygVar2.a == xgVar2 && ygVar2.b == xgVar) {
                    break;
                } else {
                    i7++;
                }
            }
            if (ygVar2 != null) {
                xg xgVar3 = this.r;
                yg[] values2 = yg.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        ygVar3 = null;
                        break;
                    }
                    ygVar3 = values2[i10];
                    if (ygVar3.a == xgVar2 && ygVar3.b == xgVar3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (ygVar3 == this.s) {
                    return;
                }
                this.s = ygVar3;
                nh0 nh0Var = (nh0) wgVar.get(ygVar3);
                nh0Var.stop();
                if (ygVar3 == yg.e) {
                    nh0Var.P(30);
                    nh0Var.T(false, 0.0f);
                } else if (ygVar3 == yg.d) {
                    nh0Var.P(60);
                    nh0Var.T(false, 0.5f);
                } else {
                    nh0Var.T(false, 0.0f);
                }
                nh0Var.K(0);
                nh0Var.u0 = new ng(this, 23);
                setAnimation(nh0Var);
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.p0(nh0Var, 1));
                ordinal = xgVar.ordinal();
                if (ordinal != 0) {
                    setContentDescription(org.telegram.messenger.gd.N0(2131754733, null));
                    return;
                } else {
                    if (ordinal != 1) {
                        return;
                    }
                    setContentDescription(org.telegram.messenger.gd.N0(2131754735, null));
                    return;
                }
            }
        }
        xg xgVar4 = this.r;
        yg[] values3 = yg.values();
        int length3 = values3.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length3) {
                ygVar = null;
                break;
            }
            ygVar = values3[i11];
            if (ygVar.a == xgVar4) {
                break;
            } else {
                i11++;
            }
        }
        nh0 nh0Var2 = (nh0) wgVar.get(ygVar);
        nh0Var2.stop();
        nh0Var2.T(false, xgVar != xg.a ? 0.0f : 0.5f);
        setAnimation(nh0Var2);
        ordinal = xgVar.ordinal();
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
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, d, 0.6f, 0.4f);
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

    public zg(Context context) {
        this(context, 32);
    }
}
