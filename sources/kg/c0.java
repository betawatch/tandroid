package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import cg.t1;
import java.util.HashMap;
import lh.x2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.a51;
import org.telegram.ui.b61;
import org.telegram.ui.m51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout {
    public final Drawable a;
    public final Rect b;
    public final Paint c;
    public final int[] d;
    public final HashMap e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public final Path v;
    public final /* synthetic */ d0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, Context context) {
        super(context);
        this.w = d0Var;
        Rect rect = new Rect();
        this.b = rect;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f = 0.0f;
        this.h = 0.0f;
        this.n = 1.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = g6.Td;
        c6 c6Var = d0Var.s;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        if (d0Var.y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(g6.v0(g6.G8, c6Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x046c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        HashMap hashMap;
        int i10;
        float f10;
        RectF rectF;
        float f11;
        RectF rectF2;
        int i11;
        fk0 fk0Var;
        fk0 fk0Var2;
        int i12;
        float f12;
        x2 x2Var;
        int i13;
        RectF rectF3;
        fk0 fk0Var3;
        int i14;
        int i15;
        HashMap hashMap2;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        fk0 fk0Var4;
        RectF rectF7;
        x2 x2Var2;
        int[] iArr;
        x2 x2Var3;
        float f18;
        int i16;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        q0 q0Var;
        float f28;
        Canvas canvas2 = canvas;
        d0 d0Var = this.w;
        RectF rectF8 = d0Var.f;
        int i17 = d0Var.y;
        RectF rectF9 = d0Var.i;
        z zVar = d0Var.m;
        fk0 fk0Var5 = d0Var.n;
        if (d0Var.l) {
            float clamp = Utilities.clamp(d0Var.j, 1.0f, 0.0f);
            RectF rectF10 = AndroidUtilities.rectTmp;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i17 == 4) {
                rectF8.set(fk0Var5.w);
                rectF8.offset(d0Var.g, d0Var.h);
            }
            AndroidUtilities.lerp(rectF8, rectF10, d0Var.j, rectF9);
            float lerp = AndroidUtilities.lerp(d0Var.e, AndroidUtilities.dp(i17 == 5 ? 20.0f : 8.0f), d0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i17 == 1 || (fk0Var5.getDelegate() != null && fk0Var5.getDelegate().O())) {
                f9 = 1.0f;
                ek0 delegate = fk0Var5.getDelegate();
                float x4 = getX();
                c0 c0Var = d0Var.a;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
                delegate.G(canvas, rectF9, lerp, x4, i17 == 1 ? c0Var.getY() - AndroidUtilities.statusBarHeight : c0Var.getY() + d0Var.c.getY(), 255, true);
                canvas2 = canvas;
                rectF = rectF9;
            } else {
                int clamp2 = (int) (Utilities.clamp(clamp / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(clamp2);
                int i18 = (int) rectF9.left;
                Rect rect = this.b;
                f9 = 1.0f;
                drawable.setBounds(i18 - rect.left, ((int) rectF9.top) - rect.top, ((int) rectF9.right) + rect.right, ((int) rectF9.bottom) + rect.bottom);
                ng.d dVar = d0Var.z;
                Paint paint = this.c;
                if (dVar != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF10.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    d0Var.z.setBounds(rect2);
                    d0Var.z.setAlpha(paint.getAlpha());
                    d0Var.z.p(lerp);
                    d0Var.z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF9, lerp, lerp, paint);
                }
                rectF = rectF9;
                hashMap = hashMap3;
                i10 = 4;
                f10 = 255.0f;
            }
            if (fk0Var5.N0 != null) {
                canvas2.save();
                float f29 = rectF.left;
                float y8 = fk0Var5.N0.getY() + rectF.top;
                if (i17 != 3 && i17 != i10) {
                    if (i17 != 5) {
                        f28 = 0.0f;
                        canvas2.translate(f29, y8 - f28);
                        rectF2 = rectF8;
                        f11 = lerp;
                        i11 = 5;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, fk0Var5.N0.getMeasuredWidth(), fk0Var5.N0.getMeasuredHeight(), (int) ((f9 - d0Var.j) * fk0Var5.N0.getAlpha() * f10), 31);
                        fk0Var5.N0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f28 = fk0Var5.w.top;
                canvas2.translate(f29, y8 - f28);
                rectF2 = rectF8;
                f11 = lerp;
                i11 = 5;
                canvas2.saveLayerAlpha(0.0f, 0.0f, fk0Var5.N0.getMeasuredWidth(), fk0Var5.N0.getMeasuredHeight(), (int) ((f9 - d0Var.j) * fk0Var5.N0.getAlpha() * f10), 31);
                fk0Var5.N0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f11 = lerp;
                rectF2 = rectF8;
                i11 = 5;
            }
            float width = (rectF.width() - fk0Var5.w.width()) + (rectF.left - fk0Var5.w.left);
            if (d0Var.j > 0.05f || i17 == i11) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - fk0Var5.w.height()) + (rectF.top - fk0Var5.w.top));
                float max = (Math.max(0.25f, Math.min(fk0Var5.v, 1.0f)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                fk0Var5.f(fk0Var5.A * max, max, fk0Var5.B * max, fk0Var5.I0 == i11 ? 255 : (int) x3.y(1.0f, fk0Var5.s0, Utilities.clamp(fk0Var5.s0 / 0.2f, 1.0f, 0.0f), 255.0f), canvas3);
                fk0Var = fk0Var5;
                canvas2 = canvas3;
                canvas2.restore();
            } else {
                fk0Var = fk0Var5;
            }
            if (i17 == 5) {
                Path path = this.v;
                path.rewind();
                path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path);
            }
            this.f = 0.0f;
            this.h = 0.0f;
            this.n = 1.0f;
            this.r = 0.0f;
            this.s = 0.0f;
            if (fk0Var != null) {
                for (int childCount = zVar.d0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (zVar.d0.getChildAt(childCount) instanceof m51) {
                        m51 m51Var = (m51) zVar.d0.getChildAt(childCount);
                        if (m51Var.y && (q0Var = m51Var.x) != null) {
                            hashMap.put(q0Var, m51Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, com.google.android.recaptcha.internal.a.z(1.0f, d0Var.j, fk0Var.g() + fk0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (zVar.e0.getVisibility() == 0 ? zVar.e0.getAlpha() : 0.0f), 1.0f - d0Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x10 = (int) (zVar.d0.getX() + zVar.getX());
                int y10 = (int) (zVar.d0.getY() + zVar.getY());
                boolean z10 = zVar.W.getParent() != null;
                if (i17 != 5) {
                    float f30 = y10;
                    if (z10) {
                        f12 = 2.0f;
                        f27 = x10 + (AndroidUtilities.dp(36.0f) * d0Var.j);
                    } else {
                        f12 = 2.0f;
                        f27 = 0.0f;
                    }
                    canvas2.clipRect(f30, f27, zVar.d0.getMeasuredWidth() + y10, zVar.d0.getMeasuredHeight() + x10);
                } else {
                    f12 = 2.0f;
                }
                int i19 = -1;
                int i20 = -1;
                while (i20 < fk0Var.b.getChildCount()) {
                    View childAt = i20 == i19 ? fk0Var.v0 : fk0Var.b.getChildAt(i20);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i13 = i20;
                        rectF3 = rectF;
                        fk0Var3 = fk0Var;
                        i14 = i17;
                        i15 = save;
                        hashMap2 = hashMap;
                        rectF4 = rectF2;
                    } else {
                        canvas2.save();
                        if (childAt instanceof dk0) {
                            dk0 dk0Var = (dk0) childAt;
                            ck0 ck0Var = dk0Var.a;
                            ck0 ck0Var2 = dk0Var.b;
                            t1 t1Var = dk0Var.f;
                            if (t1Var != null) {
                                t1Var.setAlpha(1.0f - d0Var.j);
                            }
                            m51 m51Var2 = (m51) hashMap.get(dk0Var.e);
                            if (m51Var2 != null) {
                                float x11 = childAt.getX();
                                float y11 = childAt.getY();
                                if (i20 == -1) {
                                    x11 -= fk0Var.b.getX();
                                    f18 = y11 - fk0Var.b.getY();
                                } else {
                                    f18 = y11;
                                }
                                i13 = i20;
                                float x12 = ((zVar.d0.getX() + (zVar.getX() + m51Var2.getX())) - ck0Var2.getX()) - AndroidUtilities.dp(1.0f);
                                float y12 = (zVar.d0.getY() + (zVar.c0.getY() + (zVar.getY() + m51Var2.getY()))) - ck0Var2.getY();
                                float measuredWidth = m51Var2.getMeasuredWidth();
                                if (m51Var2.H) {
                                    i16 = 4;
                                } else {
                                    i16 = 4;
                                    if (i17 != 4) {
                                        f21 = x12;
                                        hashMap2 = hashMap;
                                        float f31 = y12;
                                        i14 = i17;
                                        float lerp2 = AndroidUtilities.lerp(x11, f21, d0Var.j);
                                        float f32 = x11;
                                        float lerp3 = AndroidUtilities.lerp(f18, f31, d0Var.j);
                                        float f33 = f18;
                                        float measuredWidth2 = measuredWidth / ck0Var2.getMeasuredWidth();
                                        i15 = save;
                                        rectF5 = rectF;
                                        f17 = AndroidUtilities.lerp(1.0f, measuredWidth2, d0Var.j);
                                        if (dk0Var.y != 0) {
                                            f22 = AndroidUtilities.dp(6.0f);
                                            f24 = f22;
                                            f23 = 0.0f;
                                        } else if (dk0Var.w) {
                                            f22 = AndroidUtilities.dp(6.0f);
                                            f23 = f22;
                                            f24 = f23;
                                            f25 = f24;
                                            canvas2.translate(lerp2, lerp3);
                                            canvas2.scale(f17, f17);
                                            if (this.f == 0.0f || this.h != 0.0f) {
                                                f26 = f22;
                                                rectF6 = rectF2;
                                            } else {
                                                rectF6 = rectF2;
                                                f26 = f22;
                                                this.f = AndroidUtilities.lerp((rectF6.left + f32) - f21, 0.0f, d0Var.j);
                                                this.h = AndroidUtilities.lerp((rectF6.top + f33) - f31, 0.0f, d0Var.j);
                                                this.n = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, d0Var.j);
                                                this.r = f21;
                                                this.s = f31;
                                            }
                                            f14 = f26;
                                            f15 = f23;
                                            f13 = f24;
                                            f16 = f25;
                                        } else {
                                            f22 = 0.0f;
                                            f23 = 0.0f;
                                            f24 = 0.0f;
                                        }
                                        f25 = 0.0f;
                                        canvas2.translate(lerp2, lerp3);
                                        canvas2.scale(f17, f17);
                                        if (this.f == 0.0f) {
                                        }
                                        f26 = f22;
                                        rectF6 = rectF2;
                                        f14 = f26;
                                        f15 = f23;
                                        f13 = f24;
                                        f16 = f25;
                                    }
                                }
                                if (i17 == i16) {
                                    f19 = x12 - AndroidUtilities.dp(0.33f);
                                    y12 -= AndroidUtilities.dp(1.33f);
                                    f20 = 0.87f * measuredWidth;
                                } else {
                                    f19 = x12;
                                    f20 = measuredWidth;
                                }
                                float f34 = m51Var2.H ? 0.95f * f20 : f20;
                                float f35 = (measuredWidth - f34) / f12;
                                measuredWidth = f34;
                                f21 = f19 + f35;
                                y12 += f35;
                                hashMap2 = hashMap;
                                float f312 = y12;
                                i14 = i17;
                                float lerp22 = AndroidUtilities.lerp(x11, f21, d0Var.j);
                                float f322 = x11;
                                float lerp32 = AndroidUtilities.lerp(f18, f312, d0Var.j);
                                float f332 = f18;
                                float measuredWidth22 = measuredWidth / ck0Var2.getMeasuredWidth();
                                i15 = save;
                                rectF5 = rectF;
                                f17 = AndroidUtilities.lerp(1.0f, measuredWidth22, d0Var.j);
                                if (dk0Var.y != 0) {
                                }
                                f25 = 0.0f;
                                canvas2.translate(lerp22, lerp32);
                                canvas2.scale(f17, f17);
                                if (this.f == 0.0f) {
                                }
                                f26 = f22;
                                rectF6 = rectF2;
                                f14 = f26;
                                f15 = f23;
                                f13 = f24;
                                f16 = f25;
                            } else {
                                i13 = i20;
                                rectF5 = rectF;
                                i14 = i17;
                                i15 = save;
                                hashMap2 = hashMap;
                                rectF6 = rectF2;
                                canvas2.translate(ck0Var2.getX() + childAt.getX(), ck0Var2.getY() + childAt.getY());
                                f13 = 0.0f;
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 1.0f;
                            }
                            if (m51Var2 != null) {
                                if (m51Var2.H) {
                                    float measuredWidth3 = dk0Var.getMeasuredWidth() / f12;
                                    float measuredHeight = dk0Var.getMeasuredHeight() / f12;
                                    float measuredWidth4 = dk0Var.getMeasuredWidth() - AndroidUtilities.dp(f12);
                                    float lerp4 = AndroidUtilities.lerp(measuredWidth4, (m51Var2.getMeasuredWidth() - AndroidUtilities.dp(f12)) / f17, d0Var.j);
                                    RectF rectF11 = AndroidUtilities.rectTmp;
                                    float f36 = lerp4 / f12;
                                    rectF7 = rectF6;
                                    fk0Var4 = fk0Var;
                                    rectF11.set(measuredWidth3 - f36, measuredHeight - f36, measuredWidth3 + f36, measuredHeight + f36);
                                    float lerp5 = AndroidUtilities.lerp(measuredWidth4 / f12, AndroidUtilities.dp(4.0f), d0Var.j);
                                    canvas2.drawRoundRect(rectF11, lerp5, lerp5, zVar.H);
                                } else {
                                    fk0Var4 = fk0Var;
                                    rectF7 = rectF6;
                                }
                                dk0Var.x = false;
                                if (f13 == 0.0f) {
                                    dk0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = ck0Var2.getImageReceiver();
                                    dk0Var.b();
                                    p5 p5Var = ck0Var2.e;
                                    if (p5Var != null && (x2Var3 = p5Var.k) != null) {
                                        imageReceiver = x2Var3;
                                    }
                                    int[] roundRadius = imageReceiver.getRoundRadius();
                                    int i21 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i21 >= 4) {
                                            break;
                                        }
                                        iArr[i21] = roundRadius[i21];
                                        i21++;
                                    }
                                    imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(f14, 0.0f, d0Var.j), (int) AndroidUtilities.lerp(f15, 0.0f, d0Var.j), (int) AndroidUtilities.lerp(f16, 0.0f, d0Var.j), (int) AndroidUtilities.lerp(f13, 0.0f, d0Var.j));
                                    dk0Var.draw(canvas2);
                                    imageReceiver.setRoundRadius(iArr);
                                }
                                dk0Var.x = true;
                                if (!m51Var2.b) {
                                    m51Var2.b = true;
                                    m51Var2.invalidate();
                                }
                            } else {
                                fk0Var4 = fk0Var;
                                rectF7 = rectF6;
                                if (dk0Var.r && ck0Var2.getImageReceiver().getLottieAnimation() == null) {
                                    float alpha = ck0Var.getImageReceiver().getAlpha();
                                    ck0Var.getImageReceiver().setAlpha((1.0f - clamp) * alpha);
                                    ck0Var.draw(canvas2);
                                    ck0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    dk0Var.b();
                                    ImageReceiver imageReceiver2 = ck0Var2.getImageReceiver();
                                    p5 p5Var2 = ck0Var2.e;
                                    if (p5Var2 != null && (x2Var2 = p5Var2.k) != null) {
                                        imageReceiver2 = x2Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - clamp) * alpha2);
                                    ck0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (ck0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            fk0Var3 = fk0Var4;
                            rectF3 = rectF5;
                            rectF4 = rectF7;
                        } else {
                            i13 = i20;
                            RectF rectF12 = rectF;
                            i14 = i17;
                            i15 = save;
                            hashMap2 = hashMap;
                            fk0Var3 = fk0Var;
                            rectF4 = rectF2;
                            rectF3 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - fk0Var3.w.width(), (childAt.getY() + rectF4.top) - rectF3.top);
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - clamp) * 255.0f), 31);
                            float f37 = 1.0f - d0Var.j;
                            canvas2.scale(f37, f37, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i20 = i13 + 1;
                    fk0Var = fk0Var3;
                    rectF2 = rectF4;
                    rectF = rectF3;
                    hashMap = hashMap2;
                    i17 = i14;
                    save = i15;
                    i19 = -1;
                }
                fk0Var2 = fk0Var;
                i12 = i17;
                canvas2.restoreToCount(save);
            } else {
                fk0Var2 = fk0Var;
                i12 = i17;
                f12 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i22 = d0Var.F;
            if (i22 < 5) {
                if (i22 == 3) {
                    fk0Var2.setSkipDraw(true);
                }
                d0Var.F++;
            }
            Paint paint2 = zVar.T1;
            a51 a51Var = zVar.d0;
            ImageReceiver imageReceiver3 = zVar.R0;
            if (zVar.O0 != null) {
                imageReceiver3.setParentView(this);
                m51 m51Var3 = zVar.O0;
                if (m51Var3 != null) {
                    float f38 = zVar.Q0;
                    if (f38 != 1.0f && !zVar.P0 && zVar.d1) {
                        float f39 = f38 + 0.010666667f;
                        zVar.Q0 = f39;
                        if (f39 >= 1.0f) {
                            zVar.Q0 = 1.0f;
                            b61 b61Var = zVar.D;
                            if (b61Var != null) {
                                fk0 fk0Var6 = (fk0) ((m5.i) b61Var).b;
                                if (m51Var3.s) {
                                    fk0Var6.l(m51Var3, m51Var3.x, true);
                                } else {
                                    long j10 = m51Var3.e.documentId;
                                    q0 q0Var2 = new q0();
                                    q0Var2.g = j10;
                                    q0Var2.h = j10;
                                    fk0Var6.l(m51Var3, q0Var2, true);
                                }
                            }
                        }
                        zVar.O0.C = zVar.Q0;
                    }
                    float f40 = (zVar.Q0 * f12) + 1.0f;
                    canvas2.save();
                    canvas2.translate(zVar.O0.getX() + a51Var.getX(), zVar.O0.getY() + a51Var.getY() + zVar.c0.getY());
                    paint2.setColor(g6.v0(g6.G8, zVar.V0));
                    canvas2.drawRect(0.0f, 0.0f, zVar.O0.getMeasuredWidth(), zVar.O0.getMeasuredHeight(), paint2);
                    canvas2.scale(f40, f40, zVar.O0.getMeasuredWidth() / f12, zVar.O0.getMeasuredHeight());
                    m51 m51Var4 = zVar.O0;
                    if (!m51Var4.s) {
                        imageReceiver3 = m51Var4.r;
                    }
                    p5 p5Var3 = zVar.S0;
                    if (p5Var3 != null && (x2Var = p5Var3.k) != null && x2Var.hasBitmapImage()) {
                        imageReceiver3 = zVar.S0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.setImageCoords(0.0f, 0.0f, zVar.O0.getMeasuredWidth(), zVar.O0.getMeasuredHeight());
                        imageReceiver3.draw(canvas2);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (i12 == 5) {
                canvas2.restore();
            }
            if (d0Var.x != null) {
                invalidate();
            }
            Runnable runnable = g0.c;
            if (runnable != null) {
                runnable.run();
                g0.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        d0 d0Var = this.w;
        fk0 fk0Var = d0Var.n;
        if (d0Var.y == 1 || !(fk0Var == null || fk0Var.getDelegate() == null || !fk0Var.getDelegate().O())) {
            d0Var.m.b0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int measuredWidth;
        int i12;
        int dp;
        int dp2;
        d0 d0Var = this.w;
        int i13 = d0Var.y;
        if (i13 == 1 || i13 == 2 || i13 == 4) {
            measuredWidth = d0Var.n.getMeasuredWidth();
        } else if (i13 == 5) {
            measuredWidth = AndroidUtilities.dp(12.0f) + (AndroidUtilities.dp(36.0f) * 8);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            int dp3 = (AndroidUtilities.dp(36.0f) * 8) + AndroidUtilities.dp(12.0f);
            if (dp3 < measuredWidth) {
                measuredWidth = dp3;
            }
        }
        if (d0Var.y != 4) {
            if (d0Var.n.B0) {
                int ceil = (int) Math.ceil(d0Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i12 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * ceil);
                } else {
                    dp = AndroidUtilities.dp(36.0f) * 8;
                    dp2 = AndroidUtilities.dp(8.0f);
                }
            } else {
                i12 = measuredWidth;
            }
            if (d0Var.y == 5) {
                i12 = Math.min(AndroidUtilities.dp(254.0f), i12);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
        }
        dp = AndroidUtilities.dp(36.0f) * 8;
        dp2 = AndroidUtilities.dp(8.0f);
        i12 = dp - dp2;
        if (d0Var.y == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }
}
