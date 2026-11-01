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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f40 extends org.telegram.ui.Components.vu0 {
    public boolean f0;
    public final RectF g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public final HashMap l0;
    public final /* synthetic */ a50 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.m0 = a50Var;
        this.f0 = false;
        this.g0 = new RectF();
        this.l0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.vu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.h4 h4Var;
        float f11;
        float y3;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.h4 h4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.k kVar;
        boolean z10;
        float x11;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z11;
        Shader.TileMode tileMode;
        a50 a50Var = this.m0;
        y40 y40Var = a50Var.s3;
        View view = a50Var.B4;
        View view2 = a50Var.A4;
        ArrayList arrayList2 = a50Var.P3;
        dh.k kVar2 = a50Var.T1;
        Paint paint = a50Var.t2;
        t20 t20Var = a50Var.d4;
        a30 a30Var = a50Var.t4;
        x20 x20Var = a50Var.R3;
        h40 h40Var = a50Var.H1;
        if (a50Var.j4 || a50Var.w4) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.i0.m0) {
                if (a50Var.H4 == null) {
                    a50Var.H4 = new RenderNode("CallActivity.Blur");
                    a50Var.I4 = org.telegram.ui.Components.vu0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.vu0.getBlurRadius();
                    RenderNode renderNode = a50Var.H4;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    kVar2.setBlurRoot(this);
                    RenderNode renderNode2 = a50Var.H4;
                    float f15 = a50Var.I4;
                    kVar2.U0 = renderNode2;
                    kVar2.V0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / a50Var.I4);
                int round2 = Math.round(getMeasuredHeight() / a50Var.I4);
                a50Var.j4 = true;
                a50Var.H4.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = a50Var.H4.beginRecording();
                float f16 = 1.0f / a50Var.I4;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                a50Var.H4.endRecording();
                a50Var.j4 = false;
            }
        }
        for (int i11 = 0; i11 < h40Var.getChildCount(); i11++) {
            View childAt = h40Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                z11 = true;
                ((org.telegram.ui.Cells.h4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.k)) {
                if (childAt.getMeasuredWidth() != h40Var.getMeasuredWidth()) {
                    childAt.setTranslationX((h40Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (x20Var.r == null) {
            for (int i12 = 0; i12 < t20Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.y10) t20Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (t20Var.getVisibility() == 0) {
            HashMap hashMap = this.l0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < h40Var.getChildCount()) {
                View childAt2 = h40Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.k) {
                        h40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.k kVar3 = (org.telegram.ui.Components.voip.k) childAt2;
                            i10 = i13;
                            if (kVar3.getRenderer() != x20Var.D) {
                                hashMap.put(kVar3.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.h4) {
                        h40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.h4 h4Var3 = (org.telegram.ui.Cells.h4) childAt2;
                            hashMap.put(h4Var3.getParticipant(), h4Var3);
                        }
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
            int i14 = 0;
            while (i14 < t20Var.getChildCount()) {
                org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) t20Var.getChildAt(i14);
                View view3 = (View) hashMap.get(y10Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(y10Var.getParticipant());
                }
                float f17 = x20Var.c;
                HashMap hashMap2 = hashMap;
                if (!a50Var.E4.k()) {
                    y10Var.setAlpha(f7);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.k) {
                        org.telegram.ui.Components.voip.k kVar4 = (org.telegram.ui.Components.voip.k) view3;
                        x11 = (h40Var.getX() + kVar4.getLeft()) - x20Var.getLeft();
                        f12 = (h40Var.getY() + kVar4.getTop()) - x20Var.getTop();
                        f13 = t20Var.getX() + y10Var.getLeft();
                        f14 = t20Var.getY() + y10Var.getTop();
                    } else {
                        x11 = ((h40Var.getX() + r14.getLeft()) - x20Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((h40Var.getY() + r14.getTop()) - x20Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = t20Var.getX() + y10Var.getLeft() + (y10Var.getMeasuredWidth() >> 1);
                        float y11 = t20Var.getY() + y10Var.getTop() + (y10Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.h4) view3).setDrawAvatar(false);
                        f12 = y10;
                        f13 = x12;
                        f14 = y11;
                    }
                    float f18 = 1.0f - f17;
                    y10Var.setTranslationX((x11 - f13) * f18);
                    y10Var.setTranslationY((f12 - f14) * f18);
                    y10Var.setScaleX(1.0f);
                    y10Var.setScaleY(1.0f);
                    y10Var.setProgressToFullscreen(f17);
                } else {
                    y10Var.setScaleX(1.0f);
                    y10Var.setScaleY(1.0f);
                    y10Var.setTranslationX(0.0f);
                    y10Var.setTranslationY(0.0f);
                    y10Var.setProgressToFullscreen(1.0f);
                    if (y10Var.getRenderer() == null) {
                        y10Var.setAlpha(f17);
                    }
                }
                i14++;
                hashMap = hashMap2;
                f7 = 1.0f;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) arrayList2.get(i15);
            org.telegram.ui.Components.uk0 uk0Var = a50Var.e4;
            org.telegram.ui.Components.voip.n nVar = rVar.a;
            if (rVar.h || rVar.f || rVar.P) {
                arrayList = arrayList2;
            } else {
                rVar.y0 = false;
                float f19 = x20Var.c;
                arrayList = arrayList2;
                if (rVar.r || rVar.b) {
                    org.telegram.ui.Components.voip.k kVar5 = rVar.c;
                    org.telegram.ui.Components.voip.k kVar6 = kVar5;
                    if (kVar5 == null && rVar.e == null) {
                        rVar.setTranslationX(0.0f);
                        rVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.k kVar7 = rVar.e;
                        if (kVar7 != null) {
                            kVar6 = kVar7;
                        }
                        if (kVar7 == null) {
                            uk0Var = h40Var;
                        }
                        float x13 = ((uk0Var.getX() + kVar6.getX()) - rVar.getLeft()) - x20Var.getLeft();
                        float y12 = ((uk0Var.getY() + (kVar6.getY() + org.telegram.messenger.i0.L(2.0f))) - rVar.getTop()) - x20Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        rVar.setTranslationX((x13 * f20) + f21);
                        rVar.setTranslationY((y12 * f20) + f21);
                    }
                    nVar.setRoundCorners(org.telegram.messenger.i0.L(8.0f));
                    org.telegram.ui.Components.y10 y10Var2 = rVar.d;
                    if (y10Var2 != null) {
                        y10Var2.setAlpha(f19);
                    }
                    if (!rVar.b && rVar.c == null && rVar.e == null) {
                        rVar.setAlpha(f19);
                    } else if (!rVar.E) {
                        rVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.y10 y10Var3 = rVar.d;
                    if (y10Var3 != null) {
                        t20Var.getClass();
                        if (RecyclerView.R(y10Var3) == -1) {
                            rVar.setAlpha(rVar.d.getAlpha());
                        } else if (rVar.c == null) {
                            if (rVar.w && !rVar.E) {
                                rVar.setAlpha(f19);
                            }
                            rVar.d.setAlpha(f19);
                            f19 = 1.0f;
                        } else {
                            rVar.d.setAlpha(1.0f);
                            if (rVar.w && !rVar.E) {
                                rVar.setAlpha(1.0f);
                            }
                        }
                        rVar.setTranslationX((t20Var.getX() + rVar.d.getX()) - rVar.getLeft());
                        float f22 = 1.0f - f19;
                        rVar.setTranslationY((t20Var.getY() + (rVar.d.getY() + (org.telegram.messenger.i0.L(2.0f) * f22))) - rVar.getTop());
                        nVar.setRoundCorners((org.telegram.messenger.i0.L(8.0f) * f22) + (org.telegram.messenger.i0.L(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.k kVar8 = rVar.c;
                        org.telegram.ui.Components.voip.k kVar9 = kVar8;
                        if (kVar8 != null || rVar.e != null) {
                            org.telegram.ui.Components.voip.k kVar10 = rVar.e;
                            if (kVar10 == null || kVar9 == null) {
                                org.telegram.ui.Components.voip.k kVar11 = kVar10 != null ? kVar10 : kVar9;
                                if (kVar10 == null) {
                                    uk0Var = h40Var;
                                }
                                kVar9 = kVar11;
                            } else {
                                if (a50.x5) {
                                    kVar = kVar10;
                                    if (!rVar.y.b) {
                                        z10 = true;
                                        if (z10) {
                                            kVar9 = kVar;
                                        }
                                        if (!z10) {
                                            uk0Var = h40Var;
                                        }
                                    }
                                } else {
                                    kVar = kVar10;
                                }
                                z10 = false;
                                if (z10) {
                                }
                                if (!z10) {
                                }
                            }
                            rVar.setTranslationX(((uk0Var.getX() + kVar9.getX()) - rVar.getLeft()) - x20Var.getLeft());
                            rVar.setTranslationY(((uk0Var.getY() + (kVar9.getY() + org.telegram.messenger.i0.L(2.0f))) - rVar.getTop()) - x20Var.getTop());
                            nVar.setRoundCorners(org.telegram.messenger.i0.L(8.0f));
                            if (rVar.w && !rVar.E) {
                                if (!a50.x5) {
                                    rVar.y0 = true;
                                    rVar.setAlpha(kVar9.getAlpha() * (1.0f - f19));
                                } else if (rVar.c != null && rVar.e == null) {
                                    rVar.setAlpha(kVar9.getAlpha() * f19);
                                }
                            }
                        }
                    }
                }
            }
            i15++;
            arrayList2 = arrayList;
        }
        if (a50.x5) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - x20Var.c);
            view.setAlpha(1.0f - x20Var.c);
        }
        if (x20Var.L0) {
            h40Var.setAlpha(f10 - x20Var.c);
        } else {
            h40Var.setAlpha(f10);
        }
        if (y40Var != null) {
            y40Var.setAlpha(f10 - x20Var.c);
            y40Var.setTranslationY(x20Var.c * org.telegram.messenger.i0.L(64.0f));
        }
        super.dispatchDraw(canvas);
        if (a50Var.w4) {
            return;
        }
        boolean z12 = a50Var.W3;
        RectF rectF = this.g0;
        if (!z12) {
            if (a50Var.O4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), a50Var.N4);
                float y13 = h40Var.getY();
                h40Var.getY();
                h40Var.getMeasuredHeight();
                if (!a50Var.S4) {
                    if (a50Var.R4 == null) {
                        org.telegram.ui.Components.voip.r rVar2 = a50Var.Q4;
                        if (rVar2 == null || !rVar2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(x20Var.getX() + a50Var.Q4.getX(), x20Var.getY() + a50Var.Q4.getY());
                        a50Var.Q4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(x20Var.getX() + t20Var.getX() + a50Var.R4.getX(), x20Var.getY() + t20Var.getY() + a50Var.R4.getY());
                    if (a50Var.R4.getRenderer() == null || !a50Var.R4.getRenderer().w || a50Var.R4.getRenderer().b) {
                        a50Var.R4.draw(canvas);
                    } else {
                        a50Var.R4.getRenderer().draw(canvas);
                    }
                    a50Var.R4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = h40Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = h40Var.getChildAt(i16);
                    if (childAt3 == a50Var.O4) {
                        float max = Math.max(h40Var.getLeft(), childAt3.getX() + h40Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + h40Var.getY());
                        float min = Math.min(h40Var.getRight(), childAt3.getX() + h40Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(h40Var.getY() + h40Var.getMeasuredHeight(), childAt3.getY() + h40Var.getY() + a50Var.O4.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + h40Var.getLeft(), childAt3.getY() + h40Var.getY());
                            float alpha = a50Var.N4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((a50Var.O4.getClipHeight() - a50Var.O4.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.gr.g.getInterpolation(1.0f - alpha))) + a50Var.O4.getMeasuredHeight()));
                            org.telegram.ui.Cells.h4 h4Var4 = a50Var.O4;
                            paint.getColor();
                            org.telegram.ui.ActionBar.u5[] u5VarArr = h4Var4.d;
                            if (TextUtils.isEmpty(u5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            u5VarArr[4].setFullAlpha(alpha);
                            u5VarArr[4].h(0, 0);
                            h4Var4.invalidate();
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), paint);
                            childAt3.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (a50Var.O4 != null) {
            if (a50Var.X3) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), a50Var.N4);
            }
            float y14 = h40Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = h40Var.getChildCount();
            float y15 = h40Var.getY() + h40Var.getMeasuredHeight();
            if (a50Var.S4) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        h4Var = null;
                        break;
                    }
                    View childAt4 = h40Var.getChildAt(i17);
                    h4Var = a50Var.O4;
                    if (childAt4 == h4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                h4Var = a50Var.O4;
            }
            if (h4Var != null && y14 < y15) {
                canvas3.save();
                if (a50Var.R4 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - a50Var.U3) * y14, getMeasuredWidth(), (getMeasuredHeight() * a50Var.U3) + ((1.0f - a50Var.U3) * y15));
                } else {
                    f11 = 255.0f;
                }
                if (a50Var.S4) {
                    y3 = ((1.0f - a50Var.U3) * (h4Var.getY() + h40Var.getY())) + ((a30Var.getMeasuredWidth() + a30Var.getTop()) * a50Var.U3);
                    x10 = ((1.0f - a50Var.U3) * (h4Var.getX() + h40Var.getLeft())) + (a50Var.U3 * a30Var.getLeft());
                } else {
                    y3 = a30Var.getMeasuredWidth() + a30Var.getTop();
                    x10 = a30Var.getLeft();
                }
                float f23 = y3;
                canvas3.translate(x10, f23);
                if (a50Var.S4) {
                    fArr = fArr2;
                    path = path2;
                    h4Var2 = h4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    h4Var2 = h4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, h4Var.getMeasuredWidth(), h4Var.getClipHeight(), (int) (a50Var.U3 * f11), 31);
                }
                float clipHeight = (int) (((h4Var2.getClipHeight() - h4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.gr.g.getInterpolation(1.0f - a50Var.U3))) + h4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, h4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.h4 h4Var5 = h4Var2;
                h4Var5.setProgressToAvatarPreview(a50Var.S4 ? a50Var.U3 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - a50Var.U3) * org.telegram.messenger.i0.L(13.0f);
                    fArr[i18 + 4] = org.telegram.messenger.i0.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                h4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (a50Var.V3 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - a50Var.V3.getMeasuredWidth()) - org.telegram.messenger.i0.L(14.0f);
                    if (a50Var.U3 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, a50Var.V3.getMeasuredWidth() + measuredWidth, a50Var.V3.getMeasuredHeight() + f24, (int) (a50Var.U3 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    a50Var.V3.setTranslationX(measuredWidth - r4.getLeft());
                    a50Var.V3.setTranslationY(f24 - r4.getTop());
                    float f25 = (a50Var.U3 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (a50Var.V3.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    a50Var.V3.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (a50Var.T3.n) {
                return;
            }
            canvas3.save();
            if (a50Var.S4 && a50Var.R4 == null) {
                canvas3.clipRect(0.0f, (1.0f - a50Var.U3) * y14, getMeasuredWidth(), (a50Var.U3 * getMeasuredHeight()) + ((1.0f - a50Var.U3) * y15));
            }
            canvas3.scale(a30Var.getScaleX(), a30Var.getScaleY(), a30Var.getX(), a30Var.getY());
            canvas3.translate(a30Var.getX(), a30Var.getY());
            a30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        a50 a50Var = this.m0;
        k20 k20Var = a50Var.l1;
        t20 t20Var = a50Var.d4;
        h40 h40Var = a50Var.H1;
        x20 x20Var = a50Var.R3;
        if (a50Var.j4) {
            if (view == h40Var) {
                int childCount = h40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = h40Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == x20Var || view == k20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (a50.x5 || x20Var.c != 1.0f || (view != a50Var.F1 && view != a50Var.X1 && view != a50Var.E1 && view != a50Var.V2 && view != a50Var.q3 && view != a50Var.L2)) {
            if (a50Var.w4 && view == x20Var) {
                canvas.save();
                canvas.translate(t20Var.getX() + x20Var.getX(), t20Var.getY() + x20Var.getY());
                t20Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != a50Var.t4 && view != a50Var.V3 && view != a50Var.O4 && (!a50Var.c4 || !a50Var.X3 || (view != h40Var && view != k20Var && view != a50Var.T1))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.vu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m0.Q1.P();
    }

    @Override // org.telegram.ui.Components.vu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0.Q1.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        int L = org.telegram.messenger.i0.L(74.0f);
        a50 a50Var = this.m0;
        ImageReceiver imageReceiver = a50Var.Q1;
        Drawable drawable = a50Var.W1;
        x20 x20Var = a50Var.R3;
        float f10 = a50Var.p2 - L;
        int L2 = org.telegram.messenger.i0.L(15.0f) + getMeasuredHeight();
        int i10 = a50Var.s0;
        int i11 = L2 + i10;
        if (i10 + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - a50Var.s0) / ((L - a50Var.s0) - org.telegram.messenger.i0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i11 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        a50Var.T1();
        if (x20Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i11);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.t6.t0.setColor(a50Var.M3);
                float f11 = a50Var.t0;
                float f12 = a50Var.s0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - a50Var.t0;
                float L3 = a50Var.s0 + paddingTop + org.telegram.messenger.i0.L(24.0f);
                RectF rectF = this.g0;
                rectF.set(f11, f12, measuredWidth, L3);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.t0);
            }
            org.telegram.ui.ActionBar.t6.t0.setColor(Color.argb((int) (a50Var.F1.getAlpha() * 255.0f), (int) (Color.red(a50Var.M3) * 0.8f), (int) (Color.green(a50Var.M3) * 0.8f), (int) (Color.blue(a50Var.M3) * 0.8f)));
            canvas.drawRect(a50Var.t0, 0.0f, getMeasuredWidth() - a50Var.t0, (int) ((1.0f - a50Var.S0) * a50Var.g0), org.telegram.ui.ActionBar.t6.t0);
            r30 r30Var = a50Var.q2;
            if (r30Var != null) {
                org.telegram.ui.ActionBar.t6.t0.setColor(r30Var.getBackgroundColor());
                canvas.drawRect(a50Var.t0, 0.0f, getMeasuredWidth() - a50Var.t0, (int) ((1.0f - a50Var.S0) * a50Var.g0), org.telegram.ui.ActionBar.t6.t0);
            }
        }
        if (x20Var.c != 0.0f) {
            org.telegram.ui.ActionBar.t6.t0.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false), (int) (x20Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.t0);
        }
        if (a50Var.t1() && org.telegram.messenger.tc.e(512)) {
            if (x20Var.c < 0.15d) {
                if (!a50Var.q4) {
                    a50Var.q4 = true;
                    a50Var.B1();
                }
            } else if (a50Var.q4) {
                a50Var.q4 = false;
                org.telegram.messenger.i0.r(a50Var.r4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a50 a50Var = this.m0;
        a30 a30Var = a50Var.t4;
        if (a50Var.O4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = a50Var.V3.getX();
            float y10 = a50Var.V3.getY();
            float x12 = a50Var.V3.getX() + a50Var.V3.getMeasuredWidth();
            float y11 = a50Var.V3.getY() + a50Var.V3.getMeasuredHeight();
            RectF rectF = this.g0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(a30Var.getX(), a30Var.getY(), a30Var.getX() + a30Var.getMeasuredWidth(), a30Var.getY() + a30Var.getMeasuredWidth() + a50Var.O4.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                a50Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || a50Var.p2 == 0.0f || motionEvent.getY() >= a50Var.p2 - org.telegram.messenger.i0.L(37.0f) || a50Var.F1.getAlpha() != 0.0f || a50Var.W3 || a50Var.q2 != null || a50Var.R3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        a50Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        a50 a50Var = this.m0;
        if (a50Var.O4 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        a50Var.f1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.vu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        a50 a50Var = this.m0;
        View view = a50Var.B4;
        View view2 = a50Var.A4;
        k20 k20Var = a50Var.l1;
        x20 x20Var = a50Var.R3;
        h40 h40Var = a50Var.H1;
        if (a50.x5 && this.j0 != a50Var.z4 && this.k0) {
            f7 = h40Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.j0 = a50Var.z4;
        x20Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        x20Var.s = false;
        a50.P0(a50Var);
        this.k0 = true;
        if (!z11 || h40Var.getLeft() == f7) {
            return;
        }
        float left = f7 - h40Var.getLeft();
        h40Var.setTranslationX(left);
        k20Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = h40Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        duration.setInterpolator(grVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
        k20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int L;
        float f10;
        int i12;
        int b10;
        int i13;
        a50 a50Var = this.m0;
        h30 h30Var = a50Var.x1;
        q20 q20Var = a50Var.E1;
        LinearLayout linearLayout = a50Var.q3;
        x30 x30Var = a50Var.F1;
        d50 d50Var = a50Var.f4;
        org.telegram.ui.Components.z10 z10Var = a50Var.g4;
        org.telegram.ui.Components.zy zyVar = a50Var.P1;
        org.telegram.ui.Components.voip.c2 c2Var = a50Var.s1;
        org.telegram.ui.ActionBar.u5 u5Var = a50Var.L1;
        View view = a50Var.X1;
        k20 k20Var = a50Var.l1;
        View view2 = a50Var.B4;
        View view3 = a50Var.A4;
        ArrayList arrayList = a50Var.P3;
        org.telegram.ui.ActionBar.u5 u5Var2 = a50Var.N1;
        f30 f30Var = a50Var.y1;
        ArrayList arrayList2 = a50Var.Q3;
        org.telegram.ui.Components.uk0 uk0Var = a50Var.e4;
        h40 h40Var = a50Var.H1;
        x20 x20Var = a50Var.R3;
        t20 t20Var = a50Var.d4;
        int size = View.MeasureSpec.getSize(i11);
        this.f0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !org.telegram.messenger.i0.Q1();
        View.MeasureSpec.getSize(i10);
        x20Var.getClass();
        boolean z12 = org.telegram.messenger.i0.Q1() && View.MeasureSpec.getSize(i10) > size && !a50Var.t1();
        if (a50.w5 != z11) {
            a50.w5 = z11;
            if (c2Var.getMeasuredWidth() == 0) {
                int i14 = c2Var.getLayoutParams().width;
            }
            if (a50Var.t1()) {
                boolean z13 = (!x20Var.V && x20Var.b && (a50.w5 == a50Var.s1() || org.telegram.messenger.i0.Q1())) ? false : true;
                Boolean bool = a50Var.a4;
                if (bool == null || z13 != bool.booleanValue()) {
                    int systemUiVisibility = a50Var.b.getSystemUiVisibility();
                    boolean z14 = z13;
                    if (z14) {
                        i13 = systemUiVisibility & (-7);
                        a50Var.getWindow().clearFlags(1024);
                        a50Var.B0(false);
                    } else {
                        a50Var.B0(true);
                        i13 = systemUiVisibility | 6;
                        a50Var.getWindow().addFlags(1024);
                    }
                    a50Var.b.setSystemUiVisibility(i13);
                    a50Var.a4 = Boolean.valueOf(z14);
                    a50Var.J4 = !z14;
                    a50Var.b.requestApplyInsets();
                }
            } else {
                a50Var.V = false;
            }
            zyVar.y1(a50.w5 ? 6 : 2);
            h40Var.a0();
            t20Var.a0();
            this.i0 = true;
            TextView textView = a50Var.J1;
            if (textView != null) {
                textView.setVisibility(!a50.w5 ? 0 : 8);
            }
            if (a50Var.s1() == z11 && a50Var.t1() && !x20Var.b && !a50Var.R2.f.isEmpty()) {
                a50Var.g1((org.telegram.messenger.v3) a50Var.R2.f.get(0));
                x20Var.e();
            }
        }
        if (a50.x5 != z12) {
            a50.x5 = z12;
            uk0Var.setVisibility(z12 ? 0 : 8);
            h40Var.a0();
            t20Var.a0();
            z10 = true;
            this.i0 = true;
        } else {
            z10 = true;
        }
        if (this.i0) {
            a50Var.Q0(z10);
            a50Var.G1.f();
            z10Var.G(uk0Var, false);
            if (a50.x5) {
                d50Var.I(uk0Var, false);
            }
            uk0Var.setVisibility(a50.x5 ? 0 : 8);
            d50Var.H(uk0Var, a50.x5 && !x20Var.b, true);
            boolean z15 = a50.x5;
            a50Var.G4 = !z15 || x20Var.b;
            boolean z16 = !z15 && x20Var.b;
            z10Var.F(t20Var, z16);
            t20Var.setVisibility(z16 ? 0 : 8);
            h40Var.setVisibility((a50.x5 || !x20Var.b) ? 0 : 8);
            zyVar.y1(a50.w5 ? 6 : 2);
            a50Var.Q1(false, false);
            h40Var.a0();
            t20Var.a0();
            org.telegram.messenger.i0.a4(h40Var);
            this.i0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            x20Var.setIsTablet(a50.x5);
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                ((org.telegram.ui.Components.voip.r) arrayList2.get(i15)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (a50Var.t1() ? org.telegram.messenger.i0.L(72.0f) : org.telegram.messenger.i0.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x20Var.getLayoutParams();
        if (a50.x5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) a50Var.a2[i16].getLayoutParams();
            if (a50.x5) {
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(8.0f);
            }
        }
        if (uk0Var != null) {
            ((FrameLayout.LayoutParams) uk0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (f30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) f30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = org.telegram.messenger.i0.L(a50Var.t1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h40Var.getLayoutParams();
        if (a50.x5) {
            layoutParams3.gravity = a50Var.z4 ? 5 : 1;
            layoutParams3.width = org.telegram.messenger.i0.L(320.0f);
            int L3 = org.telegram.messenger.i0.L(4.0f);
            layoutParams3.leftMargin = L3;
            layoutParams3.rightMargin = L3;
            layoutParams3.bottomMargin = L2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            L = org.telegram.messenger.i0.L(60.0f);
            f7 = 90.0f;
        } else {
            f7 = 90.0f;
            if (a50.w5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = org.telegram.messenger.i0.L(14.0f);
                layoutParams3.rightMargin = org.telegram.messenger.i0.L(90.0f);
                layoutParams3.leftMargin = org.telegram.messenger.i0.L(14.0f);
                L = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L = org.telegram.messenger.i0.L(60.0f);
                layoutParams3.bottomMargin = L2;
                layoutParams3.topMargin = org.telegram.messenger.i0.L(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int L4 = org.telegram.messenger.i0.L(14.0f);
                layoutParams3.leftMargin = L4;
                layoutParams3.rightMargin = L4;
            }
        }
        if (!a50.w5 || a50.x5) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (a50.x5) {
                layoutParams4.gravity = a50Var.z4 ? 85 : 81;
                layoutParams4.width = org.telegram.messenger.i0.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (a50.x5) {
                layoutParams5.gravity = a50Var.z4 ? 85 : 81;
                layoutParams5.width = org.telegram.messenger.i0.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (a50.w5) {
            t20Var.setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f));
        } else {
            t20Var.setPadding(org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) k20Var.getLayoutParams();
        if (a50.x5) {
            layoutParams6.width = org.telegram.messenger.i0.L(f10);
            layoutParams6.height = org.telegram.messenger.i0.L(120.0f);
            layoutParams6.gravity = a50Var.z4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (a50.w5) {
            layoutParams6.width = org.telegram.messenger.i0.L(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.i0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!a50.w5 || a50.x5) {
            ((FrameLayout.LayoutParams) x30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) q20Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) x30Var.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f7);
            ((FrameLayout.LayoutParams) q20Var.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) t20Var.getLayoutParams();
        if (a50.w5) {
            if (((s4.a0) t20Var.getLayoutManager()).o != 1) {
                ((s4.a0) t20Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.i0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.i0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.a0) t20Var.getLayoutManager()).o != 0) {
                ((s4.a0) t20Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.i0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.i0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        h30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) h30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (f30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) f30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.i0.L(259.0f), (paddingTop / 5) * 3);
        if (a50.x5) {
            b10 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            b10 = org.telegram.messenger.m5.b(8.0f, paddingTop - max, 0);
        }
        if (h40Var.getPaddingTop() != b10 || h40Var.getPaddingBottom() != L) {
            h40Var.setPadding(i12, b10, i12, L);
        }
        y40 y40Var = a50Var.s3;
        if (y40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) y40Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O0 = a50.O0(a50Var);
            if (O0 != null) {
                int measuredHeight = ((k20Var.getMeasuredHeight() / 2) + k20Var.getTop()) - (a50Var.q1.getMeasuredHeight() / 2);
                int measuredHeight2 = O0.getMeasuredHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = i0.a.u(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.i0.L(32.0f);
                layoutParams9.height = org.telegram.messenger.i0.L(70.0f);
            }
        }
        p40 p40Var = a50Var.L2;
        if (p40Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) p40Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O02 = a50.O0(a50Var);
            if (O02 != null) {
                layoutParams10.height = O02.getMeasuredHeight() - org.telegram.messenger.i0.L(14.0f);
                layoutParams10.width = O02.getMeasuredWidth() - org.telegram.messenger.i0.L(7.0f);
                int L5 = org.telegram.messenger.i0.L(16.0f);
                layoutParams10.leftMargin = L5;
                layoutParams10.rightMargin = L5;
            }
        }
        if (u5Var2 != null) {
            int L6 = ((org.telegram.messenger.i0.L(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) u5Var.getLayoutParams();
            layoutParams11.topMargin = L6 - org.telegram.messenger.i0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) u5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.i0.L(80.0f) + L6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) a50Var.M1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.i0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.i0.L(231.0f)) {
                    u5Var.setVisibility(0);
                    u5Var2.setVisibility(0);
                    layoutParams13.topMargin = L6;
                }
            }
            u5Var.setVisibility(4);
            u5Var2.setVisibility(4);
            layoutParams13.topMargin = L6 - org.telegram.messenger.i0.L(20.0f);
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i17)).g(x20Var.b, true);
        }
        this.f0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.h0) {
            this.h0 = measuredHeight3;
            a50Var.f1(false);
        }
        a50Var.i4.f = getMeasuredWidth();
        a50Var.a1();
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
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.m0.T1();
    }
}
