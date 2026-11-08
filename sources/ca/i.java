package ca;

import a8.ia;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.lifecycle.a0;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.x3;
import e2.s;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o5.r;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gf;
import org.telegram.messenger.id;
import org.telegram.messenger.j20;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.t51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.je0;
import org.telegram.ui.li0;
import org.telegram.ui.lp0;
import org.telegram.ui.wo0;
import v4.d0;
import v4.g0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class i implements l, d0, q51, a0 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public /* synthetic */ i(int i7) {
        this.a = i7;
    }

    public static i g(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i7);
                arrayList.add(bundle2 != null ? new s4.m(bundle2) : null);
            }
        }
        return new i(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // v4.d0
    public void E(int i7, int i10) {
        this.b = true;
        ((g0) this.c).j(i7, i10);
    }

    @Override // v4.d0
    public void M0(int i7, int i10) {
        this.b = true;
        ((g0) this.c).p(i7, i10);
    }

    @Override // androidx.lifecycle.a0
    public void X(Object obj) {
        this.b = true;
        aa.n nVar = (aa.n) this.c;
        nVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) nVar.b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    @Override // ca.l
    public void a(k kVar, int i7) {
        StringBuilder sb2 = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i7);
    }

    public void b(int i7) {
        ia.p(!this.b);
        ((SparseBooleanArray) this.c).append(i7, true);
    }

    public void c(s sVar) {
        for (int i7 = 0; i7 < sVar.a.size(); i7++) {
            b(sVar.a(i7));
        }
    }

    public s d() {
        ia.p(!this.b);
        this.b = true;
        return new s((SparseBooleanArray) this.c);
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

    public boolean h(int i7, CharSequence charSequence) {
        if (charSequence == null || i7 < 0 || charSequence.length() - i7 < 0) {
            throw new IllegalArgumentException();
        }
        p0.e eVar = (p0.e) this.c;
        if (eVar == null) {
            return f();
        }
        eVar.getClass();
        char c10 = 2;
        for (int i10 = 0; i10 < i7 && c10 == 2; i10++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i10));
            i iVar = p0.f.a;
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

    public void i() {
        this.b = false;
    }

    public void j(char c10) {
        mc.a aVar = (mc.a) this.c;
        aVar.a(aVar.c, 1);
        char[] cArr = aVar.b;
        int i7 = aVar.c;
        aVar.c = i7 + 1;
        cArr[i7] = c10;
    }

    @Override // v4.d0
    public void k1(int i7, int i10) {
        ((g0) this.c).n(i7, i10, null);
    }

    public void m(x3 x3Var) {
        if (this.b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((r) this.c).a(l5.a.a(x3Var), new ni.a(3));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // v4.d0
    public void o0(int i7, int i10) {
        this.b = true;
        ((g0) this.c).o(i7, i10);
    }

    @Override // org.telegram.ui.Components.q51
    public void onError(t51 t51Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.F2 != t51Var) {
            return;
        }
        a8.g(exc, true);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.o0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.D, photoViewer.v2);
        String M0 = id.M0(R.string.AppName, "AppName");
        u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = id.M0(2131752562, null);
        alertDialog$Builder.k(id.M0(2131747818, "Open"), new li0(this, 2));
        alertDialog$Builder.h(id.M0(2131752589, "Cancel"), null);
        photoViewer.P2(alertDialog$Builder);
    }

    @Override // org.telegram.ui.Components.q51
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (!photoViewer.G3) {
            photoViewer.G3 = true;
            photoViewer.e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            t51 t51Var = photoViewer.F2;
            if (t51Var == null || !t51Var.V) {
                org.telegram.messenger.g0.i3(new lp0(this, 1), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.q51
    public void onStateChanged(boolean z9, int i7) {
        t51 t51Var;
        int i10;
        j20 j20Var;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        ArrayList arrayList = photoViewer.f7;
        t51 t51Var2 = photoViewer.F2;
        if (t51Var2 != null) {
            t51Var2.t0(d1.f.u() || photoViewer.r);
        }
        if (this.b && (t51Var = photoViewer.F2) != null && t51Var.U() != -9223372036854775807L) {
            this.b = false;
            if (photoViewer.X6.isEmpty() && photoViewer.d7.isEmpty() && photoViewer.Z6.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.P4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.P4);
                if (obj instanceof gf) {
                    gf gfVar = (gf) obj;
                    if (gfVar.b && (j20Var = gfVar.s) != null) {
                        photoViewer.F2.p0((long) (j20Var.d * r3.U()));
                        wo0 wo0Var = photoViewer.R7;
                        if (wo0Var != null) {
                            wo0Var.setProgress(gfVar.s.d);
                        }
                    }
                }
            }
        }
        photoViewer.w3(i7, z9);
    }

    @Override // org.telegram.ui.Components.q51
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        ti.p pVar = photoViewer.P8;
        if (pVar != null) {
            photoViewer.P8 = null;
            pVar.a = surfaceTexture;
            if (pVar.getSurfaceTexture() != surfaceTexture) {
                pVar.setSurfaceTexture(surfaceTexture);
            }
            pVar.setVisibility(0);
            return true;
        }
        if (photoViewer.E3) {
            photoViewer.E3 = false;
            if (photoViewer.I3) {
                photoViewer.F3 = 1;
                photoViewer.v3.setSurfaceTexture(surfaceTexture);
                photoViewer.v3.setSurfaceTextureListener(photoViewer.i4);
                photoViewer.v3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.q51
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        Drawable[] drawableArr = PhotoViewer.Y8;
        photoViewer.q0(false);
        org.telegram.messenger.g0.h3(new lp0(this, 0));
    }

    @Override // org.telegram.ui.Components.q51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.y2 != null) {
            float f11 = i7 * f10;
            int i12 = (int) f11;
            photoViewer.U = i12;
            float f12 = i10;
            photoViewer.V = (int) (f10 * f12);
            ti.o oVar = photoViewer.O8;
            if (oVar != null) {
                oVar.c();
            }
            photoViewer.y2.a(i10 == 0 ? 1.0f : f11 / f12, 0);
            if (photoViewer.B2 instanceof h51) {
                ((h51) photoViewer.B2).setHDRInfo(photoViewer.F2.V(null));
                h51 h51Var = (h51) photoViewer.B2;
                h51Var.d = i12;
                h51Var.e = i10;
                sy syVar = h51Var.b;
                if (syVar != null) {
                    syVar.postRunnable(new oy(syVar, i12, i10, 0));
                }
                if (photoViewer.c2 == 1) {
                    photoViewer.w2();
                }
            }
            photoViewer.H3 = true;
        }
    }

    public String toString() {
        switch (this.a) {
            case 9:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z9 = false;
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        z9 = true;
                    } else {
                        s4.m mVar = (s4.m) list.get(i7);
                        if (mVar != null && mVar.e()) {
                            i7++;
                        }
                    }
                }
                sb2.append(z9);
                sb2.append(" }");
                return sb2.toString();
            case 10:
            default:
                return super.toString();
            case 11:
                return ((aa.n) this.c).toString();
        }
    }

    public /* synthetic */ i(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
    }

    public /* synthetic */ i(Object obj, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = true;
    }

    public i() {
        this.a = 1;
        this.c = new SparseBooleanArray();
    }

    public i(ArrayList arrayList, boolean z9) {
        this.a = 9;
        if (arrayList.isEmpty()) {
            this.c = Collections.EMPTY_LIST;
        } else {
            this.c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z9;
    }

    @Override // org.telegram.ui.Components.q51
    public void onRenderedFirstFrame(m2.a aVar) {
        long j3 = aVar.e;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (j3 == photoViewer.W7) {
            photoViewer.V7 = j3;
            photoViewer.W7 = -1L;
            PhotoViewer.N(photoViewer);
        }
        if (photoViewer.E2 != null) {
            t51 t51Var = photoViewer.F2;
            if (t51Var == null || !t51Var.V) {
                org.telegram.messenger.g0.i3(new lp0(this, 2), 64L);
            }
        }
    }

    public i(je0 je0Var, boolean z9) {
        this.a = 5;
        this.c = je0Var;
        this.b = z9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(p0.e eVar, boolean z9) {
        this(7, eVar, false);
        this.a = 7;
        this.b = z9;
    }

    public i(d6.d dVar, aa.n nVar) {
        this.a = 11;
        this.b = false;
        this.c = nVar;
    }

    public void k() {
    }

    public void l() {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }
}
