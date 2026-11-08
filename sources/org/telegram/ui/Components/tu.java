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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class tu extends LinearLayout {
    public final a0.h a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ bv r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(bv bvVar, Context context, boolean z9, boolean z10) {
        super(context);
        this.r = bvVar;
        this.h = z9;
        this.n = z10;
        this.a = new a0.h();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i7) {
        View childAt = getChildAt(c8.j9.b(i7, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        bv bvVar = this.r;
        boolean z9 = bvVar.n;
        zu zuVar = bvVar.G;
        for (Map.Entry entry : bvVar.H.entrySet()) {
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
        if (bvVar.s == null) {
            bvVar.s = new w5(this, 350L, xq.h);
        }
        float e10 = bvVar.s.e(false, bvVar.r ? 1.0f : 0.0f);
        int floor = (int) Math.floor(bvVar.K);
        int ceil = (int) Math.ceil(bvVar.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f10 = bvVar.K - floor;
        RectF rectF3 = this.e;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f10, rectF3);
        float l10 = zuVar != null ? 1.0f - Utilities.l(Math.abs(bvVar.K - ((bvVar.E != null ? 1 : 0) + 1))) : 0.0f;
        float f11 = bvVar.L;
        float f12 = (1.0f - f11) * 4.0f * f11;
        float B = com.google.android.recaptcha.internal.a.B(f12, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float C = com.google.android.recaptcha.internal.a.C(f12, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - C, rectF3.centerX() + B, rectF3.centerY() + C);
        float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(8.0f, 16.0f, l10));
        int k10 = bvVar.k();
        Paint paint = this.b;
        paint.setColor(k10);
        if (z9) {
            paint.setAlpha((int) com.google.android.recaptcha.internal.a.C(l10, 0.5f, 1.0f, paint.getAlpha() * e10));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e10));
        }
        Path path = this.f;
        path.rewind();
        boolean z10 = this.n;
        float height = z10 ? rectF3.height() / 2.0f : L;
        if (z10) {
            L = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, height, L, direction);
        canvas.drawPath(path, paint);
        if (z9) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, org.telegram.messenger.g0.N(16.0f), org.telegram.messenger.g0.N(16.0f), direction);
            paint.setColor(bvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (zuVar != null) {
            path.addCircle(org.telegram.messenger.g0.L(15.0f) + zuVar.getLeft(), (zuVar.getBottom() + zuVar.getTop()) / 2.0f, org.telegram.messenger.g0.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.r.G) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipPath(this.f);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        a0.h hVar;
        TLRPC.StickerSet stickerSet;
        bv bvVar = this.r;
        xu xuVar = bvVar.F;
        int i13 = (i12 - i10) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!bvVar.W ? 1 : 0)) - (!bvVar.b0 ? 1 : 0);
            int A = (int) (org.telegram.messenger.camera.q.A(30.0f, childCount, ((i11 - i7) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt((!bvVar.W ? 1 : 0) + (!bvVar.b0 ? 1 : 0) + i14);
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
            if (childAt2 != xuVar && !bvVar.H.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i13 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i13);
                boolean z10 = childAt2 instanceof xu;
                Long l10 = null;
                if (z10) {
                    xu xuVar2 = (xu) childAt2;
                    Long l11 = xuVar2.a;
                    if (l11 == null) {
                        uw uwVar = xuVar2.w;
                        if (uwVar == null || (stickerSet = uwVar.b) == null) {
                            l11 = xuVar2.r;
                            if (l11 == null) {
                                TLRPC.Document document = xuVar2.s;
                                if (document != null) {
                                    l10 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l10 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l10 = l11;
                } else if (childAt2 instanceof zu) {
                    l10 = Long.valueOf(((zu) childAt2).h);
                }
                if (bvVar.O && z10) {
                    xu xuVar3 = (xu) childAt2;
                    if (xuVar3.b) {
                        xuVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(ch.e0.d() ? 0L : 200L).setInterpolator(xq.h).start();
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
                if ((childAt2 != bvVar.D || bvVar.W) && (childAt2 != bvVar.E || bvVar.b0)) {
                    paddingLeft2 = org.telegram.messenger.k5.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i15++;
        }
        if (xuVar != null) {
            Long l12 = xuVar.a;
            if (getPaddingRight() + xuVar.getMeasuredWidth() + paddingLeft2 <= bvVar.getMeasuredWidth()) {
                int i16 = i11 - i7;
                paddingLeft2 = (i16 - getPaddingRight()) - xuVar.getMeasuredWidth();
                xuVar.layout(paddingLeft2, i13 - (xuVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (xuVar.getMeasuredHeight() / 2) + i13);
            } else {
                xuVar.layout(paddingLeft2, i13 - (xuVar.getMeasuredHeight() / 2), xuVar.getMeasuredWidth() + paddingLeft2, (xuVar.getMeasuredHeight() / 2) + i13);
            }
            if (l12 != null) {
                if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft2) {
                    xuVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft2);
                    xuVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                hVar.k(Integer.valueOf(paddingLeft2), l12.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        xu xuVar;
        xu xuVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        bv bvVar = this.r;
        float f10 = 0.0f;
        int alpha = paddingRight - ((int) ((bvVar.W || (xuVar2 = bvVar.D) == null) ? 0.0f : xuVar2.getAlpha() * org.telegram.messenger.g0.L(33.0f)));
        if (!bvVar.b0 && (xuVar = bvVar.E) != null) {
            f10 = xuVar.getAlpha() * org.telegram.messenger.g0.L(33.0f);
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
            setMeasuredDimension(Math.max(i11, View.MeasureSpec.getSize(i7)), View.MeasureSpec.getSize(i10));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        }
    }
}
