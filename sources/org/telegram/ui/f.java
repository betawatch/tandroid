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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f extends ViewGroup {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                if (!((org.telegram.ui.Components.pf0) this.b).i0) {
                    canvas.save();
                    canvas.scale(r0.D / r0.e.getWidth(), r0.E / r0.e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                if (!((org.telegram.ui.Components.voip.g1) this.b).W) {
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                kVar = ((org.telegram.ui.ActionBar.o2) hVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) hVar).actionBar;
                    kVar3 = ((org.telegram.ui.ActionBar.o2) hVar).actionBar;
                    kVar2.layout(0, 0, i11, kVar3.getMeasuredHeight());
                }
                int i13 = i11 - i9;
                int i14 = i12 - i10;
                int i15 = hVar.v;
                if (i15 == 0) {
                    if (i11 <= i12) {
                        float f12 = i14;
                        int i16 = (int) (0.188f * f12);
                        org.telegram.ui.Components.pi0 pi0Var = hVar.a;
                        pi0Var.layout(0, i16, pi0Var.getMeasuredWidth(), hVar.a.getMeasuredHeight() + i16);
                        int i17 = (int) (0.651f * f12);
                        TextView textView = hVar.e;
                        textView.layout(0, i17, textView.getMeasuredWidth(), hVar.e.getMeasuredHeight() + i17);
                        int i18 = (int) (0.731f * f12);
                        TextView textView2 = hVar.f;
                        textView2.layout(0, i18, textView2.getMeasuredWidth(), hVar.f.getMeasuredHeight() + i18);
                        int measuredWidth = (i13 - hVar.c.getMeasuredWidth()) / 2;
                        int i19 = (int) (f12 * 0.853f);
                        bh.e eVar = hVar.c;
                        eVar.layout(measuredWidth, i19, eVar.getMeasuredWidth() + measuredWidth, hVar.c.getMeasuredHeight() + i19);
                        break;
                    } else {
                        int measuredHeight = (i14 - hVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.pi0 pi0Var2 = hVar.a;
                        pi0Var2.layout(0, measuredHeight, pi0Var2.getMeasuredWidth(), hVar.a.getMeasuredHeight() + measuredHeight);
                        float f13 = i13;
                        float f14 = 0.4f * f13;
                        int i20 = (int) f14;
                        float f15 = i14;
                        int i21 = (int) (0.22f * f15);
                        TextView textView3 = hVar.e;
                        textView3.layout(i20, i21, textView3.getMeasuredWidth() + i20, hVar.e.getMeasuredHeight() + i21);
                        int i22 = (int) (0.39f * f15);
                        TextView textView4 = hVar.f;
                        textView4.layout(i20, i22, textView4.getMeasuredWidth() + i20, hVar.f.getMeasuredHeight() + i22);
                        int A = (int) e2.c.A(f13 * 0.6f, hVar.c.getMeasuredWidth(), 2.0f, f14);
                        int i23 = (int) (f15 * 0.69f);
                        bh.e eVar2 = hVar.c;
                        eVar2.layout(A, i23, eVar2.getMeasuredWidth() + A, hVar.c.getMeasuredHeight() + i23);
                        break;
                    }
                } else if (i15 == 3) {
                    if (i11 <= i12) {
                        int i24 = (int) (i14 * 0.3f);
                        int measuredWidth2 = (i13 - hVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.pi0 pi0Var3 = hVar.a;
                        pi0Var3.layout(measuredWidth2, i24, pi0Var3.getMeasuredWidth() + measuredWidth2, hVar.a.getMeasuredHeight() + i24);
                        int C = org.telegram.messenger.l0.C(24.0f, hVar.a.getMeasuredHeight(), i24);
                        TextView textView5 = hVar.e;
                        textView5.layout(0, C, textView5.getMeasuredWidth(), hVar.e.getMeasuredHeight() + C);
                        int textSize = (int) (hVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C);
                        TextView textView6 = hVar.f;
                        textView6.layout(0, textSize, textView6.getMeasuredWidth(), hVar.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i13 - hVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i14 - hVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        bh.e eVar3 = hVar.c;
                        eVar3.layout(measuredWidth3, measuredHeight2, eVar3.getMeasuredWidth() + measuredWidth3, hVar.c.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i13 - hVar.d.getMeasuredWidth()) / 2;
                        int w8 = org.telegram.messenger.ll.w(32.0f, hVar.d.getMeasuredHeight(), measuredHeight2);
                        TextView textView7 = hVar.d;
                        textView7.layout(measuredWidth4, w8, textView7.getMeasuredWidth() + measuredWidth4, hVar.d.getMeasuredHeight() + w8);
                        break;
                    } else {
                        float f16 = i14;
                        int measuredHeight3 = ((int) ((0.95f * f16) - hVar.a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - hVar.a.getMeasuredWidth());
                        org.telegram.ui.Components.pi0 pi0Var4 = hVar.a;
                        pi0Var4.layout(width, measuredHeight3, pi0Var4.getMeasuredWidth() + width, hVar.a.getMeasuredHeight() + measuredHeight3);
                        float f17 = i13;
                        float f18 = 0.4f * f17;
                        int i25 = (int) f18;
                        int i26 = (int) (0.12f * f16);
                        TextView textView8 = hVar.e;
                        textView8.layout(i25, i26, textView8.getMeasuredWidth() + i25, hVar.e.getMeasuredHeight() + i26);
                        int i27 = (int) (0.24f * f16);
                        TextView textView9 = hVar.f;
                        textView9.layout(i25, i27, textView9.getMeasuredWidth() + i25, hVar.f.getMeasuredHeight() + i27);
                        float f19 = f17 * 0.6f;
                        int A2 = (int) e2.c.A(f19, hVar.c.getMeasuredWidth(), 2.0f, f18);
                        int i28 = (int) (f16 * 0.8f);
                        bh.e eVar4 = hVar.c;
                        eVar4.layout(A2, i28, eVar4.getMeasuredWidth() + A2, hVar.c.getMeasuredHeight() + i28);
                        int A3 = (int) e2.c.A(f19, hVar.d.getMeasuredWidth(), 2.0f, f18);
                        int w10 = org.telegram.messenger.ll.w(16.0f, hVar.d.getMeasuredHeight(), i28);
                        TextView textView10 = hVar.d;
                        textView10.layout(A3, w10, textView10.getMeasuredWidth() + A3, hVar.d.getMeasuredHeight() + w10);
                        break;
                    }
                } else if (i15 == 5) {
                    if (i11 <= i12) {
                        if (AndroidUtilities.displaySize.y < 1800) {
                            f10 = i14;
                            int i29 = (int) (0.06f * f10);
                            org.telegram.ui.Components.pi0 pi0Var5 = hVar.a;
                            pi0Var5.layout(0, i29, pi0Var5.getMeasuredWidth(), hVar.a.getMeasuredHeight() + i29);
                            int i30 = (int) (0.463f * f10);
                            TextView textView11 = hVar.e;
                            textView11.layout(0, i30, textView11.getMeasuredWidth(), hVar.e.getMeasuredHeight() + i30);
                            f11 = 0.543f;
                        } else {
                            f10 = i14;
                            int i31 = (int) (0.148f * f10);
                            org.telegram.ui.Components.pi0 pi0Var6 = hVar.a;
                            pi0Var6.layout(0, i31, pi0Var6.getMeasuredWidth(), hVar.a.getMeasuredHeight() + i31);
                            int i32 = (int) (0.551f * f10);
                            TextView textView12 = hVar.e;
                            textView12.layout(0, i32, textView12.getMeasuredWidth(), hVar.e.getMeasuredHeight() + i32);
                            f11 = 0.631f;
                        }
                        int i33 = (int) (f10 * f11);
                        int measuredWidth5 = (getMeasuredWidth() - hVar.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout = hVar.h;
                        linearLayout.layout(measuredWidth5, i33, linearLayout.getMeasuredWidth() + measuredWidth5, hVar.h.getMeasuredHeight() + i33);
                        int measuredWidth6 = (i13 - hVar.c.getMeasuredWidth()) / 2;
                        int i34 = (int) (i14 * 0.853f);
                        bh.e eVar5 = hVar.c;
                        eVar5.layout(measuredWidth6, i34, eVar5.getMeasuredWidth() + measuredWidth6, hVar.c.getMeasuredHeight() + i34);
                        break;
                    } else {
                        int measuredHeight4 = (i14 - hVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.pi0 pi0Var7 = hVar.a;
                        pi0Var7.layout(0, measuredHeight4, pi0Var7.getMeasuredWidth(), hVar.a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i13;
                        float f21 = 0.4f * f20;
                        int i35 = (int) f21;
                        float f22 = i14;
                        int i36 = (int) (0.08f * f22);
                        TextView textView13 = hVar.e;
                        textView13.layout(i35, i36, textView13.getMeasuredWidth() + i35, hVar.e.getMeasuredHeight() + i36);
                        float f23 = f20 * 0.6f;
                        int A4 = (int) e2.c.A(f23, hVar.h.getMeasuredWidth(), 2.0f, f21);
                        int i37 = (int) (0.25f * f22);
                        LinearLayout linearLayout2 = hVar.h;
                        linearLayout2.layout(A4, i37, linearLayout2.getMeasuredWidth() + A4, hVar.h.getMeasuredHeight() + i37);
                        int A5 = (int) e2.c.A(f23, hVar.c.getMeasuredWidth(), 2.0f, f21);
                        int i38 = (int) (f22 * 0.78f);
                        bh.e eVar6 = hVar.c;
                        eVar6.layout(A5, i38, eVar6.getMeasuredWidth() + A5, hVar.c.getMeasuredHeight() + i38);
                        break;
                    }
                } else if (i15 == 6) {
                    if (i11 <= i12) {
                        int i39 = (int) (i14 * 0.3f);
                        int measuredWidth7 = (i13 - hVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.pi0 pi0Var8 = hVar.a;
                        pi0Var8.layout(measuredWidth7, i39, pi0Var8.getMeasuredWidth() + measuredWidth7, hVar.a.getMeasuredHeight() + i39);
                        int C2 = org.telegram.messenger.l0.C(24.0f, hVar.a.getMeasuredHeight(), i39);
                        TextView textView14 = hVar.e;
                        textView14.layout(0, C2, textView14.getMeasuredWidth(), hVar.e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (hVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C2);
                        TextView textView15 = hVar.f;
                        textView15.layout(0, textSize2, textView15.getMeasuredWidth(), hVar.f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i13 - hVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i14 - hVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        bh.e eVar7 = hVar.c;
                        eVar7.layout(measuredWidth8, measuredHeight5, eVar7.getMeasuredWidth() + measuredWidth8, hVar.c.getMeasuredHeight() + measuredHeight5);
                        break;
                    } else {
                        int measuredHeight6 = (i14 - hVar.a.getMeasuredHeight()) / 2;
                        float f24 = i13;
                        int measuredWidth9 = ((int) ((0.5f * f24) - hVar.a.getMeasuredWidth())) / 2;
                        org.telegram.ui.Components.pi0 pi0Var9 = hVar.a;
                        pi0Var9.layout(measuredWidth9, measuredHeight6, pi0Var9.getMeasuredWidth() + measuredWidth9, hVar.a.getMeasuredHeight() + measuredHeight6);
                        float f25 = 0.4f * f24;
                        int i40 = (int) f25;
                        float f26 = i14;
                        int i41 = (int) (0.14f * f26);
                        TextView textView16 = hVar.e;
                        textView16.layout(i40, i41, textView16.getMeasuredWidth() + i40, hVar.e.getMeasuredHeight() + i41);
                        int i42 = (int) (0.31f * f26);
                        TextView textView17 = hVar.f;
                        textView17.layout(i40, i42, textView17.getMeasuredWidth() + i40, hVar.f.getMeasuredHeight() + i42);
                        int A6 = (int) e2.c.A(f24 * 0.6f, hVar.c.getMeasuredWidth(), 2.0f, f25);
                        int i43 = (int) (f26 * 0.78f);
                        bh.e eVar8 = hVar.c;
                        eVar8.layout(A6, i43, eVar8.getMeasuredWidth() + A6, hVar.c.getMeasuredHeight() + i43);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.pf0 pf0Var = (org.telegram.ui.Components.pf0) this.b;
                pf0Var.e.layout(0, 0, pf0Var.D, pf0Var.E);
                break;
            case 2:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                if (g1Var.e.getParent() == this) {
                    g1Var.e.layout(0, 0, g1Var.I, g1Var.J);
                    break;
                }
                break;
            case 3:
                ag1 ag1Var = (ag1) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                kVar4.layout(0, 0, i11, kVar5.getMeasuredHeight());
                int i44 = i11 - i9;
                int i45 = i12 - i10;
                if (i11 <= i12) {
                    int i46 = (int) (i45 * 0.3f);
                    int measuredWidth10 = (i44 - ag1Var.a.getMeasuredWidth()) / 2;
                    org.telegram.ui.Components.pi0 pi0Var10 = ag1Var.a;
                    pi0Var10.layout(measuredWidth10, i46, pi0Var10.getMeasuredWidth() + measuredWidth10, ag1Var.a.getMeasuredHeight() + i46);
                    int C3 = org.telegram.messenger.l0.C(16.0f, ag1Var.a.getMeasuredHeight(), i46);
                    TextView textView18 = ag1Var.c;
                    textView18.layout(0, C3, textView18.getMeasuredWidth(), ag1Var.c.getMeasuredHeight() + C3);
                    int C4 = org.telegram.messenger.l0.C(12.0f, ag1Var.c.getMeasuredHeight(), C3);
                    dh.u uVar = ag1Var.d;
                    uVar.layout(0, C4, uVar.getMeasuredWidth(), ag1Var.d.getMeasuredHeight() + C4);
                    int measuredWidth11 = (i44 - ag1Var.b.getMeasuredWidth()) / 2;
                    int measuredHeight7 = (i45 - ag1Var.b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                    TextView textView19 = ag1Var.b;
                    textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, ag1Var.b.getMeasuredHeight() + measuredHeight7);
                    break;
                } else {
                    int measuredHeight8 = (i45 - ag1Var.a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.pi0 pi0Var11 = ag1Var.a;
                    pi0Var11.layout(0, measuredHeight8, pi0Var11.getMeasuredWidth(), ag1Var.a.getMeasuredHeight() + measuredHeight8);
                    float f27 = i44;
                    float f28 = 0.4f * f27;
                    int i47 = (int) f28;
                    float f29 = i45;
                    int i48 = (int) (0.22f * f29);
                    TextView textView20 = ag1Var.c;
                    textView20.layout(i47, i48, textView20.getMeasuredWidth() + i47, ag1Var.c.getMeasuredHeight() + i48);
                    int i49 = (int) (0.39f * f29);
                    dh.u uVar2 = ag1Var.d;
                    uVar2.layout(i47, i49, uVar2.getMeasuredWidth() + i47, ag1Var.d.getMeasuredHeight() + i49);
                    int A7 = (int) e2.c.A(f27 * 0.6f, ag1Var.b.getMeasuredWidth(), 2.0f, f28);
                    int i50 = (int) (f29 * 0.64f);
                    TextView textView21 = ag1Var.b;
                    textView21.layout(A7, i50, textView21.getMeasuredWidth() + A7, ag1Var.b.getMeasuredHeight() + i50);
                    break;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                org.telegram.ui.ActionBar.w1 w1Var = usersSelectActivity.a;
                w1Var.layout(0, 0, w1Var.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                org.telegram.ui.Components.j10 j10Var = usersSelectActivity.r;
                if (j10Var != null) {
                    int measuredWidth12 = LocaleController.isRTL ? usersSelectActivity.s.leftMargin : ((i11 - i9) - usersSelectActivity.s.rightMargin) - j10Var.getMeasuredWidth();
                    int measuredHeight9 = ((i12 - i10) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    org.telegram.ui.Components.j10 j10Var2 = usersSelectActivity.r;
                    j10Var2.layout(measuredWidth12, measuredHeight9, j10Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                h hVar = (h) this.b;
                int i11 = hVar.v;
                kVar = ((org.telegram.ui.ActionBar.o2) hVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) hVar).actionBar;
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
                }
                if (i11 != 0) {
                    if (i11 == 3) {
                        hVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30));
                        if (size > size2) {
                            float f10 = size;
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i12 = (int) (f10 * 0.6f);
                            hVar.e.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.c.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                        } else {
                            hVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.c.measure(org.telegram.messenger.ll.d(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                        }
                    } else if (i11 != 5) {
                        if (i11 == 6) {
                            if (i11 == 6) {
                                hVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30));
                            } else {
                                hVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                            }
                            if (size > size2) {
                                int i13 = (int) (size * 0.6f);
                                hVar.e.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                hVar.f.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                hVar.c.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                            } else {
                                hVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                hVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                if (i11 == 6) {
                                    hVar.c.measure(org.telegram.messenger.ll.d(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                                } else {
                                    hVar.c.measure(org.telegram.messenger.ll.d(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                                }
                            }
                        }
                    } else if (size > size2) {
                        float f11 = size;
                        hVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i14 = (int) (f11 * 0.6f);
                        hVar.e.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.h.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.c.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        hVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                        hVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    }
                } else if (size > size2) {
                    float f12 = size;
                    hVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                    int i15 = (int) (f12 * 0.6f);
                    hVar.e.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.c.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    hVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                    hVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.c.measure(org.telegram.messenger.ll.d(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size, size2);
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
                org.telegram.ui.Components.pf0 pf0Var = (org.telegram.ui.Components.pf0) this.b;
                pf0Var.e.measure(View.MeasureSpec.makeMeasureSpec(pf0Var.D, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(pf0Var.E, TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                if (g1Var.e.getParent() == this) {
                    g1Var.e.measure(View.MeasureSpec.makeMeasureSpec(g1Var.I, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g1Var.J, TLObject.FLAG_30));
                    break;
                }
                break;
            case 3:
                int size3 = View.MeasureSpec.getSize(i9);
                int size4 = View.MeasureSpec.getSize(i10);
                ag1 ag1Var = (ag1) this.b;
                kVar3 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                kVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i10);
                if (size3 > size4) {
                    float f13 = size3;
                    ag1Var.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i16 = (int) (f13 * 0.6f);
                    ag1Var.c.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.b.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
                } else {
                    float f14 = ag1Var.K == 7 ? 160 : 140;
                    ag1Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), TLObject.FLAG_30));
                    ag1Var.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.b.measure(org.telegram.messenger.ll.d(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size3, size4);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                int size5 = View.MeasureSpec.getSize(i9);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                usersSelectActivity.a.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((AndroidUtilities.isTablet() || size6 > size5) ? AndroidUtilities.dp(144.0f) : AndroidUtilities.dp(56.0f), TLObject.FLAG_31));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.f.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                org.telegram.ui.Components.j10 j10Var = usersSelectActivity.r;
                if (j10Var != null) {
                    int i17 = usersSelectActivity.s.width;
                    j10Var.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                    break;
                }
                break;
        }
    }
}
