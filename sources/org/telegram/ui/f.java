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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f extends ViewGroup {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                if (!((org.telegram.ui.Components.sf0) this.b).i0) {
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
                    b5Var = ((org.telegram.ui.ActionBar.n2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) b5Var).q(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
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
                kVar = ((org.telegram.ui.ActionBar.n2) hVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) hVar).actionBar;
                    kVar3 = ((org.telegram.ui.ActionBar.n2) hVar).actionBar;
                    kVar2.layout(0, 0, i12, kVar3.getMeasuredHeight());
                }
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                int i16 = hVar.v;
                if (i16 == 0) {
                    if (i12 <= i13) {
                        float f12 = i15;
                        int i17 = (int) (0.188f * f12);
                        org.telegram.ui.Components.ri0 ri0Var = hVar.a;
                        ri0Var.layout(0, i17, ri0Var.getMeasuredWidth(), hVar.a.getMeasuredHeight() + i17);
                        int i18 = (int) (0.651f * f12);
                        TextView textView = hVar.e;
                        textView.layout(0, i18, textView.getMeasuredWidth(), hVar.e.getMeasuredHeight() + i18);
                        int i19 = (int) (0.731f * f12);
                        TextView textView2 = hVar.f;
                        textView2.layout(0, i19, textView2.getMeasuredWidth(), hVar.f.getMeasuredHeight() + i19);
                        int measuredWidth = (i14 - hVar.c.getMeasuredWidth()) / 2;
                        int i20 = (int) (f12 * 0.853f);
                        ag.e1 e1Var = hVar.c;
                        e1Var.layout(measuredWidth, i20, e1Var.getMeasuredWidth() + measuredWidth, hVar.c.getMeasuredHeight() + i20);
                        break;
                    } else {
                        int measuredHeight = (i15 - hVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.ri0 ri0Var2 = hVar.a;
                        ri0Var2.layout(0, measuredHeight, ri0Var2.getMeasuredWidth(), hVar.a.getMeasuredHeight() + measuredHeight);
                        float f13 = i14;
                        float f14 = 0.4f * f13;
                        int i21 = (int) f14;
                        float f15 = i15;
                        int i22 = (int) (0.22f * f15);
                        TextView textView3 = hVar.e;
                        textView3.layout(i21, i22, textView3.getMeasuredWidth() + i21, hVar.e.getMeasuredHeight() + i22);
                        int i23 = (int) (0.39f * f15);
                        TextView textView4 = hVar.f;
                        textView4.layout(i21, i23, textView4.getMeasuredWidth() + i21, hVar.f.getMeasuredHeight() + i23);
                        int A = (int) com.google.android.recaptcha.internal.a.A(f13 * 0.6f, hVar.c.getMeasuredWidth(), 2.0f, f14);
                        int i24 = (int) (f15 * 0.69f);
                        ag.e1 e1Var2 = hVar.c;
                        e1Var2.layout(A, i24, e1Var2.getMeasuredWidth() + A, hVar.c.getMeasuredHeight() + i24);
                        break;
                    }
                } else if (i16 == 3) {
                    if (i12 <= i13) {
                        int i25 = (int) (i15 * 0.3f);
                        int measuredWidth2 = (i14 - hVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.ri0 ri0Var3 = hVar.a;
                        ri0Var3.layout(measuredWidth2, i25, ri0Var3.getMeasuredWidth() + measuredWidth2, hVar.a.getMeasuredHeight() + i25);
                        int C = org.telegram.messenger.y1.C(24.0f, hVar.a.getMeasuredHeight(), i25);
                        TextView textView5 = hVar.e;
                        textView5.layout(0, C, textView5.getMeasuredWidth(), hVar.e.getMeasuredHeight() + C);
                        int textSize = (int) (hVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C);
                        TextView textView6 = hVar.f;
                        textView6.layout(0, textSize, textView6.getMeasuredWidth(), hVar.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i14 - hVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i15 - hVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        ag.e1 e1Var3 = hVar.c;
                        e1Var3.layout(measuredWidth3, measuredHeight2, e1Var3.getMeasuredWidth() + measuredWidth3, hVar.c.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i14 - hVar.d.getMeasuredWidth()) / 2;
                        int u10 = org.telegram.messenger.rl.u(32.0f, hVar.d.getMeasuredHeight(), measuredHeight2);
                        TextView textView7 = hVar.d;
                        textView7.layout(measuredWidth4, u10, textView7.getMeasuredWidth() + measuredWidth4, hVar.d.getMeasuredHeight() + u10);
                        break;
                    } else {
                        float f16 = i15;
                        int measuredHeight3 = ((int) ((0.95f * f16) - hVar.a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - hVar.a.getMeasuredWidth());
                        org.telegram.ui.Components.ri0 ri0Var4 = hVar.a;
                        ri0Var4.layout(width, measuredHeight3, ri0Var4.getMeasuredWidth() + width, hVar.a.getMeasuredHeight() + measuredHeight3);
                        float f17 = i14;
                        float f18 = 0.4f * f17;
                        int i26 = (int) f18;
                        int i27 = (int) (0.12f * f16);
                        TextView textView8 = hVar.e;
                        textView8.layout(i26, i27, textView8.getMeasuredWidth() + i26, hVar.e.getMeasuredHeight() + i27);
                        int i28 = (int) (0.24f * f16);
                        TextView textView9 = hVar.f;
                        textView9.layout(i26, i28, textView9.getMeasuredWidth() + i26, hVar.f.getMeasuredHeight() + i28);
                        float f19 = f17 * 0.6f;
                        int A2 = (int) com.google.android.recaptcha.internal.a.A(f19, hVar.c.getMeasuredWidth(), 2.0f, f18);
                        int i29 = (int) (f16 * 0.8f);
                        ag.e1 e1Var4 = hVar.c;
                        e1Var4.layout(A2, i29, e1Var4.getMeasuredWidth() + A2, hVar.c.getMeasuredHeight() + i29);
                        int A3 = (int) com.google.android.recaptcha.internal.a.A(f19, hVar.d.getMeasuredWidth(), 2.0f, f18);
                        int u11 = org.telegram.messenger.rl.u(16.0f, hVar.d.getMeasuredHeight(), i29);
                        TextView textView10 = hVar.d;
                        textView10.layout(A3, u11, textView10.getMeasuredWidth() + A3, hVar.d.getMeasuredHeight() + u11);
                        break;
                    }
                } else if (i16 == 5) {
                    if (i12 <= i13) {
                        if (AndroidUtilities.displaySize.y < 1800) {
                            f10 = i15;
                            int i30 = (int) (0.06f * f10);
                            org.telegram.ui.Components.ri0 ri0Var5 = hVar.a;
                            ri0Var5.layout(0, i30, ri0Var5.getMeasuredWidth(), hVar.a.getMeasuredHeight() + i30);
                            int i31 = (int) (0.463f * f10);
                            TextView textView11 = hVar.e;
                            textView11.layout(0, i31, textView11.getMeasuredWidth(), hVar.e.getMeasuredHeight() + i31);
                            f11 = 0.543f;
                        } else {
                            f10 = i15;
                            int i32 = (int) (0.148f * f10);
                            org.telegram.ui.Components.ri0 ri0Var6 = hVar.a;
                            ri0Var6.layout(0, i32, ri0Var6.getMeasuredWidth(), hVar.a.getMeasuredHeight() + i32);
                            int i33 = (int) (0.551f * f10);
                            TextView textView12 = hVar.e;
                            textView12.layout(0, i33, textView12.getMeasuredWidth(), hVar.e.getMeasuredHeight() + i33);
                            f11 = 0.631f;
                        }
                        int i34 = (int) (f10 * f11);
                        int measuredWidth5 = (getMeasuredWidth() - hVar.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout = hVar.h;
                        linearLayout.layout(measuredWidth5, i34, linearLayout.getMeasuredWidth() + measuredWidth5, hVar.h.getMeasuredHeight() + i34);
                        int measuredWidth6 = (i14 - hVar.c.getMeasuredWidth()) / 2;
                        int i35 = (int) (i15 * 0.853f);
                        ag.e1 e1Var5 = hVar.c;
                        e1Var5.layout(measuredWidth6, i35, e1Var5.getMeasuredWidth() + measuredWidth6, hVar.c.getMeasuredHeight() + i35);
                        break;
                    } else {
                        int measuredHeight4 = (i15 - hVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.ri0 ri0Var7 = hVar.a;
                        ri0Var7.layout(0, measuredHeight4, ri0Var7.getMeasuredWidth(), hVar.a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i14;
                        float f21 = 0.4f * f20;
                        int i36 = (int) f21;
                        float f22 = i15;
                        int i37 = (int) (0.08f * f22);
                        TextView textView13 = hVar.e;
                        textView13.layout(i36, i37, textView13.getMeasuredWidth() + i36, hVar.e.getMeasuredHeight() + i37);
                        float f23 = f20 * 0.6f;
                        int A4 = (int) com.google.android.recaptcha.internal.a.A(f23, hVar.h.getMeasuredWidth(), 2.0f, f21);
                        int i38 = (int) (0.25f * f22);
                        LinearLayout linearLayout2 = hVar.h;
                        linearLayout2.layout(A4, i38, linearLayout2.getMeasuredWidth() + A4, hVar.h.getMeasuredHeight() + i38);
                        int A5 = (int) com.google.android.recaptcha.internal.a.A(f23, hVar.c.getMeasuredWidth(), 2.0f, f21);
                        int i39 = (int) (f22 * 0.78f);
                        ag.e1 e1Var6 = hVar.c;
                        e1Var6.layout(A5, i39, e1Var6.getMeasuredWidth() + A5, hVar.c.getMeasuredHeight() + i39);
                        break;
                    }
                } else if (i16 == 6) {
                    if (i12 <= i13) {
                        int i40 = (int) (i15 * 0.3f);
                        int measuredWidth7 = (i14 - hVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.ri0 ri0Var8 = hVar.a;
                        ri0Var8.layout(measuredWidth7, i40, ri0Var8.getMeasuredWidth() + measuredWidth7, hVar.a.getMeasuredHeight() + i40);
                        int C2 = org.telegram.messenger.y1.C(24.0f, hVar.a.getMeasuredHeight(), i40);
                        TextView textView14 = hVar.e;
                        textView14.layout(0, C2, textView14.getMeasuredWidth(), hVar.e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (hVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C2);
                        TextView textView15 = hVar.f;
                        textView15.layout(0, textSize2, textView15.getMeasuredWidth(), hVar.f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i14 - hVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i15 - hVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        ag.e1 e1Var7 = hVar.c;
                        e1Var7.layout(measuredWidth8, measuredHeight5, e1Var7.getMeasuredWidth() + measuredWidth8, hVar.c.getMeasuredHeight() + measuredHeight5);
                        break;
                    } else {
                        int measuredHeight6 = (i15 - hVar.a.getMeasuredHeight()) / 2;
                        float f24 = i14;
                        int measuredWidth9 = ((int) ((0.5f * f24) - hVar.a.getMeasuredWidth())) / 2;
                        org.telegram.ui.Components.ri0 ri0Var9 = hVar.a;
                        ri0Var9.layout(measuredWidth9, measuredHeight6, ri0Var9.getMeasuredWidth() + measuredWidth9, hVar.a.getMeasuredHeight() + measuredHeight6);
                        float f25 = 0.4f * f24;
                        int i41 = (int) f25;
                        float f26 = i15;
                        int i42 = (int) (0.14f * f26);
                        TextView textView16 = hVar.e;
                        textView16.layout(i41, i42, textView16.getMeasuredWidth() + i41, hVar.e.getMeasuredHeight() + i42);
                        int i43 = (int) (0.31f * f26);
                        TextView textView17 = hVar.f;
                        textView17.layout(i41, i43, textView17.getMeasuredWidth() + i41, hVar.f.getMeasuredHeight() + i43);
                        int A6 = (int) com.google.android.recaptcha.internal.a.A(f24 * 0.6f, hVar.c.getMeasuredWidth(), 2.0f, f25);
                        int i44 = (int) (f26 * 0.78f);
                        ag.e1 e1Var8 = hVar.c;
                        e1Var8.layout(A6, i44, e1Var8.getMeasuredWidth() + A6, hVar.c.getMeasuredHeight() + i44);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.sf0 sf0Var = (org.telegram.ui.Components.sf0) this.b;
                sf0Var.e.layout(0, 0, sf0Var.D, sf0Var.E);
                break;
            case 2:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                if (g1Var.e.getParent() == this) {
                    g1Var.e.layout(0, 0, g1Var.I, g1Var.J);
                    break;
                }
                break;
            case 3:
                zf1 zf1Var = (zf1) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar;
                kVar4.layout(0, 0, i12, kVar5.getMeasuredHeight());
                int i45 = i12 - i10;
                int i46 = i13 - i11;
                if (i12 <= i13) {
                    int i47 = (int) (i46 * 0.3f);
                    int measuredWidth10 = (i45 - zf1Var.a.getMeasuredWidth()) / 2;
                    org.telegram.ui.Components.ri0 ri0Var10 = zf1Var.a;
                    ri0Var10.layout(measuredWidth10, i47, ri0Var10.getMeasuredWidth() + measuredWidth10, zf1Var.a.getMeasuredHeight() + i47);
                    int C3 = org.telegram.messenger.y1.C(16.0f, zf1Var.a.getMeasuredHeight(), i47);
                    TextView textView18 = zf1Var.c;
                    textView18.layout(0, C3, textView18.getMeasuredWidth(), zf1Var.c.getMeasuredHeight() + C3);
                    int C4 = org.telegram.messenger.y1.C(12.0f, zf1Var.c.getMeasuredHeight(), C3);
                    eh.s sVar = zf1Var.d;
                    sVar.layout(0, C4, sVar.getMeasuredWidth(), zf1Var.d.getMeasuredHeight() + C4);
                    int measuredWidth11 = (i45 - zf1Var.b.getMeasuredWidth()) / 2;
                    int measuredHeight7 = (i46 - zf1Var.b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                    TextView textView19 = zf1Var.b;
                    textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, zf1Var.b.getMeasuredHeight() + measuredHeight7);
                    break;
                } else {
                    int measuredHeight8 = (i46 - zf1Var.a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.ri0 ri0Var11 = zf1Var.a;
                    ri0Var11.layout(0, measuredHeight8, ri0Var11.getMeasuredWidth(), zf1Var.a.getMeasuredHeight() + measuredHeight8);
                    float f27 = i45;
                    float f28 = 0.4f * f27;
                    int i48 = (int) f28;
                    float f29 = i46;
                    int i49 = (int) (0.22f * f29);
                    TextView textView20 = zf1Var.c;
                    textView20.layout(i48, i49, textView20.getMeasuredWidth() + i48, zf1Var.c.getMeasuredHeight() + i49);
                    int i50 = (int) (0.39f * f29);
                    eh.s sVar2 = zf1Var.d;
                    sVar2.layout(i48, i50, sVar2.getMeasuredWidth() + i48, zf1Var.d.getMeasuredHeight() + i50);
                    int A7 = (int) com.google.android.recaptcha.internal.a.A(f27 * 0.6f, zf1Var.b.getMeasuredWidth(), 2.0f, f28);
                    int i51 = (int) (f29 * 0.64f);
                    TextView textView21 = zf1Var.b;
                    textView21.layout(A7, i51, textView21.getMeasuredWidth() + A7, zf1Var.b.getMeasuredHeight() + i51);
                    break;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                org.telegram.ui.ActionBar.v1 v1Var = usersSelectActivity.a;
                v1Var.layout(0, 0, v1Var.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                org.telegram.ui.Components.m10 m10Var = usersSelectActivity.r;
                if (m10Var != null) {
                    int measuredWidth12 = LocaleController.isRTL ? usersSelectActivity.s.leftMargin : ((i12 - i10) - usersSelectActivity.s.rightMargin) - m10Var.getMeasuredWidth();
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    org.telegram.ui.Components.m10 m10Var2 = usersSelectActivity.r;
                    m10Var2.layout(measuredWidth12, measuredHeight9, m10Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
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
                h hVar = (h) this.b;
                int i12 = hVar.v;
                kVar = ((org.telegram.ui.ActionBar.n2) hVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) hVar).actionBar;
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
                }
                if (i12 != 0) {
                    if (i12 == 3) {
                        hVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30));
                        if (size > size2) {
                            float f10 = size;
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i13 = (int) (f10 * 0.6f);
                            hVar.e.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.c.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                        } else {
                            hVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.c.measure(org.telegram.messenger.rl.d(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                        }
                    } else if (i12 != 5) {
                        if (i12 == 6) {
                            if (i12 == 6) {
                                hVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), TLObject.FLAG_30));
                            } else {
                                hVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                            }
                            if (size > size2) {
                                int i14 = (int) (size * 0.6f);
                                hVar.e.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                hVar.f.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                hVar.c.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                            } else {
                                hVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                hVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                if (i12 == 6) {
                                    hVar.c.measure(org.telegram.messenger.rl.d(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                                } else {
                                    hVar.c.measure(org.telegram.messenger.rl.d(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                                }
                            }
                        }
                    } else if (size > size2) {
                        float f11 = size;
                        hVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i15 = (int) (f11 * 0.6f);
                        hVar.e.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.h.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.c.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        hVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                        hVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    }
                } else if (size > size2) {
                    float f12 = size;
                    hVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                    int i16 = (int) (f12 * 0.6f);
                    hVar.e.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.c.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    hVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                    hVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.c.measure(org.telegram.messenger.rl.d(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size, size2);
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.sf0 sf0Var = (org.telegram.ui.Components.sf0) this.b;
                sf0Var.e.measure(View.MeasureSpec.makeMeasureSpec(sf0Var.D, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sf0Var.E, TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                if (g1Var.e.getParent() == this) {
                    g1Var.e.measure(View.MeasureSpec.makeMeasureSpec(g1Var.I, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g1Var.J, TLObject.FLAG_30));
                    break;
                }
                break;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                zf1 zf1Var = (zf1) this.b;
                kVar3 = ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar;
                kVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                if (size3 > size4) {
                    float f13 = size3;
                    zf1Var.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i17 = (int) (f13 * 0.6f);
                    zf1Var.c.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.b.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
                } else {
                    float f14 = zf1Var.K == 7 ? 160 : 140;
                    zf1Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), TLObject.FLAG_30));
                    zf1Var.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.b.measure(org.telegram.messenger.rl.d(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
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
                org.telegram.ui.Components.m10 m10Var = usersSelectActivity.r;
                if (m10Var != null) {
                    int i18 = usersSelectActivity.s.width;
                    m10Var.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                    break;
                }
                break;
        }
    }
}
