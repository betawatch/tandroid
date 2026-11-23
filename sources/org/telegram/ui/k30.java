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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k30 extends org.telegram.ui.Components.cu0 {
    public boolean g0;
    public final RectF h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final HashMap m0;
    public final /* synthetic */ e40 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.n0 = e40Var;
        this.g0 = false;
        this.h0 = new RectF();
        this.m0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a6  */
    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.g4 g4Var;
        float f12;
        float y10;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.g4 g4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.s sVar;
        boolean z10;
        float x11;
        float f13;
        float f14;
        float f15;
        int i7;
        boolean z11;
        Shader.TileMode tileMode;
        e40 e40Var = this.n0;
        c40 c40Var = e40Var.A3;
        View view = e40Var.J4;
        View view2 = e40Var.I4;
        ArrayList arrayList2 = e40Var.X3;
        nh.h hVar = e40Var.X1;
        Paint paint = e40Var.x2;
        w10 w10Var = e40Var.l4;
        d20 d20Var = e40Var.B4;
        a20 a20Var = e40Var.Z3;
        m30 m30Var = e40Var.L1;
        if (e40Var.r4 || e40Var.E4) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
                if (e40Var.P4 == null) {
                    e40Var.P4 = new RenderNode("CallActivity.Blur");
                    e40Var.Q4 = org.telegram.ui.Components.cu0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.cu0.getBlurRadius();
                    RenderNode renderNode = e40Var.P4;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = e40Var.P4;
                    float f16 = e40Var.Q4;
                    hVar.V0 = renderNode2;
                    hVar.W0 = f16;
                    org.telegram.ui.Components.voip.t0 t0Var = e40Var.o3;
                    t0Var.d = this;
                    t0Var.b = renderNode2;
                    t0Var.c = f16;
                }
                int round = Math.round(getMeasuredWidth() / e40Var.Q4);
                int round2 = Math.round(getMeasuredHeight() / e40Var.Q4);
                e40Var.r4 = true;
                e40Var.P4.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = e40Var.P4.beginRecording();
                float f17 = 1.0f / e40Var.Q4;
                beginRecording.scale(f17, f17);
                dispatchDraw(beginRecording);
                e40Var.P4.endRecording();
                e40Var.r4 = false;
            }
        }
        for (int i10 = 0; i10 < m30Var.getChildCount(); i10++) {
            View childAt = m30Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                z11 = true;
                ((org.telegram.ui.Cells.g4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.s)) {
                if (childAt.getMeasuredWidth() != m30Var.getMeasuredWidth()) {
                    childAt.setTranslationX((m30Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (a20Var.r == null) {
            for (int i11 = 0; i11 < w10Var.getChildCount(); i11++) {
                ((org.telegram.ui.Components.s10) w10Var.getChildAt(i11)).setProgressToFullscreen(1.0f);
            }
        } else if (w10Var.getVisibility() == 0) {
            HashMap hashMap = this.m0;
            hashMap.clear();
            int i12 = 0;
            while (i12 < m30Var.getChildCount()) {
                View childAt2 = m30Var.getChildAt(i12);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.s) {
                        m30Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.s sVar2 = (org.telegram.ui.Components.voip.s) childAt2;
                            i7 = i12;
                            if (sVar2.getRenderer() != a20Var.E) {
                                hashMap.put(sVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i7 = i12;
                    if (childAt2 instanceof org.telegram.ui.Cells.g4) {
                        m30Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.g4 g4Var3 = (org.telegram.ui.Cells.g4) childAt2;
                            hashMap.put(g4Var3.getParticipant(), g4Var3);
                        }
                    }
                } else {
                    i7 = i12;
                }
                i12 = i7 + 1;
            }
            int i13 = 0;
            while (i13 < w10Var.getChildCount()) {
                org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) w10Var.getChildAt(i13);
                View view3 = (View) hashMap.get(s10Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(s10Var.getParticipant());
                }
                float f18 = a20Var.c;
                HashMap hashMap2 = hashMap;
                if (!e40Var.M4.k()) {
                    s10Var.setAlpha(f10);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.s) {
                        org.telegram.ui.Components.voip.s sVar3 = (org.telegram.ui.Components.voip.s) view3;
                        x11 = (m30Var.getX() + sVar3.getLeft()) - a20Var.getLeft();
                        f13 = (m30Var.getY() + sVar3.getTop()) - a20Var.getTop();
                        f14 = w10Var.getX() + s10Var.getLeft();
                        f15 = w10Var.getY() + s10Var.getTop();
                    } else {
                        x11 = ((m30Var.getX() + r14.getLeft()) - a20Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y11 = ((m30Var.getY() + r14.getTop()) - a20Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = w10Var.getX() + s10Var.getLeft() + (s10Var.getMeasuredWidth() >> 1);
                        float y12 = w10Var.getY() + s10Var.getTop() + (s10Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.g4) view3).setDrawAvatar(false);
                        f13 = y11;
                        f14 = x12;
                        f15 = y12;
                    }
                    float f19 = 1.0f - f18;
                    s10Var.setTranslationX((x11 - f14) * f19);
                    s10Var.setTranslationY((f13 - f15) * f19);
                    s10Var.setScaleX(1.0f);
                    s10Var.setScaleY(1.0f);
                    s10Var.setProgressToFullscreen(f18);
                } else {
                    s10Var.setScaleX(1.0f);
                    s10Var.setScaleY(1.0f);
                    s10Var.setTranslationX(0.0f);
                    s10Var.setTranslationY(0.0f);
                    s10Var.setProgressToFullscreen(1.0f);
                    if (s10Var.getRenderer() == null) {
                        s10Var.setAlpha(f18);
                    }
                }
                i13++;
                hashMap = hashMap2;
                f10 = 1.0f;
            }
        }
        int i14 = 0;
        while (i14 < arrayList2.size()) {
            org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) arrayList2.get(i14);
            org.telegram.ui.Components.ek0 ek0Var = e40Var.m4;
            org.telegram.ui.Components.voip.v vVar = zVar.a;
            if (zVar.h || zVar.f || zVar.Q) {
                arrayList = arrayList2;
            } else {
                zVar.z0 = false;
                float f20 = a20Var.c;
                arrayList = arrayList2;
                if (zVar.r || zVar.b) {
                    org.telegram.ui.Components.voip.s sVar4 = zVar.c;
                    org.telegram.ui.Components.voip.s sVar5 = sVar4;
                    if (sVar4 == null && zVar.e == null) {
                        zVar.setTranslationX(0.0f);
                        zVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.s sVar6 = zVar.e;
                        if (sVar6 != null) {
                            sVar5 = sVar6;
                        }
                        if (sVar6 == null) {
                            ek0Var = m30Var;
                        }
                        float x13 = ((ek0Var.getX() + sVar5.getX()) - zVar.getLeft()) - a20Var.getLeft();
                        float y13 = ((ek0Var.getY() + (sVar5.getY() + org.telegram.messenger.g0.L(2.0f))) - zVar.getTop()) - a20Var.getTop();
                        float f21 = 1.0f - f20;
                        float f22 = f20 * 0.0f;
                        zVar.setTranslationX((x13 * f21) + f22);
                        zVar.setTranslationY((y13 * f21) + f22);
                    }
                    vVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                    org.telegram.ui.Components.s10 s10Var2 = zVar.d;
                    if (s10Var2 != null) {
                        s10Var2.setAlpha(f20);
                    }
                    if (!zVar.b && zVar.c == null && zVar.e == null) {
                        zVar.setAlpha(f20);
                    } else if (!zVar.F) {
                        zVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.s10 s10Var3 = zVar.d;
                    if (s10Var3 != null) {
                        w10Var.getClass();
                        if (RecyclerView.R(s10Var3) == -1) {
                            zVar.setAlpha(zVar.d.getAlpha());
                        } else if (zVar.c == null) {
                            if (zVar.w && !zVar.F) {
                                zVar.setAlpha(f20);
                            }
                            zVar.d.setAlpha(f20);
                            f20 = 1.0f;
                        } else {
                            zVar.d.setAlpha(1.0f);
                            if (zVar.w && !zVar.F) {
                                zVar.setAlpha(1.0f);
                            }
                        }
                        zVar.setTranslationX((w10Var.getX() + zVar.d.getX()) - zVar.getLeft());
                        float f23 = 1.0f - f20;
                        zVar.setTranslationY((w10Var.getY() + (zVar.d.getY() + (org.telegram.messenger.g0.L(2.0f) * f23))) - zVar.getTop());
                        vVar.setRoundCorners((org.telegram.messenger.g0.L(8.0f) * f23) + (org.telegram.messenger.g0.L(13.0f) * f20));
                    } else {
                        org.telegram.ui.Components.voip.s sVar7 = zVar.c;
                        org.telegram.ui.Components.voip.s sVar8 = sVar7;
                        if (sVar7 != null || zVar.e != null) {
                            org.telegram.ui.Components.voip.s sVar9 = zVar.e;
                            if (sVar9 == null || sVar8 == null) {
                                org.telegram.ui.Components.voip.s sVar10 = sVar9 != null ? sVar9 : sVar8;
                                if (sVar9 == null) {
                                    ek0Var = m30Var;
                                }
                                sVar8 = sVar10;
                            } else {
                                if (e40.F5) {
                                    sVar = sVar9;
                                    if (!zVar.y.b) {
                                        z10 = true;
                                        if (z10) {
                                            sVar8 = sVar;
                                        }
                                        if (!z10) {
                                            ek0Var = m30Var;
                                        }
                                    }
                                } else {
                                    sVar = sVar9;
                                }
                                z10 = false;
                                if (z10) {
                                }
                                if (!z10) {
                                }
                            }
                            zVar.setTranslationX(((ek0Var.getX() + sVar8.getX()) - zVar.getLeft()) - a20Var.getLeft());
                            zVar.setTranslationY(((ek0Var.getY() + (sVar8.getY() + org.telegram.messenger.g0.L(2.0f))) - zVar.getTop()) - a20Var.getTop());
                            vVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                            if (zVar.w && !zVar.F) {
                                if (!e40.F5) {
                                    zVar.z0 = true;
                                    zVar.setAlpha(sVar8.getAlpha() * (1.0f - f20));
                                } else if (zVar.c != null && zVar.e == null) {
                                    zVar.setAlpha(sVar8.getAlpha() * f20);
                                }
                            }
                        }
                    }
                }
            }
            i14++;
            arrayList2 = arrayList;
        }
        if (e40.F5) {
            f11 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f11 = 1.0f;
            view2.setAlpha(1.0f - a20Var.c);
            view.setAlpha(1.0f - a20Var.c);
        }
        if (a20Var.M0) {
            m30Var.setAlpha(f11 - a20Var.c);
        } else {
            m30Var.setAlpha(f11);
        }
        if (c40Var != null) {
            c40Var.setAlpha(f11 - a20Var.c);
            c40Var.setTranslationY(a20Var.c * org.telegram.messenger.g0.L(64.0f));
        }
        super.dispatchDraw(canvas);
        if (e40Var.E4) {
            return;
        }
        boolean z12 = e40Var.e4;
        RectF rectF = this.h0;
        if (!z12) {
            if (e40Var.W4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), e40Var.V4);
                float y14 = m30Var.getY();
                m30Var.getY();
                m30Var.getMeasuredHeight();
                if (!e40Var.a5) {
                    if (e40Var.Z4 == null) {
                        org.telegram.ui.Components.voip.z zVar2 = e40Var.Y4;
                        if (zVar2 == null || !zVar2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(a20Var.getX() + e40Var.Y4.getX(), a20Var.getY() + e40Var.Y4.getY());
                        e40Var.Y4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(a20Var.getX() + w10Var.getX() + e40Var.Z4.getX(), a20Var.getY() + w10Var.getY() + e40Var.Z4.getY());
                    if (e40Var.Z4.getRenderer() == null || !e40Var.Z4.getRenderer().w || e40Var.Z4.getRenderer().b) {
                        e40Var.Z4.draw(canvas);
                    } else {
                        e40Var.Z4.getRenderer().draw(canvas);
                    }
                    e40Var.Z4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = m30Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt3 = m30Var.getChildAt(i15);
                    if (childAt3 == e40Var.W4) {
                        float max = Math.max(m30Var.getLeft(), childAt3.getX() + m30Var.getLeft());
                        float max2 = Math.max(y14, childAt3.getY() + m30Var.getY());
                        float min = Math.min(m30Var.getRight(), childAt3.getX() + m30Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(m30Var.getY() + m30Var.getMeasuredHeight(), childAt3.getY() + m30Var.getY() + e40Var.W4.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + m30Var.getLeft(), childAt3.getY() + m30Var.getY());
                            float alpha = e40Var.V4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((e40Var.W4.getClipHeight() - e40Var.W4.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.kr.g.getInterpolation(1.0f - alpha))) + e40Var.W4.getMeasuredHeight()));
                            org.telegram.ui.Cells.g4 g4Var4 = e40Var.W4;
                            paint.getColor();
                            org.telegram.ui.ActionBar.n5[] n5VarArr = g4Var4.d;
                            if (TextUtils.isEmpty(n5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            n5VarArr[4].setFullAlpha(alpha);
                            n5VarArr[4].h(0, 0);
                            g4Var4.invalidate();
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
        if (e40Var.W4 != null) {
            if (e40Var.f4) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), e40Var.V4);
            }
            float y15 = m30Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = m30Var.getChildCount();
            float y16 = m30Var.getY() + m30Var.getMeasuredHeight();
            if (e40Var.a5) {
                int i16 = 0;
                while (true) {
                    if (i16 >= childCount2) {
                        g4Var = null;
                        break;
                    }
                    View childAt4 = m30Var.getChildAt(i16);
                    g4Var = e40Var.W4;
                    if (childAt4 == g4Var) {
                        break;
                    } else {
                        i16++;
                    }
                }
            } else {
                g4Var = e40Var.W4;
            }
            if (g4Var != null && y15 < y16) {
                canvas3.save();
                if (e40Var.Z4 == null) {
                    f12 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - e40Var.c4) * y15, getMeasuredWidth(), (e40Var.c4 * getMeasuredHeight()) + ((1.0f - e40Var.c4) * y16));
                } else {
                    f12 = 255.0f;
                }
                if (e40Var.a5) {
                    y10 = ((1.0f - e40Var.c4) * (g4Var.getY() + m30Var.getY())) + (e40Var.c4 * (d20Var.getMeasuredWidth() + d20Var.getTop()));
                    x10 = ((1.0f - e40Var.c4) * (g4Var.getX() + m30Var.getLeft())) + (e40Var.c4 * d20Var.getLeft());
                } else {
                    y10 = d20Var.getMeasuredWidth() + d20Var.getTop();
                    x10 = d20Var.getLeft();
                }
                float f24 = y10;
                canvas3.translate(x10, f24);
                if (e40Var.a5) {
                    fArr = fArr2;
                    path = path2;
                    g4Var2 = g4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    g4Var2 = g4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, g4Var.getMeasuredWidth(), g4Var.getClipHeight(), (int) (e40Var.c4 * f12), 31);
                }
                float clipHeight = (int) (((g4Var2.getClipHeight() - g4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.kr.g.getInterpolation(1.0f - e40Var.c4))) + g4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, g4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.g4 g4Var5 = g4Var2;
                g4Var5.setProgressToAvatarPreview(e40Var.a5 ? e40Var.c4 : 1.0f);
                for (int i17 = 0; i17 < 4; i17++) {
                    fArr[i17] = (1.0f - e40Var.c4) * org.telegram.messenger.g0.L(13.0f);
                    fArr[i17 + 4] = org.telegram.messenger.g0.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                g4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (e40Var.d4 != null) {
                    float f25 = f24 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - e40Var.d4.getMeasuredWidth()) - org.telegram.messenger.g0.L(14.0f);
                    if (e40Var.c4 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f25, e40Var.d4.getMeasuredWidth() + measuredWidth, e40Var.d4.getMeasuredHeight() + f25, (int) (e40Var.c4 * f12), 31);
                    } else {
                        canvas3.save();
                    }
                    e40Var.d4.setTranslationX(measuredWidth - r4.getLeft());
                    e40Var.d4.setTranslationY(f25 - r4.getTop());
                    float f26 = (e40Var.c4 * 0.2f) + 0.8f;
                    canvas3.scale(f26, f26, (e40Var.d4.getMeasuredWidth() / 2.0f) + measuredWidth, f25);
                    canvas3.translate(measuredWidth, f25);
                    e40Var.d4.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (e40Var.b4.n) {
                return;
            }
            canvas3.save();
            if (e40Var.a5 && e40Var.Z4 == null) {
                canvas3.clipRect(0.0f, (1.0f - e40Var.c4) * y15, getMeasuredWidth(), (e40Var.c4 * getMeasuredHeight()) + ((1.0f - e40Var.c4) * y16));
            }
            canvas3.scale(d20Var.getScaleX(), d20Var.getScaleY(), d20Var.getX(), d20Var.getY());
            canvas3.translate(d20Var.getX(), d20Var.getY());
            d20Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        e40 e40Var = this.n0;
        n10 n10Var = e40Var.p1;
        w10 w10Var = e40Var.l4;
        m30 m30Var = e40Var.L1;
        a20 a20Var = e40Var.Z3;
        if (e40Var.r4) {
            if (view == m30Var) {
                int childCount = m30Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = m30Var.getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == a20Var || view == n10Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (e40.F5 || a20Var.c != 1.0f || (view != e40Var.J1 && view != e40Var.b2 && view != e40Var.I1 && view != e40Var.Z2 && view != e40Var.y3 && view != e40Var.P2)) {
            if (e40Var.E4 && view == a20Var) {
                canvas.save();
                canvas.translate(w10Var.getX() + a20Var.getX(), w10Var.getY() + a20Var.getY());
                w10Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != e40Var.B4 && view != e40Var.d4 && view != e40Var.W4 && (!e40Var.k4 || !e40Var.f4 || (view != m30Var && view != n10Var && view != e40Var.X1 && view != e40Var.o3))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n0.U1.Q();
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n0.U1.S();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        e40 e40Var = this.n0;
        ImageReceiver imageReceiver = e40Var.U1;
        Drawable drawable = e40Var.a2;
        a20 a20Var = e40Var.Z3;
        float f11 = e40Var.t2 - L;
        int L2 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = e40Var.t0;
        int i10 = L2 + i7;
        if (i7 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - e40Var.t0) / ((L - e40Var.t0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        e40Var.Y1();
        if (a20Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.n6.t0.setColor(e40Var.U3);
                float f12 = e40Var.u0;
                float f13 = e40Var.t0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - e40Var.u0;
                float L3 = e40Var.t0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.h0;
                rectF.set(f12, f13, measuredWidth, L3);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.n6.t0);
            }
            org.telegram.ui.ActionBar.n6.t0.setColor(Color.argb((int) (e40Var.J1.getAlpha() * 255.0f), (int) (Color.red(e40Var.U3) * 0.8f), (int) (Color.green(e40Var.U3) * 0.8f), (int) (Color.blue(e40Var.U3) * 0.8f)));
            canvas.drawRect(e40Var.u0, 0.0f, getMeasuredWidth() - e40Var.u0, (int) ((1.0f - e40Var.T0) * e40Var.h0), org.telegram.ui.ActionBar.n6.t0);
            v20 v20Var = e40Var.u2;
            if (v20Var != null) {
                org.telegram.ui.ActionBar.n6.t0.setColor(v20Var.getBackgroundColor());
                canvas.drawRect(e40Var.u0, 0.0f, getMeasuredWidth() - e40Var.u0, (int) ((1.0f - e40Var.T0) * e40Var.h0), org.telegram.ui.ActionBar.n6.t0);
            }
        }
        if (a20Var.c != 0.0f) {
            org.telegram.ui.ActionBar.n6.t0.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xg, false), (int) (a20Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.n6.t0);
        }
        if (e40Var.v1() && org.telegram.messenger.pc.e(512)) {
            if (a20Var.c < 0.15d) {
                if (!e40Var.y4) {
                    e40Var.y4 = true;
                    e40Var.F1();
                }
            } else if (e40Var.y4) {
                e40Var.y4 = false;
                org.telegram.messenger.g0.r(e40Var.z4);
            }
        }
        imageReceiver.z0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e40 e40Var = this.n0;
        d20 d20Var = e40Var.B4;
        if (e40Var.W4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = e40Var.d4.getX();
            float y11 = e40Var.d4.getY();
            float x12 = e40Var.d4.getX() + e40Var.d4.getMeasuredWidth();
            float y12 = e40Var.d4.getY() + e40Var.d4.getMeasuredHeight();
            RectF rectF = this.h0;
            rectF.set(x11, y11, x12, y12);
            boolean z10 = !rectF.contains(x10, y10);
            rectF.set(d20Var.getX(), d20Var.getY(), d20Var.getX() + d20Var.getMeasuredWidth(), d20Var.getY() + d20Var.getMeasuredWidth() + e40Var.W4.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z10 = false;
            }
            if (z10) {
                e40Var.g1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || e40Var.t2 == 0.0f || motionEvent.getY() >= e40Var.t2 - org.telegram.messenger.g0.L(37.0f) || e40Var.J1.getAlpha() != 0.0f || e40Var.e4 || e40Var.u2 != null || e40Var.Z3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        e40Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        e40 e40Var = this.n0;
        if (e40Var.W4 == null || i7 != 4) {
            return super.onKeyDown(i7, keyEvent);
        }
        e40Var.g1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.cu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        int P0;
        e40 e40Var = this.n0;
        View view = e40Var.J4;
        View view2 = e40Var.I4;
        n10 n10Var = e40Var.p1;
        c40 c40Var = e40Var.A3;
        a20 a20Var = e40Var.Z3;
        m30 m30Var = e40Var.L1;
        if (e40.F5 && this.k0 != e40Var.H4 && this.l0) {
            f10 = m30Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f10 = 0.0f;
        }
        this.k0 = e40Var.H4;
        a20Var.s = true;
        super.onLayout(z10, i7, i10, i11, i12);
        a20Var.s = false;
        e40.Q0(e40Var);
        this.l0 = true;
        if (c40Var != null && (P0 = e40.P0(e40Var, m30Var.getPaddingTop())) != Integer.MIN_VALUE && P0 != ((FrameLayout.LayoutParams) c40Var.getLayoutParams()).topMargin) {
            post(new kz(this, 6));
        }
        if (!z11 || m30Var.getLeft() == f10) {
            return;
        }
        float left = f10 - m30Var.getLeft();
        m30Var.setTranslationX(left);
        n10Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = m30Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f;
        duration.setInterpolator(krVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(krVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(krVar).start();
        n10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(krVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        float f10;
        int L;
        float f11;
        int i11;
        int b10;
        int i12;
        e40 e40Var = this.n0;
        l20 l20Var = e40Var.B1;
        t10 t10Var = e40Var.I1;
        LinearLayout linearLayout = e40Var.y3;
        c30 c30Var = e40Var.J1;
        h40 h40Var = e40Var.n4;
        org.telegram.ui.Components.t10 t10Var2 = e40Var.o4;
        org.telegram.ui.Components.uy uyVar = e40Var.T1;
        org.telegram.ui.Components.voip.r2 r2Var = e40Var.w1;
        org.telegram.ui.ActionBar.n5 n5Var = e40Var.P1;
        View view = e40Var.b2;
        View view2 = e40Var.J4;
        View view3 = e40Var.I4;
        ArrayList arrayList = e40Var.X3;
        org.telegram.ui.ActionBar.n5 n5Var2 = e40Var.R1;
        j20 j20Var = e40Var.C1;
        ArrayList arrayList2 = e40Var.Y3;
        org.telegram.ui.Components.ek0 ek0Var = e40Var.m4;
        m30 m30Var = e40Var.L1;
        a20 a20Var = e40Var.Z3;
        w10 w10Var = e40Var.l4;
        int size = View.MeasureSpec.getSize(i10);
        this.g0 = true;
        boolean z11 = View.MeasureSpec.getSize(i7) > size && !org.telegram.messenger.g0.Q1();
        LaunchActivity launchActivity = e40Var.d2;
        if (launchActivity != null && org.telegram.messenger.g0.H1(launchActivity)) {
            z11 = e40.E5;
        }
        View.MeasureSpec.getSize(i7);
        a20Var.getClass();
        boolean z12 = org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i7) > size && !e40Var.v1();
        if (e40.E5 != z11) {
            e40.E5 = z11;
            if (r2Var.getMeasuredWidth() == 0) {
                int i13 = r2Var.getLayoutParams().width;
            }
            if (e40Var.v1()) {
                boolean z13 = (!a20Var.W && a20Var.b && (e40.E5 == e40Var.u1() || org.telegram.messenger.g0.Q1())) ? false : true;
                Boolean bool = e40Var.i4;
                if (bool == null || z13 != bool.booleanValue()) {
                    int systemUiVisibility = e40Var.b.getSystemUiVisibility();
                    boolean z14 = z13;
                    if (z14) {
                        i12 = systemUiVisibility & (-7);
                        e40Var.getWindow().clearFlags(1024);
                        e40Var.B0(false);
                    } else {
                        e40Var.B0(true);
                        i12 = systemUiVisibility | 6;
                        e40Var.getWindow().addFlags(1024);
                    }
                    e40Var.b.setSystemUiVisibility(i12);
                    e40Var.i4 = Boolean.valueOf(z14);
                    e40Var.R4 = !z14;
                    e40Var.b.requestApplyInsets();
                }
            } else {
                e40Var.W = false;
            }
            uyVar.y1(e40.E5 ? 6 : 2);
            m30Var.a0();
            w10Var.a0();
            this.j0 = true;
            TextView textView = e40Var.N1;
            if (textView != null) {
                textView.setVisibility(!e40.E5 ? 0 : 8);
            }
            if (e40Var.u1() == z11 && e40Var.v1() && !a20Var.b && !e40Var.V2.f.isEmpty()) {
                e40Var.i1((org.telegram.messenger.u3) e40Var.V2.f.get(0));
                a20Var.e();
            }
        }
        if (e40.F5 != z12) {
            e40.F5 = z12;
            ek0Var.setVisibility(z12 ? 0 : 8);
            m30Var.a0();
            w10Var.a0();
            z10 = true;
            this.j0 = true;
        } else {
            z10 = true;
        }
        if (this.j0) {
            e40Var.R0(z10);
            e40Var.K1.f();
            t10Var2.G(ek0Var, false);
            if (e40.F5) {
                h40Var.I(ek0Var, false);
            }
            ek0Var.setVisibility(e40.F5 ? 0 : 8);
            h40Var.H(ek0Var, e40.F5 && !a20Var.b, true);
            boolean z15 = e40.F5;
            e40Var.O4 = !z15 || a20Var.b;
            boolean z16 = !z15 && a20Var.b;
            t10Var2.F(w10Var, z16);
            w10Var.setVisibility(z16 ? 0 : 8);
            m30Var.setVisibility((e40.F5 || !a20Var.b) ? 0 : 8);
            uyVar.y1(e40.E5 ? 6 : 2);
            e40Var.V1(false, false);
            m30Var.a0();
            w10Var.a0();
            org.telegram.messenger.g0.Z3(m30Var);
            this.j0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            a20Var.setIsTablet(e40.F5);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.z) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (e40Var.v1() ? org.telegram.messenger.g0.L(72.0f) : org.telegram.messenger.g0.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a20Var.getLayoutParams();
        if (e40.F5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e40Var.e2[i15].getLayoutParams();
            if (e40.F5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (ek0Var != null) {
            ((FrameLayout.LayoutParams) ek0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (j20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) j20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = org.telegram.messenger.g0.L(e40Var.v1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) m30Var.getLayoutParams();
        if (e40.F5) {
            layoutParams3.gravity = e40Var.H4 ? 5 : 1;
            layoutParams3.width = org.telegram.messenger.g0.L(320.0f);
            int L3 = org.telegram.messenger.g0.L(4.0f);
            layoutParams3.leftMargin = L3;
            layoutParams3.rightMargin = L3;
            layoutParams3.bottomMargin = L2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            L = org.telegram.messenger.g0.L(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (e40.E5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = org.telegram.messenger.g0.L(14.0f);
                layoutParams3.rightMargin = org.telegram.messenger.g0.L(90.0f);
                layoutParams3.leftMargin = org.telegram.messenger.g0.L(14.0f);
                L = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L = org.telegram.messenger.g0.L(60.0f);
                layoutParams3.bottomMargin = L2;
                layoutParams3.topMargin = org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L4 = org.telegram.messenger.g0.L(14.0f);
                layoutParams3.leftMargin = L4;
                layoutParams3.rightMargin = L4;
            }
        }
        if (!e40.E5 || e40.F5) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (e40.F5) {
                layoutParams4.gravity = e40Var.H4 ? 85 : 81;
                layoutParams4.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (e40.F5) {
                layoutParams5.gravity = e40Var.H4 ? 85 : 81;
                layoutParams5.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (e40.E5) {
            w10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            w10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) e40Var.p1.getLayoutParams();
        if (e40.F5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = e40Var.H4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (e40.E5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!e40.E5 || e40.F5) {
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) t10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) t10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) w10Var.getLayoutParams();
        if (e40.E5) {
            if (((v4.c0) w10Var.getLayoutManager()).o != 1) {
                ((v4.c0) w10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((v4.c0) w10Var.getLayoutManager()).o != 0) {
                ((v4.c0) w10Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.g0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        l20Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) l20Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (j20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) j20Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.g0.L(259.0f), (paddingTop / 5) * 3);
        if (e40.F5) {
            b10 = 0;
            i11 = 0;
        } else {
            i11 = 0;
            b10 = org.telegram.messenger.f3.b(8.0f, paddingTop - max, 0);
        }
        if (m30Var.getPaddingTop() != b10 || m30Var.getPaddingBottom() != L) {
            m30Var.setPadding(i11, b10, i11, L);
        }
        c40 c40Var = e40Var.A3;
        if (c40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) c40Var.getLayoutParams();
            int P0 = e40.P0(e40Var, b10);
            if (P0 != Integer.MIN_VALUE) {
                layoutParams9.topMargin = P0;
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        t30 t30Var = e40Var.P2;
        if (t30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) t30Var.getLayoutParams();
            org.telegram.ui.Components.voip.s h12 = e40Var.h1();
            if (h12 != null) {
                layoutParams10.height = h12.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = h12.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
                int L5 = org.telegram.messenger.g0.L(16.0f);
                layoutParams10.leftMargin = L5;
                layoutParams10.rightMargin = L5;
            }
        }
        if (n5Var2 != null) {
            int L6 = ((org.telegram.messenger.g0.L(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
            layoutParams11.topMargin = L6 - org.telegram.messenger.g0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) n5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.g0.L(80.0f) + L6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) e40Var.Q1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.g0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.g0.L(231.0f)) {
                    n5Var.setVisibility(0);
                    n5Var2.setVisibility(0);
                    layoutParams13.topMargin = L6;
                }
            }
            n5Var.setVisibility(4);
            n5Var2.setVisibility(4);
            layoutParams13.topMargin = L6 - org.telegram.messenger.g0.L(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.z) arrayList.get(i16)).g(a20Var.b, true);
        }
        this.g0 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.i0) {
            this.i0 = measuredHeight;
            e40Var.g1(false);
        }
        e40Var.q4.f = getMeasuredWidth();
        e40Var.b1();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.n0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.n0.Y1();
    }
}
