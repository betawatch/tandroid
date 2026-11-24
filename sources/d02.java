// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class d02 extends s09 {
    public final ln E;
    public final a02 F;
    public b02 r;
    public c02 s;
    public final byte w;
    public boolean x;
    public Drawable y;

    /* JADX WARN: Multi-variable type inference failed */
    public d02(Context context, int i) {
        super(context);
        this.E = new ln(this, 0L, 320L, d53.h);
        this.F = new a02(this, (byte) 0);
        this.w = i;
    }

    public b02 getCurrentState() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(b02 b02Var, boolean z) {
        c02 c02Var;
        int ordinal;
        c02 c02Var2;
        c02 c02Var3;
        if (z && b02Var == this.r) {
            return;
        }
        b02 b02Var2 = this.r;
        this.r = b02Var;
        a02 a02Var = this.F;
        if (z && b02Var2 != null) {
            c02[] values = c02.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    c02Var2 = null;
                    break;
                }
                c02Var2 = values[i];
                if (c02Var2.a == b02Var2 && c02Var2.b == b02Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (c02Var2 != null) {
                b02 b02Var3 = this.r;
                c02[] values2 = c02.values();
                int length2 = values2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        c02Var3 = null;
                        break;
                    }
                    c02Var3 = values2[i2];
                    if (c02Var3.a == b02Var2 && c02Var3.b == b02Var3) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (c02Var3 != this.s) {
                    this.s = c02Var3;
                    p09 p09Var = (p09) a02Var.get(c02Var3);
                    p09Var.stop();
                    if (c02Var3 == c02.e) {
                        p09Var.K(30);
                        p09Var.O(false, 0.0f);
                    } else if (c02Var3 == c02.d) {
                        p09Var.K(60);
                        p09Var.O(false, 0.5f);
                    } else {
                        p09Var.O(false, 0.0f);
                    }
                    p09Var.F(0);
                    p09Var.u0 = new fo1(this, (byte) 16);
                    setAnimation(p09Var);
                    gm.c3(new xl1(p09Var, (byte) 8));
                    ordinal = b02Var.ordinal();
                    if (ordinal != 0) {
                        setContentDescription(jb6.M0(2131754733, null));
                        return;
                    } else {
                        if (ordinal != 1) {
                            return;
                        }
                        setContentDescription(jb6.M0(2131754735, null));
                        return;
                    }
                }
                return;
            }
        }
        b02 b02Var4 = this.r;
        c02[] values3 = c02.values();
        int length3 = values3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                c02Var = null;
                break;
            }
            c02Var = values3[i3];
            if (c02Var.a == b02Var4) {
                break;
            } else {
                i3++;
            }
        }
        p09 p09Var2 = (p09) a02Var.get(c02Var);
        p09Var2.stop();
        p09Var2.O(false, b02Var != b02.a ? 0.0f : 0.5f);
        setAnimation(p09Var2);
        ordinal = b02Var.ordinal();
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
            float A = td4.A(1.0f, d, 0.6f, 0.4f);
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

    public d02(Context context) {
        this(context, 32);
    }
}
