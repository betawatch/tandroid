// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o78 extends c6 {
    public final /* synthetic */ wjb a;
    public final /* synthetic */ PhotoViewer b;

    public o78(PhotoViewer photoViewer, wjb wjbVar) {
        this.b = photoViewer;
        this.a = wjbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[RETURN] */
    @Override // c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.S4 == null && photoViewer.a5 == null) {
            if (photoViewer.Z4 != null) {
                ba4.G(photoViewer.U);
                gl5 gl5Var = photoViewer.Z4;
                File J = ba4.J(gl5Var == null ? null : gl5Var.f, PhotoViewer.o0(gl5Var), photoViewer.y5 != 0 || photoViewer.A5, true);
                File file = new File(ba4.z(4), J.getName());
                ba4.G(photoViewer.U);
                gl5 gl5Var2 = photoViewer.Z4;
                File J2 = ba4.J(gl5Var2 != null ? gl5Var2.f : null, PhotoViewer.o0(gl5Var2), false, true);
                if (!J.exists() && !file.exists() && !J2.exists()) {
                    return false;
                }
            } else if (photoViewer.i7 == null) {
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x03d9, code lost:
    
        if (oo1.t(r0) != false) goto L196;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0221  */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        k27 k27Var;
        TLObject tLObject;
        gl5 gl5Var;
        TLRPC.Photo photo;
        String str;
        ar1 ar1Var;
        View findViewWithTag;
        boolean z;
        CharSequence b0;
        gl5 gl5Var2;
        k27 k27Var2;
        k27 k27Var3;
        int i2;
        String str2;
        ed edVar;
        TextView textView;
        long A0;
        TLRPC.Chat K0;
        TLRPC.User user;
        o98 o98Var;
        boolean z2;
        ArrayList arrayList;
        mu1 mu1Var;
        String str3;
        f27 f27Var;
        boolean z3;
        k27 k27Var4;
        TLRPC.Message message;
        String str4;
        int i3;
        f27 f27Var2;
        ?? r15;
        File file;
        boolean a;
        Object[] objArr;
        boolean z4 = true;
        z4 = true;
        z4 = true;
        if (i == -1) {
            q88 q88Var = this.b.M1;
            if (q88Var == null || !q88Var.p0()) {
                boolean K02 = this.b.K0();
                PhotoViewer photoViewer = this.b;
                if (K02) {
                    photoViewer.z(false);
                    return;
                } else {
                    photoViewer.B(true, false);
                    return;
                }
            }
            return;
        }
        final byte b = 0;
        File file2 = null;
        if (i == 2) {
            PhotoViewer photoViewer2 = this.b;
            if (photoViewer2.i7 != null && !photoViewer2.l2) {
                return;
            }
            if ((Build.VERSION.SDK_INT <= 28 || w01.b) && photoViewer2.E.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.b.E.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            final ArrayList arrayList2 = new ArrayList(1);
            PhotoViewer photoViewer3 = this.b;
            mu1 mu1Var2 = photoViewer3.k4;
            if (mu1Var2 != null) {
                i3 = 4;
                f27Var2 = mu1Var2.M6(photoViewer3.S4.c1());
            } else {
                i3 = 4;
                f27Var2 = null;
            }
            if (f27Var2 != null) {
                arrayList2.addAll(f27Var2.d);
            } else {
                arrayList2.add(this.b.S4);
            }
            if (arrayList2.size() > 1) {
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    k27 k27Var5 = (k27) arrayList2.get(i4);
                    if (k27Var5.D3()) {
                        z7 = true;
                    } else if (k27Var5.G4()) {
                        z5 = true;
                    } else {
                        z6 = true;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.E, this.a);
                alertDialog$Builder.k(k96.M0(2131745749, "SaveGroupMedia"));
                alertDialog$Builder.f(k96.M0(2131745748, "SaveGroupMediaMessage"));
                alertDialog$Builder.a.J = bkb.fh;
                k27 k27Var6 = this.b.S4;
                String M0 = (k27Var6 == null || !k27Var6.G4() || this.b.S4.D3()) ? k96.M0(2131743900, "ThisPhoto") : k96.M0(2131743901, "ThisMedia");
                final byte b2 = true ? (byte) 1 : (byte) 0;
                alertDialog$Builder.g(M0, new ed(this) { // from class: g78
                    public final /* synthetic */ o78 b;

                    {
                        this.b = this;
                    }

                    @Override // ed
                    public final void u(hd hdVar, int i5) {
                        File M;
                        byte b3 = b2;
                        o78 o78Var = this.b;
                        switch (b3) {
                            case 0:
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer4 = o78Var.b;
                                arrayList3.add(photoViewer4.S4);
                                photoViewer4.j2(arrayList3);
                                break;
                            default:
                                PhotoViewer photoViewer5 = o78Var.b;
                                k27 k27Var7 = photoViewer5.S4;
                                if (k27Var7 != null) {
                                    File file3 = null;
                                    if ((k27.n1(k27Var7.k) instanceof TLRPC.TL_messageMediaWebPage) && k27.n1(photoViewer5.S4.k).webpage != null && k27.n1(photoViewer5.S4.k).webpage.document == null) {
                                        TLObject n0 = photoViewer5.n0(photoViewer5.O4, null);
                                        ba4.G(photoViewer5.U);
                                        M = ba4.J(n0, null, true, true);
                                    } else {
                                        ba4.G(photoViewer5.U);
                                        M = ba4.M(photoViewer5.S4.k, false, true);
                                    }
                                    boolean K4 = k27.K4(photoViewer5.S4.k);
                                    boolean D3 = photoViewer5.S4.D3();
                                    if (D3) {
                                        TLRPC.Document document = k27.n1(photoViewer5.S4.k) != null ? k27.n1(photoViewer5.S4.k).document : null;
                                        if (document != null) {
                                            ba4.G(photoViewer5.U);
                                            File J = ba4.J(document, null, false, true);
                                            if (J == null || !J.exists()) {
                                                ba4.G(photoViewer5.U);
                                                file3 = ba4.J(document, null, true, true);
                                            } else {
                                                file3 = J;
                                            }
                                        }
                                    }
                                    if (!D3) {
                                        if (M != null && M.exists()) {
                                            MediaController.d0(M.toString(), photoViewer5.E, K4 ? 1 : 0, null, null, new j78(o78Var, K4, (byte) 0));
                                            break;
                                        } else {
                                            photoViewer5.d2();
                                            break;
                                        }
                                    } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                        MediaController.c0(M.toString(), file3.toString(), photoViewer5.E, new f78(o78Var, (byte) 1));
                                        break;
                                    } else {
                                        photoViewer5.d2();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                String G = (z5 || z7) ? k96.G(arrayList2.size(), "AllNMedia", new Object[0]) : k96.G(arrayList2.size(), "AllNPhotos", new Object[0]);
                final boolean z8 = z5;
                final boolean z9 = z6;
                final boolean z10 = z7;
                alertDialog$Builder.j(G, new ed() { // from class: l78
                    /* JADX WARN: Type inference failed for: r1v0, types: [h78] */
                    @Override // ed
                    public final void u(hd hdVar, int i5) {
                        File M;
                        final o78 o78Var = o78.this;
                        PhotoViewer photoViewer4 = o78Var.b;
                        final byte b3 = 1;
                        final int[] iArr = new int[1];
                        final int[] iArr2 = new int[1];
                        final boolean z11 = z8;
                        final boolean z12 = z9;
                        final boolean z13 = z10;
                        final ?? r1 = new Runnable() { // from class: h78
                            @Override // java.lang.Runnable
                            public final void run() {
                                int[] iArr3 = iArr2;
                                int i6 = iArr3[0] + 1;
                                iArr3[0] = i6;
                                int i7 = iArr[0];
                                if (i6 == i7) {
                                    k98 k98Var = o78.this.b.f0;
                                    boolean z14 = z11;
                                    int i8 = (z12 ? 1 : 0) + (z14 ? 1 : 0);
                                    boolean z15 = z13;
                                    new u21(k98Var, null).m(i8 + (z15 ? 1 : 0) > 1 ? t21.w : z15 ? i7 > 1 ? t21.s : t21.r : z14 ? i7 > 1 ? t21.n : t21.h : i7 > 1 ? t21.f : t21.e, i7, -115203550, -1, null).j();
                                }
                            }
                        };
                        final byte b4 = 0;
                        int i6 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i6 >= arrayList3.size()) {
                                return;
                            }
                            k27 k27Var7 = (k27) arrayList3.get(i6);
                            if (k27Var7 != null) {
                                File file3 = null;
                                if ((k27.n1(k27Var7.k) instanceof TLRPC.TL_messageMediaWebPage) && k27.n1(k27Var7.k).webpage != null && k27.n1(k27Var7.k).webpage.document == null) {
                                    ba4.G(photoViewer4.U);
                                    M = ba4.J(photoViewer4.n0(photoViewer4.O4, null), null, true, true);
                                } else {
                                    ba4.G(photoViewer4.U);
                                    M = ba4.M(k27Var7.k, false, true);
                                }
                                boolean K4 = k27.K4(k27Var7.k);
                                boolean D3 = k27Var7.D3();
                                if (D3) {
                                    TLRPC.Document document = k27.n1(k27Var7.k) != null ? k27.n1(k27Var7.k).document : null;
                                    if (document != null) {
                                        ba4.G(photoViewer4.U);
                                        File J = ba4.J(document, null, false, true);
                                        if (J == null || !J.exists()) {
                                            ba4.G(photoViewer4.U);
                                            file3 = ba4.J(document, null, true, true);
                                        } else {
                                            file3 = J;
                                        }
                                    }
                                }
                                if (D3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        MediaController.d0(M.toString(), photoViewer4.E, 0, null, null, new p8c() { // from class: i78
                                            @Override // p8c
                                            public final void a(Object obj) {
                                                byte b5 = b3;
                                                h78 h78Var = r1;
                                                switch (b5) {
                                                    case 0:
                                                        gl.c3(h78Var);
                                                        break;
                                                    case 1:
                                                        gl.c3(h78Var);
                                                        break;
                                                    default:
                                                        gl.c3(h78Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        MediaController.c0(M.toString(), file3.toString(), photoViewer4.E, new p8c() { // from class: i78
                                            @Override // p8c
                                            public final void a(Object obj) {
                                                byte b5 = b4;
                                                h78 h78Var = r1;
                                                switch (b5) {
                                                    case 0:
                                                        gl.c3(h78Var);
                                                        break;
                                                    case 1:
                                                        gl.c3(h78Var);
                                                        break;
                                                    default:
                                                        gl.c3(h78Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!D3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final byte b5 = 2;
                                    MediaController.d0(M.toString(), photoViewer4.E, K4 ? 1 : 0, null, null, new p8c() { // from class: i78
                                        @Override // p8c
                                        public final void a(Object obj) {
                                            byte b52 = b5;
                                            h78 h78Var = r1;
                                            switch (b52) {
                                                case 0:
                                                    gl.c3(h78Var);
                                                    break;
                                                case 1:
                                                    gl.c3(h78Var);
                                                    break;
                                                default:
                                                    gl.c3(h78Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i6++;
                        }
                    }
                });
                alertDialog$Builder.h(k96.M0(2131752577, "Cancel"), new fi7((byte) 28));
                hd hdVar = alertDialog$Builder.a;
                hdVar.j(this.b.y0(bkb.kh));
                hdVar.show();
                View c = hdVar.c(-3);
                if (c instanceof TextView) {
                    int i5 = bkb.p7;
                    zkb.X((TextView) c, i5, this.b.w2);
                    c.setBackground(bkb.H0(gl.L(3.0f), this.b.y0(i5)));
                    ViewGroup viewGroup = hdVar.u0;
                    if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                        c.bringToFront();
                    }
                }
                hdVar.o(this.b.y0(bkb.Xg));
                return;
            }
            PhotoViewer photoViewer4 = this.b;
            k27 k27Var7 = photoViewer4.S4;
            if (k27Var7 == null) {
                gl5 gl5Var3 = photoViewer4.Z4;
                if (gl5Var3 != null) {
                    String o0 = PhotoViewer.o0(gl5Var3);
                    ba4.G(this.b.U);
                    PhotoViewer photoViewer5 = this.b;
                    gl5 gl5Var4 = photoViewer5.Z4;
                    File J = ba4.J(gl5Var4 == null ? null : gl5Var4.f, o0, photoViewer5.y5 != 0 || photoViewer5.A5, true);
                    if (J != null && !J.exists()) {
                        ba4.G(this.b.U);
                        gl5 gl5Var5 = this.b.Z4;
                        J = ba4.J(gl5Var5 == null ? null : gl5Var5.f, o0, false, true);
                    }
                    if (o0 != null) {
                        o0 = o0.toLowerCase();
                    }
                    r15 = o0 != null && (o0.equals("webm") || o0.equals("mp4") || o0.equals("gif"));
                    file = J;
                } else {
                    l98 l98Var = photoViewer4.i7;
                    if (l98Var != null) {
                        file = l98Var.b(photoViewer4.O4);
                        PhotoViewer photoViewer6 = this.b;
                        a = photoViewer6.i7.a(photoViewer6.O4);
                    } else {
                        r15 = 0;
                        file = null;
                    }
                }
                if (file != null && !file.exists()) {
                    file = new File(ba4.z(i3), file.getName());
                }
                k27 k27Var8 = this.b.S4;
                objArr = k27Var8 == null && k27Var8.D3();
                if (objArr != false) {
                    TLRPC.Document document = k27.n1(this.b.S4.k) != null ? k27.n1(this.b.S4.k).document : null;
                    if (document != null) {
                        ba4.G(this.b.U);
                        file2 = ba4.K(document, false);
                        if (file2 == null || !file2.exists()) {
                            ba4.G(this.b.U);
                            file2 = ba4.K(document, true);
                        }
                    }
                }
                if (objArr == true) {
                    if (file == null || !file.exists()) {
                        this.b.d2();
                        return;
                    } else {
                        MediaController.d0(file.toString(), this.b.E, r15, null, null, new j78(this, r15, true ? (byte) 1 : (byte) 0));
                        return;
                    }
                }
                if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                    this.b.d2();
                    return;
                } else {
                    MediaController.c0(file.toString(), file2.toString(), this.b.E, new f78(this, b));
                    return;
                }
            }
            if ((k27.n1(k27Var7.k) instanceof TLRPC.TL_messageMediaWebPage) && k27.n1(this.b.S4.k).webpage != null && k27.n1(this.b.S4.k).webpage.document == null) {
                PhotoViewer photoViewer7 = this.b;
                TLObject n0 = photoViewer7.n0(photoViewer7.O4, null);
                ba4.G(this.b.U);
                file = ba4.K(n0, true);
                if (!file.exists()) {
                    file = new File(ba4.z(i3), file.getName());
                }
            } else {
                ba4.G(this.b.U);
                file = ba4.L(this.b.S4.k);
            }
            a = this.b.S4.G4();
            r15 = a;
            if (file != null) {
                file = new File(ba4.z(i3), file.getName());
            }
            k27 k27Var82 = this.b.S4;
            if (k27Var82 == null) {
            }
            if (objArr != false) {
            }
            if (objArr == true) {
            }
        } else {
            if (i == 24) {
                tg2 N = tg2.N();
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                N.Y(photoViewer8.k0());
                this.b.H0.performClick();
                return;
            }
            if (i == 3) {
                PhotoViewer photoViewer9 = this.b;
                if (photoViewer9.D5 != 0) {
                    photoViewer9.r4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", this.b.D5);
                    zj6 zj6Var = new zj6(bundle, null);
                    PhotoViewer photoViewer10 = this.b;
                    mu1 mu1Var3 = photoViewer10.k4;
                    if (mu1Var3 != null) {
                        zj6Var.c = mu1Var3.r8;
                    }
                    photoViewer10.B(false, false);
                    Activity activity = this.b.E;
                    if (activity instanceof LaunchActivity) {
                        ((LaunchActivity) activity).u0(zj6Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 5 || i == 21) {
                if (this.b.S4 != null) {
                    Bundle bundle2 = new Bundle();
                    PhotoViewer photoViewer11 = this.b;
                    long j = photoViewer11.D5;
                    k27 k27Var9 = photoViewer11.S4;
                    if (k27Var9 != null) {
                        j = k27Var9.A0();
                    }
                    if (cf3.B(j)) {
                        bundle2.putInt("enc_id", cf3.h(j));
                    } else if (cf3.D(j)) {
                        bundle2.putLong("user_id", j);
                    } else {
                        TLRPC.Chat K03 = na7.q1(this.b.U).K0(Long.valueOf(-j));
                        if (K03 != null && K03.migrated_to != null) {
                            bundle2.putLong("migrated_to", j);
                            j = -K03.migrated_to.channel_id;
                        }
                        bundle2.putLong("chat_id", -j);
                    }
                    bundle2.putInt("message_id", this.b.S4.e1());
                    if (i == 21) {
                        bundle2.putInt("reply_to", this.b.S4.e1());
                    }
                    kk7.f(this.b.U).k(kk7.s, new Object[0]);
                    Activity activity2 = this.b.E;
                    if (activity2 instanceof LaunchActivity) {
                        LaunchActivity launchActivity = (LaunchActivity) activity2;
                        launchActivity.u0(new mu1(bundle2), launchActivity.R() > 1 || gl.O1(), true);
                    }
                    this.b.B(false, false);
                    PhotoViewer photoViewer12 = this.b;
                    photoViewer12.S4 = null;
                    VideoAds videoAds = photoViewer12.T4;
                    if (videoAds != null) {
                        videoAds.stop();
                        this.b.T4 = null;
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 25) {
                PhotoViewer photoViewer13 = this.b;
                if (photoViewer13.l4 == null || photoViewer13.d == null || (k27Var4 = photoViewer13.S4) == null || (message = k27Var4.k) == null) {
                    return;
                }
                if (!TextUtils.isEmpty(message.attachPath)) {
                    str4 = this.b.S4.k.attachPath;
                    if (!TextUtils.isEmpty(str4)) {
                    }
                }
                str4 = null;
                if (TextUtils.isEmpty(str4)) {
                    ba4.G(this.b.U);
                    File N2 = ba4.N(this.b.S4.k);
                    if (N2 != null && N2.exists()) {
                        str4 = N2.getAbsolutePath();
                    }
                }
                String str5 = str4;
                if (TextUtils.isEmpty(str5)) {
                    return;
                }
                mu1 mu1Var4 = this.b.k4;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new jm6(0, str5, 0, false, 0, 0));
                this.b.o1(arrayList3, 0, 11, false, new m78(), mu1Var4);
                this.b.V(null, null, false, null);
                this.b.u1();
                xv2.e().T = null;
                return;
            }
            byte b3 = 23;
            if (i == 4) {
                PhotoViewer photoViewer14 = this.b;
                k27 k27Var10 = photoViewer14.S4;
                if (k27Var10 == null || !(photoViewer14.E instanceof LaunchActivity)) {
                    return;
                }
                if (!k27Var10.r1) {
                    long A02 = k27Var10.A0();
                    if (cf3.y(A02)) {
                        z2 = hc2.V(na7.q1(this.b.U).K0(Long.valueOf(-A02)));
                        PhotoViewer photoViewer15 = this.b;
                        ((LaunchActivity) photoViewer15.E).N0(photoViewer15.S4.K1);
                        arrayList = new ArrayList(1);
                        PhotoViewer photoViewer16 = this.b;
                        mu1Var = photoViewer16.k4;
                        if (mu1Var == null) {
                            str3 = "AllNPhotos";
                            f27Var = mu1Var.M6(photoViewer16.S4.c1());
                        } else {
                            str3 = "AllNPhotos";
                            f27Var = null;
                        }
                        if (f27Var == null) {
                            arrayList.addAll(f27Var.d);
                        } else {
                            arrayList.add(this.b.S4);
                        }
                        if (!z2 && arrayList.size() <= 1) {
                            this.b.j2(arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            cj3 cj3Var = new cj3(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(this.b.S4);
                            PhotoViewer photoViewer17 = this.b;
                            cj3Var.E2 = new lt2(this, arrayList4, photoViewer17.k4, b3);
                            ((LaunchActivity) photoViewer17.E).u0(cj3Var, false, true);
                            this.b.B(false, false);
                            return;
                        }
                        for (int i6 = 0; i6 < arrayList.size(); i6++) {
                            if (!((k27) arrayList.get(i6)).Q3() || ((k27) arrayList.get(i6)).G4()) {
                                z3 = false;
                                break;
                            }
                        }
                        z3 = true;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.E, this.a);
                        alertDialog$Builder2.k(k96.M0(2131750568, "ForwardGroupMedia"));
                        alertDialog$Builder2.f(k96.M0(2131750567, "ForwardGroupMediaMessage"));
                        alertDialog$Builder2.a.J = bkb.fh;
                        alertDialog$Builder2.g(z3 ? k96.M0(2131743900, "ThisPhoto") : k96.M0(2131743901, "ThisMedia"), new ed(this) { // from class: g78
                            public final /* synthetic */ o78 b;

                            {
                                this.b = this;
                            }

                            @Override // ed
                            public final void u(hd hdVar2, int i52) {
                                File M;
                                byte b32 = b;
                                o78 o78Var = this.b;
                                switch (b32) {
                                    case 0:
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer42 = o78Var.b;
                                        arrayList32.add(photoViewer42.S4);
                                        photoViewer42.j2(arrayList32);
                                        break;
                                    default:
                                        PhotoViewer photoViewer52 = o78Var.b;
                                        k27 k27Var72 = photoViewer52.S4;
                                        if (k27Var72 != null) {
                                            File file3 = null;
                                            if ((k27.n1(k27Var72.k) instanceof TLRPC.TL_messageMediaWebPage) && k27.n1(photoViewer52.S4.k).webpage != null && k27.n1(photoViewer52.S4.k).webpage.document == null) {
                                                TLObject n02 = photoViewer52.n0(photoViewer52.O4, null);
                                                ba4.G(photoViewer52.U);
                                                M = ba4.J(n02, null, true, true);
                                            } else {
                                                ba4.G(photoViewer52.U);
                                                M = ba4.M(photoViewer52.S4.k, false, true);
                                            }
                                            boolean K4 = k27.K4(photoViewer52.S4.k);
                                            boolean D3 = photoViewer52.S4.D3();
                                            if (D3) {
                                                TLRPC.Document document2 = k27.n1(photoViewer52.S4.k) != null ? k27.n1(photoViewer52.S4.k).document : null;
                                                if (document2 != null) {
                                                    ba4.G(photoViewer52.U);
                                                    File J2 = ba4.J(document2, null, false, true);
                                                    if (J2 == null || !J2.exists()) {
                                                        ba4.G(photoViewer52.U);
                                                        file3 = ba4.J(document2, null, true, true);
                                                    } else {
                                                        file3 = J2;
                                                    }
                                                }
                                            }
                                            if (!D3) {
                                                if (M != null && M.exists()) {
                                                    MediaController.d0(M.toString(), photoViewer52.E, K4 ? 1 : 0, null, null, new j78(o78Var, K4, (byte) 0));
                                                    break;
                                                } else {
                                                    photoViewer52.d2();
                                                    break;
                                                }
                                            } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                                MediaController.c0(M.toString(), file3.toString(), photoViewer52.E, new f78(o78Var, (byte) 1));
                                                break;
                                            } else {
                                                photoViewer52.d2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.j(z3 ? k96.G(arrayList.size(), str3, new Object[0]) : k96.G(arrayList.size(), "AllNMedia", new Object[0]), new dx6(this, arrayList, (byte) 19));
                        alertDialog$Builder2.h(k96.M0(2131752577, "Cancel"), new fi7((byte) 29));
                        hd hdVar2 = alertDialog$Builder2.a;
                        hdVar2.j(this.b.y0(bkb.kh));
                        hdVar2.show();
                        View c2 = hdVar2.c(-3);
                        if (c2 instanceof TextView) {
                            int i7 = bkb.p7;
                            zkb.X((TextView) c2, i7, this.b.w2);
                            c2.setBackground(bkb.H0(gl.L(3.0f), this.b.y0(i7)));
                            ViewGroup viewGroup2 = hdVar2.u0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                c2.bringToFront();
                            }
                        }
                        hdVar2.o(this.b.y0(bkb.Xg));
                        return;
                    }
                }
                z2 = false;
                PhotoViewer photoViewer152 = this.b;
                ((LaunchActivity) photoViewer152.E).N0(photoViewer152.S4.K1);
                arrayList = new ArrayList(1);
                PhotoViewer photoViewer162 = this.b;
                mu1Var = photoViewer162.k4;
                if (mu1Var == null) {
                }
                if (f27Var == null) {
                }
                if (!z2) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i == 18) {
                    PhotoViewer photoViewer18 = this.b;
                    Drawable[] drawableArr2 = PhotoViewer.d9;
                    photoViewer18.i1();
                    return;
                }
                if (i == 26) {
                    PhotoViewer photoViewer19 = this.b;
                    if (photoViewer19.E == null || (o98Var = photoViewer19.d) == null) {
                        return;
                    }
                    o98Var.I();
                    this.b.B(true, false);
                    return;
                }
                if (i != 7) {
                    if (i == 9 || i == 16) {
                        PhotoViewer photoViewer20 = this.b;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer20.e1();
                        return;
                    }
                    if (i == 10) {
                        try {
                            PhotoViewer photoViewer21 = this.b;
                            if (photoViewer21.s4) {
                                d01.t(photoViewer21.E, k27.n1(photoViewer21.S4.k).webpage.url);
                                this.b.B(false, false);
                                return;
                            }
                            k27 k27Var11 = photoViewer21.S4;
                            if (k27Var11 == null) {
                                l98 l98Var2 = photoViewer21.i7;
                                if (l98Var2 != null) {
                                    boolean t2 = gl.t2(l98Var2.d(photoViewer21.O4), this.b.E);
                                    PhotoViewer photoViewer22 = this.b;
                                    if (t2) {
                                        photoViewer22.B(false, false);
                                        return;
                                    } else {
                                        photoViewer22.d2();
                                        return;
                                    }
                                }
                                return;
                            }
                            Activity activity3 = photoViewer21.E;
                            wjb wjbVar = this.a;
                            if (!k27Var11.G4() && !this.b.S4.Q3() && !this.b.S4.s4()) {
                                z4 = false;
                            }
                            boolean r2 = gl.r2(k27Var11, activity3, wjbVar, z4);
                            PhotoViewer photoViewer23 = this.b;
                            if (r2) {
                                photoViewer23.B(false, false);
                                return;
                            } else {
                                photoViewer23.d2();
                                return;
                            }
                        } catch (Exception e) {
                            fa4.f(e);
                            return;
                        }
                    }
                    if (i == 11 || i == 13) {
                        PhotoViewer photoViewer24 = this.b;
                        if (photoViewer24.E == null || (k27Var = photoViewer24.S4) == null) {
                            return;
                        }
                        boolean z11 = k27.n1(k27Var.k) instanceof TLRPC.TL_messageMediaPhoto;
                        k27 k27Var12 = this.b.S4;
                        if (z11) {
                            tLObject = k27.n1(k27Var12.k).photo;
                        } else if (!(k27.n1(k27Var12.k) instanceof TLRPC.TL_messageMediaDocument)) {
                            return;
                        } else {
                            tLObject = k27.n1(this.b.S4.k).document;
                        }
                        TLObject tLObject2 = tLObject;
                        PhotoViewer photoViewer25 = this.b;
                        PhotoViewer photoViewer26 = this.b;
                        photoViewer25.U3 = new n78(this, photoViewer26.E, photoViewer26.S4, tLObject2, this.a);
                        this.b.U3.show();
                        return;
                    }
                    byte b4 = 6;
                    if (i == 6) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b.p0.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        PhotoViewer photoViewer27 = this.b;
                        if (!photoViewer27.s4) {
                            photoViewer27.r2();
                            return;
                        }
                        if (photoViewer27.g0.d()) {
                            if (PhotoViewer.k9 != null) {
                                PhotoViewer.k9.M();
                            }
                            this.b.J3 = true;
                            PhotoViewer.k9 = PhotoViewer.j9;
                            PhotoViewer.j9 = null;
                            PhotoViewer photoViewer28 = this.b;
                            photoViewer28.e = false;
                            photoViewer28.f = false;
                            p98 p98Var = photoViewer28.c5;
                            if (p98Var != null) {
                                ImageReceiver imageReceiver = p98Var.a;
                                if (!imageReceiver.R0) {
                                    imageReceiver.v0(true, true);
                                }
                            }
                            PhotoViewer photoViewer29 = this.b;
                            photoViewer29.l6 = 1.0f;
                            photoViewer29.f0.invalidate();
                            this.b.P();
                            return;
                        }
                        return;
                    }
                    if (i == 8) {
                        PhotoViewer photoViewer30 = this.b;
                        if (photoViewer30.S4 != null) {
                            ba4.G(photoViewer30.U).d(this.b.S4.F0());
                            this.b.w1(false);
                            this.b.j0.setTag(r2);
                            this.b.j0.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    if (i == 12) {
                        PhotoViewer photoViewer31 = this.b;
                        k27 k27Var13 = photoViewer31.S4;
                        if (k27Var13 != null) {
                            TLRPC.Document F0 = k27Var13.F0();
                            PhotoViewer photoViewer32 = this.b;
                            mu1 mu1Var5 = photoViewer32.k4;
                            if (mu1Var5 == null || (ar1Var = mu1Var5.a0) == null) {
                                hq6.d0(photoViewer32.U).c(F0, (int) (System.currentTimeMillis() / 1000), true);
                            } else {
                                ar1Var.j(F0);
                            }
                            na7.q1(this.b.U).w4(this.b.S4, F0);
                        } else {
                            l98 l98Var3 = photoViewer31.i7;
                            if (l98Var3 == null) {
                                return;
                            }
                            TLObject d = l98Var3.d(photoViewer31.O4);
                            if (d instanceof TLRPC.Document) {
                                TLRPC.Document document2 = (TLRPC.Document) d;
                                hq6.d0(this.b.U).c(document2, (int) (System.currentTimeMillis() / 1000), true);
                                na7.q1(this.b.U).w4(this.b.i7.g(), document2);
                            }
                        }
                        k98 k98Var = this.b.f0;
                        if (k98Var != null) {
                            u21.a0(k98Var, this.a).o(t21.E, this.a).j();
                            return;
                        }
                        return;
                    }
                    if (i != 14) {
                        if (i == 15) {
                            ba4.G(this.b.U);
                            gl5 gl5Var6 = this.b.Z4;
                            File J2 = ba4.J(gl5Var6 == null ? null : gl5Var6.f, PhotoViewer.o0(gl5Var6), true, true);
                            PhotoViewer photoViewer33 = this.b;
                            boolean z12 = photoViewer33.Z4.p == 2;
                            if (z12) {
                                ba4.G(photoViewer33.U);
                                gl5 gl5Var7 = this.b.Y4;
                                str = ba4.J(gl5Var7 == null ? null : gl5Var7.f, PhotoViewer.o0(gl5Var7), true, true).getAbsolutePath();
                            } else {
                                str = null;
                            }
                            this.b.d.g(J2.getAbsolutePath(), str, z12);
                            return;
                        }
                        if (i == 19) {
                            PhotoViewer photoViewer34 = this.b;
                            int i8 = photoViewer34.P4;
                            if (i8 < 0 || i8 >= photoViewer34.X6.size()) {
                                return;
                            }
                            PhotoViewer photoViewer35 = this.b;
                            k27 k27Var14 = (k27) photoViewer35.X6.get(photoViewer35.P4);
                            this.b.m5 = true;
                            final byte b5 = true ? (byte) 1 : (byte) 0;
                            gl.d3(new Runnable(this) { // from class: k78
                                public final /* synthetic */ o78 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    o78 o78Var = this.b;
                                    switch (b6) {
                                        case 0:
                                            r7 r7Var = o78Var.b.p0;
                                            if (r7Var != null) {
                                                r7Var.u(14);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            PhotoViewer photoViewer36 = o78Var.b;
                                            photoViewer36.p0.u(19);
                                            photoViewer36.p0.S(20);
                                            break;
                                        default:
                                            PhotoViewer photoViewer37 = o78Var.b;
                                            photoViewer37.p0.S(19);
                                            photoViewer37.p0.u(20);
                                            break;
                                    }
                                }
                            }, 32L);
                            this.b.F2();
                            na7.q1(this.b.U).i4.L(k27Var14, new z68(this.b, b4));
                            return;
                        }
                        if (i == 20) {
                            this.b.m5 = false;
                            final byte b6 = 2;
                            gl.d3(new Runnable(this) { // from class: k78
                                public final /* synthetic */ o78 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b62 = b6;
                                    o78 o78Var = this.b;
                                    switch (b62) {
                                        case 0:
                                            r7 r7Var = o78Var.b.p0;
                                            if (r7Var != null) {
                                                r7Var.u(14);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            PhotoViewer photoViewer36 = o78Var.b;
                                            photoViewer36.p0.u(19);
                                            photoViewer36.p0.S(20);
                                            break;
                                        default:
                                            PhotoViewer photoViewer37 = o78Var.b;
                                            photoViewer37.p0.S(19);
                                            photoViewer37.p0.u(20);
                                            break;
                                    }
                                }
                            }, 32L);
                            this.b.F2();
                            return;
                        }
                        if (i == 126) {
                            mbc mbcVar = this.b.k7;
                            if (mbcVar != null) {
                                mbcVar.d();
                                return;
                            }
                            return;
                        }
                        if (i != 22) {
                            if (i == 23) {
                                PhotoViewer photoViewer36 = this.b;
                                gl5 gl5Var8 = photoViewer36.Y4;
                                TLRPC.Photo photo2 = ((gl5Var8 == null || (photo = gl5Var8.l) == null) && ((gl5Var = photoViewer36.Z4) == null || (photo = gl5Var.l) == null)) ? null : photo;
                                if (photo2 != null) {
                                    ij.G(photoViewer36.U, photoViewer36.y5, new f53(), photoViewer36.E, photo2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        PhotoViewer photoViewer37 = this.b;
                        boolean z13 = !photoViewer37.Z2;
                        photoViewer37.Z2 = z13;
                        lbc.m0(photoViewer37.S4, z13);
                        PhotoViewer photoViewer38 = this.b;
                        lbc lbcVar = photoViewer38.G2;
                        if (lbcVar != null) {
                            lbcVar.r0(photoViewer38.Z2);
                        }
                        PhotoViewer photoViewer39 = this.b;
                        photoViewer39.t0.f(photoViewer39.Z2);
                        PhotoViewer photoViewer40 = this.b;
                        photoViewer40.t0.setSelectorColor(photoViewer40.Z2 ? 259241196 : 268435455);
                        return;
                    }
                    PhotoViewer photoViewer41 = this.b;
                    TLRPC.Photo photo3 = (TLRPC.Photo) photoViewer41.e7.get(photoViewer41.O4);
                    if (photo3 == null || photo3.sizes.isEmpty()) {
                        return;
                    }
                    TLRPC.PhotoSize u = ba4.u(800, photo3.sizes);
                    TLRPC.PhotoSize u2 = ba4.u(90, photo3.sizes);
                    y6c h = y6c.h(this.b.U);
                    PhotoViewer photoViewer42 = this.b;
                    if (photoViewer42.y5 == h.n) {
                        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                        tL_inputPhoto.id = photo3.id;
                        tL_inputPhoto.access_hash = photo3.access_hash;
                        tL_inputPhoto.file_reference = photo3.file_reference;
                        ConnectionsManager.getInstance(this.b.U).sendRequest(tL_photos_updateProfilePhoto, new k45(this, h, photo3, (byte) 28));
                        TLRPC.User V1 = na7.q1(this.b.U).V1(Long.valueOf(h.n));
                        if (V1 != null) {
                            TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                            userProfilePhoto.photo_id = photo3.id;
                            userProfilePhoto.dc_id = photo3.dc_id;
                            userProfilePhoto.photo_small = u2.location;
                            userProfilePhoto.photo_big = u.location;
                            h.v(V1);
                            h.u(true);
                            kk7.f(this.b.U).k(kk7.i0, new Object[0]);
                        }
                    } else {
                        TLRPC.Chat K04 = na7.q1(photoViewer42.U).K0(Long.valueOf(-this.b.y5));
                        if (K04 == null) {
                            return;
                        }
                        TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                        TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                        tL_inputChatPhoto.id = tL_inputPhoto2;
                        tL_inputPhoto2.id = photo3.id;
                        tL_inputPhoto2.access_hash = photo3.access_hash;
                        tL_inputPhoto2.file_reference = photo3.file_reference;
                        na7.q1(this.b.U).x(-this.b.y5, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                        TLRPC.ChatPhoto chatPhoto = K04.photo;
                        chatPhoto.dc_id = photo3.dc_id;
                        chatPhoto.photo_small = u2.location;
                        chatPhoto.photo_big = u.location;
                        kk7.f(this.b.U).k(2, 2);
                    }
                    this.b.g7 = gl5.i(u, photo3);
                    PhotoViewer photoViewer43 = this.b;
                    photoViewer43.e7.remove(photoViewer43.O4);
                    this.b.e7.add(0, photo3);
                    PhotoViewer photoViewer44 = this.b;
                    gl5 gl5Var9 = (gl5) photoViewer44.Z6.get(photoViewer44.O4);
                    PhotoViewer photoViewer45 = this.b;
                    photoViewer45.Z6.remove(photoViewer45.O4);
                    this.b.Z6.add(0, gl5Var9);
                    PhotoViewer photoViewer46 = this.b;
                    gl5 gl5Var10 = (gl5) photoViewer46.a7.get(photoViewer46.O4);
                    PhotoViewer photoViewer47 = this.b;
                    photoViewer47.a7.remove(photoViewer47.O4);
                    this.b.a7.add(0, gl5Var10);
                    PhotoViewer photoViewer48 = this.b;
                    Long l = (Long) photoViewer48.b7.get(photoViewer48.O4);
                    PhotoViewer photoViewer49 = this.b;
                    photoViewer49.b7.remove(photoViewer49.O4);
                    this.b.b7.add(0, l);
                    PhotoViewer photoViewer50 = this.b;
                    TLRPC.Message message2 = (TLRPC.Message) photoViewer50.c7.get(photoViewer50.O4);
                    PhotoViewer photoViewer51 = this.b;
                    photoViewer51.c7.remove(photoViewer51.O4);
                    this.b.c7.add(0, message2);
                    w97 S0 = na7.q1(this.b.U).S0(this.b.y5);
                    int i9 = 0;
                    while (true) {
                        if (i9 >= S0.b.size()) {
                            break;
                        }
                        TLRPC.Photo photo4 = (TLRPC.Photo) S0.b.get(i9);
                        if (photo4 != null && photo4.id == photo3.id) {
                            S0.c(i9);
                            break;
                        }
                        i9++;
                    }
                    PhotoViewer photoViewer52 = this.b;
                    photoViewer52.O4 = -1;
                    photoViewer52.K1(0);
                    vb5 vb5Var = this.b.m1;
                    vb5Var.d.clear();
                    vb5Var.e.clear();
                    vb5Var.c.clear();
                    this.b.m1.b();
                    PhotoViewer photoViewer53 = this.b;
                    photoViewer53.o1.m(photoViewer53.Z4 == photoViewer53.Y4 ? null : 1, 22, photoViewer53.y5);
                    gl.d3(new Runnable(this) { // from class: k78
                        public final /* synthetic */ o78 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b62 = b;
                            o78 o78Var = this.b;
                            switch (b62) {
                                case 0:
                                    r7 r7Var = o78Var.b.p0;
                                    if (r7Var != null) {
                                        r7Var.u(14);
                                        break;
                                    }
                                    break;
                                case 1:
                                    PhotoViewer photoViewer362 = o78Var.b;
                                    photoViewer362.p0.u(19);
                                    photoViewer362.p0.S(20);
                                    break;
                                default:
                                    PhotoViewer photoViewer372 = o78Var.b;
                                    photoViewer372.p0.S(19);
                                    photoViewer372.p0.u(20);
                                    break;
                            }
                        }
                    }, 300L);
                    return;
                }
                PhotoViewer photoViewer54 = this.b;
                if (photoViewer54.E == null || photoViewer54.d == null) {
                    return;
                }
                k27 k27Var15 = photoViewer54.S4;
                if (k27Var15 != null && !k27Var15.r1) {
                    long A03 = k27Var15.A0();
                    if (cf3.y(A03)) {
                        z = hc2.T(na7.q1(this.b.U).K0(Long.valueOf(-A03)));
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.b.E);
                        b0 = this.b.d.b0();
                        if (b0 == null) {
                            alertDialog$Builder3.k(k96.M0(2131754091, "AreYouSureDeletePhotoTitle"));
                            alertDialog$Builder3.f(b0);
                        } else {
                            PhotoViewer photoViewer55 = this.b;
                            if (photoViewer55.s4 || (!((gl5Var2 = photoViewer55.Z4) == null || gl5Var2 == photoViewer55.Y4) || ((k27Var2 = photoViewer55.S4) != null && k27Var2.G4()))) {
                                alertDialog$Builder3.k(k96.M0(2131754080, "AreYouSureDeleteVideoTitle"));
                                if (z) {
                                    alertDialog$Builder3.f(k96.Y(2131754081, "AreYouSureDeleteVideoEveryone", new Object[0]));
                                } else {
                                    alertDialog$Builder3.f(k96.Y(2131754082, "AreYouSureDeleteVideo", new Object[0]));
                                }
                            } else {
                                k27 k27Var16 = this.b.S4;
                                if (k27Var16 == null || !k27Var16.q3()) {
                                    alertDialog$Builder3.k(k96.M0(2131754091, "AreYouSureDeletePhotoTitle"));
                                    if (z) {
                                        alertDialog$Builder3.f(k96.Y(2131754092, "AreYouSureDeletePhotoEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.f(k96.Y(2131754093, "AreYouSureDeletePhoto", new Object[0]));
                                    }
                                } else {
                                    alertDialog$Builder3.k(k96.M0(2131754094, "AreYouSureDeleteGIFTitle"));
                                    if (z) {
                                        alertDialog$Builder3.f(k96.Y(2131754095, "AreYouSureDeleteGIFEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.f(k96.Y(2131754096, "AreYouSureDeleteGIF", new Object[0]));
                                    }
                                }
                            }
                        }
                        boolean[] zArr = new boolean[1];
                        k27Var3 = this.b.S4;
                        if (k27Var3 != null && !k27Var3.r1) {
                            A0 = k27Var3.A0();
                            if (!cf3.B(A0)) {
                                boolean D = cf3.D(A0);
                                int i10 = this.b.U;
                                if (D) {
                                    user = na7.q1(i10).V1(Long.valueOf(A0));
                                    K0 = null;
                                } else {
                                    K0 = na7.q1(i10).K0(Long.valueOf(-A0));
                                    user = null;
                                }
                                if (user != null || !hc2.T(K0)) {
                                    int currentTime = ConnectionsManager.getInstance(this.b.U).getCurrentTime();
                                    int i11 = this.b.U;
                                    int i12 = user != null ? na7.q1(i11).U2 : na7.q1(i11).T2;
                                    if ((user != null && user.id != y6c.h(this.b.U).e()) || K0 != null) {
                                        boolean z14 = user != null && na7.q1(this.b.U).V2;
                                        k27 k27Var17 = this.b.S4;
                                        TLRPC.MessageAction messageAction = k27Var17.k.action;
                                        if ((messageAction == null || (messageAction instanceof TLRPC.TL_messageActionEmpty)) && ((k27Var17.N3() || z14 || hc2.N(K0)) && currentTime - this.b.S4.k.date <= i12)) {
                                            FrameLayout frameLayout = new FrameLayout(this.b.E);
                                            TLRPC.Chat chat = K0;
                                            ag2 ag2Var = new ag2(1, this.a, this.b.E);
                                            ag2Var.setBackgroundDrawable(bkb.L0(false));
                                            if (chat != null) {
                                                ag2Var.e(k96.M0(2131751528, "DeleteForAll"), "", false, false, false);
                                                str2 = "Cancel";
                                                edVar = null;
                                                i2 = 2131752577;
                                            } else {
                                                String Y = k96.Y(2131751527, "DeleteForUser", l7c.j(user));
                                                str2 = "Cancel";
                                                edVar = null;
                                                i2 = 2131752577;
                                                ag2Var.e(Y, "", false, false, false);
                                            }
                                            ag2Var.setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                                            frameLayout.addView(ag2Var, nme.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                            ag2Var.setOnClickListener(new ge(zArr, (byte) 12));
                                            alertDialog$Builder3.n(frameLayout);
                                            alertDialog$Builder3.a.H = (byte) 9;
                                            alertDialog$Builder3.j(k96.M0(2131751586, "Delete"), new dx6(this, zArr, (byte) 20));
                                            alertDialog$Builder3.g(k96.M0(i2, str2), edVar);
                                            hd hdVar3 = alertDialog$Builder3.a;
                                            this.b.b2(alertDialog$Builder3);
                                            textView = (TextView) hdVar3.c(-1);
                                            if (textView == null) {
                                                zkb.X(textView, bkb.p7, this.b.w2);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    str2 = "Cancel";
                                    i2 = 2131752577;
                                    edVar = null;
                                    alertDialog$Builder3.j(k96.M0(2131751586, "Delete"), new dx6(this, zArr, (byte) 20));
                                    alertDialog$Builder3.g(k96.M0(i2, str2), edVar);
                                    hd hdVar32 = alertDialog$Builder3.a;
                                    this.b.b2(alertDialog$Builder3);
                                    textView = (TextView) hdVar32.c(-1);
                                    if (textView == null) {
                                    }
                                }
                            }
                        }
                        i2 = 2131752577;
                        str2 = "Cancel";
                        edVar = null;
                        alertDialog$Builder3.j(k96.M0(2131751586, "Delete"), new dx6(this, zArr, (byte) 20));
                        alertDialog$Builder3.g(k96.M0(i2, str2), edVar);
                        hd hdVar322 = alertDialog$Builder3.a;
                        this.b.b2(alertDialog$Builder3);
                        textView = (TextView) hdVar322.c(-1);
                        if (textView == null) {
                        }
                    }
                }
                z = false;
                AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(this.b.E);
                b0 = this.b.d.b0();
                if (b0 == null) {
                }
                boolean[] zArr2 = new boolean[1];
                k27Var3 = this.b.S4;
                if (k27Var3 != null) {
                    A0 = k27Var3.A0();
                    if (!cf3.B(A0)) {
                    }
                }
                i2 = 2131752577;
                str2 = "Cancel";
                edVar = null;
                alertDialog$Builder32.j(k96.M0(2131751586, "Delete"), new dx6(this, zArr2, (byte) 20));
                alertDialog$Builder32.g(k96.M0(i2, str2), edVar);
                hd hdVar3222 = alertDialog$Builder32.a;
                this.b.b2(alertDialog$Builder32);
                textView = (TextView) hdVar3222.c(-1);
                if (textView == null) {
                }
            }
        }
    }
}
