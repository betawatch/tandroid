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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class aq0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 a;
    public final /* synthetic */ PhotoViewer b;

    public aq0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.p6 p6Var) {
        this.b = photoViewer;
        this.a = p6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    @Override // org.telegram.ui.ActionBar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.T4 == null && photoViewer.b5 == null) {
            if (photoViewer.a5 != null) {
                org.telegram.messenger.b8.G(photoViewer.T);
                org.telegram.messenger.ic icVar = photoViewer.a5;
                File K = org.telegram.messenger.b8.K(icVar == null ? null : icVar.f, PhotoViewer.s1(icVar), photoViewer.z5 != 0 || photoViewer.B5, true);
                File file = new File(org.telegram.messenger.b8.z(4), K.getName());
                org.telegram.messenger.b8.G(photoViewer.T);
                org.telegram.messenger.ic icVar2 = photoViewer.a5;
                File K2 = org.telegram.messenger.b8.K(icVar2 != null ? icVar2.f : null, PhotoViewer.s1(icVar2), false, true);
                if (!K.exists() && !file.exists() && !K2.exists()) {
                    return false;
                }
            } else if (photoViewer.j7 != null) {
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x040e, code lost:
    
        if (sc.e.x(r3) != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0807, code lost:
    
        if (r4 == org.telegram.messenger.d20.i(r16).e()) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x080b, code lost:
    
        if (r10 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x080d, code lost:
    
        r4 = r7.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0817, code lost:
    
        if (org.telegram.messenger.vp.r1(r4).c3 == false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0819, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x081c, code lost:
    
        r5 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0824, code lost:
    
        if (r5.k.action == null) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0826, code lost:
    
        r5 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0830, code lost:
    
        if ((r5.k.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0833, code lost:
    
        r5 = "Cancel";
        r6 = 3;
        r15 = 2131752589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x083a, code lost:
    
        r5 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0842, code lost:
    
        if (r5.N3() != false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0844, code lost:
    
        if (r4 != false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x084a, code lost:
    
        if (org.telegram.messenger.w3.N(r11) == false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x084c, code lost:
    
        r4 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0855, code lost:
    
        if ((r12 - r4.k.date) > r13) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0857, code lost:
    
        r5 = r7.D;
        r4 = new android.widget.FrameLayout(r5);
        r12 = r7.D;
        r8 = new org.telegram.ui.Cells.c2(1, r12, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0873, code lost:
    
        if (r11 == null) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0875, code lost:
    
        r11 = 0;
        r2 = 5;
        r8.e(org.telegram.messenger.cd.L0(2131751541, "DeleteForAll"), "", false, false, false);
        r5 = "Cancel";
        r6 = 3;
        r15 = 2131752589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x08c6, code lost:
    
        if (org.telegram.messenger.cd.X == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x08c8, code lost:
    
        r9 = org.telegram.messenger.i0.L(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x08d3, code lost:
    
        if (org.telegram.messenger.cd.X == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x08d5, code lost:
    
        r10 = org.telegram.messenger.i0.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08de, code lost:
    
        r8.setPadding(r9, r11, r10, r11);
        r4.addView(r8, w7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.j8(r2, r0));
        r3.o(r4);
        r3.a.G = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08da, code lost:
    
        r10 = org.telegram.messenger.i0.L(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x08cd, code lost:
    
        r9 = org.telegram.messenger.i0.L(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0897, code lost:
    
        r2 = 5;
        r5 = "Cancel";
        r15 = 2131752589;
        r11 = 0;
        r6 = 3;
        r8.e(org.telegram.messenger.cd.Y(2131751540, "DeleteForUser", org.telegram.messenger.h20.i(r10)), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x081b, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0809, code lost:
    
        if (r11 != null) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x06d4, code lost:
    
        if (r10 == r13) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x06e4, code lost:
    
        if (r10.H4() != false) goto L325;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0df6  */
    /* JADX WARN: Removed duplicated region for block: B:540:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0243  */
    @Override // org.telegram.ui.ActionBar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10) {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        int i11;
        org.telegram.messenger.jj jjVar3;
        int i12;
        Activity activity;
        Activity activity2;
        org.telegram.messenger.jj jjVar4;
        org.telegram.messenger.jj jjVar5;
        org.telegram.messenger.jj jjVar6;
        bs0 bs0Var;
        bs0 bs0Var2;
        int i13;
        Activity activity3;
        org.telegram.messenger.jj jjVar7;
        Activity activity4;
        org.telegram.messenger.jj jjVar8;
        org.telegram.messenger.jj jjVar9;
        org.telegram.messenger.jj jjVar10;
        Activity activity5;
        org.telegram.messenger.jj jjVar11;
        Activity activity6;
        org.telegram.messenger.jj jjVar12;
        org.telegram.messenger.jj jjVar13;
        org.telegram.messenger.jj jjVar14;
        org.telegram.messenger.jj jjVar15;
        TLObject tLObject;
        Activity activity7;
        org.telegram.messenger.jj jjVar16;
        org.telegram.ui.Components.cx0 cx0Var;
        org.telegram.messenger.jj jjVar17;
        org.telegram.messenger.ic icVar;
        org.telegram.messenger.ic icVar2;
        TLRPC.Photo photo;
        org.telegram.messenger.ic icVar3;
        org.telegram.messenger.ic icVar4;
        TLRPC.Photo photo2;
        int i14;
        Activity activity8;
        long j10;
        org.telegram.messenger.ic icVar5;
        org.telegram.messenger.ic icVar6;
        org.telegram.messenger.jj jjVar18;
        int i15;
        int i16;
        org.telegram.messenger.ic icVar7;
        org.telegram.messenger.ic icVar8;
        org.telegram.messenger.ic icVar9;
        String str;
        es0 es0Var;
        int i17;
        org.telegram.messenger.ic icVar10;
        org.telegram.messenger.ic icVar11;
        int i18;
        int i19;
        long j11;
        int i20;
        long j12;
        int i21;
        long j13;
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
        UndoView undoView;
        long j14;
        org.telegram.messenger.ic icVar12;
        org.telegram.messenger.ic icVar13;
        int i32;
        int i33;
        int i34;
        org.telegram.messenger.jj jjVar19;
        bs0 bs0Var3;
        bs0 bs0Var4;
        int i35;
        int i36;
        int i37;
        bs0 bs0Var5;
        org.telegram.messenger.jj jjVar20;
        un unVar;
        int i38;
        int i39;
        org.telegram.messenger.jj jjVar21;
        un unVar2;
        un unVar3;
        org.telegram.messenger.jj jjVar22;
        int i40;
        org.telegram.messenger.jj jjVar23;
        org.telegram.ui.ActionBar.t0 t0Var;
        View findViewWithTag;
        org.telegram.ui.Components.ve0 ve0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        es0 es0Var2;
        org.telegram.messenger.jj jjVar24;
        boolean z10;
        Activity activity10;
        es0 es0Var3;
        CharSequence b02;
        org.telegram.messenger.ic icVar14;
        org.telegram.messenger.jj jjVar25;
        org.telegram.messenger.jj jjVar26;
        org.telegram.messenger.jj jjVar27;
        org.telegram.messenger.jj jjVar28;
        org.telegram.messenger.ic icVar15;
        org.telegram.messenger.ic icVar16;
        org.telegram.messenger.jj jjVar29;
        TextView textView;
        org.telegram.messenger.jj jjVar30;
        org.telegram.messenger.jj jjVar31;
        int i41;
        TLRPC.Chat L0;
        TLRPC.User user;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        org.telegram.messenger.jj jjVar32;
        org.telegram.messenger.jj jjVar33;
        int i48;
        Activity activity11;
        es0 es0Var4;
        es0 es0Var5;
        org.telegram.messenger.jj jjVar34;
        Activity activity12;
        org.telegram.messenger.jj jjVar35;
        boolean z11;
        Activity activity13;
        org.telegram.messenger.jj jjVar36;
        ArrayList arrayList;
        un unVar4;
        String str2;
        org.telegram.messenger.ej ejVar;
        org.telegram.messenger.jj jjVar37;
        org.telegram.messenger.jj jjVar38;
        un unVar5;
        Activity activity14;
        boolean z12;
        Activity activity15;
        int B1;
        int B12;
        int B13;
        un unVar6;
        org.telegram.messenger.jj jjVar39;
        org.telegram.messenger.jj jjVar40;
        int i49;
        es0 es0Var6;
        org.telegram.messenger.jj jjVar41;
        org.telegram.messenger.jj jjVar42;
        org.telegram.messenger.jj jjVar43;
        String str3;
        un unVar7;
        int i50;
        org.telegram.messenger.jj jjVar44;
        org.telegram.messenger.jj jjVar45;
        un unVar8;
        Activity activity16;
        Activity activity17;
        un unVar9;
        bi.j4 o12;
        org.telegram.ui.Components.i7 i7Var;
        bs0 bs0Var6;
        Activity activity18;
        Activity activity19;
        un unVar10;
        org.telegram.messenger.ej ejVar2;
        org.telegram.messenger.jj jjVar46;
        Activity activity20;
        org.telegram.messenger.jj jjVar47;
        String L02;
        int B14;
        View d;
        int B15;
        int B16;
        org.telegram.messenger.jj jjVar48;
        org.telegram.messenger.jj jjVar49;
        org.telegram.messenger.jj jjVar50;
        org.telegram.messenger.ic icVar17;
        bs0 bs0Var7;
        boolean z13;
        File file;
        bs0 bs0Var8;
        int i51;
        bs0 bs0Var9;
        int i52;
        org.telegram.messenger.ic icVar18;
        int i53;
        org.telegram.messenger.ic icVar19;
        long j15;
        boolean z14;
        File K;
        int i54;
        org.telegram.messenger.ic icVar20;
        boolean z15;
        org.telegram.messenger.jj jjVar51;
        Object[] objArr;
        File file2;
        Activity activity21;
        Activity activity22;
        org.telegram.messenger.jj jjVar52;
        TLRPC.Document document;
        int i55;
        int i56;
        org.telegram.messenger.jj jjVar53;
        org.telegram.messenger.jj jjVar54;
        org.telegram.messenger.jj jjVar55;
        int i57;
        org.telegram.messenger.jj jjVar56;
        org.telegram.messenger.jj jjVar57;
        org.telegram.messenger.jj jjVar58;
        org.telegram.messenger.jj jjVar59;
        int i58;
        TLObject r12;
        int i59;
        un unVar11;
        org.telegram.messenger.jj jjVar60;
        boolean z16;
        boolean K1;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        boolean z17 = true;
        z17 = true;
        z17 = true;
        PhotoViewer photoViewer2 = this.b;
        if (i10 == -1) {
            er0 er0Var = photoViewer2.L1;
            if (er0Var == null || !er0Var.n0()) {
                K1 = photoViewer2.K1();
                if (K1) {
                    photoViewer2.F0(false);
                    return;
                } else {
                    photoViewer2.H0(true, false);
                    return;
                }
            }
            return;
        }
        final int i60 = 0;
        if (i10 == 2) {
            bs0Var6 = photoViewer2.j7;
            if (bs0Var6 != null) {
                z16 = photoViewer2.k2;
                if (!z16) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.v2.b) {
                activity18 = photoViewer2.D;
                if (activity18.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    activity19 = photoViewer2.D;
                    activity19.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            final ArrayList arrayList2 = new ArrayList(1);
            unVar10 = photoViewer2.l4;
            if (unVar10 != null) {
                unVar11 = photoViewer2.l4;
                jjVar60 = photoViewer2.T4;
                ejVar2 = unVar11.L8(jjVar60.d1());
            } else {
                ejVar2 = null;
            }
            if (ejVar2 != null) {
                arrayList2.addAll(ejVar2.d);
            } else {
                jjVar46 = photoViewer2.T4;
                arrayList2.add(jjVar46);
            }
            if (arrayList2.size() > 1) {
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                for (int i61 = 0; i61 < arrayList2.size(); i61++) {
                    org.telegram.messenger.jj jjVar61 = (org.telegram.messenger.jj) arrayList2.get(i61);
                    if (jjVar61.D3()) {
                        z20 = true;
                    } else if (jjVar61.H4()) {
                        z18 = true;
                    } else {
                        z19 = true;
                    }
                }
                activity20 = photoViewer2.D;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity20, p6Var);
                alertDialog$Builder.l(org.telegram.messenger.cd.L0(2131745958, "SaveGroupMedia"));
                alertDialog$Builder.g(org.telegram.messenger.cd.L0(2131745957, "SaveGroupMediaMessage"));
                alertDialog$Builder.a.I = org.telegram.ui.ActionBar.t6.dh;
                jjVar47 = photoViewer2.T4;
                if (jjVar47 != null) {
                    jjVar48 = photoViewer2.T4;
                    if (jjVar48.H4()) {
                        jjVar49 = photoViewer2.T4;
                        if (!jjVar49.D3()) {
                            L02 = org.telegram.messenger.cd.L0(2131744167, "ThisMedia");
                            final int i62 = true ? 1 : 0;
                            alertDialog$Builder.h(L02, new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.sp0
                                public final /* synthetic */ aq0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.u1
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i63) {
                                    File N;
                                    switch (i62) {
                                        case 0:
                                            aq0 aq0Var = this.b;
                                            aq0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer3 = aq0Var.b;
                                            arrayList3.add(photoViewer3.T4);
                                            PhotoViewer.D(photoViewer3, arrayList3);
                                            break;
                                        default:
                                            aq0 aq0Var2 = this.b;
                                            PhotoViewer photoViewer4 = aq0Var2.b;
                                            org.telegram.messenger.jj jjVar62 = photoViewer4.T4;
                                            if (jjVar62 != null) {
                                                File file3 = null;
                                                if ((org.telegram.messenger.jj.o1(jjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.jj.o1(photoViewer4.T4.k).webpage != null && org.telegram.messenger.jj.o1(photoViewer4.T4.k).webpage.document == null) {
                                                    TLObject r13 = photoViewer4.r1(photoViewer4.P4, null);
                                                    org.telegram.messenger.b8.G(photoViewer4.T);
                                                    N = org.telegram.messenger.b8.K(r13, null, true, true);
                                                } else {
                                                    org.telegram.messenger.b8.G(photoViewer4.T);
                                                    N = org.telegram.messenger.b8.N(photoViewer4.T4.k, false, true);
                                                }
                                                boolean L4 = org.telegram.messenger.jj.L4(photoViewer4.T4.k);
                                                boolean D3 = photoViewer4.T4.D3();
                                                if (D3) {
                                                    TLRPC.Document document2 = org.telegram.messenger.jj.o1(photoViewer4.T4.k) != null ? org.telegram.messenger.jj.o1(photoViewer4.T4.k).document : null;
                                                    if (document2 != null) {
                                                        org.telegram.messenger.b8.G(photoViewer4.T);
                                                        File K2 = org.telegram.messenger.b8.K(document2, null, false, true);
                                                        if (K2 == null || !K2.exists()) {
                                                            org.telegram.messenger.b8.G(photoViewer4.T);
                                                            file3 = org.telegram.messenger.b8.K(document2, null, true, true);
                                                        } else {
                                                            file3 = K2;
                                                        }
                                                    }
                                                }
                                                if (!D3) {
                                                    if (N != null && N.exists()) {
                                                        MediaController.d0(N.toString(), photoViewer4.D, L4 ? 1 : 0, null, null, new up0(aq0Var2, L4, 0));
                                                        break;
                                                    } else {
                                                        photoViewer4.X2();
                                                        break;
                                                    }
                                                } else if (N != null && N.exists() && file3 != null && file3.exists()) {
                                                    MediaController.e0(N.toString(), file3.toString(), photoViewer4.D, new rp0(aq0Var2, 1));
                                                    break;
                                                } else {
                                                    photoViewer4.X2();
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
                            alertDialog$Builder.k((!z18 || z20) ? org.telegram.messenger.cd.G(arrayList2.size(), "AllNMedia", new Object[0]) : org.telegram.messenger.cd.G(arrayList2.size(), "AllNPhotos", new Object[0]), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.xp0
                                @Override // org.telegram.ui.ActionBar.u1
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i63) {
                                    File N;
                                    aq0 aq0Var = aq0.this;
                                    PhotoViewer photoViewer3 = aq0Var.b;
                                    int[] iArr = new int[1];
                                    final ap0 ap0Var = new ap0(aq0Var, new int[1], iArr, z21, z22, z23);
                                    int i64 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i64 >= arrayList3.size()) {
                                            return;
                                        }
                                        org.telegram.messenger.jj jjVar62 = (org.telegram.messenger.jj) arrayList3.get(i64);
                                        if (jjVar62 != null) {
                                            File file3 = null;
                                            if ((org.telegram.messenger.jj.o1(jjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.jj.o1(jjVar62.k).webpage != null && org.telegram.messenger.jj.o1(jjVar62.k).webpage.document == null) {
                                                org.telegram.messenger.b8.G(photoViewer3.T);
                                                N = org.telegram.messenger.b8.K(photoViewer3.r1(photoViewer3.P4, null), null, true, true);
                                            } else {
                                                org.telegram.messenger.b8.G(photoViewer3.T);
                                                N = org.telegram.messenger.b8.N(jjVar62.k, false, true);
                                            }
                                            boolean L4 = org.telegram.messenger.jj.L4(jjVar62.k);
                                            boolean D3 = jjVar62.D3();
                                            if (D3) {
                                                TLRPC.Document document2 = org.telegram.messenger.jj.o1(jjVar62.k) != null ? org.telegram.messenger.jj.o1(jjVar62.k).document : null;
                                                if (document2 != null) {
                                                    org.telegram.messenger.b8.G(photoViewer3.T);
                                                    File K2 = org.telegram.messenger.b8.K(document2, null, false, true);
                                                    if (K2 == null || !K2.exists()) {
                                                        org.telegram.messenger.b8.G(photoViewer3.T);
                                                        file3 = org.telegram.messenger.b8.K(document2, null, true, true);
                                                    } else {
                                                        file3 = K2;
                                                    }
                                                }
                                            }
                                            if (D3 && N != null && N.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                if (file3 == null || !file3.exists()) {
                                                    final int i65 = 1;
                                                    MediaController.d0(N.toString(), photoViewer3.D, 0, null, null, new org.telegram.messenger.q20() { // from class: org.telegram.ui.tp0
                                                        @Override // org.telegram.messenger.q20
                                                        public final void a(Object obj) {
                                                            switch (i65) {
                                                                case 0:
                                                                    org.telegram.messenger.i0.g3(ap0Var);
                                                                    break;
                                                                case 1:
                                                                    org.telegram.messenger.i0.g3(ap0Var);
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.i0.g3(ap0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i66 = 0;
                                                    MediaController.e0(N.toString(), file3.toString(), photoViewer3.D, new org.telegram.messenger.q20() { // from class: org.telegram.ui.tp0
                                                        @Override // org.telegram.messenger.q20
                                                        public final void a(Object obj) {
                                                            switch (i66) {
                                                                case 0:
                                                                    org.telegram.messenger.i0.g3(ap0Var);
                                                                    break;
                                                                case 1:
                                                                    org.telegram.messenger.i0.g3(ap0Var);
                                                                    break;
                                                                default:
                                                                    org.telegram.messenger.i0.g3(ap0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!D3 && N != null && N.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i67 = 2;
                                                MediaController.d0(N.toString(), photoViewer3.D, L4 ? 1 : 0, null, null, new org.telegram.messenger.q20() { // from class: org.telegram.ui.tp0
                                                    @Override // org.telegram.messenger.q20
                                                    public final void a(Object obj) {
                                                        switch (i67) {
                                                            case 0:
                                                                org.telegram.messenger.i0.g3(ap0Var);
                                                                break;
                                                            case 1:
                                                                org.telegram.messenger.i0.g3(ap0Var);
                                                                break;
                                                            default:
                                                                org.telegram.messenger.i0.g3(ap0Var);
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
                            alertDialog$Builder.i(org.telegram.messenger.cd.L0(2131752589, "Cancel"), new org.telegram.ui.Components.z11(20));
                            org.telegram.ui.ActionBar.x1 a2 = alertDialog$Builder.a();
                            B14 = photoViewer2.B1(org.telegram.ui.ActionBar.t6.ih);
                            a2.j(B14);
                            a2.show();
                            d = a2.d(-3);
                            if (d instanceof TextView) {
                                int i63 = org.telegram.ui.ActionBar.t6.q7;
                                org.telegram.ui.ActionBar.a7.V((TextView) d, i63, photoViewer2.v2);
                                B16 = photoViewer2.B1(i63);
                                d.setBackground(org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(3.0f), B16));
                                ViewGroup viewGroup = a2.v0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            B15 = photoViewer2.B1(org.telegram.ui.ActionBar.t6.Vg);
                            a2.p(B15);
                            return;
                        }
                    }
                }
                L02 = org.telegram.messenger.cd.L0(2131744166, "ThisPhoto");
                final int i622 = true ? 1 : 0;
                alertDialog$Builder.h(L02, new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.sp0
                    public final /* synthetic */ aq0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.u1
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i632) {
                        File N;
                        switch (i622) {
                            case 0:
                                aq0 aq0Var = this.b;
                                aq0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer3 = aq0Var.b;
                                arrayList3.add(photoViewer3.T4);
                                PhotoViewer.D(photoViewer3, arrayList3);
                                break;
                            default:
                                aq0 aq0Var2 = this.b;
                                PhotoViewer photoViewer4 = aq0Var2.b;
                                org.telegram.messenger.jj jjVar62 = photoViewer4.T4;
                                if (jjVar62 != null) {
                                    File file3 = null;
                                    if ((org.telegram.messenger.jj.o1(jjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.jj.o1(photoViewer4.T4.k).webpage != null && org.telegram.messenger.jj.o1(photoViewer4.T4.k).webpage.document == null) {
                                        TLObject r13 = photoViewer4.r1(photoViewer4.P4, null);
                                        org.telegram.messenger.b8.G(photoViewer4.T);
                                        N = org.telegram.messenger.b8.K(r13, null, true, true);
                                    } else {
                                        org.telegram.messenger.b8.G(photoViewer4.T);
                                        N = org.telegram.messenger.b8.N(photoViewer4.T4.k, false, true);
                                    }
                                    boolean L4 = org.telegram.messenger.jj.L4(photoViewer4.T4.k);
                                    boolean D3 = photoViewer4.T4.D3();
                                    if (D3) {
                                        TLRPC.Document document2 = org.telegram.messenger.jj.o1(photoViewer4.T4.k) != null ? org.telegram.messenger.jj.o1(photoViewer4.T4.k).document : null;
                                        if (document2 != null) {
                                            org.telegram.messenger.b8.G(photoViewer4.T);
                                            File K2 = org.telegram.messenger.b8.K(document2, null, false, true);
                                            if (K2 == null || !K2.exists()) {
                                                org.telegram.messenger.b8.G(photoViewer4.T);
                                                file3 = org.telegram.messenger.b8.K(document2, null, true, true);
                                            } else {
                                                file3 = K2;
                                            }
                                        }
                                    }
                                    if (!D3) {
                                        if (N != null && N.exists()) {
                                            MediaController.d0(N.toString(), photoViewer4.D, L4 ? 1 : 0, null, null, new up0(aq0Var2, L4, 0));
                                            break;
                                        } else {
                                            photoViewer4.X2();
                                            break;
                                        }
                                    } else if (N != null && N.exists() && file3 != null && file3.exists()) {
                                        MediaController.e0(N.toString(), file3.toString(), photoViewer4.D, new rp0(aq0Var2, 1));
                                        break;
                                    } else {
                                        photoViewer4.X2();
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
                alertDialog$Builder.k((!z18 || z20) ? org.telegram.messenger.cd.G(arrayList2.size(), "AllNMedia", new Object[0]) : org.telegram.messenger.cd.G(arrayList2.size(), "AllNPhotos", new Object[0]), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.xp0
                    @Override // org.telegram.ui.ActionBar.u1
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i632) {
                        File N;
                        aq0 aq0Var = aq0.this;
                        PhotoViewer photoViewer3 = aq0Var.b;
                        int[] iArr = new int[1];
                        final ap0 ap0Var = new ap0(aq0Var, new int[1], iArr, z212, z222, z232);
                        int i64 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i64 >= arrayList3.size()) {
                                return;
                            }
                            org.telegram.messenger.jj jjVar62 = (org.telegram.messenger.jj) arrayList3.get(i64);
                            if (jjVar62 != null) {
                                File file3 = null;
                                if ((org.telegram.messenger.jj.o1(jjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.jj.o1(jjVar62.k).webpage != null && org.telegram.messenger.jj.o1(jjVar62.k).webpage.document == null) {
                                    org.telegram.messenger.b8.G(photoViewer3.T);
                                    N = org.telegram.messenger.b8.K(photoViewer3.r1(photoViewer3.P4, null), null, true, true);
                                } else {
                                    org.telegram.messenger.b8.G(photoViewer3.T);
                                    N = org.telegram.messenger.b8.N(jjVar62.k, false, true);
                                }
                                boolean L4 = org.telegram.messenger.jj.L4(jjVar62.k);
                                boolean D3 = jjVar62.D3();
                                if (D3) {
                                    TLRPC.Document document2 = org.telegram.messenger.jj.o1(jjVar62.k) != null ? org.telegram.messenger.jj.o1(jjVar62.k).document : null;
                                    if (document2 != null) {
                                        org.telegram.messenger.b8.G(photoViewer3.T);
                                        File K2 = org.telegram.messenger.b8.K(document2, null, false, true);
                                        if (K2 == null || !K2.exists()) {
                                            org.telegram.messenger.b8.G(photoViewer3.T);
                                            file3 = org.telegram.messenger.b8.K(document2, null, true, true);
                                        } else {
                                            file3 = K2;
                                        }
                                    }
                                }
                                if (D3 && N != null && N.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        final int i65 = 1;
                                        MediaController.d0(N.toString(), photoViewer3.D, 0, null, null, new org.telegram.messenger.q20() { // from class: org.telegram.ui.tp0
                                            @Override // org.telegram.messenger.q20
                                            public final void a(Object obj) {
                                                switch (i65) {
                                                    case 0:
                                                        org.telegram.messenger.i0.g3(ap0Var);
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.i0.g3(ap0Var);
                                                        break;
                                                    default:
                                                        org.telegram.messenger.i0.g3(ap0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i66 = 0;
                                        MediaController.e0(N.toString(), file3.toString(), photoViewer3.D, new org.telegram.messenger.q20() { // from class: org.telegram.ui.tp0
                                            @Override // org.telegram.messenger.q20
                                            public final void a(Object obj) {
                                                switch (i66) {
                                                    case 0:
                                                        org.telegram.messenger.i0.g3(ap0Var);
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.i0.g3(ap0Var);
                                                        break;
                                                    default:
                                                        org.telegram.messenger.i0.g3(ap0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!D3 && N != null && N.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i67 = 2;
                                    MediaController.d0(N.toString(), photoViewer3.D, L4 ? 1 : 0, null, null, new org.telegram.messenger.q20() { // from class: org.telegram.ui.tp0
                                        @Override // org.telegram.messenger.q20
                                        public final void a(Object obj) {
                                            switch (i67) {
                                                case 0:
                                                    org.telegram.messenger.i0.g3(ap0Var);
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.i0.g3(ap0Var);
                                                    break;
                                                default:
                                                    org.telegram.messenger.i0.g3(ap0Var);
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
                alertDialog$Builder.i(org.telegram.messenger.cd.L0(2131752589, "Cancel"), new org.telegram.ui.Components.z11(20));
                org.telegram.ui.ActionBar.x1 a22 = alertDialog$Builder.a();
                B14 = photoViewer2.B1(org.telegram.ui.ActionBar.t6.ih);
                a22.j(B14);
                a22.show();
                d = a22.d(-3);
                if (d instanceof TextView) {
                }
                B15 = photoViewer2.B1(org.telegram.ui.ActionBar.t6.Vg);
                a22.p(B15);
                return;
            }
            jjVar50 = photoViewer2.T4;
            if (jjVar50 != null) {
                jjVar55 = photoViewer2.T4;
                if (org.telegram.messenger.jj.o1(jjVar55.k) instanceof TLRPC.TL_messageMediaWebPage) {
                    jjVar58 = photoViewer2.T4;
                    if (org.telegram.messenger.jj.o1(jjVar58.k).webpage != null) {
                        jjVar59 = photoViewer2.T4;
                        if (org.telegram.messenger.jj.o1(jjVar59.k).webpage.document == null) {
                            i58 = photoViewer2.P4;
                            r12 = photoViewer2.r1(i58, null);
                            i59 = photoViewer2.T;
                            org.telegram.messenger.b8.G(i59);
                            file = org.telegram.messenger.b8.L(r12, true);
                            if (!file.exists()) {
                                file = new File(org.telegram.messenger.b8.z(4), file.getName());
                            }
                            jjVar57 = photoViewer2.T4;
                            z13 = jjVar57.H4();
                        }
                    }
                }
                i57 = photoViewer2.T;
                org.telegram.messenger.b8.G(i57);
                jjVar56 = photoViewer2.T4;
                file = org.telegram.messenger.b8.M(jjVar56.k);
                jjVar57 = photoViewer2.T4;
                z13 = jjVar57.H4();
            } else {
                icVar17 = photoViewer2.a5;
                if (icVar17 != null) {
                    icVar18 = photoViewer2.a5;
                    String s12 = PhotoViewer.s1(icVar18);
                    i53 = photoViewer2.T;
                    org.telegram.messenger.b8.G(i53);
                    icVar19 = photoViewer2.a5;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = icVar19 == null ? null : icVar19.f;
                    j15 = photoViewer2.z5;
                    if (j15 == 0) {
                        z15 = photoViewer2.B5;
                        if (!z15) {
                            z14 = false;
                            K = org.telegram.messenger.b8.K(tL_fileLocationToBeDeprecated, s12, z14, true);
                            if (K != null && !K.exists()) {
                                i54 = photoViewer2.T;
                                org.telegram.messenger.b8.G(i54);
                                icVar20 = photoViewer2.a5;
                                K = org.telegram.messenger.b8.K(icVar20 != null ? null : icVar20.f, s12, false, true);
                            }
                            if (s12 != null) {
                                s12 = s12.toLowerCase();
                            }
                            File file3 = K;
                            z13 = s12 == null && (s12.equals("webm") || s12.equals("mp4") || s12.equals("gif"));
                            file = file3;
                        }
                    }
                    z14 = true;
                    K = org.telegram.messenger.b8.K(tL_fileLocationToBeDeprecated, s12, z14, true);
                    if (K != null) {
                        i54 = photoViewer2.T;
                        org.telegram.messenger.b8.G(i54);
                        icVar20 = photoViewer2.a5;
                        K = org.telegram.messenger.b8.K(icVar20 != null ? null : icVar20.f, s12, false, true);
                    }
                    if (s12 != null) {
                    }
                    File file32 = K;
                    z13 = s12 == null && (s12.equals("webm") || s12.equals("mp4") || s12.equals("gif"));
                    file = file32;
                } else {
                    bs0Var7 = photoViewer2.j7;
                    if (bs0Var7 != null) {
                        bs0Var8 = photoViewer2.j7;
                        i51 = photoViewer2.P4;
                        file = bs0Var8.b(i51);
                        bs0Var9 = photoViewer2.j7;
                        i52 = photoViewer2.P4;
                        z13 = bs0Var9.a(i52);
                    } else {
                        z13 = false;
                        file = null;
                    }
                }
            }
            if (file != null && !file.exists()) {
                file = new File(org.telegram.messenger.b8.z(4), file.getName());
            }
            jjVar51 = photoViewer2.T4;
            if (jjVar51 != null) {
                jjVar54 = photoViewer2.T4;
                if (jjVar54.D3()) {
                    objArr = true;
                    if (objArr != false) {
                        jjVar52 = photoViewer2.T4;
                        if (org.telegram.messenger.jj.o1(jjVar52.k) != null) {
                            jjVar53 = photoViewer2.T4;
                            document = org.telegram.messenger.jj.o1(jjVar53.k).document;
                        } else {
                            document = null;
                        }
                        if (document != null) {
                            i55 = photoViewer2.T;
                            org.telegram.messenger.b8.G(i55);
                            file2 = org.telegram.messenger.b8.L(document, false);
                            if (file2 == null || !file2.exists()) {
                                i56 = photoViewer2.T;
                                org.telegram.messenger.b8.G(i56);
                                file2 = org.telegram.messenger.b8.L(document, true);
                            }
                            if (objArr != true) {
                                if (file == null || !file.exists()) {
                                    photoViewer2.X2();
                                    return;
                                }
                                String file4 = file.toString();
                                activity21 = photoViewer2.D;
                                MediaController.d0(file4, activity21, z13 ? 1 : 0, null, null, new up0(this, z13, true ? 1 : 0));
                                return;
                            }
                            if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                                photoViewer2.X2();
                                return;
                            }
                            String file5 = file.toString();
                            String file6 = file2.toString();
                            activity22 = photoViewer2.D;
                            MediaController.e0(file5, file6, activity22, new rp0(this, i60));
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
            if (i10 == 24) {
                hf.b e02 = hf.b.e0();
                o12 = photoViewer2.o1();
                e02.l0(o12);
                i7Var = photoViewer2.G0;
                i7Var.performClick();
                return;
            }
            if (i10 == 3) {
                if (photoViewer2.E5 != 0) {
                    photoViewer2.s4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", photoViewer2.E5);
                    org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(bundle, null);
                    unVar8 = photoViewer2.l4;
                    if (unVar8 != null) {
                        unVar9 = photoViewer2.l4;
                        n90Var.d0(unVar9.H8());
                    }
                    photoViewer2.H0(false, false);
                    activity16 = photoViewer2.D;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = photoViewer2.D;
                        ((LaunchActivity) activity17).u0(n90Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 5 || i10 == 21) {
                jjVar = photoViewer2.T4;
                if (jjVar == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                long j16 = photoViewer2.E5;
                jjVar2 = photoViewer2.T4;
                if (jjVar2 != null) {
                    jjVar5 = photoViewer2.T4;
                    j16 = jjVar5.A0();
                }
                if (org.telegram.messenger.o5.C(j16)) {
                    bundle2.putInt("enc_id", org.telegram.messenger.o5.h(j16));
                } else if (org.telegram.messenger.o5.E(j16)) {
                    bundle2.putLong("user_id", j16);
                } else {
                    i11 = photoViewer2.T;
                    TLRPC.Chat L03 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-j16));
                    if (L03 != null && L03.migrated_to != null) {
                        bundle2.putLong("migrated_to", j16);
                        j16 = -L03.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -j16);
                }
                jjVar3 = photoViewer2.T4;
                bundle2.putInt("message_id", jjVar3.f1());
                if (i10 == 21) {
                    jjVar4 = photoViewer2.T4;
                    bundle2.putInt("reply_to", jjVar4.f1());
                }
                i12 = photoViewer2.T;
                org.telegram.messenger.zs.f(i12).k(org.telegram.messenger.zs.t, new Object[0]);
                activity = photoViewer2.D;
                if (activity instanceof LaunchActivity) {
                    activity2 = photoViewer2.D;
                    LaunchActivity launchActivity = (LaunchActivity) activity2;
                    launchActivity.u0(new un(bundle2), launchActivity.R() > 1 || org.telegram.messenger.i0.Q1(), true);
                }
                photoViewer2.H0(false, false);
                photoViewer2.T4 = null;
                VideoAds videoAds = photoViewer2.U4;
                if (videoAds != null) {
                    videoAds.stop();
                    photoViewer2.U4 = null;
                    return;
                }
                return;
            }
            if (i10 == 25) {
                if (photoViewer2.m4 != null) {
                    es0Var6 = photoViewer2.d;
                    if (es0Var6 == null) {
                        return;
                    }
                    jjVar41 = photoViewer2.T4;
                    if (jjVar41 != null) {
                        jjVar42 = photoViewer2.T4;
                        if (jjVar42.k == null) {
                            return;
                        }
                        jjVar43 = photoViewer2.T4;
                        if (!TextUtils.isEmpty(jjVar43.k.attachPath)) {
                            jjVar45 = photoViewer2.T4;
                            str3 = jjVar45.k.attachPath;
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                        str3 = null;
                        if (TextUtils.isEmpty(str3)) {
                            i50 = photoViewer2.T;
                            org.telegram.messenger.b8.G(i50);
                            jjVar44 = photoViewer2.T4;
                            File O = org.telegram.messenger.b8.O(jjVar44.k);
                            if (O != null && O.exists()) {
                                str3 = O.getAbsolutePath();
                            }
                        }
                        String str4 = str3;
                        if (TextUtils.isEmpty(str4)) {
                            return;
                        }
                        unVar7 = photoViewer2.l4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new org.telegram.messenger.ef(0, str4, 0, false, 0, 0));
                        this.b.j2(arrayList3, 0, 11, false, new yp0(), unVar7);
                        photoViewer2.Z0(null, null, false, null);
                        photoViewer2.p2();
                        lt.p().w();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                jjVar34 = photoViewer2.T4;
                if (jjVar34 == null) {
                    return;
                }
                activity12 = photoViewer2.D;
                if (!(activity12 instanceof LaunchActivity)) {
                    return;
                }
                jjVar35 = photoViewer2.T4;
                if (!jjVar35.p1) {
                    jjVar40 = photoViewer2.T4;
                    long A0 = jjVar40.A0();
                    if (org.telegram.messenger.o5.z(A0)) {
                        i49 = photoViewer2.T;
                        z11 = org.telegram.messenger.w3.V(org.telegram.messenger.vp.r1(i49).L0(Long.valueOf(-A0)));
                        activity13 = photoViewer2.D;
                        jjVar36 = photoViewer2.T4;
                        ((LaunchActivity) activity13).O0(jjVar36.I1);
                        arrayList = new ArrayList(1);
                        unVar4 = photoViewer2.l4;
                        if (unVar4 == null) {
                            unVar6 = photoViewer2.l4;
                            jjVar39 = photoViewer2.T4;
                            str2 = "AllNMedia";
                            ejVar = unVar6.L8(jjVar39.d1());
                        } else {
                            str2 = "AllNMedia";
                            ejVar = null;
                        }
                        if (ejVar == null) {
                            arrayList.addAll(ejVar.d);
                        } else {
                            jjVar37 = photoViewer2.T4;
                            arrayList.add(jjVar37);
                        }
                        if (!z11 && arrayList.size() <= 1) {
                            PhotoViewer.D(photoViewer2, arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            ay ayVar = new ay(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            jjVar38 = photoViewer2.T4;
                            arrayList4.add(jjVar38);
                            unVar5 = photoViewer2.l4;
                            ayVar.C2 = new a7(this, arrayList4, unVar5, 18);
                            activity14 = photoViewer2.D;
                            ((LaunchActivity) activity14).u0(ayVar, false, true);
                            photoViewer2.H0(false, false);
                            return;
                        }
                        for (int i64 = 0; i64 < arrayList.size(); i64++) {
                            if (!((org.telegram.messenger.jj) arrayList.get(i64)).R3() || ((org.telegram.messenger.jj) arrayList.get(i64)).H4()) {
                                z12 = false;
                                break;
                            }
                        }
                        z12 = true;
                        activity15 = photoViewer2.D;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, p6Var);
                        alertDialog$Builder2.l(org.telegram.messenger.cd.L0(2131750586, "ForwardGroupMedia"));
                        alertDialog$Builder2.g(org.telegram.messenger.cd.L0(2131750585, "ForwardGroupMediaMessage"));
                        alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.t6.dh;
                        alertDialog$Builder2.h(z12 ? org.telegram.messenger.cd.L0(2131744166, "ThisPhoto") : org.telegram.messenger.cd.L0(2131744167, "ThisMedia"), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.sp0
                            public final /* synthetic */ aq0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.u1
                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i632) {
                                File N;
                                switch (i60) {
                                    case 0:
                                        aq0 aq0Var = this.b;
                                        aq0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer3 = aq0Var.b;
                                        arrayList32.add(photoViewer3.T4);
                                        PhotoViewer.D(photoViewer3, arrayList32);
                                        break;
                                    default:
                                        aq0 aq0Var2 = this.b;
                                        PhotoViewer photoViewer4 = aq0Var2.b;
                                        org.telegram.messenger.jj jjVar62 = photoViewer4.T4;
                                        if (jjVar62 != null) {
                                            File file33 = null;
                                            if ((org.telegram.messenger.jj.o1(jjVar62.k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.jj.o1(photoViewer4.T4.k).webpage != null && org.telegram.messenger.jj.o1(photoViewer4.T4.k).webpage.document == null) {
                                                TLObject r13 = photoViewer4.r1(photoViewer4.P4, null);
                                                org.telegram.messenger.b8.G(photoViewer4.T);
                                                N = org.telegram.messenger.b8.K(r13, null, true, true);
                                            } else {
                                                org.telegram.messenger.b8.G(photoViewer4.T);
                                                N = org.telegram.messenger.b8.N(photoViewer4.T4.k, false, true);
                                            }
                                            boolean L4 = org.telegram.messenger.jj.L4(photoViewer4.T4.k);
                                            boolean D3 = photoViewer4.T4.D3();
                                            if (D3) {
                                                TLRPC.Document document2 = org.telegram.messenger.jj.o1(photoViewer4.T4.k) != null ? org.telegram.messenger.jj.o1(photoViewer4.T4.k).document : null;
                                                if (document2 != null) {
                                                    org.telegram.messenger.b8.G(photoViewer4.T);
                                                    File K2 = org.telegram.messenger.b8.K(document2, null, false, true);
                                                    if (K2 == null || !K2.exists()) {
                                                        org.telegram.messenger.b8.G(photoViewer4.T);
                                                        file33 = org.telegram.messenger.b8.K(document2, null, true, true);
                                                    } else {
                                                        file33 = K2;
                                                    }
                                                }
                                            }
                                            if (!D3) {
                                                if (N != null && N.exists()) {
                                                    MediaController.d0(N.toString(), photoViewer4.D, L4 ? 1 : 0, null, null, new up0(aq0Var2, L4, 0));
                                                    break;
                                                } else {
                                                    photoViewer4.X2();
                                                    break;
                                                }
                                            } else if (N != null && N.exists() && file33 != null && file33.exists()) {
                                                MediaController.e0(N.toString(), file33.toString(), photoViewer4.D, new rp0(aq0Var2, 1));
                                                break;
                                            } else {
                                                photoViewer4.X2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.k(z12 ? org.telegram.messenger.cd.G(arrayList.size(), "AllNPhotos", new Object[0]) : org.telegram.messenger.cd.G(arrayList.size(), str2, new Object[0]), new ep0(2, this, arrayList));
                        alertDialog$Builder2.i(org.telegram.messenger.cd.L0(2131752589, "Cancel"), new org.telegram.ui.Components.z11(21));
                        org.telegram.ui.ActionBar.x1 a10 = alertDialog$Builder2.a();
                        B1 = photoViewer2.B1(org.telegram.ui.ActionBar.t6.ih);
                        a10.j(B1);
                        a10.show();
                        View d10 = a10.d(-3);
                        if (d10 instanceof TextView) {
                            int i65 = org.telegram.ui.ActionBar.t6.q7;
                            org.telegram.ui.ActionBar.a7.V((TextView) d10, i65, photoViewer2.v2);
                            B13 = photoViewer2.B1(i65);
                            d10.setBackground(org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(3.0f), B13));
                            ViewGroup viewGroup2 = a10.v0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d10.bringToFront();
                            }
                        }
                        B12 = photoViewer2.B1(org.telegram.ui.ActionBar.t6.Vg);
                        a10.p(B12);
                        return;
                    }
                }
                z11 = false;
                activity13 = photoViewer2.D;
                jjVar36 = photoViewer2.T4;
                ((LaunchActivity) activity13).O0(jjVar36.I1);
                arrayList = new ArrayList(1);
                unVar4 = photoViewer2.l4;
                if (unVar4 == null) {
                }
                if (ejVar == null) {
                }
                if (!z11) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i10 == 18) {
                    PhotoViewer.F(photoViewer2);
                    return;
                }
                if (i10 == 26) {
                    activity11 = photoViewer2.D;
                    if (activity11 != null) {
                        es0Var4 = photoViewer2.d;
                        if (es0Var4 == null) {
                            return;
                        }
                        es0Var5 = photoViewer2.d;
                        es0Var5.J();
                        photoViewer2.H0(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == 7) {
                    activity9 = photoViewer2.D;
                    if (activity9 == null) {
                        return;
                    }
                    es0Var2 = photoViewer2.d;
                    if (es0Var2 == null) {
                        return;
                    }
                    jjVar24 = photoViewer2.T4;
                    if (jjVar24 != null) {
                        jjVar32 = photoViewer2.T4;
                        if (!jjVar32.p1) {
                            jjVar33 = photoViewer2.T4;
                            long A02 = jjVar33.A0();
                            if (org.telegram.messenger.o5.z(A02)) {
                                i48 = photoViewer2.T;
                                z10 = org.telegram.messenger.w3.T(org.telegram.messenger.vp.r1(i48).L0(Long.valueOf(-A02)));
                                activity10 = photoViewer2.D;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity10);
                                es0Var3 = photoViewer2.d;
                                b02 = es0Var3.b0();
                                if (b02 == null) {
                                    alertDialog$Builder3.l(org.telegram.messenger.cd.L0(2131754094, "AreYouSureDeletePhotoTitle"));
                                    alertDialog$Builder3.g(b02);
                                } else {
                                    if (!photoViewer2.t4) {
                                        icVar14 = photoViewer2.a5;
                                        if (icVar14 != null) {
                                            icVar15 = photoViewer2.a5;
                                            icVar16 = photoViewer2.Z4;
                                        }
                                        jjVar25 = photoViewer2.T4;
                                        if (jjVar25 != null) {
                                            jjVar28 = photoViewer2.T4;
                                        }
                                        jjVar26 = photoViewer2.T4;
                                        if (jjVar26 != null) {
                                            jjVar27 = photoViewer2.T4;
                                            if (jjVar27.q3()) {
                                                alertDialog$Builder3.l(org.telegram.messenger.cd.L0(2131754097, "AreYouSureDeleteGIFTitle"));
                                                if (z10) {
                                                    alertDialog$Builder3.g(org.telegram.messenger.cd.Y(2131754098, "AreYouSureDeleteGIFEveryone", new Object[0]));
                                                } else {
                                                    alertDialog$Builder3.g(org.telegram.messenger.cd.Y(2131754099, "AreYouSureDeleteGIF", new Object[0]));
                                                }
                                            }
                                        }
                                        alertDialog$Builder3.l(org.telegram.messenger.cd.L0(2131754094, "AreYouSureDeletePhotoTitle"));
                                        if (z10) {
                                            alertDialog$Builder3.g(org.telegram.messenger.cd.Y(2131754095, "AreYouSureDeletePhotoEveryone", new Object[0]));
                                        } else {
                                            alertDialog$Builder3.g(org.telegram.messenger.cd.Y(2131754096, "AreYouSureDeletePhoto", new Object[0]));
                                        }
                                    }
                                    alertDialog$Builder3.l(org.telegram.messenger.cd.L0(2131754083, "AreYouSureDeleteVideoTitle"));
                                    if (z10) {
                                        alertDialog$Builder3.g(org.telegram.messenger.cd.Y(2131754084, "AreYouSureDeleteVideoEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.g(org.telegram.messenger.cd.Y(2131754085, "AreYouSureDeleteVideo", new Object[0]));
                                    }
                                }
                                boolean[] zArr = new boolean[1];
                                jjVar29 = photoViewer2.T4;
                                if (jjVar29 != null) {
                                    jjVar30 = photoViewer2.T4;
                                    if (!jjVar30.p1) {
                                        jjVar31 = photoViewer2.T4;
                                        long A03 = jjVar31.A0();
                                        if (!org.telegram.messenger.o5.C(A03)) {
                                            if (org.telegram.messenger.o5.E(A03)) {
                                                i47 = photoViewer2.T;
                                                user = org.telegram.messenger.vp.r1(i47).Z1(Long.valueOf(A03));
                                                L0 = null;
                                            } else {
                                                i41 = photoViewer2.T;
                                                L0 = org.telegram.messenger.vp.r1(i41).L0(Long.valueOf(-A03));
                                                user = null;
                                            }
                                            if (user != null || !org.telegram.messenger.w3.T(L0)) {
                                                i42 = photoViewer2.T;
                                                int currentTime = ConnectionsManager.getInstance(i42).getCurrentTime();
                                                if (user != null) {
                                                    i46 = photoViewer2.T;
                                                    i44 = org.telegram.messenger.vp.r1(i46).b3;
                                                } else {
                                                    i43 = photoViewer2.T;
                                                    i44 = org.telegram.messenger.vp.r1(i43).a3;
                                                }
                                                if (user != null) {
                                                    long j17 = user.id;
                                                    i45 = photoViewer2.T;
                                                }
                                            }
                                        }
                                    }
                                }
                                int i66 = 2131752589;
                                String str5 = "Cancel";
                                int i67 = 3;
                                alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131751599, "Delete"), new ep0(i67, this, zArr));
                                alertDialog$Builder3.h(org.telegram.messenger.cd.L0(i66, str5), null);
                                org.telegram.ui.ActionBar.x1 a11 = alertDialog$Builder3.a();
                                photoViewer2.V2(alertDialog$Builder3);
                                textView = (TextView) a11.d(-1);
                                if (textView == null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, photoViewer2.v2);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z10 = false;
                    activity10 = photoViewer2.D;
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(activity10);
                    es0Var3 = photoViewer2.d;
                    b02 = es0Var3.b0();
                    if (b02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    jjVar29 = photoViewer2.T4;
                    if (jjVar29 != null) {
                    }
                    int i662 = 2131752589;
                    String str52 = "Cancel";
                    int i672 = 3;
                    alertDialog$Builder32.k(org.telegram.messenger.cd.L0(2131751599, "Delete"), new ep0(i672, this, zArr2));
                    alertDialog$Builder32.h(org.telegram.messenger.cd.L0(i662, str52), null);
                    org.telegram.ui.ActionBar.x1 a112 = alertDialog$Builder32.a();
                    photoViewer2.V2(alertDialog$Builder32);
                    textView = (TextView) a112.d(-1);
                    if (textView == null) {
                    }
                } else {
                    if (i10 == 9 || i10 == 16) {
                        PhotoViewer.H(photoViewer2);
                        return;
                    }
                    if (i10 == 10) {
                        try {
                            if (photoViewer2.t4) {
                                activity5 = photoViewer2.D;
                                jjVar11 = photoViewer2.T4;
                                gf.f.r(activity5, org.telegram.messenger.jj.o1(jjVar11.k).webpage.url);
                                photoViewer2.H0(false, false);
                                return;
                            }
                            jjVar6 = photoViewer2.T4;
                            if (jjVar6 == null) {
                                bs0Var = photoViewer2.j7;
                                if (bs0Var != null) {
                                    bs0Var2 = photoViewer2.j7;
                                    i13 = photoViewer2.P4;
                                    TLObject d11 = bs0Var2.d(i13);
                                    activity3 = photoViewer2.D;
                                    if (org.telegram.messenger.i0.v2(d11, activity3)) {
                                        photoViewer2.H0(false, false);
                                        return;
                                    } else {
                                        photoViewer2.X2();
                                        return;
                                    }
                                }
                                return;
                            }
                            jjVar7 = photoViewer2.T4;
                            activity4 = photoViewer2.D;
                            jjVar8 = photoViewer2.T4;
                            if (!jjVar8.H4()) {
                                jjVar9 = photoViewer2.T4;
                                if (!jjVar9.R3()) {
                                    jjVar10 = photoViewer2.T4;
                                    if (!jjVar10.t4()) {
                                        z17 = false;
                                    }
                                }
                            }
                            if (org.telegram.messenger.i0.u2(jjVar7, activity4, p6Var, z17)) {
                                photoViewer2.H0(false, false);
                                return;
                            } else {
                                photoViewer2.X2();
                                return;
                            }
                        } catch (Exception e) {
                            org.telegram.messenger.f8.f(e);
                            return;
                        }
                    }
                    if (i10 == 11 || i10 == 13) {
                        activity6 = photoViewer2.D;
                        if (activity6 != null) {
                            jjVar12 = photoViewer2.T4;
                            if (jjVar12 == null) {
                                return;
                            }
                            jjVar13 = photoViewer2.T4;
                            if (org.telegram.messenger.jj.o1(jjVar13.k) instanceof TLRPC.TL_messageMediaPhoto) {
                                jjVar17 = photoViewer2.T4;
                                tLObject = org.telegram.messenger.jj.o1(jjVar17.k).photo;
                            } else {
                                jjVar14 = photoViewer2.T4;
                                if (!(org.telegram.messenger.jj.o1(jjVar14.k) instanceof TLRPC.TL_messageMediaDocument)) {
                                    return;
                                }
                                jjVar15 = photoViewer2.T4;
                                tLObject = org.telegram.messenger.jj.o1(jjVar15.k).document;
                            }
                            TLObject tLObject2 = tLObject;
                            activity7 = photoViewer2.D;
                            jjVar16 = photoViewer2.T4;
                            photoViewer2.U3 = new zp0(this, activity7, jjVar16, tLObject2, this.a);
                            cx0Var = photoViewer2.U3;
                            cx0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i10 == 6) {
                        t0Var = photoViewer2.o0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!photoViewer2.t4) {
                            photoViewer2.k3();
                            return;
                        }
                        ve0Var = photoViewer2.f0;
                        if (ve0Var.e()) {
                            if (PhotoViewer.b9 != null) {
                                PhotoViewer.b9.Q0();
                            }
                            photoViewer2.J3 = true;
                            photoViewer = PhotoViewer.a9;
                            PhotoViewer.b9 = photoViewer;
                            PhotoViewer.a9 = null;
                            photoViewer2.e = false;
                            photoViewer2.f = false;
                            gs0 gs0Var = photoViewer2.d5;
                            if (gs0Var != null && !gs0Var.a.H()) {
                                photoViewer2.d5.a.O0(true, true);
                            }
                            photoViewer2.m6 = 1.0f;
                            photoViewer2.e0.invalidate();
                            photoViewer2.T0();
                            return;
                        }
                        return;
                    }
                    if (i10 == 8) {
                        jjVar22 = photoViewer2.T4;
                        if (jjVar22 == null) {
                            return;
                        }
                        i40 = photoViewer2.T;
                        org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(i40);
                        jjVar23 = photoViewer2.T4;
                        G.d(jjVar23.F0());
                        photoViewer2.r2(false);
                        photoViewer2.i0.setTag(r3);
                        photoViewer2.i0.setVisibility(0);
                        return;
                    }
                    if (i10 == 12) {
                        jjVar19 = photoViewer2.T4;
                        if (jjVar19 != null) {
                            jjVar20 = photoViewer2.T4;
                            TLRPC.Document F0 = jjVar20.F0();
                            unVar = photoViewer2.l4;
                            if (unVar != null) {
                                unVar2 = photoViewer2.l4;
                                if (unVar2.Z != null) {
                                    unVar3 = photoViewer2.l4;
                                    unVar3.Z.j(F0);
                                    i39 = photoViewer2.T;
                                    org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i39);
                                    jjVar21 = photoViewer2.T4;
                                    r13.q4(jjVar21, F0);
                                }
                            }
                            i38 = photoViewer2.T;
                            org.telegram.messenger.ui.b0(i38).c(F0, (int) (System.currentTimeMillis() / 1000), true);
                            i39 = photoViewer2.T;
                            org.telegram.messenger.vp r132 = org.telegram.messenger.vp.r1(i39);
                            jjVar21 = photoViewer2.T4;
                            r132.q4(jjVar21, F0);
                        } else {
                            bs0Var3 = photoViewer2.j7;
                            if (bs0Var3 == null) {
                                return;
                            }
                            bs0Var4 = photoViewer2.j7;
                            i35 = photoViewer2.P4;
                            TLObject d12 = bs0Var4.d(i35);
                            if (d12 instanceof TLRPC.Document) {
                                TLRPC.Document document2 = (TLRPC.Document) d12;
                                i36 = photoViewer2.T;
                                org.telegram.messenger.ui.b0(i36).c(document2, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = photoViewer2.T;
                                org.telegram.messenger.vp r14 = org.telegram.messenger.vp.r1(i37);
                                bs0Var5 = photoViewer2.j7;
                                r14.q4(bs0Var5.g(), document2);
                            }
                        }
                        as0 as0Var = photoViewer2.e0;
                        if (as0Var != null) {
                            org.telegram.ui.Components.cc.Z(as0Var, p6Var).o(org.telegram.ui.Components.bc.D, p6Var).j();
                            return;
                        }
                        return;
                    }
                    if (i10 == 14) {
                        ArrayList arrayList5 = photoViewer2.f7;
                        i18 = photoViewer2.P4;
                        TLRPC.Photo photo3 = (TLRPC.Photo) arrayList5.get(i18);
                        if (photo3 == null || photo3.sizes.isEmpty()) {
                            return;
                        }
                        TLRPC.PhotoSize u10 = org.telegram.messenger.b8.u(800, photo3.sizes);
                        TLRPC.PhotoSize u11 = org.telegram.messenger.b8.u(90, photo3.sizes);
                        i19 = photoViewer2.T;
                        org.telegram.messenger.d20 i68 = org.telegram.messenger.d20.i(i19);
                        j11 = photoViewer2.z5;
                        if (j11 == i68.n) {
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = photo3.id;
                            tL_inputPhoto.access_hash = photo3.access_hash;
                            tL_inputPhoto.file_reference = photo3.file_reference;
                            i32 = photoViewer2.T;
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new vp0(this, i68, photo3, i60));
                            i33 = photoViewer2.T;
                            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i33).Z1(Long.valueOf(i68.n));
                            if (Z1 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                userProfilePhoto.photo_id = photo3.id;
                                userProfilePhoto.dc_id = photo3.dc_id;
                                userProfilePhoto.photo_small = u11.location;
                                userProfilePhoto.photo_big = u10.location;
                                i68.w(Z1);
                                i68.v(true);
                                i34 = photoViewer2.T;
                                org.telegram.messenger.zs.f(i34).k(org.telegram.messenger.zs.j0, new Object[0]);
                            }
                        } else {
                            i20 = photoViewer2.T;
                            org.telegram.messenger.vp r15 = org.telegram.messenger.vp.r1(i20);
                            j12 = photoViewer2.z5;
                            TLRPC.Chat L04 = r15.L0(Long.valueOf(-j12));
                            if (L04 == null) {
                                return;
                            }
                            TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                            tL_inputChatPhoto.id = tL_inputPhoto2;
                            tL_inputPhoto2.id = photo3.id;
                            tL_inputPhoto2.access_hash = photo3.access_hash;
                            tL_inputPhoto2.file_reference = photo3.file_reference;
                            i21 = photoViewer2.T;
                            org.telegram.messenger.vp r16 = org.telegram.messenger.vp.r1(i21);
                            j13 = photoViewer2.z5;
                            r16.B(-j13, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                            TLRPC.ChatPhoto chatPhoto = L04.photo;
                            chatPhoto.dc_id = photo3.dc_id;
                            chatPhoto.photo_small = u11.location;
                            chatPhoto.photo_big = u10.location;
                            i22 = photoViewer2.T;
                            org.telegram.messenger.zs.f(i22).k(org.telegram.messenger.zs.r, 2);
                        }
                        photoViewer2.h7 = org.telegram.messenger.ic.i(u10, photo3);
                        ArrayList arrayList6 = photoViewer2.f7;
                        i23 = photoViewer2.P4;
                        arrayList6.remove(i23);
                        photoViewer2.f7.add(0, photo3);
                        ArrayList arrayList7 = photoViewer2.a7;
                        i24 = photoViewer2.P4;
                        org.telegram.messenger.ic icVar21 = (org.telegram.messenger.ic) arrayList7.get(i24);
                        ArrayList arrayList8 = photoViewer2.a7;
                        i25 = photoViewer2.P4;
                        arrayList8.remove(i25);
                        photoViewer2.a7.add(0, icVar21);
                        ArrayList arrayList9 = photoViewer2.b7;
                        i26 = photoViewer2.P4;
                        org.telegram.messenger.ic icVar22 = (org.telegram.messenger.ic) arrayList9.get(i26);
                        ArrayList arrayList10 = photoViewer2.b7;
                        i27 = photoViewer2.P4;
                        arrayList10.remove(i27);
                        photoViewer2.b7.add(0, icVar22);
                        ArrayList arrayList11 = photoViewer2.c7;
                        i28 = photoViewer2.P4;
                        Long l4 = (Long) arrayList11.get(i28);
                        ArrayList arrayList12 = photoViewer2.c7;
                        i29 = photoViewer2.P4;
                        arrayList12.remove(i29);
                        photoViewer2.c7.add(0, l4);
                        ArrayList arrayList13 = photoViewer2.d7;
                        i30 = photoViewer2.P4;
                        TLRPC.Message message = (TLRPC.Message) arrayList13.get(i30);
                        ArrayList arrayList14 = photoViewer2.d7;
                        i31 = photoViewer2.P4;
                        arrayList14.remove(i31);
                        photoViewer2.d7.add(0, message);
                        photoViewer2.P4 = -1;
                        photoViewer2.E2(0);
                        org.telegram.ui.Components.d30 d30Var = photoViewer2.l1;
                        d30Var.d.clear();
                        d30Var.e.clear();
                        d30Var.c.clear();
                        photoViewer2.l1.b();
                        undoView = photoViewer2.n1;
                        j14 = photoViewer2.z5;
                        icVar12 = photoViewer2.a5;
                        icVar13 = photoViewer2.Z4;
                        undoView.m(j14, icVar12 == icVar13 ? null : 1, 22);
                        final int i69 = 0;
                        org.telegram.messenger.i0.h3(new Runnable(this) { // from class: org.telegram.ui.wp0
                            public final /* synthetic */ aq0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i69) {
                                    case 0:
                                        org.telegram.ui.ActionBar.t0 t0Var2 = this.b.b.o0;
                                        if (t0Var2 != null) {
                                            t0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.t(19);
                                        photoViewer3.o0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.o0.S(19);
                                        photoViewer4.o0.t(20);
                                        break;
                                }
                            }
                        }, 300L);
                        return;
                    }
                    if (i10 == 15) {
                        i16 = photoViewer2.T;
                        org.telegram.messenger.b8.G(i16);
                        icVar7 = photoViewer2.a5;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = icVar7 == null ? null : icVar7.f;
                        icVar8 = photoViewer2.a5;
                        File K2 = org.telegram.messenger.b8.K(tL_fileLocationToBeDeprecated2, PhotoViewer.s1(icVar8), true, true);
                        icVar9 = photoViewer2.a5;
                        boolean z24 = icVar9.p == 2;
                        if (z24) {
                            i17 = photoViewer2.T;
                            org.telegram.messenger.b8.G(i17);
                            icVar10 = photoViewer2.Z4;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = icVar10 == null ? null : icVar10.f;
                            icVar11 = photoViewer2.Z4;
                            str = org.telegram.messenger.b8.K(tL_fileLocationToBeDeprecated3, PhotoViewer.s1(icVar11), true, true).getAbsolutePath();
                        } else {
                            str = null;
                        }
                        es0Var = photoViewer2.d;
                        es0Var.f(K2.getAbsolutePath(), str, z24);
                        return;
                    }
                    if (i10 == 19) {
                        int i70 = photoViewer2.Q4;
                        if (i70 < 0 || i70 >= photoViewer2.Y6.size()) {
                            return;
                        }
                        org.telegram.messenger.jj jjVar62 = (org.telegram.messenger.jj) photoViewer2.Y6.get(photoViewer2.Q4);
                        photoViewer2.n5 = true;
                        final int i71 = true ? 1 : 0;
                        org.telegram.messenger.i0.h3(new Runnable(this) { // from class: org.telegram.ui.wp0
                            public final /* synthetic */ aq0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i71) {
                                    case 0:
                                        org.telegram.ui.ActionBar.t0 t0Var2 = this.b.b.o0;
                                        if (t0Var2 != null) {
                                            t0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.t(19);
                                        photoViewer3.o0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.o0.S(19);
                                        photoViewer4.o0.t(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.T(photoViewer2);
                        i15 = photoViewer2.T;
                        org.telegram.messenger.vp.r1(i15).S1().L(jjVar62, new jp0(photoViewer2, 3));
                        return;
                    }
                    if (i10 == 20) {
                        photoViewer2.n5 = false;
                        final int i72 = 2;
                        org.telegram.messenger.i0.h3(new Runnable(this) { // from class: org.telegram.ui.wp0
                            public final /* synthetic */ aq0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i72) {
                                    case 0:
                                        org.telegram.ui.ActionBar.t0 t0Var2 = this.b.b.o0;
                                        if (t0Var2 != null) {
                                            t0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.t(19);
                                        photoViewer3.o0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.o0.S(19);
                                        photoViewer4.o0.t(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.T(photoViewer2);
                        return;
                    }
                    if (i10 == 22) {
                        photoViewer2.Z2 = !photoViewer2.Z2;
                        boolean z25 = photoViewer2.Z2;
                        jjVar18 = photoViewer2.T4;
                        org.telegram.ui.Components.u61.n0(jjVar18, z25);
                        org.telegram.ui.Components.u61 u61Var = photoViewer2.F2;
                        if (u61Var != null) {
                            u61Var.s0(photoViewer2.Z2);
                        }
                        photoViewer2.s0.f(photoViewer2.Z2);
                        photoViewer2.s0.setSelectorColor(photoViewer2.Z2 ? 259241196 : 268435455);
                        return;
                    }
                    if (i10 != 23) {
                        return;
                    }
                    icVar = photoViewer2.Z4;
                    if (icVar != null) {
                        icVar5 = photoViewer2.Z4;
                        if (icVar5.l != null) {
                            icVar6 = photoViewer2.Z4;
                            photo2 = icVar6.l;
                            photo = photo2;
                            if (photo == null) {
                                return;
                            }
                            i14 = photoViewer2.T;
                            activity8 = photoViewer2.D;
                            j10 = photoViewer2.z5;
                            org.telegram.ui.Components.s4.I(i14, activity8, j10, photo, new th.b());
                            return;
                        }
                    }
                    icVar2 = photoViewer2.a5;
                    if (icVar2 != null) {
                        icVar3 = photoViewer2.a5;
                        if (icVar3.l != null) {
                            icVar4 = photoViewer2.a5;
                            photo2 = icVar4.l;
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
