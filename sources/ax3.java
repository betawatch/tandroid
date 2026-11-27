// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ax3 extends View {
    public final vnb E;
    public icc F;
    public int G;
    public boolean H;
    public long I;
    public boolean J;
    public final int a;
    public final Drawable[] b;
    public final Drawable c;
    public final Drawable d;
    public String e;
    public boolean f;
    public int h;
    public final int[] n;
    public final int[] r;
    public final Paint s;
    public final RectF w;
    public final mm x;
    public final mm y;

    public ax3(Context context, vnb vnbVar) {
        super(context);
        this.a = hl.L(hl.O1() ? 40.0f : 32.0f);
        this.b = new Drawable[11];
        this.n = new int[]{0, 0};
        this.r = new int[]{0, 0};
        this.s = new Paint(1);
        this.w = new RectF();
        k43 k43Var = k43.h;
        this.x = new mm(125L, this, k43Var);
        this.y = new mm(125L, this, k43Var);
        this.G = -1;
        this.H = true;
        this.E = vnbVar;
        this.c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i = aob.h5;
        vnb vnbVar = this.E;
        aob.A1(aob.v0(i, vnbVar), this.c);
        aob.A1(aob.v0(i, vnbVar), this.d);
        jr2.b.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.Ef, vnbVar), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ax3 ax3Var = this;
        int measuredWidth = ax3Var.getMeasuredWidth();
        int measuredHeight = ax3Var.getMeasuredHeight() - hl.L(2.0f);
        Drawable drawable = ax3Var.c;
        boolean z = 0;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L = ax3Var.h - hl.L(9.0f);
        int measuredHeight2 = ax3Var.getMeasuredHeight() - hl.L(6.34f);
        int L2 = hl.L(9.0f) + ax3Var.h;
        int measuredHeight3 = ax3Var.getMeasuredHeight();
        Drawable drawable2 = ax3Var.d;
        drawable2.setBounds(L, measuredHeight2, L2, measuredHeight3);
        drawable2.draw(canvas);
        if (ax3Var.e != null) {
            boolean z2 = ax3Var.f;
            vnb vnbVar = ax3Var.E;
            int[] iArr = ax3Var.n;
            mm mmVar = ax3Var.x;
            Paint paint = ax3Var.s;
            Drawable[] drawableArr = ax3Var.b;
            RectF rectF = ax3Var.w;
            float f = 1.0f;
            int i = ax3Var.a;
            if (!z2) {
                float e = mmVar.e(false, iArr[0]);
                float f2 = i;
                int L3 = hl.L(5.0f);
                float f3 = L3;
                int i2 = L3 + i;
                rectF.set((int) ((f2 * e) + hl.L((e * 4.0f) + 5.0f)), f3, r4 + i, i2);
                rectF.inset(hl.L(-2.0f), hl.L(-2.0f));
                paint.setColor(aob.v0(aob.i6, vnbVar));
                canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
                for (int i3 = 0; i3 < 6; i3++) {
                    Drawable drawable3 = drawableArr[i3];
                    if (drawable3 != null) {
                        int L4 = hl.L((i3 << 2) + 5) + (i * i3);
                        float min = ((1.0f - (Math.min(0.5f, Math.abs(i3 - e)) * 2.0f)) * 0.1f) + 0.9f;
                        canvas.save();
                        float f4 = f2 / 2.0f;
                        canvas.scale(min, min, L4 + f4, f4 + f3);
                        drawable3.setBounds(L4, L3, L4 + i, i2);
                        drawable3.draw(canvas);
                        canvas.restore();
                    }
                }
                return;
            }
            int i4 = 0;
            while (i4 < 2) {
                float e2 = (i4 == 0 ? mmVar : ax3Var.y).e(z, iArr[i4]);
                int i5 = z;
                float max = Math.max(0.0f, Math.min(f, -e2));
                rectF.set((int) ((i * (e2 + f)) + hl.L((r6 * 4.0f) + (Math.max(0.0f, Math.min(f, r6)) * 3.0f) + 5.0f)), hl.U1(max, ((hl.L(f) + i) * i4) + hl.L(3.0f), (ax3Var.getMeasuredHeight() - i) / 2), r6 + i, r9 + i);
                rectF.inset(hl.L(-2.0f), hl.L(max * (-2.0f)));
                paint.setColor(aob.p1(hl.R1(f, 0.5f, max), aob.v0(aob.i6, vnbVar)));
                canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
                int i6 = i5;
                while (i6 < 5) {
                    i6++;
                    int i7 = (i4 * 5) + i6;
                    int L5 = hl.L((i6 << 2) + 8) + (i * i6);
                    int L6 = ((hl.L(f) + i) * i4) + hl.L(3.0f);
                    drawableArr[i7].setBounds(L5, L6, L5 + i, L6 + i);
                    drawableArr[i7].draw(canvas);
                    f = f;
                }
                i4++;
                ax3Var = this;
                z = i5;
            }
            char c = z;
            drawableArr[c].setBounds(hl.L(5.0f), (getMeasuredHeight() - i) / 2, hl.L(5.0f) + i, (getMeasuredHeight() + i) / 2);
            drawableArr[c].draw(canvas);
            canvas.drawRect(hl.L(8.45f) + i, hl.L(2.0f), uh9.w(8.45f, i, 1), getMeasuredHeight() - hl.L(6.0f), aob.j0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        if (this.J) {
            this.J = false;
            return false;
        }
        if (!this.f) {
            return super.onTouchEvent(motionEvent);
        }
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.b;
            if (i4 >= drawableArr.length) {
                i4 = -1;
                break;
            }
            if (drawableArr[i4].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i3 = this.G) != -1 && ((i4 == 0 || ((i3 == 0 && i4 >= 1 && i4 <= 5) || (i3 == 1 && i4 >= 6 && i4 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i4].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i4].getBounds().right))) {
                break;
            }
            i4++;
        }
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
            return false;
        }
        int action = motionEvent.getAction();
        int[] iArr = this.n;
        if (action == 0) {
            this.G = -1;
            this.I = System.currentTimeMillis();
            this.H = iArr[0] == iArr[1];
        }
        int i5 = iArr[0];
        int[] iArr2 = this.r;
        iArr2[0] = i5;
        iArr2[1] = iArr[1];
        boolean z = System.currentTimeMillis() - this.I > 300 && motionEvent.getAction() == 2;
        if (i4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
        } else if (i4 >= 1 && i4 <= 5 && ((i2 = this.G) == -1 || i2 == 0)) {
            this.G = 0;
            int i6 = i4 - 1;
            iArr[0] = i6;
            if (iArr[1] == -1 || (this.H && z)) {
                iArr[1] = i6;
            }
        } else if (i4 >= 6 && i4 <= 10 && ((i = this.G) == -1 || i == 1)) {
            this.G = 1;
            int i7 = i4 - 6;
            iArr[1] = i7;
            if (iArr[0] == -1 || (this.H && z)) {
                iArr[0] = i7;
            }
        }
        if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
            hl.W3(this);
            icc iccVar = this.F;
            if (iccVar != null) {
                iccVar.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            }
        }
        invalidate();
        if (motionEvent.getAction() == 1) {
            this.G = -1;
        }
        return true;
    }

    public void setArrowX(int i) {
        this.h = i;
        invalidate();
    }

    public void setOnSelectionUpdateListener(icc iccVar) {
        this.F = iccVar;
    }
}
