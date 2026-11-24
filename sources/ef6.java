// default package

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef6 implements k8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gk7 b;

    public /* synthetic */ ef6(gk7 gk7Var, byte b) {
        this.a = b;
        this.b = gk7Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:114|(11:116|117|118|119|(1:121)(2:132|(1:134)(2:(1:169)(6:140|(1:150)|151|(2:153|(1:155)(2:156|(1:158)))|159|(2:161|(1:163))(2:165|(1:168)))|164))|122|123|124|125|(1:127)|128)|172|119|(0)(0)|122|123|124|125|(0)|128) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0293  */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // k8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        boolean z;
        final String str;
        final boolean z2;
        k27 k27Var;
        k27 k27Var2;
        boolean z3;
        xw0 xw0Var;
        int i3;
        fk2 fk2Var;
        byte b = this.a;
        byte b2 = 3;
        gk7 gk7Var = this.b;
        switch (b) {
            case 0:
                lf6 lf6Var = (lf6) gk7Var;
                Long l = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                l46 l46Var = lf6Var.n;
                mf6 mf6Var = lf6Var.h0;
                lf6Var.g0 = null;
                lf6Var.f0 = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l.longValue() != 0 && (mf6Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i4 = 0; i4 < 4; i4++) {
                            y6c h = y6c.h(i4);
                            if (h.o() && h.e() == l.longValue() && ConnectionsManager.getInstance(i4).isTestBackend() == mf6Var.F) {
                                if (y6c.t0 != i4) {
                                    ((LaunchActivity) mf6Var.getParentActivity()).N0(i4);
                                }
                                mf6Var.finishFragment();
                                mf6Var.x1(false, true);
                                break;
                            }
                        }
                    }
                    if (str2 != null) {
                        if (!str2.contains("SESSION_PASSWORD_NEEDED")) {
                            boolean z4 = w01.a;
                            u21.b0(mf6Var).f0(str2, false);
                            break;
                        } else {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i = ((d) mf6Var).currentAccount;
                            ConnectionsManager.getInstance(i).sendRequest(getpassword, new ff6(lf6Var, (byte) 1), 10);
                        }
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        mf6Var.B1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (l46Var != null && "CANCELLED".equals(str2)) {
                    l46Var.setText(gl.E2(gl.O2(k96.M0(2131744669, null), -1, 0, new bf6(lf6Var, b2), null), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) gk7Var;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.f9;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    fx0 fx0Var = new fx0(1, photoViewer.w2, (Context) photoViewer.E, false);
                    fx0Var.s0(-14933463);
                    fx0Var.L(-14933463);
                    if (url.startsWith("video?")) {
                        try {
                            i2 = Integer.parseInt(url.substring(url.indexOf(63) + 1));
                        } catch (Throwable unused) {
                        }
                        if (!url.startsWith("mailto:")) {
                            str = url.substring(7);
                            z2 = false;
                            z3 = 1;
                        } else if (url.startsWith("tel:")) {
                            str = url.substring(4);
                            z2 = true;
                            z3 = 1;
                        } else {
                            if (i2 < 0 || (k27Var = photoViewer.T4) == null || k27Var.r1) {
                                z = true;
                            } else {
                                if (!k27.K4(k27Var.k) && !photoViewer.T4.g4() && !k27.Q4(photoViewer.T4.k) && !photoViewer.T4.I3() && (k27Var2 = photoViewer.T4.C) != null) {
                                    k27Var = k27Var2;
                                }
                                long B0 = k27.B0(k27Var.k);
                                int e1 = k27Var.e1();
                                TLRPC.MessageFwdHeader messageFwdHeader = k27Var.k.fwd_from;
                                if (messageFwdHeader != null) {
                                    TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                    if (peer != null) {
                                        B0 = k27.B1(peer);
                                        e1 = k27Var.k.fwd_from.saved_from_msg_id;
                                    } else {
                                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                        if (peer2 != null) {
                                            B0 = k27.B1(peer2);
                                            e1 = k27Var.k.fwd_from.channel_post;
                                        }
                                    }
                                }
                                boolean y = cf3.y(B0);
                                int i5 = photoViewer.U;
                                boolean z5 = true;
                                if (y) {
                                    String K = hc2.K(na7.q1(i5).K0(Long.valueOf(-B0)), false);
                                    z = z5;
                                    if (K != null) {
                                        url = "https://t.me/" + K + "/" + e1 + "?t=" + gl.n0(i2);
                                        z = z5;
                                    }
                                } else {
                                    TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(B0));
                                    String o = l7c.o(V1);
                                    z = z5;
                                    z = z5;
                                    if (V1 != null && o != null) {
                                        url = "https://t.me/" + o + "/" + e1 + "?t=" + gl.n0(i2);
                                        z = z5;
                                    }
                                }
                            }
                            str = url;
                            z2 = false;
                            z3 = z;
                        }
                        fx0Var.P = str;
                        fx0Var.Q = false;
                        String M0 = k96.M0(2131747624, null);
                        String M02 = k96.M0(2131751750, null);
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        charSequenceArr[0] = M0;
                        charSequenceArr[z3] = M02;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: u68
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i6) {
                                Drawable[] drawableArr2 = PhotoViewer.f9;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                if (i6 == 0) {
                                    photoViewer2.a1(clickableSpan, textView);
                                    return;
                                }
                                if (i6 == 1) {
                                    String str3 = str;
                                    gl.g(str3);
                                    String M03 = z2 ? k96.M0(2131747102, "PhoneCopied") : str3.startsWith("#") ? k96.M0(2131749170, "HashtagCopied") : str3.startsWith("@") ? k96.M0(2131743426, "UsernameCopied") : k96.M0(2131748729, "LinkCopied");
                                    if (gl.D3()) {
                                        new u21(photoViewer2.f0, photoViewer2.w2).Q(R.raw.voip_invite, 36, M03).j();
                                    }
                                }
                            }
                        };
                        fx0Var.M = charSequenceArr;
                        fx0Var.L = onClickListener;
                        fx0Var.I0 = new ne(runnable, (byte) 2);
                        fx0Var.w = z3;
                        fx0Var.show();
                        photoViewer.f0.performHapticFeedback(0, 2);
                        fx0Var.w0(0, -1, -1);
                        fx0Var.w0(1, -1, -1);
                        fx0Var.s0(-14933463);
                        xw0Var = fx0Var.m0;
                        if (xw0Var != null) {
                            xw0Var.setTextColor(-7697782);
                        }
                        fx0Var.i0 = true;
                        fx0Var.n = true;
                        gl.p3(fx0Var, -14933463, false, null);
                        gl.j3(fx0Var, false);
                        fx0Var.w = true;
                        break;
                    }
                    i2 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    fx0Var.P = str;
                    fx0Var.Q = false;
                    String M03 = k96.M0(2131747624, null);
                    String M022 = k96.M0(2131751750, null);
                    CharSequence[] charSequenceArr2 = new CharSequence[2];
                    charSequenceArr2[0] = M03;
                    charSequenceArr2[z3] = M022;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: u68
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i6) {
                            Drawable[] drawableArr2 = PhotoViewer.f9;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            if (i6 == 0) {
                                photoViewer2.a1(clickableSpan, textView);
                                return;
                            }
                            if (i6 == 1) {
                                String str3 = str;
                                gl.g(str3);
                                String M032 = z2 ? k96.M0(2131747102, "PhoneCopied") : str3.startsWith("#") ? k96.M0(2131749170, "HashtagCopied") : str3.startsWith("@") ? k96.M0(2131743426, "UsernameCopied") : k96.M0(2131748729, "LinkCopied");
                                if (gl.D3()) {
                                    new u21(photoViewer2.f0, photoViewer2.w2).Q(R.raw.voip_invite, 36, M032).j();
                                }
                            }
                        }
                    };
                    fx0Var.M = charSequenceArr2;
                    fx0Var.L = onClickListener2;
                    fx0Var.I0 = new ne(runnable, (byte) 2);
                    fx0Var.w = z3;
                    fx0Var.show();
                    photoViewer.f0.performHapticFeedback(0, 2);
                    fx0Var.w0(0, -1, -1);
                    fx0Var.w0(1, -1, -1);
                    fx0Var.s0(-14933463);
                    xw0Var = fx0Var.m0;
                    if (xw0Var != null) {
                    }
                    fx0Var.i0 = true;
                    fx0Var.n = true;
                    gl.p3(fx0Var, -14933463, false, null);
                    gl.j3(fx0Var, false);
                    fx0Var.w = true;
                } else if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                t7b t7bVar = (t7b) gk7Var;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (t7bVar.g0 == 0 && arrayList != null && !arrayList.isEmpty() && t7bVar.q2 == null && !t7bVar.X && t7bVar.H()) {
                    t7bVar.I1 = null;
                    t7bVar.J1 = null;
                    t7bVar.K1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + t7bVar.B0.getFilledCount() > t7bVar.B0.getTotalCount()) {
                            int size = arrayList.size() + t7bVar.B0.getFilledCount();
                            ArrayList a = fk2.a();
                            int size2 = a.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 < size2) {
                                    Object obj4 = a.get(i6);
                                    i6++;
                                    fk2Var = (fk2) obj4;
                                    if (fk2Var.e.size() >= size) {
                                    }
                                } else {
                                    fk2Var = null;
                                }
                            }
                            h7b h7bVar = t7bVar.B0;
                            if (fk2Var == null) {
                                h7bVar.o(null);
                                t7bVar.B0.b();
                                t7bVar.J0.setSelected((fk2) null);
                                y6b y6bVar = t7bVar.C0;
                                if (y6bVar != null) {
                                    y6bVar.recordHevc = !t7bVar.B0.i();
                                }
                                t7bVar.J0.a(false, true);
                                t7bVar.l0(true);
                                break;
                            } else {
                                t7bVar.A0 = fk2Var;
                                h7bVar.o(fk2Var);
                                t7bVar.J0.setSelected(fk2Var);
                                int indexOf = fk2.a().indexOf(fk2Var);
                                if (indexOf >= 0) {
                                    t7bVar.J0.a.w0(indexOf);
                                }
                                y6b y6bVar2 = t7bVar.C0;
                                if (y6bVar2 != null) {
                                    y6bVar2.recordHevc = !t7bVar.B0.i();
                                }
                                t7bVar.H0.setDrawable(new gk2(fk2Var, false));
                                t7bVar.b0(t7bVar.I0, t7bVar.J0.e, true);
                                t7bVar.P0.e(true, t7bVar.B0.i() ? t7bVar.B0.getFilledProgress() : 0.0f);
                            }
                        }
                    }
                    t7bVar.M1 = true;
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            f4b l2 = f4b.l((jm6) arrayList.get(i7));
                            l2.M0 = (Bitmap) arrayList2.get(i7);
                            l2.J0 = t7bVar.w0;
                            l2.K0 = t7bVar.x0;
                            l2.z();
                            if (!bool.booleanValue()) {
                                if (t7bVar.L1 == null) {
                                    t7bVar.L1 = l2;
                                } else {
                                    if (t7bVar.I1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        t7bVar.I1 = arrayList3;
                                        arrayList3.add(t7bVar.L1);
                                    }
                                    if (t7bVar.I1.size() < 10) {
                                        t7bVar.I1.add(l2);
                                    }
                                }
                                i7++;
                            } else if (t7bVar.B0.l(l2)) {
                                t7bVar.L1 = f4b.a(t7bVar.B0.getLayout(), t7bVar.B0.getContent());
                            } else {
                                i7++;
                            }
                        }
                    }
                    if (t7bVar.I1 != null) {
                        t7bVar.h0(false, true);
                        t7bVar.R0.a(t7bVar.P1);
                        f29 f29Var = t7bVar.P0;
                        boolean z6 = t7bVar.P1 == 1;
                        f29Var.o0 = -1.0f;
                        f29Var.p0 = z6;
                        f29Var.invalidate();
                        t7bVar.J1 = new ArrayList();
                        t7bVar.K1 = new ArrayList();
                        for (int i8 = 0; i8 < t7bVar.I1.size(); i8 = tb4.g(i8, i8, 1, t7bVar.K1)) {
                            t7bVar.J1.add(Integer.valueOf(i8));
                        }
                        t7bVar.B0.n(null);
                        t7bVar.J0.a(false, true);
                        t7bVar.l0(true);
                        t7bVar.c(false);
                        t7bVar.I(1, true);
                        p6b p6bVar = t7bVar.e1;
                        if (p6bVar != null) {
                            vl6 vl6Var = p6bVar.h;
                            if (!p6bVar.J && !p6bVar.N && (i3 = na7.c1().getInt("multistorieshint", 0)) < 3) {
                                na7.c1().edit().putInt("multistorieshint", i3 + 1).apply();
                                gl.r(vl6Var);
                                p6bVar.J = true;
                                p6bVar.invalidate();
                                gl.e3(vl6Var, 5500L);
                            }
                        }
                        vr4 vr4Var = t7bVar.N0;
                        if (vr4Var != null) {
                            t7bVar.m2 = vr4Var.e.d0();
                            t7bVar.n2 = t7bVar.N0.getSelectedAlbum();
                            break;
                        }
                    } else {
                        f4b f4bVar = t7bVar.L1;
                        if (f4bVar != null) {
                            f4bVar.A();
                        }
                        t7bVar.J0.a(false, true);
                        t7bVar.l0(true);
                        t7bVar.c(false);
                        vr4 vr4Var2 = t7bVar.N0;
                        if (vr4Var2 != null) {
                            t7bVar.m2 = vr4Var2.e.d0();
                            t7bVar.n2 = t7bVar.N0.getSelectedAlbum();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
