package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k10 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k10(int i10, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.f3 = i10;
        this.g3 = r2Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public Integer W0(int i10) {
        int i11;
        switch (this.f3) {
            case 3:
                i11 = ((SessionsActivity) this.g3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.u6 u6Var = this.n2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.p7, u6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i6, u6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f3) {
            case 1:
                super.dispatchDraw(canvas);
                e60 e60Var = (e60) this.g3;
                if (e60Var.z0 != null && e60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = e60Var.z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.r2) e60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    e60Var.z0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                qp0 qp0Var = (qp0) this.g3;
                Paint paint = qp0Var.w;
                RectF rectF = qp0Var.s;
                RectF rectF2 = qp0Var.r;
                RectF rectF3 = qp0Var.n;
                s4.c0 c0Var = qp0Var.b;
                if (!qp0Var.f.isEmpty()) {
                    float d = qp0Var.e.d(qp0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), r6.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), r6.size() - 1, 0);
                    View m10 = c0Var.m(clamp);
                    View m11 = c0Var.m(clamp2);
                    if (m10 != null || m11 != null) {
                        View view = m10 != null ? m10 : m11;
                        rectF3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF2.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                        paint.setColor(qp0Var.x);
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
        switch (this.f3) {
            case 2:
                super.invalidate();
                bp0 bp0Var = ((qp0) this.g3).F;
                if (bp0Var != null) {
                    bp0Var.run();
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
        switch (this.f3) {
            case 0:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new p00(this, 2), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean x1(View view) {
        switch (this.f3) {
            case 0:
                return !(view instanceof l10) || ((l10) view).getDraggingProgress() <= 0.0f;
            default:
                return super.x1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k10(Object obj, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f3 = i10;
        this.g3 = obj;
    }
}
