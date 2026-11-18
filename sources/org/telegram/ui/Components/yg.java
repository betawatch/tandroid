package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class yg extends ph0 {
    public final c6 E;
    public final vg F;
    public wg r;
    public xg s;
    public final int w;
    public boolean x;
    public Drawable y;

    public yg(Context context, int i7) {
        super(context);
        this.E = new c6(this, 0L, 320L, lr.h);
        this.F = new vg(this, 0);
        this.w = i7;
    }

    public wg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(wg wgVar, boolean z10) {
        xg xgVar;
        int ordinal;
        xg xgVar2;
        xg xgVar3;
        if (z10 && wgVar == this.r) {
            return;
        }
        wg wgVar2 = this.r;
        this.r = wgVar;
        vg vgVar = this.F;
        if (z10 && wgVar2 != null) {
            xg[] values = xg.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    xgVar2 = null;
                    break;
                }
                xgVar2 = values[i7];
                if (xgVar2.a == wgVar2 && xgVar2.b == wgVar) {
                    break;
                } else {
                    i7++;
                }
            }
            if (xgVar2 != null) {
                wg wgVar3 = this.r;
                xg[] values2 = xg.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        xgVar3 = null;
                        break;
                    }
                    xgVar3 = values2[i10];
                    if (xgVar3.a == wgVar2 && xgVar3.b == wgVar3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (xgVar3 == this.s) {
                    return;
                }
                this.s = xgVar3;
                mh0 mh0Var = (mh0) vgVar.get(xgVar3);
                mh0Var.stop();
                if (xgVar3 == xg.e) {
                    mh0Var.P(30);
                    mh0Var.T(false, 0.0f);
                } else if (xgVar3 == xg.d) {
                    mh0Var.P(60);
                    mh0Var.T(false, 0.5f);
                } else {
                    mh0Var.T(false, 0.0f);
                }
                mh0Var.K(0);
                mh0Var.u0 = new lg(this, 23);
                setAnimation(mh0Var);
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.p0(mh0Var, 1));
                ordinal = wgVar.ordinal();
                if (ordinal != 0) {
                    setContentDescription(org.telegram.messenger.gd.M0(2131754734, null));
                    return;
                } else {
                    if (ordinal != 1) {
                        return;
                    }
                    setContentDescription(org.telegram.messenger.gd.M0(2131754736, null));
                    return;
                }
            }
        }
        wg wgVar4 = this.r;
        xg[] values3 = xg.values();
        int length3 = values3.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length3) {
                xgVar = null;
                break;
            }
            xgVar = values3[i11];
            if (xgVar.a == wgVar4) {
                break;
            } else {
                i11++;
            }
        }
        mh0 mh0Var2 = (mh0) vgVar.get(xgVar);
        mh0Var2.stop();
        mh0Var2.T(false, wgVar != wg.a ? 0.0f : 0.5f);
        setAnimation(mh0Var2);
        ordinal = wgVar.ordinal();
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

    public yg(Context context) {
        this(context, 32);
    }
}
