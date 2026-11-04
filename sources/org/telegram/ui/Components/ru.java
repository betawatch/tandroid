package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ru extends LinearLayout {
    public final a0.h a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ zu r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(zu zuVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.r = zuVar;
        this.h = z10;
        this.n = z11;
        this.a = new a0.h();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i3) {
        View childAt = getChildAt(b8.be.b(i3, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        zu zuVar = this.r;
        boolean z10 = zuVar.n;
        xu xuVar = zuVar.H;
        for (Map.Entry entry : zuVar.I.entrySet()) {
            View view = (View) entry.getKey();
            if (view != null) {
                Rect rect = (Rect) entry.getValue();
                canvas.save();
                canvas.translate(rect.left, rect.top);
                canvas.scale(view.getScaleX(), view.getScaleY(), rect.width() / 2.0f, rect.height() / 2.0f);
                view.draw(canvas);
                canvas.restore();
            }
        }
        if (zuVar.s == null) {
            zuVar.s = new u5(this, 350L, xq.h);
        }
        float e10 = zuVar.s.e(false, zuVar.r ? 1.0f : 0.0f);
        int floor = (int) Math.floor(zuVar.L);
        int ceil = (int) Math.ceil(zuVar.L);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f10 = zuVar.L - floor;
        RectF rectF3 = this.e;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f10, rectF3);
        float l10 = xuVar != null ? 1.0f - Utilities.l(Math.abs(zuVar.L - ((zuVar.F != null ? 1 : 0) + 1))) : 0.0f;
        float f11 = zuVar.M;
        float f12 = (1.0f - f11) * 4.0f * f11;
        float A = com.google.android.recaptcha.internal.a.A(f12, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = com.google.android.recaptcha.internal.a.B(f12, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - A, rectF3.centerY() - B, rectF3.centerX() + A, rectF3.centerY() + B);
        float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(8.0f, 16.0f, l10));
        int k10 = zuVar.k();
        Paint paint = this.b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) com.google.android.recaptcha.internal.a.B(l10, 0.5f, 1.0f, paint.getAlpha() * e10));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e10));
        }
        Path path = this.f;
        path.rewind();
        boolean z11 = this.n;
        float height = z11 ? rectF3.height() / 2.0f : L;
        if (z11) {
            L = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, height, L, direction);
        canvas.drawPath(path, paint);
        if (z10) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, org.telegram.messenger.g0.N(16.0f), org.telegram.messenger.g0.N(16.0f), direction);
            paint.setColor(zuVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (xuVar != null) {
            path.addCircle(org.telegram.messenger.g0.L(15.0f) + xuVar.getLeft(), (xuVar.getBottom() + xuVar.getTop()) / 2.0f, org.telegram.messenger.g0.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.r.H) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipPath(this.f);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        a0.h hVar;
        TLRPC.StickerSet stickerSet;
        zu zuVar = this.r;
        vu vuVar = zuVar.G;
        int i13 = (i12 - i10) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!zuVar.a0 ? 1 : 0)) - (!zuVar.c0 ? 1 : 0);
            int A = (int) (org.telegram.messenger.camera.q.A(30.0f, childCount, ((i11 - i3) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt((!zuVar.a0 ? 1 : 0) + (!zuVar.c0 ? 1 : 0) + i14);
                if (childAt != null) {
                    childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                    paddingLeft = childAt.getMeasuredWidth() + A + paddingLeft;
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        int i15 = 0;
        while (true) {
            int childCount2 = getChildCount();
            hVar = this.a;
            if (i15 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i15);
            if (childAt2 != vuVar && !zuVar.I.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i13 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i13);
                boolean z11 = childAt2 instanceof vu;
                Long l10 = null;
                if (z11) {
                    vu vuVar2 = (vu) childAt2;
                    Long l11 = vuVar2.a;
                    if (l11 == null) {
                        sw swVar = vuVar2.w;
                        if (swVar == null || (stickerSet = swVar.b) == null) {
                            l11 = vuVar2.r;
                            if (l11 == null) {
                                TLRPC.Document document = vuVar2.s;
                                if (document != null) {
                                    l10 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l10 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l10 = l11;
                } else if (childAt2 instanceof xu) {
                    l10 = Long.valueOf(((xu) childAt2).h);
                }
                if (zuVar.P && z11) {
                    vu vuVar3 = (vu) childAt2;
                    if (vuVar3.b) {
                        vuVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(dh.d0.d() ? 0L : 200L).setInterpolator(xq.h).start();
                    }
                }
                if (l10 != null) {
                    Integer num = (Integer) hVar.f(l10.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < org.telegram.messenger.g0.L(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(xq.h).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft2), l10.longValue());
                }
                if ((childAt2 != zuVar.E || zuVar.a0) && (childAt2 != zuVar.F || zuVar.c0)) {
                    paddingLeft2 = org.telegram.messenger.k5.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i15++;
        }
        if (vuVar != null) {
            Long l12 = vuVar.a;
            if (getPaddingRight() + vuVar.getMeasuredWidth() + paddingLeft2 <= zuVar.getMeasuredWidth()) {
                int i16 = i11 - i3;
                paddingLeft2 = (i16 - getPaddingRight()) - vuVar.getMeasuredWidth();
                vuVar.layout(paddingLeft2, i13 - (vuVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (vuVar.getMeasuredHeight() / 2) + i13);
            } else {
                vuVar.layout(paddingLeft2, i13 - (vuVar.getMeasuredHeight() / 2), vuVar.getMeasuredWidth() + paddingLeft2, (vuVar.getMeasuredHeight() / 2) + i13);
            }
            if (l12 != null) {
                if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft2) {
                    vuVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft2);
                    vuVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                hVar.k(Integer.valueOf(paddingLeft2), l12.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        vu vuVar;
        vu vuVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        zu zuVar = this.r;
        float f10 = 0.0f;
        int alpha = paddingRight - ((int) ((zuVar.a0 || (vuVar2 = zuVar.E) == null) ? 0.0f : vuVar2.getAlpha() * org.telegram.messenger.g0.L(33.0f)));
        if (!zuVar.c0 && (vuVar = zuVar.F) != null) {
            f10 = vuVar.getAlpha() * org.telegram.messenger.g0.L(33.0f);
        }
        int i11 = alpha - ((int) f10);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, i10);
                i11 = childAt.getMeasuredWidth() + (i12 + 1 < getChildCount() ? org.telegram.messenger.g0.L(3.0f) : 0) + i11;
            }
        }
        if (this.h) {
            setMeasuredDimension(Math.max(i11, View.MeasureSpec.getSize(i3)), View.MeasureSpec.getSize(i10));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        }
    }
}
