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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fh6 implements lac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jm7 b;

    public /* synthetic */ fh6(jm7 jm7Var, byte b) {
        this.a = b;
        this.b = jm7Var;
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
    @Override // lac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        boolean z;
        final String str;
        final boolean z2;
        k47 k47Var;
        k47 k47Var2;
        boolean z3;
        ey0 ey0Var;
        int i3;
        sl2 sl2Var;
        byte b = this.a;
        byte b2 = 3;
        jm7 jm7Var = this.b;
        switch (b) {
            case 0:
                lh6 lh6Var = (lh6) jm7Var;
                Long l = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                l66 l66Var = lh6Var.n;
                mh6 mh6Var = lh6Var.h0;
                lh6Var.g0 = null;
                lh6Var.f0 = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l.longValue() != 0 && (mh6Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i4 = 0; i4 < 4; i4++) {
                            z8c h = z8c.h(i4);
                            if (h.o() && h.e() == l.longValue() && ConnectionsManager.getInstance(i4).isTestBackend() == mh6Var.F) {
                                if (z8c.t0 != i4) {
                                    ((LaunchActivity) mh6Var.getParentActivity()).N0(i4);
                                }
                                mh6Var.finishFragment();
                                mh6Var.y1(false, true);
                                break;
                            }
                        }
                    }
                    if (str2 != null) {
                        if (!str2.contains("SESSION_PASSWORD_NEEDED")) {
                            boolean z4 = e21.a;
                            c41.b0(mh6Var).f0(str2, false);
                            break;
                        } else {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i = ((d) mh6Var).currentAccount;
                            ConnectionsManager.getInstance(i).sendRequest(getpassword, new gh6(lh6Var, (byte) 1), 10);
                        }
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        mh6Var.C1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (l66Var != null && "CANCELLED".equals(str2)) {
                    l66Var.setText(gm.D2(gm.N2(jb6.M0(2131744595, null), -1, 0, new ch6(lh6Var, b2), null), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) jm7Var;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    my0 my0Var = new my0(1, photoViewer.w2, (Context) photoViewer.E, false);
                    my0Var.s0(-14933463);
                    my0Var.K(-14933463);
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
                            if (i2 < 0 || (k47Var = photoViewer.S4) == null || k47Var.r1) {
                                z = true;
                            } else {
                                if (!k47.K4(k47Var.k) && !photoViewer.S4.g4() && !k47.Q4(photoViewer.S4.k) && !photoViewer.S4.I3() && (k47Var2 = photoViewer.S4.C) != null) {
                                    k47Var = k47Var2;
                                }
                                long B0 = k47.B0(k47Var.k);
                                int e1 = k47Var.e1();
                                TLRPC.MessageFwdHeader messageFwdHeader = k47Var.k.fwd_from;
                                if (messageFwdHeader != null) {
                                    TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                    if (peer != null) {
                                        B0 = k47.B1(peer);
                                        e1 = k47Var.k.fwd_from.saved_from_msg_id;
                                    } else {
                                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                        if (peer2 != null) {
                                            B0 = k47.B1(peer2);
                                            e1 = k47Var.k.fwd_from.channel_post;
                                        }
                                    }
                                }
                                boolean y = pg3.y(B0);
                                int i5 = photoViewer.U;
                                boolean z5 = true;
                                if (y) {
                                    String K = sd2.K(oc7.r1(i5).L0(Long.valueOf(-B0)), false);
                                    z = z5;
                                    if (K != null) {
                                        url = "https://t.me/" + K + "/" + e1 + "?t=" + gm.n0(i2);
                                        z = z5;
                                    }
                                } else {
                                    TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(B0));
                                    String p = m9c.p(W1);
                                    z = z5;
                                    z = z5;
                                    if (W1 != null && p != null) {
                                        url = "https://t.me/" + p + "/" + e1 + "?t=" + gm.n0(i2);
                                        z = z5;
                                    }
                                }
                            }
                            str = url;
                            z2 = false;
                            z3 = z;
                        }
                        my0Var.P = str;
                        my0Var.Q = false;
                        String M0 = jb6.M0(2131747550, null);
                        String M02 = jb6.M0(2131751699, null);
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        charSequenceArr[0] = M0;
                        charSequenceArr[z3] = M02;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: x88
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i6) {
                                Drawable[] drawableArr2 = PhotoViewer.d9;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                if (i6 == 0) {
                                    photoViewer2.b1(clickableSpan, textView);
                                    return;
                                }
                                if (i6 == 1) {
                                    String str3 = str;
                                    gm.g(str3);
                                    String M03 = z2 ? jb6.M0(2131747028, "PhoneCopied") : str3.startsWith("#") ? jb6.M0(2131749119, "HashtagCopied") : str3.startsWith("@") ? jb6.M0(2131743352, "UsernameCopied") : jb6.M0(2131748678, "LinkCopied");
                                    if (gm.C3()) {
                                        new c41(photoViewer2.f0, photoViewer2.w2).Q(R.raw.voip_invite, 36, M03).j();
                                    }
                                }
                            }
                        };
                        my0Var.M = charSequenceArr;
                        my0Var.L = onClickListener;
                        my0Var.I0 = new nf(runnable, (byte) 2);
                        my0Var.w = z3;
                        my0Var.show();
                        photoViewer.f0.performHapticFeedback(0, 2);
                        my0Var.w0(0, -1, -1);
                        my0Var.w0(1, -1, -1);
                        my0Var.s0(-14933463);
                        ey0Var = my0Var.m0;
                        if (ey0Var != null) {
                            ey0Var.setTextColor(-7697782);
                        }
                        my0Var.i0 = true;
                        my0Var.n = true;
                        gm.o3(my0Var, -14933463, false, null);
                        gm.i3(my0Var, false);
                        my0Var.w = true;
                        break;
                    }
                    i2 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    my0Var.P = str;
                    my0Var.Q = false;
                    String M03 = jb6.M0(2131747550, null);
                    String M022 = jb6.M0(2131751699, null);
                    CharSequence[] charSequenceArr2 = new CharSequence[2];
                    charSequenceArr2[0] = M03;
                    charSequenceArr2[z3] = M022;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: x88
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i6) {
                            Drawable[] drawableArr2 = PhotoViewer.d9;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            if (i6 == 0) {
                                photoViewer2.b1(clickableSpan, textView);
                                return;
                            }
                            if (i6 == 1) {
                                String str3 = str;
                                gm.g(str3);
                                String M032 = z2 ? jb6.M0(2131747028, "PhoneCopied") : str3.startsWith("#") ? jb6.M0(2131749119, "HashtagCopied") : str3.startsWith("@") ? jb6.M0(2131743352, "UsernameCopied") : jb6.M0(2131748678, "LinkCopied");
                                if (gm.C3()) {
                                    new c41(photoViewer2.f0, photoViewer2.w2).Q(R.raw.voip_invite, 36, M032).j();
                                }
                            }
                        }
                    };
                    my0Var.M = charSequenceArr2;
                    my0Var.L = onClickListener2;
                    my0Var.I0 = new nf(runnable, (byte) 2);
                    my0Var.w = z3;
                    my0Var.show();
                    photoViewer.f0.performHapticFeedback(0, 2);
                    my0Var.w0(0, -1, -1);
                    my0Var.w0(1, -1, -1);
                    my0Var.s0(-14933463);
                    ey0Var = my0Var.m0;
                    if (ey0Var != null) {
                    }
                    my0Var.i0 = true;
                    my0Var.n = true;
                    gm.o3(my0Var, -14933463, false, null);
                    gm.i3(my0Var, false);
                    my0Var.w = true;
                } else if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                v9b v9bVar = (v9b) jm7Var;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (v9bVar.g0 == 0 && arrayList != null && !arrayList.isEmpty() && v9bVar.q2 == null && !v9bVar.X && v9bVar.H()) {
                    v9bVar.I1 = null;
                    v9bVar.J1 = null;
                    v9bVar.K1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + v9bVar.B0.getFilledCount() > v9bVar.B0.getTotalCount()) {
                            int size = arrayList.size() + v9bVar.B0.getFilledCount();
                            ArrayList a = sl2.a();
                            int size2 = a.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 < size2) {
                                    Object obj4 = a.get(i6);
                                    i6++;
                                    sl2Var = (sl2) obj4;
                                    if (sl2Var.e.size() >= size) {
                                    }
                                } else {
                                    sl2Var = null;
                                }
                            }
                            j9b j9bVar = v9bVar.B0;
                            if (sl2Var == null) {
                                j9bVar.o(null);
                                v9bVar.B0.b();
                                v9bVar.J0.setSelected((sl2) null);
                                a9b a9bVar = v9bVar.C0;
                                if (a9bVar != null) {
                                    a9bVar.recordHevc = !v9bVar.B0.i();
                                }
                                v9bVar.J0.a(false, true);
                                v9bVar.l0(true);
                                break;
                            } else {
                                v9bVar.A0 = sl2Var;
                                j9bVar.o(sl2Var);
                                v9bVar.J0.setSelected(sl2Var);
                                int indexOf = sl2.a().indexOf(sl2Var);
                                if (indexOf >= 0) {
                                    v9bVar.J0.a.w0(indexOf);
                                }
                                a9b a9bVar2 = v9bVar.C0;
                                if (a9bVar2 != null) {
                                    a9bVar2.recordHevc = !v9bVar.B0.i();
                                }
                                v9bVar.H0.setDrawable(new tl2(sl2Var, false));
                                v9bVar.b0(v9bVar.I0, v9bVar.J0.e, true);
                                v9bVar.P0.e(true, v9bVar.B0.i() ? v9bVar.B0.getFilledProgress() : 0.0f);
                            }
                        }
                    }
                    v9bVar.M1 = true;
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            g6b l2 = g6b.l((jo6) arrayList.get(i7));
                            l2.M0 = (Bitmap) arrayList2.get(i7);
                            l2.J0 = v9bVar.w0;
                            l2.K0 = v9bVar.x0;
                            l2.z();
                            if (!bool.booleanValue()) {
                                if (v9bVar.L1 == null) {
                                    v9bVar.L1 = l2;
                                } else {
                                    if (v9bVar.I1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        v9bVar.I1 = arrayList3;
                                        arrayList3.add(v9bVar.L1);
                                    }
                                    if (v9bVar.I1.size() < 10) {
                                        v9bVar.I1.add(l2);
                                    }
                                }
                                i7++;
                            } else if (v9bVar.B0.l(l2)) {
                                v9bVar.L1 = g6b.a(v9bVar.B0.getLayout(), v9bVar.B0.getContent());
                            } else {
                                i7++;
                            }
                        }
                    }
                    if (v9bVar.I1 != null) {
                        v9bVar.h0(false, true);
                        v9bVar.R0.a(v9bVar.P1);
                        j49 j49Var = v9bVar.P0;
                        boolean z6 = v9bVar.P1 == 1;
                        j49Var.o0 = -1.0f;
                        j49Var.p0 = z6;
                        j49Var.invalidate();
                        v9bVar.J1 = new ArrayList();
                        v9bVar.K1 = new ArrayList();
                        for (int i8 = 0; i8 < v9bVar.I1.size(); i8 = td4.g(i8, i8, 1, v9bVar.K1)) {
                            v9bVar.J1.add(Integer.valueOf(i8));
                        }
                        v9bVar.B0.n(null);
                        v9bVar.J0.a(false, true);
                        v9bVar.l0(true);
                        v9bVar.c(false);
                        v9bVar.I(1, true);
                        r8b r8bVar = v9bVar.e1;
                        if (r8bVar != null) {
                            pg6 pg6Var = r8bVar.h;
                            if (!r8bVar.J && !r8bVar.N && (i3 = oc7.d1().getInt("multistorieshint", 0)) < 3) {
                                oc7.d1().edit().putInt("multistorieshint", i3 + 1).apply();
                                gm.r(pg6Var);
                                r8bVar.J = true;
                                r8bVar.invalidate();
                                gm.d3(pg6Var, 5500L);
                            }
                        }
                        wt4 wt4Var = v9bVar.N0;
                        if (wt4Var != null) {
                            v9bVar.m2 = wt4Var.e.d0();
                            v9bVar.n2 = v9bVar.N0.getSelectedAlbum();
                            break;
                        }
                    } else {
                        g6b g6bVar = v9bVar.L1;
                        if (g6bVar != null) {
                            g6bVar.A();
                        }
                        v9bVar.J0.a(false, true);
                        v9bVar.l0(true);
                        v9bVar.c(false);
                        wt4 wt4Var2 = v9bVar.N0;
                        if (wt4Var2 != null) {
                            v9bVar.m2 = wt4Var2.e.d0();
                            v9bVar.n2 = v9bVar.N0.getSelectedAlbum();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
