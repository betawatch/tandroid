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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                if (!((org.telegram.ui.Components.og0) this.b).m0) {
                    canvas.save();
                    canvas.scale(r0.H / r0.e.getWidth(), r0.I / r0.e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                if (!((org.telegram.ui.Components.voip.i1) this.b).a0) {
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.f5 f5Var;
        switch (this.a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j3);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    f5Var = ((org.telegram.ui.ActionBar.p2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) f5Var).q(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                lVar = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
                    lVar3 = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
                    lVar2.layout(0, 0, i12, lVar3.getMeasuredHeight());
                }
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                int i16 = hVar.v;
                if (i16 == 0) {
                    if (i12 <= i13) {
                        float f11 = i15;
                        int i17 = (int) (0.188f * f11);
                        org.telegram.ui.Components.kj0 kj0Var = hVar.a;
                        kj0Var.layout(0, i17, kj0Var.getMeasuredWidth(), hVar.a.getMeasuredHeight() + i17);
                        int i18 = (int) (0.651f * f11);
                        TextView textView = hVar.e;
                        textView.layout(0, i18, textView.getMeasuredWidth(), hVar.e.getMeasuredHeight() + i18);
                        int i19 = (int) (0.731f * f11);
                        TextView textView2 = hVar.f;
                        textView2.layout(0, i19, textView2.getMeasuredWidth(), hVar.f.getMeasuredHeight() + i19);
                        int measuredWidth = (i14 - hVar.c.getMeasuredWidth()) / 2;
                        int i20 = (int) (f11 * 0.853f);
                        ai.t tVar = hVar.c;
                        tVar.layout(measuredWidth, i20, tVar.getMeasuredWidth() + measuredWidth, hVar.c.getMeasuredHeight() + i20);
                        break;
                    } else {
                        int measuredHeight = (i15 - hVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.kj0 kj0Var2 = hVar.a;
                        kj0Var2.layout(0, measuredHeight, kj0Var2.getMeasuredWidth(), hVar.a.getMeasuredHeight() + measuredHeight);
                        float f12 = i14;
                        float f13 = 0.4f * f12;
                        int i21 = (int) f13;
                        float f14 = i15;
                        int i22 = (int) (0.22f * f14);
                        TextView textView3 = hVar.e;
                        textView3.layout(i21, i22, textView3.getMeasuredWidth() + i21, hVar.e.getMeasuredHeight() + i22);
                        int i23 = (int) (0.39f * f14);
                        TextView textView4 = hVar.f;
                        textView4.layout(i21, i23, textView4.getMeasuredWidth() + i21, hVar.f.getMeasuredHeight() + i23);
                        int A = (int) com.google.android.gms.internal.vision.e2.A(f12 * 0.6f, hVar.c.getMeasuredWidth(), 2.0f, f13);
                        int i24 = (int) (f14 * 0.69f);
                        ai.t tVar2 = hVar.c;
                        tVar2.layout(A, i24, tVar2.getMeasuredWidth() + A, hVar.c.getMeasuredHeight() + i24);
                        break;
                    }
                } else if (i16 == 3) {
                    if (i12 <= i13) {
                        int i25 = (int) (i15 * 0.3f);
                        int measuredWidth2 = (i14 - hVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.kj0 kj0Var3 = hVar.a;
                        kj0Var3.layout(measuredWidth2, i25, kj0Var3.getMeasuredWidth() + measuredWidth2, hVar.a.getMeasuredHeight() + i25);
                        int C = org.telegram.messenger.a2.C(24.0f, hVar.a.getMeasuredHeight(), i25);
                        TextView textView5 = hVar.e;
                        textView5.layout(0, C, textView5.getMeasuredWidth(), hVar.e.getMeasuredHeight() + C);
                        int textSize = (int) (hVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C);
                        TextView textView6 = hVar.f;
                        textView6.layout(0, textSize, textView6.getMeasuredWidth(), hVar.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i14 - hVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i15 - hVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        ai.t tVar3 = hVar.c;
                        tVar3.layout(measuredWidth3, measuredHeight2, tVar3.getMeasuredWidth() + measuredWidth3, hVar.c.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i14 - hVar.d.getMeasuredWidth()) / 2;
                        int v = org.telegram.messenger.em.v(32.0f, hVar.d.getMeasuredHeight(), measuredHeight2);
                        TextView textView7 = hVar.d;
                        textView7.layout(measuredWidth4, v, textView7.getMeasuredWidth() + measuredWidth4, hVar.d.getMeasuredHeight() + v);
                        break;
                    } else {
                        float f15 = i15;
                        int measuredHeight3 = ((int) ((0.95f * f15) - hVar.a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - hVar.a.getMeasuredWidth());
                        org.telegram.ui.Components.kj0 kj0Var4 = hVar.a;
                        kj0Var4.layout(width, measuredHeight3, kj0Var4.getMeasuredWidth() + width, hVar.a.getMeasuredHeight() + measuredHeight3);
                        float f16 = i14;
                        float f17 = 0.4f * f16;
                        int i26 = (int) f17;
                        int i27 = (int) (0.12f * f15);
                        TextView textView8 = hVar.e;
                        textView8.layout(i26, i27, textView8.getMeasuredWidth() + i26, hVar.e.getMeasuredHeight() + i27);
                        int i28 = (int) (0.24f * f15);
                        TextView textView9 = hVar.f;
                        textView9.layout(i26, i28, textView9.getMeasuredWidth() + i26, hVar.f.getMeasuredHeight() + i28);
                        float f18 = f16 * 0.6f;
                        int A2 = (int) com.google.android.gms.internal.vision.e2.A(f18, hVar.c.getMeasuredWidth(), 2.0f, f17);
                        int i29 = (int) (f15 * 0.8f);
                        ai.t tVar4 = hVar.c;
                        tVar4.layout(A2, i29, tVar4.getMeasuredWidth() + A2, hVar.c.getMeasuredHeight() + i29);
                        int A3 = (int) com.google.android.gms.internal.vision.e2.A(f18, hVar.d.getMeasuredWidth(), 2.0f, f17);
                        int v9 = org.telegram.messenger.em.v(16.0f, hVar.d.getMeasuredHeight(), i29);
                        TextView textView10 = hVar.d;
                        textView10.layout(A3, v9, textView10.getMeasuredWidth() + A3, hVar.d.getMeasuredHeight() + v9);
                        break;
                    }
                } else if (i16 == 5) {
                    if (i12 <= i13) {
                        if (AndroidUtilities.displaySize.y < 1800) {
                            f7 = i15;
                            int i30 = (int) (0.06f * f7);
                            org.telegram.ui.Components.kj0 kj0Var5 = hVar.a;
                            kj0Var5.layout(0, i30, kj0Var5.getMeasuredWidth(), hVar.a.getMeasuredHeight() + i30);
                            int i31 = (int) (0.463f * f7);
                            TextView textView11 = hVar.e;
                            textView11.layout(0, i31, textView11.getMeasuredWidth(), hVar.e.getMeasuredHeight() + i31);
                            f10 = 0.543f;
                        } else {
                            f7 = i15;
                            int i32 = (int) (0.148f * f7);
                            org.telegram.ui.Components.kj0 kj0Var6 = hVar.a;
                            kj0Var6.layout(0, i32, kj0Var6.getMeasuredWidth(), hVar.a.getMeasuredHeight() + i32);
                            int i33 = (int) (0.551f * f7);
                            TextView textView12 = hVar.e;
                            textView12.layout(0, i33, textView12.getMeasuredWidth(), hVar.e.getMeasuredHeight() + i33);
                            f10 = 0.631f;
                        }
                        int i34 = (int) (f7 * f10);
                        int measuredWidth5 = (getMeasuredWidth() - hVar.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout = hVar.h;
                        linearLayout.layout(measuredWidth5, i34, linearLayout.getMeasuredWidth() + measuredWidth5, hVar.h.getMeasuredHeight() + i34);
                        int measuredWidth6 = (i14 - hVar.c.getMeasuredWidth()) / 2;
                        int i35 = (int) (i15 * 0.853f);
                        ai.t tVar5 = hVar.c;
                        tVar5.layout(measuredWidth6, i35, tVar5.getMeasuredWidth() + measuredWidth6, hVar.c.getMeasuredHeight() + i35);
                        break;
                    } else {
                        int measuredHeight4 = (i15 - hVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.kj0 kj0Var7 = hVar.a;
                        kj0Var7.layout(0, measuredHeight4, kj0Var7.getMeasuredWidth(), hVar.a.getMeasuredHeight() + measuredHeight4);
                        float f19 = i14;
                        float f20 = 0.4f * f19;
                        int i36 = (int) f20;
                        float f21 = i15;
                        int i37 = (int) (0.08f * f21);
                        TextView textView13 = hVar.e;
                        textView13.layout(i36, i37, textView13.getMeasuredWidth() + i36, hVar.e.getMeasuredHeight() + i37);
                        float f22 = f19 * 0.6f;
                        int A4 = (int) com.google.android.gms.internal.vision.e2.A(f22, hVar.h.getMeasuredWidth(), 2.0f, f20);
                        int i38 = (int) (0.25f * f21);
                        LinearLayout linearLayout2 = hVar.h;
                        linearLayout2.layout(A4, i38, linearLayout2.getMeasuredWidth() + A4, hVar.h.getMeasuredHeight() + i38);
                        int A5 = (int) com.google.android.gms.internal.vision.e2.A(f22, hVar.c.getMeasuredWidth(), 2.0f, f20);
                        int i39 = (int) (f21 * 0.78f);
                        ai.t tVar6 = hVar.c;
                        tVar6.layout(A5, i39, tVar6.getMeasuredWidth() + A5, hVar.c.getMeasuredHeight() + i39);
                        break;
                    }
                } else if (i16 == 6) {
                    if (i12 <= i13) {
                        int i40 = (int) (i15 * 0.3f);
                        int measuredWidth7 = (i14 - hVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.kj0 kj0Var8 = hVar.a;
                        kj0Var8.layout(measuredWidth7, i40, kj0Var8.getMeasuredWidth() + measuredWidth7, hVar.a.getMeasuredHeight() + i40);
                        int C2 = org.telegram.messenger.a2.C(24.0f, hVar.a.getMeasuredHeight(), i40);
                        TextView textView14 = hVar.e;
                        textView14.layout(0, C2, textView14.getMeasuredWidth(), hVar.e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (hVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + C2);
                        TextView textView15 = hVar.f;
                        textView15.layout(0, textSize2, textView15.getMeasuredWidth(), hVar.f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i14 - hVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i15 - hVar.c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        ai.t tVar7 = hVar.c;
                        tVar7.layout(measuredWidth8, measuredHeight5, tVar7.getMeasuredWidth() + measuredWidth8, hVar.c.getMeasuredHeight() + measuredHeight5);
                        break;
                    } else {
                        int measuredHeight6 = (i15 - hVar.a.getMeasuredHeight()) / 2;
                        float f23 = i14;
                        int measuredWidth9 = ((int) ((0.5f * f23) - hVar.a.getMeasuredWidth())) / 2;
                        org.telegram.ui.Components.kj0 kj0Var9 = hVar.a;
                        kj0Var9.layout(measuredWidth9, measuredHeight6, kj0Var9.getMeasuredWidth() + measuredWidth9, hVar.a.getMeasuredHeight() + measuredHeight6);
                        float f24 = 0.4f * f23;
                        int i41 = (int) f24;
                        float f25 = i15;
                        int i42 = (int) (0.14f * f25);
                        TextView textView16 = hVar.e;
                        textView16.layout(i41, i42, textView16.getMeasuredWidth() + i41, hVar.e.getMeasuredHeight() + i42);
                        int i43 = (int) (0.31f * f25);
                        TextView textView17 = hVar.f;
                        textView17.layout(i41, i43, textView17.getMeasuredWidth() + i41, hVar.f.getMeasuredHeight() + i43);
                        int A6 = (int) com.google.android.gms.internal.vision.e2.A(f23 * 0.6f, hVar.c.getMeasuredWidth(), 2.0f, f24);
                        int i44 = (int) (f25 * 0.78f);
                        ai.t tVar8 = hVar.c;
                        tVar8.layout(A6, i44, tVar8.getMeasuredWidth() + A6, hVar.c.getMeasuredHeight() + i44);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.og0 og0Var = (org.telegram.ui.Components.og0) this.b;
                og0Var.e.layout(0, 0, og0Var.H, og0Var.I);
                break;
            case 2:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.b;
                if (i1Var.e.getParent() == this) {
                    i1Var.e.layout(0, 0, i1Var.M, i1Var.N);
                    break;
                }
                break;
            case 3:
                mh1 mh1Var = (mh1) this.b;
                lVar4 = ((org.telegram.ui.ActionBar.p2) mh1Var).actionBar;
                lVar5 = ((org.telegram.ui.ActionBar.p2) mh1Var).actionBar;
                lVar4.layout(0, 0, i12, lVar5.getMeasuredHeight());
                int i45 = i12 - i10;
                int i46 = i13 - i11;
                if (i12 <= i13) {
                    int i47 = (int) (i46 * 0.3f);
                    int measuredWidth10 = (i45 - mh1Var.a.getMeasuredWidth()) / 2;
                    org.telegram.ui.Components.kj0 kj0Var10 = mh1Var.a;
                    kj0Var10.layout(measuredWidth10, i47, kj0Var10.getMeasuredWidth() + measuredWidth10, mh1Var.a.getMeasuredHeight() + i47);
                    int C3 = org.telegram.messenger.a2.C(16.0f, mh1Var.a.getMeasuredHeight(), i47);
                    TextView textView18 = mh1Var.c;
                    textView18.layout(0, C3, textView18.getMeasuredWidth(), mh1Var.c.getMeasuredHeight() + C3);
                    int C4 = org.telegram.messenger.a2.C(12.0f, mh1Var.c.getMeasuredHeight(), C3);
                    uh.o oVar = mh1Var.d;
                    oVar.layout(0, C4, oVar.getMeasuredWidth(), mh1Var.d.getMeasuredHeight() + C4);
                    int measuredWidth11 = (i45 - mh1Var.b.getMeasuredWidth()) / 2;
                    int measuredHeight7 = (i46 - mh1Var.b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                    TextView textView19 = mh1Var.b;
                    textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, mh1Var.b.getMeasuredHeight() + measuredHeight7);
                    break;
                } else {
                    int measuredHeight8 = (i46 - mh1Var.a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.kj0 kj0Var11 = mh1Var.a;
                    kj0Var11.layout(0, measuredHeight8, kj0Var11.getMeasuredWidth(), mh1Var.a.getMeasuredHeight() + measuredHeight8);
                    float f26 = i45;
                    float f27 = 0.4f * f26;
                    int i48 = (int) f27;
                    float f28 = i46;
                    int i49 = (int) (0.22f * f28);
                    TextView textView20 = mh1Var.c;
                    textView20.layout(i48, i49, textView20.getMeasuredWidth() + i48, mh1Var.c.getMeasuredHeight() + i49);
                    int i50 = (int) (0.39f * f28);
                    uh.o oVar2 = mh1Var.d;
                    oVar2.layout(i48, i50, oVar2.getMeasuredWidth() + i48, mh1Var.d.getMeasuredHeight() + i50);
                    int A7 = (int) com.google.android.gms.internal.vision.e2.A(f26 * 0.6f, mh1Var.b.getMeasuredWidth(), 2.0f, f27);
                    int i51 = (int) (f28 * 0.64f);
                    TextView textView21 = mh1Var.b;
                    textView21.layout(A7, i51, textView21.getMeasuredWidth() + A7, mh1Var.b.getMeasuredHeight() + i51);
                    break;
                }
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                org.telegram.ui.ActionBar.x1 x1Var = usersSelectActivity.a;
                x1Var.layout(0, 0, x1Var.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                h hVar = (h) this.b;
                int i12 = hVar.v;
                lVar = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
                    lVar2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
                }
                if (i12 != 0) {
                    if (i12 == 3) {
                        hVar.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_30));
                        if (size > size2) {
                            float f7 = size;
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i13 = (int) (f7 * 0.6f);
                            hVar.e.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.c.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                        } else {
                            hVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.c.measure(org.telegram.messenger.em.d(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
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
                                    hVar.c.measure(org.telegram.messenger.em.d(48.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                                } else {
                                    hVar.c.measure(org.telegram.messenger.em.d(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                                }
                            }
                        }
                    } else if (size > size2) {
                        float f10 = size;
                        hVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                        int i15 = (int) (f10 * 0.6f);
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
                    float f11 = size;
                    hVar.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), TLObject.FLAG_30));
                    int i16 = (int) (f11 * 0.6f);
                    hVar.e.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.c.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    hVar.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), TLObject.FLAG_30));
                    hVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.c.measure(org.telegram.messenger.em.d(72.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size, size2);
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.og0 og0Var = (org.telegram.ui.Components.og0) this.b;
                og0Var.e.measure(View.MeasureSpec.makeMeasureSpec(og0Var.H, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(og0Var.I, TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.b;
                if (i1Var.e.getParent() == this) {
                    i1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i1Var.M, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i1Var.N, TLObject.FLAG_30));
                    break;
                }
                break;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                mh1 mh1Var = (mh1) this.b;
                lVar3 = ((org.telegram.ui.ActionBar.p2) mh1Var).actionBar;
                lVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i11);
                if (size3 > size4) {
                    float f12 = size3;
                    mh1Var.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i17 = (int) (f12 * 0.6f);
                    mh1Var.c.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    mh1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    mh1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    mh1Var.b.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
                } else {
                    float f13 = mh1Var.O == 7 ? 160 : 140;
                    mh1Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), TLObject.FLAG_30));
                    mh1Var.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    mh1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    mh1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    mh1Var.b.measure(org.telegram.messenger.em.d(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
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
