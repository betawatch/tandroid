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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                if (!((org.telegram.ui.Components.lg0) this.b).j0) {
                    canvas.save();
                    canvas.scale(r0.E / r0.e.getWidth(), r0.F / r0.e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                if (!((org.telegram.ui.Components.voip.g1) this.b).X) {
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
        org.telegram.ui.ActionBar.e5 e5Var;
        switch (this.a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    e5Var = ((org.telegram.ui.ActionBar.p2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) e5Var).q(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                kVar = ((org.telegram.ui.ActionBar.p2) iVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) iVar).actionBar;
                    kVar3 = ((org.telegram.ui.ActionBar.p2) iVar).actionBar;
                    kVar2.layout(0, 0, i12, kVar3.getMeasuredHeight());
                }
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                int i16 = iVar.v;
                if (i16 == 0) {
                    if (i12 <= i13) {
                        float f12 = i15;
                        int i17 = (int) (0.188f * f12);
                        org.telegram.ui.Components.jj0 jj0Var = iVar.a;
                        jj0Var.layout(0, i17, jj0Var.getMeasuredWidth(), iVar.a.getMeasuredHeight() + i17);
                        int i18 = (int) (0.651f * f12);
                        TextView textView = iVar.e;
                        textView.layout(0, i18, textView.getMeasuredWidth(), iVar.e.getMeasuredHeight() + i18);
                        int i19 = (int) (0.731f * f12);
                        TextView textView2 = iVar.f;
                        textView2.layout(0, i19, textView2.getMeasuredWidth(), iVar.f.getMeasuredHeight() + i19);
                        int measuredWidth = (i14 - iVar.c.getMeasuredWidth()) / 2;
                        int i20 = (int) (f12 * 0.853f);
                        eg.s0 s0Var = iVar.c;
                        s0Var.layout(measuredWidth, i20, s0Var.getMeasuredWidth() + measuredWidth, iVar.c.getMeasuredHeight() + i20);
                        break;
                    } else {
                        int measuredHeight = (i15 - iVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.jj0 jj0Var2 = iVar.a;
                        jj0Var2.layout(0, measuredHeight, jj0Var2.getMeasuredWidth(), iVar.a.getMeasuredHeight() + measuredHeight);
                        float f13 = i14;
                        float f14 = 0.4f * f13;
                        int i21 = (int) f14;
                        float f15 = i15;
                        int i22 = (int) (0.22f * f15);
                        TextView textView3 = iVar.e;
                        textView3.layout(i21, i22, textView3.getMeasuredWidth() + i21, iVar.e.getMeasuredHeight() + i22);
                        int i23 = (int) (0.39f * f15);
                        TextView textView4 = iVar.f;
                        textView4.layout(i21, i23, textView4.getMeasuredWidth() + i21, iVar.f.getMeasuredHeight() + i23);
                        int x10 = (int) e2.c.x(f13 * 0.6f, iVar.c.getMeasuredWidth(), 2.0f, f14);
                        int i24 = (int) (f15 * 0.69f);
                        eg.s0 s0Var2 = iVar.c;
                        s0Var2.layout(x10, i24, s0Var2.getMeasuredWidth() + x10, iVar.c.getMeasuredHeight() + i24);
                        break;
                    }
                } else if (i16 == 3) {
                    if (i12 <= i13) {
                        int i25 = (int) (i15 * 0.3f);
                        int measuredWidth2 = (i14 - iVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.jj0 jj0Var3 = iVar.a;
                        jj0Var3.layout(measuredWidth2, i25, jj0Var3.getMeasuredWidth() + measuredWidth2, iVar.a.getMeasuredHeight() + i25);
                        int C = org.telegram.messenger.y3.C(24.0f, iVar.a.getMeasuredHeight(), i25);
                        TextView textView5 = iVar.e;
                        textView5.layout(0, C, textView5.getMeasuredWidth(), iVar.e.getMeasuredHeight() + C);
                        int textSize = (int) (iVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C);
                        TextView textView6 = iVar.f;
                        textView6.layout(0, textSize, textView6.getMeasuredWidth(), iVar.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i14 - iVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i15 - iVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        eg.s0 s0Var3 = iVar.c;
                        s0Var3.layout(measuredWidth3, measuredHeight2, s0Var3.getMeasuredWidth() + measuredWidth3, iVar.c.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i14 - iVar.d.getMeasuredWidth()) / 2;
                        int t6 = b.t(32.0f, iVar.d.getMeasuredHeight(), measuredHeight2);
                        TextView textView7 = iVar.d;
                        textView7.layout(measuredWidth4, t6, textView7.getMeasuredWidth() + measuredWidth4, iVar.d.getMeasuredHeight() + t6);
                        break;
                    } else {
                        float f16 = i15;
                        int measuredHeight3 = ((int) ((0.95f * f16) - iVar.a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - iVar.a.getMeasuredWidth());
                        org.telegram.ui.Components.jj0 jj0Var4 = iVar.a;
                        jj0Var4.layout(width, measuredHeight3, jj0Var4.getMeasuredWidth() + width, iVar.a.getMeasuredHeight() + measuredHeight3);
                        float f17 = i14;
                        float f18 = 0.4f * f17;
                        int i26 = (int) f18;
                        int i27 = (int) (0.12f * f16);
                        TextView textView8 = iVar.e;
                        textView8.layout(i26, i27, textView8.getMeasuredWidth() + i26, iVar.e.getMeasuredHeight() + i27);
                        int i28 = (int) (0.24f * f16);
                        TextView textView9 = iVar.f;
                        textView9.layout(i26, i28, textView9.getMeasuredWidth() + i26, iVar.f.getMeasuredHeight() + i28);
                        float f19 = f17 * 0.6f;
                        int x11 = (int) e2.c.x(f19, iVar.c.getMeasuredWidth(), 2.0f, f18);
                        int i29 = (int) (f16 * 0.8f);
                        eg.s0 s0Var4 = iVar.c;
                        s0Var4.layout(x11, i29, s0Var4.getMeasuredWidth() + x11, iVar.c.getMeasuredHeight() + i29);
                        int x12 = (int) e2.c.x(f19, iVar.d.getMeasuredWidth(), 2.0f, f18);
                        int t9 = b.t(16.0f, iVar.d.getMeasuredHeight(), i29);
                        TextView textView10 = iVar.d;
                        textView10.layout(x12, t9, textView10.getMeasuredWidth() + x12, iVar.d.getMeasuredHeight() + t9);
                        break;
                    }
                } else if (i16 == 5) {
                    if (i12 <= i13) {
                        if (AndroidUtilities.displaySize.y < 1800) {
                            f10 = i15;
                            int i30 = (int) (0.06f * f10);
                            org.telegram.ui.Components.jj0 jj0Var5 = iVar.a;
                            jj0Var5.layout(0, i30, jj0Var5.getMeasuredWidth(), iVar.a.getMeasuredHeight() + i30);
                            int i31 = (int) (0.463f * f10);
                            TextView textView11 = iVar.e;
                            textView11.layout(0, i31, textView11.getMeasuredWidth(), iVar.e.getMeasuredHeight() + i31);
                            f11 = 0.543f;
                        } else {
                            f10 = i15;
                            int i32 = (int) (0.148f * f10);
                            org.telegram.ui.Components.jj0 jj0Var6 = iVar.a;
                            jj0Var6.layout(0, i32, jj0Var6.getMeasuredWidth(), iVar.a.getMeasuredHeight() + i32);
                            int i33 = (int) (0.551f * f10);
                            TextView textView12 = iVar.e;
                            textView12.layout(0, i33, textView12.getMeasuredWidth(), iVar.e.getMeasuredHeight() + i33);
                            f11 = 0.631f;
                        }
                        int i34 = (int) (f10 * f11);
                        int measuredWidth5 = (getMeasuredWidth() - iVar.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout = iVar.h;
                        linearLayout.layout(measuredWidth5, i34, linearLayout.getMeasuredWidth() + measuredWidth5, iVar.h.getMeasuredHeight() + i34);
                        int measuredWidth6 = (i14 - iVar.c.getMeasuredWidth()) / 2;
                        int i35 = (int) (i15 * 0.853f);
                        eg.s0 s0Var5 = iVar.c;
                        s0Var5.layout(measuredWidth6, i35, s0Var5.getMeasuredWidth() + measuredWidth6, iVar.c.getMeasuredHeight() + i35);
                        break;
                    } else {
                        int measuredHeight4 = (i15 - iVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.jj0 jj0Var7 = iVar.a;
                        jj0Var7.layout(0, measuredHeight4, jj0Var7.getMeasuredWidth(), iVar.a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i14;
                        float f21 = 0.4f * f20;
                        int i36 = (int) f21;
                        float f22 = i15;
                        int i37 = (int) (0.08f * f22);
                        TextView textView13 = iVar.e;
                        textView13.layout(i36, i37, textView13.getMeasuredWidth() + i36, iVar.e.getMeasuredHeight() + i37);
                        float f23 = f20 * 0.6f;
                        int x13 = (int) e2.c.x(f23, iVar.h.getMeasuredWidth(), 2.0f, f21);
                        int i38 = (int) (0.25f * f22);
                        LinearLayout linearLayout2 = iVar.h;
                        linearLayout2.layout(x13, i38, linearLayout2.getMeasuredWidth() + x13, iVar.h.getMeasuredHeight() + i38);
                        int x14 = (int) e2.c.x(f23, iVar.c.getMeasuredWidth(), 2.0f, f21);
                        int i39 = (int) (f22 * 0.78f);
                        eg.s0 s0Var6 = iVar.c;
                        s0Var6.layout(x14, i39, s0Var6.getMeasuredWidth() + x14, iVar.c.getMeasuredHeight() + i39);
                        break;
                    }
                } else if (i16 == 6) {
                    if (i12 <= i13) {
                        int i40 = (int) (i15 * 0.3f);
                        int measuredWidth7 = (i14 - iVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.jj0 jj0Var8 = iVar.a;
                        jj0Var8.layout(measuredWidth7, i40, jj0Var8.getMeasuredWidth() + measuredWidth7, iVar.a.getMeasuredHeight() + i40);
                        int C2 = org.telegram.messenger.y3.C(24.0f, iVar.a.getMeasuredHeight(), i40);
                        TextView textView14 = iVar.e;
                        textView14.layout(0, C2, textView14.getMeasuredWidth(), iVar.e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (iVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C2);
                        TextView textView15 = iVar.f;
                        textView15.layout(0, textSize2, textView15.getMeasuredWidth(), iVar.f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i14 - iVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i15 - iVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        eg.s0 s0Var7 = iVar.c;
                        s0Var7.layout(measuredWidth8, measuredHeight5, s0Var7.getMeasuredWidth() + measuredWidth8, iVar.c.getMeasuredHeight() + measuredHeight5);
                        break;
                    } else {
                        int measuredHeight6 = (i15 - iVar.a.getMeasuredHeight()) / 2;
                        float f24 = i14;
                        int measuredWidth9 = ((int) ((0.5f * f24) - iVar.a.getMeasuredWidth())) / 2;
                        org.telegram.ui.Components.jj0 jj0Var9 = iVar.a;
                        jj0Var9.layout(measuredWidth9, measuredHeight6, jj0Var9.getMeasuredWidth() + measuredWidth9, iVar.a.getMeasuredHeight() + measuredHeight6);
                        float f25 = 0.4f * f24;
                        int i41 = (int) f25;
                        float f26 = i15;
                        int i42 = (int) (0.14f * f26);
                        TextView textView16 = iVar.e;
                        textView16.layout(i41, i42, textView16.getMeasuredWidth() + i41, iVar.e.getMeasuredHeight() + i42);
                        int i43 = (int) (0.31f * f26);
                        TextView textView17 = iVar.f;
                        textView17.layout(i41, i43, textView17.getMeasuredWidth() + i41, iVar.f.getMeasuredHeight() + i43);
                        int x15 = (int) e2.c.x(f24 * 0.6f, iVar.c.getMeasuredWidth(), 2.0f, f25);
                        int i44 = (int) (f26 * 0.78f);
                        eg.s0 s0Var8 = iVar.c;
                        s0Var8.layout(x15, i44, s0Var8.getMeasuredWidth() + x15, iVar.c.getMeasuredHeight() + i44);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.lg0 lg0Var = (org.telegram.ui.Components.lg0) this.b;
                lg0Var.e.layout(0, 0, lg0Var.E, lg0Var.F);
                break;
            case 2:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                if (g1Var.e.getParent() == this) {
                    g1Var.e.layout(0, 0, g1Var.J, g1Var.K);
                    break;
                }
                break;
            case 3:
                og1 og1Var = (og1) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.p2) og1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.p2) og1Var).actionBar;
                kVar4.layout(0, 0, i12, kVar5.getMeasuredHeight());
                int i45 = i12 - i10;
                int i46 = i13 - i11;
                if (i12 <= i13) {
                    int i47 = (int) (i46 * 0.3f);
                    int measuredWidth10 = (i45 - og1Var.a.getMeasuredWidth()) / 2;
                    org.telegram.ui.Components.jj0 jj0Var10 = og1Var.a;
                    jj0Var10.layout(measuredWidth10, i47, jj0Var10.getMeasuredWidth() + measuredWidth10, og1Var.a.getMeasuredHeight() + i47);
                    int C3 = org.telegram.messenger.y3.C(16.0f, og1Var.a.getMeasuredHeight(), i47);
                    TextView textView18 = og1Var.c;
                    textView18.layout(0, C3, textView18.getMeasuredWidth(), og1Var.c.getMeasuredHeight() + C3);
                    int C4 = org.telegram.messenger.y3.C(12.0f, og1Var.c.getMeasuredHeight(), C3);
                    ih.s sVar = og1Var.d;
                    sVar.layout(0, C4, sVar.getMeasuredWidth(), og1Var.d.getMeasuredHeight() + C4);
                    int measuredWidth11 = (i45 - og1Var.b.getMeasuredWidth()) / 2;
                    int measuredHeight7 = (i46 - og1Var.b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                    TextView textView19 = og1Var.b;
                    textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, og1Var.b.getMeasuredHeight() + measuredHeight7);
                    break;
                } else {
                    int measuredHeight8 = (i46 - og1Var.a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.jj0 jj0Var11 = og1Var.a;
                    jj0Var11.layout(0, measuredHeight8, jj0Var11.getMeasuredWidth(), og1Var.a.getMeasuredHeight() + measuredHeight8);
                    float f27 = i45;
                    float f28 = 0.4f * f27;
                    int i48 = (int) f28;
                    float f29 = i46;
                    int i49 = (int) (0.22f * f29);
                    TextView textView20 = og1Var.c;
                    textView20.layout(i48, i49, textView20.getMeasuredWidth() + i48, og1Var.c.getMeasuredHeight() + i49);
                    int i50 = (int) (0.39f * f29);
                    ih.s sVar2 = og1Var.d;
                    sVar2.layout(i48, i50, sVar2.getMeasuredWidth() + i48, og1Var.d.getMeasuredHeight() + i50);
                    int x16 = (int) e2.c.x(f27 * 0.6f, og1Var.b.getMeasuredWidth(), 2.0f, f28);
                    int i51 = (int) (f29 * 0.64f);
                    TextView textView21 = og1Var.b;
                    textView21.layout(x16, i51, textView21.getMeasuredWidth() + x16, og1Var.b.getMeasuredHeight() + i51);
                    break;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                org.telegram.ui.ActionBar.x1 x1Var = usersSelectActivity.a;
                x1Var.layout(0, 0, x1Var.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                org.telegram.ui.Components.z10 z10Var = usersSelectActivity.r;
                if (z10Var != null) {
                    int measuredWidth12 = LocaleController.isRTL ? usersSelectActivity.s.leftMargin : ((i12 - i10) - usersSelectActivity.s.rightMargin) - z10Var.getMeasuredWidth();
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    org.telegram.ui.Components.z10 z10Var2 = usersSelectActivity.r;
                    z10Var2.layout(measuredWidth12, measuredHeight9, z10Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
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
                i iVar = (i) this.b;
                int i12 = iVar.v;
                kVar = ((org.telegram.ui.ActionBar.p2) iVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) iVar).actionBar;
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
                }
                if (i12 != 0) {
                    if (i12 == 3) {
                        iVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30));
                        if (size > size2) {
                            float f10 = size;
                            iVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i13 = (int) (f10 * 0.6f);
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
                        float f11 = size;
                        iVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i15 = (int) (f11 * 0.6f);
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
                    float f12 = size;
                    iVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                    int i16 = (int) (f12 * 0.6f);
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
                org.telegram.ui.Components.lg0 lg0Var = (org.telegram.ui.Components.lg0) this.b;
                lg0Var.e.measure(View.MeasureSpec.makeMeasureSpec(lg0Var.E, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(lg0Var.F, TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.b;
                if (g1Var.e.getParent() == this) {
                    g1Var.e.measure(View.MeasureSpec.makeMeasureSpec(g1Var.J, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g1Var.K, TLObject.FLAG_30));
                    break;
                }
                break;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                og1 og1Var = (og1) this.b;
                kVar3 = ((org.telegram.ui.ActionBar.p2) og1Var).actionBar;
                kVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                if (size3 > size4) {
                    float f13 = size3;
                    og1Var.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i17 = (int) (f13 * 0.6f);
                    og1Var.c.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    og1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    og1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    og1Var.b.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
                } else {
                    float f14 = og1Var.L == 7 ? 160 : 140;
                    og1Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), TLObject.FLAG_30));
                    og1Var.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    og1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    og1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    og1Var.b.measure(b.d(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
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
                org.telegram.ui.Components.z10 z10Var = usersSelectActivity.r;
                if (z10Var != null) {
                    int i18 = usersSelectActivity.s.width;
                    z10Var.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                    break;
                }
                break;
        }
    }
}
