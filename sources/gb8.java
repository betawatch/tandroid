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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gb8 extends d6 {
    public final /* synthetic */ vnb a;
    public final /* synthetic */ PhotoViewer b;

    public gb8(PhotoViewer photoViewer, vnb vnbVar) {
        this.b = photoViewer;
        this.a = vnbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[RETURN] */
    @Override // d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.S4 == null && photoViewer.a5 == null) {
            if (photoViewer.Z4 != null) {
                xb4.G(photoViewer.U);
                jn5 jn5Var = photoViewer.Z4;
                File J = xb4.J(jn5Var == null ? null : jn5Var.f, PhotoViewer.n0(jn5Var), photoViewer.y5 != 0 || photoViewer.A5, true);
                File file = new File(xb4.z(4), J.getName());
                xb4.G(photoViewer.U);
                jn5 jn5Var2 = photoViewer.Z4;
                File J2 = xb4.J(jn5Var2 != null ? jn5Var2.f : null, PhotoViewer.n0(jn5Var2), false, true);
                if (!J.exists() && !file.exists() && !J2.exists()) {
                    return false;
                }
            } else if (photoViewer.i7 == null) {
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x03da, code lost:
    
        if (bp1.t(r0) != false) goto L197;
     */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0224  */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v40 */
    @Override // d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        r47 r47Var;
        TLObject tLObject;
        jn5 jn5Var;
        TLRPC.Photo photo;
        nr1 nr1Var;
        View findViewWithTag;
        boolean z;
        CharSequence c0;
        jn5 jn5Var2;
        r47 r47Var2;
        r47 r47Var3;
        int i2;
        String str;
        TextView textView;
        long A0;
        TLRPC.Chat M0;
        TLRPC.User user;
        ed8 ed8Var;
        boolean z2;
        ArrayList arrayList;
        zu1 zu1Var;
        String str2;
        boolean z3;
        r47 r47Var4;
        TLRPC.Message message;
        String str3;
        String str4;
        m47 m47Var;
        File file;
        ?? r9;
        boolean a;
        boolean z4;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        if (i == -1) {
            hc8 hc8Var = this.b.M1;
            if (hc8Var == null || !hc8Var.p0()) {
                boolean K0 = this.b.K0();
                PhotoViewer photoViewer = this.b;
                if (K0) {
                    photoViewer.y(false);
                    return;
                } else {
                    photoViewer.A(true, false);
                    return;
                }
            }
            return;
        }
        final byte b = 0;
        String str5 = null;
        r13 = null;
        File file2 = null;
        m47 m47Var2 = null;
        if (i == 2) {
            PhotoViewer photoViewer2 = this.b;
            if (photoViewer2.i7 != null && !photoViewer2.l2) {
                return;
            }
            if ((Build.VERSION.SDK_INT <= 28 || f11.b) && photoViewer2.E.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.b.E.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            final ArrayList arrayList2 = new ArrayList(1);
            PhotoViewer photoViewer3 = this.b;
            zu1 zu1Var2 = photoViewer3.k4;
            if (zu1Var2 != null) {
                str4 = "AllNMedia";
                m47Var = zu1Var2.T6(photoViewer3.S4.c1());
            } else {
                str4 = "AllNMedia";
                m47Var = null;
            }
            if (m47Var != null) {
                arrayList2.addAll(m47Var.d);
            } else {
                arrayList2.add(this.b.S4);
            }
            if (arrayList2.size() > 1) {
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    r47 r47Var5 = (r47) arrayList2.get(i3);
                    if (r47Var5.D3()) {
                        z8 = true;
                    } else if (r47Var5.G4()) {
                        z6 = true;
                    } else {
                        z7 = true;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.E, this.a);
                alertDialog$Builder.k(ob6.M0(2131745669, "SaveGroupMedia"));
                alertDialog$Builder.f(ob6.M0(2131745668, "SaveGroupMediaMessage"));
                alertDialog$Builder.a.J = aob.gh;
                r47 r47Var6 = this.b.S4;
                String M02 = (r47Var6 == null || !r47Var6.G4() || this.b.S4.D3()) ? ob6.M0(2131743794, "ThisPhoto") : ob6.M0(2131743795, "ThisMedia");
                final byte b2 = true ? (byte) 1 : (byte) 0;
                alertDialog$Builder.g(M02, new fd(this) { // from class: ya8
                    public final /* synthetic */ gb8 b;

                    {
                        this.b = this;
                    }

                    @Override // fd
                    public final void w(id idVar, int i4) {
                        File M;
                        byte b3 = b2;
                        gb8 gb8Var = this.b;
                        switch (b3) {
                            case 0:
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer4 = gb8Var.b;
                                arrayList3.add(photoViewer4.S4);
                                photoViewer4.j2(arrayList3);
                                break;
                            default:
                                PhotoViewer photoViewer5 = gb8Var.b;
                                r47 r47Var7 = photoViewer5.S4;
                                if (r47Var7 != null) {
                                    File file3 = null;
                                    if ((r47.n1(r47Var7.k) instanceof TLRPC.TL_messageMediaWebPage) && r47.n1(photoViewer5.S4.k).webpage != null && r47.n1(photoViewer5.S4.k).webpage.document == null) {
                                        TLObject m0 = photoViewer5.m0(photoViewer5.O4, null);
                                        xb4.G(photoViewer5.U);
                                        M = xb4.J(m0, null, true, true);
                                    } else {
                                        xb4.G(photoViewer5.U);
                                        M = xb4.M(photoViewer5.S4.k, false, true);
                                    }
                                    boolean K4 = r47.K4(photoViewer5.S4.k);
                                    boolean D3 = photoViewer5.S4.D3();
                                    if (D3) {
                                        TLRPC.Document document = r47.n1(photoViewer5.S4.k) != null ? r47.n1(photoViewer5.S4.k).document : null;
                                        if (document != null) {
                                            xb4.G(photoViewer5.U);
                                            File J = xb4.J(document, null, false, true);
                                            if (J == null || !J.exists()) {
                                                xb4.G(photoViewer5.U);
                                                file3 = xb4.J(document, null, true, true);
                                            } else {
                                                file3 = J;
                                            }
                                        }
                                    }
                                    if (!D3) {
                                        if (M != null && M.exists()) {
                                            MediaController.g0(M.toString(), photoViewer5.E, K4 ? 1 : 0, null, null, new bb8(gb8Var, K4, (byte) 0));
                                            break;
                                        } else {
                                            photoViewer5.d2();
                                            break;
                                        }
                                    } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                        MediaController.f0(M.toString(), file3.toString(), photoViewer5.E, new xa8(gb8Var, (byte) 1));
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
                String G = (z6 || z8) ? ob6.G(arrayList2.size(), str4, new Object[0]) : ob6.G(arrayList2.size(), "AllNPhotos", new Object[0]);
                final boolean z9 = z6;
                final boolean z10 = z7;
                final boolean z11 = z8;
                alertDialog$Builder.j(G, new fd() { // from class: db8
                    /* JADX WARN: Type inference failed for: r1v0, types: [za8] */
                    @Override // fd
                    public final void w(id idVar, int i4) {
                        File M;
                        final gb8 gb8Var = gb8.this;
                        PhotoViewer photoViewer4 = gb8Var.b;
                        final byte b3 = 1;
                        final int[] iArr = new int[1];
                        final int[] iArr2 = new int[1];
                        final boolean z12 = z9;
                        final boolean z13 = z10;
                        final boolean z14 = z11;
                        final ?? r1 = new Runnable() { // from class: za8
                            @Override // java.lang.Runnable
                            public final void run() {
                                int[] iArr3 = iArr2;
                                int i5 = iArr3[0] + 1;
                                iArr3[0] = i5;
                                int i6 = iArr[0];
                                if (i5 == i6) {
                                    ad8 ad8Var = gb8.this.b.f0;
                                    boolean z15 = z12;
                                    int i7 = (z13 ? 1 : 0) + (z15 ? 1 : 0);
                                    boolean z16 = z14;
                                    new d31(ad8Var, null).m(i7 + (z16 ? 1 : 0) > 1 ? c31.w : z16 ? i6 > 1 ? c31.s : c31.r : z15 ? i6 > 1 ? c31.n : c31.h : i6 > 1 ? c31.f : c31.e, i6, -115203550, -1, null).j();
                                }
                            }
                        };
                        final byte b4 = 0;
                        int i5 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i5 >= arrayList3.size()) {
                                return;
                            }
                            r47 r47Var7 = (r47) arrayList3.get(i5);
                            if (r47Var7 != null) {
                                File file3 = null;
                                if ((r47.n1(r47Var7.k) instanceof TLRPC.TL_messageMediaWebPage) && r47.n1(r47Var7.k).webpage != null && r47.n1(r47Var7.k).webpage.document == null) {
                                    xb4.G(photoViewer4.U);
                                    M = xb4.J(photoViewer4.m0(photoViewer4.O4, null), null, true, true);
                                } else {
                                    xb4.G(photoViewer4.U);
                                    M = xb4.M(r47Var7.k, false, true);
                                }
                                boolean K4 = r47.K4(r47Var7.k);
                                boolean D3 = r47Var7.D3();
                                if (D3) {
                                    TLRPC.Document document = r47.n1(r47Var7.k) != null ? r47.n1(r47Var7.k).document : null;
                                    if (document != null) {
                                        xb4.G(photoViewer4.U);
                                        File J = xb4.J(document, null, false, true);
                                        if (J == null || !J.exists()) {
                                            xb4.G(photoViewer4.U);
                                            file3 = xb4.J(document, null, true, true);
                                        } else {
                                            file3 = J;
                                        }
                                    }
                                }
                                if (D3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        MediaController.g0(M.toString(), photoViewer4.E, 0, null, null, new pcc() { // from class: ab8
                                            @Override // pcc
                                            public final void a(Object obj) {
                                                byte b5 = b3;
                                                za8 za8Var = r1;
                                                switch (b5) {
                                                    case 0:
                                                        hl.c3(za8Var);
                                                        break;
                                                    case 1:
                                                        hl.c3(za8Var);
                                                        break;
                                                    default:
                                                        hl.c3(za8Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        MediaController.f0(M.toString(), file3.toString(), photoViewer4.E, new pcc() { // from class: ab8
                                            @Override // pcc
                                            public final void a(Object obj) {
                                                byte b5 = b4;
                                                za8 za8Var = r1;
                                                switch (b5) {
                                                    case 0:
                                                        hl.c3(za8Var);
                                                        break;
                                                    case 1:
                                                        hl.c3(za8Var);
                                                        break;
                                                    default:
                                                        hl.c3(za8Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!D3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final byte b5 = 2;
                                    MediaController.g0(M.toString(), photoViewer4.E, K4 ? 1 : 0, null, null, new pcc() { // from class: ab8
                                        @Override // pcc
                                        public final void a(Object obj) {
                                            byte b52 = b5;
                                            za8 za8Var = r1;
                                            switch (b52) {
                                                case 0:
                                                    hl.c3(za8Var);
                                                    break;
                                                case 1:
                                                    hl.c3(za8Var);
                                                    break;
                                                default:
                                                    hl.c3(za8Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i5++;
                        }
                    }
                });
                alertDialog$Builder.h(ob6.M0(2131752570, "Cancel"), new ku7((byte) 20));
                id idVar = alertDialog$Builder.a;
                idVar.j(this.b.y0(aob.lh));
                idVar.show();
                View c = idVar.c(-3);
                if (c instanceof TextView) {
                    int i4 = aob.q7;
                    yob.X((TextView) c, i4, this.b.w2);
                    c.setBackground(aob.H0(hl.L(3.0f), this.b.y0(i4)));
                    ViewGroup viewGroup = idVar.u0;
                    if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                        c.bringToFront();
                    }
                }
                idVar.o(this.b.y0(aob.Yg));
                return;
            }
            PhotoViewer photoViewer4 = this.b;
            r47 r47Var7 = photoViewer4.S4;
            if (r47Var7 == null) {
                jn5 jn5Var3 = photoViewer4.Z4;
                if (jn5Var3 != null) {
                    String n0 = PhotoViewer.n0(jn5Var3);
                    xb4.G(this.b.U);
                    PhotoViewer photoViewer5 = this.b;
                    jn5 jn5Var4 = photoViewer5.Z4;
                    File J = xb4.J(jn5Var4 == null ? null : jn5Var4.f, n0, photoViewer5.y5 != 0 || photoViewer5.A5, true);
                    if (J != null && !J.exists()) {
                        xb4.G(this.b.U);
                        jn5 jn5Var5 = this.b.Z4;
                        J = xb4.J(jn5Var5 == null ? null : jn5Var5.f, n0, false, true);
                    }
                    if (n0 != null) {
                        n0 = n0.toLowerCase();
                    }
                    r9 = n0 != null && (n0.equals("webm") || n0.equals("mp4") || n0.equals("gif"));
                    file = J;
                } else {
                    bd8 bd8Var = photoViewer4.i7;
                    if (bd8Var != null) {
                        file = bd8Var.b(photoViewer4.O4);
                        PhotoViewer photoViewer6 = this.b;
                        a = photoViewer6.i7.a(photoViewer6.O4);
                    } else {
                        file = null;
                        r9 = 0;
                    }
                }
                if (file != null && !file.exists()) {
                    file = new File(xb4.z(4), file.getName());
                }
                r47 r47Var8 = this.b.S4;
                z4 = r47Var8 == null && r47Var8.D3();
                if (z4) {
                    TLRPC.Document document = r47.n1(this.b.S4.k) != null ? r47.n1(this.b.S4.k).document : null;
                    if (document != null) {
                        xb4.G(this.b.U);
                        file2 = xb4.K(document, false);
                        if (file2 == null || !file2.exists()) {
                            xb4.G(this.b.U);
                            file2 = xb4.K(document, true);
                        }
                    }
                }
                if (z4) {
                    if (file == null || !file.exists()) {
                        this.b.d2();
                        return;
                    } else {
                        MediaController.g0(file.toString(), this.b.E, r9, null, null, new bb8(this, r9, true ? (byte) 1 : (byte) 0));
                        return;
                    }
                }
                if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                    this.b.d2();
                    return;
                } else {
                    MediaController.f0(file.toString(), file2.toString(), this.b.E, new xa8(this, b));
                    return;
                }
            }
            if ((r47.n1(r47Var7.k) instanceof TLRPC.TL_messageMediaWebPage) && r47.n1(this.b.S4.k).webpage != null && r47.n1(this.b.S4.k).webpage.document == null) {
                PhotoViewer photoViewer7 = this.b;
                TLObject m0 = photoViewer7.m0(photoViewer7.O4, null);
                xb4.G(this.b.U);
                file = xb4.K(m0, true);
                if (!file.exists()) {
                    file = new File(xb4.z(4), file.getName());
                }
            } else {
                xb4.G(this.b.U);
                file = xb4.L(this.b.S4.k);
            }
            a = this.b.S4.G4();
            r9 = a;
            if (file != null) {
                file = new File(xb4.z(4), file.getName());
            }
            r47 r47Var82 = this.b.S4;
            if (r47Var82 == null) {
            }
            if (z4) {
            }
            if (z4) {
            }
        } else {
            if (i == 24) {
                lh2 t = lh2.t();
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                t.T(photoViewer8.j0());
                this.b.H0.performClick();
                return;
            }
            if (i == 3) {
                PhotoViewer photoViewer9 = this.b;
                if (photoViewer9.D5 != 0) {
                    photoViewer9.r4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", this.b.D5);
                    em6 em6Var = new em6(bundle, null);
                    PhotoViewer photoViewer10 = this.b;
                    zu1 zu1Var3 = photoViewer10.k4;
                    if (zu1Var3 != null) {
                        em6Var.c = zu1Var3.r8;
                    }
                    photoViewer10.A(false, false);
                    Activity activity = this.b.E;
                    if (activity instanceof LaunchActivity) {
                        ((LaunchActivity) activity).u0(em6Var, false, true);
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
                    r47 r47Var9 = photoViewer11.S4;
                    if (r47Var9 != null) {
                        j = r47Var9.A0();
                    }
                    if (wf3.B(j)) {
                        bundle2.putInt("enc_id", wf3.h(j));
                    } else if (wf3.D(j)) {
                        bundle2.putLong("user_id", j);
                    } else {
                        TLRPC.Chat M03 = uc7.s1(this.b.U).M0(Long.valueOf(-j));
                        if (M03 != null && M03.migrated_to != null) {
                            bundle2.putLong("migrated_to", j);
                            j = -M03.migrated_to.channel_id;
                        }
                        bundle2.putLong("chat_id", -j);
                    }
                    bundle2.putInt("message_id", this.b.S4.e1());
                    if (i == 21) {
                        bundle2.putInt("reply_to", this.b.S4.e1());
                    }
                    jn7.f(this.b.U).k(jn7.s, new Object[0]);
                    Activity activity2 = this.b.E;
                    if (activity2 instanceof LaunchActivity) {
                        LaunchActivity launchActivity = (LaunchActivity) activity2;
                        boolean z12 = launchActivity.R() > 1 || hl.O1();
                        zu1 zu1Var4 = new zu1(bundle2);
                        ed8 ed8Var2 = this.b.d;
                        if (ed8Var2 != null) {
                            ed8Var2.Y(zu1Var4);
                        }
                        launchActivity.u0(zu1Var4, z12, true);
                    }
                    this.b.A(false, false);
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
                if (photoViewer13.l4 == null || photoViewer13.d == null || (r47Var4 = photoViewer13.S4) == null || (message = r47Var4.k) == null) {
                    return;
                }
                if (!TextUtils.isEmpty(message.attachPath)) {
                    str3 = this.b.S4.k.attachPath;
                    if (!TextUtils.isEmpty(str3)) {
                    }
                }
                str3 = null;
                if (TextUtils.isEmpty(str3)) {
                    xb4.G(this.b.U);
                    File N = xb4.N(this.b.S4.k);
                    if (N != null && N.exists()) {
                        str3 = N.getAbsolutePath();
                    }
                }
                String str6 = str3;
                if (TextUtils.isEmpty(str6)) {
                    return;
                }
                zu1 zu1Var5 = this.b.k4;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new no6(0, str6, 0, false, 0, 0));
                this.b.o1(arrayList3, 0, 11, false, new eb8(), zu1Var5);
                this.b.U(null, null, false, null);
                this.b.u1();
                rw2.e().T = null;
                return;
            }
            if (i == 4) {
                PhotoViewer photoViewer14 = this.b;
                r47 r47Var10 = photoViewer14.S4;
                if (r47Var10 == null || !(photoViewer14.E instanceof LaunchActivity)) {
                    return;
                }
                if (!r47Var10.r1) {
                    long A02 = r47Var10.A0();
                    if (wf3.y(A02)) {
                        z2 = xc2.V(uc7.s1(this.b.U).M0(Long.valueOf(-A02)));
                        PhotoViewer photoViewer15 = this.b;
                        ((LaunchActivity) photoViewer15.E).N0(photoViewer15.S4.K1);
                        arrayList = new ArrayList(1);
                        PhotoViewer photoViewer16 = this.b;
                        zu1Var = photoViewer16.k4;
                        if (zu1Var == null) {
                            str2 = "AllNMedia";
                            m47Var2 = zu1Var.T6(photoViewer16.S4.c1());
                        } else {
                            str2 = "AllNMedia";
                        }
                        if (m47Var2 == null) {
                            arrayList.addAll(m47Var2.d);
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
                            uj3 uj3Var = new uj3(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(this.b.S4);
                            PhotoViewer photoViewer17 = this.b;
                            uj3Var.E2 = new o48(this, arrayList4, photoViewer17.k4, (byte) 2);
                            ((LaunchActivity) photoViewer17.E).u0(uj3Var, false, true);
                            this.b.A(false, false);
                            return;
                        }
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            if (!((r47) arrayList.get(i5)).Q3() || ((r47) arrayList.get(i5)).G4()) {
                                z3 = false;
                                break;
                            }
                        }
                        z3 = true;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.E, this.a);
                        alertDialog$Builder2.k(ob6.M0(2131750545, "ForwardGroupMedia"));
                        alertDialog$Builder2.f(ob6.M0(2131750544, "ForwardGroupMediaMessage"));
                        alertDialog$Builder2.a.J = aob.gh;
                        alertDialog$Builder2.g(z3 ? ob6.M0(2131743794, "ThisPhoto") : ob6.M0(2131743795, "ThisMedia"), new fd(this) { // from class: ya8
                            public final /* synthetic */ gb8 b;

                            {
                                this.b = this;
                            }

                            @Override // fd
                            public final void w(id idVar2, int i42) {
                                File M;
                                byte b3 = b;
                                gb8 gb8Var = this.b;
                                switch (b3) {
                                    case 0:
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer42 = gb8Var.b;
                                        arrayList32.add(photoViewer42.S4);
                                        photoViewer42.j2(arrayList32);
                                        break;
                                    default:
                                        PhotoViewer photoViewer52 = gb8Var.b;
                                        r47 r47Var72 = photoViewer52.S4;
                                        if (r47Var72 != null) {
                                            File file3 = null;
                                            if ((r47.n1(r47Var72.k) instanceof TLRPC.TL_messageMediaWebPage) && r47.n1(photoViewer52.S4.k).webpage != null && r47.n1(photoViewer52.S4.k).webpage.document == null) {
                                                TLObject m02 = photoViewer52.m0(photoViewer52.O4, null);
                                                xb4.G(photoViewer52.U);
                                                M = xb4.J(m02, null, true, true);
                                            } else {
                                                xb4.G(photoViewer52.U);
                                                M = xb4.M(photoViewer52.S4.k, false, true);
                                            }
                                            boolean K4 = r47.K4(photoViewer52.S4.k);
                                            boolean D3 = photoViewer52.S4.D3();
                                            if (D3) {
                                                TLRPC.Document document2 = r47.n1(photoViewer52.S4.k) != null ? r47.n1(photoViewer52.S4.k).document : null;
                                                if (document2 != null) {
                                                    xb4.G(photoViewer52.U);
                                                    File J2 = xb4.J(document2, null, false, true);
                                                    if (J2 == null || !J2.exists()) {
                                                        xb4.G(photoViewer52.U);
                                                        file3 = xb4.J(document2, null, true, true);
                                                    } else {
                                                        file3 = J2;
                                                    }
                                                }
                                            }
                                            if (!D3) {
                                                if (M != null && M.exists()) {
                                                    MediaController.g0(M.toString(), photoViewer52.E, K4 ? 1 : 0, null, null, new bb8(gb8Var, K4, (byte) 0));
                                                    break;
                                                } else {
                                                    photoViewer52.d2();
                                                    break;
                                                }
                                            } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                                MediaController.f0(M.toString(), file3.toString(), photoViewer52.E, new xa8(gb8Var, (byte) 1));
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
                        alertDialog$Builder2.j(z3 ? ob6.G(arrayList.size(), "AllNPhotos", new Object[0]) : ob6.G(arrayList.size(), str2, new Object[0]), new m88(this, arrayList, (byte) 4));
                        alertDialog$Builder2.h(ob6.M0(2131752570, "Cancel"), new ku7((byte) 21));
                        id idVar2 = alertDialog$Builder2.a;
                        idVar2.j(this.b.y0(aob.lh));
                        idVar2.show();
                        View c2 = idVar2.c(-3);
                        if (c2 instanceof TextView) {
                            int i6 = aob.q7;
                            yob.X((TextView) c2, i6, this.b.w2);
                            c2.setBackground(aob.H0(hl.L(3.0f), this.b.y0(i6)));
                            ViewGroup viewGroup2 = idVar2.u0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                c2.bringToFront();
                            }
                        }
                        idVar2.o(this.b.y0(aob.Yg));
                        return;
                    }
                }
                z2 = false;
                PhotoViewer photoViewer152 = this.b;
                ((LaunchActivity) photoViewer152.E).N0(photoViewer152.S4.K1);
                arrayList = new ArrayList(1);
                PhotoViewer photoViewer162 = this.b;
                zu1Var = photoViewer162.k4;
                if (zu1Var == null) {
                }
                if (m47Var2 == null) {
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
                    if (photoViewer19.E == null || (ed8Var = photoViewer19.d) == null) {
                        return;
                    }
                    ed8Var.I();
                    this.b.A(true, false);
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
                                m01.u(photoViewer21.E, r47.n1(photoViewer21.S4.k).webpage.url);
                                this.b.A(false, false);
                                return;
                            }
                            r47 r47Var11 = photoViewer21.S4;
                            if (r47Var11 == null) {
                                bd8 bd8Var2 = photoViewer21.i7;
                                if (bd8Var2 != null) {
                                    boolean t2 = hl.t2(bd8Var2.d(photoViewer21.O4), this.b.E);
                                    PhotoViewer photoViewer22 = this.b;
                                    if (t2) {
                                        photoViewer22.A(false, false);
                                        return;
                                    } else {
                                        photoViewer22.d2();
                                        return;
                                    }
                                }
                                return;
                            }
                            Activity activity3 = photoViewer21.E;
                            vnb vnbVar = this.a;
                            if (!r47Var11.G4() && !this.b.S4.Q3() && !this.b.S4.s4()) {
                                z5 = false;
                            }
                            boolean r2 = hl.r2(r47Var11, activity3, vnbVar, z5);
                            PhotoViewer photoViewer23 = this.b;
                            if (r2) {
                                photoViewer23.A(false, false);
                                return;
                            } else {
                                photoViewer23.d2();
                                return;
                            }
                        } catch (Exception e) {
                            cc4.f(e);
                            return;
                        }
                    }
                    if (i == 11 || i == 13) {
                        PhotoViewer photoViewer24 = this.b;
                        if (photoViewer24.E == null || (r47Var = photoViewer24.S4) == null) {
                            return;
                        }
                        boolean z13 = r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaPhoto;
                        r47 r47Var12 = this.b.S4;
                        if (z13) {
                            tLObject = r47.n1(r47Var12.k).photo;
                        } else if (!(r47.n1(r47Var12.k) instanceof TLRPC.TL_messageMediaDocument)) {
                            return;
                        } else {
                            tLObject = r47.n1(this.b.S4.k).document;
                        }
                        TLObject tLObject2 = tLObject;
                        PhotoViewer photoViewer25 = this.b;
                        PhotoViewer photoViewer26 = this.b;
                        photoViewer25.U3 = new fb8(this, photoViewer26.E, photoViewer26.S4, tLObject2, this.a);
                        this.b.U3.show();
                        return;
                    }
                    byte b3 = 6;
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
                                PhotoViewer.k9.L();
                            }
                            this.b.J3 = true;
                            PhotoViewer.k9 = PhotoViewer.j9;
                            PhotoViewer.j9 = null;
                            PhotoViewer photoViewer28 = this.b;
                            photoViewer28.e = false;
                            photoViewer28.f = false;
                            fd8 fd8Var = photoViewer28.c5;
                            if (fd8Var != null) {
                                ImageReceiver imageReceiver = fd8Var.a;
                                if (!imageReceiver.R0) {
                                    imageReceiver.v0(true, true);
                                }
                            }
                            PhotoViewer photoViewer29 = this.b;
                            photoViewer29.l6 = 1.0f;
                            photoViewer29.f0.invalidate();
                            this.b.O();
                            return;
                        }
                        return;
                    }
                    if (i == 8) {
                        PhotoViewer photoViewer30 = this.b;
                        if (photoViewer30.S4 != null) {
                            xb4.G(photoViewer30.U).d(this.b.S4.F0());
                            this.b.w1(false);
                            this.b.j0.setTag(r2);
                            this.b.j0.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    if (i == 12) {
                        PhotoViewer photoViewer31 = this.b;
                        r47 r47Var13 = photoViewer31.S4;
                        if (r47Var13 != null) {
                            TLRPC.Document F0 = r47Var13.F0();
                            PhotoViewer photoViewer32 = this.b;
                            zu1 zu1Var6 = photoViewer32.k4;
                            if (zu1Var6 == null || (nr1Var = zu1Var6.a0) == null) {
                                ls6.d0(photoViewer32.U).c(F0, (int) (System.currentTimeMillis() / 1000), true);
                            } else {
                                nr1Var.i(F0);
                            }
                            uc7.s1(this.b.U).E4(this.b.S4, F0);
                        } else {
                            bd8 bd8Var3 = photoViewer31.i7;
                            if (bd8Var3 == null) {
                                return;
                            }
                            TLObject d = bd8Var3.d(photoViewer31.O4);
                            if (d instanceof TLRPC.Document) {
                                TLRPC.Document document2 = (TLRPC.Document) d;
                                ls6.d0(this.b.U).c(document2, (int) (System.currentTimeMillis() / 1000), true);
                                uc7.s1(this.b.U).E4(this.b.i7.g(), document2);
                            }
                        }
                        ad8 ad8Var = this.b.f0;
                        if (ad8Var != null) {
                            d31.a0(ad8Var, this.a).o(c31.E, this.a).j();
                            return;
                        }
                        return;
                    }
                    if (i != 14) {
                        if (i == 15) {
                            xb4.G(this.b.U);
                            jn5 jn5Var6 = this.b.Z4;
                            File J2 = xb4.J(jn5Var6 == null ? null : jn5Var6.f, PhotoViewer.n0(jn5Var6), true, true);
                            PhotoViewer photoViewer33 = this.b;
                            boolean z14 = photoViewer33.Z4.p == 2;
                            if (z14) {
                                xb4.G(photoViewer33.U);
                                jn5 jn5Var7 = this.b.Y4;
                                str5 = xb4.J(jn5Var7 != null ? jn5Var7.f : null, PhotoViewer.n0(jn5Var7), true, true).getAbsolutePath();
                            }
                            this.b.d.g(J2.getAbsolutePath(), str5, z14);
                            return;
                        }
                        if (i == 19) {
                            PhotoViewer photoViewer34 = this.b;
                            int i7 = photoViewer34.P4;
                            if (i7 < 0 || i7 >= photoViewer34.X6.size()) {
                                return;
                            }
                            PhotoViewer photoViewer35 = this.b;
                            r47 r47Var14 = (r47) photoViewer35.X6.get(photoViewer35.P4);
                            this.b.m5 = true;
                            final byte b4 = true ? (byte) 1 : (byte) 0;
                            hl.d3(new Runnable(this) { // from class: cb8
                                public final /* synthetic */ gb8 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b5 = b4;
                                    gb8 gb8Var = this.b;
                                    switch (b5) {
                                        case 0:
                                            s7 s7Var = gb8Var.b.p0;
                                            if (s7Var != null) {
                                                s7Var.u(14);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            PhotoViewer photoViewer36 = gb8Var.b;
                                            photoViewer36.p0.u(19);
                                            photoViewer36.p0.S(20);
                                            break;
                                        default:
                                            PhotoViewer photoViewer37 = gb8Var.b;
                                            photoViewer37.p0.S(19);
                                            photoViewer37.p0.u(20);
                                            break;
                                    }
                                }
                            }, 32L);
                            this.b.F2();
                            uc7.s1(this.b.U).i4.L(r47Var14, new na8(this.b, b3));
                            return;
                        }
                        if (i == 20) {
                            this.b.m5 = false;
                            final byte b5 = 2;
                            hl.d3(new Runnable(this) { // from class: cb8
                                public final /* synthetic */ gb8 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b52 = b5;
                                    gb8 gb8Var = this.b;
                                    switch (b52) {
                                        case 0:
                                            s7 s7Var = gb8Var.b.p0;
                                            if (s7Var != null) {
                                                s7Var.u(14);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            PhotoViewer photoViewer36 = gb8Var.b;
                                            photoViewer36.p0.u(19);
                                            photoViewer36.p0.S(20);
                                            break;
                                        default:
                                            PhotoViewer photoViewer37 = gb8Var.b;
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
                            lfc lfcVar = this.b.k7;
                            if (lfcVar != null) {
                                lfcVar.d();
                                return;
                            }
                            return;
                        }
                        if (i != 22) {
                            if (i == 23) {
                                PhotoViewer photoViewer36 = this.b;
                                jn5 jn5Var8 = photoViewer36.Y4;
                                TLRPC.Photo photo2 = ((jn5Var8 == null || (photo = jn5Var8.l) == null) && ((jn5Var = photoViewer36.Z4) == null || (photo = jn5Var.l) == null)) ? null : photo;
                                if (photo2 != null) {
                                    jj.G(photoViewer36.U, photoViewer36.y5, new x53(), photoViewer36.E, photo2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        PhotoViewer photoViewer37 = this.b;
                        boolean z15 = !photoViewer37.Z2;
                        photoViewer37.Z2 = z15;
                        kfc.m0(photoViewer37.S4, z15);
                        PhotoViewer photoViewer38 = this.b;
                        kfc kfcVar = photoViewer38.G2;
                        if (kfcVar != null) {
                            kfcVar.r0(photoViewer38.Z2);
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
                    TLRPC.PhotoSize u = xb4.u(800, photo3.sizes);
                    TLRPC.PhotoSize u2 = xb4.u(90, photo3.sizes);
                    yac h = yac.h(this.b.U);
                    PhotoViewer photoViewer42 = this.b;
                    if (photoViewer42.y5 == h.n) {
                        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                        tL_inputPhoto.id = photo3.id;
                        tL_inputPhoto.access_hash = photo3.access_hash;
                        tL_inputPhoto.file_reference = photo3.file_reference;
                        ConnectionsManager.getInstance(this.b.U).sendRequest(tL_photos_updateProfilePhoto, new m65(this, h, photo3, (byte) 28));
                        TLRPC.User X1 = uc7.s1(this.b.U).X1(Long.valueOf(h.n));
                        if (X1 != null) {
                            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                            userProfilePhoto.photo_id = photo3.id;
                            userProfilePhoto.dc_id = photo3.dc_id;
                            userProfilePhoto.photo_small = u2.location;
                            userProfilePhoto.photo_big = u.location;
                            h.v(X1);
                            h.u(true);
                            jn7.f(this.b.U).k(jn7.j0, new Object[0]);
                        }
                    } else {
                        TLRPC.Chat M04 = uc7.s1(photoViewer42.U).M0(Long.valueOf(-this.b.y5));
                        if (M04 == null) {
                            return;
                        }
                        TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                        TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                        tL_inputChatPhoto.id = tL_inputPhoto2;
                        tL_inputPhoto2.id = photo3.id;
                        tL_inputPhoto2.access_hash = photo3.access_hash;
                        tL_inputPhoto2.file_reference = photo3.file_reference;
                        uc7.s1(this.b.U).z(-this.b.y5, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                        TLRPC.ChatPhoto chatPhoto = M04.photo;
                        chatPhoto.dc_id = photo3.dc_id;
                        chatPhoto.photo_small = u2.location;
                        chatPhoto.photo_big = u.location;
                        jn7.f(this.b.U).k(2, 2);
                    }
                    this.b.g7 = jn5.i(u, photo3);
                    PhotoViewer photoViewer43 = this.b;
                    photoViewer43.e7.remove(photoViewer43.O4);
                    this.b.e7.add(0, photo3);
                    PhotoViewer photoViewer44 = this.b;
                    jn5 jn5Var9 = (jn5) photoViewer44.Z6.get(photoViewer44.O4);
                    PhotoViewer photoViewer45 = this.b;
                    photoViewer45.Z6.remove(photoViewer45.O4);
                    this.b.Z6.add(0, jn5Var9);
                    PhotoViewer photoViewer46 = this.b;
                    jn5 jn5Var10 = (jn5) photoViewer46.a7.get(photoViewer46.O4);
                    PhotoViewer photoViewer47 = this.b;
                    photoViewer47.a7.remove(photoViewer47.O4);
                    this.b.a7.add(0, jn5Var10);
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
                    dc7 U0 = uc7.s1(this.b.U).U0(this.b.y5);
                    int i8 = 0;
                    while (true) {
                        if (i8 >= U0.b.size()) {
                            break;
                        }
                        TLRPC.Photo photo4 = (TLRPC.Photo) U0.b.get(i8);
                        if (photo4 != null && photo4.id == photo3.id) {
                            U0.c(i8);
                            break;
                        }
                        i8++;
                    }
                    PhotoViewer photoViewer52 = this.b;
                    photoViewer52.O4 = -1;
                    photoViewer52.K1(0);
                    wd5 wd5Var = this.b.m1;
                    wd5Var.d.clear();
                    wd5Var.e.clear();
                    wd5Var.c.clear();
                    this.b.m1.b();
                    PhotoViewer photoViewer53 = this.b;
                    photoViewer53.o1.m(photoViewer53.y5, photoViewer53.Z4 == photoViewer53.Y4 ? null : 1, 22);
                    hl.d3(new Runnable(this) { // from class: cb8
                        public final /* synthetic */ gb8 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b52 = b;
                            gb8 gb8Var = this.b;
                            switch (b52) {
                                case 0:
                                    s7 s7Var = gb8Var.b.p0;
                                    if (s7Var != null) {
                                        s7Var.u(14);
                                        break;
                                    }
                                    break;
                                case 1:
                                    PhotoViewer photoViewer362 = gb8Var.b;
                                    photoViewer362.p0.u(19);
                                    photoViewer362.p0.S(20);
                                    break;
                                default:
                                    PhotoViewer photoViewer372 = gb8Var.b;
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
                r47 r47Var15 = photoViewer54.S4;
                if (r47Var15 != null && !r47Var15.r1) {
                    long A03 = r47Var15.A0();
                    if (wf3.y(A03)) {
                        z = xc2.T(uc7.s1(this.b.U).M0(Long.valueOf(-A03)));
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.b.E);
                        c0 = this.b.d.c0();
                        if (c0 == null) {
                            alertDialog$Builder3.k(ob6.M0(2131754087, "AreYouSureDeletePhotoTitle"));
                            alertDialog$Builder3.f(c0);
                        } else {
                            PhotoViewer photoViewer55 = this.b;
                            if (photoViewer55.s4 || (!((jn5Var2 = photoViewer55.Z4) == null || jn5Var2 == photoViewer55.Y4) || ((r47Var2 = photoViewer55.S4) != null && r47Var2.G4()))) {
                                alertDialog$Builder3.k(ob6.M0(2131754076, "AreYouSureDeleteVideoTitle"));
                                if (z) {
                                    alertDialog$Builder3.f(ob6.Y(2131754077, "AreYouSureDeleteVideoEveryone", new Object[0]));
                                } else {
                                    alertDialog$Builder3.f(ob6.Y(2131754078, "AreYouSureDeleteVideo", new Object[0]));
                                }
                            } else {
                                r47 r47Var16 = this.b.S4;
                                if (r47Var16 == null || !r47Var16.q3()) {
                                    alertDialog$Builder3.k(ob6.M0(2131754087, "AreYouSureDeletePhotoTitle"));
                                    if (z) {
                                        alertDialog$Builder3.f(ob6.Y(2131754088, "AreYouSureDeletePhotoEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.f(ob6.Y(2131754089, "AreYouSureDeletePhoto", new Object[0]));
                                    }
                                } else {
                                    alertDialog$Builder3.k(ob6.M0(2131754090, "AreYouSureDeleteGIFTitle"));
                                    if (z) {
                                        alertDialog$Builder3.f(ob6.Y(2131754091, "AreYouSureDeleteGIFEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.f(ob6.Y(2131754092, "AreYouSureDeleteGIF", new Object[0]));
                                    }
                                }
                            }
                        }
                        boolean[] zArr = new boolean[1];
                        r47Var3 = this.b.S4;
                        if (r47Var3 != null && !r47Var3.r1) {
                            A0 = r47Var3.A0();
                            if (!wf3.B(A0)) {
                                boolean D = wf3.D(A0);
                                int i9 = this.b.U;
                                if (D) {
                                    user = uc7.s1(i9).X1(Long.valueOf(A0));
                                    M0 = null;
                                } else {
                                    M0 = uc7.s1(i9).M0(Long.valueOf(-A0));
                                    user = null;
                                }
                                if (user != null || !xc2.T(M0)) {
                                    int currentTime = ConnectionsManager.getInstance(this.b.U).getCurrentTime();
                                    int i10 = this.b.U;
                                    int i11 = user != null ? uc7.s1(i10).U2 : uc7.s1(i10).T2;
                                    if ((user != null && user.id != yac.h(this.b.U).e()) || M0 != null) {
                                        boolean z16 = user != null && uc7.s1(this.b.U).V2;
                                        r47 r47Var17 = this.b.S4;
                                        TLRPC.MessageAction messageAction = r47Var17.k.action;
                                        if ((messageAction == null || (messageAction instanceof TLRPC.TL_messageActionEmpty)) && ((r47Var17.N3() || z16 || xc2.N(M0)) && currentTime - this.b.S4.k.date <= i11)) {
                                            FrameLayout frameLayout = new FrameLayout(this.b.E);
                                            sg2 sg2Var = new sg2(1, this.a, this.b.E);
                                            sg2Var.setBackgroundDrawable(aob.L0(false));
                                            if (M0 != null) {
                                                sg2Var.e(ob6.M0(2131751505, "DeleteForAll"), "", false, false, false);
                                                str = "Cancel";
                                                i2 = 2131752570;
                                            } else {
                                                Object[] objArr = {lbc.j(user)};
                                                str = "Cancel";
                                                i2 = 2131752570;
                                                sg2Var.e(ob6.Y(2131751504, "DeleteForUser", objArr), "", false, false, false);
                                            }
                                            sg2Var.setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                                            frameLayout.addView(sg2Var, tre.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                            sg2Var.setOnClickListener(new de(zArr, (byte) 12));
                                            alertDialog$Builder3.n(frameLayout);
                                            alertDialog$Builder3.a.H = (byte) 9;
                                            alertDialog$Builder3.j(ob6.M0(2131751563, "Delete"), new m88(this, zArr, (byte) 5));
                                            alertDialog$Builder3.g(ob6.M0(i2, str), null);
                                            id idVar3 = alertDialog$Builder3.a;
                                            this.b.b2(alertDialog$Builder3);
                                            textView = (TextView) idVar3.c(-1);
                                            if (textView == null) {
                                                yob.X(textView, aob.q7, this.b.w2);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    str = "Cancel";
                                    i2 = 2131752570;
                                    alertDialog$Builder3.j(ob6.M0(2131751563, "Delete"), new m88(this, zArr, (byte) 5));
                                    alertDialog$Builder3.g(ob6.M0(i2, str), null);
                                    id idVar32 = alertDialog$Builder3.a;
                                    this.b.b2(alertDialog$Builder3);
                                    textView = (TextView) idVar32.c(-1);
                                    if (textView == null) {
                                    }
                                }
                            }
                        }
                        i2 = 2131752570;
                        str = "Cancel";
                        alertDialog$Builder3.j(ob6.M0(2131751563, "Delete"), new m88(this, zArr, (byte) 5));
                        alertDialog$Builder3.g(ob6.M0(i2, str), null);
                        id idVar322 = alertDialog$Builder3.a;
                        this.b.b2(alertDialog$Builder3);
                        textView = (TextView) idVar322.c(-1);
                        if (textView == null) {
                        }
                    }
                }
                z = false;
                AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(this.b.E);
                c0 = this.b.d.c0();
                if (c0 == null) {
                }
                boolean[] zArr2 = new boolean[1];
                r47Var3 = this.b.S4;
                if (r47Var3 != null) {
                    A0 = r47Var3.A0();
                    if (!wf3.B(A0)) {
                    }
                }
                i2 = 2131752570;
                str = "Cancel";
                alertDialog$Builder32.j(ob6.M0(2131751563, "Delete"), new m88(this, zArr2, (byte) 5));
                alertDialog$Builder32.g(ob6.M0(i2, str), null);
                id idVar3222 = alertDialog$Builder32.a;
                this.b.b2(alertDialog$Builder32);
                textView = (TextView) idVar3222.c(-1);
                if (textView == null) {
                }
            }
        }
    }
}
