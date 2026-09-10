package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.tb;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u8 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(String str, int i10) {
        super(str, 0);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                x8 x8Var = (x8) obj;
                x8Var.setAnimationProgress(f7);
                x8Var.invalidate();
                break;
            case 1:
                y8 y8Var = (y8) obj;
                y8Var.setAnimationProgress(f7);
                y8Var.invalidate();
                break;
            case 2:
                h9 h9Var = (h9) obj;
                h9Var.setAnimationProgress(f7);
                h9Var.invalidate();
                break;
            case 3:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) obj;
                if (g6Var.e != f7) {
                    g6Var.e = f7;
                    g6Var.g.invalidate();
                    break;
                }
                break;
            case 4:
                ((ImageReceiver) obj).setCurrentAlpha(f7);
                break;
            case 5:
                ((ClippingImageView) obj).setAnimationProgress(f7);
                break;
            case 6:
                ((PhotoViewer) obj).setAnimationValue(f7);
                break;
            case 7:
                ((r2) obj).setClipProgress(f7);
                break;
            case 8:
                ((tb) obj).setInOutOffset(f7);
                break;
            case 9:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f7);
                break;
            case 10:
                ((b71) obj).H(f7);
                break;
            case 11:
                th.i iVar = (th.i) obj;
                iVar.G = f7;
                RectF rectF = iVar.v;
                RectF rectF2 = iVar.s;
                float interpolation = 1.0f - th.g.p.getInterpolation(f7);
                float interpolation2 = (th.g.h.getInterpolation(iVar.G) - th.g.i.getInterpolation(iVar.G)) * AndroidUtilities.dp(13.0f);
                RectF rectF3 = iVar.n;
                RectF rectF4 = iVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g10 = th.i.g(rectF3.height(), (AndroidUtilities.dp(2.0f) * interpolation) + AndroidUtilities.dp(th.h.b), th.g.l.getInterpolation(iVar.G)) / 2.0f;
                th.f fVar = th.g.m;
                float g11 = th.i.g(rectF3.width(), (AndroidUtilities.dp(10.0f) * interpolation) + iVar.h(), fVar.getInterpolation(iVar.G));
                float f10 = g10 * 2.0f;
                float max = Math.max(g11, f10);
                float interpolation3 = (fVar.getInterpolation(iVar.G) * Math.min(AndroidUtilities.dp(-12.0f) + iVar.F, (max - Math.max(rectF3.width(), f10)) / 2.0f)) + rectF4.centerX() + g10;
                float interpolation4 = ((rectF4.bottom - g10) - 1.0f) - (th.g.n.getInterpolation(iVar.G) * ((AndroidUtilities.dp(6.0f) * interpolation) + AndroidUtilities.dp(38.0f)));
                RectF rectF5 = iVar.r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g10;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g10;
                if (iVar.Q && !iVar.M) {
                    float g12 = th.i.g(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), th.g.o.getInterpolation(iVar.G));
                    float f11 = rectF5.bottom + g12;
                    double width = (rectF3.width() / 2.0f) + g12;
                    double abs = Math.abs(f11 - rectF3.centerY());
                    float sqrt = (float) (width <= abs ? 0.0d : Math.sqrt((width * width) - (abs * abs)));
                    float centerX = rectF3.centerX() - sqrt;
                    boolean z10 = centerX < (rectF5.height() / 2.0f) + rectF5.left;
                    if (z10) {
                        PointF f12 = th.i.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g12, true);
                        if (f12 != null) {
                            centerX = f12.x;
                            f11 = f12.y;
                        } else {
                            iVar.Q = false;
                        }
                    }
                    rectF2.set(centerX - g12, f11 - g12, centerX + g12, f11 + g12);
                    float f13 = rectF5.bottom + g12;
                    float centerX2 = rectF3.centerX() + sqrt;
                    boolean z11 = centerX2 > rectF5.right - (rectF5.height() / 2.0f);
                    if (z11) {
                        PointF f14 = th.i.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g12, false);
                        if (f14 != null) {
                            centerX2 = f14.x;
                            f13 = f14.y;
                        } else {
                            iVar.Q = false;
                        }
                    }
                    rectF.set(centerX2 - g12, f13 - g12, centerX2 + g12, f13 + g12);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && iVar.Q) {
                        iVar.Q = false;
                    }
                    if (iVar.Q) {
                        Path path = iVar.e;
                        path.reset();
                        float b10 = th.i.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = th.i.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        iVar.a(path, rectF3, b10, b11, false, false);
                        float b12 = z10 ? th.i.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY()) : -90.0f;
                        float j3 = th.i.j(b11);
                        float f15 = b12;
                        iVar.a(path, rectF2, j3, f15, true, true);
                        if (!z10) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = th.i.b0;
                        float f16 = rectF5.left;
                        rectF6.set(f16, rectF5.top, rectF5.height() + f16, rectF5.bottom);
                        iVar.a(path, rectF6, th.i.j(f15), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        float b13 = z11 ? th.i.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY()) : -90.0f;
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        iVar.a(path, rectF6, -90.0f, th.i.j(b13), false, false);
                        if (!z11) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        iVar.a(path, rectF, b13, th.i.j(b10), true, true);
                        path.close();
                    }
                }
                iVar.invalidateSelf();
                break;
            default:
                th.i iVar2 = (th.i) obj;
                iVar2.H = f7;
                iVar2.invalidateSelf();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((x8) obj).s);
            case 1:
                return Float.valueOf(((y8) obj).h);
            case 2:
                return Float.valueOf(((h9) obj).f);
            case 3:
                return Float.valueOf(((org.telegram.ui.Components.g6) obj).e);
            case 4:
                return Float.valueOf(((ImageReceiver) obj).getCurrentAlpha());
            case 5:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 6:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 7:
                return Float.valueOf(((r2) obj).getClipProgress());
            case 8:
                return Float.valueOf(((tb) obj).inOutOffset);
            case 9:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            case 10:
                return Float.valueOf(((b71) obj).E);
            case 11:
                return Float.valueOf(((th.i) obj).G);
            default:
                return Float.valueOf(((th.i) obj).H);
        }
    }
}
