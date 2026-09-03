package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c81 extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ int U2;
    public final /* synthetic */ Object V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c81(Object obj, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = obj;
    }

    @Override // org.telegram.ui.Components.sl0
    public boolean E0(float f10) {
        switch (this.U2) {
            case 3:
                org.telegram.ui.Components.mi miVar = ((vf.c0) this.V2).b;
                return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + miVar.Y1[0]) + (!miVar.d0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public Integer V0(int i10) {
        int i11;
        switch (this.U2) {
            case 0:
                i11 = ((SessionsActivity) this.V2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.g6 g6Var = this.m2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.p7, g6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var));
            default:
                return super.V0(i10);
        }
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.U2) {
            case 2:
                org.telegram.ui.Components.df dfVar = (org.telegram.ui.Components.df) this.V2;
                c81 c81Var = dfVar.c;
                if (c81Var.getLayoutManager() != null && c81Var.getAdapter() != null && c81Var.getAdapter().h() != 0) {
                    float dp = dfVar.h - AndroidUtilities.dp(8.0f);
                    dfVar.e = dp - AndroidUtilities.dp(16.0f);
                    qg.b bVar = dfVar.r;
                    if (bVar != null) {
                        bVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), dfVar.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i10, int i11) {
        int i12 = this.U2;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 1:
                qt q10 = qt.q();
                qh.h1 h1Var = (qh.h1) this.V2;
                return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, h1Var.b, h1Var.f, this.m2);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c81(vf.c0 c0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = 3;
        this.V2 = c0Var;
    }

    private final void v1(int i10, int i11) {
    }
}
