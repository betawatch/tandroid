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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class dt extends org.telegram.ui.Components.ek0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt(int i7, Context context, Object obj) {
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
                org.telegram.ui.ActionBar.i6 i6Var = this.o2;
                return i7 == i10 ? Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.p7, i6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var));
            case 1:
                ArrayList arrayList = ((jz) this.g3).Q;
                bz bzVar = (i7 < 0 || i7 >= arrayList.size()) ? null : (bz) arrayList.get(i7);
                org.telegram.ui.ActionBar.i6 i6Var2 = this.o2;
                return (bzVar == null || !bzVar.l) ? Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.p7, i6Var2)));
            case 7:
                i11 = ((SessionsActivity) this.g3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.i6 i6Var3 = this.o2;
                return i7 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.p7, i6Var3))) : Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var3));
            default:
                return super.V0(i7);
        }
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f3) {
            case 2:
                if (getAdapter() == ((b00) this.g3).V) {
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
                l40 l40Var = (l40) this.g3;
                if (l40Var.A0 != null && l40Var.B0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = l40Var.A0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.g2) l40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    l40Var.A0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 5:
                pa0 pa0Var = (pa0) this.g3;
                RectF rectF = pa0Var.a0;
                if (pa0Var.Z != null) {
                    int L = org.telegram.messenger.g0.L(12.0f);
                    pa0Var.Z.setBounds(-L, pa0Var.b0 - L, getWidth() + L, getHeight() + L);
                    pa0Var.Z.draw(canvas);
                    int i10 = pa0Var.N0;
                    if (i10 == 0 || i10 == 1) {
                        int L2 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L2) / 2.0f, org.telegram.messenger.g0.L(10.0f) + pa0Var.b0, (getWidth() + L2) / 2.0f, org.telegram.messenger.g0.L(4.0f) + r4);
                        org.telegram.ui.ActionBar.n6.t0.setColor(pa0Var.getThemedColor(org.telegram.ui.ActionBar.n6.zj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.t0);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 6:
                im0 im0Var = (im0) this.g3;
                Paint paint = im0Var.x;
                RectF rectF2 = im0Var.s;
                RectF rectF3 = im0Var.r;
                RectF rectF4 = im0Var.n;
                v4.c0 c0Var = im0Var.b;
                if (!im0Var.f.isEmpty()) {
                    float e10 = im0Var.e.e(false, im0Var.d);
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
                        paint.setColor(im0Var.y);
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
                if (motionEvent.getActionMasked() != 0 || motionEvent.getY() >= ((pa0) this.g3).b0) {
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
                if (getAdapter() != ((b00) this.g3).V || T(view).f != 1) {
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
                tl0 tl0Var = ((im0) this.g3).G;
                if (tl0Var != null) {
                    tl0Var.run();
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
                    org.telegram.messenger.g0.h3(new kz(this, 2), 250L);
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
                return !(view instanceof e00) || ((e00) view).getDraggingProgress() <= 0.0f;
            default:
                return super.u1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt(Object obj, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.f3 = i7;
        this.g3 = obj;
    }
}
