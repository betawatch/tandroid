// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gi3 implements pt9, gi2, pfa, kt8, r9, th5, r56, p4a, d34, ms4, ni6, zu9, yr9, uab, ca1, yt7, v02, v49, ibc {
    public Object a;

    public gi3(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }

    @Override // d34
    public final l34 A() {
        return ((q88) this.a).I0;
    }

    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x02 x02Var;
        vx7 vx7Var = (vx7) this.a;
        if (vx7Var.getParentActivity() == null || (x02Var = vx7Var.S0) == null) {
            return;
        }
        if (i != 8) {
            if (i != 7) {
                x02Var.J(i);
                vx7Var.H1(i);
                return;
            }
            x02Var.a(true);
        }
        HashMap<Object, Object> selectedPhotos = vx7Var.S0.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = vx7Var.S0.d2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
            jm6 jm6Var = (jm6) selectedPhotos.get(selectedPhotosOrder.get(i4));
            y3a y3aVar = new y3a();
            String str = jm6Var.h;
            if (str != null) {
                y3aVar.c = str;
            } else {
                y3aVar.c = jm6Var.I;
            }
            arrayList.add(y3aVar);
            jm6Var.e();
        }
        vx7Var.I1(arrayList);
    }

    @Override // r56
    public final void C(int i, int i2) {
        ((w39) this.a).j(i, i2);
    }

    @Override // gi2
    public final void D(float f, float f2) {
        ui5 ui5Var;
        ui5Var = ((d) ((vi3) this.a).u0).parentLayout;
        ((ActionBarLayout) ui5Var).p();
    }

    @Override // ca1
    public final void H(String str) {
        String c = d01.c(str);
        if (TextUtils.isEmpty(c)) {
            gl.c3(new am6((byte) 4));
        } else {
            na7.q1(((jj7) this.a).a).Y1().a(c, null, new bm0((byte) 19));
        }
    }

    @Override // gi2
    public final boolean H0(float f, float f2) {
        return ((vi3) this.a).u0.isInPreviewMode();
    }

    @Override // v49
    public final void H1(View view, boolean z) {
        if (z == ((u58) this.a).Y && (view instanceof o48)) {
            o48 o48Var = (o48) view;
            o48Var.y.c(o48Var);
        }
    }

    @Override // v02
    public final void I0() {
        gl.t1(((vx7) this.a).fragmentView.findFocus());
    }

    @Override // v49
    public final boolean K(int i) {
        return ((u58) this.a).M.d(i) == 0;
    }

    @Override // gi2
    public final boolean K0(View view, float f, float f2) {
        return false;
    }

    @Override // yt7
    public final void O(float f) {
        x6b x6bVar = (x6b) this.a;
        k38.e(x6bVar.v1).k(String.valueOf(m01.a.indexOf(x6bVar.E0.getCurrentBrush())), f);
        mcb mcbVar = x6bVar.q1;
        mcbVar.c = f;
        x6bVar.E0(mcbVar, null, false);
    }

    @Override // yr9
    public final vf6 O0() {
        return null;
    }

    @Override // gi2
    public final boolean S() {
        return true;
    }

    @Override // yr9
    public final boolean U1(int i) {
        return true;
    }

    @Override // v02
    public final boolean V1() {
        return false;
    }

    @Override // ca1
    public final boolean W0(String str, u91 u91Var) {
        return false;
    }

    @Override // ca1
    public final String Z0() {
        return null;
    }

    @Override // zu9
    public final int a0() {
        return 0;
    }

    @Override // p4a
    public final void b(q4a q4aVar) {
        ue5 ue5Var = (ue5) this.a;
        ue5Var.H.b(ue5Var);
    }

    public final qy4 c() {
        kx5 kx5Var = (kx5) this.a;
        fre.j("no included points", !Double.isNaN(kx5Var.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(kx5Var.b, kx5Var.d), new LatLng(kx5Var.c, kx5Var.e));
        qy4 qy4Var = new qy4();
        qy4Var.a = latLngBounds;
        return qy4Var;
    }

    public final zr6 d() {
        zr6 zr6Var = (zr6) this.a;
        if (zr6Var.a == null) {
            w26.j("media cannot be null.");
            return null;
        }
        if (!Double.isNaN(zr6Var.d) && zr6Var.d < 0.0d) {
            w26.j("startTime cannot be negative or NaN.");
            return null;
        }
        if (Double.isNaN(zr6Var.e)) {
            w26.j("playbackDuration cannot be NaN.");
            return null;
        }
        if (!Double.isNaN(zr6Var.f) && zr6Var.f >= 0.0d) {
            return zr6Var;
        }
        w26.j("preloadTime cannot be negative or Nan.");
        return null;
    }

    @Override // ni6
    public final Object e(Object obj, Object obj2) {
        return ((aq4) this.a).apply(obj2);
    }

    @Override // uab
    public final /* synthetic */ kab f(int i, int i2, byte[] bArr) {
        return de9.c(this, bArr, i2);
    }

    @Override // r56
    public final void f2(int i, int i2) {
        ((w39) this.a).n(i, i2, null);
    }

    @Override // pt9
    public final void finish() {
        Point point = gl.q;
        if (point.x > point.y) {
            ((cj3) this.a).finishPreviewFragment();
        }
    }

    @Override // v02
    public final boolean g0() {
        return false;
    }

    @Override // yt7
    public final float get() {
        x6b x6bVar = (x6b) this.a;
        m01 currentBrush = x6bVar.E0.getCurrentBrush();
        int i = x6bVar.v1;
        return currentBrush == null ? k38.e(i).i : k38.e(i).f(String.valueOf(m01.a.indexOf(currentBrush)), currentBrush.c());
    }

    @Override // zu9
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        v53 v53Var = (v53) this.a;
        sb.append((Object) v53Var.a.getText());
        sb.append(" ");
        sb.append((Object) v53Var.b.getText());
        return sb.toString();
    }

    @Override // gi2
    public final long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // ms4
    public final void h() {
        bq1 bq1Var = (bq1) this.a;
        View view = bq1Var.a;
        if (view != null) {
            view.setPressed(false);
            bq1Var.a.setSelected(false);
        }
        View view2 = bq1Var.n;
        if (view2 == null || bq1Var.d) {
            return;
        }
        view2.callOnClick();
        bq1Var.d = true;
    }

    @Override // r9
    public final void i(Object obj) {
        Map map = (Map) obj;
        go4 go4Var = (go4) this.a;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        co4 co4Var = (co4) go4Var.F.pollFirst();
        if (co4Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = co4Var.a;
            if (go4Var.c.n(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    @Override // zu9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z, float f) {
        int i;
        float A;
        int i2;
        int i3;
        v53 v53Var = (v53) this.a;
        if (f <= 0.25f) {
            A = b00.A(f, 0.25f, 536576.0f, 512000.0f);
        } else {
            float f2 = f - 0.25f;
            if (f2 < 0.25f) {
                A = b00.A(f2, 0.25f, 9437184.0f, 1048576.0f);
            } else {
                float f3 = f2 - 0.25f;
                if (f3 > 0.25f) {
                    i = (int) ((((f3 - 0.25f) / 0.25f) * 1.9922944E9f) + 1.048576E8f);
                    long j = i;
                    v53Var.b.setText(k96.a0("AutodownloadSizeLimitUpTo", null, 2131753769, gl.i0(j, false, false)));
                    v53Var.d = j;
                    ahb[] ahbVarArr = v53Var.h;
                    AnimatorSet[] animatorSetArr = v53Var.n;
                    i2 = v53Var.e;
                    i3 = v53Var.r.videosRow;
                    if (i2 != i3) {
                        v53Var.f.setText(k96.a0("AutoDownloadPreloadVideoInfo", null, 2131753807, gl.i0(j, false, false)));
                        boolean z2 = i > 2097152;
                        if (z2 != ahbVarArr[0].isEnabled()) {
                            ArrayList arrayList = new ArrayList();
                            ahbVarArr[0].e(arrayList, z2);
                            AnimatorSet animatorSet = animatorSetArr[0];
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                animatorSetArr[0] = null;
                            }
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSetArr[0] = animatorSet2;
                            animatorSet2.playTogether(arrayList);
                            animatorSetArr[0].addListener(new im2(v53Var, (byte) 4));
                            animatorSetArr[0].setDuration(150L);
                            animatorSetArr[0].start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                A = b00.A(f3, 0.25f, 9.437184E7f, 1.048576E7f);
            }
        }
        i = (int) A;
        long j2 = i;
        v53Var.b.setText(k96.a0("AutodownloadSizeLimitUpTo", null, 2131753769, gl.i0(j2, false, false)));
        v53Var.d = j2;
        ahb[] ahbVarArr2 = v53Var.h;
        AnimatorSet[] animatorSetArr2 = v53Var.n;
        i2 = v53Var.e;
        i3 = v53Var.r.videosRow;
        if (i2 != i3) {
        }
    }

    @Override // r56
    public final void j1(int i, int i2) {
        ((w39) this.a).q(i, i2);
    }

    @Override // uab
    public final void l(byte[] bArr, int i, int i2, tab tabVar, us2 us2Var) {
        u33 a;
        xu7 xu7Var = (xu7) this.a;
        xu7Var.L(i2 + i, bArr);
        xu7Var.N(i);
        ArrayList arrayList = new ArrayList();
        while (xu7Var.a() > 0) {
            gre.e("Incomplete Mp4Webvtt Top Level box header found.", xu7Var.a() >= 8);
            int m = xu7Var.m() - 8;
            if (xu7Var.m() == 1987343459) {
                CharSequence charSequence = null;
                t33 t33Var = null;
                while (m > 0) {
                    gre.e("Incomplete vtt cue box header found.", m >= 8);
                    int m2 = xu7Var.m();
                    int m3 = xu7Var.m();
                    int i3 = m2 - 8;
                    byte[] bArr2 = xu7Var.a;
                    int i4 = xu7Var.b;
                    String str = g8c.a;
                    String str2 = new String(bArr2, i4, i3, StandardCharsets.UTF_8);
                    xu7Var.O(i3);
                    m = (m - 8) - i3;
                    if (m3 == 1937011815) {
                        avc avcVar = new avc();
                        bvc.e(str2, avcVar);
                        t33Var = avcVar.a();
                    } else if (m3 == 1885436268) {
                        charSequence = bvc.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (t33Var != null) {
                    t33Var.a = charSequence;
                    t33Var.b = null;
                    a = t33Var.a();
                } else {
                    Pattern pattern = bvc.a;
                    avc avcVar2 = new avc();
                    avcVar2.c = charSequence;
                    a = avcVar2.a().a();
                }
                arrayList.add(a);
            } else {
                xu7Var.O(m);
            }
        }
        us2Var.accept(new x33(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // pt9
    public final void m(float f) {
        Point point = gl.q;
        if (point.x > point.y) {
            ((cj3) this.a).movePreviewFragment(f);
        }
    }

    @Override // yr9
    public final void m2(ArrayList arrayList) {
        kz6 kz6Var = (kz6) this.a;
        String str = kz6Var.a0;
        if (str != null) {
            kz6Var.U(str, kz6Var.d0, kz6Var.e0, kz6Var.c0, kz6Var.b0);
        }
    }

    @Override // v49
    public final boolean n2(int i) {
        u58 u58Var = (u58) this.a;
        xl6 xl6Var = u58Var.K;
        return u58Var.b.containsKey(xl6Var != null ? Integer.valueOf(((jm6) xl6Var.e.get(i)).C) : ((nm6) u58Var.f.get(i)).B);
    }

    @Override // uab
    public final int o() {
        return 2;
    }

    @Override // r56
    public final void o0(int i, int i2) {
        ((w39) this.a).p(i, i2);
    }

    @Override // ms4
    public final boolean onDown(MotionEvent motionEvent) {
        bq1 bq1Var = (bq1) this.a;
        View view = bq1Var.a;
        if (view != null) {
            view.setPressed(true);
            bq1Var.a.setSelected(true);
            bq1Var.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // ms4
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // ms4
    public final void onLongPress(MotionEvent motionEvent) {
        bq1 bq1Var = (bq1) this.a;
        mu1 mu1Var = bq1Var.x;
        if (bq1Var.a != null) {
            mu1Var.g9 = dd0.b(mu1Var, bq1Var.w, mu1Var.l6, mu1Var.d(), mu1Var.Ba);
            m8 m8Var = mu1Var.g9;
            if (m8Var != null) {
                bq1Var.b = m8Var;
                m8Var.setOnDismissListener(new x6(bq1Var, (byte) 3));
                mu1Var.A0.D0();
                mu1Var.C0.R = false;
                ImageView imageView = bq1Var.w;
                mu1Var.Cb(imageView);
                mu1Var.r6(false, imageView != mu1Var.y1, 0.3f);
                mu1Var.z7(false);
                xr1 xr1Var = mu1Var.O3;
                if (xr1Var != null) {
                    xr1Var.d(1, true);
                }
                UndoView undoView = mu1Var.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                ar1 ar1Var = mu1Var.a0;
                if (ar1Var == null || ar1Var.getEditField() == null) {
                    return;
                }
                mu1Var.a0.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // ms4
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // ms4
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        bq1 bq1Var = (bq1) this.a;
        if (bq1Var.e || (view = bq1Var.a) == null) {
            return false;
        }
        view.callOnClick();
        bq1Var.e = true;
        return true;
    }

    @Override // ibc
    public final void onStateChanged(boolean z, int i) {
        zi8 zi8Var = (zi8) this.a;
        yi8 yi8Var = zi8Var.M;
        gl.r(yi8Var);
        lbc lbcVar = zi8Var.E;
        if (lbcVar == null || !lbcVar.c0()) {
            return;
        }
        gl.c3(yi8Var);
    }

    @Override // ibc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ibc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((zi8) this.a).h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0355, code lost:
    
        if (r7.equals("HOME") == false) goto L167;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewGroup p(Activity activity, int i) {
        boolean z;
        String str;
        z38 z38Var;
        fl flVar;
        int i2;
        String str2;
        b48 b48Var = (b48) this.a;
        ArrayList arrayList = b48Var.F1;
        ArrayList arrayList2 = b48Var.G1;
        boolean z2 = i != 0;
        if (z2) {
            z38 z38Var2 = new z38(activity);
            TextView textView = new TextView(activity);
            z38Var2.a = textView;
            int i3 = bkb.F6;
            int i4 = b48.I1;
            wjb wjbVar = b48Var.J0;
            boolean z3 = b48Var.D1;
            zkb.X(textView, i3, wjbVar);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((k96.a0 ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z4 = k96.a0;
            z38Var2.addView(textView, nme.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? z3 ? 17 : 64 : 72.0f, 10.0f, z4 ? 72.0f : z3 ? 17 : 64, 0.0f));
            TextView textView2 = new TextView(activity);
            z38Var2.b = textView2;
            zkb.X(textView2, bkb.y6, b48Var.J0);
            ug8.w(textView2, 1, 13.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity(k96.a0 ? 5 : 3);
            boolean z5 = k96.a0;
            z38Var2.addView(textView2, nme.d(-2, -2.0f, z5 ? 5 : 3, z5 ? z3 ? 17 : 64 : 72.0f, 35.0f, z5 ? 72.0f : z3 ? 17 : 64, 0.0f));
            ImageView imageView = new ImageView(activity);
            z38Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            zkb.s(imageView, bkb.l6, b48Var.J0, PorterDuff.Mode.MULTIPLY);
            boolean z6 = k96.a0;
            z38Var2.addView(imageView, nme.d(-2, -2.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : 20.0f, 20.0f, z6 ? 20.0f : 0.0f, 0.0f));
            z38Var = z38Var2;
            if (!z3) {
                Switch r8 = new Switch(activity, null);
                z38Var2.d = r8;
                int i5 = bkb.L6;
                int i6 = bkb.M6;
                int i7 = bkb.c6;
                r8.d(i5, i6, i7, i7);
                z38Var2.addView(r8, nme.d(37, 40.0f, (k96.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                z38Var = z38Var2;
            }
        } else {
            ?? a48Var = new a48(activity);
            a48Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = b48Var.H1;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((fl) arrayList2.get(0)).c(true);
                z = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z = true;
                    str = null;
                } else {
                    str = k96.d0(b48Var.a, tL_userContact_old2, null, null);
                    z = true;
                }
            }
            pb0 pb0Var = new pb0((wjb) null);
            pb0Var.s(gl.L(30.0f));
            pb0Var.q(tL_userContact_old2);
            be0 be0Var = new be0(activity);
            be0Var.setRoundRadius(gl.L(40.0f));
            be0Var.f(tL_userContact_old2, pb0Var);
            a48Var.addView(be0Var, nme.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(activity);
            ug8.v(textView3, 1, 17.0f);
            zkb.X(textView3, bkb.i5, b48Var.J0);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(qu2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            a48Var.addView(textView3, nme.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            z38Var = a48Var;
            if (str != null) {
                TextView textView4 = new TextView(activity);
                textView4.setTextSize(1, 14.0f);
                zkb.X(textView4, bkb.q5, b48Var.J0);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setText(str);
                a48Var.addView(textView4, nme.t(-2, -2, 49, 10, 3, 10, z ? 27 : 11));
                z38Var = a48Var;
            }
        }
        if (z2) {
            z38 z38Var3 = z38Var;
            int i8 = b48Var.z1;
            char c = 2;
            if (i < i8 || i >= b48Var.A1) {
                flVar = (fl) arrayList.get(i - b48Var.B1);
                int i9 = flVar.c;
                if (i9 == 1) {
                    i2 = R.drawable.msg_mention;
                } else if (i9 == 2) {
                    i2 = R.drawable.msg_location;
                } else if (i9 == 3) {
                    i2 = R.drawable.msg_link;
                } else {
                    if (i9 != 4) {
                        if (i9 == 5) {
                            i2 = R.drawable.msg_calendar2;
                        } else if (i9 == 6) {
                            i2 = "ORG".equalsIgnoreCase(flVar.a(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle;
                        }
                    }
                    i2 = R.drawable.msg_info;
                }
            } else {
                flVar = (fl) arrayList2.get(i - i8);
                i2 = R.drawable.msg_calls;
            }
            boolean z7 = i != b48Var.y1 - 1;
            z38Var3.a.setText(flVar.c(true));
            TextView textView5 = z38Var3.b;
            int i10 = flVar.c;
            if (i10 == 4) {
                str2 = k96.M0(2131751775, null);
            } else if (i10 == 3) {
                str2 = k96.M0(2131751769, null);
            } else if (i10 == 5) {
                str2 = k96.M0(2131751791, null);
            } else if (i10 == 6) {
                str2 = "ORG".equalsIgnoreCase(flVar.a(true)) ? k96.M0(2131751780, null) : k96.M0(2131751779, null);
            } else {
                int indexOf = flVar.b.indexOf(58);
                if (indexOf < 0) {
                    str2 = "";
                } else {
                    String substring = flVar.b.substring(0, indexOf);
                    if (flVar.c != 20) {
                        String[] split = substring.split(";");
                        for (int i11 = 0; i11 < split.length; i11++) {
                            if (split[i11].indexOf(61) < 0) {
                                substring = split[i11];
                            }
                        }
                        if (substring.startsWith("X-")) {
                            substring = substring.substring(2);
                        }
                        switch (substring.hashCode()) {
                            case -2015525726:
                                if (substring.equals("MOBILE")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2064738:
                                if (substring.equals("CELL")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2223327:
                                break;
                            case 2464291:
                                if (substring.equals("PREF")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2670353:
                                if (substring.equals("WORK")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 75532016:
                                if (substring.equals("OTHER")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                substring = k96.M0(2131747098, null);
                                break;
                            case 2:
                                substring = k96.M0(2131747100, null);
                                break;
                            case 3:
                                substring = k96.M0(2131747099, null);
                                break;
                            case 4:
                                substring = k96.M0(2131747088, null);
                                break;
                            case 5:
                                substring = k96.M0(2131747089, null);
                                break;
                        }
                    } else {
                        substring = substring.substring(2).split(";")[0];
                    }
                    str2 = substring.substring(0, 1).toUpperCase() + substring.substring(1).toLowerCase();
                }
            }
            textView5.setText(str2);
            Switch r2 = z38Var3.d;
            if (r2 != null) {
                r2.c(flVar.d, false);
            }
            z38Var3.c.setImageResource(i2);
            z38Var3.e = z7;
            z38Var3.setWillNotDraw(!z7);
        }
        return z38Var;
    }

    public final String q(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            qu5 qu5Var = (qu5) this.a;
            wu5 wu5Var = new wu5(stringWriter, qu5Var.a, qu5Var.b, qu5Var.c, qu5Var.d);
            wu5Var.h(obj);
            wu5Var.j();
            wu5Var.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // yr9
    public final void r(int i) {
        ((kz6) this.a).f();
    }

    public final ClipDescription s() {
        return ((fo5) this.a).getDescription();
    }

    @Override // gi2
    public final boolean s1() {
        return false;
    }

    public final gi3 t(yh5 yh5Var) {
        kx5 kx5Var = (kx5) this.a;
        LatLng latLng = new LatLng(yh5Var.a, yh5Var.b);
        kx5Var.getClass();
        double d = kx5Var.b;
        double d2 = latLng.a;
        kx5Var.b = Math.min(d, d2);
        kx5Var.c = Math.max(kx5Var.c, d2);
        boolean isNaN = Double.isNaN(kx5Var.d);
        double d3 = latLng.b;
        if (isNaN) {
            kx5Var.d = d3;
            kx5Var.e = d3;
            return this;
        }
        double d4 = kx5Var.d;
        double d5 = kx5Var.e;
        if (d4 > d5 ? !(d4 <= d3 || d3 <= d5) : !(d4 <= d3 && d3 <= d5)) {
            if (((d4 - d3) + 360.0d) % 360.0d < ((d3 - d5) + 360.0d) % 360.0d) {
                kx5Var.d = d3;
                return this;
            }
            kx5Var.e = d3;
        }
        return this;
    }

    @Override // yr9
    public final vf6 t1() {
        return null;
    }

    @Override // d34
    public final void u() {
        ((q88) this.a).t0(null, true);
    }

    @Override // v49
    public final void v(boolean z) {
        ui5 ui5Var;
        u58 u58Var = (u58) this.a;
        u58Var.X = z ? (byte) 1 : (byte) 0;
        if (z) {
            ui5Var = ((d) u58Var).parentLayout;
            ui5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        u58Var.L.e1(true);
    }

    @Override // pt9
    public final void w(ue3 ue3Var) {
        ((cj3) this.a).Y4(ue3Var);
    }

    public final void x() {
        ue5 ue5Var = (ue5) this.a;
        int i = ue5Var.I - 1;
        ue5Var.I = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (tf5 tf5Var : ue5Var.K) {
            tf5Var.b();
            i2 += tf5Var.Z.a;
        }
        sxb[] sxbVarArr = new sxb[i2];
        int i3 = 0;
        for (tf5 tf5Var2 : ue5Var.K) {
            tf5Var2.b();
            int i4 = tf5Var2.Z.a;
            int i5 = 0;
            while (i5 < i4) {
                tf5Var2.b();
                sxbVarArr[i3] = tf5Var2.Z.a(i5);
                i5++;
                i3++;
            }
        }
        ue5Var.J = new txb(sxbVarArr);
        ue5Var.H.a(ue5Var);
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override // ibc
    public final void onRenderedFirstFrame() {
    }

    public /* synthetic */ gi3(Object obj) {
        this.a = obj;
    }

    @Override // gi2
    public final void h0() {
    }

    @Override // gi2
    public final void n0() {
    }

    @Override // ca1
    public final void onDismiss() {
    }

    @Override // uab
    public final void reset() {
    }

    @Override // zu9
    public final void y() {
    }

    @Override // v02
    public final void z0() {
    }

    @Override // v02
    public final void P0(Object obj) {
    }

    @Override // ca1
    public final void Q1(vf7 vf7Var) {
    }

    @Override // v02
    public final void g1(TLRPC.User user) {
    }

    @Override // ibc
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    @Override // ibc
    public final void onSeekFinished(tj tjVar) {
    }

    @Override // ibc
    public final void onSeekStarted(tj tjVar) {
    }

    @Override // lt8
    public final Object get() {
        jg4 jg4Var = (jg4) ((mo5) this.a).a;
        jg4Var.getClass();
        d6a d6aVar = d6a.a;
        return d6a.a(jg4Var);
    }

    @Override // gi2
    public final void k(float f, float f2) {
    }

    @Override // ibc
    public final void onError(lbc lbcVar, Exception exc) {
    }

    @Override // gi2
    public final void f1(View view, float f, float f2) {
    }

    @Override // gi2
    public final void g(View view, float f, float f2) {
    }

    @Override // gi2
    public final void n(View view, float f, float f2) {
    }

    @Override // ibc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }

    @Override // v02
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
