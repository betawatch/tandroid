package ng;

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
import fg.r1;
import java.util.HashMap;
import oh.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.f61;
import org.telegram.ui.t51;
import org.telegram.ui.u61;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int i10 = k6.Td;
        g6 g6Var = d0Var.s;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.v0(i10, g6Var), PorterDuff.Mode.MULTIPLY));
        if (d0Var.y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(k6.v0(k6.G8, g6Var));
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
        qk0 qk0Var;
        qk0 qk0Var2;
        int i12;
        float f13;
        z2 z2Var;
        int i13;
        RectF rectF3;
        qk0 qk0Var3;
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
        qk0 qk0Var4;
        RectF rectF7;
        z2 z2Var2;
        int[] iArr;
        z2 z2Var3;
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
        qk0 qk0Var5 = d0Var.n;
        if (d0Var.l) {
            float clamp = Utilities.clamp(d0Var.j, 1.0f, 0.0f);
            RectF rectF10 = AndroidUtilities.rectTmp;
            rectF10.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i17 == 4) {
                rectF8.set(qk0Var5.w);
                rectF8.offset(d0Var.g, d0Var.h);
            }
            AndroidUtilities.lerp(rectF8, rectF10, d0Var.j, rectF9);
            float lerp = AndroidUtilities.lerp(d0Var.e, AndroidUtilities.dp(i17 == 5 ? 20.0f : 8.0f), d0Var.j);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            if (i17 == 1 || (qk0Var5.getDelegate() != null && qk0Var5.getDelegate().t())) {
                f10 = 1.0f;
                pk0 delegate = qk0Var5.getDelegate();
                float x10 = getX();
                c0 c0Var = d0Var.a;
                hashMap = hashMap3;
                i10 = 4;
                f11 = 255.0f;
                delegate.j(canvas, rectF9, lerp, x10, i17 == 1 ? c0Var.getY() - AndroidUtilities.statusBarHeight : c0Var.getY() + d0Var.c.getY(), 255, true);
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
                qg.b bVar = d0Var.z;
                Paint paint = this.c;
                if (bVar != null) {
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
            if (qk0Var5.O0 != null) {
                canvas2.save();
                float f30 = rectF.left;
                float y10 = qk0Var5.O0.getY() + rectF.top;
                if (i17 != 3 && i17 != i10) {
                    if (i17 != 5) {
                        f29 = 0.0f;
                        canvas2.translate(f30, y10 - f29);
                        rectF2 = rectF8;
                        f12 = lerp;
                        i11 = 5;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, qk0Var5.O0.getMeasuredWidth(), qk0Var5.O0.getMeasuredHeight(), (int) ((f10 - d0Var.j) * qk0Var5.O0.getAlpha() * f11), 31);
                        qk0Var5.O0.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    }
                }
                f29 = qk0Var5.w.top;
                canvas2.translate(f30, y10 - f29);
                rectF2 = rectF8;
                f12 = lerp;
                i11 = 5;
                canvas2.saveLayerAlpha(0.0f, 0.0f, qk0Var5.O0.getMeasuredWidth(), qk0Var5.O0.getMeasuredHeight(), (int) ((f10 - d0Var.j) * qk0Var5.O0.getAlpha() * f11), 31);
                qk0Var5.O0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f12 = lerp;
                rectF2 = rectF8;
                i11 = 5;
            }
            float width = (rectF.width() - qk0Var5.w.width()) + (rectF.left - qk0Var5.w.left);
            if (d0Var.j > 0.05f || i17 == i11) {
                canvas2.save();
                canvas2.translate(width, (rectF.height() - qk0Var5.w.height()) + (rectF.top - qk0Var5.w.top));
                float max = (Math.max(0.25f, Math.min(qk0Var5.v, 1.0f)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                qk0Var5.f(qk0Var5.B * max, max, qk0Var5.C * max, qk0Var5.J0 == i11 ? 255 : (int) y3.y(1.0f, qk0Var5.t0, Utilities.clamp(qk0Var5.t0 / 0.2f, 1.0f, 0.0f), 255.0f), canvas3);
                qk0Var = qk0Var5;
                canvas2 = canvas3;
                canvas2.restore();
            } else {
                qk0Var = qk0Var5;
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
            if (qk0Var != null) {
                for (int childCount = zVar.e0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (zVar.e0.getChildAt(childCount) instanceof f61) {
                        f61 f61Var = (f61) zVar.e0.getChildAt(childCount);
                        if (f61Var.y && (q0Var = f61Var.x) != null) {
                            hashMap.put(q0Var, f61Var);
                        }
                    }
                }
                int save = canvas2.save();
                canvas2.translate(rectF.left, e2.c.w(1.0f, d0Var.j, qk0Var.g() + qk0Var.getTopOffset(), rectF.top));
                float max2 = Math.max(1.0f - (zVar.f0.getVisibility() == 0 ? zVar.f0.getAlpha() : 0.0f), 1.0f - d0Var.j);
                if (max2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF.width(), rectF.height(), (int) (max2 * 255.0f), 31);
                }
                int x11 = (int) (zVar.e0.getX() + zVar.getX());
                int y11 = (int) (zVar.e0.getY() + zVar.getY());
                boolean z4 = zVar.a0.getParent() != null;
                if (i17 != 5) {
                    float f31 = y11;
                    if (z4) {
                        f13 = 2.0f;
                        f28 = x11 + (AndroidUtilities.dp(36.0f) * d0Var.j);
                    } else {
                        f13 = 2.0f;
                        f28 = 0.0f;
                    }
                    canvas2.clipRect(f31, f28, zVar.e0.getMeasuredWidth() + y11, zVar.e0.getMeasuredHeight() + x11);
                } else {
                    f13 = 2.0f;
                }
                int i19 = -1;
                int i20 = -1;
                while (i20 < qk0Var.b.getChildCount()) {
                    View childAt = i20 == i19 ? qk0Var.w0 : qk0Var.b.getChildAt(i20);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i13 = i20;
                        rectF3 = rectF;
                        qk0Var3 = qk0Var;
                        i14 = i17;
                        i15 = save;
                        hashMap2 = hashMap;
                        rectF4 = rectF2;
                    } else {
                        canvas2.save();
                        if (childAt instanceof ok0) {
                            ok0 ok0Var = (ok0) childAt;
                            nk0 nk0Var = ok0Var.a;
                            nk0 nk0Var2 = ok0Var.b;
                            r1 r1Var = ok0Var.f;
                            if (r1Var != null) {
                                r1Var.setAlpha(1.0f - d0Var.j);
                            }
                            f61 f61Var2 = (f61) hashMap.get(ok0Var.e);
                            if (f61Var2 != null) {
                                float x12 = childAt.getX();
                                float y12 = childAt.getY();
                                if (i20 == -1) {
                                    x12 -= qk0Var.b.getX();
                                    f19 = y12 - qk0Var.b.getY();
                                } else {
                                    f19 = y12;
                                }
                                i13 = i20;
                                float x13 = ((zVar.e0.getX() + (zVar.getX() + f61Var2.getX())) - nk0Var2.getX()) - AndroidUtilities.dp(1.0f);
                                float y13 = (zVar.e0.getY() + (zVar.d0.getY() + (zVar.getY() + f61Var2.getY()))) - nk0Var2.getY();
                                float measuredWidth = f61Var2.getMeasuredWidth();
                                if (f61Var2.I) {
                                    i16 = 4;
                                } else {
                                    i16 = 4;
                                    if (i17 != 4) {
                                        f22 = x13;
                                        hashMap2 = hashMap;
                                        float f32 = y13;
                                        i14 = i17;
                                        float lerp2 = AndroidUtilities.lerp(x12, f22, d0Var.j);
                                        float f33 = x12;
                                        float lerp3 = AndroidUtilities.lerp(f19, f32, d0Var.j);
                                        float f34 = f19;
                                        float measuredWidth2 = measuredWidth / nk0Var2.getMeasuredWidth();
                                        i15 = save;
                                        rectF5 = rectF;
                                        f18 = AndroidUtilities.lerp(1.0f, measuredWidth2, d0Var.j);
                                        if (ok0Var.y != 0) {
                                            f23 = AndroidUtilities.dp(6.0f);
                                            f25 = f23;
                                            f24 = 0.0f;
                                        } else if (ok0Var.w) {
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
                                    f20 = x13 - AndroidUtilities.dp(0.33f);
                                    y13 -= AndroidUtilities.dp(1.33f);
                                    f21 = 0.87f * measuredWidth;
                                } else {
                                    f20 = x13;
                                    f21 = measuredWidth;
                                }
                                float f35 = f61Var2.I ? 0.95f * f21 : f21;
                                float f36 = (measuredWidth - f35) / f13;
                                measuredWidth = f35;
                                f22 = f20 + f36;
                                y13 += f36;
                                hashMap2 = hashMap;
                                float f322 = y13;
                                i14 = i17;
                                float lerp22 = AndroidUtilities.lerp(x12, f22, d0Var.j);
                                float f332 = x12;
                                float lerp32 = AndroidUtilities.lerp(f19, f322, d0Var.j);
                                float f342 = f19;
                                float measuredWidth22 = measuredWidth / nk0Var2.getMeasuredWidth();
                                i15 = save;
                                rectF5 = rectF;
                                f18 = AndroidUtilities.lerp(1.0f, measuredWidth22, d0Var.j);
                                if (ok0Var.y != 0) {
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
                                canvas2.translate(nk0Var2.getX() + childAt.getX(), nk0Var2.getY() + childAt.getY());
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 0.0f;
                                f18 = 1.0f;
                            }
                            if (f61Var2 != null) {
                                if (f61Var2.I) {
                                    float measuredWidth3 = ok0Var.getMeasuredWidth() / f13;
                                    float measuredHeight = ok0Var.getMeasuredHeight() / f13;
                                    float measuredWidth4 = ok0Var.getMeasuredWidth() - AndroidUtilities.dp(f13);
                                    float lerp4 = AndroidUtilities.lerp(measuredWidth4, (f61Var2.getMeasuredWidth() - AndroidUtilities.dp(f13)) / f18, d0Var.j);
                                    RectF rectF11 = AndroidUtilities.rectTmp;
                                    float f37 = lerp4 / f13;
                                    rectF7 = rectF6;
                                    qk0Var4 = qk0Var;
                                    rectF11.set(measuredWidth3 - f37, measuredHeight - f37, measuredWidth3 + f37, measuredHeight + f37);
                                    float lerp5 = AndroidUtilities.lerp(measuredWidth4 / f13, AndroidUtilities.dp(4.0f), d0Var.j);
                                    canvas2.drawRoundRect(rectF11, lerp5, lerp5, zVar.I);
                                } else {
                                    qk0Var4 = qk0Var;
                                    rectF7 = rectF6;
                                }
                                ok0Var.x = false;
                                if (f14 == 0.0f) {
                                    ok0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = nk0Var2.getImageReceiver();
                                    ok0Var.b();
                                    l5 l5Var = nk0Var2.e;
                                    if (l5Var != null && (z2Var3 = l5Var.k) != null) {
                                        imageReceiver = z2Var3;
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
                                    ok0Var.draw(canvas2);
                                    imageReceiver.setRoundRadius(iArr);
                                }
                                ok0Var.x = true;
                                if (!f61Var2.b) {
                                    f61Var2.b = true;
                                    f61Var2.invalidate();
                                }
                            } else {
                                qk0Var4 = qk0Var;
                                rectF7 = rectF6;
                                if (ok0Var.r && nk0Var2.getImageReceiver().getLottieAnimation() == null) {
                                    float alpha = nk0Var.getImageReceiver().getAlpha();
                                    nk0Var.getImageReceiver().setAlpha((1.0f - clamp) * alpha);
                                    nk0Var.draw(canvas2);
                                    nk0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    ok0Var.b();
                                    ImageReceiver imageReceiver2 = nk0Var2.getImageReceiver();
                                    l5 l5Var2 = nk0Var2.e;
                                    if (l5Var2 != null && (z2Var2 = l5Var2.k) != null) {
                                        imageReceiver2 = z2Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - clamp) * alpha2);
                                    nk0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (nk0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            qk0Var3 = qk0Var4;
                            rectF3 = rectF5;
                            rectF4 = rectF7;
                        } else {
                            i13 = i20;
                            RectF rectF12 = rectF;
                            i14 = i17;
                            i15 = save;
                            hashMap2 = hashMap;
                            qk0Var3 = qk0Var;
                            rectF4 = rectF2;
                            rectF3 = rectF12;
                            canvas2.translate((rectF12.width() + childAt.getX()) - qk0Var3.w.width(), (childAt.getY() + rectF4.top) - rectF3.top);
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - clamp) * 255.0f), 31);
                            float f38 = 1.0f - d0Var.j;
                            canvas2.scale(f38, f38, r14.getMeasuredWidth() >> 1, r14.getMeasuredHeight() >> 1);
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i20 = i13 + 1;
                    qk0Var = qk0Var3;
                    rectF2 = rectF4;
                    rectF = rectF3;
                    hashMap = hashMap2;
                    i17 = i14;
                    save = i15;
                    i19 = -1;
                }
                qk0Var2 = qk0Var;
                i12 = i17;
                canvas2.restoreToCount(save);
            } else {
                qk0Var2 = qk0Var;
                i12 = i17;
                f13 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i22 = d0Var.F;
            if (i22 < 5) {
                if (i22 == 3) {
                    qk0Var2.setSkipDraw(true);
                }
                d0Var.F++;
            }
            Paint paint2 = zVar.U1;
            t51 t51Var = zVar.e0;
            ImageReceiver imageReceiver3 = zVar.S0;
            if (zVar.P0 != null) {
                imageReceiver3.setParentView(this);
                f61 f61Var3 = zVar.P0;
                if (f61Var3 != null) {
                    float f39 = zVar.R0;
                    if (f39 != 1.0f && !zVar.Q0 && zVar.e1) {
                        float f40 = f39 + 0.010666667f;
                        zVar.R0 = f40;
                        if (f40 >= 1.0f) {
                            zVar.R0 = 1.0f;
                            u61 u61Var = zVar.E;
                            if (u61Var != null) {
                                qk0 qk0Var6 = (qk0) ((o5.i) u61Var).b;
                                if (f61Var3.s) {
                                    qk0Var6.l(f61Var3, f61Var3.x, true);
                                } else {
                                    long j10 = f61Var3.e.documentId;
                                    q0 q0Var2 = new q0();
                                    q0Var2.g = j10;
                                    q0Var2.h = j10;
                                    qk0Var6.l(f61Var3, q0Var2, true);
                                }
                            }
                        }
                        zVar.P0.D = zVar.R0;
                    }
                    float f41 = (zVar.R0 * f13) + 1.0f;
                    canvas2.save();
                    canvas2.translate(zVar.P0.getX() + t51Var.getX(), zVar.P0.getY() + t51Var.getY() + zVar.d0.getY());
                    paint2.setColor(k6.v0(k6.G8, zVar.W0));
                    canvas2.drawRect(0.0f, 0.0f, zVar.P0.getMeasuredWidth(), zVar.P0.getMeasuredHeight(), paint2);
                    canvas2.scale(f41, f41, zVar.P0.getMeasuredWidth() / f13, zVar.P0.getMeasuredHeight());
                    f61 f61Var4 = zVar.P0;
                    if (!f61Var4.s) {
                        imageReceiver3 = f61Var4.r;
                    }
                    l5 l5Var3 = zVar.T0;
                    if (l5Var3 != null && (z2Var = l5Var3.k) != null && z2Var.hasBitmapImage()) {
                        imageReceiver3 = zVar.T0.k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.setImageCoords(0.0f, 0.0f, zVar.P0.getMeasuredWidth(), zVar.P0.getMeasuredHeight());
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
        qk0 qk0Var = d0Var.n;
        if (d0Var.y == 1 || !(qk0Var == null || qk0Var.getDelegate() == null || !qk0Var.getDelegate().t())) {
            d0Var.m.c0.invalidate();
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
            if (d0Var.n.C0) {
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
