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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g40 extends org.telegram.ui.Components.uu0 {
    public boolean f0;
    public final RectF g0;
    public int h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public final HashMap l0;
    public final /* synthetic */ b50 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.m0 = b50Var;
        this.f0 = false;
        this.g0 = new RectF();
        this.l0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
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
        b50 b50Var = this.m0;
        z40 z40Var = b50Var.s3;
        View view = b50Var.B4;
        View view2 = b50Var.A4;
        ArrayList arrayList2 = b50Var.P3;
        dh.k kVar2 = b50Var.T1;
        Paint paint = b50Var.t2;
        u20 u20Var = b50Var.d4;
        b30 b30Var = b50Var.t4;
        y20 y20Var = b50Var.R3;
        i40 i40Var = b50Var.H1;
        if (b50Var.j4 || b50Var.w4) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.i0.m0) {
                if (b50Var.H4 == null) {
                    b50Var.H4 = new RenderNode("CallActivity.Blur");
                    b50Var.I4 = org.telegram.ui.Components.uu0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.uu0.getBlurRadius();
                    RenderNode renderNode = b50Var.H4;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    kVar2.setBlurRoot(this);
                    RenderNode renderNode2 = b50Var.H4;
                    float f15 = b50Var.I4;
                    kVar2.U0 = renderNode2;
                    kVar2.V0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / b50Var.I4);
                int round2 = Math.round(getMeasuredHeight() / b50Var.I4);
                b50Var.j4 = true;
                b50Var.H4.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = b50Var.H4.beginRecording();
                float f16 = 1.0f / b50Var.I4;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                b50Var.H4.endRecording();
                b50Var.j4 = false;
            }
        }
        for (int i11 = 0; i11 < i40Var.getChildCount(); i11++) {
            View childAt = i40Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                z11 = true;
                ((org.telegram.ui.Cells.h4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.k)) {
                if (childAt.getMeasuredWidth() != i40Var.getMeasuredWidth()) {
                    childAt.setTranslationX((i40Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (y20Var.r == null) {
            for (int i12 = 0; i12 < u20Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.y10) u20Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (u20Var.getVisibility() == 0) {
            HashMap hashMap = this.l0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < i40Var.getChildCount()) {
                View childAt2 = i40Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.k) {
                        i40Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.k kVar3 = (org.telegram.ui.Components.voip.k) childAt2;
                            i10 = i13;
                            if (kVar3.getRenderer() != y20Var.D) {
                                hashMap.put(kVar3.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.h4) {
                        i40Var.getClass();
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
            while (i14 < u20Var.getChildCount()) {
                org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) u20Var.getChildAt(i14);
                View view3 = (View) hashMap.get(y10Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(y10Var.getParticipant());
                }
                float f17 = y20Var.c;
                HashMap hashMap2 = hashMap;
                if (!b50Var.E4.k()) {
                    y10Var.setAlpha(f7);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.k) {
                        org.telegram.ui.Components.voip.k kVar4 = (org.telegram.ui.Components.voip.k) view3;
                        x11 = (i40Var.getX() + kVar4.getLeft()) - y20Var.getLeft();
                        f12 = (i40Var.getY() + kVar4.getTop()) - y20Var.getTop();
                        f13 = u20Var.getX() + y10Var.getLeft();
                        f14 = u20Var.getY() + y10Var.getTop();
                    } else {
                        x11 = ((i40Var.getX() + r14.getLeft()) - y20Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((i40Var.getY() + r14.getTop()) - y20Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = u20Var.getX() + y10Var.getLeft() + (y10Var.getMeasuredWidth() >> 1);
                        float y11 = u20Var.getY() + y10Var.getTop() + (y10Var.getMeasuredHeight() >> 1);
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
            org.telegram.ui.Components.tk0 tk0Var = b50Var.e4;
            org.telegram.ui.Components.voip.n nVar = rVar.a;
            if (rVar.h || rVar.f || rVar.P) {
                arrayList = arrayList2;
            } else {
                rVar.y0 = false;
                float f19 = y20Var.c;
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
                            tk0Var = i40Var;
                        }
                        float x13 = ((tk0Var.getX() + kVar6.getX()) - rVar.getLeft()) - y20Var.getLeft();
                        float y12 = ((tk0Var.getY() + (kVar6.getY() + org.telegram.messenger.i0.L(2.0f))) - rVar.getTop()) - y20Var.getTop();
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
                        u20Var.getClass();
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
                        rVar.setTranslationX((u20Var.getX() + rVar.d.getX()) - rVar.getLeft());
                        float f22 = 1.0f - f19;
                        rVar.setTranslationY((u20Var.getY() + (rVar.d.getY() + (org.telegram.messenger.i0.L(2.0f) * f22))) - rVar.getTop());
                        nVar.setRoundCorners((org.telegram.messenger.i0.L(8.0f) * f22) + (org.telegram.messenger.i0.L(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.k kVar8 = rVar.c;
                        org.telegram.ui.Components.voip.k kVar9 = kVar8;
                        if (kVar8 != null || rVar.e != null) {
                            org.telegram.ui.Components.voip.k kVar10 = rVar.e;
                            if (kVar10 == null || kVar9 == null) {
                                org.telegram.ui.Components.voip.k kVar11 = kVar10 != null ? kVar10 : kVar9;
                                if (kVar10 == null) {
                                    tk0Var = i40Var;
                                }
                                kVar9 = kVar11;
                            } else {
                                if (b50.x5) {
                                    kVar = kVar10;
                                    if (!rVar.y.b) {
                                        z10 = true;
                                        if (z10) {
                                            kVar9 = kVar;
                                        }
                                        if (!z10) {
                                            tk0Var = i40Var;
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
                            rVar.setTranslationX(((tk0Var.getX() + kVar9.getX()) - rVar.getLeft()) - y20Var.getLeft());
                            rVar.setTranslationY(((tk0Var.getY() + (kVar9.getY() + org.telegram.messenger.i0.L(2.0f))) - rVar.getTop()) - y20Var.getTop());
                            nVar.setRoundCorners(org.telegram.messenger.i0.L(8.0f));
                            if (rVar.w && !rVar.E) {
                                if (!b50.x5) {
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
        if (b50.x5) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - y20Var.c);
            view.setAlpha(1.0f - y20Var.c);
        }
        if (y20Var.L0) {
            i40Var.setAlpha(f10 - y20Var.c);
        } else {
            i40Var.setAlpha(f10);
        }
        if (z40Var != null) {
            z40Var.setAlpha(f10 - y20Var.c);
            z40Var.setTranslationY(y20Var.c * org.telegram.messenger.i0.L(64.0f));
        }
        super.dispatchDraw(canvas);
        if (b50Var.w4) {
            return;
        }
        boolean z12 = b50Var.W3;
        RectF rectF = this.g0;
        if (!z12) {
            if (b50Var.O4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), b50Var.N4);
                float y13 = i40Var.getY();
                i40Var.getY();
                i40Var.getMeasuredHeight();
                if (!b50Var.S4) {
                    if (b50Var.R4 == null) {
                        org.telegram.ui.Components.voip.r rVar2 = b50Var.Q4;
                        if (rVar2 == null || !rVar2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(y20Var.getX() + b50Var.Q4.getX(), y20Var.getY() + b50Var.Q4.getY());
                        b50Var.Q4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(y20Var.getX() + u20Var.getX() + b50Var.R4.getX(), y20Var.getY() + u20Var.getY() + b50Var.R4.getY());
                    if (b50Var.R4.getRenderer() == null || !b50Var.R4.getRenderer().w || b50Var.R4.getRenderer().b) {
                        b50Var.R4.draw(canvas);
                    } else {
                        b50Var.R4.getRenderer().draw(canvas);
                    }
                    b50Var.R4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = i40Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = i40Var.getChildAt(i16);
                    if (childAt3 == b50Var.O4) {
                        float max = Math.max(i40Var.getLeft(), childAt3.getX() + i40Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + i40Var.getY());
                        float min = Math.min(i40Var.getRight(), childAt3.getX() + i40Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(i40Var.getY() + i40Var.getMeasuredHeight(), childAt3.getY() + i40Var.getY() + b50Var.O4.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + i40Var.getLeft(), childAt3.getY() + i40Var.getY());
                            float alpha = b50Var.N4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((b50Var.O4.getClipHeight() - b50Var.O4.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.gr.g.getInterpolation(1.0f - alpha))) + b50Var.O4.getMeasuredHeight()));
                            org.telegram.ui.Cells.h4 h4Var4 = b50Var.O4;
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
        if (b50Var.O4 != null) {
            if (b50Var.X3) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), b50Var.N4);
            }
            float y14 = i40Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = i40Var.getChildCount();
            float y15 = i40Var.getY() + i40Var.getMeasuredHeight();
            if (b50Var.S4) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        h4Var = null;
                        break;
                    }
                    View childAt4 = i40Var.getChildAt(i17);
                    h4Var = b50Var.O4;
                    if (childAt4 == h4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                h4Var = b50Var.O4;
            }
            if (h4Var != null && y14 < y15) {
                canvas3.save();
                if (b50Var.R4 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - b50Var.U3) * y14, getMeasuredWidth(), (getMeasuredHeight() * b50Var.U3) + ((1.0f - b50Var.U3) * y15));
                } else {
                    f11 = 255.0f;
                }
                if (b50Var.S4) {
                    y3 = ((1.0f - b50Var.U3) * (h4Var.getY() + i40Var.getY())) + ((b30Var.getMeasuredWidth() + b30Var.getTop()) * b50Var.U3);
                    x10 = ((1.0f - b50Var.U3) * (h4Var.getX() + i40Var.getLeft())) + (b50Var.U3 * b30Var.getLeft());
                } else {
                    y3 = b30Var.getMeasuredWidth() + b30Var.getTop();
                    x10 = b30Var.getLeft();
                }
                float f23 = y3;
                canvas3.translate(x10, f23);
                if (b50Var.S4) {
                    fArr = fArr2;
                    path = path2;
                    h4Var2 = h4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    h4Var2 = h4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, h4Var.getMeasuredWidth(), h4Var.getClipHeight(), (int) (b50Var.U3 * f11), 31);
                }
                float clipHeight = (int) (((h4Var2.getClipHeight() - h4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.gr.g.getInterpolation(1.0f - b50Var.U3))) + h4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, h4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.h4 h4Var5 = h4Var2;
                h4Var5.setProgressToAvatarPreview(b50Var.S4 ? b50Var.U3 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - b50Var.U3) * org.telegram.messenger.i0.L(13.0f);
                    fArr[i18 + 4] = org.telegram.messenger.i0.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                h4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (b50Var.V3 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - b50Var.V3.getMeasuredWidth()) - org.telegram.messenger.i0.L(14.0f);
                    if (b50Var.U3 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, b50Var.V3.getMeasuredWidth() + measuredWidth, b50Var.V3.getMeasuredHeight() + f24, (int) (b50Var.U3 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    b50Var.V3.setTranslationX(measuredWidth - r4.getLeft());
                    b50Var.V3.setTranslationY(f24 - r4.getTop());
                    float f25 = (b50Var.U3 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (b50Var.V3.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    b50Var.V3.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (b50Var.T3.n) {
                return;
            }
            canvas3.save();
            if (b50Var.S4 && b50Var.R4 == null) {
                canvas3.clipRect(0.0f, (1.0f - b50Var.U3) * y14, getMeasuredWidth(), (b50Var.U3 * getMeasuredHeight()) + ((1.0f - b50Var.U3) * y15));
            }
            canvas3.scale(b30Var.getScaleX(), b30Var.getScaleY(), b30Var.getX(), b30Var.getY());
            canvas3.translate(b30Var.getX(), b30Var.getY());
            b30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        b50 b50Var = this.m0;
        l20 l20Var = b50Var.l1;
        u20 u20Var = b50Var.d4;
        i40 i40Var = b50Var.H1;
        y20 y20Var = b50Var.R3;
        if (b50Var.j4) {
            if (view == i40Var) {
                int childCount = i40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i40Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == y20Var || view == l20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (b50.x5 || y20Var.c != 1.0f || (view != b50Var.F1 && view != b50Var.X1 && view != b50Var.E1 && view != b50Var.V2 && view != b50Var.q3 && view != b50Var.L2)) {
            if (b50Var.w4 && view == y20Var) {
                canvas.save();
                canvas.translate(u20Var.getX() + y20Var.getX(), u20Var.getY() + y20Var.getY());
                u20Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != b50Var.t4 && view != b50Var.V3 && view != b50Var.O4 && (!b50Var.c4 || !b50Var.X3 || (view != i40Var && view != l20Var && view != b50Var.T1))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m0.Q1.P();
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0.Q1.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        int L = org.telegram.messenger.i0.L(74.0f);
        b50 b50Var = this.m0;
        ImageReceiver imageReceiver = b50Var.Q1;
        Drawable drawable = b50Var.W1;
        y20 y20Var = b50Var.R3;
        float f10 = b50Var.p2 - L;
        int L2 = org.telegram.messenger.i0.L(15.0f) + getMeasuredHeight();
        int i10 = b50Var.s0;
        int i11 = L2 + i10;
        if (i10 + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - b50Var.s0) / ((L - b50Var.s0) - org.telegram.messenger.i0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i11 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        b50Var.T1();
        if (y20Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i11);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.t6.t0.setColor(b50Var.M3);
                float f11 = b50Var.t0;
                float f12 = b50Var.s0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - b50Var.t0;
                float L3 = b50Var.s0 + paddingTop + org.telegram.messenger.i0.L(24.0f);
                RectF rectF = this.g0;
                rectF.set(f11, f12, measuredWidth, L3);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.t0);
            }
            org.telegram.ui.ActionBar.t6.t0.setColor(Color.argb((int) (b50Var.F1.getAlpha() * 255.0f), (int) (Color.red(b50Var.M3) * 0.8f), (int) (Color.green(b50Var.M3) * 0.8f), (int) (Color.blue(b50Var.M3) * 0.8f)));
            canvas.drawRect(b50Var.t0, 0.0f, getMeasuredWidth() - b50Var.t0, (int) ((1.0f - b50Var.S0) * b50Var.g0), org.telegram.ui.ActionBar.t6.t0);
            s30 s30Var = b50Var.q2;
            if (s30Var != null) {
                org.telegram.ui.ActionBar.t6.t0.setColor(s30Var.getBackgroundColor());
                canvas.drawRect(b50Var.t0, 0.0f, getMeasuredWidth() - b50Var.t0, (int) ((1.0f - b50Var.S0) * b50Var.g0), org.telegram.ui.ActionBar.t6.t0);
            }
        }
        if (y20Var.c != 0.0f) {
            org.telegram.ui.ActionBar.t6.t0.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false), (int) (y20Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.t0);
        }
        if (b50Var.t1() && org.telegram.messenger.sc.e(512)) {
            if (y20Var.c < 0.15d) {
                if (!b50Var.q4) {
                    b50Var.q4 = true;
                    b50Var.B1();
                }
            } else if (b50Var.q4) {
                b50Var.q4 = false;
                org.telegram.messenger.i0.r(b50Var.r4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b50 b50Var = this.m0;
        b30 b30Var = b50Var.t4;
        if (b50Var.O4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = b50Var.V3.getX();
            float y10 = b50Var.V3.getY();
            float x12 = b50Var.V3.getX() + b50Var.V3.getMeasuredWidth();
            float y11 = b50Var.V3.getY() + b50Var.V3.getMeasuredHeight();
            RectF rectF = this.g0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(b30Var.getX(), b30Var.getY(), b30Var.getX() + b30Var.getMeasuredWidth(), b30Var.getY() + b30Var.getMeasuredWidth() + b50Var.O4.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                b50Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || b50Var.p2 == 0.0f || motionEvent.getY() >= b50Var.p2 - org.telegram.messenger.i0.L(37.0f) || b50Var.F1.getAlpha() != 0.0f || b50Var.W3 || b50Var.q2 != null || b50Var.R3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        b50Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        b50 b50Var = this.m0;
        if (b50Var.O4 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        b50Var.f1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        b50 b50Var = this.m0;
        View view = b50Var.B4;
        View view2 = b50Var.A4;
        l20 l20Var = b50Var.l1;
        y20 y20Var = b50Var.R3;
        i40 i40Var = b50Var.H1;
        if (b50.x5 && this.j0 != b50Var.z4 && this.k0) {
            f7 = i40Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.j0 = b50Var.z4;
        y20Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        y20Var.s = false;
        b50.P0(b50Var);
        this.k0 = true;
        if (!z11 || i40Var.getLeft() == f7) {
            return;
        }
        float left = f7 - i40Var.getLeft();
        i40Var.setTranslationX(left);
        l20Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = i40Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        duration.setInterpolator(grVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
        l20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
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
        b50 b50Var = this.m0;
        i30 i30Var = b50Var.x1;
        r20 r20Var = b50Var.E1;
        LinearLayout linearLayout = b50Var.q3;
        y30 y30Var = b50Var.F1;
        e50 e50Var = b50Var.f4;
        org.telegram.ui.Components.z10 z10Var = b50Var.g4;
        org.telegram.ui.Components.zy zyVar = b50Var.P1;
        org.telegram.ui.Components.voip.b2 b2Var = b50Var.s1;
        org.telegram.ui.ActionBar.u5 u5Var = b50Var.L1;
        View view = b50Var.X1;
        l20 l20Var = b50Var.l1;
        View view2 = b50Var.B4;
        View view3 = b50Var.A4;
        ArrayList arrayList = b50Var.P3;
        org.telegram.ui.ActionBar.u5 u5Var2 = b50Var.N1;
        g30 g30Var = b50Var.y1;
        ArrayList arrayList2 = b50Var.Q3;
        org.telegram.ui.Components.tk0 tk0Var = b50Var.e4;
        i40 i40Var = b50Var.H1;
        y20 y20Var = b50Var.R3;
        u20 u20Var = b50Var.d4;
        int size = View.MeasureSpec.getSize(i11);
        this.f0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !org.telegram.messenger.i0.Q1();
        View.MeasureSpec.getSize(i10);
        y20Var.getClass();
        boolean z12 = org.telegram.messenger.i0.Q1() && View.MeasureSpec.getSize(i10) > size && !b50Var.t1();
        if (b50.w5 != z11) {
            b50.w5 = z11;
            if (b2Var.getMeasuredWidth() == 0) {
                int i14 = b2Var.getLayoutParams().width;
            }
            if (b50Var.t1()) {
                boolean z13 = (!y20Var.V && y20Var.b && (b50.w5 == b50Var.s1() || org.telegram.messenger.i0.Q1())) ? false : true;
                Boolean bool = b50Var.a4;
                if (bool == null || z13 != bool.booleanValue()) {
                    int systemUiVisibility = b50Var.b.getSystemUiVisibility();
                    boolean z14 = z13;
                    if (z14) {
                        i13 = systemUiVisibility & (-7);
                        b50Var.getWindow().clearFlags(1024);
                        b50Var.B0(false);
                    } else {
                        b50Var.B0(true);
                        i13 = systemUiVisibility | 6;
                        b50Var.getWindow().addFlags(1024);
                    }
                    b50Var.b.setSystemUiVisibility(i13);
                    b50Var.a4 = Boolean.valueOf(z14);
                    b50Var.J4 = !z14;
                    b50Var.b.requestApplyInsets();
                }
            } else {
                b50Var.V = false;
            }
            zyVar.y1(b50.w5 ? 6 : 2);
            i40Var.a0();
            u20Var.a0();
            this.i0 = true;
            TextView textView = b50Var.J1;
            if (textView != null) {
                textView.setVisibility(!b50.w5 ? 0 : 8);
            }
            if (b50Var.s1() == z11 && b50Var.t1() && !y20Var.b && !b50Var.R2.f.isEmpty()) {
                b50Var.g1((org.telegram.messenger.v3) b50Var.R2.f.get(0));
                y20Var.e();
            }
        }
        if (b50.x5 != z12) {
            b50.x5 = z12;
            tk0Var.setVisibility(z12 ? 0 : 8);
            i40Var.a0();
            u20Var.a0();
            z10 = true;
            this.i0 = true;
        } else {
            z10 = true;
        }
        if (this.i0) {
            b50Var.Q0(z10);
            b50Var.G1.f();
            z10Var.G(tk0Var, false);
            if (b50.x5) {
                e50Var.I(tk0Var, false);
            }
            tk0Var.setVisibility(b50.x5 ? 0 : 8);
            e50Var.H(tk0Var, b50.x5 && !y20Var.b, true);
            boolean z15 = b50.x5;
            b50Var.G4 = !z15 || y20Var.b;
            boolean z16 = !z15 && y20Var.b;
            z10Var.F(u20Var, z16);
            u20Var.setVisibility(z16 ? 0 : 8);
            i40Var.setVisibility((b50.x5 || !y20Var.b) ? 0 : 8);
            zyVar.y1(b50.w5 ? 6 : 2);
            b50Var.Q1(false, false);
            i40Var.a0();
            u20Var.a0();
            org.telegram.messenger.i0.a4(i40Var);
            this.i0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            y20Var.setIsTablet(b50.x5);
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                ((org.telegram.ui.Components.voip.r) arrayList2.get(i15)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (b50Var.t1() ? org.telegram.messenger.i0.L(72.0f) : org.telegram.messenger.i0.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y20Var.getLayoutParams();
        if (b50.x5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b50Var.a2[i16].getLayoutParams();
            if (b50.x5) {
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(8.0f);
            }
        }
        if (tk0Var != null) {
            ((FrameLayout.LayoutParams) tk0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (g30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) g30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = org.telegram.messenger.i0.L(b50Var.t1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) i40Var.getLayoutParams();
        if (b50.x5) {
            layoutParams3.gravity = b50Var.z4 ? 5 : 1;
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
            if (b50.w5) {
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
        if (!b50.w5 || b50.x5) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (b50.x5) {
                layoutParams4.gravity = b50Var.z4 ? 85 : 81;
                layoutParams4.width = org.telegram.messenger.i0.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (b50.x5) {
                layoutParams5.gravity = b50Var.z4 ? 85 : 81;
                layoutParams5.width = org.telegram.messenger.i0.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (b50.w5) {
            u20Var.setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f));
        } else {
            u20Var.setPadding(org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) l20Var.getLayoutParams();
        if (b50.x5) {
            layoutParams6.width = org.telegram.messenger.i0.L(f10);
            layoutParams6.height = org.telegram.messenger.i0.L(120.0f);
            layoutParams6.gravity = b50Var.z4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (b50.w5) {
            layoutParams6.width = org.telegram.messenger.i0.L(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.i0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!b50.w5 || b50.x5) {
            ((FrameLayout.LayoutParams) y30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) r20Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) y30Var.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f7);
            ((FrameLayout.LayoutParams) r20Var.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) u20Var.getLayoutParams();
        if (b50.w5) {
            if (((s4.a0) u20Var.getLayoutManager()).o != 1) {
                ((s4.a0) u20Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.i0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.i0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.a0) u20Var.getLayoutManager()).o != 0) {
                ((s4.a0) u20Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.i0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.i0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        i30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) i30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (g30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) g30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.i0.L(259.0f), (paddingTop / 5) * 3);
        if (b50.x5) {
            b10 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            b10 = org.telegram.messenger.m5.b(8.0f, paddingTop - max, 0);
        }
        if (i40Var.getPaddingTop() != b10 || i40Var.getPaddingBottom() != L) {
            i40Var.setPadding(i12, b10, i12, L);
        }
        z40 z40Var = b50Var.s3;
        if (z40Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) z40Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O0 = b50.O0(b50Var);
            if (O0 != null) {
                int measuredHeight = ((l20Var.getMeasuredHeight() / 2) + l20Var.getTop()) - (b50Var.q1.getMeasuredHeight() / 2);
                int measuredHeight2 = O0.getMeasuredHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = i0.a.u(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.i0.L(32.0f);
                layoutParams9.height = org.telegram.messenger.i0.L(70.0f);
            }
        }
        q40 q40Var = b50Var.L2;
        if (q40Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) q40Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O02 = b50.O0(b50Var);
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
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) b50Var.M1.getLayoutParams();
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
            ((org.telegram.ui.Components.voip.r) arrayList.get(i17)).g(y20Var.b, true);
        }
        this.f0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.h0) {
            this.h0 = measuredHeight3;
            b50Var.f1(false);
        }
        b50Var.i4.f = getMeasuredWidth();
        b50Var.a1();
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
