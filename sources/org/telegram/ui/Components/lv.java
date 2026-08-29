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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lv extends LinearLayout {
    public final a0.h a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ tv r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(tv tvVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.r = tvVar;
        this.h = z10;
        this.n = z11;
        this.a = new a0.h();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(i7.w.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tv tvVar = this.r;
        boolean z10 = tvVar.n;
        rv rvVar = tvVar.C;
        for (Map.Entry entry : tvVar.D.entrySet()) {
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
        if (tvVar.s == null) {
            tvVar.s = new d6(this, 350L, jr.h);
        }
        float d = tvVar.s.d(tvVar.r ? 1.0f : 0.0f, false);
        int floor = (int) Math.floor(tvVar.G);
        int ceil = (int) Math.ceil(tvVar.G);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f9 = tvVar.G - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f9, rectF3);
        float clamp01 = rvVar != null ? 1.0f - Utilities.clamp01(Math.abs(tvVar.G - ((tvVar.A != null ? 1 : 0) + 1))) : 0.0f;
        float f10 = tvVar.H;
        float f11 = (1.0f - f10) * 4.0f * f10;
        float B = com.google.android.recaptcha.internal.a.B(f11, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f11 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - height, rectF3.centerX() + B, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, clamp01));
        int k9 = tvVar.k();
        Paint paint = this.b;
        paint.setColor(k9);
        if (z10) {
            paint.setAlpha((int) ((1.0f - (clamp01 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f;
        path.rewind();
        boolean z11 = this.n;
        float height2 = z11 ? rectF3.height() / 2.0f : dp;
        if (z11) {
            dp = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, height2, dp, direction);
        canvas.drawPath(path, paint);
        if (z10) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
            paint.setColor(tvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (rvVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + rvVar.getLeft(), (rvVar.getBottom() + rvVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.r.C) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipPath(this.f);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a0.h hVar;
        TLRPC.StickerSet stickerSet;
        tv tvVar = this.r;
        pv pvVar = tvVar.B;
        int i14 = (i13 - i11) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!tvVar.S ? 1 : 0)) - (!tvVar.U ? 1 : 0);
            int z11 = (int) (org.telegram.ui.b.z(30.0f, childCount, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt((!tvVar.S ? 1 : 0) + (!tvVar.U ? 1 : 0) + i15);
                if (childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    paddingLeft = childAt.getMeasuredWidth() + z11 + paddingLeft;
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        int i16 = 0;
        while (true) {
            int childCount2 = getChildCount();
            hVar = this.a;
            if (i16 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i16);
            if (childAt2 != pvVar && !tvVar.D.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                boolean z12 = childAt2 instanceof pv;
                Long l10 = null;
                if (z12) {
                    pv pvVar2 = (pv) childAt2;
                    Long l11 = pvVar2.a;
                    if (l11 == null) {
                        rx rxVar = pvVar2.v;
                        if (rxVar == null || (stickerSet = rxVar.b) == null) {
                            l11 = pvVar2.r;
                            if (l11 == null) {
                                TLRPC.Document document = pvVar2.s;
                                if (document != null) {
                                    l10 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l10 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l10 = l11;
                } else if (childAt2 instanceof rv) {
                    l10 = Long.valueOf(((rv) childAt2).h);
                }
                if (tvVar.K && z12) {
                    pv pvVar3 = (pv) childAt2;
                    if (pvVar3.b) {
                        pvVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(kg.g0.d() ? 0L : 200L).setInterpolator(jr.h).start();
                    }
                }
                if (l10 != null) {
                    Integer num = (Integer) hVar.f(l10.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(jr.h).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft2), l10.longValue());
                }
                if ((childAt2 != tvVar.y || tvVar.S) && (childAt2 != tvVar.A || tvVar.U)) {
                    paddingLeft2 = org.telegram.messenger.x3.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i16++;
        }
        if (pvVar != null) {
            Long l12 = pvVar.a;
            if (getPaddingRight() + pvVar.getMeasuredWidth() + paddingLeft2 <= tvVar.getMeasuredWidth()) {
                int i17 = i12 - i10;
                paddingLeft2 = (i17 - getPaddingRight()) - pvVar.getMeasuredWidth();
                pvVar.layout(paddingLeft2, i14 - (pvVar.getMeasuredHeight() / 2), i17 - getPaddingRight(), (pvVar.getMeasuredHeight() / 2) + i14);
            } else {
                pvVar.layout(paddingLeft2, i14 - (pvVar.getMeasuredHeight() / 2), pvVar.getMeasuredWidth() + paddingLeft2, (pvVar.getMeasuredHeight() / 2) + i14);
            }
            if (l12 != null) {
                if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft2) {
                    pvVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft2);
                    pvVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                hVar.k(Integer.valueOf(paddingLeft2), l12.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        pv pvVar;
        pv pvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        tv tvVar = this.r;
        float f9 = 0.0f;
        int alpha = paddingRight - ((int) ((tvVar.S || (pvVar2 = tvVar.y) == null) ? 0.0f : pvVar2.getAlpha() * AndroidUtilities.dp(33.0f)));
        if (!tvVar.U && (pvVar = tvVar.A) != null) {
            f9 = pvVar.getAlpha() * AndroidUtilities.dp(33.0f);
        }
        int i12 = alpha - ((int) f9);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, i11);
                i12 = childAt.getMeasuredWidth() + (i13 + 1 < getChildCount() ? AndroidUtilities.dp(3.0f) : 0) + i12;
            }
        }
        if (this.h) {
            setMeasuredDimension(Math.max(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getSize(i11));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        }
    }
}
