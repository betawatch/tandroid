// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ks7 extends LinearLayout {
    public final ry8[] a;
    public js7 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    /* JADX WARN: Multi-variable type inference failed */
    public ks7(Context context, boolean z) {
        super(context);
        List list = m01.a;
        this.a = new ry8[list.size() + 2];
        final byte b = 1;
        Paint paint = new Paint(1);
        this.c = paint;
        this.f = 1;
        this.h = -1;
        this.n = 0.0f;
        final byte b2 = 0;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z ? 1 : 0);
        int i = 0;
        int i2 = 0;
        while (true) {
            List list2 = m01.a;
            if (i >= list2.size() + 2) {
                return;
            }
            ry8[] ry8VarArr = this.a;
            Object[] objArr = i == 0;
            Object[] objArr2 = i == list2.size() + 1;
            ry8 ry8Var = new ry8(getContext());
            ry8Var.setPadding(gl.L(objArr != false ? 0.0f : 8.0f), gl.L(8.0f), gl.L(objArr2 != false ? 0.0f : 8.0f), gl.L(8.0f));
            ry8Var.setLayoutParams(nme.l(1.0f, 0, 40));
            ry8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ry8VarArr[i2] = ry8Var;
            if (i == 0) {
                this.a[i2].setOnClickListener(new View.OnClickListener(this) { // from class: is7
                    public final /* synthetic */ ks7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        ks7 ks7Var = this.b;
                        switch (b3) {
                            case 0:
                                ks7Var.b.a();
                                break;
                            default:
                                ks7Var.b.z();
                                break;
                        }
                    }
                });
            } else if (i > 0 && i <= list2.size()) {
                m01 m01Var = (m01) list2.get(i - 1);
                if (z || !(m01Var instanceof g01)) {
                    this.a[i2].f(m01Var.d(), 28, 28, null);
                    this.a[i2].setOnClickListener(new wg((Object) this, i2, (Object) m01Var, (byte) 11));
                } else {
                    i++;
                }
            } else if (i == list2.size() + 1) {
                this.a[i2].setImageResource(R.drawable.msg_add);
                this.a[i2].setOnClickListener(new View.OnClickListener(this) { // from class: is7
                    public final /* synthetic */ ks7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        ks7 ks7Var = this.b;
                        switch (b3) {
                            case 0:
                                ks7Var.b.a();
                                break;
                            default:
                                ks7Var.b.z();
                                break;
                        }
                    }
                });
            }
            addView(this.a[i2]);
            i2++;
            i++;
        }
    }

    public final void a(int i) {
        if (i >= 0) {
            ry8[] ry8VarArr = this.a;
            if (i < ry8VarArr.length) {
                if (this.r == null || this.h != i) {
                    ry8 ry8Var = ry8VarArr[i];
                    if (ry8Var != null) {
                        Drawable drawable = ry8Var.getDrawable();
                        if (drawable instanceof oy8) {
                            oy8 oy8Var = (oy8) drawable;
                            oy8Var.H(0);
                            oy8Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f != i) {
                        if (this.e) {
                            this.e = false;
                            gl.M3(ry8VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i;
                        this.n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.r = duration;
                        duration.setInterpolator(s33.f);
                        this.r.addUpdateListener(new ni4(this, (byte) 27));
                        this.r.addListener(new v85(this, (byte) 22));
                        this.r.start();
                    }
                }
            }
        }
    }

    public final void b(int i) {
        a(i);
        this.b.w().i(i - 1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            motionEvent.getY();
            for (int i = 1; i < getChildCount() - 1; i++) {
                View childAt = getChildAt(i);
                if (x >= childAt.getLeft() && x <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i) {
                            a(i);
                            post(new uc(childAt, (byte) 3));
                            return true;
                        }
                    } else if (this.f != i) {
                        a(i);
                        post(new uc(childAt, (byte) 3));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f;
        ry8[] ry8VarArr = this.a;
        ry8 ry8Var = ry8VarArr[i];
        int i2 = this.h;
        ry8 ry8Var2 = i2 != -1 ? ry8VarArr[i2] : null;
        float f = 0.0f;
        float f2 = ry8Var2 != null ? this.n : 0.0f;
        float f3 = 1.0f;
        if (f2 > 0.25f && f2 < 0.75f) {
            f3 = (f2 <= 0.25f || f2 >= 0.5f) ? tb4.x(0.75f, f2, 0.25f, 1.0f) : (0.5f - f2) / 0.25f;
        }
        float L = (gl.L(3.0f) * f3) + (Math.min((ry8Var.getWidth() - ry8Var.getPaddingLeft()) - ry8Var.getPaddingRight(), (ry8Var.getHeight() - ry8Var.getPaddingTop()) - ry8Var.getPaddingBottom()) / 2.0f) + gl.L(3.0f);
        float width = (ry8Var.getWidth() / 2.0f) + ry8Var.getX();
        int i3 = this.f;
        int i4 = this.d;
        float L2 = (i3 == i4 + 1 ? gl.L(4.0f) : 0.0f) + width;
        float width2 = ry8Var2 != null ? (ry8Var2.getWidth() / 2.0f) + ry8Var2.getX() : 0.0f;
        int i5 = this.h;
        if (i5 != -1 && i5 == i4 + 1) {
            f = gl.L(4.0f);
        }
        canvas.drawCircle(gl.R1(L2, width2 + f, f2), (ry8Var.getHeight() / 2.0f) + ry8Var.getY(), L, this.c);
    }

    public void setDelegate(js7 js7Var) {
        this.b = js7Var;
    }

    public void setSelectedIndex(int i) {
        this.f = i;
        if (this.e) {
            this.e = false;
            gl.M3(this.a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
