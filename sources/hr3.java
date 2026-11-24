// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hr3 extends View implements jm7, vlb {
    public boolean E;
    public int F;
    public final Paint a;
    public final Paint b;
    public final int c;
    public final ArrayList d;
    public float e;
    public float f;
    public float h;
    public final ImageReceiver n;
    public final ImageReceiver r;
    public final p09 s;
    public final p09 w;
    public boolean x;
    public int y;

    public hr3(Context context, int i) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.r = imageReceiver2;
        this.c = i;
        imageReceiver.y = true;
        imageReceiver2.y = true;
        p09 p09Var = new p09(R.raw.download_progress, gm.L(28.0f), gm.L(28.0f), true, null);
        this.s = p09Var;
        p09 p09Var2 = new p09(R.raw.download_finish, gm.L(28.0f), gm.L(28.0f), true, null);
        this.w = p09Var2;
        imageReceiver.g0(p09Var);
        imageReceiver2.g0(p09Var2);
        imageReceiver.M(1);
        p09Var.F(1);
        p09Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i = this.c;
        ArrayList arrayList2 = er3.q(i).H;
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (true) {
            arrayList = this.d;
            if (i2 >= arrayList.size()) {
                break;
            }
            hashMap.put(((gr3) arrayList.get(i2)).c, (gr3) arrayList.get(i2));
            er3.q(i).v((cr3) arrayList.get(i2));
            i2++;
        }
        arrayList.clear();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            String S0 = ((k47) arrayList2.get(i3)).S0();
            if (bc4.G(i).S(S0)) {
                gr3 gr3Var = (gr3) hashMap.get(S0);
                if (gr3Var == null) {
                    gr3Var = new gr3(this, S0);
                }
                er3.q(i).a(S0, null, gr3Var);
                arrayList.add(gr3Var);
            }
        }
        if (arrayList.size() != 0 || this.E) {
            return;
        }
        if (er3.q(i).J.size() > 0) {
            this.e = 1.0f;
            this.f = 1.0f;
            this.x = true;
        } else {
            this.e = 0.0f;
            this.f = 0.0f;
            this.x = false;
        }
    }

    public final void b() {
        float f;
        cf7.Y(this.c);
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                break;
            }
            j += ((gr3) arrayList.get(i)).a;
            j2 += ((gr3) arrayList.get(i)).b;
            i++;
        }
        float f2 = 1.0f;
        if (j == 0) {
            this.e = 1.0f;
            f = 1.0f;
        } else {
            f = j2 / j;
            this.e = f;
        }
        if (f > 1.0f) {
            this.e = 1.0f;
        } else {
            f2 = 0.0f;
            if (f < 0.0f) {
                this.e = 0.0f;
            } else {
                f2 = f;
            }
        }
        this.h = ((f2 - this.f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.f5) {
            a();
            b();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        nm7.f(this.c).b(this, nm7.f5);
        this.n.I();
        this.r.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i2 = this.c;
            if (i >= size) {
                arrayList.clear();
                nm7.f(i2).n(this, nm7.f5);
                this.n.K();
                this.r.K();
                return;
            }
            er3.q(i2).v((cr3) arrayList.get(i));
            i++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i = this.y;
            int i2 = cmb.u8;
            int w0 = cmb.w0(null, i2, false);
            ImageReceiver imageReceiver = this.r;
            ImageReceiver imageReceiver2 = this.n;
            Paint paint = this.a;
            Paint paint2 = this.b;
            if (i != w0) {
                this.y = cmb.w0(null, i2, false);
                paint.setColor(cmb.w0(null, i2, false));
                paint2.setColor(cmb.w0(null, i2, false));
                int w02 = cmb.w0(null, i2, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.p1 = new PorterDuffColorFilter(w02, mode);
                imageReceiver.p1 = new PorterDuffColorFilter(cmb.w0(null, i2, false), mode);
                paint2.setAlpha(100);
            }
            float f = this.f;
            float f2 = this.e;
            if (f != f2) {
                float f3 = this.h;
                float f4 = f + f3;
                this.f = f4;
                if (f3 > 0.0f && f4 > f2) {
                    this.f = f2;
                } else if (f3 >= 0.0f || f4 >= f2) {
                    invalidate();
                } else {
                    this.f = f2;
                }
            }
            int L = gm.L(8.0f) + (getMeasuredHeight() / 2);
            float L2 = gm.L(1.0f);
            float L3 = gm.L(16.0f);
            RectF rectF = gm.P;
            float f5 = L;
            float f6 = f5 - L2;
            float f7 = f5 + L2;
            rectF.set(L3, f6, getMeasuredWidth() - L3, f7);
            canvas.drawRoundRect(rectF, L2, L2, paint2);
            rectF.set(L3, f6, ((getMeasuredWidth() - (2.0f * L3)) * this.f) + L3, f7);
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f6);
            if (this.e != 1.0f) {
                this.x = false;
            }
            if (this.x) {
                imageReceiver.h(canvas, null);
            } else {
                imageReceiver2.h(canvas, null);
            }
            if (this.e == 1.0f && !this.x && this.s.b0 == 0) {
                p09 p09Var = this.w;
                p09Var.I(0, false, false);
                p09Var.start();
                this.x = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.E = true;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
        int L = gm.L(15.0f);
        float f = L;
        int i3 = L << 1;
        this.n.i0(f, f, getMeasuredWidth() - i3, getMeasuredHeight() - i3);
        this.r.i0(f, f, getMeasuredWidth() - i3, getMeasuredHeight() - i3);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (f == 0.0f) {
            this.E = false;
        }
        super.setAlpha(f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != 0) {
            this.E = false;
        }
        super.setVisibility(i);
    }

    @Override // vlb
    public final void updateColors() {
        p09 p09Var;
        p09 p09Var2 = this.s;
        if (p09Var2 == null || (p09Var = this.w) == null) {
            return;
        }
        int w0 = cmb.w0(null, cmb.u8, false);
        if (w0 != this.F || p09Var2.getColorFilter() == null) {
            this.F = w0;
            p09Var2.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            p09Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC));
            invalidate();
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
