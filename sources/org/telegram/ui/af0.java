package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class af0 implements org.telegram.messenger.l20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.us b;

    public /* synthetic */ af0(org.telegram.messenger.us usVar, int i10) {
        this.a = i10;
        this.b = usVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:12|(11:14|15|16|17|(1:19)(2:30|(1:32)(2:(1:68)(7:38|(1:48)|49|(4:51|(1:53)(2:64|(1:66))|54|(2:56|(1:58))(2:60|(1:63)))|67|54|(0)(0))|59))|20|21|22|23|(1:25)|26)|71|17|(0)(0)|20|21|22|23|(0)|26) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    @Override // org.telegram.messenger.l20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11;
        boolean z10;
        final boolean z11;
        final String str;
        org.telegram.messenger.jj jjVar;
        int i12;
        org.telegram.messenger.jj jjVar2;
        boolean z12;
        org.telegram.ui.ActionBar.q2 q2Var;
        int i13 = this.a;
        org.telegram.messenger.us usVar = this.b;
        switch (i13) {
            case 0:
                gf0 gf0Var = (gf0) usVar;
                Long l4 = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                org.telegram.ui.Components.p80 p80Var = gf0Var.n;
                hf0 hf0Var = gf0Var.a0;
                gf0Var.W = null;
                gf0Var.V = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l4.longValue() != 0 && (hf0Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i14 = 0; i14 < 4; i14++) {
                            org.telegram.messenger.d20 i15 = org.telegram.messenger.d20.i(i14);
                            if (i15.p() && i15.e() == l4.longValue() && ConnectionsManager.getInstance(i14).isTestBackend() == hf0Var.E) {
                                if (org.telegram.messenger.d20.s0 != i14) {
                                    ((LaunchActivity) hf0Var.getParentActivity()).O0(i14);
                                }
                                hf0Var.finishFragment();
                                hf0Var.s1(false, true);
                                break;
                            }
                        }
                    }
                    if (str2 == null || !str2.contains("SESSION_PASSWORD_NEEDED")) {
                        if (str2 != null) {
                            boolean z13 = org.telegram.messenger.v2.a;
                            org.telegram.ui.Components.cc.a0(hf0Var).e0(str2, false);
                            break;
                        }
                    } else {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(getpassword, new bf0(gf0Var, 1), 10);
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        hf0Var.w1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (p80Var != null && "CANCELLED".equals(str2)) {
                    p80Var.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131744924, null), new xe0(gf0Var, 3)), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) usVar;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, (Context) photoViewer.D, photoViewer.v2, false);
                    z2Var.v0(-14933463);
                    z2Var.P(-14933463);
                    if (url.startsWith("video?")) {
                        try {
                            i11 = Integer.parseInt(url.substring(url.indexOf(63) + 1));
                        } catch (Throwable unused) {
                        }
                        if (!url.startsWith("mailto:")) {
                            z11 = false;
                            str = url.substring(7);
                            z12 = 1;
                        } else if (url.startsWith("tel:")) {
                            str = url.substring(4);
                            z11 = true;
                            z12 = 1;
                        } else {
                            if (i11 < 0 || (jjVar = photoViewer.T4) == null || jjVar.p1) {
                                z10 = true;
                            } else {
                                if (!org.telegram.messenger.jj.L4(jjVar.k) && !photoViewer.T4.h4() && !org.telegram.messenger.jj.R4(photoViewer.T4.k) && !photoViewer.T4.I3() && (jjVar2 = photoViewer.T4.C) != null) {
                                    jjVar = jjVar2;
                                }
                                long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                                int f12 = jjVar.f1();
                                TLRPC.MessageFwdHeader messageFwdHeader = jjVar.k.fwd_from;
                                if (messageFwdHeader != null) {
                                    TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                    if (peer != null) {
                                        B0 = org.telegram.messenger.jj.C1(peer);
                                        i12 = jjVar.k.fwd_from.saved_from_msg_id;
                                    } else {
                                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                        if (peer2 != null) {
                                            B0 = org.telegram.messenger.jj.C1(peer2);
                                            i12 = jjVar.k.fwd_from.channel_post;
                                        }
                                    }
                                    boolean z14 = true;
                                    if (org.telegram.messenger.o5.z(B0)) {
                                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(photoViewer.T).Z1(Long.valueOf(B0));
                                        String n10 = org.telegram.messenger.h20.n(Z1);
                                        z10 = z14;
                                        z10 = z14;
                                        if (Z1 != null && n10 != null) {
                                            url = "https://t.me/" + n10 + "/" + i12 + "?t=" + org.telegram.messenger.i0.n0(i11);
                                            z10 = z14;
                                        }
                                    } else {
                                        String K = org.telegram.messenger.w3.K(org.telegram.messenger.vp.r1(photoViewer.T).L0(Long.valueOf(-B0)), false);
                                        z10 = z14;
                                        if (K != null) {
                                            url = "https://t.me/" + K + "/" + i12 + "?t=" + org.telegram.messenger.i0.n0(i11);
                                            z10 = z14;
                                        }
                                    }
                                }
                                i12 = f12;
                                boolean z142 = true;
                                if (org.telegram.messenger.o5.z(B0)) {
                                }
                            }
                            z11 = false;
                            str = url;
                            z12 = z10;
                        }
                        z2Var.O = str;
                        z2Var.P = false;
                        String L0 = org.telegram.messenger.cd.L0(2131747833, null);
                        String L02 = org.telegram.messenger.cd.L0(2131751762, null);
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        charSequenceArr[0] = L0;
                        charSequenceArr[z12] = L02;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.zo0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i16) {
                                Drawable[] drawableArr2 = PhotoViewer.U8;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                if (i16 == 0) {
                                    photoViewer2.a2(clickableSpan, textView);
                                    return;
                                }
                                if (i16 == 1) {
                                    String str3 = str;
                                    org.telegram.messenger.i0.g(str3);
                                    String L03 = z11 ? org.telegram.messenger.cd.L0(2131747311, "PhoneCopied") : str3.startsWith("#") ? org.telegram.messenger.cd.L0(2131749371, "HashtagCopied") : str3.startsWith("@") ? org.telegram.messenger.cd.L0(2131743691, "UsernameCopied") : org.telegram.messenger.cd.L0(2131748931, "LinkCopied");
                                    if (org.telegram.messenger.i0.H3()) {
                                        new org.telegram.ui.Components.cc(photoViewer2.e0, photoViewer2.v2).Q(R.raw.voip_invite, 36, L03).j();
                                    }
                                }
                            }
                        };
                        z2Var.L = charSequenceArr;
                        z2Var.K = onClickListener;
                        z2Var.H0 = new q5(runnable, 11);
                        z2Var.w = z12;
                        z2Var.show();
                        photoViewer.e0.performHapticFeedback(0, 2);
                        z2Var.C0(0, -1, -1);
                        z2Var.C0(1, -1, -1);
                        z2Var.v0(-14933463);
                        q2Var = z2Var.l0;
                        if (q2Var != null) {
                            q2Var.setTextColor(-7697782);
                        }
                        z2Var.h0 = true;
                        z2Var.n = true;
                        org.telegram.messenger.i0.t3(z2Var, -14933463, false, null);
                        org.telegram.messenger.i0.m3(z2Var, false);
                        z2Var.w = true;
                        break;
                    }
                    i11 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    z2Var.O = str;
                    z2Var.P = false;
                    String L03 = org.telegram.messenger.cd.L0(2131747833, null);
                    String L022 = org.telegram.messenger.cd.L0(2131751762, null);
                    CharSequence[] charSequenceArr2 = new CharSequence[2];
                    charSequenceArr2[0] = L03;
                    charSequenceArr2[z12] = L022;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.zo0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i16) {
                            Drawable[] drawableArr2 = PhotoViewer.U8;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            if (i16 == 0) {
                                photoViewer2.a2(clickableSpan, textView);
                                return;
                            }
                            if (i16 == 1) {
                                String str3 = str;
                                org.telegram.messenger.i0.g(str3);
                                String L032 = z11 ? org.telegram.messenger.cd.L0(2131747311, "PhoneCopied") : str3.startsWith("#") ? org.telegram.messenger.cd.L0(2131749371, "HashtagCopied") : str3.startsWith("@") ? org.telegram.messenger.cd.L0(2131743691, "UsernameCopied") : org.telegram.messenger.cd.L0(2131748931, "LinkCopied");
                                if (org.telegram.messenger.i0.H3()) {
                                    new org.telegram.ui.Components.cc(photoViewer2.e0, photoViewer2.v2).Q(R.raw.voip_invite, 36, L032).j();
                                }
                            }
                        }
                    };
                    z2Var.L = charSequenceArr2;
                    z2Var.K = onClickListener2;
                    z2Var.H0 = new q5(runnable, 11);
                    z2Var.w = z12;
                    z2Var.show();
                    photoViewer.e0.performHapticFeedback(0, 2);
                    z2Var.C0(0, -1, -1);
                    z2Var.C0(1, -1, -1);
                    z2Var.v0(-14933463);
                    q2Var = z2Var.l0;
                    if (q2Var != null) {
                    }
                    z2Var.h0 = true;
                    z2Var.n = true;
                    org.telegram.messenger.i0.t3(z2Var, -14933463, false, null);
                    org.telegram.messenger.i0.m3(z2Var, false);
                    z2Var.w = true;
                } else if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) usVar).getClass();
                break;
        }
    }
}
