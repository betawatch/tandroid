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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fv extends LinearLayout {
    public final a0.h a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ nv r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(nv nvVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.r = nvVar;
        this.h = z10;
        this.n = z11;
        this.a = new a0.h();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i9) {
        View childAt = getChildAt(g7.n.b(i9, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        nv nvVar = this.r;
        boolean z10 = nvVar.n;
        lv lvVar = nvVar.C;
        for (Map.Entry entry : nvVar.D.entrySet()) {
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
        if (nvVar.s == null) {
            nvVar.s = new y5(this, 350L, gr.h);
        }
        float d = nvVar.s.d(nvVar.r ? 1.0f : 0.0f, false);
        int floor = (int) Math.floor(nvVar.G);
        int ceil = (int) Math.ceil(nvVar.G);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f10 = nvVar.G - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        float clamp01 = lvVar != null ? 1.0f - Utilities.clamp01(Math.abs(nvVar.G - ((nvVar.A != null ? 1 : 0) + 1))) : 0.0f;
        float f11 = nvVar.H;
        float f12 = (1.0f - f11) * 4.0f * f11;
        float B = e2.c.B(f12, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f12 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - height, rectF3.centerX() + B, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, clamp01));
        int k10 = nvVar.k();
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
            paint.setColor(nvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (lvVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + lvVar.getLeft(), (lvVar.getBottom() + lvVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        a0.h hVar;
        TLRPC.StickerSet stickerSet;
        nv nvVar = this.r;
        jv jvVar = nvVar.B;
        int i13 = (i12 - i10) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!nvVar.S ? 1 : 0)) - (!nvVar.U ? 1 : 0);
            int A = (int) (org.telegram.messenger.ll.A(30.0f, childCount, ((i11 - i9) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt((!nvVar.S ? 1 : 0) + (!nvVar.U ? 1 : 0) + i14);
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
            if (childAt2 != jvVar && !nvVar.D.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i13 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i13);
                boolean z11 = childAt2 instanceof jv;
                Long l10 = null;
                if (z11) {
                    jv jvVar2 = (jv) childAt2;
                    Long l11 = jvVar2.a;
                    if (l11 == null) {
                        jx jxVar = jvVar2.v;
                        if (jxVar == null || (stickerSet = jxVar.b) == null) {
                            l11 = jvVar2.r;
                            if (l11 == null) {
                                TLRPC.Document document = jvVar2.s;
                                if (document != null) {
                                    l10 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l10 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l10 = l11;
                } else if (childAt2 instanceof lv) {
                    l10 = Long.valueOf(((lv) childAt2).h);
                }
                if (nvVar.K && z11) {
                    jv jvVar3 = (jv) childAt2;
                    if (jvVar3.b) {
                        jvVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(hg.h0.d() ? 0L : 200L).setInterpolator(gr.h).start();
                    }
                }
                if (l10 != null) {
                    Integer num = (Integer) hVar.f(l10.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(gr.h).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft2), l10.longValue());
                }
                if ((childAt2 != nvVar.y || nvVar.S) && (childAt2 != nvVar.A || nvVar.U)) {
                    paddingLeft2 = org.telegram.messenger.l0.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i15++;
        }
        if (jvVar != null) {
            Long l12 = jvVar.a;
            if (getPaddingRight() + jvVar.getMeasuredWidth() + paddingLeft2 <= nvVar.getMeasuredWidth()) {
                int i16 = i11 - i9;
                paddingLeft2 = (i16 - getPaddingRight()) - jvVar.getMeasuredWidth();
                jvVar.layout(paddingLeft2, i13 - (jvVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (jvVar.getMeasuredHeight() / 2) + i13);
            } else {
                jvVar.layout(paddingLeft2, i13 - (jvVar.getMeasuredHeight() / 2), jvVar.getMeasuredWidth() + paddingLeft2, (jvVar.getMeasuredHeight() / 2) + i13);
            }
            if (l12 != null) {
                if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft2) {
                    jvVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft2);
                    jvVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                hVar.k(Integer.valueOf(paddingLeft2), l12.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        jv jvVar;
        jv jvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        nv nvVar = this.r;
        float f10 = 0.0f;
        int alpha = paddingRight - ((int) ((nvVar.S || (jvVar2 = nvVar.y) == null) ? 0.0f : jvVar2.getAlpha() * AndroidUtilities.dp(33.0f)));
        if (!nvVar.U && (jvVar = nvVar.A) != null) {
            f10 = jvVar.getAlpha() * AndroidUtilities.dp(33.0f);
        }
        int i11 = alpha - ((int) f10);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, i10);
                i11 = childAt.getMeasuredWidth() + (i12 + 1 < getChildCount() ? AndroidUtilities.dp(3.0f) : 0) + i11;
            }
        }
        if (this.h) {
            setMeasuredDimension(Math.max(i11, View.MeasureSpec.getSize(i9)), View.MeasureSpec.getSize(i10));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        }
    }
}
