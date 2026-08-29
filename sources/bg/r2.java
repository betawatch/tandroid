package bg;

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
import i7.f6;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r2 extends LinearLayout {
    public final aj0[] a;
    public q2 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    public r2(Context context, boolean z10) {
        super(context);
        List list = ag.m.a;
        this.a = new aj0[list.size() + 2];
        Paint paint = new Paint(1);
        this.c = paint;
        this.f = 1;
        this.h = -1;
        this.n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = ag.m.a;
            if (i10 >= list2.size() + 2) {
                return;
            }
            aj0[] aj0VarArr = this.a;
            boolean z11 = i10 == 0;
            boolean z12 = i10 == list2.size() + 1;
            aj0 aj0Var = new aj0(getContext());
            aj0Var.setPadding(AndroidUtilities.dp(z11 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(z12 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f));
            aj0Var.setLayoutParams(f6.l(1.0f, 0, 40));
            aj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            aj0VarArr[i11] = aj0Var;
            if (i10 == 0) {
                final int i12 = 0;
                this.a[i11].setOnClickListener(new View.OnClickListener(this) { // from class: bg.o2
                    public final /* synthetic */ r2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                this.b.b.a();
                                break;
                            default:
                                this.b.b.A();
                                break;
                        }
                    }
                });
            } else if (i10 > 0 && i10 <= list2.size()) {
                ag.m mVar = (ag.m) list2.get(i10 - 1);
                if (z10 || !(mVar instanceof ag.b)) {
                    this.a[i11].f(mVar.e(), 28, 28, null);
                    this.a[i11].setOnClickListener(new p2(this, i11, mVar, 0));
                } else {
                    i10++;
                }
            } else if (i10 == list2.size() + 1) {
                this.a[i11].setImageResource(R.drawable.msg_add);
                final int i13 = 1;
                this.a[i11].setOnClickListener(new View.OnClickListener(this) { // from class: bg.o2
                    public final /* synthetic */ r2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.b.b.a();
                                break;
                            default:
                                this.b.b.A();
                                break;
                        }
                    }
                });
            }
            addView(this.a[i11]);
            i11++;
            i10++;
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            aj0[] aj0VarArr = this.a;
            if (i10 >= aj0VarArr.length) {
                return;
            }
            if (this.r == null || this.h != i10) {
                aj0 aj0Var = aj0VarArr[i10];
                if (aj0Var != null) {
                    Drawable drawable = aj0Var.getDrawable();
                    if (drawable instanceof xi0) {
                        xi0 xi0Var = (xi0) drawable;
                        xi0Var.K(0);
                        xi0Var.start();
                    }
                }
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.f == i10) {
                    return;
                }
                int i11 = 1;
                if (this.e) {
                    this.e = false;
                    AndroidUtilities.updateImageViewImageAnimated(aj0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i10;
                this.n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(jr.f);
                this.r.addUpdateListener(new q1(this, i11));
                this.r.addListener(new ag.m0(this, 2));
                this.r.start();
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.b.w().i(i10 - 1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x4 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x4 >= childAt.getLeft() && x4 <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new a4.g(childAt, 14));
                            return true;
                        }
                    } else if (this.f != i10) {
                        a(i10);
                        post(new a4.g(childAt, 14));
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
        int i10 = this.f;
        aj0[] aj0VarArr = this.a;
        aj0 aj0Var = aj0VarArr[i10];
        int i11 = this.h;
        aj0 aj0Var2 = i11 != -1 ? aj0VarArr[i11] : null;
        float f9 = 0.0f;
        float f10 = aj0Var2 != null ? this.n : 0.0f;
        float f11 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f11 = (f10 <= 0.25f || f10 >= 0.5f) ? org.telegram.messenger.x3.a(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f11) + (Math.min((aj0Var.getWidth() - aj0Var.getPaddingLeft()) - aj0Var.getPaddingRight(), (aj0Var.getHeight() - aj0Var.getPaddingTop()) - aj0Var.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (aj0Var.getWidth() / 2.0f) + aj0Var.getX();
        int i12 = this.f;
        int i13 = this.d;
        float dp2 = (i12 == i13 + 1 ? AndroidUtilities.dp(4.0f) : 0.0f) + width;
        float width2 = aj0Var2 != null ? (aj0Var2.getWidth() / 2.0f) + aj0Var2.getX() : 0.0f;
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f9 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(dp2, width2 + f9, f10), (aj0Var.getHeight() / 2.0f) + aj0Var.getY(), dp, this.c);
    }

    public void setDelegate(q2 q2Var) {
        this.b = q2Var;
    }

    public void setSelectedIndex(int i10) {
        this.f = i10;
        if (this.e) {
            this.e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
