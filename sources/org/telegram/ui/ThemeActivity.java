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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ThemeActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
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
    public boolean G0;
    public int H;
    public int H0;
    public int I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public boolean K0;
    public int L;
    public boolean L0;
    public int M;
    public final oa1 M0;
    public int N;
    public final oa1 N0;
    public int O;
    public org.telegram.ui.Components.mi0 O0;
    public int P;
    public boolean P0;
    public int Q;
    public boolean Q0;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public xa1 a;
    public int a0;
    private int appIconSelectorRow;
    public org.telegram.ui.Components.wk0 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public ua1 c;
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
    public org.telegram.ui.ActionBar.e6 h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    private int liteModeRow;
    public int m0;
    public org.telegram.ui.ActionBar.d6 n;
    public int n0;
    private int nightThemeRow;
    public int o0;
    public int p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int q0;
    public org.telegram.ui.ActionBar.c2 r;
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

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class InnerAccentView extends View {
        public final Paint a;
        public ObjectAnimator b;
        public float c;
        public org.telegram.ui.ActionBar.e6 d;
        public org.telegram.ui.ActionBar.d6 e;
        public boolean f;

        public InnerAccentView(Context context) {
            super(context);
            this.a = new Paint(1);
        }

        public final void a(boolean z10) {
            this.f = this.d.U == this.e.a;
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
            int i9 = this.e.c;
            Paint paint = this.a;
            paint.setColor(i9);
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
            int i10 = this.e.e;
            if (i10 == 0 || this.c == 1.0f) {
                return;
            }
            paint.setColor(i10);
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
        public final void onMeasure(int i9, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), TLObject.FLAG_30));
        }

        public void setCheckedState(float f10) {
            this.c = f10;
            invalidate();
        }
    }

    public ThemeActivity(int i9) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.M0 = new oa1(this);
        this.N0 = new oa1(this);
        this.f = i9;
        z0(true);
    }

    public static void B0(final int i9, final Context context, final Utilities.Callback callback, final org.telegram.ui.ActionBar.b6 b6Var) {
        final MessagesController messagesController = MessagesController.getInstance(i9);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i10 = messagesController.verifyAgeMin;
        if (TextUtils.isEmpty(str) || !messagesController.config.needAgeVideoVerification.get()) {
            callback.run(Boolean.TRUE);
            return;
        }
        org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(context, b6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        j10.customView = f10;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, g7.e6.e(50, 50, 17));
        f10.addView(frameLayout, g7.e6.t(80, 80, 1, 0, 20, 0, 8));
        int i11 = org.telegram.ui.ActionBar.f6.j5;
        TextView b10 = g7.i6.b(context, 20.0f, i11, true, b6Var);
        org.telegram.messenger.ll.l(R.string.AgeVerificationTitle, b10, 17);
        f10.addView(b10, g7.e6.t(-1, -2, 7, 24, 8, 24, 8));
        TextView b11 = g7.i6.b(context, 14.0f, i11, false, b6Var);
        b11.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
        b11.setGravity(17);
        f10.addView(b11, g7.e6.t(-1, -2, 7, 24, 0, 24, 0));
        final kh.d dVar = new kh.d(context, b6Var, true);
        dVar.g(LocaleController.getString(R.string.AgeVerificationButton), false, true);
        dVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.la1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final kh.d dVar2 = kh.d.this;
                if (dVar2.J) {
                    return;
                }
                dVar2.setLoading(true);
                int i12 = R.raw.permission_request_camera;
                int i13 = R.string.AgeVerificationNeedCameraPermission;
                final MessagesController messagesController2 = messagesController;
                final String str3 = str;
                final int i14 = i9;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                final int i15 = i10;
                final Utilities.Callback callback2 = callback;
                final org.telegram.ui.ActionBar.f3[] f3VarArr = r9;
                org.telegram.ui.Components.kd0.e(i12, i13, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() { // from class: org.telegram.ui.ha1
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        final kh.d dVar3 = kh.d.this;
                        if (!booleanValue) {
                            dVar3.setLoading(false);
                            return;
                        }
                        final MessagesController messagesController3 = messagesController2;
                        UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                        final int i16 = i14;
                        final Context context3 = context2;
                        final org.telegram.ui.ActionBar.b6 b6Var3 = b6Var2;
                        final int i17 = i15;
                        final Utilities.Callback callback3 = callback2;
                        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = f3VarArr;
                        userNameResolver.resolve(str3, new d5.d() { // from class: org.telegram.ui.ia1
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r6v2, types: [org.telegram.messenger.Utilities$Callback4, org.telegram.ui.ja1] */
                            @Override // d5.d
                            public final void accept(Object obj2) {
                                Long l10 = (Long) obj2;
                                kh.d dVar4 = kh.d.this;
                                if (l10 == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                TLRPC.User user = messagesController3.getUser(l10);
                                if (user == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U == null) {
                                    dVar4.setLoading(false);
                                    return;
                                }
                                mh.s4 b12 = mh.s4.b(i16, l10.longValue(), l10.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                final mh.c3 c3Var = new mh.c3(context3, b6Var3);
                                final int i18 = i17;
                                final Utilities.Callback callback4 = callback3;
                                ?? r62 = new Utilities.Callback4() { // from class: org.telegram.ui.ja1
                                    @Override // org.telegram.messenger.Utilities.Callback4
                                    public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        Double d = (Double) obj4;
                                        boolean booleanValue2 = d != null ? d.doubleValue() >= ((double) i18) : ((Boolean) obj3).booleanValue();
                                        c3Var.k(false);
                                        callback4.run(Boolean.valueOf(booleanValue2));
                                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                        if (!booleanValue2 || U2 == null) {
                                            return;
                                        }
                                        org.telegram.messenger.l0.p(R.string.AgeVerificationPassedTitle, org.telegram.ui.Components.oc.a0(U2), R.raw.contact_check, 36);
                                    }
                                };
                                c3Var.D0 = r62;
                                mh.u2 u2Var = c3Var.x;
                                if (u2Var != 0) {
                                    u2Var.setOnVerifiedAge(r62);
                                }
                                c3Var.w(true);
                                c3Var.w0 = false;
                                c3Var.g0 = U.getParentActivity();
                                c3Var.s(U, b12);
                                c3Var.show();
                                dVar4.setLoading(false);
                                f3VarArr2[0].dismiss();
                            }
                        });
                    }
                });
            }
        });
        f10.addView(dVar, g7.e6.t(-1, 48, 7, 2, 29, 2, 14));
        j10.show();
        final org.telegram.ui.ActionBar.f3[] f3VarArr = {j10};
        j10.fixNavigationBar();
    }

    public static void T(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        xa1 xa1Var;
        org.telegram.ui.Components.wk0 wk0Var = themeActivity.b;
        if (wk0Var == null || !wk0Var.C || (xa1Var = themeActivity.a) == null) {
            return;
        }
        int i9 = themeActivity.sensitiveContentRow;
        boolean z10 = false;
        boolean z11 = i9 >= 0;
        if (contentsettings != null && contentsettings.sensitive_can_change) {
            z10 = true;
        }
        if (z11 == z10) {
            xa1Var.m(i9);
        } else {
            themeActivity.z0(true);
        }
    }

    public static void V(final ThemeActivity themeActivity, Context context, View view, final int i9, float f10) {
        int i10;
        int i11;
        final int i12 = 1;
        if (i9 == themeActivity.J) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            boolean z11 = !z10;
            edit.putBoolean("view_animations", z11);
            SharedConfig.setAnimationsEnabled(z11);
            edit.commit();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(z11);
                return;
            }
            return;
        }
        final int i13 = 0;
        if (i9 == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
            return;
        }
        if (i9 == themeActivity.changeUserColor) {
            zo0 zo0Var = new zo0();
            zo0Var.x = themeActivity;
            themeActivity.presentFragment(zo0Var);
            return;
        }
        if (i9 == themeActivity.C) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z12 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = globalMainSettings2.edit();
            boolean z13 = !z12;
            edit2.putBoolean("send_by_enter", z13);
            edit2.commit();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(z13);
                return;
            }
            return;
        }
        if (i9 == themeActivity.A) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.raiseToSpeak);
                return;
            }
            return;
        }
        if (i9 == themeActivity.B) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.nextMediaTap);
                return;
            }
            return;
        }
        if (i9 == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.A != -1) {
                for (int i14 = 0; i14 < themeActivity.b.getChildCount(); i14++) {
                    View childAt = themeActivity.b.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.t8) {
                        themeActivity.b.getClass();
                        if (RecyclerView.R(childAt) == themeActivity.A) {
                            ((org.telegram.ui.Cells.t8) childAt).setChecked(false);
                        }
                    }
                }
            }
            themeActivity.z0(false);
            return;
        }
        if (i9 == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.pauseMusicOnRecord);
                return;
            }
            return;
        }
        if (i9 == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.pauseMusicOnMedia);
                return;
            }
            return;
        }
        int i15 = 2;
        float f11 = 4.0f;
        if (i9 == themeActivity.G) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference = new AtomicReference();
            LinearLayout f12 = org.telegram.messenger.ll.f(context, 1);
            CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
            final int i16 = 0;
            while (i16 < 3) {
                org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                k6Var.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                k6Var.b(charSequenceArr[i16], i16 == SharedConfig.distanceSystemType);
                k6Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 2, -1));
                f12.addView(k6Var);
                k6Var.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.da1
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
                                SharedConfig.setSearchEngineType(i16);
                                themeActivity2.L0 = true;
                                f2.q1 K = themeActivity2.b.K(themeActivity2.H);
                                if (K != null) {
                                    themeActivity2.a.v(K, themeActivity2.H);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                            default:
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.getClass();
                                SharedConfig.setDistanceSystemType(i16);
                                themeActivity3.K0 = true;
                                f2.q1 K2 = themeActivity3.b.K(themeActivity3.G);
                                if (K2 != null) {
                                    themeActivity3.a.v(K2, themeActivity3.G);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                        }
                    }
                });
                i16++;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            alertDialog$Builder.n(f12);
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference.set(c2Var);
            themeActivity.showDialog(c2Var);
            return;
        }
        if (i9 == themeActivity.H) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference2 = new AtomicReference();
            LinearLayout f13 = org.telegram.messenger.ll.f(context, 1);
            ArrayList b10 = org.telegram.ui.web.j1.b();
            int size = b10.size();
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            final int i17 = 0;
            while (i17 < size) {
                charSequenceArr2[i17] = ((org.telegram.ui.web.j1) b10.get(i17)).a;
                org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
                k6Var2.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(4.0f), 0);
                k6Var2.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                k6Var2.b(charSequenceArr2[i17], i17 == SharedConfig.searchEngineType);
                k6Var2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 2, -1));
                f13.addView(k6Var2);
                k6Var2.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.da1
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
                                themeActivity2.L0 = true;
                                f2.q1 K = themeActivity2.b.K(themeActivity2.H);
                                if (K != null) {
                                    themeActivity2.a.v(K, themeActivity2.H);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                            default:
                                ThemeActivity themeActivity3 = this.b;
                                themeActivity3.getClass();
                                SharedConfig.setDistanceSystemType(i17);
                                themeActivity3.K0 = true;
                                f2.q1 K2 = themeActivity3.b.K(themeActivity3.G);
                                if (K2 != null) {
                                    themeActivity3.a.v(K2, themeActivity3.G);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                        }
                    }
                });
                i17++;
                f11 = 4.0f;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string2 = LocaleController.getString(R.string.SearchEngine);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.N = string2;
            alertDialog$Builder2.n(f13);
            alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference2.set(c2Var2);
            themeActivity.showDialog(c2Var2);
            return;
        }
        if (i9 == themeActivity.I) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference3 = new AtomicReference();
            LinearLayout f14 = org.telegram.messenger.ll.f(context, 1);
            org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
            k6Var3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            int i18 = org.telegram.ui.ActionBar.f6.g7;
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, i18, false);
            int i19 = org.telegram.ui.ActionBar.f6.E5;
            k6Var3.a(w02, org.telegram.ui.ActionBar.f6.w0(null, i19, false));
            k6Var3.b(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
            int i20 = org.telegram.ui.ActionBar.f6.i6;
            k6Var3.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i20, false), 2, -1));
            f14.addView(k6Var3);
            k6Var3.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.ea1
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
                            themeActivity2.J0 = true;
                            ((Dialog) atomicReference3.get()).dismiss();
                            f2.q1 K = themeActivity2.b.K(themeActivity2.I);
                            if (K != null) {
                                themeActivity2.a.v(K, themeActivity2.I);
                                break;
                            }
                            break;
                        default:
                            int i21 = R.raw.permission_request_microphone;
                            int i22 = R.string.PermissionNoBluetoothWithHint;
                            ThemeActivity themeActivity3 = this.b;
                            AtomicReference atomicReference4 = atomicReference3;
                            org.telegram.ui.Components.kd0.e(i21, i22, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new eb0(12, themeActivity3, atomicReference4));
                            SharedConfig.recordViaSco = true;
                            SharedConfig.saveConfig();
                            themeActivity3.J0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            f2.q1 K2 = themeActivity3.b.K(themeActivity3.I);
                            if (K2 != null) {
                                themeActivity3.a.v(K2, themeActivity3.I);
                                break;
                            }
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.k6 k6Var4 = new org.telegram.ui.Cells.k6(themeActivity.getParentActivity(), null);
            k6Var4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var4.a(org.telegram.ui.ActionBar.f6.w0(null, i18, false), org.telegram.ui.ActionBar.f6.w0(null, i19, false));
            String string3 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
            String string4 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
            boolean z14 = SharedConfig.recordViaSco;
            k6Var4.a.setText(string3);
            TextView textView = k6Var4.b;
            textView.setVisibility(0);
            textView.setText(string4);
            k6Var4.c.a(z14, false);
            k6Var4.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i20, false), 2, -1));
            f14.addView(k6Var4);
            k6Var4.setOnClickListener(new View.OnClickListener(themeActivity) { // from class: org.telegram.ui.ea1
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
                            SharedConfig.recordViaSco = false;
                            SharedConfig.saveConfig();
                            themeActivity2.J0 = true;
                            ((Dialog) atomicReference3.get()).dismiss();
                            f2.q1 K = themeActivity2.b.K(themeActivity2.I);
                            if (K != null) {
                                themeActivity2.a.v(K, themeActivity2.I);
                                break;
                            }
                            break;
                        default:
                            int i21 = R.raw.permission_request_microphone;
                            int i22 = R.string.PermissionNoBluetoothWithHint;
                            ThemeActivity themeActivity3 = this.b;
                            AtomicReference atomicReference4 = atomicReference3;
                            org.telegram.ui.Components.kd0.e(i21, i22, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new eb0(12, themeActivity3, atomicReference4));
                            SharedConfig.recordViaSco = true;
                            SharedConfig.saveConfig();
                            themeActivity3.J0 = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            f2.q1 K2 = themeActivity3.b.K(themeActivity3.I);
                            if (K2 != null) {
                                themeActivity3.a.v(K2, themeActivity3.I);
                                break;
                            }
                            break;
                    }
                }
            });
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
            c2Var3.N = string5;
            alertDialog$Builder3.n(f14);
            alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference3.set(c2Var3);
            themeActivity.showDialog(c2Var3);
            return;
        }
        if (i9 == themeActivity.y) {
            SharedConfig.toggleDirectShare();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.directShare);
                return;
            }
            return;
        }
        if (i9 == themeActivity.sensitiveContentRow) {
            if (themeActivity.getMessagesController().showSensitiveContent()) {
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            }
            n21 n21Var = new n21(11, themeActivity, view);
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context, 0, themeActivity.resourceProvider);
            String string6 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
            org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.a;
            c2Var4.N = string6;
            c2Var4.P = LocaleController.getString(R.string.ConfirmSensitiveContentText);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Confirm), new nl0(20, themeActivity, n21Var));
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            themeActivity.showDialog(c2Var4);
            return;
        }
        if (i9 == themeActivity.L) {
            return;
        }
        if (i9 == themeActivity.M) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(themeActivity.getParentActivity());
            String string7 = LocaleController.getString("SortBy", R.string.SortBy);
            org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder5.a;
            c2Var5.N = string7;
            alertDialog$Builder5.f(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new hy(themeActivity, i9, i15));
            alertDialog$Builder5.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            themeActivity.showDialog(c2Var5);
            return;
        }
        if (i9 == themeActivity.o0) {
            SharedConfig.toggleChatBlur();
            if (view instanceof org.telegram.ui.Cells.t8) {
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.chatBlurEnabled());
                return;
            }
            return;
        }
        if (i9 == themeActivity.nightThemeRow) {
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                themeActivity.presentFragment(new ThemeActivity(1));
                return;
            }
            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
            if (org.telegram.ui.ActionBar.f6.o == 0) {
                org.telegram.ui.ActionBar.f6.o = 2;
                j5Var.setChecked(true);
            } else {
                org.telegram.ui.ActionBar.f6.o = 0;
                j5Var.setChecked(false);
            }
            org.telegram.ui.ActionBar.f6.q1();
            org.telegram.ui.ActionBar.f6.E(true);
            boolean z15 = org.telegram.ui.ActionBar.f6.o != 0;
            String z02 = z15 ? org.telegram.ui.ActionBar.f6.z0() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
            if (z15) {
                int i21 = org.telegram.ui.ActionBar.f6.o;
                z02 = aa.d.z(i21 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i21 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", z02);
            }
            j5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), z02, R.drawable.menu_night_mode_24, z15, 0, false, true, false);
            return;
        }
        if (i9 == themeActivity.browserRow) {
            if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                themeActivity.presentFragment(new org.telegram.ui.web.u1(null));
                return;
            } else {
                themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                ((org.telegram.ui.Cells.j5) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                return;
            }
        }
        if (i9 == themeActivity.N) {
            if (org.telegram.ui.ActionBar.f6.o == 0) {
                return;
            }
            org.telegram.ui.ActionBar.f6.o = 0;
            themeActivity.z0(true);
            org.telegram.ui.ActionBar.f6.E(false);
            return;
        }
        if (i9 == themeActivity.O) {
            if (org.telegram.ui.ActionBar.f6.o == 1) {
                return;
            }
            org.telegram.ui.ActionBar.f6.o = 1;
            if (org.telegram.ui.ActionBar.f6.p) {
                themeActivity.A0(null, true);
            }
            themeActivity.z0(true);
            org.telegram.ui.ActionBar.f6.E(false);
            return;
        }
        if (i9 == themeActivity.P) {
            if (org.telegram.ui.ActionBar.f6.o == 2) {
                return;
            }
            org.telegram.ui.ActionBar.f6.o = 2;
            themeActivity.z0(true);
            org.telegram.ui.ActionBar.f6.E(false);
            return;
        }
        if (i9 == themeActivity.Q) {
            if (org.telegram.ui.ActionBar.f6.o == 3) {
                return;
            }
            org.telegram.ui.ActionBar.f6.o = 3;
            themeActivity.z0(true);
            org.telegram.ui.ActionBar.f6.E(false);
            return;
        }
        if (i9 == themeActivity.T) {
            boolean z16 = !org.telegram.ui.ActionBar.f6.p;
            org.telegram.ui.ActionBar.f6.p = z16;
            ((org.telegram.ui.Cells.t8) view).setChecked(z16);
            themeActivity.z0(true);
            if (org.telegram.ui.ActionBar.f6.p) {
                themeActivity.A0(null, true);
            }
            org.telegram.ui.ActionBar.f6.E(false);
            return;
        }
        if (i9 == themeActivity.W || i9 == themeActivity.X) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            if (i9 == themeActivity.W) {
                i10 = org.telegram.ui.ActionBar.f6.r;
                i11 = i10 / 60;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.s;
                i11 = i10 / 60;
            }
            int i22 = i10 - (i11 * 60);
            final org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.fa1
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i23, int i24) {
                    int i25 = (i23 * 60) + i24;
                    int i26 = ThemeActivity.this.W;
                    int i27 = i9;
                    org.telegram.ui.Cells.ba baVar2 = baVar;
                    if (i27 == i26) {
                        org.telegram.ui.ActionBar.f6.r = i25;
                        baVar2.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                    } else {
                        org.telegram.ui.ActionBar.f6.s = i25;
                        baVar2.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i23), Integer.valueOf(i24)), false, true);
                    }
                }
            }, i11, i22, true));
            return;
        }
        if (i9 == themeActivity.U) {
            themeActivity.A0(null, true);
            return;
        }
        if (i9 == themeActivity.createNewThemeRow) {
            themeActivity.v0();
            return;
        }
        if (i9 == themeActivity.u0) {
            themeActivity.w0();
        } else if (i9 == themeActivity.stickersRow) {
            themeActivity.presentFragment(new StickersActivity(0, null));
        } else if (i9 == themeActivity.liteModeRow) {
            themeActivity.presentFragment(new sb0());
        }
    }

    public static void W(ThemeActivity themeActivity, n21 n21Var) {
        B0(themeActivity.currentAccount, themeActivity.getParentActivity(), new eb0(13, themeActivity, n21Var), themeActivity.getResourceProvider());
    }

    public static boolean X(ThemeActivity themeActivity, int i9, boolean z10) {
        if (i9 == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        edit.commit();
        f2.q1 K = themeActivity.b.K(themeActivity.textSizeRow);
        if (K != null) {
            View view = K.a;
            if (view instanceof ya1) {
                ya1 ya1Var = (ya1) view;
                org.telegram.ui.Cells.t1[] cells = ya1Var.a.getCells();
                for (int i10 = 0; i10 < cells.length; i10++) {
                    cells[i10].getMessageObject().resetLayout();
                    cells[i10].requestLayout();
                }
                ya1Var.invalidate();
            }
        }
        f2.q1 K2 = themeActivity.b.K(themeActivity.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.a;
            if (view2 instanceof na1) {
                na1 na1Var = (na1) view2;
                if (z10) {
                    na1Var.requestLayout();
                } else {
                    na1Var.invalidate();
                }
            }
        }
        themeActivity.y0();
        return true;
    }

    public static boolean j0(ThemeActivity themeActivity, int i9) {
        if (i9 != SharedConfig.fontSize) {
            SharedConfig.fontSize = i9;
            SharedConfig.fontSizeIsDefault = false;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", SharedConfig.fontSize);
                edit.commit();
                org.telegram.ui.ActionBar.f6.O();
                f2.q1 K = themeActivity.b.K(themeActivity.textSizeRow);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof ya1) {
                        org.telegram.ui.Cells.t1[] cells = ((ya1) view).a.getCells();
                        for (int i10 = 0; i10 < cells.length; i10++) {
                            cells[i10].getMessageObject().resetLayout();
                            cells[i10].requestLayout();
                        }
                    }
                }
                themeActivity.y0();
                return true;
            }
        }
        return false;
    }

    public static String x0() {
        int i9 = org.telegram.ui.ActionBar.f6.v;
        int i10 = i9 / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i9 - (i10 * 60)));
        int i11 = org.telegram.ui.ActionBar.f6.t;
        int i12 = i11 / 60;
        return LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), format);
    }

    public final void A0(Location location, boolean z10) {
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
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                    alertDialog$Builder.a.P = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new ga1(this, 2));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    showDialog(alertDialog$Builder.a);
                    return;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
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
            FileLog.e(e11);
        }
        if (location == null || z10) {
            if (!this.G0) {
                this.G0 = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.M0);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.N0);
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
            if (location == null) {
                return;
            }
        }
        org.telegram.ui.ActionBar.f6.x = location.getLatitude();
        org.telegram.ui.ActionBar.f6.y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(org.telegram.ui.ActionBar.f6.x, org.telegram.ui.ActionBar.f6.y);
        org.telegram.ui.ActionBar.f6.v = calculateSunriseSunset[0];
        org.telegram.ui.ActionBar.f6.t = calculateSunriseSunset[1];
        org.telegram.ui.ActionBar.f6.w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        org.telegram.ui.ActionBar.f6.u = calendar.get(5);
        Utilities.globalQueue.postRunnable(new ka1(this, 1));
        org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) this.b.K(this.V);
        if (ik0Var != null) {
            View view = ik0Var.a;
            if (view instanceof org.telegram.ui.Cells.b9) {
                ((org.telegram.ui.Cells.b9) view).setText(x0());
            }
        }
        if (org.telegram.ui.ActionBar.f6.p && org.telegram.ui.ActionBar.f6.o == 1) {
            org.telegram.ui.ActionBar.f6.E(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.Q0 = !org.telegram.ui.ActionBar.f6.f1();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i9 = this.f;
        if (i9 == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.sun, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.O0 = mi0Var;
            if (this.Q0) {
                mi0Var.K(mi0Var.e[0] - 1);
            } else {
                mi0Var.K(0);
            }
            org.telegram.ui.Components.mi0 mi0Var2 = this.O0;
            mi0Var2.h = true;
            this.s = n10.d(5, mi0Var2);
        } else if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            this.s = a2;
            a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.s.e(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.s.e(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.s.e(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.s.e(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new w3(this, 20));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ma1(this));
        this.a = new xa1(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.b = wk0Var;
        wk0Var.p1();
        this.b.setLayoutManager(new f2.m0(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((f2.n) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, g7.e6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setOnItemClickListener(new nl0(21, this, context));
        if (i9 == 0) {
            f2.n nVar = new f2.n();
            nVar.n(350L);
            nVar.o(org.telegram.ui.Components.gr.h);
            nVar.C = false;
            nVar.m = false;
            this.b.setItemAnimator(nVar);
        }
        if (this.P0) {
            z0(false);
            this.P0 = false;
            this.b.u0(this.a.e.F0 - 1);
            AndroidUtilities.runOnUIThread(new ka1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        org.telegram.ui.ActionBar.c2 c2Var;
        int i12;
        int i13;
        if (i9 == NotificationCenter.locationPermissionGranted) {
            A0(null, true);
            return;
        }
        if (i9 == NotificationCenter.didSetNewWallpapper || i9 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.wk0 wk0Var = this.b;
            if (wk0Var != null) {
                wk0Var.f1();
            }
            y0();
            return;
        }
        if (i9 == NotificationCenter.webBrowserSettingsUpdate) {
            xa1 xa1Var = this.a;
            if (xa1Var == null || (i13 = this.browserRow) == -1) {
                return;
            }
            xa1Var.m(i13);
            return;
        }
        if (i9 == NotificationCenter.themeAccentListUpdated) {
            xa1 xa1Var2 = this.a;
            if (xa1Var2 == null || (i12 = this.m0) == -1) {
                return;
            }
            xa1Var2.n(i12, new Object());
            return;
        }
        if (i9 == NotificationCenter.themeListUpdated) {
            z0(true);
            return;
        }
        if (i9 == NotificationCenter.themeUploadedToServer) {
            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) objArr[0];
            org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) objArr[1];
            if (e6Var == this.h && d6Var == this.n) {
                StringBuilder sb2 = new StringBuilder("https://");
                sb2.append(getMessagesController().linkPrefix);
                sb2.append("/addtheme/");
                sb2.append((d6Var != null ? d6Var.r : e6Var.B).slug);
                String sb3 = sb2.toString();
                showDialog(new org.telegram.ui.Components.rp0(getParentActivity(), null, sb3, false, sb3, false, null));
                org.telegram.ui.ActionBar.c2 c2Var2 = this.r;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[0];
            org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) objArr[1];
            if (e6Var2 == this.h && d6Var2 == this.n && (c2Var = this.r) == null) {
                c2Var.dismiss();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.needShareTheme) {
            if (getParentActivity() == null || this.isPaused) {
                return;
            }
            this.h = (org.telegram.ui.ActionBar.e6) objArr[0];
            this.n = (org.telegram.ui.ActionBar.d6) objArr[1];
            org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            this.r = c2Var3;
            c2Var3.c0 = true;
            showDialog(c2Var3, new r5(this, 17));
            return;
        }
        if (i9 != NotificationCenter.needSetDayNightTheme) {
            if (i9 == NotificationCenter.emojiPreviewThemesChanged) {
                int i14 = this.l0;
                if (i14 >= 0) {
                    this.a.m(i14);
                    return;
                }
                return;
            }
            if ((i9 == NotificationCenter.contentSettingsLoaded || i9 == NotificationCenter.appConfigUpdated) && (i11 = this.sensitiveContentRow) >= 0) {
                this.a.m(i11);
                return;
            }
            return;
        }
        y0();
        if (this.f != 3) {
            return;
        }
        boolean f12 = org.telegram.ui.ActionBar.f6.f1();
        boolean z10 = !f12;
        if (this.Q0 != z10) {
            this.Q0 = z10;
            org.telegram.ui.Components.mi0 mi0Var = this.O0;
            mi0Var.N(!f12 ? mi0Var.e[0] - 1 : 0);
            this.s.getIconView().d();
        }
        if (this.l0 >= 0) {
            for (int i15 = 0; i15 < this.b.getChildCount(); i15++) {
                if (this.b.getChildAt(i15) instanceof tu) {
                    ((tu) this.b.getChildAt(i15)).b();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.k0.class, org.telegram.ui.Cells.ga.class, ya1.class, na1.class, ta1.class, org.telegram.ui.Cells.j5.class, org.telegram.ui.Cells.ma.class, va1.class, org.telegram.ui.Cells.p8.class, ho0.class, org.telegram.ui.Components.ay0.class, tu.class, org.telegram.ui.Cells.t.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i12 = org.telegram.ui.ActionBar.f6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i13 = org.telegram.ui.ActionBar.f6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.f6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"leftImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 8, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"rightImageView"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.f6.Ti;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.f6.Vi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 2048, new Class[]{org.telegram.ui.Cells.k0.class}, new String[]{"seekBarView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 2048, new Class[]{ya1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, new String[]{"sizeBar"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 2048, new Class[]{na1.class}, new String[]{"sizeBar"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{na1.class}, new String[]{"sizeBar"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ta1.class}, null, null, null, org.telegram.ui.ActionBar.f6.g7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ta1.class}, null, null, null, org.telegram.ui.ActionBar.f6.h7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.m3, org.telegram.ui.ActionBar.f6.q3}, null, org.telegram.ui.ActionBar.f6.ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.n3, org.telegram.ui.ActionBar.f6.r3}, null, org.telegram.ui.ActionBar.f6.dc));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.m3.y;
        int i18 = org.telegram.ui.ActionBar.f6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, drawableArr, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, org.telegram.ui.ActionBar.f6.q3.y, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.p3, org.telegram.ui.ActionBar.f6.t3}, null, org.telegram.ui.ActionBar.f6.Ba));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.o3, org.telegram.ui.ActionBar.f6.s3}, null, org.telegram.ui.ActionBar.f6.Ca));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.m3, org.telegram.ui.ActionBar.f6.q3}, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.y3}, null, org.telegram.ui.ActionBar.f6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.z3}, null, org.telegram.ui.ActionBar.f6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.A3, org.telegram.ui.ActionBar.f6.C3}, null, org.telegram.ui.ActionBar.f6.La));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.B3, org.telegram.ui.ActionBar.f6.D3}, null, org.telegram.ui.ActionBar.f6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.sc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ab));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.od));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ya1.class}, null, null, null, org.telegram.ui.ActionBar.f6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i10));
        int i19 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t.class}, null, null, null, i11));
        arrayList.addAll(g7.h6.a(new sx0(6, this), i19, i10, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            org.telegram.ui.ActionBar.f6.h1(this.currentAccount, true);
            org.telegram.ui.ActionBar.f6.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.G0 = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.M0);
        locationManager.removeUpdates(this.N0);
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
        org.telegram.ui.ActionBar.f6.q1();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.b.setPadding(0, 0, 0, i12);
        this.b.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            z0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
    }

    public final void v0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString("NewTheme", R.string.NewTheme);
        alertDialog$Builder.a.P = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString("CreateTheme", R.string.CreateTheme), new ga1(this, 1));
        showDialog(alertDialog$Builder.a);
    }

    public final void w0() {
        org.telegram.ui.ActionBar.e6 A0 = org.telegram.ui.ActionBar.f6.A0();
        presentFragment(new oc1(A0, false, 1, A0.k(false).a >= 100, this.f == 1));
    }

    public final void y0() {
        org.telegram.ui.ActionBar.y5 y5Var;
        if (this.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.e6 A0 = org.telegram.ui.ActionBar.f6.A0();
        org.telegram.ui.ActionBar.d6 k10 = A0.k(false);
        ArrayList arrayList = A0.X;
        if (arrayList == null || arrayList.isEmpty() || k10 == null || k10.a < 100) {
            this.s.r(2);
            this.s.r(3);
        } else {
            this.s.K(2);
            this.s.K(3);
        }
        int i9 = AndroidUtilities.isTablet() ? 18 : 16;
        org.telegram.ui.ActionBar.e6 A02 = org.telegram.ui.ActionBar.f6.A0();
        if (SharedConfig.fontSize == i9 && SharedConfig.bubbleRadius == 17 && A02.O && A02.U == org.telegram.ui.ActionBar.f6.n && (k10 == null || (y5Var = k10.y) == null || "d".equals(y5Var.c))) {
            this.s.r(4);
        } else {
            this.s.K(4);
        }
    }

    public final void z0(boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_theme tL_theme;
        int i15 = this.F0;
        int i16 = this.m0;
        int i17 = this.u0;
        int i18 = this.A;
        this.F0 = 0;
        this.L = -1;
        this.M = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.d0 = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.c0 = -1;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.w = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.bubbleRadiusRow = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.o0 = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.liteModeRow = -1;
        this.C0 = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.x = -1;
        this.y = -1;
        this.sensitiveContentRow = -1;
        this.J = -1;
        this.A = -1;
        this.raiseToListenRow = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.K = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.createNewThemeRow = -1;
        this.D0 = -1;
        this.appIconSelectorRow = -1;
        this.E0 = -1;
        this.v0 = -1;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int size = org.telegram.ui.ActionBar.f6.F.size();
        int i19 = 0;
        while (true) {
            i9 = this.f;
            if (i19 >= size) {
                break;
            }
            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) org.telegram.ui.ActionBar.f6.F.get(i19);
            if (i9 == 0 || i9 == 3 || ((e6Var.b != null || e6Var.q()) && ((tL_theme = e6Var.B) == null || tL_theme.document != null))) {
                if (e6Var.b != null) {
                    arrayList2.add(e6Var);
                } else {
                    arrayList.add(e6Var);
                }
            }
            i19++;
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(16));
        if (i9 == 3) {
            int i20 = this.F0;
            this.s0 = i20;
            this.l0 = i20 + 1;
            this.j0 = i20 + 2;
            this.t0 = i20 + 3;
            this.e0 = i20 + 4;
            this.F0 = i20 + 6;
            this.k0 = i20 + 5;
            boolean z11 = org.telegram.ui.ActionBar.f6.A0().S != 0;
            this.v = z11;
            ua1 ua1Var = this.c;
            if (ua1Var != null) {
                ua1Var.setDrawDivider(z11);
            }
            if (this.v) {
                int i21 = this.F0;
                this.F0 = i21 + 1;
                this.m0 = i21;
            }
            int i22 = this.F0;
            this.F0 = i22 + 1;
            this.g0 = i22;
            org.telegram.ui.ActionBar.e6 A0 = org.telegram.ui.ActionBar.f6.A0();
            org.telegram.ui.ActionBar.d6 k10 = A0.k(false);
            ArrayList arrayList3 = A0.X;
            if (arrayList3 != null && !arrayList3.isEmpty() && k10 != null && k10.a >= 100) {
                int i23 = this.F0;
                this.F0 = i23 + 1;
                this.u0 = i23;
            }
            int i24 = this.F0;
            this.createNewThemeRow = i24;
            this.F0 = i24 + 2;
            this.v0 = i24 + 1;
        } else if (i9 == 0) {
            int i25 = this.F0;
            this.w = i25;
            this.textSizeRow = i25 + 1;
            this.backgroundRow = i25 + 2;
            this.changeUserColor = i25 + 3;
            this.d0 = i25 + 4;
            this.e0 = i25 + 5;
            this.l0 = i25 + 6;
            this.n0 = i25 + 7;
            this.f0 = i25 + 8;
            this.bubbleRadiusRow = i25 + 9;
            this.g0 = i25 + 10;
            this.h0 = i25 + 11;
            this.i0 = i25 + 12;
            this.j0 = i25 + 13;
            this.D0 = i25 + 14;
            this.appIconSelectorRow = i25 + 15;
            this.E0 = i25 + 16;
            this.p0 = i25 + 17;
            this.q0 = i25 + 18;
            this.r0 = i25 + 19;
            this.nightThemeRow = i25 + 20;
            this.browserRow = i25 + 21;
            this.liteModeRow = i25 + 22;
            this.stickersRow = i25 + 23;
            this.x0 = i25 + 24;
            this.A0 = i25 + 25;
            this.B = i25 + 26;
            int i26 = i25 + 28;
            this.F0 = i26;
            this.raiseToListenRow = i25 + 27;
            if (SharedConfig.raiseToListen) {
                this.F0 = i25 + 29;
                this.A = i26;
            }
            int i27 = this.F0;
            this.pauseOnRecordRow = i27;
            this.pauseOnMediaRow = i27 + 1;
            this.I = i27 + 2;
            this.y0 = i27 + 3;
            this.B0 = i27 + 4;
            this.F0 = i27 + 6;
            this.y = i27 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
                int i28 = this.F0;
                this.F0 = i28 + 1;
                this.sensitiveContentRow = i28;
            }
            int i29 = this.F0;
            this.C = i29;
            this.G = i29 + 1;
            this.F0 = i29 + 3;
            this.z0 = i29 + 2;
        } else {
            int i30 = this.F0;
            this.N = i30;
            this.O = i30 + 1;
            int i31 = i30 + 3;
            this.F0 = i31;
            this.P = i30 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.F0 = i30 + 4;
                this.Q = i31;
            }
            int i32 = this.F0;
            int i33 = i32 + 1;
            this.F0 = i33;
            this.R = i32;
            int i34 = org.telegram.ui.ActionBar.f6.o;
            if (i34 == 1) {
                this.S = i33;
                int i35 = i32 + 3;
                this.F0 = i35;
                this.T = i32 + 2;
                if (org.telegram.ui.ActionBar.f6.p) {
                    this.U = i35;
                    this.F0 = i32 + 5;
                    this.V = i32 + 4;
                } else {
                    this.W = i35;
                    this.X = i32 + 4;
                    this.F0 = i32 + 6;
                    this.Y = i32 + 5;
                }
            } else if (i34 == 2) {
                this.Z = i33;
                this.a0 = i32 + 2;
                this.F0 = i32 + 4;
                this.b0 = i32 + 3;
            }
            if (org.telegram.ui.ActionBar.f6.o != 0) {
                int i36 = this.F0;
                this.c0 = i36;
                this.F0 = i36 + 2;
                this.k0 = i36 + 1;
                boolean z12 = org.telegram.ui.ActionBar.f6.J.S != 0;
                this.v = z12;
                ua1 ua1Var2 = this.c;
                if (ua1Var2 != null) {
                    ua1Var2.setDrawDivider(z12);
                }
                if (this.v) {
                    int i37 = this.F0;
                    this.F0 = i37 + 1;
                    this.m0 = i37;
                }
                int i38 = this.F0;
                this.F0 = i38 + 1;
                this.n0 = i38;
            }
        }
        ua1 ua1Var3 = this.c;
        if (ua1Var3 != null) {
            int width = this.b.getWidth();
            int i39 = ua1Var3.c3;
            org.telegram.ui.Cells.la laVar = ua1Var3.Y2;
            if (i39 != laVar.h()) {
                laVar.l();
                if (ua1Var3.X2 != (ua1Var3.b3 == 1 ? org.telegram.ui.ActionBar.f6.J : org.telegram.ui.ActionBar.f6.A0())) {
                    ua1Var3.x1(width);
                }
            }
        }
        xa1 xa1Var = this.a;
        if (xa1Var != null) {
            if (i9 == 1 && (i13 = this.H0) != (i14 = org.telegram.ui.ActionBar.f6.o) && i13 != -1) {
                int i40 = this.R;
                int i41 = i40 + 1;
                if (i13 != i14) {
                    int i42 = 0;
                    while (i42 < 4) {
                        org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) this.b.K(i42);
                        if (ik0Var != null) {
                            View view = ik0Var.a;
                            if (view instanceof org.telegram.ui.Cells.ga) {
                                ((org.telegram.ui.Cells.ga) view).setTypeChecked(i42 == org.telegram.ui.ActionBar.f6.o);
                            }
                        }
                        i42++;
                    }
                    int i43 = org.telegram.ui.ActionBar.f6.o;
                    if (i43 == 0) {
                        this.a.t(i41, i15 - i41);
                    } else if (i43 == 1) {
                        int i44 = this.H0;
                        if (i44 == 0) {
                            this.a.s(i41, this.F0 - i41);
                        } else if (i44 == 2) {
                            this.a.t(i41, 3);
                            this.a.s(i41, org.telegram.ui.ActionBar.f6.p ? 4 : 5);
                        } else if (i44 == 3) {
                            this.a.s(i41, org.telegram.ui.ActionBar.f6.p ? 4 : 5);
                        }
                    } else if (i43 == 2) {
                        int i45 = this.H0;
                        if (i45 == 0) {
                            this.a.s(i41, this.F0 - i41);
                        } else if (i45 == 1) {
                            this.a.t(i41, org.telegram.ui.ActionBar.f6.p ? 4 : 5);
                            this.a.s(i41, 3);
                        } else if (i45 == 3) {
                            this.a.s(i41, 3);
                        }
                    } else if (i43 == 3) {
                        int i46 = this.H0;
                        if (i46 == 0) {
                            this.a.s(i41, this.F0 - i41);
                        } else if (i46 == 2) {
                            this.a.t(i41, 3);
                        } else if (i46 == 1) {
                            this.a.t(i41, org.telegram.ui.ActionBar.f6.p ? 4 : 5);
                        }
                    }
                } else {
                    boolean z13 = this.I0;
                    boolean z14 = org.telegram.ui.ActionBar.f6.p;
                    if (z13 != z14) {
                        int i47 = i40 + 3;
                        xa1Var.t(i47, z14 ? 3 : 2);
                        this.a.s(i47, org.telegram.ui.ActionBar.f6.p ? 2 : 3);
                    }
                }
            } else if (z10 || this.H0 == -1) {
                xa1Var.l();
            } else {
                if (i16 == -1 && (i12 = this.m0) != -1) {
                    xa1Var.o(i12);
                } else if (i16 == -1 || this.m0 != -1) {
                    int i48 = this.m0;
                    if (i48 != -1) {
                        xa1Var.m(i48);
                    }
                } else {
                    xa1Var.u(i16);
                    if (i17 != -1) {
                        i17--;
                    }
                }
                if (i17 == -1 && (i11 = this.u0) != -1) {
                    this.a.o(i11);
                } else if (i17 != -1 && this.u0 == -1) {
                    this.a.u(i17);
                }
                if (i18 == -1 && (i10 = this.A) != -1) {
                    this.a.o(i10);
                } else if (i18 != -1 && this.A == -1) {
                    this.a.u(i18);
                }
            }
        }
        if (i9 == 1) {
            this.I0 = org.telegram.ui.ActionBar.f6.p;
            this.H0 = org.telegram.ui.ActionBar.f6.o;
        }
        y0();
    }
}
