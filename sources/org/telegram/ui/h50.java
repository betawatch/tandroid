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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h50 extends org.telegram.ui.Components.aw0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final /* synthetic */ d60 D0;
    public boolean w0;
    public final RectF x0;
    public int y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = d60Var;
        this.w0 = false;
        this.x0 = new RectF();
        this.C0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a1  */
    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.e4 e4Var;
        float f10;
        float y3;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.e4 e4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z10;
        float x11;
        float f11;
        float f12;
        float f13;
        int i10;
        Shader.TileMode tileMode;
        d60 d60Var = this.D0;
        b60 b60Var = d60Var.B1;
        View view = d60Var.K2;
        View view2 = d60Var.J2;
        ArrayList arrayList2 = d60Var.Y1;
        lh.h hVar = d60Var.c0;
        Paint paint = d60Var.C0;
        r30 r30Var = d60Var.m2;
        y30 y30Var = d60Var.C2;
        v30 v30Var = d60Var.a2;
        j50 j50Var = d60Var.Q;
        if (!d60Var.s2 && !d60Var.F2) {
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (d60Var.Q2 == null) {
                    d60Var.Q2 = new RenderNode("CallActivity.Blur");
                    d60Var.R2 = org.telegram.ui.Components.aw0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.aw0.getBlurRadius();
                    RenderNode renderNode = d60Var.Q2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = d60Var.Q2;
                    float f14 = d60Var.R2;
                    hVar.W0 = renderNode2;
                    hVar.X0 = f14;
                }
                int round = Math.round(getMeasuredWidth() / d60Var.R2);
                int round2 = Math.round(getMeasuredHeight() / d60Var.R2);
                d60Var.s2 = true;
                d60Var.Q2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = d60Var.Q2.beginRecording();
                float f15 = 1.0f / d60Var.R2;
                beginRecording.scale(f15, f15);
                dispatchDraw(beginRecording);
                d60Var.Q2.endRecording();
                d60Var.s2 = false;
            }
        }
        for (int i11 = 0; i11 < j50Var.getChildCount(); i11++) {
            View childAt = j50Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                ((org.telegram.ui.Cells.e4) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != j50Var.getMeasuredWidth()) {
                    childAt.setTranslationX((j50Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (v30Var.r == null) {
            for (int i12 = 0; i12 < r30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.s20) r30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (r30Var.getVisibility() == 0) {
            HashMap hashMap = this.C0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < j50Var.getChildCount()) {
                View childAt2 = j50Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        j50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != v30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.e4) {
                        j50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.e4 e4Var3 = (org.telegram.ui.Cells.e4) childAt2;
                            hashMap.put(e4Var3.getParticipant(), e4Var3);
                        }
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
            int i14 = 0;
            while (i14 < r30Var.getChildCount()) {
                org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) r30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(s20Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(s20Var.getParticipant());
                }
                float f16 = v30Var.c;
                HashMap hashMap2 = hashMap;
                if (!d60Var.N2.k()) {
                    s20Var.setAlpha(1.0f);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (j50Var.getX() + lVar3.getLeft()) - v30Var.getLeft();
                        f11 = (j50Var.getY() + lVar3.getTop()) - v30Var.getTop();
                        f12 = r30Var.getX() + s20Var.getLeft();
                        f13 = r30Var.getY() + s20Var.getTop();
                    } else {
                        x11 = ((j50Var.getX() + r14.getLeft()) - v30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((j50Var.getY() + r14.getTop()) - v30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = r30Var.getX() + s20Var.getLeft() + (s20Var.getMeasuredWidth() >> 1);
                        float y11 = r30Var.getY() + s20Var.getTop() + (s20Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.e4) view3).setDrawAvatar(false);
                        f11 = y10;
                        f12 = x12;
                        f13 = y11;
                    }
                    float f17 = 1.0f - f16;
                    s20Var.setTranslationX((x11 - f12) * f17);
                    s20Var.setTranslationY((f11 - f13) * f17);
                    s20Var.setScaleX(1.0f);
                    s20Var.setScaleY(1.0f);
                    s20Var.setProgressToFullscreen(f16);
                } else {
                    s20Var.setScaleX(1.0f);
                    s20Var.setScaleY(1.0f);
                    s20Var.setTranslationX(0.0f);
                    s20Var.setTranslationY(0.0f);
                    s20Var.setProgressToFullscreen(1.0f);
                    if (s20Var.getRenderer() == null) {
                        s20Var.setAlpha(f16);
                    }
                }
                i14++;
                hashMap = hashMap2;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList2.get(i15);
            org.telegram.ui.Components.wl0 wl0Var = d60Var.n2;
            org.telegram.ui.Components.voip.p pVar = uVar.a;
            if (uVar.h || uVar.f || uVar.P) {
                arrayList = arrayList2;
            } else {
                uVar.y0 = false;
                float f18 = v30Var.c;
                arrayList = arrayList2;
                if (uVar.r || uVar.b) {
                    org.telegram.ui.Components.voip.l lVar4 = uVar.c;
                    org.telegram.ui.Components.voip.l lVar5 = lVar4;
                    if (lVar4 == null && uVar.e == null) {
                        uVar.setTranslationX(0.0f);
                        uVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.l lVar6 = uVar.e;
                        if (lVar6 != null) {
                            lVar5 = lVar6;
                        }
                        if (lVar6 == null) {
                            wl0Var = j50Var;
                        }
                        float x13 = ((wl0Var.getX() + lVar5.getX()) - uVar.getLeft()) - v30Var.getLeft();
                        float y12 = ((wl0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - uVar.getTop()) - v30Var.getTop();
                        float f19 = 1.0f - f18;
                        float f20 = f18 * 0.0f;
                        uVar.setTranslationX((x13 * f19) + f20);
                        uVar.setTranslationY((y12 * f19) + f20);
                    }
                    pVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.s20 s20Var2 = uVar.d;
                    if (s20Var2 != null) {
                        s20Var2.setAlpha(f18);
                    }
                    if (!uVar.b && uVar.c == null && uVar.e == null) {
                        uVar.setAlpha(f18);
                    } else if (!uVar.E) {
                        uVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.s20 s20Var3 = uVar.d;
                    if (s20Var3 != null) {
                        r30Var.getClass();
                        if (RecyclerView.R(s20Var3) == -1) {
                            uVar.setAlpha(uVar.d.getAlpha());
                        } else if (uVar.c == null) {
                            if (uVar.v && !uVar.E) {
                                uVar.setAlpha(f18);
                            }
                            uVar.d.setAlpha(f18);
                            f18 = 1.0f;
                        } else {
                            uVar.d.setAlpha(1.0f);
                            if (uVar.v && !uVar.E) {
                                uVar.setAlpha(1.0f);
                            }
                        }
                        uVar.setTranslationX((r30Var.getX() + uVar.d.getX()) - uVar.getLeft());
                        float f21 = 1.0f - f18;
                        uVar.setTranslationY((r30Var.getY() + (uVar.d.getY() + (AndroidUtilities.dp(2.0f) * f21))) - uVar.getTop());
                        pVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f21) + (AndroidUtilities.dp(13.0f) * f18));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = uVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || uVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = uVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    wl0Var = j50Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (d60.G3) {
                                    lVar = lVar9;
                                    if (!uVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            wl0Var = j50Var;
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
                            uVar.setTranslationX(((wl0Var.getX() + lVar8.getX()) - uVar.getLeft()) - v30Var.getLeft());
                            uVar.setTranslationY(((wl0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - uVar.getTop()) - v30Var.getTop());
                            pVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (uVar.v && !uVar.E) {
                                if (!d60.G3) {
                                    uVar.y0 = true;
                                    uVar.setAlpha(lVar8.getAlpha() * (1.0f - f18));
                                } else if (uVar.c != null && uVar.e == null) {
                                    uVar.setAlpha(lVar8.getAlpha() * f18);
                                }
                            }
                        }
                    }
                }
            }
            i15++;
            arrayList2 = arrayList;
        }
        if (d60.G3) {
            f7 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f7 = 1.0f;
            view2.setAlpha(1.0f - v30Var.c);
            view.setAlpha(1.0f - v30Var.c);
        }
        if (v30Var.L0) {
            j50Var.setAlpha(f7 - v30Var.c);
        } else {
            j50Var.setAlpha(f7);
        }
        if (b60Var != null) {
            b60Var.setAlpha(f7 - v30Var.c);
            b60Var.setTranslationY(v30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (d60Var.F2) {
            return;
        }
        boolean z11 = d60Var.f2;
        RectF rectF = this.x0;
        if (!z11) {
            if (d60Var.X2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), d60Var.W2);
                float y13 = j50Var.getY();
                j50Var.getY();
                j50Var.getMeasuredHeight();
                if (!d60Var.b3) {
                    if (d60Var.a3 == null) {
                        org.telegram.ui.Components.voip.u uVar2 = d60Var.Z2;
                        if (uVar2 == null || !uVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(v30Var.getX() + d60Var.Z2.getX(), v30Var.getY() + d60Var.Z2.getY());
                        d60Var.Z2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(v30Var.getX() + r30Var.getX() + d60Var.a3.getX(), v30Var.getY() + r30Var.getY() + d60Var.a3.getY());
                    if (d60Var.a3.getRenderer() == null || !d60Var.a3.getRenderer().v || d60Var.a3.getRenderer().b) {
                        d60Var.a3.draw(canvas);
                    } else {
                        d60Var.a3.getRenderer().draw(canvas);
                    }
                    d60Var.a3.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = j50Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = j50Var.getChildAt(i16);
                    if (childAt3 == d60Var.X2) {
                        float max = Math.max(j50Var.getLeft(), childAt3.getX() + j50Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + j50Var.getY());
                        float min = Math.min(j50Var.getRight(), childAt3.getX() + j50Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(j50Var.getY() + j50Var.getMeasuredHeight(), childAt3.getY() + j50Var.getY() + d60Var.X2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + j50Var.getLeft(), childAt3.getY() + j50Var.getY());
                            float alpha = d60Var.W2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((d60Var.X2.getClipHeight() - d60Var.X2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.rr.g.getInterpolation(1.0f - alpha))) + d60Var.X2.getMeasuredHeight()));
                            org.telegram.ui.Cells.e4 e4Var4 = d60Var.X2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.h5[] h5VarArr = e4Var4.d;
                            if (TextUtils.isEmpty(h5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            h5VarArr[4].setFullAlpha(alpha);
                            h5VarArr[4].h(0, 0);
                            e4Var4.invalidate();
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
        if (d60Var.X2 != null) {
            if (d60Var.g2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), d60Var.W2);
            }
            float y14 = j50Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = j50Var.getChildCount();
            float y15 = j50Var.getY() + j50Var.getMeasuredHeight();
            if (d60Var.b3) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        e4Var = null;
                        break;
                    }
                    View childAt4 = j50Var.getChildAt(i17);
                    e4Var = d60Var.X2;
                    if (childAt4 == e4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                e4Var = d60Var.X2;
            }
            if (e4Var != null && y14 < y15) {
                canvas3.save();
                if (d60Var.a3 == null) {
                    f10 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - d60Var.d2) * y14, getMeasuredWidth(), (getMeasuredHeight() * d60Var.d2) + ((1.0f - d60Var.d2) * y15));
                } else {
                    f10 = 255.0f;
                }
                if (d60Var.b3) {
                    y3 = ((1.0f - d60Var.d2) * (e4Var.getY() + j50Var.getY())) + ((y30Var.getMeasuredWidth() + y30Var.getTop()) * d60Var.d2);
                    x10 = ((1.0f - d60Var.d2) * (e4Var.getX() + j50Var.getLeft())) + (d60Var.d2 * y30Var.getLeft());
                } else {
                    y3 = y30Var.getMeasuredWidth() + y30Var.getTop();
                    x10 = y30Var.getLeft();
                }
                float f22 = y3;
                canvas3.translate(x10, f22);
                if (d60Var.b3) {
                    fArr = fArr2;
                    path = path2;
                    e4Var2 = e4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    e4Var2 = e4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, e4Var.getMeasuredWidth(), e4Var.getClipHeight(), (int) (d60Var.d2 * f10), 31);
                }
                float clipHeight = (int) (((e4Var2.getClipHeight() - e4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.rr.g.getInterpolation(1.0f - d60Var.d2))) + e4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, e4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.e4 e4Var5 = e4Var2;
                e4Var5.setProgressToAvatarPreview(d60Var.b3 ? d60Var.d2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - d60Var.d2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                e4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (d60Var.e2 != null) {
                    float f23 = f22 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - d60Var.e2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (d60Var.d2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f23, d60Var.e2.getMeasuredWidth() + measuredWidth, d60Var.e2.getMeasuredHeight() + f23, (int) (d60Var.d2 * f10), 31);
                    } else {
                        canvas3.save();
                    }
                    d60Var.e2.setTranslationX(measuredWidth - r4.getLeft());
                    d60Var.e2.setTranslationY(f23 - r4.getTop());
                    float f24 = (d60Var.d2 * 0.2f) + 0.8f;
                    canvas3.scale(f24, f24, (d60Var.e2.getMeasuredWidth() / 2.0f) + measuredWidth, f23);
                    canvas3.translate(measuredWidth, f23);
                    d60Var.e2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (d60Var.c2.n) {
                return;
            }
            canvas3.save();
            if (d60Var.b3 && d60Var.a3 == null) {
                canvas3.clipRect(0.0f, (1.0f - d60Var.d2) * y14, getMeasuredWidth(), (d60Var.d2 * getMeasuredHeight()) + ((1.0f - d60Var.d2) * y15));
            }
            canvas3.scale(y30Var.getScaleX(), y30Var.getScaleY(), y30Var.getX(), y30Var.getY());
            canvas3.translate(y30Var.getX(), y30Var.getY());
            y30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        d60 d60Var = this.D0;
        i30 i30Var = d60Var.e;
        r30 r30Var = d60Var.m2;
        j50 j50Var = d60Var.Q;
        v30 v30Var = d60Var.a2;
        if (d60Var.s2) {
            if (view == j50Var) {
                int childCount = j50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = j50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == v30Var || view == i30Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (d60.G3 || v30Var.c != 1.0f || (view != d60Var.O && view != d60Var.g0 && view != d60Var.N && view != d60Var.e1 && view != d60Var.z1 && view != d60Var.U0)) {
            if (d60Var.F2 && view == v30Var) {
                canvas.save();
                canvas.translate(r30Var.getX() + v30Var.getX(), r30Var.getY() + v30Var.getY());
                r30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != d60Var.C2 && view != d60Var.e2 && view != d60Var.X2 && (!d60Var.l2 || !d60Var.g2 || (view != j50Var && view != i30Var && view != d60Var.c0))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0.Z.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0.Z.onDetachedFromWindow();
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
        d60 d60Var = this.D0;
        ImageReceiver imageReceiver = d60Var.Z;
        Drawable drawable = d60Var.f0;
        v30 v30Var = d60Var.a2;
        float f10 = d60Var.y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        d60Var.Q1();
        if (v30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.h6.t0.setColor(d60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.x0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.t0);
            }
            org.telegram.ui.ActionBar.h6.t0.setColor(Color.argb((int) (d60Var.O.getAlpha() * 255.0f), (int) (Color.red(d60Var.V1) * 0.8f), (int) (Color.green(d60Var.V1) * 0.8f), (int) (Color.blue(d60Var.V1) * 0.8f)));
            float statusBarHeight = d60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.h6.t0);
            p40 p40Var = d60Var.z0;
            if (p40Var != null) {
                org.telegram.ui.ActionBar.h6.t0.setColor(p40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, d60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.h6.t0);
            }
        }
        if (v30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.h6.t0.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gg, false), (int) (v30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.t0);
        }
        if (d60Var.r1() && LiteMode.isEnabled(512)) {
            if (v30Var.c < 0.15d) {
                if (!d60Var.z2) {
                    d60Var.z2 = true;
                    d60Var.z1();
                }
            } else if (d60Var.z2) {
                d60Var.z2 = false;
                AndroidUtilities.cancelRunOnUIThread(d60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d60 d60Var = this.D0;
        y30 y30Var = d60Var.C2;
        if (d60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = d60Var.e2.getX();
            float y10 = d60Var.e2.getY();
            float x12 = d60Var.e2.getX() + d60Var.e2.getMeasuredWidth();
            float y11 = d60Var.e2.getY() + d60Var.e2.getMeasuredHeight();
            RectF rectF = this.x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(y30Var.getX(), y30Var.getY(), y30Var.getX() + y30Var.getMeasuredWidth(), y30Var.getY() + y30Var.getMeasuredWidth() + d60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                d60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || d60Var.y0 == 0.0f || motionEvent.getY() >= d60Var.y0 - AndroidUtilities.dp(37.0f) || d60Var.O.getAlpha() != 0.0f || d60Var.f2 || d60Var.z0 != null || d60Var.a2.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        d60Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        d60 d60Var = this.D0;
        if (d60Var.X2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        d60Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        boolean z11;
        d60 d60Var = this.D0;
        View view = d60Var.K2;
        View view2 = d60Var.J2;
        i30 i30Var = d60Var.e;
        v30 v30Var = d60Var.a2;
        j50 j50Var = d60Var.Q;
        if (d60.G3 && this.A0 != d60Var.I2 && this.B0) {
            f7 = j50Var.getX();
            z11 = true;
        } else {
            f7 = 0.0f;
            z11 = false;
        }
        this.A0 = d60Var.I2;
        v30Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        v30Var.s = false;
        d60.J0(d60Var);
        this.B0 = true;
        if (!z11 || j50Var.getLeft() == f7) {
            return;
        }
        float left = f7 - j50Var.getLeft();
        j50Var.setTranslationX(left);
        i30Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = j50Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f;
        duration.setInterpolator(rrVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(rrVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(rrVar).start();
        i30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(rrVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        float f10;
        int i12;
        int y3;
        d60 d60Var = this.D0;
        f40 f40Var = d60Var.G;
        o30 o30Var = d60Var.N;
        LinearLayout linearLayout = d60Var.z1;
        z40 z40Var = d60Var.O;
        j60 j60Var = d60Var.o2;
        org.telegram.ui.Components.t20 t20Var = d60Var.p2;
        org.telegram.ui.Components.pz pzVar = d60Var.Y;
        org.telegram.ui.Components.voip.w2 w2Var = d60Var.w;
        org.telegram.ui.ActionBar.h5 h5Var = d60Var.U;
        View view = d60Var.g0;
        i30 i30Var = d60Var.e;
        View view2 = d60Var.K2;
        View view3 = d60Var.J2;
        ArrayList arrayList = d60Var.Y1;
        org.telegram.ui.ActionBar.h5 h5Var2 = d60Var.W;
        d40 d40Var = d60Var.H;
        ArrayList arrayList2 = d60Var.Z1;
        org.telegram.ui.Components.wl0 wl0Var = d60Var.n2;
        j50 j50Var = d60Var.Q;
        v30 v30Var = d60Var.a2;
        r30 r30Var = d60Var.m2;
        int size = View.MeasureSpec.getSize(i11);
        this.w0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        v30Var.getClass();
        boolean z12 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !d60Var.r1();
        if (d60.F3 != z11) {
            d60.F3 = z11;
            if (w2Var.getMeasuredWidth() == 0) {
                int i13 = w2Var.getLayoutParams().width;
            }
            d60.H0(d60Var);
            pzVar.y1(d60.F3 ? 6 : 2);
            j50Var.a0();
            r30Var.a0();
            this.z0 = true;
            TextView textView = d60Var.S;
            if (textView != null) {
                textView.setVisibility(!d60.F3 ? 0 : 8);
            }
            if (d60Var.q1() == z11 && d60Var.r1() && !v30Var.b && !d60Var.a1.visibleVideoParticipants.isEmpty()) {
                d60Var.e1(d60Var.a1.visibleVideoParticipants.get(0));
                v30Var.e();
            }
        }
        if (d60.G3 != z12) {
            d60.G3 = z12;
            wl0Var.setVisibility(z12 ? 0 : 8);
            j50Var.a0();
            r30Var.a0();
            z10 = true;
            this.z0 = true;
        } else {
            z10 = true;
        }
        if (this.z0) {
            d60Var.O0(z10);
            d60Var.P.l();
            t20Var.G(wl0Var, false);
            if (d60.G3) {
                j60Var.I(wl0Var, false);
            }
            wl0Var.setVisibility(d60.G3 ? 0 : 8);
            j60Var.H(wl0Var, d60.G3 && !v30Var.b, true);
            boolean z13 = d60.G3;
            d60Var.P2 = !z13 || v30Var.b;
            boolean z14 = !z13 && v30Var.b;
            t20Var.F(r30Var, z14);
            r30Var.setVisibility(z14 ? 0 : 8);
            j50Var.setVisibility((d60.G3 || !v30Var.b) ? 0 : 8);
            pzVar.y1(d60.F3 ? 6 : 2);
            d60Var.N1(false, false);
            j50Var.a0();
            r30Var.a0();
            AndroidUtilities.updateVisibleRows(j50Var);
            this.z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            v30Var.setIsTablet(d60.G3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (d60Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v30Var.getLayoutParams();
        if (d60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) d60Var.j0[i15].getLayoutParams();
            if (d60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (wl0Var != null) {
            ((FrameLayout.LayoutParams) wl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (d40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) d40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(d60Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) j50Var.getLayoutParams();
        if (d60.G3) {
            layoutParams3.gravity = d60Var.I2 ? 5 : 1;
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
            if (d60.F3) {
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
        if (!d60.F3 || d60.G3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (d60.G3) {
                layoutParams4.gravity = d60Var.I2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (d60.G3) {
                layoutParams5.gravity = d60Var.I2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (d60.F3) {
            r30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            r30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) i30Var.getLayoutParams();
        if (d60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = d60Var.I2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (d60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!d60.F3 || d60.G3) {
            ((FrameLayout.LayoutParams) z40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) o30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) z40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) o30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) r30Var.getLayoutParams();
        if (d60.F3) {
            if (((s4.c0) r30Var.getLayoutManager()).o != 1) {
                ((s4.c0) r30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.c0) r30Var.getLayoutManager()).o != 0) {
                ((s4.c0) r30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        f40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) f40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (d40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) d40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (d60.G3) {
            y3 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            y3 = org.telegram.messenger.f0.y(8.0f, paddingTop - max, 0);
        }
        if (j50Var.getPaddingTop() != y3 || j50Var.getPaddingBottom() != dp) {
            j50Var.setPadding(i12, y3, i12, dp);
        }
        b60 b60Var = d60Var.B1;
        if (b60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) b60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = d60.I0(d60Var);
            if (I0 != null) {
                int measuredHeight = ((i30Var.getMeasuredHeight() / 2) + i30Var.getTop()) - (d60Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + y3;
                layoutParams9.topMargin = hg.c.z(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        s50 s50Var = d60Var.U0;
        if (s50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) s50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = d60.I0(d60Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (h5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - y3)) / 2) + y3;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) h5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) h5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) d60Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    h5Var.setVisibility(0);
                    h5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            h5Var.setVisibility(4);
            h5Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i16)).g(v30Var.b, true);
        }
        this.w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.y0) {
            this.y0 = measuredHeight3;
            d60Var.d1(false);
        }
        d60Var.r2.f = getMeasuredWidth();
        d60Var.Y0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.D0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.D0.Q1();
    }
}
