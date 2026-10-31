package dh;

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
import b2.n0;
import org.telegram.messenger.i0;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends RecyclerView {
    public final h S0;
    public final Paint T0;
    public RenderNode U0;
    public float V0;
    public View W0;
    public j X0;
    public b Y0;
    public int Z0;
    public int a1;
    public int b1;

    public k(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.T0 = paint;
        this.a1 = TLObject.FLAG_31;
        this.b1 = TLObject.FLAG_31;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i0.L(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new f(1, 1 == true ? 1 : 0, 0));
        i(new g(0));
        h hVar = new h(this);
        this.S0 = hVar;
        setAdapter(hVar);
        i iVar = new i(this);
        iVar.m = false;
        iVar.C = false;
        iVar.o(gr.h);
        iVar.n(320L);
        setItemAnimator(iVar);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float f7 = 2.14748365E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                f7 = Math.min(f7, childAt.getY());
            }
        }
        return f7;
    }

    public final void D0(int i10, TLRPC.InputGroupCall inputGroupCall) {
        int i11;
        h hVar = this.S0;
        if (hVar.d && (i11 = hVar.e) != -1 && hVar.f != null) {
            GroupCallMessagesController.getInstance(i11).unsubscribeFromCallMessages(hVar.f.id, hVar);
        }
        hVar.e = i10;
        hVar.f = inputGroupCall;
        if (hVar.d) {
            hVar.c = GroupCallMessagesController.getInstance(i10).getCallMessages(hVar.f.id);
            hVar.f();
            GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(hVar.f.id, hVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.Z0;
        int L = i0.L(16.0f);
        int i10 = measuredHeight + L;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f7 = i10;
        if (f7 < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f10 = measuredHeight;
        float f11 = measuredWidth;
        int saveLayer = canvas.saveLayer(0.0f, f10, f11, f7, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i10);
        this.a1 = measuredHeight;
        this.b1 = i10;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f10);
        canvas.drawRect(0.0f, 0.0f, f11, L, this.T0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i10, measuredWidth, measuredHeight2);
        this.a1 = i10;
        this.b1 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.a1 = TLObject.FLAG_31;
        this.b1 = TLObject.FLAG_31;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (y3 < getMeasuredHeight() - this.Z0) {
                return false;
            }
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    z10 = false;
                    break;
                }
                View childAt = getChildAt(i10);
                if (childAt instanceof d) {
                    d dVar = (d) childAt;
                    if (dVar.getVisibility() == 0) {
                        float x11 = x10 - childAt.getX();
                        float y10 = y3 - childAt.getY();
                        n0 n0Var = dVar.x;
                        if (n0Var == null ? false : ((RectF) n0Var.c).contains(x11, y10)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i10++;
            }
            if (!z10) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.a1 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.a1) {
            return true;
        }
        if (this.b1 == Integer.MIN_VALUE || view.getY() <= this.b1) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = this.S0;
        hVar.d = true;
        int i10 = hVar.e;
        if (i10 == -1 || hVar.f == null) {
            return;
        }
        hVar.c = GroupCallMessagesController.getInstance(i10).getCallMessages(hVar.f.id);
        hVar.f();
        GroupCallMessagesController.getInstance(hVar.e).subscribeToCallMessages(hVar.f.id, hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.S0;
        hVar.d = false;
        int i10 = hVar.e;
        if (i10 == -1 || hVar.f == null) {
            return;
        }
        GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(hVar.f.id, hVar);
    }

    public void setBlurRoot(View view) {
        this.W0 = view;
    }

    public void setClickCellDelegate(b bVar) {
        this.Y0 = bVar;
    }

    public void setDelegate(j jVar) {
        this.X0 = jVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            invalidate();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).invalidate();
            }
        }
    }

    public void setVisibleHeight(int i10) {
        if (this.Z0 != i10) {
            this.Z0 = i10;
            invalidate();
        }
    }
}
