package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class et extends org.telegram.ui.Components.ek0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et(int i7, Context context, Object obj) {
        super(context, null);
        this.f3 = i7;
        this.g3 = obj;
    }

    @Override // org.telegram.ui.Components.ek0
    public Integer V0(int i7) {
        int i10;
        int i11;
        switch (this.f3) {
            case 0:
                i10 = ((DataSettingsActivity) this.g3).resetDownloadRow;
                org.telegram.ui.ActionBar.h6 h6Var = this.o2;
                return i7 == i10 ? Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p7, h6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, h6Var));
            case 1:
                ArrayList arrayList = ((kz) this.g3).Q;
                cz czVar = (i7 < 0 || i7 >= arrayList.size()) ? null : (cz) arrayList.get(i7);
                org.telegram.ui.ActionBar.h6 h6Var2 = this.o2;
                return (czVar == null || !czVar.l) ? Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, h6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p7, h6Var2)));
            case 7:
                i11 = ((SessionsActivity) this.g3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.h6 h6Var3 = this.o2;
                return i7 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p7, h6Var3))) : Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, h6Var3));
            default:
                return super.V0(i7);
        }
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f3) {
            case 2:
                if (getAdapter() == ((c00) this.g3).V) {
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (T(getChildAt(i7)).f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i7).getX(), (getChildAt(i7).getY() - getChildAt(i7).getMeasuredHeight()) + org.telegram.messenger.g0.L(2.0f));
                            getChildAt(i7).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
            default:
                super.dispatchDraw(canvas);
                break;
            case 4:
                super.dispatchDraw(canvas);
                m40 m40Var = (m40) this.g3;
                if (m40Var.A0 != null && m40Var.B0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = m40Var.A0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.g2) m40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    m40Var.A0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 5:
                qa0 qa0Var = (qa0) this.g3;
                RectF rectF = qa0Var.a0;
                if (qa0Var.Z != null) {
                    int L = org.telegram.messenger.g0.L(12.0f);
                    qa0Var.Z.setBounds(-L, qa0Var.b0 - L, getWidth() + L, getHeight() + L);
                    qa0Var.Z.draw(canvas);
                    int i10 = qa0Var.N0;
                    if (i10 == 0 || i10 == 1) {
                        int L2 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L2) / 2.0f, org.telegram.messenger.g0.L(10.0f) + qa0Var.b0, (getWidth() + L2) / 2.0f, org.telegram.messenger.g0.L(4.0f) + r4);
                        org.telegram.ui.ActionBar.m6.t0.setColor(qa0Var.getThemedColor(org.telegram.ui.ActionBar.m6.zj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 6:
                km0 km0Var = (km0) this.g3;
                Paint paint = km0Var.x;
                RectF rectF2 = km0Var.s;
                RectF rectF3 = km0Var.r;
                RectF rectF4 = km0Var.n;
                v4.c0 c0Var = km0Var.b;
                if (!km0Var.f.isEmpty()) {
                    float e10 = km0Var.e.e(false, km0Var.d);
                    double d = e10;
                    int j3 = Utilities.j((int) Math.floor(d), r6.size() - 1, 0);
                    int j10 = Utilities.j((int) Math.ceil(d), r6.size() - 1, 0);
                    View m10 = c0Var.m(j3);
                    View m11 = c0Var.m(j10);
                    if (m10 != null || m11 != null) {
                        View view = m10 != null ? m10 : m11;
                        rectF4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF3.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        org.telegram.messenger.g0.Z1(rectF4, rectF3, e10 - j3, rectF2);
                        paint.setColor(km0Var.y);
                        float height = rectF2.height() / 2.0f;
                        canvas.drawRoundRect(rectF2, height, height, paint);
                        super.dispatchDraw(canvas);
                        break;
                    }
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 5:
                if (motionEvent.getActionMasked() != 0 || motionEvent.getY() >= ((qa0) this.g3).b0) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f3) {
            case 2:
                if (getAdapter() != ((c00) this.g3).V || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.f3) {
            case 6:
                super.invalidate();
                vl0 vl0Var = ((km0) this.g3).G;
                if (vl0Var != null) {
                    vl0Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 3:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.h3(new lz(this, 2), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i7, Rect rect) {
        switch (this.f3) {
            case 1:
                return false;
            default:
                return super.requestFocus(i7, rect);
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public boolean u1(View view) {
        switch (this.f3) {
            case 3:
                return !(view instanceof f00) || ((f00) view).getDraggingProgress() <= 0.0f;
            default:
                return super.u1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et(Object obj, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f3 = i7;
        this.g3 = obj;
    }
}
