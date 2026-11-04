package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ln0(PhotoViewer photoViewer, int i3) {
        this.a = i3;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0248, code lost:
    
        if (r3.startsWith("https://" + org.telegram.messenger.hp.s1(r7.U).V2) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0457  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        kq0 kq0Var;
        float f10;
        float f11;
        float f12;
        int i3;
        TLRPC.Message message;
        org.telegram.ui.Components.j51 j51Var;
        int i10 = this.a;
        float f13 = 0.0f;
        String str = null;
        final PhotoViewer photoViewer = this.b;
        final int i11 = 0;
        int i12 = 1;
        switch (i10) {
            case 0:
                if (!photoViewer.f2 && !photoViewer.K1()) {
                    photoViewer.P2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.V8;
                if (!photoViewer.K1() && (kq0Var = photoViewer.d) != null && kq0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.s3(!photoViewer.L, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer.X1(true);
                photoViewer.C0(0, true);
                break;
            case 3:
                org.telegram.messenger.zi ziVar = photoViewer.U4;
                if (ziVar == null || !ziVar.s4()) {
                    if (photoViewer.G.v0.a()) {
                        photoViewer.p0.U(null, null);
                        break;
                    }
                } else {
                    org.telegram.messenger.zi ziVar2 = photoViewer.U4;
                    if (ziVar2 != null && ziVar2.s4() && photoViewer.p0.getAlpha() > 0.5f) {
                        final int i13 = photoViewer.U4.I1;
                        final ei.b bVar = new ei.b();
                        org.telegram.ui.Components.f60 G = org.telegram.ui.Components.f60.G(photoViewer.f0, bVar, photoViewer.p0, true);
                        G.a0(0.0f, -org.telegram.messenger.g0.L(46.0f));
                        G.V(5);
                        org.telegram.messenger.zi ziVar3 = photoViewer.U4;
                        if (ziVar3.U0 == null && ziVar3.V0 == null) {
                            String str2 = ziVar3.R0;
                            if (str2 != null) {
                                break;
                            }
                            if (!org.telegram.messenger.h10.i(i13).q() && !org.telegram.messenger.hp.s1(photoViewer.U).D3() && !photoViewer.U4.Z0) {
                                G.c(R.drawable.msg_block2, org.telegram.messenger.bd.M0(2131749331, null), new Runnable() { // from class: org.telegram.ui.cn0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i14 = i11;
                                        ei.b bVar2 = bVar;
                                        int i15 = i13;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i14) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.V8;
                                                if (!org.telegram.messenger.h10.i(i15).q()) {
                                                    new vg.v0(photoViewer2.n4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.fc(photoViewer2.f0, bVar2).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                                                    org.telegram.messenger.hp.s1(i15).o0(true);
                                                    org.telegram.ui.ActionBar.d2 d2Var = photoViewer2.n4;
                                                    if (d2Var instanceof wm) {
                                                        wm wmVar = (wm) d2Var;
                                                        wmVar.eb(photoViewer2.U4);
                                                        wmVar.gb(photoViewer2.U4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.V8;
                                                if (!org.telegram.messenger.h10.i(i15).q()) {
                                                    new vg.v0(photoViewer2.n4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.fc(photoViewer2.f0, bVar2).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                                                    org.telegram.messenger.hp.s1(i15).o0(true);
                                                    org.telegram.ui.ActionBar.d2 d2Var2 = photoViewer2.n4;
                                                    if (d2Var2 instanceof wm) {
                                                        wm wmVar2 = (wm) d2Var2;
                                                        wmVar2.eb(photoViewer2.U4);
                                                        wmVar2.gb(photoViewer2.U4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.U4.Z0) {
                                G.c(R.drawable.msg_info, org.telegram.messenger.bd.M0(2131754943, null), new hk0(1, photoViewer, bVar), false);
                                if ((photoViewer.n4 instanceof wm) && !org.telegram.messenger.hp.s1(i13).D3()) {
                                    G.k();
                                    final int i14 = 1;
                                    G.c(R.drawable.msg_cancel, org.telegram.messenger.bd.M0(2131746328, null), new Runnable() { // from class: org.telegram.ui.cn0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i142 = i14;
                                            ei.b bVar2 = bVar;
                                            int i15 = i13;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i142) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.V8;
                                                    if (!org.telegram.messenger.h10.i(i15).q()) {
                                                        new vg.v0(photoViewer2.n4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.fc(photoViewer2.f0, bVar2).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.hp.s1(i15).o0(true);
                                                        org.telegram.ui.ActionBar.d2 d2Var = photoViewer2.n4;
                                                        if (d2Var instanceof wm) {
                                                            wm wmVar = (wm) d2Var;
                                                            wmVar.eb(photoViewer2.U4);
                                                            wmVar.gb(photoViewer2.U4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.V8;
                                                    if (!org.telegram.messenger.h10.i(i15).q()) {
                                                        new vg.v0(photoViewer2.n4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.fc(photoViewer2.f0, bVar2).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.hp.s1(i15).o0(true);
                                                        org.telegram.ui.ActionBar.d2 d2Var2 = photoViewer2.n4;
                                                        if (d2Var2 instanceof wm) {
                                                            wm wmVar2 = (wm) d2Var2;
                                                            wmVar2.eb(photoViewer2.U4);
                                                            wmVar2.gb(photoViewer2.U4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            if (G.x() > 0) {
                                G.Z();
                                break;
                            }
                        }
                        org.telegram.ui.Components.f60 J = G.J();
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, photoViewer.F, bVar, true, false);
                        y0Var.setItemHeight(44);
                        y0Var.j(org.telegram.messenger.bd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                        y0Var.getTextView().setPadding(org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                        y0Var.setOnClickListener(new fg(G, 1));
                        J.r(y0Var, b8.mf.o(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.c1(photoViewer.F, bVar), b8.mf.o(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str3 = photoViewer.U4.R0;
                        if (str3 != null) {
                            f11 = 300.0f;
                            if (TextUtils.equals(org.telegram.messenger.g0.K0(str3, false), org.telegram.messenger.hp.s1(photoViewer.U).V2)) {
                                f10 = 18.0f;
                            } else {
                                TextView textView = new TextView(photoViewer.F);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Uc, bVar);
                                textView.setTextSize(1, 14.0f);
                                f12 = 10.0f;
                                f10 = 18.0f;
                                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f));
                                textView.setMaxWidth(org.telegram.messenger.g0.L(300.0f));
                                Uri parse = Uri.parse(photoViewer.U4.R0);
                                textView.setText(sf.c.w(parse, null, null, sf.c.a(parse.getHost()), null));
                                int i15 = org.telegram.ui.ActionBar.k6.I5;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(photoViewer.B1(i15), 0, photoViewer.U4.V0 == null ? 6 : 0);
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
                                textView.setBackground(a02);
                                org.telegram.ui.ActionBar.r6.k(textView, a02, null, N, bVar);
                                textView.setOnClickListener(new hb0(7, photoViewer, G));
                                textView.setOnLongClickListener(new ei.j2(4, photoViewer, bVar));
                                arrayList.add(textView);
                                if (photoViewer.U4.U0 != null) {
                                    TextView textView2 = new TextView(photoViewer.F);
                                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.E8, bVar);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12));
                                    textView2.setMaxWidth(org.telegram.messenger.g0.L(f11));
                                    textView2.setText(photoViewer.U4.U0);
                                    int i16 = org.telegram.ui.ActionBar.k6.I5;
                                    org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(photoViewer.B1(i16), 0, photoViewer.U4.V0 == null ? 6 : 0);
                                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
                                    textView2.setBackground(a03);
                                    org.telegram.ui.ActionBar.r6.k(textView2, a03, null, N2, bVar);
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bn0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i17 = i11;
                                            ei.b bVar2 = bVar;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i17) {
                                                case 0:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.U4.U0)) {
                                                        org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.U4.V0)) {
                                                        org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView2);
                                }
                                if (photoViewer.U4.V0 != null) {
                                    TextView textView3 = new TextView(photoViewer.F);
                                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.E8, bVar);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12));
                                    textView3.setMaxWidth(org.telegram.messenger.g0.L(f11));
                                    textView3.setText(photoViewer.U4.V0);
                                    int i17 = org.telegram.ui.ActionBar.k6.I5;
                                    org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.k6.a0(photoViewer.B1(i17), 0, 6);
                                    org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i17);
                                    textView3.setBackground(a04);
                                    org.telegram.ui.ActionBar.r6.k(textView3, a04, null, N3, bVar);
                                    final int i18 = 1;
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bn0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i172 = i18;
                                            ei.b bVar2 = bVar;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i172) {
                                                case 0:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.U4.U0)) {
                                                        org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.U4.V0)) {
                                                        org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView3);
                                }
                                for (i3 = 0; i3 < arrayList.size(); i3++) {
                                    View view2 = (View) arrayList.get(i3);
                                    if (i3 > 0) {
                                        FrameLayout frameLayout = new FrameLayout(photoViewer.F);
                                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, frameLayout, bVar);
                                        LinearLayout.LayoutParams o10 = b8.mf.o(-1, 1);
                                        o10.height = 1;
                                        J.r(frameLayout, o10);
                                    }
                                    J.r(view2, b8.mf.o(-1, -2));
                                }
                                G.c(R.drawable.msg_channel, org.telegram.messenger.bd.M0(2131745258, null), new ai.y3(G, J, 11), false);
                                if (!org.telegram.messenger.h10.i(i13).q()) {
                                    G.c(R.drawable.msg_block2, org.telegram.messenger.bd.M0(2131749331, null), new Runnable() { // from class: org.telegram.ui.cn0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i142 = i11;
                                            ei.b bVar2 = bVar;
                                            int i152 = i13;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i142) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.V8;
                                                    if (!org.telegram.messenger.h10.i(i152).q()) {
                                                        new vg.v0(photoViewer2.n4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.fc(photoViewer2.f0, bVar2).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.hp.s1(i152).o0(true);
                                                        org.telegram.ui.ActionBar.d2 d2Var = photoViewer2.n4;
                                                        if (d2Var instanceof wm) {
                                                            wm wmVar = (wm) d2Var;
                                                            wmVar.eb(photoViewer2.U4);
                                                            wmVar.gb(photoViewer2.U4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.V8;
                                                    if (!org.telegram.messenger.h10.i(i152).q()) {
                                                        new vg.v0(photoViewer2.n4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.fc(photoViewer2.f0, bVar2).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.hp.s1(i152).o0(true);
                                                        org.telegram.ui.ActionBar.d2 d2Var2 = photoViewer2.n4;
                                                        if (d2Var2 instanceof wm) {
                                                            wm wmVar2 = (wm) d2Var2;
                                                            wmVar2.eb(photoViewer2.U4);
                                                            wmVar2.gb(photoViewer2.U4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                                if (photoViewer.U4.Z0) {
                                }
                                if (G.x() > 0) {
                                }
                            }
                        } else {
                            f10 = 18.0f;
                            f11 = 300.0f;
                        }
                        f12 = 10.0f;
                        if (photoViewer.U4.U0 != null) {
                        }
                        if (photoViewer.U4.V0 != null) {
                        }
                        while (i3 < arrayList.size()) {
                        }
                        G.c(R.drawable.msg_channel, org.telegram.messenger.bd.M0(2131745258, null), new ai.y3(G, J, 11), false);
                        if (!org.telegram.messenger.h10.i(i13).q()) {
                        }
                        if (photoViewer.U4.Z0) {
                        }
                        if (G.x() > 0) {
                        }
                    }
                }
                break;
            case 4:
                org.telegram.messenger.zi ziVar4 = photoViewer.U4;
                if (ziVar4 != null && ziVar4.E2(true)) {
                    rq rqVar = photoViewer.K0;
                    org.telegram.messenger.zi ziVar5 = photoViewer.U4;
                    LinearLayout linearLayout = rqVar.b;
                    if (ziVar5 != null && (message = ziVar5.k) != null && message.media != null && ziVar5.E2(true)) {
                        int i19 = ziVar5.I1;
                        TLRPC.MessageMedia messageMedia = ziVar5.k.media;
                        ArrayList X = org.telegram.ui.Components.m51.X(i19, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i20 = 0;
                        while (i20 < X.size()) {
                            org.telegram.ui.Components.j51 j51Var2 = (org.telegram.ui.Components.j51) X.get(i20);
                            org.telegram.ui.Components.l51 a10 = j51Var2.a();
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr = new Object[i12];
                            objArr[0] = Integer.valueOf(j51Var2.b());
                            sb2.append(org.telegram.messenger.bd.a0(str, str, 2131746459, objArr));
                            sb2.append(j51Var2.a ? " (" + org.telegram.messenger.bd.M0(2131746458, str) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a10.b()) {
                                j51Var = j51Var2;
                                spannableStringBuilder.append(org.telegram.messenger.g0.i0(a10.g.size, false, false));
                                spannableStringBuilder.append(org.telegram.messenger.bd.M0(2131746462, str));
                            } else {
                                j51Var = j51Var2;
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_mini_arrow_mediabold, 0);
                                wpVar.w = 90.0f;
                                float L = org.telegram.messenger.g0.L(1.0f);
                                wpVar.r = f13;
                                wpVar.s = L;
                                wpVar.H = 0.85f;
                                spannableString.setSpan(wpVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(org.telegram.messenger.g0.i0(a10.g.size, false, false));
                            }
                            org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, linearLayout, 0, sb3, false, null);
                            c2.setSubtext(spannableStringBuilder);
                            c2.d(-328966, -328966);
                            c2.b.setPadding(0, 0, 0, 0);
                            c2.setOnClickListener(new a0(rqVar, ziVar5, j51Var, 9));
                            c2.setSelectorColor(268435455);
                            i20++;
                            f13 = 0.0f;
                            str = null;
                            i12 = 1;
                        }
                        photoViewer.u0.b();
                        break;
                    }
                }
                org.telegram.ui.Components.p7 p7Var = photoViewer.G;
                if (p7Var != null && p7Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.G.getActionBarMenuOnItemClick().b(2);
                    photoViewer.p0.U(null, null);
                    break;
                }
                break;
            case 5:
                Activity activity = photoViewer.E;
                if (activity != null) {
                    photoViewer.a4 = false;
                    photoViewer.Z3 = 1;
                    if (photoViewer.Y3 == -10) {
                        photoViewer.Y3 = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.E.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.E.setRequestedOrientation(8);
                    } else {
                        photoViewer.E.setRequestedOrientation(0);
                    }
                    photoViewer.m3(false, false);
                    break;
                }
                break;
            case 6:
                Activity activity2 = photoViewer.E;
                if (activity2 != null) {
                    photoViewer.a4 = false;
                    photoViewer.Z3 = 2;
                    if (photoViewer.Y3 == -10) {
                        photoViewer.Y3 = activity2.getRequestedOrientation();
                    }
                    photoViewer.E.setRequestedOrientation(1);
                    break;
                }
                break;
            default:
                org.telegram.messenger.zi ziVar6 = photoViewer.U4;
                if (ziVar6 != null && ziVar6.s4()) {
                    org.telegram.ui.ActionBar.d2 d2Var = photoViewer.n4;
                    if (d2Var instanceof wm) {
                        ((wm) d2Var).ja(photoViewer.U4, false, true);
                    }
                    photoViewer.H0(true, false);
                    String str4 = photoViewer.U4.R0;
                    if (str4 != null) {
                        Context context = LaunchActivity.K1;
                        if (context == null) {
                            context = photoViewer.F;
                        }
                        sf.c.s(context, Uri.parse(str4), true, false, false, null, null, false, org.telegram.messenger.hp.s1(photoViewer.U).d6, false, false);
                        break;
                    }
                }
                break;
        }
    }
}
