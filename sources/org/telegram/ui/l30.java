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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class l30 extends org.telegram.ui.Components.du0 {
    public boolean g0;
    public final RectF h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final HashMap m0;
    public final /* synthetic */ f40 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.n0 = f40Var;
        this.g0 = false;
        this.h0 = new RectF();
        this.m0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a6  */
    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
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
        org.telegram.ui.Components.voip.r rVar;
        boolean z10;
        float x11;
        float f13;
        float f14;
        float f15;
        int i7;
        boolean z11;
        Shader.TileMode tileMode;
        f40 f40Var = this.n0;
        d40 d40Var = f40Var.A3;
        View view = f40Var.J4;
        View view2 = f40Var.I4;
        ArrayList arrayList2 = f40Var.X3;
        nh.h hVar = f40Var.X1;
        Paint paint = f40Var.x2;
        x10 x10Var = f40Var.l4;
        e20 e20Var = f40Var.B4;
        b20 b20Var = f40Var.Z3;
        n30 n30Var = f40Var.L1;
        if (f40Var.r4 || f40Var.E4) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
                if (f40Var.P4 == null) {
                    f40Var.P4 = new RenderNode("CallActivity.Blur");
                    f40Var.Q4 = org.telegram.ui.Components.du0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.du0.getBlurRadius();
                    RenderNode renderNode = f40Var.P4;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = f40Var.P4;
                    float f16 = f40Var.Q4;
                    hVar.V0 = renderNode2;
                    hVar.W0 = f16;
                    org.telegram.ui.Components.voip.s0 s0Var = f40Var.o3;
                    s0Var.d = this;
                    s0Var.b = renderNode2;
                    s0Var.c = f16;
                }
                int round = Math.round(getMeasuredWidth() / f40Var.Q4);
                int round2 = Math.round(getMeasuredHeight() / f40Var.Q4);
                f40Var.r4 = true;
                f40Var.P4.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = f40Var.P4.beginRecording();
                float f17 = 1.0f / f40Var.Q4;
                beginRecording.scale(f17, f17);
                dispatchDraw(beginRecording);
                f40Var.P4.endRecording();
                f40Var.r4 = false;
            }
        }
        for (int i10 = 0; i10 < n30Var.getChildCount(); i10++) {
            View childAt = n30Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                z11 = true;
                ((org.telegram.ui.Cells.g4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.r)) {
                if (childAt.getMeasuredWidth() != n30Var.getMeasuredWidth()) {
                    childAt.setTranslationX((n30Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (b20Var.r == null) {
            for (int i11 = 0; i11 < x10Var.getChildCount(); i11++) {
                ((org.telegram.ui.Components.u10) x10Var.getChildAt(i11)).setProgressToFullscreen(1.0f);
            }
        } else if (x10Var.getVisibility() == 0) {
            HashMap hashMap = this.m0;
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
                            if (rVar2.getRenderer() != b20Var.E) {
                                hashMap.put(rVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i7 = i12;
                    if (childAt2 instanceof org.telegram.ui.Cells.g4) {
                        n30Var.getClass();
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
            while (i13 < x10Var.getChildCount()) {
                org.telegram.ui.Components.u10 u10Var = (org.telegram.ui.Components.u10) x10Var.getChildAt(i13);
                View view3 = (View) hashMap.get(u10Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(u10Var.getParticipant());
                }
                float f18 = b20Var.c;
                HashMap hashMap2 = hashMap;
                if (!f40Var.M4.k()) {
                    u10Var.setAlpha(f10);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.r) {
                        org.telegram.ui.Components.voip.r rVar3 = (org.telegram.ui.Components.voip.r) view3;
                        x11 = (n30Var.getX() + rVar3.getLeft()) - b20Var.getLeft();
                        f13 = (n30Var.getY() + rVar3.getTop()) - b20Var.getTop();
                        f14 = x10Var.getX() + u10Var.getLeft();
                        f15 = x10Var.getY() + u10Var.getTop();
                    } else {
                        x11 = ((n30Var.getX() + r14.getLeft()) - b20Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y11 = ((n30Var.getY() + r14.getTop()) - b20Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = x10Var.getX() + u10Var.getLeft() + (u10Var.getMeasuredWidth() >> 1);
                        float y12 = x10Var.getY() + u10Var.getTop() + (u10Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.g4) view3).setDrawAvatar(false);
                        f13 = y11;
                        f14 = x12;
                        f15 = y12;
                    }
                    float f19 = 1.0f - f18;
                    u10Var.setTranslationX((x11 - f14) * f19);
                    u10Var.setTranslationY((f13 - f15) * f19);
                    u10Var.setScaleX(1.0f);
                    u10Var.setScaleY(1.0f);
                    u10Var.setProgressToFullscreen(f18);
                } else {
                    u10Var.setScaleX(1.0f);
                    u10Var.setScaleY(1.0f);
                    u10Var.setTranslationX(0.0f);
                    u10Var.setTranslationY(0.0f);
                    u10Var.setProgressToFullscreen(1.0f);
                    if (u10Var.getRenderer() == null) {
                        u10Var.setAlpha(f18);
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
            org.telegram.ui.Components.ek0 ek0Var = f40Var.m4;
            org.telegram.ui.Components.voip.u uVar = yVar.a;
            if (yVar.h || yVar.f || yVar.Q) {
                arrayList = arrayList2;
            } else {
                yVar.z0 = false;
                float f20 = b20Var.c;
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
                            ek0Var = n30Var;
                        }
                        float x13 = ((ek0Var.getX() + rVar5.getX()) - yVar.getLeft()) - b20Var.getLeft();
                        float y13 = ((ek0Var.getY() + (rVar5.getY() + org.telegram.messenger.g0.L(2.0f))) - yVar.getTop()) - b20Var.getTop();
                        float f21 = 1.0f - f20;
                        float f22 = f20 * 0.0f;
                        yVar.setTranslationX((x13 * f21) + f22);
                        yVar.setTranslationY((y13 * f21) + f22);
                    }
                    uVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                    org.telegram.ui.Components.u10 u10Var2 = yVar.d;
                    if (u10Var2 != null) {
                        u10Var2.setAlpha(f20);
                    }
                    if (!yVar.b && yVar.c == null && yVar.e == null) {
                        yVar.setAlpha(f20);
                    } else if (!yVar.F) {
                        yVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.u10 u10Var3 = yVar.d;
                    if (u10Var3 != null) {
                        x10Var.getClass();
                        if (RecyclerView.R(u10Var3) == -1) {
                            yVar.setAlpha(yVar.d.getAlpha());
                        } else if (yVar.c == null) {
                            if (yVar.w && !yVar.F) {
                                yVar.setAlpha(f20);
                            }
                            yVar.d.setAlpha(f20);
                            f20 = 1.0f;
                        } else {
                            yVar.d.setAlpha(1.0f);
                            if (yVar.w && !yVar.F) {
                                yVar.setAlpha(1.0f);
                            }
                        }
                        yVar.setTranslationX((x10Var.getX() + yVar.d.getX()) - yVar.getLeft());
                        float f23 = 1.0f - f20;
                        yVar.setTranslationY((x10Var.getY() + (yVar.d.getY() + (org.telegram.messenger.g0.L(2.0f) * f23))) - yVar.getTop());
                        uVar.setRoundCorners((org.telegram.messenger.g0.L(8.0f) * f23) + (org.telegram.messenger.g0.L(13.0f) * f20));
                    } else {
                        org.telegram.ui.Components.voip.r rVar7 = yVar.c;
                        org.telegram.ui.Components.voip.r rVar8 = rVar7;
                        if (rVar7 != null || yVar.e != null) {
                            org.telegram.ui.Components.voip.r rVar9 = yVar.e;
                            if (rVar9 == null || rVar8 == null) {
                                org.telegram.ui.Components.voip.r rVar10 = rVar9 != null ? rVar9 : rVar8;
                                if (rVar9 == null) {
                                    ek0Var = n30Var;
                                }
                                rVar8 = rVar10;
                            } else {
                                if (f40.F5) {
                                    rVar = rVar9;
                                    if (!yVar.y.b) {
                                        z10 = true;
                                        if (z10) {
                                            rVar8 = rVar;
                                        }
                                        if (!z10) {
                                            ek0Var = n30Var;
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
                            yVar.setTranslationX(((ek0Var.getX() + rVar8.getX()) - yVar.getLeft()) - b20Var.getLeft());
                            yVar.setTranslationY(((ek0Var.getY() + (rVar8.getY() + org.telegram.messenger.g0.L(2.0f))) - yVar.getTop()) - b20Var.getTop());
                            uVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                            if (yVar.w && !yVar.F) {
                                if (!f40.F5) {
                                    yVar.z0 = true;
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
        if (f40.F5) {
            f11 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f11 = 1.0f;
            view2.setAlpha(1.0f - b20Var.c);
            view.setAlpha(1.0f - b20Var.c);
        }
        if (b20Var.M0) {
            n30Var.setAlpha(f11 - b20Var.c);
        } else {
            n30Var.setAlpha(f11);
        }
        if (d40Var != null) {
            d40Var.setAlpha(f11 - b20Var.c);
            d40Var.setTranslationY(b20Var.c * org.telegram.messenger.g0.L(64.0f));
        }
        super.dispatchDraw(canvas);
        if (f40Var.E4) {
            return;
        }
        boolean z12 = f40Var.e4;
        RectF rectF = this.h0;
        if (!z12) {
            if (f40Var.W4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), f40Var.V4);
                float y14 = n30Var.getY();
                n30Var.getY();
                n30Var.getMeasuredHeight();
                if (!f40Var.a5) {
                    if (f40Var.Z4 == null) {
                        org.telegram.ui.Components.voip.y yVar2 = f40Var.Y4;
                        if (yVar2 == null || !yVar2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(b20Var.getX() + f40Var.Y4.getX(), b20Var.getY() + f40Var.Y4.getY());
                        f40Var.Y4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(b20Var.getX() + x10Var.getX() + f40Var.Z4.getX(), b20Var.getY() + x10Var.getY() + f40Var.Z4.getY());
                    if (f40Var.Z4.getRenderer() == null || !f40Var.Z4.getRenderer().w || f40Var.Z4.getRenderer().b) {
                        f40Var.Z4.draw(canvas);
                    } else {
                        f40Var.Z4.getRenderer().draw(canvas);
                    }
                    f40Var.Z4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = n30Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt3 = n30Var.getChildAt(i15);
                    if (childAt3 == f40Var.W4) {
                        float max = Math.max(n30Var.getLeft(), childAt3.getX() + n30Var.getLeft());
                        float max2 = Math.max(y14, childAt3.getY() + n30Var.getY());
                        float min = Math.min(n30Var.getRight(), childAt3.getX() + n30Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(n30Var.getY() + n30Var.getMeasuredHeight(), childAt3.getY() + n30Var.getY() + f40Var.W4.getClipHeight());
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
                            float alpha = f40Var.V4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((f40Var.W4.getClipHeight() - f40Var.W4.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.nr.g.getInterpolation(1.0f - alpha))) + f40Var.W4.getMeasuredHeight()));
                            org.telegram.ui.Cells.g4 g4Var4 = f40Var.W4;
                            paint.getColor();
                            org.telegram.ui.ActionBar.m5[] m5VarArr = g4Var4.d;
                            if (TextUtils.isEmpty(m5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            m5VarArr[4].setFullAlpha(alpha);
                            m5VarArr[4].h(0, 0);
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
        if (f40Var.W4 != null) {
            if (f40Var.f4) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), f40Var.V4);
            }
            float y15 = n30Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = n30Var.getChildCount();
            float y16 = n30Var.getY() + n30Var.getMeasuredHeight();
            if (f40Var.a5) {
                int i16 = 0;
                while (true) {
                    if (i16 >= childCount2) {
                        g4Var = null;
                        break;
                    }
                    View childAt4 = n30Var.getChildAt(i16);
                    g4Var = f40Var.W4;
                    if (childAt4 == g4Var) {
                        break;
                    } else {
                        i16++;
                    }
                }
            } else {
                g4Var = f40Var.W4;
            }
            if (g4Var != null && y15 < y16) {
                canvas3.save();
                if (f40Var.Z4 == null) {
                    f12 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - f40Var.c4) * y15, getMeasuredWidth(), (f40Var.c4 * getMeasuredHeight()) + ((1.0f - f40Var.c4) * y16));
                } else {
                    f12 = 255.0f;
                }
                if (f40Var.a5) {
                    y10 = ((1.0f - f40Var.c4) * (g4Var.getY() + n30Var.getY())) + (f40Var.c4 * (e20Var.getMeasuredWidth() + e20Var.getTop()));
                    x10 = ((1.0f - f40Var.c4) * (g4Var.getX() + n30Var.getLeft())) + (f40Var.c4 * e20Var.getLeft());
                } else {
                    y10 = e20Var.getMeasuredWidth() + e20Var.getTop();
                    x10 = e20Var.getLeft();
                }
                float f24 = y10;
                canvas3.translate(x10, f24);
                if (f40Var.a5) {
                    fArr = fArr2;
                    path = path2;
                    g4Var2 = g4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    g4Var2 = g4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, g4Var.getMeasuredWidth(), g4Var.getClipHeight(), (int) (f40Var.c4 * f12), 31);
                }
                float clipHeight = (int) (((g4Var2.getClipHeight() - g4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.nr.g.getInterpolation(1.0f - f40Var.c4))) + g4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, g4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.g4 g4Var5 = g4Var2;
                g4Var5.setProgressToAvatarPreview(f40Var.a5 ? f40Var.c4 : 1.0f);
                for (int i17 = 0; i17 < 4; i17++) {
                    fArr[i17] = (1.0f - f40Var.c4) * org.telegram.messenger.g0.L(13.0f);
                    fArr[i17 + 4] = org.telegram.messenger.g0.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                g4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (f40Var.d4 != null) {
                    float f25 = f24 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - f40Var.d4.getMeasuredWidth()) - org.telegram.messenger.g0.L(14.0f);
                    if (f40Var.c4 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f25, f40Var.d4.getMeasuredWidth() + measuredWidth, f40Var.d4.getMeasuredHeight() + f25, (int) (f40Var.c4 * f12), 31);
                    } else {
                        canvas3.save();
                    }
                    f40Var.d4.setTranslationX(measuredWidth - r4.getLeft());
                    f40Var.d4.setTranslationY(f25 - r4.getTop());
                    float f26 = (f40Var.c4 * 0.2f) + 0.8f;
                    canvas3.scale(f26, f26, (f40Var.d4.getMeasuredWidth() / 2.0f) + measuredWidth, f25);
                    canvas3.translate(measuredWidth, f25);
                    f40Var.d4.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (f40Var.b4.n) {
                return;
            }
            canvas3.save();
            if (f40Var.a5 && f40Var.Z4 == null) {
                canvas3.clipRect(0.0f, (1.0f - f40Var.c4) * y15, getMeasuredWidth(), (f40Var.c4 * getMeasuredHeight()) + ((1.0f - f40Var.c4) * y16));
            }
            canvas3.scale(e20Var.getScaleX(), e20Var.getScaleY(), e20Var.getX(), e20Var.getY());
            canvas3.translate(e20Var.getX(), e20Var.getY());
            e20Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        f40 f40Var = this.n0;
        o10 o10Var = f40Var.p1;
        x10 x10Var = f40Var.l4;
        n30 n30Var = f40Var.L1;
        b20 b20Var = f40Var.Z3;
        if (f40Var.r4) {
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
            if (view == b20Var || view == o10Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (f40.F5 || b20Var.c != 1.0f || (view != f40Var.J1 && view != f40Var.b2 && view != f40Var.I1 && view != f40Var.Z2 && view != f40Var.y3 && view != f40Var.P2)) {
            if (f40Var.E4 && view == b20Var) {
                canvas.save();
                canvas.translate(x10Var.getX() + b20Var.getX(), x10Var.getY() + b20Var.getY());
                x10Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != f40Var.B4 && view != f40Var.d4 && view != f40Var.W4 && (!f40Var.k4 || !f40Var.f4 || (view != n30Var && view != o10Var && view != f40Var.X1 && view != f40Var.o3))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n0.U1.P();
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n0.U1.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        f40 f40Var = this.n0;
        ImageReceiver imageReceiver = f40Var.U1;
        Drawable drawable = f40Var.a2;
        b20 b20Var = f40Var.Z3;
        float f11 = f40Var.t2 - L;
        int L2 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = f40Var.t0;
        int i10 = L2 + i7;
        if (i7 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - f40Var.t0) / ((L - f40Var.t0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        f40Var.Z1();
        if (b20Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.m6.t0.setColor(f40Var.U3);
                float f12 = f40Var.u0;
                float f13 = f40Var.t0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - f40Var.u0;
                float L3 = f40Var.t0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.h0;
                rectF.set(f12, f13, measuredWidth, L3);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.t0);
            }
            org.telegram.ui.ActionBar.m6.t0.setColor(Color.argb((int) (f40Var.J1.getAlpha() * 255.0f), (int) (Color.red(f40Var.U3) * 0.8f), (int) (Color.green(f40Var.U3) * 0.8f), (int) (Color.blue(f40Var.U3) * 0.8f)));
            canvas.drawRect(f40Var.u0, 0.0f, getMeasuredWidth() - f40Var.u0, (int) ((1.0f - f40Var.T0) * f40Var.h0), org.telegram.ui.ActionBar.m6.t0);
            w20 w20Var = f40Var.u2;
            if (w20Var != null) {
                org.telegram.ui.ActionBar.m6.t0.setColor(w20Var.getBackgroundColor());
                canvas.drawRect(f40Var.u0, 0.0f, getMeasuredWidth() - f40Var.u0, (int) ((1.0f - f40Var.T0) * f40Var.h0), org.telegram.ui.ActionBar.m6.t0);
            }
        }
        if (b20Var.c != 0.0f) {
            org.telegram.ui.ActionBar.m6.t0.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false), (int) (b20Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.t0);
        }
        if (f40Var.v1() && org.telegram.messenger.qc.e(512)) {
            if (b20Var.c < 0.15d) {
                if (!f40Var.y4) {
                    f40Var.y4 = true;
                    f40Var.F1();
                }
            } else if (f40Var.y4) {
                f40Var.y4 = false;
                org.telegram.messenger.g0.r(f40Var.z4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f40 f40Var = this.n0;
        e20 e20Var = f40Var.B4;
        if (f40Var.W4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = f40Var.d4.getX();
            float y11 = f40Var.d4.getY();
            float x12 = f40Var.d4.getX() + f40Var.d4.getMeasuredWidth();
            float y12 = f40Var.d4.getY() + f40Var.d4.getMeasuredHeight();
            RectF rectF = this.h0;
            rectF.set(x11, y11, x12, y12);
            boolean z10 = !rectF.contains(x10, y10);
            rectF.set(e20Var.getX(), e20Var.getY(), e20Var.getX() + e20Var.getMeasuredWidth(), e20Var.getY() + e20Var.getMeasuredWidth() + f40Var.W4.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z10 = false;
            }
            if (z10) {
                f40Var.g1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || f40Var.t2 == 0.0f || motionEvent.getY() >= f40Var.t2 - org.telegram.messenger.g0.L(37.0f) || f40Var.J1.getAlpha() != 0.0f || f40Var.e4 || f40Var.u2 != null || f40Var.Z3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        f40Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        f40 f40Var = this.n0;
        if (f40Var.W4 == null || i7 != 4) {
            return super.onKeyDown(i7, keyEvent);
        }
        f40Var.g1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.du0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        int P0;
        f40 f40Var = this.n0;
        View view = f40Var.J4;
        View view2 = f40Var.I4;
        o10 o10Var = f40Var.p1;
        d40 d40Var = f40Var.A3;
        b20 b20Var = f40Var.Z3;
        n30 n30Var = f40Var.L1;
        if (f40.F5 && this.k0 != f40Var.H4 && this.l0) {
            f10 = n30Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f10 = 0.0f;
        }
        this.k0 = f40Var.H4;
        b20Var.s = true;
        super.onLayout(z10, i7, i10, i11, i12);
        b20Var.s = false;
        f40.Q0(f40Var);
        this.l0 = true;
        if (d40Var != null && (P0 = f40.P0(f40Var, n30Var.getPaddingTop())) != Integer.MIN_VALUE && P0 != ((FrameLayout.LayoutParams) d40Var.getLayoutParams()).topMargin) {
            post(new lz(this, 6));
        }
        if (!z11 || n30Var.getLeft() == f10) {
            return;
        }
        float left = f10 - n30Var.getLeft();
        n30Var.setTranslationX(left);
        o10Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = n30Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
        duration.setInterpolator(nrVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
        o10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
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
        f40 f40Var = this.n0;
        m20 m20Var = f40Var.B1;
        u10 u10Var = f40Var.I1;
        LinearLayout linearLayout = f40Var.y3;
        d30 d30Var = f40Var.J1;
        i40 i40Var = f40Var.n4;
        org.telegram.ui.Components.v10 v10Var = f40Var.o4;
        org.telegram.ui.Components.xy xyVar = f40Var.T1;
        org.telegram.ui.Components.voip.q2 q2Var = f40Var.w1;
        org.telegram.ui.ActionBar.m5 m5Var = f40Var.P1;
        View view = f40Var.b2;
        View view2 = f40Var.J4;
        View view3 = f40Var.I4;
        ArrayList arrayList = f40Var.X3;
        org.telegram.ui.ActionBar.m5 m5Var2 = f40Var.R1;
        k20 k20Var = f40Var.C1;
        ArrayList arrayList2 = f40Var.Y3;
        org.telegram.ui.Components.ek0 ek0Var = f40Var.m4;
        n30 n30Var = f40Var.L1;
        b20 b20Var = f40Var.Z3;
        x10 x10Var = f40Var.l4;
        int size = View.MeasureSpec.getSize(i10);
        this.g0 = true;
        boolean z11 = View.MeasureSpec.getSize(i7) > size && !org.telegram.messenger.g0.Q1();
        LaunchActivity launchActivity = f40Var.d2;
        if (launchActivity != null && org.telegram.messenger.g0.H1(launchActivity)) {
            z11 = f40.E5;
        }
        View.MeasureSpec.getSize(i7);
        b20Var.getClass();
        boolean z12 = org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i7) > size && !f40Var.v1();
        if (f40.E5 != z11) {
            f40.E5 = z11;
            if (q2Var.getMeasuredWidth() == 0) {
                int i13 = q2Var.getLayoutParams().width;
            }
            if (f40Var.v1()) {
                boolean z13 = (!b20Var.W && b20Var.b && (f40.E5 == f40Var.u1() || org.telegram.messenger.g0.Q1())) ? false : true;
                Boolean bool = f40Var.i4;
                if (bool == null || z13 != bool.booleanValue()) {
                    int systemUiVisibility = f40Var.b.getSystemUiVisibility();
                    boolean z14 = z13;
                    if (z14) {
                        i12 = systemUiVisibility & (-7);
                        f40Var.getWindow().clearFlags(1024);
                        f40Var.B0(false);
                    } else {
                        f40Var.B0(true);
                        i12 = systemUiVisibility | 6;
                        f40Var.getWindow().addFlags(1024);
                    }
                    f40Var.b.setSystemUiVisibility(i12);
                    f40Var.i4 = Boolean.valueOf(z14);
                    f40Var.R4 = !z14;
                    f40Var.b.requestApplyInsets();
                }
            } else {
                f40Var.W = false;
            }
            xyVar.y1(f40.E5 ? 6 : 2);
            n30Var.a0();
            x10Var.a0();
            this.j0 = true;
            TextView textView = f40Var.N1;
            if (textView != null) {
                textView.setVisibility(!f40.E5 ? 0 : 8);
            }
            if (f40Var.u1() == z11 && f40Var.v1() && !b20Var.b && !f40Var.V2.f.isEmpty()) {
                f40Var.i1((org.telegram.messenger.u3) f40Var.V2.f.get(0));
                b20Var.e();
            }
        }
        if (f40.F5 != z12) {
            f40.F5 = z12;
            ek0Var.setVisibility(z12 ? 0 : 8);
            n30Var.a0();
            x10Var.a0();
            z10 = true;
            this.j0 = true;
        } else {
            z10 = true;
        }
        if (this.j0) {
            f40Var.R0(z10);
            f40Var.K1.f();
            v10Var.G(ek0Var, false);
            if (f40.F5) {
                i40Var.I(ek0Var, false);
            }
            ek0Var.setVisibility(f40.F5 ? 0 : 8);
            i40Var.H(ek0Var, f40.F5 && !b20Var.b, true);
            boolean z15 = f40.F5;
            f40Var.O4 = !z15 || b20Var.b;
            boolean z16 = !z15 && b20Var.b;
            v10Var.F(x10Var, z16);
            x10Var.setVisibility(z16 ? 0 : 8);
            n30Var.setVisibility((f40.F5 || !b20Var.b) ? 0 : 8);
            xyVar.y1(f40.E5 ? 6 : 2);
            f40Var.W1(false, false);
            n30Var.a0();
            x10Var.a0();
            org.telegram.messenger.g0.Z3(n30Var);
            this.j0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            b20Var.setIsTablet(f40.F5);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (f40Var.v1() ? org.telegram.messenger.g0.L(72.0f) : org.telegram.messenger.g0.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b20Var.getLayoutParams();
        if (f40.F5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f40Var.e2[i15].getLayoutParams();
            if (f40.F5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (ek0Var != null) {
            ((FrameLayout.LayoutParams) ek0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (k20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) k20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = org.telegram.messenger.g0.L(f40Var.v1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) n30Var.getLayoutParams();
        if (f40.F5) {
            layoutParams3.gravity = f40Var.H4 ? 5 : 1;
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
            if (f40.E5) {
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
        if (!f40.E5 || f40.F5) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (f40.F5) {
                layoutParams4.gravity = f40Var.H4 ? 85 : 81;
                layoutParams4.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (f40.F5) {
                layoutParams5.gravity = f40Var.H4 ? 85 : 81;
                layoutParams5.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (f40.E5) {
            x10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            x10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) f40Var.p1.getLayoutParams();
        if (f40.F5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = f40Var.H4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (f40.E5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!f40.E5 || f40.F5) {
            ((FrameLayout.LayoutParams) d30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) u10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) d30Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) u10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) x10Var.getLayoutParams();
        if (f40.E5) {
            if (((v4.c0) x10Var.getLayoutManager()).o != 1) {
                ((v4.c0) x10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((v4.c0) x10Var.getLayoutManager()).o != 0) {
                ((v4.c0) x10Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.g0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        m20Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) m20Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (k20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) k20Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.g0.L(259.0f), (paddingTop / 5) * 3);
        if (f40.F5) {
            b10 = 0;
            i11 = 0;
        } else {
            i11 = 0;
            b10 = org.telegram.messenger.f3.b(8.0f, paddingTop - max, 0);
        }
        if (n30Var.getPaddingTop() != b10 || n30Var.getPaddingBottom() != L) {
            n30Var.setPadding(i11, b10, i11, L);
        }
        d40 d40Var = f40Var.A3;
        if (d40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) d40Var.getLayoutParams();
            int P0 = f40.P0(f40Var, b10);
            if (P0 != Integer.MIN_VALUE) {
                layoutParams9.topMargin = P0;
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        u30 u30Var = f40Var.P2;
        if (u30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) u30Var.getLayoutParams();
            org.telegram.ui.Components.voip.r h12 = f40Var.h1();
            if (h12 != null) {
                layoutParams10.height = h12.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = h12.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
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
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) f40Var.Q1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
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
            ((org.telegram.ui.Components.voip.y) arrayList.get(i16)).g(b20Var.b, true);
        }
        this.g0 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.i0) {
            this.i0 = measuredHeight;
            f40Var.g1(false);
        }
        f40Var.q4.f = getMeasuredWidth();
        f40Var.b1();
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
        this.n0.Z1();
    }
}
