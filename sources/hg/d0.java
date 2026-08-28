package hg;

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
import ih.z2;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.k51;
import org.telegram.ui.y41;
import org.telegram.ui.z51;
import zf.b1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d0 extends FrameLayout {
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
    public final /* synthetic */ e0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, Context context) {
        super(context);
        this.w = e0Var;
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
        int i9 = f6.Td;
        b6 b6Var = e0Var.s;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.v0(i9, b6Var), PorterDuff.Mode.MULTIPLY));
        if (e0Var.y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(f6.v0(f6.G8, b6Var));
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
        float f10;
        HashMap hashMap;
        int i9;
        float f11;
        RectF rectF;
        float f12;
        RectF rectF2;
        int i10;
        uj0 uj0Var;
        uj0 uj0Var2;
        int i11;
        float f13;
        z2 z2Var;
        int i12;
        RectF rectF3;
        uj0 uj0Var3;
        int i13;
        int i14;
        HashMap hashMap2;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        uj0 uj0Var4;
        RectF rectF7;
        z2 z2Var2;
        int[] iArr;
        z2 z2Var3;
        float f19;
        int i15;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        r0 r0Var;
        float f29;
        Canvas canvas2 = canvas;
        e0 e0Var = this.w;
        RectF rectF8 = e0Var.f;
        int i16 = e0Var.y;
        RectF rectF9 = e0Var.i;
        z zVar = e0Var.m;
        uj0 uj0Var5 = e0Var.n;
        if (e0Var.l) {
            float clamp = Utilities.clamp(e0Var.j, 1.0f, 0.0f);
            RectF rectF10 = AndroidUtilities.rectTmp;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i16 == 4) {
                rectF8.set(uj0Var5.w);
                rectF8.offset(e0Var.g, e0Var.h);
            }
            AndroidUtilities.lerp(rectF8, rectF10, e0Var.j, rectF9);
            float lerp = AndroidUtilities.lerp(e0Var.e, AndroidUtilities.dp(i16 == 5 ? 20.0f : 8.0f), e0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i16 == 1 || (uj0Var5.getDelegate() != null && uj0Var5.getDelegate().u())) {
                f10 = 1.0f;
                tj0 delegate = uj0Var5.getDelegate();
                float x10 = getX();
                d0 d0Var = e0Var.a;
                hashMap = hashMap3;
                i9 = 4;
                f11 = 255.0f;
                delegate.s(canvas, rectF9, lerp, x10, i16 == 1 ? d0Var.getY() - AndroidUtilities.statusBarHeight : d0Var.getY() + e0Var.c.getY(), 255, true);
                canvas2 = canvas;
                rectF = rectF9;
            } else {
                int clamp2 = (int) (Utilities.clamp(clamp / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(clamp2);
                int i17 = (int) rectF9.left;
                Rect rect = this.b;
                f10 = 1.0f;
                drawable.setBounds(i17 - rect.left, ((int) rectF9.top) - rect.top, ((int) rectF9.right) + rect.right, ((int) rectF9.bottom) + rect.bottom);
                kg.d dVar = e0Var.z;
                Paint paint = this.c;
                if (dVar != null) {
                    rectF10.set(rectF9);
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF10.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    e0Var.z.setBounds(rect2);
                    e0Var.z.setAlpha(paint.getAlpha());
                    e0Var.z.p(lerp);
                    e0Var.z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF9, lerp, lerp, paint);
                }
                rectF = rectF9;
                hashMap = hashMap3;
                i9 = 4;
                f11 = 255.0f;
            }
            if (uj0Var5.N0 != null) {
                canvas2.save();
                float f30 = rectF.left;
                float y10 = uj0Var5.N0.getY() + rectF.top;
                if (i16 != 3 && i16 != i9) {
                    if (i16 != 5) {
                        f29 = 0.0f;
                        canvas2.translate(f30, y10 - f29);
                        rectF2 = rectF8;
                        f12 = lerp;
                        i10 = 5;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, uj0Var5.N0.getMeasuredWidth(), uj0Var5.N0.getMeasuredHeight(), (int) ((f10 - e0Var.j) * uj0Var5.N0.getAlpha() * f11), 31);
                        uj0Var5.N0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f29 = uj0Var5.w.top;
                canvas2.translate(f30, y10 - f29);
                rectF2 = rectF8;
                f12 = lerp;
                i10 = 5;
                canvas2.saveLayerAlpha(0.0f, 0.0f, uj0Var5.N0.getMeasuredWidth(), uj0Var5.N0.getMeasuredHeight(), (int) ((f10 - e0Var.j) * uj0Var5.N0.getAlpha() * f11), 31);
                uj0Var5.N0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f12 = lerp;
                rectF2 = rectF8;
                i10 = 5;
            }
            float width = (rectF.width() - uj0Var5.w.width()) + (rectF.left - uj0Var5.w.left);
            if (e0Var.j > 0.05f || i16 == i10) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - uj0Var5.w.height()) + (rectF.top - uj0Var5.w.top));
                float max = (Math.max(0.25f, Math.min(uj0Var5.v, 1.0f)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                uj0Var5.f(uj0Var5.A * max, max, uj0Var5.B * max, uj0Var5.I0 == i10 ? 255 : (int) org.telegram.messenger.l0.y(1.0f, uj0Var5.s0, Utilities.clamp(uj0Var5.s0 / 0.2f, 1.0f, 0.0f), 255.0f), canvas3);
                uj0Var = uj0Var5;
                canvas2 = canvas3;
                canvas2.restore();
            } else {
                uj0Var = uj0Var5;
            }
            if (i16 == 5) {
                Path path = this.v;
                path.rewind();
                path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path);
            }
            this.f = 0.0f;
            this.h = 0.0f;
            this.n = 1.0f;
            this.r = 0.0f;
            this.s = 0.0f;
            if (uj0Var != null) {
                for (int childCount = zVar.d0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (zVar.d0.getChildAt(childCount) instanceof k51) {
                        k51 k51Var = (k51) zVar.d0.getChildAt(childCount);
                        if (k51Var.y && (r0Var = k51Var.x) != null) {
                            hashMap.put(r0Var, k51Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, e2.c.z(1.0f, e0Var.j, uj0Var.g() + uj0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (zVar.e0.getVisibility() == 0 ? zVar.e0.getAlpha() : 0.0f), 1.0f - e0Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x11 = (int) (zVar.d0.getX() + zVar.getX());
                int y11 = (int) (zVar.d0.getY() + zVar.getY());
                boolean z10 = zVar.W.getParent() != null;
                if (i16 != 5) {
                    float f31 = y11;
                    if (z10) {
                        f13 = 2.0f;
                        f28 = x11 + (AndroidUtilities.dp(36.0f) * e0Var.j);
                    } else {
                        f13 = 2.0f;
                        f28 = 0.0f;
                    }
                    canvas2.clipRect(f31, f28, zVar.d0.getMeasuredWidth() + y11, zVar.d0.getMeasuredHeight() + x11);
                } else {
                    f13 = 2.0f;
                }
                int i18 = -1;
                int i19 = -1;
                while (i19 < uj0Var.b.getChildCount()) {
                    View childAt = i19 == i18 ? uj0Var.v0 : uj0Var.b.getChildAt(i19);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i12 = i19;
                        rectF3 = rectF;
                        uj0Var3 = uj0Var;
                        i13 = i16;
                        i14 = save;
                        hashMap2 = hashMap;
                        rectF4 = rectF2;
                    } else {
                        canvas2.save();
                        if (childAt instanceof sj0) {
                            sj0 sj0Var = (sj0) childAt;
                            rj0 rj0Var = sj0Var.a;
                            rj0 rj0Var2 = sj0Var.b;
                            b1 b1Var = sj0Var.f;
                            if (b1Var != null) {
                                b1Var.setAlpha(1.0f - e0Var.j);
                            }
                            k51 k51Var2 = (k51) hashMap.get(sj0Var.e);
                            if (k51Var2 != null) {
                                float x12 = childAt.getX();
                                float y12 = childAt.getY();
                                if (i19 == -1) {
                                    x12 -= uj0Var.b.getX();
                                    f19 = y12 - uj0Var.b.getY();
                                } else {
                                    f19 = y12;
                                }
                                i12 = i19;
                                float x13 = ((zVar.d0.getX() + (zVar.getX() + k51Var2.getX())) - rj0Var2.getX()) - AndroidUtilities.dp(1.0f);
                                float y13 = (zVar.d0.getY() + (zVar.c0.getY() + (zVar.getY() + k51Var2.getY()))) - rj0Var2.getY();
                                float measuredWidth = k51Var2.getMeasuredWidth();
                                if (k51Var2.H) {
                                    i15 = 4;
                                } else {
                                    i15 = 4;
                                    if (i16 != 4) {
                                        f22 = x13;
                                        hashMap2 = hashMap;
                                        float f32 = y13;
                                        i13 = i16;
                                        float lerp2 = AndroidUtilities.lerp(x12, f22, e0Var.j);
                                        float f33 = x12;
                                        float lerp3 = AndroidUtilities.lerp(f19, f32, e0Var.j);
                                        float f34 = f19;
                                        float measuredWidth2 = measuredWidth / rj0Var2.getMeasuredWidth();
                                        i14 = save;
                                        rectF5 = rectF;
                                        f18 = AndroidUtilities.lerp(1.0f, measuredWidth2, e0Var.j);
                                        if (sj0Var.y != 0) {
                                            f23 = AndroidUtilities.dp(6.0f);
                                            f25 = f23;
                                            f24 = 0.0f;
                                        } else if (sj0Var.w) {
                                            f23 = AndroidUtilities.dp(6.0f);
                                            f24 = f23;
                                            f25 = f24;
                                            f26 = f25;
                                            canvas2.translate(lerp2, lerp3);
                                            canvas2.scale(f18, f18);
                                            if (this.f == 0.0f || this.h != 0.0f) {
                                                f27 = f23;
                                                rectF6 = rectF2;
                                            } else {
                                                rectF6 = rectF2;
                                                f27 = f23;
                                                this.f = AndroidUtilities.lerp((rectF6.left + f33) - f22, 0.0f, e0Var.j);
                                                this.h = AndroidUtilities.lerp((rectF6.top + f34) - f32, 0.0f, e0Var.j);
                                                this.n = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, e0Var.j);
                                                this.r = f22;
                                                this.s = f32;
                                            }
                                            f15 = f27;
                                            f16 = f24;
                                            f14 = f25;
                                            f17 = f26;
                                        } else {
                                            f23 = 0.0f;
                                            f24 = 0.0f;
                                            f25 = 0.0f;
                                        }
                                        f26 = 0.0f;
                                        canvas2.translate(lerp2, lerp3);
                                        canvas2.scale(f18, f18);
                                        if (this.f == 0.0f) {
                                        }
                                        f27 = f23;
                                        rectF6 = rectF2;
                                        f15 = f27;
                                        f16 = f24;
                                        f14 = f25;
                                        f17 = f26;
                                    }
                                }
                                if (i16 == i15) {
                                    f20 = x13 - AndroidUtilities.dp(0.33f);
                                    y13 -= AndroidUtilities.dp(1.33f);
                                    f21 = 0.87f * measuredWidth;
                                } else {
                                    f20 = x13;
                                    f21 = measuredWidth;
                                }
                                float f35 = k51Var2.H ? 0.95f * f21 : f21;
                                float f36 = (measuredWidth - f35) / f13;
                                measuredWidth = f35;
                                f22 = f20 + f36;
                                y13 += f36;
                                hashMap2 = hashMap;
                                float f322 = y13;
                                i13 = i16;
                                float lerp22 = AndroidUtilities.lerp(x12, f22, e0Var.j);
                                float f332 = x12;
                                float lerp32 = AndroidUtilities.lerp(f19, f322, e0Var.j);
                                float f342 = f19;
                                float measuredWidth22 = measuredWidth / rj0Var2.getMeasuredWidth();
                                i14 = save;
                                rectF5 = rectF;
                                f18 = AndroidUtilities.lerp(1.0f, measuredWidth22, e0Var.j);
                                if (sj0Var.y != 0) {
                                }
                                f26 = 0.0f;
                                canvas2.translate(lerp22, lerp32);
                                canvas2.scale(f18, f18);
                                if (this.f == 0.0f) {
                                }
                                f27 = f23;
                                rectF6 = rectF2;
                                f15 = f27;
                                f16 = f24;
                                f14 = f25;
                                f17 = f26;
                            } else {
                                i12 = i19;
                                rectF5 = rectF;
                                i13 = i16;
                                i14 = save;
                                hashMap2 = hashMap;
                                rectF6 = rectF2;
                                canvas2.translate(rj0Var2.getX() + childAt.getX(), rj0Var2.getY() + childAt.getY());
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 0.0f;
                                f18 = 1.0f;
                            }
                            if (k51Var2 != null) {
                                if (k51Var2.H) {
                                    float measuredWidth3 = sj0Var.getMeasuredWidth() / f13;
                                    float measuredHeight = sj0Var.getMeasuredHeight() / f13;
                                    float measuredWidth4 = sj0Var.getMeasuredWidth() - AndroidUtilities.dp(f13);
                                    float lerp4 = AndroidUtilities.lerp(measuredWidth4, (k51Var2.getMeasuredWidth() - AndroidUtilities.dp(f13)) / f18, e0Var.j);
                                    RectF rectF11 = AndroidUtilities.rectTmp;
                                    float f37 = lerp4 / f13;
                                    rectF7 = rectF6;
                                    uj0Var4 = uj0Var;
                                    rectF11.set(measuredWidth3 - f37, measuredHeight - f37, measuredWidth3 + f37, measuredHeight + f37);
                                    float lerp5 = AndroidUtilities.lerp(measuredWidth4 / f13, AndroidUtilities.dp(4.0f), e0Var.j);
                                    canvas2.drawRoundRect(rectF11, lerp5, lerp5, zVar.H);
                                } else {
                                    uj0Var4 = uj0Var;
                                    rectF7 = rectF6;
                                }
                                sj0Var.x = false;
                                if (f14 == 0.0f) {
                                    sj0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = rj0Var2.getImageReceiver();
                                    sj0Var.b();
                                    k5 k5Var = rj0Var2.e;
                                    if (k5Var != null && (z2Var3 = k5Var.k) != null) {
                                        imageReceiver = z2Var3;
                                    }
                                    int[] roundRadius = imageReceiver.getRoundRadius();
                                    int i20 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i20 >= 4) {
                                            break;
                                        }
                                        iArr[i20] = roundRadius[i20];
                                        i20++;
                                    }
                                    imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(f15, 0.0f, e0Var.j), (int) AndroidUtilities.lerp(f16, 0.0f, e0Var.j), (int) AndroidUtilities.lerp(f17, 0.0f, e0Var.j), (int) AndroidUtilities.lerp(f14, 0.0f, e0Var.j));
                                    sj0Var.draw(canvas2);
                                    imageReceiver.setRoundRadius(iArr);
                                }
                                sj0Var.x = true;
                                if (!k51Var2.b) {
                                    k51Var2.b = true;
                                    k51Var2.invalidate();
                                }
                            } else {
                                uj0Var4 = uj0Var;
                                rectF7 = rectF6;
                                if (sj0Var.r && rj0Var2.getImageReceiver().getLottieAnimation() == null) {
                                    float alpha = rj0Var.getImageReceiver().getAlpha();
                                    rj0Var.getImageReceiver().setAlpha((1.0f - clamp) * alpha);
                                    rj0Var.draw(canvas2);
                                    rj0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    sj0Var.b();
                                    ImageReceiver imageReceiver2 = rj0Var2.getImageReceiver();
                                    k5 k5Var2 = rj0Var2.e;
                                    if (k5Var2 != null && (z2Var2 = k5Var2.k) != null) {
                                        imageReceiver2 = z2Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - clamp) * alpha2);
                                    rj0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (rj0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            uj0Var3 = uj0Var4;
                            rectF3 = rectF5;
                            rectF4 = rectF7;
                        } else {
                            i12 = i19;
                            RectF rectF12 = rectF;
                            i13 = i16;
                            i14 = save;
                            hashMap2 = hashMap;
                            uj0Var3 = uj0Var;
                            rectF4 = rectF2;
                            rectF3 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - uj0Var3.w.width(), (childAt.getY() + rectF4.top) - rectF3.top);
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - clamp) * 255.0f), 31);
                            float f38 = 1.0f - e0Var.j;
                            canvas2.scale(f38, f38, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i19 = i12 + 1;
                    uj0Var = uj0Var3;
                    rectF2 = rectF4;
                    rectF = rectF3;
                    hashMap = hashMap2;
                    i16 = i13;
                    save = i14;
                    i18 = -1;
                }
                uj0Var2 = uj0Var;
                i11 = i16;
                canvas2.restoreToCount(save);
            } else {
                uj0Var2 = uj0Var;
                i11 = i16;
                f13 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i21 = e0Var.F;
            if (i21 < 5) {
                if (i21 == 3) {
                    uj0Var2.setSkipDraw(true);
                }
                e0Var.F++;
            }
            Paint paint2 = zVar.T1;
            y41 y41Var = zVar.d0;
            ImageReceiver imageReceiver3 = zVar.R0;
            if (zVar.O0 != null) {
                imageReceiver3.setParentView(this);
                k51 k51Var3 = zVar.O0;
                if (k51Var3 != null) {
                    float f39 = zVar.Q0;
                    if (f39 != 1.0f && !zVar.P0 && zVar.d1) {
                        float f40 = f39 + 0.010666667f;
                        zVar.Q0 = f40;
                        if (f40 >= 1.0f) {
                            zVar.Q0 = 1.0f;
                            z51 z51Var = zVar.D;
                            if (z51Var != null) {
                                uj0 uj0Var6 = (uj0) ((fa.c) z51Var).b;
                                if (k51Var3.s) {
                                    uj0Var6.l(k51Var3, k51Var3.x, true);
                                } else {
                                    long j10 = k51Var3.e.documentId;
                                    r0 r0Var2 = new r0();
                                    r0Var2.g = j10;
                                    r0Var2.h = j10;
                                    uj0Var6.l(k51Var3, r0Var2, true);
                                }
                            }
                        }
                        zVar.O0.C = zVar.Q0;
                    }
                    float f41 = (zVar.Q0 * f13) + 1.0f;
                    canvas2.save();
                    canvas2.translate(zVar.O0.getX() + y41Var.getX(), zVar.O0.getY() + y41Var.getY() + zVar.c0.getY());
                    paint2.setColor(f6.v0(f6.G8, zVar.V0));
                    canvas2.drawRect(0.0f, 0.0f, zVar.O0.getMeasuredWidth(), zVar.O0.getMeasuredHeight(), paint2);
                    canvas2.scale(f41, f41, zVar.O0.getMeasuredWidth() / f13, zVar.O0.getMeasuredHeight());
                    k51 k51Var4 = zVar.O0;
                    if (!k51Var4.s) {
                        imageReceiver3 = k51Var4.r;
                    }
                    k5 k5Var3 = zVar.S0;
                    if (k5Var3 != null && (z2Var = k5Var3.k) != null && z2Var.hasBitmapImage()) {
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
            if (i11 == 5) {
                canvas2.restore();
            }
            if (e0Var.x != null) {
                invalidate();
            }
            Runnable runnable = h0.c;
            if (runnable != null) {
                runnable.run();
                h0.c = null;
            }
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        e0 e0Var = this.w;
        uj0 uj0Var = e0Var.n;
        if (e0Var.y == 1 || !(uj0Var == null || uj0Var.getDelegate() == null || !uj0Var.getDelegate().u())) {
            e0Var.m.b0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        int measuredWidth;
        int i11;
        int dp;
        int dp2;
        e0 e0Var = this.w;
        int i12 = e0Var.y;
        if (i12 == 1 || i12 == 2 || i12 == 4) {
            measuredWidth = e0Var.n.getMeasuredWidth();
        } else if (i12 == 5) {
            measuredWidth = AndroidUtilities.dp(12.0f) + (AndroidUtilities.dp(36.0f) * 8);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
            int dp3 = (AndroidUtilities.dp(36.0f) * 8) + AndroidUtilities.dp(12.0f);
            if (dp3 < measuredWidth) {
                measuredWidth = dp3;
            }
        }
        if (e0Var.y != 4) {
            if (e0Var.n.B0) {
                int ceil = (int) Math.ceil(e0Var.o.size() / 8.0f);
                if (ceil <= 8) {
                    i11 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * ceil);
                } else {
                    dp = AndroidUtilities.dp(36.0f) * 8;
                    dp2 = AndroidUtilities.dp(8.0f);
                }
            } else {
                i11 = measuredWidth;
            }
            if (e0Var.y == 5) {
                i11 = Math.min(AndroidUtilities.dp(254.0f), i11);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
        }
        dp = AndroidUtilities.dp(36.0f) * 8;
        dp2 = AndroidUtilities.dp(8.0f);
        i11 = dp - dp2;
        if (e0Var.y == 5) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }
}
