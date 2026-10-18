package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class i10 extends org.telegram.ui.Components.im0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ Object W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i10(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.V2 = i10;
        this.W2 = n2Var;
    }

    @Override // org.telegram.ui.Components.im0
    public Integer W0(int i10) {
        int i11;
        switch (this.V2) {
            case 3:
                i11 = ((SessionsActivity) this.W2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.d6 d6Var = this.n2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.p7, d6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.V2) {
            case 1:
                super.dispatchDraw(canvas);
                b60 b60Var = (b60) this.W2;
                if (b60Var.z0 != null && b60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = b60Var.z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.n2) b60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    b60Var.z0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                jp0 jp0Var = (jp0) this.W2;
                Paint paint = jp0Var.w;
                RectF rectF = jp0Var.s;
                RectF rectF2 = jp0Var.r;
                RectF rectF3 = jp0Var.n;
                s4.b0 b0Var = jp0Var.b;
                if (!jp0Var.f.isEmpty()) {
                    float d = jp0Var.e.d(jp0Var.d, false);
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
                        paint.setColor(jp0Var.x);
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
        switch (this.V2) {
            case 2:
                super.invalidate();
                uo0 uo0Var = ((jp0) this.W2).F;
                if (uo0Var != null) {
                    uo0Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V2) {
            case 0:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new fz(this, 3), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i10(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = obj;
    }
}
