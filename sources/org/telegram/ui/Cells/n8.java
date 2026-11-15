package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.e51;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n8 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8(String str, int i7) {
        super(str, 0);
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                q8 q8Var = (q8) obj;
                q8Var.setAnimationProgress(f10);
                q8Var.invalidate();
                break;
            case 1:
                r8 r8Var = (r8) obj;
                r8Var.setAnimationProgress(f10);
                r8Var.invalidate();
                break;
            case 2:
                a9 a9Var = (a9) obj;
                a9Var.setAnimationProgress(f10);
                a9Var.invalidate();
                break;
            case 3:
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj;
                if (y5Var.e != f10) {
                    y5Var.e = f10;
                    y5Var.g.invalidate();
                    break;
                }
                break;
            case 4:
                ((ImageReceiver) obj).i1 = f10;
                break;
            case 5:
                ((ClippingImageView) obj).setAnimationProgress(f10);
                break;
            case 6:
                ((PhotoViewer) obj).setAnimationValue(f10);
                break;
            case 7:
                ((t2) obj).setClipProgress(f10);
                break;
            case 8:
                ((cb) obj).setInOutOffset(f10);
                break;
            case 9:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f10);
                break;
            case 10:
                ((e51) obj).M0(f10);
                break;
            case 11:
                wh.h hVar = (wh.h) obj;
                hVar.H = f10;
                RectF rectF = hVar.w;
                RectF rectF2 = hVar.s;
                float interpolation = 1.0f - wh.f.p.getInterpolation(f10);
                float interpolation2 = (wh.f.h.getInterpolation(hVar.H) - wh.f.i.getInterpolation(hVar.H)) * org.telegram.messenger.g0.L(13.0f);
                RectF rectF3 = hVar.n;
                RectF rectF4 = hVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g10 = wh.h.g(rectF3.height(), (org.telegram.messenger.g0.L(2.0f) * interpolation) + org.telegram.messenger.g0.L(wh.g.b), wh.f.l.getInterpolation(hVar.H)) / 2.0f;
                wh.e eVar = wh.f.m;
                float g11 = wh.h.g(rectF3.width(), (org.telegram.messenger.g0.L(10.0f) * interpolation) + hVar.h(), eVar.getInterpolation(hVar.H));
                float f11 = g10 * 2.0f;
                float max = Math.max(g11, f11);
                float interpolation3 = (eVar.getInterpolation(hVar.H) * Math.min(org.telegram.messenger.g0.L(-12.0f) + hVar.G, (max - Math.max(rectF3.width(), f11)) / 2.0f)) + rectF4.centerX() + g10;
                float interpolation4 = ((rectF4.bottom - g10) - 1.0f) - (wh.f.n.getInterpolation(hVar.H) * ((org.telegram.messenger.g0.L(6.0f) * interpolation) + org.telegram.messenger.g0.L(38.0f)));
                RectF rectF5 = hVar.r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g10;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g10;
                if (hVar.R && !hVar.N) {
                    float g12 = wh.h.g(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(3.0f), wh.f.o.getInterpolation(hVar.H));
                    float f12 = rectF5.bottom + g12;
                    double width = (rectF3.width() / 2.0f) + g12;
                    double abs = Math.abs(f12 - rectF3.centerY());
                    float sqrt = (float) (width <= abs ? 0.0d : Math.sqrt((width * width) - (abs * abs)));
                    float centerX = rectF3.centerX() - sqrt;
                    boolean z10 = centerX < (rectF5.height() / 2.0f) + rectF5.left;
                    if (z10) {
                        PointF f13 = wh.h.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g12, true);
                        if (f13 != null) {
                            centerX = f13.x;
                            f12 = f13.y;
                        } else {
                            hVar.R = false;
                        }
                    }
                    rectF2.set(centerX - g12, f12 - g12, centerX + g12, f12 + g12);
                    float f14 = rectF5.bottom + g12;
                    float centerX2 = rectF3.centerX() + sqrt;
                    boolean z11 = centerX2 > rectF5.right - (rectF5.height() / 2.0f);
                    if (z11) {
                        PointF f15 = wh.h.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g12, false);
                        if (f15 != null) {
                            centerX2 = f15.x;
                            f14 = f15.y;
                        } else {
                            hVar.R = false;
                        }
                    }
                    rectF.set(centerX2 - g12, f14 - g12, centerX2 + g12, f14 + g12);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && hVar.R) {
                        hVar.R = false;
                    }
                    if (hVar.R) {
                        Path path = hVar.e;
                        path.reset();
                        float b10 = wh.h.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = wh.h.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        hVar.a(path, rectF3, b10, b11, false, false);
                        float b12 = z10 ? wh.h.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY()) : -90.0f;
                        float j3 = wh.h.j(b11);
                        float f16 = b12;
                        hVar.a(path, rectF2, j3, f16, true, true);
                        if (!z10) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = wh.h.c0;
                        float f17 = rectF5.left;
                        rectF6.set(f17, rectF5.top, rectF5.height() + f17, rectF5.bottom);
                        hVar.a(path, rectF6, wh.h.j(f16), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        float b13 = z11 ? wh.h.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY()) : -90.0f;
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        hVar.a(path, rectF6, -90.0f, wh.h.j(b13), false, false);
                        if (!z11) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        hVar.a(path, rectF, b13, wh.h.j(b10), true, true);
                        path.close();
                    }
                }
                hVar.invalidateSelf();
                break;
            default:
                wh.h hVar2 = (wh.h) obj;
                hVar2.I = f10;
                hVar2.invalidateSelf();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((q8) obj).s);
            case 1:
                return Float.valueOf(((r8) obj).h);
            case 2:
                return Float.valueOf(((a9) obj).f);
            case 3:
                return Float.valueOf(((org.telegram.ui.Components.y5) obj).e);
            case 4:
                return Float.valueOf(((ImageReceiver) obj).i1);
            case 5:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 6:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 7:
                return Float.valueOf(((t2) obj).getClipProgress());
            case 8:
                return Float.valueOf(((cb) obj).inOutOffset);
            case 9:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            case 10:
                return Float.valueOf(((e51) obj).z1);
            case 11:
                return Float.valueOf(((wh.h) obj).H);
            default:
                return Float.valueOf(((wh.h) obj).I);
        }
    }
}
