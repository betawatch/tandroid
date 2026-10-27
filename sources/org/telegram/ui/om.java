package org.telegram.ui;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class om extends org.telegram.ui.Components.ww0 {
    public boolean A0;
    public final /* synthetic */ wn B0;
    public int l0;
    public int m0;
    public int n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public final ArrayList r0;
    public Paint s0;
    public int t0;
    public final mm u0;
    public final mm v0;
    public final RectF w0;
    public float x0;
    public float y0;
    public long z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.ui.mm] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.mm] */
    public om(wn wnVar, Context context, org.telegram.ui.ActionBar.j5 j5Var) {
        super(context, j5Var);
        this.B0 = wnVar;
        this.l0 = 0;
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        final int i10 = 0;
        this.u0 = new dh.a(this) { // from class: org.telegram.ui.mm
            public final /* synthetic */ om b;

            {
                this.b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // dh.a
            public final void b(ch.a aVar, RectF rectF) {
                switch (i10) {
                }
                aVar.a = true;
            }

            @Override // dh.a
            public final void f(Canvas canvas, RectF rectF) {
                switch (i10) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        wn wnVar2 = this.b.B0;
                        if (wnVar2.x0.Z0()) {
                            wnVar2.x0.f(canvas, rectF);
                            break;
                        } else {
                            wnVar2.x0.C1(canvas, rectF);
                            for (int i11 = 0; i11 < wnVar2.x0.getChildCount(); i11++) {
                                View childAt = wnVar2.x0.getChildAt(i11);
                                if (!wn.h2(wnVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                                        if (s1Var.C1()) {
                                            canvas.save();
                                            canvas.translate(0.0f, s1Var.V);
                                            s1Var.D1(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        wnVar2.x0.drawChild(canvas, childAt, uptimeMillis);
                                        if (s1Var.U2()) {
                                            canvas.save();
                                            canvas.translate(s1Var.getX(), s1Var.getY());
                                            s1Var.X1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                        wnVar2.x0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                                        canvas.restore();
                                    } else {
                                        wnVar2.x0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            wnVar2.x0.D1(canvas, rectF);
                            break;
                        }
                    default:
                        om omVar = this.b;
                        wn wnVar3 = omVar.B0;
                        RectF rectF2 = omVar.w0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, omVar.getWidth(), omVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = wnVar3.Zc.e;
                            int i12 = (int) ((1.0f - f7) * 255.0f);
                            int i13 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.y6.m0(org.telegram.ui.ActionBar.y6.o1(f7 * 0.85f, wnVar3.getThemedColor(org.telegram.ui.ActionBar.y6.d6))));
                            }
                            ih.d.b(omVar.u0, canvas, rectF, wnVar3.x0, omVar, i12);
                            bi.r1 r1Var = wnVar3.X3;
                            if (r1Var != null) {
                                ih.d.b(r1Var, canvas, rectF, r1Var, omVar, i13);
                            }
                            fi.h1 h1Var = wnVar3.C1;
                            if (h1Var != null && h1Var.getVisibility() == 0) {
                                int childCount = wnVar3.C1.getChildCount();
                                for (int i14 = 0; i14 < childCount; i14++) {
                                    View childAt2 = wnVar3.C1.getChildAt(i14);
                                    if ((childAt2 instanceof yn) && childAt2.getVisibility() == 0) {
                                        om omVar2 = ((yn) childAt2).a.j1;
                                        ih.d.a(omVar2.v0, canvas, rectF, omVar2, omVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.v0 = new dh.a(this) { // from class: org.telegram.ui.mm
            public final /* synthetic */ om b;

            {
                this.b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // dh.a
            public final void b(ch.a aVar, RectF rectF) {
                switch (i11) {
                }
                aVar.a = true;
            }

            @Override // dh.a
            public final void f(Canvas canvas, RectF rectF) {
                switch (i11) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        wn wnVar2 = this.b.B0;
                        if (wnVar2.x0.Z0()) {
                            wnVar2.x0.f(canvas, rectF);
                            break;
                        } else {
                            wnVar2.x0.C1(canvas, rectF);
                            for (int i112 = 0; i112 < wnVar2.x0.getChildCount(); i112++) {
                                View childAt = wnVar2.x0.getChildAt(i112);
                                if (!wn.h2(wnVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                                        if (s1Var.C1()) {
                                            canvas.save();
                                            canvas.translate(0.0f, s1Var.V);
                                            s1Var.D1(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        wnVar2.x0.drawChild(canvas, childAt, uptimeMillis);
                                        if (s1Var.U2()) {
                                            canvas.save();
                                            canvas.translate(s1Var.getX(), s1Var.getY());
                                            s1Var.X1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                        wnVar2.x0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                                        canvas.restore();
                                    } else {
                                        wnVar2.x0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            wnVar2.x0.D1(canvas, rectF);
                            break;
                        }
                    default:
                        om omVar = this.b;
                        wn wnVar3 = omVar.B0;
                        RectF rectF2 = omVar.w0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, omVar.getWidth(), omVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = wnVar3.Zc.e;
                            int i12 = (int) ((1.0f - f7) * 255.0f);
                            int i13 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.y6.m0(org.telegram.ui.ActionBar.y6.o1(f7 * 0.85f, wnVar3.getThemedColor(org.telegram.ui.ActionBar.y6.d6))));
                            }
                            ih.d.b(omVar.u0, canvas, rectF, wnVar3.x0, omVar, i12);
                            bi.r1 r1Var = wnVar3.X3;
                            if (r1Var != null) {
                                ih.d.b(r1Var, canvas, rectF, r1Var, omVar, i13);
                            }
                            fi.h1 h1Var = wnVar3.C1;
                            if (h1Var != null && h1Var.getVisibility() == 0) {
                                int childCount = wnVar3.C1.getChildCount();
                                for (int i14 = 0; i14 < childCount; i14++) {
                                    View childAt2 = wnVar3.C1.getChildAt(i14);
                                    if ((childAt2 instanceof yn) && childAt2.getVisibility() == 0) {
                                        om omVar2 = ((yn) childAt2).a.j1;
                                        ih.d.a(omVar2.v0, canvas, rectF, omVar2, omVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.w0 = new RectF();
        this.H = new nm(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.B0;
        wnVar.j1.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        kVar.setTranslationY(0.0f);
        zk zkVar = wnVar.Ab;
        if (zkVar != null) {
            zkVar.setTranslationY(wnVar.A1 != null ? r3.getCurrentHeight() : 0);
        }
        fi.v3 v3Var = wnVar.I1;
        if (v3Var != null) {
            v3Var.setTranslationY(0.0f);
        }
        fi.v3 v3Var2 = wnVar.H1;
        if (v3Var2 != null) {
            v3Var2.setTranslationY(0.0f);
        }
        wnVar.c1.setTranslationY(0.0f);
        wnVar.P.setTranslationY(0.0f);
        wnVar.M9 = 0.0f;
        wnVar.N9 = 0.0f;
        wnVar.j1.setBackgroundTranslation(0);
        org.telegram.ui.Components.u60 u60Var = wnVar.n3;
        if (u60Var != null) {
            u60Var.f(0.0f);
        }
        fi.f6 f6Var = wnVar.K2;
        if (f6Var != null) {
            org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) f6Var.b;
            jaVar.u = 0.0f;
            jaVar.d.invalidate();
        }
        wnVar.setFragmentPanTranslationOffset(0);
        wnVar.A9();
    }

    @Override // org.telegram.ui.Components.ww0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ww0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.ww0
    public final int Q() {
        di.a3 a3Var = this.B0.V1;
        if (a3Var == null || !a3Var.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // org.telegram.ui.Components.ww0
    public final void T(Drawable drawable) {
        wn wnVar = this.B0;
        jh.m mVar = wnVar.W;
        if (drawable instanceof org.telegram.ui.Components.vc0) {
            ((org.telegram.ui.Components.vc0) drawable).p();
        }
        hh.a c10 = mVar.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(mVar.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(mVar.a(c10));
        wnVar.dc = computePerceivedBrightness <= 0.721f;
        wnVar.ec = computePerceivedBrightness2 <= 0.9f;
        wnVar.L.a = c10;
        hh.d dVar = wnVar.H;
        if (dVar != null) {
            Iterator it = dVar.v.iterator();
            while (it.hasNext()) {
                ((eh.e) it.next()).g0 = true;
            }
        }
        hh.d dVar2 = wnVar.I;
        if (dVar2 != null) {
            Iterator it2 = dVar2.v.iterator();
            while (it2.hasNext()) {
                ((eh.e) it2.next()).g0 = true;
            }
        }
        lh.f fVar = wnVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        jh.f fVar2 = wnVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        wnVar.j1.invalidate();
        Iterator it3 = wnVar.y.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        wnVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f7, org.telegram.ui.Cells.s1 s1Var, int i10) {
        int save = canvas.save();
        wn wnVar = this.B0;
        float x9 = s1Var.getX() + wnVar.x0.getLeft();
        float y3 = s1Var.getY() + wnVar.x0.getY() + s1Var.getPaddingTop();
        float alpha = s1Var.a() ? s1Var.getAlpha() : 1.0f;
        canvas.clipRect(wnVar.x0.getLeft(), f7, wnVar.x0.getRight(), ((((wnVar.x0.getY() + wnVar.x0.getMeasuredHeight()) - wnVar.Ra) - wnVar.v.e()) - wnVar.Tc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x9, y3);
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.m2(alpha, canvas, true);
        } else if (i10 == 1) {
            s1Var.W1(canvas, alpha);
        } else if (i10 == 2) {
            s1Var.I1(alpha, canvas, s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i10 == 3) {
            boolean z10 = s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0;
            s1Var.N1(canvas, alpha);
            if (!z10) {
                s1Var.d2(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((s1Var.getCurrentPosition() == null || (1 & s1Var.getCurrentPosition().flags) != 0) && wnVar.c9 != null)) {
            float f10 = (wnVar.X8 * wnVar.a9) / 0.2f;
            canvas.save();
            s1Var.h2(canvas, wnVar.c9, f10, wnVar.Y8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x9, y3);
            s1Var.i2(this, canvas, wnVar.d9, wnVar.c9, f10);
            canvas.restore();
        }
        s1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    public final boolean Z(View view) {
        if (view == this.L) {
            return true;
        }
        wn wnVar = this.B0;
        return view == wnVar.K2 || view == wnVar.C1 || view == wnVar.C9 || view == wnVar.X || view == wnVar.W3;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        wn wnVar = this.B0;
        jk jkVar = wnVar.Y;
        if (jkVar == null || view != jkVar.m0) {
            super.addView(view, i10, layoutParams);
        } else {
            lh.f fVar = wnVar.X;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        jk jkVar2 = wnVar.Y;
        if (jkVar2 != null && view == jkVar2.m0) {
            hi.e0 e0Var = (hi.e0) view;
            e0Var.setBackgroundDrawable(wnVar.J.c(e0Var.c, wnVar.x, false));
        }
        jk jkVar3 = wnVar.Y;
        if (jkVar3 == null || view != (sgVar = jkVar3.O1)) {
            return;
        }
        sgVar.setBlurredBackgroundFactory(wnVar.J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0c1a, code lost:
    
        if (r0.getVisibility() != 0) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x077f, code lost:
    
        if ((r5 & 1) != 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019e, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0b71  */
    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        float f7;
        float f10;
        int i11;
        Integer num;
        Paint paint;
        Paint paint2;
        float f11;
        View view;
        Paint paint3;
        Paint paint4;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Integer num2;
        View view2;
        Canvas canvas3;
        om omVar;
        float f12;
        float f13;
        View view3;
        org.telegram.ui.Components.hb0 hb0Var;
        org.telegram.ui.Components.hb0 hb0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        di.p5 p5Var;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        di.p5 p5Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        float f14;
        ArrayList arrayList4;
        float f15;
        int i12;
        Integer num3;
        Paint paint8;
        Paint paint9;
        float f16;
        float f17;
        Paint paint10;
        Matrix matrix4;
        Matrix matrix5;
        Matrix matrix6;
        Paint paint11;
        Paint paint12;
        di.p5 p5Var3;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i13;
        int i14;
        ArrayList arrayList5;
        org.telegram.ui.Cells.s1 s1Var2;
        ArrayList arrayList6;
        mj mjVar;
        Integer num4;
        float f18;
        float f19;
        boolean z10;
        di.p5 p5Var4;
        di.p5 p5Var5;
        org.telegram.ui.Components.hb0 hb0Var3;
        float f20;
        float f21;
        di.p5 p5Var6;
        di.p5 p5Var7;
        di.p5 p5Var8;
        di.p5 p5Var9;
        Canvas canvas4;
        float f22;
        float f23;
        View view9;
        float f24;
        float f25;
        float f26;
        Integer num5;
        float f27;
        float f28;
        int i15;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.v0 v0Var2;
        Paint paint14;
        float f29;
        float f30;
        Paint paint15;
        float f31;
        float f32;
        float f33;
        float f34;
        di.p5 p5Var10;
        di.p5 p5Var11;
        Integer num7;
        di.p5 p5Var12;
        di.p5 p5Var13;
        Integer num8;
        om omVar2;
        Matrix matrix7;
        Matrix matrix8;
        Matrix matrix9;
        Paint paint16;
        Paint paint17;
        Paint paint18;
        float f35;
        float f36;
        View view10;
        int i16;
        Paint paint19;
        float f37;
        float f38;
        Paint paint20;
        float f39;
        float f40;
        float f41;
        Canvas canvas5;
        float f42;
        float f43;
        float f44;
        di.p5 p5Var14;
        di.p5 p5Var15;
        Integer num9;
        di.p5 p5Var16;
        di.p5 p5Var17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f45;
        Integer num11;
        di.p5 p5Var18;
        di.p5 p5Var19;
        Integer num12;
        org.telegram.ui.Components.nf nfVar;
        org.telegram.ui.Components.hb0 hb0Var4;
        org.telegram.ui.Components.hb0 hb0Var5;
        org.telegram.ui.Cells.s1 s1Var3;
        float f46;
        di.p5 p5Var20;
        org.telegram.ui.Cells.s1 s1Var4;
        boolean z11;
        org.telegram.ui.Components.hb0 hb0Var6;
        float f47;
        org.telegram.ui.Components.hb0 hb0Var7;
        float f48;
        di.p5 p5Var21;
        org.telegram.ui.Components.hb0 hb0Var8;
        org.telegram.ui.Components.hb0 hb0Var9;
        di.p5 p5Var22;
        View view11;
        float f49;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.k kVar6;
        View view15;
        float f50;
        Paint paint23;
        float f51;
        float f52;
        Paint paint24;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        float f53;
        Integer num13;
        float f54;
        Paint paint25;
        Paint paint26;
        float f55;
        float f56;
        Paint paint27;
        Matrix matrix13;
        Matrix matrix14;
        Matrix matrix15;
        Paint paint28;
        Paint paint29;
        float f57;
        Paint paint30;
        float f58;
        float f59;
        Paint paint31;
        View view24;
        float f60;
        float f61;
        org.telegram.ui.ActionBar.k kVar7;
        int i17;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.Components.t40 t40Var;
        View view25;
        ej ejVar;
        View view26;
        tj tjVar;
        om omVar3 = this;
        wn wnVar = omVar3.B0;
        mj mjVar2 = wnVar.v;
        ArrayList arrayList7 = wnVar.D6;
        wnVar.Y.Q1();
        wnVar.Ac();
        if (wnVar.Ha || ((tjVar = wnVar.y0) != null && tjVar.k())) {
            wnVar.Ha = false;
            wnVar.Lc();
        }
        wnVar.dd(false, false);
        wnVar.Nc();
        ej ejVar2 = wnVar.s2;
        if (ejVar2 != null && ejVar2.getTag() != null && (view26 = (ejVar = wnVar.s2).e) != null) {
            ejVar.g(view26);
        }
        org.telegram.ui.Components.t40 t40Var2 = wnVar.u2;
        if (t40Var2 != null && t40Var2.getTag() != null && (view25 = (t40Var = wnVar.u2).e) != null) {
            t40Var.g(view25);
        }
        float f62 = 0.2f;
        float f63 = 2.0f;
        if (wnVar.Aa) {
            kVar10 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            canvas2 = canvas;
            i10 = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), omVar3.getMeasuredWidth(), omVar3.getMeasuredHeight(), (int) (wnVar.Ba * 255.0f), 31);
            float f64 = (wnVar.Ba * 0.2f) + 0.8f;
            canvas2.scale(f64, f64, omVar3.getMeasuredWidth() / 2.0f, omVar3.getMeasuredHeight() / 2.0f);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        int i18 = i10;
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        int i19 = 0;
        while (true) {
            f7 = 1.0f;
            f10 = 0.0f;
            i11 = 1;
            if (i19 >= size) {
                break;
            }
            org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) arrayList7.get(i19);
            MessageObject.SendAnimationData sendAnimationData = s1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    uk ukVar = wnVar.A1;
                    int currentHeight = measuredHeight + (ukVar != null ? ukVar.getCurrentHeight() : 0);
                    gk gkVar = wnVar.B1;
                    int currentHeight2 = currentHeight + (gkVar != null ? gkVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
                    i17 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i17 = 0;
                }
                f60 = f63;
                f61 = f62;
                canvas2.clipRect(0.0f, i17 + wnVar.J9, omVar3.getWidth(), omVar3.getHeight());
                ImageReceiver photoImage = s1Var5.getPhotoImage();
                s1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((wnVar.Y.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) ic.a.d(1.0f, sendAnimationData.progress, s1Var5.getTranslationY(), r9[1])));
                if (sendAnimationData.fromPreview) {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, topViewEnterProgress, sendAnimationData.progress));
                } else {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, photoImage.getCenterY() + topViewEnterProgress, sendAnimationData.progress));
                }
                float f65 = sendAnimationData.currentScale;
                canvas2.scale(f65, f65);
                if (!sendAnimationData.fromPreview) {
                    canvas2.translate(-photoImage.getCenterX(), -photoImage.getCenterY());
                }
                s1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                s1Var5.draw(canvas2);
                canvas2.restore();
            } else {
                f60 = f63;
                f61 = f62;
            }
            i19++;
            f63 = f60;
            f62 = f61;
        }
        float f66 = f63;
        float f67 = f62;
        num = wnVar.c9;
        if (num != null) {
            view24 = wnVar.Z8;
        }
        paint = wnVar.T8;
        if (paint != null) {
            matrix = wnVar.U8;
            matrix.reset();
            float measuredWidth = omVar3.getMeasuredWidth() / wnVar.R8.getWidth();
            matrix2 = wnVar.U8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = wnVar.S8;
            matrix3 = wnVar.U8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = wnVar.T8;
            paint5.setAlpha((int) (wnVar.b9 * 255.0f));
            paint6 = wnVar.T8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = omVar3.getMeasuredWidth();
                float measuredHeight2 = omVar3.getMeasuredHeight();
                paint7 = wnVar.T8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = wnVar.V8;
            f11 = wnVar.X8;
            float f68 = f11 * 255.0f;
            view = wnVar.Z8;
            paint2.setAlpha((int) (f68 * (view != null ? wnVar.a9 : 1.0f)));
            paint3 = wnVar.V8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = omVar3.getMeasuredWidth();
                float measuredHeight3 = omVar3.getMeasuredHeight();
                paint4 = wnVar.V8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = wnVar.c9;
        if (num2 != null && wnVar.e9) {
            omVar3.invalidate();
        }
        view2 = wnVar.Z8;
        if (view2 != null) {
            view4 = wnVar.Z8;
            if (view4 == wnVar.v1) {
                f57 = wnVar.a9;
                if (f57 < 1.0f) {
                    paint30 = wnVar.V8;
                    f58 = wnVar.X8;
                    f59 = wnVar.a9;
                    paint30.setAlpha((int) ((1.0f - f59) * f58 * 255.0f));
                    float measuredWidth4 = omVar3.getMeasuredWidth();
                    float measuredHeight4 = omVar3.getMeasuredHeight();
                    paint31 = wnVar.V8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = wnVar.Z8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f49 = wnVar.a9;
                    if (f49 < 1.0f) {
                        view20 = wnVar.Z8;
                        float left = view20.getLeft();
                        view21 = wnVar.Z8;
                        float top = view21.getTop();
                        view22 = wnVar.Z8;
                        float right = view22.getRight();
                        view23 = wnVar.Z8;
                        float bottom = view23.getBottom();
                        f53 = wnVar.a9;
                        int i20 = (int) (f53 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i20, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = wnVar.Z8;
                    float left2 = view12.getLeft();
                    view13 = wnVar.Z8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = wnVar.Z8;
                    kVar6 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = wnVar.Z8;
                        float x9 = view16.getX();
                        view17 = wnVar.Z8;
                        canvas3.translate(x9 - view17.getLeft(), 0.0f);
                        view18 = wnVar.Z8;
                        float measuredWidth5 = view18.getMeasuredWidth() / f66;
                        view19 = wnVar.Z8;
                        float measuredHeight5 = view19.getMeasuredHeight() / f66;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, wnVar.W8);
                    }
                    view15 = wnVar.Z8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f50 = wnVar.a9;
                    if (f50 < 1.0f) {
                        paint23 = wnVar.V8;
                        f51 = wnVar.X8;
                        f52 = wnVar.a9;
                        paint23.setAlpha((int) ((1.0f - f52) * f51 * 255.0f));
                        float measuredWidth6 = omVar3.getMeasuredWidth();
                        float measuredHeight6 = omVar3.getMeasuredHeight();
                        paint24 = wnVar.V8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    p5Var = wnVar.x0;
                    float y3 = ((p5Var.getY() + wnVar.I9) - wnVar.K9) - AndroidUtilities.dp(4.0f);
                    view6 = wnVar.Z8;
                    if (view6 instanceof org.telegram.ui.Cells.s1) {
                        view11 = wnVar.Z8;
                        groupedMessages = ((org.telegram.ui.Cells.s1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    p5Var2 = wnVar.x0;
                    int childCount = p5Var2.getChildCount();
                    int i21 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = omVar3.q0;
                        f13 = 20.0f;
                        arrayList2 = omVar3.p0;
                        arrayList3 = omVar3.o0;
                        f14 = f10;
                        arrayList4 = omVar3.r0;
                        if (i21 >= childCount) {
                            break;
                        }
                        p5Var3 = wnVar.x0;
                        View childAt = p5Var3.getChildAt(i21);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            s1Var = (org.telegram.ui.Cells.s1) childAt;
                            groupedMessages2 = s1Var.getCurrentMessagesGroup();
                            groupedMessagePosition = s1Var.getCurrentPosition();
                            v0Var = null;
                        } else {
                            v0Var = childAt instanceof org.telegram.ui.Cells.v0 ? (org.telegram.ui.Cells.v0) childAt : null;
                            groupedMessages2 = null;
                            s1Var = null;
                            groupedMessagePosition = null;
                        }
                        float f69 = y3;
                        view7 = wnVar.Z8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != f14) {
                            if (z13 || s1Var == null || groupedMessages == null || (s1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i13 = childCount;
                                i14 = i21;
                                arrayList5 = arrayList;
                                s1Var2 = s1Var;
                                arrayList6 = arrayList4;
                                mjVar = mjVar2;
                                num4 = null;
                                f18 = 9.0f;
                                f19 = 1.0f;
                                z10 = z13;
                            } else {
                                f18 = 9.0f;
                                float E2 = s1Var3.E2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                                float f70 = transitionParams.left + E2 + transitionParams.offsetLeft;
                                view8 = childAt;
                                float f71 = transitionParams.top + transitionParams.offsetTop;
                                float f72 = transitionParams.right + E2 + transitionParams.offsetRight;
                                i13 = childCount;
                                float f73 = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    f46 = f71;
                                } else {
                                    f46 = transitionParams.cell.getTranslationY() + f71;
                                    f73 += groupedMessages.transitionParams.cell.getTranslationY();
                                }
                                float f74 = f46;
                                float dp = f74 < (wnVar.I9 - ((float) wnVar.K9)) - ((float) AndroidUtilities.dp(20.0f)) ? (wnVar.I9 - wnVar.K9) - AndroidUtilities.dp(20.0f) : f74;
                                p5Var20 = wnVar.x0;
                                if (f73 > AndroidUtilities.dp(20.0f) + p5Var20.getMeasuredHeight()) {
                                    p5Var22 = wnVar.x0;
                                    f73 = AndroidUtilities.dp(20.0f) + p5Var22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i14 = i21;
                                int i22 = 0;
                                while (true) {
                                    if (i22 >= size2) {
                                        arrayList5 = arrayList;
                                        s1Var4 = s1Var;
                                        z11 = true;
                                        break;
                                    }
                                    int i23 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i22);
                                    arrayList5 = arrayList;
                                    if (wnVar.m6[messageObject.getDialogId() == wnVar.j6 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        s1Var4 = s1Var;
                                        z11 = false;
                                        break;
                                    } else {
                                        i22++;
                                        size2 = i23;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - mjVar2.e()) - wnVar.Tc) - AndroidUtilities.dp(9.0f);
                                hb0Var6 = wnVar.U1;
                                if (hb0Var6 != null) {
                                    hb0Var9 = wnVar.U1;
                                    f47 = hb0Var9.d();
                                } else {
                                    f47 = f14;
                                }
                                float f75 = measuredHeight7 - f47;
                                hb0Var7 = wnVar.U1;
                                if (hb0Var7 != null) {
                                    hb0Var8 = wnVar.U1;
                                    f48 = hb0Var8.e();
                                } else {
                                    f48 = f14;
                                }
                                org.telegram.ui.Cells.s1 s1Var6 = s1Var4;
                                canvas3.clipRect(f14, f69 + f48, getMeasuredWidth(), f75);
                                p5Var21 = wnVar.x0;
                                canvas3.translate(f14, p5Var21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                mjVar = mjVar2;
                                num4 = null;
                                s1Var2 = s1Var6;
                                f19 = 1.0f;
                                transitionParams2.cell.B1(canvas, (int) f70, (int) dp, (int) f72, (int) f73, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (s1Var2 != null && s1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            p5Var4 = wnVar.x0;
                            float left3 = p5Var4.getLeft();
                            p5Var5 = wnVar.x0;
                            float right2 = p5Var5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - mjVar.e()) - wnVar.Tc) - wnVar.j9(org.telegram.ui.Components.b41.c)) - AndroidUtilities.dp(f18);
                            hb0Var3 = wnVar.U1;
                            if (hb0Var3 != null) {
                                hb0Var4 = wnVar.U1;
                                float max = Math.max(0.0f, hb0Var4.e());
                                hb0Var5 = wnVar.U1;
                                f21 = Math.max(0.0f, hb0Var5.d());
                                f20 = max;
                            } else {
                                f20 = 0.0f;
                                f21 = 0.0f;
                            }
                            jk jkVar = wnVar.Y;
                            if (jkVar != null && (nfVar = jkVar.m0) != null) {
                                f21 = Math.max(f21, nfVar.f ? 0.0f : Math.max(0.0f, nfVar.getMeasuredHeight() - (nfVar.c.getTranslationY() + nfVar.e)));
                            }
                            float f76 = f69 + f20;
                            float f77 = measuredHeight8 - f21;
                            if (s1Var2 == null || !s1Var2.getTransitionParams().w0) {
                                p5Var6 = wnVar.x0;
                                left3 = Math.max(left3, view8.getX() + p5Var6.getLeft());
                                p5Var7 = wnVar.x0;
                                f76 = Math.max(f76, view8.getY() + p5Var7.getY());
                                p5Var8 = wnVar.x0;
                                right2 = Math.min(right2, view8.getX() + p5Var8.getLeft() + view8.getMeasuredWidth());
                                p5Var9 = wnVar.x0;
                                f77 = Math.min(f77, view8.getY() + p5Var9.getY() + view8.getMeasuredHeight());
                            }
                            float f78 = f77;
                            float f79 = f76;
                            float f80 = right2;
                            float max2 = Math.max(left3, wnVar.e9());
                            if (f79 < f78) {
                                if (view8.getAlpha() != f19) {
                                    canvas4 = canvas;
                                    canvas4.saveLayerAlpha(max2, f79, f80, f78, (int) (view8.getAlpha() * 255.0f), 31);
                                    f45 = f79;
                                    f23 = f78;
                                    f25 = max2;
                                    f26 = f80;
                                } else {
                                    canvas4 = canvas;
                                    f45 = f79;
                                    f23 = f78;
                                    f25 = max2;
                                    f26 = f80;
                                    canvas4.save();
                                }
                                if (s1Var2 != null) {
                                    s1Var2.setInvalidatesParent(true);
                                    num12 = wnVar.c9;
                                    s1Var2.setScrimReaction(num12);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(true);
                                    num11 = wnVar.c9;
                                    v0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f25, f45, f26, f23);
                                p5Var18 = wnVar.x0;
                                float x10 = view8.getX() + p5Var18.getLeft();
                                p5Var19 = wnVar.x0;
                                canvas4.translate(x10, view8.getY() + p5Var19.getY());
                                if (s1Var2 != null && groupedMessages3 == null && s1Var2.C1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, s1Var2.getPaddingTop());
                                    s1Var2.D1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (s1Var2 == null || !s1Var2.U2()) {
                                    f22 = f45;
                                    f24 = 0.0f;
                                } else {
                                    canvas4.save();
                                    f22 = f45;
                                    f24 = 0.0f;
                                    canvas4.translate(0.0f, s1Var2.getPaddingTop());
                                    s1Var2.X1(canvas4);
                                    canvas4.restore();
                                }
                                if (v0Var != null) {
                                    v0Var.A(canvas4);
                                }
                                canvas4.restore();
                                if (s1Var2 != null) {
                                    s1Var2.setInvalidatesParent(false);
                                    s1Var2.setScrimReaction(num4);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(false);
                                    v0Var.setScrimReaction(num4);
                                }
                            } else {
                                canvas4 = canvas;
                                f22 = f79;
                                f23 = f78;
                                view9 = view8;
                                f24 = 0.0f;
                                f25 = max2;
                                f26 = f80;
                            }
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePosition;
                            if (groupedMessagePosition2 != null || (s1Var2 != null && s1Var2.getTransitionParams().w0)) {
                                if (groupedMessagePosition2 == null || groupedMessagePosition2.last || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0)) {
                                    if (groupedMessagePosition2 == null || groupedMessagePosition2.last) {
                                        arrayList3.add(s1Var2);
                                    }
                                    if (groupedMessagePosition2 == null || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0 && s1Var2.T2())) {
                                        arrayList2.add(s1Var2);
                                    }
                                }
                                if (groupedMessagePosition2 == null || (groupedMessagePosition2.flags & s1Var2.s0()) != 0) {
                                    arrayList5.add(s1Var2);
                                }
                                if (groupedMessagePosition2 != null) {
                                    int i24 = groupedMessagePosition2.flags;
                                    if ((i24 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(s1Var2);
                            }
                            num5 = wnVar.c9;
                            if (num5 == null || s1Var2 == null || groupedMessages3 != null) {
                                float f81 = f26;
                                float f82 = f25;
                                View view27 = view9;
                                f27 = f24;
                                float f83 = f23;
                                float f84 = f22;
                                f28 = f69;
                                i15 = 1;
                                num6 = wnVar.c9;
                                if (num6 != null && v0Var != null) {
                                    paint13 = wnVar.T8;
                                    if (paint13 != null) {
                                        matrix7 = wnVar.U8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / wnVar.R8.getWidth();
                                        matrix8 = wnVar.U8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = wnVar.S8;
                                        matrix9 = wnVar.U8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = wnVar.T8;
                                        paint16.setAlpha((int) (wnVar.b9 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = wnVar.T8;
                                        v0Var2 = v0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        v0Var2 = v0Var;
                                        paint14 = wnVar.V8;
                                        f29 = wnVar.X8;
                                        f30 = wnVar.a9;
                                        paint14.setAlpha((int) (f30 * f29 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = wnVar.V8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f79 < f78) {
                                        f31 = wnVar.X8;
                                        f32 = wnVar.a9;
                                        float f85 = (f32 * f31) / f67;
                                        float alpha = view27.getAlpha();
                                        f33 = wnVar.a9;
                                        float f86 = f33 * alpha;
                                        if (f86 < f19) {
                                            canvas.saveLayerAlpha(f82, f84, f81, f83, (int) (f86 * 255.0f), 31);
                                            f83 = f83;
                                            f34 = f84;
                                            canvas3 = canvas;
                                        } else {
                                            canvas3 = canvas;
                                            f34 = f84;
                                            canvas3.save();
                                        }
                                        canvas3.clipRect(f82, f34, f81, f83);
                                        p5Var10 = wnVar.x0;
                                        float x11 = view27.getX() + p5Var10.getLeft();
                                        p5Var11 = wnVar.x0;
                                        canvas3.translate(x11, view27.getY() + p5Var11.getY() + view27.getPaddingTop());
                                        num7 = wnVar.c9;
                                        boolean z14 = wnVar.Y8;
                                        bh.y0 y0Var = v0Var2.E0;
                                        if (!y0Var.b) {
                                            org.telegram.ui.ActionBar.u6 u6Var = v0Var2.g1;
                                            if (u6Var != null) {
                                                u6Var.b(v0Var2.u0, v0Var2.t0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.v0);
                                            } else {
                                                org.telegram.ui.ActionBar.y6.q(v0Var2.u0, v0Var2.t0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.v0);
                                            }
                                            y0Var.D = f85;
                                            y0Var.E = z14;
                                            y0Var.d(canvas3, v0Var2.r2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        p5Var12 = wnVar.x0;
                                        float x12 = view27.getX() + p5Var12.getLeft();
                                        p5Var13 = wnVar.x0;
                                        canvas3.translate(x12, view27.getY() + p5Var13.getY() + view27.getPaddingTop());
                                        int i25 = wnVar.d9;
                                        num8 = wnVar.c9;
                                        v0Var2.D(this, canvas3, i25, num8, f85);
                                        omVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = wnVar.T8;
                                if (paint18 != null) {
                                    matrix10 = wnVar.U8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / wnVar.R8.getWidth();
                                    matrix11 = wnVar.U8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = wnVar.S8;
                                    matrix12 = wnVar.U8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = wnVar.T8;
                                    paint21.setAlpha((int) (wnVar.b9 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = wnVar.T8;
                                    f35 = f26;
                                    f36 = f25;
                                    view10 = view9;
                                    i16 = 1;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f35 = f26;
                                    f36 = f25;
                                    view10 = view9;
                                    i16 = 1;
                                    paint19 = wnVar.V8;
                                    f37 = wnVar.X8;
                                    f38 = wnVar.a9;
                                    paint19.setAlpha((int) (f38 * f37 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = wnVar.V8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f79 < f78) {
                                    f39 = wnVar.X8;
                                    f40 = wnVar.a9;
                                    float f87 = (f40 * f39) / f67;
                                    float alpha2 = view10.getAlpha();
                                    f41 = wnVar.a9;
                                    float f88 = f41 * alpha2;
                                    if (f88 < f19) {
                                        f42 = f24;
                                        canvas5 = canvas;
                                        f43 = f23;
                                        float f89 = f22;
                                        canvas5.saveLayerAlpha(f36, f89, f35, f43, (int) (f88 * 255.0f), 31);
                                        f44 = f89;
                                    } else {
                                        canvas5 = canvas;
                                        f42 = f24;
                                        f43 = f23;
                                        f44 = f22;
                                        canvas5.save();
                                    }
                                    canvas5.clipRect(f36, f44, f35, f43);
                                    p5Var14 = wnVar.x0;
                                    float x13 = view10.getX() + p5Var14.getLeft();
                                    p5Var15 = wnVar.x0;
                                    canvas5.translate(x13, view10.getY() + p5Var15.getY() + view10.getPaddingTop());
                                    num9 = wnVar.c9;
                                    s1Var2.h2(canvas5, num9, f87, wnVar.Y8);
                                    canvas5.restore();
                                    canvas5.save();
                                    p5Var16 = wnVar.x0;
                                    float x14 = view10.getX() + p5Var16.getLeft();
                                    p5Var17 = wnVar.x0;
                                    canvas5.translate(x14, view10.getY() + p5Var17.getY() + view10.getPaddingTop());
                                    int i26 = wnVar.d9;
                                    num10 = wnVar.c9;
                                    i15 = i16;
                                    f28 = f69;
                                    f27 = f42;
                                    s1Var2.i2(this, canvas5, i26, num10, f87);
                                    canvas.restore();
                                } else {
                                    i15 = i16;
                                    f28 = f69;
                                    f27 = f24;
                                }
                            }
                            omVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            i15 = 1;
                            f19 = 1.0f;
                            omVar2 = this;
                            i13 = childCount;
                            i14 = i21;
                            mjVar = mjVar2;
                            f27 = f14;
                            f28 = f69;
                            groupedMessages3 = groupedMessages;
                        }
                        i21 = i14 + 1;
                        omVar3 = omVar2;
                        y3 = f28;
                        groupedMessages = groupedMessages3;
                        f10 = f27;
                        mjVar2 = mjVar;
                        i11 = i15;
                        childCount = i13;
                        f7 = f19;
                    }
                    f15 = f7;
                    f12 = f14;
                    float f90 = y3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    int i27 = i11;
                    omVar = omVar3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i28 = 0; i28 < size3; i28++) {
                            omVar.Y(canvas3, f90, (org.telegram.ui.Cells.s1) arrayList3.get(i28), 0);
                        }
                        i12 = 0;
                        arrayList3.clear();
                    } else {
                        i12 = 0;
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i29 = i12; i29 < size4; i29++) {
                            omVar.Y(canvas3, f90, (org.telegram.ui.Cells.s1) arrayList2.get(i29), i27);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i30 = i12; i30 < size5; i30++) {
                            org.telegram.ui.Cells.s1 s1Var7 = (org.telegram.ui.Cells.s1) arrayList.get(i30);
                            if (s1Var7.getCurrentPosition() != null || s1Var7.getTransitionParams().w0) {
                                omVar.Y(canvas3, f90, s1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i31 = i12; i31 < size6; i31++) {
                            org.telegram.ui.Cells.s1 s1Var8 = (org.telegram.ui.Cells.s1) arrayList4.get(i31);
                            if (s1Var8.getCurrentPosition() != null || s1Var8.getTransitionParams().w0) {
                                omVar.Y(canvas3, f90, s1Var8, 3);
                            }
                        }
                    }
                    num3 = wnVar.c9;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = wnVar.T8;
                        if (paint8 != null) {
                            matrix4 = wnVar.U8;
                            matrix4.reset();
                            float measuredWidth13 = omVar.getMeasuredWidth() / wnVar.R8.getWidth();
                            matrix5 = wnVar.U8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = wnVar.S8;
                            matrix6 = wnVar.U8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = wnVar.T8;
                            paint11.setAlpha((int) (wnVar.b9 * 255.0f));
                            float measuredWidth14 = omVar.getMeasuredWidth();
                            float measuredHeight13 = omVar.getMeasuredHeight();
                            paint12 = wnVar.T8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = wnVar.V8;
                            f16 = wnVar.X8;
                            f17 = wnVar.a9;
                            paint9.setAlpha((int) (f17 * f16 * 255.0f));
                            float measuredWidth15 = omVar.getMeasuredWidth();
                            float measuredHeight14 = omVar.getMeasuredHeight();
                            paint10 = wnVar.V8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i32 = i12; i32 < size7; i32++) {
                            org.telegram.ui.Cells.s1 s1Var9 = (org.telegram.ui.Cells.s1) arrayList4.get(i32);
                            if (s1Var9.getCurrentPosition() != null || s1Var9.getTransitionParams().w0) {
                                omVar.Y(canvas3, f90, s1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = wnVar.c9;
                    if (num13 == null) {
                        f54 = wnVar.a9;
                        if (f54 < f15) {
                            paint25 = wnVar.T8;
                            if (paint25 != null) {
                                matrix13 = wnVar.U8;
                                matrix13.reset();
                                float measuredWidth16 = omVar.getMeasuredWidth() / wnVar.R8.getWidth();
                                matrix14 = wnVar.U8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = wnVar.S8;
                                matrix15 = wnVar.U8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = wnVar.T8;
                                paint28.setAlpha((int) (wnVar.b9 * 255.0f));
                                float measuredWidth17 = omVar.getMeasuredWidth();
                                float measuredHeight15 = omVar.getMeasuredHeight();
                                paint29 = wnVar.T8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = wnVar.V8;
                                f55 = wnVar.X8;
                                f56 = wnVar.a9;
                                paint26.setAlpha((int) ((f15 - f56) * f55 * 255.0f));
                                float measuredWidth18 = omVar.getMeasuredWidth();
                                float measuredHeight16 = omVar.getMeasuredHeight();
                                paint27 = wnVar.V8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            omVar = omVar3;
            f15 = 1.0f;
            f12 = 0.0f;
            f13 = 20.0f;
            num13 = wnVar.c9;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            omVar = omVar3;
            f12 = 0.0f;
            f13 = 20.0f;
        }
        view3 = wnVar.Z8;
        if (view3 != null || ((ArrayList) wnVar.ca.c).size() > 0) {
            hb0Var = wnVar.U1;
            if (hb0Var != null) {
                hb0Var2 = wnVar.U1;
            }
            super.drawChild(canvas3, wnVar.v1, SystemClock.uptimeMillis());
            ak akVar = wnVar.j3;
            if (akVar != null && akVar.getTag() != null) {
                super.drawChild(canvas3, wnVar.j3, SystemClock.uptimeMillis());
            }
            yj yjVar = wnVar.k3;
            if (yjVar != null && yjVar.getTag() != null) {
                super.drawChild(canvas3, wnVar.k3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.z00 z00Var = wnVar.C9;
            if (z00Var != null) {
                super.drawChild(canvas3, z00Var, SystemClock.uptimeMillis());
            }
            wh.i iVar = wnVar.na;
            if (iVar != null) {
                super.drawChild(canvas3, iVar, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.t40 t40Var3 = wnVar.q2;
            if (t40Var3 != null) {
                super.drawChild(canvas3, t40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = wnVar.K3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, wnVar.K3, SystemClock.uptimeMillis());
            }
            fl flVar = wnVar.L3;
            if (flVar != null && flVar.getVisibility() == 0) {
                super.drawChild(canvas3, wnVar.L3, SystemClock.uptimeMillis());
            }
            fi.v3 v3Var = wnVar.J1;
            if (v3Var != null && v3Var.getVisibility() == 0) {
                super.drawChild(canvas3, wnVar.J1, SystemClock.uptimeMillis());
            }
            tl tlVar = wnVar.N1;
            if (tlVar != null && tlVar.getVisibility() == 0) {
                super.drawChild(canvas3, wnVar.N1, SystemClock.uptimeMillis());
            }
            fi.v3 v3Var2 = wnVar.L1;
            if (v3Var2 != null && v3Var2.getVisibility() == 0) {
                super.drawChild(canvas3, wnVar.L1, SystemClock.uptimeMillis());
            }
            jk jkVar2 = wnVar.Y;
            if (jkVar2 != null && jkVar2.L != null) {
                canvas3.save();
                canvas3.translate(wnVar.Y.L.getX() + wnVar.Y.getX(), wnVar.Y.L.getY() + wnVar.Y.getY());
                wnVar.Y.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (wnVar.Fa > 0 && omVar.f < AndroidUtilities.dp(f13)) {
            int themedColor = wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6);
            if (omVar.s0 == null) {
                omVar.s0 = new Paint();
            }
            if (omVar.t0 != themedColor) {
                Paint paint32 = omVar.s0;
                omVar.t0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, omVar.getMeasuredHeight() - wnVar.Fa, omVar.getMeasuredWidth(), omVar.getMeasuredHeight(), omVar.s0);
            canvas3 = canvas6;
        }
        tp tpVar = wnVar.fa;
        if (tpVar != null && tpVar.e()) {
            int inputBubbleTop = (int) wnVar.S.getInputBubbleTop();
            int inputBubbleBottom = (int) wnVar.S.getInputBubbleBottom();
            wn wnVar2 = wnVar.ja;
            int i33 = inputBubbleTop - ((int) (wnVar.ka * (wnVar2 == null ? f12 : wnVar2.ea)));
            tp tpVar2 = wnVar.fa;
            omVar.getMeasuredWidth();
            tpVar2.b(canvas3, i33, inputBubbleBottom);
        }
        if (wnVar.ja != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, omVar.getMeasuredWidth(), omVar.getMeasuredHeight(), (int) (wnVar.ka * 255.0f), 31);
            canvas3 = canvas;
            wnVar.ja.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        wnVar.Na.e(canvas3);
        if (i18 >= 0) {
            canvas3.restore();
        }
        if (wnVar.Aa) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            float x15 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            canvas3.translate(x15, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (wnVar.Ba * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        el elVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (elVar = this.B0.Va) == null || !elVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        elVar.a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r4 == r6.getBackButton()) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        sk skVar;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.B0;
        jh.e eVar = wnVar.Z3;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y3 = (AndroidUtilities.isInMultiwindow || wnVar.isInBubbleMode()) ? (wnVar.Y.getEmojiView() != null ? wnVar.Y.getEmojiView() : wnVar.Y).getY() : wnVar.Y.getY();
        View view = wnVar.Z8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        }
        jk jkVar = wnVar.Y;
        if (jkVar == null || !jkVar.z3 || motionEvent.getY() >= y3) {
            wnVar.z9 = motionEvent.getY();
            org.telegram.ui.Cells.ea n10 = wnVar.s9.n(getContext());
            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
            if (!wnVar.s9.x() || !wnVar.s9.n(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(n10.getX(), n10.getY());
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                fi.h1 h1Var = wnVar.C1;
                if (h1Var != null) {
                    if (wnVar.G3 != null) {
                        z10 = h1Var.B(motionEvent);
                        if (wnVar.C1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !wnVar.s9.x() || (motionEvent.getY() >= wnVar.x0.getTop() && motionEvent.getY() <= wnVar.x0.getBottom())) {
                            skVar = wnVar.Ma;
                            if (!skVar.n) {
                                return skVar.g(motionEvent);
                            }
                            c2.b bVar = c2.b.e;
                            if (bVar == null || !bVar.a) {
                                if (wnVar.isInPreviewMode() && wnVar.Z9) {
                                    if (motionEvent.getAction() == 0) {
                                        int i10 = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (wnVar.v1 != null) {
                                            int i11 = 0;
                                            for (int i12 = 3; i11 < i12; i12 = 3) {
                                                k6.c cVar = wnVar.v1.e[i11 == 0 ? 1 : i11 == 1 ? i10 : i12];
                                                if (cVar != null) {
                                                    ((kh.b) cVar.b).getLocationInWindow(iArr2);
                                                    Rect rect = AndroidUtilities.rectTmp2;
                                                    int i13 = iArr2[0] - iArr[0];
                                                    rect.set(i13, iArr2[1] - iArr[1], AndroidUtilities.dp(56.0f) + i13, AndroidUtilities.dp(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z11 = true;
                                                        break;
                                                    }
                                                }
                                                i11++;
                                                i10 = 2;
                                            }
                                        }
                                        z11 = false;
                                        lj ljVar = wnVar.m1;
                                        if (ljVar != null) {
                                            ljVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i14 = iArr2[0] - iArr[0];
                                            rect2.set(i14, iArr2[1] - iArr[1], wnVar.m1.getMeasuredWidth() + i14, wnVar.m1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.x0 = motionEvent.getX();
                                                    this.y0 = motionEvent.getY();
                                                    this.z0 = SystemClock.elapsedRealtime();
                                                    this.A0 = z12;
                                                    lj ljVar2 = wnVar.m1;
                                                    if (ljVar2 != null) {
                                                        ljVar2.h0.c(z12);
                                                    }
                                                    z10 = true;
                                                } else {
                                                    this.z0 = -1L;
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (z11) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        lj ljVar3 = wnVar.m1;
                                        if (ljVar3 != null) {
                                            ljVar3.h0.c(false);
                                        }
                                        if (this.A0 || (a8.ic.a(this.x0, this.y0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.z0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.A0) {
                                                j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                                                wnVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) j5Var2).R(ProfileActivity.t4(wnVar.j6));
                                            } else {
                                                j5Var = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                                                ((ActionBarLayout) j5Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.z0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.z0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z10) {
                                }
                            } else {
                                v4 v4Var = (v4) c2.b.m().d;
                                if (v4Var != null) {
                                    v4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
                            if (wnVar.s9.n(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(n10.getX(), n10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = h1Var.e;
                        if (h1Var.H) {
                            h1Var.I = true;
                            h1Var.H = false;
                            h1Var.F(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                h1Var.F(view2, h1Var.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            h1Var.d = 0;
                            h1Var.c = 1.0f;
                            org.telegram.ui.Components.l91 l91Var = h1Var.M;
                            if (l91Var != null) {
                                l91Var.e(1.0f, 0, h1Var.b);
                            }
                            h1Var.x(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                skVar = wnVar.Ma;
                if (!skVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.a1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
    
        if (r11 != r0.x0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fi.f6 f6Var;
        org.telegram.ui.ActionBar.k kVar;
        MessageObject playingMessageObject;
        boolean z10;
        boolean z11;
        mk mkVar;
        MessageObject messageObject;
        org.telegram.ui.Components.u60 u60Var;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        wn wnVar = this.B0;
        boolean z12 = false;
        if ((wnVar.Z8 == null && ((ArrayList) wnVar.ca.c).size() <= 0) || (view != wnVar.v1 && view != wnVar.j3 && view != wnVar.k3 && view != wnVar.C9 && view != wnVar.na && view != wnVar.q2 && view != null && view != wnVar.K3 && view != wnVar.L3)) {
            if ((view != wnVar.K3 || !PhotoViewer.v1().U1()) && (!wnVar.ia || view != wnVar.x0)) {
                if (wnVar.Aa) {
                    kVar3 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                }
                if (view != wnVar.n3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (f6Var = wnVar.K2) != null && f6Var.a() && wnVar.K2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == wnVar.J8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    } else {
                        if (view != wnVar.x0) {
                            if (view != wnVar.S) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == wnVar.J8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-wnVar.da) - (wnVar.ka != 0.0f ? (wnVar.x0.getMeasuredHeight() - wnVar.da) * wnVar.ka : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.y6.k3 != null && wnVar.L8.d) {
                                            int x9 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y3 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(wnVar.J8.getScaleX(), wnVar.J8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.y6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.y6.k3.setBounds(x9, y3, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(wnVar.O9()) + x9, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(wnVar.O9()) + y3);
                                            org.telegram.ui.ActionBar.y6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z12 = super.drawChild(canvas, view, j10);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-AndroidUtilities.dp(1000.0f));
                                        z12 = super.drawChild(canvas, view, j10);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z12;
                                }
                                if (view == wnVar.S && (u60Var = wnVar.n3) != null && u60Var.getVisibility() == 0) {
                                    super.drawChild(canvas, wnVar.n3, j10);
                                }
                                z12 = super.drawChild(canvas, view, j10);
                                if (z11 && view == wnVar.x0 && playingMessageObject.type != 5 && (mkVar = wnVar.J8) != null && mkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-wnVar.da) - (wnVar.ka != 0.0f ? (wnVar.x0.getMeasuredHeight() - wnVar.da) * wnVar.ka : 0.0f)) + wnVar.ea);
                                    super.drawChild(canvas, wnVar.J8, j10);
                                    if (wnVar.K8 != null) {
                                        canvas.save();
                                        canvas.translate(wnVar.K8.getX(), wnVar.x0.getY() + wnVar.K8.getTop());
                                        if (z10) {
                                            wnVar.K8.g2(canvas);
                                            invalidate();
                                            wnVar.K8.invalidate();
                                        } else {
                                            wnVar.K8.Y1(canvas);
                                            org.telegram.ui.Cells.s1 s1Var = wnVar.K8;
                                            if (!s1Var.vb && ((messageObject = s1Var.y7) == null || messageObject.type != 27)) {
                                                s1Var.m2(s1Var.getAlpha(), canvas, true);
                                            }
                                        }
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                }
                            }
                        } else {
                            z10 = false;
                        }
                        z11 = false;
                        if (view == wnVar.J8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.ww0
    public float getBottomOffset() {
        return this.B0.x0.getBottom();
    }

    public wn getChatActivity() {
        return this.B0;
    }

    @Override // org.telegram.ui.Components.ww0
    public int getKeyboardHeight() {
        if (this.B0.fb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.ww0
    public float getListTranslationY() {
        return this.B0.x0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.ww0
    public Drawable getNewDrawable() {
        Drawable l4 = this.B0.ua.l();
        return l4 != null ? l4 : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.ww0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.B0.ua.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.ww0
    public int getScrollOffset() {
        return this.B0.x0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.j5 j5Var3;
        super.onAttachedToWindow();
        wn wnVar = this.B0;
        if (wnVar.fb) {
            this.H.b = wnVar.j1;
        } else {
            j5Var = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
            if (j5Var != null) {
                j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                if (((ActionBarLayout) j5Var2).b) {
                    org.telegram.ui.ActionBar.q1 q1Var = this.H;
                    j5Var3 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
                    q1Var.b = (FrameLayout) j5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        wnVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == wnVar.j6)) {
            MediaController.getInstance().setTextureView(wnVar.W7(false), wnVar.L8, wnVar.J8, true);
        }
        tp tpVar = wnVar.fa;
        if (tpVar != null) {
            tpVar.f();
        }
        wnVar.Na.i();
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        wn wnVar = this.B0;
        tp tpVar = wnVar.fa;
        if (tpVar != null) {
            NotificationCenter.getInstance(tpVar.e0).removeObserver(tpVar, NotificationCenter.updateInterfaces);
            tpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.t5 t5Var = tpVar.k0;
            if (t5Var != null && (view = tpVar.a0) != null) {
                t5Var.o(view);
            }
            tpVar.Q = 0.0f;
            tpVar.P = 0L;
            wnVar.fa = null;
        }
        wnVar.Na.j();
        AndroidUtilities.runOnUIThread(new ag.c(26));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        wn wnVar;
        fi.f6 f6Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (f6Var = (wnVar = this.B0).K2) == null || !f6Var.a() || wnVar.K2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        if (r8 != r3.dd) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int A;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int dp;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar3;
        int i21;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        wn wnVar = this.B0;
        mj mjVar = wnVar.v;
        int i22 = (measuredWidth - wnVar.tb) - wnVar.ub;
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i24 = layoutParams.gravity;
                if (i24 == -1) {
                    i24 = 51;
                }
                int i25 = i24 & 112;
                int i26 = i24 & 7;
                if (i26 == 1) {
                    A = ic.a.A(i22, measuredWidth2, 2, wnVar.tb) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = wnVar.tb + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                    i18 += kVar7.getMeasuredHeight();
                                }
                            }
                        } else if (i25 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = (i13 - i11) - measuredHeight;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (Z(childAt)) {
                            i18 = 0;
                            i15 = 0;
                        } else {
                            if (childAt != wnVar.ca && childAt != wnVar.na && childAt != wnVar.S && !(childAt instanceof org.telegram.ui.Components.t40) && !(childAt instanceof org.telegram.ui.Components.dq)) {
                                if (childAt instanceof org.telegram.ui.Cells.ea) {
                                    i20 = wnVar.Qa;
                                } else if (childAt == wnVar.c1) {
                                    kVar3 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (wnVar.Y.q0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z11 = ((org.telegram.ui.ActionBar.r2) wnVar).inBubbleMode;
                                        if (!z11) {
                                            i18 = wnVar.Y.getBottom();
                                        }
                                    }
                                    i18 = wnVar.Y.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    jk jkVar = wnVar.Y;
                                    if (jkVar != null && (childAt == jkVar.O1 || childAt == jkVar.N1)) {
                                        i18 = org.telegram.messenger.wh.z(7.0f, mjVar.e(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == wnVar.I2) {
                                        i18 = org.telegram.messenger.wh.z(7.0f, mjVar.e(), i18);
                                    } else if (jkVar == null || childAt != jkVar.e1) {
                                        if (childAt == wnVar.q2 || childAt == wnVar.E2 || childAt == wnVar.r2) {
                                            i19 = this.l0;
                                        } else if (childAt == wnVar.x0 || childAt == wnVar.v0 || childAt == wnVar.j3 || childAt == wnVar.k3 || childAt == wnVar.l3) {
                                            i20 = wnVar.Qa;
                                        } else if (childAt != wnVar.P) {
                                            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (wnVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == wnVar.J8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != wnVar.n3 && childAt != wnVar.o3 && childAt != wnVar.u0) {
                                                if (childAt instanceof org.telegram.ui.Components.oc0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != wnVar.T) {
                                                    if (childAt != wnVar.Z3) {
                                                    }
                                                }
                                            }
                                        } else if (jkVar.w0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.wh.z(9.0f, mjVar.e(), i18);
                                    }
                                }
                                i18 = -i20;
                            }
                            i18 = 0;
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
                    } else {
                        i16 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (Z(childAt)) {
                    }
                    childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
                } else {
                    A = (measuredWidth - wnVar.ub) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = A - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (Z(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        yj yjVar = wnVar.k3;
        if (yjVar != null) {
            yjVar.setBackgroundHeight(getMeasuredHeight());
        }
        wnVar.A9();
        wnVar.C9();
        wnVar.dd(false, false);
        R();
        wnVar.C7();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x052c  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int childCount;
        boolean z10;
        int i12;
        int i13;
        org.telegram.ui.Components.qc qcVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i14;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.w0 w0Var;
        TLRPC.User user;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        wn wnVar = this.B0;
        mj mjVar = wnVar.v;
        int i15 = (size - wnVar.tb) - wnVar.ub;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        hh.a aVar = wnVar.L.a;
        if (aVar instanceof hh.b) {
            ((hh.b) aVar).b(i15, size2);
        }
        int i16 = 0;
        if (this.n0 != i15) {
            wnVar.R4 = false;
            this.n0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
            if (z13 || (user = wnVar.f) == null || !user.self) {
                wnVar.aa = false;
            } else {
                org.telegram.ui.ActionBar.b6 titleTextView = wnVar.m1.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    wnVar.aa = !wnVar.ba;
                } else {
                    wnVar.aa = false;
                }
            }
            if (wnVar.aa || wnVar.ba || UserObject.isBotForumWithEditableTopics(wnVar.f)) {
                lj ljVar = wnVar.m1;
                if (ljVar != null && ljVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) wnVar.m1.getLayoutParams()).rightMargin = AndroidUtilities.dp(wnVar.d4 != 3 ? 92.0f : 52.0f);
                }
            } else {
                lj ljVar2 = wnVar.m1;
                if (ljVar2 != null && ljVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) wnVar.m1.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (wnVar.aa) {
                kVar8 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                if (!kVar8.n0 && (w0Var = wnVar.m0) != null) {
                    w0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = wnVar.h0;
                if (w0Var2 != null) {
                    w0Var2.t(40);
                }
            } else {
                org.telegram.ui.ActionBar.w0 w0Var3 = wnVar.h0;
                if (w0Var3 != null) {
                    w0Var3.S(40);
                }
                org.telegram.ui.ActionBar.w0 w0Var4 = wnVar.m0;
                if (w0Var4 != null) {
                    w0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            if (!kVar7.n0 && (yVar = wnVar.n0) != null) {
                yVar.f((!wnVar.ba || wnVar.aa) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = wnVar.h0;
            if (w0Var5 != null) {
                TLRPC.UserFull userFull = wnVar.q8;
                if (wnVar.ba) {
                    w0Var5.t(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    w0Var5.S(32);
                }
            }
            wnVar.R4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + wnVar.Ea >= AndroidUtilities.dp(20.0f);
        if (this.m0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (wnVar.Fa > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            wnVar.Ea = wnVar.Fa;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            wnVar.Ea = wnVar.Y.p0() ? wnVar.Y.getEmojiPadding() : 0;
        } else {
            wnVar.Ea = 0;
        }
        setEmojiKeyboardHeight(wnVar.Ea);
        boolean z15 = this.f + wnVar.Ea >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i17 = 0; i17 < wnVar.x0.getChildCount(); i17++) {
                View childAt = wnVar.x0.getChildAt(i17);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        wnVar.x0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            wnVar.z0.i1(R, (int) (((((wnVar.x0.getMeasuredHeight() - wnVar.I9) - wnVar.Ra) + ((this.f + wnVar.Ea) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(wnVar.O9()))) / 2.0f), false);
                            wnVar.A0.m(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i18 = paddingTop;
                            measureChildWithMargins(wnVar.Y, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
                            if (!z10 || wnVar.fb) {
                                this.l0 = 0;
                            } else {
                                this.l0 = wnVar.Y.getMeasuredHeight();
                            }
                            wnVar.Qa = 0;
                            wnVar.Ra = 0;
                            if (SharedConfig.chatBlurEnabled() && !wnVar.fb && wnVar.F != null && Build.VERSION.SDK_INT >= 31) {
                                int i19 = wnVar.G;
                                wnVar.Qa = i19;
                                wnVar.Ra = i19;
                            }
                            i12 = 0;
                            while (i12 < childCount) {
                                int i20 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null) {
                                    if (childAt2.getVisibility() != 8 && childAt2 != wnVar.Y) {
                                        kVar4 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                        if (childAt2 != kVar4) {
                                            if (Z(childAt2)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                            } else {
                                                if (childAt2 == wnVar.x0 || childAt2 == wnVar.v0 || (childAt2 instanceof org.telegram.ui.Cells.ea)) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), wnVar.Qa + size2 + wnVar.Ra), TLObject.FLAG_30));
                                                } else if (childAt2 == wnVar.P) {
                                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int dp = AndroidUtilities.dp(10.0f);
                                                    int i21 = i18 - this.l0;
                                                    z12 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
                                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((wnVar.Y.w0() ? 48 : i16) + 2) + (i21 - (z12 ? AndroidUtilities.statusBarHeight : i16))), TLObject.FLAG_30));
                                                } else if (childAt2 == wnVar.n3) {
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                    wnVar.n3.setInternalPadding(AndroidUtilities.dp(12.0f) + mjVar.e() + ((int) wnVar.Uc));
                                                    childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                                } else if (childAt2 == wnVar.o3) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - mjVar.e()) - ((int) wnVar.Uc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                                } else if (childAt2 == wnVar.c1) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                                                } else if (wnVar.Y.q0(childAt2)) {
                                                    org.telegram.ui.Components.ag agVar = wnVar.Y.H1;
                                                    if (childAt2 == agVar && agVar != null) {
                                                        i20 = agVar.getKeyboardHeight();
                                                    }
                                                    z11 = ((org.telegram.ui.ActionBar.r2) wnVar).inBubbleMode;
                                                    if (z11) {
                                                        int paddingTop2 = getPaddingTop() + (i18 - this.l0) + measuredHeight;
                                                        if (i20 < 0) {
                                                            i20 = Math.max(Math.min(paddingTop2, AndroidUtilities.dp(350.0f)), paddingTop2 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                                                    } else if (AndroidUtilities.isInMultiwindow) {
                                                        int paddingTop3 = getPaddingTop() + (((i18 - this.l0) + measuredHeight) - AndroidUtilities.statusBarHeight);
                                                        if (i20 < 0) {
                                                            i20 = Math.max(Math.min(paddingTop3, AndroidUtilities.dp(350.0f)), paddingTop3 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                    }
                                                } else {
                                                    bk bkVar = wnVar.U1;
                                                    if (childAt2 == bkVar) {
                                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bkVar.getLayoutParams();
                                                        ig.j1 adapter = wnVar.U1.getAdapter();
                                                        if (adapter.w0 == null || adapter.h0) {
                                                            wnVar.U1.setIgnoreLayout(true);
                                                            layoutParams.height = i18;
                                                            layoutParams.topMargin = 0;
                                                            wnVar.U1.setIgnoreLayout(false);
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                        } else {
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31));
                                                        }
                                                    } else if (childAt2 == wnVar.s9.n(getContext())) {
                                                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                        int i22 = i18 + wnVar.Qa;
                                                        if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || wnVar.fb) {
                                                            pm pmVar = wnVar.s9;
                                                            pmVar.d0 = 0;
                                                            pmVar.w();
                                                        } else {
                                                            i22 += keyboardHeight;
                                                            pm pmVar2 = wnVar.s9;
                                                            pmVar2.d0 = keyboardHeight;
                                                            pmVar2.w();
                                                        }
                                                        childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
                                                    } else if (childAt2 instanceof org.telegram.ui.Components.oc0) {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                    } else if (childAt2 == wnVar.d2) {
                                                        kVar5 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                                        if (kVar5.getVisibility() == 0) {
                                                            kVar6 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                                                            i14 = size2 - kVar6.getMeasuredHeight();
                                                        } else {
                                                            i14 = size2;
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                                                    } else {
                                                        measureChildWithMargins(childAt2, makeMeasureSpec, 0, i11, 0);
                                                    }
                                                }
                                                i12++;
                                                i16 = 0;
                                            }
                                        }
                                    }
                                    i12++;
                                    i16 = 0;
                                }
                                i12++;
                                i16 = 0;
                            }
                            if (wnVar.Q4) {
                                wnVar.R4 = true;
                                wnVar.A9();
                                wnVar.C9();
                                wnVar.Q4 = false;
                                rj rjVar = wnVar.x0;
                                rjVar.measure(View.MeasureSpec.makeMeasureSpec(rjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(wnVar.x0.getMeasuredHeight(), TLObject.FLAG_30));
                                wnVar.R4 = false;
                            }
                            i13 = wnVar.J4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new ag.r0(this, i13, 28));
                                wnVar.J4 = -1;
                            }
                            qcVar = org.telegram.ui.Components.qc.x;
                            if (qcVar != null && wnVar.zc != null) {
                                qcVar.l();
                            }
                            wnVar.b7();
                            this.m0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.af afVar = wnVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(afVar);
        afVar.run();
        childCount = getChildCount();
        int i182 = paddingTop;
        measureChildWithMargins(wnVar.Y, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
        if (z10) {
        }
        this.l0 = 0;
        wnVar.Qa = 0;
        wnVar.Ra = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i192 = wnVar.G;
            wnVar.Qa = i192;
            wnVar.Ra = i192;
        }
        i12 = 0;
        while (i12 < childCount) {
        }
        if (wnVar.Q4) {
        }
        i13 = wnVar.J4;
        if (i13 != -1) {
        }
        qcVar = org.telegram.ui.Components.qc.x;
        if (qcVar != null) {
            qcVar.l();
        }
        wnVar.b7();
        this.m0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        wn wnVar = this.B0;
        ih.d.c(wnVar.P8, wnVar.fragmentView);
        wnVar.Q8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.B0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        wn wnVar = this.B0;
        wnVar.L9 = i11;
        wnVar.A9();
        wnVar.C9();
    }

    @Override // org.telegram.ui.Components.ww0
    public final void L() {
    }

    @Override // org.telegram.ui.Components.ww0
    public final void V() {
    }

    @Override // org.telegram.ui.Components.ww0
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
