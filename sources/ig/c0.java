package ig;

import ag.k2;
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
import java.util.HashMap;
import jh.y2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.j51;
import org.telegram.ui.x41;
import org.telegram.ui.y51;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            paint.setColor(i0.b.d(0.13f, -16777216, -1));
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
        float f10;
        HashMap hashMap;
        int i10;
        float f11;
        RectF rectF;
        float f12;
        RectF rectF2;
        int i11;
        wj0 wj0Var;
        wj0 wj0Var2;
        int i12;
        float f13;
        y2 y2Var;
        int i13;
        RectF rectF3;
        wj0 wj0Var3;
        int i14;
        int i15;
        HashMap hashMap2;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        wj0 wj0Var4;
        RectF rectF7;
        y2 y2Var2;
        int[] iArr;
        y2 y2Var3;
        float f19;
        int i16;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        q0 q0Var;
        float f29;
        Canvas canvas2 = canvas;
        d0 d0Var = this.w;
        RectF rectF8 = d0Var.f;
        int i17 = d0Var.y;
        RectF rectF9 = d0Var.i;
        z zVar = d0Var.m;
        wj0 wj0Var5 = d0Var.n;
        if (d0Var.l) {
            float clamp = Utilities.clamp(d0Var.j, 1.0f, 0.0f);
            RectF rectF10 = AndroidUtilities.rectTmp;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i17 == 4) {
                rectF8.set(wj0Var5.w);
                rectF8.offset(d0Var.g, d0Var.h);
            }
            AndroidUtilities.lerp(rectF8, rectF10, d0Var.j, rectF9);
            float lerp = AndroidUtilities.lerp(d0Var.e, AndroidUtilities.dp(i17 == 5 ? 20.0f : 8.0f), d0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i17 == 1 || (wj0Var5.getDelegate() != null && wj0Var5.getDelegate().t())) {
                f10 = 1.0f;
                vj0 delegate = wj0Var5.getDelegate();
                float x8 = getX();
                c0 c0Var = d0Var.a;
                hashMap = hashMap3;
                i10 = 4;
                f11 = 255.0f;
                delegate.r(canvas, rectF9, lerp, x8, i17 == 1 ? c0Var.getY() - AndroidUtilities.statusBarHeight : c0Var.getY() + d0Var.c.getY(), 255, true);
                canvas2 = canvas;
                rectF = rectF9;
            } else {
                int clamp2 = (int) (Utilities.clamp(clamp / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.a;
                drawable.setAlpha(clamp2);
                int i18 = (int) rectF9.left;
                Rect rect = this.b;
                f10 = 1.0f;
                drawable.setBounds(i18 - rect.left, ((int) rectF9.top) - rect.top, ((int) rectF9.right) + rect.right, ((int) rectF9.bottom) + rect.bottom);
                lg.d dVar = d0Var.z;
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
                f11 = 255.0f;
            }
            if (wj0Var5.N0 != null) {
                canvas2.save();
                float f30 = rectF.left;
                float y10 = wj0Var5.N0.getY() + rectF.top;
                if (i17 != 3 && i17 != i10) {
                    if (i17 != 5) {
                        f29 = 0.0f;
                        canvas2.translate(f30, y10 - f29);
                        rectF2 = rectF8;
                        f12 = lerp;
                        i11 = 5;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, wj0Var5.N0.getMeasuredWidth(), wj0Var5.N0.getMeasuredHeight(), (int) ((f10 - d0Var.j) * wj0Var5.N0.getAlpha() * f11), 31);
                        wj0Var5.N0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f29 = wj0Var5.w.top;
                canvas2.translate(f30, y10 - f29);
                rectF2 = rectF8;
                f12 = lerp;
                i11 = 5;
                canvas2.saveLayerAlpha(0.0f, 0.0f, wj0Var5.N0.getMeasuredWidth(), wj0Var5.N0.getMeasuredHeight(), (int) ((f10 - d0Var.j) * wj0Var5.N0.getAlpha() * f11), 31);
                wj0Var5.N0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f12 = lerp;
                rectF2 = rectF8;
                i11 = 5;
            }
            float width = (rectF.width() - wj0Var5.w.width()) + (rectF.left - wj0Var5.w.left);
            if (d0Var.j > 0.05f || i17 == i11) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - wj0Var5.w.height()) + (rectF.top - wj0Var5.w.top));
                float max = (Math.max(0.25f, Math.min(wj0Var5.v, 1.0f)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                wj0Var5.f(wj0Var5.A * max, max, wj0Var5.B * max, wj0Var5.I0 == i11 ? 255 : (int) y1.z(1.0f, wj0Var5.s0, Utilities.clamp(wj0Var5.s0 / 0.2f, 1.0f, 0.0f), 255.0f), canvas3);
                wj0Var = wj0Var5;
                canvas2 = canvas3;
                canvas2.restore();
            } else {
                wj0Var = wj0Var5;
            }
            if (i17 == 5) {
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
            if (wj0Var != null) {
                for (int childCount = zVar.d0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (zVar.d0.getChildAt(childCount) instanceof j51) {
                        j51 j51Var = (j51) zVar.d0.getChildAt(childCount);
                        if (j51Var.y && (q0Var = j51Var.x) != null) {
                            hashMap.put(q0Var, j51Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, com.google.android.recaptcha.internal.a.z(1.0f, d0Var.j, wj0Var.g() + wj0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (zVar.e0.getVisibility() == 0 ? zVar.e0.getAlpha() : 0.0f), 1.0f - d0Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x10 = (int) (zVar.d0.getX() + zVar.getX());
                int y11 = (int) (zVar.d0.getY() + zVar.getY());
                boolean z10 = zVar.W.getParent() != null;
                if (i17 != 5) {
                    float f31 = y11;
                    if (z10) {
                        f13 = 2.0f;
                        f28 = x10 + (AndroidUtilities.dp(36.0f) * d0Var.j);
                    } else {
                        f13 = 2.0f;
                        f28 = 0.0f;
                    }
                    canvas2.clipRect(f31, f28, zVar.d0.getMeasuredWidth() + y11, zVar.d0.getMeasuredHeight() + x10);
                } else {
                    f13 = 2.0f;
                }
                int i19 = -1;
                int i20 = -1;
                while (i20 < wj0Var.b.getChildCount()) {
                    View childAt = i20 == i19 ? wj0Var.v0 : wj0Var.b.getChildAt(i20);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i13 = i20;
                        rectF3 = rectF;
                        wj0Var3 = wj0Var;
                        i14 = i17;
                        i15 = save;
                        hashMap2 = hashMap;
                        rectF4 = rectF2;
                    } else {
                        canvas2.save();
                        if (childAt instanceof uj0) {
                            uj0 uj0Var = (uj0) childAt;
                            tj0 tj0Var = uj0Var.a;
                            tj0 tj0Var2 = uj0Var.b;
                            k2 k2Var = uj0Var.f;
                            if (k2Var != null) {
                                k2Var.setAlpha(1.0f - d0Var.j);
                            }
                            j51 j51Var2 = (j51) hashMap.get(uj0Var.e);
                            if (j51Var2 != null) {
                                float x11 = childAt.getX();
                                float y12 = childAt.getY();
                                if (i20 == -1) {
                                    x11 -= wj0Var.b.getX();
                                    f19 = y12 - wj0Var.b.getY();
                                } else {
                                    f19 = y12;
                                }
                                i13 = i20;
                                float x12 = ((zVar.d0.getX() + (zVar.getX() + j51Var2.getX())) - tj0Var2.getX()) - AndroidUtilities.dp(1.0f);
                                float y13 = (zVar.d0.getY() + (zVar.c0.getY() + (zVar.getY() + j51Var2.getY()))) - tj0Var2.getY();
                                float measuredWidth = j51Var2.getMeasuredWidth();
                                if (j51Var2.H) {
                                    i16 = 4;
                                } else {
                                    i16 = 4;
                                    if (i17 != 4) {
                                        f22 = x12;
                                        hashMap2 = hashMap;
                                        float f32 = y13;
                                        i14 = i17;
                                        float lerp2 = AndroidUtilities.lerp(x11, f22, d0Var.j);
                                        float f33 = x11;
                                        float lerp3 = AndroidUtilities.lerp(f19, f32, d0Var.j);
                                        float f34 = f19;
                                        float measuredWidth2 = measuredWidth / tj0Var2.getMeasuredWidth();
                                        i15 = save;
                                        rectF5 = rectF;
                                        f18 = AndroidUtilities.lerp(1.0f, measuredWidth2, d0Var.j);
                                        if (uj0Var.y != 0) {
                                            f23 = AndroidUtilities.dp(6.0f);
                                            f25 = f23;
                                            f24 = 0.0f;
                                        } else if (uj0Var.w) {
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
                                                this.f = AndroidUtilities.lerp((rectF6.left + f33) - f22, 0.0f, d0Var.j);
                                                this.h = AndroidUtilities.lerp((rectF6.top + f34) - f32, 0.0f, d0Var.j);
                                                this.n = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, d0Var.j);
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
                                if (i17 == i16) {
                                    f20 = x12 - AndroidUtilities.dp(0.33f);
                                    y13 -= AndroidUtilities.dp(1.33f);
                                    f21 = 0.87f * measuredWidth;
                                } else {
                                    f20 = x12;
                                    f21 = measuredWidth;
                                }
                                float f35 = j51Var2.H ? 0.95f * f21 : f21;
                                float f36 = (measuredWidth - f35) / f13;
                                measuredWidth = f35;
                                f22 = f20 + f36;
                                y13 += f36;
                                hashMap2 = hashMap;
                                float f322 = y13;
                                i14 = i17;
                                float lerp22 = AndroidUtilities.lerp(x11, f22, d0Var.j);
                                float f332 = x11;
                                float lerp32 = AndroidUtilities.lerp(f19, f322, d0Var.j);
                                float f342 = f19;
                                float measuredWidth22 = measuredWidth / tj0Var2.getMeasuredWidth();
                                i15 = save;
                                rectF5 = rectF;
                                f18 = AndroidUtilities.lerp(1.0f, measuredWidth22, d0Var.j);
                                if (uj0Var.y != 0) {
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
                                i13 = i20;
                                rectF5 = rectF;
                                i14 = i17;
                                i15 = save;
                                hashMap2 = hashMap;
                                rectF6 = rectF2;
                                canvas2.translate(tj0Var2.getX() + childAt.getX(), tj0Var2.getY() + childAt.getY());
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 0.0f;
                                f18 = 1.0f;
                            }
                            if (j51Var2 != null) {
                                if (j51Var2.H) {
                                    float measuredWidth3 = uj0Var.getMeasuredWidth() / f13;
                                    float measuredHeight = uj0Var.getMeasuredHeight() / f13;
                                    float measuredWidth4 = uj0Var.getMeasuredWidth() - AndroidUtilities.dp(f13);
                                    float lerp4 = AndroidUtilities.lerp(measuredWidth4, (j51Var2.getMeasuredWidth() - AndroidUtilities.dp(f13)) / f18, d0Var.j);
                                    RectF rectF11 = AndroidUtilities.rectTmp;
                                    float f37 = lerp4 / f13;
                                    rectF7 = rectF6;
                                    wj0Var4 = wj0Var;
                                    rectF11.set(measuredWidth3 - f37, measuredHeight - f37, measuredWidth3 + f37, measuredHeight + f37);
                                    float lerp5 = AndroidUtilities.lerp(measuredWidth4 / f13, AndroidUtilities.dp(4.0f), d0Var.j);
                                    canvas2.drawRoundRect(rectF11, lerp5, lerp5, zVar.H);
                                } else {
                                    wj0Var4 = wj0Var;
                                    rectF7 = rectF6;
                                }
                                uj0Var.x = false;
                                if (f14 == 0.0f) {
                                    uj0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = tj0Var2.getImageReceiver();
                                    uj0Var.b();
                                    k5 k5Var = tj0Var2.e;
                                    if (k5Var != null && (y2Var3 = k5Var.k) != null) {
                                        imageReceiver = y2Var3;
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
                                    imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(f15, 0.0f, d0Var.j), (int) AndroidUtilities.lerp(f16, 0.0f, d0Var.j), (int) AndroidUtilities.lerp(f17, 0.0f, d0Var.j), (int) AndroidUtilities.lerp(f14, 0.0f, d0Var.j));
                                    uj0Var.draw(canvas2);
                                    imageReceiver.setRoundRadius(iArr);
                                }
                                uj0Var.x = true;
                                if (!j51Var2.b) {
                                    j51Var2.b = true;
                                    j51Var2.invalidate();
                                }
                            } else {
                                wj0Var4 = wj0Var;
                                rectF7 = rectF6;
                                if (uj0Var.r && tj0Var2.getImageReceiver().getLottieAnimation() == null) {
                                    float alpha = tj0Var.getImageReceiver().getAlpha();
                                    tj0Var.getImageReceiver().setAlpha((1.0f - clamp) * alpha);
                                    tj0Var.draw(canvas2);
                                    tj0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    uj0Var.b();
                                    ImageReceiver imageReceiver2 = tj0Var2.getImageReceiver();
                                    k5 k5Var2 = tj0Var2.e;
                                    if (k5Var2 != null && (y2Var2 = k5Var2.k) != null) {
                                        imageReceiver2 = y2Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - clamp) * alpha2);
                                    tj0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (tj0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            wj0Var3 = wj0Var4;
                            rectF3 = rectF5;
                            rectF4 = rectF7;
                        } else {
                            i13 = i20;
                            RectF rectF12 = rectF;
                            i14 = i17;
                            i15 = save;
                            hashMap2 = hashMap;
                            wj0Var3 = wj0Var;
                            rectF4 = rectF2;
                            rectF3 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - wj0Var3.w.width(), (childAt.getY() + rectF4.top) - rectF3.top);
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - clamp) * 255.0f), 31);
                            float f38 = 1.0f - d0Var.j;
                            canvas2.scale(f38, f38, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i20 = i13 + 1;
                    wj0Var = wj0Var3;
                    rectF2 = rectF4;
                    rectF = rectF3;
                    hashMap = hashMap2;
                    i17 = i14;
                    save = i15;
                    i19 = -1;
                }
                wj0Var2 = wj0Var;
                i12 = i17;
                canvas2.restoreToCount(save);
            } else {
                wj0Var2 = wj0Var;
                i12 = i17;
                f13 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i22 = d0Var.F;
            if (i22 < 5) {
                if (i22 == 3) {
                    wj0Var2.setSkipDraw(true);
                }
                d0Var.F++;
            }
            Paint paint2 = zVar.T1;
            x41 x41Var = zVar.d0;
            ImageReceiver imageReceiver3 = zVar.R0;
            if (zVar.O0 != null) {
                imageReceiver3.setParentView(this);
                j51 j51Var3 = zVar.O0;
                if (j51Var3 != null) {
                    float f39 = zVar.Q0;
                    if (f39 != 1.0f && !zVar.P0 && zVar.d1) {
                        float f40 = f39 + 0.010666667f;
                        zVar.Q0 = f40;
                        if (f40 >= 1.0f) {
                            zVar.Q0 = 1.0f;
                            y51 y51Var = zVar.D;
                            if (y51Var != null) {
                                wj0 wj0Var6 = (wj0) ((k5.i) y51Var).b;
                                if (j51Var3.s) {
                                    wj0Var6.l(j51Var3, j51Var3.x, true);
                                } else {
                                    long j10 = j51Var3.e.documentId;
                                    q0 q0Var2 = new q0();
                                    q0Var2.g = j10;
                                    q0Var2.h = j10;
                                    wj0Var6.l(j51Var3, q0Var2, true);
                                }
                            }
                        }
                        zVar.O0.C = zVar.Q0;
                    }
                    float f41 = (zVar.Q0 * f13) + 1.0f;
                    canvas2.save();
                    canvas2.translate(zVar.O0.getX() + x41Var.getX(), zVar.O0.getY() + x41Var.getY() + zVar.c0.getY());
                    paint2.setColor(g6.v0(g6.G8, zVar.V0));
                    canvas2.drawRect(0.0f, 0.0f, zVar.O0.getMeasuredWidth(), zVar.O0.getMeasuredHeight(), paint2);
                    canvas2.scale(f41, f41, zVar.O0.getMeasuredWidth() / f13, zVar.O0.getMeasuredHeight());
                    j51 j51Var4 = zVar.O0;
                    if (!j51Var4.s) {
                        imageReceiver3 = j51Var4.r;
                    }
                    k5 k5Var3 = zVar.S0;
                    if (k5Var3 != null && (y2Var = k5Var3.k) != null && y2Var.hasBitmapImage()) {
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
        wj0 wj0Var = d0Var.n;
        if (d0Var.y == 1 || !(wj0Var == null || wj0Var.getDelegate() == null || !wj0Var.getDelegate().t())) {
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
