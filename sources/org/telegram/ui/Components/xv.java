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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class xv extends LinearLayout {
    public final a0.i a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ fw r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(fw fwVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.r = fwVar;
        this.h = z10;
        this.n = z11;
        this.a = new a0.i();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(w7.q.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fw fwVar = this.r;
        boolean z10 = fwVar.n;
        dw dwVar = fwVar.G;
        for (Map.Entry entry : fwVar.H.entrySet()) {
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
        if (fwVar.s == null) {
            fwVar.s = new e6(this, 350L, sr.h);
        }
        float d = fwVar.s.d(fwVar.r ? 1.0f : 0.0f, false);
        int floor = (int) Math.floor(fwVar.K);
        int ceil = (int) Math.ceil(fwVar.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f7 = fwVar.K - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f7, rectF3);
        float clamp01 = dwVar != null ? 1.0f - Utilities.clamp01(Math.abs(fwVar.K - ((fwVar.E != null ? 1 : 0) + 1))) : 0.0f;
        float f10 = fwVar.L;
        float f11 = (1.0f - f10) * 4.0f * f10;
        float B = com.google.android.gms.internal.vision.e2.B(f11, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f11 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - height, rectF3.centerX() + B, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, clamp01));
        int k10 = fwVar.k();
        Paint paint = this.b;
        paint.setColor(k10);
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
            paint.setColor(fwVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (dwVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + dwVar.getLeft(), (dwVar.getBottom() + dwVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a0.i iVar;
        TLRPC.StickerSet stickerSet;
        fw fwVar = this.r;
        bw bwVar = fwVar.F;
        int i14 = (i13 - i11) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!fwVar.W ? 1 : 0)) - (!fwVar.b0 ? 1 : 0);
            int B = (int) (org.telegram.messenger.ok.B(30.0f, childCount, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt((!fwVar.W ? 1 : 0) + (!fwVar.b0 ? 1 : 0) + i15);
                if (childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    paddingLeft = childAt.getMeasuredWidth() + B + paddingLeft;
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        int i16 = 0;
        while (true) {
            int childCount2 = getChildCount();
            iVar = this.a;
            if (i16 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i16);
            if (childAt2 != bwVar && !fwVar.H.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                boolean z11 = childAt2 instanceof bw;
                Long l4 = null;
                if (z11) {
                    bw bwVar2 = (bw) childAt2;
                    Long l10 = bwVar2.a;
                    if (l10 == null) {
                        zx zxVar = bwVar2.v;
                        if (zxVar == null || (stickerSet = zxVar.b) == null) {
                            l10 = bwVar2.r;
                            if (l10 == null) {
                                TLRPC.Document document = bwVar2.s;
                                if (document != null) {
                                    l4 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l4 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l4 = l10;
                } else if (childAt2 instanceof dw) {
                    l4 = Long.valueOf(((dw) childAt2).h);
                }
                if (fwVar.O && z11) {
                    bw bwVar3 = (bw) childAt2;
                    if (bwVar3.b) {
                        bwVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(zg.e0.d() ? 0L : 200L).setInterpolator(sr.h).start();
                    }
                }
                if (l4 != null) {
                    Integer num = (Integer) iVar.f(l4.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(sr.h).start();
                    }
                    iVar.k(Integer.valueOf(paddingLeft2), l4.longValue());
                }
                if ((childAt2 != fwVar.y || fwVar.W) && (childAt2 != fwVar.E || fwVar.b0)) {
                    paddingLeft2 = org.telegram.messenger.f0.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i16++;
        }
        if (bwVar != null) {
            Long l11 = bwVar.a;
            if (getPaddingRight() + bwVar.getMeasuredWidth() + paddingLeft2 <= fwVar.getMeasuredWidth()) {
                int i17 = i12 - i10;
                paddingLeft2 = (i17 - getPaddingRight()) - bwVar.getMeasuredWidth();
                bwVar.layout(paddingLeft2, i14 - (bwVar.getMeasuredHeight() / 2), i17 - getPaddingRight(), (bwVar.getMeasuredHeight() / 2) + i14);
            } else {
                bwVar.layout(paddingLeft2, i14 - (bwVar.getMeasuredHeight() / 2), bwVar.getMeasuredWidth() + paddingLeft2, (bwVar.getMeasuredHeight() / 2) + i14);
            }
            if (l11 != null) {
                if (iVar.f(l11.longValue()) != null && ((Integer) iVar.f(l11.longValue())).intValue() != paddingLeft2) {
                    bwVar.setTranslationX(((Integer) iVar.f(l11.longValue())).intValue() - paddingLeft2);
                    bwVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                iVar.k(Integer.valueOf(paddingLeft2), l11.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        bw bwVar;
        bw bwVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        fw fwVar = this.r;
        float f7 = 0.0f;
        int alpha = paddingRight - ((int) ((fwVar.W || (bwVar2 = fwVar.y) == null) ? 0.0f : bwVar2.getAlpha() * AndroidUtilities.dp(33.0f)));
        if (!fwVar.b0 && (bwVar = fwVar.E) != null) {
            f7 = bwVar.getAlpha() * AndroidUtilities.dp(33.0f);
        }
        int i12 = alpha - ((int) f7);
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
