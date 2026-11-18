package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ef;
import org.telegram.messenger.ff;
import org.telegram.messenger.gd;
import org.telegram.messenger.jc;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.pm0;
import org.telegram.ui.vp0;
import org.telegram.ui.zs;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class b5 implements xm0, org.telegram.ui.Components.z4, me0, fk0, ez, pm0, jc, jg.y1, fs0, e71, org.telegram.ui.s9, te.b, tg.c, tg.l1, com.google.android.gms.common.api.internal.q {
    public final Object a;

    public /* synthetic */ b5(Object obj) {
        this.a = obj;
    }

    public static v0.i x(b5 b5Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return b5Var.A();
        }
        if (obj instanceof v0.m) {
            Iterator it = ((v0.m) obj).a.iterator();
            while (it.hasNext()) {
                if (((v0.h) it.next()) instanceof v0.o) {
                    return b5Var.A();
                }
            }
        }
        Context ctx = (Context) b5Var.a;
        kotlin.jvm.internal.j.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return b5Var.A();
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            v0.k kVar = new v0.k(ctx);
            v0.k kVar2 = kVar.isAvailableOnDevice() ? kVar : null;
            return kVar2 == null ? b5Var.A() : kVar2;
        }
        if (i7 <= 33) {
            return b5Var.A();
        }
        return null;
    }

    public static b5 y(float f10, int i7) {
        Point point = org.telegram.messenger.g0.q;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new b5(i10, i11, new int[0]);
        }
        if (i7 == 3) {
            return new b5(i10, i11, i11, i10);
        }
        return (i7 == 1) == (i10 < i11) ? new b5(i10, i11, new int[0]) : new b5(i11, i10, new int[0]);
    }

    public v0.i A() {
        String string;
        Context context = (Context) this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), ks.Q1);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List l10 = hd.f.l(arrayList);
        if (l10.isEmpty()) {
            return null;
        }
        Iterator it = l10.iterator();
        v0.i iVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                v0.i iVar2 = (v0.i) newInstance;
                if (!iVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (iVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    iVar = iVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return iVar;
    }

    @Override // tg.c
    public tg.j B() {
        return ((vp0) this.a).C0;
    }

    @Override // te.b
    public void D(float f10, int i7) {
        ((te.h) this.a).f(f10);
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        ((te.h) this.a).f(f10);
    }

    @Override // org.telegram.ui.Components.fs0
    public void I() {
        ((y60) this.a).k();
    }

    @Override // org.telegram.ui.s9
    public void J(String str) {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.a;
        try {
            v0Var.Q = System.currentTimeMillis();
            v0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.s9
    public String J0() {
        return ((org.telegram.ui.web.v0) this.a).j0;
    }

    @Override // org.telegram.ui.Components.fs0
    public org.telegram.ui.ActionBar.z0 K(String str) {
        org.telegram.ui.ActionBar.z0 h = ((y60) this.a).h();
        h.setText(str);
        return h;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) this.a;
        m0Var.u1(i7, i10, z10);
        m0Var.dismiss();
    }

    @Override // org.telegram.ui.Components.me0
    public void T(boolean z10) {
        ((ji.p) this.a).setLanguagePillHidden(z10);
    }

    @Override // org.telegram.messenger.jc
    public void V(ImageReceiver imageReceiver) {
        bg0 bg0Var = ((eg0) this.a).h.H0;
        if (bg0Var != null) {
            bg0Var.d();
        }
    }

    @Override // org.telegram.ui.Components.me0
    public void W(RectF rectF) {
        rectF.set(((ji.p) this.a).R);
    }

    @Override // org.telegram.ui.Components.e71
    public void a(int i7, boolean z10) {
        g71 g71Var = (g71) this.a;
        g71Var.E = z10;
        g71Var.d = i7;
        g71Var.G(1);
        g71Var.v(i7, z10);
        View[] viewArr = g71Var.e;
        View view = viewArr[0];
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        View view2 = viewArr[1];
        if (view2 != null) {
            if (z10) {
                g71Var.B(view2, measuredWidth);
            } else {
                g71Var.B(view2, -measuredWidth);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        j8.c cVar = (j8.c) this.a;
        u7.x xVar = (u7.x) ((u7.k) obj).n();
        u7.f fVar = new u7.f(1, (TaskCompletionSource) obj2);
        Parcel p12 = xVar.p1();
        int i7 = u7.d.a;
        p12.writeInt(1);
        cVar.writeToParcel(p12, 0);
        u7.d.c(p12, fVar);
        p12.writeString(null);
        xVar.t1(p12, 63);
    }

    @Override // org.telegram.ui.Components.e71
    public boolean b() {
        g71 g71Var = (g71) this.a;
        return (g71Var.y || g71Var.I) ? false : true;
    }

    @Override // org.telegram.ui.Components.e71
    public void c() {
        ((g71) this.a).o();
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean c1(String str, org.telegram.ui.j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.pm0
    public void d(ArrayList arrayList) {
        u30.a((u30) this.a, false, arrayList);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.fk0
    public void e(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.a;
        chatAttachAlertPhotoLayout.M = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.F.d1(true);
    }

    @Override // org.telegram.ui.Components.fk0
    public boolean f(int i7) {
        return ((ChatAttachAlertPhotoLayout) this.a).H.d(i7) == 0;
    }

    @Override // org.telegram.ui.Components.e71
    public void g(float f10) {
        g71 g71Var = (g71) this.a;
        View[] viewArr = g71Var.e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                g71Var.C();
                g71Var.h.put(g71Var.f[1], viewArr[1]);
                g71Var.removeView(viewArr[1]);
                g71Var.B(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            g71Var.w(g71Var.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (g71Var.E) {
            g71Var.B(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            g71Var.B(viewArr[0], (-r1.getMeasuredWidth()) * f10);
        } else {
            g71Var.B(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            g71Var.B(viewArr[0], r1.getMeasuredWidth() * f10);
        }
        g71Var.t(false);
    }

    @Override // tg.l1
    public float get() {
        return ((tg.e2) this.a).G;
    }

    @Override // org.telegram.ui.Components.ez
    public float getBlurAngle() {
        return ((ff) this.a).t;
    }

    @Override // org.telegram.ui.Components.ez
    public float getBlurExcludeBlurSize() {
        return ((ff) this.a).s;
    }

    @Override // org.telegram.ui.Components.ez
    public PointF getBlurExcludePoint() {
        return ((ff) this.a).r;
    }

    @Override // org.telegram.ui.Components.ez
    public float getBlurExcludeSize() {
        return ((ff) this.a).q;
    }

    @Override // org.telegram.ui.Components.ez
    public int getBlurType() {
        return ((ff) this.a).n;
    }

    @Override // org.telegram.ui.Components.xm0
    public CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        zs zsVar = (zs) this.a;
        sb2.append((Object) zsVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) zsVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.ez
    public float getContrastValue() {
        return com.google.android.gms.internal.vision.e2.c(((ff) this.a).d, 100.0f, 0.3f, 1.0f);
    }

    @Override // org.telegram.ui.Components.ez
    public float getEnhanceValue() {
        return ((ff) this.a).a / 100.0f;
    }

    @Override // org.telegram.ui.Components.ez
    public float getExposureValue() {
        return ((ff) this.a).c / 100.0f;
    }

    @Override // org.telegram.ui.Components.ez
    public float getFadeValue() {
        return ((ff) this.a).g / 100.0f;
    }

    @Override // org.telegram.ui.Components.ez
    public float getGrainValue() {
        return (((ff) this.a).m / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.ez
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(((ff) this.a).j, 0.75f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.ez
    public float getSaturationValue() {
        float f10 = ((ff) this.a).f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override // org.telegram.ui.Components.ez
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(((ff) this.a).k, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.ez
    public float getSharpenValue() {
        return com.google.android.gms.internal.vision.e2.c(((ff) this.a).o, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.ez
    public float getSoftenSkinValue() {
        return ((ff) this.a).b / 100.0f;
    }

    @Override // org.telegram.ui.Components.ez
    public int getTintHighlightsColor() {
        return ((ff) this.a).i;
    }

    @Override // org.telegram.ui.Components.ez
    public float getTintHighlightsIntensityValue() {
        return ((ff) this.a).i == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.ez
    public int getTintShadowsColor() {
        return ((ff) this.a).h;
    }

    @Override // org.telegram.ui.Components.ez
    public float getTintShadowsIntensityValue() {
        return ((ff) this.a).h == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.ez
    public float getVignetteValue() {
        return ((ff) this.a).l / 100.0f;
    }

    @Override // org.telegram.ui.Components.ez
    public float getWarmthValue() {
        return ((ff) this.a).e / 100.0f;
    }

    @Override // org.telegram.ui.Components.e71
    public boolean h(int i7) {
        y61 y61Var = ((g71) this.a).M;
        if (y61Var == null) {
            return false;
        }
        return y61Var.c(i7);
    }

    @Override // tg.c
    public void i() {
        ((vp0) this.a).r0(null, true);
    }

    @Override // org.telegram.ui.Components.fs0
    public org.telegram.ui.ActionBar.z0 i0(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        y60 y60Var = (y60) this.a;
        int y10 = y60Var.y();
        y60Var.c(i7, str, new di.p6(runnable, z11, y60Var, 25), z10);
        View x10 = y60Var.x(y10);
        if (x10 instanceof org.telegram.ui.ActionBar.z0) {
            return (org.telegram.ui.ActionBar.z0) x10;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ez
    public ByteBuffer j() {
        ff ffVar = (ff) this.a;
        ffVar.p.q();
        return (ByteBuffer) ffVar.p.f;
    }

    @Override // org.telegram.ui.Components.e71
    public void k(ArrayList arrayList) {
        y61 y61Var = ((g71) this.a).M;
        if (y61Var == null) {
            return;
        }
        y61Var.a(arrayList);
    }

    @Override // org.telegram.ui.Components.me0
    public ji.p k0() {
        return (ji.p) this.a;
    }

    @Override // org.telegram.ui.Components.fk0
    public void l(View view, boolean z10) {
        if (z10 == ((ChatAttachAlertPhotoLayout) this.a).L && (view instanceof r5)) {
            r5 r5Var = (r5) view;
            r5Var.y.e(r5Var);
        }
    }

    @Override // org.telegram.ui.Components.fk0
    public boolean m(int i7) {
        ef M = ((ChatAttachAlertPhotoLayout) this.a).H.M(i7);
        return M != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(M.C));
    }

    @Override // org.telegram.ui.Components.xm0
    public void n(boolean z10, float f10) {
        float c10;
        int i7;
        zs zsVar = (zs) this.a;
        if (f10 <= 0.25f) {
            c10 = com.google.android.gms.internal.vision.e2.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c10 = com.google.android.gms.internal.vision.e2.c(f11, 0.25f, 9437184.0f, TLObject.FLAG_20);
            } else {
                float f12 = f11 - 0.25f;
                c10 = f12 <= 0.25f ? com.google.android.gms.internal.vision.e2.c(f12, 0.25f, 9.437184E7f, 10485760) : com.google.android.gms.internal.vision.e2.c(f12 - 0.25f, 0.25f, 2097152000 - 104857600, 104857600);
            }
        }
        int i10 = (int) c10;
        long j3 = i10;
        zsVar.b.setText(gd.a0("AutodownloadSizeLimitUpTo", null, 2131753770, org.telegram.messenger.g0.i0(j3, false, false)));
        zsVar.d = j3;
        r8[] r8VarArr = zsVar.h;
        AnimatorSet[] animatorSetArr = zsVar.n;
        int i11 = zsVar.e;
        i7 = zsVar.r.videosRow;
        if (i11 == i7) {
            zsVar.f.setText(gd.a0("AutoDownloadPreloadVideoInfo", null, 2131753808, org.telegram.messenger.g0.i0(j3, false, false)));
            boolean z11 = i10 > 2097152;
            if (z11 != r8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                r8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new x9(zsVar, 23));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.s9
    public void onDismiss() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.a;
        v0Var.y("scan_qr_popup_closed", null);
        v0Var.i0 = false;
    }

    @Override // org.telegram.ui.pm0
    public void p() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((u30) this.a).a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ez
    public boolean q() {
        return false;
    }

    @Override // jg.y1
    public void r(int i7) {
        vo0 vo0Var = (vo0) this.a;
        yo0 yo0Var = vo0Var.L;
        vo0Var.s = i7;
        if (vo0Var.w != i7) {
            vo0Var.d.clear();
        }
        int i10 = vo0Var.K;
        if (vo0Var.b() != 0 || vo0Var.e.e() || vo0Var.J) {
            yo0Var.t2.b(i10);
        } else {
            yo0Var.M1.e(false, true);
        }
        vo0Var.f();
        int i11 = yo0.U2;
        yo0Var.L0(true);
    }

    @Override // org.telegram.ui.Components.xm0
    public /* synthetic */ int r0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ez
    public boolean s() {
        return !((ff) this.a).p.F();
    }

    public s0.c t(int i7) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0364, code lost:
    
        if (r10.equals("HOME") == false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewGroup u(Context context, int i7) {
        boolean z10;
        String str;
        jd0 jd0Var;
        org.telegram.messenger.f0 f0Var;
        int i10;
        String M0;
        String str2;
        ld0 ld0Var = (ld0) this.a;
        ArrayList arrayList = ld0Var.G1;
        ArrayList arrayList2 = ld0Var.H1;
        boolean z11 = i7 != 0;
        if (z11) {
            jd0 jd0Var2 = new jd0(context);
            TextView textView = new TextView(context);
            jd0Var2.a = textView;
            int i11 = org.telegram.ui.ActionBar.n6.G6;
            int i12 = ld0.J1;
            org.telegram.ui.ActionBar.i6 i6Var = ld0Var.J0;
            boolean z12 = ld0Var.E1;
            org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((gd.a0 ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = gd.a0;
            jd0Var2.addView(textView, c8.ma.d(-1, -1.0f, (z13 ? 5 : 3) | 48, z13 ? z12 ? 17 : 64 : 72.0f, 10.0f, z13 ? 72.0f : z12 ? 17 : 64, 0.0f));
            TextView textView2 = new TextView(context);
            jd0Var2.b = textView2;
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, ld0Var.J0);
            n10.q(textView2, 1, 13.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity(gd.a0 ? 5 : 3);
            boolean z14 = gd.a0;
            jd0Var2.addView(textView2, c8.ma.d(-2, -2.0f, z14 ? 5 : 3, z14 ? z12 ? 17 : 64 : 72.0f, 35.0f, z14 ? 72.0f : z12 ? 17 : 64, 0.0f));
            ImageView imageView = new ImageView(context);
            jd0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.m6, ld0Var.J0, PorterDuff.Mode.MULTIPLY);
            boolean z15 = gd.a0;
            jd0Var2.addView(imageView, c8.ma.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            jd0Var = jd0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                jd0Var2.d = r92;
                int i13 = org.telegram.ui.ActionBar.n6.M6;
                int i14 = org.telegram.ui.ActionBar.n6.N6;
                int i15 = org.telegram.ui.ActionBar.n6.d6;
                r92.d(i13, i14, i15, i15);
                jd0Var2.addView(r92, c8.ma.d(37, 40.0f, (gd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                jd0Var = jd0Var2;
            }
        } else {
            ?? kd0Var = new kd0(context);
            kd0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = ld0Var.I1;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((org.telegram.messenger.f0) arrayList2.get(0)).c(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z10 = true;
                    str = null;
                } else {
                    str = gd.d0(ld0Var.a, tL_userContact_old2, null, null);
                    z10 = true;
                }
            }
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            b9Var.u(org.telegram.messenger.g0.L(30.0f));
            b9Var.r(tL_userContact_old2);
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
            q9Var.f(tL_userContact_old2, b9Var);
            kd0Var.addView(q9Var, c8.ma.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            n10.p(textView3, 1, 17.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.j5, ld0Var.J0);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(org.telegram.messenger.i5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            kd0Var.addView(textView3, c8.ma.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            jd0Var = kd0Var;
            if (str != null) {
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.r5, ld0Var.J0);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setText(str);
                kd0Var.addView(textView4, c8.ma.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                jd0Var = kd0Var;
            }
        }
        if (z11) {
            jd0 jd0Var3 = jd0Var;
            int i16 = ld0Var.A1;
            char c10 = 2;
            if (i7 < i16 || i7 >= ld0Var.B1) {
                f0Var = (org.telegram.messenger.f0) arrayList.get(i7 - ld0Var.C1);
                int i17 = f0Var.c;
                if (i17 == 1) {
                    i10 = R.drawable.msg_mention;
                } else if (i17 == 2) {
                    i10 = R.drawable.msg_location;
                } else if (i17 == 3) {
                    i10 = R.drawable.msg_link;
                } else {
                    if (i17 != 4) {
                        if (i17 == 5) {
                            i10 = R.drawable.msg_calendar2;
                        } else if (i17 == 6) {
                            i10 = "ORG".equalsIgnoreCase(f0Var.a(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle;
                        }
                    }
                    i10 = R.drawable.msg_info;
                }
            } else {
                f0Var = (org.telegram.messenger.f0) arrayList2.get(i7 - i16);
                i10 = R.drawable.msg_calls;
            }
            boolean z16 = i7 != ld0Var.z1 - 1;
            ImageView imageView2 = jd0Var3.c;
            jd0Var3.a.setText(f0Var.c(true));
            TextView textView5 = jd0Var3.b;
            int i18 = f0Var.c;
            if (i18 == 4) {
                str2 = gd.M0(2131751776, null);
            } else if (i18 == 3) {
                str2 = gd.M0(2131751770, null);
            } else if (i18 == 5) {
                str2 = gd.M0(2131751792, null);
            } else if (i18 == 6) {
                str2 = "ORG".equalsIgnoreCase(f0Var.a(true)) ? gd.M0(2131751781, null) : gd.M0(2131751780, null);
            } else {
                int indexOf = f0Var.b.indexOf(58);
                if (indexOf < 0) {
                    str2 = "";
                } else {
                    String substring = f0Var.b.substring(0, indexOf);
                    if (f0Var.c != 20) {
                        String[] split = substring.split(";");
                        for (int i19 = 0; i19 < split.length; i19++) {
                            if (split[i19].indexOf(61) < 0) {
                                substring = split[i19];
                            }
                        }
                        String substring2 = substring.startsWith("X-") ? substring.substring(2) : substring;
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case -2015525726:
                                if (substring2.equals("MOBILE")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2064738:
                                if (substring2.equals("CELL")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2223327:
                                break;
                            case 2464291:
                                if (substring2.equals("PREF")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2670353:
                                if (substring2.equals("WORK")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 75532016:
                                if (substring2.equals("OTHER")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                M0 = gd.M0(2131747098, null);
                                break;
                            case 2:
                                M0 = gd.M0(2131747100, null);
                                break;
                            case 3:
                                M0 = gd.M0(2131747099, null);
                                break;
                            case 4:
                                M0 = gd.M0(2131747088, null);
                                break;
                            case 5:
                                M0 = gd.M0(2131747089, null);
                                break;
                            default:
                                M0 = substring2;
                                break;
                        }
                    } else {
                        M0 = substring.substring(2).split(";")[0];
                    }
                    str2 = M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase();
                }
            }
            textView5.setText(str2);
            Switch r82 = jd0Var3.d;
            if (r82 != null) {
                r82.c(f0Var.d, false);
            }
            imageView2.setImageResource(i10);
            jd0Var3.e = z16;
            jd0Var3.setWillNotDraw(!z16);
        }
        return jd0Var;
    }

    public String v(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            pa.d dVar = (pa.d) this.a;
            pa.e eVar = new pa.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // jg.y1
    public boolean v1(int i7) {
        return i7 == ((vo0) this.a).r;
    }

    public s0.c w(int i7) {
        return null;
    }

    @Override // tg.l1
    public void y1(float f10) {
        ((tg.e2) this.a).setOutlineWidth(f10);
    }

    public boolean z(int i7, int i10, Bundle bundle) {
        return false;
    }

    public b5(int i7) {
        switch (i7) {
            case 17:
                this.a = new SparseArray();
                break;
            case 18:
                if (Build.VERSION.SDK_INT < 26) {
                    this.a = new nf0(this);
                    break;
                } else {
                    this.a = new s0.d(this);
                    break;
                }
            default:
                this.a = new ConcurrentHashMap(16);
                break;
        }
    }

    public b5(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.a = context;
    }

    public b5(int i7, int i10, int... iArr) {
        f50[] f50VarArr = new f50[(iArr.length / 2) + 1];
        this.a = f50VarArr;
        f50 f50Var = new f50(i7, i10);
        int i11 = 0;
        f50VarArr[0] = f50Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((f50[]) this.a)[i12] = new f50(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public b5(EditText editText) {
        this.a = new ji.j(editText);
    }

    @Override // jg.y1
    public /* synthetic */ void P1(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void S0(ur urVar) {
    }

    @Override // org.telegram.ui.Components.xm0
    public void C() {
    }

    @Override // org.telegram.ui.Components.e71
    public void o() {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
