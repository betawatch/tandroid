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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ov extends LinearLayout {
    public final a0.h a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ wv r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(wv wvVar, Context context, boolean z4, boolean z10) {
        super(context);
        this.r = wvVar;
        this.h = z4;
        this.n = z10;
        this.a = new a0.h();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(k7.n.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wv wvVar = this.r;
        boolean z4 = wvVar.n;
        uv uvVar = wvVar.D;
        for (Map.Entry entry : wvVar.E.entrySet()) {
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
        if (wvVar.s == null) {
            wvVar.s = new z5(this, 350L, mr.h);
        }
        float d = wvVar.s.d(wvVar.r ? 1.0f : 0.0f, false);
        int floor = (int) Math.floor(wvVar.H);
        int ceil = (int) Math.ceil(wvVar.H);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f10 = wvVar.H - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        float clamp01 = uvVar != null ? 1.0f - Utilities.clamp01(Math.abs(wvVar.H - ((wvVar.B != null ? 1 : 0) + 1))) : 0.0f;
        float f11 = wvVar.I;
        float f12 = (1.0f - f11) * 4.0f * f11;
        float y10 = e2.c.y(f12, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f12 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - y10, rectF3.centerY() - height, rectF3.centerX() + y10, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, clamp01));
        int k10 = wvVar.k();
        Paint paint = this.b;
        paint.setColor(k10);
        if (z4) {
            paint.setAlpha((int) ((1.0f - (clamp01 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f;
        path.rewind();
        boolean z10 = this.n;
        float height2 = z10 ? rectF3.height() / 2.0f : dp;
        if (z10) {
            dp = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, height2, dp, direction);
        canvas.drawPath(path, paint);
        if (z4) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
            paint.setColor(wvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (uvVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + uvVar.getLeft(), (uvVar.getBottom() + uvVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.r.D) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipPath(this.f);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        a0.h hVar;
        TLRPC.StickerSet stickerSet;
        wv wvVar = this.r;
        sv svVar = wvVar.C;
        int i14 = (i13 - i11) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!wvVar.T ? 1 : 0)) - (!wvVar.V ? 1 : 0);
            int z10 = (int) (org.telegram.ui.b.z(30.0f, childCount, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt((!wvVar.T ? 1 : 0) + (!wvVar.V ? 1 : 0) + i15);
                if (childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    paddingLeft = childAt.getMeasuredWidth() + z10 + paddingLeft;
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
            if (childAt2 != svVar && !wvVar.E.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                boolean z11 = childAt2 instanceof sv;
                Long l10 = null;
                if (z11) {
                    sv svVar2 = (sv) childAt2;
                    Long l11 = svVar2.a;
                    if (l11 == null) {
                        vx vxVar = svVar2.v;
                        if (vxVar == null || (stickerSet = vxVar.b) == null) {
                            l11 = svVar2.r;
                            if (l11 == null) {
                                TLRPC.Document document = svVar2.s;
                                if (document != null) {
                                    l10 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l10 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l10 = l11;
                } else if (childAt2 instanceof uv) {
                    l10 = Long.valueOf(((uv) childAt2).h);
                }
                if (wvVar.L && z11) {
                    sv svVar3 = (sv) childAt2;
                    if (svVar3.b) {
                        svVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(mg.g0.d() ? 0L : 200L).setInterpolator(mr.h).start();
                    }
                }
                if (l10 != null) {
                    Integer num = (Integer) hVar.f(l10.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(mr.h).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft2), l10.longValue());
                }
                if ((childAt2 != wvVar.y || wvVar.T) && (childAt2 != wvVar.B || wvVar.V)) {
                    paddingLeft2 = org.telegram.messenger.y3.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i16++;
        }
        if (svVar != null) {
            Long l12 = svVar.a;
            if (getPaddingRight() + svVar.getMeasuredWidth() + paddingLeft2 <= wvVar.getMeasuredWidth()) {
                int i17 = i12 - i10;
                paddingLeft2 = (i17 - getPaddingRight()) - svVar.getMeasuredWidth();
                svVar.layout(paddingLeft2, i14 - (svVar.getMeasuredHeight() / 2), i17 - getPaddingRight(), (svVar.getMeasuredHeight() / 2) + i14);
            } else {
                svVar.layout(paddingLeft2, i14 - (svVar.getMeasuredHeight() / 2), svVar.getMeasuredWidth() + paddingLeft2, (svVar.getMeasuredHeight() / 2) + i14);
            }
            if (l12 != null) {
                if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft2) {
                    svVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft2);
                    svVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                hVar.k(Integer.valueOf(paddingLeft2), l12.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        sv svVar;
        sv svVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        wv wvVar = this.r;
        float f10 = 0.0f;
        int alpha = paddingRight - ((int) ((wvVar.T || (svVar2 = wvVar.y) == null) ? 0.0f : svVar2.getAlpha() * AndroidUtilities.dp(33.0f)));
        if (!wvVar.V && (svVar = wvVar.B) != null) {
            f10 = svVar.getAlpha() * AndroidUtilities.dp(33.0f);
        }
        int i12 = alpha - ((int) f10);
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
