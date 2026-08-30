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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h50 extends org.telegram.ui.Components.qv0 {
    public final /* synthetic */ c60 A0;
    public boolean t0;
    public final RectF u0;
    public int v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public final HashMap z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.A0 = c60Var;
        this.t0 = false;
        this.u0 = new RectF();
        this.z0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a1  */
    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
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
        c60 c60Var = this.A0;
        a60 a60Var = c60Var.y1;
        View view = c60Var.H2;
        View view2 = c60Var.G2;
        ArrayList arrayList2 = c60Var.V1;
        yg.h hVar = c60Var.Z;
        Paint paint = c60Var.z0;
        r30 r30Var = c60Var.j2;
        y30 y30Var = c60Var.z2;
        v30 v30Var = c60Var.X1;
        j50 j50Var = c60Var.N;
        if (!c60Var.p2 && !c60Var.C2) {
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (c60Var.N2 == null) {
                    c60Var.N2 = new RenderNode("CallActivity.Blur");
                    c60Var.O2 = org.telegram.ui.Components.qv0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.qv0.getBlurRadius();
                    RenderNode renderNode = c60Var.N2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = c60Var.N2;
                    float f15 = c60Var.O2;
                    hVar.T0 = renderNode2;
                    hVar.U0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / c60Var.O2);
                int round2 = Math.round(getMeasuredHeight() / c60Var.O2);
                c60Var.p2 = true;
                c60Var.N2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = c60Var.N2.beginRecording();
                float f16 = 1.0f / c60Var.O2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                c60Var.N2.endRecording();
                c60Var.p2 = false;
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
            HashMap hashMap = this.z0;
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
                float f17 = v30Var.c;
                HashMap hashMap2 = hashMap;
                if (!c60Var.K2.k()) {
                    s20Var.setAlpha(1.0f);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (j50Var.getX() + lVar3.getLeft()) - v30Var.getLeft();
                        f12 = (j50Var.getY() + lVar3.getTop()) - v30Var.getTop();
                        f13 = r30Var.getX() + s20Var.getLeft();
                        f14 = r30Var.getY() + s20Var.getTop();
                    } else {
                        x11 = ((j50Var.getX() + r14.getLeft()) - v30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y11 = ((j50Var.getY() + r14.getTop()) - v30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = r30Var.getX() + s20Var.getLeft() + (s20Var.getMeasuredWidth() >> 1);
                        float y12 = r30Var.getY() + s20Var.getTop() + (s20Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.e4) view3).setDrawAvatar(false);
                        f12 = y11;
                        f13 = x12;
                        f14 = y12;
                    }
                    float f18 = 1.0f - f17;
                    s20Var.setTranslationX((x11 - f13) * f18);
                    s20Var.setTranslationY((f12 - f14) * f18);
                    s20Var.setScaleX(1.0f);
                    s20Var.setScaleY(1.0f);
                    s20Var.setProgressToFullscreen(f17);
                } else {
                    s20Var.setScaleX(1.0f);
                    s20Var.setScaleY(1.0f);
                    s20Var.setTranslationX(0.0f);
                    s20Var.setTranslationY(0.0f);
                    s20Var.setProgressToFullscreen(1.0f);
                    if (s20Var.getRenderer() == null) {
                        s20Var.setAlpha(f17);
                    }
                }
                i14++;
                hashMap = hashMap2;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList2.get(i15);
            org.telegram.ui.Components.sl0 sl0Var = c60Var.k2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.M) {
                arrayList = arrayList2;
            } else {
                tVar.v0 = false;
                float f19 = v30Var.c;
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
                            sl0Var = j50Var;
                        }
                        float x13 = ((sl0Var.getX() + lVar5.getX()) - tVar.getLeft()) - v30Var.getLeft();
                        float y13 = ((sl0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - v30Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        tVar.setTranslationX((x13 * f20) + f21);
                        tVar.setTranslationY((y13 * f20) + f21);
                    }
                    oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.s20 s20Var2 = tVar.d;
                    if (s20Var2 != null) {
                        s20Var2.setAlpha(f19);
                    }
                    if (!tVar.b && tVar.c == null && tVar.e == null) {
                        tVar.setAlpha(f19);
                    } else if (!tVar.B) {
                        tVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.s20 s20Var3 = tVar.d;
                    if (s20Var3 != null) {
                        r30Var.getClass();
                        if (RecyclerView.R(s20Var3) == -1) {
                            tVar.setAlpha(tVar.d.getAlpha());
                        } else if (tVar.c == null) {
                            if (tVar.v && !tVar.B) {
                                tVar.setAlpha(f19);
                            }
                            tVar.d.setAlpha(f19);
                            f19 = 1.0f;
                        } else {
                            tVar.d.setAlpha(1.0f);
                            if (tVar.v && !tVar.B) {
                                tVar.setAlpha(1.0f);
                            }
                        }
                        tVar.setTranslationX((r30Var.getX() + tVar.d.getX()) - tVar.getLeft());
                        float f22 = 1.0f - f19;
                        tVar.setTranslationY((r30Var.getY() + (tVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - tVar.getTop());
                        oVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = tVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || tVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = tVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    sl0Var = j50Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (c60.D3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z4 = true;
                                        if (z4) {
                                            lVar8 = lVar;
                                        }
                                        if (!z4) {
                                            sl0Var = j50Var;
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
                            tVar.setTranslationX(((sl0Var.getX() + lVar8.getX()) - tVar.getLeft()) - v30Var.getLeft());
                            tVar.setTranslationY(((sl0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - v30Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.B) {
                                if (!c60.D3) {
                                    tVar.v0 = true;
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
        if (c60.D3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - v30Var.c);
            view.setAlpha(1.0f - v30Var.c);
        }
        if (v30Var.I0) {
            j50Var.setAlpha(f10 - v30Var.c);
        } else {
            j50Var.setAlpha(f10);
        }
        if (a60Var != null) {
            a60Var.setAlpha(f10 - v30Var.c);
            a60Var.setTranslationY(v30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (c60Var.C2) {
            return;
        }
        boolean z10 = c60Var.c2;
        RectF rectF = this.u0;
        if (!z10) {
            if (c60Var.U2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), c60Var.T2);
                float y14 = j50Var.getY();
                j50Var.getY();
                j50Var.getMeasuredHeight();
                if (!c60Var.Y2) {
                    if (c60Var.X2 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = c60Var.W2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(v30Var.getX() + c60Var.W2.getX(), v30Var.getY() + c60Var.W2.getY());
                        c60Var.W2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(v30Var.getX() + r30Var.getX() + c60Var.X2.getX(), v30Var.getY() + r30Var.getY() + c60Var.X2.getY());
                    if (c60Var.X2.getRenderer() == null || !c60Var.X2.getRenderer().v || c60Var.X2.getRenderer().b) {
                        c60Var.X2.draw(canvas);
                    } else {
                        c60Var.X2.getRenderer().draw(canvas);
                    }
                    c60Var.X2.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = j50Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = j50Var.getChildAt(i16);
                    if (childAt3 == c60Var.U2) {
                        float max = Math.max(j50Var.getLeft(), childAt3.getX() + j50Var.getLeft());
                        float max2 = Math.max(y14, childAt3.getY() + j50Var.getY());
                        float min = Math.min(j50Var.getRight(), childAt3.getX() + j50Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(j50Var.getY() + j50Var.getMeasuredHeight(), childAt3.getY() + j50Var.getY() + c60Var.U2.getClipHeight());
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
                            float alpha = c60Var.T2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((c60Var.U2.getClipHeight() - c60Var.U2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.nr.g.getInterpolation(1.0f - alpha))) + c60Var.U2.getMeasuredHeight()));
                            org.telegram.ui.Cells.e4 e4Var4 = c60Var.U2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.k5[] k5VarArr = e4Var4.d;
                            if (TextUtils.isEmpty(k5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            k5VarArr[4].setFullAlpha(alpha);
                            k5VarArr[4].h(0, 0);
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
        if (c60Var.U2 != null) {
            if (c60Var.d2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), c60Var.T2);
            }
            float y15 = j50Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = j50Var.getChildCount();
            float y16 = j50Var.getY() + j50Var.getMeasuredHeight();
            if (c60Var.Y2) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        e4Var = null;
                        break;
                    }
                    View childAt4 = j50Var.getChildAt(i17);
                    e4Var = c60Var.U2;
                    if (childAt4 == e4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                e4Var = c60Var.U2;
            }
            if (e4Var != null && y15 < y16) {
                canvas3.save();
                if (c60Var.X2 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - c60Var.a2) * y15, getMeasuredWidth(), (getMeasuredHeight() * c60Var.a2) + ((1.0f - c60Var.a2) * y16));
                } else {
                    f11 = 255.0f;
                }
                if (c60Var.Y2) {
                    y10 = ((1.0f - c60Var.a2) * (e4Var.getY() + j50Var.getY())) + ((y30Var.getMeasuredWidth() + y30Var.getTop()) * c60Var.a2);
                    x10 = ((1.0f - c60Var.a2) * (e4Var.getX() + j50Var.getLeft())) + (c60Var.a2 * y30Var.getLeft());
                } else {
                    y10 = y30Var.getMeasuredWidth() + y30Var.getTop();
                    x10 = y30Var.getLeft();
                }
                float f23 = y10;
                canvas3.translate(x10, f23);
                if (c60Var.Y2) {
                    fArr = fArr2;
                    path = path2;
                    e4Var2 = e4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    e4Var2 = e4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, e4Var.getMeasuredWidth(), e4Var.getClipHeight(), (int) (c60Var.a2 * f11), 31);
                }
                float clipHeight = (int) (((e4Var2.getClipHeight() - e4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.nr.g.getInterpolation(1.0f - c60Var.a2))) + e4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, e4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.e4 e4Var5 = e4Var2;
                e4Var5.setProgressToAvatarPreview(c60Var.Y2 ? c60Var.a2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - c60Var.a2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                e4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (c60Var.b2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - c60Var.b2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (c60Var.a2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, c60Var.b2.getMeasuredWidth() + measuredWidth, c60Var.b2.getMeasuredHeight() + f24, (int) (c60Var.a2 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    c60Var.b2.setTranslationX(measuredWidth - r4.getLeft());
                    c60Var.b2.setTranslationY(f24 - r4.getTop());
                    float f25 = (c60Var.a2 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (c60Var.b2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    c60Var.b2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (c60Var.Z1.n) {
                return;
            }
            canvas3.save();
            if (c60Var.Y2 && c60Var.X2 == null) {
                canvas3.clipRect(0.0f, (1.0f - c60Var.a2) * y15, getMeasuredWidth(), (c60Var.a2 * getMeasuredHeight()) + ((1.0f - c60Var.a2) * y16));
            }
            canvas3.scale(y30Var.getScaleX(), y30Var.getScaleY(), y30Var.getX(), y30Var.getY());
            canvas3.translate(y30Var.getX(), y30Var.getY());
            y30Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        c60 c60Var = this.A0;
        i30 i30Var = c60Var.e;
        r30 r30Var = c60Var.j2;
        j50 j50Var = c60Var.N;
        v30 v30Var = c60Var.X1;
        if (c60Var.p2) {
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
                return super.drawChild(canvas, view, j10);
            }
        } else if (c60.D3 || v30Var.c != 1.0f || (view != c60Var.L && view != c60Var.d0 && view != c60Var.K && view != c60Var.b1 && view != c60Var.w1 && view != c60Var.R0)) {
            if (c60Var.C2 && view == v30Var) {
                canvas.save();
                canvas.translate(r30Var.getX() + v30Var.getX(), r30Var.getY() + v30Var.getY());
                r30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != c60Var.z2 && view != c60Var.b2 && view != c60Var.U2 && (!c60Var.i2 || !c60Var.d2 || (view != j50Var && view != i30Var && view != c60Var.Z))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
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
        c60 c60Var = this.A0;
        ImageReceiver imageReceiver = c60Var.W;
        Drawable drawable = c60Var.c0;
        v30 v30Var = c60Var.X1;
        float f11 = c60Var.v0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
        if (i11 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        c60Var.Q1();
        if (v30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.j6.t0.setColor(c60Var.S1);
                i16 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
                float f12 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
                float f13 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.u0;
                rectF.set(i16, f12, f13, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.j6.t0);
            }
            org.telegram.ui.ActionBar.j6.t0.setColor(Color.argb((int) (c60Var.L.getAlpha() * 255.0f), (int) (Color.red(c60Var.S1) * 0.8f), (int) (Color.green(c60Var.S1) * 0.8f), (int) (Color.blue(c60Var.S1) * 0.8f)));
            float statusBarHeight = c60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.j6.t0);
            p40 p40Var = c60Var.w0;
            if (p40Var != null) {
                org.telegram.ui.ActionBar.j6.t0.setColor(p40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
                float f14 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingLeft;
                canvas.drawRect(f14, 0.0f, measuredWidth3 - i15, c60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.j6.t0);
            }
        }
        if (v30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.j6.t0.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false), (int) (v30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.t0);
        }
        if (c60Var.r1() && LiteMode.isEnabled(512)) {
            if (v30Var.c < 0.15d) {
                if (!c60Var.w2) {
                    c60Var.w2 = true;
                    c60Var.z1();
                }
            } else if (c60Var.w2) {
                c60Var.w2 = false;
                AndroidUtilities.cancelRunOnUIThread(c60Var.x2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c60 c60Var = this.A0;
        y30 y30Var = c60Var.z2;
        if (c60Var.U2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = c60Var.b2.getX();
            float y11 = c60Var.b2.getY();
            float x12 = c60Var.b2.getX() + c60Var.b2.getMeasuredWidth();
            float y12 = c60Var.b2.getY() + c60Var.b2.getMeasuredHeight();
            RectF rectF = this.u0;
            rectF.set(x11, y11, x12, y12);
            boolean z4 = !rectF.contains(x10, y10);
            rectF.set(y30Var.getX(), y30Var.getY(), y30Var.getX() + y30Var.getMeasuredWidth(), y30Var.getY() + y30Var.getMeasuredWidth() + c60Var.U2.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z4 = false;
            }
            if (z4) {
                c60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || c60Var.v0 == 0.0f || motionEvent.getY() >= c60Var.v0 - AndroidUtilities.dp(37.0f) || c60Var.L.getAlpha() != 0.0f || c60Var.c2 || c60Var.w0 != null || c60Var.X1.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        c60Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        c60 c60Var = this.A0;
        if (c60Var.U2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        c60Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        boolean z10;
        c60 c60Var = this.A0;
        View view = c60Var.H2;
        View view2 = c60Var.G2;
        i30 i30Var = c60Var.e;
        v30 v30Var = c60Var.X1;
        j50 j50Var = c60Var.N;
        if (c60.D3 && this.x0 != c60Var.F2 && this.y0) {
            f10 = j50Var.getX();
            z10 = true;
        } else {
            f10 = 0.0f;
            z10 = false;
        }
        this.x0 = c60Var.F2;
        v30Var.s = true;
        super.onLayout(z4, i10, i11, i12, i13);
        v30Var.s = false;
        c60.J0(c60Var);
        this.y0 = true;
        if (!z10 || j50Var.getLeft() == f10) {
            return;
        }
        float left = f10 - j50Var.getLeft();
        j50Var.setTranslationX(left);
        i30Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = j50Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f;
        duration.setInterpolator(nrVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
        i30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(nrVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        float f10;
        int dp;
        float f11;
        int i12;
        int b10;
        c60 c60Var = this.A0;
        f40 f40Var = c60Var.D;
        o30 o30Var = c60Var.K;
        LinearLayout linearLayout = c60Var.w1;
        z40 z40Var = c60Var.L;
        i60 i60Var = c60Var.l2;
        org.telegram.ui.Components.t20 t20Var = c60Var.m2;
        org.telegram.ui.Components.oz ozVar = c60Var.V;
        org.telegram.ui.Components.voip.v2 v2Var = c60Var.w;
        org.telegram.ui.ActionBar.k5 k5Var = c60Var.R;
        View view = c60Var.d0;
        i30 i30Var = c60Var.e;
        View view2 = c60Var.H2;
        View view3 = c60Var.G2;
        ArrayList arrayList = c60Var.V1;
        org.telegram.ui.ActionBar.k5 k5Var2 = c60Var.T;
        d40 d40Var = c60Var.E;
        ArrayList arrayList2 = c60Var.W1;
        org.telegram.ui.Components.sl0 sl0Var = c60Var.k2;
        j50 j50Var = c60Var.N;
        v30 v30Var = c60Var.X1;
        r30 r30Var = c60Var.j2;
        int size = View.MeasureSpec.getSize(i11);
        this.t0 = true;
        boolean z10 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        v30Var.getClass();
        boolean z11 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !c60Var.r1();
        if (c60.C3 != z10) {
            c60.C3 = z10;
            if (v2Var.getMeasuredWidth() == 0) {
                int i13 = v2Var.getLayoutParams().width;
            }
            c60.H0(c60Var);
            ozVar.y1(c60.C3 ? 6 : 2);
            j50Var.a0();
            r30Var.a0();
            this.w0 = true;
            TextView textView = c60Var.P;
            if (textView != null) {
                textView.setVisibility(!c60.C3 ? 0 : 8);
            }
            if (c60Var.q1() == z10 && c60Var.r1() && !v30Var.b && !c60Var.X0.visibleVideoParticipants.isEmpty()) {
                c60Var.e1(c60Var.X0.visibleVideoParticipants.get(0));
                v30Var.e();
            }
        }
        if (c60.D3 != z11) {
            c60.D3 = z11;
            sl0Var.setVisibility(z11 ? 0 : 8);
            j50Var.a0();
            r30Var.a0();
            z4 = true;
            this.w0 = true;
        } else {
            z4 = true;
        }
        if (this.w0) {
            c60Var.O0(z4);
            c60Var.M.l();
            t20Var.G(sl0Var, false);
            if (c60.D3) {
                i60Var.I(sl0Var, false);
            }
            sl0Var.setVisibility(c60.D3 ? 0 : 8);
            i60Var.H(sl0Var, c60.D3 && !v30Var.b, true);
            boolean z12 = c60.D3;
            c60Var.M2 = !z12 || v30Var.b;
            boolean z13 = !z12 && v30Var.b;
            t20Var.F(r30Var, z13);
            r30Var.setVisibility(z13 ? 0 : 8);
            j50Var.setVisibility((c60.D3 || !v30Var.b) ? 0 : 8);
            ozVar.y1(c60.C3 ? 6 : 2);
            c60Var.N1(false, false);
            j50Var.a0();
            r30Var.a0();
            AndroidUtilities.updateVisibleRows(j50Var);
            this.w0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            v30Var.setIsTablet(c60.D3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (c60Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v30Var.getLayoutParams();
        if (c60.D3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c60Var.g0[i15].getLayoutParams();
            if (c60.D3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (sl0Var != null) {
            ((FrameLayout.LayoutParams) sl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (d40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) d40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(c60Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) j50Var.getLayoutParams();
        if (c60.D3) {
            layoutParams3.gravity = c60Var.F2 ? 5 : 1;
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
            if (c60.C3) {
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
        if (!c60.C3 || c60.D3) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (c60.D3) {
                layoutParams4.gravity = c60Var.F2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (c60.D3) {
                layoutParams5.gravity = c60Var.F2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (c60.C3) {
            r30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            r30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) i30Var.getLayoutParams();
        if (c60.D3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = c60Var.F2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (c60.C3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!c60.C3 || c60.D3) {
            ((FrameLayout.LayoutParams) z40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) o30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) z40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) o30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) r30Var.getLayoutParams();
        if (c60.C3) {
            if (((f2.i0) r30Var.getLayoutManager()).o != 1) {
                ((f2.i0) r30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.i0) r30Var.getLayoutManager()).o != 0) {
                ((f2.i0) r30Var.getLayoutManager()).j1(0);
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
        if (c60.D3) {
            b10 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            b10 = org.telegram.messenger.y3.b(8.0f, paddingTop - max, 0);
        }
        if (j50Var.getPaddingTop() != b10 || j50Var.getPaddingBottom() != dp) {
            j50Var.setPadding(i12, b10, i12, dp);
        }
        a60 a60Var = c60Var.y1;
        if (a60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) a60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = c60.I0(c60Var);
            if (I0 != null) {
                int measuredHeight = ((i30Var.getMeasuredHeight() / 2) + i30Var.getTop()) - (c60Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = kh.a2.d(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        r50 r50Var = c60Var.R0;
        if (r50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) r50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = c60.I0(c60Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (k5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) k5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) k5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) c60Var.S.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    k5Var.setVisibility(0);
                    k5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            k5Var.setVisibility(4);
            k5Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i16)).g(v30Var.b, true);
        }
        this.t0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.v0) {
            this.v0 = measuredHeight3;
            c60Var.d1(false);
        }
        c60Var.o2.f = getMeasuredWidth();
        c60Var.Y0();
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
