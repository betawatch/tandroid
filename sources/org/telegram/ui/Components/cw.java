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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class cw extends LinearLayout {
    public final a0.h a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ kw r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(kw kwVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.r = kwVar;
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
        View childAt = getChildAt(w7.r.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kw kwVar = this.r;
        boolean z10 = kwVar.n;
        iw iwVar = kwVar.G;
        for (Map.Entry entry : kwVar.H.entrySet()) {
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
        if (kwVar.s == null) {
            kwVar.s = new f6(this, 350L, bs.h);
        }
        float d = kwVar.s.d(kwVar.r ? 1.0f : 0.0f, false);
        int floor = (int) Math.floor(kwVar.K);
        int ceil = (int) Math.ceil(kwVar.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f7 = kwVar.K - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f7, rectF3);
        float clamp01 = iwVar != null ? 1.0f - Utilities.clamp01(Math.abs(kwVar.K - ((kwVar.E != null ? 1 : 0) + 1))) : 0.0f;
        float f10 = kwVar.L;
        float f11 = (1.0f - f10) * 4.0f * f10;
        float A = com.google.android.gms.internal.cast.a6.A(f11, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = com.google.android.gms.internal.cast.a6.B(f11, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - A, rectF3.centerY() - B, rectF3.centerX() + A, rectF3.centerY() + B);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, clamp01));
        int k10 = kwVar.k();
        Paint paint = this.b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) com.google.android.gms.internal.cast.a6.B(clamp01, 0.5f, 1.0f, paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f;
        path.rewind();
        boolean z11 = this.n;
        float height = z11 ? rectF3.height() / 2.0f : dp;
        if (z11) {
            dp = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, height, dp, direction);
        canvas.drawPath(path, paint);
        if (z10) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
            paint.setColor(kwVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (iwVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + iwVar.getLeft(), (iwVar.getBottom() + iwVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.r.G) {
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
        kw kwVar = this.r;
        gw gwVar = kwVar.F;
        int i14 = (i13 - i11) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!kwVar.W ? 1 : 0)) - (!kwVar.b0 ? 1 : 0);
            int C = (int) (org.telegram.messenger.wh.C(30.0f, childCount, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt((!kwVar.W ? 1 : 0) + (!kwVar.b0 ? 1 : 0) + i15);
                if (childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    paddingLeft = childAt.getMeasuredWidth() + C + paddingLeft;
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
            if (childAt2 != gwVar && !kwVar.H.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                boolean z11 = childAt2 instanceof gw;
                Long l4 = null;
                if (z11) {
                    gw gwVar2 = (gw) childAt2;
                    Long l10 = gwVar2.a;
                    if (l10 == null) {
                        fy fyVar = gwVar2.v;
                        if (fyVar == null || (stickerSet = fyVar.b) == null) {
                            l10 = gwVar2.r;
                            if (l10 == null) {
                                TLRPC.Document document = gwVar2.s;
                                if (document != null) {
                                    l4 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l4 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l4 = l10;
                } else if (childAt2 instanceof iw) {
                    l4 = Long.valueOf(((iw) childAt2).h);
                }
                if (kwVar.O && z11) {
                    gw gwVar3 = (gw) childAt2;
                    if (gwVar3.b) {
                        gwVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(ah.x0.d() ? 0L : 200L).setInterpolator(bs.h).start();
                    }
                }
                if (l4 != null) {
                    Integer num = (Integer) hVar.f(l4.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(bs.h).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft2), l4.longValue());
                }
                if ((childAt2 != kwVar.y || kwVar.W) && (childAt2 != kwVar.E || kwVar.b0)) {
                    paddingLeft2 = org.telegram.messenger.q.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i16++;
        }
        if (gwVar != null) {
            Long l11 = gwVar.a;
            if (getPaddingRight() + gwVar.getMeasuredWidth() + paddingLeft2 <= kwVar.getMeasuredWidth()) {
                int i17 = i12 - i10;
                paddingLeft2 = (i17 - getPaddingRight()) - gwVar.getMeasuredWidth();
                gwVar.layout(paddingLeft2, i14 - (gwVar.getMeasuredHeight() / 2), i17 - getPaddingRight(), (gwVar.getMeasuredHeight() / 2) + i14);
            } else {
                gwVar.layout(paddingLeft2, i14 - (gwVar.getMeasuredHeight() / 2), gwVar.getMeasuredWidth() + paddingLeft2, (gwVar.getMeasuredHeight() / 2) + i14);
            }
            if (l11 != null) {
                if (hVar.f(l11.longValue()) != null && ((Integer) hVar.f(l11.longValue())).intValue() != paddingLeft2) {
                    gwVar.setTranslationX(((Integer) hVar.f(l11.longValue())).intValue() - paddingLeft2);
                    gwVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                hVar.k(Integer.valueOf(paddingLeft2), l11.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        gw gwVar;
        gw gwVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        kw kwVar = this.r;
        float f7 = 0.0f;
        int alpha = paddingRight - ((int) ((kwVar.W || (gwVar2 = kwVar.y) == null) ? 0.0f : gwVar2.getAlpha() * AndroidUtilities.dp(33.0f)));
        if (!kwVar.b0 && (gwVar = kwVar.E) != null) {
            f7 = gwVar.getAlpha() * AndroidUtilities.dp(33.0f);
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
