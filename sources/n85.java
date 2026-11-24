// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n85 extends ela {
    public boolean m0;
    public final RectF n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public final HashMap s0;
    public final /* synthetic */ g95 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n85(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.t0 = g95Var;
        this.m0 = false;
        this.n0 = new RectF();
        this.s0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03f1  */
    @Override // ela, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        boolean z;
        float f2;
        Canvas canvas2;
        Canvas canvas3;
        wb5 wb5Var;
        float f3;
        float measuredWidth;
        float left;
        float[] fArr;
        Path path;
        wb5 wb5Var2;
        ArrayList arrayList;
        HashMap hashMap;
        float x;
        float y;
        float x2;
        float y2;
        boolean z2;
        Shader.TileMode tileMode;
        g95 g95Var = this.t0;
        View view = g95Var.A4;
        ArrayList arrayList2 = g95Var.R3;
        aa5 aa5Var = g95Var.V1;
        Paint paint = g95Var.w2;
        y65 y65Var = g95Var.e4;
        g75 g75Var = g95Var.s4;
        c75 c75Var = g95Var.T3;
        p85 p85Var = g95Var.J1;
        boolean z3 = true;
        if (g95Var.k4 || g95Var.v4 || Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || gm.m0) {
            f = 1.0f;
        } else {
            if (g95Var.G4 == null) {
                g95Var.G4 = new RenderNode("CallActivity.Blur");
                g95Var.H4 = ela.getRenderNodeScale();
                ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                float blurRadius = ela.getBlurRadius();
                RenderNode renderNode = g95Var.G4;
                f = 1.0f;
                tileMode = Shader.TileMode.DECAL;
                renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                aa5Var.setBlurRoot(this);
                RenderNode renderNode2 = g95Var.G4;
                float f4 = g95Var.H4;
                aa5Var.V0 = renderNode2;
                aa5Var.W0 = f4;
                t86 t86Var = g95Var.k3;
                t86Var.d = this;
                t86Var.b = renderNode2;
                t86Var.c = f4;
            } else {
                f = 1.0f;
            }
            int round = Math.round(getMeasuredWidth() / g95Var.H4);
            int round2 = Math.round(getMeasuredHeight() / g95Var.H4);
            g95Var.k4 = true;
            g95Var.G4.setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = g95Var.G4.beginRecording();
            float f5 = f / g95Var.H4;
            beginRecording.scale(f5, f5);
            dispatchDraw(beginRecording);
            g95Var.G4.endRecording();
            g95Var.k4 = false;
        }
        for (int i = 0; i < p85Var.getChildCount(); i++) {
            View childAt = p85Var.getChildAt(i);
            if (childAt instanceof wb5) {
                ((wb5) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof n95)) {
                if (childAt.getMeasuredWidth() != p85Var.getMeasuredWidth()) {
                    childAt.setTranslationX((p85Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (c75Var.r == null) {
            z = true;
            for (int i2 = 0; i2 < y65Var.getChildCount(); i2++) {
                ((l95) y65Var.getChildAt(i2)).setProgressToFullscreen(1.0f);
            }
        } else if (y65Var.getVisibility() == 0) {
            HashMap hashMap2 = this.s0;
            hashMap2.clear();
            int i3 = 0;
            while (i3 < p85Var.getChildCount()) {
                View childAt2 = p85Var.getChildAt(i3);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof n95) {
                        p85Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            n95 n95Var = (n95) childAt2;
                            z2 = z3;
                            if (n95Var.getRenderer() != c75Var.E) {
                                hashMap2.put(n95Var.getParticipant(), childAt2);
                            }
                        }
                    }
                    z2 = z3;
                    if (childAt2 instanceof wb5) {
                        p85Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            wb5 wb5Var3 = (wb5) childAt2;
                            hashMap2.put(wb5Var3.getParticipant(), wb5Var3);
                        }
                    }
                } else {
                    z2 = z3;
                }
                i3++;
                z3 = z2;
            }
            z = z3;
            int i4 = 0;
            while (i4 < y65Var.getChildCount()) {
                l95 l95Var = (l95) y65Var.getChildAt(i4);
                View view2 = (View) hashMap2.get(l95Var.getVideoParticipant());
                if (view2 == null) {
                    view2 = (View) hashMap2.get(l95Var.getParticipant());
                }
                float f6 = c75Var.c;
                if (!g95Var.D4.k()) {
                    l95Var.setAlpha(f);
                }
                if (view2 != null) {
                    if (view2 instanceof n95) {
                        n95 n95Var2 = (n95) view2;
                        x = (p85Var.getX() + n95Var2.getLeft()) - c75Var.getLeft();
                        y = (p85Var.getY() + n95Var2.getTop()) - c75Var.getTop();
                        x2 = y65Var.getX() + l95Var.getLeft();
                        y2 = y65Var.getY() + l95Var.getTop();
                        hashMap = hashMap2;
                    } else {
                        x = ((p85Var.getX() + r6.getLeft()) - c75Var.getLeft()) + r6.getAvatarImageView().getLeft() + (r6.getAvatarImageView().getMeasuredWidth() >> 1);
                        y = ((p85Var.getY() + r6.getTop()) - c75Var.getTop()) + r6.getAvatarImageView().getTop() + (r6.getAvatarImageView().getMeasuredHeight() >> 1);
                        x2 = y65Var.getX() + l95Var.getLeft() + (l95Var.getMeasuredWidth() >> 1);
                        hashMap = hashMap2;
                        y2 = y65Var.getY() + l95Var.getTop() + (l95Var.getMeasuredHeight() >> 1);
                        ((wb5) view2).setDrawAvatar(false);
                    }
                    float f7 = 1.0f - f6;
                    l95Var.setTranslationX((x - x2) * f7);
                    l95Var.setTranslationY((y - y2) * f7);
                    l95Var.setScaleX(1.0f);
                    l95Var.setScaleY(1.0f);
                    l95Var.setProgressToFullscreen(f6);
                } else {
                    hashMap = hashMap2;
                    l95Var.setScaleX(1.0f);
                    l95Var.setScaleY(1.0f);
                    l95Var.setTranslationX(0.0f);
                    l95Var.setTranslationY(0.0f);
                    l95Var.setProgressToFullscreen(1.0f);
                    if (l95Var.getRenderer() == null) {
                        l95Var.setAlpha(f6);
                    }
                }
                i4++;
                hashMap2 = hashMap;
                f = 1.0f;
            }
        } else {
            z = true;
        }
        int i5 = 0;
        while (i5 < arrayList2.size()) {
            ha5 ha5Var = (ha5) arrayList2.get(i5);
            r59 r59Var = g95Var.f4;
            da5 da5Var = ha5Var.a;
            if (!ha5Var.h && !ha5Var.f && !ha5Var.P) {
                ha5Var.y0 = false;
                float f8 = c75Var.c;
                if (ha5Var.r || ha5Var.b) {
                    arrayList = arrayList2;
                    n95 n95Var3 = ha5Var.c;
                    if (n95Var3 == null && ha5Var.e == null) {
                        ha5Var.setTranslationX(0.0f);
                        ha5Var.setTranslationY(0.0f);
                    } else {
                        n95 n95Var4 = ha5Var.e;
                        if (n95Var4 != null) {
                            n95Var3 = n95Var4;
                        } else {
                            r59Var = p85Var;
                        }
                        float x3 = ((r59Var.getX() + n95Var3.getX()) - ha5Var.getLeft()) - c75Var.getLeft();
                        float y3 = ((r59Var.getY() + (n95Var3.getY() + gm.L(2.0f))) - ha5Var.getTop()) - c75Var.getTop();
                        float f9 = 1.0f - f8;
                        float f10 = f8 * 0.0f;
                        ha5Var.setTranslationX((x3 * f9) + f10);
                        ha5Var.setTranslationY((y3 * f9) + f10);
                    }
                    da5Var.setRoundCorners(gm.L(8.0f));
                    l95 l95Var2 = ha5Var.d;
                    if (l95Var2 != null) {
                        l95Var2.setAlpha(f8);
                    }
                    if (!ha5Var.b && ha5Var.c == null && ha5Var.e == null) {
                        ha5Var.setAlpha(f8);
                    } else if (!ha5Var.F) {
                        ha5Var.setAlpha(1.0f);
                    }
                } else {
                    l95 l95Var3 = ha5Var.d;
                    if (l95Var3 != null) {
                        y65Var.getClass();
                        if (RecyclerView.R(l95Var3) == -1 ? z : false) {
                            ha5Var.setAlpha(ha5Var.d.getAlpha());
                        } else if (ha5Var.c == null) {
                            if (ha5Var.w && !ha5Var.F) {
                                ha5Var.setAlpha(f8);
                            }
                            ha5Var.d.setAlpha(f8);
                            f8 = 1.0f;
                        } else {
                            ha5Var.d.setAlpha(1.0f);
                            if (ha5Var.w && !ha5Var.F) {
                                ha5Var.setAlpha(1.0f);
                            }
                        }
                        ha5Var.setTranslationX((y65Var.getX() + ha5Var.d.getX()) - ha5Var.getLeft());
                        float f11 = 1.0f - f8;
                        ha5Var.setTranslationY((y65Var.getY() + (ha5Var.d.getY() + (gm.L(2.0f) * f11))) - ha5Var.getTop());
                        da5Var.setRoundCorners((gm.L(8.0f) * f11) + (gm.L(13.0f) * f8));
                    } else {
                        n95 n95Var5 = ha5Var.c;
                        if (n95Var5 != null || ha5Var.e != null) {
                            n95 n95Var6 = ha5Var.e;
                            if (n95Var6 == null) {
                                r59Var = p85Var;
                            } else if (n95Var5 != null) {
                                arrayList = arrayList2;
                                if (!g95.v5 || ha5Var.y.b) {
                                    r59Var = p85Var;
                                } else {
                                    n95Var5 = n95Var6;
                                }
                                ha5Var.setTranslationX(((r59Var.getX() + n95Var5.getX()) - ha5Var.getLeft()) - c75Var.getLeft());
                                ha5Var.setTranslationY(((r59Var.getY() + (n95Var5.getY() + gm.L(2.0f))) - ha5Var.getTop()) - c75Var.getTop());
                                da5Var.setRoundCorners(gm.L(8.0f));
                                if (ha5Var.w && !ha5Var.F) {
                                    if (g95.v5) {
                                        ha5Var.y0 = z;
                                        ha5Var.setAlpha(n95Var5.getAlpha() * (1.0f - f8));
                                    } else if (ha5Var.c != null && ha5Var.e == null) {
                                        ha5Var.setAlpha(n95Var5.getAlpha() * f8);
                                    }
                                }
                            } else {
                                n95Var5 = n95Var6;
                            }
                            arrayList = arrayList2;
                            ha5Var.setTranslationX(((r59Var.getX() + n95Var5.getX()) - ha5Var.getLeft()) - c75Var.getLeft());
                            ha5Var.setTranslationY(((r59Var.getY() + (n95Var5.getY() + gm.L(2.0f))) - ha5Var.getTop()) - c75Var.getTop());
                            da5Var.setRoundCorners(gm.L(8.0f));
                            if (ha5Var.w) {
                                if (g95.v5) {
                                }
                            }
                        }
                    }
                }
                i5++;
                arrayList2 = arrayList;
                z = true;
            }
            arrayList = arrayList2;
            i5++;
            arrayList2 = arrayList;
            z = true;
        }
        boolean z4 = g95.v5;
        View view3 = g95Var.z4;
        if (z4) {
            f2 = 1.0f;
            view3.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f2 = 1.0f;
            view3.setAlpha(1.0f - c75Var.c);
            view.setAlpha(1.0f - c75Var.c);
        }
        if (c75Var.M0) {
            p85Var.setAlpha(f2 - c75Var.c);
        } else {
            p85Var.setAlpha(f2);
        }
        super.dispatchDraw(canvas);
        if (g95Var.v4) {
            return;
        }
        boolean z5 = g95Var.Y3;
        wb5 wb5Var4 = g95Var.M4;
        RectF rectF = this.n0;
        if (!z5) {
            if (wb5Var4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), g95Var.L4);
                float y4 = p85Var.getY();
                p85Var.getY();
                p85Var.getMeasuredHeight();
                if (!g95Var.Q4) {
                    if (g95Var.P4 == null) {
                        ha5 ha5Var2 = g95Var.O4;
                        if (ha5Var2 == null || !ha5Var2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(c75Var.getX() + g95Var.O4.getX(), c75Var.getY() + g95Var.O4.getY());
                        g95Var.O4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(c75Var.getX() + y65Var.getX() + g95Var.P4.getX(), c75Var.getY() + y65Var.getY() + g95Var.P4.getY());
                    if (g95Var.P4.getRenderer() == null || !g95Var.P4.getRenderer().w || g95Var.P4.getRenderer().b) {
                        g95Var.P4.draw(canvas);
                    } else {
                        g95Var.P4.getRenderer().draw(canvas);
                    }
                    g95Var.P4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = p85Var.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt3 = p85Var.getChildAt(i6);
                    if (childAt3 == g95Var.M4) {
                        float max = Math.max(p85Var.getLeft(), childAt3.getX() + p85Var.getLeft());
                        float max2 = Math.max(y4, childAt3.getY() + p85Var.getY());
                        float min = Math.min(p85Var.getRight(), childAt3.getX() + p85Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(p85Var.getY() + p85Var.getMeasuredHeight(), childAt3.getY() + p85Var.getY() + g95Var.M4.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + p85Var.getLeft(), childAt3.getY() + p85Var.getY());
                            float alpha = g95Var.L4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((g95Var.M4.getClipHeight() - g95Var.M4.getMeasuredHeight()) * (1.0f - d53.g.getInterpolation(1.0f - alpha))) + g95Var.M4.getMeasuredHeight()));
                            wb5 wb5Var5 = g95Var.M4;
                            paint.getColor();
                            lka[] lkaVarArr = wb5Var5.d;
                            if (TextUtils.isEmpty(lkaVarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            lkaVarArr[4].setFullAlpha(alpha);
                            lkaVarArr[4].h(0, 0);
                            wb5Var5.invalidate();
                            canvas2.drawRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), paint);
                            childAt3.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (wb5Var4 != null) {
            if (g95Var.Z3) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), g95Var.L4);
            }
            float y5 = p85Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = p85Var.getChildCount();
            float y6 = p85Var.getY() + p85Var.getMeasuredHeight();
            if (g95Var.Q4) {
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount2) {
                        wb5Var = null;
                        break;
                    }
                    View childAt4 = p85Var.getChildAt(i7);
                    wb5Var = g95Var.M4;
                    if (childAt4 == wb5Var) {
                        break;
                    } else {
                        i7++;
                    }
                }
            } else {
                wb5Var = g95Var.M4;
            }
            if (wb5Var != null && y5 < y6) {
                canvas3.save();
                if (g95Var.P4 == null) {
                    f3 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - g95Var.W3) * y5, getMeasuredWidth(), (getMeasuredHeight() * g95Var.W3) + ((1.0f - g95Var.W3) * y6));
                } else {
                    f3 = 255.0f;
                }
                if (g95Var.Q4) {
                    measuredWidth = ((g75Var.getMeasuredWidth() + g75Var.getTop()) * g95Var.W3) + ((1.0f - g95Var.W3) * (wb5Var.getY() + p85Var.getY()));
                    left = (g75Var.getLeft() * g95Var.W3) + ((1.0f - g95Var.W3) * (wb5Var.getX() + p85Var.getLeft()));
                } else {
                    measuredWidth = g75Var.getMeasuredWidth() + g75Var.getTop();
                    left = g75Var.getLeft();
                }
                float f12 = measuredWidth;
                canvas3.translate(left, f12);
                if (g95Var.Q4) {
                    fArr = fArr2;
                    path = path2;
                    wb5Var2 = wb5Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    wb5Var2 = wb5Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, wb5Var.getMeasuredWidth(), wb5Var.getClipHeight(), (int) (g95Var.W3 * f3), 31);
                }
                float clipHeight = (int) (((wb5Var2.getClipHeight() - wb5Var2.getMeasuredHeight()) * (1.0f - d53.g.getInterpolation(1.0f - g95Var.W3))) + wb5Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, wb5Var2.getMeasuredWidth(), clipHeight);
                wb5 wb5Var6 = wb5Var2;
                wb5Var6.setProgressToAvatarPreview(g95Var.Q4 ? g95Var.W3 : 1.0f);
                for (int i8 = 0; i8 < 4; i8++) {
                    fArr[i8] = (1.0f - g95Var.W3) * gm.L(13.0f);
                    fArr[i8 + 4] = gm.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                wb5Var6.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (g95Var.X3 != null) {
                    float f13 = f12 + clipHeight;
                    float measuredWidth2 = (getMeasuredWidth() - g95Var.X3.getMeasuredWidth()) - gm.L(14.0f);
                    if (g95Var.W3 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth2, f13, g95Var.X3.getMeasuredWidth() + measuredWidth2, g95Var.X3.getMeasuredHeight() + f13, (int) (g95Var.W3 * f3), 31);
                    } else {
                        canvas3.save();
                    }
                    g95Var.X3.setTranslationX(measuredWidth2 - r4.getLeft());
                    g95Var.X3.setTranslationY(f13 - r4.getTop());
                    float f14 = (g95Var.W3 * 0.2f) + 0.8f;
                    canvas3.scale(f14, f14, (g95Var.X3.getMeasuredWidth() / 2.0f) + measuredWidth2, f13);
                    canvas3.translate(measuredWidth2, f13);
                    g95Var.X3.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (g95Var.V3.n) {
                return;
            }
            canvas3.save();
            if (g95Var.Q4 && g95Var.P4 == null) {
                canvas3.clipRect(0.0f, (1.0f - g95Var.W3) * y5, getMeasuredWidth(), (getMeasuredHeight() * g95Var.W3) + ((1.0f - g95Var.W3) * y6));
            }
            canvas3.scale(g75Var.getScaleX(), g75Var.getScaleY(), g75Var.getX(), g75Var.getY());
            canvas3.translate(g75Var.getX(), g75Var.getY());
            g75Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        g95 g95Var = this.t0;
        p65 p65Var = g95Var.o1;
        y65 y65Var = g95Var.e4;
        p85 p85Var = g95Var.J1;
        c75 c75Var = g95Var.T3;
        if (g95Var.k4) {
            if (view == p85Var) {
                int childCount = p85Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = p85Var.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == c75Var || view == p65Var) {
                return super.drawChild(canvas, view, j);
            }
        } else if (g95.v5 || c75Var.c != 1.0f || (view != g95Var.H1 && view != g95Var.Z1 && view != g95Var.G1 && view != g95Var.X2 && view != g95Var.u3)) {
            if (g95Var.v4 && view == c75Var) {
                canvas.save();
                canvas.translate(y65Var.getX() + c75Var.getX(), y65Var.getY() + c75Var.getY());
                y65Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != g95Var.s4 && view != g95Var.X3 && view != g95Var.M4 && (!g95Var.d4 || !g95Var.Z3 || (view != p85Var && view != p65Var && view != g95Var.V1 && view != g95Var.k3))) {
                return super.drawChild(canvas, view, j);
            }
        }
        return true;
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t0.S1.I();
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t0.S1.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int L = gm.L(74.0f);
        g95 g95Var = this.t0;
        ImageReceiver imageReceiver = g95Var.S1;
        Drawable drawable = g95Var.Y1;
        c75 c75Var = g95Var.T3;
        float f2 = g95Var.s2 - L;
        int L2 = gm.L(15.0f) + getMeasuredHeight();
        int i = g95Var.t0;
        int i2 = L2 + i;
        if (i + f2 < a.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - g95Var.t0) / ((L - g95Var.t0) - gm.L(14.0f)));
            int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - r2) * min);
            f2 -= currentActionBarHeight;
            i2 += currentActionBarHeight;
            f = 1.0f - min;
        } else {
            f = 1.0f;
        }
        float paddingTop = f2 + getPaddingTop();
        g95Var.O1();
        if (c75Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i2);
            drawable.draw(canvas);
            if (f != 1.0f) {
                cmb.s0.setColor(g95Var.O3);
                float f3 = g95Var.u0;
                float f4 = g95Var.t0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - g95Var.u0;
                float L3 = g95Var.t0 + paddingTop + gm.L(24.0f);
                RectF rectF = this.n0;
                rectF.set(f3, f4, measuredWidth, L3);
                canvas.drawRoundRect(rectF, gm.L(12.0f) * f, gm.L(12.0f) * f, cmb.s0);
            }
            cmb.s0.setColor(Color.argb((int) (g95Var.H1.getAlpha() * 255.0f), (int) (Color.red(g95Var.O3) * 0.8f), (int) (Color.green(g95Var.O3) * 0.8f), (int) (Color.blue(g95Var.O3) * 0.8f)));
            canvas.drawRect(g95Var.u0, 0.0f, getMeasuredWidth() - g95Var.u0, (int) (g95Var.h0 * 1.0f), cmb.s0);
            y75 y75Var = g95Var.t2;
            if (y75Var != null) {
                cmb.s0.setColor(y75Var.getBackgroundColor());
                canvas.drawRect(g95Var.u0, 0.0f, getMeasuredWidth() - g95Var.u0, (int) (g95Var.h0 * 1.0f), cmb.s0);
            }
        }
        if (c75Var.c != 0.0f) {
            cmb.s0.setColor(on2.p(cmb.w0(null, cmb.Wg, false), (int) (c75Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), cmb.s0);
        }
        imageReceiver.i0((getMeasuredWidth() / 2.0f) - gm.L(30.0f), (getMeasuredHeight() / 2.0f) - gm.L(30.0f), gm.L(60.0f), gm.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g95 g95Var = this.t0;
        g75 g75Var = g95Var.s4;
        if (g95Var.M4 != null && motionEvent.getAction() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float x2 = g95Var.X3.getX();
            float y2 = g95Var.X3.getY();
            float x3 = g95Var.X3.getX() + g95Var.X3.getMeasuredWidth();
            float y3 = g95Var.X3.getY() + g95Var.X3.getMeasuredHeight();
            RectF rectF = this.n0;
            rectF.set(x2, y2, x3, y3);
            boolean z = !rectF.contains(x, y);
            rectF.set(g75Var.getX(), g75Var.getY(), g75Var.getX() + g75Var.getMeasuredWidth(), g75Var.getY() + g75Var.getMeasuredWidth() + g95Var.M4.getMeasuredHeight());
            if (rectF.contains(x, y)) {
                z = false;
            }
            if (z) {
                g95Var.T0(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || g95Var.s2 == 0.0f || motionEvent.getY() >= g95Var.s2 - gm.L(37.0f) || g95Var.H1.getAlpha() != 0.0f || g95Var.Y3 || g95Var.t2 != null || g95Var.T3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        g95Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        g95 g95Var = this.t0;
        if (g95Var.M4 == null || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        g95Var.T0(true);
        return true;
    }

    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        float f;
        g95 g95Var = this.t0;
        View view = g95Var.A4;
        View view2 = g95Var.z4;
        p65 p65Var = g95Var.o1;
        c75 c75Var = g95Var.T3;
        p85 p85Var = g95Var.J1;
        if (g95.v5 && this.q0 != g95Var.y4 && this.r0) {
            f = p85Var.getX();
            z2 = true;
        } else {
            z2 = false;
            f = 0.0f;
        }
        this.q0 = g95Var.y4;
        c75Var.s = true;
        super.onLayout(z, i, i2, i3, i4);
        c75Var.s = false;
        g95Var.F1();
        this.r0 = true;
        if (!z2 || p85Var.getLeft() == f) {
            return;
        }
        float left = f - p85Var.getLeft();
        p85Var.setTranslationX(left);
        p65Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = p85Var.animate().translationX(0.0f).setDuration(350L);
        d53 d53Var = d53.f;
        duration.setInterpolator(d53Var).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(d53Var).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(d53Var).start();
        p65Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(d53Var).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f;
        int L;
        int i3;
        int e;
        g95 g95Var = this.t0;
        o75 o75Var = g95Var.z1;
        v65 v65Var = g95Var.G1;
        LinearLayout linearLayout = g95Var.u3;
        a85 a85Var = g95Var.H1;
        pb5 pb5Var = g95Var.g4;
        m95 m95Var = g95Var.h4;
        vd4 vd4Var = g95Var.R1;
        dkc dkcVar = g95Var.v1;
        lka lkaVar = g95Var.N1;
        View view = g95Var.Z1;
        View view2 = g95Var.A4;
        View view3 = g95Var.z4;
        ArrayList arrayList = g95Var.R3;
        lka lkaVar2 = g95Var.P1;
        m75 m75Var = g95Var.A1;
        ArrayList arrayList2 = g95Var.S3;
        r59 r59Var = g95Var.f4;
        c75 c75Var = g95Var.T3;
        p85 p85Var = g95Var.J1;
        y65 y65Var = g95Var.e4;
        int size = View.MeasureSpec.getSize(i2);
        this.m0 = true;
        boolean z2 = View.MeasureSpec.getSize(i) > size && !gm.O1();
        LaunchActivity launchActivity = g95Var.b2;
        if (launchActivity != null && gm.F1(launchActivity)) {
            z2 = g95.u5;
        }
        View.MeasureSpec.getSize(i);
        c75Var.getClass();
        boolean z3 = gm.O1() && View.MeasureSpec.getSize(i) > size && !g95Var.i1();
        if (g95.u5 != z2) {
            g95.u5 = z2;
            if (dkcVar.getMeasuredWidth() == 0) {
                int i4 = dkcVar.getLayoutParams().width;
            }
            g95Var.W = false;
            vd4Var.x1(g95.u5 ? 6 : 2);
            p85Var.b0();
            y65Var.b0();
            this.p0 = true;
            TextView textView = g95Var.L1;
            if (textView != null) {
                textView.setVisibility(!g95.u5 ? 0 : 8);
            }
        }
        if (g95.v5 != z3) {
            g95.v5 = z3;
            r59Var.setVisibility(z3 ? 0 : 8);
            p85Var.b0();
            y65Var.b0();
            z = true;
            this.p0 = true;
        } else {
            z = true;
        }
        if (this.p0) {
            g95Var.D0(z);
            g95Var.I1.f();
            m95Var.G(r59Var, false);
            if (g95.v5) {
                pb5Var.I(r59Var, false);
            }
            r59Var.setVisibility(g95.v5 ? 0 : 8);
            pb5Var.H(r59Var, g95.v5 && !c75Var.b, true);
            boolean z4 = g95.v5;
            g95Var.F4 = !z4 || c75Var.b;
            boolean z5 = !z4 && c75Var.b;
            m95Var.F(y65Var, z5);
            y65Var.setVisibility(z5 ? 0 : 8);
            p85Var.setVisibility((g95.v5 || !c75Var.b) ? 0 : 8);
            vd4Var.x1(g95.u5 ? 6 : 2);
            g95Var.L1(false, false);
            p85Var.b0();
            y65Var.b0();
            gm.V3(p85Var);
            this.p0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            c75Var.setIsTablet(g95.v5);
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                ((ha5) arrayList2.get(i5)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (g95Var.i1() ? gm.L(72.0f) : gm.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c75Var.getLayoutParams();
        if (g95.v5) {
            layoutParams.topMargin = a.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g95Var.c2[i6].getLayoutParams();
            if (g95.v5) {
                layoutParams2.rightMargin = gm.L(328.0f);
            } else {
                layoutParams2.rightMargin = gm.L(8.0f);
            }
        }
        if (r59Var != null) {
            ((FrameLayout.LayoutParams) r59Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        }
        if (m75Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) m75Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = gm.L(g95Var.i1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) p85Var.getLayoutParams();
        if (g95.v5) {
            layoutParams3.gravity = g95Var.y4 ? 5 : 1;
            layoutParams3.width = gm.L(320.0f);
            int L3 = gm.L(4.0f);
            layoutParams3.leftMargin = L3;
            layoutParams3.rightMargin = L3;
            layoutParams3.bottomMargin = L2;
            layoutParams3.topMargin = a.getCurrentActionBarHeight();
            L = gm.L(60.0f);
            f = 90.0f;
        } else {
            f = 90.0f;
            if (g95.u5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = a.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = gm.L(14.0f);
                layoutParams3.rightMargin = gm.L(90.0f);
                layoutParams3.leftMargin = gm.L(14.0f);
                L = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L = gm.L(60.0f);
                layoutParams3.bottomMargin = L2;
                layoutParams3.topMargin = gm.L(14.0f) + a.getCurrentActionBarHeight();
                int L4 = gm.L(14.0f);
                layoutParams3.leftMargin = L4;
                layoutParams3.rightMargin = L4;
            }
        }
        if (!g95.u5 || g95.v5) {
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (g95.v5) {
                layoutParams4.gravity = g95Var.y4 ? 85 : 81;
                layoutParams4.width = gm.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (g95.v5) {
                layoutParams5.gravity = g95Var.y4 ? 85 : 81;
                layoutParams5.width = gm.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
        }
        if (g95.u5) {
            y65Var.setPadding(0, gm.L(9.0f), 0, gm.L(9.0f));
        } else {
            y65Var.setPadding(gm.L(9.0f), 0, gm.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) g95Var.o1.getLayoutParams();
        if (g95.v5) {
            layoutParams6.width = gm.L(320.0f);
            layoutParams6.height = gm.L(120.0f);
            layoutParams6.gravity = g95Var.y4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (g95.u5) {
            layoutParams6.width = gm.L(f);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = gm.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!g95.u5 || g95.v5) {
            ((FrameLayout.LayoutParams) a85Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) v65Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) a85Var.getLayoutParams()).rightMargin = gm.L(f);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = gm.L(f);
            ((FrameLayout.LayoutParams) v65Var.getLayoutParams()).rightMargin = gm.L(f);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = gm.L(f);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) y65Var.getLayoutParams();
        if (g95.u5) {
            if (!((u46) y65Var.getLayoutManager()).o) {
                ((u46) y65Var.getLayoutManager()).i1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = gm.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = gm.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((u46) y65Var.getLayoutManager()).o) {
                ((u46) y65Var.getLayoutManager()).i1(0);
            }
            layoutParams7.height = gm.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = gm.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        o75Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) o75Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (m75Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) m75Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(gm.L(259.0f), (paddingTop / 5) * 3);
        if (g95.v5) {
            e = 0;
            i3 = 0;
        } else {
            i3 = 0;
            e = kt6.e(8.0f, paddingTop - max, 0);
        }
        if (p85Var.getPaddingTop() != e || p85Var.getPaddingBottom() != L) {
            p85Var.setPadding(i3, e, i3, L);
        }
        if (lkaVar2 != null) {
            int L5 = ((gm.L(60.0f) + (paddingTop - e)) / 2) + e;
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) lkaVar.getLayoutParams();
            layoutParams9.topMargin = L5 - gm.L(30.0f);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) lkaVar2.getLayoutParams();
            layoutParams10.topMargin = gm.L(80.0f) + L5;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) g95Var.O1.getLayoutParams();
            if (layoutParams9.topMargin >= a.getCurrentActionBarHeight()) {
                if (gm.L(20.0f) + layoutParams10.topMargin <= size - gm.L(231.0f)) {
                    lkaVar.setVisibility(0);
                    lkaVar2.setVisibility(0);
                    layoutParams11.topMargin = L5;
                }
            }
            lkaVar.setVisibility(4);
            lkaVar2.setVisibility(4);
            layoutParams11.topMargin = L5 - gm.L(20.0f);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((ha5) arrayList.get(i7)).g(c75Var.b, true);
        }
        this.m0 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.o0) {
            this.o0 = measuredHeight;
            g95Var.T0(false);
        }
        g95Var.j4.f = getMeasuredWidth();
        g95Var.O0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.t0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        this.t0.O1();
    }
}
