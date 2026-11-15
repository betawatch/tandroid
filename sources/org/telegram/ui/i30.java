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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i30 extends org.telegram.ui.Components.st0 {
    public boolean g0;
    public final RectF h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final HashMap m0;
    public final /* synthetic */ c40 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.n0 = c40Var;
        this.g0 = false;
        this.h0 = new RectF();
        this.m0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a6  */
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
        boolean z10;
        float x11;
        float f13;
        float f14;
        float f15;
        int i7;
        boolean z11;
        Shader.TileMode tileMode;
        c40 c40Var = this.n0;
        a40 a40Var = c40Var.A3;
        View view = c40Var.J4;
        View view2 = c40Var.I4;
        ArrayList arrayList2 = c40Var.X3;
        nh.h hVar = c40Var.X1;
        Paint paint = c40Var.x2;
        u10 u10Var = c40Var.l4;
        b20 b20Var = c40Var.B4;
        y10 y10Var = c40Var.Z3;
        k30 k30Var = c40Var.L1;
        if (c40Var.r4 || c40Var.E4) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
                if (c40Var.P4 == null) {
                    c40Var.P4 = new RenderNode("CallActivity.Blur");
                    c40Var.Q4 = org.telegram.ui.Components.st0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.st0.getBlurRadius();
                    RenderNode renderNode = c40Var.P4;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = c40Var.P4;
                    float f16 = c40Var.Q4;
                    hVar.V0 = renderNode2;
                    hVar.W0 = f16;
                    org.telegram.ui.Components.voip.t0 t0Var = c40Var.o3;
                    t0Var.d = this;
                    t0Var.b = renderNode2;
                    t0Var.c = f16;
                }
                int round = Math.round(getMeasuredWidth() / c40Var.Q4);
                int round2 = Math.round(getMeasuredHeight() / c40Var.Q4);
                c40Var.r4 = true;
                c40Var.P4.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = c40Var.P4.beginRecording();
                float f17 = 1.0f / c40Var.Q4;
                beginRecording.scale(f17, f17);
                dispatchDraw(beginRecording);
                c40Var.P4.endRecording();
                c40Var.r4 = false;
            }
        }
        for (int i10 = 0; i10 < k30Var.getChildCount(); i10++) {
            View childAt = k30Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                z11 = true;
                ((org.telegram.ui.Cells.f4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.r)) {
                if (childAt.getMeasuredWidth() != k30Var.getMeasuredWidth()) {
                    childAt.setTranslationX((k30Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (y10Var.r == null) {
            for (int i11 = 0; i11 < u10Var.getChildCount(); i11++) {
                ((org.telegram.ui.Components.k10) u10Var.getChildAt(i11)).setProgressToFullscreen(1.0f);
            }
        } else if (u10Var.getVisibility() == 0) {
            HashMap hashMap = this.m0;
            hashMap.clear();
            int i12 = 0;
            while (i12 < k30Var.getChildCount()) {
                View childAt2 = k30Var.getChildAt(i12);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.r) {
                        k30Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) childAt2;
                            i7 = i12;
                            if (rVar2.getRenderer() != y10Var.E) {
                                hashMap.put(rVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i7 = i12;
                    if (childAt2 instanceof org.telegram.ui.Cells.f4) {
                        k30Var.getClass();
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
            while (i13 < u10Var.getChildCount()) {
                org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) u10Var.getChildAt(i13);
                View view3 = (View) hashMap.get(k10Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(k10Var.getParticipant());
                }
                float f18 = y10Var.c;
                HashMap hashMap2 = hashMap;
                if (!c40Var.M4.k()) {
                    k10Var.setAlpha(f10);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.r) {
                        org.telegram.ui.Components.voip.r rVar3 = (org.telegram.ui.Components.voip.r) view3;
                        x11 = (k30Var.getX() + rVar3.getLeft()) - y10Var.getLeft();
                        f13 = (k30Var.getY() + rVar3.getTop()) - y10Var.getTop();
                        f14 = u10Var.getX() + k10Var.getLeft();
                        f15 = u10Var.getY() + k10Var.getTop();
                    } else {
                        x11 = ((k30Var.getX() + r14.getLeft()) - y10Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y11 = ((k30Var.getY() + r14.getTop()) - y10Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = u10Var.getX() + k10Var.getLeft() + (k10Var.getMeasuredWidth() >> 1);
                        float y12 = u10Var.getY() + k10Var.getTop() + (k10Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.f4) view3).setDrawAvatar(false);
                        f13 = y11;
                        f14 = x12;
                        f15 = y12;
                    }
                    float f19 = 1.0f - f18;
                    k10Var.setTranslationX((x11 - f14) * f19);
                    k10Var.setTranslationY((f13 - f15) * f19);
                    k10Var.setScaleX(1.0f);
                    k10Var.setScaleY(1.0f);
                    k10Var.setProgressToFullscreen(f18);
                } else {
                    k10Var.setScaleX(1.0f);
                    k10Var.setScaleY(1.0f);
                    k10Var.setTranslationX(0.0f);
                    k10Var.setTranslationY(0.0f);
                    k10Var.setProgressToFullscreen(1.0f);
                    if (k10Var.getRenderer() == null) {
                        k10Var.setAlpha(f18);
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
            org.telegram.ui.Components.uj0 uj0Var = c40Var.m4;
            org.telegram.ui.Components.voip.v vVar = zVar.a;
            if (zVar.h || zVar.f || zVar.Q) {
                arrayList = arrayList2;
            } else {
                zVar.z0 = false;
                float f20 = y10Var.c;
                arrayList = arrayList2;
                if (zVar.r || zVar.b) {
                    org.telegram.ui.Components.voip.r rVar4 = zVar.c;
                    org.telegram.ui.Components.voip.r rVar5 = rVar4;
                    if (rVar4 == null && zVar.e == null) {
                        zVar.setTranslationX(0.0f);
                        zVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.r rVar6 = zVar.e;
                        if (rVar6 != null) {
                            rVar5 = rVar6;
                        }
                        if (rVar6 == null) {
                            uj0Var = k30Var;
                        }
                        float x13 = ((uj0Var.getX() + rVar5.getX()) - zVar.getLeft()) - y10Var.getLeft();
                        float y13 = ((uj0Var.getY() + (rVar5.getY() + org.telegram.messenger.g0.L(2.0f))) - zVar.getTop()) - y10Var.getTop();
                        float f21 = 1.0f - f20;
                        float f22 = f20 * 0.0f;
                        zVar.setTranslationX((x13 * f21) + f22);
                        zVar.setTranslationY((y13 * f21) + f22);
                    }
                    vVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                    org.telegram.ui.Components.k10 k10Var2 = zVar.d;
                    if (k10Var2 != null) {
                        k10Var2.setAlpha(f20);
                    }
                    if (!zVar.b && zVar.c == null && zVar.e == null) {
                        zVar.setAlpha(f20);
                    } else if (!zVar.F) {
                        zVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.k10 k10Var3 = zVar.d;
                    if (k10Var3 != null) {
                        u10Var.getClass();
                        if (RecyclerView.R(k10Var3) == -1) {
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
                        zVar.setTranslationX((u10Var.getX() + zVar.d.getX()) - zVar.getLeft());
                        float f23 = 1.0f - f20;
                        zVar.setTranslationY((u10Var.getY() + (zVar.d.getY() + (org.telegram.messenger.g0.L(2.0f) * f23))) - zVar.getTop());
                        vVar.setRoundCorners((org.telegram.messenger.g0.L(8.0f) * f23) + (org.telegram.messenger.g0.L(13.0f) * f20));
                    } else {
                        org.telegram.ui.Components.voip.r rVar7 = zVar.c;
                        org.telegram.ui.Components.voip.r rVar8 = rVar7;
                        if (rVar7 != null || zVar.e != null) {
                            org.telegram.ui.Components.voip.r rVar9 = zVar.e;
                            if (rVar9 == null || rVar8 == null) {
                                org.telegram.ui.Components.voip.r rVar10 = rVar9 != null ? rVar9 : rVar8;
                                if (rVar9 == null) {
                                    uj0Var = k30Var;
                                }
                                rVar8 = rVar10;
                            } else {
                                if (c40.F5) {
                                    rVar = rVar9;
                                    if (!zVar.y.b) {
                                        z10 = true;
                                        if (z10) {
                                            rVar8 = rVar;
                                        }
                                        if (!z10) {
                                            uj0Var = k30Var;
                                        }
                                    }
                                } else {
                                    rVar = rVar9;
                                }
                                z10 = false;
                                if (z10) {
                                }
                                if (!z10) {
                                }
                            }
                            zVar.setTranslationX(((uj0Var.getX() + rVar8.getX()) - zVar.getLeft()) - y10Var.getLeft());
                            zVar.setTranslationY(((uj0Var.getY() + (rVar8.getY() + org.telegram.messenger.g0.L(2.0f))) - zVar.getTop()) - y10Var.getTop());
                            vVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                            if (zVar.w && !zVar.F) {
                                if (!c40.F5) {
                                    zVar.z0 = true;
                                    zVar.setAlpha(rVar8.getAlpha() * (1.0f - f20));
                                } else if (zVar.c != null && zVar.e == null) {
                                    zVar.setAlpha(rVar8.getAlpha() * f20);
                                }
                            }
                        }
                    }
                }
            }
            i14++;
            arrayList2 = arrayList;
        }
        if (c40.F5) {
            f11 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f11 = 1.0f;
            view2.setAlpha(1.0f - y10Var.c);
            view.setAlpha(1.0f - y10Var.c);
        }
        if (y10Var.M0) {
            k30Var.setAlpha(f11 - y10Var.c);
        } else {
            k30Var.setAlpha(f11);
        }
        if (a40Var != null) {
            a40Var.setAlpha(f11 - y10Var.c);
            a40Var.setTranslationY(y10Var.c * org.telegram.messenger.g0.L(64.0f));
        }
        super.dispatchDraw(canvas);
        if (c40Var.E4) {
            return;
        }
        boolean z12 = c40Var.e4;
        RectF rectF = this.h0;
        if (!z12) {
            if (c40Var.W4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), c40Var.V4);
                float y14 = k30Var.getY();
                k30Var.getY();
                k30Var.getMeasuredHeight();
                if (!c40Var.a5) {
                    if (c40Var.Z4 == null) {
                        org.telegram.ui.Components.voip.z zVar2 = c40Var.Y4;
                        if (zVar2 == null || !zVar2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(y10Var.getX() + c40Var.Y4.getX(), y10Var.getY() + c40Var.Y4.getY());
                        c40Var.Y4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(y10Var.getX() + u10Var.getX() + c40Var.Z4.getX(), y10Var.getY() + u10Var.getY() + c40Var.Z4.getY());
                    if (c40Var.Z4.getRenderer() == null || !c40Var.Z4.getRenderer().w || c40Var.Z4.getRenderer().b) {
                        c40Var.Z4.draw(canvas);
                    } else {
                        c40Var.Z4.getRenderer().draw(canvas);
                    }
                    c40Var.Z4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = k30Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt3 = k30Var.getChildAt(i15);
                    if (childAt3 == c40Var.W4) {
                        float max = Math.max(k30Var.getLeft(), childAt3.getX() + k30Var.getLeft());
                        float max2 = Math.max(y14, childAt3.getY() + k30Var.getY());
                        float min = Math.min(k30Var.getRight(), childAt3.getX() + k30Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(k30Var.getY() + k30Var.getMeasuredHeight(), childAt3.getY() + k30Var.getY() + c40Var.W4.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + k30Var.getLeft(), childAt3.getY() + k30Var.getY());
                            float alpha = c40Var.V4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((c40Var.W4.getClipHeight() - c40Var.W4.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.er.g.getInterpolation(1.0f - alpha))) + c40Var.W4.getMeasuredHeight()));
                            org.telegram.ui.Cells.f4 f4Var4 = c40Var.W4;
                            paint.getColor();
                            org.telegram.ui.ActionBar.j5[] j5VarArr = f4Var4.d;
                            if (TextUtils.isEmpty(j5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            j5VarArr[4].setFullAlpha(alpha);
                            j5VarArr[4].h(0, 0);
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
        if (c40Var.W4 != null) {
            if (c40Var.f4) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), c40Var.V4);
            }
            float y15 = k30Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = k30Var.getChildCount();
            float y16 = k30Var.getY() + k30Var.getMeasuredHeight();
            if (c40Var.a5) {
                int i16 = 0;
                while (true) {
                    if (i16 >= childCount2) {
                        f4Var = null;
                        break;
                    }
                    View childAt4 = k30Var.getChildAt(i16);
                    f4Var = c40Var.W4;
                    if (childAt4 == f4Var) {
                        break;
                    } else {
                        i16++;
                    }
                }
            } else {
                f4Var = c40Var.W4;
            }
            if (f4Var != null && y15 < y16) {
                canvas3.save();
                if (c40Var.Z4 == null) {
                    f12 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - c40Var.c4) * y15, getMeasuredWidth(), (c40Var.c4 * getMeasuredHeight()) + ((1.0f - c40Var.c4) * y16));
                } else {
                    f12 = 255.0f;
                }
                if (c40Var.a5) {
                    y10 = ((1.0f - c40Var.c4) * (f4Var.getY() + k30Var.getY())) + (c40Var.c4 * (b20Var.getMeasuredWidth() + b20Var.getTop()));
                    x10 = ((1.0f - c40Var.c4) * (f4Var.getX() + k30Var.getLeft())) + (c40Var.c4 * b20Var.getLeft());
                } else {
                    y10 = b20Var.getMeasuredWidth() + b20Var.getTop();
                    x10 = b20Var.getLeft();
                }
                float f24 = y10;
                canvas3.translate(x10, f24);
                if (c40Var.a5) {
                    fArr = fArr2;
                    path = path2;
                    f4Var2 = f4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    f4Var2 = f4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, f4Var.getMeasuredWidth(), f4Var.getClipHeight(), (int) (c40Var.c4 * f12), 31);
                }
                float clipHeight = (int) (((f4Var2.getClipHeight() - f4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.er.g.getInterpolation(1.0f - c40Var.c4))) + f4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, f4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.f4 f4Var5 = f4Var2;
                f4Var5.setProgressToAvatarPreview(c40Var.a5 ? c40Var.c4 : 1.0f);
                for (int i17 = 0; i17 < 4; i17++) {
                    fArr[i17] = (1.0f - c40Var.c4) * org.telegram.messenger.g0.L(13.0f);
                    fArr[i17 + 4] = org.telegram.messenger.g0.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                f4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (c40Var.d4 != null) {
                    float f25 = f24 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - c40Var.d4.getMeasuredWidth()) - org.telegram.messenger.g0.L(14.0f);
                    if (c40Var.c4 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f25, c40Var.d4.getMeasuredWidth() + measuredWidth, c40Var.d4.getMeasuredHeight() + f25, (int) (c40Var.c4 * f12), 31);
                    } else {
                        canvas3.save();
                    }
                    c40Var.d4.setTranslationX(measuredWidth - r4.getLeft());
                    c40Var.d4.setTranslationY(f25 - r4.getTop());
                    float f26 = (c40Var.c4 * 0.2f) + 0.8f;
                    canvas3.scale(f26, f26, (c40Var.d4.getMeasuredWidth() / 2.0f) + measuredWidth, f25);
                    canvas3.translate(measuredWidth, f25);
                    c40Var.d4.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (c40Var.b4.n) {
                return;
            }
            canvas3.save();
            if (c40Var.a5 && c40Var.Z4 == null) {
                canvas3.clipRect(0.0f, (1.0f - c40Var.c4) * y15, getMeasuredWidth(), (c40Var.c4 * getMeasuredHeight()) + ((1.0f - c40Var.c4) * y16));
            }
            canvas3.scale(b20Var.getScaleX(), b20Var.getScaleY(), b20Var.getX(), b20Var.getY());
            canvas3.translate(b20Var.getX(), b20Var.getY());
            b20Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        c40 c40Var = this.n0;
        l10 l10Var = c40Var.p1;
        u10 u10Var = c40Var.l4;
        k30 k30Var = c40Var.L1;
        y10 y10Var = c40Var.Z3;
        if (c40Var.r4) {
            if (view == k30Var) {
                int childCount = k30Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = k30Var.getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == y10Var || view == l10Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (c40.F5 || y10Var.c != 1.0f || (view != c40Var.J1 && view != c40Var.b2 && view != c40Var.I1 && view != c40Var.Z2 && view != c40Var.y3 && view != c40Var.P2)) {
            if (c40Var.E4 && view == y10Var) {
                canvas.save();
                canvas.translate(u10Var.getX() + y10Var.getX(), u10Var.getY() + y10Var.getY());
                u10Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != c40Var.B4 && view != c40Var.d4 && view != c40Var.W4 && (!c40Var.k4 || !c40Var.f4 || (view != k30Var && view != l10Var && view != c40Var.X1 && view != c40Var.o3))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n0.U1.P();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n0.U1.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        c40 c40Var = this.n0;
        ImageReceiver imageReceiver = c40Var.U1;
        Drawable drawable = c40Var.a2;
        y10 y10Var = c40Var.Z3;
        float f11 = c40Var.t2 - L;
        int L2 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = c40Var.t0;
        int i10 = L2 + i7;
        if (i7 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - c40Var.t0) / ((L - c40Var.t0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        c40Var.Y1();
        if (y10Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.j6.t0.setColor(c40Var.U3);
                float f12 = c40Var.u0;
                float f13 = c40Var.t0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - c40Var.u0;
                float L3 = c40Var.t0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.h0;
                rectF.set(f12, f13, measuredWidth, L3);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.j6.t0);
            }
            org.telegram.ui.ActionBar.j6.t0.setColor(Color.argb((int) (c40Var.J1.getAlpha() * 255.0f), (int) (Color.red(c40Var.U3) * 0.8f), (int) (Color.green(c40Var.U3) * 0.8f), (int) (Color.blue(c40Var.U3) * 0.8f)));
            canvas.drawRect(c40Var.u0, 0.0f, getMeasuredWidth() - c40Var.u0, (int) ((1.0f - c40Var.T0) * c40Var.h0), org.telegram.ui.ActionBar.j6.t0);
            t20 t20Var = c40Var.u2;
            if (t20Var != null) {
                org.telegram.ui.ActionBar.j6.t0.setColor(t20Var.getBackgroundColor());
                canvas.drawRect(c40Var.u0, 0.0f, getMeasuredWidth() - c40Var.u0, (int) ((1.0f - c40Var.T0) * c40Var.h0), org.telegram.ui.ActionBar.j6.t0);
            }
        }
        if (y10Var.c != 0.0f) {
            org.telegram.ui.ActionBar.j6.t0.setColor(i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xg, false), (int) (y10Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.t0);
        }
        if (c40Var.u1() && org.telegram.messenger.qc.e(512)) {
            if (y10Var.c < 0.15d) {
                if (!c40Var.y4) {
                    c40Var.y4 = true;
                    c40Var.E1();
                }
            } else if (c40Var.y4) {
                c40Var.y4 = false;
                org.telegram.messenger.g0.r(c40Var.z4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c40 c40Var = this.n0;
        b20 b20Var = c40Var.B4;
        if (c40Var.W4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = c40Var.d4.getX();
            float y11 = c40Var.d4.getY();
            float x12 = c40Var.d4.getX() + c40Var.d4.getMeasuredWidth();
            float y12 = c40Var.d4.getY() + c40Var.d4.getMeasuredHeight();
            RectF rectF = this.h0;
            rectF.set(x11, y11, x12, y12);
            boolean z10 = !rectF.contains(x10, y10);
            rectF.set(b20Var.getX(), b20Var.getY(), b20Var.getX() + b20Var.getMeasuredWidth(), b20Var.getY() + b20Var.getMeasuredWidth() + c40Var.W4.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z10 = false;
            }
            if (z10) {
                c40Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || c40Var.t2 == 0.0f || motionEvent.getY() >= c40Var.t2 - org.telegram.messenger.g0.L(37.0f) || c40Var.J1.getAlpha() != 0.0f || c40Var.e4 || c40Var.u2 != null || c40Var.Z3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        c40Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        c40 c40Var = this.n0;
        if (c40Var.W4 == null || i7 != 4) {
            return super.onKeyDown(i7, keyEvent);
        }
        c40Var.f1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        int O0;
        c40 c40Var = this.n0;
        View view = c40Var.J4;
        View view2 = c40Var.I4;
        l10 l10Var = c40Var.p1;
        a40 a40Var = c40Var.A3;
        y10 y10Var = c40Var.Z3;
        k30 k30Var = c40Var.L1;
        if (c40.F5 && this.k0 != c40Var.H4 && this.l0) {
            f10 = k30Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f10 = 0.0f;
        }
        this.k0 = c40Var.H4;
        y10Var.s = true;
        super.onLayout(z10, i7, i10, i11, i12);
        y10Var.s = false;
        c40.P0(c40Var);
        this.l0 = true;
        if (a40Var != null && (O0 = c40.O0(c40Var, k30Var.getPaddingTop())) != Integer.MIN_VALUE && O0 != ((FrameLayout.LayoutParams) a40Var.getLayoutParams()).topMargin) {
            post(new iz(this, 6));
        }
        if (!z11 || k30Var.getLeft() == f10) {
            return;
        }
        float left = f10 - k30Var.getLeft();
        k30Var.setTranslationX(left);
        l10Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = k30Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f;
        duration.setInterpolator(erVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(erVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(erVar).start();
        l10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(erVar).start();
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
        c40 c40Var = this.n0;
        j20 j20Var = c40Var.B1;
        r10 r10Var = c40Var.I1;
        LinearLayout linearLayout = c40Var.y3;
        a30 a30Var = c40Var.J1;
        f40 f40Var = c40Var.n4;
        org.telegram.ui.Components.l10 l10Var = c40Var.o4;
        org.telegram.ui.Components.py pyVar = c40Var.T1;
        org.telegram.ui.Components.voip.r2 r2Var = c40Var.w1;
        org.telegram.ui.ActionBar.j5 j5Var = c40Var.P1;
        View view = c40Var.b2;
        View view2 = c40Var.J4;
        View view3 = c40Var.I4;
        ArrayList arrayList = c40Var.X3;
        org.telegram.ui.ActionBar.j5 j5Var2 = c40Var.R1;
        h20 h20Var = c40Var.C1;
        ArrayList arrayList2 = c40Var.Y3;
        org.telegram.ui.Components.uj0 uj0Var = c40Var.m4;
        k30 k30Var = c40Var.L1;
        y10 y10Var = c40Var.Z3;
        u10 u10Var = c40Var.l4;
        int size = View.MeasureSpec.getSize(i10);
        this.g0 = true;
        boolean z11 = View.MeasureSpec.getSize(i7) > size && !org.telegram.messenger.g0.Q1();
        LaunchActivity launchActivity = c40Var.d2;
        if (launchActivity != null && org.telegram.messenger.g0.H1(launchActivity)) {
            z11 = c40.E5;
        }
        View.MeasureSpec.getSize(i7);
        y10Var.getClass();
        boolean z12 = org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i7) > size && !c40Var.u1();
        if (c40.E5 != z11) {
            c40.E5 = z11;
            if (r2Var.getMeasuredWidth() == 0) {
                int i13 = r2Var.getLayoutParams().width;
            }
            if (c40Var.u1()) {
                boolean z13 = (!y10Var.W && y10Var.b && (c40.E5 == c40Var.t1() || org.telegram.messenger.g0.Q1())) ? false : true;
                Boolean bool = c40Var.i4;
                if (bool == null || z13 != bool.booleanValue()) {
                    int systemUiVisibility = c40Var.b.getSystemUiVisibility();
                    boolean z14 = z13;
                    if (z14) {
                        i12 = systemUiVisibility & (-7);
                        c40Var.getWindow().clearFlags(1024);
                        c40Var.B0(false);
                    } else {
                        c40Var.B0(true);
                        i12 = systemUiVisibility | 6;
                        c40Var.getWindow().addFlags(1024);
                    }
                    c40Var.b.setSystemUiVisibility(i12);
                    c40Var.i4 = Boolean.valueOf(z14);
                    c40Var.R4 = !z14;
                    c40Var.b.requestApplyInsets();
                }
            } else {
                c40Var.W = false;
            }
            pyVar.y1(c40.E5 ? 6 : 2);
            k30Var.a0();
            u10Var.a0();
            this.j0 = true;
            TextView textView = c40Var.N1;
            if (textView != null) {
                textView.setVisibility(!c40.E5 ? 0 : 8);
            }
            if (c40Var.t1() == z11 && c40Var.u1() && !y10Var.b && !c40Var.V2.f.isEmpty()) {
                c40Var.h1((org.telegram.messenger.s3) c40Var.V2.f.get(0));
                y10Var.e();
            }
        }
        if (c40.F5 != z12) {
            c40.F5 = z12;
            uj0Var.setVisibility(z12 ? 0 : 8);
            k30Var.a0();
            u10Var.a0();
            z10 = true;
            this.j0 = true;
        } else {
            z10 = true;
        }
        if (this.j0) {
            c40Var.Q0(z10);
            c40Var.K1.f();
            l10Var.G(uj0Var, false);
            if (c40.F5) {
                f40Var.I(uj0Var, false);
            }
            uj0Var.setVisibility(c40.F5 ? 0 : 8);
            f40Var.H(uj0Var, c40.F5 && !y10Var.b, true);
            boolean z15 = c40.F5;
            c40Var.O4 = !z15 || y10Var.b;
            boolean z16 = !z15 && y10Var.b;
            l10Var.F(u10Var, z16);
            u10Var.setVisibility(z16 ? 0 : 8);
            k30Var.setVisibility((c40.F5 || !y10Var.b) ? 0 : 8);
            pyVar.y1(c40.E5 ? 6 : 2);
            c40Var.V1(false, false);
            k30Var.a0();
            u10Var.a0();
            org.telegram.messenger.g0.a4(k30Var);
            this.j0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            y10Var.setIsTablet(c40.F5);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.z) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (c40Var.u1() ? org.telegram.messenger.g0.L(72.0f) : org.telegram.messenger.g0.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y10Var.getLayoutParams();
        if (c40.F5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c40Var.e2[i15].getLayoutParams();
            if (c40.F5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (uj0Var != null) {
            ((FrameLayout.LayoutParams) uj0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (h20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) h20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = org.telegram.messenger.g0.L(c40Var.u1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) k30Var.getLayoutParams();
        if (c40.F5) {
            layoutParams3.gravity = c40Var.H4 ? 5 : 1;
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
            if (c40.E5) {
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
        if (!c40.E5 || c40.F5) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (c40.F5) {
                layoutParams4.gravity = c40Var.H4 ? 85 : 81;
                layoutParams4.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (c40.F5) {
                layoutParams5.gravity = c40Var.H4 ? 85 : 81;
                layoutParams5.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (c40.E5) {
            u10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            u10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) c40Var.p1.getLayoutParams();
        if (c40.F5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = c40Var.H4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (c40.E5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!c40.E5 || c40.F5) {
            ((FrameLayout.LayoutParams) a30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) r10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) a30Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) r10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) u10Var.getLayoutParams();
        if (c40.E5) {
            if (((v4.b0) u10Var.getLayoutManager()).o != 1) {
                ((v4.b0) u10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((v4.b0) u10Var.getLayoutManager()).o != 0) {
                ((v4.b0) u10Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.g0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        j20Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) j20Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (h20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) h20Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.g0.L(259.0f), (paddingTop / 5) * 3);
        if (c40.F5) {
            b10 = 0;
            i11 = 0;
        } else {
            i11 = 0;
            b10 = org.telegram.messenger.k5.b(8.0f, paddingTop - max, 0);
        }
        if (k30Var.getPaddingTop() != b10 || k30Var.getPaddingBottom() != L) {
            k30Var.setPadding(i11, b10, i11, L);
        }
        a40 a40Var = c40Var.A3;
        if (a40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) a40Var.getLayoutParams();
            int O0 = c40.O0(c40Var, b10);
            if (O0 != Integer.MIN_VALUE) {
                layoutParams9.topMargin = O0;
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        r30 r30Var = c40Var.P2;
        if (r30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) r30Var.getLayoutParams();
            org.telegram.ui.Components.voip.r g12 = c40Var.g1();
            if (g12 != null) {
                layoutParams10.height = g12.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = g12.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
                int L5 = org.telegram.messenger.g0.L(16.0f);
                layoutParams10.leftMargin = L5;
                layoutParams10.rightMargin = L5;
            }
        }
        if (j5Var2 != null) {
            int L6 = ((org.telegram.messenger.g0.L(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) j5Var.getLayoutParams();
            layoutParams11.topMargin = L6 - org.telegram.messenger.g0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) j5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.g0.L(80.0f) + L6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) c40Var.Q1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.g0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.g0.L(231.0f)) {
                    j5Var.setVisibility(0);
                    j5Var2.setVisibility(0);
                    layoutParams13.topMargin = L6;
                }
            }
            j5Var.setVisibility(4);
            j5Var2.setVisibility(4);
            layoutParams13.topMargin = L6 - org.telegram.messenger.g0.L(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.z) arrayList.get(i16)).g(y10Var.b, true);
        }
        this.g0 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.i0) {
            this.i0 = measuredHeight;
            c40Var.f1(false);
        }
        c40Var.q4.f = getMeasuredWidth();
        c40Var.a1();
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
