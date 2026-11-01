package jg;

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
import org.telegram.messenger.m5;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y1 extends LinearLayout {
    public final fi0[] a;
    public x1 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    /* JADX WARN: Multi-variable type inference failed */
    public y1(Context context, boolean z10) {
        super(context);
        List list = ig.h.a;
        this.a = new fi0[list.size() + 2];
        final int i10 = 1;
        Paint paint = new Paint(1);
        this.c = paint;
        this.f = 1;
        this.h = -1;
        this.n = 0.0f;
        final int i11 = 0;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            List list2 = ig.h.a;
            if (i12 >= list2.size() + 2) {
                return;
            }
            fi0[] fi0VarArr = this.a;
            Object[] objArr = i12 == 0;
            Object[] objArr2 = i12 == list2.size() + 1;
            fi0 fi0Var = new fi0(getContext());
            fi0Var.setPadding(org.telegram.messenger.i0.L(objArr != false ? 0.0f : 8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(objArr2 != false ? 0.0f : 8.0f), org.telegram.messenger.i0.L(8.0f));
            fi0Var.setLayoutParams(b6.l(1.0f, 0, 40));
            fi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            fi0VarArr[i13] = fi0Var;
            if (i12 == 0) {
                this.a[i13].setOnClickListener(new View.OnClickListener(this) { // from class: jg.v1
                    public final /* synthetic */ y1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                this.b.b.a();
                                break;
                            default:
                                this.b.b.A();
                                break;
                        }
                    }
                });
            } else if (i12 > 0 && i12 <= list2.size()) {
                ig.h hVar = (ig.h) list2.get(i12 - 1);
                if (z10 || !(hVar instanceof ig.b)) {
                    this.a[i13].f(hVar.e(), 28, 28, null);
                    this.a[i13].setOnClickListener(new w1(this, i13, hVar, i11));
                } else {
                    i12++;
                }
            } else if (i12 == list2.size() + 1) {
                this.a[i13].setImageResource(R.drawable.msg_add);
                this.a[i13].setOnClickListener(new View.OnClickListener(this) { // from class: jg.v1
                    public final /* synthetic */ y1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
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
            addView(this.a[i13]);
            i13++;
            i12++;
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            fi0[] fi0VarArr = this.a;
            if (i10 >= fi0VarArr.length) {
                return;
            }
            if (this.r == null || this.h != i10) {
                fi0 fi0Var = fi0VarArr[i10];
                if (fi0Var != null) {
                    Drawable drawable = fi0Var.getDrawable();
                    if (drawable instanceof ci0) {
                        ci0 ci0Var = (ci0) drawable;
                        ci0Var.M(0);
                        ci0Var.start();
                    }
                }
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.f == i10) {
                    return;
                }
                if (this.e) {
                    this.e = false;
                    org.telegram.messenger.i0.Q3(fi0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i10;
                this.n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(gr.f);
                this.r.addUpdateListener(new bg.k(this, 4));
                this.r.addListener(new bg.e(this, 6));
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
                            post(new u1(0, childAt));
                            return true;
                        }
                    } else if (this.f != i10) {
                        a(i10);
                        post(new u1(0, childAt));
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
        fi0[] fi0VarArr = this.a;
        fi0 fi0Var = fi0VarArr[i10];
        int i11 = this.h;
        fi0 fi0Var2 = i11 != -1 ? fi0VarArr[i11] : null;
        float f7 = 0.0f;
        float f10 = fi0Var2 != null ? this.n : 0.0f;
        float f11 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f11 = (f10 <= 0.25f || f10 >= 0.5f) ? m5.y(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float L = (org.telegram.messenger.i0.L(3.0f) * f11) + (Math.min((fi0Var.getWidth() - fi0Var.getPaddingLeft()) - fi0Var.getPaddingRight(), (fi0Var.getHeight() - fi0Var.getPaddingTop()) - fi0Var.getPaddingBottom()) / 2.0f) + org.telegram.messenger.i0.L(3.0f);
        float width = (fi0Var.getWidth() / 2.0f) + fi0Var.getX();
        int i12 = this.f;
        int i13 = this.d;
        float L2 = (i12 == i13 + 1 ? org.telegram.messenger.i0.L(4.0f) : 0.0f) + width;
        float width2 = fi0Var2 != null ? (fi0Var2.getWidth() / 2.0f) + fi0Var2.getX() : 0.0f;
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f7 = org.telegram.messenger.i0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.i0.T1(L2, width2 + f7, f10), (fi0Var.getHeight() / 2.0f) + fi0Var.getY(), L, this.c);
    }

    public void setDelegate(x1 x1Var) {
        this.b = x1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f = i10;
        if (this.e) {
            this.e = false;
            org.telegram.messenger.i0.Q3(this.a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
