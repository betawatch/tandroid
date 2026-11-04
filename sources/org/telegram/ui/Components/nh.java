package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class nh implements z80, ry, org.telegram.ui.gm0, k51, w2.e1, com.google.android.gms.common.api.internal.p, t4.d, com.google.android.gms.common.api.internal.n, u4.d0, u4.i1, p5.b, ug.c, ug.k1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nh(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public s0.d A(int i3) {
        return null;
    }

    public void B() {
        q2.k kVar = (q2.k) this.b;
        int i3 = kVar.I - 1;
        kVar.I = i3;
        if (i3 > 0) {
            return;
        }
        int i10 = 0;
        for (q2.q qVar : kVar.K) {
            qVar.m();
            i10 += qVar.Z.a;
        }
        d2.o1[] o1VarArr = new d2.o1[i10];
        int i11 = 0;
        for (q2.q qVar2 : kVar.K) {
            qVar2.m();
            int i12 = qVar2.Z.a;
            int i13 = 0;
            while (i13 < i12) {
                qVar2.m();
                o1VarArr[i11] = qVar2.Z.a(i13);
                i13++;
                i11++;
            }
        }
        kVar.J = new w2.r1(o1VarArr);
        kVar.H.b(kVar);
    }

    public void C(r4.p pVar, r4.m mVar, Collection collection) {
        r4.e eVar = (r4.e) this.b;
        if (pVar != eVar.y || mVar == null) {
            if (pVar == eVar.e) {
                if (mVar != null) {
                    eVar.n(eVar.d, mVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        r4.v vVar = eVar.x.a;
        String d = mVar.d();
        r4.w wVar = new r4.w(vVar, d, eVar.b(vVar, d), false);
        wVar.i(mVar);
        if (eVar.d == wVar) {
            return;
        }
        eVar.h(eVar, wVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    public boolean D(int i3, int i10, Bundle bundle) {
        return false;
    }

    @Override // u4.d0
    public void E(int i3, int i10) {
        ((u4.h0) this.b).j(i3, i10);
    }

    public byte F() {
        int read = ((rf.a) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int G() {
        return ((F() & 255) << 24) | ((F() & 255) << 16) | ((F() & 255) << 8) | (F() & 255);
    }

    public int H() {
        return ((F() & Byte.MAX_VALUE) << 21) | ((F() & Byte.MAX_VALUE) << 14) | ((F() & Byte.MAX_VALUE) << 7) | (F() & Byte.MAX_VALUE);
    }

    public void I(int i3) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i3);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i3);
    }

    public void J(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((rf.a) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    public void K() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + M());
    }

    public void L(long j10) {
        long M = M();
        if (M != j10) {
            if (M != -1) {
                if (M != -2) {
                    return;
                } else {
                    M = -2;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(M);
            throw new IOException(t10.toString());
        }
    }

    public long M() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // u4.d0
    public void O0(int i3, int i10) {
        ((u4.h0) this.b).p(i3, i10);
    }

    @Override // org.telegram.ui.gm0
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 2:
                f30.a((f30) this.b, false, arrayList);
                break;
            default:
                b8.ke keVar = (b8.ke) this.b;
                try {
                    if (!arrayList.isEmpty()) {
                        org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) arrayList.get(0);
                        if (xyVar.c != null) {
                            keVar.f = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                            Point c12 = org.telegram.messenger.g0.c1();
                            Bitmap K = org.telegram.messenger.zb.K(xyVar.c, null, (float) c12.x, (float) c12.y, true);
                            K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) keVar.f));
                            ((s61) keVar.e).b((File) keVar.f, K, true);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        int i3 = this.a;
        Object obj3 = this.b;
        switch (i3) {
            case 16:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                r6.b bVar = (r6.b) ((r6.a) obj).m();
                Parcel J0 = bVar.J0();
                m7.a.b(J0, (p6.r) obj3);
                try {
                    bVar.b.transact(1, J0, null, 1);
                    J0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    J0.recycle();
                    throw th2;
                }
            default:
                x8.j jVar = (x8.j) obj3;
                g8.b bVar2 = (g8.b) obj;
                Bundle A = bVar2.A();
                A.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                g8.a aVar = new g8.a(0, (TaskCompletionSource) obj2);
                try {
                    g8.i iVar = (g8.i) bVar2.m();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = g8.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    A.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th3) {
                        obtain.recycle();
                        throw th3;
                    }
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.o(Status.h, null);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void c(Object obj) {
        com.google.android.gms.common.api.internal.m mVar;
        androidx.activity.n nVar = ((t7.i) this.b).b;
        synchronized (nVar) {
            nVar.b = false;
            mVar = ((com.google.android.gms.common.api.internal.o) nVar.c).b;
        }
        if (mVar != null) {
            ((t7.c) nVar.d).c(mVar, 2441);
        }
    }

    @Override // u4.i1
    public int d(View view) {
        return u4.o0.x(view) - ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).leftMargin;
    }

    @Override // ug.c
    public void f() {
        ((org.telegram.ui.lp0) this.b).r0(null, true);
    }

    @Override // u4.i1
    public int g() {
        return ((u4.o0) this.b).D();
    }

    @Override // cd.a
    public Object get() {
        return new u5.i(Integer.valueOf(u5.i.d).intValue(), (Context) ((cd.a) this.b).get(), "com.google.android.datatransport.events");
    }

    @Override // org.telegram.ui.Components.ry
    public float getBlurAngle() {
        return ((org.telegram.messenger.ze) this.b).t;
    }

    @Override // org.telegram.ui.Components.ry
    public float getBlurExcludeBlurSize() {
        return ((org.telegram.messenger.ze) this.b).s;
    }

    @Override // org.telegram.ui.Components.ry
    public PointF getBlurExcludePoint() {
        return ((org.telegram.messenger.ze) this.b).r;
    }

    @Override // org.telegram.ui.Components.ry
    public float getBlurExcludeSize() {
        return ((org.telegram.messenger.ze) this.b).q;
    }

    @Override // org.telegram.ui.Components.ry
    public int getBlurType() {
        return ((org.telegram.messenger.ze) this.b).n;
    }

    @Override // org.telegram.ui.Components.ry
    public float getContrastValue() {
        return a1.g.A(((org.telegram.messenger.ze) this.b).d, 100.0f, 0.3f, 1.0f);
    }

    @Override // org.telegram.ui.Components.ry
    public float getEnhanceValue() {
        return ((org.telegram.messenger.ze) this.b).a / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getExposureValue() {
        return ((org.telegram.messenger.ze) this.b).c / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getFadeValue() {
        return ((org.telegram.messenger.ze) this.b).g / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getGrainValue() {
        return (((org.telegram.messenger.ze) this.b).m / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getHighlightsValue() {
        return com.google.android.recaptcha.internal.a.x(((org.telegram.messenger.ze) this.b).j, 0.75f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.ry
    public float getSaturationValue() {
        float f10 = ((org.telegram.messenger.ze) this.b).f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.x(((org.telegram.messenger.ze) this.b).k, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.ry
    public float getSharpenValue() {
        return a1.g.A(((org.telegram.messenger.ze) this.b).o, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.ry
    public float getSoftenSkinValue() {
        return ((org.telegram.messenger.ze) this.b).b / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public int getTintHighlightsColor() {
        return ((org.telegram.messenger.ze) this.b).i;
    }

    @Override // org.telegram.ui.Components.ry
    public float getTintHighlightsIntensityValue() {
        return ((org.telegram.messenger.ze) this.b).i == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.ry
    public int getTintShadowsColor() {
        return ((org.telegram.messenger.ze) this.b).h;
    }

    @Override // org.telegram.ui.Components.ry
    public float getTintShadowsIntensityValue() {
        return ((org.telegram.messenger.ze) this.b).h == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getVignetteValue() {
        return ((org.telegram.messenger.ze) this.b).l / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getWarmthValue() {
        return ((org.telegram.messenger.ze) this.b).e / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public ByteBuffer h() {
        org.telegram.messenger.ze zeVar = (org.telegram.messenger.ze) this.b;
        zeVar.p.q();
        return (ByteBuffer) zeVar.p.f;
    }

    @Override // u4.i1
    public int i() {
        u4.o0 o0Var = (u4.o0) this.b;
        return o0Var.m - o0Var.E();
    }

    @Override // u4.i1
    public View j(int i3) {
        return ((u4.o0) this.b).q(i3);
    }

    @Override // u4.d0
    public void j1(int i3, int i10) {
        ((u4.h0) this.b).n(i3, i10, null);
    }

    @Override // w2.e1
    public void k(w2.f1 f1Var) {
        q2.k kVar = (q2.k) this.b;
        kVar.H.k(kVar);
    }

    @Override // u4.i1
    public int l(View view) {
        return u4.o0.y(view) + ((ViewGroup.MarginLayoutParams) ((u4.p0) view.getLayoutParams())).rightMargin;
    }

    @Override // u4.d0
    public void l0(int i3, int i10) {
        ((u4.h0) this.b).o(i3, i10);
    }

    @Override // org.telegram.ui.gm0
    public void m() {
        switch (this.a) {
            case 2:
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("image/*");
                    ((f30) this.b).a.startActivityForResult(intent, 14);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                try {
                    Intent intent2 = new Intent("android.intent.action.PICK");
                    intent2.setType("image/*");
                    ((Activity) ((b8.ke) this.b).c).startActivityForResult(intent2, 11);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }

    @Override // org.telegram.ui.Components.z80
    public Paint.FontMetricsInt n() {
        return ((bi) this.b).z2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.ry
    public boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onStateChanged(boolean z10, int i3) {
        mi0 mi0Var = (mi0) this.b;
        if (z10 && mi0Var.n.S() >= 0) {
            mi0Var.x = true;
        }
        je0 je0Var = mi0Var.f;
        jb0 jb0Var = mi0Var.y;
        je0Var.a(z10, true);
        org.telegram.messenger.g0.r(jb0Var);
        if (z10) {
            org.telegram.messenger.g0.i3(jb0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ug.c
    public ug.j p() {
        return ((org.telegram.ui.lp0) this.b).C0;
    }

    @Override // t4.d
    public void r() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // ug.k1
    public void s(float f10) {
        ((ug.c2) this.b).setOutlineWidth(f10);
    }

    @Override // org.telegram.ui.Components.z80
    public void t(int i3, int i10, CharSequence charSequence, boolean z10) {
        bi biVar = (bi) this.b;
        if (biVar.a1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(biVar.a1().getText());
            spannableStringBuilder.replace(i3, i10 + i3, charSequence);
            if (z10) {
                org.telegram.messenger.i6.l(spannableStringBuilder, biVar.a1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            biVar.a1().setText(spannableStringBuilder);
            biVar.a1().setSelection(i3 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // t4.d
    public void u(int i3, Object obj) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i3);
    }

    @Override // org.telegram.ui.Components.ry
    public boolean v() {
        return !((org.telegram.messenger.ze) this.b).p.F();
    }

    public void x() {
        tg.s0 s0Var = ((tg.u0) this.b).d;
        if (s0Var != null) {
            tg.r0 r0Var = s0Var.s;
            if (r0Var != null) {
                s0Var.cancelRunnable(r0Var);
                s0Var.s = null;
            }
            tg.r0 r0Var2 = new tg.r0(s0Var, 1);
            s0Var.s = r0Var2;
            s0Var.postRunnable(r0Var2, 1L);
        }
    }

    public s0.d y(int i3) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0360, code lost:
    
        if (r10.equals("HOME") == false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewGroup z(Context context, int i3) {
        boolean z10;
        String str;
        tc0 tc0Var;
        org.telegram.messenger.f0 f0Var;
        int i10;
        String M0;
        String str2;
        vc0 vc0Var = (vc0) this.b;
        ArrayList arrayList = vc0Var.D1;
        ArrayList arrayList2 = vc0Var.E1;
        boolean z11 = i3 != 0;
        if (z11) {
            tc0 tc0Var2 = new tc0(context);
            TextView textView = new TextView(context);
            tc0Var2.a = textView;
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            int i12 = vc0.G1;
            org.telegram.ui.ActionBar.e6 e6Var = vc0Var.J0;
            boolean z12 = vc0Var.B1;
            org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = org.telegram.messenger.bd.a0;
            tc0Var2.addView(textView, b8.mf.d(-1, -1.0f, (z13 ? 5 : 3) | 48, z13 ? z12 ? 17 : 64 : 72.0f, 10.0f, z13 ? 72.0f : z12 ? 17 : 64, 0.0f));
            TextView textView2 = new TextView(context);
            tc0Var2.b = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, vc0Var.J0);
            org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
            boolean z14 = org.telegram.messenger.bd.a0;
            tc0Var2.addView(textView2, b8.mf.d(-2, -2.0f, z14 ? 5 : 3, z14 ? z12 ? 17 : 64 : 72.0f, 35.0f, z14 ? 72.0f : z12 ? 17 : 64, 0.0f));
            ImageView imageView = new ImageView(context);
            tc0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.m6, vc0Var.J0, PorterDuff.Mode.MULTIPLY);
            boolean z15 = org.telegram.messenger.bd.a0;
            tc0Var2.addView(imageView, b8.mf.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            tc0Var = tc0Var2;
            if (!z12) {
                Switch r9 = new Switch(context, null);
                tc0Var2.d = r9;
                int i13 = org.telegram.ui.ActionBar.k6.M6;
                int i14 = org.telegram.ui.ActionBar.k6.N6;
                int i15 = org.telegram.ui.ActionBar.k6.d6;
                r9.d(i13, i14, i15, i15);
                tc0Var2.addView(r9, b8.mf.d(37, 40.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                tc0Var = tc0Var2;
            }
        } else {
            ?? uc0Var = new uc0(context);
            uc0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = vc0Var.F1;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((org.telegram.messenger.f0) arrayList2.get(0)).c(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z10 = true;
                    str = null;
                } else {
                    str = org.telegram.messenger.bd.d0(vc0Var.a, tL_userContact_old2, null, null);
                    z10 = true;
                }
            }
            u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
            u8Var.u(org.telegram.messenger.g0.L(30.0f));
            u8Var.r(tL_userContact_old2);
            k9 k9Var = new k9(context);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
            k9Var.e(tL_userContact_old2, u8Var);
            uc0Var.addView(k9Var, b8.mf.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.camera.q.m(textView3, 1, 17.0f);
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.j5, vc0Var.J0);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(org.telegram.messenger.g5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            uc0Var.addView(textView3, b8.mf.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            tc0Var = uc0Var;
            if (str != null) {
                TextView g7 = org.telegram.messenger.k5.g(context, 1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.r5, vc0Var.J0);
                g7.setSingleLine(true);
                g7.setEllipsize(truncateAt);
                g7.setText(str);
                uc0Var.addView(g7, b8.mf.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                tc0Var = uc0Var;
            }
        }
        if (z11) {
            tc0 tc0Var3 = tc0Var;
            int i16 = vc0Var.x1;
            char c2 = 2;
            if (i3 < i16 || i3 >= vc0Var.y1) {
                f0Var = (org.telegram.messenger.f0) arrayList.get(i3 - vc0Var.z1);
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
                f0Var = (org.telegram.messenger.f0) arrayList2.get(i3 - i16);
                i10 = R.drawable.msg_calls;
            }
            boolean z16 = i3 != vc0Var.w1 - 1;
            ImageView imageView2 = tc0Var3.c;
            tc0Var3.a.setText(f0Var.c(true));
            TextView textView4 = tc0Var3.b;
            int i18 = f0Var.c;
            if (i18 == 4) {
                str2 = org.telegram.messenger.bd.M0(2131751787, null);
            } else if (i18 == 3) {
                str2 = org.telegram.messenger.bd.M0(2131751781, null);
            } else if (i18 == 5) {
                str2 = org.telegram.messenger.bd.M0(2131751803, null);
            } else if (i18 == 6) {
                str2 = "ORG".equalsIgnoreCase(f0Var.a(true)) ? org.telegram.messenger.bd.M0(2131751792, null) : org.telegram.messenger.bd.M0(2131751791, null);
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
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2064738:
                                if (substring2.equals("CELL")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2223327:
                                break;
                            case 2464291:
                                if (substring2.equals("PREF")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2670353:
                                if (substring2.equals("WORK")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 75532016:
                                if (substring2.equals("OTHER")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 1:
                                M0 = org.telegram.messenger.bd.M0(2131747299, null);
                                break;
                            case 2:
                                M0 = org.telegram.messenger.bd.M0(2131747301, null);
                                break;
                            case 3:
                                M0 = org.telegram.messenger.bd.M0(2131747300, null);
                                break;
                            case 4:
                                M0 = org.telegram.messenger.bd.M0(2131747289, null);
                                break;
                            case 5:
                                M0 = org.telegram.messenger.bd.M0(2131747290, null);
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
            textView4.setText(str2);
            Switch r82 = tc0Var3.d;
            if (r82 != null) {
                r82.c(f0Var.d, false);
            }
            imageView2.setImageResource(i10);
            tc0Var3.e = z16;
            tc0Var3.setWillNotDraw(!z16);
        }
        return tc0Var;
    }

    public nh(boolean z10) {
        this.a = 8;
        this.b = new AtomicBoolean(z10);
    }

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame() {
    }

    public nh(int i3) {
        this.a = i3;
        switch (i3) {
            case 10:
                this.b = new ArrayDeque(16);
                break;
            case 17:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.e(this);
                    break;
                } else {
                    this.b = new cf0(this);
                    break;
                }
            default:
                this.b = g9.i0.p();
                break;
        }
    }

    @Override // ug.k1
    public float get() {
        return ((ug.c2) this.b).G;
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekStarted(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.z80
    public /* synthetic */ void w(String str) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onError(m51 m51Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.z80
    public /* synthetic */ void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i3) {
    }

    @Override // org.telegram.ui.Components.z80
    public /* synthetic */ void q(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
    }
}
