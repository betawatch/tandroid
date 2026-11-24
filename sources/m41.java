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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m41 implements r76, fq7, rm6, ldc, cz8 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;

    public m41(boolean z, boolean z2, boolean z3) {
        this.a = (byte) 8;
        this.b = z || z2 || z3;
    }

    @Override // r76
    public final void C(int i, int i2) {
        this.b = true;
        ((y59) this.c).p(i, i2);
    }

    @Override // r76
    public final void C0(int i, int i2) {
        this.b = true;
        ((y59) this.c).q(i, i2);
    }

    @Override // rm6
    public final boolean L(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // r76
    public final void O0(int i, int i2) {
        ((y59) this.c).n(i, i2, null);
    }

    @Override // rm6
    public final int V() {
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.c;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.b ? 1 : 0).getCodecInfos();
            this.c = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr.length;
    }

    @Override // cz8
    public final void a(bz8 bz8Var, int i) {
        StringBuilder sb = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public final void b(int i) {
        jte.p(!this.b);
        ((SparseBooleanArray) this.c).append(i, true);
    }

    public final void c(lk4 lk4Var) {
        for (int i = 0; i < lk4Var.a.size(); i++) {
            b(lk4Var.a(i));
        }
    }

    public final void d(int... iArr) {
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // rm6
    public final MediaCodecInfo e(int i) {
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.c;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.b ? 1 : 0).getCodecInfos();
            this.c = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr[i];
    }

    public final lk4 f() {
        jte.p(!this.b);
        this.b = true;
        return new lk4((SparseBooleanArray) this.c);
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
            i98.g();
            return false;
        }
        if (((jk2) this.c) == null) {
            return h();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            m41 m41Var = jjb.a;
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

    public final void j() {
        this.b = false;
    }

    @Override // fq7
    public final void j1(Object obj) {
        this.b = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) ((oo8) this.c).b;
        signInHubActivity.setResult(signInHubActivity.S, signInHubActivity.T);
        signInHubActivity.finish();
    }

    public final void k(char c) {
        vk1 vk1Var = (vk1) this.c;
        vk1Var.a(vk1Var.c, 1);
        char[] cArr = vk1Var.b;
        int i = vk1Var.c;
        vk1Var.c = i + 1;
        cArr[i] = c;
    }

    @Override // r76
    public final void l(int i, int i2) {
        this.b = true;
        ((y59) this.c).j(i, i2);
    }

    public final void m(String str) {
        int i;
        str.getClass();
        vk1 vk1Var = (vk1) this.c;
        vk1Var.a(vk1Var.c, str.length() + 2);
        char[] cArr = vk1Var.b;
        int i2 = vk1Var.c;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = dbb.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    vk1Var.a(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = dbb.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            vk1Var.b[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = dbb.a[charAt];
                                str2.getClass();
                                vk1Var.a(i5, str2.length());
                                str2.getChars(0, str2.length(), vk1Var.b, i5);
                                int length3 = str2.length() + i5;
                                vk1Var.c = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = vk1Var.b;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                vk1Var.c = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        vk1Var.b[i5] = charAt;
                    }
                    i5 = i;
                }
                vk1Var.a(i5, 1);
                vk1Var.b[i5] = '\"';
                vk1Var.c = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        vk1Var.c = i4 + 1;
    }

    @Override // ldc
    public final void onError(ndc ndcVar, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.G2 == ndcVar) {
            fc4.g(exc, true);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.p0.b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer.w2, photoViewer.E);
            String M0 = jb6.M0(R.string.AppName, "AppName");
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131752515, null);
            alertDialog$Builder.j(jb6.M0(2131747550, "Open"), new h68((Object) this, (byte) 3));
            alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
            photoViewer.b2(alertDialog$Builder);
        }
    }

    @Override // ldc
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        byte b = 1;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f0.invalidate();
        }
        if (!photoViewer.E2) {
            photoViewer.D0();
            photoViewer.q(false);
        }
        if (photoViewer.F2 != null) {
            ndc ndcVar = photoViewer.G2;
            if (ndcVar == null || !ndcVar.W) {
                gm.d3(new ma8(this, b), 64L);
            }
        }
    }

    @Override // ldc
    public final void onStateChanged(boolean z, int i) {
        ndc ndcVar;
        int i2;
        rcc rccVar;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        ArrayList arrayList = photoViewer.f7;
        ndc ndcVar2 = photoViewer.G2;
        if (ndcVar2 != null) {
            ndcVar2.s0(fp.w() || photoViewer.r);
        }
        if (this.b && (ndcVar = photoViewer.G2) != null && ndcVar.U() != -9223372036854775807L) {
            this.b = false;
            if (photoViewer.X6.isEmpty() && photoViewer.d7.isEmpty() && photoViewer.Z6.isEmpty() && !arrayList.isEmpty() && (i2 = photoViewer.P4) >= 0 && i2 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.P4);
                if (obj instanceof jo6) {
                    jo6 jo6Var = (jo6) obj;
                    if (jo6Var.b && (rccVar = jo6Var.s) != null) {
                        photoViewer.G2.o0((long) (rccVar.d * r2.U()));
                        x98 x98Var = photoViewer.X7;
                        if (x98Var != null) {
                            x98Var.setProgress(jo6Var.s.d);
                        }
                    }
                }
            }
        }
        photoViewer.M2(i, z);
    }

    @Override // ldc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ldc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        gm.c3(new ma8(this, (byte) 0));
    }

    @Override // ldc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (photoViewer.z2 != null) {
            float f2 = i * f;
            int i4 = (int) f2;
            photoViewer.V = i4;
            float f3 = i2;
            photoViewer.W = (int) (f * f3);
            photoViewer.I0();
            oa8 oa8Var = photoViewer.z2;
            float f4 = i2 == 0 ? 1.0f : f2 / f3;
            byte b = 0;
            oa8Var.a(f4, 0);
            if (photoViewer.C2 instanceof ncc) {
                ((ncc) photoViewer.C2).setHDRInfo(photoViewer.G2.V(null));
                ncc nccVar = (ncc) photoViewer.C2;
                nccVar.d = i4;
                nccVar.e = i2;
                uf4 uf4Var = nccVar.b;
                if (uf4Var != null) {
                    uf4Var.postRunnable(new rf4(uf4Var, i4, i2, b));
                }
                if (photoViewer.d2 == 1) {
                    photoViewer.I1();
                }
            }
            photoViewer.I3 = true;
        }
    }

    public final void p(wqe wqeVar) {
        if (this.b) {
            yid.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((h3c) this.c).a(na0.a(wqeVar), new rjb((byte) 9));
        } catch (Throwable unused) {
            yid.h("BillingLogger", "logging failed.");
        }
    }

    public final String toString() {
        switch (this.a) {
            case 6:
                return ((oo8) this.c).toString();
            default:
                return super.toString();
        }
    }

    @Override // rm6
    public final boolean v(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // rm6
    public final boolean w0() {
        return true;
    }

    public /* synthetic */ m41(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
    }

    public /* synthetic */ m41(Object obj, byte b) {
        this.a = b;
        this.c = obj;
        this.b = true;
    }

    public final void n() {
    }

    public final void o() {
    }

    public m41() {
        this.a = (byte) 5;
        this.c = new SparseBooleanArray();
    }

    public m41(bj6 bj6Var, boolean z) {
        this.a = (byte) 7;
        this.c = bj6Var;
        this.b = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m41(jk2 jk2Var, boolean z) {
        this((byte) 11, (Object) jk2Var, false);
        this.a = (byte) 11;
        this.b = z;
    }

    public m41(x5d x5dVar, oo8 oo8Var) {
        this.a = (byte) 6;
        this.b = false;
        this.c = oo8Var;
    }

    @Override // ldc
    public final void onSeekFinished(tk tkVar) {
    }

    @Override // ldc
    public final void onSeekStarted(tk tkVar) {
    }

    public /* synthetic */ m41(byte b) {
        this.a = b;
    }

    @Override // ldc
    public final void onRenderedFirstFrame(tk tkVar) {
        long j = tkVar.e;
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        if (j == photoViewer.c8) {
            photoViewer.b8 = j;
            photoViewer.c8 = -1L;
            photoViewer.n();
        }
        if (photoViewer.F2 != null) {
            ndc ndcVar = photoViewer.G2;
            if (ndcVar == null || !ndcVar.W) {
                gm.d3(new ma8(this, (byte) 2), 64L);
            }
        }
    }
}
