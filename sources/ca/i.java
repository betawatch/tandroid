package ca;

import a8.ja;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ff;
import org.telegram.messenger.g0;
import org.telegram.messenger.g20;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.je0;
import org.telegram.ui.jp0;
import org.telegram.ui.ni0;
import org.telegram.ui.uo0;
import v4.d0;
import v4.h0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class i implements l, d0, s51, a0 {
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
        ((h0) this.c).j(i7, i10);
    }

    @Override // v4.d0
    public void K0(int i7, int i10) {
        this.b = true;
        ((h0) this.c).p(i7, i10);
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
        ja.p(!this.b);
        ((SparseBooleanArray) this.c).append(i7, true);
    }

    public void c(s sVar) {
        for (int i7 = 0; i7 < sVar.a.size(); i7++) {
            b(sVar.a(i7));
        }
    }

    public s d() {
        ja.p(!this.b);
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

    @Override // v4.d0
    public void h1(int i7, int i10) {
        ((h0) this.c).n(i7, i10, null);
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

    public void m(x3 x3Var) {
        if (this.b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((o5.s) this.c).a(l5.a.a(x3Var), new n2.a0(7));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // v4.d0
    public void m0(int i7, int i10) {
        this.b = true;
        ((h0) this.c).o(i7, i10);
    }

    @Override // androidx.lifecycle.a0
    public void o(Object obj) {
        this.b = true;
        ob.c cVar = (ob.c) this.c;
        cVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.b;
        signInHubActivity.setResult(signInHubActivity.S, signInHubActivity.T);
        signInHubActivity.finish();
    }

    @Override // org.telegram.ui.Components.s51
    public void onError(u51 u51Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.G2 != u51Var) {
            return;
        }
        a8.g(exc, true);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.p0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.E, photoViewer.w2);
        String M0 = hd.M0(R.string.AppName, "AppName");
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = hd.M0(2131752562, null);
        alertDialog$Builder.k(hd.M0(2131747817, "Open"), new ni0(this, 2));
        alertDialog$Builder.h(hd.M0(2131752589, "Cancel"), null);
        photoViewer.Q2(alertDialog$Builder);
    }

    @Override // org.telegram.ui.Components.s51
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f0.invalidate();
        }
        if (photoViewer.F2 != null) {
            u51 u51Var = photoViewer.G2;
            if (u51Var == null || !u51Var.W) {
                g0.i3(new jp0(this, 1), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.s51
    public void onStateChanged(boolean z10, int i7) {
        u51 u51Var;
        int i10;
        g20 g20Var;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        ArrayList arrayList = photoViewer.g7;
        u51 u51Var2 = photoViewer.G2;
        if (u51Var2 != null) {
            u51Var2.t0(d1.f.u() || photoViewer.r);
        }
        if (this.b && (u51Var = photoViewer.G2) != null && u51Var.U() != -9223372036854775807L) {
            this.b = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.a7.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.Q4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof ff) {
                    ff ffVar = (ff) obj;
                    if (ffVar.b && (g20Var = ffVar.s) != null) {
                        photoViewer.G2.p0((long) (g20Var.d * r3.U()));
                        uo0 uo0Var = photoViewer.S7;
                        if (uo0Var != null) {
                            uo0Var.setProgress(ffVar.s.d);
                        }
                    }
                }
            }
        }
        photoViewer.x3(i7, z10);
    }

    @Override // org.telegram.ui.Components.s51
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        wi.o oVar = photoViewer.Q8;
        if (oVar != null) {
            photoViewer.Q8 = null;
            oVar.a = surfaceTexture;
            if (oVar.getSurfaceTexture() != surfaceTexture) {
                oVar.setSurfaceTexture(surfaceTexture);
            }
            oVar.setVisibility(0);
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

    @Override // org.telegram.ui.Components.s51
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        Drawable[] drawableArr = PhotoViewer.Z8;
        photoViewer.q0(false);
        g0.h3(new jp0(this, 0));
    }

    @Override // org.telegram.ui.Components.s51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.z2 != null) {
            float f11 = i7 * f10;
            int i12 = (int) f11;
            photoViewer.V = i12;
            float f12 = i10;
            photoViewer.W = (int) (f10 * f12);
            wi.n nVar = photoViewer.P8;
            if (nVar != null) {
                nVar.c();
            }
            photoViewer.z2.a(i10 == 0 ? 1.0f : f11 / f12, 0);
            if (photoViewer.C2 instanceof k51) {
                ((k51) photoViewer.C2).setHDRInfo(photoViewer.G2.V(null));
                k51 k51Var = (k51) photoViewer.C2;
                k51Var.d = i12;
                k51Var.e = i10;
                wy wyVar = k51Var.b;
                if (wyVar != null) {
                    wyVar.postRunnable(new sy(wyVar, i12, i10, 0));
                }
                if (photoViewer.d2 == 1) {
                    photoViewer.x2();
                }
            }
            photoViewer.I3 = true;
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
                boolean z10 = false;
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        z10 = true;
                    } else {
                        s4.m mVar = (s4.m) list.get(i7);
                        if (mVar != null && mVar.e()) {
                            i7++;
                        }
                    }
                }
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 10:
            default:
                return super.toString();
            case 11:
                return ((ob.c) this.c).toString();
        }
    }

    public /* synthetic */ i(int i7, Object obj, boolean z10) {
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

    public i(ArrayList arrayList, boolean z10) {
        this.a = 9;
        if (arrayList.isEmpty()) {
            this.c = Collections.EMPTY_LIST;
        } else {
            this.c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.s51
    public void onRenderedFirstFrame(m2.a aVar) {
        long j3 = aVar.e;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (j3 == photoViewer.X7) {
            photoViewer.W7 = j3;
            photoViewer.X7 = -1L;
            PhotoViewer.O(photoViewer);
        }
        if (photoViewer.F2 != null) {
            u51 u51Var = photoViewer.G2;
            if (u51Var == null || !u51Var.W) {
                g0.i3(new jp0(this, 2), 64L);
            }
        }
    }

    public i(je0 je0Var, boolean z10) {
        this.a = 5;
        this.c = je0Var;
        this.b = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(p0.e eVar, boolean z10) {
        this(7, eVar, false);
        this.a = 7;
        this.b = z10;
    }

    public i(d6.d dVar, ob.c cVar) {
        this.a = 11;
        this.b = false;
        this.c = cVar;
    }

    public void k() {
    }

    public void l() {
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }
}
