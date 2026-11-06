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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class ThemeActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public final x51 Q0;
    public int R;
    public final x51 R0;
    public int S;
    public org.telegram.ui.Components.zg0 S0;
    public int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public f61 a;
    public int a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.pj0 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public d61 c;
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
    public org.telegram.ui.ActionBar.j6 h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.h6 n;
    public int n0;
    private int nightThemeRow;
    public int o0;
    public int p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int q0;
    public org.telegram.ui.ActionBar.u1 r;
    public int r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.f5 s;
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

    /* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
    public static class InnerAccentView extends View {
        public final Paint a;
        public ObjectAnimator b;
        public float c;
        public org.telegram.ui.ActionBar.j6 d;
        public org.telegram.ui.ActionBar.h6 e;
        public boolean f;

        public InnerAccentView(Context context) {
            super(context);
            this.a = new Paint(1);
        }

        public final void a(boolean z9) {
            this.f = this.d.Y == this.e.a;
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!z9) {
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
            paint.setAlpha(org.telegram.messenger.qs.e4);
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
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131752015, "ColorPickerMainColor"));
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
        this.Q0 = new x51(this);
        this.R0 = new x51(this);
        this.f = i7;
        F0(true);
    }

    public static String D0() {
        int i7 = org.telegram.ui.ActionBar.k6.v;
        int i10 = i7 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i7 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.k6.t;
        int i12 = i11 / 60;
        return org.telegram.messenger.hd.a0("AutoNightUpdateLocationInfo", null, 2131753780, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public static void H0(final int i7, final Context context, final org.telegram.messenger.c20 c20Var, final org.telegram.ui.ActionBar.f6 f6Var) {
        final org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        final String str = s12.u6;
        String str2 = s12.v6;
        final int i10 = s12.w6;
        if (TextUtils.isEmpty(str) || !((org.telegram.messenger.h0) s12.x7.m.b).c) {
            c20Var.a(Boolean.TRUE);
            return;
        }
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        l10.N = f10;
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout, L2, N, null, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, c8.ha.e(50, 50, 17));
        f10.addView(frameLayout, c8.ha.t(80, 80, 1, 0, 20, 0, 8));
        int i12 = org.telegram.ui.ActionBar.k6.j5;
        TextView b10 = c8.qa.b(context, 20.0f, i12, true, f6Var);
        b10.setText(org.telegram.messenger.hd.M0(2131754307, null));
        b10.setGravity(17);
        f10.addView(b10, c8.ha.t(-1, -2, 7, 24, 8, 24, 8));
        TextView b11 = c8.qa.b(context, 14.0f, i12, false, f6Var);
        b11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.N0("AgeVerificationText" + str2)));
        b11.setGravity(17);
        f10.addView(b11, c8.ha.t(-1, -2, 7, 24, 0, 24, 0));
        final fi.d dVar = new fi.d(context, f6Var, true);
        dVar.i(org.telegram.messenger.hd.M0(2131754313, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.p51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final fi.d dVar2 = fi.d.this;
                if (dVar2.Q) {
                    return;
                }
                dVar2.setLoading(true);
                final org.telegram.messenger.qp qpVar = s12;
                final String str3 = str;
                final int i13 = i7;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                final int i14 = i10;
                final org.telegram.messenger.c20 c20Var2 = c20Var;
                final org.telegram.ui.ActionBar.v2[] v2VarArr = r9;
                c8.ia.c(R.raw.permission_request_camera, 2131754310, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.c20() { // from class: org.telegram.ui.q51
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        final fi.d dVar3 = fi.d.this;
                        if (!booleanValue) {
                            dVar3.setLoading(false);
                            return;
                        }
                        final org.telegram.messenger.qp qpVar2 = qpVar;
                        org.telegram.messenger.s10 d2 = qpVar2.d2();
                        final int i15 = i13;
                        final Context context3 = context2;
                        final org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                        final int i16 = i14;
                        final org.telegram.messenger.c20 c20Var3 = c20Var2;
                        final org.telegram.ui.ActionBar.v2[] v2VarArr2 = v2VarArr;
                        d2.a(str3, null, new org.telegram.messenger.c20() { // from class: org.telegram.ui.r51
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r6v2, types: [org.telegram.messenger.z10, org.telegram.ui.s51] */
                            @Override // org.telegram.messenger.c20
                            public final void a(Object obj2) {
                                Long l11 = (Long) obj2;
                                fi.d dVar4 = fi.d.this;
                                if (l11 == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                TLRPC.User a22 = qpVar2.a2(l11);
                                if (a22 == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                hi.q4 b12 = hi.q4.b(i15, l11.longValue(), l11.longValue(), null, null, 4, 0, 0L, null, false, null, a22, 0, false, false);
                                final hi.a3 a3Var = new hi.a3(context3, f6Var3);
                                final int i17 = i16;
                                final org.telegram.messenger.c20 c20Var4 = c20Var3;
                                ?? r62 = new org.telegram.messenger.z10() { // from class: org.telegram.ui.s51
                                    @Override // org.telegram.messenger.z10
                                    public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        Double d = (Double) obj4;
                                        boolean booleanValue2 = d != null ? d.doubleValue() >= ((double) i17) : ((Boolean) obj3).booleanValue();
                                        a3Var.o(false);
                                        c20Var4.a(Boolean.valueOf(booleanValue2));
                                        org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                        if (!booleanValue2 || T2 == null) {
                                            return;
                                        }
                                        org.telegram.messenger.k5.o(null, 2131754309, org.telegram.ui.Components.hc.a0(T2), R.raw.contact_check, 36);
                                    }
                                };
                                a3Var.L0 = r62;
                                hi.s2 s2Var = a3Var.D;
                                if (s2Var != 0) {
                                    s2Var.setOnVerifiedAge(r62);
                                }
                                a3Var.B(true);
                                a3Var.B0 = false;
                                a3Var.l0 = T.getParentActivity();
                                a3Var.x(T, b12);
                                a3Var.show();
                                dVar4.setLoading(false);
                                v2VarArr2[0].dismiss();
                            }
                        });
                    }
                });
            }
        });
        f10.addView(dVar, c8.ha.t(-1, 48, 7, 2, 29, 2, 14));
        l10.show();
        final org.telegram.ui.ActionBar.v2[] v2VarArr = {l10};
        l10.N();
    }

    public static void Z(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        f61 f61Var;
        org.telegram.ui.Components.pj0 pj0Var = themeActivity.b;
        if (pj0Var == null || !pj0Var.G || (f61Var = themeActivity.a) == null) {
            return;
        }
        int i7 = themeActivity.sensitiveContentRow;
        boolean z9 = false;
        boolean z10 = i7 >= 0;
        if (contentsettings != null && contentsettings.sensitive_can_change) {
            z9 = true;
        }
        if (z10 == z9) {
            f61Var.g(i7);
        } else {
            themeActivity.F0(true);
        }
    }

    public static void b0(final ThemeActivity themeActivity, Context context, View view, final int i7, float f10) {
        int i10;
        int i11;
        final int i12 = 1;
        if (i7 == themeActivity.N) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z9 = e12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = e12.edit();
            boolean z10 = !z9;
            edit.putBoolean("view_animations", z10);
            org.telegram.messenger.iz.C1 = Boolean.valueOf(z10);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z10);
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
            hm0 hm0Var = new hm0();
            hm0Var.H = themeActivity;
            themeActivity.presentFragment(hm0Var);
            return;
        }
        if (i7 == themeActivity.G) {
            SharedPreferences e13 = org.telegram.messenger.qp.e1();
            boolean z11 = e13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = e13.edit();
            boolean z12 = !z11;
            edit2.putBoolean("send_by_enter", z12);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                return;
            }
            return;
        }
        if (i7 == themeActivity.E) {
            org.telegram.messenger.iz.r0 = !org.telegram.messenger.iz.r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.qp.e1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.iz.r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.r0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.F) {
            org.telegram.messenger.iz.t0 = !org.telegram.messenger.iz.t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.qp.e1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.iz.t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.t0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.iz.s0 = !org.telegram.messenger.iz.s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.qp.e1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.iz.s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.s0);
            }
            if (!org.telegram.messenger.iz.s0 && themeActivity.E != -1) {
                for (int i14 = 0; i14 < themeActivity.b.getChildCount(); i14++) {
                    View childAt = themeActivity.b.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.r8) {
                        themeActivity.b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.E) {
                            ((org.telegram.ui.Cells.r8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.F0(false);
            return;
        }
        if (i7 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.iz.F0 = !org.telegram.messenger.iz.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.qp.e1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.iz.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.F0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.iz.G0 = !org.telegram.messenger.iz.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.qp.e1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.iz.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.G0);
                return;
            }
            return;
        }
        int i15 = 2;
        float f11 = 4.0f;
        if (i7 == themeActivity.K) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference = new AtomicReference();
            LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
            CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131751367, "DistanceUnitsAutomatic"), org.telegram.messenger.hd.M0(2131751366, "DistanceUnitsKilometers"), org.telegram.messenger.hd.M0(2131751365, "DistanceUnitsMiles")};
            final int i16 = 0;
            while (i16 < 3) {
                org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                float f13 = f11;
                j6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f13), 0);
                j6Var.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                j6Var.b(charSequenceArr[i16], i16 == org.telegram.messenger.iz.s1);
                int i17 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 2, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
                j6Var.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(j6Var, h02, null, N, null);
                f12.addView(j6Var);
                j6Var.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.t51
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
                                org.telegram.messenger.iz.s1 = i16;
                                SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
                                edit8.putInt("distanceSystemType", org.telegram.messenger.iz.s1);
                                edit8.apply();
                                org.telegram.messenger.hd.g0 = null;
                                themeActivity2.O0 = true;
                                v4.d1 K = themeActivity2.b.K(themeActivity2.K);
                                if (K != null) {
                                    themeActivity2.a.t(K, themeActivity2.K);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                            default:
                                org.telegram.messenger.iz.p0 = i16;
                                SharedPreferences.Editor edit9 = org.telegram.messenger.qp.e1().edit();
                                edit9.putInt("searchEngineType", org.telegram.messenger.iz.p0);
                                edit9.apply();
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.P0 = true;
                                v4.d1 K2 = themeActivity3.b.K(themeActivity3.L);
                                if (K2 != null) {
                                    themeActivity3.a.t(K2, themeActivity3.L);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                        }
                    }
                });
                i16++;
                f11 = f13;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(2131751364, "DistanceUnitsTitle");
            alertDialog$Builder.o(f12);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            atomicReference.set(u1Var);
            themeActivity.showDialog(u1Var);
            return;
        }
        if (i7 == themeActivity.L) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference2 = new AtomicReference();
            LinearLayout f14 = org.telegram.messenger.k5.f(context, 1);
            ArrayList b10 = org.telegram.ui.web.f1.b();
            int size = b10.size();
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            final int i18 = 0;
            while (i18 < size) {
                charSequenceArr2[i18] = ((org.telegram.ui.web.f1) b10.get(i18)).a;
                org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                j6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                j6Var2.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                j6Var2.b(charSequenceArr2[i18], i18 == org.telegram.messenger.iz.p0);
                int i19 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 2, -1);
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i19);
                j6Var2.setBackground(h03);
                org.telegram.ui.ActionBar.r6.k(j6Var2, h03, null, N2, null);
                f14.addView(j6Var2);
                j6Var2.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.t51
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
                                org.telegram.messenger.iz.s1 = i18;
                                SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
                                edit8.putInt("distanceSystemType", org.telegram.messenger.iz.s1);
                                edit8.apply();
                                org.telegram.messenger.hd.g0 = null;
                                themeActivity2.O0 = true;
                                v4.d1 K = themeActivity2.b.K(themeActivity2.K);
                                if (K != null) {
                                    themeActivity2.a.t(K, themeActivity2.K);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                            default:
                                org.telegram.messenger.iz.p0 = i18;
                                SharedPreferences.Editor edit9 = org.telegram.messenger.qp.e1().edit();
                                edit9.putInt("searchEngineType", org.telegram.messenger.iz.p0);
                                edit9.apply();
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.P0 = true;
                                v4.d1 K2 = themeActivity3.b.K(themeActivity3.L);
                                if (K2 != null) {
                                    themeActivity3.a.t(K2, themeActivity3.L);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                        }
                    }
                });
                i18++;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder2.a.R = org.telegram.messenger.hd.M0(2131745800, null);
            alertDialog$Builder2.o(f14);
            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            atomicReference2.set(u1Var2);
            themeActivity.showDialog(u1Var2);
            return;
        }
        if (i7 == themeActivity.M) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference3 = new AtomicReference();
            LinearLayout f15 = org.telegram.messenger.k5.f(context, 1);
            org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
            j6Var3.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            int i20 = org.telegram.ui.ActionBar.k6.g7;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i20, false);
            int i21 = org.telegram.ui.ActionBar.k6.E5;
            j6Var3.a(x02, org.telegram.ui.ActionBar.k6.x0(null, i21, false));
            j6Var3.b(org.telegram.messenger.hd.M0(2131748437, null), !org.telegram.messenger.iz.u0);
            int i22 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i22, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i22);
            j6Var3.setBackground(h04);
            org.telegram.ui.ActionBar.r6.k(j6Var3, h04, null, N3, null);
            f15.addView(j6Var3);
            j6Var3.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.u51
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
                            org.telegram.messenger.iz.u0 = false;
                            org.telegram.messenger.iz.y();
                            themeActivity2.N0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.d1 K = themeActivity2.b.K(themeActivity2.M);
                            if (K != null) {
                                themeActivity2.a.t(K, themeActivity2.M);
                                break;
                            }
                            break;
                        default:
                            c8.ia.c(R.raw.permission_request_microphone, 2131747309, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.ex(26, themeActivity2, atomicReference4));
                            org.telegram.messenger.iz.u0 = true;
                            org.telegram.messenger.iz.y();
                            themeActivity2.N0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.d1 K2 = themeActivity2.b.K(themeActivity2.M);
                            if (K2 != null) {
                                themeActivity2.a.t(K2, themeActivity2.M);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.j6 j6Var4 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
            j6Var4.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            j6Var4.a(org.telegram.ui.ActionBar.k6.x0(null, i20, false), org.telegram.ui.ActionBar.k6.x0(null, i21, false));
            String M0 = org.telegram.messenger.hd.M0(2131748434, null);
            String M02 = org.telegram.messenger.hd.M0(2131748435, null);
            boolean z13 = org.telegram.messenger.iz.u0;
            j6Var4.a.setText(M0);
            TextView textView = j6Var4.b;
            textView.setVisibility(0);
            textView.setText(M02);
            j6Var4.c.a(z13, false);
            org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i22, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i22);
            j6Var4.setBackground(h05);
            org.telegram.ui.ActionBar.r6.k(j6Var4, h05, null, N4, null);
            f15.addView(j6Var4);
            j6Var4.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.u51
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
                            org.telegram.messenger.iz.u0 = false;
                            org.telegram.messenger.iz.y();
                            themeActivity2.N0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.d1 K = themeActivity2.b.K(themeActivity2.M);
                            if (K != null) {
                                themeActivity2.a.t(K, themeActivity2.M);
                                break;
                            }
                            break;
                        default:
                            c8.ia.c(R.raw.permission_request_microphone, 2131747309, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.ex(26, themeActivity2, atomicReference4));
                            org.telegram.messenger.iz.u0 = true;
                            org.telegram.messenger.iz.y();
                            themeActivity2.N0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.d1 K2 = themeActivity2.b.K(themeActivity2.M);
                            if (K2 != null) {
                                themeActivity2.a.t(K2, themeActivity2.M);
                                break;
                            }
                            break;
                    }
                }
            });
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder3.a.R = org.telegram.messenger.hd.M0(2131748438, null);
            alertDialog$Builder3.o(f15);
            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
            atomicReference3.set(u1Var3);
            themeActivity.showDialog(u1Var3);
            return;
        }
        if (i7 == themeActivity.D) {
            org.telegram.messenger.iz.x0 = !org.telegram.messenger.iz.x0;
            SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
            edit8.putBoolean("direct_share", org.telegram.messenger.iz.x0);
            edit8.apply();
            g0.f.n(org.telegram.messenger.t0.b);
            org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).m();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.x0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.sensitiveContentRow) {
            if (themeActivity.getMessagesController().S4()) {
                themeActivity.getMessagesController().F4(false);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().S4());
                    return;
                }
                return;
            }
            by0 by0Var = new by0(12, themeActivity, view);
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
            alertDialog$Builder4.a.R = org.telegram.messenger.hd.M0(2131751813, null);
            alertDialog$Builder4.a.T = org.telegram.messenger.hd.M0(2131751814, null);
            alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751817, null), new lk0(15, themeActivity, by0Var));
            alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            themeActivity.showDialog(alertDialog$Builder4.a);
            return;
        }
        if (i7 == themeActivity.P) {
            return;
        }
        if (i7 == themeActivity.Q) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder5.a.R = org.telegram.messenger.hd.M0(2131745292, "SortBy");
            alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131751601, "Default"), org.telegram.messenger.hd.M0(2131745288, "SortFirstName"), org.telegram.messenger.hd.M0(2131745287, "SortLastName")}, new zw(themeActivity, i7, i15));
            alertDialog$Builder5.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
            themeActivity.showDialog(alertDialog$Builder5.a);
            return;
        }
        if (i7 == themeActivity.s0) {
            int i23 = org.telegram.messenger.iz.a;
            org.telegram.messenger.rc.i = !org.telegram.messenger.rc.e(256) ? 256 | org.telegram.messenger.rc.d(true) : org.telegram.messenger.rc.d(true) & (-257);
            org.telegram.messenger.rc.k();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.f());
                return;
            }
            return;
        }
        if (i7 == themeActivity.nightThemeRow) {
            if ((!org.telegram.messenger.hd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.hd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                themeActivity.presentFragment(new ThemeActivity(1));
                return;
            }
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            if (org.telegram.ui.ActionBar.k6.o == 0) {
                org.telegram.ui.ActionBar.k6.o = 2;
                h5Var.setChecked(true);
            } else {
                org.telegram.ui.ActionBar.k6.o = 0;
                h5Var.setChecked(false);
            }
            org.telegram.ui.ActionBar.k6.w1();
            org.telegram.ui.ActionBar.k6.F(true);
            boolean z14 = org.telegram.ui.ActionBar.k6.o != 0;
            String C0 = z14 ? org.telegram.ui.ActionBar.k6.C0() : org.telegram.messenger.hd.M0(2131753783, "AutoNightThemeOff");
            if (z14) {
                int i24 = org.telegram.ui.ActionBar.k6.o;
                C0 = a8.p0.D(i24 == 1 ? org.telegram.messenger.hd.M0(2131753787, "AutoNightScheduled") : i24 == 3 ? org.telegram.messenger.hd.M0(2131753786, "AutoNightSystemDefault") : org.telegram.messenger.hd.M0(2131753796, "AutoNightAdaptive"), " ", C0);
            }
            h5Var.b(org.telegram.messenger.hd.M0(2131753784, "AutoNightTheme"), C0, R.drawable.menu_night_mode_24, z14, 0, false, true, false);
            return;
        }
        if (i7 == themeActivity.browserRow) {
            if ((!org.telegram.messenger.hd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.hd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                themeActivity.presentFragment(new org.telegram.ui.web.o1(null));
                return;
            }
            org.telegram.ui.Cells.h5 h5Var2 = (org.telegram.ui.Cells.h5) view;
            org.telegram.messenger.qp messagesController = themeActivity.getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.y8;
            if (tL_webBrowserSettings != null) {
                messagesController.u5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
            }
            h5Var2.setChecked(themeActivity.getMessagesController().M2());
            return;
        }
        if (i7 == themeActivity.R) {
            if (org.telegram.ui.ActionBar.k6.o == 0) {
                return;
            }
            org.telegram.ui.ActionBar.k6.o = 0;
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.k6.F(false);
            return;
        }
        if (i7 == themeActivity.S) {
            if (org.telegram.ui.ActionBar.k6.o == 1) {
                return;
            }
            org.telegram.ui.ActionBar.k6.o = 1;
            if (org.telegram.ui.ActionBar.k6.p) {
                themeActivity.G0(null, true);
            }
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.k6.F(false);
            return;
        }
        if (i7 == themeActivity.T) {
            if (org.telegram.ui.ActionBar.k6.o == 2) {
                return;
            }
            org.telegram.ui.ActionBar.k6.o = 2;
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.k6.F(false);
            return;
        }
        if (i7 == themeActivity.U) {
            if (org.telegram.ui.ActionBar.k6.o == 3) {
                return;
            }
            org.telegram.ui.ActionBar.k6.o = 3;
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.k6.F(false);
            return;
        }
        if (i7 == themeActivity.X) {
            boolean z15 = !org.telegram.ui.ActionBar.k6.p;
            org.telegram.ui.ActionBar.k6.p = z15;
            ((org.telegram.ui.Cells.r8) view).setChecked(z15);
            themeActivity.F0(true);
            if (org.telegram.ui.ActionBar.k6.p) {
                themeActivity.G0(null, true);
            }
            org.telegram.ui.ActionBar.k6.F(false);
            return;
        }
        if (i7 == themeActivity.a0 || i7 == themeActivity.b0) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            if (i7 == themeActivity.a0) {
                i10 = org.telegram.ui.ActionBar.k6.r;
                i11 = i10 / 60;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.s;
                i11 = i10 / 60;
            }
            int i25 = i10 - (i11 * 60);
            final org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.m51
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i26, int i27) {
                    int i28 = (i26 * 60) + i27;
                    int i29 = ThemeActivity.this.a0;
                    int i30 = i7;
                    org.telegram.ui.Cells.w9 w9Var2 = w9Var;
                    if (i30 == i29) {
                        org.telegram.ui.ActionBar.k6.r = i28;
                        w9Var2.c(org.telegram.messenger.hd.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i27)), false, true);
                    } else {
                        org.telegram.ui.ActionBar.k6.s = i28;
                        w9Var2.c(org.telegram.messenger.hd.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i27)), false, true);
                    }
                }
            }, i11, i25, true));
            return;
        }
        if (i7 == themeActivity.Y) {
            themeActivity.G0(null, true);
            return;
        }
        if (i7 == themeActivity.createNewThemeRow) {
            themeActivity.B0();
            return;
        }
        if (i7 == themeActivity.y0) {
            themeActivity.C0();
        } else if (i7 == themeActivity.stickersRow) {
            themeActivity.presentFragment(new StickersActivity(0, null));
        } else if (i7 == themeActivity.liteModeRow) {
            themeActivity.presentFragment(new w90());
        }
    }

    public static void c0(ThemeActivity themeActivity, by0 by0Var) {
        H0(themeActivity.currentAccount, themeActivity.getParentActivity(), new org.telegram.ui.Components.ex(27, themeActivity, by0Var), themeActivity.getResourceProvider());
    }

    public static boolean d0(ThemeActivity themeActivity, int i7, boolean z9) {
        if (i7 == org.telegram.messenger.iz.Y0) {
            return false;
        }
        org.telegram.messenger.iz.Y0 = i7;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.iz.Y0);
        edit.commit();
        v4.d1 K = themeActivity.b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.a;
            if (view instanceof g61) {
                g61 g61Var = (g61) view;
                org.telegram.ui.Cells.q1[] cells = g61Var.a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().Q1 = false;
                    cells[i10].requestLayout();
                }
                g61Var.invalidate();
            }
        }
        v4.d1 K2 = themeActivity.b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.a;
            if (view2 instanceof w51) {
                w51 w51Var = (w51) view2;
                if (z9) {
                    w51Var.requestLayout();
                } else {
                    w51Var.invalidate();
                }
            }
        }
        themeActivity.E0();
        return true;
    }

    public static boolean p0(ThemeActivity themeActivity, int i7) {
        if (i7 != org.telegram.messenger.iz.W0) {
            org.telegram.messenger.iz.W0 = i7;
            org.telegram.messenger.iz.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.iz.W0);
                edit.commit();
                org.telegram.ui.ActionBar.k6.Q();
                v4.d1 K = themeActivity.b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof g61) {
                        org.telegram.ui.Cells.q1[] cells = ((g61) view).a.getCells();
                        for (int i10 = 0; i10 < cells.length; i10++) {
                            cells[i10].getMessageObject().Q1 = false;
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
        String M0 = org.telegram.messenger.hd.M0(2131748257, "NewTheme");
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131751712, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751704, "CreateTheme"), new n51(this, 2));
        showDialog(u1Var);
    }

    public final void C0() {
        org.telegram.ui.ActionBar.j6 D0 = org.telegram.ui.ActionBar.k6.D0();
        presentFragment(new u71(D0, false, 1, D0.k(false).a >= 100, this.f == 1));
    }

    public final void E0() {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (this.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.j6 D0 = org.telegram.ui.ActionBar.k6.D0();
        org.telegram.ui.ActionBar.h6 k10 = D0.k(false);
        ArrayList arrayList = D0.b0;
        if (arrayList == null || arrayList.isEmpty() || k10 == null || k10.a < 100) {
            this.s.t(2);
            this.s.t(3);
        } else {
            this.s.S(2);
            this.s.S(3);
        }
        int i7 = org.telegram.messenger.g0.Q1() ? 18 : 16;
        org.telegram.ui.ActionBar.j6 D02 = org.telegram.ui.ActionBar.k6.D0();
        if (org.telegram.messenger.iz.W0 == i7 && org.telegram.messenger.iz.Y0 == 17 && D02.S && D02.Y == org.telegram.ui.ActionBar.k6.n && (k10 == null || (c6Var = k10.y) == null || "d".equals(c6Var.c))) {
            this.s.t(4);
        } else {
            this.s.S(4);
        }
    }

    public final void F0(boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_theme tL_theme;
        int i15 = this.J0;
        int i16 = this.q0;
        int i17 = this.y0;
        int i18 = this.E;
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
        int size = org.telegram.ui.ActionBar.k6.F.size();
        int i19 = 0;
        while (true) {
            i7 = this.f;
            if (i19 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i19);
            if (i7 == 0 || i7 == 3 || ((j6Var.b != null || j6Var.q()) && ((tL_theme = j6Var.F) == null || tL_theme.document != null))) {
                if (j6Var.b != null) {
                    arrayList2.add(j6Var);
                } else {
                    arrayList.add(j6Var);
                }
            }
            i19++;
        }
        Collections.sort(arrayList, new un0(4));
        if (i7 == 3) {
            int i20 = this.J0;
            this.w0 = i20;
            this.p0 = i20 + 1;
            this.n0 = i20 + 2;
            this.x0 = i20 + 3;
            this.i0 = i20 + 4;
            this.J0 = i20 + 6;
            this.o0 = i20 + 5;
            boolean z10 = org.telegram.ui.ActionBar.k6.D0().W != 0;
            this.w = z10;
            d61 d61Var = this.c;
            if (d61Var != null) {
                d61Var.setDrawDivider(z10);
            }
            if (this.w) {
                int i21 = this.J0;
                this.J0 = i21 + 1;
                this.q0 = i21;
            }
            int i22 = this.J0;
            this.J0 = i22 + 1;
            this.k0 = i22;
            org.telegram.ui.ActionBar.j6 D0 = org.telegram.ui.ActionBar.k6.D0();
            org.telegram.ui.ActionBar.h6 k10 = D0.k(false);
            ArrayList arrayList3 = D0.b0;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.a >= 100) {
                int i23 = this.J0;
                this.J0 = i23 + 1;
                this.y0 = i23;
            }
            int i24 = this.J0;
            this.createNewThemeRow = i24;
            this.J0 = i24 + 2;
            this.z0 = i24 + 1;
        } else if (i7 == 0) {
            int i25 = this.J0;
            this.x = i25;
            this.textSizeRow = i25 + 1;
            this.backgroundRow = i25 + 2;
            this.changeUserColor = i25 + 3;
            this.h0 = i25 + 4;
            this.i0 = i25 + 5;
            this.p0 = i25 + 6;
            this.r0 = i25 + 7;
            this.j0 = i25 + 8;
            this.bubbleRadiusRow = i25 + 9;
            this.k0 = i25 + 10;
            this.l0 = i25 + 11;
            this.m0 = i25 + 12;
            this.n0 = i25 + 13;
            this.H0 = i25 + 14;
            this.appIconSelectorRow = i25 + 15;
            this.I0 = i25 + 16;
            this.t0 = i25 + 17;
            this.u0 = i25 + 18;
            this.v0 = i25 + 19;
            this.nightThemeRow = i25 + 20;
            this.browserRow = i25 + 21;
            this.liteModeRow = i25 + 22;
            this.stickersRow = i25 + 23;
            this.B0 = i25 + 24;
            this.E0 = i25 + 25;
            this.F = i25 + 26;
            int i26 = i25 + 28;
            this.J0 = i26;
            this.raiseToListenRow = i25 + 27;
            if (org.telegram.messenger.iz.s0) {
                this.J0 = i25 + 29;
                this.E = i26;
            }
            int i27 = this.J0;
            this.pauseOnRecordRow = i27;
            this.pauseOnMediaRow = i27 + 1;
            this.M = i27 + 2;
            this.C0 = i27 + 3;
            this.F0 = i27 + 4;
            this.J0 = i27 + 6;
            this.D = i27 + 5;
            TL_account.contentSettings contentsettings = getMessagesController().m8;
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                int i28 = this.J0;
                this.J0 = i28 + 1;
                this.sensitiveContentRow = i28;
            }
            int i29 = this.J0;
            this.G = i29;
            this.K = i29 + 1;
            this.J0 = i29 + 3;
            this.D0 = i29 + 2;
        } else {
            int i30 = this.J0;
            this.R = i30;
            this.S = i30 + 1;
            int i31 = i30 + 3;
            this.J0 = i31;
            this.T = i30 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.J0 = i30 + 4;
                this.U = i31;
            }
            int i32 = this.J0;
            int i33 = i32 + 1;
            this.J0 = i33;
            this.V = i32;
            int i34 = org.telegram.ui.ActionBar.k6.o;
            if (i34 == 1) {
                this.W = i33;
                int i35 = i32 + 3;
                this.J0 = i35;
                this.X = i32 + 2;
                if (org.telegram.ui.ActionBar.k6.p) {
                    this.Y = i35;
                    this.J0 = i32 + 5;
                    this.Z = i32 + 4;
                } else {
                    this.a0 = i35;
                    this.b0 = i32 + 4;
                    this.J0 = i32 + 6;
                    this.c0 = i32 + 5;
                }
            } else if (i34 == 2) {
                this.d0 = i33;
                this.e0 = i32 + 2;
                this.J0 = i32 + 4;
                this.f0 = i32 + 3;
            }
            if (org.telegram.ui.ActionBar.k6.o != 0) {
                int i36 = this.J0;
                this.g0 = i36;
                this.J0 = i36 + 2;
                this.o0 = i36 + 1;
                boolean z11 = org.telegram.ui.ActionBar.k6.J.W != 0;
                this.w = z11;
                d61 d61Var2 = this.c;
                if (d61Var2 != null) {
                    d61Var2.setDrawDivider(z11);
                }
                if (this.w) {
                    int i37 = this.J0;
                    this.J0 = i37 + 1;
                    this.q0 = i37;
                }
                int i38 = this.J0;
                this.J0 = i38 + 1;
                this.r0 = i38;
            }
        }
        d61 d61Var3 = this.c;
        if (d61Var3 != null) {
            int width = this.b.getWidth();
            int i39 = d61Var3.n3;
            org.telegram.ui.Cells.fa faVar = d61Var3.j3;
            if (i39 != faVar.b()) {
                faVar.f();
                if (d61Var3.i3 != (d61Var3.m3 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0())) {
                    d61Var3.A1(width);
                }
            }
        }
        f61 f61Var = this.a;
        if (f61Var != null) {
            if (i7 == 1 && (i13 = this.L0) != (i14 = org.telegram.ui.ActionBar.k6.o) && i13 != -1) {
                int i40 = this.V;
                int i41 = i40 + 1;
                if (i13 != i14) {
                    int i42 = 0;
                    while (i42 < 4) {
                        org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) this.b.K(i42);
                        if (xi0Var != null) {
                            View view = xi0Var.a;
                            if (view instanceof org.telegram.ui.Cells.aa) {
                                ((org.telegram.ui.Cells.aa) view).setTypeChecked(i42 == org.telegram.ui.ActionBar.k6.o);
                            }
                        }
                        i42++;
                    }
                    int i43 = org.telegram.ui.ActionBar.k6.o;
                    if (i43 == 0) {
                        this.a.p(i41, i15 - i41);
                    } else if (i43 == 1) {
                        int i44 = this.L0;
                        if (i44 == 0) {
                            this.a.o(i41, this.J0 - i41);
                        } else if (i44 == 2) {
                            this.a.p(i41, 3);
                            this.a.o(i41, org.telegram.ui.ActionBar.k6.p ? 4 : 5);
                        } else if (i44 == 3) {
                            this.a.o(i41, org.telegram.ui.ActionBar.k6.p ? 4 : 5);
                        }
                    } else if (i43 == 2) {
                        int i45 = this.L0;
                        if (i45 == 0) {
                            this.a.o(i41, this.J0 - i41);
                        } else if (i45 == 1) {
                            this.a.p(i41, org.telegram.ui.ActionBar.k6.p ? 4 : 5);
                            this.a.o(i41, 3);
                        } else if (i45 == 3) {
                            this.a.o(i41, 3);
                        }
                    } else if (i43 == 3) {
                        int i46 = this.L0;
                        if (i46 == 0) {
                            this.a.o(i41, this.J0 - i41);
                        } else if (i46 == 2) {
                            this.a.p(i41, 3);
                        } else if (i46 == 1) {
                            this.a.p(i41, org.telegram.ui.ActionBar.k6.p ? 4 : 5);
                        }
                    }
                } else {
                    boolean z12 = this.M0;
                    boolean z13 = org.telegram.ui.ActionBar.k6.p;
                    if (z12 != z13) {
                        int i47 = i40 + 3;
                        f61Var.p(i47, z13 ? 3 : 2);
                        this.a.o(i47, org.telegram.ui.ActionBar.k6.p ? 2 : 3);
                    }
                }
            } else if (z9 || this.L0 == -1) {
                f61Var.f();
            } else {
                if (i16 == -1 && (i12 = this.q0) != -1) {
                    f61Var.i(i12);
                } else if (i16 == -1 || this.q0 != -1) {
                    int i48 = this.q0;
                    if (i48 != -1) {
                        f61Var.g(i48);
                    }
                } else {
                    f61Var.s(i16);
                    if (i17 != -1) {
                        i17--;
                    }
                }
                if (i17 == -1 && (i11 = this.y0) != -1) {
                    this.a.i(i11);
                } else if (i17 != -1 && this.y0 == -1) {
                    this.a.s(i17);
                }
                if (i18 == -1 && (i10 = this.E) != -1) {
                    this.a.i(i10);
                } else if (i18 != -1 && this.E == -1) {
                    this.a.s(i18);
                }
            }
        }
        if (i7 == 1) {
            this.M0 = org.telegram.ui.ActionBar.k6.p;
            this.L0 = org.telegram.ui.ActionBar.k6.o;
        }
        E0();
    }

    public final void G0(Location location, boolean z9) {
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
                    int i11 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    alertDialog$Builder.a.T = org.telegram.messenger.hd.M0(2131749529, "GpsDisabledAlertText");
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751806, "ConnectingToProxyEnable"), new n51(this, i10));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
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
        if (location == null || z9) {
            if (!this.K0) {
                this.K0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.Q0);
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.R0);
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.k6.x = location.getLatitude();
        org.telegram.ui.ActionBar.k6.y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.k6.x, org.telegram.ui.ActionBar.k6.y);
        org.telegram.ui.ActionBar.k6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.k6.t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.k6.w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.k6.u = calendar.get(5);
        Utilities.e.c(new o51(this, i7));
        org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) this.b.K(this.Z);
        if (xi0Var != null) {
            View view = xi0Var.a;
            if (view instanceof org.telegram.ui.Cells.z8) {
                ((org.telegram.ui.Cells.z8) view).setText(D0());
            }
        }
        if (org.telegram.ui.ActionBar.k6.p && org.telegram.ui.ActionBar.k6.o == 1) {
            org.telegram.ui.ActionBar.k6.F(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.U0 = !org.telegram.ui.ActionBar.k6.k1();
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f;
        if (i10 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752878, "BrowseThemes"));
            org.telegram.ui.ActionBar.e5 o4 = this.simpleActionBar.o();
            org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(R.raw.sun, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.S0 = zg0Var;
            if (this.U0) {
                zg0Var.M(zg0Var.e[0] - 1);
            } else {
                zg0Var.M(0);
            }
            org.telegram.ui.Components.zg0 zg0Var2 = this.S0;
            zg0Var2.h = true;
            o4.getClass();
            this.s = o4.c(5, 0, null, zg0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752210, "ChatSettings"));
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.ic_ab_other);
            this.s = b10;
            b10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, "AccDescrMoreOptions"));
            this.s.e(2, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745427, "ShareTheme"));
            this.s.e(3, R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751220, "EditThemeColors"));
            this.s.e(1, R.drawable.msg_palette, org.telegram.messenger.hd.M0(2131751710, "CreateNewThemeMenu"));
            this.s.e(4, R.drawable.msg_reset, org.telegram.messenger.hd.M0(2131744149, "ThemeResetToDefaults"));
            if (getMessagesController().m8 == null) {
                getMessagesController().R0(new r3(this, 24));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753784, null));
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new v51(this));
        this.a = new f61(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new v4.b0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((v4.k) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        this.b.setOnItemClickListener(new lk0(16, this, context));
        if (i10 == 0) {
            v4.k kVar = new v4.k();
            kVar.n(350L);
            kVar.o(org.telegram.ui.Components.xq.h);
            kVar.C = false;
            kVar.m = false;
            this.b.setItemAnimator(kVar);
        }
        if (this.T0) {
            F0(false);
            this.T0 = false;
            this.b.v0(this.a.e.J0 - 1);
            org.telegram.messenger.g0.i3(new o51(this, i7), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        org.telegram.ui.ActionBar.u1 u1Var;
        int i12;
        int i13;
        if (i7 == org.telegram.messenger.qs.v4) {
            G0(null, true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.z4 || i7 == org.telegram.messenger.qs.i4) {
            org.telegram.ui.Components.pj0 pj0Var = this.b;
            if (pj0Var != null) {
                pj0Var.g1();
            }
            E0();
            return;
        }
        if (i7 == org.telegram.messenger.qs.R5) {
            f61 f61Var = this.a;
            if (f61Var == null || (i13 = this.browserRow) == -1) {
                return;
            }
            f61Var.g(i13);
            return;
        }
        if (i7 == org.telegram.messenger.qs.q4) {
            f61 f61Var2 = this.a;
            if (f61Var2 == null || (i12 = this.q0) == -1) {
                return;
            }
            f61Var2.h(i12, new Object());
            return;
        }
        if (i7 == org.telegram.messenger.qs.o4) {
            F0(true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.M2) {
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (j6Var == this.h && h6Var == this.n) {
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(getMessagesController().U2);
                sb2.append("/addtheme/");
                sb2.append((h6Var != null ? h6Var.r : j6Var.F).slug);
                String sb3 = sb2.toString();
                showDialog(new org.telegram.ui.Components.mo0(getParentActivity(), null, sb3, false, sb3, false, null));
                org.telegram.ui.ActionBar.u1 u1Var2 = this.r;
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.N2) {
            org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (j6Var2 == this.h && h6Var2 == this.n && (u1Var = this.r) == null) {
                u1Var.dismiss();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.s4) {
            if (getParentActivity() == null || this.isPaused) {
                return;
            }
            this.h = (org.telegram.ui.ActionBar.j6) objArr[0];
            this.n = (org.telegram.ui.ActionBar.h6) objArr[1];
            org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
            this.r = u1Var3;
            u1Var3.i0 = true;
            showDialog(u1Var3, new q5(this, 16));
            return;
        }
        if (i7 != org.telegram.messenger.qs.t4) {
            if (i7 == org.telegram.messenger.qs.U4) {
                int i14 = this.p0;
                if (i14 >= 0) {
                    this.a.g(i14);
                    return;
                }
                return;
            }
            if ((i7 == org.telegram.messenger.qs.S3 || i7 == org.telegram.messenger.qs.P3) && (i11 = this.sensitiveContentRow) >= 0) {
                this.a.g(i11);
                return;
            }
            return;
        }
        E0();
        if (this.f != 3) {
            return;
        }
        boolean k12 = org.telegram.ui.ActionBar.k6.k1();
        boolean z9 = !k12;
        if (this.U0 != z9) {
            this.U0 = z9;
            org.telegram.ui.Components.zg0 zg0Var = this.S0;
            zg0Var.P(!k12 ? zg0Var.e[0] - 1 : 0);
            this.s.getIconView().d();
        }
        if (this.p0 >= 0) {
            for (int i15 = 0; i15 < this.b.getChildCount(); i15++) {
                if (this.b.getChildAt(i15) instanceof tt) {
                    ((tt) this.b.getChildAt(i15)).a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.i0.class, org.telegram.ui.Cells.aa.class, g61.class, w51.class, c61.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Cells.ga.class, e61.class, org.telegram.ui.Cells.m8.class, nl0.class, org.telegram.ui.Components.uw0.class, tt.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        int i7 = org.telegram.ui.ActionBar.k6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{c61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{c61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{g61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bc));
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.addAll(c8.ma.a(new f6(22, this), i12, org.telegram.ui.ActionBar.k6.G6, i13));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.v4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.z4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.o4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.q4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.s4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.t4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.U4);
        getNotificationCenter().c(this, org.telegram.messenger.qs.P3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.S3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.N2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.R5);
        if (this.f == 0) {
            org.telegram.ui.ActionBar.k6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.k6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.K0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
        locationManager.removeUpdates(this.Q0);
        locationManager.removeUpdates(this.R0);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.v4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.z4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.o4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.q4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.s4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.t4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.U4);
        getNotificationCenter().n(this, org.telegram.messenger.qs.P3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.S3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.N2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.R5);
        org.telegram.ui.ActionBar.k6.w1();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            F0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
