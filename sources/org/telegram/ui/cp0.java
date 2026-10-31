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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ cp0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0240, code lost:
    
        if (r3.startsWith("https://" + org.telegram.messenger.vp.r1(r9.T).U2) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04b2  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        es0 es0Var;
        float f7;
        int i10;
        TLRPC.Message message;
        int i11 = this.a;
        String str = null;
        int i12 = 3;
        final PhotoViewer photoViewer = this.b;
        final int i13 = 0;
        final int i14 = 1;
        switch (i11) {
            case 0:
                if (!photoViewer.e2 && !photoViewer.K1()) {
                    photoViewer.P2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer.K1() && (es0Var = photoViewer.d) != null && es0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.s3(!photoViewer.K, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.X1(true);
                photoViewer.C0(0, true);
                break;
            case 3:
                org.telegram.messenger.jj jjVar = photoViewer.T4;
                if (jjVar == null || !jjVar.r4()) {
                    if (photoViewer.F.u0.a()) {
                        photoViewer.o0.U(null, null);
                        break;
                    }
                } else {
                    org.telegram.messenger.jj jjVar2 = photoViewer.T4;
                    if (jjVar2 != null && jjVar2.r4() && photoViewer.o0.getAlpha() > 0.5f) {
                        final int i15 = photoViewer.T4.I1;
                        final th.b bVar = new th.b();
                        org.telegram.ui.Components.z60 G = org.telegram.ui.Components.z60.G(photoViewer.e0, bVar, photoViewer.o0, true);
                        G.a0(0.0f, -org.telegram.messenger.i0.L(46.0f));
                        G.V(5);
                        org.telegram.messenger.jj jjVar3 = photoViewer.T4;
                        if (jjVar3.U0 == null && jjVar3.V0 == null) {
                            String str2 = jjVar3.R0;
                            if (str2 != null) {
                                break;
                            }
                            if (!org.telegram.messenger.d20.i(i15).q() && !org.telegram.messenger.vp.r1(photoViewer.T).A3() && !photoViewer.T4.Z0) {
                                G.c(R.drawable.msg_block2, org.telegram.messenger.cd.L0(2131749332, null), new Runnable() { // from class: org.telegram.ui.uo0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i16 = i13;
                                        th.b bVar2 = bVar;
                                        int i17 = i15;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i16) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.U8;
                                                if (!org.telegram.messenger.d20.i(i17).q()) {
                                                    new kg.i1(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.cc(photoViewer2.e0, bVar2).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                                                    org.telegram.messenger.vp.r1(i17).o0(true);
                                                    org.telegram.ui.ActionBar.k2 k2Var = photoViewer2.m4;
                                                    if (k2Var instanceof un) {
                                                        un unVar = (un) k2Var;
                                                        unVar.Ua(photoViewer2.T4);
                                                        unVar.Wa(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.U8;
                                                if (!org.telegram.messenger.d20.i(i17).q()) {
                                                    new kg.i1(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.cc(photoViewer2.e0, bVar2).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                                                    org.telegram.messenger.vp.r1(i17).o0(true);
                                                    org.telegram.ui.ActionBar.k2 k2Var2 = photoViewer2.m4;
                                                    if (k2Var2 instanceof un) {
                                                        un unVar2 = (un) k2Var2;
                                                        unVar2.Ua(photoViewer2.T4);
                                                        unVar2.Wa(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.T4.Z0) {
                                G.c(R.drawable.msg_info, org.telegram.messenger.cd.L0(2131754943, null), new uf0(19, photoViewer, bVar), false);
                                if ((photoViewer.m4 instanceof un) && !org.telegram.messenger.vp.r1(i15).A3()) {
                                    G.k();
                                    G.c(R.drawable.msg_cancel, org.telegram.messenger.cd.L0(2131746335, null), new Runnable() { // from class: org.telegram.ui.uo0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i16 = i14;
                                            th.b bVar2 = bVar;
                                            int i17 = i15;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i16) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.U8;
                                                    if (!org.telegram.messenger.d20.i(i17).q()) {
                                                        new kg.i1(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.cc(photoViewer2.e0, bVar2).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                                                        org.telegram.messenger.vp.r1(i17).o0(true);
                                                        org.telegram.ui.ActionBar.k2 k2Var = photoViewer2.m4;
                                                        if (k2Var instanceof un) {
                                                            un unVar = (un) k2Var;
                                                            unVar.Ua(photoViewer2.T4);
                                                            unVar.Wa(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.U8;
                                                    if (!org.telegram.messenger.d20.i(i17).q()) {
                                                        new kg.i1(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.cc(photoViewer2.e0, bVar2).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                                                        org.telegram.messenger.vp.r1(i17).o0(true);
                                                        org.telegram.ui.ActionBar.k2 k2Var2 = photoViewer2.m4;
                                                        if (k2Var2 instanceof un) {
                                                            un unVar2 = (un) k2Var2;
                                                            unVar2.Ua(photoViewer2.T4);
                                                            unVar2.Wa(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            if (G.x() <= 0) {
                                G.Z();
                                break;
                            }
                        }
                        org.telegram.ui.Components.z60 J = G.J();
                        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, photoViewer.E, bVar, true, false);
                        b1Var.setItemHeight(44);
                        b1Var.j(org.telegram.messenger.cd.L0(2131753756, null), R.drawable.msg_arrow_back, null);
                        b1Var.getTextView().setPadding(org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(40.0f) : 0, 0);
                        b1Var.setOnClickListener(new ch(G, i14));
                        J.r(b1Var, w7.b6.o(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.h1(photoViewer.E, bVar), w7.b6.o(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str3 = photoViewer.T4.R0;
                        if (str3 != null) {
                            f7 = 300.0f;
                            if (!TextUtils.equals(org.telegram.messenger.i0.K0(str3, false), org.telegram.messenger.vp.r1(photoViewer.T).U2)) {
                                TextView textView = new TextView(photoViewer.E);
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Uc, bVar);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(10.0f));
                                textView.setMaxWidth(org.telegram.messenger.i0.L(300.0f));
                                Uri parse = Uri.parse(photoViewer.T4.R0);
                                textView.setText(gf.f.u(parse, null, null, gf.f.a(parse.getHost()), null));
                                int i16 = org.telegram.ui.ActionBar.t6.I5;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(photoViewer.B1(i16), 0, photoViewer.T4.V0 == null ? 6 : 0);
                                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i16);
                                textView.setBackground(a02);
                                org.telegram.ui.ActionBar.a7.k(textView, a02, null, N, bVar);
                                textView.setOnClickListener(new wu(25, photoViewer, G));
                                textView.setOnLongClickListener(new org.telegram.ui.Components.b0(i12, photoViewer, bVar));
                                arrayList.add(textView);
                            }
                        } else {
                            f7 = 300.0f;
                        }
                        if (photoViewer.T4.U0 != null) {
                            TextView textView2 = new TextView(photoViewer.E);
                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.E8, bVar);
                            textView2.setTextSize(1, 14.0f);
                            textView2.setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(10.0f));
                            textView2.setMaxWidth(org.telegram.messenger.i0.L(f7));
                            textView2.setText(photoViewer.T4.U0);
                            int i17 = org.telegram.ui.ActionBar.t6.I5;
                            org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(photoViewer.B1(i17), 0, photoViewer.T4.V0 == null ? 6 : 0);
                            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i17);
                            textView2.setBackground(a03);
                            org.telegram.ui.ActionBar.a7.k(textView2, a03, null, N2, bVar);
                            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.to0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i18 = i13;
                                    th.b bVar2 = bVar;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    switch (i18) {
                                        case 0:
                                            if (org.telegram.messenger.i0.g(photoViewer2.T4.U0)) {
                                                org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(photoViewer2.E), bVar2));
                                                break;
                                            }
                                            break;
                                        default:
                                            if (org.telegram.messenger.i0.g(photoViewer2.T4.V0)) {
                                                org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(photoViewer2.E), bVar2));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            arrayList.add(textView2);
                        }
                        if (photoViewer.T4.V0 != null) {
                            TextView textView3 = new TextView(photoViewer.E);
                            org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.E8, bVar);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(10.0f));
                            textView3.setMaxWidth(org.telegram.messenger.i0.L(f7));
                            textView3.setText(photoViewer.T4.V0);
                            int i18 = org.telegram.ui.ActionBar.t6.I5;
                            org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.t6.a0(photoViewer.B1(i18), 0, 6);
                            org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i18);
                            textView3.setBackground(a04);
                            org.telegram.ui.ActionBar.a7.k(textView3, a04, null, N3, bVar);
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.to0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i182 = i14;
                                    th.b bVar2 = bVar;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    switch (i182) {
                                        case 0:
                                            if (org.telegram.messenger.i0.g(photoViewer2.T4.U0)) {
                                                org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(photoViewer2.E), bVar2));
                                                break;
                                            }
                                            break;
                                        default:
                                            if (org.telegram.messenger.i0.g(photoViewer2.T4.V0)) {
                                                org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(photoViewer2.E), bVar2));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            arrayList.add(textView3);
                        }
                        for (int i19 = 0; i19 < arrayList.size(); i19++) {
                            View view2 = (View) arrayList.get(i19);
                            if (i19 > 0) {
                                FrameLayout frameLayout = new FrameLayout(photoViewer.E);
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, frameLayout, bVar);
                                i10 = -1;
                                LinearLayout.LayoutParams o10 = w7.b6.o(-1, 1);
                                o10.height = 1;
                                J.r(frameLayout, o10);
                            } else {
                                i10 = -1;
                            }
                            J.r(view2, w7.b6.o(i10, -2));
                        }
                        G.c(R.drawable.msg_channel, org.telegram.messenger.cd.L0(2131745266, null), new bi.k(G, J, 9), false);
                        if (!org.telegram.messenger.d20.i(i15).q()) {
                            G.c(R.drawable.msg_block2, org.telegram.messenger.cd.L0(2131749332, null), new Runnable() { // from class: org.telegram.ui.uo0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i162 = i13;
                                    th.b bVar2 = bVar;
                                    int i172 = i15;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    switch (i162) {
                                        case 0:
                                            Drawable[] drawableArr3 = PhotoViewer.U8;
                                            if (!org.telegram.messenger.d20.i(i172).q()) {
                                                new kg.i1(photoViewer2.m4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.cc(photoViewer2.e0, bVar2).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                                                org.telegram.messenger.vp.r1(i172).o0(true);
                                                org.telegram.ui.ActionBar.k2 k2Var = photoViewer2.m4;
                                                if (k2Var instanceof un) {
                                                    un unVar = (un) k2Var;
                                                    unVar.Ua(photoViewer2.T4);
                                                    unVar.Wa(photoViewer2.T4);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            Drawable[] drawableArr4 = PhotoViewer.U8;
                                            if (!org.telegram.messenger.d20.i(i172).q()) {
                                                new kg.i1(photoViewer2.m4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.cc(photoViewer2.e0, bVar2).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                                                org.telegram.messenger.vp.r1(i172).o0(true);
                                                org.telegram.ui.ActionBar.k2 k2Var2 = photoViewer2.m4;
                                                if (k2Var2 instanceof un) {
                                                    un unVar2 = (un) k2Var2;
                                                    unVar2.Ua(photoViewer2.T4);
                                                    unVar2.Wa(photoViewer2.T4);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (photoViewer.T4.Z0) {
                        }
                        if (G.x() <= 0) {
                        }
                    }
                }
                break;
            case 4:
                org.telegram.messenger.jj jjVar4 = photoViewer.T4;
                if (jjVar4 != null && jjVar4.D2(true)) {
                    tr trVar = photoViewer.J0;
                    org.telegram.messenger.jj jjVar5 = photoViewer.T4;
                    LinearLayout linearLayout = trVar.b;
                    if (jjVar5 != null && (message = jjVar5.k) != null && message.media != null && jjVar5.D2(true)) {
                        int i20 = jjVar5.I1;
                        TLRPC.MessageMedia messageMedia = jjVar5.k.media;
                        ArrayList X = org.telegram.ui.Components.u61.X(i20, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i21 = 0;
                        while (i21 < X.size()) {
                            org.telegram.ui.Components.r61 r61Var = (org.telegram.ui.Components.r61) X.get(i21);
                            org.telegram.ui.Components.t61 a2 = r61Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(org.telegram.messenger.cd.a0(str, str, 2131746466, Integer.valueOf(r61Var.b())));
                            sb2.append(r61Var.a ? " (" + org.telegram.messenger.cd.L0(2131746465, str) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a2.b()) {
                                spannableStringBuilder.append(org.telegram.messenger.i0.i0(a2.g.size, false, false));
                                spannableStringBuilder.append(org.telegram.messenger.cd.L0(2131746469, str));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.msg_mini_arrow_mediabold, 0);
                                dqVar.w = 90.0f;
                                float L = org.telegram.messenger.i0.L(1.0f);
                                dqVar.r = 0.0f;
                                dqVar.s = L;
                                dqVar.G = 0.85f;
                                spannableString.setSpan(dqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(org.telegram.messenger.i0.i0(a2.g.size, false, false));
                            }
                            org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.d(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            c10.setOnClickListener(new x(trVar, jjVar5, r61Var, 9));
                            c10.setSelectorColor(268435455);
                            i21++;
                            str = null;
                        }
                        photoViewer.t0.b();
                        break;
                    }
                }
                kg.g1 g1Var = photoViewer.F;
                if (g1Var != null && g1Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.F.getActionBarMenuOnItemClick().b(2);
                    photoViewer.o0.U(null, null);
                    break;
                }
                break;
            case 5:
                Activity activity = photoViewer.D;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 1;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.D.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.D.setRequestedOrientation(8);
                    } else {
                        photoViewer.D.setRequestedOrientation(0);
                    }
                    photoViewer.m3(false, false);
                    break;
                }
                break;
            case 6:
                Activity activity2 = photoViewer.D;
                if (activity2 != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 2;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity2.getRequestedOrientation();
                    }
                    photoViewer.D.setRequestedOrientation(1);
                    break;
                }
                break;
            default:
                org.telegram.messenger.jj jjVar6 = photoViewer.T4;
                if (jjVar6 != null && jjVar6.r4()) {
                    org.telegram.ui.ActionBar.k2 k2Var = photoViewer.m4;
                    if (k2Var instanceof un) {
                        ((un) k2Var).Z9(photoViewer.T4, false, true);
                    }
                    photoViewer.H0(true, false);
                    String str4 = photoViewer.T4.R0;
                    if (str4 != null) {
                        Context context = LaunchActivity.I1;
                        if (context == null) {
                            context = photoViewer.E;
                        }
                        gf.f.q(context, Uri.parse(str4), true, false, false, null, null, false, org.telegram.messenger.vp.r1(photoViewer.T).e6, false);
                        break;
                    }
                }
                break;
        }
    }
}
