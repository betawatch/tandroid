package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m10 extends org.telegram.ui.Components.nm0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m10(int i10, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.f3 = i10;
        this.g3 = r2Var;
    }

    @Override // org.telegram.ui.Components.nm0
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

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f3) {
            case 1:
                super.dispatchDraw(canvas);
                g60 g60Var = (g60) this.g3;
                if (g60Var.z0 != null && g60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = g60Var.z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.r2) g60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    g60Var.z0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                sp0 sp0Var = (sp0) this.g3;
                Paint paint = sp0Var.w;
                RectF rectF = sp0Var.s;
                RectF rectF2 = sp0Var.r;
                RectF rectF3 = sp0Var.n;
                s4.c0 c0Var = sp0Var.b;
                if (!sp0Var.f.isEmpty()) {
                    float d = sp0Var.e.d(sp0Var.d, false);
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
                        paint.setColor(sp0Var.x);
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
                dp0 dp0Var = ((sp0) this.g3).F;
                if (dp0Var != null) {
                    dp0Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new r00(this, 2), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.nm0
    public boolean x1(View view) {
        switch (this.f3) {
            case 0:
                return !(view instanceof n10) || ((n10) view).getDraggingProgress() <= 0.0f;
            default:
                return super.x1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m10(Object obj, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f3 = i10;
        this.g3 = obj;
    }
}
