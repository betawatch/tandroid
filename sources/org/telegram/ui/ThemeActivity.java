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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class ThemeActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
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
    public final u51 S0;
    public int T;
    public final u51 T0;
    public int U;
    public org.telegram.ui.Components.ch0 U0;
    public int V;
    public boolean V0;
    public int W;
    public boolean W0;
    public int X;
    public int Y;
    public int Z;
    public c61 a;
    public int a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.uj0 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public a61 c;
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
    public org.telegram.ui.ActionBar.i6 h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.g6 n;
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
    public org.telegram.ui.ActionBar.d5 s;
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

    /* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
    public static class InnerAccentView extends View {
        public final Paint a;
        public ObjectAnimator b;
        public float c;
        public org.telegram.ui.ActionBar.i6 d;
        public org.telegram.ui.ActionBar.g6 e;
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
            paint.setAlpha(org.telegram.messenger.ns.e4);
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
        this.S0 = new u51(this);
        this.T0 = new u51(this);
        this.f = i7;
        F0(true);
    }

    public static String D0() {
        int i7 = org.telegram.ui.ActionBar.j6.v;
        int i10 = i7 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i7 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.j6.t;
        int i12 = i11 / 60;
        return org.telegram.messenger.hd.a0("AutoNightUpdateLocationInfo", null, 2131753780, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public static void H0(final int i7, final Context context, final org.telegram.messenger.z10 z10Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        final org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        final String str = s12.v6;
        String str2 = s12.w6;
        final int i10 = s12.x6;
        if (TextUtils.isEmpty(str) || !((org.telegram.messenger.h0) s12.y7.m.b).c) {
            z10Var.a(Boolean.TRUE);
            return;
        }
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        k10.O = f10;
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout, L2, M, null, e6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, c8.ja.e(50, 50, 17));
        f10.addView(frameLayout, c8.ja.t(80, 80, 1, 0, 20, 0, 8));
        int i12 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = c8.sa.b(context, 20.0f, i12, true, e6Var);
        b10.setText(org.telegram.messenger.hd.M0(2131754307, null));
        b10.setGravity(17);
        f10.addView(b10, c8.ja.t(-1, -2, 7, 24, 8, 24, 8));
        TextView b11 = c8.sa.b(context, 14.0f, i12, false, e6Var);
        b11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.N0("AgeVerificationText" + str2)));
        b11.setGravity(17);
        f10.addView(b11, c8.ja.t(-1, -2, 7, 24, 0, 24, 0));
        final hi.d dVar = new hi.d(context, e6Var, true);
        dVar.i(org.telegram.messenger.hd.M0(2131754313, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final hi.d dVar2 = hi.d.this;
                if (dVar2.R) {
                    return;
                }
                dVar2.setLoading(true);
                final org.telegram.messenger.np npVar = s12;
                final String str3 = str;
                final int i13 = i7;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                final int i14 = i10;
                final org.telegram.messenger.z10 z10Var2 = z10Var;
                final org.telegram.ui.ActionBar.u2[] u2VarArr = r9;
                c8.ka.c(R.raw.permission_request_camera, 2131754310, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new org.telegram.messenger.z10() { // from class: org.telegram.ui.n51
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        final hi.d dVar3 = hi.d.this;
                        if (!booleanValue) {
                            dVar3.setLoading(false);
                            return;
                        }
                        final org.telegram.messenger.np npVar2 = npVar;
                        org.telegram.messenger.p10 d2 = npVar2.d2();
                        final int i15 = i13;
                        final Context context3 = context2;
                        final org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                        final int i16 = i14;
                        final org.telegram.messenger.z10 z10Var3 = z10Var2;
                        final org.telegram.ui.ActionBar.u2[] u2VarArr2 = u2VarArr;
                        d2.a(str3, null, new org.telegram.messenger.z10() { // from class: org.telegram.ui.o51
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r6v2, types: [org.telegram.messenger.w10, org.telegram.ui.p51] */
                            @Override // org.telegram.messenger.z10
                            public final void a(Object obj2) {
                                Long l10 = (Long) obj2;
                                hi.d dVar4 = hi.d.this;
                                if (l10 == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                TLRPC.User a22 = npVar2.a2(l10);
                                if (a22 == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                if (T == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                ki.k4 b12 = ki.k4.b(i15, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, a22, 0, false, false);
                                final ki.x2 x2Var = new ki.x2(context3, e6Var3);
                                final int i17 = i16;
                                final org.telegram.messenger.z10 z10Var4 = z10Var3;
                                ?? r62 = new org.telegram.messenger.w10() { // from class: org.telegram.ui.p51
                                    @Override // org.telegram.messenger.w10
                                    public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        Double d = (Double) obj4;
                                        boolean booleanValue2 = d != null ? d.doubleValue() >= ((double) i17) : ((Boolean) obj3).booleanValue();
                                        x2Var.o(false);
                                        z10Var4.a(Boolean.valueOf(booleanValue2));
                                        org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                        if (!booleanValue2 || T2 == null) {
                                            return;
                                        }
                                        org.telegram.messenger.k5.n(null, 2131754309, org.telegram.ui.Components.cc.a0(T2), R.raw.contact_check, 36);
                                    }
                                };
                                x2Var.M0 = r62;
                                ki.p2 p2Var = x2Var.E;
                                if (p2Var != 0) {
                                    p2Var.setOnVerifiedAge(r62);
                                }
                                x2Var.B(true);
                                x2Var.C0 = false;
                                x2Var.m0 = T.getParentActivity();
                                x2Var.x(T, b12);
                                x2Var.show();
                                dVar4.setLoading(false);
                                u2VarArr2[0].dismiss();
                            }
                        });
                    }
                });
            }
        });
        f10.addView(dVar, c8.ja.t(-1, 48, 7, 2, 29, 2, 14));
        k10.show();
        final org.telegram.ui.ActionBar.u2[] u2VarArr = {k10};
        k10.O();
    }

    public static void Z(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        c61 c61Var;
        org.telegram.ui.Components.uj0 uj0Var = themeActivity.b;
        if (uj0Var == null || !uj0Var.H || (c61Var = themeActivity.a) == null) {
            return;
        }
        int i7 = themeActivity.sensitiveContentRow;
        boolean z10 = false;
        boolean z11 = i7 >= 0;
        if (contentsettings != null && contentsettings.sensitive_can_change) {
            z10 = true;
        }
        if (z11 == z10) {
            c61Var.g(i7);
        } else {
            themeActivity.F0(true);
        }
    }

    public static void b0(final ThemeActivity themeActivity, Context context, View view, final int i7, float f10) {
        int i10;
        int i11;
        final int i12 = 1;
        if (i7 == themeActivity.O) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            boolean z10 = e12.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = e12.edit();
            boolean z11 = !z10;
            edit.putBoolean("view_animations", z11);
            org.telegram.messenger.gz.C1 = Boolean.valueOf(z11);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(z11);
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
            SharedPreferences e13 = org.telegram.messenger.np.e1();
            boolean z12 = e13.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = e13.edit();
            boolean z13 = !z12;
            edit2.putBoolean("send_by_enter", z13);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(z13);
                return;
            }
            return;
        }
        if (i7 == themeActivity.F) {
            org.telegram.messenger.gz.r0 = !org.telegram.messenger.gz.r0;
            SharedPreferences.Editor edit3 = org.telegram.messenger.np.e1().edit();
            edit3.putBoolean("raise_to_speak", org.telegram.messenger.gz.r0);
            edit3.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.r0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.G) {
            org.telegram.messenger.gz.t0 = !org.telegram.messenger.gz.t0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.np.e1().edit();
            edit4.putBoolean("next_media_on_tap", org.telegram.messenger.gz.t0);
            edit4.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.t0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.raiseToListenRow) {
            org.telegram.messenger.gz.s0 = !org.telegram.messenger.gz.s0;
            SharedPreferences.Editor edit5 = org.telegram.messenger.np.e1().edit();
            edit5.putBoolean("raise_to_listen", org.telegram.messenger.gz.s0);
            edit5.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.s0);
            }
            if (!org.telegram.messenger.gz.s0 && themeActivity.F != -1) {
                for (int i14 = 0; i14 < themeActivity.b.getChildCount(); i14++) {
                    View childAt = themeActivity.b.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.q8) {
                        themeActivity.b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.F) {
                            ((org.telegram.ui.Cells.q8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.F0(false);
            return;
        }
        if (i7 == themeActivity.pauseOnRecordRow) {
            org.telegram.messenger.gz.F0 = !org.telegram.messenger.gz.F0;
            SharedPreferences.Editor edit6 = org.telegram.messenger.np.e1().edit();
            edit6.putBoolean("pauseMusicOnRecord", org.telegram.messenger.gz.F0);
            edit6.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.F0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.pauseOnMediaRow) {
            org.telegram.messenger.gz.G0 = !org.telegram.messenger.gz.G0;
            SharedPreferences.Editor edit7 = org.telegram.messenger.np.e1().edit();
            edit7.putBoolean("pauseMusicOnMedia", org.telegram.messenger.gz.G0);
            edit7.apply();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.G0);
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
            LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
            CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131751366, "DistanceUnitsAutomatic"), org.telegram.messenger.hd.M0(2131751365, "DistanceUnitsKilometers"), org.telegram.messenger.hd.M0(2131751364, "DistanceUnitsMiles")};
            final int i16 = 0;
            while (i16 < 3) {
                org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                float f13 = f11;
                i6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f13), 0);
                i6Var.a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E5, false));
                i6Var.b(charSequenceArr[i16], i16 == org.telegram.messenger.gz.s1);
                int i17 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i17, false), 2, -1);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i17);
                i6Var.setBackground(h02);
                org.telegram.ui.ActionBar.q6.j(i6Var, h02, null, M, null);
                f12.addView(i6Var);
                i6Var.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.q51
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
                                org.telegram.messenger.gz.s1 = i16;
                                SharedPreferences.Editor edit8 = org.telegram.messenger.np.e1().edit();
                                edit8.putInt("distanceSystemType", org.telegram.messenger.gz.s1);
                                edit8.apply();
                                org.telegram.messenger.hd.g0 = null;
                                themeActivity2.Q0 = true;
                                v4.e1 K = themeActivity2.b.K(themeActivity2.L);
                                if (K != null) {
                                    themeActivity2.a.t(K, themeActivity2.L);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                            default:
                                org.telegram.messenger.gz.p0 = i16;
                                SharedPreferences.Editor edit9 = org.telegram.messenger.np.e1().edit();
                                edit9.putInt("searchEngineType", org.telegram.messenger.gz.p0);
                                edit9.apply();
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.R0 = true;
                                v4.e1 K2 = themeActivity3.b.K(themeActivity3.M);
                                if (K2 != null) {
                                    themeActivity3.a.t(K2, themeActivity3.M);
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
            alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131751363, "DistanceUnitsTitle");
            alertDialog$Builder.o(f12);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
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
            LinearLayout f14 = org.telegram.messenger.k5.f(context, 1);
            ArrayList b10 = org.telegram.ui.web.d1.b();
            int size = b10.size();
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            final int i18 = 0;
            while (i18 < size) {
                charSequenceArr2[i18] = ((org.telegram.ui.web.d1) b10.get(i18)).a;
                org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
                i6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                i6Var2.a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E5, false));
                i6Var2.b(charSequenceArr2[i18], i18 == org.telegram.messenger.gz.p0);
                int i19 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i19, false), 2, -1);
                org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i19);
                i6Var2.setBackground(h03);
                org.telegram.ui.ActionBar.q6.j(i6Var2, h03, null, M2, null);
                f14.addView(i6Var2);
                i6Var2.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.q51
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
                                org.telegram.messenger.gz.s1 = i18;
                                SharedPreferences.Editor edit8 = org.telegram.messenger.np.e1().edit();
                                edit8.putInt("distanceSystemType", org.telegram.messenger.gz.s1);
                                edit8.apply();
                                org.telegram.messenger.hd.g0 = null;
                                themeActivity2.Q0 = true;
                                v4.e1 K = themeActivity2.b.K(themeActivity2.L);
                                if (K != null) {
                                    themeActivity2.a.t(K, themeActivity2.L);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                            default:
                                org.telegram.messenger.gz.p0 = i18;
                                SharedPreferences.Editor edit9 = org.telegram.messenger.np.e1().edit();
                                edit9.putInt("searchEngineType", org.telegram.messenger.gz.p0);
                                edit9.apply();
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.R0 = true;
                                v4.e1 K2 = themeActivity3.b.K(themeActivity3.M);
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
            alertDialog$Builder2.a.S = org.telegram.messenger.hd.M0(2131745799, null);
            alertDialog$Builder2.o(f14);
            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
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
            LinearLayout f15 = org.telegram.messenger.k5.f(context, 1);
            org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
            i6Var3.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            int i20 = org.telegram.ui.ActionBar.j6.g7;
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i20, false);
            int i21 = org.telegram.ui.ActionBar.j6.E5;
            i6Var3.a(x02, org.telegram.ui.ActionBar.j6.x0(null, i21, false));
            i6Var3.b(org.telegram.messenger.hd.M0(2131748438, null), !org.telegram.messenger.gz.u0);
            int i22 = org.telegram.ui.ActionBar.j6.i6;
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i22, false), 2, -1);
            org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i22);
            i6Var3.setBackground(h04);
            org.telegram.ui.ActionBar.q6.j(i6Var3, h04, null, M3, null);
            f15.addView(i6Var3);
            i6Var3.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.r51
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
                            org.telegram.messenger.gz.u0 = false;
                            org.telegram.messenger.gz.y();
                            themeActivity2.P0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.e1 K = themeActivity2.b.K(themeActivity2.N);
                            if (K != null) {
                                themeActivity2.a.t(K, themeActivity2.N);
                                break;
                            }
                            break;
                        default:
                            c8.ka.c(R.raw.permission_request_microphone, 2131747310, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new x21(1, themeActivity2, atomicReference4));
                            org.telegram.messenger.gz.u0 = true;
                            org.telegram.messenger.gz.y();
                            themeActivity2.P0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.e1 K2 = themeActivity2.b.K(themeActivity2.N);
                            if (K2 != null) {
                                themeActivity2.a.t(K2, themeActivity2.N);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.i6 i6Var4 = new org.telegram.ui.Cells.i6(themeActivity.getParentActivity(), null);
            i6Var4.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            i6Var4.a(org.telegram.ui.ActionBar.j6.x0(null, i20, false), org.telegram.ui.ActionBar.j6.x0(null, i21, false));
            String M0 = org.telegram.messenger.hd.M0(2131748435, null);
            String M02 = org.telegram.messenger.hd.M0(2131748436, null);
            boolean z14 = org.telegram.messenger.gz.u0;
            i6Var4.a.setText(M0);
            TextView textView = i6Var4.b;
            textView.setVisibility(0);
            textView.setText(M02);
            i6Var4.c.a(z14, false);
            org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i22, false), 2, -1);
            org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i22);
            i6Var4.setBackground(h05);
            org.telegram.ui.ActionBar.q6.j(i6Var4, h05, null, M4, null);
            f15.addView(i6Var4);
            i6Var4.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.r51
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
                            org.telegram.messenger.gz.u0 = false;
                            org.telegram.messenger.gz.y();
                            themeActivity2.P0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.e1 K = themeActivity2.b.K(themeActivity2.N);
                            if (K != null) {
                                themeActivity2.a.t(K, themeActivity2.N);
                                break;
                            }
                            break;
                        default:
                            c8.ka.c(R.raw.permission_request_microphone, 2131747310, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new x21(1, themeActivity2, atomicReference4));
                            org.telegram.messenger.gz.u0 = true;
                            org.telegram.messenger.gz.y();
                            themeActivity2.P0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            v4.e1 K2 = themeActivity2.b.K(themeActivity2.N);
                            if (K2 != null) {
                                themeActivity2.a.t(K2, themeActivity2.N);
                                break;
                            }
                            break;
                    }
                }
            });
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
            alertDialog$Builder3.a.S = org.telegram.messenger.hd.M0(2131748439, null);
            alertDialog$Builder3.o(f15);
            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.a;
            atomicReference3.set(t1Var3);
            themeActivity.showDialog(t1Var3);
            return;
        }
        if (i7 == themeActivity.E) {
            org.telegram.messenger.gz.x0 = !org.telegram.messenger.gz.x0;
            SharedPreferences.Editor edit8 = org.telegram.messenger.np.e1().edit();
            edit8.putBoolean("direct_share", org.telegram.messenger.gz.x0);
            edit8.apply();
            g0.f.n(org.telegram.messenger.t0.b);
            org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).m();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.x0);
                return;
            }
            return;
        }
        if (i7 == themeActivity.sensitiveContentRow) {
            if (themeActivity.getMessagesController().T4()) {
                themeActivity.getMessagesController().G4(false);
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(themeActivity.getMessagesController().T4());
                    return;
                }
                return;
            }
            fy0 fy0Var = new fy0(9, themeActivity, view);
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, context, themeActivity.resourceProvider);
            alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131751813, null);
            alertDialog$Builder4.a.U = org.telegram.messenger.hd.M0(2131751814, null);
            alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751817, null), new xi0(19, themeActivity, fy0Var));
            alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
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
            alertDialog$Builder5.a.S = org.telegram.messenger.hd.M0(2131745291, "SortBy");
            alertDialog$Builder5.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131751600, "Default"), org.telegram.messenger.hd.M0(2131745287, "SortFirstName"), org.telegram.messenger.hd.M0(2131745286, "SortLastName")}, new bx(themeActivity, i7, i15));
            alertDialog$Builder5.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
            themeActivity.showDialog(alertDialog$Builder5.a);
            return;
        }
        if (i7 == themeActivity.t0) {
            int i23 = org.telegram.messenger.gz.a;
            org.telegram.messenger.qc.i = !org.telegram.messenger.qc.e(256) ? 256 | org.telegram.messenger.qc.d(true) : org.telegram.messenger.qc.d(true) & (-257);
            org.telegram.messenger.qc.k();
            if (view instanceof org.telegram.ui.Cells.q8) {
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.f());
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
            if (org.telegram.ui.ActionBar.j6.o == 0) {
                org.telegram.ui.ActionBar.j6.o = 2;
                h5Var.setChecked(true);
            } else {
                org.telegram.ui.ActionBar.j6.o = 0;
                h5Var.setChecked(false);
            }
            org.telegram.ui.ActionBar.j6.w1();
            org.telegram.ui.ActionBar.j6.F(true);
            boolean z15 = org.telegram.ui.ActionBar.j6.o != 0;
            String C0 = z15 ? org.telegram.ui.ActionBar.j6.C0() : org.telegram.messenger.hd.M0(2131753783, "AutoNightThemeOff");
            if (z15) {
                int i24 = org.telegram.ui.ActionBar.j6.o;
                C0 = a8.p0.E(i24 == 1 ? org.telegram.messenger.hd.M0(2131753787, "AutoNightScheduled") : i24 == 3 ? org.telegram.messenger.hd.M0(2131753786, "AutoNightSystemDefault") : org.telegram.messenger.hd.M0(2131753796, "AutoNightAdaptive"), " ", C0);
            }
            h5Var.b(org.telegram.messenger.hd.M0(2131753784, "AutoNightTheme"), C0, R.drawable.menu_night_mode_24, z15, 0, false, true, false);
            return;
        }
        if (i7 == themeActivity.browserRow) {
            if ((!org.telegram.messenger.hd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.hd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                themeActivity.presentFragment(new org.telegram.ui.web.n1(null));
                return;
            }
            org.telegram.ui.Cells.h5 h5Var2 = (org.telegram.ui.Cells.h5) view;
            org.telegram.messenger.np messagesController = themeActivity.getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.z8;
            if (tL_webBrowserSettings != null) {
                messagesController.v5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
            }
            h5Var2.setChecked(themeActivity.getMessagesController().M2());
            return;
        }
        if (i7 == themeActivity.S) {
            if (org.telegram.ui.ActionBar.j6.o == 0) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 0;
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.j6.F(false);
            return;
        }
        if (i7 == themeActivity.T) {
            if (org.telegram.ui.ActionBar.j6.o == 1) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 1;
            if (org.telegram.ui.ActionBar.j6.p) {
                themeActivity.G0(null, true);
            }
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.j6.F(false);
            return;
        }
        if (i7 == themeActivity.U) {
            if (org.telegram.ui.ActionBar.j6.o == 2) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 2;
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.j6.F(false);
            return;
        }
        if (i7 == themeActivity.V) {
            if (org.telegram.ui.ActionBar.j6.o == 3) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 3;
            themeActivity.F0(true);
            org.telegram.ui.ActionBar.j6.F(false);
            return;
        }
        if (i7 == themeActivity.Y) {
            boolean z16 = !org.telegram.ui.ActionBar.j6.p;
            org.telegram.ui.ActionBar.j6.p = z16;
            ((org.telegram.ui.Cells.q8) view).setChecked(z16);
            themeActivity.F0(true);
            if (org.telegram.ui.ActionBar.j6.p) {
                themeActivity.G0(null, true);
            }
            org.telegram.ui.ActionBar.j6.F(false);
            return;
        }
        if (i7 == themeActivity.b0 || i7 == themeActivity.c0) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            if (i7 == themeActivity.b0) {
                i10 = org.telegram.ui.ActionBar.j6.r;
                i11 = i10 / 60;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.s;
                i11 = i10 / 60;
            }
            int i25 = i10 - (i11 * 60);
            final org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.j51
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i26, int i27) {
                    int i28 = (i26 * 60) + i27;
                    int i29 = ThemeActivity.this.b0;
                    int i30 = i7;
                    org.telegram.ui.Cells.v9 v9Var2 = v9Var;
                    if (i30 == i29) {
                        org.telegram.ui.ActionBar.j6.r = i28;
                        v9Var2.c(org.telegram.messenger.hd.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i27)), false, true);
                    } else {
                        org.telegram.ui.ActionBar.j6.s = i28;
                        v9Var2.c(org.telegram.messenger.hd.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i27)), false, true);
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
            themeActivity.presentFragment(new ai.x2());
        } else if (i7 == themeActivity.liteModeRow) {
            themeActivity.presentFragment(new x90());
        }
    }

    public static void c0(ThemeActivity themeActivity, fy0 fy0Var) {
        H0(themeActivity.currentAccount, themeActivity.getParentActivity(), new x21(2, themeActivity, fy0Var), themeActivity.getResourceProvider());
    }

    public static boolean d0(ThemeActivity themeActivity, int i7, boolean z10) {
        if (i7 == org.telegram.messenger.gz.Y0) {
            return false;
        }
        org.telegram.messenger.gz.Y0 = i7;
        SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
        edit.putInt("bubbleRadius", org.telegram.messenger.gz.Y0);
        edit.commit();
        v4.e1 K = themeActivity.b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.a;
            if (view instanceof d61) {
                d61 d61Var = (d61) view;
                org.telegram.ui.Cells.q1[] cells = d61Var.a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().S1 = false;
                    cells[i10].requestLayout();
                }
                d61Var.invalidate();
            }
        }
        v4.e1 K2 = themeActivity.b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.a;
            if (view2 instanceof t51) {
                t51 t51Var = (t51) view2;
                if (z10) {
                    t51Var.requestLayout();
                } else {
                    t51Var.invalidate();
                }
            }
        }
        themeActivity.E0();
        return true;
    }

    public static boolean p0(ThemeActivity themeActivity, int i7) {
        if (i7 != org.telegram.messenger.gz.W0) {
            org.telegram.messenger.gz.W0 = i7;
            org.telegram.messenger.gz.X0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", org.telegram.messenger.gz.W0);
                edit.commit();
                org.telegram.ui.ActionBar.j6.Q();
                v4.e1 K = themeActivity.b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof d61) {
                        org.telegram.ui.Cells.q1[] cells = ((d61) view).a.getCells();
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
        String M0 = org.telegram.messenger.hd.M0(2131748258, "NewTheme");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131751711, "CreateNewThemeAlert");
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751703, "CreateTheme"), new k51(this, 2));
        showDialog(t1Var);
    }

    public final void C0() {
        org.telegram.ui.ActionBar.i6 D0 = org.telegram.ui.ActionBar.j6.D0();
        presentFragment(new t71(D0, false, 1, D0.k(false).a >= 100, this.f == 1));
    }

    public final void E0() {
        org.telegram.ui.ActionBar.b6 b6Var;
        if (this.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.i6 D0 = org.telegram.ui.ActionBar.j6.D0();
        org.telegram.ui.ActionBar.g6 k10 = D0.k(false);
        ArrayList arrayList = D0.c0;
        if (arrayList == null || arrayList.isEmpty() || k10 == null || k10.a < 100) {
            this.s.u(2);
            this.s.u(3);
        } else {
            this.s.T(2);
            this.s.T(3);
        }
        int i7 = org.telegram.messenger.g0.Q1() ? 18 : 16;
        org.telegram.ui.ActionBar.i6 D02 = org.telegram.ui.ActionBar.j6.D0();
        if (org.telegram.messenger.gz.W0 == i7 && org.telegram.messenger.gz.Y0 == 17 && D02.T && D02.Z == org.telegram.ui.ActionBar.j6.n && (k10 == null || (b6Var = k10.y) == null || "d".equals(b6Var.c))) {
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
        int size = org.telegram.ui.ActionBar.j6.F.size();
        int i19 = 0;
        while (true) {
            i7 = this.f;
            if (i19 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i19);
            if (i7 == 0 || i7 == 3 || ((i6Var.b != null || i6Var.q()) && ((tL_theme = i6Var.G) == null || tL_theme.document != null))) {
                if (i6Var.b != null) {
                    arrayList2.add(i6Var);
                } else {
                    arrayList.add(i6Var);
                }
            }
            i19++;
        }
        Collections.sort(arrayList, new qv0(3));
        if (i7 == 3) {
            int i20 = this.L0;
            this.x0 = i20;
            this.q0 = i20 + 1;
            this.o0 = i20 + 2;
            this.y0 = i20 + 3;
            this.j0 = i20 + 4;
            this.L0 = i20 + 6;
            this.p0 = i20 + 5;
            boolean z11 = org.telegram.ui.ActionBar.j6.D0().X != 0;
            this.w = z11;
            a61 a61Var = this.c;
            if (a61Var != null) {
                a61Var.setDrawDivider(z11);
            }
            if (this.w) {
                int i21 = this.L0;
                this.L0 = i21 + 1;
                this.r0 = i21;
            }
            int i22 = this.L0;
            this.L0 = i22 + 1;
            this.l0 = i22;
            org.telegram.ui.ActionBar.i6 D0 = org.telegram.ui.ActionBar.j6.D0();
            org.telegram.ui.ActionBar.g6 k10 = D0.k(false);
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
            if (DictationAsr.A()) {
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
            if (org.telegram.messenger.gz.s0) {
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
            TL_account.contentSettings contentsettings = getMessagesController().n8;
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
            int i36 = org.telegram.ui.ActionBar.j6.o;
            if (i36 == 1) {
                this.X = i35;
                int i37 = i34 + 3;
                this.L0 = i37;
                this.Y = i34 + 2;
                if (org.telegram.ui.ActionBar.j6.p) {
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
            if (org.telegram.ui.ActionBar.j6.o != 0) {
                int i38 = this.L0;
                this.h0 = i38;
                this.L0 = i38 + 2;
                this.p0 = i38 + 1;
                boolean z12 = org.telegram.ui.ActionBar.j6.J.X != 0;
                this.w = z12;
                a61 a61Var2 = this.c;
                if (a61Var2 != null) {
                    a61Var2.setDrawDivider(z12);
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
        a61 a61Var3 = this.c;
        if (a61Var3 != null) {
            int width = this.b.getWidth();
            int i41 = a61Var3.o3;
            org.telegram.ui.Cells.fa faVar = a61Var3.k3;
            if (i41 != faVar.b()) {
                faVar.f();
                if (a61Var3.j3 != (a61Var3.n3 == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.D0())) {
                    a61Var3.A1(width);
                }
            }
        }
        c61 c61Var = this.a;
        if (c61Var != null) {
            if (i7 == 1 && (i13 = this.N0) != (i14 = org.telegram.ui.ActionBar.j6.o) && i13 != -1) {
                int i42 = this.W;
                int i43 = i42 + 1;
                if (i13 != i14) {
                    int i44 = 0;
                    while (i44 < 4) {
                        org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) this.b.K(i44);
                        if (cj0Var != null) {
                            View view = cj0Var.a;
                            if (view instanceof org.telegram.ui.Cells.aa) {
                                ((org.telegram.ui.Cells.aa) view).setTypeChecked(i44 == org.telegram.ui.ActionBar.j6.o);
                            }
                        }
                        i44++;
                    }
                    int i45 = org.telegram.ui.ActionBar.j6.o;
                    if (i45 == 0) {
                        this.a.p(i43, i15 - i43);
                    } else if (i45 == 1) {
                        int i46 = this.N0;
                        if (i46 == 0) {
                            this.a.o(i43, this.L0 - i43);
                        } else if (i46 == 2) {
                            this.a.p(i43, 3);
                            this.a.o(i43, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                        } else if (i46 == 3) {
                            this.a.o(i43, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                        }
                    } else if (i45 == 2) {
                        int i47 = this.N0;
                        if (i47 == 0) {
                            this.a.o(i43, this.L0 - i43);
                        } else if (i47 == 1) {
                            this.a.p(i43, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
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
                            this.a.p(i43, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                        }
                    }
                } else {
                    boolean z13 = this.O0;
                    boolean z14 = org.telegram.ui.ActionBar.j6.p;
                    if (z13 != z14) {
                        int i49 = i42 + 3;
                        c61Var.p(i49, z14 ? 3 : 2);
                        this.a.o(i49, org.telegram.ui.ActionBar.j6.p ? 2 : 3);
                    }
                }
            } else if (z10 || this.N0 == -1) {
                c61Var.f();
            } else {
                if (i16 == -1 && (i12 = this.r0) != -1) {
                    c61Var.i(i12);
                } else if (i16 == -1 || this.r0 != -1) {
                    int i50 = this.r0;
                    if (i50 != -1) {
                        c61Var.g(i50);
                    }
                } else {
                    c61Var.s(i16);
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
            this.O0 = org.telegram.ui.ActionBar.j6.p;
            this.N0 = org.telegram.ui.ActionBar.j6.o;
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
                    int i11 = org.telegram.ui.ActionBar.j6.L5;
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131749530, "GpsDisabledAlertText");
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751806, "ConnectingToProxyEnable"), new k51(this, i10));
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
        org.telegram.ui.ActionBar.j6.x = location.getLatitude();
        org.telegram.ui.ActionBar.j6.y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.j6.x, org.telegram.ui.ActionBar.j6.y);
        org.telegram.ui.ActionBar.j6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.j6.t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.j6.w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.j6.u = calendar.get(5);
        Utilities.e.c(new l51(this, i7));
        org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) this.b.K(this.a0);
        if (cj0Var != null) {
            View view = cj0Var.a;
            if (view instanceof org.telegram.ui.Cells.y8) {
                ((org.telegram.ui.Cells.y8) view).setText(D0());
            }
        }
        if (org.telegram.ui.ActionBar.j6.p && org.telegram.ui.ActionBar.j6.o == 1) {
            org.telegram.ui.ActionBar.j6.F(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Kj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.W0 = !org.telegram.ui.ActionBar.j6.k1();
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f;
        if (i10 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752878, "BrowseThemes"));
            org.telegram.ui.ActionBar.c5 r10 = this.simpleActionBar.r();
            org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.sun, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.U0 = ch0Var;
            if (this.W0) {
                ch0Var.M(ch0Var.e[0] - 1);
            } else {
                ch0Var.M(0);
            }
            org.telegram.ui.Components.ch0 ch0Var2 = this.U0;
            ch0Var2.h = true;
            r10.getClass();
            this.s = r10.c(5, 0, null, ch0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752210, "ChatSettings"));
            org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(0, R.drawable.ic_ab_other);
            this.s = b10;
            b10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, "AccDescrMoreOptions"));
            this.s.e(2, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745426, "ShareTheme"));
            this.s.e(3, R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751219, "EditThemeColors"));
            this.s.e(1, R.drawable.msg_palette, org.telegram.messenger.hd.M0(2131751709, "CreateNewThemeMenu"));
            this.s.e(4, R.drawable.msg_reset, org.telegram.messenger.hd.M0(2131744148, "ThemeResetToDefaults"));
            if (getMessagesController().n8 == null) {
                getMessagesController().R0(new r3(this, 24));
            }
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753784, null));
        }
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s51(this));
        this.a = new c61(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var;
        uj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new v4.b0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((v4.k) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, c8.ja.c(-1.0f, -1));
        this.b.setOnItemClickListener(new xi0(20, this, context));
        if (i10 == 0) {
            v4.k kVar = new v4.k();
            kVar.n(350L);
            kVar.o(org.telegram.ui.Components.er.h);
            kVar.C = false;
            kVar.m = false;
            this.b.setItemAnimator(kVar);
        }
        if (this.V0) {
            F0(false);
            this.V0 = false;
            this.b.v0(this.a.e.L0 - 1);
            org.telegram.messenger.g0.i3(new l51(this, i7), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        org.telegram.ui.ActionBar.t1 t1Var;
        int i12;
        int i13;
        if (i7 == org.telegram.messenger.ns.v4) {
            G0(null, true);
            return;
        }
        if (i7 == org.telegram.messenger.ns.z4 || i7 == org.telegram.messenger.ns.i4) {
            org.telegram.ui.Components.uj0 uj0Var = this.b;
            if (uj0Var != null) {
                uj0Var.g1();
            }
            E0();
            return;
        }
        if (i7 == org.telegram.messenger.ns.R5) {
            c61 c61Var = this.a;
            if (c61Var == null || (i13 = this.browserRow) == -1) {
                return;
            }
            c61Var.g(i13);
            return;
        }
        if (i7 == org.telegram.messenger.ns.q4) {
            c61 c61Var2 = this.a;
            if (c61Var2 == null || (i12 = this.r0) == -1) {
                return;
            }
            c61Var2.h(i12, new Object());
            return;
        }
        if (i7 == org.telegram.messenger.ns.o4) {
            F0(true);
            return;
        }
        if (i7 == org.telegram.messenger.ns.M2) {
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (i6Var == this.h && g6Var == this.n) {
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(getMessagesController().V2);
                sb2.append("/addtheme/");
                sb2.append((g6Var != null ? g6Var.r : i6Var.G).slug);
                String sb3 = sb2.toString();
                showDialog(new org.telegram.ui.Components.po0(getParentActivity(), null, sb3, false, sb3, false, null));
                org.telegram.ui.ActionBar.t1 t1Var2 = this.r;
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.N2) {
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (i6Var2 == this.h && g6Var2 == this.n && (t1Var = this.r) == null) {
                t1Var.dismiss();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.s4) {
            if (getParentActivity() == null || this.isPaused) {
                return;
            }
            this.h = (org.telegram.ui.ActionBar.i6) objArr[0];
            this.n = (org.telegram.ui.ActionBar.g6) objArr[1];
            org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            this.r = t1Var3;
            t1Var3.j0 = true;
            showDialog(t1Var3, new q5(this, 16));
            return;
        }
        if (i7 != org.telegram.messenger.ns.t4) {
            if (i7 == org.telegram.messenger.ns.U4) {
                int i14 = this.q0;
                if (i14 >= 0) {
                    this.a.g(i14);
                    return;
                }
                return;
            }
            if ((i7 == org.telegram.messenger.ns.S3 || i7 == org.telegram.messenger.ns.P3) && (i11 = this.sensitiveContentRow) >= 0) {
                this.a.g(i11);
                return;
            }
            return;
        }
        E0();
        if (this.f != 3) {
            return;
        }
        boolean k12 = org.telegram.ui.ActionBar.j6.k1();
        boolean z10 = !k12;
        if (this.W0 != z10) {
            this.W0 = z10;
            org.telegram.ui.Components.ch0 ch0Var = this.U0;
            ch0Var.P(!k12 ? ch0Var.e[0] - 1 : 0);
            this.s.getIconView().d();
        }
        if (this.q0 >= 0) {
            for (int i15 = 0; i15 < this.b.getChildCount(); i15++) {
                if (this.b.getChildAt(i15) instanceof vt) {
                    ((vt) this.b.getChildAt(i15)).a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.i0.class, org.telegram.ui.Cells.aa.class, d61.class, t51.class, z51.class, org.telegram.ui.Cells.h5.class, org.telegram.ui.Cells.ga.class, b61.class, org.telegram.ui.Cells.l8.class, pl0.class, org.telegram.ui.Components.xw0.class, vt.class, org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.s8));
        int i7 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        int i10 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{z51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{z51.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ee));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{d61.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ec));
        int i12 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i13));
        arrayList.addAll(c8.oa.a(new g6(22, this), i12, org.telegram.ui.ActionBar.j6.G6, i13));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.v4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.z4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.o4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.q4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.i4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.s4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.t4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.U4);
        getNotificationCenter().c(this, org.telegram.messenger.ns.P3);
        getNotificationCenter().c(this, org.telegram.messenger.ns.S3);
        getNotificationCenter().c(this, org.telegram.messenger.ns.M2);
        getNotificationCenter().c(this, org.telegram.messenger.ns.N2);
        getNotificationCenter().c(this, org.telegram.messenger.ns.R5);
        if (this.f == 0) {
            org.telegram.ui.ActionBar.j6.m1(this.currentAccount, true);
            org.telegram.ui.ActionBar.j6.G(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
        locationManager.removeUpdates(this.S0);
        locationManager.removeUpdates(this.T0);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.v4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.z4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.o4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.q4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.i4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.s4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.t4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.U4);
        getNotificationCenter().n(this, org.telegram.messenger.ns.P3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.S3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.M2);
        getNotificationCenter().n(this, org.telegram.messenger.ns.N2);
        getNotificationCenter().n(this, org.telegram.messenger.ns.R5);
        org.telegram.ui.ActionBar.j6.w1();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            F0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
