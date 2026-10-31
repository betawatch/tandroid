package org.telegram.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ThemeActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public int A0;
    public int B0;
    public int C0;
    public int D;
    public int D0;
    public int E;
    public int E0;
    public int F;
    public int F0;
    public int G;
    public int G0;
    public int H;
    public int H0;
    public int I;
    public int I0;
    public int J;
    public int J0;
    public int K;
    public boolean K0;
    public int L;
    public int L0;
    public int M;
    public boolean M0;
    public int N;
    public boolean N0;
    public int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public final p71 Q0;
    public int R;
    public final p71 R0;
    public int S;
    public org.telegram.ui.Components.bi0 S0;
    public int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public x71 a;
    public int a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.tk0 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public v71 c;
    public int c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int d0;
    public final ArrayList e;
    public int e0;
    public final int f;
    public int f0;
    public int g0;
    public org.telegram.ui.ActionBar.s6 h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.r6 n;
    public int n0;
    private int nightThemeRow;
    public int o0;
    public int p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int q0;
    public org.telegram.ui.ActionBar.x1 r;
    public int r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.p5 s;
    public int s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int t0;
    private int textSizeRow;
    public int u0;
    public int v0;
    public boolean w;
    public int w0;
    public int x;
    public int x0;
    public int y;
    public int y0;
    public int z0;

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class InnerAccentView extends View {
        public final Paint a;
        public ObjectAnimator b;
        public float c;
        public org.telegram.ui.ActionBar.s6 d;
        public org.telegram.ui.ActionBar.r6 e;
        public boolean f;

        public InnerAccentView(Context context) {
            super(context);
            this.a = new Paint(1);
        }

        public final void a(boolean z10) {
            this.f = this.d.Y == this.e.a;
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!z10) {
                setCheckedState(this.f ? 1.0f : 0.0f);
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", this.f ? 1.0f : 0.0f);
            this.b = ofFloat;
            ofFloat.setDuration(200L);
            this.b.start();
        }

        public float getCheckedState() {
            return this.c;
        }

        @Override // android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            a(false);
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            float L = org.telegram.messenger.i0.L(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i10 = this.e.c;
            Paint paint = this.a;
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
            paint.setAlpha(Math.round(this.c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(org.telegram.messenger.zs.e4);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.i0.L(5.0f) * this.c), paint);
            if (this.c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.i0.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (org.telegram.messenger.i0.L(7.0f) * this.c), measuredHeight, org.telegram.messenger.i0.L(2.0f), paint);
                canvas.drawCircle((org.telegram.messenger.i0.L(7.0f) * this.c) + measuredWidth, measuredHeight, org.telegram.messenger.i0.L(2.0f), paint);
            }
            int i11 = this.e.e;
            if (i11 == 0 || this.c == 1.0f) {
                return;
            }
            paint.setColor(i11);
            canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.c) * org.telegram.messenger.i0.L(8.0f), paint);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131752015, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override // android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(62.0f), TLObject.FLAG_30));
        }

        public void setCheckedState(float f7) {
            this.c = f7;
            invalidate();
        }
    }

    public ThemeActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.Q0 = new p71(this);
        this.R0 = new p71(this);
        this.f = i10;
        E0(true);
    }

    public static String C0() {
        int i10 = org.telegram.ui.ActionBar.t6.v;
        int i11 = i10 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i10 - (i11 * 60)));
        int i12 = org.telegram.ui.ActionBar.t6.t;
        int i13 = i12 / 60;
        return org.telegram.messenger.cd.a0("AutoNightUpdateLocationInfo", null, 2131753780, String.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12 - (i13 * 60))), format);
    }

    public static void G0(final int i10, final Context context, final org.telegram.messenger.q20 q20Var, final org.telegram.ui.ActionBar.p6 p6Var) {
        final org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        final String str = r12.v6;
        String str2 = r12.w6;
        final int i11 = r12.x6;
        if (TextUtils.isEmpty(str) || !((org.telegram.messenger.j0) r12.y7.m.b).c) {
            q20Var.a(Boolean.TRUE);
            return;
        }
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        k10.N = f7;
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.i0.L(80.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(frameLayout, L2, N, null, p6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, w7.b6.e(50, 50, 17));
        f7.addView(frameLayout, w7.b6.t(80, 80, 1, 0, 20, 0, 8));
        int i13 = org.telegram.ui.ActionBar.t6.j5;
        TextView b10 = w7.g6.b(context, 20.0f, i13, true, p6Var);
        b10.setText(org.telegram.messenger.cd.L0(2131754307, null));
        b10.setGravity(17);
        f7.addView(b10, w7.b6.t(-1, -2, 7, 24, 8, 24, 8));
        TextView b11 = w7.g6.b(context, 14.0f, i13, false, p6Var);
        b11.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.M0("AgeVerificationText" + str2)));
        b11.setGravity(17);
        f7.addView(b11, w7.b6.t(-1, -2, 7, 24, 0, 24, 0));
        final vh.d dVar = new vh.d(context, p6Var, true);
        dVar.i(org.telegram.messenger.cd.L0(2131754313, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.h71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final vh.d dVar2 = vh.d.this;
                if (dVar2.Q) {
                    return;
                }
                dVar2.setLoading(true);
                final org.telegram.messenger.vp vpVar = r12;
                final String str3 = str;
                final int i14 = i10;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                final int i15 = i11;
                final org.telegram.messenger.q20 q20Var2 = q20Var;
                final org.telegram.ui.ActionBar.z2[] z2VarArr = r9;
                w7.c6.c(R.raw.permission_request_camera, 2131754310, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.q20() { // from class: org.telegram.ui.i71
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        final vh.d dVar3 = vh.d.this;
                        if (!booleanValue) {
                            dVar3.setLoading(false);
                            return;
                        }
                        final org.telegram.messenger.vp vpVar2 = vpVar;
                        org.telegram.messenger.g20 c22 = vpVar2.c2();
                        final int i16 = i14;
                        final Context context3 = context2;
                        final org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
                        final int i17 = i15;
                        final org.telegram.messenger.q20 q20Var3 = q20Var2;
                        final org.telegram.ui.ActionBar.z2[] z2VarArr2 = z2VarArr;
                        c22.a(str3, null, new org.telegram.messenger.q20() { // from class: org.telegram.ui.j71
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r6v2, types: [org.telegram.messenger.n20, org.telegram.ui.k71] */
                            @Override // org.telegram.messenger.q20
                            public final void a(Object obj2) {
                                Long l4 = (Long) obj2;
                                vh.d dVar4 = vh.d.this;
                                if (l4 == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                TLRPC.User Z1 = vpVar2.Z1(l4);
                                if (Z1 == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                xh.s3 b12 = xh.s3.b(i16, l4.longValue(), l4.longValue(), null, null, 4, 0, 0L, null, false, null, Z1, 0, false, false);
                                final xh.m2 m2Var = new xh.m2(context3, p6Var3);
                                final int i18 = i17;
                                final org.telegram.messenger.q20 q20Var4 = q20Var3;
                                ?? r62 = new org.telegram.messenger.n20() { // from class: org.telegram.ui.k71
                                    @Override // org.telegram.messenger.n20
                                    public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        Double d = (Double) obj4;
                                        boolean booleanValue2 = d != null ? d.doubleValue() >= ((double) i18) : ((Boolean) obj3).booleanValue();
                                        m2Var.o(false);
                                        q20Var4.a(Boolean.valueOf(booleanValue2));
                                        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                        if (!booleanValue2 || T2 == null) {
                                            return;
                                        }
                                        org.telegram.messenger.m5.n(null, 2131754309, org.telegram.ui.Components.cc.a0(T2), R.raw.contact_check, 36);
                                    }
                                };
                                m2Var.L0 = r62;
                                xh.e2 e2Var = m2Var.D;
                                if (e2Var != 0) {
                                    e2Var.setOnVerifiedAge(r62);
                                }
                                m2Var.B(true);
                                m2Var.B0 = false;
                                m2Var.l0 = T.getParentActivity();
                                m2Var.x(T, b12);
                                m2Var.show();
                                dVar4.setLoading(false);
                                z2VarArr2[0].dismiss();
                            }
                        });
                    }
                });
            }
        });
        f7.addView(dVar, w7.b6.t(-1, 48, 7, 2, 29, 2, 14));
        k10.show();
        final org.telegram.ui.ActionBar.z2[] z2VarArr = {k10};
        k10.O();
    }

    public static void Y(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        x71 x71Var;
        org.telegram.ui.Components.tk0 tk0Var = themeActivity.b;
        if (tk0Var == null || !tk0Var.G || (x71Var = themeActivity.a) == null) {
            return;
        }
        int i10 = themeActivity.sensitiveContentRow;
        boolean z10 = false;
        boolean z11 = i10 >= 0;
        if (contentsettings != null && contentsettings.sensitive_can_change) {
            z10 = true;
        }
        if (z11 == z10) {
            x71Var.g(i10);
        } else {
            themeActivity.E0(true);
        }
    }

    public static void a0(final ThemeActivity themeActivity, Context context, View view, final int i10, float f7) {
        int i11;
        int i12;
        final int i13 = 1;
        if (i10 == themeActivity.N) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            boolean z10 = d12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = d12.edit();
            boolean z11 = !z10;
            edit.putBoolean("view_animations", z11);
            org.telegram.messenger.tz.C1 = Boolean.valueOf(z11);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(z11);
                return;
            }
            return;
        }
        final int i14 = 0;
        if (i10 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
            return;
        }
        if (i10 == themeActivity.changeUserColor) {
            tn0 tn0Var = new tn0();
            tn0Var.H = themeActivity;
            themeActivity.presentFragment(tn0Var);
            return;
        }
        if (i10 == themeActivity.G) {
            SharedPreferences d13 = org.telegram.messenger.vp.d1();
            boolean z12 = d13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = d13.edit();
            boolean z13 = !z12;
            edit2.putBoolean("send_by_enter", z13);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(z13);
                return;
            }
            return;
        }
        if (i10 == themeActivity.E) {
            org.telegram.messenger.tz.r0 = !org.telegram.messenger.tz.r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.vp.d1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.tz.r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.r0);
                return;
            }
            return;
        }
        if (i10 == themeActivity.F) {
            org.telegram.messenger.tz.t0 = !org.telegram.messenger.tz.t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.vp.d1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.tz.t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.t0);
                return;
            }
            return;
        }
        if (i10 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.tz.s0 = !org.telegram.messenger.tz.s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.vp.d1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.tz.s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.s0);
            }
            if (!org.telegram.messenger.tz.s0 && themeActivity.E != -1) {
                for (int i15 = 0; i15 < themeActivity.b.getChildCount(); i15++) {
                    View childAt = themeActivity.b.getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.t8) {
                        themeActivity.b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.E) {
                            ((org.telegram.ui.Cells.t8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.E0(false);
            return;
        }
        if (i10 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.tz.F0 = !org.telegram.messenger.tz.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.vp.d1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.tz.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.F0);
                return;
            }
            return;
        }
        if (i10 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.tz.G0 = !org.telegram.messenger.tz.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.vp.d1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.tz.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.G0);
                return;
            }
            return;
        }
        int i16 = 2;
        float f10 = 4.0f;
        if (i10 == themeActivity.K) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference = new AtomicReference();
            LinearLayout f11 = org.telegram.messenger.m5.f(context, 1);
            CharSequence[] charSequenceArr = {org.telegram.messenger.cd.L0(2131751367, "DistanceUnitsAutomatic"), org.telegram.messenger.cd.L0(2131751366, "DistanceUnitsKilometers"), org.telegram.messenger.cd.L0(2131751365, "DistanceUnitsMiles")};
            final int i17 = 0;
            while (i17 < 3) {
                org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(themeActivity.getParentActivity(), null);
                float f12 = f10;
                n6Var.setPadding(org.telegram.messenger.i0.L(f10), 0, org.telegram.messenger.i0.L(f12), 0);
                n6Var.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.g7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E5, false));
                n6Var.b(charSequenceArr[i17], i17 == org.telegram.messenger.tz.s1);
                int i18 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i18, false), 2, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i18);
                n6Var.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(n6Var, h02, null, N, null);
                f11.addView(n6Var);
                n6Var.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.l71
                    public final /* synthetic */ ThemeActivity b;

                    {
                        this.b = themeActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                ThemeActivity themeActivity2 = this.b;
                                themeActivity2.getClass();
                                org.telegram.messenger.tz.s1 = i17;
                                SharedPreferences.Editor edit8 = org.telegram.messenger.vp.d1().edit();
                                edit8.putInt("distanceSystemType", org.telegram.messenger.tz.s1);
                                edit8.apply();
                                org.telegram.messenger.cd.d0 = null;
                                themeActivity2.O0 = true;
                                s4.c1 K = themeActivity2.b.K(themeActivity2.K);
                                if (K != null) {
                                    themeActivity2.a.t(K, themeActivity2.K);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                            default:
                                org.telegram.messenger.tz.p0 = i17;
                                SharedPreferences.Editor edit9 = org.telegram.messenger.vp.d1().edit();
                                edit9.putInt("searchEngineType", org.telegram.messenger.tz.p0);
                                edit9.apply();
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.P0 = true;
                                s4.c1 K2 = themeActivity3.b.K(themeActivity3.L);
                                if (K2 != null) {
                                    themeActivity3.a.t(K2, themeActivity3.L);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                        }
                    }
                });
                i17++;
                f10 = f12;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131751364, "DistanceUnitsTitle");
            alertDialog$Builder.o(f11);
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            atomicReference.set(x1Var);
            themeActivity.showDialog(x1Var);
            return;
        }
        if (i10 == themeActivity.L) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference2 = new AtomicReference();
            LinearLayout f13 = org.telegram.messenger.m5.f(context, 1);
            ArrayList b10 = org.telegram.ui.web.g1.b();
            int size = b10.size();
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            final int i19 = 0;
            while (i19 < size) {
                charSequenceArr2[i19] = ((org.telegram.ui.web.g1) b10.get(i19)).a;
                org.telegram.ui.Cells.n6 n6Var2 = new org.telegram.ui.Cells.n6(themeActivity.getParentActivity(), null);
                n6Var2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                n6Var2.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.g7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E5, false));
                n6Var2.b(charSequenceArr2[i19], i19 == org.telegram.messenger.tz.p0);
                int i20 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i20, false), 2, -1);
                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i20);
                n6Var2.setBackground(h03);
                org.telegram.ui.ActionBar.a7.k(n6Var2, h03, null, N2, null);
                f13.addView(n6Var2);
                n6Var2.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.l71
                    public final /* synthetic */ ThemeActivity b;

                    {
                        this.b = themeActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                ThemeActivity themeActivity2 = this.b;
                                themeActivity2.getClass();
                                org.telegram.messenger.tz.s1 = i19;
                                SharedPreferences.Editor edit8 = org.telegram.messenger.vp.d1().edit();
                                edit8.putInt("distanceSystemType", org.telegram.messenger.tz.s1);
                                edit8.apply();
                                org.telegram.messenger.cd.d0 = null;
                                themeActivity2.O0 = true;
                                s4.c1 K = themeActivity2.b.K(themeActivity2.K);
                                if (K != null) {
                                    themeActivity2.a.t(K, themeActivity2.K);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                            default:
                                org.telegram.messenger.tz.p0 = i19;
                                SharedPreferences.Editor edit9 = org.telegram.messenger.vp.d1().edit();
                                edit9.putInt("searchEngineType", org.telegram.messenger.tz.p0);
                                edit9.apply();
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.P0 = true;
                                s4.c1 K2 = themeActivity3.b.K(themeActivity3.L);
                                if (K2 != null) {
                                    themeActivity3.a.t(K2, themeActivity3.L);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                        }
                    }
                });
                i19++;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder2.a.R = org.telegram.messenger.cd.L0(2131745816, null);
            alertDialog$Builder2.o(f13);
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
            atomicReference2.set(x1Var2);
            themeActivity.showDialog(x1Var2);
            return;
        }
        if (i10 == themeActivity.M) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference3 = new AtomicReference();
            LinearLayout f14 = org.telegram.messenger.m5.f(context, 1);
            org.telegram.ui.Cells.n6 n6Var3 = new org.telegram.ui.Cells.n6(themeActivity.getParentActivity(), null);
            n6Var3.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            int i21 = org.telegram.ui.ActionBar.t6.g7;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i21, false);
            int i22 = org.telegram.ui.ActionBar.t6.E5;
            n6Var3.a(x02, org.telegram.ui.ActionBar.t6.x0(null, i22, false));
            n6Var3.b(org.telegram.messenger.cd.L0(2131748453, null), !org.telegram.messenger.tz.u0);
            int i23 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i23, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i23);
            n6Var3.setBackground(h04);
            org.telegram.ui.ActionBar.a7.k(n6Var3, h04, null, N3, null);
            f14.addView(n6Var3);
            n6Var3.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.m71
                public final /* synthetic */ ThemeActivity b;

                {
                    this.b = themeActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i24 = i14;
                    AtomicReference atomicReference4 = atomicReference3;
                    ThemeActivity themeActivity2 = this.b;
                    switch (i24) {
                        case 0:
                            themeActivity2.getClass();
                            org.telegram.messenger.tz.u0 = false;
                            org.telegram.messenger.tz.y();
                            themeActivity2.N0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            s4.c1 K = themeActivity2.b.K(themeActivity2.M);
                            if (K != null) {
                                themeActivity2.a.t(K, themeActivity2.M);
                                break;
                            }
                            break;
                        default:
                            w7.c6.c(R.raw.permission_request_microphone, 2131747326, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new f11(2, themeActivity2, atomicReference4));
                            org.telegram.messenger.tz.u0 = true;
                            org.telegram.messenger.tz.y();
                            themeActivity2.N0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            s4.c1 K2 = themeActivity2.b.K(themeActivity2.M);
                            if (K2 != null) {
                                themeActivity2.a.t(K2, themeActivity2.M);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.n6 n6Var4 = new org.telegram.ui.Cells.n6(themeActivity.getParentActivity(), null);
            n6Var4.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            n6Var4.a(org.telegram.ui.ActionBar.t6.x0(null, i21, false), org.telegram.ui.ActionBar.t6.x0(null, i22, false));
            String L0 = org.telegram.messenger.cd.L0(2131748450, null);
            String L02 = org.telegram.messenger.cd.L0(2131748451, null);
            boolean z14 = org.telegram.messenger.tz.u0;
            n6Var4.a.setText(L0);
            TextView textView = n6Var4.b;
            textView.setVisibility(0);
            textView.setText(L02);
            n6Var4.c.a(z14, false);
            org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i23, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i23);
            n6Var4.setBackground(h05);
            org.telegram.ui.ActionBar.a7.k(n6Var4, h05, null, N4, null);
            f14.addView(n6Var4);
            n6Var4.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.m71
                public final /* synthetic */ ThemeActivity b;

                {
                    this.b = themeActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i24 = i13;
                    AtomicReference atomicReference4 = atomicReference3;
                    ThemeActivity themeActivity2 = this.b;
                    switch (i24) {
                        case 0:
                            themeActivity2.getClass();
                            org.telegram.messenger.tz.u0 = false;
                            org.telegram.messenger.tz.y();
                            themeActivity2.N0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            s4.c1 K = themeActivity2.b.K(themeActivity2.M);
                            if (K != null) {
                                themeActivity2.a.t(K, themeActivity2.M);
                                break;
                            }
                            break;
                        default:
                            w7.c6.c(R.raw.permission_request_microphone, 2131747326, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new f11(2, themeActivity2, atomicReference4));
                            org.telegram.messenger.tz.u0 = true;
                            org.telegram.messenger.tz.y();
                            themeActivity2.N0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            s4.c1 K2 = themeActivity2.b.K(themeActivity2.M);
                            if (K2 != null) {
                                themeActivity2.a.t(K2, themeActivity2.M);
                                break;
                            }
                            break;
                    }
                }
            });
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder3.a.R = org.telegram.messenger.cd.L0(2131748454, null);
            alertDialog$Builder3.o(f14);
            alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
            atomicReference3.set(x1Var3);
            themeActivity.showDialog(x1Var3);
            return;
        }
        if (i10 == themeActivity.D) {
            org.telegram.messenger.tz.x0 = !org.telegram.messenger.tz.x0;
            SharedPreferences.Editor edit8 = org.telegram.messenger.vp.d1().edit();
            edit8.putBoolean("direct_share", org.telegram.messenger.tz.x0);
            edit8.apply();
            g0.f.n(org.telegram.messenger.w0.b);
            org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).m();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.x0);
                return;
            }
            return;
        }
        if (i10 == themeActivity.sensitiveContentRow) {
            if (themeActivity.getMessagesController().P4()) {
                themeActivity.getMessagesController().C4(false);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(themeActivity.getMessagesController().P4());
                    return;
                }
                return;
            }
            t11 t11Var = new t11(5, themeActivity, view);
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
            alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131751813, null);
            alertDialog$Builder4.a.T = org.telegram.messenger.cd.L0(2131751814, null);
            alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131751817, null), new ep0(14, themeActivity, t11Var));
            alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            themeActivity.showDialog(alertDialog$Builder4.a);
            return;
        }
        if (i10 == themeActivity.P) {
            return;
        }
        if (i10 == themeActivity.Q) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder5.a.R = org.telegram.messenger.cd.L0(2131745309, "SortBy");
            alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.cd.L0(2131751601, "Default"), org.telegram.messenger.cd.L0(2131745305, "SortFirstName"), org.telegram.messenger.cd.L0(2131745304, "SortLastName")}, new ey(themeActivity, i10, i16));
            alertDialog$Builder5.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
            themeActivity.showDialog(alertDialog$Builder5.a);
            return;
        }
        if (i10 == themeActivity.s0) {
            int i24 = org.telegram.messenger.tz.a;
            org.telegram.messenger.sc.i = !org.telegram.messenger.sc.e(256) ? 256 | org.telegram.messenger.sc.d(true) : org.telegram.messenger.sc.d(true) & (-257);
            org.telegram.messenger.sc.k();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.f());
                return;
            }
            return;
        }
        if (i10 == themeActivity.nightThemeRow) {
            if ((!org.telegram.messenger.cd.X || f7 > org.telegram.messenger.i0.L(76.0f)) && (org.telegram.messenger.cd.X || f7 < view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) {
                themeActivity.presentFragment(new ThemeActivity(1));
                return;
            }
            org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
            if (org.telegram.ui.ActionBar.t6.o == 0) {
                org.telegram.ui.ActionBar.t6.o = 2;
                l5Var.setChecked(true);
            } else {
                org.telegram.ui.ActionBar.t6.o = 0;
                l5Var.setChecked(false);
            }
            org.telegram.ui.ActionBar.t6.w1();
            org.telegram.ui.ActionBar.t6.F(true);
            boolean z15 = org.telegram.ui.ActionBar.t6.o != 0;
            String C0 = z15 ? org.telegram.ui.ActionBar.t6.C0() : org.telegram.messenger.cd.L0(2131753783, "AutoNightThemeOff");
            if (z15) {
                int i25 = org.telegram.ui.ActionBar.t6.o;
                C0 = a1.g.C(i25 == 1 ? org.telegram.messenger.cd.L0(2131753787, "AutoNightScheduled") : i25 == 3 ? org.telegram.messenger.cd.L0(2131753786, "AutoNightSystemDefault") : org.telegram.messenger.cd.L0(2131753796, "AutoNightAdaptive"), " ", C0);
            }
            l5Var.b(org.telegram.messenger.cd.L0(2131753784, "AutoNightTheme"), C0, R.drawable.menu_night_mode_24, z15, 0, false, true, false);
            return;
        }
        if (i10 == themeActivity.browserRow) {
            if ((!org.telegram.messenger.cd.X || f7 > org.telegram.messenger.i0.L(76.0f)) && (org.telegram.messenger.cd.X || f7 < view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) {
                themeActivity.presentFragment(new org.telegram.ui.web.p1(null));
                return;
            }
            org.telegram.ui.Cells.l5 l5Var2 = (org.telegram.ui.Cells.l5) view;
            org.telegram.messenger.vp messagesController = themeActivity.getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.z8;
            if (tL_webBrowserSettings != null) {
                messagesController.r5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
            }
            l5Var2.setChecked(themeActivity.getMessagesController().K2());
            return;
        }
        if (i10 == themeActivity.R) {
            if (org.telegram.ui.ActionBar.t6.o == 0) {
                return;
            }
            org.telegram.ui.ActionBar.t6.o = 0;
            themeActivity.E0(true);
            org.telegram.ui.ActionBar.t6.F(false);
            return;
        }
        if (i10 == themeActivity.S) {
            if (org.telegram.ui.ActionBar.t6.o == 1) {
                return;
            }
            org.telegram.ui.ActionBar.t6.o = 1;
            if (org.telegram.ui.ActionBar.t6.p) {
                themeActivity.F0(null, true);
            }
            themeActivity.E0(true);
            org.telegram.ui.ActionBar.t6.F(false);
            return;
        }
        if (i10 == themeActivity.T) {
            if (org.telegram.ui.ActionBar.t6.o == 2) {
                return;
            }
            org.telegram.ui.ActionBar.t6.o = 2;
            themeActivity.E0(true);
            org.telegram.ui.ActionBar.t6.F(false);
            return;
        }
        if (i10 == themeActivity.U) {
            if (org.telegram.ui.ActionBar.t6.o == 3) {
                return;
            }
            org.telegram.ui.ActionBar.t6.o = 3;
            themeActivity.E0(true);
            org.telegram.ui.ActionBar.t6.F(false);
            return;
        }
        if (i10 == themeActivity.X) {
            boolean z16 = !org.telegram.ui.ActionBar.t6.p;
            org.telegram.ui.ActionBar.t6.p = z16;
            ((org.telegram.ui.Cells.t8) view).setChecked(z16);
            themeActivity.E0(true);
            if (org.telegram.ui.ActionBar.t6.p) {
                themeActivity.F0(null, true);
            }
            org.telegram.ui.ActionBar.t6.F(false);
            return;
        }
        if (i10 == themeActivity.a0 || i10 == themeActivity.b0) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            if (i10 == themeActivity.a0) {
                i11 = org.telegram.ui.ActionBar.t6.r;
                i12 = i11 / 60;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.s;
                i12 = i11 / 60;
            }
            int i26 = i11 - (i12 * 60);
            final org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.e71
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i27, int i28) {
                    int i29 = (i27 * 60) + i28;
                    int i30 = ThemeActivity.this.a0;
                    int i31 = i10;
                    org.telegram.ui.Cells.x9 x9Var2 = x9Var;
                    if (i31 == i30) {
                        org.telegram.ui.ActionBar.t6.r = i29;
                        x9Var2.c(org.telegram.messenger.cd.L0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i27), Integer.valueOf(i28)), false, true);
                    } else {
                        org.telegram.ui.ActionBar.t6.s = i29;
                        x9Var2.c(org.telegram.messenger.cd.L0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i27), Integer.valueOf(i28)), false, true);
                    }
                }
            }, i12, i26, true));
            return;
        }
        if (i10 == themeActivity.Y) {
            themeActivity.F0(null, true);
            return;
        }
        if (i10 == themeActivity.createNewThemeRow) {
            themeActivity.A0();
            return;
        }
        if (i10 == themeActivity.y0) {
            themeActivity.B0();
        } else if (i10 == themeActivity.stickersRow) {
            themeActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == themeActivity.liteModeRow) {
            themeActivity.presentFragment(new bb0());
        }
    }

    public static void b0(ThemeActivity themeActivity, t11 t11Var) {
        G0(themeActivity.currentAccount, themeActivity.getParentActivity(), new f11(3, themeActivity, t11Var), themeActivity.getResourceProvider());
    }

    public static boolean c0(ThemeActivity themeActivity, int i10, boolean z10) {
        if (i10 == org.telegram.messenger.tz.Y0) {
            return false;
        }
        org.telegram.messenger.tz.Y0 = i10;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.tz.Y0);
        edit.commit();
        s4.c1 K = themeActivity.b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.a;
            if (view instanceof y71) {
                y71 y71Var = (y71) view;
                org.telegram.ui.Cells.q1[] cells = y71Var.a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().Q1 = false;
                    cells[i11].requestLayout();
                }
                y71Var.invalidate();
            }
        }
        s4.c1 K2 = themeActivity.b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.a;
            if (view2 instanceof o71) {
                o71 o71Var = (o71) view2;
                if (z10) {
                    o71Var.requestLayout();
                } else {
                    o71Var.invalidate();
                }
            }
        }
        themeActivity.D0();
        return true;
    }

    public static boolean o0(ThemeActivity themeActivity, int i10) {
        if (i10 != org.telegram.messenger.tz.W0) {
            org.telegram.messenger.tz.W0 = i10;
            org.telegram.messenger.tz.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.tz.W0);
                edit.commit();
                org.telegram.ui.ActionBar.t6.Q();
                s4.c1 K = themeActivity.b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof y71) {
                        org.telegram.ui.Cells.q1[] cells = ((y71) view).a.getCells();
                        for (int i11 = 0; i11 < cells.length; i11++) {
                            cells[i11].getMessageObject().Q1 = false;
                            cells[i11].requestLayout();
                        }
                    }
                }
                themeActivity.D0();
                return true;
            }
        }
        return false;
    }

    public final void A0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131748275, "NewTheme");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131751712, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751704, "CreateTheme"), new f71(this, 2));
        showDialog(x1Var);
    }

    public final void B0() {
        org.telegram.ui.ActionBar.s6 D0 = org.telegram.ui.ActionBar.t6.D0();
        presentFragment(new m91(D0, false, 1, D0.k(false).a >= 100, this.f == 1));
    }

    public final void D0() {
        org.telegram.ui.ActionBar.m6 m6Var;
        if (this.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.s6 D0 = org.telegram.ui.ActionBar.t6.D0();
        org.telegram.ui.ActionBar.r6 k10 = D0.k(false);
        ArrayList arrayList = D0.b0;
        if (arrayList == null || arrayList.isEmpty() || k10 == null || k10.a < 100) {
            this.s.t(2);
            this.s.t(3);
        } else {
            this.s.S(2);
            this.s.S(3);
        }
        int i10 = org.telegram.messenger.i0.Q1() ? 18 : 16;
        org.telegram.ui.ActionBar.s6 D02 = org.telegram.ui.ActionBar.t6.D0();
        if (org.telegram.messenger.tz.W0 == i10 && org.telegram.messenger.tz.Y0 == 17 && D02.S && D02.Y == org.telegram.ui.ActionBar.t6.n && (k10 == null || (m6Var = k10.y) == null || "d".equals(m6Var.c))) {
            this.s.t(4);
        } else {
            this.s.S(4);
        }
    }

    public final void E0(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TLRPC.TL_theme tL_theme;
        int i16 = this.J0;
        int i17 = this.q0;
        int i18 = this.y0;
        int i19 = this.E;
        this.J0 = 0;
        this.P = -1;
        this.Q = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.h0 = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.g0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.x = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.bubbleRadiusRow = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.s0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.liteModeRow = -1;
        this.G0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.y = -1;
        this.D = -1;
        this.sensitiveContentRow = -1;
        this.N = -1;
        this.E = -1;
        this.raiseToListenRow = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.O = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.createNewThemeRow = -1;
        this.H0 = -1;
        this.appIconSelectorRow = -1;
        this.I0 = -1;
        this.z0 = -1;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.t6.F.size();
        int i20 = 0;
        while (true) {
            i10 = this.f;
            if (i20 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) org.telegram.ui.ActionBar.t6.F.get(i20);
            if (i10 == 0 || i10 == 3 || ((s6Var.b != null || s6Var.q()) && ((tL_theme = s6Var.F) == null || tL_theme.document != null))) {
                if (s6Var.b != null) {
                    arrayList2.add(s6Var);
                } else {
                    arrayList.add(s6Var);
                }
            }
            i20++;
        }
        Collections.sort(arrayList, new ex0(3));
        if (i10 == 3) {
            int i21 = this.J0;
            this.w0 = i21;
            this.p0 = i21 + 1;
            this.n0 = i21 + 2;
            this.x0 = i21 + 3;
            this.i0 = i21 + 4;
            this.J0 = i21 + 6;
            this.o0 = i21 + 5;
            boolean z11 = org.telegram.ui.ActionBar.t6.D0().W != 0;
            this.w = z11;
            v71 v71Var = this.c;
            if (v71Var != null) {
                v71Var.setDrawDivider(z11);
            }
            if (this.w) {
                int i22 = this.J0;
                this.J0 = i22 + 1;
                this.q0 = i22;
            }
            int i23 = this.J0;
            this.J0 = i23 + 1;
            this.k0 = i23;
            org.telegram.ui.ActionBar.s6 D0 = org.telegram.ui.ActionBar.t6.D0();
            org.telegram.ui.ActionBar.r6 k10 = D0.k(false);
            ArrayList arrayList3 = D0.b0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.a >= 100) {
                int i24 = this.J0;
                this.J0 = i24 + 1;
                this.y0 = i24;
            }
            int i25 = this.J0;
            this.createNewThemeRow = i25;
            this.J0 = i25 + 2;
            this.z0 = i25 + 1;
        } else if (i10 == 0) {
            int i26 = this.J0;
            this.x = i26;
            this.textSizeRow = i26 + 1;
            this.backgroundRow = i26 + 2;
            this.changeUserColor = i26 + 3;
            this.h0 = i26 + 4;
            this.i0 = i26 + 5;
            this.p0 = i26 + 6;
            this.r0 = i26 + 7;
            this.j0 = i26 + 8;
            this.bubbleRadiusRow = i26 + 9;
            this.k0 = i26 + 10;
            this.l0 = i26 + 11;
            this.m0 = i26 + 12;
            this.n0 = i26 + 13;
            this.H0 = i26 + 14;
            this.appIconSelectorRow = i26 + 15;
            this.I0 = i26 + 16;
            this.t0 = i26 + 17;
            this.u0 = i26 + 18;
            this.v0 = i26 + 19;
            this.nightThemeRow = i26 + 20;
            this.browserRow = i26 + 21;
            this.liteModeRow = i26 + 22;
            this.stickersRow = i26 + 23;
            this.B0 = i26 + 24;
            this.E0 = i26 + 25;
            this.F = i26 + 26;
            int i27 = i26 + 28;
            this.J0 = i27;
            this.raiseToListenRow = i26 + 27;
            if (org.telegram.messenger.tz.s0) {
                this.J0 = i26 + 29;
                this.E = i27;
            }
            int i28 = this.J0;
            this.pauseOnRecordRow = i28;
            this.pauseOnMediaRow = i28 + 1;
            this.M = i28 + 2;
            this.C0 = i28 + 3;
            this.F0 = i28 + 4;
            this.J0 = i28 + 6;
            this.D = i28 + 5;
            TL_account.contentSettings contentsettings = getMessagesController().n8;
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                int i29 = this.J0;
                this.J0 = i29 + 1;
                this.sensitiveContentRow = i29;
            }
            int i30 = this.J0;
            this.G = i30;
            this.K = i30 + 1;
            this.J0 = i30 + 3;
            this.D0 = i30 + 2;
        } else {
            int i31 = this.J0;
            this.R = i31;
            this.S = i31 + 1;
            int i32 = i31 + 3;
            this.J0 = i32;
            this.T = i31 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.J0 = i31 + 4;
                this.U = i32;
            }
            int i33 = this.J0;
            int i34 = i33 + 1;
            this.J0 = i34;
            this.V = i33;
            int i35 = org.telegram.ui.ActionBar.t6.o;
            if (i35 == 1) {
                this.W = i34;
                int i36 = i33 + 3;
                this.J0 = i36;
                this.X = i33 + 2;
                if (org.telegram.ui.ActionBar.t6.p) {
                    this.Y = i36;
                    this.J0 = i33 + 5;
                    this.Z = i33 + 4;
                } else {
                    this.a0 = i36;
                    this.b0 = i33 + 4;
                    this.J0 = i33 + 6;
                    this.c0 = i33 + 5;
                }
            } else if (i35 == 2) {
                this.d0 = i34;
                this.e0 = i33 + 2;
                this.J0 = i33 + 4;
                this.f0 = i33 + 3;
            }
            if (org.telegram.ui.ActionBar.t6.o != 0) {
                int i37 = this.J0;
                this.g0 = i37;
                this.J0 = i37 + 2;
                this.o0 = i37 + 1;
                boolean z12 = org.telegram.ui.ActionBar.t6.J.W != 0;
                this.w = z12;
                v71 v71Var2 = this.c;
                if (v71Var2 != null) {
                    v71Var2.setDrawDivider(z12);
                }
                if (this.w) {
                    int i38 = this.J0;
                    this.J0 = i38 + 1;
                    this.q0 = i38;
                }
                int i39 = this.J0;
                this.J0 = i39 + 1;
                this.r0 = i39;
            }
        }
        v71 v71Var3 = this.c;
        if (v71Var3 != null) {
            int width = this.b.getWidth();
            int i40 = v71Var3.n3;
            org.telegram.ui.Cells.fa faVar = v71Var3.j3;
            if (i40 != faVar.b()) {
                faVar.f();
                if (v71Var3.i3 != (v71Var3.m3 == 1 ? org.telegram.ui.ActionBar.t6.J : org.telegram.ui.ActionBar.t6.D0())) {
                    v71Var3.A1(width);
                }
            }
        }
        x71 x71Var = this.a;
        if (x71Var != null) {
            if (i10 == 1 && (i14 = this.L0) != (i15 = org.telegram.ui.ActionBar.t6.o) && i14 != -1) {
                int i41 = this.V;
                int i42 = i41 + 1;
                if (i14 != i15) {
                    int i43 = 0;
                    while (i43 < 4) {
                        org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) this.b.K(i43);
                        if (ck0Var != null) {
                            View view = ck0Var.a;
                            if (view instanceof org.telegram.ui.Cells.aa) {
                                ((org.telegram.ui.Cells.aa) view).setTypeChecked(i43 == org.telegram.ui.ActionBar.t6.o);
                            }
                        }
                        i43++;
                    }
                    int i44 = org.telegram.ui.ActionBar.t6.o;
                    if (i44 == 0) {
                        this.a.p(i42, i16 - i42);
                    } else if (i44 == 1) {
                        int i45 = this.L0;
                        if (i45 == 0) {
                            this.a.o(i42, this.J0 - i42);
                        } else if (i45 == 2) {
                            this.a.p(i42, 3);
                            this.a.o(i42, org.telegram.ui.ActionBar.t6.p ? 4 : 5);
                        } else if (i45 == 3) {
                            this.a.o(i42, org.telegram.ui.ActionBar.t6.p ? 4 : 5);
                        }
                    } else if (i44 == 2) {
                        int i46 = this.L0;
                        if (i46 == 0) {
                            this.a.o(i42, this.J0 - i42);
                        } else if (i46 == 1) {
                            this.a.p(i42, org.telegram.ui.ActionBar.t6.p ? 4 : 5);
                            this.a.o(i42, 3);
                        } else if (i46 == 3) {
                            this.a.o(i42, 3);
                        }
                    } else if (i44 == 3) {
                        int i47 = this.L0;
                        if (i47 == 0) {
                            this.a.o(i42, this.J0 - i42);
                        } else if (i47 == 2) {
                            this.a.p(i42, 3);
                        } else if (i47 == 1) {
                            this.a.p(i42, org.telegram.ui.ActionBar.t6.p ? 4 : 5);
                        }
                    }
                } else {
                    boolean z13 = this.M0;
                    boolean z14 = org.telegram.ui.ActionBar.t6.p;
                    if (z13 != z14) {
                        int i48 = i41 + 3;
                        x71Var.p(i48, z14 ? 3 : 2);
                        this.a.o(i48, org.telegram.ui.ActionBar.t6.p ? 2 : 3);
                    }
                }
            } else if (z10 || this.L0 == -1) {
                x71Var.f();
            } else {
                if (i17 == -1 && (i13 = this.q0) != -1) {
                    x71Var.i(i13);
                } else if (i17 == -1 || this.q0 != -1) {
                    int i49 = this.q0;
                    if (i49 != -1) {
                        x71Var.g(i49);
                    }
                } else {
                    x71Var.s(i17);
                    if (i18 != -1) {
                        i18--;
                    }
                }
                if (i18 == -1 && (i12 = this.y0) != -1) {
                    this.a.i(i12);
                } else if (i18 != -1 && this.y0 == -1) {
                    this.a.s(i18);
                }
                if (i19 == -1 && (i11 = this.E) != -1) {
                    this.a.i(i11);
                } else if (i19 != -1 && this.E == -1) {
                    this.a.s(i19);
                }
            }
        }
        if (i10 == 1) {
            this.M0 = org.telegram.ui.ActionBar.t6.p;
            this.L0 = org.telegram.ui.ActionBar.t6.o;
        }
        D0();
    }

    public final void F0(Location location, boolean z10) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        int i10 = 0;
        int i11 = 1;
        if (getParentActivity() != null) {
            if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) org.telegram.messenger.w0.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i12 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.t6.x0(null, i12, false), null);
                    alertDialog$Builder.n(i12, null);
                    alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131749539, "GpsDisabledAlertText");
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751806, "ConnectingToProxyEnable"), new f71(this, i11));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                    showDialog(alertDialog$Builder.a);
                    return;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        try {
            location = locationManager.getLastKnownLocation("gps");
            if (location == null) {
                location = locationManager.getLastKnownLocation("network");
            }
            if (location == null) {
                location = locationManager.getLastKnownLocation("passive");
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        if (location == null || z10) {
            if (!this.K0) {
                this.K0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.w0.b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.Q0);
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.R0);
                } catch (Exception e11) {
                    org.telegram.messenger.f8.g(e11, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.t6.x = location.getLatitude();
        org.telegram.ui.ActionBar.t6.y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.t6.x, org.telegram.ui.ActionBar.t6.y);
        org.telegram.ui.ActionBar.t6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.t6.t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.t6.w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.t6.u = calendar.get(5);
        Utilities.e.c(new g71(this, i10));
        org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) this.b.K(this.Z);
        if (ck0Var != null) {
            View view = ck0Var.a;
            if (view instanceof org.telegram.ui.Cells.b9) {
                ((org.telegram.ui.Cells.b9) view).setText(C0());
            }
        }
        if (org.telegram.ui.ActionBar.t6.p && org.telegram.ui.ActionBar.t6.o == 1) {
            org.telegram.ui.ActionBar.t6.F(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.U0 = !org.telegram.ui.ActionBar.t6.k1();
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.f;
        if (i11 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752878, "BrowseThemes"));
            org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
            org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.sun, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            this.S0 = bi0Var;
            if (this.U0) {
                bi0Var.M(bi0Var.e[0] - 1);
            } else {
                bi0Var.M(0);
            }
            org.telegram.ui.Components.bi0 bi0Var2 = this.S0;
            bi0Var2.h = true;
            o10.getClass();
            this.s = o10.c(5, 0, null, bi0Var2, org.telegram.messenger.i0.L(48.0f), null);
        } else if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752210, "ChatSettings"));
            org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, R.drawable.ic_ab_other);
            this.s = b10;
            b10.setContentDescription(org.telegram.messenger.cd.L0(2131754839, "AccDescrMoreOptions"));
            this.s.e(2, R.drawable.msg_share, org.telegram.messenger.cd.L0(2131745444, "ShareTheme"));
            this.s.e(3, R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131751220, "EditThemeColors"));
            this.s.e(1, R.drawable.msg_palette, org.telegram.messenger.cd.L0(2131751710, "CreateNewThemeMenu"));
            this.s.e(4, R.drawable.msg_reset, org.telegram.messenger.cd.L0(2131744173, "ThemeResetToDefaults"));
            if (getMessagesController().n8 == null) {
                getMessagesController().Q0(new s3(this, 23));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131753784, null));
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new n71(this));
        this.a = new x71(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new s4.a0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((s4.j) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new ep0(15, this, context));
        if (i11 == 0) {
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.gr.h);
            jVar.C = false;
            jVar.m = false;
            this.b.setItemAnimator(jVar);
        }
        if (this.T0) {
            E0(false);
            this.T0 = false;
            this.b.v0(this.a.e.J0 - 1);
            org.telegram.messenger.i0.h3(new g71(this, i10), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        org.telegram.ui.ActionBar.x1 x1Var;
        int i13;
        int i14;
        if (i10 == org.telegram.messenger.zs.v4) {
            F0(null, true);
            return;
        }
        if (i10 == org.telegram.messenger.zs.z4 || i10 == org.telegram.messenger.zs.i4) {
            org.telegram.ui.Components.tk0 tk0Var = this.b;
            if (tk0Var != null) {
                tk0Var.g1();
            }
            D0();
            return;
        }
        if (i10 == org.telegram.messenger.zs.R5) {
            x71 x71Var = this.a;
            if (x71Var == null || (i14 = this.browserRow) == -1) {
                return;
            }
            x71Var.g(i14);
            return;
        }
        if (i10 == org.telegram.messenger.zs.q4) {
            x71 x71Var2 = this.a;
            if (x71Var2 == null || (i13 = this.q0) == -1) {
                return;
            }
            x71Var2.h(i13, new Object());
            return;
        }
        if (i10 == org.telegram.messenger.zs.o4) {
            E0(true);
            return;
        }
        if (i10 == org.telegram.messenger.zs.M2) {
            org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) objArr[0];
            org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) objArr[1];
            if (s6Var == this.h && r6Var == this.n) {
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(getMessagesController().U2);
                sb2.append("/addtheme/");
                sb2.append((r6Var != null ? r6Var.r : s6Var.F).slug);
                String sb3 = sb2.toString();
                showDialog(new org.telegram.ui.Components.op0(getParentActivity(), null, sb3, false, sb3, false, null));
                org.telegram.ui.ActionBar.x1 x1Var2 = this.r;
                if (x1Var2 != null) {
                    x1Var2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.N2) {
            org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) objArr[0];
            org.telegram.ui.ActionBar.r6 r6Var2 = (org.telegram.ui.ActionBar.r6) objArr[1];
            if (s6Var2 == this.h && r6Var2 == this.n && (x1Var = this.r) == null) {
                x1Var.dismiss();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.s4) {
            if (getParentActivity() == null || this.isPaused) {
                return;
            }
            this.h = (org.telegram.ui.ActionBar.s6) objArr[0];
            this.n = (org.telegram.ui.ActionBar.r6) objArr[1];
            org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            this.r = x1Var3;
            x1Var3.i0 = true;
            showDialog(x1Var3, new q5(this, 16));
            return;
        }
        if (i10 != org.telegram.messenger.zs.t4) {
            if (i10 == org.telegram.messenger.zs.U4) {
                int i15 = this.p0;
                if (i15 >= 0) {
                    this.a.g(i15);
                    return;
                }
                return;
            }
            if ((i10 == org.telegram.messenger.zs.S3 || i10 == org.telegram.messenger.zs.P3) && (i12 = this.sensitiveContentRow) >= 0) {
                this.a.g(i12);
                return;
            }
            return;
        }
        D0();
        if (this.f != 3) {
            return;
        }
        boolean k12 = org.telegram.ui.ActionBar.t6.k1();
        boolean z10 = !k12;
        if (this.U0 != z10) {
            this.U0 = z10;
            org.telegram.ui.Components.bi0 bi0Var = this.S0;
            bi0Var.P(!k12 ? bi0Var.e[0] - 1 : 0);
            this.s.getIconView().d();
        }
        if (this.p0 >= 0) {
            for (int i16 = 0; i16 < this.b.getChildCount(); i16++) {
                if (this.b.getChildAt(i16) instanceof vu) {
                    ((vu) this.b.getChildAt(i16)).a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.i0.class, org.telegram.ui.Cells.aa.class, y71.class, o71.class, u71.class, org.telegram.ui.Cells.l5.class, org.telegram.ui.Cells.ga.class, w71.class, org.telegram.ui.Cells.p8.class, zm0.class, org.telegram.ui.Components.yx0.class, vu.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s8));
        int i10 = org.telegram.ui.ActionBar.t6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{u71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{u71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.be));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ce));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{y71.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.bc));
        int i13 = org.telegram.ui.ActionBar.t6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
        int i14 = org.telegram.ui.ActionBar.t6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
        arrayList.addAll(w7.f6.a(new g6(22, this), i13, org.telegram.ui.ActionBar.t6.G6, i14));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.v4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.z4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.o4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.q4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.s4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.t4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.U4);
        getNotificationCenter().c(this, org.telegram.messenger.zs.P3);
        getNotificationCenter().c(this, org.telegram.messenger.zs.S3);
        getNotificationCenter().c(this, org.telegram.messenger.zs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.zs.N2);
        getNotificationCenter().c(this, org.telegram.messenger.zs.R5);
        if (this.f == 0) {
            org.telegram.ui.ActionBar.t6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.t6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.K0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.b.getSystemService("location");
        locationManager.removeUpdates(this.Q0);
        locationManager.removeUpdates(this.R0);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.v4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.z4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.o4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.q4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.s4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.t4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.U4);
        getNotificationCenter().n(this, org.telegram.messenger.zs.P3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.S3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.zs.N2);
        getNotificationCenter().n(this, org.telegram.messenger.zs.R5);
        org.telegram.ui.ActionBar.t6.w1();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            E0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
            org.telegram.messenger.i0.k3(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
