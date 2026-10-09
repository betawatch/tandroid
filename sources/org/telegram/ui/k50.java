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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k50 extends org.telegram.ui.Components.sw0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final /* synthetic */ g60 D0;
    public boolean w0;
    public final RectF x0;
    public int y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = g60Var;
        this.w0 = false;
        this.x0 = new RectF();
        this.C0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.e4 e4Var;
        float f11;
        float y3;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.e4 e4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z10;
        float x11;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z11;
        Shader.TileMode tileMode;
        g60 g60Var = this.D0;
        e60 e60Var = g60Var.B1;
        View view = g60Var.K2;
        View view2 = g60Var.J2;
        ArrayList arrayList2 = g60Var.Y1;
        lh.h hVar = g60Var.c0;
        Paint paint = g60Var.C0;
        u30 u30Var = g60Var.m2;
        b40 b40Var = g60Var.C2;
        y30 y30Var = g60Var.a2;
        m50 m50Var = g60Var.Q;
        if (g60Var.s2 || g60Var.F2) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (g60Var.Q2 == null) {
                    g60Var.Q2 = new RenderNode("CallActivity.Blur");
                    g60Var.R2 = org.telegram.ui.Components.sw0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.sw0.getBlurRadius();
                    RenderNode renderNode = g60Var.Q2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = g60Var.Q2;
                    float f15 = g60Var.R2;
                    hVar.U0 = renderNode2;
                    hVar.V0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / g60Var.R2);
                int round2 = Math.round(getMeasuredHeight() / g60Var.R2);
                g60Var.s2 = true;
                g60Var.Q2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = g60Var.Q2.beginRecording();
                float f16 = 1.0f / g60Var.R2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                g60Var.Q2.endRecording();
                g60Var.s2 = false;
            }
        }
        for (int i11 = 0; i11 < m50Var.getChildCount(); i11++) {
            View childAt = m50Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                z11 = true;
                ((org.telegram.ui.Cells.e4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != m50Var.getMeasuredWidth()) {
                    childAt.setTranslationX((m50Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (y30Var.r == null) {
            for (int i12 = 0; i12 < u30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.i30) u30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (u30Var.getVisibility() == 0) {
            HashMap hashMap = this.C0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < m50Var.getChildCount()) {
                View childAt2 = m50Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        m50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != y30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.e4) {
                        m50Var.getClass();
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
            while (i14 < u30Var.getChildCount()) {
                org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) u30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(i30Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(i30Var.getParticipant());
                }
                float f17 = y30Var.c;
                HashMap hashMap2 = hashMap;
                if (!g60Var.N2.k()) {
                    i30Var.setAlpha(f7);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (m50Var.getX() + lVar3.getLeft()) - y30Var.getLeft();
                        f12 = (m50Var.getY() + lVar3.getTop()) - y30Var.getTop();
                        f13 = u30Var.getX() + i30Var.getLeft();
                        f14 = u30Var.getY() + i30Var.getTop();
                    } else {
                        x11 = ((m50Var.getX() + r14.getLeft()) - y30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((m50Var.getY() + r14.getTop()) - y30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = u30Var.getX() + i30Var.getLeft() + (i30Var.getMeasuredWidth() >> 1);
                        float y11 = u30Var.getY() + i30Var.getTop() + (i30Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.e4) view3).setDrawAvatar(false);
                        f12 = y10;
                        f13 = x12;
                        f14 = y11;
                    }
                    float f18 = 1.0f - f17;
                    i30Var.setTranslationX((x11 - f13) * f18);
                    i30Var.setTranslationY((f12 - f14) * f18);
                    i30Var.setScaleX(1.0f);
                    i30Var.setScaleY(1.0f);
                    i30Var.setProgressToFullscreen(f17);
                } else {
                    i30Var.setScaleX(1.0f);
                    i30Var.setScaleY(1.0f);
                    i30Var.setTranslationX(0.0f);
                    i30Var.setTranslationY(0.0f);
                    i30Var.setProgressToFullscreen(1.0f);
                    if (i30Var.getRenderer() == null) {
                        i30Var.setAlpha(f17);
                    }
                }
                i14++;
                hashMap = hashMap2;
                f7 = 1.0f;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList2.get(i15);
            org.telegram.ui.Components.qm0 qm0Var = g60Var.n2;
            org.telegram.ui.Components.voip.p pVar = uVar.a;
            if (uVar.h || uVar.f || uVar.P) {
                arrayList = arrayList2;
            } else {
                uVar.y0 = false;
                float f19 = y30Var.c;
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
                            qm0Var = m50Var;
                        }
                        float x13 = ((qm0Var.getX() + lVar5.getX()) - uVar.getLeft()) - y30Var.getLeft();
                        float y12 = ((qm0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - uVar.getTop()) - y30Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        uVar.setTranslationX((x13 * f20) + f21);
                        uVar.setTranslationY((y12 * f20) + f21);
                    }
                    pVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.i30 i30Var2 = uVar.d;
                    if (i30Var2 != null) {
                        i30Var2.setAlpha(f19);
                    }
                    if (!uVar.b && uVar.c == null && uVar.e == null) {
                        uVar.setAlpha(f19);
                    } else if (!uVar.E) {
                        uVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.i30 i30Var3 = uVar.d;
                    if (i30Var3 != null) {
                        u30Var.getClass();
                        if (RecyclerView.R(i30Var3) == -1) {
                            uVar.setAlpha(uVar.d.getAlpha());
                        } else if (uVar.c == null) {
                            if (uVar.v && !uVar.E) {
                                uVar.setAlpha(f19);
                            }
                            uVar.d.setAlpha(f19);
                            f19 = 1.0f;
                        } else {
                            uVar.d.setAlpha(1.0f);
                            if (uVar.v && !uVar.E) {
                                uVar.setAlpha(1.0f);
                            }
                        }
                        uVar.setTranslationX((u30Var.getX() + uVar.d.getX()) - uVar.getLeft());
                        float f22 = 1.0f - f19;
                        uVar.setTranslationY((u30Var.getY() + (uVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - uVar.getTop());
                        pVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = uVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || uVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = uVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    qm0Var = m50Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (g60.G3) {
                                    lVar = lVar9;
                                    if (!uVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            qm0Var = m50Var;
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
                            uVar.setTranslationX(((qm0Var.getX() + lVar8.getX()) - uVar.getLeft()) - y30Var.getLeft());
                            uVar.setTranslationY(((qm0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - uVar.getTop()) - y30Var.getTop());
                            pVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (uVar.v && !uVar.E) {
                                if (!g60.G3) {
                                    uVar.y0 = true;
                                    uVar.setAlpha(lVar8.getAlpha() * (1.0f - f19));
                                } else if (uVar.c != null && uVar.e == null) {
                                    uVar.setAlpha(lVar8.getAlpha() * f19);
                                }
                            }
                        }
                    }
                }
            }
            i15++;
            arrayList2 = arrayList;
        }
        if (g60.G3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - y30Var.c);
            view.setAlpha(1.0f - y30Var.c);
        }
        if (y30Var.L0) {
            m50Var.setAlpha(f10 - y30Var.c);
        } else {
            m50Var.setAlpha(f10);
        }
        if (e60Var != null) {
            e60Var.setAlpha(f10 - y30Var.c);
            e60Var.setTranslationY(y30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (g60Var.F2) {
            return;
        }
        boolean z12 = g60Var.f2;
        RectF rectF = this.x0;
        if (!z12) {
            if (g60Var.X2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), g60Var.W2);
                float y13 = m50Var.getY();
                m50Var.getY();
                m50Var.getMeasuredHeight();
                if (!g60Var.b3) {
                    if (g60Var.a3 == null) {
                        org.telegram.ui.Components.voip.u uVar2 = g60Var.Z2;
                        if (uVar2 == null || !uVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(y30Var.getX() + g60Var.Z2.getX(), y30Var.getY() + g60Var.Z2.getY());
                        g60Var.Z2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(y30Var.getX() + u30Var.getX() + g60Var.a3.getX(), y30Var.getY() + u30Var.getY() + g60Var.a3.getY());
                    if (g60Var.a3.getRenderer() == null || !g60Var.a3.getRenderer().v || g60Var.a3.getRenderer().b) {
                        g60Var.a3.draw(canvas);
                    } else {
                        g60Var.a3.getRenderer().draw(canvas);
                    }
                    g60Var.a3.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = m50Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = m50Var.getChildAt(i16);
                    if (childAt3 == g60Var.X2) {
                        float max = Math.max(m50Var.getLeft(), childAt3.getX() + m50Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + m50Var.getY());
                        float min = Math.min(m50Var.getRight(), childAt3.getX() + m50Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(m50Var.getY() + m50Var.getMeasuredHeight(), childAt3.getY() + m50Var.getY() + g60Var.X2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + m50Var.getLeft(), childAt3.getY() + m50Var.getY());
                            float alpha = g60Var.W2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((g60Var.X2.getClipHeight() - g60Var.X2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.hs.g.getInterpolation(1.0f - alpha))) + g60Var.X2.getMeasuredHeight()));
                            org.telegram.ui.Cells.e4 e4Var4 = g60Var.X2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.j5[] j5VarArr = e4Var4.d;
                            if (TextUtils.isEmpty(j5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            j5VarArr[4].setFullAlpha(alpha);
                            j5VarArr[4].h(0, 0);
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
        if (g60Var.X2 != null) {
            if (g60Var.g2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), g60Var.W2);
            }
            float y14 = m50Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = m50Var.getChildCount();
            float y15 = m50Var.getY() + m50Var.getMeasuredHeight();
            if (g60Var.b3) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        e4Var = null;
                        break;
                    }
                    View childAt4 = m50Var.getChildAt(i17);
                    e4Var = g60Var.X2;
                    if (childAt4 == e4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                e4Var = g60Var.X2;
            }
            if (e4Var != null && y14 < y15) {
                canvas3.save();
                if (g60Var.a3 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - g60Var.d2) * y14, getMeasuredWidth(), (getMeasuredHeight() * g60Var.d2) + ((1.0f - g60Var.d2) * y15));
                } else {
                    f11 = 255.0f;
                }
                if (g60Var.b3) {
                    y3 = ((1.0f - g60Var.d2) * (e4Var.getY() + m50Var.getY())) + ((b40Var.getMeasuredWidth() + b40Var.getTop()) * g60Var.d2);
                    x10 = ((1.0f - g60Var.d2) * (e4Var.getX() + m50Var.getLeft())) + (g60Var.d2 * b40Var.getLeft());
                } else {
                    y3 = b40Var.getMeasuredWidth() + b40Var.getTop();
                    x10 = b40Var.getLeft();
                }
                float f23 = y3;
                canvas3.translate(x10, f23);
                if (g60Var.b3) {
                    fArr = fArr2;
                    path = path2;
                    e4Var2 = e4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    e4Var2 = e4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, e4Var.getMeasuredWidth(), e4Var.getClipHeight(), (int) (g60Var.d2 * f11), 31);
                }
                float clipHeight = (int) (((e4Var2.getClipHeight() - e4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.hs.g.getInterpolation(1.0f - g60Var.d2))) + e4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, e4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.e4 e4Var5 = e4Var2;
                e4Var5.setProgressToAvatarPreview(g60Var.b3 ? g60Var.d2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - g60Var.d2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                e4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (g60Var.e2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - g60Var.e2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (g60Var.d2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, g60Var.e2.getMeasuredWidth() + measuredWidth, g60Var.e2.getMeasuredHeight() + f24, (int) (g60Var.d2 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    g60Var.e2.setTranslationX(measuredWidth - r4.getLeft());
                    g60Var.e2.setTranslationY(f24 - r4.getTop());
                    float f25 = (g60Var.d2 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (g60Var.e2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    g60Var.e2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (g60Var.c2.n) {
                return;
            }
            canvas3.save();
            if (g60Var.b3 && g60Var.a3 == null) {
                canvas3.clipRect(0.0f, (1.0f - g60Var.d2) * y14, getMeasuredWidth(), (g60Var.d2 * getMeasuredHeight()) + ((1.0f - g60Var.d2) * y15));
            }
            canvas3.scale(b40Var.getScaleX(), b40Var.getScaleY(), b40Var.getX(), b40Var.getY());
            canvas3.translate(b40Var.getX(), b40Var.getY());
            b40Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        g60 g60Var = this.D0;
        l30 l30Var = g60Var.e;
        u30 u30Var = g60Var.m2;
        m50 m50Var = g60Var.Q;
        y30 y30Var = g60Var.a2;
        if (g60Var.s2) {
            if (view == m50Var) {
                int childCount = m50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = m50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == y30Var || view == l30Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (g60.G3 || y30Var.c != 1.0f || (view != g60Var.O && view != g60Var.g0 && view != g60Var.N && view != g60Var.e1 && view != g60Var.z1 && view != g60Var.U0)) {
            if (g60Var.F2 && view == y30Var) {
                canvas.save();
                canvas.translate(u30Var.getX() + y30Var.getX(), u30Var.getY() + y30Var.getY());
                u30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != g60Var.C2 && view != g60Var.e2 && view != g60Var.X2 && (!g60Var.l2 || !g60Var.g2 || (view != m50Var && view != l30Var && view != g60Var.c0))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0.Z.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
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
        g60 g60Var = this.D0;
        ImageReceiver imageReceiver = g60Var.Z;
        Drawable drawable = g60Var.f0;
        y30 y30Var = g60Var.a2;
        float f10 = g60Var.y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        g60Var.R1();
        if (y30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.i6.t0.setColor(g60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.x0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.i6.t0);
            }
            org.telegram.ui.ActionBar.i6.t0.setColor(Color.argb((int) (g60Var.O.getAlpha() * 255.0f), (int) (Color.red(g60Var.V1) * 0.8f), (int) (Color.green(g60Var.V1) * 0.8f), (int) (Color.blue(g60Var.V1) * 0.8f)));
            float statusBarHeight = g60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.i6.t0);
            s40 s40Var = g60Var.z0;
            if (s40Var != null) {
                org.telegram.ui.ActionBar.i6.t0.setColor(s40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) g60Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, g60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.i6.t0);
            }
        }
        if (y30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.i6.t0.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gg, false), (int) (y30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.i6.t0);
        }
        if (g60Var.s1() && LiteMode.isEnabled(512)) {
            if (y30Var.c < 0.15d) {
                if (!g60Var.z2) {
                    g60Var.z2 = true;
                    g60Var.A1();
                }
            } else if (g60Var.z2) {
                g60Var.z2 = false;
                AndroidUtilities.cancelRunOnUIThread(g60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g60 g60Var = this.D0;
        b40 b40Var = g60Var.C2;
        if (g60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = g60Var.e2.getX();
            float y10 = g60Var.e2.getY();
            float x12 = g60Var.e2.getX() + g60Var.e2.getMeasuredWidth();
            float y11 = g60Var.e2.getY() + g60Var.e2.getMeasuredHeight();
            RectF rectF = this.x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(b40Var.getX(), b40Var.getY(), b40Var.getX() + b40Var.getMeasuredWidth(), b40Var.getY() + b40Var.getMeasuredWidth() + g60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                g60Var.e1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || g60Var.y0 == 0.0f || motionEvent.getY() >= g60Var.y0 - AndroidUtilities.dp(37.0f) || g60Var.O.getAlpha() != 0.0f || g60Var.f2 || g60Var.z0 != null || g60Var.a2.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        g60Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        g60 g60Var = this.D0;
        if (g60Var.X2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        g60Var.e1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.sw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        g60 g60Var = this.D0;
        View view = g60Var.K2;
        View view2 = g60Var.J2;
        l30 l30Var = g60Var.e;
        y30 y30Var = g60Var.a2;
        m50 m50Var = g60Var.Q;
        if (g60.G3 && this.A0 != g60Var.I2 && this.B0) {
            f7 = m50Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.A0 = g60Var.I2;
        y30Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        y30Var.s = false;
        g60.K0(g60Var);
        this.B0 = true;
        if (!z11 || m50Var.getLeft() == f7) {
            return;
        }
        float left = f7 - m50Var.getLeft();
        m50Var.setTranslationX(left);
        l30Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = m50Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f;
        duration.setInterpolator(hsVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(hsVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(hsVar).start();
        l30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(hsVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        float f10;
        int i12;
        int y3;
        g60 g60Var = this.D0;
        i40 i40Var = g60Var.G;
        r30 r30Var = g60Var.N;
        LinearLayout linearLayout = g60Var.z1;
        c50 c50Var = g60Var.O;
        l60 l60Var = g60Var.o2;
        org.telegram.ui.Components.j30 j30Var = g60Var.p2;
        org.telegram.ui.Components.e00 e00Var = g60Var.Y;
        org.telegram.ui.Components.voip.v2 v2Var = g60Var.w;
        org.telegram.ui.ActionBar.j5 j5Var = g60Var.U;
        View view = g60Var.g0;
        l30 l30Var = g60Var.e;
        View view2 = g60Var.K2;
        View view3 = g60Var.J2;
        ArrayList arrayList = g60Var.Y1;
        org.telegram.ui.ActionBar.j5 j5Var2 = g60Var.W;
        g40 g40Var = g60Var.H;
        ArrayList arrayList2 = g60Var.Z1;
        org.telegram.ui.Components.qm0 qm0Var = g60Var.n2;
        m50 m50Var = g60Var.Q;
        y30 y30Var = g60Var.a2;
        u30 u30Var = g60Var.m2;
        int size = View.MeasureSpec.getSize(i11);
        this.w0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        y30Var.getClass();
        boolean z12 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !g60Var.s1();
        if (g60.F3 != z11) {
            g60.F3 = z11;
            if (v2Var.getMeasuredWidth() == 0) {
                int i13 = v2Var.getLayoutParams().width;
            }
            g60.I0(g60Var);
            e00Var.y1(g60.F3 ? 6 : 2);
            m50Var.a0();
            u30Var.a0();
            this.z0 = true;
            TextView textView = g60Var.S;
            if (textView != null) {
                textView.setVisibility(!g60.F3 ? 0 : 8);
            }
            if (g60Var.r1() == z11 && g60Var.s1() && !y30Var.b && !g60Var.a1.visibleVideoParticipants.isEmpty()) {
                g60Var.f1(g60Var.a1.visibleVideoParticipants.get(0));
                y30Var.e();
            }
        }
        if (g60.G3 != z12) {
            g60.G3 = z12;
            qm0Var.setVisibility(z12 ? 0 : 8);
            m50Var.a0();
            u30Var.a0();
            z10 = true;
            this.z0 = true;
        } else {
            z10 = true;
        }
        if (this.z0) {
            g60Var.P0(z10);
            g60Var.P.l();
            j30Var.G(qm0Var, false);
            if (g60.G3) {
                l60Var.I(qm0Var, false);
            }
            qm0Var.setVisibility(g60.G3 ? 0 : 8);
            l60Var.H(qm0Var, g60.G3 && !y30Var.b, true);
            boolean z13 = g60.G3;
            g60Var.P2 = !z13 || y30Var.b;
            boolean z14 = !z13 && y30Var.b;
            j30Var.F(u30Var, z14);
            u30Var.setVisibility(z14 ? 0 : 8);
            m50Var.setVisibility((g60.G3 || !y30Var.b) ? 0 : 8);
            e00Var.y1(g60.F3 ? 6 : 2);
            g60Var.O1(false, false);
            m50Var.a0();
            u30Var.a0();
            AndroidUtilities.updateVisibleRows(m50Var);
            this.z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            y30Var.setIsTablet(g60.G3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (g60Var.s1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y30Var.getLayoutParams();
        if (g60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g60Var.j0[i15].getLayoutParams();
            if (g60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (qm0Var != null) {
            ((FrameLayout.LayoutParams) qm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (g40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) g40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(g60Var.s1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) m50Var.getLayoutParams();
        if (g60.G3) {
            layoutParams3.gravity = g60Var.I2 ? 5 : 1;
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
            if (g60.F3) {
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
        if (!g60.F3 || g60.G3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (g60.G3) {
                layoutParams4.gravity = g60Var.I2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (g60.G3) {
                layoutParams5.gravity = g60Var.I2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (g60.F3) {
            u30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            u30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) l30Var.getLayoutParams();
        if (g60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = g60Var.I2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (g60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!g60.F3 || g60.G3) {
            ((FrameLayout.LayoutParams) c50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) r30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) c50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) r30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) u30Var.getLayoutParams();
        if (g60.F3) {
            if (((s4.d0) u30Var.getLayoutManager()).o != 1) {
                ((s4.d0) u30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.d0) u30Var.getLayoutManager()).o != 0) {
                ((s4.d0) u30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        i40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) i40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (g40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) g40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (g60.G3) {
            y3 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            y3 = org.telegram.messenger.q.y(8.0f, paddingTop - max, 0);
        }
        if (m50Var.getPaddingTop() != y3 || m50Var.getPaddingBottom() != dp) {
            m50Var.setPadding(i12, y3, i12, dp);
        }
        e60 e60Var = g60Var.B1;
        if (e60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) e60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J0 = g60.J0(g60Var);
            if (J0 != null) {
                int measuredHeight = ((l30Var.getMeasuredHeight() / 2) + l30Var.getTop()) - (g60Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = J0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + y3;
                layoutParams9.topMargin = hg.c.z(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        v50 v50Var = g60Var.U0;
        if (v50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) v50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J02 = g60.J0(g60Var);
            if (J02 != null) {
                layoutParams10.height = J02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = J02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (j5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - y3)) / 2) + y3;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) j5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) j5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) g60Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    j5Var.setVisibility(0);
                    j5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            j5Var.setVisibility(4);
            j5Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i16)).g(y30Var.b, true);
        }
        this.w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.y0) {
            this.y0 = measuredHeight3;
            g60Var.e1(false);
        }
        g60Var.r2.f = getMeasuredWidth();
        g60Var.Z0();
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
        this.D0.R1();
    }
}
