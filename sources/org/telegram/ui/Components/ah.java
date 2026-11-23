package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class ah extends rh0 {
    public final d6 E;
    public final xg F;
    public yg r;
    public zg s;
    public final int w;
    public boolean x;
    public Drawable y;

    public ah(Context context, int i7) {
        super(context);
        this.E = new d6(this, 0L, 320L, nr.h);
        this.F = new xg(this, 0);
        this.w = i7;
    }

    public yg getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(yg ygVar, boolean z10) {
        zg zgVar;
        int ordinal;
        zg zgVar2;
        zg zgVar3;
        if (z10 && ygVar == this.r) {
            return;
        }
        yg ygVar2 = this.r;
        this.r = ygVar;
        xg xgVar = this.F;
        if (z10 && ygVar2 != null) {
            zg[] values = zg.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    zgVar2 = null;
                    break;
                }
                zgVar2 = values[i7];
                if (zgVar2.a == ygVar2 && zgVar2.b == ygVar) {
                    break;
                } else {
                    i7++;
                }
            }
            if (zgVar2 != null) {
                yg ygVar3 = this.r;
                zg[] values2 = zg.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        zgVar3 = null;
                        break;
                    }
                    zgVar3 = values2[i10];
                    if (zgVar3.a == ygVar2 && zgVar3.b == ygVar3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (zgVar3 == this.s) {
                    return;
                }
                this.s = zgVar3;
                oh0 oh0Var = (oh0) xgVar.get(zgVar3);
                oh0Var.stop();
                if (zgVar3 == zg.e) {
                    oh0Var.P(30);
                    oh0Var.T(false, 0.0f);
                } else if (zgVar3 == zg.d) {
                    oh0Var.P(60);
                    oh0Var.T(false, 0.5f);
                } else {
                    oh0Var.T(false, 0.0f);
                }
                oh0Var.K(0);
                oh0Var.u0 = new og(this, 23);
                setAnimation(oh0Var);
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.p0(oh0Var, 1));
                ordinal = ygVar.ordinal();
                if (ordinal != 0) {
                    setContentDescription(org.telegram.messenger.hd.N0(2131754733, null));
                    return;
                } else {
                    if (ordinal != 1) {
                        return;
                    }
                    setContentDescription(org.telegram.messenger.hd.N0(2131754735, null));
                    return;
                }
            }
        }
        yg ygVar4 = this.r;
        zg[] values3 = zg.values();
        int length3 = values3.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length3) {
                zgVar = null;
                break;
            }
            zgVar = values3[i11];
            if (zgVar.a == ygVar4) {
                break;
            } else {
                i11++;
            }
        }
        oh0 oh0Var2 = (oh0) xgVar.get(zgVar);
        oh0Var2.stop();
        oh0Var2.T(false, ygVar != yg.a ? 0.0f : 0.5f);
        setAnimation(oh0Var2);
        ordinal = ygVar.ordinal();
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

    public ah(Context context) {
        this(context, 32);
    }
}
