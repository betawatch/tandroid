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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class e extends ViewGroup {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                if (!((org.telegram.ui.Components.dh0) this.b).m0) {
                    canvas.save();
                    canvas.scale(r0.H / r0.e.getWidth(), r0.I / r0.e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                if (!((org.telegram.ui.Components.voip.h1) this.b).a0) {
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
        org.telegram.ui.ActionBar.h5 h5Var;
        switch (this.a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    h5Var = ((org.telegram.ui.ActionBar.o2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) h5Var).q(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                kVar = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                    kVar3 = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                    kVar2.layout(0, 0, i12, kVar3.getMeasuredHeight());
                }
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                int i16 = gVar.v;
                if (i16 == 0) {
                    if (i12 <= i13) {
                        float f11 = i15;
                        int i17 = (int) (0.188f * f11);
                        org.telegram.ui.Components.bk0 bk0Var = gVar.a;
                        bk0Var.layout(0, i17, bk0Var.getMeasuredWidth(), gVar.a.getMeasuredHeight() + i17);
                        int i18 = (int) (0.651f * f11);
                        TextView textView = gVar.e;
                        textView.layout(0, i18, textView.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i18);
                        int i19 = (int) (0.731f * f11);
                        TextView textView2 = gVar.f;
                        textView2.layout(0, i19, textView2.getMeasuredWidth(), gVar.f.getMeasuredHeight() + i19);
                        int measuredWidth = (i14 - gVar.c.getMeasuredWidth()) / 2;
                        int i20 = (int) (f11 * 0.853f);
                        di.n nVar = gVar.c;
                        nVar.layout(measuredWidth, i20, nVar.getMeasuredWidth() + measuredWidth, gVar.c.getMeasuredHeight() + i20);
                        break;
                    } else {
                        int measuredHeight = (i15 - gVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.bk0 bk0Var2 = gVar.a;
                        bk0Var2.layout(0, measuredHeight, bk0Var2.getMeasuredWidth(), gVar.a.getMeasuredHeight() + measuredHeight);
                        float f12 = i14;
                        float f13 = 0.4f * f12;
                        int i21 = (int) f13;
                        float f14 = i15;
                        int i22 = (int) (0.22f * f14);
                        TextView textView3 = gVar.e;
                        textView3.layout(i21, i22, textView3.getMeasuredWidth() + i21, gVar.e.getMeasuredHeight() + i22);
                        int i23 = (int) (0.39f * f14);
                        TextView textView4 = gVar.f;
                        textView4.layout(i21, i23, textView4.getMeasuredWidth() + i21, gVar.f.getMeasuredHeight() + i23);
                        int z11 = (int) com.google.android.gms.internal.play_billing.k3.z(f12 * 0.6f, gVar.c.getMeasuredWidth(), 2.0f, f13);
                        int i24 = (int) (f14 * 0.69f);
                        di.n nVar2 = gVar.c;
                        nVar2.layout(z11, i24, nVar2.getMeasuredWidth() + z11, gVar.c.getMeasuredHeight() + i24);
                        break;
                    }
                } else if (i16 == 3) {
                    if (i12 <= i13) {
                        int i25 = (int) (i15 * 0.3f);
                        int measuredWidth2 = (i14 - gVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.bk0 bk0Var3 = gVar.a;
                        bk0Var3.layout(measuredWidth2, i25, bk0Var3.getMeasuredWidth() + measuredWidth2, gVar.a.getMeasuredHeight() + i25);
                        int C = org.telegram.messenger.v0.C(24.0f, gVar.a.getMeasuredHeight(), i25);
                        TextView textView5 = gVar.e;
                        textView5.layout(0, C, textView5.getMeasuredWidth(), gVar.e.getMeasuredHeight() + C);
                        int textSize = (int) (gVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C);
                        TextView textView6 = gVar.f;
                        textView6.layout(0, textSize, textView6.getMeasuredWidth(), gVar.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i14 - gVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i15 - gVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        di.n nVar3 = gVar.c;
                        nVar3.layout(measuredWidth3, measuredHeight2, nVar3.getMeasuredWidth() + measuredWidth3, gVar.c.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i14 - gVar.d.getMeasuredWidth()) / 2;
                        int y3 = org.telegram.messenger.sl.y(32.0f, gVar.d.getMeasuredHeight(), measuredHeight2);
                        TextView textView7 = gVar.d;
                        textView7.layout(measuredWidth4, y3, textView7.getMeasuredWidth() + measuredWidth4, gVar.d.getMeasuredHeight() + y3);
                        break;
                    } else {
                        float f15 = i15;
                        int measuredHeight3 = ((int) ((0.95f * f15) - gVar.a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - gVar.a.getMeasuredWidth());
                        org.telegram.ui.Components.bk0 bk0Var4 = gVar.a;
                        bk0Var4.layout(width, measuredHeight3, bk0Var4.getMeasuredWidth() + width, gVar.a.getMeasuredHeight() + measuredHeight3);
                        float f16 = i14;
                        float f17 = 0.4f * f16;
                        int i26 = (int) f17;
                        int i27 = (int) (0.12f * f15);
                        TextView textView8 = gVar.e;
                        textView8.layout(i26, i27, textView8.getMeasuredWidth() + i26, gVar.e.getMeasuredHeight() + i27);
                        int i28 = (int) (0.24f * f15);
                        TextView textView9 = gVar.f;
                        textView9.layout(i26, i28, textView9.getMeasuredWidth() + i26, gVar.f.getMeasuredHeight() + i28);
                        float f18 = f16 * 0.6f;
                        int z12 = (int) com.google.android.gms.internal.play_billing.k3.z(f18, gVar.c.getMeasuredWidth(), 2.0f, f17);
                        int i29 = (int) (f15 * 0.8f);
                        di.n nVar4 = gVar.c;
                        nVar4.layout(z12, i29, nVar4.getMeasuredWidth() + z12, gVar.c.getMeasuredHeight() + i29);
                        int z13 = (int) com.google.android.gms.internal.play_billing.k3.z(f18, gVar.d.getMeasuredWidth(), 2.0f, f17);
                        int y10 = org.telegram.messenger.sl.y(16.0f, gVar.d.getMeasuredHeight(), i29);
                        TextView textView10 = gVar.d;
                        textView10.layout(z13, y10, textView10.getMeasuredWidth() + z13, gVar.d.getMeasuredHeight() + y10);
                        break;
                    }
                } else if (i16 == 5) {
                    if (i12 <= i13) {
                        if (AndroidUtilities.displaySize.y < 1800) {
                            f7 = i15;
                            int i30 = (int) (0.06f * f7);
                            org.telegram.ui.Components.bk0 bk0Var5 = gVar.a;
                            bk0Var5.layout(0, i30, bk0Var5.getMeasuredWidth(), gVar.a.getMeasuredHeight() + i30);
                            int i31 = (int) (0.463f * f7);
                            TextView textView11 = gVar.e;
                            textView11.layout(0, i31, textView11.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i31);
                            f10 = 0.543f;
                        } else {
                            f7 = i15;
                            int i32 = (int) (0.148f * f7);
                            org.telegram.ui.Components.bk0 bk0Var6 = gVar.a;
                            bk0Var6.layout(0, i32, bk0Var6.getMeasuredWidth(), gVar.a.getMeasuredHeight() + i32);
                            int i33 = (int) (0.551f * f7);
                            TextView textView12 = gVar.e;
                            textView12.layout(0, i33, textView12.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i33);
                            f10 = 0.631f;
                        }
                        int i34 = (int) (f7 * f10);
                        int measuredWidth5 = (getMeasuredWidth() - gVar.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout = gVar.h;
                        linearLayout.layout(measuredWidth5, i34, linearLayout.getMeasuredWidth() + measuredWidth5, gVar.h.getMeasuredHeight() + i34);
                        int measuredWidth6 = (i14 - gVar.c.getMeasuredWidth()) / 2;
                        int i35 = (int) (i15 * 0.853f);
                        di.n nVar5 = gVar.c;
                        nVar5.layout(measuredWidth6, i35, nVar5.getMeasuredWidth() + measuredWidth6, gVar.c.getMeasuredHeight() + i35);
                        break;
                    } else {
                        int measuredHeight4 = (i15 - gVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.bk0 bk0Var7 = gVar.a;
                        bk0Var7.layout(0, measuredHeight4, bk0Var7.getMeasuredWidth(), gVar.a.getMeasuredHeight() + measuredHeight4);
                        float f19 = i14;
                        float f20 = 0.4f * f19;
                        int i36 = (int) f20;
                        float f21 = i15;
                        int i37 = (int) (0.08f * f21);
                        TextView textView13 = gVar.e;
                        textView13.layout(i36, i37, textView13.getMeasuredWidth() + i36, gVar.e.getMeasuredHeight() + i37);
                        float f22 = f19 * 0.6f;
                        int z14 = (int) com.google.android.gms.internal.play_billing.k3.z(f22, gVar.h.getMeasuredWidth(), 2.0f, f20);
                        int i38 = (int) (0.25f * f21);
                        LinearLayout linearLayout2 = gVar.h;
                        linearLayout2.layout(z14, i38, linearLayout2.getMeasuredWidth() + z14, gVar.h.getMeasuredHeight() + i38);
                        int z15 = (int) com.google.android.gms.internal.play_billing.k3.z(f22, gVar.c.getMeasuredWidth(), 2.0f, f20);
                        int i39 = (int) (f21 * 0.78f);
                        di.n nVar6 = gVar.c;
                        nVar6.layout(z15, i39, nVar6.getMeasuredWidth() + z15, gVar.c.getMeasuredHeight() + i39);
                        break;
                    }
                } else if (i16 == 6) {
                    if (i12 <= i13) {
                        int i40 = (int) (i15 * 0.3f);
                        int measuredWidth7 = (i14 - gVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.bk0 bk0Var8 = gVar.a;
                        bk0Var8.layout(measuredWidth7, i40, bk0Var8.getMeasuredWidth() + measuredWidth7, gVar.a.getMeasuredHeight() + i40);
                        int C2 = org.telegram.messenger.v0.C(24.0f, gVar.a.getMeasuredHeight(), i40);
                        TextView textView14 = gVar.e;
                        textView14.layout(0, C2, textView14.getMeasuredWidth(), gVar.e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (gVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C2);
                        TextView textView15 = gVar.f;
                        textView15.layout(0, textSize2, textView15.getMeasuredWidth(), gVar.f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i14 - gVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i15 - gVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        di.n nVar7 = gVar.c;
                        nVar7.layout(measuredWidth8, measuredHeight5, nVar7.getMeasuredWidth() + measuredWidth8, gVar.c.getMeasuredHeight() + measuredHeight5);
                        break;
                    } else {
                        int measuredHeight6 = (i15 - gVar.a.getMeasuredHeight()) / 2;
                        float f23 = i14;
                        int measuredWidth9 = ((int) ((0.5f * f23) - gVar.a.getMeasuredWidth())) / 2;
                        org.telegram.ui.Components.bk0 bk0Var9 = gVar.a;
                        bk0Var9.layout(measuredWidth9, measuredHeight6, bk0Var9.getMeasuredWidth() + measuredWidth9, gVar.a.getMeasuredHeight() + measuredHeight6);
                        float f24 = 0.4f * f23;
                        int i41 = (int) f24;
                        float f25 = i15;
                        int i42 = (int) (0.14f * f25);
                        TextView textView16 = gVar.e;
                        textView16.layout(i41, i42, textView16.getMeasuredWidth() + i41, gVar.e.getMeasuredHeight() + i42);
                        int i43 = (int) (0.31f * f25);
                        TextView textView17 = gVar.f;
                        textView17.layout(i41, i43, textView17.getMeasuredWidth() + i41, gVar.f.getMeasuredHeight() + i43);
                        int z16 = (int) com.google.android.gms.internal.play_billing.k3.z(f23 * 0.6f, gVar.c.getMeasuredWidth(), 2.0f, f24);
                        int i44 = (int) (f25 * 0.78f);
                        di.n nVar8 = gVar.c;
                        nVar8.layout(z16, i44, nVar8.getMeasuredWidth() + z16, gVar.c.getMeasuredHeight() + i44);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.dh0 dh0Var = (org.telegram.ui.Components.dh0) this.b;
                dh0Var.e.layout(0, 0, dh0Var.H, dh0Var.I);
                break;
            case 2:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                if (h1Var.e.getParent() == this) {
                    h1Var.e.layout(0, 0, h1Var.M, h1Var.N);
                    break;
                }
                break;
            case 3:
                bg1 bg1Var = (bg1) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.o2) bg1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.o2) bg1Var).actionBar;
                kVar4.layout(0, 0, i12, kVar5.getMeasuredHeight());
                int i45 = i12 - i10;
                int i46 = i13 - i11;
                if (i12 <= i13) {
                    int i47 = (int) (i46 * 0.3f);
                    int measuredWidth10 = (i45 - bg1Var.a.getMeasuredWidth()) / 2;
                    org.telegram.ui.Components.bk0 bk0Var10 = bg1Var.a;
                    bk0Var10.layout(measuredWidth10, i47, bk0Var10.getMeasuredWidth() + measuredWidth10, bg1Var.a.getMeasuredHeight() + i47);
                    int C3 = org.telegram.messenger.v0.C(16.0f, bg1Var.a.getMeasuredHeight(), i47);
                    TextView textView18 = bg1Var.c;
                    textView18.layout(0, C3, textView18.getMeasuredWidth(), bg1Var.c.getMeasuredHeight() + C3);
                    int C4 = org.telegram.messenger.v0.C(12.0f, bg1Var.c.getMeasuredHeight(), C3);
                    wh.n nVar9 = bg1Var.d;
                    nVar9.layout(0, C4, nVar9.getMeasuredWidth(), bg1Var.d.getMeasuredHeight() + C4);
                    int measuredWidth11 = (i45 - bg1Var.b.getMeasuredWidth()) / 2;
                    int measuredHeight7 = (i46 - bg1Var.b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                    TextView textView19 = bg1Var.b;
                    textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, bg1Var.b.getMeasuredHeight() + measuredHeight7);
                    break;
                } else {
                    int measuredHeight8 = (i46 - bg1Var.a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.bk0 bk0Var11 = bg1Var.a;
                    bk0Var11.layout(0, measuredHeight8, bk0Var11.getMeasuredWidth(), bg1Var.a.getMeasuredHeight() + measuredHeight8);
                    float f26 = i45;
                    float f27 = 0.4f * f26;
                    int i48 = (int) f27;
                    float f28 = i46;
                    int i49 = (int) (0.22f * f28);
                    TextView textView20 = bg1Var.c;
                    textView20.layout(i48, i49, textView20.getMeasuredWidth() + i48, bg1Var.c.getMeasuredHeight() + i49);
                    int i50 = (int) (0.39f * f28);
                    wh.n nVar10 = bg1Var.d;
                    nVar10.layout(i48, i50, nVar10.getMeasuredWidth() + i48, bg1Var.d.getMeasuredHeight() + i50);
                    int z17 = (int) com.google.android.gms.internal.play_billing.k3.z(f26 * 0.6f, bg1Var.b.getMeasuredWidth(), 2.0f, f27);
                    int i51 = (int) (f28 * 0.64f);
                    TextView textView21 = bg1Var.b;
                    textView21.layout(z17, i51, textView21.getMeasuredWidth() + z17, bg1Var.b.getMeasuredHeight() + i51);
                    break;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = usersSelectActivity.a;
                u1Var.layout(0, 0, u1Var.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                org.telegram.ui.Components.h20 h20Var = usersSelectActivity.r;
                if (h20Var != null) {
                    int measuredWidth12 = LocaleController.isRTL ? usersSelectActivity.s.leftMargin : ((i12 - i10) - usersSelectActivity.s.rightMargin) - h20Var.getMeasuredWidth();
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    org.telegram.ui.Components.h20 h20Var2 = usersSelectActivity.r;
                    h20Var2.layout(measuredWidth12, measuredHeight9, h20Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                g gVar = (g) this.b;
                int i12 = gVar.v;
                kVar = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
                }
                if (i12 != 0) {
                    if (i12 == 3) {
                        gVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30));
                        if (size > size2) {
                            float f7 = size;
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i13 = (int) (f7 * 0.6f);
                            gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.c.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                        } else {
                            gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.c.measure(org.telegram.messenger.sl.c(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                        }
                    } else if (i12 != 5) {
                        if (i12 == 6) {
                            if (i12 == 6) {
                                gVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30));
                            } else {
                                gVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                            }
                            if (size > size2) {
                                int i14 = (int) (size * 0.6f);
                                gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                gVar.f.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                gVar.c.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                            } else {
                                gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                gVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                if (i12 == 6) {
                                    gVar.c.measure(org.telegram.messenger.sl.c(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                                } else {
                                    gVar.c.measure(org.telegram.messenger.sl.c(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                                }
                            }
                        }
                    } else if (size > size2) {
                        float f10 = size;
                        gVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i15 = (int) (f10 * 0.6f);
                        gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        gVar.h.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        gVar.c.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        gVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                        gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        gVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        gVar.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    }
                } else if (size > size2) {
                    float f11 = size;
                    gVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                    int i16 = (int) (f11 * 0.6f);
                    gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.c.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    gVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                    gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.c.measure(org.telegram.messenger.sl.c(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size, size2);
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.dh0 dh0Var = (org.telegram.ui.Components.dh0) this.b;
                dh0Var.e.measure(View.MeasureSpec.makeMeasureSpec(dh0Var.H, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dh0Var.I, TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                if (h1Var.e.getParent() == this) {
                    h1Var.e.measure(View.MeasureSpec.makeMeasureSpec(h1Var.M, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(h1Var.N, TLObject.FLAG_30));
                    break;
                }
                break;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                bg1 bg1Var = (bg1) this.b;
                kVar3 = ((org.telegram.ui.ActionBar.o2) bg1Var).actionBar;
                kVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                if (size3 > size4) {
                    float f12 = size3;
                    bg1Var.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i17 = (int) (f12 * 0.6f);
                    bg1Var.c.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bg1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bg1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bg1Var.b.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
                } else {
                    float f13 = bg1Var.O == 7 ? 160 : 140;
                    bg1Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), TLObject.FLAG_30));
                    bg1Var.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bg1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bg1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bg1Var.b.measure(org.telegram.messenger.sl.c(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
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
                org.telegram.ui.Components.h20 h20Var = usersSelectActivity.r;
                if (h20Var != null) {
                    int i18 = usersSelectActivity.s.width;
                    h20Var.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                    break;
                }
                break;
        }
    }
}
