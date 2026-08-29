package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g extends ViewGroup {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                if (!((org.telegram.ui.Components.bg0) this.b).i0) {
                    canvas.save();
                    canvas.scale(r0.D / r0.e.getWidth(), r0.E / r0.e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                if (!((org.telegram.ui.Components.voip.h1) this.b).W) {
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
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) b5Var).q(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        float f9;
        float f10;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                lVar = ((org.telegram.ui.ActionBar.o2) iVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) iVar).actionBar;
                    lVar3 = ((org.telegram.ui.ActionBar.o2) iVar).actionBar;
                    lVar2.layout(0, 0, i12, lVar3.getMeasuredHeight());
                }
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                int i16 = iVar.v;
                if (i16 == 0) {
                    if (i12 <= i13) {
                        float f11 = i15;
                        int i17 = (int) (0.188f * f11);
                        org.telegram.ui.Components.aj0 aj0Var = iVar.a;
                        aj0Var.layout(0, i17, aj0Var.getMeasuredWidth(), iVar.a.getMeasuredHeight() + i17);
                        int i18 = (int) (0.651f * f11);
                        TextView textView = iVar.e;
                        textView.layout(0, i18, textView.getMeasuredWidth(), iVar.e.getMeasuredHeight() + i18);
                        int i19 = (int) (0.731f * f11);
                        TextView textView2 = iVar.f;
                        textView2.layout(0, i19, textView2.getMeasuredWidth(), iVar.f.getMeasuredHeight() + i19);
                        int measuredWidth = (i14 - iVar.c.getMeasuredWidth()) / 2;
                        int i20 = (int) (f11 * 0.853f);
                        cg.s0 s0Var = iVar.c;
                        s0Var.layout(measuredWidth, i20, s0Var.getMeasuredWidth() + measuredWidth, iVar.c.getMeasuredHeight() + i20);
                        break;
                    } else {
                        int measuredHeight = (i15 - iVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.aj0 aj0Var2 = iVar.a;
                        aj0Var2.layout(0, measuredHeight, aj0Var2.getMeasuredWidth(), iVar.a.getMeasuredHeight() + measuredHeight);
                        float f12 = i14;
                        float f13 = 0.4f * f12;
                        int i21 = (int) f13;
                        float f14 = i15;
                        int i22 = (int) (0.22f * f14);
                        TextView textView3 = iVar.e;
                        textView3.layout(i21, i22, textView3.getMeasuredWidth() + i21, iVar.e.getMeasuredHeight() + i22);
                        int i23 = (int) (0.39f * f14);
                        TextView textView4 = iVar.f;
                        textView4.layout(i21, i23, textView4.getMeasuredWidth() + i21, iVar.f.getMeasuredHeight() + i23);
                        int A = (int) com.google.android.recaptcha.internal.a.A(f12 * 0.6f, iVar.c.getMeasuredWidth(), 2.0f, f13);
                        int i24 = (int) (f14 * 0.69f);
                        cg.s0 s0Var2 = iVar.c;
                        s0Var2.layout(A, i24, s0Var2.getMeasuredWidth() + A, iVar.c.getMeasuredHeight() + i24);
                        break;
                    }
                } else if (i16 == 3) {
                    if (i12 <= i13) {
                        int i25 = (int) (i15 * 0.3f);
                        int measuredWidth2 = (i14 - iVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.aj0 aj0Var3 = iVar.a;
                        aj0Var3.layout(measuredWidth2, i25, aj0Var3.getMeasuredWidth() + measuredWidth2, iVar.a.getMeasuredHeight() + i25);
                        int C = org.telegram.messenger.x3.C(24.0f, iVar.a.getMeasuredHeight(), i25);
                        TextView textView5 = iVar.e;
                        textView5.layout(0, C, textView5.getMeasuredWidth(), iVar.e.getMeasuredHeight() + C);
                        int textSize = (int) (iVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C);
                        TextView textView6 = iVar.f;
                        textView6.layout(0, textSize, textView6.getMeasuredWidth(), iVar.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i14 - iVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i15 - iVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        cg.s0 s0Var3 = iVar.c;
                        s0Var3.layout(measuredWidth3, measuredHeight2, s0Var3.getMeasuredWidth() + measuredWidth3, iVar.c.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i14 - iVar.d.getMeasuredWidth()) / 2;
                        int u10 = b.u(32.0f, iVar.d.getMeasuredHeight(), measuredHeight2);
                        TextView textView7 = iVar.d;
                        textView7.layout(measuredWidth4, u10, textView7.getMeasuredWidth() + measuredWidth4, iVar.d.getMeasuredHeight() + u10);
                        break;
                    } else {
                        float f15 = i15;
                        int measuredHeight3 = ((int) ((0.95f * f15) - iVar.a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - iVar.a.getMeasuredWidth());
                        org.telegram.ui.Components.aj0 aj0Var4 = iVar.a;
                        aj0Var4.layout(width, measuredHeight3, aj0Var4.getMeasuredWidth() + width, iVar.a.getMeasuredHeight() + measuredHeight3);
                        float f16 = i14;
                        float f17 = 0.4f * f16;
                        int i26 = (int) f17;
                        int i27 = (int) (0.12f * f15);
                        TextView textView8 = iVar.e;
                        textView8.layout(i26, i27, textView8.getMeasuredWidth() + i26, iVar.e.getMeasuredHeight() + i27);
                        int i28 = (int) (0.24f * f15);
                        TextView textView9 = iVar.f;
                        textView9.layout(i26, i28, textView9.getMeasuredWidth() + i26, iVar.f.getMeasuredHeight() + i28);
                        float f18 = f16 * 0.6f;
                        int A2 = (int) com.google.android.recaptcha.internal.a.A(f18, iVar.c.getMeasuredWidth(), 2.0f, f17);
                        int i29 = (int) (f15 * 0.8f);
                        cg.s0 s0Var4 = iVar.c;
                        s0Var4.layout(A2, i29, s0Var4.getMeasuredWidth() + A2, iVar.c.getMeasuredHeight() + i29);
                        int A3 = (int) com.google.android.recaptcha.internal.a.A(f18, iVar.d.getMeasuredWidth(), 2.0f, f17);
                        int u11 = b.u(16.0f, iVar.d.getMeasuredHeight(), i29);
                        TextView textView10 = iVar.d;
                        textView10.layout(A3, u11, textView10.getMeasuredWidth() + A3, iVar.d.getMeasuredHeight() + u11);
                        break;
                    }
                } else if (i16 == 5) {
                    if (i12 <= i13) {
                        if (AndroidUtilities.displaySize.y < 1800) {
                            f9 = i15;
                            int i30 = (int) (0.06f * f9);
                            org.telegram.ui.Components.aj0 aj0Var5 = iVar.a;
                            aj0Var5.layout(0, i30, aj0Var5.getMeasuredWidth(), iVar.a.getMeasuredHeight() + i30);
                            int i31 = (int) (0.463f * f9);
                            TextView textView11 = iVar.e;
                            textView11.layout(0, i31, textView11.getMeasuredWidth(), iVar.e.getMeasuredHeight() + i31);
                            f10 = 0.543f;
                        } else {
                            f9 = i15;
                            int i32 = (int) (0.148f * f9);
                            org.telegram.ui.Components.aj0 aj0Var6 = iVar.a;
                            aj0Var6.layout(0, i32, aj0Var6.getMeasuredWidth(), iVar.a.getMeasuredHeight() + i32);
                            int i33 = (int) (0.551f * f9);
                            TextView textView12 = iVar.e;
                            textView12.layout(0, i33, textView12.getMeasuredWidth(), iVar.e.getMeasuredHeight() + i33);
                            f10 = 0.631f;
                        }
                        int i34 = (int) (f9 * f10);
                        int measuredWidth5 = (getMeasuredWidth() - iVar.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout = iVar.h;
                        linearLayout.layout(measuredWidth5, i34, linearLayout.getMeasuredWidth() + measuredWidth5, iVar.h.getMeasuredHeight() + i34);
                        int measuredWidth6 = (i14 - iVar.c.getMeasuredWidth()) / 2;
                        int i35 = (int) (i15 * 0.853f);
                        cg.s0 s0Var5 = iVar.c;
                        s0Var5.layout(measuredWidth6, i35, s0Var5.getMeasuredWidth() + measuredWidth6, iVar.c.getMeasuredHeight() + i35);
                        break;
                    } else {
                        int measuredHeight4 = (i15 - iVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.aj0 aj0Var7 = iVar.a;
                        aj0Var7.layout(0, measuredHeight4, aj0Var7.getMeasuredWidth(), iVar.a.getMeasuredHeight() + measuredHeight4);
                        float f19 = i14;
                        float f20 = 0.4f * f19;
                        int i36 = (int) f20;
                        float f21 = i15;
                        int i37 = (int) (0.08f * f21);
                        TextView textView13 = iVar.e;
                        textView13.layout(i36, i37, textView13.getMeasuredWidth() + i36, iVar.e.getMeasuredHeight() + i37);
                        float f22 = f19 * 0.6f;
                        int A4 = (int) com.google.android.recaptcha.internal.a.A(f22, iVar.h.getMeasuredWidth(), 2.0f, f20);
                        int i38 = (int) (0.25f * f21);
                        LinearLayout linearLayout2 = iVar.h;
                        linearLayout2.layout(A4, i38, linearLayout2.getMeasuredWidth() + A4, iVar.h.getMeasuredHeight() + i38);
                        int A5 = (int) com.google.android.recaptcha.internal.a.A(f22, iVar.c.getMeasuredWidth(), 2.0f, f20);
                        int i39 = (int) (f21 * 0.78f);
                        cg.s0 s0Var6 = iVar.c;
                        s0Var6.layout(A5, i39, s0Var6.getMeasuredWidth() + A5, iVar.c.getMeasuredHeight() + i39);
                        break;
                    }
                } else if (i16 == 6) {
                    if (i12 <= i13) {
                        int i40 = (int) (i15 * 0.3f);
                        int measuredWidth7 = (i14 - iVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.aj0 aj0Var8 = iVar.a;
                        aj0Var8.layout(measuredWidth7, i40, aj0Var8.getMeasuredWidth() + measuredWidth7, iVar.a.getMeasuredHeight() + i40);
                        int C2 = org.telegram.messenger.x3.C(24.0f, iVar.a.getMeasuredHeight(), i40);
                        TextView textView14 = iVar.e;
                        textView14.layout(0, C2, textView14.getMeasuredWidth(), iVar.e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (iVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C2);
                        TextView textView15 = iVar.f;
                        textView15.layout(0, textSize2, textView15.getMeasuredWidth(), iVar.f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i14 - iVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i15 - iVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        cg.s0 s0Var7 = iVar.c;
                        s0Var7.layout(measuredWidth8, measuredHeight5, s0Var7.getMeasuredWidth() + measuredWidth8, iVar.c.getMeasuredHeight() + measuredHeight5);
                        break;
                    } else {
                        int measuredHeight6 = (i15 - iVar.a.getMeasuredHeight()) / 2;
                        float f23 = i14;
                        int measuredWidth9 = ((int) ((0.5f * f23) - iVar.a.getMeasuredWidth())) / 2;
                        org.telegram.ui.Components.aj0 aj0Var9 = iVar.a;
                        aj0Var9.layout(measuredWidth9, measuredHeight6, aj0Var9.getMeasuredWidth() + measuredWidth9, iVar.a.getMeasuredHeight() + measuredHeight6);
                        float f24 = 0.4f * f23;
                        int i41 = (int) f24;
                        float f25 = i15;
                        int i42 = (int) (0.14f * f25);
                        TextView textView16 = iVar.e;
                        textView16.layout(i41, i42, textView16.getMeasuredWidth() + i41, iVar.e.getMeasuredHeight() + i42);
                        int i43 = (int) (0.31f * f25);
                        TextView textView17 = iVar.f;
                        textView17.layout(i41, i43, textView17.getMeasuredWidth() + i41, iVar.f.getMeasuredHeight() + i43);
                        int A6 = (int) com.google.android.recaptcha.internal.a.A(f23 * 0.6f, iVar.c.getMeasuredWidth(), 2.0f, f24);
                        int i44 = (int) (f25 * 0.78f);
                        cg.s0 s0Var8 = iVar.c;
                        s0Var8.layout(A6, i44, s0Var8.getMeasuredWidth() + A6, iVar.c.getMeasuredHeight() + i44);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.bg0 bg0Var = (org.telegram.ui.Components.bg0) this.b;
                bg0Var.e.layout(0, 0, bg0Var.D, bg0Var.E);
                break;
            case 2:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                if (h1Var.e.getParent() == this) {
                    h1Var.e.layout(0, 0, h1Var.I, h1Var.J);
                    break;
                }
                break;
            case 3:
                cg1 cg1Var = (cg1) this.b;
                lVar4 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar5 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar4.layout(0, 0, i12, lVar5.getMeasuredHeight());
                int i45 = i12 - i10;
                int i46 = i13 - i11;
                if (i12 <= i13) {
                    int i47 = (int) (i46 * 0.3f);
                    int measuredWidth10 = (i45 - cg1Var.a.getMeasuredWidth()) / 2;
                    org.telegram.ui.Components.aj0 aj0Var10 = cg1Var.a;
                    aj0Var10.layout(measuredWidth10, i47, aj0Var10.getMeasuredWidth() + measuredWidth10, cg1Var.a.getMeasuredHeight() + i47);
                    int C3 = org.telegram.messenger.x3.C(16.0f, cg1Var.a.getMeasuredHeight(), i47);
                    TextView textView18 = cg1Var.c;
                    textView18.layout(0, C3, textView18.getMeasuredWidth(), cg1Var.c.getMeasuredHeight() + C3);
                    int C4 = org.telegram.messenger.x3.C(12.0f, cg1Var.c.getMeasuredHeight(), C3);
                    gh.s sVar = cg1Var.d;
                    sVar.layout(0, C4, sVar.getMeasuredWidth(), cg1Var.d.getMeasuredHeight() + C4);
                    int measuredWidth11 = (i45 - cg1Var.b.getMeasuredWidth()) / 2;
                    int measuredHeight7 = (i46 - cg1Var.b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                    TextView textView19 = cg1Var.b;
                    textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, cg1Var.b.getMeasuredHeight() + measuredHeight7);
                    break;
                } else {
                    int measuredHeight8 = (i46 - cg1Var.a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.aj0 aj0Var11 = cg1Var.a;
                    aj0Var11.layout(0, measuredHeight8, aj0Var11.getMeasuredWidth(), cg1Var.a.getMeasuredHeight() + measuredHeight8);
                    float f26 = i45;
                    float f27 = 0.4f * f26;
                    int i48 = (int) f27;
                    float f28 = i46;
                    int i49 = (int) (0.22f * f28);
                    TextView textView20 = cg1Var.c;
                    textView20.layout(i48, i49, textView20.getMeasuredWidth() + i48, cg1Var.c.getMeasuredHeight() + i49);
                    int i50 = (int) (0.39f * f28);
                    gh.s sVar2 = cg1Var.d;
                    sVar2.layout(i48, i50, sVar2.getMeasuredWidth() + i48, cg1Var.d.getMeasuredHeight() + i50);
                    int A7 = (int) com.google.android.recaptcha.internal.a.A(f26 * 0.6f, cg1Var.b.getMeasuredWidth(), 2.0f, f27);
                    int i51 = (int) (f28 * 0.64f);
                    TextView textView21 = cg1Var.b;
                    textView21.layout(A7, i51, textView21.getMeasuredWidth() + A7, cg1Var.b.getMeasuredHeight() + i51);
                    break;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                org.telegram.ui.ActionBar.w1 w1Var = usersSelectActivity.a;
                w1Var.layout(0, 0, w1Var.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                org.telegram.ui.Components.u10 u10Var = usersSelectActivity.r;
                if (u10Var != null) {
                    int measuredWidth12 = LocaleController.isRTL ? usersSelectActivity.s.leftMargin : ((i12 - i10) - usersSelectActivity.s.rightMargin) - u10Var.getMeasuredWidth();
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    org.telegram.ui.Components.u10 u10Var2 = usersSelectActivity.r;
                    u10Var2.layout(measuredWidth12, measuredHeight9, u10Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                i iVar = (i) this.b;
                int i12 = iVar.v;
                lVar = ((org.telegram.ui.ActionBar.o2) iVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) iVar).actionBar;
                    lVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
                }
                if (i12 != 0) {
                    if (i12 == 3) {
                        iVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30));
                        if (size > size2) {
                            float f9 = size;
                            iVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i13 = (int) (f9 * 0.6f);
                            iVar.e.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.c.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                        } else {
                            iVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.c.measure(b.d(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                        }
                    } else if (i12 != 5) {
                        if (i12 == 6) {
                            if (i12 == 6) {
                                iVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30));
                            } else {
                                iVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                            }
                            if (size > size2) {
                                int i14 = (int) (size * 0.6f);
                                iVar.e.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                iVar.f.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                iVar.c.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                            } else {
                                iVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                iVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                if (i12 == 6) {
                                    iVar.c.measure(b.d(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                                } else {
                                    iVar.c.measure(b.d(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                                }
                            }
                        }
                    } else if (size > size2) {
                        float f10 = size;
                        iVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i15 = (int) (f10 * 0.6f);
                        iVar.e.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        iVar.h.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        iVar.c.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        iVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                        iVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        iVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        iVar.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    }
                } else if (size > size2) {
                    float f11 = size;
                    iVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                    int i16 = (int) (f11 * 0.6f);
                    iVar.e.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.f.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.c.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    iVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                    iVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.c.measure(b.d(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size, size2);
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.bg0 bg0Var = (org.telegram.ui.Components.bg0) this.b;
                bg0Var.e.measure(View.MeasureSpec.makeMeasureSpec(bg0Var.D, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(bg0Var.E, TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                if (h1Var.e.getParent() == this) {
                    h1Var.e.measure(View.MeasureSpec.makeMeasureSpec(h1Var.I, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(h1Var.J, TLObject.FLAG_30));
                    break;
                }
                break;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                cg1 cg1Var = (cg1) this.b;
                lVar3 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                if (size3 > size4) {
                    float f12 = size3;
                    cg1Var.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i17 = (int) (f12 * 0.6f);
                    cg1Var.c.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.b.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
                } else {
                    float f13 = cg1Var.K == 7 ? 160 : 140;
                    cg1Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), TLObject.FLAG_30));
                    cg1Var.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.b.measure(b.d(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size3, size4);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                usersSelectActivity.a.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((AndroidUtilities.isTablet() || size6 > size5) ? AndroidUtilities.dp(144.0f) : AndroidUtilities.dp(56.0f), TLObject.FLAG_31));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.f.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                org.telegram.ui.Components.u10 u10Var = usersSelectActivity.r;
                if (u10Var != null) {
                    int i18 = usersSelectActivity.s.width;
                    u10Var.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                    break;
                }
                break;
        }
    }
}
