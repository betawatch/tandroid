package org.telegram.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class oo0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 a;
    public final /* synthetic */ PhotoViewer b;

    public oo0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = photoViewer;
        this.a = e6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.T4 == null && photoViewer.b5 == null) {
            if (photoViewer.a5 != null) {
                org.telegram.messenger.w7.G(photoViewer.U);
                org.telegram.messenger.gc gcVar = photoViewer.a5;
                File J = org.telegram.messenger.w7.J(gcVar == null ? null : gcVar.f, PhotoViewer.m1(gcVar), photoViewer.z5 != 0 || photoViewer.B5, true);
                File file = new File(org.telegram.messenger.w7.z(4), J.getName());
                org.telegram.messenger.w7.G(photoViewer.U);
                org.telegram.messenger.gc gcVar2 = photoViewer.a5;
                File J2 = org.telegram.messenger.w7.J(gcVar2 != null ? gcVar2.f : null, PhotoViewer.m1(gcVar2), false, true);
                if (!J.exists() && !file.exists() && !J2.exists()) {
                    return false;
                }
            } else if (photoViewer.j7 != null) {
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x040f, code lost:
    
        if (a8.p0.B(r3) != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0808, code lost:
    
        if (r10 == org.telegram.messenger.m10.i(r15).e()) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x080c, code lost:
    
        if (r9 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x080e, code lost:
    
        r10 = r7.U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0818, code lost:
    
        if (org.telegram.messenger.np.s1(r10).d3 == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x081a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x081d, code lost:
    
        r10 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0825, code lost:
    
        if (r10.k.action == null) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0827, code lost:
    
        r10 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0831, code lost:
    
        if ((r10.k.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0834, code lost:
    
        r2 = "Cancel";
        r6 = 2131752589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x083a, code lost:
    
        r10 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0842, code lost:
    
        if (r10.N3() != false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0844, code lost:
    
        if (r11 != false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x084a, code lost:
    
        if (org.telegram.messenger.t3.N(r41) == false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x084c, code lost:
    
        r10 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0855, code lost:
    
        if ((r12 - r10.k.date) > r13) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0857, code lost:
    
        r10 = r7.E;
        r15 = new android.widget.FrameLayout(r10);
        r11 = r7.E;
        r8 = new org.telegram.ui.Cells.c2(1, r11, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0872, code lost:
    
        if (r41 == null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0874, code lost:
    
        r8.e(org.telegram.messenger.hd.M0(2131751540, "DeleteForAll"), "", false, false, false);
        r2 = "Cancel";
        r6 = 2131752589;
        r5 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x08bc, code lost:
    
        if (org.telegram.messenger.hd.a0 == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x08be, code lost:
    
        r9 = org.telegram.messenger.g0.L(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x08c9, code lost:
    
        if (org.telegram.messenger.hd.a0 == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08cb, code lost:
    
        r10 = org.telegram.messenger.g0.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08d4, code lost:
    
        r8.setPadding(r9, 0, r10, 0);
        r15.addView(r8, c8.ja.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.k8(r5, r0));
        r3.o(r15);
        r3.a.H = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x08d0, code lost:
    
        r10 = org.telegram.messenger.g0.L(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x08c3, code lost:
    
        r9 = org.telegram.messenger.g0.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0892, code lost:
    
        r2 = "Cancel";
        r6 = 2131752589;
        r5 = 5;
        r8.e(org.telegram.messenger.hd.Y(2131751539, "DeleteForUser", org.telegram.messenger.q10.i(r9)), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x081c, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x080a, code lost:
    
        if (r41 != null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x06d5, code lost:
    
        if (r9 == r13) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x06e5, code lost:
    
        if (r9.H4() != false) goto L326;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0e1b  */
    /* JADX WARN: Removed duplicated region for block: B:552:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0243  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        int i10;
        org.telegram.messenger.gj gjVar3;
        int i11;
        Activity activity;
        Activity activity2;
        org.telegram.messenger.gj gjVar4;
        org.telegram.messenger.gj gjVar5;
        org.telegram.messenger.gj gjVar6;
        pq0 pq0Var;
        pq0 pq0Var2;
        int i12;
        Activity activity3;
        org.telegram.messenger.gj gjVar7;
        Activity activity4;
        org.telegram.messenger.gj gjVar8;
        org.telegram.messenger.gj gjVar9;
        org.telegram.messenger.gj gjVar10;
        Activity activity5;
        org.telegram.messenger.gj gjVar11;
        Activity activity6;
        org.telegram.messenger.gj gjVar12;
        org.telegram.messenger.gj gjVar13;
        org.telegram.messenger.gj gjVar14;
        org.telegram.messenger.gj gjVar15;
        TLObject tLObject;
        Activity activity7;
        org.telegram.messenger.gj gjVar16;
        org.telegram.ui.Components.bw0 bw0Var;
        org.telegram.messenger.gj gjVar17;
        org.telegram.messenger.gc gcVar;
        org.telegram.messenger.gc gcVar2;
        TLRPC.Photo photo;
        org.telegram.messenger.gc gcVar3;
        org.telegram.messenger.gc gcVar4;
        TLRPC.Photo photo2;
        int i13;
        Activity activity8;
        long j3;
        org.telegram.messenger.gc gcVar5;
        org.telegram.messenger.gc gcVar6;
        org.telegram.messenger.gj gjVar18;
        int i14;
        int i15;
        org.telegram.messenger.gc gcVar7;
        org.telegram.messenger.gc gcVar8;
        org.telegram.messenger.gc gcVar9;
        String str;
        sq0 sq0Var;
        int i16;
        org.telegram.messenger.gc gcVar10;
        org.telegram.messenger.gc gcVar11;
        int i17;
        int i18;
        long j10;
        int i19;
        long j11;
        int i20;
        long j12;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        long j13;
        UndoView undoView;
        long j14;
        org.telegram.messenger.gc gcVar12;
        org.telegram.messenger.gc gcVar13;
        int i32;
        int i33;
        int i34;
        org.telegram.messenger.gj gjVar19;
        pq0 pq0Var3;
        pq0 pq0Var4;
        int i35;
        int i36;
        int i37;
        pq0 pq0Var5;
        org.telegram.messenger.gj gjVar20;
        an anVar;
        int i38;
        int i39;
        org.telegram.messenger.gj gjVar21;
        an anVar2;
        an anVar3;
        org.telegram.messenger.gj gjVar22;
        int i40;
        org.telegram.messenger.gj gjVar23;
        org.telegram.ui.ActionBar.q0 q0Var;
        View findViewWithTag;
        org.telegram.ui.Components.ae0 ae0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        sq0 sq0Var2;
        org.telegram.messenger.gj gjVar24;
        boolean z10;
        Activity activity10;
        sq0 sq0Var3;
        CharSequence b02;
        org.telegram.messenger.gc gcVar14;
        org.telegram.messenger.gj gjVar25;
        org.telegram.messenger.gj gjVar26;
        org.telegram.messenger.gj gjVar27;
        org.telegram.messenger.gj gjVar28;
        org.telegram.messenger.gc gcVar15;
        org.telegram.messenger.gc gcVar16;
        org.telegram.messenger.gj gjVar29;
        TextView textView;
        org.telegram.messenger.gj gjVar30;
        org.telegram.messenger.gj gjVar31;
        int i41;
        TLRPC.Chat M0;
        TLRPC.User user;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        org.telegram.messenger.gj gjVar32;
        org.telegram.messenger.gj gjVar33;
        int i48;
        Activity activity11;
        sq0 sq0Var4;
        sq0 sq0Var5;
        org.telegram.messenger.gj gjVar34;
        Activity activity12;
        org.telegram.messenger.gj gjVar35;
        boolean z11;
        Activity activity13;
        org.telegram.messenger.gj gjVar36;
        ArrayList arrayList;
        an anVar4;
        String str2;
        org.telegram.messenger.bj bjVar;
        org.telegram.messenger.gj gjVar37;
        org.telegram.messenger.gj gjVar38;
        an anVar5;
        Activity activity14;
        boolean z12;
        Activity activity15;
        int w12;
        int w13;
        int w14;
        an anVar6;
        org.telegram.messenger.gj gjVar39;
        org.telegram.messenger.gj gjVar40;
        int i49;
        sq0 sq0Var6;
        org.telegram.messenger.gj gjVar41;
        org.telegram.messenger.gj gjVar42;
        org.telegram.messenger.gj gjVar43;
        String str3;
        an anVar7;
        int i50;
        org.telegram.messenger.gj gjVar44;
        org.telegram.messenger.gj gjVar45;
        an anVar8;
        Activity activity16;
        Activity activity17;
        an anVar9;
        f5.k i110;
        org.telegram.ui.Components.j7 j7Var;
        pq0 pq0Var6;
        Activity activity18;
        Activity activity19;
        an anVar10;
        org.telegram.messenger.bj bjVar2;
        org.telegram.messenger.gj gjVar46;
        Activity activity20;
        org.telegram.messenger.gj gjVar47;
        String M02;
        int w15;
        View d;
        int w16;
        int w17;
        org.telegram.messenger.gj gjVar48;
        org.telegram.messenger.gj gjVar49;
        org.telegram.messenger.gj gjVar50;
        org.telegram.messenger.gc gcVar17;
        pq0 pq0Var7;
        boolean z13;
        File file;
        pq0 pq0Var8;
        int i51;
        pq0 pq0Var9;
        int i52;
        org.telegram.messenger.gc gcVar18;
        int i53;
        org.telegram.messenger.gc gcVar19;
        long j15;
        boolean z14;
        File J;
        int i54;
        org.telegram.messenger.gc gcVar20;
        boolean z15;
        org.telegram.messenger.gj gjVar51;
        Object[] objArr;
        File file2;
        Activity activity21;
        Activity activity22;
        org.telegram.messenger.gj gjVar52;
        TLRPC.Document document;
        int i55;
        int i56;
        org.telegram.messenger.gj gjVar53;
        org.telegram.messenger.gj gjVar54;
        org.telegram.messenger.gj gjVar55;
        int i57;
        org.telegram.messenger.gj gjVar56;
        org.telegram.messenger.gj gjVar57;
        org.telegram.messenger.gj gjVar58;
        org.telegram.messenger.gj gjVar59;
        int i58;
        TLObject l1;
        int i59;
        an anVar11;
        org.telegram.messenger.gj gjVar60;
        boolean z16;
        boolean F1;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        boolean z17 = true;
        z17 = true;
        z17 = true;
        PhotoViewer photoViewer2 = this.b;
        if (i7 == -1) {
            tp0 tp0Var = photoViewer2.M1;
            if (tp0Var == null || !tp0Var.n0()) {
                F1 = photoViewer2.F1();
                if (F1) {
                    photoViewer2.x0(false);
                    return;
                } else {
                    photoViewer2.z0(true, false);
                    return;
                }
            }
            return;
        }
        final int i60 = 0;
        if (i7 == 2) {
            pq0Var6 = photoViewer2.j7;
            if (pq0Var6 != null) {
                z16 = photoViewer2.l2;
                if (!z16) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) {
                activity18 = photoViewer2.E;
                if (activity18.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    activity19 = photoViewer2.E;
                    activity19.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            final ArrayList arrayList2 = new ArrayList(1);
            anVar10 = photoViewer2.l4;
            if (anVar10 != null) {
                anVar11 = photoViewer2.l4;
                gjVar60 = photoViewer2.T4;
                bjVar2 = anVar11.U8(gjVar60.c1());
            } else {
                bjVar2 = null;
            }
            if (bjVar2 != null) {
                arrayList2.addAll(bjVar2.d);
            } else {
                gjVar46 = photoViewer2.T4;
                arrayList2.add(gjVar46);
            }
            if (arrayList2.size() > 1) {
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                for (int i61 = 0; i61 < arrayList2.size(); i61++) {
                    org.telegram.messenger.gj gjVar61 = (org.telegram.messenger.gj) arrayList2.get(i61);
                    if (gjVar61.D3()) {
                        z20 = true;
                    } else if (gjVar61.H4()) {
                        z18 = true;
                    } else {
                        z19 = true;
                    }
                }
                activity20 = photoViewer2.E;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity20, e6Var);
                alertDialog$Builder.l(org.telegram.messenger.hd.M0(2131745941, "SaveGroupMedia"));
                alertDialog$Builder.g(org.telegram.messenger.hd.M0(2131745940, "SaveGroupMediaMessage"));
                alertDialog$Builder.a.J = org.telegram.ui.ActionBar.j6.gh;
                gjVar47 = photoViewer2.T4;
                if (gjVar47 != null) {
                    gjVar48 = photoViewer2.T4;
                    if (gjVar48.H4()) {
                        gjVar49 = photoViewer2.T4;
                        if (!gjVar49.D3()) {
                            M02 = org.telegram.messenger.hd.M0(2131744142, "ThisMedia");
                            final int i62 = true ? 1 : 0;
                            alertDialog$Builder.h(M02, new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.go0
                                public final /* synthetic */ oo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i63) {
                                    File M;
                                    switch (i62) {
                                        case 0:
                                            oo0 oo0Var = this.b;
                                            oo0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer3 = oo0Var.b;
                                            arrayList3.add(photoViewer3.T4);
                                            PhotoViewer.u(photoViewer3, arrayList3);
                                            break;
                                        default:
                                            oo0 oo0Var2 = this.b;
                                            PhotoViewer photoViewer4 = oo0Var2.b;
                                            org.telegram.messenger.gj gjVar62 = photoViewer4.T4;
                                            if (gjVar62 != null) {
                                                File file3 = null;
                                                if ((org.telegram.messenger.gj.n1(gjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.gj.n1(photoViewer4.T4.k).webpage != null && org.telegram.messenger.gj.n1(photoViewer4.T4.k).webpage.document == null) {
                                                    TLObject l12 = photoViewer4.l1(photoViewer4.P4, null);
                                                    org.telegram.messenger.w7.G(photoViewer4.U);
                                                    M = org.telegram.messenger.w7.J(l12, null, true, true);
                                                } else {
                                                    org.telegram.messenger.w7.G(photoViewer4.U);
                                                    M = org.telegram.messenger.w7.M(photoViewer4.T4.k, false, true);
                                                }
                                                boolean L4 = org.telegram.messenger.gj.L4(photoViewer4.T4.k);
                                                boolean D3 = photoViewer4.T4.D3();
                                                if (D3) {
                                                    TLRPC.Document document2 = org.telegram.messenger.gj.n1(photoViewer4.T4.k) != null ? org.telegram.messenger.gj.n1(photoViewer4.T4.k).document : null;
                                                    if (document2 != null) {
                                                        org.telegram.messenger.w7.G(photoViewer4.U);
                                                        File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                                        if (J2 == null || !J2.exists()) {
                                                            org.telegram.messenger.w7.G(photoViewer4.U);
                                                            file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                                        } else {
                                                            file3 = J2;
                                                        }
                                                    }
                                                }
                                                if (!D3) {
                                                    if (M != null && M.exists()) {
                                                        MediaController.d0(M.toString(), photoViewer4.E, L4 ? 1 : 0, null, null, new io0(oo0Var2, L4, 0));
                                                        break;
                                                    } else {
                                                        photoViewer4.S2();
                                                        break;
                                                    }
                                                } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                                    MediaController.e0(M.toString(), file3.toString(), photoViewer4.E, new fo0(oo0Var2, 1));
                                                    break;
                                                } else {
                                                    photoViewer4.S2();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            final boolean z21 = z18;
                            final boolean z22 = z19;
                            final boolean z23 = z20;
                            alertDialog$Builder.k((!z18 || z20) ? org.telegram.messenger.hd.G(arrayList2.size(), "AllNMedia", new Object[0]) : org.telegram.messenger.hd.G(arrayList2.size(), "AllNPhotos", new Object[0]), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.lo0
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i63) {
                                    File M;
                                    oo0 oo0Var = oo0.this;
                                    PhotoViewer photoViewer3 = oo0Var.b;
                                    int[] iArr = new int[1];
                                    final qn0 qn0Var = new qn0(oo0Var, new int[1], iArr, z21, z22, z23);
                                    int i64 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i64 >= arrayList3.size()) {
                                            return;
                                        }
                                        org.telegram.messenger.gj gjVar62 = (org.telegram.messenger.gj) arrayList3.get(i64);
                                        if (gjVar62 != null) {
                                            File file3 = null;
                                            if ((org.telegram.messenger.gj.n1(gjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.gj.n1(gjVar62.k).webpage != null && org.telegram.messenger.gj.n1(gjVar62.k).webpage.document == null) {
                                                org.telegram.messenger.w7.G(photoViewer3.U);
                                                M = org.telegram.messenger.w7.J(photoViewer3.l1(photoViewer3.P4, null), null, true, true);
                                            } else {
                                                org.telegram.messenger.w7.G(photoViewer3.U);
                                                M = org.telegram.messenger.w7.M(gjVar62.k, false, true);
                                            }
                                            boolean L4 = org.telegram.messenger.gj.L4(gjVar62.k);
                                            boolean D3 = gjVar62.D3();
                                            if (D3) {
                                                TLRPC.Document document2 = org.telegram.messenger.gj.n1(gjVar62.k) != null ? org.telegram.messenger.gj.n1(gjVar62.k).document : null;
                                                if (document2 != null) {
                                                    org.telegram.messenger.w7.G(photoViewer3.U);
                                                    File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                                    if (J2 == null || !J2.exists()) {
                                                        org.telegram.messenger.w7.G(photoViewer3.U);
                                                        file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                                    } else {
                                                        file3 = J2;
                                                    }
                                                }
                                            }
                                            if (D3 && M != null && M.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                if (file3 == null || !file3.exists()) {
                                                    final int i65 = 1;
                                                    MediaController.d0(M.toString(), photoViewer3.E, 0, null, null, new org.telegram.messenger.z10() { // from class: org.telegram.ui.ho0
                                                        @Override // org.telegram.messenger.z10
                                                        public final void a(Object obj) {
                                                            switch (i65) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(qn0Var);
                                                                    break;
                                                                case 1:
                                                                    org.telegram.messenger.g0.h3(qn0Var);
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(qn0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i66 = 0;
                                                    MediaController.e0(M.toString(), file3.toString(), photoViewer3.E, new org.telegram.messenger.z10() { // from class: org.telegram.ui.ho0
                                                        @Override // org.telegram.messenger.z10
                                                        public final void a(Object obj) {
                                                            switch (i66) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(qn0Var);
                                                                    break;
                                                                case 1:
                                                                    org.telegram.messenger.g0.h3(qn0Var);
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(qn0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!D3 && M != null && M.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i67 = 2;
                                                MediaController.d0(M.toString(), photoViewer3.E, L4 ? 1 : 0, null, null, new org.telegram.messenger.z10() { // from class: org.telegram.ui.ho0
                                                    @Override // org.telegram.messenger.z10
                                                    public final void a(Object obj) {
                                                        switch (i67) {
                                                            case 0:
                                                                org.telegram.messenger.g0.h3(qn0Var);
                                                                break;
                                                            case 1:
                                                                org.telegram.messenger.g0.h3(qn0Var);
                                                                break;
                                                            default:
                                                                org.telegram.messenger.g0.h3(qn0Var);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        i64++;
                                    }
                                }
                            });
                            alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131752589, "Cancel"), new t70(6));
                            org.telegram.ui.ActionBar.t1 a10 = alertDialog$Builder.a();
                            w15 = photoViewer2.w1(org.telegram.ui.ActionBar.j6.lh);
                            a10.j(w15);
                            a10.show();
                            d = a10.d(-3);
                            if (d instanceof TextView) {
                                int i63 = org.telegram.ui.ActionBar.j6.q7;
                                org.telegram.ui.ActionBar.q6.U((TextView) d, i63, photoViewer2.w2);
                                w17 = photoViewer2.w1(i63);
                                d.setBackground(org.telegram.ui.ActionBar.j6.J0(org.telegram.messenger.g0.L(3.0f), w17));
                                ViewGroup viewGroup = a10.u0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            w16 = photoViewer2.w1(org.telegram.ui.ActionBar.j6.Yg);
                            a10.p(w16);
                            return;
                        }
                    }
                }
                M02 = org.telegram.messenger.hd.M0(2131744141, "ThisPhoto");
                final int i622 = true ? 1 : 0;
                alertDialog$Builder.h(M02, new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.go0
                    public final /* synthetic */ oo0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.q1
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i632) {
                        File M;
                        switch (i622) {
                            case 0:
                                oo0 oo0Var = this.b;
                                oo0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer3 = oo0Var.b;
                                arrayList3.add(photoViewer3.T4);
                                PhotoViewer.u(photoViewer3, arrayList3);
                                break;
                            default:
                                oo0 oo0Var2 = this.b;
                                PhotoViewer photoViewer4 = oo0Var2.b;
                                org.telegram.messenger.gj gjVar62 = photoViewer4.T4;
                                if (gjVar62 != null) {
                                    File file3 = null;
                                    if ((org.telegram.messenger.gj.n1(gjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.gj.n1(photoViewer4.T4.k).webpage != null && org.telegram.messenger.gj.n1(photoViewer4.T4.k).webpage.document == null) {
                                        TLObject l12 = photoViewer4.l1(photoViewer4.P4, null);
                                        org.telegram.messenger.w7.G(photoViewer4.U);
                                        M = org.telegram.messenger.w7.J(l12, null, true, true);
                                    } else {
                                        org.telegram.messenger.w7.G(photoViewer4.U);
                                        M = org.telegram.messenger.w7.M(photoViewer4.T4.k, false, true);
                                    }
                                    boolean L4 = org.telegram.messenger.gj.L4(photoViewer4.T4.k);
                                    boolean D3 = photoViewer4.T4.D3();
                                    if (D3) {
                                        TLRPC.Document document2 = org.telegram.messenger.gj.n1(photoViewer4.T4.k) != null ? org.telegram.messenger.gj.n1(photoViewer4.T4.k).document : null;
                                        if (document2 != null) {
                                            org.telegram.messenger.w7.G(photoViewer4.U);
                                            File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                            if (J2 == null || !J2.exists()) {
                                                org.telegram.messenger.w7.G(photoViewer4.U);
                                                file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                            } else {
                                                file3 = J2;
                                            }
                                        }
                                    }
                                    if (!D3) {
                                        if (M != null && M.exists()) {
                                            MediaController.d0(M.toString(), photoViewer4.E, L4 ? 1 : 0, null, null, new io0(oo0Var2, L4, 0));
                                            break;
                                        } else {
                                            photoViewer4.S2();
                                            break;
                                        }
                                    } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                        MediaController.e0(M.toString(), file3.toString(), photoViewer4.E, new fo0(oo0Var2, 1));
                                        break;
                                    } else {
                                        photoViewer4.S2();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                final boolean z212 = z18;
                final boolean z222 = z19;
                final boolean z232 = z20;
                alertDialog$Builder.k((!z18 || z20) ? org.telegram.messenger.hd.G(arrayList2.size(), "AllNMedia", new Object[0]) : org.telegram.messenger.hd.G(arrayList2.size(), "AllNPhotos", new Object[0]), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.lo0
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i632) {
                        File M;
                        oo0 oo0Var = oo0.this;
                        PhotoViewer photoViewer3 = oo0Var.b;
                        int[] iArr = new int[1];
                        final qn0 qn0Var = new qn0(oo0Var, new int[1], iArr, z212, z222, z232);
                        int i64 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i64 >= arrayList3.size()) {
                                return;
                            }
                            org.telegram.messenger.gj gjVar62 = (org.telegram.messenger.gj) arrayList3.get(i64);
                            if (gjVar62 != null) {
                                File file3 = null;
                                if ((org.telegram.messenger.gj.n1(gjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.gj.n1(gjVar62.k).webpage != null && org.telegram.messenger.gj.n1(gjVar62.k).webpage.document == null) {
                                    org.telegram.messenger.w7.G(photoViewer3.U);
                                    M = org.telegram.messenger.w7.J(photoViewer3.l1(photoViewer3.P4, null), null, true, true);
                                } else {
                                    org.telegram.messenger.w7.G(photoViewer3.U);
                                    M = org.telegram.messenger.w7.M(gjVar62.k, false, true);
                                }
                                boolean L4 = org.telegram.messenger.gj.L4(gjVar62.k);
                                boolean D3 = gjVar62.D3();
                                if (D3) {
                                    TLRPC.Document document2 = org.telegram.messenger.gj.n1(gjVar62.k) != null ? org.telegram.messenger.gj.n1(gjVar62.k).document : null;
                                    if (document2 != null) {
                                        org.telegram.messenger.w7.G(photoViewer3.U);
                                        File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                        if (J2 == null || !J2.exists()) {
                                            org.telegram.messenger.w7.G(photoViewer3.U);
                                            file3 = org.telegram.messenger.w7.J(document2, null, true, true);
                                        } else {
                                            file3 = J2;
                                        }
                                    }
                                }
                                if (D3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        final int i65 = 1;
                                        MediaController.d0(M.toString(), photoViewer3.E, 0, null, null, new org.telegram.messenger.z10() { // from class: org.telegram.ui.ho0
                                            @Override // org.telegram.messenger.z10
                                            public final void a(Object obj) {
                                                switch (i65) {
                                                    case 0:
                                                        org.telegram.messenger.g0.h3(qn0Var);
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.h3(qn0Var);
                                                        break;
                                                    default:
                                                        org.telegram.messenger.g0.h3(qn0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i66 = 0;
                                        MediaController.e0(M.toString(), file3.toString(), photoViewer3.E, new org.telegram.messenger.z10() { // from class: org.telegram.ui.ho0
                                            @Override // org.telegram.messenger.z10
                                            public final void a(Object obj) {
                                                switch (i66) {
                                                    case 0:
                                                        org.telegram.messenger.g0.h3(qn0Var);
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.h3(qn0Var);
                                                        break;
                                                    default:
                                                        org.telegram.messenger.g0.h3(qn0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!D3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i67 = 2;
                                    MediaController.d0(M.toString(), photoViewer3.E, L4 ? 1 : 0, null, null, new org.telegram.messenger.z10() { // from class: org.telegram.ui.ho0
                                        @Override // org.telegram.messenger.z10
                                        public final void a(Object obj) {
                                            switch (i67) {
                                                case 0:
                                                    org.telegram.messenger.g0.h3(qn0Var);
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(qn0Var);
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.h3(qn0Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i64++;
                        }
                    }
                });
                alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131752589, "Cancel"), new t70(6));
                org.telegram.ui.ActionBar.t1 a102 = alertDialog$Builder.a();
                w15 = photoViewer2.w1(org.telegram.ui.ActionBar.j6.lh);
                a102.j(w15);
                a102.show();
                d = a102.d(-3);
                if (d instanceof TextView) {
                }
                w16 = photoViewer2.w1(org.telegram.ui.ActionBar.j6.Yg);
                a102.p(w16);
                return;
            }
            gjVar50 = photoViewer2.T4;
            if (gjVar50 != null) {
                gjVar55 = photoViewer2.T4;
                if (org.telegram.messenger.gj.n1(gjVar55.k) instanceof TLRPC.TL_messageMediaWebPage) {
                    gjVar58 = photoViewer2.T4;
                    if (org.telegram.messenger.gj.n1(gjVar58.k).webpage != null) {
                        gjVar59 = photoViewer2.T4;
                        if (org.telegram.messenger.gj.n1(gjVar59.k).webpage.document == null) {
                            i58 = photoViewer2.P4;
                            l1 = photoViewer2.l1(i58, null);
                            i59 = photoViewer2.U;
                            org.telegram.messenger.w7.G(i59);
                            file = org.telegram.messenger.w7.K(l1, true);
                            if (!file.exists()) {
                                file = new File(org.telegram.messenger.w7.z(4), file.getName());
                            }
                            gjVar57 = photoViewer2.T4;
                            z13 = gjVar57.H4();
                        }
                    }
                }
                i57 = photoViewer2.U;
                org.telegram.messenger.w7.G(i57);
                gjVar56 = photoViewer2.T4;
                file = org.telegram.messenger.w7.L(gjVar56.k);
                gjVar57 = photoViewer2.T4;
                z13 = gjVar57.H4();
            } else {
                gcVar17 = photoViewer2.a5;
                if (gcVar17 != null) {
                    gcVar18 = photoViewer2.a5;
                    String m12 = PhotoViewer.m1(gcVar18);
                    i53 = photoViewer2.U;
                    org.telegram.messenger.w7.G(i53);
                    gcVar19 = photoViewer2.a5;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gcVar19 == null ? null : gcVar19.f;
                    j15 = photoViewer2.z5;
                    if (j15 == 0) {
                        z15 = photoViewer2.B5;
                        if (!z15) {
                            z14 = false;
                            J = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated, m12, z14, true);
                            if (J != null && !J.exists()) {
                                i54 = photoViewer2.U;
                                org.telegram.messenger.w7.G(i54);
                                gcVar20 = photoViewer2.a5;
                                J = org.telegram.messenger.w7.J(gcVar20 != null ? null : gcVar20.f, m12, false, true);
                            }
                            if (m12 != null) {
                                m12 = m12.toLowerCase();
                            }
                            File file3 = J;
                            z13 = m12 == null && (m12.equals("webm") || m12.equals("mp4") || m12.equals("gif"));
                            file = file3;
                        }
                    }
                    z14 = true;
                    J = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated, m12, z14, true);
                    if (J != null) {
                        i54 = photoViewer2.U;
                        org.telegram.messenger.w7.G(i54);
                        gcVar20 = photoViewer2.a5;
                        J = org.telegram.messenger.w7.J(gcVar20 != null ? null : gcVar20.f, m12, false, true);
                    }
                    if (m12 != null) {
                    }
                    File file32 = J;
                    z13 = m12 == null && (m12.equals("webm") || m12.equals("mp4") || m12.equals("gif"));
                    file = file32;
                } else {
                    pq0Var7 = photoViewer2.j7;
                    if (pq0Var7 != null) {
                        pq0Var8 = photoViewer2.j7;
                        i51 = photoViewer2.P4;
                        file = pq0Var8.b(i51);
                        pq0Var9 = photoViewer2.j7;
                        i52 = photoViewer2.P4;
                        z13 = pq0Var9.a(i52);
                    } else {
                        z13 = false;
                        file = null;
                    }
                }
            }
            if (file != null && !file.exists()) {
                file = new File(org.telegram.messenger.w7.z(4), file.getName());
            }
            gjVar51 = photoViewer2.T4;
            if (gjVar51 != null) {
                gjVar54 = photoViewer2.T4;
                if (gjVar54.D3()) {
                    objArr = true;
                    if (objArr != false) {
                        gjVar52 = photoViewer2.T4;
                        if (org.telegram.messenger.gj.n1(gjVar52.k) != null) {
                            gjVar53 = photoViewer2.T4;
                            document = org.telegram.messenger.gj.n1(gjVar53.k).document;
                        } else {
                            document = null;
                        }
                        if (document != null) {
                            i55 = photoViewer2.U;
                            org.telegram.messenger.w7.G(i55);
                            file2 = org.telegram.messenger.w7.K(document, false);
                            if (file2 == null || !file2.exists()) {
                                i56 = photoViewer2.U;
                                org.telegram.messenger.w7.G(i56);
                                file2 = org.telegram.messenger.w7.K(document, true);
                            }
                            if (objArr != true) {
                                if (file == null || !file.exists()) {
                                    photoViewer2.S2();
                                    return;
                                }
                                String file4 = file.toString();
                                activity21 = photoViewer2.E;
                                MediaController.d0(file4, activity21, z13 ? 1 : 0, null, null, new io0(this, z13, 1));
                                return;
                            }
                            if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                                photoViewer2.S2();
                                return;
                            }
                            String file5 = file.toString();
                            String file6 = file2.toString();
                            activity22 = photoViewer2.E;
                            MediaController.e0(file5, file6, activity22, new fo0(this, 0));
                            return;
                        }
                    }
                    file2 = null;
                    if (objArr != true) {
                    }
                }
            }
            objArr = false;
            if (objArr != false) {
            }
            file2 = null;
            if (objArr != true) {
            }
        } else {
            if (i7 == 24) {
                wf.b I = wf.b.I();
                i110 = photoViewer2.i1();
                I.P(i110);
                j7Var = photoViewer2.H0;
                j7Var.performClick();
                return;
            }
            if (i7 == 3) {
                if (photoViewer2.E5 != 0) {
                    photoViewer2.s4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", photoViewer2.E5);
                    org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(bundle, null);
                    anVar8 = photoViewer2.l4;
                    if (anVar8 != null) {
                        anVar9 = photoViewer2.l4;
                        x80Var.e0(anVar9.Q8());
                    }
                    photoViewer2.z0(false, false);
                    activity16 = photoViewer2.E;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = photoViewer2.E;
                        ((LaunchActivity) activity17).u0(x80Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == 5 || i7 == 21) {
                gjVar = photoViewer2.T4;
                if (gjVar == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                long j16 = photoViewer2.E5;
                gjVar2 = photoViewer2.T4;
                if (gjVar2 != null) {
                    gjVar5 = photoViewer2.T4;
                    j16 = gjVar5.A0();
                }
                if (org.telegram.messenger.m5.C(j16)) {
                    bundle2.putInt("enc_id", org.telegram.messenger.m5.h(j16));
                } else if (org.telegram.messenger.m5.E(j16)) {
                    bundle2.putLong("user_id", j16);
                } else {
                    i10 = photoViewer2.U;
                    TLRPC.Chat M03 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-j16));
                    if (M03 != null && M03.migrated_to != null) {
                        bundle2.putLong("migrated_to", j16);
                        j16 = -M03.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -j16);
                }
                gjVar3 = photoViewer2.T4;
                bundle2.putInt("message_id", gjVar3.e1());
                if (i7 == 21) {
                    gjVar4 = photoViewer2.T4;
                    bundle2.putInt("reply_to", gjVar4.e1());
                }
                i11 = photoViewer2.U;
                org.telegram.messenger.ns.f(i11).k(org.telegram.messenger.ns.t, new Object[0]);
                activity = photoViewer2.E;
                if (activity instanceof LaunchActivity) {
                    activity2 = photoViewer2.E;
                    LaunchActivity launchActivity = (LaunchActivity) activity2;
                    launchActivity.u0(new an(bundle2), launchActivity.R() > 1 || org.telegram.messenger.g0.Q1(), true);
                }
                photoViewer2.z0(false, false);
                photoViewer2.T4 = null;
                VideoAds videoAds = photoViewer2.U4;
                if (videoAds != null) {
                    videoAds.stop();
                    photoViewer2.U4 = null;
                    return;
                }
                return;
            }
            if (i7 == 25) {
                if (photoViewer2.m4 != null) {
                    sq0Var6 = photoViewer2.d;
                    if (sq0Var6 == null) {
                        return;
                    }
                    gjVar41 = photoViewer2.T4;
                    if (gjVar41 != null) {
                        gjVar42 = photoViewer2.T4;
                        if (gjVar42.k == null) {
                            return;
                        }
                        gjVar43 = photoViewer2.T4;
                        if (!TextUtils.isEmpty(gjVar43.k.attachPath)) {
                            gjVar45 = photoViewer2.T4;
                            str3 = gjVar45.k.attachPath;
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                        str3 = null;
                        if (TextUtils.isEmpty(str3)) {
                            i50 = photoViewer2.U;
                            org.telegram.messenger.w7.G(i50);
                            gjVar44 = photoViewer2.T4;
                            File N = org.telegram.messenger.w7.N(gjVar44.k);
                            if (N != null && N.exists()) {
                                str3 = N.getAbsolutePath();
                            }
                        }
                        String str4 = str3;
                        if (TextUtils.isEmpty(str4)) {
                            return;
                        }
                        anVar7 = photoViewer2.l4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new org.telegram.messenger.ff(0, str4, 0, false, 0, 0));
                        this.b.f2(arrayList3, 0, 11, false, new mo0(), anVar7);
                        photoViewer2.S0(null, null, false, null);
                        photoViewer2.k2();
                        ns.p().w();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 == 4) {
                gjVar34 = photoViewer2.T4;
                if (gjVar34 == null) {
                    return;
                }
                activity12 = photoViewer2.E;
                if (!(activity12 instanceof LaunchActivity)) {
                    return;
                }
                gjVar35 = photoViewer2.T4;
                if (!gjVar35.r1) {
                    gjVar40 = photoViewer2.T4;
                    long A0 = gjVar40.A0();
                    if (org.telegram.messenger.m5.z(A0)) {
                        i49 = photoViewer2.U;
                        z11 = org.telegram.messenger.t3.V(org.telegram.messenger.np.s1(i49).M0(Long.valueOf(-A0)));
                        activity13 = photoViewer2.E;
                        gjVar36 = photoViewer2.T4;
                        ((LaunchActivity) activity13).O0(gjVar36.K1);
                        arrayList = new ArrayList(1);
                        anVar4 = photoViewer2.l4;
                        if (anVar4 == null) {
                            anVar6 = photoViewer2.l4;
                            gjVar39 = photoViewer2.T4;
                            str2 = "AllNMedia";
                            bjVar = anVar6.U8(gjVar39.c1());
                        } else {
                            str2 = "AllNMedia";
                            bjVar = null;
                        }
                        if (bjVar == null) {
                            arrayList.addAll(bjVar.d);
                        } else {
                            gjVar37 = photoViewer2.T4;
                            arrayList.add(gjVar37);
                        }
                        if (!z11 && arrayList.size() <= 1) {
                            PhotoViewer.u(photoViewer2, arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            yw ywVar = new yw(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            gjVar38 = photoViewer2.T4;
                            arrayList4.add(gjVar38);
                            anVar5 = photoViewer2.l4;
                            ywVar.E2 = new a7(this, arrayList4, anVar5, 18);
                            activity14 = photoViewer2.E;
                            ((LaunchActivity) activity14).u0(ywVar, false, true);
                            photoViewer2.z0(false, false);
                            return;
                        }
                        for (int i64 = 0; i64 < arrayList.size(); i64++) {
                            if (!((org.telegram.messenger.gj) arrayList.get(i64)).R3() || ((org.telegram.messenger.gj) arrayList.get(i64)).H4()) {
                                z12 = false;
                                break;
                            }
                        }
                        z12 = true;
                        activity15 = photoViewer2.E;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, e6Var);
                        alertDialog$Builder2.l(org.telegram.messenger.hd.M0(2131750585, "ForwardGroupMedia"));
                        alertDialog$Builder2.g(org.telegram.messenger.hd.M0(2131750584, "ForwardGroupMediaMessage"));
                        alertDialog$Builder2.a.J = org.telegram.ui.ActionBar.j6.gh;
                        alertDialog$Builder2.h(z12 ? org.telegram.messenger.hd.M0(2131744141, "ThisPhoto") : org.telegram.messenger.hd.M0(2131744142, "ThisMedia"), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.go0
                            public final /* synthetic */ oo0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.q1
                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i632) {
                                File M;
                                switch (i60) {
                                    case 0:
                                        oo0 oo0Var = this.b;
                                        oo0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer3 = oo0Var.b;
                                        arrayList32.add(photoViewer3.T4);
                                        PhotoViewer.u(photoViewer3, arrayList32);
                                        break;
                                    default:
                                        oo0 oo0Var2 = this.b;
                                        PhotoViewer photoViewer4 = oo0Var2.b;
                                        org.telegram.messenger.gj gjVar62 = photoViewer4.T4;
                                        if (gjVar62 != null) {
                                            File file33 = null;
                                            if ((org.telegram.messenger.gj.n1(gjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.gj.n1(photoViewer4.T4.k).webpage != null && org.telegram.messenger.gj.n1(photoViewer4.T4.k).webpage.document == null) {
                                                TLObject l12 = photoViewer4.l1(photoViewer4.P4, null);
                                                org.telegram.messenger.w7.G(photoViewer4.U);
                                                M = org.telegram.messenger.w7.J(l12, null, true, true);
                                            } else {
                                                org.telegram.messenger.w7.G(photoViewer4.U);
                                                M = org.telegram.messenger.w7.M(photoViewer4.T4.k, false, true);
                                            }
                                            boolean L4 = org.telegram.messenger.gj.L4(photoViewer4.T4.k);
                                            boolean D3 = photoViewer4.T4.D3();
                                            if (D3) {
                                                TLRPC.Document document2 = org.telegram.messenger.gj.n1(photoViewer4.T4.k) != null ? org.telegram.messenger.gj.n1(photoViewer4.T4.k).document : null;
                                                if (document2 != null) {
                                                    org.telegram.messenger.w7.G(photoViewer4.U);
                                                    File J2 = org.telegram.messenger.w7.J(document2, null, false, true);
                                                    if (J2 == null || !J2.exists()) {
                                                        org.telegram.messenger.w7.G(photoViewer4.U);
                                                        file33 = org.telegram.messenger.w7.J(document2, null, true, true);
                                                    } else {
                                                        file33 = J2;
                                                    }
                                                }
                                            }
                                            if (!D3) {
                                                if (M != null && M.exists()) {
                                                    MediaController.d0(M.toString(), photoViewer4.E, L4 ? 1 : 0, null, null, new io0(oo0Var2, L4, 0));
                                                    break;
                                                } else {
                                                    photoViewer4.S2();
                                                    break;
                                                }
                                            } else if (M != null && M.exists() && file33 != null && file33.exists()) {
                                                MediaController.e0(M.toString(), file33.toString(), photoViewer4.E, new fo0(oo0Var2, 1));
                                                break;
                                            } else {
                                                photoViewer4.S2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.k(z12 ? org.telegram.messenger.hd.G(arrayList.size(), "AllNPhotos", new Object[0]) : org.telegram.messenger.hd.G(arrayList.size(), str2, new Object[0]), new xi0(7, this, arrayList));
                        alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131752589, "Cancel"), new t70(7));
                        org.telegram.ui.ActionBar.t1 a11 = alertDialog$Builder2.a();
                        w12 = photoViewer2.w1(org.telegram.ui.ActionBar.j6.lh);
                        a11.j(w12);
                        a11.show();
                        View d2 = a11.d(-3);
                        if (d2 instanceof TextView) {
                            int i65 = org.telegram.ui.ActionBar.j6.q7;
                            org.telegram.ui.ActionBar.q6.U((TextView) d2, i65, photoViewer2.w2);
                            w14 = photoViewer2.w1(i65);
                            d2.setBackground(org.telegram.ui.ActionBar.j6.J0(org.telegram.messenger.g0.L(3.0f), w14));
                            ViewGroup viewGroup2 = a11.u0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d2.bringToFront();
                            }
                        }
                        w13 = photoViewer2.w1(org.telegram.ui.ActionBar.j6.Yg);
                        a11.p(w13);
                        return;
                    }
                }
                z11 = false;
                activity13 = photoViewer2.E;
                gjVar36 = photoViewer2.T4;
                ((LaunchActivity) activity13).O0(gjVar36.K1);
                arrayList = new ArrayList(1);
                anVar4 = photoViewer2.l4;
                if (anVar4 == null) {
                }
                if (bjVar == null) {
                }
                if (!z11) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i7 == 18) {
                    PhotoViewer.v(photoViewer2);
                    return;
                }
                if (i7 == 26) {
                    activity11 = photoViewer2.E;
                    if (activity11 != null) {
                        sq0Var4 = photoViewer2.d;
                        if (sq0Var4 == null) {
                            return;
                        }
                        sq0Var5 = photoViewer2.d;
                        sq0Var5.J();
                        photoViewer2.z0(true, false);
                        return;
                    }
                    return;
                }
                if (i7 == 7) {
                    activity9 = photoViewer2.E;
                    if (activity9 == null) {
                        return;
                    }
                    sq0Var2 = photoViewer2.d;
                    if (sq0Var2 == null) {
                        return;
                    }
                    gjVar24 = photoViewer2.T4;
                    if (gjVar24 != null) {
                        gjVar32 = photoViewer2.T4;
                        if (!gjVar32.r1) {
                            gjVar33 = photoViewer2.T4;
                            long A02 = gjVar33.A0();
                            if (org.telegram.messenger.m5.z(A02)) {
                                i48 = photoViewer2.U;
                                z10 = org.telegram.messenger.t3.T(org.telegram.messenger.np.s1(i48).M0(Long.valueOf(-A02)));
                                activity10 = photoViewer2.E;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity10);
                                sq0Var3 = photoViewer2.d;
                                b02 = sq0Var3.b0();
                                if (b02 == null) {
                                    alertDialog$Builder3.l(org.telegram.messenger.hd.M0(2131754094, "AreYouSureDeletePhotoTitle"));
                                    alertDialog$Builder3.g(b02);
                                } else {
                                    if (!photoViewer2.t4) {
                                        gcVar14 = photoViewer2.a5;
                                        if (gcVar14 != null) {
                                            gcVar15 = photoViewer2.a5;
                                            gcVar16 = photoViewer2.Z4;
                                        }
                                        gjVar25 = photoViewer2.T4;
                                        if (gjVar25 != null) {
                                            gjVar28 = photoViewer2.T4;
                                        }
                                        gjVar26 = photoViewer2.T4;
                                        if (gjVar26 != null) {
                                            gjVar27 = photoViewer2.T4;
                                            if (gjVar27.q3()) {
                                                alertDialog$Builder3.l(org.telegram.messenger.hd.M0(2131754097, "AreYouSureDeleteGIFTitle"));
                                                if (z10) {
                                                    alertDialog$Builder3.g(org.telegram.messenger.hd.Y(2131754098, "AreYouSureDeleteGIFEveryone", new Object[0]));
                                                } else {
                                                    alertDialog$Builder3.g(org.telegram.messenger.hd.Y(2131754099, "AreYouSureDeleteGIF", new Object[0]));
                                                }
                                            }
                                        }
                                        alertDialog$Builder3.l(org.telegram.messenger.hd.M0(2131754094, "AreYouSureDeletePhotoTitle"));
                                        if (z10) {
                                            alertDialog$Builder3.g(org.telegram.messenger.hd.Y(2131754095, "AreYouSureDeletePhotoEveryone", new Object[0]));
                                        } else {
                                            alertDialog$Builder3.g(org.telegram.messenger.hd.Y(2131754096, "AreYouSureDeletePhoto", new Object[0]));
                                        }
                                    }
                                    alertDialog$Builder3.l(org.telegram.messenger.hd.M0(2131754083, "AreYouSureDeleteVideoTitle"));
                                    if (z10) {
                                        alertDialog$Builder3.g(org.telegram.messenger.hd.Y(2131754084, "AreYouSureDeleteVideoEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.g(org.telegram.messenger.hd.Y(2131754085, "AreYouSureDeleteVideo", new Object[0]));
                                    }
                                }
                                boolean[] zArr = new boolean[1];
                                gjVar29 = photoViewer2.T4;
                                if (gjVar29 != null) {
                                    gjVar30 = photoViewer2.T4;
                                    if (!gjVar30.r1) {
                                        gjVar31 = photoViewer2.T4;
                                        long A03 = gjVar31.A0();
                                        if (!org.telegram.messenger.m5.C(A03)) {
                                            if (org.telegram.messenger.m5.E(A03)) {
                                                i47 = photoViewer2.U;
                                                user = org.telegram.messenger.np.s1(i47).a2(Long.valueOf(A03));
                                                M0 = null;
                                            } else {
                                                i41 = photoViewer2.U;
                                                M0 = org.telegram.messenger.np.s1(i41).M0(Long.valueOf(-A03));
                                                user = null;
                                            }
                                            if (user != null || !org.telegram.messenger.t3.T(M0)) {
                                                i42 = photoViewer2.U;
                                                int currentTime = ConnectionsManager.getInstance(i42).getCurrentTime();
                                                if (user != null) {
                                                    i46 = photoViewer2.U;
                                                    i44 = org.telegram.messenger.np.s1(i46).c3;
                                                } else {
                                                    i43 = photoViewer2.U;
                                                    i44 = org.telegram.messenger.np.s1(i43).b3;
                                                }
                                                TLRPC.Chat chat = M0;
                                                if (user != null) {
                                                    long j17 = user.id;
                                                    i45 = photoViewer2.U;
                                                }
                                            }
                                        }
                                    }
                                }
                                String str5 = "Cancel";
                                int i66 = 2131752589;
                                alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131751598, "Delete"), new xi0(8, this, zArr));
                                alertDialog$Builder3.h(org.telegram.messenger.hd.M0(i66, str5), null);
                                org.telegram.ui.ActionBar.t1 a12 = alertDialog$Builder3.a();
                                photoViewer2.Q2(alertDialog$Builder3);
                                textView = (TextView) a12.d(-1);
                                if (textView == null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, photoViewer2.w2);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z10 = false;
                    activity10 = photoViewer2.E;
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(activity10);
                    sq0Var3 = photoViewer2.d;
                    b02 = sq0Var3.b0();
                    if (b02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    gjVar29 = photoViewer2.T4;
                    if (gjVar29 != null) {
                    }
                    String str52 = "Cancel";
                    int i662 = 2131752589;
                    alertDialog$Builder32.k(org.telegram.messenger.hd.M0(2131751598, "Delete"), new xi0(8, this, zArr2));
                    alertDialog$Builder32.h(org.telegram.messenger.hd.M0(i662, str52), null);
                    org.telegram.ui.ActionBar.t1 a122 = alertDialog$Builder32.a();
                    photoViewer2.Q2(alertDialog$Builder32);
                    textView = (TextView) a122.d(-1);
                    if (textView == null) {
                    }
                } else {
                    int i67 = 0;
                    if (i7 == 9 || i7 == 16) {
                        PhotoViewer.x(photoViewer2);
                        return;
                    }
                    if (i7 == 10) {
                        try {
                            if (photoViewer2.t4) {
                                activity5 = photoViewer2.E;
                                gjVar11 = photoViewer2.T4;
                                vf.c.t(activity5, org.telegram.messenger.gj.n1(gjVar11.k).webpage.url);
                                photoViewer2.z0(false, false);
                                return;
                            }
                            gjVar6 = photoViewer2.T4;
                            if (gjVar6 == null) {
                                pq0Var = photoViewer2.j7;
                                if (pq0Var != null) {
                                    pq0Var2 = photoViewer2.j7;
                                    i12 = photoViewer2.P4;
                                    TLObject d10 = pq0Var2.d(i12);
                                    activity3 = photoViewer2.E;
                                    if (org.telegram.messenger.g0.v2(d10, activity3)) {
                                        photoViewer2.z0(false, false);
                                        return;
                                    } else {
                                        photoViewer2.S2();
                                        return;
                                    }
                                }
                                return;
                            }
                            gjVar7 = photoViewer2.T4;
                            activity4 = photoViewer2.E;
                            gjVar8 = photoViewer2.T4;
                            if (!gjVar8.H4()) {
                                gjVar9 = photoViewer2.T4;
                                if (!gjVar9.R3()) {
                                    gjVar10 = photoViewer2.T4;
                                    if (!gjVar10.t4()) {
                                        z17 = false;
                                    }
                                }
                            }
                            if (org.telegram.messenger.g0.u2(gjVar7, activity4, e6Var, z17)) {
                                photoViewer2.z0(false, false);
                                return;
                            } else {
                                photoViewer2.S2();
                                return;
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.f(e10);
                            return;
                        }
                    }
                    if (i7 == 11 || i7 == 13) {
                        activity6 = photoViewer2.E;
                        if (activity6 != null) {
                            gjVar12 = photoViewer2.T4;
                            if (gjVar12 == null) {
                                return;
                            }
                            gjVar13 = photoViewer2.T4;
                            if (org.telegram.messenger.gj.n1(gjVar13.k) instanceof TLRPC.TL_messageMediaPhoto) {
                                gjVar17 = photoViewer2.T4;
                                tLObject = org.telegram.messenger.gj.n1(gjVar17.k).photo;
                            } else {
                                gjVar14 = photoViewer2.T4;
                                if (!(org.telegram.messenger.gj.n1(gjVar14.k) instanceof TLRPC.TL_messageMediaDocument)) {
                                    return;
                                }
                                gjVar15 = photoViewer2.T4;
                                tLObject = org.telegram.messenger.gj.n1(gjVar15.k).document;
                            }
                            TLObject tLObject2 = tLObject;
                            activity7 = photoViewer2.E;
                            gjVar16 = photoViewer2.T4;
                            photoViewer2.U3 = new no0(this, activity7, gjVar16, tLObject2, this.a);
                            bw0Var = photoViewer2.U3;
                            bw0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i7 == 6) {
                        q0Var = photoViewer2.p0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!photoViewer2.t4) {
                            photoViewer2.f3();
                            return;
                        }
                        ae0Var = photoViewer2.g0;
                        if (ae0Var.e()) {
                            if (PhotoViewer.g9 != null) {
                                PhotoViewer.g9.J0();
                            }
                            photoViewer2.J3 = true;
                            photoViewer = PhotoViewer.f9;
                            PhotoViewer.g9 = photoViewer;
                            PhotoViewer.f9 = null;
                            photoViewer2.e = false;
                            photoViewer2.f = false;
                            uq0 uq0Var = photoViewer2.d5;
                            if (uq0Var != null && !uq0Var.a.H()) {
                                photoViewer2.d5.a.O0(true, true);
                            }
                            photoViewer2.m6 = 1.0f;
                            photoViewer2.f0.invalidate();
                            photoViewer2.M0();
                            return;
                        }
                        return;
                    }
                    if (i7 == 8) {
                        gjVar22 = photoViewer2.T4;
                        if (gjVar22 == null) {
                            return;
                        }
                        i40 = photoViewer2.U;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i40);
                        gjVar23 = photoViewer2.T4;
                        G.d(gjVar23.F0());
                        photoViewer2.m2(false);
                        photoViewer2.j0.setTag(r3);
                        photoViewer2.j0.setVisibility(0);
                        return;
                    }
                    if (i7 == 12) {
                        gjVar19 = photoViewer2.T4;
                        if (gjVar19 != null) {
                            gjVar20 = photoViewer2.T4;
                            TLRPC.Document F0 = gjVar20.F0();
                            anVar = photoViewer2.l4;
                            if (anVar != null) {
                                anVar2 = photoViewer2.l4;
                                if (anVar2.a0 != null) {
                                    anVar3 = photoViewer2.l4;
                                    anVar3.a0.l(F0);
                                    i39 = photoViewer2.U;
                                    org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i39);
                                    gjVar21 = photoViewer2.T4;
                                    s12.t4(gjVar21, F0);
                                }
                            }
                            i38 = photoViewer2.U;
                            org.telegram.messenger.si.b0(i38).c(F0, (int) (System.currentTimeMillis() / 1000), true);
                            i39 = photoViewer2.U;
                            org.telegram.messenger.np s122 = org.telegram.messenger.np.s1(i39);
                            gjVar21 = photoViewer2.T4;
                            s122.t4(gjVar21, F0);
                        } else {
                            pq0Var3 = photoViewer2.j7;
                            if (pq0Var3 == null) {
                                return;
                            }
                            pq0Var4 = photoViewer2.j7;
                            i35 = photoViewer2.P4;
                            TLObject d11 = pq0Var4.d(i35);
                            if (d11 instanceof TLRPC.Document) {
                                TLRPC.Document document2 = (TLRPC.Document) d11;
                                i36 = photoViewer2.U;
                                org.telegram.messenger.si.b0(i36).c(document2, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = photoViewer2.U;
                                org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(i37);
                                pq0Var5 = photoViewer2.j7;
                                s13.t4(pq0Var5.g(), document2);
                            }
                        }
                        oq0 oq0Var = photoViewer2.f0;
                        if (oq0Var != null) {
                            org.telegram.ui.Components.cc.Z(oq0Var, e6Var).o(org.telegram.ui.Components.bc.E, e6Var).j();
                            return;
                        }
                        return;
                    }
                    if (i7 == 14) {
                        ArrayList arrayList5 = photoViewer2.f7;
                        i17 = photoViewer2.P4;
                        TLRPC.Photo photo3 = (TLRPC.Photo) arrayList5.get(i17);
                        if (photo3 == null || photo3.sizes.isEmpty()) {
                            return;
                        }
                        TLRPC.PhotoSize u10 = org.telegram.messenger.w7.u(800, photo3.sizes);
                        TLRPC.PhotoSize u11 = org.telegram.messenger.w7.u(90, photo3.sizes);
                        i18 = photoViewer2.U;
                        org.telegram.messenger.m10 i68 = org.telegram.messenger.m10.i(i18);
                        j10 = photoViewer2.z5;
                        if (j10 == i68.n) {
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = photo3.id;
                            tL_inputPhoto.access_hash = photo3.access_hash;
                            tL_inputPhoto.file_reference = photo3.file_reference;
                            i32 = photoViewer2.U;
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new jo0(this, i68, photo3, i60));
                            i33 = photoViewer2.U;
                            TLRPC.User a22 = org.telegram.messenger.np.s1(i33).a2(Long.valueOf(i68.n));
                            if (a22 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                userProfilePhoto.photo_id = photo3.id;
                                userProfilePhoto.dc_id = photo3.dc_id;
                                userProfilePhoto.photo_small = u11.location;
                                userProfilePhoto.photo_big = u10.location;
                                i68.w(a22);
                                i68.v(true);
                                i34 = photoViewer2.U;
                                org.telegram.messenger.ns.f(i34).k(org.telegram.messenger.ns.j0, new Object[0]);
                            }
                        } else {
                            i19 = photoViewer2.U;
                            org.telegram.messenger.np s14 = org.telegram.messenger.np.s1(i19);
                            j11 = photoViewer2.z5;
                            TLRPC.Chat M04 = s14.M0(Long.valueOf(-j11));
                            if (M04 == null) {
                                return;
                            }
                            TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                            tL_inputChatPhoto.id = tL_inputPhoto2;
                            tL_inputPhoto2.id = photo3.id;
                            tL_inputPhoto2.access_hash = photo3.access_hash;
                            tL_inputPhoto2.file_reference = photo3.file_reference;
                            i20 = photoViewer2.U;
                            org.telegram.messenger.np s15 = org.telegram.messenger.np.s1(i20);
                            j12 = photoViewer2.z5;
                            s15.B(-j12, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                            TLRPC.ChatPhoto chatPhoto = M04.photo;
                            chatPhoto.dc_id = photo3.dc_id;
                            chatPhoto.photo_small = u11.location;
                            chatPhoto.photo_big = u10.location;
                            i21 = photoViewer2.U;
                            org.telegram.messenger.ns.f(i21).k(org.telegram.messenger.ns.r, 2);
                        }
                        photoViewer2.h7 = org.telegram.messenger.gc.i(u10, photo3);
                        ArrayList arrayList6 = photoViewer2.f7;
                        i22 = photoViewer2.P4;
                        arrayList6.remove(i22);
                        photoViewer2.f7.add(0, photo3);
                        ArrayList arrayList7 = photoViewer2.a7;
                        i23 = photoViewer2.P4;
                        org.telegram.messenger.gc gcVar21 = (org.telegram.messenger.gc) arrayList7.get(i23);
                        ArrayList arrayList8 = photoViewer2.a7;
                        i24 = photoViewer2.P4;
                        arrayList8.remove(i24);
                        photoViewer2.a7.add(0, gcVar21);
                        ArrayList arrayList9 = photoViewer2.b7;
                        i25 = photoViewer2.P4;
                        org.telegram.messenger.gc gcVar22 = (org.telegram.messenger.gc) arrayList9.get(i25);
                        ArrayList arrayList10 = photoViewer2.b7;
                        i26 = photoViewer2.P4;
                        arrayList10.remove(i26);
                        photoViewer2.b7.add(0, gcVar22);
                        ArrayList arrayList11 = photoViewer2.c7;
                        i27 = photoViewer2.P4;
                        Long l10 = (Long) arrayList11.get(i27);
                        ArrayList arrayList12 = photoViewer2.c7;
                        i28 = photoViewer2.P4;
                        arrayList12.remove(i28);
                        photoViewer2.c7.add(0, l10);
                        ArrayList arrayList13 = photoViewer2.d7;
                        i29 = photoViewer2.P4;
                        TLRPC.Message message = (TLRPC.Message) arrayList13.get(i29);
                        ArrayList arrayList14 = photoViewer2.d7;
                        i30 = photoViewer2.P4;
                        arrayList14.remove(i30);
                        photoViewer2.d7.add(0, message);
                        i31 = photoViewer2.U;
                        org.telegram.messenger.np s16 = org.telegram.messenger.np.s1(i31);
                        j13 = photoViewer2.z5;
                        org.telegram.messenger.vo U0 = s16.U0(j13);
                        while (true) {
                            if (i67 >= U0.b.size()) {
                                break;
                            }
                            TLRPC.Photo photo4 = (TLRPC.Photo) U0.b.get(i67);
                            if (photo4 != null && photo4.id == photo3.id) {
                                U0.c(i67);
                                break;
                            }
                            i67++;
                        }
                        photoViewer2.P4 = -1;
                        photoViewer2.z2(0);
                        org.telegram.ui.Components.o20 o20Var = photoViewer2.m1;
                        o20Var.d.clear();
                        o20Var.e.clear();
                        o20Var.c.clear();
                        photoViewer2.m1.b();
                        undoView = photoViewer2.o1;
                        j14 = photoViewer2.z5;
                        gcVar12 = photoViewer2.a5;
                        gcVar13 = photoViewer2.Z4;
                        undoView.m(j14, gcVar12 == gcVar13 ? null : 1, 22);
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.ko0
                            public final /* synthetic */ oo0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i60) {
                                    case 0:
                                        org.telegram.ui.ActionBar.q0 q0Var2 = this.b.b.p0;
                                        if (q0Var2 != null) {
                                            q0Var2.u(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.p0.u(19);
                                        photoViewer3.p0.T(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.p0.T(19);
                                        photoViewer4.p0.u(20);
                                        break;
                                }
                            }
                        }, 300L);
                        return;
                    }
                    if (i7 == 15) {
                        i15 = photoViewer2.U;
                        org.telegram.messenger.w7.G(i15);
                        gcVar7 = photoViewer2.a5;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gcVar7 == null ? null : gcVar7.f;
                        gcVar8 = photoViewer2.a5;
                        File J2 = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated2, PhotoViewer.m1(gcVar8), true, true);
                        gcVar9 = photoViewer2.a5;
                        boolean z24 = gcVar9.p == 2;
                        if (z24) {
                            i16 = photoViewer2.U;
                            org.telegram.messenger.w7.G(i16);
                            gcVar10 = photoViewer2.Z4;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = gcVar10 == null ? null : gcVar10.f;
                            gcVar11 = photoViewer2.Z4;
                            str = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated3, PhotoViewer.m1(gcVar11), true, true).getAbsolutePath();
                        } else {
                            str = null;
                        }
                        sq0Var = photoViewer2.d;
                        sq0Var.f(J2.getAbsolutePath(), str, z24);
                        return;
                    }
                    if (i7 == 19) {
                        int i69 = photoViewer2.Q4;
                        if (i69 < 0 || i69 >= photoViewer2.Y6.size()) {
                            return;
                        }
                        org.telegram.messenger.gj gjVar62 = (org.telegram.messenger.gj) photoViewer2.Y6.get(photoViewer2.Q4);
                        photoViewer2.n5 = true;
                        final int i70 = true ? 1 : 0;
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.ko0
                            public final /* synthetic */ oo0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i70) {
                                    case 0:
                                        org.telegram.ui.ActionBar.q0 q0Var2 = this.b.b.p0;
                                        if (q0Var2 != null) {
                                            q0Var2.u(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.p0.u(19);
                                        photoViewer3.p0.T(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.p0.T(19);
                                        photoViewer4.p0.u(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.L(photoViewer2);
                        i14 = photoViewer2.U;
                        org.telegram.messenger.np.s1(i14).T1().L(gjVar62, new wn0(photoViewer2, 5));
                        return;
                    }
                    if (i7 == 20) {
                        photoViewer2.n5 = false;
                        final int i71 = 2;
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.ko0
                            public final /* synthetic */ oo0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i71) {
                                    case 0:
                                        org.telegram.ui.ActionBar.q0 q0Var2 = this.b.b.p0;
                                        if (q0Var2 != null) {
                                            q0Var2.u(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.p0.u(19);
                                        photoViewer3.p0.T(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.p0.T(19);
                                        photoViewer4.p0.u(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.L(photoViewer2);
                        return;
                    }
                    if (i7 == 22) {
                        photoViewer2.Z2 = !photoViewer2.Z2;
                        boolean z25 = photoViewer2.Z2;
                        gjVar18 = photoViewer2.T4;
                        org.telegram.ui.Components.u51.n0(gjVar18, z25);
                        org.telegram.ui.Components.u51 u51Var = photoViewer2.G2;
                        if (u51Var != null) {
                            u51Var.s0(photoViewer2.Z2);
                        }
                        photoViewer2.t0.f(photoViewer2.Z2);
                        photoViewer2.t0.setSelectorColor(photoViewer2.Z2 ? 259241196 : 268435455);
                        return;
                    }
                    if (i7 != 23) {
                        return;
                    }
                    gcVar = photoViewer2.Z4;
                    if (gcVar != null) {
                        gcVar5 = photoViewer2.Z4;
                        if (gcVar5.l != null) {
                            gcVar6 = photoViewer2.Z4;
                            photo2 = gcVar6.l;
                            photo = photo2;
                            if (photo == null) {
                                return;
                            }
                            i13 = photoViewer2.U;
                            activity8 = photoViewer2.E;
                            j3 = photoViewer2.z5;
                            org.telegram.ui.Components.t4.G(i13, activity8, j3, photo, new fi.b());
                            return;
                        }
                    }
                    gcVar2 = photoViewer2.a5;
                    if (gcVar2 != null) {
                        gcVar3 = photoViewer2.a5;
                        if (gcVar3.l != null) {
                            gcVar4 = photoViewer2.a5;
                            photo2 = gcVar4.l;
                            photo = photo2;
                            if (photo == null) {
                            }
                        }
                    }
                    photo = null;
                    if (photo == null) {
                    }
                }
            }
        }
    }
}
