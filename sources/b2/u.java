package b2;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.x3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.x20;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gq0;
import org.telegram.ui.tj0;
import org.telegram.ui.vq0;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u implements s61, androidx.lifecycle.a0, y9.i, s4.c0 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public /* synthetic */ u(int i10) {
        this.a = i10;
    }

    public static u g(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                arrayList.add(bundle2 != null ? new p4.m(bundle2) : null);
            }
        }
        return new u(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // s4.c0
    public void E(int i10, int i11) {
        this.b = true;
        ((s4.g0) this.c).j(i10, i11);
    }

    @Override // s4.c0
    public void Q0(int i10, int i11) {
        this.b = true;
        ((s4.g0) this.c).p(i10, i11);
    }

    @Override // y9.i
    public void a(y9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        t6.p(!this.b);
        ((SparseBooleanArray) this.c).append(i10, true);
    }

    public void c(v vVar) {
        for (int i10 = 0; i10 < vVar.a.size(); i10++) {
            b(vVar.a(i10));
        }
    }

    public v d() {
        t6.p(!this.b);
        this.b = true;
        return new v((SparseBooleanArray) this.c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean f() {
        return this.b;
    }

    public boolean h(int i10, CharSequence charSequence) {
        if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
            throw new IllegalArgumentException();
        }
        p0.e eVar = (p0.e) this.c;
        if (eVar == null) {
            return f();
        }
        eVar.getClass();
        char c10 = 2;
        for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i11));
            u uVar = p0.f.a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c10 = 2;
                            break;
                    }
                }
                c10 = 0;
            }
            c10 = 1;
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 != 1) {
            return f();
        }
        return false;
    }

    public void i(x3 x3Var) {
        if (this.b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((l5.r) this.c).a(new i5.a(null, x3Var, i5.d.a, null), new k2.k0(5));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // androidx.lifecycle.a0
    public void k0(Object obj) {
        this.b = true;
        k6.h hVar = (k6.h) this.c;
        hVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) hVar.b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    @Override // s4.c0
    public void n0(int i10, int i11) {
        this.b = true;
        ((s4.g0) this.c).o(i10, i11);
    }

    @Override // org.telegram.ui.Components.s61
    public void onError(u61 u61Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.F2 != u61Var) {
            return;
        }
        f8.g(exc, true);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.o0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.D, photoViewer.v2);
        String L0 = cd.L0(R.string.AppName, "AppName");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = cd.L0(2131752562, null);
        alertDialog$Builder.k(cd.L0(2131747833, "Open"), new tj0(this, 3));
        alertDialog$Builder.h(cd.L0(2131752589, "Cancel"), null);
        photoViewer.V2(alertDialog$Builder);
    }

    @Override // org.telegram.ui.Components.s61
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            u61 u61Var = photoViewer.F2;
            if (u61Var == null || !u61Var.V) {
                org.telegram.messenger.i0.h3(new vq0(this, 1), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.s61
    public void onStateChanged(boolean z10, int i10) {
        u61 u61Var;
        int i11;
        x20 x20Var;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        ArrayList arrayList = photoViewer.g7;
        u61 u61Var2 = photoViewer.F2;
        if (u61Var2 != null) {
            u61Var2.t0(b5.d.u() || photoViewer.r);
        }
        if (this.b && (u61Var = photoViewer.F2) != null && u61Var.U() != -9223372036854775807L) {
            this.b = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof ef) {
                    ef efVar = (ef) obj;
                    if (efVar.b && (x20Var = efVar.s) != null) {
                        photoViewer.F2.p0((long) (x20Var.d * r3.U()));
                        gq0 gq0Var = photoViewer.S7;
                        if (gq0Var != null) {
                            gq0Var.setProgress(efVar.s.d);
                        }
                    }
                }
            }
        }
        photoViewer.B3(i10, z10);
    }

    @Override // org.telegram.ui.Components.s61
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (jf0.k() != null && jf0.k().b.a != 0 && (textureView = photoViewer.w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            jf0 jf0Var = jf0.p0;
            (jf0Var != null ? jf0Var.l0 : null).setSurfaceTexture(surfaceTexture);
            (jf0Var != null ? jf0Var.l0 : null).setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.w3.setSurfaceTexture(surfaceTexture);
                photoViewer.w3.setSurfaceTextureListener(photoViewer.j4);
                photoViewer.w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.s61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.y0(false);
        org.telegram.messenger.i0.g3(new vq0(this, 0));
    }

    @Override // org.telegram.ui.Components.s61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.y2 != null) {
            float f10 = i10 * f7;
            int i13 = (int) f10;
            photoViewer.U = i13;
            float f11 = i11;
            int i14 = (int) (f7 * f11);
            photoViewer.V = i14;
            jf.f fVar = photoViewer.G2;
            if (fVar != null) {
                fVar.d(i13, i14);
            }
            photoViewer.y2.a(i11 == 0 ? 1.0f : f10 / f11, 0);
            if (photoViewer.B2 instanceof k61) {
                ((k61) photoViewer.B2).setHDRInfo(photoViewer.F2.V(null));
                k61 k61Var = (k61) photoViewer.B2;
                k61Var.d = i13;
                k61Var.e = i11;
                gz gzVar = k61Var.b;
                if (gzVar != null) {
                    gzVar.postRunnable(new cz(gzVar, i13, i11, 0));
                }
                if (photoViewer.c2 == 1) {
                    photoViewer.C2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z10 = true;
                    } else {
                        p4.m mVar = (p4.m) list.get(i10);
                        if (mVar != null && mVar.e()) {
                            i10++;
                        }
                    }
                }
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 6:
            default:
                return super.toString();
            case 7:
                return ((k6.h) this.c).toString();
        }
    }

    @Override // s4.c0
    public void x1(int i10, int i11) {
        ((s4.g0) this.c).n(i10, i11, null);
    }

    public /* synthetic */ u(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
    }

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = true;
    }

    public u() {
        this.a = 0;
        this.c = new SparseBooleanArray();
    }

    public u(ArrayList arrayList, boolean z10) {
        this.a = 5;
        if (arrayList.isEmpty()) {
            this.c = Collections.EMPTY_LIST;
        } else {
            this.c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.s61
    public void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        com.google.android.gms.internal.cast.o oVar = photoViewer.Q8;
        if (oVar != null) {
            oVar.run();
            photoViewer.Q8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.X7) {
            photoViewer.W7 = j10;
            photoViewer.X7 = -1L;
            PhotoViewer.W(photoViewer);
        }
        if (photoViewer.E2 != null) {
            u61 u61Var = photoViewer.F2;
            if (u61Var == null || !u61Var.V) {
                org.telegram.messenger.i0.h3(new vq0(this, 2), 64L);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(p0.e eVar, boolean z10) {
        this(4, eVar, false);
        this.a = 4;
        this.b = z10;
    }

    public u(a6.d dVar, k6.h hVar) {
        this.a = 7;
        this.b = false;
        this.c = hVar;
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }
}
