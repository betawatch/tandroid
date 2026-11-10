package org.telegram.ui;

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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l30 extends org.telegram.ui.Components.st0 {
    public boolean f0;
    public final RectF g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public final HashMap l0;
    public final /* synthetic */ f40 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.m0 = f40Var;
        this.f0 = false;
        this.g0 = new RectF();
        this.l0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.f4 f4Var;
        float f12;
        float y10;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.f4 f4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.r rVar;
        boolean z9;
        float x11;
        float f13;
        float f14;
        float f15;
        int i7;
        boolean z10;
        Shader.TileMode tileMode;
        f40 f40Var = this.m0;
        d40 d40Var = f40Var.v3;
        View view = f40Var.E4;
        View view2 = f40Var.D4;
        ArrayList arrayList2 = f40Var.S3;
        nh.h hVar = f40Var.W1;
        Paint paint = f40Var.w2;
        y10 y10Var = f40Var.g4;
        f20 f20Var = f40Var.w4;
        c20 c20Var = f40Var.U3;
        n30 n30Var = f40Var.K1;
        if (f40Var.m4 || f40Var.z4) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
                if (f40Var.K4 == null) {
                    f40Var.K4 = new RenderNode("CallActivity.Blur");
                    f40Var.L4 = org.telegram.ui.Components.st0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.st0.getBlurRadius();
                    RenderNode renderNode = f40Var.K4;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = f40Var.K4;
                    float f16 = f40Var.L4;
                    hVar.U0 = renderNode2;
                    hVar.V0 = f16;
                }
                int round = Math.round(getMeasuredWidth() / f40Var.L4);
                int round2 = Math.round(getMeasuredHeight() / f40Var.L4);
                f40Var.m4 = true;
                f40Var.K4.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = f40Var.K4.beginRecording();
                float f17 = 1.0f / f40Var.L4;
                beginRecording.scale(f17, f17);
                dispatchDraw(beginRecording);
                f40Var.K4.endRecording();
                f40Var.m4 = false;
            }
        }
        for (int i10 = 0; i10 < n30Var.getChildCount(); i10++) {
            View childAt = n30Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                z10 = true;
                ((org.telegram.ui.Cells.f4) childAt).setDrawAvatar(true);
            } else {
                z10 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.r)) {
                if (childAt.getMeasuredWidth() != n30Var.getMeasuredWidth()) {
                    childAt.setTranslationX((n30Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (c20Var.r == null) {
            for (int i11 = 0; i11 < y10Var.getChildCount(); i11++) {
                ((org.telegram.ui.Components.g10) y10Var.getChildAt(i11)).setProgressToFullscreen(1.0f);
            }
        } else if (y10Var.getVisibility() == 0) {
            HashMap hashMap = this.l0;
            hashMap.clear();
            int i12 = 0;
            while (i12 < n30Var.getChildCount()) {
                View childAt2 = n30Var.getChildAt(i12);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.r) {
                        n30Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) childAt2;
                            i7 = i12;
                            if (rVar2.getRenderer() != c20Var.D) {
                                hashMap.put(rVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i7 = i12;
                    if (childAt2 instanceof org.telegram.ui.Cells.f4) {
                        n30Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.f4 f4Var3 = (org.telegram.ui.Cells.f4) childAt2;
                            hashMap.put(f4Var3.getParticipant(), f4Var3);
                        }
                    }
                } else {
                    i7 = i12;
                }
                i12 = i7 + 1;
            }
            int i13 = 0;
            while (i13 < y10Var.getChildCount()) {
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) y10Var.getChildAt(i13);
                View view3 = (View) hashMap.get(g10Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(g10Var.getParticipant());
                }
                float f18 = c20Var.c;
                HashMap hashMap2 = hashMap;
                if (!f40Var.H4.k()) {
                    g10Var.setAlpha(f10);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.r) {
                        org.telegram.ui.Components.voip.r rVar3 = (org.telegram.ui.Components.voip.r) view3;
                        x11 = (n30Var.getX() + rVar3.getLeft()) - c20Var.getLeft();
                        f13 = (n30Var.getY() + rVar3.getTop()) - c20Var.getTop();
                        f14 = y10Var.getX() + g10Var.getLeft();
                        f15 = y10Var.getY() + g10Var.getTop();
                    } else {
                        x11 = ((n30Var.getX() + r14.getLeft()) - c20Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y11 = ((n30Var.getY() + r14.getTop()) - c20Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = y10Var.getX() + g10Var.getLeft() + (g10Var.getMeasuredWidth() >> 1);
                        float y12 = y10Var.getY() + g10Var.getTop() + (g10Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.f4) view3).setDrawAvatar(false);
                        f13 = y11;
                        f14 = x12;
                        f15 = y12;
                    }
                    float f19 = 1.0f - f18;
                    g10Var.setTranslationX((x11 - f14) * f19);
                    g10Var.setTranslationY((f13 - f15) * f19);
                    g10Var.setScaleX(1.0f);
                    g10Var.setScaleY(1.0f);
                    g10Var.setProgressToFullscreen(f18);
                } else {
                    g10Var.setScaleX(1.0f);
                    g10Var.setScaleY(1.0f);
                    g10Var.setTranslationX(0.0f);
                    g10Var.setTranslationY(0.0f);
                    g10Var.setProgressToFullscreen(1.0f);
                    if (g10Var.getRenderer() == null) {
                        g10Var.setAlpha(f18);
                    }
                }
                i13++;
                hashMap = hashMap2;
                f10 = 1.0f;
            }
        }
        int i14 = 0;
        while (i14 < arrayList2.size()) {
            org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList2.get(i14);
            org.telegram.ui.Components.pj0 pj0Var = f40Var.h4;
            org.telegram.ui.Components.voip.u uVar = yVar.a;
            if (yVar.h || yVar.f || yVar.P) {
                arrayList = arrayList2;
            } else {
                yVar.y0 = false;
                float f20 = c20Var.c;
                arrayList = arrayList2;
                if (yVar.r || yVar.b) {
                    org.telegram.ui.Components.voip.r rVar4 = yVar.c;
                    org.telegram.ui.Components.voip.r rVar5 = rVar4;
                    if (rVar4 == null && yVar.e == null) {
                        yVar.setTranslationX(0.0f);
                        yVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.r rVar6 = yVar.e;
                        if (rVar6 != null) {
                            rVar5 = rVar6;
                        }
                        if (rVar6 == null) {
                            pj0Var = n30Var;
                        }
                        float x13 = ((pj0Var.getX() + rVar5.getX()) - yVar.getLeft()) - c20Var.getLeft();
                        float y13 = ((pj0Var.getY() + (rVar5.getY() + org.telegram.messenger.g0.L(2.0f))) - yVar.getTop()) - c20Var.getTop();
                        float f21 = 1.0f - f20;
                        float f22 = f20 * 0.0f;
                        yVar.setTranslationX((x13 * f21) + f22);
                        yVar.setTranslationY((y13 * f21) + f22);
                    }
                    uVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                    org.telegram.ui.Components.g10 g10Var2 = yVar.d;
                    if (g10Var2 != null) {
                        g10Var2.setAlpha(f20);
                    }
                    if (!yVar.b && yVar.c == null && yVar.e == null) {
                        yVar.setAlpha(f20);
                    } else if (!yVar.E) {
                        yVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.g10 g10Var3 = yVar.d;
                    if (g10Var3 != null) {
                        y10Var.getClass();
                        if (RecyclerView.R(g10Var3) == -1) {
                            yVar.setAlpha(yVar.d.getAlpha());
                        } else if (yVar.c == null) {
                            if (yVar.w && !yVar.E) {
                                yVar.setAlpha(f20);
                            }
                            yVar.d.setAlpha(f20);
                            f20 = 1.0f;
                        } else {
                            yVar.d.setAlpha(1.0f);
                            if (yVar.w && !yVar.E) {
                                yVar.setAlpha(1.0f);
                            }
                        }
                        yVar.setTranslationX((y10Var.getX() + yVar.d.getX()) - yVar.getLeft());
                        float f23 = 1.0f - f20;
                        yVar.setTranslationY((y10Var.getY() + (yVar.d.getY() + (org.telegram.messenger.g0.L(2.0f) * f23))) - yVar.getTop());
                        uVar.setRoundCorners((org.telegram.messenger.g0.L(8.0f) * f23) + (org.telegram.messenger.g0.L(13.0f) * f20));
                    } else {
                        org.telegram.ui.Components.voip.r rVar7 = yVar.c;
                        org.telegram.ui.Components.voip.r rVar8 = rVar7;
                        if (rVar7 != null || yVar.e != null) {
                            org.telegram.ui.Components.voip.r rVar9 = yVar.e;
                            if (rVar9 == null || rVar8 == null) {
                                org.telegram.ui.Components.voip.r rVar10 = rVar9 != null ? rVar9 : rVar8;
                                if (rVar9 == null) {
                                    pj0Var = n30Var;
                                }
                                rVar8 = rVar10;
                            } else {
                                if (f40.A5) {
                                    rVar = rVar9;
                                    if (!yVar.y.b) {
                                        z9 = true;
                                        if (z9) {
                                            rVar8 = rVar;
                                        }
                                        if (!z9) {
                                            pj0Var = n30Var;
                                        }
                                    }
                                } else {
                                    rVar = rVar9;
                                }
                                z9 = false;
                                if (z9) {
                                }
                                if (!z9) {
                                }
                            }
                            yVar.setTranslationX(((pj0Var.getX() + rVar8.getX()) - yVar.getLeft()) - c20Var.getLeft());
                            yVar.setTranslationY(((pj0Var.getY() + (rVar8.getY() + org.telegram.messenger.g0.L(2.0f))) - yVar.getTop()) - c20Var.getTop());
                            uVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                            if (yVar.w && !yVar.E) {
                                if (!f40.A5) {
                                    yVar.y0 = true;
                                    yVar.setAlpha(rVar8.getAlpha() * (1.0f - f20));
                                } else if (yVar.c != null && yVar.e == null) {
                                    yVar.setAlpha(rVar8.getAlpha() * f20);
                                }
                            }
                        }
                    }
                }
            }
            i14++;
            arrayList2 = arrayList;
        }
        if (f40.A5) {
            f11 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f11 = 1.0f;
            view2.setAlpha(1.0f - c20Var.c);
            view.setAlpha(1.0f - c20Var.c);
        }
        if (c20Var.L0) {
            n30Var.setAlpha(f11 - c20Var.c);
        } else {
            n30Var.setAlpha(f11);
        }
        if (d40Var != null) {
            d40Var.setAlpha(f11 - c20Var.c);
            d40Var.setTranslationY(c20Var.c * org.telegram.messenger.g0.L(64.0f));
        }
        super.dispatchDraw(canvas);
        if (f40Var.z4) {
            return;
        }
        boolean z11 = f40Var.Z3;
        RectF rectF = this.g0;
        if (!z11) {
            if (f40Var.R4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), f40Var.Q4);
                float y14 = n30Var.getY();
                n30Var.getY();
                n30Var.getMeasuredHeight();
                if (!f40Var.V4) {
                    if (f40Var.U4 == null) {
                        org.telegram.ui.Components.voip.y yVar2 = f40Var.T4;
                        if (yVar2 == null || !yVar2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(c20Var.getX() + f40Var.T4.getX(), c20Var.getY() + f40Var.T4.getY());
                        f40Var.T4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(c20Var.getX() + y10Var.getX() + f40Var.U4.getX(), c20Var.getY() + y10Var.getY() + f40Var.U4.getY());
                    if (f40Var.U4.getRenderer() == null || !f40Var.U4.getRenderer().w || f40Var.U4.getRenderer().b) {
                        f40Var.U4.draw(canvas);
                    } else {
                        f40Var.U4.getRenderer().draw(canvas);
                    }
                    f40Var.U4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = n30Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt3 = n30Var.getChildAt(i15);
                    if (childAt3 == f40Var.R4) {
                        float max = Math.max(n30Var.getLeft(), childAt3.getX() + n30Var.getLeft());
                        float max2 = Math.max(y14, childAt3.getY() + n30Var.getY());
                        float min = Math.min(n30Var.getRight(), childAt3.getX() + n30Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(n30Var.getY() + n30Var.getMeasuredHeight(), childAt3.getY() + n30Var.getY() + f40Var.R4.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + n30Var.getLeft(), childAt3.getY() + n30Var.getY());
                            float alpha = f40Var.Q4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((f40Var.R4.getClipHeight() - f40Var.R4.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.wq.g.getInterpolation(1.0f - alpha))) + f40Var.R4.getMeasuredHeight()));
                            org.telegram.ui.Cells.f4 f4Var4 = f40Var.R4;
                            paint.getColor();
                            org.telegram.ui.ActionBar.m5[] m5VarArr = f4Var4.d;
                            if (TextUtils.isEmpty(m5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            m5VarArr[4].setFullAlpha(alpha);
                            m5VarArr[4].h(0, 0);
                            f4Var4.invalidate();
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
                            childAt3.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (f40Var.R4 != null) {
            if (f40Var.a4) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), f40Var.Q4);
            }
            float y15 = n30Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = n30Var.getChildCount();
            float y16 = n30Var.getY() + n30Var.getMeasuredHeight();
            if (f40Var.V4) {
                int i16 = 0;
                while (true) {
                    if (i16 >= childCount2) {
                        f4Var = null;
                        break;
                    }
                    View childAt4 = n30Var.getChildAt(i16);
                    f4Var = f40Var.R4;
                    if (childAt4 == f4Var) {
                        break;
                    } else {
                        i16++;
                    }
                }
            } else {
                f4Var = f40Var.R4;
            }
            if (f4Var != null && y15 < y16) {
                canvas3.save();
                if (f40Var.U4 == null) {
                    f12 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - f40Var.X3) * y15, getMeasuredWidth(), (getMeasuredHeight() * f40Var.X3) + ((1.0f - f40Var.X3) * y16));
                } else {
                    f12 = 255.0f;
                }
                if (f40Var.V4) {
                    y10 = ((1.0f - f40Var.X3) * (f4Var.getY() + n30Var.getY())) + ((f20Var.getMeasuredWidth() + f20Var.getTop()) * f40Var.X3);
                    x10 = ((1.0f - f40Var.X3) * (f4Var.getX() + n30Var.getLeft())) + (f40Var.X3 * f20Var.getLeft());
                } else {
                    y10 = f20Var.getMeasuredWidth() + f20Var.getTop();
                    x10 = f20Var.getLeft();
                }
                float f24 = y10;
                canvas3.translate(x10, f24);
                if (f40Var.V4) {
                    fArr = fArr2;
                    path = path2;
                    f4Var2 = f4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    f4Var2 = f4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, f4Var.getMeasuredWidth(), f4Var.getClipHeight(), (int) (f40Var.X3 * f12), 31);
                }
                float clipHeight = (int) (((f4Var2.getClipHeight() - f4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.wq.g.getInterpolation(1.0f - f40Var.X3))) + f4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, f4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.f4 f4Var5 = f4Var2;
                f4Var5.setProgressToAvatarPreview(f40Var.V4 ? f40Var.X3 : 1.0f);
                for (int i17 = 0; i17 < 4; i17++) {
                    fArr[i17] = (1.0f - f40Var.X3) * org.telegram.messenger.g0.L(13.0f);
                    fArr[i17 + 4] = org.telegram.messenger.g0.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                f4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (f40Var.Y3 != null) {
                    float f25 = f24 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - f40Var.Y3.getMeasuredWidth()) - org.telegram.messenger.g0.L(14.0f);
                    if (f40Var.X3 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f25, f40Var.Y3.getMeasuredWidth() + measuredWidth, f40Var.Y3.getMeasuredHeight() + f25, (int) (f40Var.X3 * f12), 31);
                    } else {
                        canvas3.save();
                    }
                    f40Var.Y3.setTranslationX(measuredWidth - r4.getLeft());
                    f40Var.Y3.setTranslationY(f25 - r4.getTop());
                    float f26 = (f40Var.X3 * 0.2f) + 0.8f;
                    canvas3.scale(f26, f26, (f40Var.Y3.getMeasuredWidth() / 2.0f) + measuredWidth, f25);
                    canvas3.translate(measuredWidth, f25);
                    f40Var.Y3.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (f40Var.W3.n) {
                return;
            }
            canvas3.save();
            if (f40Var.V4 && f40Var.U4 == null) {
                canvas3.clipRect(0.0f, (1.0f - f40Var.X3) * y15, getMeasuredWidth(), (f40Var.X3 * getMeasuredHeight()) + ((1.0f - f40Var.X3) * y16));
            }
            canvas3.scale(f20Var.getScaleX(), f20Var.getScaleY(), f20Var.getX(), f20Var.getY());
            canvas3.translate(f20Var.getX(), f20Var.getY());
            f20Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        f40 f40Var = this.m0;
        p10 p10Var = f40Var.o1;
        y10 y10Var = f40Var.g4;
        n30 n30Var = f40Var.K1;
        c20 c20Var = f40Var.U3;
        if (f40Var.m4) {
            if (view == n30Var) {
                int childCount = n30Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = n30Var.getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == c20Var || view == p10Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (f40.A5 || c20Var.c != 1.0f || (view != f40Var.I1 && view != f40Var.a2 && view != f40Var.H1 && view != f40Var.Y2 && view != f40Var.t3 && view != f40Var.O2)) {
            if (f40Var.z4 && view == c20Var) {
                canvas.save();
                canvas.translate(y10Var.getX() + c20Var.getX(), y10Var.getY() + c20Var.getY());
                y10Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != f40Var.w4 && view != f40Var.Y3 && view != f40Var.R4 && (!f40Var.f4 || !f40Var.a4 || (view != n30Var && view != p10Var && view != f40Var.W1))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m0.T1.P();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0.T1.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        f40 f40Var = this.m0;
        ImageReceiver imageReceiver = f40Var.T1;
        Drawable drawable = f40Var.Z1;
        c20 c20Var = f40Var.U3;
        float f11 = f40Var.s2 - L;
        int L2 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = f40Var.s0;
        int i10 = L2 + i7;
        if (i7 + f11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f11) - f40Var.s0) / ((L - f40Var.s0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        f40Var.W1();
        if (c20Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.m6.t0.setColor(f40Var.P3);
                float f12 = f40Var.t0;
                float f13 = f40Var.s0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - f40Var.t0;
                float L3 = f40Var.s0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.g0;
                rectF.set(f12, f13, measuredWidth, L3);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.t0);
            }
            org.telegram.ui.ActionBar.m6.t0.setColor(Color.argb((int) (f40Var.I1.getAlpha() * 255.0f), (int) (Color.red(f40Var.P3) * 0.8f), (int) (Color.green(f40Var.P3) * 0.8f), (int) (Color.blue(f40Var.P3) * 0.8f)));
            canvas.drawRect(f40Var.t0, 0.0f, getMeasuredWidth() - f40Var.t0, (int) ((1.0f - f40Var.S0) * f40Var.g0), org.telegram.ui.ActionBar.m6.t0);
            w20 w20Var = f40Var.t2;
            if (w20Var != null) {
                org.telegram.ui.ActionBar.m6.t0.setColor(w20Var.getBackgroundColor());
                canvas.drawRect(f40Var.t0, 0.0f, getMeasuredWidth() - f40Var.t0, (int) ((1.0f - f40Var.S0) * f40Var.g0), org.telegram.ui.ActionBar.m6.t0);
            }
        }
        if (c20Var.c != 0.0f) {
            org.telegram.ui.ActionBar.m6.t0.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ug, false), (int) (c20Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.t0);
        }
        if (f40Var.u1() && org.telegram.messenger.sc.e(512)) {
            if (c20Var.c < 0.15d) {
                if (!f40Var.t4) {
                    f40Var.t4 = true;
                    f40Var.E1();
                }
            } else if (f40Var.t4) {
                f40Var.t4 = false;
                org.telegram.messenger.g0.r(f40Var.u4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f40 f40Var = this.m0;
        f20 f20Var = f40Var.w4;
        if (f40Var.R4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = f40Var.Y3.getX();
            float y11 = f40Var.Y3.getY();
            float x12 = f40Var.Y3.getX() + f40Var.Y3.getMeasuredWidth();
            float y12 = f40Var.Y3.getY() + f40Var.Y3.getMeasuredHeight();
            RectF rectF = this.g0;
            rectF.set(x11, y11, x12, y12);
            boolean z9 = !rectF.contains(x10, y10);
            rectF.set(f20Var.getX(), f20Var.getY(), f20Var.getX() + f20Var.getMeasuredWidth(), f20Var.getY() + f20Var.getMeasuredWidth() + f40Var.R4.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z9 = false;
            }
            if (z9) {
                f40Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || f40Var.s2 == 0.0f || motionEvent.getY() >= f40Var.s2 - org.telegram.messenger.g0.L(37.0f) || f40Var.I1.getAlpha() != 0.0f || f40Var.Z3 || f40Var.t2 != null || f40Var.U3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        f40Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        f40 f40Var = this.m0;
        if (f40Var.R4 == null || i7 != 4) {
            return super.onKeyDown(i7, keyEvent);
        }
        f40Var.f1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        float f10;
        int O0;
        f40 f40Var = this.m0;
        View view = f40Var.E4;
        View view2 = f40Var.D4;
        p10 p10Var = f40Var.o1;
        d40 d40Var = f40Var.v3;
        c20 c20Var = f40Var.U3;
        n30 n30Var = f40Var.K1;
        if (f40.A5 && this.j0 != f40Var.C4 && this.k0) {
            f10 = n30Var.getX();
            z10 = true;
        } else {
            z10 = false;
            f10 = 0.0f;
        }
        this.j0 = f40Var.C4;
        c20Var.s = true;
        super.onLayout(z9, i7, i10, i11, i12);
        c20Var.s = false;
        f40.P0(f40Var);
        this.k0 = true;
        if (d40Var != null && (O0 = f40.O0(f40Var, n30Var.getPaddingTop())) != Integer.MIN_VALUE && O0 != ((FrameLayout.LayoutParams) d40Var.getLayoutParams()).topMargin) {
            post(new kz(this, 6));
        }
        if (!z10 || n30Var.getLeft() == f10) {
            return;
        }
        float left = f10 - n30Var.getLeft();
        n30Var.setTranslationX(left);
        p10Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = n30Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
        duration.setInterpolator(wqVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(wqVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(wqVar).start();
        p10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(wqVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        float f10;
        int L;
        float f11;
        int i11;
        int b10;
        int i12;
        f40 f40Var = this.m0;
        m20 m20Var = f40Var.A1;
        v10 v10Var = f40Var.H1;
        LinearLayout linearLayout = f40Var.t3;
        c30 c30Var = f40Var.I1;
        i40 i40Var = f40Var.i4;
        org.telegram.ui.Components.h10 h10Var = f40Var.j4;
        org.telegram.ui.Components.ky kyVar = f40Var.S1;
        org.telegram.ui.Components.voip.n2 n2Var = f40Var.v1;
        org.telegram.ui.ActionBar.m5 m5Var = f40Var.O1;
        View view = f40Var.a2;
        View view2 = f40Var.E4;
        View view3 = f40Var.D4;
        ArrayList arrayList = f40Var.S3;
        org.telegram.ui.ActionBar.m5 m5Var2 = f40Var.Q1;
        k20 k20Var = f40Var.B1;
        ArrayList arrayList2 = f40Var.T3;
        org.telegram.ui.Components.pj0 pj0Var = f40Var.h4;
        n30 n30Var = f40Var.K1;
        c20 c20Var = f40Var.U3;
        y10 y10Var = f40Var.g4;
        int size = View.MeasureSpec.getSize(i10);
        this.f0 = true;
        boolean z10 = View.MeasureSpec.getSize(i7) > size && !org.telegram.messenger.g0.Q1();
        LaunchActivity launchActivity = f40Var.c2;
        if (launchActivity != null && org.telegram.messenger.g0.H1(launchActivity)) {
            z10 = f40.z5;
        }
        View.MeasureSpec.getSize(i7);
        c20Var.getClass();
        boolean z11 = org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i7) > size && !f40Var.u1();
        if (f40.z5 != z10) {
            f40.z5 = z10;
            if (n2Var.getMeasuredWidth() == 0) {
                int i13 = n2Var.getLayoutParams().width;
            }
            if (f40Var.u1()) {
                boolean z12 = (!c20Var.V && c20Var.b && (f40.z5 == f40Var.t1() || org.telegram.messenger.g0.Q1())) ? false : true;
                Boolean bool = f40Var.d4;
                if (bool == null || z12 != bool.booleanValue()) {
                    int systemUiVisibility = f40Var.b.getSystemUiVisibility();
                    boolean z13 = z12;
                    if (z13) {
                        i12 = systemUiVisibility & (-7);
                        f40Var.getWindow().clearFlags(1024);
                        f40Var.B0(false);
                    } else {
                        f40Var.B0(true);
                        i12 = systemUiVisibility | 6;
                        f40Var.getWindow().addFlags(1024);
                    }
                    f40Var.b.setSystemUiVisibility(i12);
                    f40Var.d4 = Boolean.valueOf(z13);
                    f40Var.M4 = !z13;
                    f40Var.b.requestApplyInsets();
                }
            } else {
                f40Var.V = false;
            }
            kyVar.y1(f40.z5 ? 6 : 2);
            n30Var.a0();
            y10Var.a0();
            this.i0 = true;
            TextView textView = f40Var.M1;
            if (textView != null) {
                textView.setVisibility(!f40.z5 ? 0 : 8);
            }
            if (f40Var.t1() == z10 && f40Var.u1() && !c20Var.b && !f40Var.U2.f.isEmpty()) {
                f40Var.h1((org.telegram.messenger.s3) f40Var.U2.f.get(0));
                c20Var.e();
            }
        }
        if (f40.A5 != z11) {
            f40.A5 = z11;
            pj0Var.setVisibility(z11 ? 0 : 8);
            n30Var.a0();
            y10Var.a0();
            z9 = true;
            this.i0 = true;
        } else {
            z9 = true;
        }
        if (this.i0) {
            f40Var.Q0(z9);
            f40Var.J1.f();
            h10Var.G(pj0Var, false);
            if (f40.A5) {
                i40Var.I(pj0Var, false);
            }
            pj0Var.setVisibility(f40.A5 ? 0 : 8);
            i40Var.H(pj0Var, f40.A5 && !c20Var.b, true);
            boolean z14 = f40.A5;
            f40Var.J4 = !z14 || c20Var.b;
            boolean z15 = !z14 && c20Var.b;
            h10Var.F(y10Var, z15);
            y10Var.setVisibility(z15 ? 0 : 8);
            n30Var.setVisibility((f40.A5 || !c20Var.b) ? 0 : 8);
            kyVar.y1(f40.z5 ? 6 : 2);
            f40Var.T1(false, false);
            n30Var.a0();
            y10Var.a0();
            org.telegram.messenger.g0.b4(n30Var);
            this.i0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            c20Var.setIsTablet(f40.A5);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (f40Var.u1() ? org.telegram.messenger.g0.L(72.0f) : org.telegram.messenger.g0.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c20Var.getLayoutParams();
        if (f40.A5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f40Var.d2[i15].getLayoutParams();
            if (f40.A5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (pj0Var != null) {
            ((FrameLayout.LayoutParams) pj0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (k20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) k20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = org.telegram.messenger.g0.L(f40Var.u1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) n30Var.getLayoutParams();
        if (f40.A5) {
            layoutParams3.gravity = f40Var.C4 ? 5 : 1;
            layoutParams3.width = org.telegram.messenger.g0.L(320.0f);
            int L3 = org.telegram.messenger.g0.L(4.0f);
            layoutParams3.leftMargin = L3;
            layoutParams3.rightMargin = L3;
            layoutParams3.bottomMargin = L2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            L = org.telegram.messenger.g0.L(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (f40.z5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = org.telegram.messenger.g0.L(14.0f);
                layoutParams3.rightMargin = org.telegram.messenger.g0.L(90.0f);
                layoutParams3.leftMargin = org.telegram.messenger.g0.L(14.0f);
                L = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L = org.telegram.messenger.g0.L(60.0f);
                layoutParams3.bottomMargin = L2;
                layoutParams3.topMargin = org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int L4 = org.telegram.messenger.g0.L(14.0f);
                layoutParams3.leftMargin = L4;
                layoutParams3.rightMargin = L4;
            }
        }
        if (!f40.z5 || f40.A5) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (f40.A5) {
                layoutParams4.gravity = f40Var.C4 ? 85 : 81;
                layoutParams4.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (f40.A5) {
                layoutParams5.gravity = f40Var.C4 ? 85 : 81;
                layoutParams5.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (f40.z5) {
            y10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            y10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) f40Var.o1.getLayoutParams();
        if (f40.A5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = f40Var.C4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (f40.z5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!f40.z5 || f40.A5) {
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) v10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) v10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) y10Var.getLayoutParams();
        if (f40.z5) {
            if (((v4.b0) y10Var.getLayoutManager()).o != 1) {
                ((v4.b0) y10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((v4.b0) y10Var.getLayoutManager()).o != 0) {
                ((v4.b0) y10Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.g0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        m20Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) m20Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (k20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) k20Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.g0.L(259.0f), (paddingTop / 5) * 3);
        if (f40.A5) {
            b10 = 0;
            i11 = 0;
        } else {
            i11 = 0;
            b10 = org.telegram.messenger.k5.b(8.0f, paddingTop - max, 0);
        }
        if (n30Var.getPaddingTop() != b10 || n30Var.getPaddingBottom() != L) {
            n30Var.setPadding(i11, b10, i11, L);
        }
        d40 d40Var = f40Var.v3;
        if (d40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) d40Var.getLayoutParams();
            int O0 = f40.O0(f40Var, b10);
            if (O0 != Integer.MIN_VALUE) {
                layoutParams9.topMargin = O0;
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        u30 u30Var = f40Var.O2;
        if (u30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) u30Var.getLayoutParams();
            org.telegram.ui.Components.voip.r g12 = f40Var.g1();
            if (g12 != null) {
                layoutParams10.height = g12.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = g12.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
                int L5 = org.telegram.messenger.g0.L(16.0f);
                layoutParams10.leftMargin = L5;
                layoutParams10.rightMargin = L5;
            }
        }
        if (m5Var2 != null) {
            int L6 = ((org.telegram.messenger.g0.L(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) m5Var.getLayoutParams();
            layoutParams11.topMargin = L6 - org.telegram.messenger.g0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) m5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.g0.L(80.0f) + L6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) f40Var.P1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.g0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.g0.L(231.0f)) {
                    m5Var.setVisibility(0);
                    m5Var2.setVisibility(0);
                    layoutParams13.topMargin = L6;
                }
            }
            m5Var.setVisibility(4);
            m5Var2.setVisibility(4);
            layoutParams13.topMargin = L6 - org.telegram.messenger.g0.L(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i16)).g(c20Var.b, true);
        }
        this.f0 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.h0) {
            this.h0 = measuredHeight;
            f40Var.f1(false);
        }
        f40Var.l4.f = getMeasuredWidth();
        f40Var.a1();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.m0.I && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.m0.W1();
    }
}
