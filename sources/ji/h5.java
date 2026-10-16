package ji;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Parcel;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.z71;
import org.telegram.ui.o9;
import org.telegram.ui.y9;
import v7.i8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class h5 implements g1, y2.m, OnCompleteListener, m.m, org.telegram.ui.Components.f5, bh.h, f81, z71, r0.n, y9, r4.c, com.google.android.gms.common.api.internal.o, rg.x1, s4.h1, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h5(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // ji.g1
    public void C(Editable editable) {
        ((l5) this.b).h();
    }

    @Override // s4.h1
    public int D() {
        return ((s4.n0) this.b).G();
    }

    @Override // ji.g1
    public /* synthetic */ boolean E(boolean z10) {
        return false;
    }

    @Override // rg.x1
    public void G0(float f7) {
        ((rg.p2) this.b).setOutlineWidth(f7);
    }

    @Override // org.telegram.ui.y9
    public String I0() {
        return ((org.telegram.ui.web.c1) this.b).i0;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
        e0Var.m0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override // s4.h1
    public View J0(int i10) {
        return ((s4.n0) this.b).q(i10);
    }

    @Override // org.telegram.ui.y9
    public void K(String str) {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
        try {
            c1Var.P = System.currentTimeMillis();
            c1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // s4.h1
    public int M0(View view) {
        return s4.n0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).bottomMargin;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        cn0 cn0Var = (cn0) this.b;
        cn0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        cn0Var.s.requestLayout();
        return r0.l1.b;
    }

    @Override // s4.h1
    public int U() {
        s4.n0 n0Var = (s4.n0) this.b;
        return n0Var.n - n0Var.C();
    }

    @Override // ji.g1
    public void a(h1 h1Var) {
        j5 j5Var = ((l5) this.b).s;
        if (j5Var != null) {
            x3 x3Var = ((c3) j5Var).a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.V(h1Var, true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        s6.a aVar = (s6.a) this.b;
        Parcel H0 = eVar.H0();
        k7.a.d(H0, fVar);
        k7.a.c(H0, aVar);
        H0.writeStrongBinder(null);
        eVar.I0(H0, 2);
    }

    @Override // y2.m
    public void b() {
        l2.g gVar = (l2.g) this.b;
        gVar.A.b();
        IOException iOException = gVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }

    public byte c() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // ji.g1
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override // ji.g1
    public /* synthetic */ boolean e(h1 h1Var) {
        return false;
    }

    public int g() {
        return ((c() & 255) << 24) | ((c() & 255) << 16) | ((c() & 255) << 8) | (c() & 255);
    }

    @Override // rg.x1
    public float get() {
        return ((rg.p2) this.b).F;
    }

    @Override // r4.c
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public int i() {
        return ((c() & Byte.MAX_VALUE) << 21) | ((c() & Byte.MAX_VALUE) << 14) | ((c() & Byte.MAX_VALUE) << 7) | (c() & Byte.MAX_VALUE);
    }

    @Override // org.telegram.ui.Components.z71
    public void invalidate() {
        ((fh0) this.b).h.invalidate();
    }

    public void j(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override // bh.h
    public void k(Canvas canvas) {
        vi viVar = (vi) this.b;
        canvas.drawColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            viVar.F2.b(canvas, -3);
        }
    }

    @Override // s4.h1
    public int l(View view) {
        return s4.n0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).topMargin;
    }

    @Override // ji.g1
    public /* synthetic */ boolean m(h1 h1Var) {
        return false;
    }

    @Override // bh.h
    public void m0(bh.a aVar) {
        aVar.a(((vi) this.b).getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    public void n(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        be.m mVar = (be.m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(i8.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // org.telegram.ui.y9
    public void onDismiss() {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
        c1Var.y("scan_qr_popup_closed", null);
        c1Var.h0 = false;
    }

    @Override // org.telegram.ui.Components.f81
    public void onError(i81 i81Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public void onStateChanged(boolean z10, int i10) {
        p60 p60Var;
        VideoEditedInfo videoEditedInfo;
        i60 i60Var = (i60) this.b;
        i81 i81Var = i60Var.H0.T;
        if (i81Var != null && i81Var.y() && i10 == 4 && (videoEditedInfo = (p60Var = i60Var.H0).S) != null) {
            i81 i81Var2 = p60Var.T;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            i81Var2.K(j10);
        }
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // r4.c
    public void p(int i10, Object obj) {
        String str;
        switch (i10) {
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
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i10);
    }

    @Override // ji.g1
    public void q(h1 h1Var, int i10, int i11) {
        j5 j5Var;
        org.telegram.ui.Cells.o9 textSelectionHelper;
        l5 l5Var = (l5) this.b;
        if (l5Var.w || i10 == i11 || (j5Var = l5Var.s) == null || (textSelectionHelper = ((c3) j5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        h1Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 3));
    }

    public String toString() {
        switch (this.a) {
            case 18:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void v(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.o oVar = ((r7.i) this.b).b;
        synchronized (oVar) {
            oVar.a = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.b).c;
        }
        if (nVar != null) {
            ((r7.c) oVar.c).c(nVar, 2441);
        }
    }

    @Override // ji.g1
    public void z(h1 h1Var) {
        a aVar;
        l5 l5Var = (l5) this.b;
        j5 j5Var = l5Var.s;
        if (j5Var == null || (aVar = l5Var.a) == null) {
            return;
        }
        x3 x3Var = ((c3) j5Var).a;
        ArrayList arrayList = x3Var.j3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        h2 h2Var = x3Var.H3;
        if (h2Var != null) {
            h2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a1.g.y(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        x3Var.t4();
        x3Var.W2.N(false);
        h2 h2Var2 = x3Var.H3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        x3Var.post(new o2(x3Var, aVar2, 26));
    }

    public /* synthetic */ h5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.f81
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ h5(s6.g gVar, s6.a aVar) {
        this.a = 27;
        this.b = aVar;
    }

    public h5(int i10) {
        this.a = i10;
        switch (i10) {
            case 10:
                this.b = new SparseArray();
                break;
            default:
                this.b = e9.n0.t();
                break;
        }
    }

    public h5(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 20;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public h5(ArrayList arrayList) {
        this.a = 24;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public h5(EditText editText) {
        this.a = 19;
        this.b = new m2.t(editText);
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ void V0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ji.g1
    public /* synthetic */ void y(CharSequence charSequence) {
    }

    @Override // ji.g1
    public /* synthetic */ void r() {
    }

    @Override // ji.g1
    public /* synthetic */ void f(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.f81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
