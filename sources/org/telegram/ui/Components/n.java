package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class n implements b5, lg.g, u61, x71, androidx.activity.result.b, OnCompleteListener, pa.m, l4.d1, na.n, r5.a, rd.b, com.google.android.gms.common.api.internal.s, th.c1, a3.b {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.b;
                g0Var.l0(i10, i11, z10);
                g0Var.dismiss();
                break;
            case 18:
                ((th.p) this.b).H(i10, z10, i11, false, 0L);
                th.p pVar = (th.p) this.b;
                org.telegram.ui.ki0 ki0Var = pVar.K;
                if (ki0Var != null) {
                    ki0Var.i();
                    pVar.K = null;
                    break;
                }
                break;
            default:
                ((th.x1) this.b).s0(i10, i11, z10);
                break;
        }
    }

    @Override // th.c1
    public void T0(th.d1 d1Var, int i10, int i11) {
        th.w2 w2Var;
        org.telegram.ui.Cells.k9 textSelectionHelper;
        th.g5 g5Var = (th.g5) this.b;
        if (g5Var.C || i10 == i11 || (w2Var = g5Var.A) == null || (textSelectionHelper = w2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == g5Var) {
            return;
        }
        g5Var.post(new org.telegram.messenger.o6(this, d1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // th.c1
    public void Z0(CharSequence charSequence) {
        th.w2 w2Var = ((th.g5) this.b).A;
        if (w2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        w2Var.a.t4(charSequence.toString());
    }

    @Override // l4.d1
    public void a(l4.e1 e1Var) {
        q4.l lVar = (q4.l) this.b;
        lVar.C.a(lVar);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 17:
                s6.f fVar = (s6.f) this.b;
                t6.f fVar2 = new t6.f(0, (TaskCompletionSource) obj2);
                t6.d dVar = (t6.d) ((t6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = c7.b.a;
                obtain.writeStrongBinder(fVar2);
                c7.b.b(obtain, fVar);
                c7.b.b(obtain, gVar);
                ((t6.b) dVar).E0(obtain, 6);
                break;
            default:
                u6.b bVar = (u6.b) this.b;
                u6.a aVar = new u6.a((TaskCompletionSource) obj2);
                u6.i iVar = (u6.i) ((u6.c) obj).u();
                String str = bVar.k;
                Parcel I0 = iVar.I0();
                int i11 = u6.f.a;
                I0.writeStrongBinder(aVar);
                I0.writeString(str);
                iVar.J0(I0, 2);
                break;
        }
    }

    public float b(sb.c cVar, sb.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float u10 = u(i10, i11, i12, i13);
        float u11 = u((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(u10) ? u11 / 7.0f : Float.isNaN(u11) ? u10 / 7.0f : (u10 + u11) / 14.0f;
    }

    @Override // lg.g
    public void d(Canvas canvas) {
        switch (this.a) {
            case 1:
                ni niVar = (ni) this.b;
                canvas.drawColor(niVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    niVar.y2.b(canvas, -3);
                    break;
                }
                break;
            default:
                dq0 dq0Var = (dq0) this.b;
                canvas.drawColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    dq0Var.K0.b(canvas, -3);
                    break;
                }
                break;
        }
    }

    @Override // th.c1
    public void e(th.d1 d1Var) {
        th.w2 w2Var = ((th.g5) this.b).A;
        if (w2Var != null) {
            th.p3 p3Var = w2Var.a;
            th.p3.M1(p3Var, d1Var);
            p3Var.d3.U(d1Var, true);
        }
    }

    public boolean f(int i10) {
        q71 q71Var = ((z71) this.b).H;
        if (q71Var == null) {
            return false;
        }
        return q71Var.c(i10);
    }

    public s0.c g(int i10) {
        return null;
    }

    @Override // pc.a
    public Object get() {
        return new v5.c((Context) ((a3.c) this.b).a, new f7.v(8), new bb.a(8), 8);
    }

    public sb.a h(float f9, float f10, int i10, int i11) {
        sb.a b10;
        sb.a b11;
        int i12 = (int) (f10 * f9);
        int max = Math.max(0, i10 - i12);
        nb.b bVar = (nb.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f11 = 3.0f * f9;
        if (min < f11) {
            throw mb.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f11) {
            throw mb.e.a();
        }
        nb.b bVar2 = (nb.b) this.b;
        sb.b bVar3 = new sb.b(bVar2, max, max2, min, min2, f9);
        int i13 = bVar3.e;
        int i14 = bVar3.c;
        int i15 = i13 + i14;
        int i16 = bVar3.f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw mb.e.a();
        }
        return (sb.a) arrayList.get(0);
    }

    public s0.c i(int i10) {
        return null;
    }

    @Override // th.c1
    public /* synthetic */ boolean i1(th.d1 d1Var) {
        return false;
    }

    public void j(float f9) {
        z71 z71Var = (z71) this.b;
        if (f9 == 1.0f) {
            View[] viewArr = z71Var.e;
            View[] viewArr2 = z71Var.e;
            if (viewArr[1] != null) {
                z71Var.F();
                z71Var.h.put(z71Var.f[1], viewArr2[1]);
                z71Var.removeView(viewArr2[1]);
                z71Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            z71Var.z(z71Var.b);
            return;
        }
        View[] viewArr3 = z71Var.e;
        View[] viewArr4 = z71Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (z71Var.y) {
            z71Var.E(view, (1.0f - f9) * viewArr3[0].getMeasuredWidth());
            z71Var.E(viewArr4[0], (-r2.getMeasuredWidth()) * f9);
        } else {
            z71Var.E(view, (1.0f - f9) * (-viewArr3[0].getMeasuredWidth()));
            z71Var.E(viewArr4[0], r2.getMeasuredWidth() * f9);
        }
        z71Var.w(false);
    }

    public void k() {
        q4.l lVar = (q4.l) this.b;
        int i10 = lVar.D - 1;
        lVar.D = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q4.r rVar : lVar.F) {
            rVar.d();
            i11 += rVar.U.a;
        }
        l4.j1[] j1VarArr = new l4.j1[i11];
        int i12 = 0;
        for (q4.r rVar2 : lVar.F) {
            rVar2.d();
            int i13 = rVar2.U.a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.d();
                j1VarArr[i12] = rVar2.U.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.E = new l4.k1(j1VarArr);
        lVar.C.c(lVar);
    }

    @Override // androidx.activity.result.b
    public void l(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = aVar.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.K;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // th.c1
    public boolean m() {
        th.g5 g5Var = (th.g5) this.b;
        th.w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.a == null) {
            return false;
        }
        return w2Var.a.S4();
    }

    public boolean n(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // th.c1
    public void n1(Editable editable) {
        th.g5 g5Var = (th.g5) this.b;
        th.a aVar = g5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = g5Var.r.A;
        }
        g5Var.u();
        th.w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.a == null) {
            return;
        }
        w2Var.a();
    }

    public byte o() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // r5.a
    public void o0(Bitmap bitmap) {
        s5.b bVar = r5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f9 = width;
            int height = bitmap.getHeight();
            int d = (int) a4.w.d(f9, 9.0f, 16.0f, 0.5f);
            float f10 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f9, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((r5.h) this.b).e(bitmap2, 0);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        p5.c.h((p5.c) ((p5.j) this.b).c, "launchApplication", task);
    }

    @Override // org.telegram.ui.Components.u61
    public void onError(x61 x61Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public void onStateChanged(boolean z10, int i10) {
        s50 s50Var;
        VideoEditedInfo videoEditedInfo;
        r50 r50Var = (r50) this.b;
        x61 x61Var = r50Var.D0.K;
        if (x61Var != null && x61Var.z() && i10 == 4 && (videoEditedInfo = (s50Var = r50Var.D0).J) != null) {
            x61 x61Var2 = s50Var.K;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            x61Var2.L(j10);
        }
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public int p() {
        return ((o() & 255) << 24) | ((o() & 255) << 16) | ((o() & 255) << 8) | (o() & 255);
    }

    @Override // pa.m
    public Object p2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new na.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new na.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // lg.g
    public void q(g.x xVar) {
        switch (this.a) {
            case 1:
                xVar.a(((ni) this.b).getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                xVar.a(((dq0) this.b).getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    public int r() {
        return ((o() & Byte.MAX_VALUE) << 21) | ((o() & Byte.MAX_VALUE) << 14) | ((o() & Byte.MAX_VALUE) << 7) | (o() & Byte.MAX_VALUE);
    }

    @Override // th.c1
    public /* synthetic */ boolean r0(th.d1 d1Var) {
        return false;
    }

    public na.i s(Object obj) {
        na.g gVar = ((qa.a0) this.b).b;
        gVar.getClass();
        if (obj == null) {
            return na.k.a;
        }
        Class<?> cls = obj.getClass();
        qa.n nVar = new qa.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    public float t(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i19 = (-abs) / 2;
        int i20 = i14 < i16 ? 1 : -1;
        int i21 = i15 < i17 ? 1 : -1;
        int i22 = i16 + i20;
        int i23 = i14;
        int i24 = i15;
        int i25 = 0;
        while (i23 != i22) {
            boolean z11 = z10;
            int i26 = abs;
            if ((i25 == i18) == ((nb.b) this.b).b(z10 ? i24 : i23, z10 ? i23 : i24)) {
                if (i25 == 2) {
                    return i7.z5.b(i23, i24, i14, i15);
                }
                i25++;
            }
            i19 += abs2;
            if (i19 > 0) {
                if (i24 == i17) {
                    break;
                }
                i24 += i21;
                i19 -= i26;
            }
            i23 += i20;
            abs = i26;
            z10 = z11;
            i18 = 1;
        }
        if (i25 == 2) {
            return i7.z5.b(i22, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override // th.c1
    public /* synthetic */ boolean t1(boolean z10) {
        return false;
    }

    public float u(int i10, int i11, int i12, int i13) {
        float f9;
        float f10;
        nb.b bVar = (nb.b) this.b;
        float t10 = t(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f9 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.a;
            if (i14 >= i16) {
                float f11 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f9 = f11;
                i14 = i17;
            } else {
                f9 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f9));
        if (i18 < 0) {
            f10 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (t(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + t10) - 1.0f;
    }

    public void v(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // th.c1
    public void z(int i10, int i11) {
        th.b2 b2Var;
        th.g5 g5Var = (th.g5) this.b;
        th.w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.a == null || (b2Var = w2Var.a.F3) == null) {
            return;
        }
        b2Var.f(i10, i11);
    }

    public n(j6.a aVar) {
        this.a = 22;
        z5.l.h(aVar);
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.u61
    public void onRenderedFirstFrame() {
    }

    public n(EditText editText) {
        this.a = 10;
        this.b = new oc.i(editText);
    }

    public n(int i10) {
        this.a = i10;
        switch (i10) {
            case 15:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.d(this);
                    break;
                } else {
                    this.b = new vg0(this);
                    break;
                }
        }
    }

    @Override // th.c1
    public /* synthetic */ void S0(th.d1 d1Var) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // th.c1
    public /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.u61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
    }
}
