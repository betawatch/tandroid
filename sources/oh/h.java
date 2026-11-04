package oh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d2.l0;
import ei.l;
import kg.y;
import org.telegram.messenger.g0;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends RecyclerView {
    public final e T0;
    public final Paint U0;
    public RenderNode V0;
    public float W0;
    public View X0;
    public g Y0;
    public a Z0;
    public int a1;
    public int b1;
    public int c1;

    public h(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.U0 = paint;
        this.b1 = TLObject.FLAG_31;
        this.c1 = TLObject.FLAG_31;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new y(1, 1 == true ? 1 : 0, 1));
        i(new l(4));
        e eVar = new e(this);
        this.T0 = eVar;
        setAdapter(eVar);
        f fVar = new f(this);
        fVar.m = false;
        fVar.C = false;
        fVar.o(xq.h);
        fVar.n(320L);
        setItemAnimator(fVar);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float f10 = 2.14748365E9f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                f10 = Math.min(f10, childAt.getY());
            }
        }
        return f10;
    }

    public final void D0(int i3, TLRPC.InputGroupCall inputGroupCall) {
        int i10;
        e eVar = this.T0;
        if (eVar.d && (i10 = eVar.e) != -1 && eVar.f != null) {
            GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(eVar.f.id, eVar);
        }
        eVar.e = i3;
        eVar.f = inputGroupCall;
        if (eVar.d) {
            eVar.c = GroupCallMessagesController.getInstance(i3).getCallMessages(eVar.f.id);
            eVar.f();
            GroupCallMessagesController.getInstance(i3).subscribeToCallMessages(eVar.f.id, eVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.a1;
        int L = g0.L(16.0f);
        int i3 = measuredHeight + L;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f10 = i3;
        if (f10 < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f11 = measuredHeight;
        float f12 = measuredWidth;
        int saveLayer = canvas.saveLayer(0.0f, f11, f12, f10, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i3);
        this.b1 = measuredHeight;
        this.c1 = i3;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f11);
        canvas.drawRect(0.0f, 0.0f, f12, L, this.U0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i3, measuredWidth, measuredHeight2);
        this.b1 = i3;
        this.c1 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.b1 = TLObject.FLAG_31;
        this.c1 = TLObject.FLAG_31;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (y9 < getMeasuredHeight() - this.a1) {
                return false;
            }
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    z10 = false;
                    break;
                }
                View childAt = getChildAt(i3);
                if (childAt instanceof c) {
                    c cVar = (c) childAt;
                    if (cVar.getVisibility() == 0) {
                        float x11 = x10 - childAt.getX();
                        float y10 = y9 - childAt.getY();
                        l0 l0Var = cVar.x;
                        if (l0Var == null ? false : ((RectF) l0Var.c).contains(x11, y10)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i3++;
            }
            if (!z10) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.b1 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.b1) {
            return true;
        }
        if (this.c1 == Integer.MIN_VALUE || view.getY() <= this.c1) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.T0;
        eVar.d = true;
        int i3 = eVar.e;
        if (i3 == -1 || eVar.f == null) {
            return;
        }
        eVar.c = GroupCallMessagesController.getInstance(i3).getCallMessages(eVar.f.id);
        eVar.f();
        GroupCallMessagesController.getInstance(eVar.e).subscribeToCallMessages(eVar.f.id, eVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.T0;
        eVar.d = false;
        int i3 = eVar.e;
        if (i3 == -1 || eVar.f == null) {
            return;
        }
        GroupCallMessagesController.getInstance(i3).unsubscribeFromCallMessages(eVar.f.id, eVar);
    }

    public void setBlurRoot(View view) {
        this.X0 = view;
    }

    public void setClickCellDelegate(a aVar) {
        this.Z0 = aVar;
    }

    public void setDelegate(g gVar) {
        this.Y0 = gVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            invalidate();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).invalidate();
            }
        }
    }

    public void setVisibleHeight(int i3) {
        if (this.a1 != i3) {
            this.a1 = i3;
            invalidate();
        }
    }
}
