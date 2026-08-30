package dg;

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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o2 extends LinearLayout {
    public final jj0[] a;
    public n2 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    public o2(Context context, boolean z4) {
        super(context);
        List list = cg.m.a;
        this.a = new jj0[list.size() + 2];
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
        this.d = list.size() - (!z4 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = cg.m.a;
            if (i10 >= list2.size() + 2) {
                return;
            }
            jj0[] jj0VarArr = this.a;
            boolean z10 = i10 == 0;
            boolean z11 = i10 == list2.size() + 1;
            jj0 jj0Var = new jj0(getContext());
            jj0Var.setPadding(AndroidUtilities.dp(z10 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(z11 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f));
            jj0Var.setLayoutParams(b6.l(1.0f, 0, 40));
            jj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            jj0VarArr[i11] = jj0Var;
            if (i10 == 0) {
                final int i12 = 0;
                this.a[i11].setOnClickListener(new View.OnClickListener(this) { // from class: dg.l2
                    public final /* synthetic */ o2 b;

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
                cg.m mVar = (cg.m) list2.get(i10 - 1);
                if (z4 || !(mVar instanceof cg.b)) {
                    this.a[i11].f(mVar.e(), 28, 28, null);
                    this.a[i11].setOnClickListener(new m2(this, i11, mVar, 0));
                } else {
                    i10++;
                }
            } else if (i10 == list2.size() + 1) {
                this.a[i11].setImageResource(R.drawable.msg_add);
                final int i13 = 1;
                this.a[i11].setOnClickListener(new View.OnClickListener(this) { // from class: dg.l2
                    public final /* synthetic */ o2 b;

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
            jj0[] jj0VarArr = this.a;
            if (i10 >= jj0VarArr.length) {
                return;
            }
            if (this.r == null || this.h != i10) {
                jj0 jj0Var = jj0VarArr[i10];
                if (jj0Var != null) {
                    Drawable drawable = jj0Var.getDrawable();
                    if (drawable instanceof gj0) {
                        gj0 gj0Var = (gj0) drawable;
                        gj0Var.K(0);
                        gj0Var.start();
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
                    AndroidUtilities.updateImageViewImageAnimated(jj0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i10;
                this.n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(nr.f);
                this.r.addUpdateListener(new o1(this, i11));
                this.r.addListener(new cg.l0(this, 2));
                this.r.start();
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.b.v().i(i10 - 1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new ag.d(childAt, 22));
                            return true;
                        }
                    } else if (this.f != i10) {
                        a(i10);
                        post(new ag.d(childAt, 22));
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
        jj0[] jj0VarArr = this.a;
        jj0 jj0Var = jj0VarArr[i10];
        int i11 = this.h;
        jj0 jj0Var2 = i11 != -1 ? jj0VarArr[i11] : null;
        float f10 = 0.0f;
        float f11 = jj0Var2 != null ? this.n : 0.0f;
        float f12 = 1.0f;
        if (f11 > 0.25f && f11 < 0.75f) {
            f12 = (f11 <= 0.25f || f11 >= 0.5f) ? org.telegram.messenger.y3.a(0.75f, f11, 0.25f, 1.0f) : (0.5f - f11) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f12) + (Math.min((jj0Var.getWidth() - jj0Var.getPaddingLeft()) - jj0Var.getPaddingRight(), (jj0Var.getHeight() - jj0Var.getPaddingTop()) - jj0Var.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (jj0Var.getWidth() / 2.0f) + jj0Var.getX();
        int i12 = this.f;
        int i13 = this.d;
        float dp2 = (i12 == i13 + 1 ? AndroidUtilities.dp(4.0f) : 0.0f) + width;
        float width2 = jj0Var2 != null ? (jj0Var2.getWidth() / 2.0f) + jj0Var2.getX() : 0.0f;
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(dp2, width2 + f10, f11), (jj0Var.getHeight() / 2.0f) + jj0Var.getY(), dp, this.c);
    }

    public void setDelegate(n2 n2Var) {
        this.b = n2Var;
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
