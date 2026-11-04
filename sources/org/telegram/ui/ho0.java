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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ho0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 a;
    public final /* synthetic */ PhotoViewer b;

    public ho0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.e6 e6Var) {
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
        if (photoViewer.U4 == null && photoViewer.c5 == null) {
            if (photoViewer.b5 != null) {
                org.telegram.messenger.w7.G(photoViewer.U);
                org.telegram.messenger.ac acVar = photoViewer.b5;
                File K = org.telegram.messenger.w7.K(acVar == null ? null : acVar.f, PhotoViewer.s1(acVar), photoViewer.A5 != 0 || photoViewer.C5, true);
                File file = new File(org.telegram.messenger.w7.z(4), K.getName());
                org.telegram.messenger.w7.G(photoViewer.U);
                org.telegram.messenger.ac acVar2 = photoViewer.b5;
                File K2 = org.telegram.messenger.w7.K(acVar2 != null ? acVar2.f : null, PhotoViewer.s1(acVar2), false, true);
                if (!K.exists() && !file.exists() && !K2.exists()) {
                    return false;
                }
            } else if (photoViewer.k7 != null) {
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x040f, code lost:
    
        if (t4.c.p(r3) != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x07ff, code lost:
    
        if (r9 == org.telegram.messenger.h10.i(r18).e()) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0803, code lost:
    
        if (r8 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0805, code lost:
    
        r9 = r7.U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x080f, code lost:
    
        if (org.telegram.messenger.hp.s1(r9).d3 == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0811, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0814, code lost:
    
        r10 = r7.U4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x081c, code lost:
    
        if (r10.k.action == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x081e, code lost:
    
        r10 = r7.U4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0828, code lost:
    
        if ((r10.k.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x082a, code lost:
    
        r10 = r7.U4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0832, code lost:
    
        if (r10.O3() != false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0834, code lost:
    
        if (r9 != false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x083a, code lost:
    
        if (org.telegram.messenger.t3.N(r34) == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x083c, code lost:
    
        r9 = r7.U4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0845, code lost:
    
        if ((r12 - r9.k.date) > r13) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0847, code lost:
    
        r10 = r7.E;
        r9 = new android.widget.FrameLayout(r10);
        r10 = r8;
        r12 = r7.E;
        r8 = new org.telegram.ui.Cells.c2(1, r12, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0861, code lost:
    
        if (r34 == null) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0863, code lost:
    
        r2 = r9;
        r4 = null;
        r8.e(org.telegram.messenger.bd.M0(2131751541, "DeleteForAll"), "", false, false, false);
        r5 = 9;
        r6 = 2131752589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x08aa, code lost:
    
        if (org.telegram.messenger.bd.a0 == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x08ac, code lost:
    
        r9 = org.telegram.messenger.g0.L(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x08b7, code lost:
    
        if (org.telegram.messenger.bd.a0 == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x08b9, code lost:
    
        r10 = org.telegram.messenger.g0.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x08c2, code lost:
    
        r8.setPadding(r9, 0, r10, 0);
        r2.addView(r8, b8.mf.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.k8(5, r0));
        r3.o(r2);
        r3.a.H = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08be, code lost:
    
        r10 = org.telegram.messenger.g0.L(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x08b1, code lost:
    
        r9 = org.telegram.messenger.g0.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0882, code lost:
    
        r2 = r9;
        r4 = null;
        r5 = 9;
        r6 = 2131752589;
        r8.e(org.telegram.messenger.bd.Y(2131751540, "DeleteForUser", org.telegram.messenger.l10.i(r10)), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0813, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0801, code lost:
    
        if (r34 != null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x06d1, code lost:
    
        if (r8 == r13) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x06e1, code lost:
    
        if (r8.I4() != false) goto L326;
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
    /* JADX WARN: Removed duplicated region for block: B:310:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:551:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0243  */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r3v21, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.PhotoViewer] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v41 */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i3) {
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2;
        int i10;
        org.telegram.messenger.zi ziVar3;
        int i11;
        Activity activity;
        Activity activity2;
        org.telegram.messenger.zi ziVar4;
        org.telegram.messenger.zi ziVar5;
        org.telegram.messenger.zi ziVar6;
        hq0 hq0Var;
        hq0 hq0Var2;
        int i12;
        Activity activity3;
        org.telegram.messenger.zi ziVar7;
        Activity activity4;
        org.telegram.messenger.zi ziVar8;
        org.telegram.messenger.zi ziVar9;
        org.telegram.messenger.zi ziVar10;
        Activity activity5;
        org.telegram.messenger.zi ziVar11;
        Activity activity6;
        org.telegram.messenger.zi ziVar12;
        org.telegram.messenger.zi ziVar13;
        org.telegram.messenger.zi ziVar14;
        org.telegram.messenger.zi ziVar15;
        TLObject tLObject;
        Activity activity7;
        org.telegram.messenger.zi ziVar16;
        org.telegram.ui.Components.xv0 xv0Var;
        org.telegram.messenger.zi ziVar17;
        org.telegram.messenger.ac acVar;
        org.telegram.messenger.ac acVar2;
        TLRPC.Photo photo;
        org.telegram.messenger.ac acVar3;
        org.telegram.messenger.ac acVar4;
        TLRPC.Photo photo2;
        int i13;
        Activity activity8;
        long j10;
        org.telegram.messenger.ac acVar5;
        org.telegram.messenger.ac acVar6;
        org.telegram.messenger.zi ziVar18;
        int i14;
        int i15;
        org.telegram.messenger.ac acVar7;
        org.telegram.messenger.ac acVar8;
        org.telegram.messenger.ac acVar9;
        String str;
        kq0 kq0Var;
        int i16;
        org.telegram.messenger.ac acVar10;
        org.telegram.messenger.ac acVar11;
        int i17;
        int i18;
        long j11;
        int i19;
        long j12;
        int i20;
        long j13;
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
        long j14;
        UndoView undoView;
        long j15;
        org.telegram.messenger.ac acVar12;
        org.telegram.messenger.ac acVar13;
        int i32;
        int i33;
        int i34;
        org.telegram.messenger.zi ziVar19;
        hq0 hq0Var3;
        hq0 hq0Var4;
        int i35;
        int i36;
        int i37;
        hq0 hq0Var5;
        org.telegram.messenger.zi ziVar20;
        wm wmVar;
        int i38;
        int i39;
        org.telegram.messenger.zi ziVar21;
        wm wmVar2;
        wm wmVar3;
        org.telegram.messenger.zi ziVar22;
        int i40;
        org.telegram.messenger.zi ziVar23;
        org.telegram.ui.ActionBar.q0 q0Var;
        View findViewWithTag;
        org.telegram.ui.Components.ud0 ud0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        kq0 kq0Var2;
        org.telegram.messenger.zi ziVar24;
        boolean z10;
        Activity activity10;
        kq0 kq0Var3;
        String b02;
        org.telegram.messenger.ac acVar14;
        org.telegram.messenger.zi ziVar25;
        org.telegram.messenger.zi ziVar26;
        org.telegram.messenger.zi ziVar27;
        org.telegram.messenger.zi ziVar28;
        org.telegram.messenger.ac acVar15;
        org.telegram.messenger.ac acVar16;
        org.telegram.messenger.zi ziVar29;
        TextView textView;
        org.telegram.messenger.zi ziVar30;
        org.telegram.messenger.zi ziVar31;
        int i41;
        TLRPC.Chat M0;
        TLRPC.User user;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        org.telegram.messenger.zi ziVar32;
        org.telegram.messenger.zi ziVar33;
        int i48;
        Activity activity11;
        kq0 kq0Var4;
        kq0 kq0Var5;
        org.telegram.messenger.zi ziVar34;
        Activity activity12;
        org.telegram.messenger.zi ziVar35;
        boolean z11;
        Activity activity13;
        org.telegram.messenger.zi ziVar36;
        ArrayList arrayList;
        wm wmVar4;
        String str2;
        org.telegram.messenger.ui uiVar;
        org.telegram.messenger.zi ziVar37;
        org.telegram.messenger.zi ziVar38;
        wm wmVar5;
        Activity activity14;
        ?? r02;
        Activity activity15;
        int B1;
        int B12;
        int B13;
        wm wmVar6;
        org.telegram.messenger.zi ziVar39;
        org.telegram.messenger.zi ziVar40;
        int i49;
        kq0 kq0Var6;
        org.telegram.messenger.zi ziVar41;
        org.telegram.messenger.zi ziVar42;
        org.telegram.messenger.zi ziVar43;
        String str3;
        wm wmVar7;
        int i50;
        org.telegram.messenger.zi ziVar44;
        org.telegram.messenger.zi ziVar45;
        wm wmVar8;
        Activity activity16;
        Activity activity17;
        wm wmVar9;
        mi.z3 o12;
        org.telegram.ui.Components.k7 k7Var;
        hq0 hq0Var6;
        Activity activity18;
        Activity activity19;
        wm wmVar10;
        org.telegram.messenger.ui uiVar2;
        org.telegram.messenger.zi ziVar46;
        Activity activity20;
        org.telegram.messenger.zi ziVar47;
        String M02;
        int B14;
        View d;
        int B15;
        int B16;
        org.telegram.messenger.zi ziVar48;
        org.telegram.messenger.zi ziVar49;
        org.telegram.messenger.zi ziVar50;
        org.telegram.messenger.ac acVar17;
        hq0 hq0Var7;
        boolean z12;
        File file;
        hq0 hq0Var8;
        int i51;
        hq0 hq0Var9;
        int i52;
        org.telegram.messenger.ac acVar18;
        int i53;
        org.telegram.messenger.ac acVar19;
        long j16;
        boolean z13;
        File K;
        int i54;
        org.telegram.messenger.ac acVar20;
        boolean z14;
        org.telegram.messenger.zi ziVar51;
        ?? r32;
        File file2;
        Activity activity21;
        Activity activity22;
        org.telegram.messenger.zi ziVar52;
        TLRPC.Document document;
        int i55;
        int i56;
        org.telegram.messenger.zi ziVar53;
        org.telegram.messenger.zi ziVar54;
        org.telegram.messenger.zi ziVar55;
        int i57;
        org.telegram.messenger.zi ziVar56;
        org.telegram.messenger.zi ziVar57;
        org.telegram.messenger.zi ziVar58;
        org.telegram.messenger.zi ziVar59;
        int i58;
        TLObject r12;
        int i59;
        wm wmVar11;
        org.telegram.messenger.zi ziVar60;
        boolean z15;
        boolean K1;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        boolean z16 = true;
        z16 = true;
        z16 = true;
        ?? r72 = this.b;
        int i60 = 0;
        if (i3 == -1) {
            lp0 lp0Var = r72.M1;
            if (lp0Var == null || !lp0Var.n0()) {
                K1 = r72.K1();
                if (K1) {
                    r72.F0(false);
                    return;
                } else {
                    r72.H0(true, false);
                    return;
                }
            }
            return;
        }
        final int i61 = 0;
        if (i3 == 2) {
            hq0Var6 = r72.k7;
            if (hq0Var6 != null) {
                z15 = r72.l2;
                if (!z15) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) {
                activity18 = r72.E;
                if (activity18.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    activity19 = r72.E;
                    activity19.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            final ArrayList arrayList2 = new ArrayList(1);
            wmVar10 = r72.m4;
            if (wmVar10 != null) {
                wmVar11 = r72.m4;
                ziVar60 = r72.U4;
                uiVar2 = wmVar11.S8(ziVar60.d1());
            } else {
                uiVar2 = null;
            }
            if (uiVar2 != null) {
                arrayList2.addAll(uiVar2.d);
            } else {
                ziVar46 = r72.U4;
                arrayList2.add(ziVar46);
            }
            if (arrayList2.size() > 1) {
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                for (int i62 = 0; i62 < arrayList2.size(); i62++) {
                    org.telegram.messenger.zi ziVar61 = (org.telegram.messenger.zi) arrayList2.get(i62);
                    if (ziVar61.E3()) {
                        z19 = true;
                    } else if (ziVar61.I4()) {
                        z17 = true;
                    } else {
                        z18 = true;
                    }
                }
                activity20 = r72.E;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity20, e6Var);
                alertDialog$Builder.l(org.telegram.messenger.bd.M0(2131745951, "SaveGroupMedia"));
                alertDialog$Builder.g(org.telegram.messenger.bd.M0(2131745950, "SaveGroupMediaMessage"));
                alertDialog$Builder.a.J = org.telegram.ui.ActionBar.k6.dh;
                ziVar47 = r72.U4;
                if (ziVar47 != null) {
                    ziVar48 = r72.U4;
                    if (ziVar48.I4()) {
                        ziVar49 = r72.U4;
                        if (!ziVar49.E3()) {
                            M02 = org.telegram.messenger.bd.M0(2131744152, "ThisMedia");
                            final int i63 = true ? 1 : 0;
                            alertDialog$Builder.h(M02, new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.zn0
                                public final /* synthetic */ ho0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.p1
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i64) {
                                    File N;
                                    switch (i63) {
                                        case 0:
                                            ho0 ho0Var = this.b;
                                            ho0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer2 = ho0Var.b;
                                            arrayList3.add(photoViewer2.U4);
                                            PhotoViewer.C(photoViewer2, arrayList3);
                                            break;
                                        default:
                                            ho0 ho0Var2 = this.b;
                                            PhotoViewer photoViewer3 = ho0Var2.b;
                                            org.telegram.messenger.zi ziVar62 = photoViewer3.U4;
                                            if (ziVar62 != null) {
                                                File file3 = null;
                                                if ((org.telegram.messenger.zi.o1(ziVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.zi.o1(photoViewer3.U4.k).webpage != null && org.telegram.messenger.zi.o1(photoViewer3.U4.k).webpage.document == null) {
                                                    TLObject r13 = photoViewer3.r1(photoViewer3.Q4, null);
                                                    org.telegram.messenger.w7.G(photoViewer3.U);
                                                    N = org.telegram.messenger.w7.K(r13, null, true, true);
                                                } else {
                                                    org.telegram.messenger.w7.G(photoViewer3.U);
                                                    N = org.telegram.messenger.w7.N(photoViewer3.U4.k, false, true);
                                                }
                                                boolean M4 = org.telegram.messenger.zi.M4(photoViewer3.U4.k);
                                                boolean E3 = photoViewer3.U4.E3();
                                                if (E3) {
                                                    TLRPC.Document document2 = org.telegram.messenger.zi.o1(photoViewer3.U4.k) != null ? org.telegram.messenger.zi.o1(photoViewer3.U4.k).document : null;
                                                    if (document2 != null) {
                                                        org.telegram.messenger.w7.G(photoViewer3.U);
                                                        File K2 = org.telegram.messenger.w7.K(document2, null, false, true);
                                                        if (K2 == null || !K2.exists()) {
                                                            org.telegram.messenger.w7.G(photoViewer3.U);
                                                            file3 = org.telegram.messenger.w7.K(document2, null, true, true);
                                                        } else {
                                                            file3 = K2;
                                                        }
                                                    }
                                                }
                                                if (!E3) {
                                                    if (N != null && N.exists()) {
                                                        MediaController.d0(N.toString(), photoViewer3.E, M4 ? 1 : 0, null, null, new bo0(ho0Var2, M4, 0));
                                                        break;
                                                    } else {
                                                        photoViewer3.X2();
                                                        break;
                                                    }
                                                } else if (N != null && N.exists() && file3 != null && file3.exists()) {
                                                    MediaController.e0(N.toString(), file3.toString(), photoViewer3.E, new yn0(ho0Var2, 1));
                                                    break;
                                                } else {
                                                    photoViewer3.X2();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            final boolean z20 = z17;
                            final boolean z21 = z18;
                            final boolean z22 = z19;
                            alertDialog$Builder.k((!z17 || z19) ? org.telegram.messenger.bd.G(arrayList2.size(), "AllNMedia", new Object[0]) : org.telegram.messenger.bd.G(arrayList2.size(), "AllNPhotos", new Object[0]), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.eo0
                                @Override // org.telegram.ui.ActionBar.p1
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i64) {
                                    File N;
                                    ho0 ho0Var = ho0.this;
                                    PhotoViewer photoViewer2 = ho0Var.b;
                                    int[] iArr = new int[1];
                                    final jn0 jn0Var = new jn0(ho0Var, new int[1], iArr, z20, z21, z22);
                                    int i65 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i65 >= arrayList3.size()) {
                                            return;
                                        }
                                        org.telegram.messenger.zi ziVar62 = (org.telegram.messenger.zi) arrayList3.get(i65);
                                        if (ziVar62 != null) {
                                            File file3 = null;
                                            if ((org.telegram.messenger.zi.o1(ziVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.zi.o1(ziVar62.k).webpage != null && org.telegram.messenger.zi.o1(ziVar62.k).webpage.document == null) {
                                                org.telegram.messenger.w7.G(photoViewer2.U);
                                                N = org.telegram.messenger.w7.K(photoViewer2.r1(photoViewer2.Q4, null), null, true, true);
                                            } else {
                                                org.telegram.messenger.w7.G(photoViewer2.U);
                                                N = org.telegram.messenger.w7.N(ziVar62.k, false, true);
                                            }
                                            boolean M4 = org.telegram.messenger.zi.M4(ziVar62.k);
                                            boolean E3 = ziVar62.E3();
                                            if (E3) {
                                                TLRPC.Document document2 = org.telegram.messenger.zi.o1(ziVar62.k) != null ? org.telegram.messenger.zi.o1(ziVar62.k).document : null;
                                                if (document2 != null) {
                                                    org.telegram.messenger.w7.G(photoViewer2.U);
                                                    File K2 = org.telegram.messenger.w7.K(document2, null, false, true);
                                                    if (K2 == null || !K2.exists()) {
                                                        org.telegram.messenger.w7.G(photoViewer2.U);
                                                        file3 = org.telegram.messenger.w7.K(document2, null, true, true);
                                                    } else {
                                                        file3 = K2;
                                                    }
                                                }
                                            }
                                            if (E3 && N != null && N.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                if (file3 == null || !file3.exists()) {
                                                    final int i66 = 1;
                                                    MediaController.d0(N.toString(), photoViewer2.E, 0, null, null, new org.telegram.messenger.u10() { // from class: org.telegram.ui.ao0
                                                        @Override // org.telegram.messenger.u10
                                                        public final void a(Object obj) {
                                                            switch (i66) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(jn0Var);
                                                                    break;
                                                                case 1:
                                                                    org.telegram.messenger.g0.h3(jn0Var);
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(jn0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i67 = 0;
                                                    MediaController.e0(N.toString(), file3.toString(), photoViewer2.E, new org.telegram.messenger.u10() { // from class: org.telegram.ui.ao0
                                                        @Override // org.telegram.messenger.u10
                                                        public final void a(Object obj) {
                                                            switch (i67) {
                                                                case 0:
                                                                    org.telegram.messenger.g0.h3(jn0Var);
                                                                    break;
                                                                case 1:
                                                                    org.telegram.messenger.g0.h3(jn0Var);
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.g0.h3(jn0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!E3 && N != null && N.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i68 = 2;
                                                MediaController.d0(N.toString(), photoViewer2.E, M4 ? 1 : 0, null, null, new org.telegram.messenger.u10() { // from class: org.telegram.ui.ao0
                                                    @Override // org.telegram.messenger.u10
                                                    public final void a(Object obj) {
                                                        switch (i68) {
                                                            case 0:
                                                                org.telegram.messenger.g0.h3(jn0Var);
                                                                break;
                                                            case 1:
                                                                org.telegram.messenger.g0.h3(jn0Var);
                                                                break;
                                                            default:
                                                                org.telegram.messenger.g0.h3(jn0Var);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        i65++;
                                    }
                                }
                            });
                            alertDialog$Builder.i(org.telegram.messenger.bd.M0(2131752589, "Cancel"), new u70(5));
                            org.telegram.ui.ActionBar.s1 a10 = alertDialog$Builder.a();
                            B14 = r72.B1(org.telegram.ui.ActionBar.k6.ih);
                            a10.j(B14);
                            a10.show();
                            d = a10.d(-3);
                            if (d instanceof TextView) {
                                int i64 = org.telegram.ui.ActionBar.k6.q7;
                                org.telegram.ui.ActionBar.r6.V((TextView) d, i64, r72.w2);
                                B16 = r72.B1(i64);
                                d.setBackground(org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), B16));
                                ViewGroup viewGroup = a10.w0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            B15 = r72.B1(org.telegram.ui.ActionBar.k6.Vg);
                            a10.p(B15);
                            return;
                        }
                    }
                }
                M02 = org.telegram.messenger.bd.M0(2131744151, "ThisPhoto");
                final int i632 = true ? 1 : 0;
                alertDialog$Builder.h(M02, new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.zn0
                    public final /* synthetic */ ho0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.p1
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i642) {
                        File N;
                        switch (i632) {
                            case 0:
                                ho0 ho0Var = this.b;
                                ho0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer2 = ho0Var.b;
                                arrayList3.add(photoViewer2.U4);
                                PhotoViewer.C(photoViewer2, arrayList3);
                                break;
                            default:
                                ho0 ho0Var2 = this.b;
                                PhotoViewer photoViewer3 = ho0Var2.b;
                                org.telegram.messenger.zi ziVar62 = photoViewer3.U4;
                                if (ziVar62 != null) {
                                    File file3 = null;
                                    if ((org.telegram.messenger.zi.o1(ziVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.zi.o1(photoViewer3.U4.k).webpage != null && org.telegram.messenger.zi.o1(photoViewer3.U4.k).webpage.document == null) {
                                        TLObject r13 = photoViewer3.r1(photoViewer3.Q4, null);
                                        org.telegram.messenger.w7.G(photoViewer3.U);
                                        N = org.telegram.messenger.w7.K(r13, null, true, true);
                                    } else {
                                        org.telegram.messenger.w7.G(photoViewer3.U);
                                        N = org.telegram.messenger.w7.N(photoViewer3.U4.k, false, true);
                                    }
                                    boolean M4 = org.telegram.messenger.zi.M4(photoViewer3.U4.k);
                                    boolean E3 = photoViewer3.U4.E3();
                                    if (E3) {
                                        TLRPC.Document document2 = org.telegram.messenger.zi.o1(photoViewer3.U4.k) != null ? org.telegram.messenger.zi.o1(photoViewer3.U4.k).document : null;
                                        if (document2 != null) {
                                            org.telegram.messenger.w7.G(photoViewer3.U);
                                            File K2 = org.telegram.messenger.w7.K(document2, null, false, true);
                                            if (K2 == null || !K2.exists()) {
                                                org.telegram.messenger.w7.G(photoViewer3.U);
                                                file3 = org.telegram.messenger.w7.K(document2, null, true, true);
                                            } else {
                                                file3 = K2;
                                            }
                                        }
                                    }
                                    if (!E3) {
                                        if (N != null && N.exists()) {
                                            MediaController.d0(N.toString(), photoViewer3.E, M4 ? 1 : 0, null, null, new bo0(ho0Var2, M4, 0));
                                            break;
                                        } else {
                                            photoViewer3.X2();
                                            break;
                                        }
                                    } else if (N != null && N.exists() && file3 != null && file3.exists()) {
                                        MediaController.e0(N.toString(), file3.toString(), photoViewer3.E, new yn0(ho0Var2, 1));
                                        break;
                                    } else {
                                        photoViewer3.X2();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                final boolean z202 = z17;
                final boolean z212 = z18;
                final boolean z222 = z19;
                alertDialog$Builder.k((!z17 || z19) ? org.telegram.messenger.bd.G(arrayList2.size(), "AllNMedia", new Object[0]) : org.telegram.messenger.bd.G(arrayList2.size(), "AllNPhotos", new Object[0]), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.eo0
                    @Override // org.telegram.ui.ActionBar.p1
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i642) {
                        File N;
                        ho0 ho0Var = ho0.this;
                        PhotoViewer photoViewer2 = ho0Var.b;
                        int[] iArr = new int[1];
                        final jn0 jn0Var = new jn0(ho0Var, new int[1], iArr, z202, z212, z222);
                        int i65 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i65 >= arrayList3.size()) {
                                return;
                            }
                            org.telegram.messenger.zi ziVar62 = (org.telegram.messenger.zi) arrayList3.get(i65);
                            if (ziVar62 != null) {
                                File file3 = null;
                                if ((org.telegram.messenger.zi.o1(ziVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.zi.o1(ziVar62.k).webpage != null && org.telegram.messenger.zi.o1(ziVar62.k).webpage.document == null) {
                                    org.telegram.messenger.w7.G(photoViewer2.U);
                                    N = org.telegram.messenger.w7.K(photoViewer2.r1(photoViewer2.Q4, null), null, true, true);
                                } else {
                                    org.telegram.messenger.w7.G(photoViewer2.U);
                                    N = org.telegram.messenger.w7.N(ziVar62.k, false, true);
                                }
                                boolean M4 = org.telegram.messenger.zi.M4(ziVar62.k);
                                boolean E3 = ziVar62.E3();
                                if (E3) {
                                    TLRPC.Document document2 = org.telegram.messenger.zi.o1(ziVar62.k) != null ? org.telegram.messenger.zi.o1(ziVar62.k).document : null;
                                    if (document2 != null) {
                                        org.telegram.messenger.w7.G(photoViewer2.U);
                                        File K2 = org.telegram.messenger.w7.K(document2, null, false, true);
                                        if (K2 == null || !K2.exists()) {
                                            org.telegram.messenger.w7.G(photoViewer2.U);
                                            file3 = org.telegram.messenger.w7.K(document2, null, true, true);
                                        } else {
                                            file3 = K2;
                                        }
                                    }
                                }
                                if (E3 && N != null && N.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        final int i66 = 1;
                                        MediaController.d0(N.toString(), photoViewer2.E, 0, null, null, new org.telegram.messenger.u10() { // from class: org.telegram.ui.ao0
                                            @Override // org.telegram.messenger.u10
                                            public final void a(Object obj) {
                                                switch (i66) {
                                                    case 0:
                                                        org.telegram.messenger.g0.h3(jn0Var);
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.h3(jn0Var);
                                                        break;
                                                    default:
                                                        org.telegram.messenger.g0.h3(jn0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i67 = 0;
                                        MediaController.e0(N.toString(), file3.toString(), photoViewer2.E, new org.telegram.messenger.u10() { // from class: org.telegram.ui.ao0
                                            @Override // org.telegram.messenger.u10
                                            public final void a(Object obj) {
                                                switch (i67) {
                                                    case 0:
                                                        org.telegram.messenger.g0.h3(jn0Var);
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.h3(jn0Var);
                                                        break;
                                                    default:
                                                        org.telegram.messenger.g0.h3(jn0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!E3 && N != null && N.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i68 = 2;
                                    MediaController.d0(N.toString(), photoViewer2.E, M4 ? 1 : 0, null, null, new org.telegram.messenger.u10() { // from class: org.telegram.ui.ao0
                                        @Override // org.telegram.messenger.u10
                                        public final void a(Object obj) {
                                            switch (i68) {
                                                case 0:
                                                    org.telegram.messenger.g0.h3(jn0Var);
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(jn0Var);
                                                    break;
                                                default:
                                                    org.telegram.messenger.g0.h3(jn0Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i65++;
                        }
                    }
                });
                alertDialog$Builder.i(org.telegram.messenger.bd.M0(2131752589, "Cancel"), new u70(5));
                org.telegram.ui.ActionBar.s1 a102 = alertDialog$Builder.a();
                B14 = r72.B1(org.telegram.ui.ActionBar.k6.ih);
                a102.j(B14);
                a102.show();
                d = a102.d(-3);
                if (d instanceof TextView) {
                }
                B15 = r72.B1(org.telegram.ui.ActionBar.k6.Vg);
                a102.p(B15);
                return;
            }
            ziVar50 = r72.U4;
            if (ziVar50 != null) {
                ziVar55 = r72.U4;
                if (org.telegram.messenger.zi.o1(ziVar55.k) instanceof TLRPC.TL_messageMediaWebPage) {
                    ziVar58 = r72.U4;
                    if (org.telegram.messenger.zi.o1(ziVar58.k).webpage != null) {
                        ziVar59 = r72.U4;
                        if (org.telegram.messenger.zi.o1(ziVar59.k).webpage.document == null) {
                            i58 = r72.Q4;
                            r12 = r72.r1(i58, null);
                            i59 = r72.U;
                            org.telegram.messenger.w7.G(i59);
                            file = org.telegram.messenger.w7.L(r12, true);
                            if (!file.exists()) {
                                file = new File(org.telegram.messenger.w7.z(4), file.getName());
                            }
                            ziVar57 = r72.U4;
                            z12 = ziVar57.I4();
                        }
                    }
                }
                i57 = r72.U;
                org.telegram.messenger.w7.G(i57);
                ziVar56 = r72.U4;
                file = org.telegram.messenger.w7.M(ziVar56.k);
                ziVar57 = r72.U4;
                z12 = ziVar57.I4();
            } else {
                acVar17 = r72.b5;
                if (acVar17 != null) {
                    acVar18 = r72.b5;
                    String s12 = PhotoViewer.s1(acVar18);
                    i53 = r72.U;
                    org.telegram.messenger.w7.G(i53);
                    acVar19 = r72.b5;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = acVar19 == null ? null : acVar19.f;
                    j16 = r72.A5;
                    if (j16 == 0) {
                        z14 = r72.C5;
                        if (!z14) {
                            z13 = false;
                            K = org.telegram.messenger.w7.K(tL_fileLocationToBeDeprecated, s12, z13, true);
                            if (K != null && !K.exists()) {
                                i54 = r72.U;
                                org.telegram.messenger.w7.G(i54);
                                acVar20 = r72.b5;
                                K = org.telegram.messenger.w7.K(acVar20 != null ? null : acVar20.f, s12, false, true);
                            }
                            if (s12 != null) {
                                s12 = s12.toLowerCase();
                            }
                            File file3 = K;
                            z12 = s12 == null && (s12.equals("webm") || s12.equals("mp4") || s12.equals("gif"));
                            file = file3;
                        }
                    }
                    z13 = true;
                    K = org.telegram.messenger.w7.K(tL_fileLocationToBeDeprecated, s12, z13, true);
                    if (K != null) {
                        i54 = r72.U;
                        org.telegram.messenger.w7.G(i54);
                        acVar20 = r72.b5;
                        K = org.telegram.messenger.w7.K(acVar20 != null ? null : acVar20.f, s12, false, true);
                    }
                    if (s12 != null) {
                    }
                    File file32 = K;
                    z12 = s12 == null && (s12.equals("webm") || s12.equals("mp4") || s12.equals("gif"));
                    file = file32;
                } else {
                    hq0Var7 = r72.k7;
                    if (hq0Var7 != null) {
                        hq0Var8 = r72.k7;
                        i51 = r72.Q4;
                        file = hq0Var8.b(i51);
                        hq0Var9 = r72.k7;
                        i52 = r72.Q4;
                        z12 = hq0Var9.a(i52);
                    } else {
                        z12 = false;
                        file = null;
                    }
                }
            }
            if (file != null && !file.exists()) {
                file = new File(org.telegram.messenger.w7.z(4), file.getName());
            }
            ziVar51 = r72.U4;
            if (ziVar51 != null) {
                ziVar54 = r72.U4;
                if (ziVar54.E3()) {
                    r32 = true;
                    if (r32 != false) {
                        ziVar52 = r72.U4;
                        if (org.telegram.messenger.zi.o1(ziVar52.k) != null) {
                            ziVar53 = r72.U4;
                            document = org.telegram.messenger.zi.o1(ziVar53.k).document;
                        } else {
                            document = null;
                        }
                        if (document != null) {
                            i55 = r72.U;
                            org.telegram.messenger.w7.G(i55);
                            file2 = org.telegram.messenger.w7.L(document, false);
                            if (file2 == null || !file2.exists()) {
                                i56 = r72.U;
                                org.telegram.messenger.w7.G(i56);
                                file2 = org.telegram.messenger.w7.L(document, true);
                            }
                            if (r32 != true) {
                                if (file == null || !file.exists()) {
                                    r72.X2();
                                    return;
                                }
                                String file4 = file.toString();
                                activity21 = r72.E;
                                MediaController.d0(file4, activity21, z12 ? 1 : 0, null, null, new bo0(this, z12, 1));
                                return;
                            }
                            if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                                r72.X2();
                                return;
                            }
                            String file5 = file.toString();
                            String file6 = file2.toString();
                            activity22 = r72.E;
                            MediaController.e0(file5, file6, activity22, new yn0(this, 0));
                            return;
                        }
                    }
                    file2 = null;
                    if (r32 != true) {
                    }
                }
            }
            r32 = false;
            if (r32 != false) {
            }
            file2 = null;
            if (r32 != true) {
            }
        } else {
            if (i3 == 24) {
                tf.b t10 = tf.b.t();
                o12 = r72.o1();
                t10.z(o12);
                k7Var = r72.H0;
                k7Var.performClick();
                return;
            }
            if (i3 == 3) {
                if (r72.F5 != 0) {
                    r72.t4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", r72.F5);
                    org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(bundle, null);
                    wmVar8 = r72.m4;
                    if (wmVar8 != null) {
                        wmVar9 = r72.m4;
                        r80Var.e0(wmVar9.O8());
                    }
                    r72.H0(false, false);
                    activity16 = r72.E;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = r72.E;
                        ((LaunchActivity) activity17).u0(r80Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i3 == 5 || i3 == 21) {
                ziVar = r72.U4;
                if (ziVar == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                long j17 = r72.F5;
                ziVar2 = r72.U4;
                if (ziVar2 != null) {
                    ziVar5 = r72.U4;
                    j17 = ziVar5.A0();
                }
                if (org.telegram.messenger.m5.C(j17)) {
                    bundle2.putInt("enc_id", org.telegram.messenger.m5.h(j17));
                } else if (org.telegram.messenger.m5.E(j17)) {
                    bundle2.putLong("user_id", j17);
                } else {
                    i10 = r72.U;
                    TLRPC.Chat M03 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-j17));
                    if (M03 != null && M03.migrated_to != null) {
                        bundle2.putLong("migrated_to", j17);
                        j17 = -M03.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -j17);
                }
                ziVar3 = r72.U4;
                bundle2.putInt("message_id", ziVar3.f1());
                if (i3 == 21) {
                    ziVar4 = r72.U4;
                    bundle2.putInt("reply_to", ziVar4.f1());
                }
                i11 = r72.U;
                org.telegram.messenger.hs.f(i11).k(org.telegram.messenger.hs.t, new Object[0]);
                activity = r72.E;
                if (activity instanceof LaunchActivity) {
                    activity2 = r72.E;
                    LaunchActivity launchActivity = (LaunchActivity) activity2;
                    launchActivity.u0(new wm(bundle2), launchActivity.R() > 1 || org.telegram.messenger.g0.Q1(), true);
                }
                r72.H0(false, false);
                r72.U4 = null;
                VideoAds videoAds = r72.V4;
                if (videoAds != null) {
                    videoAds.stop();
                    r72.V4 = null;
                    return;
                }
                return;
            }
            if (i3 == 25) {
                if (r72.n4 != null) {
                    kq0Var6 = r72.d;
                    if (kq0Var6 == null) {
                        return;
                    }
                    ziVar41 = r72.U4;
                    if (ziVar41 != null) {
                        ziVar42 = r72.U4;
                        if (ziVar42.k == null) {
                            return;
                        }
                        ziVar43 = r72.U4;
                        if (!TextUtils.isEmpty(ziVar43.k.attachPath)) {
                            ziVar45 = r72.U4;
                            str3 = ziVar45.k.attachPath;
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                        str3 = null;
                        if (TextUtils.isEmpty(str3)) {
                            i50 = r72.U;
                            org.telegram.messenger.w7.G(i50);
                            ziVar44 = r72.U4;
                            File O = org.telegram.messenger.w7.O(ziVar44.k);
                            if (O != null && O.exists()) {
                                str3 = O.getAbsolutePath();
                            }
                        }
                        String str4 = str3;
                        if (TextUtils.isEmpty(str4)) {
                            return;
                        }
                        wmVar7 = r72.m4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new org.telegram.messenger.ye(0, str4, 0, false, 0, 0));
                        this.b.j2(arrayList3, 0, 11, false, new fo0(), wmVar7);
                        r72.Z0(null, null, false, null);
                        r72.p2();
                        is.p().w();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i3 == 4) {
                ziVar34 = r72.U4;
                if (ziVar34 == null) {
                    return;
                }
                activity12 = r72.E;
                if (!(activity12 instanceof LaunchActivity)) {
                    return;
                }
                ziVar35 = r72.U4;
                if (!ziVar35.p1) {
                    ziVar40 = r72.U4;
                    long A0 = ziVar40.A0();
                    if (org.telegram.messenger.m5.z(A0)) {
                        i49 = r72.U;
                        z11 = org.telegram.messenger.t3.V(org.telegram.messenger.hp.s1(i49).M0(Long.valueOf(-A0)));
                        activity13 = r72.E;
                        ziVar36 = r72.U4;
                        ((LaunchActivity) activity13).O0(ziVar36.I1);
                        arrayList = new ArrayList(1);
                        wmVar4 = r72.m4;
                        if (wmVar4 == null) {
                            wmVar6 = r72.m4;
                            ziVar39 = r72.U4;
                            str2 = "Cancel";
                            uiVar = wmVar6.S8(ziVar39.d1());
                        } else {
                            str2 = "Cancel";
                            uiVar = null;
                        }
                        if (uiVar == null) {
                            arrayList.addAll(uiVar.d);
                        } else {
                            ziVar37 = r72.U4;
                            arrayList.add(ziVar37);
                        }
                        if (!z11 && arrayList.size() <= 1) {
                            PhotoViewer.C(r72, arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            uw uwVar = new uw(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            ziVar38 = r72.U4;
                            arrayList4.add(ziVar38);
                            wmVar5 = r72.m4;
                            uwVar.D2 = new b7(this, arrayList4, wmVar5, 18);
                            activity14 = r72.E;
                            ((LaunchActivity) activity14).u0(uwVar, false, true);
                            r72.H0(false, false);
                            return;
                        }
                        for (int i65 = 0; i65 < arrayList.size(); i65++) {
                            if (!((org.telegram.messenger.zi) arrayList.get(i65)).S3() || ((org.telegram.messenger.zi) arrayList.get(i65)).I4()) {
                                r02 = false;
                                break;
                            }
                        }
                        r02 = true;
                        activity15 = r72.E;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, e6Var);
                        alertDialog$Builder2.l(org.telegram.messenger.bd.M0(2131750586, "ForwardGroupMedia"));
                        alertDialog$Builder2.g(org.telegram.messenger.bd.M0(2131750585, "ForwardGroupMediaMessage"));
                        alertDialog$Builder2.a.J = org.telegram.ui.ActionBar.k6.dh;
                        alertDialog$Builder2.h(r02 != false ? org.telegram.messenger.bd.M0(2131744151, "ThisPhoto") : org.telegram.messenger.bd.M0(2131744152, "ThisMedia"), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.zn0
                            public final /* synthetic */ ho0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.p1
                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i642) {
                                File N;
                                switch (i61) {
                                    case 0:
                                        ho0 ho0Var = this.b;
                                        ho0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer2 = ho0Var.b;
                                        arrayList32.add(photoViewer2.U4);
                                        PhotoViewer.C(photoViewer2, arrayList32);
                                        break;
                                    default:
                                        ho0 ho0Var2 = this.b;
                                        PhotoViewer photoViewer3 = ho0Var2.b;
                                        org.telegram.messenger.zi ziVar62 = photoViewer3.U4;
                                        if (ziVar62 != null) {
                                            File file33 = null;
                                            if ((org.telegram.messenger.zi.o1(ziVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.zi.o1(photoViewer3.U4.k).webpage != null && org.telegram.messenger.zi.o1(photoViewer3.U4.k).webpage.document == null) {
                                                TLObject r13 = photoViewer3.r1(photoViewer3.Q4, null);
                                                org.telegram.messenger.w7.G(photoViewer3.U);
                                                N = org.telegram.messenger.w7.K(r13, null, true, true);
                                            } else {
                                                org.telegram.messenger.w7.G(photoViewer3.U);
                                                N = org.telegram.messenger.w7.N(photoViewer3.U4.k, false, true);
                                            }
                                            boolean M4 = org.telegram.messenger.zi.M4(photoViewer3.U4.k);
                                            boolean E3 = photoViewer3.U4.E3();
                                            if (E3) {
                                                TLRPC.Document document2 = org.telegram.messenger.zi.o1(photoViewer3.U4.k) != null ? org.telegram.messenger.zi.o1(photoViewer3.U4.k).document : null;
                                                if (document2 != null) {
                                                    org.telegram.messenger.w7.G(photoViewer3.U);
                                                    File K2 = org.telegram.messenger.w7.K(document2, null, false, true);
                                                    if (K2 == null || !K2.exists()) {
                                                        org.telegram.messenger.w7.G(photoViewer3.U);
                                                        file33 = org.telegram.messenger.w7.K(document2, null, true, true);
                                                    } else {
                                                        file33 = K2;
                                                    }
                                                }
                                            }
                                            if (!E3) {
                                                if (N != null && N.exists()) {
                                                    MediaController.d0(N.toString(), photoViewer3.E, M4 ? 1 : 0, null, null, new bo0(ho0Var2, M4, 0));
                                                    break;
                                                } else {
                                                    photoViewer3.X2();
                                                    break;
                                                }
                                            } else if (N != null && N.exists() && file33 != null && file33.exists()) {
                                                MediaController.e0(N.toString(), file33.toString(), photoViewer3.E, new yn0(ho0Var2, 1));
                                                break;
                                            } else {
                                                photoViewer3.X2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.k(r02 != false ? org.telegram.messenger.bd.G(arrayList.size(), "AllNPhotos", new Object[0]) : org.telegram.messenger.bd.G(arrayList.size(), "AllNMedia", new Object[0]), new rb0(11, this, arrayList));
                        alertDialog$Builder2.i(org.telegram.messenger.bd.M0(2131752589, str2), new u70(6));
                        org.telegram.ui.ActionBar.s1 a11 = alertDialog$Builder2.a();
                        B1 = r72.B1(org.telegram.ui.ActionBar.k6.ih);
                        a11.j(B1);
                        a11.show();
                        View d10 = a11.d(-3);
                        if (d10 instanceof TextView) {
                            int i66 = org.telegram.ui.ActionBar.k6.q7;
                            org.telegram.ui.ActionBar.r6.V((TextView) d10, i66, r72.w2);
                            B13 = r72.B1(i66);
                            d10.setBackground(org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), B13));
                            ViewGroup viewGroup2 = a11.w0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d10.bringToFront();
                            }
                        }
                        B12 = r72.B1(org.telegram.ui.ActionBar.k6.Vg);
                        a11.p(B12);
                        return;
                    }
                }
                z11 = false;
                activity13 = r72.E;
                ziVar36 = r72.U4;
                ((LaunchActivity) activity13).O0(ziVar36.I1);
                arrayList = new ArrayList(1);
                wmVar4 = r72.m4;
                if (wmVar4 == null) {
                }
                if (uiVar == null) {
                }
                if (!z11) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i3 == 18) {
                    PhotoViewer.D(r72);
                    return;
                }
                if (i3 == 26) {
                    activity11 = r72.E;
                    if (activity11 != null) {
                        kq0Var4 = r72.d;
                        if (kq0Var4 == null) {
                            return;
                        }
                        kq0Var5 = r72.d;
                        kq0Var5.J();
                        r72.H0(true, false);
                        return;
                    }
                    return;
                }
                if (i3 == 7) {
                    activity9 = r72.E;
                    if (activity9 == null) {
                        return;
                    }
                    kq0Var2 = r72.d;
                    if (kq0Var2 == null) {
                        return;
                    }
                    ziVar24 = r72.U4;
                    if (ziVar24 != null) {
                        ziVar32 = r72.U4;
                        if (!ziVar32.p1) {
                            ziVar33 = r72.U4;
                            long A02 = ziVar33.A0();
                            if (org.telegram.messenger.m5.z(A02)) {
                                i48 = r72.U;
                                z10 = org.telegram.messenger.t3.T(org.telegram.messenger.hp.s1(i48).M0(Long.valueOf(-A02)));
                                activity10 = r72.E;
                                ?? alertDialog$Builder3 = new AlertDialog$Builder(activity10);
                                kq0Var3 = r72.d;
                                b02 = kq0Var3.b0();
                                if (b02 == null) {
                                    alertDialog$Builder3.l(org.telegram.messenger.bd.M0(2131754094, "AreYouSureDeletePhotoTitle"));
                                    alertDialog$Builder3.g(b02);
                                } else {
                                    if (!r72.u4) {
                                        acVar14 = r72.b5;
                                        if (acVar14 != null) {
                                            acVar15 = r72.b5;
                                            acVar16 = r72.a5;
                                        }
                                        ziVar25 = r72.U4;
                                        if (ziVar25 != null) {
                                            ziVar28 = r72.U4;
                                        }
                                        ziVar26 = r72.U4;
                                        if (ziVar26 != null) {
                                            ziVar27 = r72.U4;
                                            if (ziVar27.r3()) {
                                                alertDialog$Builder3.l(org.telegram.messenger.bd.M0(2131754097, "AreYouSureDeleteGIFTitle"));
                                                if (z10) {
                                                    alertDialog$Builder3.g(org.telegram.messenger.bd.Y(2131754098, "AreYouSureDeleteGIFEveryone", new Object[0]));
                                                } else {
                                                    alertDialog$Builder3.g(org.telegram.messenger.bd.Y(2131754099, "AreYouSureDeleteGIF", new Object[0]));
                                                }
                                            }
                                        }
                                        alertDialog$Builder3.l(org.telegram.messenger.bd.M0(2131754094, "AreYouSureDeletePhotoTitle"));
                                        if (z10) {
                                            alertDialog$Builder3.g(org.telegram.messenger.bd.Y(2131754095, "AreYouSureDeletePhotoEveryone", new Object[0]));
                                        } else {
                                            alertDialog$Builder3.g(org.telegram.messenger.bd.Y(2131754096, "AreYouSureDeletePhoto", new Object[0]));
                                        }
                                    }
                                    alertDialog$Builder3.l(org.telegram.messenger.bd.M0(2131754083, "AreYouSureDeleteVideoTitle"));
                                    if (z10) {
                                        alertDialog$Builder3.g(org.telegram.messenger.bd.Y(2131754084, "AreYouSureDeleteVideoEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.g(org.telegram.messenger.bd.Y(2131754085, "AreYouSureDeleteVideo", new Object[0]));
                                    }
                                }
                                boolean[] zArr = new boolean[1];
                                ziVar29 = r72.U4;
                                if (ziVar29 != null) {
                                    ziVar30 = r72.U4;
                                    if (!ziVar30.p1) {
                                        ziVar31 = r72.U4;
                                        long A03 = ziVar31.A0();
                                        if (!org.telegram.messenger.m5.C(A03)) {
                                            if (org.telegram.messenger.m5.E(A03)) {
                                                i47 = r72.U;
                                                user = org.telegram.messenger.hp.s1(i47).a2(Long.valueOf(A03));
                                                M0 = null;
                                            } else {
                                                i41 = r72.U;
                                                M0 = org.telegram.messenger.hp.s1(i41).M0(Long.valueOf(-A03));
                                                user = null;
                                            }
                                            if (user != null || !org.telegram.messenger.t3.T(M0)) {
                                                i42 = r72.U;
                                                int currentTime = ConnectionsManager.getInstance(i42).getCurrentTime();
                                                if (user != null) {
                                                    i46 = r72.U;
                                                    i44 = org.telegram.messenger.hp.s1(i46).c3;
                                                } else {
                                                    i43 = r72.U;
                                                    i44 = org.telegram.messenger.hp.s1(i43).b3;
                                                }
                                                TLRPC.Chat chat = M0;
                                                if (user != null) {
                                                    long j18 = user.id;
                                                    i45 = r72.U;
                                                }
                                            }
                                        }
                                    }
                                }
                                int i67 = 2131752589;
                                org.telegram.ui.ActionBar.p1 p1Var = null;
                                alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131751599, "Delete"), new rb0(12, this, zArr));
                                alertDialog$Builder3.h(org.telegram.messenger.bd.M0(i67, "Cancel"), p1Var);
                                org.telegram.ui.ActionBar.s1 a12 = alertDialog$Builder3.a();
                                r72.V2(alertDialog$Builder3);
                                textView = (TextView) a12.d(-1);
                                if (textView == null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, r72.w2);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z10 = false;
                    activity10 = r72.E;
                    ?? alertDialog$Builder32 = new AlertDialog$Builder(activity10);
                    kq0Var3 = r72.d;
                    b02 = kq0Var3.b0();
                    if (b02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    ziVar29 = r72.U4;
                    if (ziVar29 != null) {
                    }
                    int i672 = 2131752589;
                    org.telegram.ui.ActionBar.p1 p1Var2 = null;
                    alertDialog$Builder32.k(org.telegram.messenger.bd.M0(2131751599, "Delete"), new rb0(12, this, zArr2));
                    alertDialog$Builder32.h(org.telegram.messenger.bd.M0(i672, "Cancel"), p1Var2);
                    org.telegram.ui.ActionBar.s1 a122 = alertDialog$Builder32.a();
                    r72.V2(alertDialog$Builder32);
                    textView = (TextView) a122.d(-1);
                    if (textView == null) {
                    }
                } else {
                    if (i3 == 9 || i3 == 16) {
                        PhotoViewer.G(r72);
                        return;
                    }
                    if (i3 == 10) {
                        try {
                            if (r72.u4) {
                                activity5 = r72.E;
                                ziVar11 = r72.U4;
                                sf.c.t(activity5, org.telegram.messenger.zi.o1(ziVar11.k).webpage.url);
                                r72.H0(false, false);
                                return;
                            }
                            ziVar6 = r72.U4;
                            if (ziVar6 == null) {
                                hq0Var = r72.k7;
                                if (hq0Var != null) {
                                    hq0Var2 = r72.k7;
                                    i12 = r72.Q4;
                                    TLObject d11 = hq0Var2.d(i12);
                                    activity3 = r72.E;
                                    if (org.telegram.messenger.g0.v2(d11, activity3)) {
                                        r72.H0(false, false);
                                        return;
                                    } else {
                                        r72.X2();
                                        return;
                                    }
                                }
                                return;
                            }
                            ziVar7 = r72.U4;
                            activity4 = r72.E;
                            ziVar8 = r72.U4;
                            if (!ziVar8.I4()) {
                                ziVar9 = r72.U4;
                                if (!ziVar9.S3()) {
                                    ziVar10 = r72.U4;
                                    if (!ziVar10.u4()) {
                                        z16 = false;
                                    }
                                }
                            }
                            if (org.telegram.messenger.g0.u2(ziVar7, activity4, e6Var, z16)) {
                                r72.H0(false, false);
                                return;
                            } else {
                                r72.X2();
                                return;
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.f(e10);
                            return;
                        }
                    }
                    if (i3 == 11 || i3 == 13) {
                        activity6 = r72.E;
                        if (activity6 != null) {
                            ziVar12 = r72.U4;
                            if (ziVar12 == null) {
                                return;
                            }
                            ziVar13 = r72.U4;
                            if (org.telegram.messenger.zi.o1(ziVar13.k) instanceof TLRPC.TL_messageMediaPhoto) {
                                ziVar17 = r72.U4;
                                tLObject = org.telegram.messenger.zi.o1(ziVar17.k).photo;
                            } else {
                                ziVar14 = r72.U4;
                                if (!(org.telegram.messenger.zi.o1(ziVar14.k) instanceof TLRPC.TL_messageMediaDocument)) {
                                    return;
                                }
                                ziVar15 = r72.U4;
                                tLObject = org.telegram.messenger.zi.o1(ziVar15.k).document;
                            }
                            TLObject tLObject2 = tLObject;
                            activity7 = r72.E;
                            ziVar16 = r72.U4;
                            r72.V3 = new go0(this, activity7, ziVar16, tLObject2, this.a);
                            xv0Var = r72.V3;
                            xv0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i3 == 6) {
                        q0Var = r72.p0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!r72.u4) {
                            r72.k3();
                            return;
                        }
                        ud0Var = r72.g0;
                        if (ud0Var.e()) {
                            if (PhotoViewer.c9 != null) {
                                PhotoViewer.c9.Q0();
                            }
                            r72.K3 = true;
                            photoViewer = PhotoViewer.b9;
                            PhotoViewer.c9 = photoViewer;
                            PhotoViewer.b9 = null;
                            r72.e = false;
                            r72.f = false;
                            mq0 mq0Var = r72.e5;
                            if (mq0Var != null && !mq0Var.a.H()) {
                                r72.e5.a.O0(true, true);
                            }
                            r72.n6 = 1.0f;
                            r72.f0.invalidate();
                            r72.T0();
                            return;
                        }
                        return;
                    }
                    if (i3 == 8) {
                        ziVar22 = r72.U4;
                        if (ziVar22 == null) {
                            return;
                        }
                        i40 = r72.U;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i40);
                        ziVar23 = r72.U4;
                        G.d(ziVar23.F0());
                        r72.r2(false);
                        r72.j0.setTag(r3);
                        r72.j0.setVisibility(0);
                        return;
                    }
                    if (i3 == 12) {
                        ziVar19 = r72.U4;
                        if (ziVar19 != null) {
                            ziVar20 = r72.U4;
                            TLRPC.Document F0 = ziVar20.F0();
                            wmVar = r72.m4;
                            if (wmVar != null) {
                                wmVar2 = r72.m4;
                                if (wmVar2.a0 != null) {
                                    wmVar3 = r72.m4;
                                    wmVar3.a0.k(F0);
                                    i39 = r72.U;
                                    org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i39);
                                    ziVar21 = r72.U4;
                                    s13.t4(ziVar21, F0);
                                }
                            }
                            i38 = r72.U;
                            org.telegram.messenger.li.b0(i38).c(F0, (int) (System.currentTimeMillis() / 1000), true);
                            i39 = r72.U;
                            org.telegram.messenger.hp s132 = org.telegram.messenger.hp.s1(i39);
                            ziVar21 = r72.U4;
                            s132.t4(ziVar21, F0);
                        } else {
                            hq0Var3 = r72.k7;
                            if (hq0Var3 == null) {
                                return;
                            }
                            hq0Var4 = r72.k7;
                            i35 = r72.Q4;
                            TLObject d12 = hq0Var4.d(i35);
                            if (d12 instanceof TLRPC.Document) {
                                TLRPC.Document document2 = (TLRPC.Document) d12;
                                i36 = r72.U;
                                org.telegram.messenger.li.b0(i36).c(document2, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = r72.U;
                                org.telegram.messenger.hp s14 = org.telegram.messenger.hp.s1(i37);
                                hq0Var5 = r72.k7;
                                s14.t4(hq0Var5.g(), document2);
                            }
                        }
                        gq0 gq0Var = r72.f0;
                        if (gq0Var != null) {
                            org.telegram.ui.Components.fc.Z(gq0Var, e6Var).o(org.telegram.ui.Components.ec.E, e6Var).j();
                            return;
                        }
                        return;
                    }
                    if (i3 == 14) {
                        ArrayList arrayList5 = r72.g7;
                        i17 = r72.Q4;
                        TLRPC.Photo photo3 = (TLRPC.Photo) arrayList5.get(i17);
                        if (photo3 == null || photo3.sizes.isEmpty()) {
                            return;
                        }
                        TLRPC.PhotoSize u10 = org.telegram.messenger.w7.u(800, photo3.sizes);
                        TLRPC.PhotoSize u11 = org.telegram.messenger.w7.u(90, photo3.sizes);
                        i18 = r72.U;
                        org.telegram.messenger.h10 i68 = org.telegram.messenger.h10.i(i18);
                        j11 = r72.A5;
                        if (j11 == i68.n) {
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = photo3.id;
                            tL_inputPhoto.access_hash = photo3.access_hash;
                            tL_inputPhoto.file_reference = photo3.file_reference;
                            i32 = r72.U;
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new co0(this, i68, photo3, i61));
                            i33 = r72.U;
                            TLRPC.User a22 = org.telegram.messenger.hp.s1(i33).a2(Long.valueOf(i68.n));
                            if (a22 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                userProfilePhoto.photo_id = photo3.id;
                                userProfilePhoto.dc_id = photo3.dc_id;
                                userProfilePhoto.photo_small = u11.location;
                                userProfilePhoto.photo_big = u10.location;
                                i68.w(a22);
                                i68.v(true);
                                i34 = r72.U;
                                org.telegram.messenger.hs.f(i34).k(org.telegram.messenger.hs.j0, new Object[0]);
                            }
                        } else {
                            i19 = r72.U;
                            org.telegram.messenger.hp s15 = org.telegram.messenger.hp.s1(i19);
                            j12 = r72.A5;
                            TLRPC.Chat M04 = s15.M0(Long.valueOf(-j12));
                            if (M04 == null) {
                                return;
                            }
                            TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                            tL_inputChatPhoto.id = tL_inputPhoto2;
                            tL_inputPhoto2.id = photo3.id;
                            tL_inputPhoto2.access_hash = photo3.access_hash;
                            tL_inputPhoto2.file_reference = photo3.file_reference;
                            i20 = r72.U;
                            org.telegram.messenger.hp s16 = org.telegram.messenger.hp.s1(i20);
                            j13 = r72.A5;
                            s16.B(-j13, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                            TLRPC.ChatPhoto chatPhoto = M04.photo;
                            chatPhoto.dc_id = photo3.dc_id;
                            chatPhoto.photo_small = u11.location;
                            chatPhoto.photo_big = u10.location;
                            i21 = r72.U;
                            org.telegram.messenger.hs.f(i21).k(org.telegram.messenger.hs.r, 2);
                        }
                        r72.i7 = org.telegram.messenger.ac.i(u10, photo3);
                        ArrayList arrayList6 = r72.g7;
                        i22 = r72.Q4;
                        arrayList6.remove(i22);
                        r72.g7.add(0, photo3);
                        ArrayList arrayList7 = r72.b7;
                        i23 = r72.Q4;
                        org.telegram.messenger.ac acVar21 = (org.telegram.messenger.ac) arrayList7.get(i23);
                        ArrayList arrayList8 = r72.b7;
                        i24 = r72.Q4;
                        arrayList8.remove(i24);
                        r72.b7.add(0, acVar21);
                        ArrayList arrayList9 = r72.c7;
                        i25 = r72.Q4;
                        org.telegram.messenger.ac acVar22 = (org.telegram.messenger.ac) arrayList9.get(i25);
                        ArrayList arrayList10 = r72.c7;
                        i26 = r72.Q4;
                        arrayList10.remove(i26);
                        r72.c7.add(0, acVar22);
                        ArrayList arrayList11 = r72.d7;
                        i27 = r72.Q4;
                        Long l10 = (Long) arrayList11.get(i27);
                        ArrayList arrayList12 = r72.d7;
                        i28 = r72.Q4;
                        arrayList12.remove(i28);
                        r72.d7.add(0, l10);
                        ArrayList arrayList13 = r72.e7;
                        i29 = r72.Q4;
                        TLRPC.Message message = (TLRPC.Message) arrayList13.get(i29);
                        ArrayList arrayList14 = r72.e7;
                        i30 = r72.Q4;
                        arrayList14.remove(i30);
                        r72.e7.add(0, message);
                        i31 = r72.U;
                        org.telegram.messenger.hp s17 = org.telegram.messenger.hp.s1(i31);
                        j14 = r72.A5;
                        org.telegram.messenger.po U0 = s17.U0(j14);
                        while (true) {
                            if (i60 >= U0.b.size()) {
                                break;
                            }
                            TLRPC.Photo photo4 = (TLRPC.Photo) U0.b.get(i60);
                            if (photo4 != null && photo4.id == photo3.id) {
                                U0.c(i60);
                                break;
                            }
                            i60++;
                        }
                        r72.Q4 = -1;
                        r72.E2(0);
                        org.telegram.ui.Components.h20 h20Var = r72.m1;
                        h20Var.d.clear();
                        h20Var.e.clear();
                        h20Var.c.clear();
                        r72.m1.b();
                        undoView = r72.o1;
                        j15 = r72.A5;
                        acVar12 = r72.b5;
                        acVar13 = r72.a5;
                        undoView.m(j15, acVar12 == acVar13 ? null : 1, 22);
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.do0
                            public final /* synthetic */ ho0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i61) {
                                    case 0:
                                        org.telegram.ui.ActionBar.q0 q0Var2 = this.b.b.p0;
                                        if (q0Var2 != null) {
                                            q0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.p0.t(19);
                                        photoViewer2.p0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.p0.S(19);
                                        photoViewer3.p0.t(20);
                                        break;
                                }
                            }
                        }, 300L);
                        return;
                    }
                    if (i3 == 15) {
                        i15 = r72.U;
                        org.telegram.messenger.w7.G(i15);
                        acVar7 = r72.b5;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = acVar7 == null ? null : acVar7.f;
                        acVar8 = r72.b5;
                        File K2 = org.telegram.messenger.w7.K(tL_fileLocationToBeDeprecated2, PhotoViewer.s1(acVar8), true, true);
                        acVar9 = r72.b5;
                        boolean z23 = acVar9.p == 2;
                        if (z23) {
                            i16 = r72.U;
                            org.telegram.messenger.w7.G(i16);
                            acVar10 = r72.a5;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = acVar10 == null ? null : acVar10.f;
                            acVar11 = r72.a5;
                            str = org.telegram.messenger.w7.K(tL_fileLocationToBeDeprecated3, PhotoViewer.s1(acVar11), true, true).getAbsolutePath();
                        } else {
                            str = null;
                        }
                        kq0Var = r72.d;
                        kq0Var.f(K2.getAbsolutePath(), str, z23);
                        return;
                    }
                    if (i3 == 19) {
                        int i69 = r72.R4;
                        if (i69 < 0 || i69 >= r72.Z6.size()) {
                            return;
                        }
                        org.telegram.messenger.zi ziVar62 = (org.telegram.messenger.zi) r72.Z6.get(r72.R4);
                        r72.o5 = true;
                        final int i70 = true ? 1 : 0;
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.do0
                            public final /* synthetic */ ho0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i70) {
                                    case 0:
                                        org.telegram.ui.ActionBar.q0 q0Var2 = this.b.b.p0;
                                        if (q0Var2 != null) {
                                            q0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.p0.t(19);
                                        photoViewer2.p0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.p0.S(19);
                                        photoViewer3.p0.t(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.S(r72);
                        i14 = r72.U;
                        org.telegram.messenger.hp.s1(i14).T1().L(ziVar62, new qn0(r72, 3));
                        return;
                    }
                    if (i3 == 20) {
                        r72.o5 = false;
                        final int i71 = 2;
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.do0
                            public final /* synthetic */ ho0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i71) {
                                    case 0:
                                        org.telegram.ui.ActionBar.q0 q0Var2 = this.b.b.p0;
                                        if (q0Var2 != null) {
                                            q0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.p0.t(19);
                                        photoViewer2.p0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.p0.S(19);
                                        photoViewer3.p0.t(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.S(r72);
                        return;
                    }
                    if (i3 == 22) {
                        r72.a3 = !r72.a3;
                        boolean z24 = r72.a3;
                        ziVar18 = r72.U4;
                        org.telegram.ui.Components.m51.n0(ziVar18, z24);
                        org.telegram.ui.Components.m51 m51Var = r72.G2;
                        if (m51Var != null) {
                            m51Var.s0(r72.a3);
                        }
                        r72.t0.f(r72.a3);
                        r72.t0.setSelectorColor(r72.a3 ? 259241196 : 268435455);
                        return;
                    }
                    if (i3 != 23) {
                        return;
                    }
                    acVar = r72.a5;
                    if (acVar != null) {
                        acVar5 = r72.a5;
                        if (acVar5.l != null) {
                            acVar6 = r72.a5;
                            photo2 = acVar6.l;
                            photo = photo2;
                            if (photo == null) {
                                return;
                            }
                            i13 = r72.U;
                            activity8 = r72.E;
                            j10 = r72.A5;
                            org.telegram.ui.Components.t4.I(i13, activity8, j10, photo, new ei.b());
                            return;
                        }
                    }
                    acVar2 = r72.b5;
                    if (acVar2 != null) {
                        acVar3 = r72.b5;
                        if (acVar3.l != null) {
                            acVar4 = r72.b5;
                            photo2 = acVar4.l;
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
