// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gw9 extends d79 {
    public final /* synthetic */ byte f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw9(byte b, Context context, Object obj) {
        super(context, null);
        this.f3 = b;
        this.g3 = obj;
    }

    @Override // d79
    public final boolean J0(View view, float f, float f2) {
        switch (this.f3) {
            case 4:
                return true;
            case 7:
                if (!((uic) this.g3).n) {
                    return true;
                }
                int L = hl.L(6.0f);
                RectF rectF = ((sic) view).c;
                float f3 = L;
                return rectF.left - f3 >= f || rectF.right + f3 <= f;
            default:
                return super.J0(view, f, f2);
        }
    }

    @Override // d79
    public final boolean T0() {
        switch (this.f3) {
            case 6:
                return getAdapter() != null && ((xbc) this.g3).B1 && getAdapter().b() <= 2;
            default:
                return super.T0();
        }
    }

    @Override // d79
    public final Integer X0(int i) {
        int i2;
        switch (this.f3) {
            case 0:
                return 0;
            case 1:
            default:
                return super.X0(i);
            case 2:
                i2 = ((SessionsActivity) this.g3).terminateAllSessionsRow;
                vnb vnbVar = this.o2;
                return i == i2 ? Integer.valueOf(aob.p1(0.1f, aob.v0(aob.p7, vnbVar))) : Integer.valueOf(aob.v0(aob.i6, vnbVar));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        switch (this.f3) {
            case 7:
                super.addView(view, i, layoutParams);
                if (!((uic) this.g3).W) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setAlpha(1.0f);
                    break;
                } else {
                    view.setScaleX(0.3f);
                    view.setScaleY(0.3f);
                    view.setAlpha(0.0f);
                    break;
                }
            default:
                super.addView(view, i, layoutParams);
                break;
        }
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f3) {
            case 1:
                bj3 bj3Var = (bj3) this.g3;
                x46 x46Var = bj3Var.f0;
                zb3 zb3Var = bj3Var.d0;
                gx9 gx9Var = bj3Var.e0;
                if (gx9Var != null && zb3Var != null && x46Var != null && gx9Var.n0) {
                    canvas.save();
                    invalidate();
                    int b = gx9Var.b() - 1;
                    int i = 0;
                    while (true) {
                        if (i < getChildCount()) {
                            View childAt = getChildAt(i);
                            if (RecyclerView.S(childAt) == b) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt.getTranslationY() + childAt.getBottom());
                            } else {
                                i++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (gx9Var != null && zb3Var != null && x46Var != null && gx9Var.n0) {
                    canvas.restore();
                }
                if (gx9Var != null && gx9Var.p0 != null) {
                    canvas.save();
                    canvas.translate(gx9Var.p0.getLeft(), gx9Var.p0.getTranslationY() + gx9Var.p0.getTop());
                    gx9Var.p0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                LinearLayout linearLayout = ((ow9) this.g3).f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.f3) {
            case 5:
                s4b s4bVar = (s4b) this.g3;
                fp fpVar = s4bVar.f2;
                if (!(view instanceof x2b) || !s4bVar.L1) {
                    break;
                } else {
                    int b = s4bVar.m1.U(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) fpVar.d;
                    canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(b - ((b / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) fpVar.e;
                    float floatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(b - ((b / 6) * 6))).floatValue();
                    ArrayList arrayList3 = (ArrayList) fpVar.f;
                    canvas.translate(floatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(b - ((b / 6) * 6))).floatValue());
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b = this.f3;
        vnb vnbVar = this.o2;
        Object obj = this.g3;
        switch (b) {
            case 3:
                return super.onInterceptTouchEvent(motionEvent) || rw2.e().g(motionEvent, ((dka) obj).l1, null, vnbVar);
            case 4:
            default:
                return super.onInterceptTouchEvent(motionEvent);
            case 5:
                s4b s4bVar = (s4b) obj;
                if (s4bVar.L1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return super.onInterceptTouchEvent(motionEvent) || rw2.e().g(motionEvent, s4bVar.m1, s4bVar.g2, vnbVar);
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.f3) {
            case 4:
                ((gra) this.g3).E0();
                super.onLayout(z, i, i2, i3, i4);
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 3:
                if (!((dka) obj).q1) {
                    super.requestLayout();
                    break;
                }
                break;
            case 4:
            default:
                super.requestLayout();
                break;
            case 5:
                if (!((s4b) obj).a2) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.f3) {
            case 7:
                super.setAlpha(f);
                ((uic) this.g3).invalidate();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // d79, android.view.View
    public final void setTranslationY(float f) {
        switch (this.f3) {
            case 6:
                super.setTranslationY(f);
                getLocationInWindow(new int[2]);
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw9(KeyEvent.Callback callback, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.f3 = b;
        this.g3 = callback;
    }
}
