// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class iz1 extends e29 {
    public final mm E;
    public final fz1 F;
    public gz1 r;
    public hz1 s;
    public final byte w;
    public boolean x;
    public Drawable y;

    /* JADX WARN: Multi-variable type inference failed */
    public iz1(Context context, int i) {
        super(context);
        this.E = new mm(this, 0L, 320L, k43.h);
        this.F = new fz1(this, (byte) 0);
        this.w = i;
    }

    public gz1 getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(gz1 gz1Var, boolean z) {
        hz1 hz1Var;
        int ordinal;
        hz1 hz1Var2;
        hz1 hz1Var3;
        if (z && gz1Var == this.r) {
            return;
        }
        gz1 gz1Var2 = this.r;
        this.r = gz1Var;
        fz1 fz1Var = this.F;
        if (z && gz1Var2 != null) {
            hz1[] values = hz1.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    hz1Var2 = null;
                    break;
                }
                hz1Var2 = values[i];
                if (hz1Var2.a == gz1Var2 && hz1Var2.b == gz1Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (hz1Var2 != null) {
                gz1 gz1Var3 = this.r;
                hz1[] values2 = hz1.values();
                int length2 = values2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        hz1Var3 = null;
                        break;
                    }
                    hz1Var3 = values2[i2];
                    if (hz1Var3.a == gz1Var2 && hz1Var3.b == gz1Var3) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (hz1Var3 != this.s) {
                    this.s = hz1Var3;
                    b29 b29Var = (b29) fz1Var.get(hz1Var3);
                    b29Var.stop();
                    if (hz1Var3 == hz1.e) {
                        b29Var.K(30);
                        b29Var.O(false, 0.0f);
                    } else if (hz1Var3 == hz1.d) {
                        b29Var.K(60);
                        b29Var.O(false, 0.5f);
                    } else {
                        b29Var.O(false, 0.0f);
                    }
                    b29Var.F(0);
                    b29Var.u0 = new go1(this, (byte) 17);
                    setAnimation(b29Var);
                    hl.c3(new zk1(b29Var, (byte) 8));
                    ordinal = gz1Var.ordinal();
                    if (ordinal != 0) {
                        setContentDescription(ob6.M0(2131754729, null));
                        return;
                    } else {
                        if (ordinal != 1) {
                            return;
                        }
                        setContentDescription(ob6.M0(2131754731, null));
                        return;
                    }
                }
                return;
            }
        }
        gz1 gz1Var4 = this.r;
        hz1[] values3 = hz1.values();
        int length3 = values3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                hz1Var = null;
                break;
            }
            hz1Var = values3[i3];
            if (hz1Var.a == gz1Var4) {
                break;
            } else {
                i3++;
            }
        }
        b29 b29Var2 = (b29) fz1Var.get(hz1Var);
        b29Var2.stop();
        b29Var2.O(false, gz1Var != gz1.a ? 0.0f : 0.5f);
        setAnimation(b29Var2);
        ordinal = gz1Var.ordinal();
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
            float A = qd4.A(1.0f, d, 0.6f, 0.4f);
            canvas2.scale(A, A, width, height);
            super.onDraw(canvas);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            Drawable drawable = this.y;
            if (drawable == null) {
                drawable = getContext().getResources().getDrawable(R.drawable.msg_edit).mutate();
                this.y = drawable;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.y.getIntrinsicHeight() / 2;
            int i = (int) width;
            int i2 = (int) height;
            this.y.setBounds(i - intrinsicWidth, i2 - intrinsicHeight, i + intrinsicWidth, i2 + intrinsicHeight);
            this.y.setColorFilter(getColorFilter());
            this.y.setAlpha((int) (255.0f * d));
            canvas2.save();
            float f = (d * 0.6f) + 0.4f;
            canvas2.scale(f, f, width, height);
            this.y.draw(canvas2);
            canvas2.restore();
        }
    }

    public iz1(Context context) {
        this(context, 32);
    }
}
