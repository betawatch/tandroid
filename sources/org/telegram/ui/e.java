package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e extends ViewGroup {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 3:
                canvas.save();
                ti.i iVar = (ti.i) this.b;
                canvas.scale(iVar.x / iVar.i.getWidth(), iVar.y / iVar.i.getHeight());
                super.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.q4 q4Var;
        switch (this.a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j3);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    q4Var = ((org.telegram.ui.ActionBar.f2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) q4Var).q(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                kVar = ((org.telegram.ui.ActionBar.f2) gVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) gVar).actionBar;
                    kVar3 = ((org.telegram.ui.ActionBar.f2) gVar).actionBar;
                    kVar2.layout(0, 0, i11, kVar3.getMeasuredHeight());
                }
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                int i15 = gVar.w;
                if (i15 == 0) {
                    if (i11 <= i12) {
                        float f12 = i14;
                        int i16 = (int) (0.188f * f12);
                        org.telegram.ui.Components.ch0 ch0Var = gVar.a;
                        ch0Var.layout(0, i16, ch0Var.getMeasuredWidth(), gVar.a.getMeasuredHeight() + i16);
                        int i17 = (int) (0.651f * f12);
                        TextView textView = gVar.e;
                        textView.layout(0, i17, textView.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i17);
                        int i18 = (int) (0.731f * f12);
                        TextView textView2 = gVar.f;
                        textView2.layout(0, i18, textView2.getMeasuredWidth(), gVar.f.getMeasuredHeight() + i18);
                        int measuredWidth = (i13 - gVar.c.getMeasuredWidth()) / 2;
                        int i19 = (int) (f12 * 0.853f);
                        ei.k kVar6 = gVar.c;
                        kVar6.layout(measuredWidth, i19, kVar6.getMeasuredWidth() + measuredWidth, gVar.c.getMeasuredHeight() + i19);
                        break;
                    } else {
                        int measuredHeight = (i14 - gVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.ch0 ch0Var2 = gVar.a;
                        ch0Var2.layout(0, measuredHeight, ch0Var2.getMeasuredWidth(), gVar.a.getMeasuredHeight() + measuredHeight);
                        float f13 = i13;
                        float f14 = 0.4f * f13;
                        int i20 = (int) f14;
                        float f15 = i14;
                        int i21 = (int) (0.22f * f15);
                        TextView textView3 = gVar.e;
                        textView3.layout(i20, i21, textView3.getMeasuredWidth() + i20, gVar.e.getMeasuredHeight() + i21);
                        int i22 = (int) (0.39f * f15);
                        TextView textView4 = gVar.f;
                        textView4.layout(i20, i22, textView4.getMeasuredWidth() + i20, gVar.f.getMeasuredHeight() + i22);
                        int A = (int) com.google.android.recaptcha.internal.a.A(f13 * 0.6f, gVar.c.getMeasuredWidth(), 2.0f, f14);
                        int i23 = (int) (f15 * 0.69f);
                        ei.k kVar7 = gVar.c;
                        kVar7.layout(A, i23, kVar7.getMeasuredWidth() + A, gVar.c.getMeasuredHeight() + i23);
                        break;
                    }
                } else if (i15 == 3) {
                    if (i11 <= i12) {
                        int i24 = (int) (i14 * 0.3f);
                        int measuredWidth2 = (i13 - gVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.ch0 ch0Var3 = gVar.a;
                        ch0Var3.layout(measuredWidth2, i24, ch0Var3.getMeasuredWidth() + measuredWidth2, gVar.a.getMeasuredHeight() + i24);
                        int C = org.telegram.messenger.k5.C(24.0f, gVar.a.getMeasuredHeight(), i24);
                        TextView textView5 = gVar.e;
                        textView5.layout(0, C, textView5.getMeasuredWidth(), gVar.e.getMeasuredHeight() + C);
                        int textSize = (int) (gVar.e.getTextSize() + org.telegram.messenger.g0.L(16.0f) + C);
                        TextView textView6 = gVar.f;
                        textView6.layout(0, textSize, textView6.getMeasuredWidth(), gVar.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i13 - gVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i14 - gVar.c.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                        ei.k kVar8 = gVar.c;
                        kVar8.layout(measuredWidth3, measuredHeight2, kVar8.getMeasuredWidth() + measuredWidth3, gVar.c.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i13 - gVar.d.getMeasuredWidth()) / 2;
                        int w10 = org.telegram.messenger.camera.q.w(32.0f, gVar.d.getMeasuredHeight(), measuredHeight2);
                        TextView textView7 = gVar.d;
                        textView7.layout(measuredWidth4, w10, textView7.getMeasuredWidth() + measuredWidth4, gVar.d.getMeasuredHeight() + w10);
                        break;
                    } else {
                        float f16 = i14;
                        int measuredHeight3 = ((int) ((0.95f * f16) - gVar.a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - gVar.a.getMeasuredWidth());
                        org.telegram.ui.Components.ch0 ch0Var4 = gVar.a;
                        ch0Var4.layout(width, measuredHeight3, ch0Var4.getMeasuredWidth() + width, gVar.a.getMeasuredHeight() + measuredHeight3);
                        float f17 = i13;
                        float f18 = 0.4f * f17;
                        int i25 = (int) f18;
                        int i26 = (int) (0.12f * f16);
                        TextView textView8 = gVar.e;
                        textView8.layout(i25, i26, textView8.getMeasuredWidth() + i25, gVar.e.getMeasuredHeight() + i26);
                        int i27 = (int) (0.24f * f16);
                        TextView textView9 = gVar.f;
                        textView9.layout(i25, i27, textView9.getMeasuredWidth() + i25, gVar.f.getMeasuredHeight() + i27);
                        float f19 = f17 * 0.6f;
                        int A2 = (int) com.google.android.recaptcha.internal.a.A(f19, gVar.c.getMeasuredWidth(), 2.0f, f18);
                        int i28 = (int) (f16 * 0.8f);
                        ei.k kVar9 = gVar.c;
                        kVar9.layout(A2, i28, kVar9.getMeasuredWidth() + A2, gVar.c.getMeasuredHeight() + i28);
                        int A3 = (int) com.google.android.recaptcha.internal.a.A(f19, gVar.d.getMeasuredWidth(), 2.0f, f18);
                        int w11 = org.telegram.messenger.camera.q.w(16.0f, gVar.d.getMeasuredHeight(), i28);
                        TextView textView10 = gVar.d;
                        textView10.layout(A3, w11, textView10.getMeasuredWidth() + A3, gVar.d.getMeasuredHeight() + w11);
                        break;
                    }
                } else if (i15 == 5) {
                    if (i11 <= i12) {
                        if (org.telegram.messenger.g0.q.y < 1800) {
                            f10 = i14;
                            int i29 = (int) (0.06f * f10);
                            org.telegram.ui.Components.ch0 ch0Var5 = gVar.a;
                            ch0Var5.layout(0, i29, ch0Var5.getMeasuredWidth(), gVar.a.getMeasuredHeight() + i29);
                            int i30 = (int) (0.463f * f10);
                            TextView textView11 = gVar.e;
                            textView11.layout(0, i30, textView11.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i30);
                            f11 = 0.543f;
                        } else {
                            f10 = i14;
                            int i31 = (int) (0.148f * f10);
                            org.telegram.ui.Components.ch0 ch0Var6 = gVar.a;
                            ch0Var6.layout(0, i31, ch0Var6.getMeasuredWidth(), gVar.a.getMeasuredHeight() + i31);
                            int i32 = (int) (0.551f * f10);
                            TextView textView12 = gVar.e;
                            textView12.layout(0, i32, textView12.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i32);
                            f11 = 0.631f;
                        }
                        int i33 = (int) (f10 * f11);
                        int measuredWidth5 = (getMeasuredWidth() - gVar.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout = gVar.h;
                        linearLayout.layout(measuredWidth5, i33, linearLayout.getMeasuredWidth() + measuredWidth5, gVar.h.getMeasuredHeight() + i33);
                        int measuredWidth6 = (i13 - gVar.c.getMeasuredWidth()) / 2;
                        int i34 = (int) (i14 * 0.853f);
                        ei.k kVar10 = gVar.c;
                        kVar10.layout(measuredWidth6, i34, kVar10.getMeasuredWidth() + measuredWidth6, gVar.c.getMeasuredHeight() + i34);
                        break;
                    } else {
                        int measuredHeight4 = (i14 - gVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.ch0 ch0Var7 = gVar.a;
                        ch0Var7.layout(0, measuredHeight4, ch0Var7.getMeasuredWidth(), gVar.a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i13;
                        float f21 = 0.4f * f20;
                        int i35 = (int) f21;
                        float f22 = i14;
                        int i36 = (int) (0.08f * f22);
                        TextView textView13 = gVar.e;
                        textView13.layout(i35, i36, textView13.getMeasuredWidth() + i35, gVar.e.getMeasuredHeight() + i36);
                        float f23 = f20 * 0.6f;
                        int A4 = (int) com.google.android.recaptcha.internal.a.A(f23, gVar.h.getMeasuredWidth(), 2.0f, f21);
                        int i37 = (int) (0.25f * f22);
                        LinearLayout linearLayout2 = gVar.h;
                        linearLayout2.layout(A4, i37, linearLayout2.getMeasuredWidth() + A4, gVar.h.getMeasuredHeight() + i37);
                        int A5 = (int) com.google.android.recaptcha.internal.a.A(f23, gVar.c.getMeasuredWidth(), 2.0f, f21);
                        int i38 = (int) (f22 * 0.78f);
                        ei.k kVar11 = gVar.c;
                        kVar11.layout(A5, i38, kVar11.getMeasuredWidth() + A5, gVar.c.getMeasuredHeight() + i38);
                        break;
                    }
                } else if (i15 == 6) {
                    if (i11 <= i12) {
                        int i39 = (int) (i14 * 0.3f);
                        int measuredWidth7 = (i13 - gVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.ch0 ch0Var8 = gVar.a;
                        ch0Var8.layout(measuredWidth7, i39, ch0Var8.getMeasuredWidth() + measuredWidth7, gVar.a.getMeasuredHeight() + i39);
                        int C2 = org.telegram.messenger.k5.C(24.0f, gVar.a.getMeasuredHeight(), i39);
                        TextView textView14 = gVar.e;
                        textView14.layout(0, C2, textView14.getMeasuredWidth(), gVar.e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (gVar.e.getTextSize() + org.telegram.messenger.g0.L(16.0f) + C2);
                        TextView textView15 = gVar.f;
                        textView15.layout(0, textSize2, textView15.getMeasuredWidth(), gVar.f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i13 - gVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i14 - gVar.c.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                        ei.k kVar12 = gVar.c;
                        kVar12.layout(measuredWidth8, measuredHeight5, kVar12.getMeasuredWidth() + measuredWidth8, gVar.c.getMeasuredHeight() + measuredHeight5);
                        break;
                    } else {
                        int measuredHeight6 = (i14 - gVar.a.getMeasuredHeight()) / 2;
                        float f24 = i13;
                        int measuredWidth9 = ((int) ((0.5f * f24) - gVar.a.getMeasuredWidth())) / 2;
                        org.telegram.ui.Components.ch0 ch0Var9 = gVar.a;
                        ch0Var9.layout(measuredWidth9, measuredHeight6, ch0Var9.getMeasuredWidth() + measuredWidth9, gVar.a.getMeasuredHeight() + measuredHeight6);
                        float f25 = 0.4f * f24;
                        int i40 = (int) f25;
                        float f26 = i14;
                        int i41 = (int) (0.14f * f26);
                        TextView textView16 = gVar.e;
                        textView16.layout(i40, i41, textView16.getMeasuredWidth() + i40, gVar.e.getMeasuredHeight() + i41);
                        int i42 = (int) (0.31f * f26);
                        TextView textView17 = gVar.f;
                        textView17.layout(i40, i42, textView17.getMeasuredWidth() + i40, gVar.f.getMeasuredHeight() + i42);
                        int A6 = (int) com.google.android.recaptcha.internal.a.A(f24 * 0.6f, gVar.c.getMeasuredWidth(), 2.0f, f25);
                        int i43 = (int) (f26 * 0.78f);
                        ei.k kVar13 = gVar.c;
                        kVar13.layout(A6, i43, kVar13.getMeasuredWidth() + A6, gVar.c.getMeasuredHeight() + i43);
                        break;
                    }
                }
                break;
            case 1:
                ya1 ya1Var = (ya1) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.f2) ya1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.f2) ya1Var).actionBar;
                kVar4.layout(0, 0, i11, kVar5.getMeasuredHeight());
                int i44 = i11 - i7;
                int i45 = i12 - i10;
                if (i11 <= i12) {
                    int i46 = (int) (i45 * 0.3f);
                    int measuredWidth10 = (i44 - ya1Var.a.getMeasuredWidth()) / 2;
                    org.telegram.ui.Components.ch0 ch0Var10 = ya1Var.a;
                    ch0Var10.layout(measuredWidth10, i46, ch0Var10.getMeasuredWidth() + measuredWidth10, ya1Var.a.getMeasuredHeight() + i46);
                    int C3 = org.telegram.messenger.k5.C(16.0f, ya1Var.a.getMeasuredHeight(), i46);
                    TextView textView18 = ya1Var.c;
                    textView18.layout(0, C3, textView18.getMeasuredWidth(), ya1Var.c.getMeasuredHeight() + C3);
                    int C4 = org.telegram.messenger.k5.C(12.0f, ya1Var.c.getMeasuredHeight(), C3);
                    xh.l lVar = ya1Var.d;
                    lVar.layout(0, C4, lVar.getMeasuredWidth(), ya1Var.d.getMeasuredHeight() + C4);
                    int measuredWidth11 = (i44 - ya1Var.b.getMeasuredWidth()) / 2;
                    int measuredHeight7 = (i45 - ya1Var.b.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                    TextView textView19 = ya1Var.b;
                    textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, ya1Var.b.getMeasuredHeight() + measuredHeight7);
                    break;
                } else {
                    int measuredHeight8 = (i45 - ya1Var.a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.ch0 ch0Var11 = ya1Var.a;
                    ch0Var11.layout(0, measuredHeight8, ch0Var11.getMeasuredWidth(), ya1Var.a.getMeasuredHeight() + measuredHeight8);
                    float f27 = i44;
                    float f28 = 0.4f * f27;
                    int i47 = (int) f28;
                    float f29 = i45;
                    int i48 = (int) (0.22f * f29);
                    TextView textView20 = ya1Var.c;
                    textView20.layout(i47, i48, textView20.getMeasuredWidth() + i47, ya1Var.c.getMeasuredHeight() + i48);
                    int i49 = (int) (0.39f * f29);
                    xh.l lVar2 = ya1Var.d;
                    lVar2.layout(i47, i49, lVar2.getMeasuredWidth() + i47, ya1Var.d.getMeasuredHeight() + i49);
                    int A7 = (int) com.google.android.recaptcha.internal.a.A(f27 * 0.6f, ya1Var.b.getMeasuredWidth(), 2.0f, f28);
                    int i50 = (int) (f29 * 0.64f);
                    TextView textView21 = ya1Var.b;
                    textView21.layout(A7, i50, textView21.getMeasuredWidth() + A7, ya1Var.b.getMeasuredHeight() + i50);
                    break;
                }
            case 2:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                org.telegram.ui.ActionBar.m1 m1Var = usersSelectActivity.a;
                m1Var.layout(0, 0, m1Var.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                org.telegram.ui.Components.p00 p00Var = usersSelectActivity.r;
                if (p00Var != null) {
                    int measuredWidth12 = org.telegram.messenger.hd.a0 ? usersSelectActivity.s.leftMargin : ((i11 - i7) - usersSelectActivity.s.rightMargin) - p00Var.getMeasuredWidth();
                    int measuredHeight9 = ((i12 - i10) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    org.telegram.ui.Components.p00 p00Var2 = usersSelectActivity.r;
                    p00Var2.layout(measuredWidth12, measuredHeight9, p00Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
                    break;
                }
                break;
            default:
                ti.i iVar = (ti.i) this.b;
                iVar.i.layout(0, 0, iVar.x, iVar.y);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                g gVar = (g) this.b;
                int i11 = gVar.w;
                kVar = ((org.telegram.ui.ActionBar.f2) gVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) gVar).actionBar;
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
                }
                if (i11 != 0) {
                    if (i11 == 3) {
                        gVar.a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), TLObject.FLAG_30));
                        if (size > size2) {
                            float f10 = size;
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i12 = (int) (f10 * 0.6f);
                            gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.c.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                        } else {
                            gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.c.measure(org.telegram.messenger.camera.q.c(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                        }
                    } else if (i11 != 5) {
                        if (i11 == 6) {
                            if (i11 == 6) {
                                gVar.a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), TLObject.FLAG_30));
                            } else {
                                gVar.a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), TLObject.FLAG_30));
                            }
                            if (size > size2) {
                                int i13 = (int) (size * 0.6f);
                                gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                gVar.f.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                gVar.c.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                            } else {
                                gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                gVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                if (i11 == 6) {
                                    gVar.c.measure(org.telegram.messenger.camera.q.c(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                                } else {
                                    gVar.c.measure(org.telegram.messenger.camera.q.c(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                                }
                            }
                        }
                    } else if (size > size2) {
                        float f11 = size;
                        gVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i14 = (int) (f11 * 0.6f);
                        gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        gVar.h.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        gVar.c.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                    } else {
                        gVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                        gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        gVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        gVar.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                    }
                } else if (size > size2) {
                    float f12 = size;
                    gVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                    int i15 = (int) (f12 * 0.6f);
                    gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.c.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                } else {
                    gVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                    gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.c.measure(org.telegram.messenger.camera.q.c(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size, size2);
                break;
            case 1:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                ya1 ya1Var = (ya1) this.b;
                kVar3 = ((org.telegram.ui.ActionBar.f2) ya1Var).actionBar;
                kVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i10);
                if (size3 > size4) {
                    float f13 = size3;
                    ya1Var.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i16 = (int) (f13 * 0.6f);
                    ya1Var.c.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ya1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ya1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ya1Var.b.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30));
                } else {
                    float f14 = ya1Var.O == 7 ? org.telegram.messenger.qs.q2 : org.telegram.messenger.qs.W1;
                    ya1Var.a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f14), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f14), TLObject.FLAG_30));
                    ya1Var.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ya1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ya1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ya1Var.b.measure(org.telegram.messenger.camera.q.c(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size3, size4);
                break;
            case 2:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                int size5 = View.MeasureSpec.getSize(i7);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                usersSelectActivity.a.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((org.telegram.messenger.g0.Q1() || size6 > size5) ? org.telegram.messenger.g0.L(144.0f) : org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_31));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.f.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                org.telegram.ui.Components.p00 p00Var = usersSelectActivity.r;
                if (p00Var != null) {
                    int i17 = usersSelectActivity.s.width;
                    p00Var.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                    break;
                }
                break;
            default:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
                ti.i iVar = (ti.i) this.b;
                iVar.i.measure(View.MeasureSpec.makeMeasureSpec(iVar.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(iVar.y, TLObject.FLAG_30));
                break;
        }
    }
}
