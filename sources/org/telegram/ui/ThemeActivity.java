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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class ThemeActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public int B;
    public int B0;
    public int C;
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
    public boolean H0;
    public int I;
    public int I0;
    public int J;
    public boolean J0;
    public int K;
    public boolean K0;
    public int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public final kb1 N0;
    public int O;
    public final kb1 O0;
    public int P;
    public org.telegram.ui.Components.gj0 P0;
    public int Q;
    public boolean Q0;
    public int R;
    public boolean R0;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public tb1 a;
    public int a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.rl0 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public qb1 c;
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
    public org.telegram.ui.ActionBar.d2 r;
    public int r0;
    private int raiseToListenRow;
    public org.telegram.ui.ActionBar.w0 s;
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

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

        public final void a(boolean z4) {
            this.f = this.d.V == this.e.a;
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!z4) {
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

        public void setCheckedState(float f10) {
            this.c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.N0 = new kb1(this);
        this.O0 = new kb1(this);
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
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        o10.customView = f10;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, k7.b6.e(50, 50, 17));
        f10.addView(frameLayout, k7.b6.t(80, 80, 1, 0, 20, 0, 8));
        int i12 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = k7.f6.b(context, 20.0f, i12, true, f6Var);
        org.telegram.messenger.y3.r(R.string.AgeVerificationTitle, b10, 17);
        f10.addView(b10, k7.b6.t(-1, -2, 7, 24, 8, 24, 8));
        TextView b11 = k7.f6.b(context, 14.0f, i12, false, f6Var);
        b11.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
        b11.setGravity(17);
        f10.addView(b11, k7.b6.t(-1, -2, 7, 24, 0, 24, 0));
        final ph.d dVar = new ph.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.AgeVerificationButton), false, true);
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.hb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final ph.d dVar2 = ph.d.this;
                if (dVar2.K) {
                    return;
                }
                dVar2.setLoading(true);
                int i13 = R.raw.permission_request_camera;
                int i14 = R.string.AgeVerificationNeedCameraPermission;
                final MessagesController messagesController2 = messagesController;
                final String str3 = str;
                final int i15 = i10;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                final int i16 = i11;
                final Utilities.Callback callback2 = callback;
                final org.telegram.ui.ActionBar.g3[] g3VarArr = r9;
                org.telegram.ui.Components.he0.e(i13, i14, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() { // from class: org.telegram.ui.db1
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        final ph.d dVar3 = ph.d.this;
                        if (!booleanValue) {
                            dVar3.setLoading(false);
                            return;
                        }
                        final MessagesController messagesController3 = messagesController2;
                        UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                        final int i17 = i15;
                        final Context context3 = context2;
                        final org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                        final int i18 = i16;
                        final Utilities.Callback callback3 = callback2;
                        final org.telegram.ui.ActionBar.g3[] g3VarArr2 = g3VarArr;
                        userNameResolver.resolve(str3, new h5.d() { // from class: org.telegram.ui.eb1
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r6v2, types: [org.telegram.messenger.Utilities$Callback4, org.telegram.ui.fb1] */
                            @Override // h5.d
                            public final void accept(Object obj2) {
                                Long l10 = (Long) obj2;
                                ph.d dVar4 = ph.d.this;
                                if (l10 == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                TLRPC.User user = messagesController3.getUser(l10);
                                if (user == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                rh.y3 b12 = rh.y3.b(i17, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                final rh.p2 p2Var = new rh.p2(context3, f6Var3);
                                final int i19 = i18;
                                final Utilities.Callback callback4 = callback3;
                                ?? r62 = new Utilities.Callback4() { // from class: org.telegram.ui.fb1
                                    @Override // org.telegram.messenger.Utilities.Callback4
                                    public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        Double d = (Double) obj4;
                                        boolean booleanValue2 = d != null ? d.doubleValue() >= ((double) i19) : ((Boolean) obj3).booleanValue();
                                        p2Var.k(false);
                                        callback4.run(Boolean.valueOf(booleanValue2));
                                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                        if (!booleanValue2 || U2 == null) {
                                            return;
                                        }
                                        kf.k0.v(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.qc.a0(U2), R.raw.contact_check, 36);
                                    }
                                };
                                p2Var.E0 = r62;
                                rh.h2 h2Var = p2Var.x;
                                if (h2Var != 0) {
                                    h2Var.setOnVerifiedAge(r62);
                                }
                                p2Var.w(true);
                                p2Var.x0 = false;
                                p2Var.h0 = U.getParentActivity();
                                p2Var.s(U, b12);
                                p2Var.show();
                                dVar4.setLoading(false);
                                g3VarArr2[0].dismiss();
                            }
                        });
                    }
                });
            }
        });
        f10.addView(dVar, k7.b6.t(-1, 48, 7, 2, 29, 2, 14));
        o10.show();
        final org.telegram.ui.ActionBar.g3[] g3VarArr = {o10};
        o10.fixNavigationBar();
    }

    public static void U(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        tb1 tb1Var;
        org.telegram.ui.Components.rl0 rl0Var = themeActivity.b;
        if (rl0Var == null || !rl0Var.D || (tb1Var = themeActivity.a) == null) {
            return;
        }
        int i10 = themeActivity.sensitiveContentRow;
        boolean z4 = false;
        boolean z10 = i10 >= 0;
        if (contentsettings != null && contentsettings.sensitive_can_change) {
            z4 = true;
        }
        if (z10 == z4) {
            tb1Var.m(i10);
        } else {
            themeActivity.A0(true);
        }
    }

    public static void W(final ThemeActivity themeActivity, Context context, View view, final int i10, float f10) {
        int i11;
        int i12;
        final int i13 = 1;
        if (i10 == themeActivity.K) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z4 = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            boolean z10 = !z4;
            edit.putBoolean("view_animations", z10);
            SharedConfig.setAnimationsEnabled(z10);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z10);
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
            np0 np0Var = new np0();
            np0Var.E = themeActivity;
            themeActivity.presentFragment(np0Var);
            return;
        }
        if (i10 == themeActivity.D) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z11 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = globalMainSettings2.edit();
            boolean z12 = !z11;
            edit2.putBoolean("send_by_enter", z12);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                return;
            }
            return;
        }
        if (i10 == themeActivity.B) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.raiseToSpeak);
                return;
            }
            return;
        }
        if (i10 == themeActivity.C) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.nextMediaTap);
                return;
            }
            return;
        }
        if (i10 == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.B != -1) {
                for (int i15 = 0; i15 < themeActivity.b.getChildCount(); i15++) {
                    View childAt = themeActivity.b.getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.r8) {
                        themeActivity.b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.B) {
                            ((org.telegram.ui.Cells.r8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.A0(false);
            return;
        }
        if (i10 == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.pauseMusicOnRecord);
                return;
            }
            return;
        }
        if (i10 == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.pauseMusicOnMedia);
                return;
            }
            return;
        }
        int i16 = 2;
        float f11 = 4.0f;
        if (i10 == themeActivity.H) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference = new AtomicReference();
            LinearLayout f12 = org.telegram.messenger.y3.f(context, 1);
            CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
            final int i17 = 0;
            while (i17 < 3) {
                org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                j6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                j6Var.b(charSequenceArr[i17], i17 == SharedConfig.distanceSystemType);
                j6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
                f12.addView(j6Var);
                j6Var.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.za1
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
                                themeActivity2.M0 = true;
                                f2.l1 K = themeActivity2.b.K(themeActivity2.I);
                                if (K != null) {
                                    themeActivity2.a.v(K, themeActivity2.I);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                            default:
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.getClass();
                                SharedConfig.setDistanceSystemType(i17);
                                themeActivity3.L0 = true;
                                f2.l1 K2 = themeActivity3.b.K(themeActivity3.H);
                                if (K2 != null) {
                                    themeActivity3.a.v(K2, themeActivity3.H);
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
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            alertDialog$Builder.n(f12);
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference.set(d2Var);
            themeActivity.showDialog(d2Var);
            return;
        }
        if (i10 == themeActivity.I) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference2 = new AtomicReference();
            LinearLayout f13 = org.telegram.messenger.y3.f(context, 1);
            ArrayList b10 = org.telegram.ui.web.n1.b();
            int size = b10.size();
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            final int i18 = 0;
            while (i18 < size) {
                charSequenceArr2[i18] = ((org.telegram.ui.web.n1) b10.get(i18)).a;
                org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
                j6Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(4.0f), 0);
                j6Var2.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                j6Var2.b(charSequenceArr2[i18], i18 == SharedConfig.searchEngineType);
                j6Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
                f13.addView(j6Var2);
                j6Var2.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.za1
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
                                themeActivity2.M0 = true;
                                f2.l1 K = themeActivity2.b.K(themeActivity2.I);
                                if (K != null) {
                                    themeActivity2.a.v(K, themeActivity2.I);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                            default:
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.getClass();
                                SharedConfig.setDistanceSystemType(i18);
                                themeActivity3.L0 = true;
                                f2.l1 K2 = themeActivity3.b.K(themeActivity3.H);
                                if (K2 != null) {
                                    themeActivity3.a.v(K2, themeActivity3.H);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                        }
                    }
                });
                i18++;
                f11 = 4.0f;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string2 = LocaleController.getString(R.string.SearchEngine);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.O = string2;
            alertDialog$Builder2.n(f13);
            alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference2.set(d2Var2);
            themeActivity.showDialog(d2Var2);
            return;
        }
        if (i10 == themeActivity.J) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference3 = new AtomicReference();
            LinearLayout f14 = org.telegram.messenger.y3.f(context, 1);
            org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
            j6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            int i19 = org.telegram.ui.ActionBar.j6.g7;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i19, false);
            int i20 = org.telegram.ui.ActionBar.j6.E5;
            j6Var3.a(w02, org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            j6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
            int i21 = org.telegram.ui.ActionBar.j6.i6;
            j6Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i21, false), 2, -1));
            f14.addView(j6Var3);
            j6Var3.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.ab1
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
                            themeActivity2.K0 = true;
                            ((Dialog) atomicReference3.get()).dismiss();
                            f2.l1 K = themeActivity2.b.K(themeActivity2.J);
                            if (K != null) {
                                themeActivity2.a.v(K, themeActivity2.J);
                                break;
                            }
                            break;
                        default:
                            int i22 = R.raw.permission_request_microphone;
                            int i23 = R.string.PermissionNoBluetoothWithHint;
                            ThemeActivity themeActivity3 = this.b;
                            AtomicReference atomicReference4 = atomicReference3;
                            org.telegram.ui.Components.he0.e(i22, i23, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.vk(26, themeActivity3, atomicReference4));
                            SharedConfig.recordViaSco = true;
                            SharedConfig.saveConfig();
                            themeActivity3.K0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            f2.l1 K2 = themeActivity3.b.K(themeActivity3.J);
                            if (K2 != null) {
                                themeActivity3.a.v(K2, themeActivity3.J);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.j6 j6Var4 = new org.telegram.ui.Cells.j6(themeActivity.getParentActivity(), null);
            j6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            j6Var4.a(org.telegram.ui.ActionBar.j6.w0(null, i19, false), org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            String string3 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
            String string4 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
            boolean z13 = SharedConfig.recordViaSco;
            j6Var4.a.setText(string3);
            TextView textView = j6Var4.b;
            textView.setVisibility(0);
            textView.setText(string4);
            j6Var4.c.a(z13, false);
            j6Var4.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i21, false), 2, -1));
            f14.addView(j6Var4);
            j6Var4.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.ab1
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
                            themeActivity2.K0 = true;
                            ((Dialog) atomicReference3.get()).dismiss();
                            f2.l1 K = themeActivity2.b.K(themeActivity2.J);
                            if (K != null) {
                                themeActivity2.a.v(K, themeActivity2.J);
                                break;
                            }
                            break;
                        default:
                            int i22 = R.raw.permission_request_microphone;
                            int i23 = R.string.PermissionNoBluetoothWithHint;
                            ThemeActivity themeActivity3 = this.b;
                            AtomicReference atomicReference4 = atomicReference3;
                            org.telegram.ui.Components.he0.e(i22, i23, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new org.telegram.ui.Components.vk(26, themeActivity3, atomicReference4));
                            SharedConfig.recordViaSco = true;
                            SharedConfig.saveConfig();
                            themeActivity3.K0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            f2.l1 K2 = themeActivity3.b.K(themeActivity3.J);
                            if (K2 != null) {
                                themeActivity3.a.v(K2, themeActivity3.J);
                                break;
                            }
                            break;
                    }
                }
            });
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
            d2Var3.O = string5;
            alertDialog$Builder3.n(f14);
            alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference3.set(d2Var3);
            themeActivity.showDialog(d2Var3);
            return;
        }
        if (i10 == themeActivity.y) {
            SharedConfig.toggleDirectShare();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.directShare);
                return;
            }
            return;
        }
        if (i10 == themeActivity.sensitiveContentRow) {
            if (themeActivity.getMessagesController().showSensitiveContent()) {
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            }
            b11 b11Var = new b11(16, themeActivity, view);
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
            String string6 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
            org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.a;
            d2Var4.O = string6;
            d2Var4.Q = LocaleController.getString(R.string.ConfirmSensitiveContentText);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new vl0(19, themeActivity, b11Var));
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            themeActivity.showDialog(d2Var4);
            return;
        }
        if (i10 == themeActivity.M) {
            return;
        }
        if (i10 == themeActivity.N) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string7 = LocaleController.getString("SortBy", R.string.SortBy);
            org.telegram.ui.ActionBar.d2 d2Var5 = alertDialog$Builder5.a;
            d2Var5.O = string7;
            alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new uy(themeActivity, i10, i16));
            alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            themeActivity.showDialog(d2Var5);
            return;
        }
        if (i10 == themeActivity.p0) {
            SharedConfig.toggleChatBlur();
            if (view instanceof org.telegram.ui.Cells.r8) {
                ((org.telegram.ui.Cells.r8) view).setChecked(SharedConfig.chatBlurEnabled());
                return;
            }
            return;
        }
        if (i10 == themeActivity.nightThemeRow) {
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
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
            boolean z14 = org.telegram.ui.ActionBar.j6.o != 0;
            String z02 = z14 ? org.telegram.ui.ActionBar.j6.z0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
            if (z14) {
                int i22 = org.telegram.ui.ActionBar.j6.o;
                z02 = android.support.v4.media.a.z(i22 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i22 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", z02);
            }
            i5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), z02, R.drawable.menu_night_mode_24, z14, 0, false, true, false);
            return;
        }
        if (i10 == themeActivity.browserRow) {
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                themeActivity.presentFragment(new org.telegram.ui.web.y1(null));
                return;
            } else {
                themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                ((org.telegram.ui.Cells.i5) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                return;
            }
        }
        if (i10 == themeActivity.O) {
            if (org.telegram.ui.ActionBar.j6.o == 0) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 0;
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.j6.E(false);
            return;
        }
        if (i10 == themeActivity.P) {
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
        if (i10 == themeActivity.Q) {
            if (org.telegram.ui.ActionBar.j6.o == 2) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 2;
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.j6.E(false);
            return;
        }
        if (i10 == themeActivity.R) {
            if (org.telegram.ui.ActionBar.j6.o == 3) {
                return;
            }
            org.telegram.ui.ActionBar.j6.o = 3;
            themeActivity.A0(true);
            org.telegram.ui.ActionBar.j6.E(false);
            return;
        }
        if (i10 == themeActivity.U) {
            boolean z15 = !org.telegram.ui.ActionBar.j6.p;
            org.telegram.ui.ActionBar.j6.p = z15;
            ((org.telegram.ui.Cells.r8) view).setChecked(z15);
            themeActivity.A0(true);
            if (org.telegram.ui.ActionBar.j6.p) {
                themeActivity.B0(null, true);
            }
            org.telegram.ui.ActionBar.j6.E(false);
            return;
        }
        if (i10 == themeActivity.X || i10 == themeActivity.Y) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            if (i10 == themeActivity.X) {
                i11 = org.telegram.ui.ActionBar.j6.r;
                i12 = i11 / 60;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.s;
                i12 = i11 / 60;
            }
            int i23 = i11 - (i12 * 60);
            final org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
            themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.bb1
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i24, int i25) {
                    int i26 = (i24 * 60) + i25;
                    int i27 = ThemeActivity.this.X;
                    int i28 = i10;
                    org.telegram.ui.Cells.z9 z9Var2 = z9Var;
                    if (i28 == i27) {
                        org.telegram.ui.ActionBar.j6.r = i26;
                        z9Var2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i25)), false, true);
                    } else {
                        org.telegram.ui.ActionBar.j6.s = i26;
                        z9Var2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i25)), false, true);
                    }
                }
            }, i12, i23, true));
            return;
        }
        if (i10 == themeActivity.V) {
            themeActivity.B0(null, true);
            return;
        }
        if (i10 == themeActivity.createNewThemeRow) {
            themeActivity.w0();
            return;
        }
        if (i10 == themeActivity.v0) {
            themeActivity.x0();
        } else if (i10 == themeActivity.stickersRow) {
            themeActivity.presentFragment(new StickersActivity(0, null));
        } else if (i10 == themeActivity.liteModeRow) {
            themeActivity.presentFragment(new gc0());
        }
    }

    public static void X(ThemeActivity themeActivity, b11 b11Var) {
        C0(themeActivity.currentAccount, themeActivity.getParentActivity(), new org.telegram.ui.Components.vk(27, themeActivity, b11Var), themeActivity.getResourceProvider());
    }

    public static boolean Y(ThemeActivity themeActivity, int i10, boolean z4) {
        if (i10 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        edit.commit();
        f2.l1 K = themeActivity.b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.a;
            if (view instanceof ub1) {
                ub1 ub1Var = (ub1) view;
                org.telegram.ui.Cells.s1[] cells = ub1Var.a.getCells();
                for (int i11 = 0; i11 < cells.length; i11++) {
                    cells[i11].getMessageObject().resetLayout();
                    cells[i11].requestLayout();
                }
                ub1Var.invalidate();
            }
        }
        f2.l1 K2 = themeActivity.b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.a;
            if (view2 instanceof jb1) {
                jb1 jb1Var = (jb1) view2;
                if (z4) {
                    jb1Var.requestLayout();
                } else {
                    jb1Var.invalidate();
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
                f2.l1 K = themeActivity.b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof ub1) {
                        org.telegram.ui.Cells.s1[] cells = ((ub1) view).a.getCells();
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

    public final void A0(boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TLRPC.TL_theme tL_theme;
        int i16 = this.G0;
        int i17 = this.n0;
        int i18 = this.v0;
        int i19 = this.B;
        this.G0 = 0;
        this.M = -1;
        this.N = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.e0 = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.d0 = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.w = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.bubbleRadiusRow = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.p0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.liteModeRow = -1;
        this.D0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.x = -1;
        this.y = -1;
        this.sensitiveContentRow = -1;
        this.K = -1;
        this.B = -1;
        this.raiseToListenRow = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.L = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.createNewThemeRow = -1;
        this.E0 = -1;
        this.appIconSelectorRow = -1;
        this.F0 = -1;
        this.w0 = -1;
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
            if (i10 == 0 || i10 == 3 || ((i6Var.b != null || i6Var.q()) && ((tL_theme = i6Var.C) == null || tL_theme.document != null))) {
                if (i6Var.b != null) {
                    arrayList2.add(i6Var);
                } else {
                    arrayList.add(i6Var);
                }
            }
            i20++;
        }
        Collections.sort(arrayList, new eu(11));
        if (i10 == 3) {
            int i21 = this.G0;
            this.t0 = i21;
            this.m0 = i21 + 1;
            this.k0 = i21 + 2;
            this.u0 = i21 + 3;
            this.f0 = i21 + 4;
            this.G0 = i21 + 6;
            this.l0 = i21 + 5;
            boolean z10 = org.telegram.ui.ActionBar.j6.A0().T != 0;
            this.v = z10;
            qb1 qb1Var = this.c;
            if (qb1Var != null) {
                qb1Var.setDrawDivider(z10);
            }
            if (this.v) {
                int i22 = this.G0;
                this.G0 = i22 + 1;
                this.n0 = i22;
            }
            int i23 = this.G0;
            this.G0 = i23 + 1;
            this.h0 = i23;
            org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
            org.telegram.ui.ActionBar.h6 k10 = A0.k(false);
            ArrayList arrayList3 = A0.Y;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.a >= 100) {
                int i24 = this.G0;
                this.G0 = i24 + 1;
                this.v0 = i24;
            }
            int i25 = this.G0;
            this.createNewThemeRow = i25;
            this.G0 = i25 + 2;
            this.w0 = i25 + 1;
        } else if (i10 == 0) {
            int i26 = this.G0;
            this.w = i26;
            this.textSizeRow = i26 + 1;
            this.backgroundRow = i26 + 2;
            this.changeUserColor = i26 + 3;
            this.e0 = i26 + 4;
            this.f0 = i26 + 5;
            this.m0 = i26 + 6;
            this.o0 = i26 + 7;
            this.g0 = i26 + 8;
            this.bubbleRadiusRow = i26 + 9;
            this.h0 = i26 + 10;
            this.i0 = i26 + 11;
            this.j0 = i26 + 12;
            this.k0 = i26 + 13;
            this.E0 = i26 + 14;
            this.appIconSelectorRow = i26 + 15;
            this.F0 = i26 + 16;
            this.q0 = i26 + 17;
            this.r0 = i26 + 18;
            this.s0 = i26 + 19;
            this.nightThemeRow = i26 + 20;
            this.browserRow = i26 + 21;
            this.liteModeRow = i26 + 22;
            this.stickersRow = i26 + 23;
            this.y0 = i26 + 24;
            this.B0 = i26 + 25;
            this.C = i26 + 26;
            int i27 = i26 + 28;
            this.G0 = i27;
            this.raiseToListenRow = i26 + 27;
            if (SharedConfig.raiseToListen) {
                this.G0 = i26 + 29;
                this.B = i27;
            }
            int i28 = this.G0;
            this.pauseOnRecordRow = i28;
            this.pauseOnMediaRow = i28 + 1;
            this.J = i28 + 2;
            this.z0 = i28 + 3;
            this.C0 = i28 + 4;
            this.G0 = i28 + 6;
            this.y = i28 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
                int i29 = this.G0;
                this.G0 = i29 + 1;
                this.sensitiveContentRow = i29;
            }
            int i30 = this.G0;
            this.D = i30;
            this.H = i30 + 1;
            this.G0 = i30 + 3;
            this.A0 = i30 + 2;
        } else {
            int i31 = this.G0;
            this.O = i31;
            this.P = i31 + 1;
            int i32 = i31 + 3;
            this.G0 = i32;
            this.Q = i31 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.G0 = i31 + 4;
                this.R = i32;
            }
            int i33 = this.G0;
            int i34 = i33 + 1;
            this.G0 = i34;
            this.S = i33;
            int i35 = org.telegram.ui.ActionBar.j6.o;
            if (i35 == 1) {
                this.T = i34;
                int i36 = i33 + 3;
                this.G0 = i36;
                this.U = i33 + 2;
                if (org.telegram.ui.ActionBar.j6.p) {
                    this.V = i36;
                    this.G0 = i33 + 5;
                    this.W = i33 + 4;
                } else {
                    this.X = i36;
                    this.Y = i33 + 4;
                    this.G0 = i33 + 6;
                    this.Z = i33 + 5;
                }
            } else if (i35 == 2) {
                this.a0 = i34;
                this.b0 = i33 + 2;
                this.G0 = i33 + 4;
                this.c0 = i33 + 3;
            }
            if (org.telegram.ui.ActionBar.j6.o != 0) {
                int i37 = this.G0;
                this.d0 = i37;
                this.G0 = i37 + 2;
                this.l0 = i37 + 1;
                boolean z11 = org.telegram.ui.ActionBar.j6.J.T != 0;
                this.v = z11;
                qb1 qb1Var2 = this.c;
                if (qb1Var2 != null) {
                    qb1Var2.setDrawDivider(z11);
                }
                if (this.v) {
                    int i38 = this.G0;
                    this.G0 = i38 + 1;
                    this.n0 = i38;
                }
                int i39 = this.G0;
                this.G0 = i39 + 1;
                this.o0 = i39;
            }
        }
        qb1 qb1Var3 = this.c;
        if (qb1Var3 != null) {
            int width = this.b.getWidth();
            int i40 = qb1Var3.d3;
            org.telegram.ui.Cells.ja jaVar = qb1Var3.Z2;
            if (i40 != jaVar.h()) {
                jaVar.l();
                if (qb1Var3.Y2 != (qb1Var3.c3 == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0())) {
                    qb1Var3.w1(width);
                }
            }
        }
        tb1 tb1Var = this.a;
        if (tb1Var != null) {
            if (i10 == 1 && (i14 = this.I0) != (i15 = org.telegram.ui.ActionBar.j6.o) && i14 != -1) {
                int i41 = this.S;
                int i42 = i41 + 1;
                if (i14 != i15) {
                    int i43 = 0;
                    while (i43 < 4) {
                        org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) this.b.K(i43);
                        if (dl0Var != null) {
                            View view = dl0Var.a;
                            if (view instanceof org.telegram.ui.Cells.ea) {
                                ((org.telegram.ui.Cells.ea) view).setTypeChecked(i43 == org.telegram.ui.ActionBar.j6.o);
                            }
                        }
                        i43++;
                    }
                    int i44 = org.telegram.ui.ActionBar.j6.o;
                    if (i44 == 0) {
                        this.a.t(i42, i16 - i42);
                    } else if (i44 == 1) {
                        int i45 = this.I0;
                        if (i45 == 0) {
                            this.a.s(i42, this.G0 - i42);
                        } else if (i45 == 2) {
                            this.a.t(i42, 3);
                            this.a.s(i42, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                        } else if (i45 == 3) {
                            this.a.s(i42, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                        }
                    } else if (i44 == 2) {
                        int i46 = this.I0;
                        if (i46 == 0) {
                            this.a.s(i42, this.G0 - i42);
                        } else if (i46 == 1) {
                            this.a.t(i42, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                            this.a.s(i42, 3);
                        } else if (i46 == 3) {
                            this.a.s(i42, 3);
                        }
                    } else if (i44 == 3) {
                        int i47 = this.I0;
                        if (i47 == 0) {
                            this.a.s(i42, this.G0 - i42);
                        } else if (i47 == 2) {
                            this.a.t(i42, 3);
                        } else if (i47 == 1) {
                            this.a.t(i42, org.telegram.ui.ActionBar.j6.p ? 4 : 5);
                        }
                    }
                } else {
                    boolean z12 = this.J0;
                    boolean z13 = org.telegram.ui.ActionBar.j6.p;
                    if (z12 != z13) {
                        int i48 = i41 + 3;
                        tb1Var.t(i48, z13 ? 3 : 2);
                        this.a.s(i48, org.telegram.ui.ActionBar.j6.p ? 2 : 3);
                    }
                }
            } else if (z4 || this.I0 == -1) {
                tb1Var.l();
            } else {
                if (i17 == -1 && (i13 = this.n0) != -1) {
                    tb1Var.o(i13);
                } else if (i17 == -1 || this.n0 != -1) {
                    int i49 = this.n0;
                    if (i49 != -1) {
                        tb1Var.m(i49);
                    }
                } else {
                    tb1Var.u(i17);
                    if (i18 != -1) {
                        i18--;
                    }
                }
                if (i18 == -1 && (i12 = this.v0) != -1) {
                    this.a.o(i12);
                } else if (i18 != -1 && this.v0 == -1) {
                    this.a.u(i18);
                }
                if (i19 == -1 && (i11 = this.B) != -1) {
                    this.a.o(i11);
                } else if (i19 != -1 && this.B == -1) {
                    this.a.u(i19);
                }
            }
        }
        if (i10 == 1) {
            this.J0 = org.telegram.ui.ActionBar.j6.p;
            this.I0 = org.telegram.ui.ActionBar.j6.o;
        }
        z0();
    }

    public final void B0(Location location, boolean z4) {
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
                    alertDialog$Builder.a.Q = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new cb1(this, 2));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    showDialog(alertDialog$Builder.a);
                    return;
                }
            } catch (Exception e) {
                FileLog.e(e);
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (location == null || z4) {
            if (!this.H0) {
                this.H0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.N0);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.O0);
                } catch (Exception e11) {
                    FileLog.e(e11);
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
        Utilities.globalQueue.postRunnable(new gb1(this, 1));
        org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) this.b.K(this.W);
        if (dl0Var != null) {
            View view = dl0Var.a;
            if (view instanceof org.telegram.ui.Cells.z8) {
                ((org.telegram.ui.Cells.z8) view).setText(y0());
            }
        }
        if (org.telegram.ui.ActionBar.j6.p && org.telegram.ui.ActionBar.j6.o == 1) {
            org.telegram.ui.ActionBar.j6.E(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.R0 = !org.telegram.ui.ActionBar.j6.f1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i10 = this.f;
        if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.P0 = gj0Var;
            if (this.R0) {
                gj0Var.K(gj0Var.e[0] - 1);
            } else {
                gj0Var.K(0);
            }
            org.telegram.ui.Components.gj0 gj0Var2 = this.P0;
            gj0Var2.h = true;
            this.s = n10.d(5, gj0Var2);
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            this.s = a2;
            a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new y3(this, 20));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ib1(this));
        this.a = new tb1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.b = rl0Var;
        rl0Var.o1();
        this.b.setLayoutManager(new f2.i0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((f2.l) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, k7.b6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setOnItemClickListener(new vl0(20, this, context));
        if (i10 == 0) {
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.mr.h);
            lVar.C = false;
            lVar.m = false;
            this.b.setItemAnimator(lVar);
        }
        if (this.Q0) {
            A0(false);
            this.Q0 = false;
            this.b.u0(this.a.e.G0 - 1);
            AndroidUtilities.runOnUIThread(new gb1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        org.telegram.ui.ActionBar.d2 d2Var;
        int i13;
        int i14;
        if (i10 == NotificationCenter.locationPermissionGranted) {
            B0(null, true);
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper || i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.rl0 rl0Var = this.b;
            if (rl0Var != null) {
                rl0Var.e1();
            }
            z0();
            return;
        }
        if (i10 == NotificationCenter.webBrowserSettingsUpdate) {
            tb1 tb1Var = this.a;
            if (tb1Var == null || (i14 = this.browserRow) == -1) {
                return;
            }
            tb1Var.m(i14);
            return;
        }
        if (i10 == NotificationCenter.themeAccentListUpdated) {
            tb1 tb1Var2 = this.a;
            if (tb1Var2 == null || (i13 = this.n0) == -1) {
                return;
            }
            tb1Var2.n(i13, new Object());
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
                StringBuilder sb = new StringBuilder("https://");
                sb.append(getMessagesController().linkPrefix);
                sb.append("/addtheme/");
                sb.append((h6Var != null ? h6Var.r : i6Var.C).slug);
                String sb2 = sb.toString();
                showDialog(new org.telegram.ui.Components.lq0(getParentActivity(), null, sb2, false, sb2, false, null));
                org.telegram.ui.ActionBar.d2 d2Var2 = this.r;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var2 == this.h && h6Var2 == this.n && (d2Var = this.r) == null) {
                d2Var.dismiss();
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
            org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.r = d2Var3;
            d2Var3.d0 = true;
            showDialog(d2Var3, new x5(this, 17));
            return;
        }
        if (i10 != NotificationCenter.needSetDayNightTheme) {
            if (i10 == NotificationCenter.emojiPreviewThemesChanged) {
                int i15 = this.m0;
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
        boolean z4 = !f12;
        if (this.R0 != z4) {
            this.R0 = z4;
            org.telegram.ui.Components.gj0 gj0Var = this.P0;
            gj0Var.N(!f12 ? gj0Var.e[0] - 1 : 0);
            this.s.getIconView().d();
        }
        if (this.m0 >= 0) {
            for (int i16 = 0; i16 < this.b.getChildCount(); i16++) {
                if (this.b.getChildAt(i16) instanceof ev) {
                    ((ev) this.b.getChildAt(i16)).b();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.z9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.k0.class, org.telegram.ui.Cells.ea.class, ub1.class, jb1.class, pb1.class, org.telegram.ui.Cells.i5.class, org.telegram.ui.Cells.ka.class, rb1.class, org.telegram.ui.Cells.n8.class, so0.class, org.telegram.ui.Components.wy0.class, ev.class, org.telegram.ui.Cells.t.class}, null, null, null, i10));
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i14 = org.telegram.ui.ActionBar.j6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"leftImageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"rightImageView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 2048, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 2048, new Class[]{ub1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 2048, new Class[]{jb1.class}, new String[]{"sizeBar"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{jb1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{pb1.class}, null, null, null, org.telegram.ui.ActionBar.j6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{pb1.class}, null, null, null, org.telegram.ui.ActionBar.j6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m3, org.telegram.ui.ActionBar.j6.q3}, null, org.telegram.ui.ActionBar.j6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.n3, org.telegram.ui.ActionBar.j6.r3}, null, org.telegram.ui.ActionBar.j6.dc));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.m3.y;
        int i19 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, drawableArr, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, org.telegram.ui.ActionBar.j6.q3.y, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.p3, org.telegram.ui.ActionBar.j6.t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.o3, org.telegram.ui.ActionBar.j6.s3}, null, org.telegram.ui.ActionBar.j6.Ca));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.m3, org.telegram.ui.ActionBar.j6.q3}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ub1.class}, null, null, null, org.telegram.ui.ActionBar.j6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i11));
        int i20 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i12));
        arrayList.addAll(k7.e6.a(new jy0(6, this), i20, i11, i12));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.H0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.N0);
        locationManager.removeUpdates(this.O0);
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            A0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
    }

    public final void w0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.a.Q = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new cb1(this, 1));
        showDialog(alertDialog$Builder.a);
    }

    public final void x0() {
        org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
        presentFragment(new jd1(A0, false, 1, A0.k(false).a >= 100, this.f == 1));
    }

    public final void z0() {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (this.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.i6 A0 = org.telegram.ui.ActionBar.j6.A0();
        org.telegram.ui.ActionBar.h6 k10 = A0.k(false);
        ArrayList arrayList = A0.Y;
        if (arrayList == null || arrayList.isEmpty() || k10 == null || k10.a < 100) {
            this.s.r(2);
            this.s.r(3);
        } else {
            this.s.K(2);
            this.s.K(3);
        }
        int i10 = AndroidUtilities.isTablet() ? 18 : 16;
        org.telegram.ui.ActionBar.i6 A02 = org.telegram.ui.ActionBar.j6.A0();
        if (SharedConfig.fontSize == i10 && SharedConfig.bubbleRadius == 17 && A02.P && A02.V == org.telegram.ui.ActionBar.j6.n && (k10 == null || (c6Var = k10.y) == null || "d".equals(c6Var.c))) {
            this.s.r(4);
        } else {
            this.s.K(4);
        }
    }
}
