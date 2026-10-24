package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class k10 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ int Y2;
    public final /* synthetic */ Object Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k10(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.Y2 = i10;
        this.Z2 = o2Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public Integer X0(int i10) {
        int i11;
        switch (this.Y2) {
            case 3:
                i11 = ((SessionsActivity) this.Z2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.g6 g6Var = this.n2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, g6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, g6Var));
            default:
                return super.X0(i10);
        }
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.Y2) {
            case 1:
                super.dispatchDraw(canvas);
                d60 d60Var = (d60) this.Z2;
                if (d60Var.z0 != null && d60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = d60Var.z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.o2) d60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    d60Var.z0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                kp0 kp0Var = (kp0) this.Z2;
                Paint paint = kp0Var.w;
                RectF rectF = kp0Var.s;
                RectF rectF2 = kp0Var.r;
                RectF rectF3 = kp0Var.n;
                s4.b0 b0Var = kp0Var.b;
                if (!kp0Var.f.isEmpty()) {
                    float d = kp0Var.e.d(kp0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), r6.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), r6.size() - 1, 0);
                    View m10 = b0Var.m(clamp);
                    View m11 = b0Var.m(clamp2);
                    if (m10 != null || m11 != null) {
                        View view = m10 != null ? m10 : m11;
                        rectF3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF2.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                        paint.setColor(kp0Var.x);
                        float height = rectF.height() / 2.0f;
                        canvas.drawRoundRect(rectF, height, height, paint);
                        super.dispatchDraw(canvas);
                        break;
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.Y2) {
            case 2:
                super.invalidate();
                vo0 vo0Var = ((kp0) this.Z2).F;
                if (vo0Var != null) {
                    vo0Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.Y2) {
            case 0:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new fz(this, 3), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean x1(View view) {
        switch (this.Y2) {
            case 0:
                return !(view instanceof l10) || ((l10) view).getDraggingProgress() <= 0.0f;
            default:
                return super.x1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k10(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Y2 = i10;
        this.Z2 = obj;
    }
}
