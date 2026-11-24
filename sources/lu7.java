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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lu7 extends LinearLayout {
    public final s09[] a;
    public ku7 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    /* JADX WARN: Multi-variable type inference failed */
    public lu7(Context context, boolean z) {
        super(context);
        List list = u11.a;
        this.a = new s09[list.size() + 2];
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
            List list2 = u11.a;
            if (i >= list2.size() + 2) {
                return;
            }
            s09[] s09VarArr = this.a;
            Object[] objArr = i == 0;
            Object[] objArr2 = i == list2.size() + 1;
            s09 s09Var = new s09(getContext());
            s09Var.setPadding(gm.L(objArr != false ? 0.0f : 8.0f), gm.L(8.0f), gm.L(objArr2 != false ? 0.0f : 8.0f), gm.L(8.0f));
            s09Var.setLayoutParams(qoe.l(1.0f, 0, 40));
            s09Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            s09VarArr[i2] = s09Var;
            if (i == 0) {
                this.a[i2].setOnClickListener(new View.OnClickListener(this) { // from class: ju7
                    public final /* synthetic */ lu7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        lu7 lu7Var = this.b;
                        switch (b3) {
                            case 0:
                                lu7Var.b.a();
                                break;
                            default:
                                lu7Var.b.z();
                                break;
                        }
                    }
                });
            } else if (i > 0 && i <= list2.size()) {
                u11 u11Var = (u11) list2.get(i - 1);
                if (z || !(u11Var instanceof o11)) {
                    this.a[i2].f(u11Var.d(), 28, 28, null);
                    this.a[i2].setOnClickListener(new wh((Object) this, i2, (Object) u11Var, (byte) 11));
                } else {
                    i++;
                }
            } else if (i == list2.size() + 1) {
                this.a[i2].setImageResource(R.drawable.msg_add);
                this.a[i2].setOnClickListener(new View.OnClickListener(this) { // from class: ju7
                    public final /* synthetic */ lu7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        lu7 lu7Var = this.b;
                        switch (b3) {
                            case 0:
                                lu7Var.b.a();
                                break;
                            default:
                                lu7Var.b.z();
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
            s09[] s09VarArr = this.a;
            if (i < s09VarArr.length) {
                if (this.r == null || this.h != i) {
                    s09 s09Var = s09VarArr[i];
                    if (s09Var != null) {
                        Drawable drawable = s09Var.getDrawable();
                        if (drawable instanceof p09) {
                            p09 p09Var = (p09) drawable;
                            p09Var.H(0);
                            p09Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f != i) {
                        if (this.e) {
                            this.e = false;
                            gm.L3(s09VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i;
                        this.n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.r = duration;
                        duration.setInterpolator(d53.f);
                        this.r.addUpdateListener(new fh4(this, (byte) 29));
                        this.r.addListener(new v85(this, (byte) 24));
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
                            post(new ud(childAt, (byte) 3));
                            return true;
                        }
                    } else if (this.f != i) {
                        a(i);
                        post(new ud(childAt, (byte) 3));
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
        s09[] s09VarArr = this.a;
        s09 s09Var = s09VarArr[i];
        int i2 = this.h;
        s09 s09Var2 = i2 != -1 ? s09VarArr[i2] : null;
        float f = 0.0f;
        float f2 = s09Var2 != null ? this.n : 0.0f;
        float f3 = 1.0f;
        if (f2 > 0.25f && f2 < 0.75f) {
            f3 = (f2 <= 0.25f || f2 >= 0.5f) ? td4.y(0.75f, f2, 0.25f, 1.0f) : (0.5f - f2) / 0.25f;
        }
        float L = (gm.L(3.0f) * f3) + (Math.min((s09Var.getWidth() - s09Var.getPaddingLeft()) - s09Var.getPaddingRight(), (s09Var.getHeight() - s09Var.getPaddingTop()) - s09Var.getPaddingBottom()) / 2.0f) + gm.L(3.0f);
        float width = (s09Var.getWidth() / 2.0f) + s09Var.getX();
        int i3 = this.f;
        int i4 = this.d;
        float L2 = (i3 == i4 + 1 ? gm.L(4.0f) : 0.0f) + width;
        float width2 = s09Var2 != null ? (s09Var2.getWidth() / 2.0f) + s09Var2.getX() : 0.0f;
        int i5 = this.h;
        if (i5 != -1 && i5 == i4 + 1) {
            f = gm.L(4.0f);
        }
        canvas.drawCircle(gm.R1(L2, width2 + f, f2), (s09Var.getHeight() / 2.0f) + s09Var.getY(), L, this.c);
    }

    public void setDelegate(ku7 ku7Var) {
        this.b = ku7Var;
    }

    public void setSelectedIndex(int i) {
        this.f = i;
        if (this.e) {
            this.e = false;
            gm.L3(this.a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
