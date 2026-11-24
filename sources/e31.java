// default package

import android.graphics.SurfaceTexture;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import android.view.View;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class e31 implements r56, co7, ok6, ibc, bx8 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;

    public e31(boolean z, boolean z2, boolean z3) {
        this.a = (byte) 8;
        this.b = z || z2 || z3;
    }

    @Override // r56
    public final void C(int i, int i2) {
        this.b = true;
        ((w39) this.c).j(i, i2);
    }

    @Override // co7
    public final void D2(Object obj) {
        this.b = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) ((v39) this.c).b;
        signInHubActivity.setResult(signInHubActivity.S, signInHubActivity.T);
        signInHubActivity.finish();
    }

    @Override // ok6
    public final boolean H(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // ok6
    public final int K() {
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.c;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.b ? 1 : 0).getCodecInfos();
            this.c = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr.length;
    }

    @Override // bx8
    public final void a(ax8 ax8Var, int i) {
        StringBuilder sb = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public final void b(int i) {
        gre.p(!this.b);
        ((SparseBooleanArray) this.c).append(i, true);
    }

    public final void c(gi4 gi4Var) {
        for (int i = 0; i < gi4Var.a.size(); i++) {
            b(gi4Var.a(i));
        }
    }

    public final void d(int... iArr) {
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // ok6
    public final MediaCodecInfo e(int i) {
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.c;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.b ? 1 : 0).getCodecInfos();
            this.c = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr[i];
    }

    public final gi4 f() {
        gre.p(!this.b);
        this.b = true;
        return new gi4((SparseBooleanArray) this.c);
    }

    @Override // r56
    public final void f2(int i, int i2) {
        ((w39) this.c).n(i, i2, null);
    }

    public final void g() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            CancellationSignal cancellationSignal = (CancellationSignal) this.c;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                notifyAll();
            }
        }
    }

    public final boolean h() {
        return this.b;
    }

    public final boolean i(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            sc8.e();
            return false;
        }
        if (((vi2) this.c) == null) {
            return h();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            e31 e31Var = ihb.a;
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
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return h();
        }
        return false;
    }

    @Override // ok6
    public final boolean j(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // r56
    public final void j1(int i, int i2) {
        this.b = true;
        ((w39) this.c).q(i, i2);
    }

    public final void k() {
        this.b = false;
    }

    @Override // ok6
    public final boolean k0() {
        return true;
    }

    public final void l(char c) {
        nj1 nj1Var = (nj1) this.c;
        nj1Var.a(nj1Var.c, 1);
        char[] cArr = nj1Var.b;
        int i = nj1Var.c;
        nj1Var.c = i + 1;
        cArr[i] = c;
    }

    public final void m(String str) {
        int i;
        str.getClass();
        nj1 nj1Var = (nj1) this.c;
        nj1Var.a(nj1Var.c, str.length() + 2);
        char[] cArr = nj1Var.b;
        int i2 = nj1Var.c;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = b9b.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    nj1Var.a(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = b9b.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            nj1Var.b[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = b9b.a[charAt];
                                str2.getClass();
                                nj1Var.a(i5, str2.length());
                                str2.getChars(0, str2.length(), nj1Var.b, i5);
                                int length3 = str2.length() + i5;
                                nj1Var.c = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = nj1Var.b;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                nj1Var.c = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        nj1Var.b[i5] = charAt;
                    }
                    i5 = i;
                }
                nj1Var.a(i5, 1);
                nj1Var.b[i5] = '\"';
                nj1Var.c = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        nj1Var.c = i4 + 1;
    }

    @Override // r56
    public final void o0(int i, int i2) {
        this.b = true;
        ((w39) this.c).p(i, i2);
    }

    @Override // ibc
    public final void onError(lbc lbcVar, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.G2 == lbcVar) {
            fa4.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.p0.b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.w2, photoViewer.E);
            String M0 = k96.M0(R.string.AppName, "AppName");
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131752550, null);
            alertDialog$Builder.j(k96.M0(2131747624, "Open"), new k88((Object) this, (byte) 0));
            alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
            photoViewer.b2(alertDialog$Builder);
        }
    }

    @Override // ibc
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        byte b = 1;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f0.invalidate();
        }
        if (!photoViewer.E2) {
            photoViewer.D0();
            photoViewer.s(false);
        }
        if (photoViewer.F2 != null) {
            lbc lbcVar = photoViewer.G2;
            if (lbcVar == null || !lbcVar.W) {
                gl.d3(new j88(this, b), 64L);
            }
        }
    }

    @Override // ibc
    public final void onStateChanged(boolean z, int i) {
        lbc lbcVar;
        int i2;
        oac oacVar;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        ArrayList arrayList = photoViewer.f7;
        lbc lbcVar2 = photoViewer.G2;
        if (lbcVar2 != null) {
            lbcVar2.s0(fo.w() || photoViewer.r);
        }
        if (this.b && (lbcVar = photoViewer.G2) != null && lbcVar.U() != -9223372036854775807L) {
            this.b = false;
            if (photoViewer.X6.isEmpty() && photoViewer.d7.isEmpty() && photoViewer.Z6.isEmpty() && !arrayList.isEmpty() && (i2 = photoViewer.P4) >= 0 && i2 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.P4);
                if (obj instanceof jm6) {
                    jm6 jm6Var = (jm6) obj;
                    if (jm6Var.b && (oacVar = jm6Var.s) != null) {
                        photoViewer.G2.o0((long) (oacVar.d * r2.U()));
                        u78 u78Var = photoViewer.X7;
                        if (u78Var != null) {
                            u78Var.setProgress(jm6Var.s.d);
                        }
                    }
                }
            }
        }
        photoViewer.M2(i, z);
    }

    @Override // ibc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ibc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        gl.c3(new j88(this, (byte) 0));
    }

    @Override // ibc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.z2 != null) {
            float f2 = i * f;
            int i4 = (int) f2;
            photoViewer.V = i4;
            float f3 = i2;
            photoViewer.W = (int) (f * f3);
            photoViewer.I0();
            m88 m88Var = photoViewer.z2;
            float f4 = i2 == 0 ? 1.0f : f2 / f3;
            byte b = 0;
            m88Var.a(f4, 0);
            if (photoViewer.C2 instanceof kac) {
                ((kac) photoViewer.C2).setHDRInfo(photoViewer.G2.V(null));
                kac kacVar = (kac) photoViewer.C2;
                kacVar.d = i4;
                kacVar.e = i2;
                td4 td4Var = kacVar.b;
                if (td4Var != null) {
                    td4Var.postRunnable(new qd4(td4Var, i4, i2, b));
                }
                if (photoViewer.d2 == 1) {
                    photoViewer.I1();
                }
            }
            photoViewer.I3 = true;
        }
    }

    public final void p(toe toeVar) {
        if (this.b) {
            xgd.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((h1c) this.c).a(n90.a(toeVar), new fyb((byte) 3));
        } catch (Throwable unused) {
            xgd.h("BillingLogger", "logging failed.");
        }
    }

    public final String toString() {
        switch (this.a) {
            case 6:
                return ((v39) this.c).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e31(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
    }

    public /* synthetic */ e31(Object obj, byte b) {
        this.a = b;
        this.c = obj;
        this.b = true;
    }

    public e31() {
        this.a = (byte) 5;
        this.c = new SparseBooleanArray();
    }

    public final void n() {
    }

    public final void o() {
    }

    public e31(ah6 ah6Var, boolean z) {
        this.a = (byte) 7;
        this.c = ah6Var;
        this.b = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e31(vi2 vi2Var, boolean z) {
        this((byte) 11, (Object) vi2Var, false);
        this.a = (byte) 11;
        this.b = z;
    }

    public e31(v3d v3dVar, v39 v39Var) {
        this.a = (byte) 6;
        this.b = false;
        this.c = v39Var;
    }

    @Override // ibc
    public final void onSeekFinished(tj tjVar) {
    }

    @Override // ibc
    public final void onSeekStarted(tj tjVar) {
    }

    public /* synthetic */ e31(byte b) {
        this.a = b;
    }

    @Override // ibc
    public final void onRenderedFirstFrame(tj tjVar) {
        long j = tjVar.e;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (j == photoViewer.c8) {
            photoViewer.b8 = j;
            photoViewer.c8 = -1L;
            photoViewer.o();
        }
        if (photoViewer.F2 != null) {
            lbc lbcVar = photoViewer.G2;
            if (lbcVar == null || !lbcVar.W) {
                gl.d3(new j88(this, (byte) 2), 64L);
            }
        }
    }
}
