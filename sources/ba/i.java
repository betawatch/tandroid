package ba;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import android.view.TextureView;
import android.view.View;
import androidx.lifecycle.a0;
import b8.cg;
import b8.zb;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.x3;
import d2.t;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n5.r;
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.py;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ci0;
import org.telegram.ui.cp0;
import org.telegram.ui.ee0;
import org.telegram.ui.no0;
import u4.d0;
import u4.h0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class i implements l, d0, k51, a0 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public /* synthetic */ i(int i3) {
        this.a = i3;
    }

    public static i g(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                arrayList.add(bundle2 != null ? new r4.m(bundle2) : null);
            }
        }
        return new i(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override // u4.d0
    public void E(int i3, int i10) {
        this.b = true;
        ((h0) this.c).j(i3, i10);
    }

    @Override // u4.d0
    public void O0(int i3, int i10) {
        this.b = true;
        ((h0) this.c).p(i3, i10);
    }

    @Override // ba.l
    public void a(k kVar, int i3) {
        StringBuilder sb2 = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i3);
    }

    public void b(int i3) {
        zb.p(!this.b);
        ((SparseBooleanArray) this.c).append(i3, true);
    }

    public void c(t tVar) {
        for (int i3 = 0; i3 < tVar.a.size(); i3++) {
            b(tVar.a(i3));
        }
    }

    public t d() {
        zb.p(!this.b);
        this.b = true;
        return new t((SparseBooleanArray) this.c);
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

    public boolean h(int i3, CharSequence charSequence) {
        if (charSequence == null || i3 < 0 || charSequence.length() - i3 < 0) {
            throw new IllegalArgumentException();
        }
        p0.e eVar = (p0.e) this.c;
        if (eVar == null) {
            return f();
        }
        eVar.getClass();
        char c2 = 2;
        for (int i10 = 0; i10 < i3 && c2 == 2; i10++) {
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
                            c2 = 2;
                            break;
                    }
                }
                c2 = 0;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return f();
        }
        return false;
    }

    public void i() {
        this.b = false;
    }

    public void j(char c2) {
        jc.a aVar = (jc.a) this.c;
        aVar.a(aVar.c, 1);
        char[] cArr = aVar.b;
        int i3 = aVar.c;
        aVar.c = i3 + 1;
        cArr[i3] = c2;
    }

    @Override // u4.d0
    public void j1(int i3, int i10) {
        ((h0) this.c).n(i3, i10, null);
    }

    @Override // u4.d0
    public void l0(int i3, int i10) {
        this.b = true;
        ((h0) this.c).o(i3, i10);
    }

    public void m(x3 x3Var) {
        if (this.b) {
            u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((r) this.c).a(k5.a.a(x3Var), new l2.d(27));
        } catch (Throwable unused) {
            u.h("BillingLogger", "logging failed.");
        }
    }

    @Override // org.telegram.ui.Components.k51
    public void onError(m51 m51Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.G2 != m51Var) {
            return;
        }
        a8.g(exc, true);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.p0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.E, photoViewer.w2);
        String M0 = bd.M0(R.string.AppName, "AppName");
        s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = bd.M0(2131752562, null);
        alertDialog$Builder.k(bd.M0(2131747825, "Open"), new ci0(this, 3));
        alertDialog$Builder.h(bd.M0(2131752589, "Cancel"), null);
        photoViewer.V2(alertDialog$Builder);
    }

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (!photoViewer.I3) {
            photoViewer.I3 = true;
            photoViewer.f0.invalidate();
        }
        if (photoViewer.F2 != null) {
            m51 m51Var = photoViewer.G2;
            if (m51Var == null || !m51Var.W) {
                g0.i3(new cp0(this, 1), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.k51
    public void onStateChanged(boolean z10, int i3) {
        m51 m51Var;
        int i10;
        b20 b20Var;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        ArrayList arrayList = photoViewer.h7;
        m51 m51Var2 = photoViewer.G2;
        if (m51Var2 != null) {
            m51Var2.t0(d1.f.u() || photoViewer.r);
        }
        if (this.b && (m51Var = photoViewer.G2) != null && m51Var.U() != -9223372036854775807L) {
            this.b = false;
            if (photoViewer.Z6.isEmpty() && photoViewer.f7.isEmpty() && photoViewer.b7.isEmpty() && !arrayList.isEmpty() && (i10 = photoViewer.R4) >= 0 && i10 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.R4);
                if (obj instanceof ye) {
                    ye yeVar = (ye) obj;
                    if (yeVar.b && (b20Var = yeVar.s) != null) {
                        photoViewer.G2.p0((long) (b20Var.d * r3.U()));
                        no0 no0Var = photoViewer.T7;
                        if (no0Var != null) {
                            no0Var.setProgress(yeVar.s.d);
                        }
                    }
                }
            }
        }
        photoViewer.B3(i3, z10);
    }

    @Override // org.telegram.ui.Components.k51
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (ie0.k() != null && ie0.k().b.a != 0 && (textureView = photoViewer.x3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            ie0 ie0Var = ie0.q0;
            (ie0Var != null ? ie0Var.m0 : null).setSurfaceTexture(surfaceTexture);
            (ie0Var != null ? ie0Var.m0 : null).setVisibility(0);
            return true;
        }
        if (photoViewer.G3) {
            photoViewer.G3 = false;
            if (photoViewer.K3) {
                photoViewer.H3 = 1;
                photoViewer.x3.setSurfaceTexture(surfaceTexture);
                photoViewer.x3.setSurfaceTextureListener(photoViewer.k4);
                photoViewer.x3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.k51
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        Drawable[] drawableArr = PhotoViewer.V8;
        photoViewer.y0(false);
        g0.h3(new cp0(this, 0));
    }

    @Override // org.telegram.ui.Components.k51
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.z2 != null) {
            float f11 = i3 * f10;
            int i12 = (int) f11;
            photoViewer.V = i12;
            float f12 = i10;
            int i13 = (int) (f10 * f12);
            photoViewer.W = i13;
            uf.d dVar = photoViewer.H2;
            if (dVar != null) {
                dVar.d(i12, i13);
            }
            photoViewer.z2.a(i10 == 0 ? 1.0f : f11 / f12, 0);
            if (photoViewer.C2 instanceof b51) {
                ((b51) photoViewer.C2).setHDRInfo(photoViewer.G2.V(null));
                b51 b51Var = (b51) photoViewer.C2;
                b51Var.d = i12;
                b51Var.e = i10;
                py pyVar = b51Var.b;
                if (pyVar != null) {
                    pyVar.postRunnable(new ly(pyVar, i12, i10, 0));
                }
                if (photoViewer.d2 == 1) {
                    photoViewer.C2();
                }
            }
            photoViewer.J3 = true;
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
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z10 = true;
                    } else {
                        r4.m mVar = (r4.m) list.get(i3);
                        if (mVar != null && mVar.e()) {
                            i3++;
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
                return ((bb.c) this.c).toString();
        }
    }

    @Override // androidx.lifecycle.a0
    public void v(Object obj) {
        this.b = true;
        bb.c cVar = (bb.c) this.c;
        cVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.b;
        signInHubActivity.setResult(signInHubActivity.S, signInHubActivity.T);
        signInHubActivity.finish();
    }

    public /* synthetic */ i(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
    }

    public /* synthetic */ i(Object obj, int i3) {
        this.a = i3;
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

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame(l2.a aVar) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        cg cgVar = photoViewer.R8;
        if (cgVar != null) {
            cgVar.run();
            photoViewer.R8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.Y7) {
            photoViewer.X7 = j10;
            photoViewer.Y7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.F2 != null) {
            m51 m51Var = photoViewer.G2;
            if (m51Var == null || !m51Var.W) {
                g0.i3(new cp0(this, 2), 64L);
            }
        }
    }

    public i(ee0 ee0Var, boolean z10) {
        this.a = 6;
        this.c = ee0Var;
        this.b = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(p0.e eVar, boolean z10) {
        this(8, eVar, false);
        this.a = 8;
        this.b = z10;
    }

    public i(c6.d dVar, bb.c cVar) {
        this.a = 11;
        this.b = false;
        this.c = cVar;
    }

    public void k() {
    }

    public void l() {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekStarted(l2.a aVar) {
    }
}
