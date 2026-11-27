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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ih6 implements kcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fn7 b;

    public /* synthetic */ ih6(fn7 fn7Var, byte b) {
        this.a = b;
        this.b = fn7Var;
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
    @Override // kcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        boolean z;
        final String str;
        final boolean z2;
        r47 r47Var;
        r47 r47Var2;
        boolean z3;
        fx0 fx0Var;
        int i3;
        al2 al2Var;
        byte b = this.a;
        byte b2 = 3;
        fn7 fn7Var = this.b;
        switch (b) {
            case 0:
                ph6 ph6Var = (ph6) fn7Var;
                Long l = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                p66 p66Var = ph6Var.n;
                qh6 qh6Var = ph6Var.h0;
                ph6Var.g0 = null;
                ph6Var.f0 = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l.longValue() != 0 && (qh6Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i4 = 0; i4 < 4; i4++) {
                            yac h = yac.h(i4);
                            if (h.o() && h.e() == l.longValue() && ConnectionsManager.getInstance(i4).isTestBackend() == qh6Var.F) {
                                if (yac.t0 != i4) {
                                    ((LaunchActivity) qh6Var.getParentActivity()).N0(i4);
                                }
                                qh6Var.finishFragment();
                                qh6Var.y1(false, true);
                                break;
                            }
                        }
                    }
                    if (str2 != null) {
                        if (!str2.contains("SESSION_PASSWORD_NEEDED")) {
                            boolean z4 = f11.a;
                            d31.b0(qh6Var).f0(str2, false);
                            break;
                        } else {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i = ((e) qh6Var).currentAccount;
                            ConnectionsManager.getInstance(i).sendRequest(getpassword, new jh6(ph6Var, (byte) 1), 10);
                        }
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        qh6Var.C1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (p66Var != null && "CANCELLED".equals(str2)) {
                    p66Var.setText(hl.D2(hl.N2(ob6.M0(2131744563, null), -1, 0, new fh6(ph6Var, b2), null), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) fn7Var;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    nx0 nx0Var = new nx0(1, photoViewer.w2, (Context) photoViewer.E, false);
                    nx0Var.s0(-14933463);
                    nx0Var.K(-14933463);
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
                            if (i2 < 0 || (r47Var = photoViewer.S4) == null || r47Var.r1) {
                                z = true;
                            } else {
                                if (!r47.K4(r47Var.k) && !photoViewer.S4.g4() && !r47.Q4(photoViewer.S4.k) && !photoViewer.S4.I3() && (r47Var2 = photoViewer.S4.C) != null) {
                                    r47Var = r47Var2;
                                }
                                long B0 = r47.B0(r47Var.k);
                                int e1 = r47Var.e1();
                                TLRPC.MessageFwdHeader messageFwdHeader = r47Var.k.fwd_from;
                                if (messageFwdHeader != null) {
                                    TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                    if (peer != null) {
                                        B0 = r47.B1(peer);
                                        e1 = r47Var.k.fwd_from.saved_from_msg_id;
                                    } else {
                                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                        if (peer2 != null) {
                                            B0 = r47.B1(peer2);
                                            e1 = r47Var.k.fwd_from.channel_post;
                                        }
                                    }
                                }
                                boolean y = wf3.y(B0);
                                int i5 = photoViewer.U;
                                boolean z5 = true;
                                if (y) {
                                    String K = xc2.K(uc7.s1(i5).M0(Long.valueOf(-B0)), false);
                                    z = z5;
                                    if (K != null) {
                                        url = "https://t.me/" + K + "/" + e1 + "?t=" + hl.n0(i2);
                                        z = z5;
                                    }
                                } else {
                                    TLRPC.User X1 = uc7.s1(i5).X1(Long.valueOf(B0));
                                    String p = lbc.p(X1);
                                    z = z5;
                                    z = z5;
                                    if (X1 != null && p != null) {
                                        url = "https://t.me/" + p + "/" + e1 + "?t=" + hl.n0(i2);
                                        z = z5;
                                    }
                                }
                            }
                            str = url;
                            z2 = false;
                            z3 = z;
                        }
                        nx0Var.P = str;
                        nx0Var.Q = false;
                        String M0 = ob6.M0(2131747544, null);
                        String M02 = ob6.M0(2131751727, null);
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        charSequenceArr[0] = M0;
                        charSequenceArr[z3] = M02;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: la8
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
                                    hl.g(str3);
                                    String M03 = z2 ? ob6.M0(2131747022, "PhoneCopied") : str3.startsWith("#") ? ob6.M0(2131749116, "HashtagCopied") : str3.startsWith("@") ? ob6.M0(2131743320, "UsernameCopied") : ob6.M0(2131748675, "LinkCopied");
                                    if (hl.C3()) {
                                        new d31(photoViewer2.f0, photoViewer2.w2).Q(R.raw.voip_invite, 36, M03).j();
                                    }
                                }
                            }
                        };
                        nx0Var.M = charSequenceArr;
                        nx0Var.L = onClickListener;
                        nx0Var.I0 = new ud(runnable, (byte) 2);
                        nx0Var.w = z3;
                        nx0Var.show();
                        photoViewer.f0.performHapticFeedback(0, 2);
                        nx0Var.x0(0, -1, -1);
                        nx0Var.x0(1, -1, -1);
                        nx0Var.s0(-14933463);
                        fx0Var = nx0Var.m0;
                        if (fx0Var != null) {
                            fx0Var.setTextColor(-7697782);
                        }
                        nx0Var.i0 = true;
                        nx0Var.n = true;
                        hl.o3(nx0Var, -14933463, false, null);
                        hl.i3(nx0Var, false);
                        nx0Var.w = true;
                        break;
                    }
                    i2 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    nx0Var.P = str;
                    nx0Var.Q = false;
                    String M03 = ob6.M0(2131747544, null);
                    String M022 = ob6.M0(2131751727, null);
                    CharSequence[] charSequenceArr2 = new CharSequence[2];
                    charSequenceArr2[0] = M03;
                    charSequenceArr2[z3] = M022;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: la8
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
                                hl.g(str3);
                                String M032 = z2 ? ob6.M0(2131747022, "PhoneCopied") : str3.startsWith("#") ? ob6.M0(2131749116, "HashtagCopied") : str3.startsWith("@") ? ob6.M0(2131743320, "UsernameCopied") : ob6.M0(2131748675, "LinkCopied");
                                if (hl.C3()) {
                                    new d31(photoViewer2.f0, photoViewer2.w2).Q(R.raw.voip_invite, 36, M032).j();
                                }
                            }
                        }
                    };
                    nx0Var.M = charSequenceArr2;
                    nx0Var.L = onClickListener2;
                    nx0Var.I0 = new ud(runnable, (byte) 2);
                    nx0Var.w = z3;
                    nx0Var.show();
                    photoViewer.f0.performHapticFeedback(0, 2);
                    nx0Var.x0(0, -1, -1);
                    nx0Var.x0(1, -1, -1);
                    nx0Var.s0(-14933463);
                    fx0Var = nx0Var.m0;
                    if (fx0Var != null) {
                    }
                    nx0Var.i0 = true;
                    nx0Var.n = true;
                    hl.o3(nx0Var, -14933463, false, null);
                    hl.i3(nx0Var, false);
                    nx0Var.w = true;
                } else if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                rbb rbbVar = (rbb) fn7Var;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (rbbVar.g0 == 0 && arrayList != null && !arrayList.isEmpty() && rbbVar.q2 == null && !rbbVar.X && rbbVar.H()) {
                    rbbVar.I1 = null;
                    rbbVar.J1 = null;
                    rbbVar.K1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + rbbVar.B0.getFilledCount() > rbbVar.B0.getTotalCount()) {
                            int size = arrayList.size() + rbbVar.B0.getFilledCount();
                            ArrayList a = al2.a();
                            int size2 = a.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 < size2) {
                                    Object obj4 = a.get(i6);
                                    i6++;
                                    al2Var = (al2) obj4;
                                    if (al2Var.e.size() >= size) {
                                    }
                                } else {
                                    al2Var = null;
                                }
                            }
                            fbb fbbVar = rbbVar.B0;
                            if (al2Var == null) {
                                fbbVar.o(null);
                                rbbVar.B0.b();
                                rbbVar.J0.setSelected((al2) null);
                                wab wabVar = rbbVar.C0;
                                if (wabVar != null) {
                                    wabVar.recordHevc = !rbbVar.B0.i();
                                }
                                rbbVar.J0.a(false, true);
                                rbbVar.l0(true);
                                break;
                            } else {
                                rbbVar.A0 = al2Var;
                                fbbVar.o(al2Var);
                                rbbVar.J0.setSelected(al2Var);
                                int indexOf = al2.a().indexOf(al2Var);
                                if (indexOf >= 0) {
                                    rbbVar.J0.a.x0(indexOf);
                                }
                                wab wabVar2 = rbbVar.C0;
                                if (wabVar2 != null) {
                                    wabVar2.recordHevc = !rbbVar.B0.i();
                                }
                                rbbVar.H0.setDrawable(new bl2(al2Var, false));
                                rbbVar.b0(rbbVar.I0, rbbVar.J0.e, true);
                                rbbVar.P0.e(true, rbbVar.B0.i() ? rbbVar.B0.getFilledProgress() : 0.0f);
                            }
                        }
                    }
                    rbbVar.M1 = true;
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            c8b l2 = c8b.l((no6) arrayList.get(i7));
                            l2.M0 = (Bitmap) arrayList2.get(i7);
                            l2.J0 = rbbVar.w0;
                            l2.K0 = rbbVar.x0;
                            l2.z();
                            if (!bool.booleanValue()) {
                                if (rbbVar.L1 == null) {
                                    rbbVar.L1 = l2;
                                } else {
                                    if (rbbVar.I1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        rbbVar.I1 = arrayList3;
                                        arrayList3.add(rbbVar.L1);
                                    }
                                    if (rbbVar.I1.size() < 10) {
                                        rbbVar.I1.add(l2);
                                    }
                                }
                                i7++;
                            } else if (rbbVar.B0.l(l2)) {
                                rbbVar.L1 = c8b.a(rbbVar.B0.getLayout(), rbbVar.B0.getContent());
                            } else {
                                i7++;
                            }
                        }
                    }
                    if (rbbVar.I1 != null) {
                        rbbVar.h0(false, true);
                        rbbVar.R0.a(rbbVar.P1);
                        u59 u59Var = rbbVar.P0;
                        boolean z6 = rbbVar.P1 == 1;
                        u59Var.o0 = -1.0f;
                        u59Var.p0 = z6;
                        u59Var.invalidate();
                        rbbVar.J1 = new ArrayList();
                        rbbVar.K1 = new ArrayList();
                        for (int i8 = 0; i8 < rbbVar.I1.size(); i8 = qd4.g(i8, i8, 1, rbbVar.K1)) {
                            rbbVar.J1.add(Integer.valueOf(i8));
                        }
                        rbbVar.B0.n(null);
                        rbbVar.J0.a(false, true);
                        rbbVar.l0(true);
                        rbbVar.c(false);
                        rbbVar.I(1, true);
                        nab nabVar = rbbVar.e1;
                        if (nabVar != null) {
                            fe7 fe7Var = nabVar.h;
                            if (!nabVar.J && !nabVar.N && (i3 = uc7.e1().getInt("multistorieshint", 0)) < 3) {
                                uc7.e1().edit().putInt("multistorieshint", i3 + 1).apply();
                                hl.r(fe7Var);
                                nabVar.J = true;
                                nabVar.invalidate();
                                hl.d3(fe7Var, 5500L);
                            }
                        }
                        zt4 zt4Var = rbbVar.N0;
                        if (zt4Var != null) {
                            rbbVar.m2 = zt4Var.e.d0();
                            rbbVar.n2 = rbbVar.N0.getSelectedAlbum();
                            break;
                        }
                    } else {
                        c8b c8bVar = rbbVar.L1;
                        if (c8bVar != null) {
                            c8bVar.A();
                        }
                        rbbVar.J0.a(false, true);
                        rbbVar.l0(true);
                        rbbVar.c(false);
                        zt4 zt4Var2 = rbbVar.N0;
                        if (zt4Var2 != null) {
                            rbbVar.m2 = zt4Var2.e.d0();
                            rbbVar.n2 = rbbVar.N0.getSelectedAlbum();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
