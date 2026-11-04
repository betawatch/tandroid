package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends ViewGroup {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 5:
                wf.e eVar = (wf.e) this.b;
                Path path = eVar.m;
                float f10 = (1.0f - eVar.o) * eVar.j.e;
                boolean z10 = f10 > 1.0f;
                canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false), (int) Math.min(eVar.o * 420.0f, 255.0f)));
                eVar.d.a(canvas, 1.0f);
                if (z10) {
                    RectF rectF = eVar.l;
                    if (eVar.k != f10) {
                        eVar.k = f10;
                        rectF.set(eVar.c);
                        path.reset();
                        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
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
            case 1:
                if (!((org.telegram.ui.Components.ie0) this.b).n0) {
                    canvas.save();
                    canvas.scale(r0.I / r0.e.getWidth(), r0.J / r0.e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                if (!((org.telegram.ui.Components.voip.s0) this.b).b0) {
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
        org.telegram.ui.ActionBar.q4 q4Var;
        switch (this.a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f) {
                    q4Var = ((org.telegram.ui.ActionBar.d2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) q4Var).q(canvas, usersSelectActivity.a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
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
                kVar = ((org.telegram.ui.ActionBar.d2) gVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) gVar).actionBar;
                    kVar3 = ((org.telegram.ui.ActionBar.d2) gVar).actionBar;
                    kVar2.layout(0, 0, i11, kVar3.getMeasuredHeight());
                }
                int i13 = i11 - i3;
                int i14 = i12 - i10;
                int i15 = gVar.w;
                if (i15 == 0) {
                    if (i11 > i12) {
                        int measuredHeight = (i14 - gVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.fh0 fh0Var = gVar.a;
                        fh0Var.layout(0, measuredHeight, fh0Var.getMeasuredWidth(), gVar.a.getMeasuredHeight() + measuredHeight);
                        float f12 = i13;
                        float f13 = 0.4f * f12;
                        int i16 = (int) f13;
                        float f14 = i14;
                        int i17 = (int) (0.22f * f14);
                        TextView textView = gVar.e;
                        textView.layout(i16, i17, textView.getMeasuredWidth() + i16, gVar.e.getMeasuredHeight() + i17);
                        int i18 = (int) (0.39f * f14);
                        TextView textView2 = gVar.f;
                        textView2.layout(i16, i18, textView2.getMeasuredWidth() + i16, gVar.f.getMeasuredHeight() + i18);
                        int z11 = (int) com.google.android.recaptcha.internal.a.z(f12 * 0.6f, gVar.c.getMeasuredWidth(), 2.0f, f13);
                        int i19 = (int) (f14 * 0.69f);
                        fi.j jVar = gVar.c;
                        jVar.layout(z11, i19, jVar.getMeasuredWidth() + z11, gVar.c.getMeasuredHeight() + i19);
                        break;
                    } else {
                        float f15 = i14;
                        int i20 = (int) (0.188f * f15);
                        org.telegram.ui.Components.fh0 fh0Var2 = gVar.a;
                        fh0Var2.layout(0, i20, fh0Var2.getMeasuredWidth(), gVar.a.getMeasuredHeight() + i20);
                        int i21 = (int) (0.651f * f15);
                        TextView textView3 = gVar.e;
                        textView3.layout(0, i21, textView3.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i21);
                        int i22 = (int) (0.731f * f15);
                        TextView textView4 = gVar.f;
                        textView4.layout(0, i22, textView4.getMeasuredWidth(), gVar.f.getMeasuredHeight() + i22);
                        int measuredWidth = (i13 - gVar.c.getMeasuredWidth()) / 2;
                        int i23 = (int) (f15 * 0.853f);
                        fi.j jVar2 = gVar.c;
                        jVar2.layout(measuredWidth, i23, jVar2.getMeasuredWidth() + measuredWidth, gVar.c.getMeasuredHeight() + i23);
                        break;
                    }
                } else if (i15 == 3) {
                    if (i11 > i12) {
                        float f16 = i14;
                        int measuredHeight2 = ((int) ((0.95f * f16) - gVar.a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - gVar.a.getMeasuredWidth());
                        org.telegram.ui.Components.fh0 fh0Var3 = gVar.a;
                        fh0Var3.layout(width, measuredHeight2, fh0Var3.getMeasuredWidth() + width, gVar.a.getMeasuredHeight() + measuredHeight2);
                        float f17 = i13;
                        float f18 = 0.4f * f17;
                        int i24 = (int) f18;
                        int i25 = (int) (0.12f * f16);
                        TextView textView5 = gVar.e;
                        textView5.layout(i24, i25, textView5.getMeasuredWidth() + i24, gVar.e.getMeasuredHeight() + i25);
                        int i26 = (int) (0.24f * f16);
                        TextView textView6 = gVar.f;
                        textView6.layout(i24, i26, textView6.getMeasuredWidth() + i24, gVar.f.getMeasuredHeight() + i26);
                        float f19 = f17 * 0.6f;
                        int z12 = (int) com.google.android.recaptcha.internal.a.z(f19, gVar.c.getMeasuredWidth(), 2.0f, f18);
                        int i27 = (int) (f16 * 0.8f);
                        fi.j jVar3 = gVar.c;
                        jVar3.layout(z12, i27, jVar3.getMeasuredWidth() + z12, gVar.c.getMeasuredHeight() + i27);
                        int z13 = (int) com.google.android.recaptcha.internal.a.z(f19, gVar.d.getMeasuredWidth(), 2.0f, f18);
                        int w10 = org.telegram.messenger.camera.q.w(16.0f, gVar.d.getMeasuredHeight(), i27);
                        TextView textView7 = gVar.d;
                        textView7.layout(z13, w10, textView7.getMeasuredWidth() + z13, gVar.d.getMeasuredHeight() + w10);
                        break;
                    } else {
                        int i28 = (int) (i14 * 0.3f);
                        int measuredWidth2 = (i13 - gVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.fh0 fh0Var4 = gVar.a;
                        fh0Var4.layout(measuredWidth2, i28, fh0Var4.getMeasuredWidth() + measuredWidth2, gVar.a.getMeasuredHeight() + i28);
                        int C = org.telegram.messenger.k5.C(24.0f, gVar.a.getMeasuredHeight(), i28);
                        TextView textView8 = gVar.e;
                        textView8.layout(0, C, textView8.getMeasuredWidth(), gVar.e.getMeasuredHeight() + C);
                        int textSize = (int) (gVar.e.getTextSize() + org.telegram.messenger.g0.L(16.0f) + C);
                        TextView textView9 = gVar.f;
                        textView9.layout(0, textSize, textView9.getMeasuredWidth(), gVar.f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i13 - gVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight3 = (i14 - gVar.c.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                        fi.j jVar4 = gVar.c;
                        jVar4.layout(measuredWidth3, measuredHeight3, jVar4.getMeasuredWidth() + measuredWidth3, gVar.c.getMeasuredHeight() + measuredHeight3);
                        int measuredWidth4 = (i13 - gVar.d.getMeasuredWidth()) / 2;
                        int w11 = org.telegram.messenger.camera.q.w(32.0f, gVar.d.getMeasuredHeight(), measuredHeight3);
                        TextView textView10 = gVar.d;
                        textView10.layout(measuredWidth4, w11, textView10.getMeasuredWidth() + measuredWidth4, gVar.d.getMeasuredHeight() + w11);
                        break;
                    }
                } else if (i15 == 5) {
                    if (i11 > i12) {
                        int measuredHeight4 = (i14 - gVar.a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.fh0 fh0Var5 = gVar.a;
                        fh0Var5.layout(0, measuredHeight4, fh0Var5.getMeasuredWidth(), gVar.a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i13;
                        float f21 = 0.4f * f20;
                        int i29 = (int) f21;
                        float f22 = i14;
                        int i30 = (int) (0.08f * f22);
                        TextView textView11 = gVar.e;
                        textView11.layout(i29, i30, textView11.getMeasuredWidth() + i29, gVar.e.getMeasuredHeight() + i30);
                        float f23 = f20 * 0.6f;
                        int z14 = (int) com.google.android.recaptcha.internal.a.z(f23, gVar.h.getMeasuredWidth(), 2.0f, f21);
                        int i31 = (int) (0.25f * f22);
                        LinearLayout linearLayout = gVar.h;
                        linearLayout.layout(z14, i31, linearLayout.getMeasuredWidth() + z14, gVar.h.getMeasuredHeight() + i31);
                        int z15 = (int) com.google.android.recaptcha.internal.a.z(f23, gVar.c.getMeasuredWidth(), 2.0f, f21);
                        int i32 = (int) (f22 * 0.78f);
                        fi.j jVar5 = gVar.c;
                        jVar5.layout(z15, i32, jVar5.getMeasuredWidth() + z15, gVar.c.getMeasuredHeight() + i32);
                        break;
                    } else {
                        if (org.telegram.messenger.g0.q.y < 1800) {
                            f10 = i14;
                            int i33 = (int) (0.06f * f10);
                            org.telegram.ui.Components.fh0 fh0Var6 = gVar.a;
                            fh0Var6.layout(0, i33, fh0Var6.getMeasuredWidth(), gVar.a.getMeasuredHeight() + i33);
                            int i34 = (int) (0.463f * f10);
                            TextView textView12 = gVar.e;
                            textView12.layout(0, i34, textView12.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i34);
                            f11 = 0.543f;
                        } else {
                            f10 = i14;
                            int i35 = (int) (0.148f * f10);
                            org.telegram.ui.Components.fh0 fh0Var7 = gVar.a;
                            fh0Var7.layout(0, i35, fh0Var7.getMeasuredWidth(), gVar.a.getMeasuredHeight() + i35);
                            int i36 = (int) (0.551f * f10);
                            TextView textView13 = gVar.e;
                            textView13.layout(0, i36, textView13.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i36);
                            f11 = 0.631f;
                        }
                        int i37 = (int) (f10 * f11);
                        int measuredWidth5 = (getMeasuredWidth() - gVar.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout2 = gVar.h;
                        linearLayout2.layout(measuredWidth5, i37, linearLayout2.getMeasuredWidth() + measuredWidth5, gVar.h.getMeasuredHeight() + i37);
                        int measuredWidth6 = (i13 - gVar.c.getMeasuredWidth()) / 2;
                        int i38 = (int) (i14 * 0.853f);
                        fi.j jVar6 = gVar.c;
                        jVar6.layout(measuredWidth6, i38, jVar6.getMeasuredWidth() + measuredWidth6, gVar.c.getMeasuredHeight() + i38);
                        break;
                    }
                } else if (i15 == 6) {
                    if (i11 > i12) {
                        int measuredHeight5 = (i14 - gVar.a.getMeasuredHeight()) / 2;
                        float f24 = i13;
                        int measuredWidth7 = ((int) ((0.5f * f24) - gVar.a.getMeasuredWidth())) / 2;
                        org.telegram.ui.Components.fh0 fh0Var8 = gVar.a;
                        fh0Var8.layout(measuredWidth7, measuredHeight5, fh0Var8.getMeasuredWidth() + measuredWidth7, gVar.a.getMeasuredHeight() + measuredHeight5);
                        float f25 = 0.4f * f24;
                        int i39 = (int) f25;
                        float f26 = i14;
                        int i40 = (int) (0.14f * f26);
                        TextView textView14 = gVar.e;
                        textView14.layout(i39, i40, textView14.getMeasuredWidth() + i39, gVar.e.getMeasuredHeight() + i40);
                        int i41 = (int) (0.31f * f26);
                        TextView textView15 = gVar.f;
                        textView15.layout(i39, i41, textView15.getMeasuredWidth() + i39, gVar.f.getMeasuredHeight() + i41);
                        int z16 = (int) com.google.android.recaptcha.internal.a.z(f24 * 0.6f, gVar.c.getMeasuredWidth(), 2.0f, f25);
                        int i42 = (int) (f26 * 0.78f);
                        fi.j jVar7 = gVar.c;
                        jVar7.layout(z16, i42, jVar7.getMeasuredWidth() + z16, gVar.c.getMeasuredHeight() + i42);
                        break;
                    } else {
                        int i43 = (int) (i14 * 0.3f);
                        int measuredWidth8 = (i13 - gVar.a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.fh0 fh0Var9 = gVar.a;
                        fh0Var9.layout(measuredWidth8, i43, fh0Var9.getMeasuredWidth() + measuredWidth8, gVar.a.getMeasuredHeight() + i43);
                        int C2 = org.telegram.messenger.k5.C(24.0f, gVar.a.getMeasuredHeight(), i43);
                        TextView textView16 = gVar.e;
                        textView16.layout(0, C2, textView16.getMeasuredWidth(), gVar.e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (gVar.e.getTextSize() + org.telegram.messenger.g0.L(16.0f) + C2);
                        TextView textView17 = gVar.f;
                        textView17.layout(0, textSize2, textView17.getMeasuredWidth(), gVar.f.getMeasuredHeight() + textSize2);
                        int measuredWidth9 = (i13 - gVar.c.getMeasuredWidth()) / 2;
                        int measuredHeight6 = (i14 - gVar.c.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                        fi.j jVar8 = gVar.c;
                        jVar8.layout(measuredWidth9, measuredHeight6, jVar8.getMeasuredWidth() + measuredWidth9, gVar.c.getMeasuredHeight() + measuredHeight6);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.ie0 ie0Var = (org.telegram.ui.Components.ie0) this.b;
                ie0Var.e.layout(0, 0, ie0Var.I, ie0Var.J);
                break;
            case 2:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.b;
                if (s0Var.e.getParent() == this) {
                    s0Var.e.layout(0, 0, s0Var.N, s0Var.O);
                    break;
                }
                break;
            case 3:
                ra1 ra1Var = (ra1) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.d2) ra1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.d2) ra1Var).actionBar;
                kVar4.layout(0, 0, i11, kVar5.getMeasuredHeight());
                int i44 = i11 - i3;
                int i45 = i12 - i10;
                if (i11 > i12) {
                    int measuredHeight7 = (i45 - ra1Var.a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.fh0 fh0Var10 = ra1Var.a;
                    fh0Var10.layout(0, measuredHeight7, fh0Var10.getMeasuredWidth(), ra1Var.a.getMeasuredHeight() + measuredHeight7);
                    float f27 = i44;
                    float f28 = 0.4f * f27;
                    int i46 = (int) f28;
                    float f29 = i45;
                    int i47 = (int) (0.22f * f29);
                    TextView textView18 = ra1Var.c;
                    textView18.layout(i46, i47, textView18.getMeasuredWidth() + i46, ra1Var.c.getMeasuredHeight() + i47);
                    int i48 = (int) (0.39f * f29);
                    yh.l lVar = ra1Var.d;
                    lVar.layout(i46, i48, lVar.getMeasuredWidth() + i46, ra1Var.d.getMeasuredHeight() + i48);
                    int z17 = (int) com.google.android.recaptcha.internal.a.z(f27 * 0.6f, ra1Var.b.getMeasuredWidth(), 2.0f, f28);
                    int i49 = (int) (f29 * 0.64f);
                    TextView textView19 = ra1Var.b;
                    textView19.layout(z17, i49, textView19.getMeasuredWidth() + z17, ra1Var.b.getMeasuredHeight() + i49);
                    break;
                } else {
                    int i50 = (int) (i45 * 0.3f);
                    int measuredWidth10 = (i44 - ra1Var.a.getMeasuredWidth()) / 2;
                    org.telegram.ui.Components.fh0 fh0Var11 = ra1Var.a;
                    fh0Var11.layout(measuredWidth10, i50, fh0Var11.getMeasuredWidth() + measuredWidth10, ra1Var.a.getMeasuredHeight() + i50);
                    int C3 = org.telegram.messenger.k5.C(16.0f, ra1Var.a.getMeasuredHeight(), i50);
                    TextView textView20 = ra1Var.c;
                    textView20.layout(0, C3, textView20.getMeasuredWidth(), ra1Var.c.getMeasuredHeight() + C3);
                    int C4 = org.telegram.messenger.k5.C(12.0f, ra1Var.c.getMeasuredHeight(), C3);
                    yh.l lVar2 = ra1Var.d;
                    lVar2.layout(0, C4, lVar2.getMeasuredWidth(), ra1Var.d.getMeasuredHeight() + C4);
                    int measuredWidth11 = (i44 - ra1Var.b.getMeasuredWidth()) / 2;
                    int measuredHeight8 = (i45 - ra1Var.b.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                    TextView textView21 = ra1Var.b;
                    textView21.layout(measuredWidth11, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth11, ra1Var.b.getMeasuredHeight() + measuredHeight8);
                    break;
                }
            case 4:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                org.telegram.ui.ActionBar.k1 k1Var = usersSelectActivity.a;
                k1Var.layout(0, 0, k1Var.getMeasuredWidth(), usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.f.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.f.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.a.getMeasuredHeight(), usersSelectActivity.f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.a.getMeasuredHeight());
                org.telegram.ui.Components.l00 l00Var = usersSelectActivity.r;
                if (l00Var != null) {
                    int measuredWidth12 = org.telegram.messenger.bd.a0 ? usersSelectActivity.s.leftMargin : ((i11 - i3) - usersSelectActivity.s.rightMargin) - l00Var.getMeasuredWidth();
                    int measuredHeight9 = ((i12 - i10) - usersSelectActivity.s.bottomMargin) - usersSelectActivity.r.getMeasuredHeight();
                    org.telegram.ui.Components.l00 l00Var2 = usersSelectActivity.r;
                    l00Var2.layout(measuredWidth12, measuredHeight9, l00Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.r.getMeasuredHeight() + measuredHeight9);
                    break;
                }
                break;
            default:
                for (int i51 = 0; i51 < getChildCount(); i51++) {
                    View childAt = getChildAt(i51);
                    Rect rect = ((wf.e) this.b).c;
                    childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
                }
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                g gVar = (g) this.b;
                int i11 = gVar.w;
                kVar = ((org.telegram.ui.ActionBar.d2) gVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) gVar).actionBar;
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
                setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
                org.telegram.ui.Components.ie0 ie0Var = (org.telegram.ui.Components.ie0) this.b;
                ie0Var.e.measure(View.MeasureSpec.makeMeasureSpec(ie0Var.I, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ie0Var.J, TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.b;
                if (s0Var.e.getParent() == this) {
                    s0Var.e.measure(View.MeasureSpec.makeMeasureSpec(s0Var.N, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(s0Var.O, TLObject.FLAG_30));
                    break;
                }
                break;
            case 3:
                int size3 = View.MeasureSpec.getSize(i3);
                int size4 = View.MeasureSpec.getSize(i10);
                ra1 ra1Var = (ra1) this.b;
                kVar3 = ((org.telegram.ui.ActionBar.d2) ra1Var).actionBar;
                kVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), i10);
                if (size3 > size4) {
                    float f13 = size3;
                    ra1Var.a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), TLObject.FLAG_30));
                    int i16 = (int) (f13 * 0.6f);
                    ra1Var.c.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.b.measure(View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), TLObject.FLAG_30));
                } else {
                    float f14 = ra1Var.P == 7 ? org.telegram.messenger.hs.q2 : org.telegram.messenger.hs.W1;
                    ra1Var.a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f14), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f14), TLObject.FLAG_30));
                    ra1Var.c.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.b.measure(org.telegram.messenger.camera.q.c(48.0f, size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
                }
                setMeasuredDimension(size3, size4);
                break;
            case 4:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                int size5 = View.MeasureSpec.getSize(i3);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                usersSelectActivity.a.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((org.telegram.messenger.g0.Q1() || size6 > size5) ? org.telegram.messenger.g0.L(144.0f) : org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_31));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.f.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.a.getMeasuredHeight(), TLObject.FLAG_30));
                org.telegram.ui.Components.l00 l00Var = usersSelectActivity.r;
                if (l00Var != null) {
                    int i17 = usersSelectActivity.s.width;
                    l00Var.measure(View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                    break;
                }
                break;
            default:
                int size7 = View.MeasureSpec.getSize(i3);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8, TLObject.FLAG_30));
                wf.e eVar = (wf.e) this.b;
                boolean z10 = ((uf.a) getParent()).d;
                Rect rect = eVar.c;
                if (z10) {
                    rect.set(0, 0, size7, size8);
                } else {
                    rect.set(eVar.b);
                }
                for (int i18 = 0; i18 < getChildCount(); i18++) {
                    getChildAt(i18).measure(View.MeasureSpec.makeMeasureSpec(eVar.c.width(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(eVar.c.height(), TLObject.FLAG_30));
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LaunchActivity launchActivity, wf.e eVar) {
        super(launchActivity);
        this.a = 5;
        this.b = eVar;
    }
}
