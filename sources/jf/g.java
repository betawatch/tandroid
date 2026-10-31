package jf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.j6;
import c3.i0;
import nh.p;
import org.telegram.messenger.cd;
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.voip.s0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.tc1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends ViewGroup {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                lf.e eVar = (lf.e) this.b;
                Path path = eVar.m;
                float f7 = (1.0f - eVar.o) * eVar.j.e;
                boolean z10 = f7 > 1.0f;
                canvas.drawColor(i0.b.o(t6.x0(null, t6.d6, false), (int) Math.min(eVar.o * 420.0f, 255.0f)));
                eVar.d.a(canvas, 1.0f);
                if (z10) {
                    RectF rectF = eVar.l;
                    if (eVar.k != f7) {
                        eVar.k = f7;
                        rectF.set(eVar.c);
                        path.reset();
                        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                        path.close();
                    }
                    canvas.save();
                    canvas.clipPath(path);
                }
                super.dispatchDraw(canvas);
                eVar.e.a(canvas, 1.0f - eVar.o);
                if (z10) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 2:
                if (!((jf0) this.b).m0) {
                    canvas.save();
                    canvas.scale(r0.H / r0.e.getWidth(), r0.I / r0.e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 3:
                if (!((s0) this.b).a0) {
                    super.draw(canvas);
                    break;
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        z4 z4Var;
        switch (this.a) {
            case 5:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    z4Var = ((k2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) z4Var).q(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        l lVar;
        float f7;
        float f10;
        l lVar2;
        l lVar3;
        l lVar4;
        l lVar5;
        switch (this.a) {
            case 0:
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    Rect rect = ((lf.e) this.b).c;
                    childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
                }
                break;
            case 1:
                org.telegram.ui.f fVar = (org.telegram.ui.f) this.b;
                lVar = ((k2) fVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((k2) fVar).actionBar;
                    lVar3 = ((k2) fVar).actionBar;
                    lVar2.layout(0, 0, i12, lVar3.getMeasuredHeight());
                }
                int i15 = i12 - i10;
                int i16 = i13 - i11;
                int i17 = fVar.w;
                if (i17 == 0) {
                    if (i12 > i13) {
                        int measuredHeight = (i16 - fVar.a.getMeasuredHeight()) / 2;
                        ei0 ei0Var = fVar.a;
                        ei0Var.layout(0, measuredHeight, ei0Var.getMeasuredWidth(), fVar.a.getMeasuredHeight() + measuredHeight);
                        float f11 = i15;
                        float f12 = 0.4f * f11;
                        int i18 = (int) f12;
                        float f13 = i16;
                        int i19 = (int) (0.22f * f13);
                        TextView textView = fVar.e;
                        textView.layout(i18, i19, textView.getMeasuredWidth() + i18, fVar.e.getMeasuredHeight() + i19);
                        int i20 = (int) (0.39f * f13);
                        TextView textView2 = fVar.f;
                        textView2.layout(i18, i20, textView2.getMeasuredWidth() + i18, fVar.f.getMeasuredHeight() + i20);
                        int B = (int) i0.B(f11 * 0.6f, fVar.c.getMeasuredWidth(), 2.0f, f12);
                        int i21 = (int) (f13 * 0.69f);
                        j6 j6Var = fVar.c;
                        j6Var.layout(B, i21, j6Var.getMeasuredWidth() + B, fVar.c.getMeasuredHeight() + i21);
                        break;
                    } else {
                        float f14 = i16;
                        int i22 = (int) (0.188f * f14);
                        ei0 ei0Var2 = fVar.a;
                        ei0Var2.layout(0, i22, ei0Var2.getMeasuredWidth(), fVar.a.getMeasuredHeight() + i22);
                        int i23 = (int) (0.651f * f14);
                        TextView textView3 = fVar.e;
                        textView3.layout(0, i23, textView3.getMeasuredWidth(), fVar.e.getMeasuredHeight() + i23);
                        int i24 = (int) (0.731f * f14);
                        TextView textView4 = fVar.f;
                        textView4.layout(0, i24, textView4.getMeasuredWidth(), fVar.f.getMeasuredHeight() + i24);
                        int measuredWidth = (i15 - fVar.c.getMeasuredWidth()) / 2;
                        int i25 = (int) (f14 * 0.853f);
                        j6 j6Var2 = fVar.c;
                        j6Var2.layout(measuredWidth, i25, j6Var2.getMeasuredWidth() + measuredWidth, fVar.c.getMeasuredHeight() + i25);
                        break;
                    }
                } else if (i17 == 3) {
                    if (i12 > i13) {
                        float f15 = i16;
                        int measuredHeight2 = ((int) ((0.95f * f15) - fVar.a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - fVar.a.getMeasuredWidth());
                        ei0 ei0Var3 = fVar.a;
                        ei0Var3.layout(width, measuredHeight2, ei0Var3.getMeasuredWidth() + width, fVar.a.getMeasuredHeight() + measuredHeight2);
                        float f16 = i15;
                        float f17 = 0.4f * f16;
                        int i26 = (int) f17;
                        int i27 = (int) (0.12f * f15);
                        TextView textView5 = fVar.e;
                        textView5.layout(i26, i27, textView5.getMeasuredWidth() + i26, fVar.e.getMeasuredHeight() + i27);
                        int i28 = (int) (0.24f * f15);
                        TextView textView6 = fVar.f;
                        textView6.layout(i26, i28, textView6.getMeasuredWidth() + i26, fVar.f.getMeasuredHeight() + i28);
                        float f18 = f16 * 0.6f;
                        int B2 = (int) i0.B(f18, fVar.c.getMeasuredWidth(), 2.0f, f17);
                        int i29 = (int) (f15 * 0.8f);
                        j6 j6Var3 = fVar.c;
                        j6Var3.layout(B2, i29, j6Var3.getMeasuredWidth() + B2, fVar.c.getMeasuredHeight() + i29);
                        int B3 = (int) i0.B(f18, fVar.d.getMeasuredWidth(), 2.0f, f17);
                        int w9 = z20.w(16.0f, fVar.d.getMeasuredHeight(), i29);
                        TextView textView7 = fVar.d;
                        textView7.layout(B3, w9, textView7.getMeasuredWidth() + B3, fVar.d.getMeasuredHeight() + w9);
                        break;
                    } else {
                        int i30 = (int) (i16 * 0.3f);
                        int measuredWidth2 = (i15 - fVar.a.getMeasuredWidth()) / 2;
                        ei0 ei0Var4 = fVar.a;
                        ei0Var4.layout(measuredWidth2, i30, ei0Var4.getMeasuredWidth() + measuredWidth2, fVar.a.getMeasuredHeight() + i30);
                        int C = m5.C(24.0f, fVar.a.getMeasuredHeight(), i30);
                        TextView textView8 = fVar.e;
                        textView8.layout(0, C, textView8.getMeasuredWidth(), fVar.e.getMeasuredHeight() + C);
                        int textSize = (int) (fVar.e.getTextSize() + org.telegram.messenger.i0.L(16.0f) + C);
                        TextView textView9 = fVar.f;
                        textView9.layout(0, textSize, textView9.getMeasuredWidth(), fVar.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i15 - fVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight3 = (i16 - fVar.c.getMeasuredHeight()) - org.telegram.messenger.i0.L(48.0f);
                        j6 j6Var4 = fVar.c;
                        j6Var4.layout(measuredWidth3, measuredHeight3, j6Var4.getMeasuredWidth() + measuredWidth3, fVar.c.getMeasuredHeight() + measuredHeight3);
                        int measuredWidth4 = (i15 - fVar.d.getMeasuredWidth()) / 2;
                        int w10 = z20.w(32.0f, fVar.d.getMeasuredHeight(), measuredHeight3);
                        TextView textView10 = fVar.d;
                        textView10.layout(measuredWidth4, w10, textView10.getMeasuredWidth() + measuredWidth4, fVar.d.getMeasuredHeight() + w10);
                        break;
                    }
                } else if (i17 == 5) {
                    if (i12 > i13) {
                        int measuredHeight4 = (i16 - fVar.a.getMeasuredHeight()) / 2;
                        ei0 ei0Var5 = fVar.a;
                        ei0Var5.layout(0, measuredHeight4, ei0Var5.getMeasuredWidth(), fVar.a.getMeasuredHeight() + measuredHeight4);
                        float f19 = i15;
                        float f20 = 0.4f * f19;
                        int i31 = (int) f20;
                        float f21 = i16;
                        int i32 = (int) (0.08f * f21);
                        TextView textView11 = fVar.e;
                        textView11.layout(i31, i32, textView11.getMeasuredWidth() + i31, fVar.e.getMeasuredHeight() + i32);
                        float f22 = f19 * 0.6f;
                        int B4 = (int) i0.B(f22, fVar.h.getMeasuredWidth(), 2.0f, f20);
                        int i33 = (int) (0.25f * f21);
                        LinearLayout linearLayout = fVar.h;
                        linearLayout.layout(B4, i33, linearLayout.getMeasuredWidth() + B4, fVar.h.getMeasuredHeight() + i33);
                        int B5 = (int) i0.B(f22, fVar.c.getMeasuredWidth(), 2.0f, f20);
                        int i34 = (int) (f21 * 0.78f);
                        j6 j6Var5 = fVar.c;
                        j6Var5.layout(B5, i34, j6Var5.getMeasuredWidth() + B5, fVar.c.getMeasuredHeight() + i34);
                        break;
                    } else {
                        if (org.telegram.messenger.i0.q.y < 1800) {
                            f7 = i16;
                            int i35 = (int) (0.06f * f7);
                            ei0 ei0Var6 = fVar.a;
                            ei0Var6.layout(0, i35, ei0Var6.getMeasuredWidth(), fVar.a.getMeasuredHeight() + i35);
                            int i36 = (int) (0.463f * f7);
                            TextView textView12 = fVar.e;
                            textView12.layout(0, i36, textView12.getMeasuredWidth(), fVar.e.getMeasuredHeight() + i36);
                            f10 = 0.543f;
                        } else {
                            f7 = i16;
                            int i37 = (int) (0.148f * f7);
                            ei0 ei0Var7 = fVar.a;
                            ei0Var7.layout(0, i37, ei0Var7.getMeasuredWidth(), fVar.a.getMeasuredHeight() + i37);
                            int i38 = (int) (0.551f * f7);
                            TextView textView13 = fVar.e;
                            textView13.layout(0, i38, textView13.getMeasuredWidth(), fVar.e.getMeasuredHeight() + i38);
                            f10 = 0.631f;
                        }
                        int i39 = (int) (f7 * f10);
                        int measuredWidth5 = (getMeasuredWidth() - fVar.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout2 = fVar.h;
                        linearLayout2.layout(measuredWidth5, i39, linearLayout2.getMeasuredWidth() + measuredWidth5, fVar.h.getMeasuredHeight() + i39);
                        int measuredWidth6 = (i15 - fVar.c.getMeasuredWidth()) / 2;
                        int i40 = (int) (i16 * 0.853f);
                        j6 j6Var6 = fVar.c;
                        j6Var6.layout(measuredWidth6, i40, j6Var6.getMeasuredWidth() + measuredWidth6, fVar.c.getMeasuredHeight() + i40);
                        break;
                    }
                } else if (i17 == 6) {
                    if (i12 > i13) {
                        int measuredHeight5 = (i16 - fVar.a.getMeasuredHeight()) / 2;
                        float f23 = i15;
                        int measuredWidth7 = ((int) ((0.5f * f23) - fVar.a.getMeasuredWidth())) / 2;
                        ei0 ei0Var8 = fVar.a;
                        ei0Var8.layout(measuredWidth7, measuredHeight5, ei0Var8.getMeasuredWidth() + measuredWidth7, fVar.a.getMeasuredHeight() + measuredHeight5);
                        float f24 = 0.4f * f23;
                        int i41 = (int) f24;
                        float f25 = i16;
                        int i42 = (int) (0.14f * f25);
                        TextView textView14 = fVar.e;
                        textView14.layout(i41, i42, textView14.getMeasuredWidth() + i41, fVar.e.getMeasuredHeight() + i42);
                        int i43 = (int) (0.31f * f25);
                        TextView textView15 = fVar.f;
                        textView15.layout(i41, i43, textView15.getMeasuredWidth() + i41, fVar.f.getMeasuredHeight() + i43);
                        int B6 = (int) i0.B(f23 * 0.6f, fVar.c.getMeasuredWidth(), 2.0f, f24);
                        int i44 = (int) (f25 * 0.78f);
                        j6 j6Var7 = fVar.c;
                        j6Var7.layout(B6, i44, j6Var7.getMeasuredWidth() + B6, fVar.c.getMeasuredHeight() + i44);
                        break;
                    } else {
                        int i45 = (int) (i16 * 0.3f);
                        int measuredWidth8 = (i15 - fVar.a.getMeasuredWidth()) / 2;
                        ei0 ei0Var9 = fVar.a;
                        ei0Var9.layout(measuredWidth8, i45, ei0Var9.getMeasuredWidth() + measuredWidth8, fVar.a.getMeasuredHeight() + i45);
                        int C2 = m5.C(24.0f, fVar.a.getMeasuredHeight(), i45);
                        TextView textView16 = fVar.e;
                        textView16.layout(0, C2, textView16.getMeasuredWidth(), fVar.e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (fVar.e.getTextSize() + org.telegram.messenger.i0.L(16.0f) + C2);
                        TextView textView17 = fVar.f;
                        textView17.layout(0, textSize2, textView17.getMeasuredWidth(), fVar.f.getMeasuredHeight() + textSize2);
                        int measuredWidth9 = (i15 - fVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight6 = (i16 - fVar.c.getMeasuredHeight()) - org.telegram.messenger.i0.L(48.0f);
                        j6 j6Var8 = fVar.c;
                        j6Var8.layout(measuredWidth9, measuredHeight6, j6Var8.getMeasuredWidth() + measuredWidth9, fVar.c.getMeasuredHeight() + measuredHeight6);
                        break;
                    }
                }
                break;
            case 2:
                jf0 jf0Var = (jf0) this.b;
                jf0Var.e.layout(0, 0, jf0Var.H, jf0Var.I);
                break;
            case 3:
                s0 s0Var = (s0) this.b;
                if (s0Var.e.getParent() == this) {
                    s0Var.e.layout(0, 0, s0Var.M, s0Var.N);
                    break;
                }
                break;
            case 4:
                tc1 tc1Var = (tc1) this.b;
                lVar4 = ((k2) tc1Var).actionBar;
                lVar5 = ((k2) tc1Var).actionBar;
                lVar4.layout(0, 0, i12, lVar5.getMeasuredHeight());
                int i46 = i12 - i10;
                int i47 = i13 - i11;
                if (i12 > i13) {
                    int measuredHeight7 = (i47 - tc1Var.a.getMeasuredHeight()) / 2;
                    ei0 ei0Var10 = tc1Var.a;
                    ei0Var10.layout(0, measuredHeight7, ei0Var10.getMeasuredWidth(), tc1Var.a.getMeasuredHeight() + measuredHeight7);
                    float f26 = i46;
                    float f27 = 0.4f * f26;
                    int i48 = (int) f27;
                    float f28 = i47;
                    int i49 = (int) (0.22f * f28);
                    TextView textView18 = tc1Var.c;
                    textView18.layout(i48, i49, textView18.getMeasuredWidth() + i48, tc1Var.c.getMeasuredHeight() + i49);
                    int i50 = (int) (0.39f * f28);
                    p pVar = tc1Var.d;
                    pVar.layout(i48, i50, pVar.getMeasuredWidth() + i48, tc1Var.d.getMeasuredHeight() + i50);
                    int B7 = (int) i0.B(f26 * 0.6f, tc1Var.b.getMeasuredWidth(), 2.0f, f27);
                    int i51 = (int) (f28 * 0.64f);
                    TextView textView19 = tc1Var.b;
                    textView19.layout(B7, i51, textView19.getMeasuredWidth() + B7, tc1Var.b.getMeasuredHeight() + i51);
                    break;
                } else {
                    int i52 = (int) (i47 * 0.3f);
                    int measuredWidth10 = (i46 - tc1Var.a.getMeasuredWidth()) / 2;
                    ei0 ei0Var11 = tc1Var.a;
                    ei0Var11.layout(measuredWidth10, i52, ei0Var11.getMeasuredWidth() + measuredWidth10, tc1Var.a.getMeasuredHeight() + i52);
                    int C3 = m5.C(16.0f, tc1Var.a.getMeasuredHeight(), i52);
                    TextView textView20 = tc1Var.c;
                    textView20.layout(0, C3, textView20.getMeasuredWidth(), tc1Var.c.getMeasuredHeight() + C3);
                    int C4 = m5.C(12.0f, tc1Var.c.getMeasuredHeight(), C3);
                    p pVar2 = tc1Var.d;
                    pVar2.layout(0, C4, pVar2.getMeasuredWidth(), tc1Var.d.getMeasuredHeight() + C4);
                    int measuredWidth11 = (i46 - tc1Var.b.getMeasuredWidth()) / 2;
                    int measuredHeight8 = (i47 - tc1Var.b.getMeasuredHeight()) - org.telegram.messenger.i0.L(48.0f);
                    TextView textView21 = tc1Var.b;
                    textView21.layout(measuredWidth11, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth11, tc1Var.b.getMeasuredHeight() + measuredHeight8);
                    break;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                p1 p1Var = usersSelectActivity.a;
                p1Var.layout(0, 0, p1Var.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                f10 f10Var = usersSelectActivity.r;
                if (f10Var != null) {
                    int measuredWidth12 = cd.X ? usersSelectActivity.s.leftMargin : ((i12 - i10) - usersSelectActivity.s.rightMargin) - f10Var.getMeasuredWidth();
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    f10 f10Var2 = usersSelectActivity.r;
                    f10Var2.layout(measuredWidth12, measuredHeight9, f10Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        l lVar;
        l lVar2;
        l lVar3;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                lf.e eVar = (lf.e) this.b;
                boolean z10 = ((a) getParent()).d;
                Rect rect = eVar.c;
                if (z10) {
                    rect.set(0, 0, size, size2);
                } else {
                    rect.set(eVar.b);
                }
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.c.width(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(eVar.c.height(), TLObject.FLAG_30));
                }
                break;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                org.telegram.ui.f fVar = (org.telegram.ui.f) this.b;
                int i13 = fVar.w;
                lVar = ((k2) fVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((k2) fVar).actionBar;
                    lVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                }
                if (i13 != 0) {
                    if (i13 == 3) {
                        fVar.a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(150.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(150.0f), TLObject.FLAG_30));
                        if (size3 > size4) {
                            float f7 = size3;
                            fVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            int i14 = (int) (f7 * 0.6f);
                            fVar.e.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.f.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.c.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                        } else {
                            fVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.f.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                            fVar.c.measure(z20.c(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                        }
                    } else if (i13 != 5) {
                        if (i13 == 6) {
                            if (i13 == 6) {
                                fVar.a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(140.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(140.0f), TLObject.FLAG_30));
                            } else {
                                fVar.a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), TLObject.FLAG_30));
                            }
                            if (size3 > size4) {
                                int i15 = (int) (size3 * 0.6f);
                                fVar.e.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                                fVar.f.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                                fVar.c.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                            } else {
                                fVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                                fVar.f.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                                if (i13 == 6) {
                                    fVar.c.measure(z20.c(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                                } else {
                                    fVar.c.measure(z20.c(72.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                                }
                            }
                        }
                    } else if (size3 > size4) {
                        float f10 = size3;
                        fVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                        int i16 = (int) (f10 * 0.6f);
                        fVar.e.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                        fVar.h.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, 0));
                        fVar.c.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                    } else {
                        fVar.a.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.399f), TLObject.FLAG_30));
                        fVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                        fVar.h.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size4, 0));
                        fVar.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                    }
                } else if (size3 > size4) {
                    float f11 = size3;
                    fVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i17 = (int) (f11 * 0.6f);
                    fVar.e.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    fVar.f.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    fVar.c.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                } else {
                    fVar.a.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.399f), TLObject.FLAG_30));
                    fVar.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    fVar.f.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    fVar.c.measure(z20.c(72.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size3, size4);
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                jf0 jf0Var = (jf0) this.b;
                jf0Var.e.measure(View.MeasureSpec.makeMeasureSpec(jf0Var.H, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(jf0Var.I, TLObject.FLAG_30));
                break;
            case 3:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                s0 s0Var = (s0) this.b;
                if (s0Var.e.getParent() == this) {
                    s0Var.e.measure(View.MeasureSpec.makeMeasureSpec(s0Var.M, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(s0Var.N, TLObject.FLAG_30));
                    break;
                }
                break;
            case 4:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                tc1 tc1Var = (tc1) this.b;
                lVar3 = ((k2) tc1Var).actionBar;
                lVar3.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), i11);
                if (size5 > size6) {
                    float f12 = size5;
                    tc1Var.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size6 * 0.68f), TLObject.FLAG_30));
                    int i18 = (int) (f12 * 0.6f);
                    tc1Var.c.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.b.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), TLObject.FLAG_30));
                } else {
                    float f13 = tc1Var.O == 7 ? zs.q2 : zs.W1;
                    tc1Var.a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f13), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f13), TLObject.FLAG_30));
                    tc1Var.c.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, 0));
                    tc1Var.b.measure(z20.c(48.0f, size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size5, size6);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                usersSelectActivity.a.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((org.telegram.messenger.i0.Q1() || size8 > size7) ? org.telegram.messenger.i0.L(144.0f) : org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_31));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.f.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                f10 f10Var = usersSelectActivity.r;
                if (f10Var != null) {
                    int i19 = usersSelectActivity.s.width;
                    f10Var.measure(View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LaunchActivity launchActivity, lf.e eVar) {
        super(launchActivity);
        this.a = 0;
        this.b = eVar;
    }
}
