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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class ThemeActivity extends org.telegram.ui.ActionBar.e implements fn7 {
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
    public final gd6 S0;
    public int T;
    public final gd6 T0;
    public int U;
    public b29 U0;
    public int V;
    public boolean V0;
    public int W;
    public boolean W0;
    public int X;
    public int Y;
    public int Z;
    public d0 a;
    public int a0;
    private int appIconSelectorRow;
    public d79 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public pob c;
    public int c0;
    private int changeUserColor;
    private int createNewThemeRow;
    public final ArrayList d;
    public int d0;
    public final ArrayList e;
    public int e0;
    public final byte f;
    public int f0;
    public int g0;
    public znb h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    private int liteModeRow;
    public int m0;
    public ynb n;
    public int n0;
    private int nightThemeRow;
    public int o0;
    public int p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int q0;
    public id r;
    public int r0;
    private int raiseToListenRow;
    public sla s;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    static class InnerAccentView extends View {
        public final Paint a;
        public ObjectAnimator b;
        public float c;
        public znb d;
        public ynb e;
        public boolean f;

        public InnerAccentView(Context context) {
            super(context);
            this.a = new Paint(1);
        }

        public final void a(boolean z) {
            this.f = this.d.Z == this.e.a;
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            boolean z2 = this.f;
            if (!z) {
                setCheckedState(z2 ? 1.0f : 0.0f);
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", z2 ? 1.0f : 0.0f);
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
            float L = hl.L(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i = this.e.c;
            Paint paint = this.a;
            paint.setColor(i);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.L(3.0f));
            paint.setAlpha(Math.round(this.c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(jn7.d4);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (hl.L(5.0f) * this.c), paint);
            if (this.c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, hl.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (hl.L(7.0f) * this.c), measuredHeight, hl.L(2.0f), paint);
                canvas.drawCircle((hl.L(7.0f) * this.c) + measuredWidth, measuredHeight, hl.L(2.0f), paint);
            }
            int i2 = this.e.e;
            if (i2 == 0 || this.c == 1.0f) {
                return;
            }
            paint.setColor(i2);
            canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.c) * hl.L(8.0f), paint);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(ob6.M0(2131751980, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(62.0f), TLObject.FLAG_30));
        }

        public void setCheckedState(float f) {
            this.c = f;
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeActivity(int i) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        byte b = 2;
        this.S0 = new gd6(this, b);
        this.T0 = new gd6(this, b);
        this.f = i;
        F0(true);
    }

    public static void H0(final int i, final vnb vnbVar, final pcc pccVar, final Context context) {
        final uc7 s1 = uc7.s1(i);
        final String str = s1.k4.X2.f;
        String str2 = s1.k4.Y2.f;
        final int f = s1.k4.N0.f();
        if (TextUtils.isEmpty(str) || !s1.k4.l.f) {
            pccVar.a(Boolean.TRUE);
            return;
        }
        nx0 h = uh9.h(1, vnbVar, context, false);
        LinearLayout j = uh9.j(context, 1);
        j.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        j.setClipChildren(false);
        j.setClipToPadding(false);
        h.O = j;
        FrameLayout frameLayout = new FrameLayout(context);
        int L = hl.L(80.0f);
        int i2 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        frameLayout.setBackground(K);
        yob.j(frameLayout, K, M, null, vnbVar);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, tre.e(50, 50, 17));
        j.addView(frameLayout, tre.t(80, 80, 1, 0, 20, 0, 8));
        int i3 = aob.j5;
        TextView b = zze.b(context, 20.0f, i3, true, vnbVar);
        b.setText(ob6.M0(2131754300, null));
        b.setGravity(17);
        j.addView(b, tre.t(-1, -2, 7, 24, 8, 24, 8));
        TextView b2 = zze.b(context, 14.0f, i3, false, vnbVar);
        b2.setText(hl.S2(ob6.N0("AgeVerificationText" + str2)));
        b2.setGravity(17);
        j.addView(b2, tre.t(-1, -2, 7, 24, 0, 24, 0));
        final c51 c51Var = new c51(vnbVar, context, true);
        c51Var.i(ob6.M0(2131754306, null), false, true);
        c51Var.setOnClickListener(new View.OnClickListener() { // from class: eob
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final c51 c51Var2 = c51.this;
                if (c51Var2.R) {
                    return;
                }
                c51Var2.setLoading(true);
                final uc7 uc7Var = s1;
                final String str3 = str;
                final int i4 = i;
                final Context context2 = context;
                final vnb vnbVar2 = vnbVar;
                final int i5 = f;
                final pcc pccVar2 = pccVar;
                final nx0[] nx0VarArr = r9;
                jve.c(R.raw.permission_request_camera, 2131754303, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new pcc() { // from class: fob
                    @Override // pcc
                    public final void a(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        final c51 c51Var3 = c51.this;
                        if (!booleanValue) {
                            c51Var3.setLoading(false);
                            return;
                        }
                        final uc7 uc7Var2 = uc7Var;
                        kbc a2 = uc7Var2.a2();
                        final int i6 = i4;
                        final Context context3 = context2;
                        final vnb vnbVar3 = vnbVar2;
                        final int i7 = i5;
                        final pcc pccVar3 = pccVar2;
                        final nx0[] nx0VarArr2 = nx0VarArr;
                        a2.a(str3, null, new pcc() { // from class: gob
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r6v2, types: [hob, mcc] */
                            @Override // pcc
                            public final void a(Object obj2) {
                                Long l = (Long) obj2;
                                c51 c51Var4 = c51.this;
                                if (l == null) {
                                    c51Var4.setLoading(false);
                                    return;
                                }
                                TLRPC.User X1 = uc7Var2.X1(l);
                                if (X1 == null) {
                                    c51Var4.setLoading(false);
                                    return;
                                }
                                e S = LaunchActivity.S();
                                if (S == null) {
                                    c51Var4.setLoading(false);
                                    return;
                                }
                                gzc b3 = gzc.b(i6, l.longValue(), l.longValue(), null, null, 4, 0, 0L, null, false, null, X1, 0, false, false);
                                final xw0 xw0Var = new xw0(context3, vnbVar3);
                                final int i8 = i7;
                                final pcc pccVar4 = pccVar3;
                                ?? r6 = new mcc() { // from class: hob
                                    @Override // mcc
                                    public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        Double d = (Double) obj4;
                                        boolean booleanValue2 = d != null ? d.doubleValue() >= ((double) i8) : ((Boolean) obj3).booleanValue();
                                        xw0Var.m(false);
                                        pccVar4.a(Boolean.valueOf(booleanValue2));
                                        e S2 = LaunchActivity.S();
                                        if (!booleanValue2 || S2 == null) {
                                            return;
                                        }
                                        bs2.v(null, 2131754302, d31.b0(S2), R.raw.contact_check, 36);
                                    }
                                };
                                xw0Var.M0 = r6;
                                pw0 pw0Var = xw0Var.E;
                                if (pw0Var != 0) {
                                    pw0Var.setOnVerifiedAge(r6);
                                }
                                xw0Var.B(true);
                                xw0Var.C0 = false;
                                xw0Var.m0 = S.getParentActivity();
                                xw0Var.x(S, b3);
                                xw0Var.show();
                                c51Var4.setLoading(false);
                                nx0VarArr2[0].dismiss();
                            }
                        });
                    }
                });
            }
        });
        j.addView(c51Var, tre.t(-1, 48, 7, 2, 29, 2, 14));
        h.show();
        final nx0[] nx0VarArr = {h};
        h.J();
    }

    public static String x0() {
        int i = aob.v;
        int i2 = i / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i - (i2 * 60)));
        int i3 = aob.t;
        int i4 = i3 / 60;
        return ob6.a0("AutoNightUpdateLocationInfo", null, 2131753773, String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3 - (i4 * 60))), format);
    }

    public final /* synthetic */ int A0() {
        return this.sensitiveContentRow;
    }

    public final void B0(TL_account.contentSettings contentsettings) {
        d0 d0Var;
        d79 d79Var = this.b;
        if (d79Var == null || !d79Var.H || (d0Var = this.a) == null) {
            return;
        }
        int i = this.sensitiveContentRow;
        boolean z = false;
        boolean z2 = i >= 0;
        if (contentsettings != null && contentsettings.sensitive_can_change) {
            z = true;
        }
        if (z2 == z) {
            d0Var.g(i);
        } else {
            F0(true);
        }
    }

    public final boolean C0(int i, boolean z) {
        if (i == xea.U0) {
            return false;
        }
        xea.U0 = i;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("bubbleRadius", xea.U0);
        edit.commit();
        f89 L = this.b.L(this.textSizeRow);
        if (L != null) {
            View view = L.a;
            if (view instanceof rob) {
                rob robVar = (rob) view;
                wb2[] cells = robVar.a.getCells();
                for (int i2 = 0; i2 < cells.length; i2++) {
                    cells[i2].getMessageObject().S1 = false;
                    cells[i2].requestLayout();
                }
                robVar.invalidate();
            }
        }
        f89 L2 = this.b.L(this.bubbleRadiusRow);
        if (L2 != null) {
            View view2 = L2.a;
            if (view2 instanceof lob) {
                lob lobVar = (lob) view2;
                if (z) {
                    lobVar.requestLayout();
                } else {
                    lobVar.invalidate();
                }
            }
        }
        E0();
        return true;
    }

    public final boolean D0(int i) {
        if (i != xea.S0) {
            xea.S0 = i;
            xea.T0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", xea.S0);
                edit.commit();
                aob.P();
                f89 L = this.b.L(this.textSizeRow);
                if (L != null) {
                    View view = L.a;
                    if (view instanceof rob) {
                        wb2[] cells = ((rob) view).a.getCells();
                        for (int i2 = 0; i2 < cells.length; i2++) {
                            cells[i2].getMessageObject().S1 = false;
                            cells[i2].requestLayout();
                        }
                    }
                }
                E0();
                return true;
            }
        }
        return false;
    }

    public final void E0() {
        unb unbVar;
        if (this.s == null) {
            return;
        }
        znb B0 = aob.B0();
        ynb i = B0.i(false);
        ArrayList arrayList = B0.c0;
        if (arrayList == null || arrayList.isEmpty() || i == null || i.a < 100) {
            this.s.u(2);
            this.s.u(3);
        } else {
            this.s.S(2);
            this.s.S(3);
        }
        int i2 = hl.O1() ? 18 : 16;
        znb B02 = aob.B0();
        if (xea.S0 == i2 && xea.U0 == 17 && B02.T && B02.Z == aob.n && (i == null || (unbVar = i.y) == null || "d".equals(unbVar.c))) {
            this.s.u(4);
        } else {
            this.s.S(4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(boolean z) {
        byte b;
        int i;
        int i2;
        int i3;
        TLRPC.TL_theme tL_theme;
        int i4 = this.L0;
        int i5 = this.r0;
        int i6 = this.z0;
        int i7 = this.F;
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
        int size = aob.F.size();
        int i8 = 0;
        while (true) {
            b = this.f;
            if (i8 >= size) {
                break;
            }
            znb znbVar = (znb) aob.F.get(i8);
            if (b == 0 || b == 3 || ((znbVar.b != null || znbVar.o()) && ((tL_theme = znbVar.G) == null || tL_theme.document != null))) {
                if (znbVar.b != null) {
                    arrayList2.add(znbVar);
                } else {
                    arrayList.add(znbVar);
                }
            }
            i8++;
        }
        Collections.sort(arrayList, new fna((byte) 7));
        int i9 = this.L0;
        int i10 = i9 + 1;
        if (b == 3) {
            this.x0 = i9;
            this.q0 = i10;
            this.o0 = i9 + 2;
            this.y0 = i9 + 3;
            this.j0 = i9 + 4;
            this.L0 = i9 + 6;
            this.p0 = i9 + 5;
            boolean z2 = aob.B0().X != 0;
            this.w = z2;
            pob pobVar = this.c;
            if (pobVar != null) {
                pobVar.setDrawDivider(z2);
            }
            if (this.w) {
                int i11 = this.L0;
                this.L0 = i11 + 1;
                this.r0 = i11;
            }
            int i12 = this.L0;
            this.L0 = i12 + 1;
            this.l0 = i12;
            znb B0 = aob.B0();
            ynb i13 = B0.i(false);
            ArrayList arrayList3 = B0.c0;
            if (arrayList3 != null && !arrayList3.isEmpty() && i13 != null && i13.a >= 100) {
                int i14 = this.L0;
                this.L0 = i14 + 1;
                this.z0 = i14;
            }
            int i15 = this.L0;
            this.createNewThemeRow = i15;
            this.L0 = i15 + 2;
            this.A0 = i15 + 1;
        } else if (b == 0) {
            this.x = i9;
            this.textSizeRow = i10;
            this.backgroundRow = i9 + 2;
            this.changeUserColor = i9 + 3;
            this.i0 = i9 + 4;
            this.j0 = i9 + 5;
            this.q0 = i9 + 6;
            this.s0 = i9 + 7;
            this.k0 = i9 + 8;
            this.bubbleRadiusRow = i9 + 9;
            this.l0 = i9 + 10;
            this.m0 = i9 + 11;
            this.n0 = i9 + 12;
            this.o0 = i9 + 13;
            this.J0 = i9 + 14;
            this.appIconSelectorRow = i9 + 15;
            this.K0 = i9 + 16;
            this.u0 = i9 + 17;
            this.v0 = i9 + 18;
            this.w0 = i9 + 19;
            this.nightThemeRow = i9 + 20;
            this.browserRow = i9 + 21;
            this.liteModeRow = i9 + 22;
            this.L0 = i9 + 24;
            this.stickersRow = i9 + 23;
            if (DictationAsr.F()) {
                int i16 = this.L0;
                this.L0 = i16 + 1;
                this.B0 = i16;
            }
            int i17 = this.L0;
            this.D0 = i17;
            this.G0 = i17 + 1;
            this.G = i17 + 2;
            int i18 = i17 + 4;
            this.L0 = i18;
            this.raiseToListenRow = i17 + 3;
            if (xea.p0) {
                int i19 = i17 + 5;
                this.L0 = i19;
                this.F = i18;
                i18 = i19;
            }
            this.pauseOnRecordRow = i18;
            this.pauseOnMediaRow = i18 + 1;
            this.N = i18 + 2;
            this.E0 = i18 + 3;
            this.H0 = i18 + 4;
            this.L0 = i18 + 6;
            this.E = i18 + 5;
            TL_account.contentSettings contentsettings = getMessagesController().b5;
            if (contentsettings != null && contentsettings.sensitive_can_change) {
                int i20 = this.L0;
                this.L0 = i20 + 1;
                this.sensitiveContentRow = i20;
            }
            int i21 = this.L0;
            this.H = i21;
            this.L = i21 + 1;
            this.L0 = i21 + 3;
            this.F0 = i21 + 2;
        } else {
            this.S = i9;
            this.T = i10;
            int i22 = i9 + 3;
            this.L0 = i22;
            this.U = i9 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                int i23 = i9 + 4;
                this.L0 = i23;
                this.V = i22;
                i22 = i23;
            }
            int i24 = i22 + 1;
            this.L0 = i24;
            this.W = i22;
            int i25 = aob.o;
            if (i25 == 1) {
                this.X = i24;
                int i26 = i22 + 3;
                this.L0 = i26;
                this.Y = i22 + 2;
                if (aob.p) {
                    this.Z = i26;
                    i24 = i22 + 5;
                    this.L0 = i24;
                    this.a0 = i22 + 4;
                    if (aob.o != 0) {
                        this.h0 = i24;
                        this.L0 = i24 + 2;
                        this.p0 = i24 + 1;
                        boolean z3 = aob.J.X != 0;
                        this.w = z3;
                        pob pobVar2 = this.c;
                        if (pobVar2 != null) {
                            pobVar2.setDrawDivider(z3);
                        }
                        if (this.w) {
                            int i27 = this.L0;
                            this.L0 = i27 + 1;
                            this.r0 = i27;
                        }
                        int i28 = this.L0;
                        this.L0 = i28 + 1;
                        this.s0 = i28;
                    }
                } else {
                    this.b0 = i26;
                    this.c0 = i22 + 4;
                    i = i22 + 6;
                    this.L0 = i;
                    this.d0 = i22 + 5;
                    i24 = i;
                    if (aob.o != 0) {
                    }
                }
            } else {
                if (i25 == 2) {
                    this.e0 = i24;
                    this.f0 = i22 + 2;
                    i = i22 + 4;
                    this.L0 = i;
                    this.g0 = i22 + 3;
                    i24 = i;
                }
                if (aob.o != 0) {
                }
            }
        }
        pob pobVar3 = this.c;
        if (pobVar3 != null) {
            int width = this.b.getWidth();
            int i29 = pobVar3.o3;
            org.telegram.ui.Cells.e eVar = pobVar3.k3;
            if (i29 != eVar.b()) {
                eVar.f();
                if (pobVar3.j3 != (pobVar3.n3 == 1 ? aob.J : aob.B0())) {
                    pobVar3.B1(width);
                }
            }
        }
        d0 d0Var = this.a;
        if (d0Var != null) {
            if (b == 1 && (i2 = this.N0) != (i3 = aob.o) && i2 != -1) {
                int i30 = this.W;
                int i31 = i30 + 1;
                if (i2 != i3) {
                    int i32 = 0;
                    while (i32 < 4) {
                        n69 n69Var = (n69) this.b.L(i32);
                        if (n69Var != null) {
                            View view = n69Var.a;
                            if (view instanceof arb) {
                                ((arb) view).setTypeChecked(i32 == aob.o);
                            }
                        }
                        i32++;
                    }
                    int i33 = aob.o;
                    if (i33 == 0) {
                        this.a.q(i31, i4 - i31);
                    } else if (i33 == 1) {
                        int i34 = this.N0;
                        if (i34 == 0) {
                            this.a.p(i31, this.L0 - i31);
                        } else if (i34 == 2) {
                            this.a.q(i31, 3);
                            this.a.p(i31, aob.p ? 4 : 5);
                        } else if (i34 == 3) {
                            this.a.p(i31, aob.p ? 4 : 5);
                        }
                    } else if (i33 == 2) {
                        int i35 = this.N0;
                        if (i35 == 0) {
                            this.a.p(i31, this.L0 - i31);
                        } else if (i35 == 1) {
                            this.a.q(i31, aob.p ? 4 : 5);
                            this.a.p(i31, 3);
                        } else if (i35 == 3) {
                            this.a.p(i31, 3);
                        }
                    } else if (i33 == 3) {
                        int i36 = this.N0;
                        if (i36 == 0) {
                            this.a.p(i31, this.L0 - i31);
                        } else if (i36 == 2) {
                            this.a.q(i31, 3);
                        } else if (i36 == 1) {
                            this.a.q(i31, aob.p ? 4 : 5);
                        }
                    }
                } else {
                    boolean z4 = this.O0;
                    boolean z5 = aob.p;
                    if (z4 != z5) {
                        int i37 = i30 + 3;
                        d0Var.q(i37, z5 ? 3 : 2);
                        this.a.p(i37, aob.p ? 2 : 3);
                    }
                }
            } else if (z || this.N0 == -1) {
                d0Var.f();
            } else {
                int i38 = this.r0;
                if (i5 == -1) {
                    if (i38 != -1) {
                        d0Var.i(i38);
                        int i39 = this.z0;
                        if (i6 != -1) {
                            if (i39 != -1) {
                                this.a.i(i39);
                            }
                        } else if (i39 == -1) {
                            this.a.s(i6);
                        }
                        int i40 = this.F;
                        if (i7 != -1) {
                            if (i40 != -1) {
                                this.a.i(i40);
                            }
                        } else if (i40 == -1) {
                            this.a.s(i7);
                        }
                    }
                    if (i38 != -1) {
                        d0Var.g(i38);
                    }
                    int i392 = this.z0;
                    if (i6 != -1) {
                    }
                    int i402 = this.F;
                    if (i7 != -1) {
                    }
                } else {
                    if (i38 == -1) {
                        d0Var.s(i5);
                        if (i6 != -1) {
                            i6--;
                        }
                        int i3922 = this.z0;
                        if (i6 != -1) {
                        }
                        int i4022 = this.F;
                        if (i7 != -1) {
                        }
                    }
                    if (i38 != -1) {
                    }
                    int i39222 = this.z0;
                    if (i6 != -1) {
                    }
                    int i40222 = this.F;
                    if (i7 != -1) {
                    }
                }
            }
        }
        if (b == 1) {
            this.O0 = aob.p;
            this.N0 = aob.o;
        }
        E0();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(Location location, boolean z) {
        Location location2;
        n69 n69Var;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        byte b = 2;
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        byte b2 = 1;
        if (getParentActivity() != null) {
            if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i = aob.L5;
                    alertDialog$Builder.l(R.raw.permission_request_location, 72, aob.w0(null, i, false), null);
                    alertDialog$Builder.m(i, null);
                    alertDialog$Builder.a.U = ob6.M0(2131749301, "GpsDisabledAlertText");
                    alertDialog$Builder.j(ob6.M0(2131751771, "ConnectingToProxyEnable"), new job(this, b));
                    alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                    showDialog(alertDialog$Builder.a);
                    return;
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        try {
            location2 = locationManager.getLastKnownLocation("gps");
            if (location2 == null) {
                try {
                    location2 = locationManager.getLastKnownLocation("network");
                } catch (Exception e2) {
                    e = e2;
                    cc4.g(e, true);
                    if (location2 != null) {
                    }
                    if (!this.M0) {
                    }
                    if (location2 == null) {
                    }
                    aob.x = location2.getLatitude();
                    aob.y = location2.getLongitude();
                    int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(aob.x, aob.y);
                    aob.v = calculateSunriseSunset[0];
                    aob.t = calculateSunriseSunset[1];
                    aob.w = null;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    aob.u = calendar.get(5);
                    Utilities.e.c(new iob(this, b2));
                    n69Var = (n69) this.b.L(this.a0);
                    if (n69Var != null) {
                    }
                    if (aob.p) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (location2 == null) {
                location2 = locationManager.getLastKnownLocation("passive");
            }
        } catch (Exception e3) {
            e = e3;
            location2 = location;
        }
        if (location2 != null || z) {
            if (!this.M0) {
                this.M0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.S0);
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.T0);
                } catch (Exception e5) {
                    cc4.g(e5, true);
                }
            }
            if (location2 == null) {
                return;
            }
        }
        aob.x = location2.getLatitude();
        aob.y = location2.getLongitude();
        int[] calculateSunriseSunset2 = SunDate.calculateSunriseSunset(aob.x, aob.y);
        aob.v = calculateSunriseSunset2[0];
        aob.t = calculateSunriseSunset2[1];
        aob.w = null;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        aob.u = calendar2.get(5);
        Utilities.e.c(new iob(this, b2));
        n69Var = (n69) this.b.L(this.a0);
        if (n69Var != null) {
            View view = n69Var.a;
            if (view instanceof ilb) {
                ((ilb) view).setText(x0());
            }
        }
        if (aob.p || aob.o != 1) {
            return;
        }
        aob.E(false);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.jd));
        hashSet.add(Integer.valueOf(aob.Db));
        hashSet.add(Integer.valueOf(aob.Cb));
        hashSet.add(Integer.valueOf(aob.Bb));
        hashSet.add(Integer.valueOf(aob.Ab));
        hashSet.add(Integer.valueOf(aob.Wc));
        hashSet.add(Integer.valueOf(aob.ta));
        hashSet.add(Integer.valueOf(aob.tb));
        hashSet.add(Integer.valueOf(aob.sb));
        hashSet.add(Integer.valueOf(aob.wb));
        hashSet.add(Integer.valueOf(aob.vb));
        hashSet.add(Integer.valueOf(aob.ub));
        hashSet.add(Integer.valueOf(aob.rb));
        hashSet.add(Integer.valueOf(aob.Uc));
        hashSet.add(Integer.valueOf(aob.ra));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.Kj));
        hashSet.add(Integer.valueOf(aob.Mj));
        hashSet.add(Integer.valueOf(aob.Di));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.W0 = !aob.i1();
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        jla jlaVar = this.simpleActionBar;
        byte b = 0;
        byte b2 = this.f;
        if (b2 == 3) {
            jlaVar.setTitle(ob6.M0(2131752859, "BrowseThemes"));
            rla v = this.simpleActionBar.v();
            b29 b29Var = new b29(R.raw.sun, hl.L(28.0f), hl.L(28.0f), true, null);
            this.U0 = b29Var;
            if (this.W0) {
                b29Var.H(b29Var.e[0] - 1);
            } else {
                b29Var.H(0);
            }
            b29 b29Var2 = this.U0;
            b29Var2.h = true;
            v.getClass();
            this.s = v.b(5, 0, null, b29Var2, hl.L(48.0f), null);
        } else if (b2 == 0) {
            jlaVar.setTitle(ob6.M0(2131752175, "ChatSettings"));
            sla a = this.simpleActionBar.v().a(0, R.drawable.ic_ab_other);
            this.s = a;
            a.setContentDescription(ob6.M0(2131754834, "AccDescrMoreOptions"));
            this.s.e(2, R.drawable.msg_share, ob6.M0(2131745154, "ShareTheme"));
            this.s.e(3, R.drawable.msg_edit, ob6.M0(2131751184, "EditThemeColors"));
            this.s.e(1, R.drawable.msg_palette, ob6.M0(2131751674, "CreateNewThemeMenu"));
            this.s.e(4, R.drawable.msg_reset, ob6.M0(2131743801, "ThemeResetToDefaults"));
            if (getMessagesController().b5 == null) {
                getMessagesController().R0(new sh9(this, (byte) 20));
            }
        } else {
            jlaVar.setTitle(ob6.M0(2131753777, null));
        }
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kob(this));
        this.a = new d0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new x46(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((zb3) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        this.b.setOnItemClickListener(new yw9(this, context, (byte) 10));
        if (b2 == 0) {
            zb3 zb3Var = new zb3();
            zb3Var.n(350L);
            zb3Var.o(k43.h);
            zb3Var.C = false;
            zb3Var.m = false;
            this.b.setItemAnimator(zb3Var);
        }
        if (this.V0) {
            F0(false);
            this.V0 = false;
            this.b.x0(this.a.e.L0 - 1);
            hl.d3(new iob(this, b), 200L);
        }
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        id idVar;
        int i4;
        int i5;
        if (i == jn7.y4) {
            G0(null, true);
            return;
        }
        if (i == jn7.C4 || i == jn7.l4) {
            d79 d79Var = this.b;
            if (d79Var != null) {
                d79Var.i1();
            }
            E0();
            return;
        }
        if (i == jn7.U5) {
            d0 d0Var = this.a;
            if (d0Var == null || (i5 = this.browserRow) == -1) {
                return;
            }
            d0Var.g(i5);
            return;
        }
        if (i == jn7.t4) {
            d0 d0Var2 = this.a;
            if (d0Var2 == null || (i4 = this.r0) == -1) {
                return;
            }
            d0Var2.h(i4, new Object());
            return;
        }
        if (i == jn7.r4) {
            F0(true);
            return;
        }
        if (i == jn7.M2) {
            znb znbVar = (znb) objArr[0];
            ynb ynbVar = (ynb) objArr[1];
            if (znbVar == this.h && ynbVar == this.n) {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(getMessagesController().N2);
                sb.append("/addtheme/");
                sb.append((ynbVar != null ? ynbVar.r : znbVar.G).slug);
                String sb2 = sb.toString();
                showDialog(new kea(getParentActivity(), null, sb2, false, sb2, false, null));
                id idVar2 = this.r;
                if (idVar2 != null) {
                    idVar2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.N2) {
            znb znbVar2 = (znb) objArr[0];
            ynb ynbVar2 = (ynb) objArr[1];
            if (znbVar2 == this.h && ynbVar2 == this.n && (idVar = this.r) == null) {
                idVar.dismiss();
                return;
            }
            return;
        }
        if (i == jn7.v4) {
            if (getParentActivity() == null || this.isPaused) {
                return;
            }
            this.h = (znb) objArr[0];
            this.n = (ynb) objArr[1];
            id idVar3 = new id(3, null, getParentActivity());
            this.r = idVar3;
            idVar3.j0 = true;
            showDialog(idVar3, new dl8(this, (byte) 11));
            return;
        }
        if (i != jn7.w4) {
            if (i == jn7.X4) {
                int i6 = this.q0;
                if (i6 >= 0) {
                    this.a.g(i6);
                    return;
                }
                return;
            }
            if ((i == jn7.V3 || i == jn7.S3) && (i3 = this.sensitiveContentRow) >= 0) {
                this.a.g(i3);
                return;
            }
            return;
        }
        E0();
        if (this.f == 3) {
            boolean i1 = aob.i1();
            boolean z = !i1;
            if (this.W0 != z) {
                this.W0 = z;
                b29 b29Var = this.U0;
                b29Var.K(!i1 ? b29Var.e[0] - 1 : 0);
                this.s.getIconView().d();
            }
            if (this.q0 >= 0) {
                for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
                    if (this.b.getChildAt(i7) instanceof ad3) {
                        ((ad3) this.b.getChildAt(i7)).a();
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{qmb.class, wkb.class, mf5.class, cz0.class, arb.class, rob.class, lob.class, oob.class, uo7.class, org.telegram.ui.Cells.f.class, qob.class, skb.class, j38.class, lgb.class, ad3.class, pr.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
        int i = aob.q6;
        arrayList.add(new apb(this.b, 0, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.b, 0, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.M6;
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        int i3 = aob.N6;
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.b, 0, new Class[]{oob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.g7));
        arrayList.add(new apb(this.b, 0, new Class[]{oob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.h7));
        arrayList.add(new apb(this.b, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Vc));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ld));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Rb));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Nd));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Tb));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Pd));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Ub));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Rd));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.Wb));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.ee));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.jc));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.fe));
        arrayList.add(new apb(this.b, 0, new Class[]{rob.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.ec));
        int i4 = aob.H6;
        arrayList.add(new apb(this.b, 0, new Class[]{pr.class}, (Paint) null, (Drawable[]) null, (zob) null, i4));
        int i5 = aob.I6;
        arrayList.add(new apb(this.b, 0, new Class[]{pr.class}, (Paint) null, (Drawable[]) null, (zob) null, i5));
        arrayList.addAll(zye.a(new u00(this, (byte) 21), i4, aob.G6, i5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        jn7.e().b(this, jn7.y4);
        jn7.e().b(this, jn7.C4);
        jn7.e().b(this, jn7.r4);
        jn7.e().b(this, jn7.t4);
        jn7.e().b(this, jn7.l4);
        jn7.e().b(this, jn7.v4);
        jn7.e().b(this, jn7.w4);
        jn7.e().b(this, jn7.X4);
        getNotificationCenter().b(this, jn7.S3);
        getNotificationCenter().b(this, jn7.V3);
        getNotificationCenter().b(this, jn7.M2);
        getNotificationCenter().b(this, jn7.N2);
        getNotificationCenter().b(this, jn7.U5);
        if (this.f == 0) {
            aob.k1(this.currentAccount, true);
            aob.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
        locationManager.removeUpdates(this.S0);
        locationManager.removeUpdates(this.T0);
        jn7.e().n(this, jn7.y4);
        jn7.e().n(this, jn7.C4);
        jn7.e().n(this, jn7.r4);
        jn7.e().n(this, jn7.t4);
        jn7.e().n(this, jn7.l4);
        jn7.e().n(this, jn7.v4);
        jn7.e().n(this, jn7.w4);
        jn7.e().n(this, jn7.X4);
        getNotificationCenter().n(this, jn7.S3);
        getNotificationCenter().n(this, jn7.V3);
        getNotificationCenter().n(this, jn7.M2);
        getNotificationCenter().n(this, jn7.N2);
        getNotificationCenter().n(this, jn7.U5);
        aob.u1();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            F0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            hl.V2(getParentActivity(), this.classGuid);
            hl.g3(getParentActivity(), this.classGuid);
        }
    }

    public final void u0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131748012, "NewTheme");
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131751676, "CreateNewThemeAlert");
        alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
        alertDialog$Builder.j(ob6.M0(2131751668, "CreateTheme"), new job(this, (byte) 1));
        showDialog(idVar);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        znb B0 = aob.B0();
        presentFragment(new pqb(B0, false, 1, B0.i(false).a >= 100, this.f == 1));
    }

    public final void y0(bcb bcbVar) {
        Activity parentActivity = getParentActivity();
        H0(this.currentAccount, getResourceProvider(), new ku9(this, bcbVar, (byte) 17), parentActivity);
    }

    public final void z0(Context context, View view, final int i, float f) {
        int i2;
        int i3;
        final byte b = 1;
        if (i == this.O) {
            SharedPreferences e1 = uc7.e1();
            boolean z = e1.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = e1.edit();
            boolean z2 = !z;
            edit.putBoolean("view_animations", z2);
            xea.y1 = Boolean.valueOf(z2);
            edit.commit();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(z2);
                return;
            }
            return;
        }
        final byte b2 = 0;
        if (i == this.backgroundRow) {
            presentFragment(new WallpapersListActivity(0));
            return;
        }
        if (i == this.changeUserColor) {
            h48 h48Var = new h48();
            h48Var.I = this;
            presentFragment(h48Var);
            return;
        }
        if (i == this.H) {
            SharedPreferences e12 = uc7.e1();
            boolean z3 = e12.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = e12.edit();
            boolean z4 = !z3;
            edit2.putBoolean("send_by_enter", z4);
            edit2.commit();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(z4);
                return;
            }
            return;
        }
        if (i == this.F) {
            xea.o0 = !xea.o0;
            SharedPreferences.Editor edit3 = uc7.e1().edit();
            edit3.putBoolean("raise_to_speak", xea.o0);
            edit3.apply();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.o0);
                return;
            }
            return;
        }
        if (i == this.G) {
            xea.q0 = !xea.q0;
            SharedPreferences.Editor edit4 = uc7.e1().edit();
            edit4.putBoolean("next_media_on_tap", xea.q0);
            edit4.apply();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.q0);
                return;
            }
            return;
        }
        if (i == this.raiseToListenRow) {
            xea.p0 = !xea.p0;
            SharedPreferences.Editor edit5 = uc7.e1().edit();
            edit5.putBoolean("raise_to_listen", xea.p0);
            edit5.apply();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.p0);
            }
            if (!xea.p0 && this.F != -1) {
                for (int i4 = 0; i4 < this.b.getChildCount(); i4++) {
                    View childAt = this.b.getChildAt(i4);
                    if (childAt instanceof wkb) {
                        this.b.getClass();
                        if (RecyclerView.S(childAt) == this.F) {
                            ((wkb) childAt).setChecked(false);
                        }
                    }
                }
            }
            F0(false);
            return;
        }
        if (i == this.pauseOnRecordRow) {
            xea.B0 = !xea.B0;
            SharedPreferences.Editor edit6 = uc7.e1().edit();
            edit6.putBoolean("pauseMusicOnRecord", xea.B0);
            edit6.apply();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.B0);
                return;
            }
            return;
        }
        if (i == this.pauseOnMediaRow) {
            xea.C0 = !xea.C0;
            SharedPreferences.Editor edit7 = uc7.e1().edit();
            edit7.putBoolean("pauseMusicOnMedia", xea.C0);
            edit7.apply();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.C0);
                return;
            }
            return;
        }
        byte b3 = 2;
        float f2 = 4.0f;
        if (i == this.L) {
            if (getParentActivity() != null) {
                final AtomicReference atomicReference = new AtomicReference();
                LinearLayout j = uh9.j(context, 1);
                CharSequence[] charSequenceArr = {ob6.M0(2131751331, "DistanceUnitsAutomatic"), ob6.M0(2131751330, "DistanceUnitsKilometers"), ob6.M0(2131751329, "DistanceUnitsMiles")};
                final int i5 = 0;
                while (i5 < 3) {
                    j29 j29Var = new j29(getParentActivity(), null);
                    float f3 = f2;
                    j29Var.setPadding(hl.L(f2), 0, hl.L(f3), 0);
                    j29Var.a(aob.w0(null, aob.g7, false), aob.w0(null, aob.E5, false));
                    j29Var.b(charSequenceArr[i5], i5 == xea.o1);
                    int i6 = aob.i6;
                    hf0 f0 = aob.f0(aob.w0(null, i6, false), 2, -1);
                    uob M = yob.M(i6);
                    j29Var.setBackground(f0);
                    yob.j(j29Var, f0, null, M, null);
                    j.addView(j29Var);
                    j29Var.setOnClickListener(new View.OnClickListener(this) { // from class: bob
                        public final /* synthetic */ ThemeActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b4 = b2;
                            AtomicReference atomicReference2 = atomicReference;
                            int i7 = i5;
                            ThemeActivity themeActivity = this.b;
                            themeActivity.getClass();
                            switch (b4) {
                                case 0:
                                    xea.o1 = i7;
                                    SharedPreferences.Editor edit8 = uc7.e1().edit();
                                    edit8.putInt("distanceSystemType", xea.o1);
                                    edit8.apply();
                                    ob6.g0 = null;
                                    themeActivity.Q0 = true;
                                    f89 L = themeActivity.b.L(themeActivity.L);
                                    if (L != null) {
                                        themeActivity.a.t(L, themeActivity.L);
                                    }
                                    ((Dialog) atomicReference2.get()).dismiss();
                                    break;
                                default:
                                    xea.m0 = i7;
                                    SharedPreferences.Editor edit9 = uc7.e1().edit();
                                    edit9.putInt("searchEngineType", xea.m0);
                                    edit9.apply();
                                    themeActivity.R0 = true;
                                    f89 L2 = themeActivity.b.L(themeActivity.M);
                                    if (L2 != null) {
                                        themeActivity.a.t(L2, themeActivity.M);
                                    }
                                    ((Dialog) atomicReference2.get()).dismiss();
                                    break;
                            }
                        }
                    });
                    i5++;
                    f2 = f3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131751328, "DistanceUnitsTitle");
                alertDialog$Builder.n(j);
                alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                id idVar = alertDialog$Builder.a;
                atomicReference.set(idVar);
                showDialog(idVar);
                return;
            }
            return;
        }
        if (i == this.M) {
            if (getParentActivity() != null) {
                final AtomicReference atomicReference2 = new AtomicReference();
                LinearLayout j2 = uh9.j(context, 1);
                ArrayList b4 = bw9.b();
                int size = b4.size();
                CharSequence[] charSequenceArr2 = new CharSequence[size];
                final int i7 = 0;
                while (i7 < size) {
                    charSequenceArr2[i7] = ((bw9) b4.get(i7)).a;
                    j29 j29Var2 = new j29(getParentActivity(), null);
                    j29Var2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                    j29Var2.a(aob.w0(null, aob.g7, false), aob.w0(null, aob.E5, false));
                    j29Var2.b(charSequenceArr2[i7], i7 == xea.m0);
                    int i8 = aob.i6;
                    hf0 f02 = aob.f0(aob.w0(null, i8, false), 2, -1);
                    uob M2 = yob.M(i8);
                    j29Var2.setBackground(f02);
                    yob.j(j29Var2, f02, null, M2, null);
                    j2.addView(j29Var2);
                    j29Var2.setOnClickListener(new View.OnClickListener(this) { // from class: bob
                        public final /* synthetic */ ThemeActivity b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b42 = b;
                            AtomicReference atomicReference22 = atomicReference2;
                            int i72 = i7;
                            ThemeActivity themeActivity = this.b;
                            themeActivity.getClass();
                            switch (b42) {
                                case 0:
                                    xea.o1 = i72;
                                    SharedPreferences.Editor edit8 = uc7.e1().edit();
                                    edit8.putInt("distanceSystemType", xea.o1);
                                    edit8.apply();
                                    ob6.g0 = null;
                                    themeActivity.Q0 = true;
                                    f89 L = themeActivity.b.L(themeActivity.L);
                                    if (L != null) {
                                        themeActivity.a.t(L, themeActivity.L);
                                    }
                                    ((Dialog) atomicReference22.get()).dismiss();
                                    break;
                                default:
                                    xea.m0 = i72;
                                    SharedPreferences.Editor edit9 = uc7.e1().edit();
                                    edit9.putInt("searchEngineType", xea.m0);
                                    edit9.apply();
                                    themeActivity.R0 = true;
                                    f89 L2 = themeActivity.b.L(themeActivity.M);
                                    if (L2 != null) {
                                        themeActivity.a.t(L2, themeActivity.M);
                                    }
                                    ((Dialog) atomicReference22.get()).dismiss();
                                    break;
                            }
                        }
                    });
                    i7++;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.S = ob6.M0(2131745527, null);
                alertDialog$Builder2.n(j2);
                alertDialog$Builder2.g(ob6.M0(2131752570, "Cancel"), null);
                id idVar2 = alertDialog$Builder2.a;
                atomicReference2.set(idVar2);
                showDialog(idVar2);
                return;
            }
            return;
        }
        if (i == this.N) {
            if (getParentActivity() != null) {
                final AtomicReference atomicReference3 = new AtomicReference();
                LinearLayout j3 = uh9.j(context, 1);
                j29 j29Var3 = new j29(getParentActivity(), null);
                j29Var3.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                int i9 = aob.g7;
                int w0 = aob.w0(null, i9, false);
                int i10 = aob.E5;
                j29Var3.a(w0, aob.w0(null, i10, false));
                j29Var3.b(ob6.M0(2131748192, null), !xea.r0);
                int i11 = aob.i6;
                hf0 f03 = aob.f0(aob.w0(null, i11, false), 2, -1);
                uob M3 = yob.M(i11);
                j29Var3.setBackground(f03);
                yob.j(j29Var3, f03, null, M3, null);
                j3.addView(j29Var3);
                j29Var3.setOnClickListener(new View.OnClickListener(this) { // from class: cob
                    public final /* synthetic */ ThemeActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b5 = b2;
                        AtomicReference atomicReference4 = atomicReference3;
                        ThemeActivity themeActivity = this.b;
                        themeActivity.getClass();
                        switch (b5) {
                            case 0:
                                xea.r0 = false;
                                xea.x();
                                themeActivity.P0 = true;
                                ((Dialog) atomicReference4.get()).dismiss();
                                f89 L = themeActivity.b.L(themeActivity.N);
                                if (L != null) {
                                    themeActivity.a.t(L, themeActivity.N);
                                    break;
                                }
                                break;
                            default:
                                jve.c(R.raw.permission_request_microphone, 2131747037, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new ku9(themeActivity, atomicReference4, (byte) 16));
                                xea.r0 = true;
                                xea.x();
                                themeActivity.P0 = true;
                                ((Dialog) atomicReference4.get()).dismiss();
                                f89 L2 = themeActivity.b.L(themeActivity.N);
                                if (L2 != null) {
                                    themeActivity.a.t(L2, themeActivity.N);
                                    break;
                                }
                                break;
                        }
                    }
                });
                j29 j29Var4 = new j29(getParentActivity(), null);
                j29Var4.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                j29Var4.a(aob.w0(null, i9, false), aob.w0(null, i10, false));
                String M0 = ob6.M0(2131748189, null);
                String M02 = ob6.M0(2131748190, null);
                boolean z5 = xea.r0;
                j29Var4.a.setText(M0);
                TextView textView = j29Var4.b;
                textView.setVisibility(0);
                textView.setText(M02);
                j29Var4.c.a(z5, false);
                hf0 f04 = aob.f0(aob.w0(null, i11, false), 2, -1);
                uob M4 = yob.M(i11);
                j29Var4.setBackground(f04);
                yob.j(j29Var4, f04, null, M4, null);
                j3.addView(j29Var4);
                j29Var4.setOnClickListener(new View.OnClickListener(this) { // from class: cob
                    public final /* synthetic */ ThemeActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b5 = b;
                        AtomicReference atomicReference4 = atomicReference3;
                        ThemeActivity themeActivity = this.b;
                        themeActivity.getClass();
                        switch (b5) {
                            case 0:
                                xea.r0 = false;
                                xea.x();
                                themeActivity.P0 = true;
                                ((Dialog) atomicReference4.get()).dismiss();
                                f89 L = themeActivity.b.L(themeActivity.N);
                                if (L != null) {
                                    themeActivity.a.t(L, themeActivity.N);
                                    break;
                                }
                                break;
                            default:
                                jve.c(R.raw.permission_request_microphone, 2131747037, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new ku9(themeActivity, atomicReference4, (byte) 16));
                                xea.r0 = true;
                                xea.x();
                                themeActivity.P0 = true;
                                ((Dialog) atomicReference4.get()).dismiss();
                                f89 L2 = themeActivity.b.L(themeActivity.N);
                                if (L2 != null) {
                                    themeActivity.a.t(L2, themeActivity.N);
                                    break;
                                }
                                break;
                        }
                    }
                });
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder3.a.S = ob6.M0(2131748193, null);
                alertDialog$Builder3.n(j3);
                alertDialog$Builder3.g(ob6.M0(2131752570, "Cancel"), null);
                id idVar3 = alertDialog$Builder3.a;
                atomicReference3.set(idVar3);
                showDialog(idVar3);
                return;
            }
            return;
        }
        if (i == this.E) {
            xea.u0 = !xea.u0;
            SharedPreferences.Editor edit8 = uc7.e1().edit();
            edit8.putBoolean("direct_share", xea.u0);
            edit8.apply();
            mka.n(org.telegram.messenger.a.b);
            ls6.d0(yac.t0).o();
            if (view instanceof wkb) {
                ((wkb) view).setChecked(xea.u0);
                return;
            }
            return;
        }
        if (i == this.sensitiveContentRow) {
            if (getMessagesController().g5()) {
                getMessagesController().S4(false);
                if (view instanceof wkb) {
                    ((wkb) view).setChecked(getMessagesController().g5());
                    return;
                }
                return;
            }
            bcb bcbVar = new bcb((Object) this, (Object) view, (byte) 5);
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.resourceProvider, context);
            alertDialog$Builder4.a.S = ob6.M0(2131751778, null);
            alertDialog$Builder4.a.U = ob6.M0(2131751779, null);
            alertDialog$Builder4.j(ob6.M0(2131751782, null), new yw9(this, bcbVar, (byte) 9));
            alertDialog$Builder4.g(ob6.M0(2131752570, null), null);
            showDialog(alertDialog$Builder4.a);
            return;
        }
        if (i != this.Q) {
            if (i == this.R) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder5.a.S = ob6.M0(2131745019, "SortBy");
                    alertDialog$Builder5.e(new CharSequence[]{ob6.M0(2131751565, "Default"), ob6.M0(2131745015, "SortFirstName"), ob6.M0(2131745014, "SortLastName")}, new mu3(this, i, b3));
                    alertDialog$Builder5.g(ob6.M0(2131752570, "Cancel"), null);
                    showDialog(alertDialog$Builder5.a);
                    return;
                }
                return;
            }
            if (i == this.t0) {
                boolean z6 = xea.a;
                i86.i = !i86.e(256) ? i86.d(true) | 256 : i86.d(true) & (-257);
                i86.k();
                if (view instanceof wkb) {
                    ((wkb) view).setChecked(xea.f());
                    return;
                }
                return;
            }
            if (i == this.nightThemeRow) {
                if ((!ob6.a0 || f > hl.L(76.0f)) && (ob6.a0 || f < view.getMeasuredWidth() - hl.L(76.0f))) {
                    presentFragment(new ThemeActivity(1));
                    return;
                }
                uo7 uo7Var = (uo7) view;
                if (aob.o == 0) {
                    aob.o = 2;
                    uo7Var.setChecked(true);
                } else {
                    aob.o = 0;
                    uo7Var.setChecked(false);
                }
                aob.u1();
                aob.E(true);
                boolean z7 = aob.o != 0;
                String A0 = z7 ? aob.A0() : ob6.M0(2131753776, "AutoNightThemeOff");
                if (z7) {
                    int i12 = aob.o;
                    A0 = qd4.y(i12 == 1 ? ob6.M0(2131753780, "AutoNightScheduled") : i12 == 3 ? ob6.M0(2131753779, "AutoNightSystemDefault") : ob6.M0(2131753789, "AutoNightAdaptive"), " ", A0);
                }
                uo7Var.b(ob6.M0(2131753777, "AutoNightTheme"), A0, R.drawable.menu_night_mode_24, z7, 0, false, true, false);
                return;
            }
            if (i == this.browserRow) {
                if ((!ob6.a0 || f > hl.L(76.0f)) && (ob6.a0 || f < view.getMeasuredWidth() - hl.L(76.0f))) {
                    presentFragment(new ixc(null));
                    return;
                }
                uo7 uo7Var2 = (uo7) view;
                uc7 messagesController = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.n5;
                if (tL_webBrowserSettings != null) {
                    messagesController.I5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                }
                uo7Var2.setChecked(getMessagesController().S2());
                return;
            }
            if (i == this.S) {
                if (aob.o != 0) {
                    aob.o = 0;
                    F0(true);
                    aob.E(false);
                    return;
                }
                return;
            }
            if (i == this.T) {
                if (aob.o != 1) {
                    aob.o = 1;
                    if (aob.p) {
                        G0(null, true);
                    }
                    F0(true);
                    aob.E(false);
                    return;
                }
                return;
            }
            if (i == this.U) {
                if (aob.o != 2) {
                    aob.o = 2;
                    F0(true);
                    aob.E(false);
                    return;
                }
                return;
            }
            if (i == this.V) {
                if (aob.o != 3) {
                    aob.o = 3;
                    F0(true);
                    aob.E(false);
                    return;
                }
                return;
            }
            if (i == this.Y) {
                boolean z8 = !aob.p;
                aob.p = z8;
                ((wkb) view).setChecked(z8);
                F0(true);
                if (aob.p) {
                    G0(null, true);
                }
                aob.E(false);
                return;
            }
            if (i == this.b0 || i == this.c0) {
                if (getParentActivity() == null) {
                    return;
                }
                if (i == this.b0) {
                    i2 = aob.r;
                    i3 = i2 / 60;
                } else {
                    i2 = aob.s;
                    i3 = i2 / 60;
                }
                int i13 = i2 - (i3 * 60);
                final qmb qmbVar = (qmb) view;
                showDialog(new TimePickerDialog(getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: dob
                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                    public final void onTimeSet(TimePicker timePicker, int i14, int i15) {
                        int i16 = (i14 * 60) + i15;
                        int i17 = ThemeActivity.this.b0;
                        int i18 = i;
                        qmb qmbVar2 = qmbVar;
                        if (i18 == i17) {
                            aob.r = i16;
                            qmbVar2.c(ob6.M0(2131753785, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)), false, true);
                        } else {
                            aob.s = i16;
                            qmbVar2.c(ob6.M0(2131753775, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)), false, true);
                        }
                    }
                }, i3, i13, true));
                return;
            }
            if (i == this.Z) {
                G0(null, true);
                return;
            }
            if (i == this.createNewThemeRow) {
                u0();
                return;
            }
            if (i == this.z0) {
                w0();
                return;
            }
            if (i == this.stickersRow) {
                presentFragment(new StickersActivity(0, null));
            } else if (i == this.B0) {
                presentFragment(new woa());
            } else if (i == this.liteModeRow) {
                presentFragment(new q86());
            }
        }
    }
}
