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
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class ThemeActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public int A0;
    public int B0;
    public int C0;
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
    public int K0;
    public int L;
    public int L0;
    public int M;
    public boolean M0;
    public int N;
    public int N0;
    public int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public boolean Q0;
    public int R;
    public boolean R0;
    public int S;
    public final w51 S0;
    public int T;
    public final w51 T0;
    public int U;
    public org.telegram.ui.Components.nh0 U0;
    public int V;
    public boolean V0;
    public int W;
    public boolean W0;
    public int X;
    public int Y;
    public int Z;
    public e61 a;
    public int a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.ek0 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public c61 c;
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
    public org.telegram.ui.ActionBar.m6 h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.k6 n;
    public int n0;
    private int nightThemeRow;
    public int o0;
    public int p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int q0;
    public org.telegram.ui.ActionBar.t1 r;
    public int r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.g5 s;
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

    /* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
    public static class InnerAccentView extends View {
        public final Paint a;
        public ObjectAnimator b;
        public float c;
        public org.telegram.ui.ActionBar.m6 d;
        public org.telegram.ui.ActionBar.k6 e;
        public boolean f;

        public InnerAccentView(Context context) {
            super(context);
            this.a = new Paint(1);
        }

        public final void a(boolean z10) {
            this.f = this.d.Z == this.e.a;
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
            float L = org.telegram.messenger.g0.L(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i7 = this.e.c;
            Paint paint = this.a;
            paint.setColor(i7);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            paint.setAlpha(Math.round(this.c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(org.telegram.messenger.ks.e4);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.g0.L(5.0f) * this.c), paint);
            if (this.c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (org.telegram.messenger.g0.L(7.0f) * this.c), measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
                canvas.drawCircle((org.telegram.messenger.g0.L(7.0f) * this.c) + measuredWidth, measuredHeight, org.telegram.messenger.g0.L(2.0f), paint);
            }
            int i10 = this.e.e;
            if (i10 == 0 || this.c == 1.0f) {
                return;
            }
            paint.setColor(i10);
            canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.c) * org.telegram.messenger.g0.L(8.0f), paint);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.N0(2131752003, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override // android.view.View
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(62.0f), TLObject.FLAG_30));
        }

        public void setCheckedState(float f10) {
            this.c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i7) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.S0 = new w51(this);
        this.T0 = new w51(this);
        this.f = i7;
        F0(true);
    }

    public static String D0() {
        int i7 = org.telegram.ui.ActionBar.n6.v;
        int i10 = i7 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i7 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.n6.t;
        int i12 = i11 / 60;
        return org.telegram.messenger.gd.a0("AutoNightUpdateLocationInfo", null, 2131753777, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public static void H0(final int i7, final Context context, final org.telegram.messenger.w10 w10Var, final org.telegram.ui.ActionBar.i6 i6Var) {
        final org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        final String str = u12.x6;
        String str2 = u12.y6;
        final int i10 = u12.z6;
        if (TextUtils.isEmpty(str) || !((org.telegram.messenger.h0) u12.A7.m.b).c) {
            w10Var.a(Boolean.TRUE);
            return;
        }
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        j3.O = g10;
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout, L2, M, null, i6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, c8.na.e(50, 50, 17));
        g10.addView(frameLayout, c8.na.t(80, 80, 1, 0, 20, 0, 8));
        int i12 = org.telegram.ui.ActionBar.n6.j5;
        TextView b10 = c8.wa.b(context, 20.0f, i12, true, i6Var);
        b10.setText(org.telegram.messenger.gd.N0(2131754304, null));
        b10.setGravity(17);
        g10.addView(b10, c8.na.t(-1, -2, 7, 24, 8, 24, 8));
        TextView b11 = c8.wa.b(context, 14.0f, i12, false, i6Var);
        b11.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.O0("AgeVerificationText" + str2)));
        b11.setGravity(17);
        g10.addView(b11, c8.na.t(-1, -2, 7, 24, 0, 24, 0));
        final hi.e eVar = new hi.e(context, i6Var, true);
        eVar.i(org.telegram.messenger.gd.N0(2131754310, null), false, true);
        eVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.o51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final hi.e eVar2 = hi.e.this;
                if (eVar2.R) {
                    return;
                }
                eVar2.setLoading(true);
                final org.telegram.messenger.mp mpVar = u12;
                final String str3 = str;
                final int i13 = i7;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                final int i14 = i10;
                final org.telegram.messenger.w10 w10Var2 = w10Var;
                final org.telegram.ui.ActionBar.w2[] w2VarArr = r9;
                c8.oa.c(R.raw.permission_request_camera, 2131754307, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.w10() { // from class: org.telegram.ui.p51
                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        final hi.e eVar3 = hi.e.this;
                        if (!booleanValue) {
                            eVar3.setLoading(false);
                            return;
                        }
                        final org.telegram.messenger.mp mpVar2 = mpVar;
                        org.telegram.messenger.l10 f22 = mpVar2.f2();
                        final int i15 = i13;
                        final Context context3 = context2;
                        final org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                        final int i16 = i14;
                        final org.telegram.messenger.w10 w10Var3 = w10Var2;
                        final org.telegram.ui.ActionBar.w2[] w2VarArr2 = w2VarArr;
                        f22.a(str3, null, new org.telegram.messenger.w10() { // from class: org.telegram.ui.q51
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r6v2, types: [org.telegram.messenger.t10, org.telegram.ui.r51] */
                            @Override // org.telegram.messenger.w10
                            public final void a(Object obj2) {
                                Long l10 = (Long) obj2;
                                hi.e eVar4 = hi.e.this;
                                if (l10 == null) {
                                    eVar4.setLoading(false);
                                    return;
                                }
                                TLRPC.User c22 = mpVar2.c2(l10);
                                if (c22 == null) {
                                    eVar4.setLoading(false);
                                    return;
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T == null) {
                                    eVar4.setLoading(false);
                                    return;
                                }
                                ki.f4 b12 = ki.f4.b(i15, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, c22, 0, false, false);
                                final ki.t2 t2Var = new ki.t2(context3, i6Var3);
                                final int i17 = i16;
                                final org.telegram.messenger.w10 w10Var4 = w10Var3;
                                ?? r62 = new org.telegram.messenger.t10() { // from class: org.telegram.ui.r51
                                    @Override // org.telegram.messenger.t10
                                    public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        Double d = (Double) obj4;
                                        boolean booleanValue2 = d != null ? d.doubleValue() >= ((double) i17) : ((Boolean) obj3).booleanValue();
                                        t2Var.o(false);
                                        w10Var4.a(Boolean.valueOf(booleanValue2));
                                        org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                        if (!booleanValue2 || T2 == null) {
                                            return;
                                        }
                                        org.telegram.messenger.f3.n(null, 2131754306, org.telegram.ui.Components.kc.b0(T2), R.raw.contact_check, 36);
                                    }
                                };
                                t2Var.M0 = r62;
                                ki.k2 k2Var = t2Var.E;
                                if (k2Var != 0) {
                                    k2Var.setOnVerifiedAge(r62);
                                }
                                t2Var.B(true);
                                t2Var.C0 = false;
                                t2Var.m0 = T.getParentActivity();
                                t2Var.x(T, b12);
                                t2Var.show();
                                eVar4.setLoading(false);
                                w2VarArr2[0].dismiss();
                            }
                        });
                    }
                });
            }
        });
        g10.addView(eVar, c8.na.t(-1, 48, 7, 2, 29, 2, 14));
        j3.show();
        final org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
        j3.O();
    }

    public static void Z(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        e61 e61Var;
        org.telegram.ui.Components.ek0 ek0Var = themeActivity.b;
        if (ek0Var == null || !ek0Var.H || (e61Var = themeActivity.a) == null) {
            return;
        }
        int i7 = themeActivity.sensitiveContentRow;
        boolean z10 = false;
        boolean z11 = i7 >= 0;
        if (contentsettings != null && contentsettings.sensitive_can_change) {
            z10 = true;
        }
        if (z11 == z10) {
            e61Var.g(i7);
        } else {
            themeActivity.F0(true);
        }
    }

    public static void b0(final ThemeActivity themeActivity, Context context, View view, final int i7, float f10) {
        int i10;
        int i11;
        final int i12 = 1;
        if (i7 == themeActivity.O) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            boolean z10 = g12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = g12.edit();
            boolean z11 = !z10;
            edit.putBoolean("view_animations", z11);
            org.telegram.messenger.bz.C1 = Boolean.valueOf(z11);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                return;
            }
            return;
        }
        final int i13 = 0;
        if (i7 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
            return;
        }
        if (i7 == themeActivity.changeUserColor) {
            jm0 jm0Var = new jm0();
            jm0Var.I = themeActivity;
            themeActivity.presentFragment(jm0Var);
            return;
        }
        if (i7 == themeActivity.H) {
            SharedPreferences g13 = org.telegram.messenger.mp.g1();
            boolean z12 = g13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = g13.edit();
            boolean z13 = !z12;
            edit2.putBoolean("send_by_enter", z13);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z13);
                return;
            }
            return;
        }
        if (i7 == themeActivity.F) {
            org.telegram.messenger.bz.r0 = !org.telegram.messenger.bz.r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.mp.g1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.bz.r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.r0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.G) {
            org.telegram.messenger.bz.t0 = !org.telegram.messenger.bz.t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.mp.g1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.bz.t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.t0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.bz.s0 = !org.telegram.messenger.bz.s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.mp.g1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.bz.s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.s0);
            }
            if (!org.telegram.messenger.bz.s0 && themeActivity.F != -1) {
                for (int i14 = 0; i14 < themeActivity.b.getChildCount(); i14++) {
                    View childAt = themeActivity.b.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.r8) {
                        themeActivity.b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.F) {
                            ((org.telegram.ui.Cells.r8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.F0(false);
            return;
        }
        if (i7 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.bz.F0 = !org.telegram.messenger.bz.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.mp.g1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.bz.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.F0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.bz.G0 = !org.telegram.messenger.bz.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.mp.g1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.bz.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.G0);
                return;
            }
            return;
        }
        int i15 = 2;
        float f11 = 4.0f;
        if (i7 == themeActivity.L) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference = new AtomicReference();
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
            CharSequence[] charSequenceArr = {org.telegram.messenger.gd.N0(2131751354, "DistanceUnitsAutomatic"), org.telegram.messenger.gd.N0(2131751353, "DistanceUnitsKilometers"), org.telegram.messenger.gd.N0(2131751352, "DistanceUnitsMiles")};
            final int i16 = 0;
            while (i16 < 3) {
                org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                float f12 = f11;
                j6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f12), 0);
                j6Var.a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.g7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E5, false));
                j6Var.b(charSequenceArr[i16], i16 == org.telegram.messenger.bz.s1);
                int i17 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i17, false), 2, -1);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i17);
                j6Var.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(j6Var, h02, null, M, null);
                g10.addView(j6Var);
                j6Var.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.s51
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
                                org.telegram.messenger.bz.s1 = i16;
                                SharedPreferences.Editor edit8 = org.telegram.messenger.mp.g1().edit();
                                edit8.putInt("distanceSystemType", org.telegram.messenger.bz.s1);
                                edit8.apply();
                                org.telegram.messenger.gd.g0 = null;
                                themeActivity2.Q0 = true;
                                v4.f1 K = themeActivity2.b.K(themeActivity2.L);
                                if (K != null) {
                                    themeActivity2.a.t(K, themeActivity2.L);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                            default:
                                org.telegram.messenger.bz.p0 = i16;
                                SharedPreferences.Editor edit9 = org.telegram.messenger.mp.g1().edit();
                                edit9.putInt("searchEngineType", org.telegram.messenger.bz.p0);
                                edit9.apply();
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.R0 = true;
                                v4.f1 K2 = themeActivity3.b.K(themeActivity3.M);
                                if (K2 != null) {
                                    themeActivity3.a.t(K2, themeActivity3.M);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                        }
                    }
                });
                i16++;
                f11 = f12;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131751351, "DistanceUnitsTitle");
            alertDialog$Builder.o(g10);
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            atomicReference.set(t1Var);
            themeActivity.showDialog(t1Var);
            return;
        }
        if (i7 == themeActivity.M) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference2 = new AtomicReference();
            LinearLayout g11 = org.telegram.messenger.f3.g(context, 1);
            ArrayList b10 = org.telegram.ui.web.e1.b();
            int size = b10.size();
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            final int i18 = 0;
            while (i18 < size) {
                charSequenceArr2[i18] = ((org.telegram.ui.web.e1) b10.get(i18)).a;
                org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                j6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                j6Var2.a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.g7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E5, false));
                j6Var2.b(charSequenceArr2[i18], i18 == org.telegram.messenger.bz.p0);
                int i19 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i19, false), 2, -1);
                org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i19);
                j6Var2.setBackground(h03);
                org.telegram.ui.ActionBar.u6.j(j6Var2, h03, null, M2, null);
                g11.addView(j6Var2);
                j6Var2.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.s51
                    public final /* synthetic */ ThemeActivity b;

                    {
                        this.b = themeActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                ThemeActivity themeActivity2 = this.b;
                                themeActivity2.getClass();
                                org.telegram.messenger.bz.s1 = i18;
                                SharedPreferences.Editor edit8 = org.telegram.messenger.mp.g1().edit();
                                edit8.putInt("distanceSystemType", org.telegram.messenger.bz.s1);
                                edit8.apply();
                                org.telegram.messenger.gd.g0 = null;
                                themeActivity2.Q0 = true;
                                v4.f1 K = themeActivity2.b.K(themeActivity2.L);
                                if (K != null) {
                                    themeActivity2.a.t(K, themeActivity2.L);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                            default:
                                org.telegram.messenger.bz.p0 = i18;
                                SharedPreferences.Editor edit9 = org.telegram.messenger.mp.g1().edit();
                                edit9.putInt("searchEngineType", org.telegram.messenger.bz.p0);
                                edit9.apply();
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.R0 = true;
                                v4.f1 K2 = themeActivity3.b.K(themeActivity3.M);
                                if (K2 != null) {
                                    themeActivity3.a.t(K2, themeActivity3.M);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                        }
                    }
                });
                i18++;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder2.a.S = org.telegram.messenger.gd.N0(2131745603, null);
            alertDialog$Builder2.o(g11);
            alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            atomicReference2.set(t1Var2);
            themeActivity.showDialog(t1Var2);
            return;
        }
        if (i7 == themeActivity.N) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference3 = new AtomicReference();
            LinearLayout g14 = org.telegram.messenger.f3.g(context, 1);
            org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
            j6Var3.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            int i20 = org.telegram.ui.ActionBar.n6.g7;
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i20, false);
            int i21 = org.telegram.ui.ActionBar.n6.E5;
            j6Var3.a(x02, org.telegram.ui.ActionBar.n6.x0(null, i21, false));
            j6Var3.b(org.telegram.messenger.gd.N0(2131748245, null), !org.telegram.messenger.bz.u0);
            int i22 = org.telegram.ui.ActionBar.n6.i6;
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i22, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i22);
            j6Var3.setBackground(h04);
            org.telegram.ui.ActionBar.u6.j(j6Var3, h04, null, M3, null);
            g14.addView(j6Var3);
            j6Var3.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.t51
                public final /* synthetic */ ThemeActivity b;

                {
                    this.b = themeActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i23 = i13;
                    AtomicReference atomicReference4 = atomicReference3;
                    ThemeActivity themeActivity2 = this.b;
                    switch (i23) {
                        case 0:
                            themeActivity2.getClass();
                            org.telegram.messenger.bz.u0 = false;
                            org.telegram.messenger.bz.y();
                            themeActivity2.P0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.f1 K = themeActivity2.b.K(themeActivity2.N);
                            if (K != null) {
                                themeActivity2.a.t(K, themeActivity2.N);
                                break;
                            }
                            break;
                        default:
                            c8.oa.c(R.raw.permission_request_microphone, 2131747116, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new a31(1, themeActivity2, atomicReference4));
                            org.telegram.messenger.bz.u0 = true;
                            org.telegram.messenger.bz.y();
                            themeActivity2.P0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.f1 K2 = themeActivity2.b.K(themeActivity2.N);
                            if (K2 != null) {
                                themeActivity2.a.t(K2, themeActivity2.N);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.j6 j6Var4 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
            j6Var4.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var4.a(org.telegram.ui.ActionBar.n6.x0(null, i20, false), org.telegram.ui.ActionBar.n6.x0(null, i21, false));
            String N0 = org.telegram.messenger.gd.N0(2131748242, null);
            String N02 = org.telegram.messenger.gd.N0(2131748243, null);
            boolean z14 = org.telegram.messenger.bz.u0;
            j6Var4.a.setText(N0);
            TextView textView = j6Var4.b;
            textView.setVisibility(0);
            textView.setText(N02);
            j6Var4.c.a(z14, false);
            org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i22, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i22);
            j6Var4.setBackground(h05);
            org.telegram.ui.ActionBar.u6.j(j6Var4, h05, null, M4, null);
            g14.addView(j6Var4);
            j6Var4.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.t51
                public final /* synthetic */ ThemeActivity b;

                {
                    this.b = themeActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i23 = i12;
                    AtomicReference atomicReference4 = atomicReference3;
                    ThemeActivity themeActivity2 = this.b;
                    switch (i23) {
                        case 0:
                            themeActivity2.getClass();
                            org.telegram.messenger.bz.u0 = false;
                            org.telegram.messenger.bz.y();
                            themeActivity2.P0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.f1 K = themeActivity2.b.K(themeActivity2.N);
                            if (K != null) {
                                themeActivity2.a.t(K, themeActivity2.N);
                                break;
                            }
                            break;
                        default:
                            c8.oa.c(R.raw.permission_request_microphone, 2131747116, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new a31(1, themeActivity2, atomicReference4));
                            org.telegram.messenger.bz.u0 = true;
                            org.telegram.messenger.bz.y();
                            themeActivity2.P0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.f1 K2 = themeActivity2.b.K(themeActivity2.N);
                            if (K2 != null) {
                                themeActivity2.a.t(K2, themeActivity2.N);
                                break;
                            }
                            break;
                    }
                }
            });
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder3.a.S = org.telegram.messenger.gd.N0(2131748246, null);
            alertDialog$Builder3.o(g14);
            alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
            atomicReference3.set(t1Var3);
            themeActivity.showDialog(t1Var3);
            return;
        }
        if (i7 == themeActivity.E) {
            org.telegram.messenger.bz.x0 = !org.telegram.messenger.bz.x0;
            SharedPreferences.Editor edit8 = org.telegram.messenger.mp.g1().edit();
            edit8.putBoolean("direct_share", org.telegram.messenger.bz.x0);
            edit8.apply();
            g0.g.n(org.telegram.messenger.t0.b);
            org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).o();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.x0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.sensitiveContentRow) {
            if (themeActivity.getMessagesController().e5()) {
                themeActivity.getMessagesController().Q4(false);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().e5());
                    return;
                }
                return;
            }
            iy0 iy0Var = new iy0(10, themeActivity, view);
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
            alertDialog$Builder4.a.S = org.telegram.messenger.gd.N0(2131751801, null);
            alertDialog$Builder4.a.U = org.telegram.messenger.gd.N0(2131751802, null);
            alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131751805, null), new yi0(18, themeActivity, iy0Var));
            alertDialog$Builder4.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            themeActivity.showDialog(alertDialog$Builder4.a);
            return;
        }
        if (i7 == themeActivity.Q) {
            return;
        }
        if (i7 == themeActivity.R) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder5.a.S = org.telegram.messenger.gd.N0(2131745095, "SortBy");
            alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.gd.N0(2131751588, "Default"), org.telegram.messenger.gd.N0(2131745091, "SortFirstName"), org.telegram.messenger.gd.N0(2131745090, "SortLastName")}, new ex(themeActivity, i7, i15));
            alertDialog$Builder5.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
            themeActivity.showDialog(alertDialog$Builder5.a);
            return;
        }
        if (i7 == themeActivity.t0) {
            int i23 = org.telegram.messenger.bz.a;
            org.telegram.messenger.pc.i = !org.telegram.messenger.pc.e(256) ? 256 | org.telegram.messenger.pc.d(true) : org.telegram.messenger.pc.d(true) & (-257);
            org.telegram.messenger.pc.k();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.f());
                return;
            }
            return;
        }
        if (i7 == themeActivity.nightThemeRow) {
            if ((!org.telegram.messenger.gd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.gd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                themeActivity.presentFragment(new ThemeActivity(1));
                return;
            }
            org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
            if (org.telegram.ui.ActionBar.n6.o == 0) {
                org.telegram.ui.ActionBar.n6.o = 2;
                i5Var.setChecked(true);
            } else {
                org.telegram.ui.ActionBar.n6.o = 0;
                i5Var.setChecked(false);
            }
            org.telegram.ui.ActionBar.n6.w1();
            org.telegram.ui.ActionBar.n6.F(true);
            boolean z15 = org.telegram.ui.ActionBar.n6.o != 0;
            String C0 = z15 ? org.telegram.ui.ActionBar.n6.C0() : org.telegram.messenger.gd.N0(2131753780, "AutoNightThemeOff");
            if (z15) {
                int i24 = org.telegram.ui.ActionBar.n6.o;
                C0 = a8.p0.E(i24 == 1 ? org.telegram.messenger.gd.N0(2131753784, "AutoNightScheduled") : i24 == 3 ? org.telegram.messenger.gd.N0(2131753783, "AutoNightSystemDefault") : org.telegram.messenger.gd.N0(2131753793, "AutoNightAdaptive"), " ", C0);
            }
            i5Var.b(org.telegram.messenger.gd.N0(2131753781, "AutoNightTheme"), C0, R.drawable.menu_night_mode_24, z15, 0, false, true, false);
            return;
        }
        if (i7 == themeActivity.browserRow) {
            if ((!org.telegram.messenger.gd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.gd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                themeActivity.presentFragment(new org.telegram.ui.web.n1(null));
                return;
            }
            org.telegram.ui.Cells.i5 i5Var2 = (org.telegram.ui.Cells.i5) view;
            org.telegram.messenger.mp messagesController = themeActivity.getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.E8;
            if (tL_webBrowserSettings != null) {
                messagesController.G5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
            }
            i5Var2.setChecked(themeActivity.getMessagesController().S2());
            return;
        }
        if (i7 == themeActivity.S) {
            if (org.telegram.ui.ActionBar.n6.o == 0) {
                return;
            }
            org.telegram.ui.ActionBar.n6.o = 0;
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.n6.F(false);
            return;
        }
        if (i7 == themeActivity.T) {
            if (org.telegram.ui.ActionBar.n6.o == 1) {
                return;
            }
            org.telegram.ui.ActionBar.n6.o = 1;
            if (org.telegram.ui.ActionBar.n6.p) {
                themeActivity.G0(null, true);
            }
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.n6.F(false);
            return;
        }
        if (i7 == themeActivity.U) {
            if (org.telegram.ui.ActionBar.n6.o == 2) {
                return;
            }
            org.telegram.ui.ActionBar.n6.o = 2;
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.n6.F(false);
            return;
        }
        if (i7 == themeActivity.V) {
            if (org.telegram.ui.ActionBar.n6.o == 3) {
                return;
            }
            org.telegram.ui.ActionBar.n6.o = 3;
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.n6.F(false);
            return;
        }
        if (i7 == themeActivity.Y) {
            boolean z16 = !org.telegram.ui.ActionBar.n6.p;
            org.telegram.ui.ActionBar.n6.p = z16;
            ((org.telegram.ui.Cells.r8) view).setChecked(z16);
            themeActivity.F0(true);
            if (org.telegram.ui.ActionBar.n6.p) {
                themeActivity.G0(null, true);
            }
            org.telegram.ui.ActionBar.n6.F(false);
            return;
        }
        if (i7 == themeActivity.b0 || i7 == themeActivity.c0) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            if (i7 == themeActivity.b0) {
                i10 = org.telegram.ui.ActionBar.n6.r;
                i11 = i10 / 60;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.s;
                i11 = i10 / 60;
            }
            int i25 = i10 - (i11 * 60);
            final org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.l51
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i26, int i27) {
                    int i28 = (i26 * 60) + i27;
                    int i29 = ThemeActivity.this.b0;
                    int i30 = i7;
                    org.telegram.ui.Cells.w9 w9Var2 = w9Var;
                    if (i30 == i29) {
                        org.telegram.ui.ActionBar.n6.r = i28;
                        w9Var2.c(org.telegram.messenger.gd.N0(2131753789, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i27)), false, true);
                    } else {
                        org.telegram.ui.ActionBar.n6.s = i28;
                        w9Var2.c(org.telegram.messenger.gd.N0(2131753779, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i27)), false, true);
                    }
                }
            }, i11, i25, true));
            return;
        }
        if (i7 == themeActivity.Z) {
            themeActivity.G0(null, true);
            return;
        }
        if (i7 == themeActivity.createNewThemeRow) {
            themeActivity.B0();
            return;
        }
        if (i7 == themeActivity.z0) {
            themeActivity.C0();
            return;
        }
        if (i7 == themeActivity.stickersRow) {
            themeActivity.presentFragment(new StickersActivity(0, null));
        } else if (i7 == themeActivity.B0) {
            themeActivity.presentFragment(new ai.r2());
        } else if (i7 == themeActivity.liteModeRow) {
            themeActivity.presentFragment(new y90());
        }
    }

    public static void c0(ThemeActivity themeActivity, iy0 iy0Var) {
        H0(themeActivity.currentAccount, themeActivity.getParentActivity(), new a31(2, themeActivity, iy0Var), themeActivity.getResourceProvider());
    }

    public static boolean d0(ThemeActivity themeActivity, int i7, boolean z10) {
        if (i7 == org.telegram.messenger.bz.Y0) {
            return false;
        }
        org.telegram.messenger.bz.Y0 = i7;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.bz.Y0);
        edit.commit();
        v4.f1 K = themeActivity.b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.a;
            if (view instanceof f61) {
                f61 f61Var = (f61) view;
                org.telegram.ui.Cells.r1[] cells = f61Var.a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().S1 = false;
                    cells[i10].requestLayout();
                }
                f61Var.invalidate();
            }
        }
        v4.f1 K2 = themeActivity.b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.a;
            if (view2 instanceof v51) {
                v51 v51Var = (v51) view2;
                if (z10) {
                    v51Var.requestLayout();
                } else {
                    v51Var.invalidate();
                }
            }
        }
        themeActivity.E0();
        return true;
    }

    public static boolean p0(ThemeActivity themeActivity, int i7) {
        if (i7 != org.telegram.messenger.bz.W0) {
            org.telegram.messenger.bz.W0 = i7;
            org.telegram.messenger.bz.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.bz.W0);
                edit.commit();
                org.telegram.ui.ActionBar.n6.Q();
                v4.f1 K = themeActivity.b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof f61) {
                        org.telegram.ui.Cells.r1[] cells = ((f61) view).a.getCells();
                        for (int i10 = 0; i10 < cells.length; i10++) {
                            cells[i10].getMessageObject().S1 = false;
                            cells[i10].requestLayout();
                        }
                    }
                }
                themeActivity.E0();
                return true;
            }
        }
        return false;
    }

    public final void B0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131748065, "NewTheme");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131751699, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751691, "CreateTheme"), new m51(this, 2));
        showDialog(t1Var);
    }

    public final void C0() {
        org.telegram.ui.ActionBar.m6 D0 = org.telegram.ui.ActionBar.n6.D0();
        presentFragment(new v71(D0, false, 1, D0.k(false).a >= 100, this.f == 1));
    }

    public final void E0() {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (this.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.m6 D0 = org.telegram.ui.ActionBar.n6.D0();
        org.telegram.ui.ActionBar.k6 k10 = D0.k(false);
        ArrayList arrayList = D0.c0;
        if (arrayList == null || arrayList.isEmpty() || k10 == null || k10.a < 100) {
            this.s.u(2);
            this.s.u(3);
        } else {
            this.s.T(2);
            this.s.T(3);
        }
        int i7 = org.telegram.messenger.g0.Q1() ? 18 : 16;
        org.telegram.ui.ActionBar.m6 D02 = org.telegram.ui.ActionBar.n6.D0();
        if (org.telegram.messenger.bz.W0 == i7 && org.telegram.messenger.bz.Y0 == 17 && D02.T && D02.Z == org.telegram.ui.ActionBar.n6.n && (k10 == null || (e6Var = k10.y) == null || "d".equals(e6Var.c))) {
            this.s.u(4);
        } else {
            this.s.T(4);
        }
    }

    public final void F0(boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_theme tL_theme;
        int i15 = this.L0;
        int i16 = this.r0;
        int i17 = this.z0;
        int i18 = this.F;
        this.L0 = 0;
        this.Q = -1;
        this.R = -1;
        this.Y = -1;
        this.Z = -1;
        this.a0 = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.i0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.h0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.x = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.bubbleRadiusRow = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.t0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.liteModeRow = -1;
        this.I0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.y = -1;
        this.E = -1;
        this.sensitiveContentRow = -1;
        this.O = -1;
        this.F = -1;
        this.raiseToListenRow = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.createNewThemeRow = -1;
        this.J0 = -1;
        this.appIconSelectorRow = -1;
        this.K0 = -1;
        this.A0 = -1;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.n6.F.size();
        int i19 = 0;
        while (true) {
            i7 = this.f;
            if (i19 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) org.telegram.ui.ActionBar.n6.F.get(i19);
            if (i7 == 0 || i7 == 3 || ((m6Var.b != null || m6Var.q()) && ((tL_theme = m6Var.G) == null || tL_theme.document != null))) {
                if (m6Var.b != null) {
                    arrayList2.add(m6Var);
                } else {
                    arrayList.add(m6Var);
                }
            }
            i19++;
        }
        Collections.sort(arrayList, new ow0(2));
        if (i7 == 3) {
            int i20 = this.L0;
            this.x0 = i20;
            this.q0 = i20 + 1;
            this.o0 = i20 + 2;
            this.y0 = i20 + 3;
            this.j0 = i20 + 4;
            this.L0 = i20 + 6;
            this.p0 = i20 + 5;
            boolean z11 = org.telegram.ui.ActionBar.n6.D0().X != 0;
            this.w = z11;
            c61 c61Var = this.c;
            if (c61Var != null) {
                c61Var.setDrawDivider(z11);
            }
            if (this.w) {
                int i21 = this.L0;
                this.L0 = i21 + 1;
                this.r0 = i21;
            }
            int i22 = this.L0;
            this.L0 = i22 + 1;
            this.l0 = i22;
            org.telegram.ui.ActionBar.m6 D0 = org.telegram.ui.ActionBar.n6.D0();
            org.telegram.ui.ActionBar.k6 k10 = D0.k(false);
            ArrayList arrayList3 = D0.c0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.a >= 100) {
                int i23 = this.L0;
                this.L0 = i23 + 1;
                this.z0 = i23;
            }
            int i24 = this.L0;
            this.createNewThemeRow = i24;
            this.L0 = i24 + 2;
            this.A0 = i24 + 1;
        } else if (i7 == 0) {
            int i25 = this.L0;
            this.x = i25;
            this.textSizeRow = i25 + 1;
            this.backgroundRow = i25 + 2;
            this.changeUserColor = i25 + 3;
            this.i0 = i25 + 4;
            this.j0 = i25 + 5;
            this.q0 = i25 + 6;
            this.s0 = i25 + 7;
            this.k0 = i25 + 8;
            this.bubbleRadiusRow = i25 + 9;
            this.l0 = i25 + 10;
            this.m0 = i25 + 11;
            this.n0 = i25 + 12;
            this.o0 = i25 + 13;
            this.J0 = i25 + 14;
            this.appIconSelectorRow = i25 + 15;
            this.K0 = i25 + 16;
            this.u0 = i25 + 17;
            this.v0 = i25 + 18;
            this.w0 = i25 + 19;
            this.nightThemeRow = i25 + 20;
            this.browserRow = i25 + 21;
            this.liteModeRow = i25 + 22;
            this.L0 = i25 + 24;
            this.stickersRow = i25 + 23;
            if (DictationAsr.F()) {
                int i26 = this.L0;
                this.L0 = i26 + 1;
                this.B0 = i26;
            }
            int i27 = this.L0;
            this.D0 = i27;
            this.G0 = i27 + 1;
            this.G = i27 + 2;
            int i28 = i27 + 4;
            this.L0 = i28;
            this.raiseToListenRow = i27 + 3;
            if (org.telegram.messenger.bz.s0) {
                this.L0 = i27 + 5;
                this.F = i28;
            }
            int i29 = this.L0;
            this.pauseOnRecordRow = i29;
            this.pauseOnMediaRow = i29 + 1;
            this.N = i29 + 2;
            this.E0 = i29 + 3;
            this.H0 = i29 + 4;
            this.L0 = i29 + 6;
            this.E = i29 + 5;
            TL_account.contentSettings contentsettings = getMessagesController().s8;
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                int i30 = this.L0;
                this.L0 = i30 + 1;
                this.sensitiveContentRow = i30;
            }
            int i31 = this.L0;
            this.H = i31;
            this.L = i31 + 1;
            this.L0 = i31 + 3;
            this.F0 = i31 + 2;
        } else {
            int i32 = this.L0;
            this.S = i32;
            this.T = i32 + 1;
            int i33 = i32 + 3;
            this.L0 = i33;
            this.U = i32 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.L0 = i32 + 4;
                this.V = i33;
            }
            int i34 = this.L0;
            int i35 = i34 + 1;
            this.L0 = i35;
            this.W = i34;
            int i36 = org.telegram.ui.ActionBar.n6.o;
            if (i36 == 1) {
                this.X = i35;
                int i37 = i34 + 3;
                this.L0 = i37;
                this.Y = i34 + 2;
                if (org.telegram.ui.ActionBar.n6.p) {
                    this.Z = i37;
                    this.L0 = i34 + 5;
                    this.a0 = i34 + 4;
                } else {
                    this.b0 = i37;
                    this.c0 = i34 + 4;
                    this.L0 = i34 + 6;
                    this.d0 = i34 + 5;
                }
            } else if (i36 == 2) {
                this.e0 = i35;
                this.f0 = i34 + 2;
                this.L0 = i34 + 4;
                this.g0 = i34 + 3;
            }
            if (org.telegram.ui.ActionBar.n6.o != 0) {
                int i38 = this.L0;
                this.h0 = i38;
                this.L0 = i38 + 2;
                this.p0 = i38 + 1;
                boolean z12 = org.telegram.ui.ActionBar.n6.J.X != 0;
                this.w = z12;
                c61 c61Var2 = this.c;
                if (c61Var2 != null) {
                    c61Var2.setDrawDivider(z12);
                }
                if (this.w) {
                    int i39 = this.L0;
                    this.L0 = i39 + 1;
                    this.r0 = i39;
                }
                int i40 = this.L0;
                this.L0 = i40 + 1;
                this.s0 = i40;
            }
        }
        c61 c61Var3 = this.c;
        if (c61Var3 != null) {
            int width = this.b.getWidth();
            int i41 = c61Var3.o3;
            org.telegram.ui.Cells.ia iaVar = c61Var3.k3;
            if (i41 != iaVar.b()) {
                iaVar.f();
                if (c61Var3.j3 != (c61Var3.n3 == 1 ? org.telegram.ui.ActionBar.n6.J : org.telegram.ui.ActionBar.n6.D0())) {
                    c61Var3.A1(width);
                }
            }
        }
        e61 e61Var = this.a;
        if (e61Var != null) {
            if (i7 == 1 && (i13 = this.N0) != (i14 = org.telegram.ui.ActionBar.n6.o) && i13 != -1) {
                int i42 = this.W;
                int i43 = i42 + 1;
                if (i13 != i14) {
                    int i44 = 0;
                    while (i44 < 4) {
                        org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.b.K(i44);
                        if (mj0Var != null) {
                            View view = mj0Var.a;
                            if (view instanceof org.telegram.ui.Cells.ca) {
                                ((org.telegram.ui.Cells.ca) view).setTypeChecked(i44 == org.telegram.ui.ActionBar.n6.o);
                            }
                        }
                        i44++;
                    }
                    int i45 = org.telegram.ui.ActionBar.n6.o;
                    if (i45 == 0) {
                        this.a.p(i43, i15 - i43);
                    } else if (i45 == 1) {
                        int i46 = this.N0;
                        if (i46 == 0) {
                            this.a.o(i43, this.L0 - i43);
                        } else if (i46 == 2) {
                            this.a.p(i43, 3);
                            this.a.o(i43, org.telegram.ui.ActionBar.n6.p ? 4 : 5);
                        } else if (i46 == 3) {
                            this.a.o(i43, org.telegram.ui.ActionBar.n6.p ? 4 : 5);
                        }
                    } else if (i45 == 2) {
                        int i47 = this.N0;
                        if (i47 == 0) {
                            this.a.o(i43, this.L0 - i43);
                        } else if (i47 == 1) {
                            this.a.p(i43, org.telegram.ui.ActionBar.n6.p ? 4 : 5);
                            this.a.o(i43, 3);
                        } else if (i47 == 3) {
                            this.a.o(i43, 3);
                        }
                    } else if (i45 == 3) {
                        int i48 = this.N0;
                        if (i48 == 0) {
                            this.a.o(i43, this.L0 - i43);
                        } else if (i48 == 2) {
                            this.a.p(i43, 3);
                        } else if (i48 == 1) {
                            this.a.p(i43, org.telegram.ui.ActionBar.n6.p ? 4 : 5);
                        }
                    }
                } else {
                    boolean z13 = this.O0;
                    boolean z14 = org.telegram.ui.ActionBar.n6.p;
                    if (z13 != z14) {
                        int i49 = i42 + 3;
                        e61Var.p(i49, z14 ? 3 : 2);
                        this.a.o(i49, org.telegram.ui.ActionBar.n6.p ? 2 : 3);
                    }
                }
            } else if (z10 || this.N0 == -1) {
                e61Var.f();
            } else {
                if (i16 == -1 && (i12 = this.r0) != -1) {
                    e61Var.i(i12);
                } else if (i16 == -1 || this.r0 != -1) {
                    int i50 = this.r0;
                    if (i50 != -1) {
                        e61Var.g(i50);
                    }
                } else {
                    e61Var.s(i16);
                    if (i17 != -1) {
                        i17--;
                    }
                }
                if (i17 == -1 && (i11 = this.z0) != -1) {
                    this.a.i(i11);
                } else if (i17 != -1 && this.z0 == -1) {
                    this.a.s(i17);
                }
                if (i18 == -1 && (i10 = this.F) != -1) {
                    this.a.i(i10);
                } else if (i18 != -1 && this.F == -1) {
                    this.a.s(i18);
                }
            }
        }
        if (i7 == 1) {
            this.O0 = org.telegram.ui.ActionBar.n6.p;
            this.N0 = org.telegram.ui.ActionBar.n6.o;
        }
        E0();
    }

    public final void G0(Location location, boolean z10) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        int i7 = 0;
        int i10 = 1;
        if (getParentActivity() != null) {
            if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) org.telegram.messenger.t0.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i11 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.n6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131749354, "GpsDisabledAlertText");
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751794, "ConnectingToProxyEnable"), new m51(this, i10));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                    showDialog(alertDialog$Builder.a);
                    return;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
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
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        if (location == null || z10) {
            if (!this.M0) {
                this.M0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.S0);
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.T0);
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.n6.x = location.getLatitude();
        org.telegram.ui.ActionBar.n6.y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.n6.x, org.telegram.ui.ActionBar.n6.y);
        org.telegram.ui.ActionBar.n6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.n6.t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.n6.w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.n6.u = calendar.get(5);
        Utilities.e.c(new n51(this, i7));
        org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.b.K(this.a0);
        if (mj0Var != null) {
            View view = mj0Var.a;
            if (view instanceof org.telegram.ui.Cells.z8) {
                ((org.telegram.ui.Cells.z8) view).setText(D0());
            }
        }
        if (org.telegram.ui.ActionBar.n6.p && org.telegram.ui.ActionBar.n6.o == 1) {
            org.telegram.ui.ActionBar.n6.F(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Kj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.W0 = !org.telegram.ui.ActionBar.n6.k1();
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f;
        if (i10 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752866, "BrowseThemes"));
            org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
            org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(R.raw.sun, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.U0 = nh0Var;
            if (this.W0) {
                nh0Var.M(nh0Var.e[0] - 1);
            } else {
                nh0Var.M(0);
            }
            org.telegram.ui.Components.nh0 nh0Var2 = this.U0;
            nh0Var2.h = true;
            t6.getClass();
            this.s = t6.c(5, 0, null, nh0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752198, "ChatSettings"));
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, R.drawable.ic_ab_other);
            this.s = b10;
            b10.setContentDescription(org.telegram.messenger.gd.N0(2131754838, "AccDescrMoreOptions"));
            this.s.e(2, R.drawable.msg_share, org.telegram.messenger.gd.N0(2131745230, "ShareTheme"));
            this.s.e(3, R.drawable.msg_edit, org.telegram.messenger.gd.N0(2131751207, "EditThemeColors"));
            this.s.e(1, R.drawable.msg_palette, org.telegram.messenger.gd.N0(2131751697, "CreateNewThemeMenu"));
            this.s.e(4, R.drawable.msg_reset, org.telegram.messenger.gd.N0(2131743903, "ThemeResetToDefaults"));
            if (getMessagesController().s8 == null) {
                getMessagesController().T0(new r3(this, 25));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131753781, null));
        }
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new u51(this));
        this.a = new e61(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new v4.c0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((v4.l) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, c8.na.c(-1.0f, -1));
        this.b.setOnItemClickListener(new yi0(19, this, context));
        if (i10 == 0) {
            v4.l lVar = new v4.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.kr.h);
            lVar.C = false;
            lVar.m = false;
            this.b.setItemAnimator(lVar);
        }
        if (this.V0) {
            F0(false);
            this.V0 = false;
            this.b.v0(this.a.e.L0 - 1);
            org.telegram.messenger.g0.h3(new n51(this, i7), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        org.telegram.ui.ActionBar.t1 t1Var;
        int i12;
        int i13;
        if (i7 == org.telegram.messenger.ks.y4) {
            G0(null, true);
            return;
        }
        if (i7 == org.telegram.messenger.ks.C4 || i7 == org.telegram.messenger.ks.l4) {
            org.telegram.ui.Components.ek0 ek0Var = this.b;
            if (ek0Var != null) {
                ek0Var.g1();
            }
            E0();
            return;
        }
        if (i7 == org.telegram.messenger.ks.U5) {
            e61 e61Var = this.a;
            if (e61Var == null || (i13 = this.browserRow) == -1) {
                return;
            }
            e61Var.g(i13);
            return;
        }
        if (i7 == org.telegram.messenger.ks.t4) {
            e61 e61Var2 = this.a;
            if (e61Var2 == null || (i12 = this.r0) == -1) {
                return;
            }
            e61Var2.h(i12, new Object());
            return;
        }
        if (i7 == org.telegram.messenger.ks.r4) {
            F0(true);
            return;
        }
        if (i7 == org.telegram.messenger.ks.M2) {
            org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) objArr[0];
            org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) objArr[1];
            if (m6Var == this.h && k6Var == this.n) {
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(getMessagesController().X2);
                sb2.append("/addtheme/");
                sb2.append((k6Var != null ? k6Var.r : m6Var.G).slug);
                String sb3 = sb2.toString();
                showDialog(new org.telegram.ui.Components.zo0(getParentActivity(), null, sb3, false, sb3, false, null));
                org.telegram.ui.ActionBar.t1 t1Var2 = this.r;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.N2) {
            org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) objArr[0];
            org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) objArr[1];
            if (m6Var2 == this.h && k6Var2 == this.n && (t1Var = this.r) == null) {
                t1Var.dismiss();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.v4) {
            if (getParentActivity() == null || this.isPaused) {
                return;
            }
            this.h = (org.telegram.ui.ActionBar.m6) objArr[0];
            this.n = (org.telegram.ui.ActionBar.k6) objArr[1];
            org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            this.r = t1Var3;
            t1Var3.j0 = true;
            showDialog(t1Var3, new q5(this, 16));
            return;
        }
        if (i7 != org.telegram.messenger.ks.w4) {
            if (i7 == org.telegram.messenger.ks.X4) {
                int i14 = this.q0;
                if (i14 >= 0) {
                    this.a.g(i14);
                    return;
                }
                return;
            }
            if ((i7 == org.telegram.messenger.ks.V3 || i7 == org.telegram.messenger.ks.S3) && (i11 = this.sensitiveContentRow) >= 0) {
                this.a.g(i11);
                return;
            }
            return;
        }
        E0();
        if (this.f != 3) {
            return;
        }
        boolean k12 = org.telegram.ui.ActionBar.n6.k1();
        boolean z10 = !k12;
        if (this.W0 != z10) {
            this.W0 = z10;
            org.telegram.ui.Components.nh0 nh0Var = this.U0;
            nh0Var.P(!k12 ? nh0Var.e[0] - 1 : 0);
            this.s.getIconView().d();
        }
        if (this.q0 >= 0) {
            for (int i15 = 0; i15 < this.b.getChildCount(); i15++) {
                if (this.b.getChildAt(i15) instanceof wt) {
                    ((wt) this.b.getChildAt(i15)).a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.j0.class, org.telegram.ui.Cells.ca.class, f61.class, v51.class, b61.class, org.telegram.ui.Cells.i5.class, org.telegram.ui.Cells.ja.class, d61.class, org.telegram.ui.Cells.m8.class, pl0.class, org.telegram.ui.Components.fx0.class, wt.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.s8));
        int i7 = org.telegram.ui.ActionBar.n6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{b61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{b61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ee));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{f61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ec));
        int i12 = org.telegram.ui.ActionBar.n6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        int i13 = org.telegram.ui.ActionBar.n6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
        arrayList.addAll(c8.ta.a(new g6(22, this), i12, org.telegram.ui.ActionBar.n6.G6, i13));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.y4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.C4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.r4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.t4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.v4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.w4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.X4);
        getNotificationCenter().c(this, org.telegram.messenger.ks.S3);
        getNotificationCenter().c(this, org.telegram.messenger.ks.V3);
        getNotificationCenter().c(this, org.telegram.messenger.ks.M2);
        getNotificationCenter().c(this, org.telegram.messenger.ks.N2);
        getNotificationCenter().c(this, org.telegram.messenger.ks.U5);
        if (this.f == 0) {
            org.telegram.ui.ActionBar.n6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.n6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
        locationManager.removeUpdates(this.S0);
        locationManager.removeUpdates(this.T0);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.y4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.C4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.r4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.t4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.v4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.w4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.X4);
        getNotificationCenter().n(this, org.telegram.messenger.ks.S3);
        getNotificationCenter().n(this, org.telegram.messenger.ks.V3);
        getNotificationCenter().n(this, org.telegram.messenger.ks.M2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.N2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.U5);
        org.telegram.ui.ActionBar.n6.w1();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            F0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.k3(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
