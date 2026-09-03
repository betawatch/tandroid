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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i50 extends org.telegram.ui.Components.pv0 {
    public final /* synthetic */ d60 A0;
    public boolean t0;
    public final RectF u0;
    public int v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public final HashMap z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.A0 = d60Var;
        this.t0 = false;
        this.u0 = new RectF();
        this.z0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a1  */
    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.e4 e4Var;
        float f11;
        float y10;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.e4 e4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z4;
        float x11;
        float f12;
        float f13;
        float f14;
        int i10;
        Shader.TileMode tileMode;
        d60 d60Var = this.A0;
        b60 b60Var = d60Var.y1;
        View view = d60Var.H2;
        View view2 = d60Var.G2;
        ArrayList arrayList2 = d60Var.V1;
        zg.h hVar = d60Var.Z;
        Paint paint = d60Var.z0;
        s30 s30Var = d60Var.j2;
        z30 z30Var = d60Var.z2;
        w30 w30Var = d60Var.X1;
        k50 k50Var = d60Var.N;
        if (!d60Var.p2 && !d60Var.C2) {
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (d60Var.N2 == null) {
                    d60Var.N2 = new RenderNode("CallActivity.Blur");
                    d60Var.O2 = org.telegram.ui.Components.pv0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.pv0.getBlurRadius();
                    RenderNode renderNode = d60Var.N2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = d60Var.N2;
                    float f15 = d60Var.O2;
                    hVar.T0 = renderNode2;
                    hVar.U0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / d60Var.O2);
                int round2 = Math.round(getMeasuredHeight() / d60Var.O2);
                d60Var.p2 = true;
                d60Var.N2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = d60Var.N2.beginRecording();
                float f16 = 1.0f / d60Var.O2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                d60Var.N2.endRecording();
                d60Var.p2 = false;
            }
        }
        for (int i11 = 0; i11 < k50Var.getChildCount(); i11++) {
            View childAt = k50Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                ((org.telegram.ui.Cells.e4) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != k50Var.getMeasuredWidth()) {
                    childAt.setTranslationX((k50Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (w30Var.r == null) {
            for (int i12 = 0; i12 < s30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.t20) s30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (s30Var.getVisibility() == 0) {
            HashMap hashMap = this.z0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < k50Var.getChildCount()) {
                View childAt2 = k50Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        k50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != w30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.e4) {
                        k50Var.getClass();
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
            while (i14 < s30Var.getChildCount()) {
                org.telegram.ui.Components.t20 t20Var = (org.telegram.ui.Components.t20) s30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(t20Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(t20Var.getParticipant());
                }
                float f17 = w30Var.c;
                HashMap hashMap2 = hashMap;
                if (!d60Var.K2.k()) {
                    t20Var.setAlpha(1.0f);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (k50Var.getX() + lVar3.getLeft()) - w30Var.getLeft();
                        f12 = (k50Var.getY() + lVar3.getTop()) - w30Var.getTop();
                        f13 = s30Var.getX() + t20Var.getLeft();
                        f14 = s30Var.getY() + t20Var.getTop();
                    } else {
                        x11 = ((k50Var.getX() + r14.getLeft()) - w30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y11 = ((k50Var.getY() + r14.getTop()) - w30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = s30Var.getX() + t20Var.getLeft() + (t20Var.getMeasuredWidth() >> 1);
                        float y12 = s30Var.getY() + t20Var.getTop() + (t20Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.e4) view3).setDrawAvatar(false);
                        f12 = y11;
                        f13 = x12;
                        f14 = y12;
                    }
                    float f18 = 1.0f - f17;
                    t20Var.setTranslationX((x11 - f13) * f18);
                    t20Var.setTranslationY((f12 - f14) * f18);
                    t20Var.setScaleX(1.0f);
                    t20Var.setScaleY(1.0f);
                    t20Var.setProgressToFullscreen(f17);
                } else {
                    t20Var.setScaleX(1.0f);
                    t20Var.setScaleY(1.0f);
                    t20Var.setTranslationX(0.0f);
                    t20Var.setTranslationY(0.0f);
                    t20Var.setProgressToFullscreen(1.0f);
                    if (t20Var.getRenderer() == null) {
                        t20Var.setAlpha(f17);
                    }
                }
                i14++;
                hashMap = hashMap2;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList2.get(i15);
            org.telegram.ui.Components.sl0 sl0Var = d60Var.k2;
            org.telegram.ui.Components.voip.p pVar = uVar.a;
            if (uVar.h || uVar.f || uVar.M) {
                arrayList = arrayList2;
            } else {
                uVar.v0 = false;
                float f19 = w30Var.c;
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
                            sl0Var = k50Var;
                        }
                        float x13 = ((sl0Var.getX() + lVar5.getX()) - uVar.getLeft()) - w30Var.getLeft();
                        float y13 = ((sl0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - uVar.getTop()) - w30Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        uVar.setTranslationX((x13 * f20) + f21);
                        uVar.setTranslationY((y13 * f20) + f21);
                    }
                    pVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.t20 t20Var2 = uVar.d;
                    if (t20Var2 != null) {
                        t20Var2.setAlpha(f19);
                    }
                    if (!uVar.b && uVar.c == null && uVar.e == null) {
                        uVar.setAlpha(f19);
                    } else if (!uVar.B) {
                        uVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.t20 t20Var3 = uVar.d;
                    if (t20Var3 != null) {
                        s30Var.getClass();
                        if (RecyclerView.R(t20Var3) == -1) {
                            uVar.setAlpha(uVar.d.getAlpha());
                        } else if (uVar.c == null) {
                            if (uVar.v && !uVar.B) {
                                uVar.setAlpha(f19);
                            }
                            uVar.d.setAlpha(f19);
                            f19 = 1.0f;
                        } else {
                            uVar.d.setAlpha(1.0f);
                            if (uVar.v && !uVar.B) {
                                uVar.setAlpha(1.0f);
                            }
                        }
                        uVar.setTranslationX((s30Var.getX() + uVar.d.getX()) - uVar.getLeft());
                        float f22 = 1.0f - f19;
                        uVar.setTranslationY((s30Var.getY() + (uVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - uVar.getTop());
                        pVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = uVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || uVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = uVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    sl0Var = k50Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (d60.D3) {
                                    lVar = lVar9;
                                    if (!uVar.x.b) {
                                        z4 = true;
                                        if (z4) {
                                            lVar8 = lVar;
                                        }
                                        if (!z4) {
                                            sl0Var = k50Var;
                                        }
                                    }
                                } else {
                                    lVar = lVar9;
                                }
                                z4 = false;
                                if (z4) {
                                }
                                if (!z4) {
                                }
                            }
                            uVar.setTranslationX(((sl0Var.getX() + lVar8.getX()) - uVar.getLeft()) - w30Var.getLeft());
                            uVar.setTranslationY(((sl0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - uVar.getTop()) - w30Var.getTop());
                            pVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (uVar.v && !uVar.B) {
                                if (!d60.D3) {
                                    uVar.v0 = true;
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
        if (d60.D3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - w30Var.c);
            view.setAlpha(1.0f - w30Var.c);
        }
        if (w30Var.I0) {
            k50Var.setAlpha(f10 - w30Var.c);
        } else {
            k50Var.setAlpha(f10);
        }
        if (b60Var != null) {
            b60Var.setAlpha(f10 - w30Var.c);
            b60Var.setTranslationY(w30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (d60Var.C2) {
            return;
        }
        boolean z10 = d60Var.c2;
        RectF rectF = this.u0;
        if (!z10) {
            if (d60Var.U2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), d60Var.T2);
                float y14 = k50Var.getY();
                k50Var.getY();
                k50Var.getMeasuredHeight();
                if (!d60Var.Y2) {
                    if (d60Var.X2 == null) {
                        org.telegram.ui.Components.voip.u uVar2 = d60Var.W2;
                        if (uVar2 == null || !uVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(w30Var.getX() + d60Var.W2.getX(), w30Var.getY() + d60Var.W2.getY());
                        d60Var.W2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(w30Var.getX() + s30Var.getX() + d60Var.X2.getX(), w30Var.getY() + s30Var.getY() + d60Var.X2.getY());
                    if (d60Var.X2.getRenderer() == null || !d60Var.X2.getRenderer().v || d60Var.X2.getRenderer().b) {
                        d60Var.X2.draw(canvas);
                    } else {
                        d60Var.X2.getRenderer().draw(canvas);
                    }
                    d60Var.X2.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = k50Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = k50Var.getChildAt(i16);
                    if (childAt3 == d60Var.U2) {
                        float max = Math.max(k50Var.getLeft(), childAt3.getX() + k50Var.getLeft());
                        float max2 = Math.max(y14, childAt3.getY() + k50Var.getY());
                        float min = Math.min(k50Var.getRight(), childAt3.getX() + k50Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(k50Var.getY() + k50Var.getMeasuredHeight(), childAt3.getY() + k50Var.getY() + d60Var.U2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + k50Var.getLeft(), childAt3.getY() + k50Var.getY());
                            float alpha = d60Var.T2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((d60Var.U2.getClipHeight() - d60Var.U2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.pr.g.getInterpolation(1.0f - alpha))) + d60Var.U2.getMeasuredHeight()));
                            org.telegram.ui.Cells.e4 e4Var4 = d60Var.U2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.l5[] l5VarArr = e4Var4.d;
                            if (TextUtils.isEmpty(l5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            l5VarArr[4].setFullAlpha(alpha);
                            l5VarArr[4].h(0, 0);
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
        if (d60Var.U2 != null) {
            if (d60Var.d2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), d60Var.T2);
            }
            float y15 = k50Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = k50Var.getChildCount();
            float y16 = k50Var.getY() + k50Var.getMeasuredHeight();
            if (d60Var.Y2) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        e4Var = null;
                        break;
                    }
                    View childAt4 = k50Var.getChildAt(i17);
                    e4Var = d60Var.U2;
                    if (childAt4 == e4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                e4Var = d60Var.U2;
            }
            if (e4Var != null && y15 < y16) {
                canvas3.save();
                if (d60Var.X2 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - d60Var.a2) * y15, getMeasuredWidth(), (getMeasuredHeight() * d60Var.a2) + ((1.0f - d60Var.a2) * y16));
                } else {
                    f11 = 255.0f;
                }
                if (d60Var.Y2) {
                    y10 = ((1.0f - d60Var.a2) * (e4Var.getY() + k50Var.getY())) + ((z30Var.getMeasuredWidth() + z30Var.getTop()) * d60Var.a2);
                    x10 = ((1.0f - d60Var.a2) * (e4Var.getX() + k50Var.getLeft())) + (d60Var.a2 * z30Var.getLeft());
                } else {
                    y10 = z30Var.getMeasuredWidth() + z30Var.getTop();
                    x10 = z30Var.getLeft();
                }
                float f23 = y10;
                canvas3.translate(x10, f23);
                if (d60Var.Y2) {
                    fArr = fArr2;
                    path = path2;
                    e4Var2 = e4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    e4Var2 = e4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, e4Var.getMeasuredWidth(), e4Var.getClipHeight(), (int) (d60Var.a2 * f11), 31);
                }
                float clipHeight = (int) (((e4Var2.getClipHeight() - e4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.pr.g.getInterpolation(1.0f - d60Var.a2))) + e4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, e4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.e4 e4Var5 = e4Var2;
                e4Var5.setProgressToAvatarPreview(d60Var.Y2 ? d60Var.a2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - d60Var.a2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                e4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (d60Var.b2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - d60Var.b2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (d60Var.a2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, d60Var.b2.getMeasuredWidth() + measuredWidth, d60Var.b2.getMeasuredHeight() + f24, (int) (d60Var.a2 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    d60Var.b2.setTranslationX(measuredWidth - r4.getLeft());
                    d60Var.b2.setTranslationY(f24 - r4.getTop());
                    float f25 = (d60Var.a2 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (d60Var.b2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    d60Var.b2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (d60Var.Z1.n) {
                return;
            }
            canvas3.save();
            if (d60Var.Y2 && d60Var.X2 == null) {
                canvas3.clipRect(0.0f, (1.0f - d60Var.a2) * y15, getMeasuredWidth(), (d60Var.a2 * getMeasuredHeight()) + ((1.0f - d60Var.a2) * y16));
            }
            canvas3.scale(z30Var.getScaleX(), z30Var.getScaleY(), z30Var.getX(), z30Var.getY());
            canvas3.translate(z30Var.getX(), z30Var.getY());
            z30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        d60 d60Var = this.A0;
        j30 j30Var = d60Var.e;
        s30 s30Var = d60Var.j2;
        k50 k50Var = d60Var.N;
        w30 w30Var = d60Var.X1;
        if (d60Var.p2) {
            if (view == k50Var) {
                int childCount = k50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = k50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == w30Var || view == j30Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (d60.D3 || w30Var.c != 1.0f || (view != d60Var.L && view != d60Var.d0 && view != d60Var.K && view != d60Var.b1 && view != d60Var.w1 && view != d60Var.R0)) {
            if (d60Var.C2 && view == w30Var) {
                canvas.save();
                canvas.translate(s30Var.getX() + w30Var.getX(), s30Var.getY() + w30Var.getY());
                s30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != d60Var.z2 && view != d60Var.b2 && view != d60Var.U2 && (!d60Var.i2 || !d60Var.d2 || (view != k50Var && view != j30Var && view != d60Var.Z))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.W.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
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
        d60 d60Var = this.A0;
        ImageReceiver imageReceiver = d60Var.W;
        Drawable drawable = d60Var.c0;
        w30 w30Var = d60Var.X1;
        float f11 = d60Var.v0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
        if (i11 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        d60Var.Q1();
        if (w30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.t0.setColor(d60Var.S1);
                i16 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
                float f12 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
                float f13 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.u0;
                rectF.set(i16, f12, f13, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.k6.t0);
            }
            org.telegram.ui.ActionBar.k6.t0.setColor(Color.argb((int) (d60Var.L.getAlpha() * 255.0f), (int) (Color.red(d60Var.S1) * 0.8f), (int) (Color.green(d60Var.S1) * 0.8f), (int) (Color.blue(d60Var.S1) * 0.8f)));
            float statusBarHeight = d60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.k6.t0);
            q40 q40Var = d60Var.w0;
            if (q40Var != null) {
                org.telegram.ui.ActionBar.k6.t0.setColor(q40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
                float f14 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingLeft;
                canvas.drawRect(f14, 0.0f, measuredWidth3 - i15, d60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.k6.t0);
            }
        }
        if (w30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.k6.t0.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.gg, false), (int) (w30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.t0);
        }
        if (d60Var.r1() && LiteMode.isEnabled(512)) {
            if (w30Var.c < 0.15d) {
                if (!d60Var.w2) {
                    d60Var.w2 = true;
                    d60Var.z1();
                }
            } else if (d60Var.w2) {
                d60Var.w2 = false;
                AndroidUtilities.cancelRunOnUIThread(d60Var.x2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d60 d60Var = this.A0;
        z30 z30Var = d60Var.z2;
        if (d60Var.U2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = d60Var.b2.getX();
            float y11 = d60Var.b2.getY();
            float x12 = d60Var.b2.getX() + d60Var.b2.getMeasuredWidth();
            float y12 = d60Var.b2.getY() + d60Var.b2.getMeasuredHeight();
            RectF rectF = this.u0;
            rectF.set(x11, y11, x12, y12);
            boolean z4 = !rectF.contains(x10, y10);
            rectF.set(z30Var.getX(), z30Var.getY(), z30Var.getX() + z30Var.getMeasuredWidth(), z30Var.getY() + z30Var.getMeasuredWidth() + d60Var.U2.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z4 = false;
            }
            if (z4) {
                d60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || d60Var.v0 == 0.0f || motionEvent.getY() >= d60Var.v0 - AndroidUtilities.dp(37.0f) || d60Var.L.getAlpha() != 0.0f || d60Var.c2 || d60Var.w0 != null || d60Var.X1.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        d60Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        d60 d60Var = this.A0;
        if (d60Var.U2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        d60Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        boolean z10;
        d60 d60Var = this.A0;
        View view = d60Var.H2;
        View view2 = d60Var.G2;
        j30 j30Var = d60Var.e;
        w30 w30Var = d60Var.X1;
        k50 k50Var = d60Var.N;
        if (d60.D3 && this.x0 != d60Var.F2 && this.y0) {
            f10 = k50Var.getX();
            z10 = true;
        } else {
            f10 = 0.0f;
            z10 = false;
        }
        this.x0 = d60Var.F2;
        w30Var.s = true;
        super.onLayout(z4, i10, i11, i12, i13);
        w30Var.s = false;
        d60.J0(d60Var);
        this.y0 = true;
        if (!z10 || k50Var.getLeft() == f10) {
            return;
        }
        float left = f10 - k50Var.getLeft();
        k50Var.setTranslationX(left);
        j30Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = k50Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
        duration.setInterpolator(prVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(prVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(prVar).start();
        j30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(prVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        float f10;
        int dp;
        float f11;
        int i12;
        int b10;
        d60 d60Var = this.A0;
        g40 g40Var = d60Var.D;
        p30 p30Var = d60Var.K;
        LinearLayout linearLayout = d60Var.w1;
        a50 a50Var = d60Var.L;
        j60 j60Var = d60Var.l2;
        org.telegram.ui.Components.u20 u20Var = d60Var.m2;
        org.telegram.ui.Components.qz qzVar = d60Var.V;
        org.telegram.ui.Components.voip.w2 w2Var = d60Var.w;
        org.telegram.ui.ActionBar.l5 l5Var = d60Var.R;
        View view = d60Var.d0;
        j30 j30Var = d60Var.e;
        View view2 = d60Var.H2;
        View view3 = d60Var.G2;
        ArrayList arrayList = d60Var.V1;
        org.telegram.ui.ActionBar.l5 l5Var2 = d60Var.T;
        e40 e40Var = d60Var.E;
        ArrayList arrayList2 = d60Var.W1;
        org.telegram.ui.Components.sl0 sl0Var = d60Var.k2;
        k50 k50Var = d60Var.N;
        w30 w30Var = d60Var.X1;
        s30 s30Var = d60Var.j2;
        int size = View.MeasureSpec.getSize(i11);
        this.t0 = true;
        boolean z10 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        w30Var.getClass();
        boolean z11 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !d60Var.r1();
        if (d60.C3 != z10) {
            d60.C3 = z10;
            if (w2Var.getMeasuredWidth() == 0) {
                int i13 = w2Var.getLayoutParams().width;
            }
            d60.H0(d60Var);
            qzVar.y1(d60.C3 ? 6 : 2);
            k50Var.a0();
            s30Var.a0();
            this.w0 = true;
            TextView textView = d60Var.P;
            if (textView != null) {
                textView.setVisibility(!d60.C3 ? 0 : 8);
            }
            if (d60Var.q1() == z10 && d60Var.r1() && !w30Var.b && !d60Var.X0.visibleVideoParticipants.isEmpty()) {
                d60Var.e1(d60Var.X0.visibleVideoParticipants.get(0));
                w30Var.e();
            }
        }
        if (d60.D3 != z11) {
            d60.D3 = z11;
            sl0Var.setVisibility(z11 ? 0 : 8);
            k50Var.a0();
            s30Var.a0();
            z4 = true;
            this.w0 = true;
        } else {
            z4 = true;
        }
        if (this.w0) {
            d60Var.O0(z4);
            d60Var.M.l();
            u20Var.G(sl0Var, false);
            if (d60.D3) {
                j60Var.I(sl0Var, false);
            }
            sl0Var.setVisibility(d60.D3 ? 0 : 8);
            j60Var.H(sl0Var, d60.D3 && !w30Var.b, true);
            boolean z12 = d60.D3;
            d60Var.M2 = !z12 || w30Var.b;
            boolean z13 = !z12 && w30Var.b;
            u20Var.F(s30Var, z13);
            s30Var.setVisibility(z13 ? 0 : 8);
            k50Var.setVisibility((d60.D3 || !w30Var.b) ? 0 : 8);
            qzVar.y1(d60.C3 ? 6 : 2);
            d60Var.N1(false, false);
            k50Var.a0();
            s30Var.a0();
            AndroidUtilities.updateVisibleRows(k50Var);
            this.w0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            w30Var.setIsTablet(d60.D3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (d60Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w30Var.getLayoutParams();
        if (d60.D3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) d60Var.g0[i15].getLayoutParams();
            if (d60.D3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (sl0Var != null) {
            ((FrameLayout.LayoutParams) sl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (e40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) e40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(d60Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) k50Var.getLayoutParams();
        if (d60.D3) {
            layoutParams3.gravity = d60Var.F2 ? 5 : 1;
            layoutParams3.width = AndroidUtilities.dp(320.0f);
            int dp3 = AndroidUtilities.dp(4.0f);
            layoutParams3.leftMargin = dp3;
            layoutParams3.rightMargin = dp3;
            layoutParams3.bottomMargin = dp2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            dp = AndroidUtilities.dp(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (d60.C3) {
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
        if (!d60.C3 || d60.D3) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (d60.D3) {
                layoutParams4.gravity = d60Var.F2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (d60.D3) {
                layoutParams5.gravity = d60Var.F2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (d60.C3) {
            s30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            s30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) j30Var.getLayoutParams();
        if (d60.D3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = d60Var.F2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (d60.C3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!d60.C3 || d60.D3) {
            ((FrameLayout.LayoutParams) a50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) p30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) a50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) p30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) s30Var.getLayoutParams();
        if (d60.C3) {
            if (((f2.j0) s30Var.getLayoutManager()).o != 1) {
                ((f2.j0) s30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.j0) s30Var.getLayoutManager()).o != 0) {
                ((f2.j0) s30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        g40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) g40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (e40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) e40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (d60.D3) {
            b10 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            b10 = org.telegram.messenger.y3.b(8.0f, paddingTop - max, 0);
        }
        if (k50Var.getPaddingTop() != b10 || k50Var.getPaddingBottom() != dp) {
            k50Var.setPadding(i12, b10, i12, dp);
        }
        b60 b60Var = d60Var.y1;
        if (b60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) b60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = d60.I0(d60Var);
            if (I0 != null) {
                int measuredHeight = ((j30Var.getMeasuredHeight() / 2) + j30Var.getTop()) - (d60Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = l.d.d(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        s50 s50Var = d60Var.R0;
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
        if (l5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) l5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) l5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) d60Var.S.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    l5Var.setVisibility(0);
                    l5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            l5Var.setVisibility(4);
            l5Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i16)).g(w30Var.b, true);
        }
        this.t0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.v0) {
            this.v0 = measuredHeight3;
            d60Var.d1(false);
        }
        d60Var.o2.f = getMeasuredWidth();
        d60Var.Y0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.A0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.t0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.A0.Q1();
    }
}
