package ih;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.c9;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.s61;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g extends m6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, int i10) {
        super(str, 0);
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                j jVar = (j) obj;
                jVar.D = f10;
                RectF rectF = jVar.v;
                RectF rectF2 = jVar.s;
                float interpolation = 1.0f - h.p.getInterpolation(f10);
                float interpolation2 = (h.h.getInterpolation(jVar.D) - h.i.getInterpolation(jVar.D)) * AndroidUtilities.dp(13.0f);
                RectF rectF3 = jVar.n;
                RectF rectF4 = jVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g10 = j.g(rectF3.height(), (AndroidUtilities.dp(2.0f) * interpolation) + AndroidUtilities.dp(i.b), h.l.getInterpolation(jVar.D)) / 2.0f;
                e eVar = h.m;
                float g11 = j.g(rectF3.width(), (AndroidUtilities.dp(10.0f) * interpolation) + jVar.h(), eVar.getInterpolation(jVar.D));
                float f11 = g10 * 2.0f;
                float max = Math.max(g11, f11);
                float interpolation3 = (eVar.getInterpolation(jVar.D) * Math.min(AndroidUtilities.dp(-12.0f) + jVar.C, (max - Math.max(rectF3.width(), f11)) / 2.0f)) + rectF4.centerX() + g10;
                float interpolation4 = ((rectF4.bottom - g10) - 1.0f) - (h.n.getInterpolation(jVar.D) * ((AndroidUtilities.dp(6.0f) * interpolation) + AndroidUtilities.dp(38.0f)));
                RectF rectF5 = jVar.r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g10;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g10;
                if (jVar.N && !jVar.J) {
                    float g12 = j.g(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), h.o.getInterpolation(jVar.D));
                    float f12 = rectF5.bottom + g12;
                    double width = (rectF3.width() / 2.0f) + g12;
                    double abs = Math.abs(f12 - rectF3.centerY());
                    float sqrt = (float) (width <= abs ? 0.0d : Math.sqrt((width * width) - (abs * abs)));
                    float centerX = rectF3.centerX() - sqrt;
                    boolean z4 = centerX < (rectF5.height() / 2.0f) + rectF5.left;
                    if (z4) {
                        PointF f13 = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g12, true);
                        if (f13 != null) {
                            centerX = f13.x;
                            f12 = f13.y;
                        } else {
                            jVar.N = false;
                        }
                    }
                    rectF2.set(centerX - g12, f12 - g12, centerX + g12, f12 + g12);
                    float f14 = rectF5.bottom + g12;
                    float centerX2 = rectF3.centerX() + sqrt;
                    boolean z10 = centerX2 > rectF5.right - (rectF5.height() / 2.0f);
                    if (z10) {
                        PointF f15 = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g12, false);
                        if (f15 != null) {
                            centerX2 = f15.x;
                            f14 = f15.y;
                        } else {
                            jVar.N = false;
                        }
                    }
                    rectF.set(centerX2 - g12, f14 - g12, centerX2 + g12, f14 + g12);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && jVar.N) {
                        jVar.N = false;
                    }
                    if (jVar.N) {
                        Path path = jVar.e;
                        path.reset();
                        float b10 = j.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = j.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        jVar.a(path, rectF3, b10, b11, false, false);
                        float b12 = z4 ? j.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY()) : -90.0f;
                        float j10 = j.j(b11);
                        float f16 = b12;
                        jVar.a(path, rectF2, j10, f16, true, true);
                        if (!z4) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = j.Y;
                        float f17 = rectF5.left;
                        rectF6.set(f17, rectF5.top, rectF5.height() + f17, rectF5.bottom);
                        jVar.a(path, rectF6, j.j(f16), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        float b13 = z10 ? j.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY()) : -90.0f;
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        jVar.a(path, rectF6, -90.0f, j.j(b13), false, false);
                        if (!z10) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        jVar.a(path, rectF, b13, j.j(b10), true, true);
                        path.close();
                    }
                }
                jVar.invalidateSelf();
                break;
            case 1:
                j jVar2 = (j) obj;
                jVar2.E = f10;
                jVar2.invalidateSelf();
                break;
            case 2:
                s8 s8Var = (s8) obj;
                s8Var.setAnimationProgress(f10);
                s8Var.invalidate();
                break;
            case 3:
                t8 t8Var = (t8) obj;
                t8Var.setAnimationProgress(f10);
                t8Var.invalidate();
                break;
            case 4:
                c9 c9Var = (c9) obj;
                c9Var.setAnimationProgress(f10);
                c9Var.invalidate();
                break;
            case 5:
                c6 c6Var = (c6) obj;
                if (c6Var.e != f10) {
                    c6Var.e = f10;
                    c6Var.g.invalidate();
                    break;
                }
                break;
            case 6:
                ((ImageReceiver) obj).setCurrentAlpha(f10);
                break;
            case 7:
                ((ClippingImageView) obj).setAnimationProgress(f10);
                break;
            case 8:
                ((PhotoViewer) obj).setAnimationValue(f10);
                break;
            case 9:
                ((r2) obj).setClipProgress(f10);
                break;
            case 10:
                ((nb) obj).setInOutOffset(f10);
                break;
            case 11:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f10);
                break;
            default:
                ((s61) obj).G(f10);
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((j) obj).D);
            case 1:
                return Float.valueOf(((j) obj).E);
            case 2:
                return Float.valueOf(((s8) obj).s);
            case 3:
                return Float.valueOf(((t8) obj).h);
            case 4:
                return Float.valueOf(((c9) obj).f);
            case 5:
                return Float.valueOf(((c6) obj).e);
            case 6:
                return Float.valueOf(((ImageReceiver) obj).getCurrentAlpha());
            case 7:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 8:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 9:
                return Float.valueOf(((r2) obj).getClipProgress());
            case 10:
                return Float.valueOf(((nb) obj).inOutOffset);
            case 11:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            default:
                return Float.valueOf(((s61) obj).B);
        }
    }
}
