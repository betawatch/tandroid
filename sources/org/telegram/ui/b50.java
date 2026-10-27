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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b50 extends org.telegram.ui.Components.ww0 {
    public boolean l0;
    public final RectF m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final HashMap r0;
    public final /* synthetic */ x50 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b50(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.s0 = x50Var;
        this.l0 = false;
        this.m0 = new RectF();
        this.r0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.i4 i4Var;
        float f11;
        float y3;
        float x9;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.i4 i4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z10;
        float x10;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z11;
        Shader.TileMode tileMode;
        x50 x50Var = this.s0;
        v50 v50Var = x50Var.B1;
        View view = x50Var.K2;
        View view2 = x50Var.J2;
        ArrayList arrayList2 = x50Var.Y1;
        nh.h hVar = x50Var.c0;
        Paint paint = x50Var.C0;
        k30 k30Var = x50Var.m2;
        r30 r30Var = x50Var.C2;
        o30 o30Var = x50Var.a2;
        d50 d50Var = x50Var.Q;
        if (x50Var.s2 || x50Var.F2) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (x50Var.Q2 == null) {
                    x50Var.Q2 = new RenderNode("CallActivity.Blur");
                    x50Var.R2 = org.telegram.ui.Components.ww0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.ww0.getBlurRadius();
                    RenderNode renderNode = x50Var.Q2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = x50Var.Q2;
                    float f15 = x50Var.R2;
                    hVar.U0 = renderNode2;
                    hVar.V0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / x50Var.R2);
                int round2 = Math.round(getMeasuredHeight() / x50Var.R2);
                x50Var.s2 = true;
                x50Var.Q2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = x50Var.Q2.beginRecording();
                float f16 = 1.0f / x50Var.R2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                x50Var.Q2.endRecording();
                x50Var.s2 = false;
            }
        }
        for (int i11 = 0; i11 < d50Var.getChildCount(); i11++) {
            View childAt = d50Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.i4) {
                z11 = true;
                ((org.telegram.ui.Cells.i4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != d50Var.getMeasuredWidth()) {
                    childAt.setTranslationX((d50Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (o30Var.r == null) {
            for (int i12 = 0; i12 < k30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.b30) k30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (k30Var.getVisibility() == 0) {
            HashMap hashMap = this.r0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < d50Var.getChildCount()) {
                View childAt2 = d50Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        d50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != o30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.i4) {
                        d50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.i4 i4Var3 = (org.telegram.ui.Cells.i4) childAt2;
                            hashMap.put(i4Var3.getParticipant(), i4Var3);
                        }
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
            int i14 = 0;
            while (i14 < k30Var.getChildCount()) {
                org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) k30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(b30Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(b30Var.getParticipant());
                }
                float f17 = o30Var.c;
                HashMap hashMap2 = hashMap;
                if (!x50Var.N2.k()) {
                    b30Var.setAlpha(f7);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x10 = (d50Var.getX() + lVar3.getLeft()) - o30Var.getLeft();
                        f12 = (d50Var.getY() + lVar3.getTop()) - o30Var.getTop();
                        f13 = k30Var.getX() + b30Var.getLeft();
                        f14 = k30Var.getY() + b30Var.getTop();
                    } else {
                        x10 = ((d50Var.getX() + r14.getLeft()) - o30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((d50Var.getY() + r14.getTop()) - o30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x11 = k30Var.getX() + b30Var.getLeft() + (b30Var.getMeasuredWidth() >> 1);
                        float y11 = k30Var.getY() + b30Var.getTop() + (b30Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.i4) view3).setDrawAvatar(false);
                        f12 = y10;
                        f13 = x11;
                        f14 = y11;
                    }
                    float f18 = 1.0f - f17;
                    b30Var.setTranslationX((x10 - f13) * f18);
                    b30Var.setTranslationY((f12 - f14) * f18);
                    b30Var.setScaleX(1.0f);
                    b30Var.setScaleY(1.0f);
                    b30Var.setProgressToFullscreen(f17);
                } else {
                    b30Var.setScaleX(1.0f);
                    b30Var.setScaleY(1.0f);
                    b30Var.setTranslationX(0.0f);
                    b30Var.setTranslationY(0.0f);
                    b30Var.setProgressToFullscreen(1.0f);
                    if (b30Var.getRenderer() == null) {
                        b30Var.setAlpha(f17);
                    }
                }
                i14++;
                hashMap = hashMap2;
                f7 = 1.0f;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList2.get(i15);
            org.telegram.ui.Components.nm0 nm0Var = x50Var.n2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.P) {
                arrayList = arrayList2;
            } else {
                tVar.y0 = false;
                float f19 = o30Var.c;
                arrayList = arrayList2;
                if (tVar.r || tVar.b) {
                    org.telegram.ui.Components.voip.l lVar4 = tVar.c;
                    org.telegram.ui.Components.voip.l lVar5 = lVar4;
                    if (lVar4 == null && tVar.e == null) {
                        tVar.setTranslationX(0.0f);
                        tVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.l lVar6 = tVar.e;
                        if (lVar6 != null) {
                            lVar5 = lVar6;
                        }
                        if (lVar6 == null) {
                            nm0Var = d50Var;
                        }
                        float x12 = ((nm0Var.getX() + lVar5.getX()) - tVar.getLeft()) - o30Var.getLeft();
                        float y12 = ((nm0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - o30Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        tVar.setTranslationX((x12 * f20) + f21);
                        tVar.setTranslationY((y12 * f20) + f21);
                    }
                    oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.b30 b30Var2 = tVar.d;
                    if (b30Var2 != null) {
                        b30Var2.setAlpha(f19);
                    }
                    if (!tVar.b && tVar.c == null && tVar.e == null) {
                        tVar.setAlpha(f19);
                    } else if (!tVar.E) {
                        tVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.b30 b30Var3 = tVar.d;
                    if (b30Var3 != null) {
                        k30Var.getClass();
                        if (RecyclerView.R(b30Var3) == -1) {
                            tVar.setAlpha(tVar.d.getAlpha());
                        } else if (tVar.c == null) {
                            if (tVar.v && !tVar.E) {
                                tVar.setAlpha(f19);
                            }
                            tVar.d.setAlpha(f19);
                            f19 = 1.0f;
                        } else {
                            tVar.d.setAlpha(1.0f);
                            if (tVar.v && !tVar.E) {
                                tVar.setAlpha(1.0f);
                            }
                        }
                        tVar.setTranslationX((k30Var.getX() + tVar.d.getX()) - tVar.getLeft());
                        float f22 = 1.0f - f19;
                        tVar.setTranslationY((k30Var.getY() + (tVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - tVar.getTop());
                        oVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = tVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || tVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = tVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    nm0Var = d50Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (x50.G3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            nm0Var = d50Var;
                                        }
                                    }
                                } else {
                                    lVar = lVar9;
                                }
                                z10 = false;
                                if (z10) {
                                }
                                if (!z10) {
                                }
                            }
                            tVar.setTranslationX(((nm0Var.getX() + lVar8.getX()) - tVar.getLeft()) - o30Var.getLeft());
                            tVar.setTranslationY(((nm0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - o30Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.E) {
                                if (!x50.G3) {
                                    tVar.y0 = true;
                                    tVar.setAlpha(lVar8.getAlpha() * (1.0f - f19));
                                } else if (tVar.c != null && tVar.e == null) {
                                    tVar.setAlpha(lVar8.getAlpha() * f19);
                                }
                            }
                        }
                    }
                }
            }
            i15++;
            arrayList2 = arrayList;
        }
        if (x50.G3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - o30Var.c);
            view.setAlpha(1.0f - o30Var.c);
        }
        if (o30Var.L0) {
            d50Var.setAlpha(f10 - o30Var.c);
        } else {
            d50Var.setAlpha(f10);
        }
        if (v50Var != null) {
            v50Var.setAlpha(f10 - o30Var.c);
            v50Var.setTranslationY(o30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (x50Var.F2) {
            return;
        }
        boolean z12 = x50Var.f2;
        RectF rectF = this.m0;
        if (!z12) {
            if (x50Var.X2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), x50Var.W2);
                float y13 = d50Var.getY();
                d50Var.getY();
                d50Var.getMeasuredHeight();
                if (!x50Var.b3) {
                    if (x50Var.a3 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = x50Var.Z2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(o30Var.getX() + x50Var.Z2.getX(), o30Var.getY() + x50Var.Z2.getY());
                        x50Var.Z2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(o30Var.getX() + k30Var.getX() + x50Var.a3.getX(), o30Var.getY() + k30Var.getY() + x50Var.a3.getY());
                    if (x50Var.a3.getRenderer() == null || !x50Var.a3.getRenderer().v || x50Var.a3.getRenderer().b) {
                        x50Var.a3.draw(canvas);
                    } else {
                        x50Var.a3.getRenderer().draw(canvas);
                    }
                    x50Var.a3.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = d50Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = d50Var.getChildAt(i16);
                    if (childAt3 == x50Var.X2) {
                        float max = Math.max(d50Var.getLeft(), childAt3.getX() + d50Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + d50Var.getY());
                        float min = Math.min(d50Var.getRight(), childAt3.getX() + d50Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(d50Var.getY() + d50Var.getMeasuredHeight(), childAt3.getY() + d50Var.getY() + x50Var.X2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + d50Var.getLeft(), childAt3.getY() + d50Var.getY());
                            float alpha = x50Var.W2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((x50Var.X2.getClipHeight() - x50Var.X2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.ds.g.getInterpolation(1.0f - alpha))) + x50Var.X2.getMeasuredHeight()));
                            org.telegram.ui.Cells.i4 i4Var4 = x50Var.X2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.b6[] b6VarArr = i4Var4.d;
                            if (TextUtils.isEmpty(b6VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            b6VarArr[4].setFullAlpha(alpha);
                            b6VarArr[4].h(0, 0);
                            i4Var4.invalidate();
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                            childAt3.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (x50Var.X2 != null) {
            if (x50Var.g2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), x50Var.W2);
            }
            float y14 = d50Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = d50Var.getChildCount();
            float y15 = d50Var.getY() + d50Var.getMeasuredHeight();
            if (x50Var.b3) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        i4Var = null;
                        break;
                    }
                    View childAt4 = d50Var.getChildAt(i17);
                    i4Var = x50Var.X2;
                    if (childAt4 == i4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                i4Var = x50Var.X2;
            }
            if (i4Var != null && y14 < y15) {
                canvas3.save();
                if (x50Var.a3 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - x50Var.d2) * y14, getMeasuredWidth(), (getMeasuredHeight() * x50Var.d2) + ((1.0f - x50Var.d2) * y15));
                } else {
                    f11 = 255.0f;
                }
                if (x50Var.b3) {
                    y3 = ((1.0f - x50Var.d2) * (i4Var.getY() + d50Var.getY())) + ((r30Var.getMeasuredWidth() + r30Var.getTop()) * x50Var.d2);
                    x9 = ((1.0f - x50Var.d2) * (i4Var.getX() + d50Var.getLeft())) + (x50Var.d2 * r30Var.getLeft());
                } else {
                    y3 = r30Var.getMeasuredWidth() + r30Var.getTop();
                    x9 = r30Var.getLeft();
                }
                float f23 = y3;
                canvas3.translate(x9, f23);
                if (x50Var.b3) {
                    fArr = fArr2;
                    path = path2;
                    i4Var2 = i4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    i4Var2 = i4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, i4Var.getMeasuredWidth(), i4Var.getClipHeight(), (int) (x50Var.d2 * f11), 31);
                }
                float clipHeight = (int) (((i4Var2.getClipHeight() - i4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.ds.g.getInterpolation(1.0f - x50Var.d2))) + i4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, i4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.i4 i4Var5 = i4Var2;
                i4Var5.setProgressToAvatarPreview(x50Var.b3 ? x50Var.d2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - x50Var.d2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                i4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (x50Var.e2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - x50Var.e2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (x50Var.d2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, x50Var.e2.getMeasuredWidth() + measuredWidth, x50Var.e2.getMeasuredHeight() + f24, (int) (x50Var.d2 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    x50Var.e2.setTranslationX(measuredWidth - r4.getLeft());
                    x50Var.e2.setTranslationY(f24 - r4.getTop());
                    float f25 = (x50Var.d2 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (x50Var.e2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    x50Var.e2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (x50Var.c2.n) {
                return;
            }
            canvas3.save();
            if (x50Var.b3 && x50Var.a3 == null) {
                canvas3.clipRect(0.0f, (1.0f - x50Var.d2) * y14, getMeasuredWidth(), (x50Var.d2 * getMeasuredHeight()) + ((1.0f - x50Var.d2) * y15));
            }
            canvas3.scale(r30Var.getScaleX(), r30Var.getScaleY(), r30Var.getX(), r30Var.getY());
            canvas3.translate(r30Var.getX(), r30Var.getY());
            r30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x50 x50Var = this.s0;
        b30 b30Var = x50Var.e;
        k30 k30Var = x50Var.m2;
        d50 d50Var = x50Var.Q;
        o30 o30Var = x50Var.a2;
        if (x50Var.s2) {
            if (view == d50Var) {
                int childCount = d50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = d50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == o30Var || view == b30Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (x50.G3 || o30Var.c != 1.0f || (view != x50Var.O && view != x50Var.g0 && view != x50Var.N && view != x50Var.e1 && view != x50Var.z1 && view != x50Var.U0)) {
            if (x50Var.F2 && view == o30Var) {
                canvas.save();
                canvas.translate(k30Var.getX() + o30Var.getX(), k30Var.getY() + o30Var.getY());
                k30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != x50Var.C2 && view != x50Var.e2 && view != x50Var.X2 && (!x50Var.l2 || !x50Var.g2 || (view != d50Var && view != b30Var && view != x50Var.c0))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s0.Z.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s0.Z.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int dp = AndroidUtilities.dp(74.0f);
        x50 x50Var = this.s0;
        ImageReceiver imageReceiver = x50Var.Z;
        Drawable drawable = x50Var.f0;
        o30 o30Var = x50Var.a2;
        float f10 = x50Var.y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        x50Var.R1();
        if (o30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.y6.t0.setColor(x50Var.V1);
                i16 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.m0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.y6.t0);
            }
            org.telegram.ui.ActionBar.y6.t0.setColor(Color.argb((int) (x50Var.O.getAlpha() * 255.0f), (int) (Color.red(x50Var.V1) * 0.8f), (int) (Color.green(x50Var.V1) * 0.8f), (int) (Color.blue(x50Var.V1) * 0.8f)));
            float statusBarHeight = x50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.y6.t0);
            i40 i40Var = x50Var.z0;
            if (i40Var != null) {
                org.telegram.ui.ActionBar.y6.t0.setColor(i40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.k3) x50Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, x50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.y6.t0);
            }
        }
        if (o30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.y6.t0.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false), (int) (o30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.t0);
        }
        if (x50Var.r1() && LiteMode.isEnabled(512)) {
            if (o30Var.c < 0.15d) {
                if (!x50Var.z2) {
                    x50Var.z2 = true;
                    x50Var.z1();
                }
            } else if (x50Var.z2) {
                x50Var.z2 = false;
                AndroidUtilities.cancelRunOnUIThread(x50Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x50 x50Var = this.s0;
        r30 r30Var = x50Var.C2;
        if (x50Var.X2 != null && motionEvent.getAction() == 0) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x10 = x50Var.e2.getX();
            float y10 = x50Var.e2.getY();
            float x11 = x50Var.e2.getX() + x50Var.e2.getMeasuredWidth();
            float y11 = x50Var.e2.getY() + x50Var.e2.getMeasuredHeight();
            RectF rectF = this.m0;
            rectF.set(x10, y10, x11, y11);
            boolean z10 = !rectF.contains(x9, y3);
            rectF.set(r30Var.getX(), r30Var.getY(), r30Var.getX() + r30Var.getMeasuredWidth(), r30Var.getY() + r30Var.getMeasuredWidth() + x50Var.X2.getMeasuredHeight());
            if (rectF.contains(x9, y3)) {
                z10 = false;
            }
            if (z10) {
                x50Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || x50Var.y0 == 0.0f || motionEvent.getY() >= x50Var.y0 - AndroidUtilities.dp(37.0f) || x50Var.O.getAlpha() != 0.0f || x50Var.f2 || x50Var.z0 != null || x50Var.a2.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        x50Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        x50 x50Var = this.s0;
        if (x50Var.X2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        x50Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        x50 x50Var = this.s0;
        View view = x50Var.K2;
        View view2 = x50Var.J2;
        b30 b30Var = x50Var.e;
        o30 o30Var = x50Var.a2;
        d50 d50Var = x50Var.Q;
        if (x50.G3 && this.p0 != x50Var.I2 && this.q0) {
            f7 = d50Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.p0 = x50Var.I2;
        o30Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        o30Var.s = false;
        x50.J0(x50Var);
        this.q0 = true;
        if (!z11 || d50Var.getLeft() == f7) {
            return;
        }
        float left = f7 - d50Var.getLeft();
        d50Var.setTranslationX(left);
        b30Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = d50Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
        duration.setInterpolator(dsVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(dsVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(dsVar).start();
        b30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(dsVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        float f10;
        int i12;
        int z11;
        x50 x50Var = this.s0;
        y30 y30Var = x50Var.G;
        h30 h30Var = x50Var.N;
        LinearLayout linearLayout = x50Var.z1;
        t40 t40Var = x50Var.O;
        d60 d60Var = x50Var.o2;
        org.telegram.ui.Components.c30 c30Var = x50Var.p2;
        org.telegram.ui.Components.xz xzVar = x50Var.Y;
        org.telegram.ui.Components.voip.w2 w2Var = x50Var.w;
        org.telegram.ui.ActionBar.b6 b6Var = x50Var.U;
        View view = x50Var.g0;
        b30 b30Var = x50Var.e;
        View view2 = x50Var.K2;
        View view3 = x50Var.J2;
        ArrayList arrayList = x50Var.Y1;
        org.telegram.ui.ActionBar.b6 b6Var2 = x50Var.W;
        w30 w30Var = x50Var.H;
        ArrayList arrayList2 = x50Var.Z1;
        org.telegram.ui.Components.nm0 nm0Var = x50Var.n2;
        d50 d50Var = x50Var.Q;
        o30 o30Var = x50Var.a2;
        k30 k30Var = x50Var.m2;
        int size = View.MeasureSpec.getSize(i11);
        this.l0 = true;
        boolean z12 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        o30Var.getClass();
        boolean z13 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !x50Var.r1();
        if (x50.F3 != z12) {
            x50.F3 = z12;
            if (w2Var.getMeasuredWidth() == 0) {
                int i13 = w2Var.getLayoutParams().width;
            }
            x50.H0(x50Var);
            xzVar.z1(x50.F3 ? 6 : 2);
            d50Var.a0();
            k30Var.a0();
            this.o0 = true;
            TextView textView = x50Var.S;
            if (textView != null) {
                textView.setVisibility(!x50.F3 ? 0 : 8);
            }
            if (x50Var.q1() == z12 && x50Var.r1() && !o30Var.b && !x50Var.a1.visibleVideoParticipants.isEmpty()) {
                x50Var.e1(x50Var.a1.visibleVideoParticipants.get(0));
                o30Var.e();
            }
        }
        if (x50.G3 != z13) {
            x50.G3 = z13;
            nm0Var.setVisibility(z13 ? 0 : 8);
            d50Var.a0();
            k30Var.a0();
            z10 = true;
            this.o0 = true;
        } else {
            z10 = true;
        }
        if (this.o0) {
            x50Var.O0(z10);
            x50Var.P.l();
            c30Var.G(nm0Var, false);
            if (x50.G3) {
                d60Var.I(nm0Var, false);
            }
            nm0Var.setVisibility(x50.G3 ? 0 : 8);
            d60Var.H(nm0Var, x50.G3 && !o30Var.b, true);
            boolean z14 = x50.G3;
            x50Var.P2 = !z14 || o30Var.b;
            boolean z15 = !z14 && o30Var.b;
            c30Var.F(k30Var, z15);
            k30Var.setVisibility(z15 ? 0 : 8);
            d50Var.setVisibility((x50.G3 || !o30Var.b) ? 0 : 8);
            xzVar.z1(x50.F3 ? 6 : 2);
            x50Var.O1(false, false);
            d50Var.a0();
            k30Var.a0();
            AndroidUtilities.updateVisibleRows(d50Var);
            this.o0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            o30Var.setIsTablet(x50.G3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (x50Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o30Var.getLayoutParams();
        if (x50.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) x50Var.j0[i15].getLayoutParams();
            if (x50.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (nm0Var != null) {
            ((FrameLayout.LayoutParams) nm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (w30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) w30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(x50Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) d50Var.getLayoutParams();
        if (x50.G3) {
            layoutParams3.gravity = x50Var.I2 ? 5 : 1;
            layoutParams3.width = AndroidUtilities.dp(320.0f);
            int dp3 = AndroidUtilities.dp(4.0f);
            layoutParams3.leftMargin = dp3;
            layoutParams3.rightMargin = dp3;
            layoutParams3.bottomMargin = dp2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            dp = AndroidUtilities.dp(60.0f);
            f7 = 90.0f;
        } else {
            f7 = 90.0f;
            if (x50.F3) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                dp = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                dp = AndroidUtilities.dp(60.0f);
                layoutParams3.bottomMargin = dp2;
                layoutParams3.topMargin = AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp4 = AndroidUtilities.dp(14.0f);
                layoutParams3.leftMargin = dp4;
                layoutParams3.rightMargin = dp4;
            }
        }
        if (!x50.F3 || x50.G3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (x50.G3) {
                layoutParams4.gravity = x50Var.I2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (x50.G3) {
                layoutParams5.gravity = x50Var.I2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (x50.F3) {
            k30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            k30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) b30Var.getLayoutParams();
        if (x50.G3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = x50Var.I2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (x50.F3) {
            layoutParams6.width = AndroidUtilities.dp(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!x50.F3 || x50.G3) {
            ((FrameLayout.LayoutParams) t40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) h30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) t40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) h30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) k30Var.getLayoutParams();
        if (x50.F3) {
            if (((s4.c0) k30Var.getLayoutManager()).o != 1) {
                ((s4.c0) k30Var.getLayoutManager()).k1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.c0) k30Var.getLayoutManager()).o != 0) {
                ((s4.c0) k30Var.getLayoutManager()).k1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        y30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) y30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (w30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) w30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (x50.G3) {
            z11 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            z11 = org.telegram.messenger.t.z(8.0f, paddingTop - max, 0);
        }
        if (d50Var.getPaddingTop() != z11 || d50Var.getPaddingBottom() != dp) {
            d50Var.setPadding(i12, z11, i12, dp);
        }
        v50 v50Var = x50Var.B1;
        if (v50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) v50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = x50.I0(x50Var);
            if (I0 != null) {
                int measuredHeight = ((b30Var.getMeasuredHeight() / 2) + b30Var.getTop()) - (x50Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + z11;
                layoutParams9.topMargin = ic.a.A(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        m50 m50Var = x50Var.U0;
        if (m50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) m50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = x50.I0(x50Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (b6Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - z11)) / 2) + z11;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) b6Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) b6Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) x50Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    b6Var.setVisibility(0);
                    b6Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            b6Var.setVisibility(4);
            b6Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i16)).g(o30Var.b, true);
        }
        this.l0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.n0) {
            this.n0 = measuredHeight3;
            x50Var.d1(false);
        }
        x50Var.r2.f = getMeasuredWidth();
        x50Var.Y0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.s0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.s0.R1();
    }
}
