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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k30 extends org.telegram.ui.Components.tt0 {
    public boolean f0;
    public final RectF g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public final HashMap l0;
    public final /* synthetic */ e40 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.m0 = e40Var;
        this.f0 = false;
        this.g0 = new RectF();
        this.l0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
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
        e40 e40Var = this.m0;
        c40 c40Var = e40Var.s3;
        View view = e40Var.B4;
        View view2 = e40Var.A4;
        ArrayList arrayList2 = e40Var.P3;
        nh.h hVar = e40Var.T1;
        Paint paint = e40Var.t2;
        x10 x10Var = e40Var.d4;
        e20 e20Var = e40Var.t4;
        b20 b20Var = e40Var.R3;
        m30 m30Var = e40Var.H1;
        if (e40Var.j4 || e40Var.w4) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
                if (e40Var.H4 == null) {
                    e40Var.H4 = new RenderNode("CallActivity.Blur");
                    e40Var.I4 = org.telegram.ui.Components.tt0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.tt0.getBlurRadius();
                    RenderNode renderNode = e40Var.H4;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = e40Var.H4;
                    float f16 = e40Var.I4;
                    hVar.U0 = renderNode2;
                    hVar.V0 = f16;
                }
                int round = Math.round(getMeasuredWidth() / e40Var.I4);
                int round2 = Math.round(getMeasuredHeight() / e40Var.I4);
                e40Var.j4 = true;
                e40Var.H4.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = e40Var.H4.beginRecording();
                float f17 = 1.0f / e40Var.I4;
                beginRecording.scale(f17, f17);
                dispatchDraw(beginRecording);
                e40Var.H4.endRecording();
                e40Var.j4 = false;
            }
        }
        for (int i10 = 0; i10 < m30Var.getChildCount(); i10++) {
            View childAt = m30Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                z10 = true;
                ((org.telegram.ui.Cells.f4) childAt).setDrawAvatar(true);
            } else {
                z10 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.r)) {
                if (childAt.getMeasuredWidth() != m30Var.getMeasuredWidth()) {
                    childAt.setTranslationX((m30Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (b20Var.r == null) {
            for (int i11 = 0; i11 < x10Var.getChildCount(); i11++) {
                ((org.telegram.ui.Components.h10) x10Var.getChildAt(i11)).setProgressToFullscreen(1.0f);
            }
        } else if (x10Var.getVisibility() == 0) {
            HashMap hashMap = this.l0;
            hashMap.clear();
            int i12 = 0;
            while (i12 < m30Var.getChildCount()) {
                View childAt2 = m30Var.getChildAt(i12);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.r) {
                        m30Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) childAt2;
                            i7 = i12;
                            if (rVar2.getRenderer() != b20Var.D) {
                                hashMap.put(rVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i7 = i12;
                    if (childAt2 instanceof org.telegram.ui.Cells.f4) {
                        m30Var.getClass();
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
            while (i13 < x10Var.getChildCount()) {
                org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) x10Var.getChildAt(i13);
                View view3 = (View) hashMap.get(h10Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(h10Var.getParticipant());
                }
                float f18 = b20Var.c;
                HashMap hashMap2 = hashMap;
                if (!e40Var.E4.k()) {
                    h10Var.setAlpha(f10);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.r) {
                        org.telegram.ui.Components.voip.r rVar3 = (org.telegram.ui.Components.voip.r) view3;
                        x11 = (m30Var.getX() + rVar3.getLeft()) - b20Var.getLeft();
                        f13 = (m30Var.getY() + rVar3.getTop()) - b20Var.getTop();
                        f14 = x10Var.getX() + h10Var.getLeft();
                        f15 = x10Var.getY() + h10Var.getTop();
                    } else {
                        x11 = ((m30Var.getX() + r14.getLeft()) - b20Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y11 = ((m30Var.getY() + r14.getTop()) - b20Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = x10Var.getX() + h10Var.getLeft() + (h10Var.getMeasuredWidth() >> 1);
                        float y12 = x10Var.getY() + h10Var.getTop() + (h10Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.f4) view3).setDrawAvatar(false);
                        f13 = y11;
                        f14 = x12;
                        f15 = y12;
                    }
                    float f19 = 1.0f - f18;
                    h10Var.setTranslationX((x11 - f14) * f19);
                    h10Var.setTranslationY((f13 - f15) * f19);
                    h10Var.setScaleX(1.0f);
                    h10Var.setScaleY(1.0f);
                    h10Var.setProgressToFullscreen(f18);
                } else {
                    h10Var.setScaleX(1.0f);
                    h10Var.setScaleY(1.0f);
                    h10Var.setTranslationX(0.0f);
                    h10Var.setTranslationY(0.0f);
                    h10Var.setProgressToFullscreen(1.0f);
                    if (h10Var.getRenderer() == null) {
                        h10Var.setAlpha(f18);
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
            org.telegram.ui.Components.qj0 qj0Var = e40Var.e4;
            org.telegram.ui.Components.voip.u uVar = yVar.a;
            if (yVar.h || yVar.f || yVar.P) {
                arrayList = arrayList2;
            } else {
                yVar.y0 = false;
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
                            qj0Var = m30Var;
                        }
                        float x13 = ((qj0Var.getX() + rVar5.getX()) - yVar.getLeft()) - b20Var.getLeft();
                        float y13 = ((qj0Var.getY() + (rVar5.getY() + org.telegram.messenger.g0.L(2.0f))) - yVar.getTop()) - b20Var.getTop();
                        float f21 = 1.0f - f20;
                        float f22 = f20 * 0.0f;
                        yVar.setTranslationX((x13 * f21) + f22);
                        yVar.setTranslationY((y13 * f21) + f22);
                    }
                    uVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                    org.telegram.ui.Components.h10 h10Var2 = yVar.d;
                    if (h10Var2 != null) {
                        h10Var2.setAlpha(f20);
                    }
                    if (!yVar.b && yVar.c == null && yVar.e == null) {
                        yVar.setAlpha(f20);
                    } else if (!yVar.E) {
                        yVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.h10 h10Var3 = yVar.d;
                    if (h10Var3 != null) {
                        x10Var.getClass();
                        if (RecyclerView.R(h10Var3) == -1) {
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
                                    qj0Var = m30Var;
                                }
                                rVar8 = rVar10;
                            } else {
                                if (e40.x5) {
                                    rVar = rVar9;
                                    if (!yVar.y.b) {
                                        z9 = true;
                                        if (z9) {
                                            rVar8 = rVar;
                                        }
                                        if (!z9) {
                                            qj0Var = m30Var;
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
                            yVar.setTranslationX(((qj0Var.getX() + rVar8.getX()) - yVar.getLeft()) - b20Var.getLeft());
                            yVar.setTranslationY(((qj0Var.getY() + (rVar8.getY() + org.telegram.messenger.g0.L(2.0f))) - yVar.getTop()) - b20Var.getTop());
                            uVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                            if (yVar.w && !yVar.E) {
                                if (!e40.x5) {
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
        if (e40.x5) {
            f11 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f11 = 1.0f;
            view2.setAlpha(1.0f - b20Var.c);
            view.setAlpha(1.0f - b20Var.c);
        }
        if (b20Var.L0) {
            m30Var.setAlpha(f11 - b20Var.c);
        } else {
            m30Var.setAlpha(f11);
        }
        if (c40Var != null) {
            c40Var.setAlpha(f11 - b20Var.c);
            c40Var.setTranslationY(b20Var.c * org.telegram.messenger.g0.L(64.0f));
        }
        super.dispatchDraw(canvas);
        if (e40Var.w4) {
            return;
        }
        boolean z11 = e40Var.W3;
        RectF rectF = this.g0;
        if (!z11) {
            if (e40Var.O4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), e40Var.N4);
                float y14 = m30Var.getY();
                m30Var.getY();
                m30Var.getMeasuredHeight();
                if (!e40Var.S4) {
                    if (e40Var.R4 == null) {
                        org.telegram.ui.Components.voip.y yVar2 = e40Var.Q4;
                        if (yVar2 == null || !yVar2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(b20Var.getX() + e40Var.Q4.getX(), b20Var.getY() + e40Var.Q4.getY());
                        e40Var.Q4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(b20Var.getX() + x10Var.getX() + e40Var.R4.getX(), b20Var.getY() + x10Var.getY() + e40Var.R4.getY());
                    if (e40Var.R4.getRenderer() == null || !e40Var.R4.getRenderer().w || e40Var.R4.getRenderer().b) {
                        e40Var.R4.draw(canvas);
                    } else {
                        e40Var.R4.getRenderer().draw(canvas);
                    }
                    e40Var.R4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = m30Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt3 = m30Var.getChildAt(i15);
                    if (childAt3 == e40Var.O4) {
                        float max = Math.max(m30Var.getLeft(), childAt3.getX() + m30Var.getLeft());
                        float max2 = Math.max(y14, childAt3.getY() + m30Var.getY());
                        float min = Math.min(m30Var.getRight(), childAt3.getX() + m30Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(m30Var.getY() + m30Var.getMeasuredHeight(), childAt3.getY() + m30Var.getY() + e40Var.O4.getClipHeight());
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
                            float alpha = e40Var.N4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((e40Var.O4.getClipHeight() - e40Var.O4.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.xq.g.getInterpolation(1.0f - alpha))) + e40Var.O4.getMeasuredHeight()));
                            org.telegram.ui.Cells.f4 f4Var4 = e40Var.O4;
                            paint.getColor();
                            org.telegram.ui.ActionBar.l5[] l5VarArr = f4Var4.d;
                            if (TextUtils.isEmpty(l5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            l5VarArr[4].setFullAlpha(alpha);
                            l5VarArr[4].h(0, 0);
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
        if (e40Var.O4 != null) {
            if (e40Var.X3) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), e40Var.N4);
            }
            float y15 = m30Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = m30Var.getChildCount();
            float y16 = m30Var.getY() + m30Var.getMeasuredHeight();
            if (e40Var.S4) {
                int i16 = 0;
                while (true) {
                    if (i16 >= childCount2) {
                        f4Var = null;
                        break;
                    }
                    View childAt4 = m30Var.getChildAt(i16);
                    f4Var = e40Var.O4;
                    if (childAt4 == f4Var) {
                        break;
                    } else {
                        i16++;
                    }
                }
            } else {
                f4Var = e40Var.O4;
            }
            if (f4Var != null && y15 < y16) {
                canvas3.save();
                if (e40Var.R4 == null) {
                    f12 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - e40Var.U3) * y15, getMeasuredWidth(), (getMeasuredHeight() * e40Var.U3) + ((1.0f - e40Var.U3) * y16));
                } else {
                    f12 = 255.0f;
                }
                if (e40Var.S4) {
                    y10 = ((1.0f - e40Var.U3) * (f4Var.getY() + m30Var.getY())) + ((e20Var.getMeasuredWidth() + e20Var.getTop()) * e40Var.U3);
                    x10 = ((1.0f - e40Var.U3) * (f4Var.getX() + m30Var.getLeft())) + (e40Var.U3 * e20Var.getLeft());
                } else {
                    y10 = e20Var.getMeasuredWidth() + e20Var.getTop();
                    x10 = e20Var.getLeft();
                }
                float f24 = y10;
                canvas3.translate(x10, f24);
                if (e40Var.S4) {
                    fArr = fArr2;
                    path = path2;
                    f4Var2 = f4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    f4Var2 = f4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, f4Var.getMeasuredWidth(), f4Var.getClipHeight(), (int) (e40Var.U3 * f12), 31);
                }
                float clipHeight = (int) (((f4Var2.getClipHeight() - f4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.xq.g.getInterpolation(1.0f - e40Var.U3))) + f4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, f4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.f4 f4Var5 = f4Var2;
                f4Var5.setProgressToAvatarPreview(e40Var.S4 ? e40Var.U3 : 1.0f);
                for (int i17 = 0; i17 < 4; i17++) {
                    fArr[i17] = (1.0f - e40Var.U3) * org.telegram.messenger.g0.L(13.0f);
                    fArr[i17 + 4] = org.telegram.messenger.g0.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                f4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (e40Var.V3 != null) {
                    float f25 = f24 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - e40Var.V3.getMeasuredWidth()) - org.telegram.messenger.g0.L(14.0f);
                    if (e40Var.U3 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f25, e40Var.V3.getMeasuredWidth() + measuredWidth, e40Var.V3.getMeasuredHeight() + f25, (int) (e40Var.U3 * f12), 31);
                    } else {
                        canvas3.save();
                    }
                    e40Var.V3.setTranslationX(measuredWidth - r4.getLeft());
                    e40Var.V3.setTranslationY(f25 - r4.getTop());
                    float f26 = (e40Var.U3 * 0.2f) + 0.8f;
                    canvas3.scale(f26, f26, (e40Var.V3.getMeasuredWidth() / 2.0f) + measuredWidth, f25);
                    canvas3.translate(measuredWidth, f25);
                    e40Var.V3.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (e40Var.T3.n) {
                return;
            }
            canvas3.save();
            if (e40Var.S4 && e40Var.R4 == null) {
                canvas3.clipRect(0.0f, (1.0f - e40Var.U3) * y15, getMeasuredWidth(), (e40Var.U3 * getMeasuredHeight()) + ((1.0f - e40Var.U3) * y16));
            }
            canvas3.scale(e20Var.getScaleX(), e20Var.getScaleY(), e20Var.getX(), e20Var.getY());
            canvas3.translate(e20Var.getX(), e20Var.getY());
            e20Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        e40 e40Var = this.m0;
        n10 n10Var = e40Var.l1;
        x10 x10Var = e40Var.d4;
        m30 m30Var = e40Var.H1;
        b20 b20Var = e40Var.R3;
        if (e40Var.j4) {
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
            if (view == b20Var || view == n10Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (e40.x5 || b20Var.c != 1.0f || (view != e40Var.F1 && view != e40Var.X1 && view != e40Var.E1 && view != e40Var.V2 && view != e40Var.q3 && view != e40Var.L2)) {
            if (e40Var.w4 && view == b20Var) {
                canvas.save();
                canvas.translate(x10Var.getX() + b20Var.getX(), x10Var.getY() + b20Var.getY());
                x10Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != e40Var.t4 && view != e40Var.V3 && view != e40Var.O4 && (!e40Var.c4 || !e40Var.X3 || (view != m30Var && view != n10Var && view != e40Var.T1))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m0.Q1.P();
    }

    @Override // org.telegram.ui.Components.tt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0.Q1.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        e40 e40Var = this.m0;
        ImageReceiver imageReceiver = e40Var.Q1;
        Drawable drawable = e40Var.W1;
        b20 b20Var = e40Var.R3;
        float f11 = e40Var.p2 - L;
        int L2 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i7 = e40Var.s0;
        int i10 = L2 + i7;
        if (i7 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - e40Var.s0) / ((L - e40Var.s0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        e40Var.W1();
        if (b20Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.l6.t0.setColor(e40Var.M3);
                float f12 = e40Var.t0;
                float f13 = e40Var.s0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - e40Var.t0;
                float L3 = e40Var.s0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.g0;
                rectF.set(f12, f13, measuredWidth, L3);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.l6.t0);
            }
            org.telegram.ui.ActionBar.l6.t0.setColor(Color.argb((int) (e40Var.F1.getAlpha() * 255.0f), (int) (Color.red(e40Var.M3) * 0.8f), (int) (Color.green(e40Var.M3) * 0.8f), (int) (Color.blue(e40Var.M3) * 0.8f)));
            canvas.drawRect(e40Var.t0, 0.0f, getMeasuredWidth() - e40Var.t0, (int) ((1.0f - e40Var.S0) * e40Var.g0), org.telegram.ui.ActionBar.l6.t0);
            v20 v20Var = e40Var.q2;
            if (v20Var != null) {
                org.telegram.ui.ActionBar.l6.t0.setColor(v20Var.getBackgroundColor());
                canvas.drawRect(e40Var.t0, 0.0f, getMeasuredWidth() - e40Var.t0, (int) ((1.0f - e40Var.S0) * e40Var.g0), org.telegram.ui.ActionBar.l6.t0);
            }
        }
        if (b20Var.c != 0.0f) {
            org.telegram.ui.ActionBar.l6.t0.setColor(i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ug, false), (int) (b20Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.l6.t0);
        }
        if (e40Var.u1() && org.telegram.messenger.sc.e(512)) {
            if (b20Var.c < 0.15d) {
                if (!e40Var.q4) {
                    e40Var.q4 = true;
                    e40Var.E1();
                }
            } else if (e40Var.q4) {
                e40Var.q4 = false;
                org.telegram.messenger.g0.r(e40Var.r4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e40 e40Var = this.m0;
        e20 e20Var = e40Var.t4;
        if (e40Var.O4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = e40Var.V3.getX();
            float y11 = e40Var.V3.getY();
            float x12 = e40Var.V3.getX() + e40Var.V3.getMeasuredWidth();
            float y12 = e40Var.V3.getY() + e40Var.V3.getMeasuredHeight();
            RectF rectF = this.g0;
            rectF.set(x11, y11, x12, y12);
            boolean z9 = !rectF.contains(x10, y10);
            rectF.set(e20Var.getX(), e20Var.getY(), e20Var.getX() + e20Var.getMeasuredWidth(), e20Var.getY() + e20Var.getMeasuredWidth() + e40Var.O4.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z9 = false;
            }
            if (z9) {
                e40Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || e40Var.p2 == 0.0f || motionEvent.getY() >= e40Var.p2 - org.telegram.messenger.g0.L(37.0f) || e40Var.F1.getAlpha() != 0.0f || e40Var.W3 || e40Var.q2 != null || e40Var.R3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        e40Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        e40 e40Var = this.m0;
        if (e40Var.O4 == null || i7 != 4) {
            return super.onKeyDown(i7, keyEvent);
        }
        e40Var.f1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.tt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        float f10;
        int O0;
        e40 e40Var = this.m0;
        View view = e40Var.B4;
        View view2 = e40Var.A4;
        n10 n10Var = e40Var.l1;
        c40 c40Var = e40Var.s3;
        b20 b20Var = e40Var.R3;
        m30 m30Var = e40Var.H1;
        if (e40.x5 && this.j0 != e40Var.z4 && this.k0) {
            f10 = m30Var.getX();
            z10 = true;
        } else {
            z10 = false;
            f10 = 0.0f;
        }
        this.j0 = e40Var.z4;
        b20Var.s = true;
        super.onLayout(z9, i7, i10, i11, i12);
        b20Var.s = false;
        e40.P0(e40Var);
        this.k0 = true;
        if (c40Var != null && (O0 = e40.O0(e40Var, m30Var.getPaddingTop())) != Integer.MIN_VALUE && O0 != ((FrameLayout.LayoutParams) c40Var.getLayoutParams()).topMargin) {
            post(new jz(this, 6));
        }
        if (!z10 || m30Var.getLeft() == f10) {
            return;
        }
        float left = f10 - m30Var.getLeft();
        m30Var.setTranslationX(left);
        n10Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = m30Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
        duration.setInterpolator(xqVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        n10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
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
        e40 e40Var = this.m0;
        l20 l20Var = e40Var.x1;
        u10 u10Var = e40Var.E1;
        LinearLayout linearLayout = e40Var.q3;
        b30 b30Var = e40Var.F1;
        h40 h40Var = e40Var.f4;
        org.telegram.ui.Components.i10 i10Var = e40Var.g4;
        org.telegram.ui.Components.ly lyVar = e40Var.P1;
        org.telegram.ui.Components.voip.n2 n2Var = e40Var.s1;
        org.telegram.ui.ActionBar.l5 l5Var = e40Var.L1;
        View view = e40Var.X1;
        View view2 = e40Var.B4;
        View view3 = e40Var.A4;
        ArrayList arrayList = e40Var.P3;
        org.telegram.ui.ActionBar.l5 l5Var2 = e40Var.N1;
        j20 j20Var = e40Var.y1;
        ArrayList arrayList2 = e40Var.Q3;
        org.telegram.ui.Components.qj0 qj0Var = e40Var.e4;
        m30 m30Var = e40Var.H1;
        b20 b20Var = e40Var.R3;
        x10 x10Var = e40Var.d4;
        int size = View.MeasureSpec.getSize(i10);
        this.f0 = true;
        boolean z10 = View.MeasureSpec.getSize(i7) > size && !org.telegram.messenger.g0.Q1();
        LaunchActivity launchActivity = e40Var.Z1;
        if (launchActivity != null && org.telegram.messenger.g0.H1(launchActivity)) {
            z10 = e40.w5;
        }
        View.MeasureSpec.getSize(i7);
        b20Var.getClass();
        boolean z11 = org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i7) > size && !e40Var.u1();
        if (e40.w5 != z10) {
            e40.w5 = z10;
            if (n2Var.getMeasuredWidth() == 0) {
                int i13 = n2Var.getLayoutParams().width;
            }
            if (e40Var.u1()) {
                boolean z12 = (!b20Var.V && b20Var.b && (e40.w5 == e40Var.t1() || org.telegram.messenger.g0.Q1())) ? false : true;
                Boolean bool = e40Var.a4;
                if (bool == null || z12 != bool.booleanValue()) {
                    int systemUiVisibility = e40Var.b.getSystemUiVisibility();
                    boolean z13 = z12;
                    if (z13) {
                        i12 = systemUiVisibility & (-7);
                        e40Var.getWindow().clearFlags(1024);
                        e40Var.B0(false);
                    } else {
                        e40Var.B0(true);
                        i12 = systemUiVisibility | 6;
                        e40Var.getWindow().addFlags(1024);
                    }
                    e40Var.b.setSystemUiVisibility(i12);
                    e40Var.a4 = Boolean.valueOf(z13);
                    e40Var.J4 = !z13;
                    e40Var.b.requestApplyInsets();
                }
            } else {
                e40Var.V = false;
            }
            lyVar.y1(e40.w5 ? 6 : 2);
            m30Var.a0();
            x10Var.a0();
            this.i0 = true;
            TextView textView = e40Var.J1;
            if (textView != null) {
                textView.setVisibility(!e40.w5 ? 0 : 8);
            }
            if (e40Var.t1() == z10 && e40Var.u1() && !b20Var.b && !e40Var.R2.f.isEmpty()) {
                e40Var.h1((org.telegram.messenger.s3) e40Var.R2.f.get(0));
                b20Var.e();
            }
        }
        if (e40.x5 != z11) {
            e40.x5 = z11;
            qj0Var.setVisibility(z11 ? 0 : 8);
            m30Var.a0();
            x10Var.a0();
            z9 = true;
            this.i0 = true;
        } else {
            z9 = true;
        }
        if (this.i0) {
            e40Var.Q0(z9);
            e40Var.G1.f();
            i10Var.G(qj0Var, false);
            if (e40.x5) {
                h40Var.I(qj0Var, false);
            }
            qj0Var.setVisibility(e40.x5 ? 0 : 8);
            h40Var.H(qj0Var, e40.x5 && !b20Var.b, true);
            boolean z14 = e40.x5;
            e40Var.G4 = !z14 || b20Var.b;
            boolean z15 = !z14 && b20Var.b;
            i10Var.F(x10Var, z15);
            x10Var.setVisibility(z15 ? 0 : 8);
            m30Var.setVisibility((e40.x5 || !b20Var.b) ? 0 : 8);
            lyVar.y1(e40.w5 ? 6 : 2);
            e40Var.T1(false, false);
            m30Var.a0();
            x10Var.a0();
            org.telegram.messenger.g0.b4(m30Var);
            this.i0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            b20Var.setIsTablet(e40.x5);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.y) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (e40Var.u1() ? org.telegram.messenger.g0.L(72.0f) : org.telegram.messenger.g0.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b20Var.getLayoutParams();
        if (e40.x5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e40Var.a2[i15].getLayoutParams();
            if (e40.x5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (qj0Var != null) {
            ((FrameLayout.LayoutParams) qj0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (j20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) j20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = org.telegram.messenger.g0.L(e40Var.u1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) m30Var.getLayoutParams();
        if (e40.x5) {
            layoutParams3.gravity = e40Var.z4 ? 5 : 1;
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
            if (e40.w5) {
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
        if (!e40.w5 || e40.x5) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (e40.x5) {
                layoutParams4.gravity = e40Var.z4 ? 85 : 81;
                layoutParams4.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (e40.x5) {
                layoutParams5.gravity = e40Var.z4 ? 85 : 81;
                layoutParams5.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (e40.w5) {
            x10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            x10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) e40Var.l1.getLayoutParams();
        if (e40.x5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = e40Var.z4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (e40.w5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!e40.w5 || e40.x5) {
            ((FrameLayout.LayoutParams) b30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) u10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) b30Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) u10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) x10Var.getLayoutParams();
        if (e40.w5) {
            if (((v4.b0) x10Var.getLayoutManager()).o != 1) {
                ((v4.b0) x10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((v4.b0) x10Var.getLayoutManager()).o != 0) {
                ((v4.b0) x10Var.getLayoutManager()).j1(0);
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
        if (e40.x5) {
            b10 = 0;
            i11 = 0;
        } else {
            i11 = 0;
            b10 = org.telegram.messenger.k5.b(8.0f, paddingTop - max, 0);
        }
        if (m30Var.getPaddingTop() != b10 || m30Var.getPaddingBottom() != L) {
            m30Var.setPadding(i11, b10, i11, L);
        }
        c40 c40Var = e40Var.s3;
        if (c40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) c40Var.getLayoutParams();
            int O0 = e40.O0(e40Var, b10);
            if (O0 != Integer.MIN_VALUE) {
                layoutParams9.topMargin = O0;
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        t30 t30Var = e40Var.L2;
        if (t30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) t30Var.getLayoutParams();
            org.telegram.ui.Components.voip.r g12 = e40Var.g1();
            if (g12 != null) {
                layoutParams10.height = g12.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = g12.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
                int L5 = org.telegram.messenger.g0.L(16.0f);
                layoutParams10.leftMargin = L5;
                layoutParams10.rightMargin = L5;
            }
        }
        if (l5Var2 != null) {
            int L6 = ((org.telegram.messenger.g0.L(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) l5Var.getLayoutParams();
            layoutParams11.topMargin = L6 - org.telegram.messenger.g0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) l5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.g0.L(80.0f) + L6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) e40Var.M1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.g0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.g0.L(231.0f)) {
                    l5Var.setVisibility(0);
                    l5Var2.setVisibility(0);
                    layoutParams13.topMargin = L6;
                }
            }
            l5Var.setVisibility(4);
            l5Var2.setVisibility(4);
            layoutParams13.topMargin = L6 - org.telegram.messenger.g0.L(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.y) arrayList.get(i16)).g(b20Var.b, true);
        }
        this.f0 = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.h0) {
            this.h0 = measuredHeight;
            e40Var.f1(false);
        }
        e40Var.i4.f = getMeasuredWidth();
        e40Var.a1();
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
