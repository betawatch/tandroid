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
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserNameResolver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class ThemeActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public final xb1 Q0;
    public int R;
    public final xb1 R0;
    public int S;
    public org.telegram.ui.Components.xi0 S0;
    public int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public gc1 a;
    public int a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.ll0 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public dc1 c;
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
    public org.telegram.ui.ActionBar.h6 n;
    public int n0;
    private int nightThemeRow;
    public int o0;
    public int p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int q0;
    public org.telegram.ui.ActionBar.b2 r;
    public int r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.v0 s;
    public int s0;
    private int sensitiveContentRow;
    private int stickersRow;
    public int t0;
    private int textSizeRow;
    public int u0;
    public boolean v;
    public int v0;
    public int w;
    public int w0;
    public int x;
    public int x0;
    public int y;
    public int y0;
    public int z0;

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class InnerAccentView extends View {
        public final Paint a;
        public ObjectAnimator b;
        public float c;
        public org.telegram.ui.ActionBar.i6 d;
        public org.telegram.ui.ActionBar.h6 e;
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
            float dp = AndroidUtilities.dp(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i10 = this.e.c;
            Paint paint = this.a;
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, dp - (AndroidUtilities.dp(5.0f) * this.c), paint);
            if (this.c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.c), measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.c) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
            }
            int i11 = this.e.e;
            if (i11 == 0 || this.c == 1.0f) {
                return;
            }
            paint.setColor(i11);
            canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.c) * AndroidUtilities.dp(8.0f), paint);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override // android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), TLObject.FLAG_30));
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
        this.Q0 = new xb1(this);
        this.R0 = new xb1(this);
        this.f = i10;
        A0(true);
    }

    public static void C0(final int i10, final Context context, final Utilities.Callback callback, final org.telegram.ui.ActionBar.f6 f6Var) {
        final MessagesController messagesController = MessagesController.getInstance(i10);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i11 = messagesController.verifyAgeMin;
        if (TextUtils.isEmpty(str) || !messagesController.config.needAgeVideoVerification.get()) {
            callback.run(Boolean.TRUE);
            return;
        }
        org.telegram.ui.ActionBar.f3 i12 = org.telegram.messenger.vl.i(1, context, f6Var, false);
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        i12.customView = f7;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, w7.x5.e(50, 50, 17));
        f7.addView(frameLayout, w7.x5.t(80, 80, 1, 0, 20, 0, 8));
        int i13 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = w7.b6.b(context, 20.0f, i13, true, f6Var);
        org.telegram.messenger.vl.k(R.string.AgeVerificationTitle, b10, 17);
        f7.addView(b10, w7.x5.t(-1, -2, 7, 24, 8, 24, 8));
        TextView b11 = w7.b6.b(context, 14.0f, i13, false, f6Var);
        b11.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
        b11.setGravity(17);
        f7.addView(b11, w7.x5.t(-1, -2, 7, 24, 0, 24, 0));
        final di.d dVar = new di.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.AgeVerificationButton), false, true);
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ub1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final di.d dVar2 = di.d.this;
                if (dVar2.N) {
                    return;
                }
                dVar2.setLoading(true);
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.AgeVerificationNeedCameraPermission;
                final MessagesController messagesController2 = messagesController;
                final String str3 = str;
                final int i16 = i10;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                final int i17 = i11;
                final Utilities.Callback callback2 = callback;
                final org.telegram.ui.ActionBar.f3[] f3VarArr = r9;
                org.telegram.ui.Components.de0.e(i14, i15, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() { // from class: org.telegram.ui.qb1
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        final di.d dVar3 = di.d.this;
                        if (!booleanValue) {
                            dVar3.setLoading(false);
                            return;
                        }
                        final MessagesController messagesController3 = messagesController2;
                        UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                        final int i18 = i16;
                        final Context context3 = context2;
                        final org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                        final int i19 = i17;
                        final Utilities.Callback callback3 = callback2;
                        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = f3VarArr;
                        userNameResolver.resolve(str3, new e2.h() { // from class: org.telegram.ui.rb1
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r6v2, types: [org.telegram.messenger.Utilities$Callback4, org.telegram.ui.sb1] */
                            @Override // e2.h
                            public final void accept(Object obj2) {
                                Long l4 = (Long) obj2;
                                di.d dVar4 = di.d.this;
                                if (l4 == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                TLRPC.User user = messagesController3.getUser(l4);
                                if (user == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                fi.f5 b12 = fi.f5.b(i18, l4.longValue(), l4.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                final fi.k3 k3Var = new fi.k3(context3, f6Var3);
                                final int i20 = i19;
                                final Utilities.Callback callback4 = callback3;
                                ?? r62 = new Utilities.Callback4() { // from class: org.telegram.ui.sb1
                                    @Override // org.telegram.messenger.Utilities.Callback4
                                    public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        Double d = (Double) obj4;
                                        boolean booleanValue2 = d != null ? d.doubleValue() >= ((double) i20) : ((Boolean) obj3).booleanValue();
                                        k3Var.k(false);
                                        callback4.run(Boolean.valueOf(booleanValue2));
                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                        if (!booleanValue2 || U2 == null) {
                                            return;
                                        }
                                        org.telegram.messenger.w1.o(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.yc.a0(U2), R.raw.contact_check, 36);
                                    }
                                };
                                k3Var.H0 = r62;
                                fi.b3 b3Var = k3Var.x;
                                if (b3Var != 0) {
                                    b3Var.setOnVerifiedAge(r62);
                                }
                                k3Var.w(true);
                                k3Var.A0 = false;
                                k3Var.k0 = U.getParentActivity();
                                k3Var.s(U, b12);
                                k3Var.show();
                                dVar4.setLoading(false);
                                f3VarArr2[0].dismiss();
                            }
                        });
                    }
                });
            }
        });
        f7.addView(dVar, w7.x5.t(-1, 48, 7, 2, 29, 2, 14));
        i12.show();
        final org.telegram.ui.ActionBar.f3[] f3VarArr = {i12};
        i12.fixNavigationBar();
    }

    public static void U(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        gc1 gc1Var;
        org.telegram.ui.Components.ll0 ll0Var = themeActivity.b;
        if (ll0Var == null || !ll0Var.G || (gc1Var = themeActivity.a) == null) {
            return;
        }
        int i10 = themeActivity.sensitiveContentRow;
        boolean z10 = false;
        boolean z11 = i10 >= 0;
        if (contentsettings != null && contentsettings.sensitive_can_change) {
            z10 = true;
        }
        if (z11 == z10) {
            gc1Var.m(i10);
        } else {
            themeActivity.A0(true);
        }
    }

    public static void W(final ThemeActivity themeActivity, Context context, View view, final int i10, float f7) {
        int i11;
        int i12;
        final int i13 = 1;
        if (i10 == themeActivity.N) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            boolean z11 = !z10;
            edit.putBoolean("view_animations", z11);
            SharedConfig.setAnimationsEnabled(z11);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(z11);
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
            bq0 bq0Var = new bq0();
            bq0Var.H = themeActivity;
            themeActivity.presentFragment(bq0Var);
            return;
        }
        if (i10 == themeActivity.G) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z12 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = globalMainSettings2.edit();
            boolean z13 = !z12;
            edit2.putBoolean("send_by_enter", z13);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                return;
            }
            return;
        }
        if (i10 == themeActivity.E) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.raiseToSpeak);
                return;
            }
            return;
        }
        if (i10 == themeActivity.F) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.nextMediaTap);
                return;
            }
            return;
        }
        if (i10 == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.E != -1) {
                for (int i15 = 0; i15 < themeActivity.b.getChildCount(); i15++) {
                    View childAt = themeActivity.b.getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.w8) {
                        themeActivity.b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.E) {
                            ((org.telegram.ui.Cells.w8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.A0(false);
            return;
        }
        if (i10 == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.pauseMusicOnRecord);
                return;
            }
            return;
        }
        if (i10 == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.pauseMusicOnMedia);
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
            LinearLayout f11 = org.telegram.messenger.vl.f(context, 1);
            CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
            final int i17 = 0;
            while (i17 < 3) {
                org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                k6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                k6Var.b(charSequenceArr[i17], i17 == SharedConfig.distanceSystemType);
                k6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
                f11.addView(k6Var);
                k6Var.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.mb1
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
                                SharedConfig.setSearchEngineType(i17);
                                themeActivity2.P0 = true;
                                s4.c1 K = themeActivity2.b.K(themeActivity2.L);
                                if (K != null) {
                                    themeActivity2.a.v(K, themeActivity2.L);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                            default:
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.getClass();
                                SharedConfig.setDistanceSystemType(i17);
                                themeActivity3.O0 = true;
                                s4.c1 K2 = themeActivity3.b.K(themeActivity3.K);
                                if (K2 != null) {
                                    themeActivity3.a.v(K2, themeActivity3.K);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                        }
                    }
                });
                i17++;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            alertDialog$Builder.n(f11);
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference.set(b2Var);
            themeActivity.showDialog(b2Var);
            return;
        }
        if (i10 == themeActivity.L) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference2 = new AtomicReference();
            LinearLayout f12 = org.telegram.messenger.vl.f(context, 1);
            ArrayList b10 = org.telegram.ui.web.p1.b();
            int size = b10.size();
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            final int i18 = 0;
            while (i18 < size) {
                charSequenceArr2[i18] = ((org.telegram.ui.web.p1) b10.get(i18)).a;
                org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                k6Var2.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(4.0f), 0);
                k6Var2.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                k6Var2.b(charSequenceArr2[i18], i18 == SharedConfig.searchEngineType);
                k6Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
                f12.addView(k6Var2);
                k6Var2.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.mb1
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
                                SharedConfig.setSearchEngineType(i18);
                                themeActivity2.P0 = true;
                                s4.c1 K = themeActivity2.b.K(themeActivity2.L);
                                if (K != null) {
                                    themeActivity2.a.v(K, themeActivity2.L);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                            default:
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.getClass();
                                SharedConfig.setDistanceSystemType(i18);
                                themeActivity3.O0 = true;
                                s4.c1 K2 = themeActivity3.b.K(themeActivity3.K);
                                if (K2 != null) {
                                    themeActivity3.a.v(K2, themeActivity3.K);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                        }
                    }
                });
                i18++;
                f10 = 4.0f;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string2 = LocaleController.getString(R.string.SearchEngine);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.R = string2;
            alertDialog$Builder2.n(f12);
            alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference2.set(b2Var2);
            themeActivity.showDialog(b2Var2);
            return;
        }
        if (i10 == themeActivity.M) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference3 = new AtomicReference();
            LinearLayout f13 = org.telegram.messenger.vl.f(context, 1);
            org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
            k6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            int i19 = org.telegram.ui.ActionBar.j6.g7;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i19, false);
            int i20 = org.telegram.ui.ActionBar.j6.E5;
            k6Var3.a(w02, org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            k6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
            int i21 = org.telegram.ui.ActionBar.j6.i6;
            k6Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i21, false), 2, -1));
            f13.addView(k6Var3);
            k6Var3.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.nb1
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
                            SharedConfig.recordViaSco = false;
                            SharedConfig.saveConfig();
                            themeActivity2.N0 = true;
                            ((Dialog) atomicReference3.get()).dismiss();
                            s4.c1 K = themeActivity2.b.K(themeActivity2.M);
                            if (K != null) {
                                themeActivity2.a.v(K, themeActivity2.M);
                                break;
                            }
                            break;
                        default:
                            int i22 = R.raw.permission_request_microphone;
                            int i23 = R.string.PermissionNoBluetoothWithHint;
                            ThemeActivity themeActivity3 = this.b;
                            AtomicReference atomicReference4 = atomicReference3;
                            org.telegram.ui.Components.de0.e(i22, i23, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new oj0(9, themeActivity3, atomicReference4));
                            SharedConfig.recordViaSco = true;
                            SharedConfig.saveConfig();
                            themeActivity3.N0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            s4.c1 K2 = themeActivity3.b.K(themeActivity3.M);
                            if (K2 != null) {
                                themeActivity3.a.v(K2, themeActivity3.M);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.k6 k6Var4 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
            k6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var4.a(org.telegram.ui.ActionBar.j6.w0(null, i19, false), org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            String string3 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
            String string4 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
            boolean z14 = SharedConfig.recordViaSco;
            k6Var4.a.setText(string3);
            TextView textView = k6Var4.b;
            textView.setVisibility(0);
            textView.setText(string4);
            k6Var4.c.a(z14, false);
            k6Var4.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i21, false), 2, -1));
            f13.addView(k6Var4);
            k6Var4.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.nb1
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
                            SharedConfig.recordViaSco = false;
                            SharedConfig.saveConfig();
                            themeActivity2.N0 = true;
                            ((Dialog) atomicReference3.get()).dismiss();
                            s4.c1 K = themeActivity2.b.K(themeActivity2.M);
                            if (K != null) {
                                themeActivity2.a.v(K, themeActivity2.M);
                                break;
                            }
                            break;
                        default:
                            int i22 = R.raw.permission_request_microphone;
                            int i23 = R.string.PermissionNoBluetoothWithHint;
                            ThemeActivity themeActivity3 = this.b;
                            AtomicReference atomicReference4 = atomicReference3;
                            org.telegram.ui.Components.de0.e(i22, i23, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new oj0(9, themeActivity3, atomicReference4));
                            SharedConfig.recordViaSco = true;
                            SharedConfig.saveConfig();
                            themeActivity3.N0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            s4.c1 K2 = themeActivity3.b.K(themeActivity3.M);
                            if (K2 != null) {
                                themeActivity3.a.v(K2, themeActivity3.M);
                                break;
                            }
                            break;
                    }
                }
            });
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
            b2Var3.R = string5;
            alertDialog$Builder3.n(f13);
            alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference3.set(b2Var3);
            themeActivity.showDialog(b2Var3);
            return;
        }
        if (i10 == themeActivity.y) {
            SharedConfig.toggleDirectShare();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.directShare);
                return;
            }
            return;
        }
        if (i10 == themeActivity.sensitiveContentRow) {
            if (themeActivity.getMessagesController().showSensitiveContent()) {
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            }
            w81 w81Var = new w81(5, themeActivity, view);
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
            String string6 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
            org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.a;
            b2Var4.R = string6;
            b2Var4.T = LocaleController.getString(R.string.ConfirmSensitiveContentText);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new qv0(11, themeActivity, w81Var));
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            themeActivity.showDialog(b2Var4);
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
            String string7 = LocaleController.getString("SortBy", R.string.SortBy);
            org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder5.a;
            b2Var5.R = string7;
            alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new yy(themeActivity, i10, i16));
            alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            themeActivity.showDialog(b2Var5);
            return;
        }
        if (i10 == themeActivity.s0) {
            SharedConfig.toggleChatBlur();
            if (view instanceof org.telegram.ui.Cells.w8) {
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.chatBlurEnabled());
                return;
            }
            return;
        }
        if (i10 == themeActivity.nightThemeRow) {
            if ((!LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                themeActivity.presentFragment(new ThemeActivity(1));
                return;
            }
            org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
            if (org.telegram.ui.ActionBar.j6.o == 0) {
                org.telegram.ui.ActionBar.j6.o = 2;
                i5Var.setChecked(true);
            } else {
                org.telegram.ui.ActionBar.j6.o = 0;
                i5Var.setChecked(false);
            }
            org.telegram.ui.ActionBar.j6.q1();
            org.telegram.ui.ActionBar.j6.E(true);
            boolean z15 = org.telegram.ui.ActionBar.j6.o != 0;
            String z02 = z15 ? org.telegram.ui.ActionBar.j6.z0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
            if (z15) {
                int i22 = org.telegram.ui.ActionBar.j6.o;
                z02 = a4.a.C(i22 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i22 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", z02);
            }
            i5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), z02, R.drawable.menu_night_mode_24, z15, 0, false, true, false);
            return;
        }
        if (i10 == themeActivity.browserRow) {
            if ((!LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                themeActivity.presentFragment(new org.telegram.ui.web.a2(null));
                return;
            } else {
                themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                ((org.telegram.ui.Cells.i5) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                return;
            }
        }
        if (i10 == themeActivity.R) {
            if (org.telegram.ui.ActionBar.j6.o == 0) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 0;
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.j6.E(false);
            return;
        }
        if (i10 == themeActivity.S) {
            if (org.telegram.ui.ActionBar.j6.o == 1) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 1;
            if (org.telegram.ui.ActionBar.j6.p) {
                themeActivity.B0(null, true);
            }
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.j6.E(false);
            return;
        }
        if (i10 == themeActivity.T) {
            if (org.telegram.ui.ActionBar.j6.o == 2) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 2;
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.j6.E(false);
            return;
        }
        if (i10 == themeActivity.U) {
            if (org.telegram.ui.ActionBar.j6.o == 3) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 3;
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.j6.E(false);
            return;
        }
        if (i10 == themeActivity.X) {
            boolean z16 = !org.telegram.ui.ActionBar.j6.p;
            org.telegram.ui.ActionBar.j6.p = z16;
            ((org.telegram.ui.Cells.w8) view).setChecked(z16);
            themeActivity.A0(true);
            if (org.telegram.ui.ActionBar.j6.p) {
                themeActivity.B0(null, true);
            }
            org.telegram.ui.ActionBar.j6.E(false);
            return;
        }
        if (i10 == themeActivity.a0 || i10 == themeActivity.b0) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            if (i10 == themeActivity.a0) {
                i11 = org.telegram.ui.ActionBar.j6.r;
                i12 = i11 / 60;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.s;
                i12 = i11 / 60;
            }
            int i23 = i11 - (i12 * 60);
            final org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.ob1
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i24, int i25) {
                    int i26 = (i24 * 60) + i25;
                    int i27 = ThemeActivity.this.a0;
                    int i28 = i10;
                    org.telegram.ui.Cells.ea eaVar2 = eaVar;
                    if (i28 == i27) {
                        org.telegram.ui.ActionBar.j6.r = i26;
                        eaVar2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i25)), false, true);
                    } else {
                        org.telegram.ui.ActionBar.j6.s = i26;
                        eaVar2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i25)), false, true);
                    }
                }
            }, i12, i23, true));
            return;
        }
        if (i10 == themeActivity.Y) {
            themeActivity.B0(null, true);
            return;
        }
        if (i10 == themeActivity.createNewThemeRow) {
            themeActivity.w0();
            return;
        }
        if (i10 == themeActivity.y0) {
            themeActivity.x0();
        } else if (i10 == themeActivity.stickersRow) {
            themeActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == themeActivity.liteModeRow) {
            themeActivity.presentFragment(new nc0());
        }
    }

    public static void X(ThemeActivity themeActivity, w81 w81Var) {
        C0(themeActivity.currentAccount, themeActivity.getParentActivity(), new oj0(10, themeActivity, w81Var), themeActivity.getResourceProvider());
    }

    public static boolean Y(ThemeActivity themeActivity, int i10, boolean z10) {
        if (i10 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        edit.commit();
        s4.c1 K = themeActivity.b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.a;
            if (view instanceof hc1) {
                hc1 hc1Var = (hc1) view;
                org.telegram.ui.Cells.t1[] cells = hc1Var.a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().resetLayout();
                    cells[i11].requestLayout();
                }
                hc1Var.invalidate();
            }
        }
        s4.c1 K2 = themeActivity.b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.a;
            if (view2 instanceof wb1) {
                wb1 wb1Var = (wb1) view2;
                if (z10) {
                    wb1Var.requestLayout();
                } else {
                    wb1Var.invalidate();
                }
            }
        }
        themeActivity.z0();
        return true;
    }

    public static boolean k0(ThemeActivity themeActivity, int i10) {
        if (i10 != SharedConfig.fontSize) {
            SharedConfig.fontSize = i10;
            SharedConfig.fontSizeIsDefault = false;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", SharedConfig.fontSize);
                edit.commit();
                org.telegram.ui.ActionBar.j6.O();
                s4.c1 K = themeActivity.b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof hc1) {
                        org.telegram.ui.Cells.t1[] cells = ((hc1) view).a.getCells();
                        for (int i11 = 0; i11 < cells.length; i11++) {
                            cells[i11].getMessageObject().resetLayout();
                            cells[i11].requestLayout();
                        }
                    }
                }
                themeActivity.z0();
                return true;
            }
        }
        return false;
    }

    public static String y0() {
        int i10 = org.telegram.ui.ActionBar.j6.v;
        int i11 = i10 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i10 - (i11 * 60)));
        int i12 = org.telegram.ui.ActionBar.j6.t;
        int i13 = i12 / 60;
        return LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12 - (i13 * 60))), format);
    }

    public final void A0(boolean z10) {
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
        this.w = -1;
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
        this.x = -1;
        this.y = -1;
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
        int size = org.telegram.ui.ActionBar.j6.F.size();
        int i20 = 0;
        while (true) {
            i10 = this.f;
            if (i20 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i20);
            if (i10 == 0 || i10 == 3 || ((i6Var.b != null || i6Var.q()) && ((tL_theme = i6Var.F) == null || tL_theme.document != null))) {
                if (i6Var.b != null) {
                    arrayList2.add(i6Var);
                } else {
                    arrayList.add(i6Var);
                }
            }
            i20++;
        }
        Collections.sort(arrayList, new f11(2));
        if (i10 == 3) {
            int i21 = this.J0;
            this.w0 = i21;
            this.p0 = i21 + 1;
            this.n0 = i21 + 2;
            this.x0 = i21 + 3;
            this.i0 = i21 + 4;
            this.J0 = i21 + 6;
            this.o0 = i21 + 5;
            boolean z11 = org.telegram.ui.ActionBar.j6.A0().W != 0;
            this.v = z11;
            dc1 dc1Var = this.c;
            if (dc1Var != null) {
                dc1Var.setDrawDivider(z11);
            }
            if (this.v) {
                int i22 = this.J0;
                this.J0 = i22 + 1;
                this.q0 = i22;
            }
            int i23 = this.J0;
            this.J0 = i23 + 1;
            this.k0 = i23;
            org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
            org.telegram.ui.ActionBar.h6 k10 = A0.k(false);
            ArrayList arrayList3 = A0.b0;
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
            this.w = i26;
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
            if (SharedConfig.raiseToListen) {
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
            this.y = i28 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
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
            int i35 = org.telegram.ui.ActionBar.j6.o;
            if (i35 == 1) {
                this.W = i34;
                int i36 = i33 + 3;
                this.J0 = i36;
                this.X = i33 + 2;
                if (org.telegram.ui.ActionBar.j6.p) {
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
            if (org.telegram.ui.ActionBar.j6.o != 0) {
                int i37 = this.J0;
                this.g0 = i37;
                this.J0 = i37 + 2;
                this.o0 = i37 + 1;
                boolean z12 = org.telegram.ui.ActionBar.j6.J.W != 0;
                this.v = z12;
                dc1 dc1Var2 = this.c;
                if (dc1Var2 != null) {
                    dc1Var2.setDrawDivider(z12);
                }
                if (this.v) {
                    int i38 = this.J0;
                    this.J0 = i38 + 1;
                    this.q0 = i38;
                }
                int i39 = this.J0;
                this.J0 = i39 + 1;
                this.r0 = i39;
            }
        }
        dc1 dc1Var3 = this.c;
        if (dc1Var3 != null) {
            int width = this.b.getWidth();
            int i40 = dc1Var3.g3;
            org.telegram.ui.Cells.oa oaVar = dc1Var3.c3;
            if (i40 != oaVar.h()) {
                oaVar.l();
                if (dc1Var3.b3 != (dc1Var3.f3 == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0())) {
                    dc1Var3.w1(width);
                }
            }
        }
        gc1 gc1Var = this.a;
        if (gc1Var != null) {
            if (i10 == 1 && (i14 = this.L0) != (i15 = org.telegram.ui.ActionBar.j6.o) && i14 != -1) {
                int i41 = this.V;
                int i42 = i41 + 1;
                if (i14 != i15) {
                    int i43 = 0;
                    while (i43 < 4) {
                        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.b.K(i43);
                        if (vk0Var != null) {
                            View view = vk0Var.a;
                            if (view instanceof org.telegram.ui.Cells.ja) {
                                ((org.telegram.ui.Cells.ja) view).setTypeChecked(i43 == org.telegram.ui.ActionBar.j6.o);
                            }
                        }
                        i43++;
                    }
                    int i44 = org.telegram.ui.ActionBar.j6.o;
                    if (i44 == 0) {
                        this.a.t(i42, i16 - i42);
                    } else if (i44 == 1) {
                        int i45 = this.L0;
                        if (i45 == 0) {
                            this.a.s(i42, this.J0 - i42);
                        } else if (i45 == 2) {
                            this.a.t(i42, 3);
                            this.a.s(i42, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                        } else if (i45 == 3) {
                            this.a.s(i42, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                        }
                    } else if (i44 == 2) {
                        int i46 = this.L0;
                        if (i46 == 0) {
                            this.a.s(i42, this.J0 - i42);
                        } else if (i46 == 1) {
                            this.a.t(i42, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                            this.a.s(i42, 3);
                        } else if (i46 == 3) {
                            this.a.s(i42, 3);
                        }
                    } else if (i44 == 3) {
                        int i47 = this.L0;
                        if (i47 == 0) {
                            this.a.s(i42, this.J0 - i42);
                        } else if (i47 == 2) {
                            this.a.t(i42, 3);
                        } else if (i47 == 1) {
                            this.a.t(i42, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                        }
                    }
                } else {
                    boolean z13 = this.M0;
                    boolean z14 = org.telegram.ui.ActionBar.j6.p;
                    if (z13 != z14) {
                        int i48 = i41 + 3;
                        gc1Var.t(i48, z14 ? 3 : 2);
                        this.a.s(i48, org.telegram.ui.ActionBar.j6.p ? 2 : 3);
                    }
                }
            } else if (z10 || this.L0 == -1) {
                gc1Var.l();
            } else {
                if (i17 == -1 && (i13 = this.q0) != -1) {
                    gc1Var.o(i13);
                } else if (i17 == -1 || this.q0 != -1) {
                    int i49 = this.q0;
                    if (i49 != -1) {
                        gc1Var.m(i49);
                    }
                } else {
                    gc1Var.u(i17);
                    if (i18 != -1) {
                        i18--;
                    }
                }
                if (i18 == -1 && (i12 = this.y0) != -1) {
                    this.a.o(i12);
                } else if (i18 != -1 && this.y0 == -1) {
                    this.a.u(i18);
                }
                if (i19 == -1 && (i11 = this.E) != -1) {
                    this.a.o(i11);
                } else if (i19 != -1 && this.E == -1) {
                    this.a.u(i19);
                }
            }
        }
        if (i10 == 1) {
            this.M0 = org.telegram.ui.ActionBar.j6.p;
            this.L0 = org.telegram.ui.ActionBar.j6.o;
        }
        z0();
    }

    public final void B0(Location location, boolean z10) {
        Activity parentActivity;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                    alertDialog$Builder.a.T = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new pb1(this, 2));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    showDialog(alertDialog$Builder.a);
                    return;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (location == null || z10) {
            if (!this.K0) {
                this.K0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.Q0);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.R0);
                } catch (Exception e12) {
                    FileLog.e(e12);
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
        Utilities.globalQueue.postRunnable(new tb1(this, 1));
        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.b.K(this.Z);
        if (vk0Var != null) {
            View view = vk0Var.a;
            if (view instanceof org.telegram.ui.Cells.e9) {
                ((org.telegram.ui.Cells.e9) view).setText(y0());
            }
        }
        if (org.telegram.ui.ActionBar.j6.p && org.telegram.ui.ActionBar.j6.o == 1) {
            org.telegram.ui.ActionBar.j6.E(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.U0 = !org.telegram.ui.ActionBar.j6.f1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i10 = this.f;
        if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.S0 = xi0Var;
            if (this.U0) {
                xi0Var.K(xi0Var.e[0] - 1);
            } else {
                xi0Var.K(0);
            }
            org.telegram.ui.Components.xi0 xi0Var2 = this.S0;
            xi0Var2.h = true;
            this.s = n10.d(5, xi0Var2);
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            this.s = a2;
            a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new t3(this, 20));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new vb1(this));
        this.a = new gc1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.b = ll0Var;
        ll0Var.o1();
        this.b.setLayoutManager(new s4.c0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((s4.j) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, w7.x5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setOnItemClickListener(new qv0(12, this, context));
        if (i10 == 0) {
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.pr.h);
            jVar.C = false;
            jVar.m = false;
            this.b.setItemAnimator(jVar);
        }
        if (this.T0) {
            A0(false);
            this.T0 = false;
            this.b.u0(this.a.e.J0 - 1);
            AndroidUtilities.runOnUIThread(new tb1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        org.telegram.ui.ActionBar.b2 b2Var;
        int i13;
        int i14;
        if (i10 == NotificationCenter.locationPermissionGranted) {
            B0(null, true);
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper || i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.ll0 ll0Var = this.b;
            if (ll0Var != null) {
                ll0Var.e1();
            }
            z0();
            return;
        }
        if (i10 == NotificationCenter.webBrowserSettingsUpdate) {
            gc1 gc1Var = this.a;
            if (gc1Var == null || (i14 = this.browserRow) == -1) {
                return;
            }
            gc1Var.m(i14);
            return;
        }
        if (i10 == NotificationCenter.themeAccentListUpdated) {
            gc1 gc1Var2 = this.a;
            if (gc1Var2 == null || (i13 = this.q0) == -1) {
                return;
            }
            gc1Var2.n(i13, new Object());
            return;
        }
        if (i10 == NotificationCenter.themeListUpdated) {
            A0(true);
            return;
        }
        if (i10 == NotificationCenter.themeUploadedToServer) {
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var == this.h && h6Var == this.n) {
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(getMessagesController().linkPrefix);
                sb2.append("/addtheme/");
                sb2.append((h6Var != null ? h6Var.r : i6Var.F).slug);
                String sb3 = sb2.toString();
                showDialog(new org.telegram.ui.Components.hq0(getParentActivity(), null, sb3, false, sb3, false, null));
                org.telegram.ui.ActionBar.b2 b2Var2 = this.r;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var2 == this.h && h6Var2 == this.n && (b2Var = this.r) == null) {
                b2Var.dismiss();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.needShareTheme) {
            if (getParentActivity() == null || this.isPaused) {
                return;
            }
            this.h = (org.telegram.ui.ActionBar.i6) objArr[0];
            this.n = (org.telegram.ui.ActionBar.h6) objArr[1];
            org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            this.r = b2Var3;
            b2Var3.g0 = true;
            showDialog(b2Var3, new r5(this, 17));
            return;
        }
        if (i10 != NotificationCenter.needSetDayNightTheme) {
            if (i10 == NotificationCenter.emojiPreviewThemesChanged) {
                int i15 = this.p0;
                if (i15 >= 0) {
                    this.a.m(i15);
                    return;
                }
                return;
            }
            if ((i10 == NotificationCenter.contentSettingsLoaded || i10 == NotificationCenter.appConfigUpdated) && (i12 = this.sensitiveContentRow) >= 0) {
                this.a.m(i12);
                return;
            }
            return;
        }
        z0();
        if (this.f != 3) {
            return;
        }
        boolean f12 = org.telegram.ui.ActionBar.j6.f1();
        boolean z10 = !f12;
        if (this.U0 != z10) {
            this.U0 = z10;
            org.telegram.ui.Components.xi0 xi0Var = this.S0;
            xi0Var.N(!f12 ? xi0Var.e[0] - 1 : 0);
            this.s.getIconView().d();
        }
        if (this.p0 >= 0) {
            for (int i16 = 0; i16 < this.b.getChildCount(); i16++) {
                if (this.b.getChildAt(i16) instanceof gv) {
                    ((gv) this.b.getChildAt(i16)).b();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.k0.class, org.telegram.ui.Cells.ja.class, hc1.class, wb1.class, cc1.class, org.telegram.ui.Cells.i5.class, org.telegram.ui.Cells.pa.class, ec1.class, org.telegram.ui.Cells.r8.class, gp0.class, org.telegram.ui.Components.sy0.class, gv.class, org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i14 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"leftImageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"rightImageView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 2048, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ja.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ja.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 2048, new Class[]{hc1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 2048, new Class[]{wb1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{wb1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{cc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{cc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m3, org.telegram.ui.ActionBar.j6.q3}, null, org.telegram.ui.ActionBar.j6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.n3, org.telegram.ui.ActionBar.j6.r3}, null, org.telegram.ui.ActionBar.j6.dc));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.m3.y;
        int i19 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, drawableArr, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, org.telegram.ui.ActionBar.j6.q3.y, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.p3, org.telegram.ui.ActionBar.j6.t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Ca));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m3, org.telegram.ui.ActionBar.j6.q3}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{hc1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i11));
        int i20 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i12));
        arrayList.addAll(w7.a6.a(new xy0(6, this), i20, i11, i12));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.themeListUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.themeAccentListUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.needShareTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.needSetDayNightTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiPreviewThemesChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.appConfigUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.contentSettingsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        if (this.f == 0) {
            org.telegram.ui.ActionBar.j6.h1(this.currentAccount, true);
            org.telegram.ui.ActionBar.j6.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.K0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.Q0);
        locationManager.removeUpdates(this.R0);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.themeListUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.themeAccentListUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.needShareTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.needSetDayNightTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiPreviewThemesChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.appConfigUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.contentSettingsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        org.telegram.ui.ActionBar.j6.q1();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            A0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
    }

    public final void w0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.a.T = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new pb1(this, 1));
        showDialog(alertDialog$Builder.a);
    }

    public final void x0() {
        org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
        presentFragment(new wd1(A0, false, 1, A0.k(false).a >= 100, this.f == 1));
    }

    public final void z0() {
        org.telegram.ui.ActionBar.b6 b6Var;
        if (this.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
        org.telegram.ui.ActionBar.h6 k10 = A0.k(false);
        ArrayList arrayList = A0.b0;
        if (arrayList == null || arrayList.isEmpty() || k10 == null || k10.a < 100) {
            this.s.r(2);
            this.s.r(3);
        } else {
            this.s.K(2);
            this.s.K(3);
        }
        int i10 = AndroidUtilities.isTablet() ? 18 : 16;
        org.telegram.ui.ActionBar.i6 A02 = org.telegram.ui.ActionBar.j6.A0();
        if (SharedConfig.fontSize == i10 && SharedConfig.bubbleRadius == 17 && A02.S && A02.Y == org.telegram.ui.ActionBar.j6.n && (k10 == null || (b6Var = k10.y) == null || "d".equals(b6Var.c))) {
            this.s.r(4);
        } else {
            this.s.K(4);
        }
    }
}
