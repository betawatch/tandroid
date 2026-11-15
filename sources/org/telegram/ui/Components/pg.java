package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class pg extends fh0 {
    public final u5 E;
    public final mg F;
    public ng r;
    public og s;
    public final int w;
    public boolean x;
    public Drawable y;

    public pg(Context context, int i7) {
        super(context);
        this.E = new u5(this, 0L, 320L, er.h);
        this.F = new mg(this, 0);
        this.w = i7;
    }

    public ng getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ng ngVar, boolean z10) {
        og ogVar;
        int ordinal;
        og ogVar2;
        og ogVar3;
        if (z10 && ngVar == this.r) {
            return;
        }
        ng ngVar2 = this.r;
        this.r = ngVar;
        mg mgVar = this.F;
        if (z10 && ngVar2 != null) {
            og[] values = og.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    ogVar2 = null;
                    break;
                }
                ogVar2 = values[i7];
                if (ogVar2.a == ngVar2 && ogVar2.b == ngVar) {
                    break;
                } else {
                    i7++;
                }
            }
            if (ogVar2 != null) {
                ng ngVar3 = this.r;
                og[] values2 = og.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        ogVar3 = null;
                        break;
                    }
                    ogVar3 = values2[i10];
                    if (ogVar3.a == ngVar2 && ogVar3.b == ngVar3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (ogVar3 == this.s) {
                    return;
                }
                this.s = ogVar3;
                ch0 ch0Var = (ch0) mgVar.get(ogVar3);
                ch0Var.stop();
                if (ogVar3 == og.e) {
                    ch0Var.P(30);
                    ch0Var.T(false, 0.0f);
                } else if (ogVar3 == og.d) {
                    ch0Var.P(60);
                    ch0Var.T(false, 0.5f);
                } else {
                    ch0Var.T(false, 0.0f);
                }
                ch0Var.K(0);
                ch0Var.u0 = new dg(this, 23);
                setAnimation(ch0Var);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.o0(ch0Var, 1));
                ordinal = ngVar.ordinal();
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
        ng ngVar4 = this.r;
        og[] values3 = og.values();
        int length3 = values3.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length3) {
                ogVar = null;
                break;
            }
            ogVar = values3[i11];
            if (ogVar.a == ngVar4) {
                break;
            } else {
                i11++;
            }
        }
        ch0 ch0Var2 = (ch0) mgVar.get(ogVar);
        ch0Var2.stop();
        ch0Var2.T(false, ngVar != ng.a ? 0.0f : 0.5f);
        setAnimation(ch0Var2);
        ordinal = ngVar.ordinal();
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

    public pg(Context context) {
        this(context, 32);
    }
}
