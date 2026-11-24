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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class ThemeActivity extends org.telegram.ui.ActionBar.d implements gk7 {
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
    public final cb6 S0;
    public int T;
    public final cb6 T0;
    public int U;
    public oy8 U0;
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
    public o39 b;
    public int b0;
    private int backgroundRow;
    private int browserRow;
    private int bubbleRadiusRow;
    public qkb c;
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
    public akb h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    private int liteModeRow;
    public int m0;
    public zjb n;
    public int n0;
    private int nightThemeRow;
    public int o0;
    public int p0;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    public int q0;
    public hd r;
    public int r0;
    private int raiseToListenRow;
    public xha s;
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
    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    static class InnerAccentView extends View {
        public final Paint a;
        public ObjectAnimator b;
        public float c;
        public akb d;
        public zjb e;
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
            float L = gl.L(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            int i = this.e.c;
            Paint paint = this.a;
            paint.setColor(i);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gl.L(3.0f));
            paint.setAlpha(Math.round(this.c * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(kk7.d4);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, L - (gl.L(5.0f) * this.c), paint);
            if (this.c != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.c * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, gl.L(2.0f), paint);
                canvas.drawCircle(measuredWidth - (gl.L(7.0f) * this.c), measuredHeight, gl.L(2.0f), paint);
                canvas.drawCircle((gl.L(7.0f) * this.c) + measuredWidth, measuredHeight, gl.L(2.0f), paint);
            }
            int i2 = this.e.e;
            if (i2 == 0 || this.c == 1.0f) {
                return;
            }
            paint.setColor(i2);
            canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.c) * gl.L(8.0f), paint);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(k96.M0(2131752003, "ColorPickerMainColor"));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.f);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(62.0f), TLObject.FLAG_30));
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
        this.S0 = new cb6(this, b);
        this.T0 = new cb6(this, b);
        this.f = i;
        E0(true);
    }

    public static void G0(final int i, final wjb wjbVar, final p8c p8cVar, final Context context) {
        final na7 q1 = na7.q1(i);
        final String str = q1.k4.P2.f;
        String str2 = q1.k4.Q2.f;
        final int f = q1.k4.F0.f();
        if (TextUtils.isEmpty(str) || !q1.k4.l.f) {
            p8cVar.a(Boolean.TRUE);
            return;
        }
        fx0 h = de9.h(1, wjbVar, context, false);
        LinearLayout j = de9.j(context, 1);
        j.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        j.setClipChildren(false);
        j.setClipToPadding(false);
        h.O = j;
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gl.L(80.0f);
        int i2 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i2, wjbVar));
        vkb M = zkb.M(i2);
        frameLayout.setBackground(K);
        zkb.j(frameLayout, K, M, null, wjbVar);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, nme.e(50, 50, 17));
        j.addView(frameLayout, nme.t(80, 80, 1, 0, 20, 0, 8));
        int i3 = bkb.i5;
        TextView b = hve.b(context, 20.0f, i3, true, wjbVar);
        b.setText(k96.M0(2131754304, null));
        b.setGravity(17);
        j.addView(b, nme.t(-1, -2, 7, 24, 8, 24, 8));
        TextView b2 = hve.b(context, 14.0f, i3, false, wjbVar);
        b2.setText(gl.T2(k96.N0("AgeVerificationText" + str2)));
        b2.setGravity(17);
        j.addView(b2, nme.t(-1, -2, 7, 24, 0, 24, 0));
        final u41 u41Var = new u41(wjbVar, context, true);
        u41Var.i(k96.M0(2131754310, null), false, true);
        u41Var.setOnClickListener(new View.OnClickListener() { // from class: fkb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final u41 u41Var2 = u41.this;
                if (u41Var2.R) {
                    return;
                }
                u41Var2.setLoading(true);
                final na7 na7Var = q1;
                final String str3 = str;
                final int i4 = i;
                final Context context2 = context;
                final wjb wjbVar2 = wjbVar;
                final int i5 = f;
                final p8c p8cVar2 = p8cVar;
                final fx0[] fx0VarArr = r9;
                rqe.c(R.raw.permission_request_camera, 2131754307, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new p8c() { // from class: gkb
                    @Override // p8c
                    public final void a(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        final u41 u41Var3 = u41.this;
                        if (!booleanValue) {
                            u41Var3.setLoading(false);
                            return;
                        }
                        final na7 na7Var2 = na7Var;
                        k7c Y1 = na7Var2.Y1();
                        final int i6 = i4;
                        final Context context3 = context2;
                        final wjb wjbVar3 = wjbVar2;
                        final int i7 = i5;
                        final p8c p8cVar3 = p8cVar2;
                        final fx0[] fx0VarArr2 = fx0VarArr;
                        Y1.a(str3, null, new p8c() { // from class: hkb
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r6v2, types: [ikb, m8c] */
                            @Override // p8c
                            public final void a(Object obj2) {
                                Long l = (Long) obj2;
                                u41 u41Var4 = u41.this;
                                if (l == null) {
                                    u41Var4.setLoading(false);
                                    return;
                                }
                                TLRPC.User V1 = na7Var2.V1(l);
                                if (V1 == null) {
                                    u41Var4.setLoading(false);
                                    return;
                                }
                                d S = LaunchActivity.S();
                                if (S == null) {
                                    u41Var4.setLoading(false);
                                    return;
                                }
                                quc b3 = quc.b(i6, l.longValue(), l.longValue(), null, null, 4, 0, 0L, null, false, null, V1, 0, false, false);
                                final ow0 ow0Var = new ow0(context3, wjbVar3);
                                final int i8 = i7;
                                final p8c p8cVar4 = p8cVar3;
                                ?? r6 = new m8c() { // from class: ikb
                                    @Override // m8c
                                    public final void a(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        Double d = (Double) obj4;
                                        boolean booleanValue2 = d != null ? d.doubleValue() >= ((double) i8) : ((Boolean) obj3).booleanValue();
                                        ow0Var.m(false);
                                        p8cVar4.a(Boolean.valueOf(booleanValue2));
                                        d S2 = LaunchActivity.S();
                                        if (!booleanValue2 || S2 == null) {
                                            return;
                                        }
                                        ir2.v(null, 2131754306, u21.b0(S2), R.raw.contact_check, 36);
                                    }
                                };
                                ow0Var.M0 = r6;
                                gw0 gw0Var = ow0Var.E;
                                if (gw0Var != 0) {
                                    gw0Var.setOnVerifiedAge(r6);
                                }
                                ow0Var.B(true);
                                ow0Var.C0 = false;
                                ow0Var.m0 = S.getParentActivity();
                                ow0Var.x(S, b3);
                                ow0Var.show();
                                u41Var4.setLoading(false);
                                fx0VarArr2[0].dismiss();
                            }
                        });
                    }
                });
            }
        });
        j.addView(u41Var, nme.t(-1, 48, 7, 2, 29, 2, 14));
        h.show();
        final fx0[] fx0VarArr = {h};
        h.K();
    }

    public static String w0() {
        int i = bkb.v;
        int i2 = i / 60;
        String format = String.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i - (i2 * 60)));
        int i3 = bkb.t;
        int i4 = i3 / 60;
        return k96.a0("AutoNightUpdateLocationInfo", null, 2131753777, String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3 - (i4 * 60))), format);
    }

    public final void A0(TL_account.contentSettings contentsettings) {
        d0 d0Var;
        o39 o39Var = this.b;
        if (o39Var == null || !o39Var.H || (d0Var = this.a) == null) {
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
            E0(true);
        }
    }

    public final boolean B0(int i, boolean z) {
        if (i == gba.V0) {
            return false;
        }
        gba.V0 = i;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("bubbleRadius", gba.V0);
        edit.commit();
        s49 K = this.b.K(this.textSizeRow);
        if (K != null) {
            View view = K.a;
            if (view instanceof skb) {
                skb skbVar = (skb) view;
                gb2[] cells = skbVar.a.getCells();
                for (int i2 = 0; i2 < cells.length; i2++) {
                    cells[i2].getMessageObject().S1 = false;
                    cells[i2].requestLayout();
                }
                skbVar.invalidate();
            }
        }
        s49 K2 = this.b.K(this.bubbleRadiusRow);
        if (K2 != null) {
            View view2 = K2.a;
            if (view2 instanceof mkb) {
                mkb mkbVar = (mkb) view2;
                if (z) {
                    mkbVar.requestLayout();
                } else {
                    mkbVar.invalidate();
                }
            }
        }
        D0();
        return true;
    }

    public final boolean C0(int i) {
        if (i != gba.T0) {
            gba.T0 = i;
            gba.U0 = false;
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("fons_size", gba.T0);
                edit.commit();
                bkb.P();
                s49 K = this.b.K(this.textSizeRow);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof skb) {
                        gb2[] cells = ((skb) view).a.getCells();
                        for (int i2 = 0; i2 < cells.length; i2++) {
                            cells[i2].getMessageObject().S1 = false;
                            cells[i2].requestLayout();
                        }
                    }
                }
                D0();
                return true;
            }
        }
        return false;
    }

    public final void D0() {
        vjb vjbVar;
        if (this.s == null) {
            return;
        }
        akb B0 = bkb.B0();
        zjb i = B0.i(false);
        ArrayList arrayList = B0.c0;
        if (arrayList == null || arrayList.isEmpty() || i == null || i.a < 100) {
            this.s.u(2);
            this.s.u(3);
        } else {
            this.s.S(2);
            this.s.S(3);
        }
        int i2 = gl.O1() ? 18 : 16;
        akb B02 = bkb.B0();
        if (gba.T0 == i2 && gba.V0 == 17 && B02.T && B02.Z == bkb.n && (i == null || (vjbVar = i.y) == null || "d".equals(vjbVar.c))) {
            this.s.u(4);
        } else {
            this.s.S(4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(boolean z) {
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
        int size = bkb.F.size();
        int i8 = 0;
        while (true) {
            b = this.f;
            if (i8 >= size) {
                break;
            }
            akb akbVar = (akb) bkb.F.get(i8);
            if (b == 0 || b == 3 || ((akbVar.b != null || akbVar.o()) && ((tL_theme = akbVar.G) == null || tL_theme.document != null))) {
                if (akbVar.b != null) {
                    arrayList2.add(akbVar);
                } else {
                    arrayList.add(akbVar);
                }
            }
            i8++;
        }
        Collections.sort(arrayList, new pva((byte) 4));
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
            boolean z2 = bkb.B0().X != 0;
            this.w = z2;
            qkb qkbVar = this.c;
            if (qkbVar != null) {
                qkbVar.setDrawDivider(z2);
            }
            if (this.w) {
                int i11 = this.L0;
                this.L0 = i11 + 1;
                this.r0 = i11;
            }
            int i12 = this.L0;
            this.L0 = i12 + 1;
            this.l0 = i12;
            akb B0 = bkb.B0();
            zjb i13 = B0.i(false);
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
            if (DictationAsr.D()) {
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
            if (gba.p0) {
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
            TL_account.contentSettings contentsettings = getMessagesController().a5;
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
            int i25 = bkb.o;
            if (i25 == 1) {
                this.X = i24;
                int i26 = i22 + 3;
                this.L0 = i26;
                this.Y = i22 + 2;
                if (bkb.p) {
                    this.Z = i26;
                    i24 = i22 + 5;
                    this.L0 = i24;
                    this.a0 = i22 + 4;
                    if (bkb.o != 0) {
                        this.h0 = i24;
                        this.L0 = i24 + 2;
                        this.p0 = i24 + 1;
                        boolean z3 = bkb.J.X != 0;
                        this.w = z3;
                        qkb qkbVar2 = this.c;
                        if (qkbVar2 != null) {
                            qkbVar2.setDrawDivider(z3);
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
                    if (bkb.o != 0) {
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
                if (bkb.o != 0) {
                }
            }
        }
        qkb qkbVar3 = this.c;
        if (qkbVar3 != null) {
            int width = this.b.getWidth();
            int i29 = qkbVar3.o3;
            org.telegram.ui.Cells.e eVar = qkbVar3.k3;
            if (i29 != eVar.b()) {
                eVar.f();
                if (qkbVar3.j3 != (qkbVar3.n3 == 1 ? bkb.J : bkb.B0())) {
                    qkbVar3.A1(width);
                }
            }
        }
        d0 d0Var = this.a;
        if (d0Var != null) {
            if (b == 1 && (i2 = this.N0) != (i3 = bkb.o) && i2 != -1) {
                int i30 = this.W;
                int i31 = i30 + 1;
                if (i2 != i3) {
                    int i32 = 0;
                    while (i32 < 4) {
                        y29 y29Var = (y29) this.b.K(i32);
                        if (y29Var != null) {
                            View view = y29Var.a;
                            if (view instanceof bnb) {
                                ((bnb) view).setTypeChecked(i32 == bkb.o);
                            }
                        }
                        i32++;
                    }
                    int i33 = bkb.o;
                    if (i33 == 0) {
                        this.a.q(i31, i4 - i31);
                    } else if (i33 == 1) {
                        int i34 = this.N0;
                        if (i34 == 0) {
                            this.a.p(i31, this.L0 - i31);
                        } else if (i34 == 2) {
                            this.a.q(i31, 3);
                            this.a.p(i31, bkb.p ? (byte) 4 : (byte) 5);
                        } else if (i34 == 3) {
                            this.a.p(i31, bkb.p ? (byte) 4 : (byte) 5);
                        }
                    } else if (i33 == 2) {
                        int i35 = this.N0;
                        if (i35 == 0) {
                            this.a.p(i31, this.L0 - i31);
                        } else if (i35 == 1) {
                            this.a.q(i31, bkb.p ? (byte) 4 : (byte) 5);
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
                            this.a.q(i31, bkb.p ? (byte) 4 : (byte) 5);
                        }
                    }
                } else {
                    boolean z4 = this.O0;
                    boolean z5 = bkb.p;
                    if (z4 != z5) {
                        int i37 = i30 + 3;
                        d0Var.q(i37, z5 ? 3 : 2);
                        this.a.p(i37, bkb.p ? 2 : 3);
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
                            this.a.r(i6);
                        }
                        int i40 = this.F;
                        if (i7 != -1) {
                            if (i40 != -1) {
                                this.a.i(i40);
                            }
                        } else if (i40 == -1) {
                            this.a.r(i7);
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
                        d0Var.r(i5);
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
            this.O0 = bkb.p;
            this.N0 = bkb.o;
        }
        D0();
    }

    public final void F0(Location location, boolean z) {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        byte b = 0;
        byte b2 = 1;
        if (getParentActivity() != null) {
            if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i = bkb.K5;
                    alertDialog$Builder.l(R.raw.permission_request_location, 72, bkb.w0(null, i, false), null);
                    alertDialog$Builder.m(i, null);
                    alertDialog$Builder.a.U = k96.M0(2131749355, "GpsDisabledAlertText");
                    alertDialog$Builder.j(k96.M0(2131751794, "ConnectingToProxyEnable"), new dkb(this, b2));
                    alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                    showDialog(alertDialog$Builder.a);
                    return;
                }
            } catch (Exception e) {
                fa4.g(e, true);
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
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        if (location == null || z) {
            if (!this.M0) {
                this.M0 = true;
                LocationManager locationManager2 = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.S0);
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.T0);
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
            }
            if (location == null) {
                return;
            }
        }
        bkb.x = location.getLatitude();
        bkb.y = location.getLongitude();
        int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(bkb.x, bkb.y);
        bkb.v = calculateSunriseSunset[0];
        bkb.t = calculateSunriseSunset[1];
        bkb.w = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        bkb.u = calendar.get(5);
        Utilities.e.c(new ekb(this, b));
        y29 y29Var = (y29) this.b.K(this.a0);
        if (y29Var != null) {
            View view = y29Var.a;
            if (view instanceof mhb) {
                ((mhb) view).setText(w0());
            }
        }
        if (bkb.p && bkb.o == 1) {
            bkb.E(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.id));
        hashSet.add(Integer.valueOf(bkb.Cb));
        hashSet.add(Integer.valueOf(bkb.Bb));
        hashSet.add(Integer.valueOf(bkb.Ab));
        hashSet.add(Integer.valueOf(bkb.zb));
        hashSet.add(Integer.valueOf(bkb.Vc));
        hashSet.add(Integer.valueOf(bkb.sa));
        hashSet.add(Integer.valueOf(bkb.sb));
        hashSet.add(Integer.valueOf(bkb.rb));
        hashSet.add(Integer.valueOf(bkb.vb));
        hashSet.add(Integer.valueOf(bkb.ub));
        hashSet.add(Integer.valueOf(bkb.tb));
        hashSet.add(Integer.valueOf(bkb.qb));
        hashSet.add(Integer.valueOf(bkb.Tc));
        hashSet.add(Integer.valueOf(bkb.qa));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.Jj));
        hashSet.add(Integer.valueOf(bkb.Lj));
        hashSet.add(Integer.valueOf(bkb.Ci));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.W0 = !bkb.i1();
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        pha phaVar = this.simpleActionBar;
        byte b2 = this.f;
        if (b2 == 3) {
            phaVar.setTitle(k96.M0(2131752866, "BrowseThemes"));
            wha t = this.simpleActionBar.t();
            oy8 oy8Var = new oy8(R.raw.sun, gl.L(28.0f), gl.L(28.0f), true, null);
            this.U0 = oy8Var;
            if (this.W0) {
                oy8Var.H(oy8Var.e[0] - 1);
            } else {
                oy8Var.H(0);
            }
            oy8 oy8Var2 = this.U0;
            oy8Var2.h = true;
            t.getClass();
            this.s = t.b(5, 0, null, oy8Var2, gl.L(48.0f), null);
        } else if (b2 == 0) {
            phaVar.setTitle(k96.M0(2131752198, "ChatSettings"));
            xha a = this.simpleActionBar.t().a(0, R.drawable.ic_ab_other);
            this.s = a;
            a.setContentDescription(k96.M0(2131754838, "AccDescrMoreOptions"));
            this.s.e(2, R.drawable.msg_share, k96.M0(2131745234, "ShareTheme"));
            this.s.e(3, R.drawable.msg_edit, k96.M0(2131751207, "EditThemeColors"));
            this.s.e(1, R.drawable.msg_palette, k96.M0(2131751697, "CreateNewThemeMenu"));
            this.s.e(4, R.drawable.msg_reset, k96.M0(2131743907, "ThemeResetToDefaults"));
            if (getMessagesController().a5 == null) {
                getMessagesController().P0(new ae9(this, (byte) 20));
            }
        } else {
            phaVar.setTitle(k96.M0(2131753781, null));
        }
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lkb(this));
        this.a = new d0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new t26(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((gb3) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        this.b.setOnItemClickListener(new kq8(this, context, (byte) 24));
        if (b2 == 0) {
            gb3 gb3Var = new gb3();
            gb3Var.n(350L);
            gb3Var.o(s33.h);
            gb3Var.C = false;
            gb3Var.m = false;
            this.b.setItemAnimator(gb3Var);
        }
        if (this.V0) {
            E0(false);
            this.V0 = false;
            this.b.w0(this.a.e.L0 - 1);
            gl.e3(new ekb(this, b), 200L);
        }
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        hd hdVar;
        int i4;
        int i5;
        if (i == kk7.x4) {
            F0(null, true);
            return;
        }
        if (i == kk7.B4 || i == kk7.k4) {
            o39 o39Var = this.b;
            if (o39Var != null) {
                o39Var.h1();
            }
            D0();
            return;
        }
        if (i == kk7.T5) {
            d0 d0Var = this.a;
            if (d0Var == null || (i5 = this.browserRow) == -1) {
                return;
            }
            d0Var.g(i5);
            return;
        }
        if (i == kk7.s4) {
            d0 d0Var2 = this.a;
            if (d0Var2 == null || (i4 = this.r0) == -1) {
                return;
            }
            d0Var2.h(i4, new Object());
            return;
        }
        if (i == kk7.q4) {
            E0(true);
            return;
        }
        if (i == kk7.L2) {
            akb akbVar = (akb) objArr[0];
            zjb zjbVar = (zjb) objArr[1];
            if (akbVar == this.h && zjbVar == this.n) {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(getMessagesController().N2);
                sb.append("/addtheme/");
                sb.append((zjbVar != null ? zjbVar.r : akbVar.G).slug);
                String sb2 = sb.toString();
                showDialog(new taa(getParentActivity(), null, sb2, false, sb2, false, null));
                hd hdVar2 = this.r;
                if (hdVar2 != null) {
                    hdVar2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.M2) {
            akb akbVar2 = (akb) objArr[0];
            zjb zjbVar2 = (zjb) objArr[1];
            if (akbVar2 == this.h && zjbVar2 == this.n && (hdVar = this.r) == null) {
                hdVar.dismiss();
                return;
            }
            return;
        }
        if (i == kk7.u4) {
            if (getParentActivity() == null || this.isPaused) {
                return;
            }
            this.h = (akb) objArr[0];
            this.n = (zjb) objArr[1];
            hd hdVar3 = new hd(3, null, getParentActivity());
            this.r = hdVar3;
            hdVar3.j0 = true;
            showDialog(hdVar3, new ph8(this, (byte) 11));
            return;
        }
        if (i != kk7.v4) {
            if (i == kk7.W4) {
                int i6 = this.q0;
                if (i6 >= 0) {
                    this.a.g(i6);
                    return;
                }
                return;
            }
            if ((i == kk7.U3 || i == kk7.R3) && (i3 = this.sensitiveContentRow) >= 0) {
                this.a.g(i3);
                return;
            }
            return;
        }
        D0();
        if (this.f == 3) {
            boolean i1 = bkb.i1();
            boolean z = !i1;
            if (this.W0 != z) {
                this.W0 = z;
                oy8 oy8Var = this.U0;
                oy8Var.K(!i1 ? oy8Var.e[0] - 1 : 0);
                this.s.getIconView().d();
            }
            if (this.q0 >= 0) {
                for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
                    if (this.b.getChildAt(i7) instanceof hc3) {
                        ((hc3) this.b.getChildAt(i7)).a();
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 16, new Class[]{uib.class, ahb.class, ld5.class, uy0.class, bnb.class, skb.class, mkb.class, pkb.class, vl7.class, org.telegram.ui.Cells.f.class, rkb.class, wgb.class, d08.class, pcb.class, hc3.class, or.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        int i = bkb.p6;
        arrayList.add(new blb(this.b, 0, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.b, 0, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.L6;
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        int i3 = bkb.M6;
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.b, 0, new Class[]{pkb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.f7));
        arrayList.add(new blb(this.b, 0, new Class[]{pkb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.g7));
        arrayList.add(new blb(this.b, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.b, 0, new Class[]{vl7.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Uc));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Kd));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qb));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Md));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sb));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Od));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Tb));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qd));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vb));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.de));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ic));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ee));
        arrayList.add(new blb(this.b, 0, new Class[]{skb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.dc));
        int i4 = bkb.G6;
        arrayList.add(new blb(this.b, 0, new Class[]{or.class}, (Paint) null, (Drawable[]) null, (alb) null, i4));
        int i5 = bkb.H6;
        arrayList.add(new blb(this.b, 0, new Class[]{or.class}, (Paint) null, (Drawable[]) null, (alb) null, i5));
        arrayList.addAll(hue.a(new t00(this, (byte) 21), i4, bkb.F6, i5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        kk7.e().b(this, kk7.x4);
        kk7.e().b(this, kk7.B4);
        kk7.e().b(this, kk7.q4);
        kk7.e().b(this, kk7.s4);
        kk7.e().b(this, kk7.k4);
        kk7.e().b(this, kk7.u4);
        kk7.e().b(this, kk7.v4);
        kk7.e().b(this, kk7.W4);
        getNotificationCenter().b(this, kk7.R3);
        getNotificationCenter().b(this, kk7.U3);
        getNotificationCenter().b(this, kk7.L2);
        getNotificationCenter().b(this, kk7.M2);
        getNotificationCenter().b(this, kk7.T5);
        if (this.f == 0) {
            bkb.k1(this.currentAccount, true);
            bkb.F(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
        locationManager.removeUpdates(this.S0);
        locationManager.removeUpdates(this.T0);
        kk7.e().n(this, kk7.x4);
        kk7.e().n(this, kk7.B4);
        kk7.e().n(this, kk7.q4);
        kk7.e().n(this, kk7.s4);
        kk7.e().n(this, kk7.k4);
        kk7.e().n(this, kk7.u4);
        kk7.e().n(this, kk7.v4);
        kk7.e().n(this, kk7.W4);
        getNotificationCenter().n(this, kk7.R3);
        getNotificationCenter().n(this, kk7.U3);
        getNotificationCenter().n(this, kk7.L2);
        getNotificationCenter().n(this, kk7.M2);
        getNotificationCenter().n(this, kk7.T5);
        bkb.u1();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        if (this.a != null) {
            E0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            gl.W2(getParentActivity(), this.classGuid);
            gl.h3(getParentActivity(), this.classGuid);
        }
    }

    public final void u0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131748066, "NewTheme");
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131751699, "CreateNewThemeAlert");
        alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
        alertDialog$Builder.j(k96.M0(2131751691, "CreateTheme"), new dkb(this, (byte) 2));
        showDialog(hdVar);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        akb B0 = bkb.B0();
        presentFragment(new qmb(B0, false, 1, B0.i(false).a >= 100, this.f == 1));
    }

    public final void x0(a5b a5bVar) {
        Activity parentActivity = getParentActivity();
        G0(this.currentAccount, getResourceProvider(), new nu9(this, a5bVar, (byte) 17), parentActivity);
    }

    public final void y0(Context context, View view, final int i, float f) {
        int i2;
        int i3;
        final byte b = 1;
        if (i == this.O) {
            SharedPreferences c1 = na7.c1();
            boolean z = c1.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = c1.edit();
            boolean z2 = !z;
            edit.putBoolean("view_animations", z2);
            gba.z1 = Boolean.valueOf(z2);
            edit.commit();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(z2);
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
            a18 a18Var = new a18();
            a18Var.I = this;
            presentFragment(a18Var);
            return;
        }
        if (i == this.H) {
            SharedPreferences c12 = na7.c1();
            boolean z3 = c12.getBoolean("send_by_enter", false);
            SharedPreferences.Editor edit2 = c12.edit();
            boolean z4 = !z3;
            edit2.putBoolean("send_by_enter", z4);
            edit2.commit();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(z4);
                return;
            }
            return;
        }
        if (i == this.F) {
            gba.o0 = !gba.o0;
            SharedPreferences.Editor edit3 = na7.c1().edit();
            edit3.putBoolean("raise_to_speak", gba.o0);
            edit3.apply();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.o0);
                return;
            }
            return;
        }
        if (i == this.G) {
            gba.q0 = !gba.q0;
            SharedPreferences.Editor edit4 = na7.c1().edit();
            edit4.putBoolean("next_media_on_tap", gba.q0);
            edit4.apply();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.q0);
                return;
            }
            return;
        }
        if (i == this.raiseToListenRow) {
            gba.p0 = !gba.p0;
            SharedPreferences.Editor edit5 = na7.c1().edit();
            edit5.putBoolean("raise_to_listen", gba.p0);
            edit5.apply();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.p0);
            }
            if (!gba.p0 && this.F != -1) {
                for (int i4 = 0; i4 < this.b.getChildCount(); i4++) {
                    View childAt = this.b.getChildAt(i4);
                    if (childAt instanceof ahb) {
                        this.b.getClass();
                        if (RecyclerView.R(childAt) == this.F) {
                            ((ahb) childAt).setChecked(false);
                        }
                    }
                }
            }
            E0(false);
            return;
        }
        if (i == this.pauseOnRecordRow) {
            gba.B0 = !gba.B0;
            SharedPreferences.Editor edit6 = na7.c1().edit();
            edit6.putBoolean("pauseMusicOnRecord", gba.B0);
            edit6.apply();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.B0);
                return;
            }
            return;
        }
        if (i == this.pauseOnMediaRow) {
            gba.C0 = !gba.C0;
            SharedPreferences.Editor edit7 = na7.c1().edit();
            edit7.putBoolean("pauseMusicOnMedia", gba.C0);
            edit7.apply();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.C0);
                return;
            }
            return;
        }
        byte b3 = 2;
        float f2 = 4.0f;
        if (i == this.L) {
            if (getParentActivity() != null) {
                final AtomicReference atomicReference = new AtomicReference();
                LinearLayout j = de9.j(context, 1);
                CharSequence[] charSequenceArr = {k96.M0(2131751354, "DistanceUnitsAutomatic"), k96.M0(2131751353, "DistanceUnitsKilometers"), k96.M0(2131751352, "DistanceUnitsMiles")};
                final int i5 = 0;
                while (i5 < 3) {
                    wy8 wy8Var = new wy8(getParentActivity(), null);
                    float f3 = f2;
                    wy8Var.setPadding(gl.L(f2), 0, gl.L(f3), 0);
                    wy8Var.a(bkb.w0(null, bkb.f7, false), bkb.w0(null, bkb.D5, false));
                    wy8Var.b(charSequenceArr[i5], i5 == gba.p1);
                    int i6 = bkb.h6;
                    ff0 f0 = bkb.f0(bkb.w0(null, i6, false), 2, -1);
                    vkb M = zkb.M(i6);
                    wy8Var.setBackground(f0);
                    zkb.j(wy8Var, f0, null, M, null);
                    j.addView(wy8Var);
                    wy8Var.setOnClickListener(new View.OnClickListener(this) { // from class: jkb
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
                                    gba.p1 = i7;
                                    SharedPreferences.Editor edit8 = na7.c1().edit();
                                    edit8.putInt("distanceSystemType", gba.p1);
                                    edit8.apply();
                                    k96.g0 = null;
                                    themeActivity.Q0 = true;
                                    s49 K = themeActivity.b.K(themeActivity.L);
                                    if (K != null) {
                                        themeActivity.a.t(K, themeActivity.L);
                                    }
                                    ((Dialog) atomicReference2.get()).dismiss();
                                    break;
                                default:
                                    gba.m0 = i7;
                                    SharedPreferences.Editor edit9 = na7.c1().edit();
                                    edit9.putInt("searchEngineType", gba.m0);
                                    edit9.apply();
                                    themeActivity.R0 = true;
                                    s49 K2 = themeActivity.b.K(themeActivity.M);
                                    if (K2 != null) {
                                        themeActivity.a.t(K2, themeActivity.M);
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
                alertDialog$Builder.a.S = k96.M0(2131751351, "DistanceUnitsTitle");
                alertDialog$Builder.n(j);
                alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                hd hdVar = alertDialog$Builder.a;
                atomicReference.set(hdVar);
                showDialog(hdVar);
                return;
            }
            return;
        }
        if (i == this.M) {
            if (getParentActivity() != null) {
                final AtomicReference atomicReference2 = new AtomicReference();
                LinearLayout j2 = de9.j(context, 1);
                ArrayList b4 = is9.b();
                int size = b4.size();
                CharSequence[] charSequenceArr2 = new CharSequence[size];
                final int i7 = 0;
                while (i7 < size) {
                    charSequenceArr2[i7] = ((is9) b4.get(i7)).a;
                    wy8 wy8Var2 = new wy8(getParentActivity(), null);
                    wy8Var2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                    wy8Var2.a(bkb.w0(null, bkb.f7, false), bkb.w0(null, bkb.D5, false));
                    wy8Var2.b(charSequenceArr2[i7], i7 == gba.m0);
                    int i8 = bkb.h6;
                    ff0 f02 = bkb.f0(bkb.w0(null, i8, false), 2, -1);
                    vkb M2 = zkb.M(i8);
                    wy8Var2.setBackground(f02);
                    zkb.j(wy8Var2, f02, null, M2, null);
                    j2.addView(wy8Var2);
                    wy8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: jkb
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
                                    gba.p1 = i72;
                                    SharedPreferences.Editor edit8 = na7.c1().edit();
                                    edit8.putInt("distanceSystemType", gba.p1);
                                    edit8.apply();
                                    k96.g0 = null;
                                    themeActivity.Q0 = true;
                                    s49 K = themeActivity.b.K(themeActivity.L);
                                    if (K != null) {
                                        themeActivity.a.t(K, themeActivity.L);
                                    }
                                    ((Dialog) atomicReference22.get()).dismiss();
                                    break;
                                default:
                                    gba.m0 = i72;
                                    SharedPreferences.Editor edit9 = na7.c1().edit();
                                    edit9.putInt("searchEngineType", gba.m0);
                                    edit9.apply();
                                    themeActivity.R0 = true;
                                    s49 K2 = themeActivity.b.K(themeActivity.M);
                                    if (K2 != null) {
                                        themeActivity.a.t(K2, themeActivity.M);
                                    }
                                    ((Dialog) atomicReference22.get()).dismiss();
                                    break;
                            }
                        }
                    });
                    i7++;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.S = k96.M0(2131745607, null);
                alertDialog$Builder2.n(j2);
                alertDialog$Builder2.g(k96.M0(2131752577, "Cancel"), null);
                hd hdVar2 = alertDialog$Builder2.a;
                atomicReference2.set(hdVar2);
                showDialog(hdVar2);
                return;
            }
            return;
        }
        if (i == this.N) {
            if (getParentActivity() != null) {
                final AtomicReference atomicReference3 = new AtomicReference();
                LinearLayout j3 = de9.j(context, 1);
                wy8 wy8Var3 = new wy8(getParentActivity(), null);
                wy8Var3.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                int i9 = bkb.f7;
                int w0 = bkb.w0(null, i9, false);
                int i10 = bkb.D5;
                wy8Var3.a(w0, bkb.w0(null, i10, false));
                wy8Var3.b(k96.M0(2131748246, null), !gba.r0);
                int i11 = bkb.h6;
                ff0 f03 = bkb.f0(bkb.w0(null, i11, false), 2, -1);
                vkb M3 = zkb.M(i11);
                wy8Var3.setBackground(f03);
                zkb.j(wy8Var3, f03, null, M3, null);
                j3.addView(wy8Var3);
                wy8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: kkb
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
                                gba.r0 = false;
                                gba.x();
                                themeActivity.P0 = true;
                                ((Dialog) atomicReference4.get()).dismiss();
                                s49 K = themeActivity.b.K(themeActivity.N);
                                if (K != null) {
                                    themeActivity.a.t(K, themeActivity.N);
                                    break;
                                }
                                break;
                            default:
                                rqe.c(R.raw.permission_request_microphone, 2131747117, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new nu9(themeActivity, atomicReference4, (byte) 16));
                                gba.r0 = true;
                                gba.x();
                                themeActivity.P0 = true;
                                ((Dialog) atomicReference4.get()).dismiss();
                                s49 K2 = themeActivity.b.K(themeActivity.N);
                                if (K2 != null) {
                                    themeActivity.a.t(K2, themeActivity.N);
                                    break;
                                }
                                break;
                        }
                    }
                });
                wy8 wy8Var4 = new wy8(getParentActivity(), null);
                wy8Var4.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                wy8Var4.a(bkb.w0(null, i9, false), bkb.w0(null, i10, false));
                String M0 = k96.M0(2131748243, null);
                String M02 = k96.M0(2131748244, null);
                boolean z5 = gba.r0;
                wy8Var4.a.setText(M0);
                TextView textView = wy8Var4.b;
                textView.setVisibility(0);
                textView.setText(M02);
                wy8Var4.c.a(z5, false);
                ff0 f04 = bkb.f0(bkb.w0(null, i11, false), 2, -1);
                vkb M4 = zkb.M(i11);
                wy8Var4.setBackground(f04);
                zkb.j(wy8Var4, f04, null, M4, null);
                j3.addView(wy8Var4);
                wy8Var4.setOnClickListener(new View.OnClickListener(this) { // from class: kkb
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
                                gba.r0 = false;
                                gba.x();
                                themeActivity.P0 = true;
                                ((Dialog) atomicReference4.get()).dismiss();
                                s49 K = themeActivity.b.K(themeActivity.N);
                                if (K != null) {
                                    themeActivity.a.t(K, themeActivity.N);
                                    break;
                                }
                                break;
                            default:
                                rqe.c(R.raw.permission_request_microphone, 2131747117, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new nu9(themeActivity, atomicReference4, (byte) 16));
                                gba.r0 = true;
                                gba.x();
                                themeActivity.P0 = true;
                                ((Dialog) atomicReference4.get()).dismiss();
                                s49 K2 = themeActivity.b.K(themeActivity.N);
                                if (K2 != null) {
                                    themeActivity.a.t(K2, themeActivity.N);
                                    break;
                                }
                                break;
                        }
                    }
                });
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder3.a.S = k96.M0(2131748247, null);
                alertDialog$Builder3.n(j3);
                alertDialog$Builder3.g(k96.M0(2131752577, "Cancel"), null);
                hd hdVar3 = alertDialog$Builder3.a;
                atomicReference3.set(hdVar3);
                showDialog(hdVar3);
                return;
            }
            return;
        }
        if (i == this.E) {
            gba.u0 = !gba.u0;
            SharedPreferences.Editor edit8 = na7.c1().edit();
            edit8.putBoolean("direct_share", gba.u0);
            edit8.apply();
            tga.n(org.telegram.messenger.a.b);
            hq6.d0(y6c.t0).o();
            if (view instanceof ahb) {
                ((ahb) view).setChecked(gba.u0);
                return;
            }
            return;
        }
        if (i == this.sensitiveContentRow) {
            if (getMessagesController().X4()) {
                getMessagesController().J4(false);
                if (view instanceof ahb) {
                    ((ahb) view).setChecked(getMessagesController().X4());
                    return;
                }
                return;
            }
            a5b a5bVar = new a5b((Object) this, (Object) view, (byte) 7);
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.resourceProvider, context);
            alertDialog$Builder4.a.S = k96.M0(2131751801, null);
            alertDialog$Builder4.a.U = k96.M0(2131751802, null);
            alertDialog$Builder4.j(k96.M0(2131751805, null), new kq8(this, a5bVar, (byte) 23));
            alertDialog$Builder4.g(k96.M0(2131752577, null), null);
            showDialog(alertDialog$Builder4.a);
            return;
        }
        if (i != this.Q) {
            if (i == this.R) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder5.a.S = k96.M0(2131745099, "SortBy");
                    alertDialog$Builder5.e(new CharSequence[]{k96.M0(2131751588, "Default"), k96.M0(2131745095, "SortFirstName"), k96.M0(2131745094, "SortLastName")}, new ut3(this, i, b3));
                    alertDialog$Builder5.g(k96.M0(2131752577, "Cancel"), null);
                    showDialog(alertDialog$Builder5.a);
                    return;
                }
                return;
            }
            if (i == this.t0) {
                boolean z6 = gba.a;
                e66.i = !e66.e(256) ? e66.d(true) | 256 : e66.d(true) & (-257);
                e66.k();
                if (view instanceof ahb) {
                    ((ahb) view).setChecked(gba.f());
                    return;
                }
                return;
            }
            if (i == this.nightThemeRow) {
                if ((!k96.a0 || f > gl.L(76.0f)) && (k96.a0 || f < view.getMeasuredWidth() - gl.L(76.0f))) {
                    presentFragment(new ThemeActivity(1));
                    return;
                }
                vl7 vl7Var = (vl7) view;
                if (bkb.o == 0) {
                    bkb.o = 2;
                    vl7Var.setChecked(true);
                } else {
                    bkb.o = 0;
                    vl7Var.setChecked(false);
                }
                bkb.u1();
                bkb.E(true);
                boolean z7 = bkb.o != 0;
                String A0 = z7 ? bkb.A0() : k96.M0(2131753780, "AutoNightThemeOff");
                if (z7) {
                    int i12 = bkb.o;
                    A0 = tb4.y(i12 == 1 ? k96.M0(2131753784, "AutoNightScheduled") : i12 == 3 ? k96.M0(2131753783, "AutoNightSystemDefault") : k96.M0(2131753793, "AutoNightAdaptive"), " ", A0);
                }
                vl7Var.b(k96.M0(2131753781, "AutoNightTheme"), A0, R.drawable.menu_night_mode_24, z7, 0, false, true, false);
                return;
            }
            if (i == this.browserRow) {
                if ((!k96.a0 || f > gl.L(76.0f)) && (k96.a0 || f < view.getMeasuredWidth() - gl.L(76.0f))) {
                    presentFragment(new tsc(null));
                    return;
                }
                vl7 vl7Var2 = (vl7) view;
                na7 messagesController = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.m5;
                if (tL_webBrowserSettings != null) {
                    messagesController.z5(!tL_webBrowserSettings.open_external_browser, tL_webBrowserSettings.display_close_button);
                }
                vl7Var2.setChecked(getMessagesController().L2());
                return;
            }
            if (i == this.S) {
                if (bkb.o != 0) {
                    bkb.o = 0;
                    E0(true);
                    bkb.E(false);
                    return;
                }
                return;
            }
            if (i == this.T) {
                if (bkb.o != 1) {
                    bkb.o = 1;
                    if (bkb.p) {
                        F0(null, true);
                    }
                    E0(true);
                    bkb.E(false);
                    return;
                }
                return;
            }
            if (i == this.U) {
                if (bkb.o != 2) {
                    bkb.o = 2;
                    E0(true);
                    bkb.E(false);
                    return;
                }
                return;
            }
            if (i == this.V) {
                if (bkb.o != 3) {
                    bkb.o = 3;
                    E0(true);
                    bkb.E(false);
                    return;
                }
                return;
            }
            if (i == this.Y) {
                boolean z8 = !bkb.p;
                bkb.p = z8;
                ((ahb) view).setChecked(z8);
                E0(true);
                if (bkb.p) {
                    F0(null, true);
                }
                bkb.E(false);
                return;
            }
            if (i == this.b0 || i == this.c0) {
                if (getParentActivity() == null) {
                    return;
                }
                if (i == this.b0) {
                    i2 = bkb.r;
                    i3 = i2 / 60;
                } else {
                    i2 = bkb.s;
                    i3 = i2 / 60;
                }
                int i13 = i2 - (i3 * 60);
                final uib uibVar = (uib) view;
                showDialog(new TimePickerDialog(getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: ckb
                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                    public final void onTimeSet(TimePicker timePicker, int i14, int i15) {
                        int i16 = (i14 * 60) + i15;
                        int i17 = ThemeActivity.this.b0;
                        int i18 = i;
                        uib uibVar2 = uibVar;
                        if (i18 == i17) {
                            bkb.r = i16;
                            uibVar2.c(k96.M0(2131753789, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)), false, true);
                        } else {
                            bkb.s = i16;
                            uibVar2.c(k96.M0(2131753779, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)), false, true);
                        }
                    }
                }, i3, i13, true));
                return;
            }
            if (i == this.Z) {
                F0(null, true);
                return;
            }
            if (i == this.createNewThemeRow) {
                u0();
                return;
            }
            if (i == this.z0) {
                v0();
                return;
            }
            if (i == this.stickersRow) {
                presentFragment(new StickersActivity(0, null));
            } else if (i == this.B0) {
                presentFragment(new zka());
            } else if (i == this.liteModeRow) {
                presentFragment(new m66());
            }
        }
    }

    public final /* synthetic */ int z0() {
        return this.sensitiveContentRow;
    }
}
